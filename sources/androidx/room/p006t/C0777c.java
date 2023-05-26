package androidx.room.p006t;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.Build;
import android.os.CancellationSignal;
import androidx.room.C0753j;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import p050l.p103q.p104a.C5165b;
import p050l.p103q.p104a.C5172e;

/* renamed from: androidx.room.t.c */
/* compiled from: DBUtil */
public class C0777c {
    @Deprecated
    /* renamed from: a */
    public static Cursor m3538a(C0753j jVar, C5172e eVar, boolean z) {
        return m3539a(jVar, eVar, z, (CancellationSignal) null);
    }

    /* renamed from: a */
    public static Cursor m3539a(C0753j jVar, C5172e eVar, boolean z, CancellationSignal cancellationSignal) {
        Cursor query = jVar.query(eVar, cancellationSignal);
        if (!z || !(query instanceof AbstractWindowedCursor)) {
            return query;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) query;
        int count = abstractWindowedCursor.getCount();
        return (Build.VERSION.SDK_INT < 23 || (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count) ? C0776b.m3536a(abstractWindowedCursor) : query;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static void m3540a(C5165b bVar) {
        ArrayList<String> arrayList = new ArrayList<>();
        Cursor c = bVar.mo17852c("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (c.moveToNext()) {
            try {
                arrayList.add(c.getString(0));
            } catch (Throwable th) {
                c.close();
                throw th;
            }
        }
        c.close();
        for (String str : arrayList) {
            if (str.startsWith("room_fts_content_sync_")) {
                bVar.execSQL("DROP TRIGGER IF EXISTS " + str);
            }
        }
    }

    /* renamed from: a */
    public static int m3537a(File file) throws IOException {
        FileChannel fileChannel = null;
        try {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            fileChannel = new FileInputStream(file).getChannel();
            fileChannel.tryLock(60, 4, true);
            fileChannel.position(60);
            if (fileChannel.read(allocate) == 4) {
                allocate.rewind();
                return allocate.getInt();
            }
            throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
        } finally {
            if (fileChannel != null) {
                fileChannel.close();
            }
        }
    }
}
