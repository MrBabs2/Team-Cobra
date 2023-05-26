package androidx.room;

import android.content.Context;
import android.util.Log;
import androidx.room.p006t.C0775a;
import androidx.room.p006t.C0777c;
import androidx.room.p006t.C0778d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import p050l.p103q.p104a.C5165b;
import p050l.p103q.p104a.C5166c;

/* renamed from: androidx.room.o */
/* compiled from: SQLiteCopyOpenHelper */
class C0769o implements C5166c {

    /* renamed from: a */
    private final Context f2835a;

    /* renamed from: b */
    private final String f2836b;

    /* renamed from: c */
    private final File f2837c;

    /* renamed from: d */
    private final int f2838d;

    /* renamed from: e */
    private final C5166c f2839e;

    /* renamed from: f */
    private C0729a f2840f;

    /* renamed from: g */
    private boolean f2841g;

    C0769o(Context context, String str, File file, int i, C5166c cVar) {
        this.f2835a = context;
        this.f2836b = str;
        this.f2837c = file;
        this.f2838d = i;
        this.f2839e = cVar;
    }

    /* renamed from: c */
    private void m3525c() {
        String b = mo4445b();
        File databasePath = this.f2835a.getDatabasePath(b);
        C0729a aVar = this.f2840f;
        C0775a aVar2 = new C0775a(b, this.f2835a.getFilesDir(), aVar == null || aVar.f2740j);
        try {
            aVar2.mo4455a();
            if (!databasePath.exists()) {
                m3524a(databasePath);
                aVar2.mo4456b();
            } else if (this.f2840f == null) {
                aVar2.mo4456b();
            } else {
                try {
                    int a = C0777c.m3537a(databasePath);
                    if (a == this.f2838d) {
                        aVar2.mo4456b();
                    } else if (this.f2840f.mo4326a(a, this.f2838d)) {
                        aVar2.mo4456b();
                    } else {
                        if (this.f2835a.deleteDatabase(b)) {
                            try {
                                m3524a(databasePath);
                            } catch (IOException e) {
                                Log.w("ROOM", "Unable to copy database file.", e);
                            }
                        } else {
                            Log.w("ROOM", "Failed to delete database file (" + b + ") for a copy destructive migration.");
                        }
                        aVar2.mo4456b();
                    }
                } catch (IOException e2) {
                    Log.w("ROOM", "Unable to read database version.", e2);
                    aVar2.mo4456b();
                }
            }
        } catch (IOException e3) {
            throw new RuntimeException("Unable to copy database file.", e3);
        } catch (Throwable th) {
            aVar2.mo4456b();
            throw th;
        }
    }

    /* renamed from: a */
    public void mo4444a(boolean z) {
        this.f2839e.mo4444a(z);
    }

    /* renamed from: b */
    public String mo4445b() {
        return this.f2839e.mo4445b();
    }

    public synchronized void close() {
        this.f2839e.close();
        this.f2841g = false;
    }

    /* renamed from: a */
    public synchronized C5165b mo4442a() {
        if (!this.f2841g) {
            m3525c();
            this.f2841g = true;
        }
        return this.f2839e.mo4442a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4443a(C0729a aVar) {
        this.f2840f = aVar;
    }

    /* renamed from: a */
    private void m3524a(File file) throws IOException {
        ReadableByteChannel readableByteChannel;
        if (this.f2836b != null) {
            readableByteChannel = Channels.newChannel(this.f2835a.getAssets().open(this.f2836b));
        } else if (this.f2837c != null) {
            readableByteChannel = new FileInputStream(this.f2837c).getChannel();
        } else {
            throw new IllegalStateException("copyFromAssetPath and copyFromFile == null!");
        }
        File createTempFile = File.createTempFile("room-copy-helper", ".tmp", this.f2835a.getCacheDir());
        createTempFile.deleteOnExit();
        C0778d.m3541a(readableByteChannel, new FileOutputStream(createTempFile).getChannel());
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + file.getAbsolutePath());
        } else if (!createTempFile.renameTo(file)) {
            throw new IOException("Failed to move intermediate file (" + createTempFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
        }
    }
}
