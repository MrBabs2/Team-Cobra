package com.facebook.p032t.p181u;

import android.os.AsyncTask;
import com.facebook.internal.p168a0.p170f.C6391a;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;

/* renamed from: com.facebook.t.u.f */
/* compiled from: FileDownloadTask */
public class C6657f extends AsyncTask<String, Void, Boolean> {

    /* renamed from: a */
    private C6658a f12402a;

    /* renamed from: b */
    private File f12403b;

    /* renamed from: c */
    private String f12404c;

    /* renamed from: com.facebook.t.u.f$a */
    /* compiled from: FileDownloadTask */
    public interface C6658a {
        /* renamed from: a */
        void mo21408a(File file);
    }

    public C6657f(String str, File file, C6658a aVar) {
        this.f12404c = str;
        this.f12403b = file;
        this.f12402a = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Boolean mo21404a(String... strArr) {
        if (C6391a.m13260a((Object) this)) {
            return null;
        }
        try {
            URL url = new URL(this.f12404c);
            int contentLength = url.openConnection().getContentLength();
            DataInputStream dataInputStream = new DataInputStream(url.openStream());
            byte[] bArr = new byte[contentLength];
            dataInputStream.readFully(bArr);
            dataInputStream.close();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(this.f12403b));
            dataOutputStream.write(bArr);
            dataOutputStream.flush();
            dataOutputStream.close();
            return true;
        } catch (Exception unused) {
            return false;
        } catch (Throwable th) {
            C6391a.m13259a(th, this);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (C6391a.m13260a((Object) this)) {
            return null;
        }
        try {
            return mo21404a((String[]) objArr);
        } catch (Throwable th) {
            C6391a.m13259a(th, this);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        if (!C6391a.m13260a((Object) this)) {
            try {
                mo21405a((Boolean) obj);
            } catch (Throwable th) {
                C6391a.m13259a(th, this);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo21405a(Boolean bool) {
        if (!C6391a.m13260a((Object) this)) {
            try {
                if (bool.booleanValue()) {
                    this.f12402a.mo21408a(this.f12403b);
                }
            } catch (Throwable th) {
                C6391a.m13259a(th, this);
            }
        }
    }
}
