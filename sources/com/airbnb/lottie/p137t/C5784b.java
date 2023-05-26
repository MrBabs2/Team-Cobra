package com.airbnb.lottie.p137t;

import android.content.Context;
import com.airbnb.lottie.C5647c;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.airbnb.lottie.t.b */
/* compiled from: NetworkCache */
class C5784b {

    /* renamed from: a */
    private final Context f10463a;

    /* renamed from: b */
    private final String f10464b;

    C5784b(Context context, String str) {
        this.f10463a = context.getApplicationContext();
        this.f10464b = str;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p050l.p075h.p083k.C5004d<com.airbnb.lottie.p137t.C5783a, java.io.InputStream> mo19692a() {
        /*
            r5 = this;
            r0 = 0
            java.lang.String r1 = r5.f10464b     // Catch:{ FileNotFoundException -> 0x0048 }
            java.io.File r1 = r5.m11247a((java.lang.String) r1)     // Catch:{ FileNotFoundException -> 0x0048 }
            if (r1 != 0) goto L_0x000a
            return r0
        L_0x000a:
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{  }
            r2.<init>(r1)     // Catch:{  }
            java.lang.String r0 = r1.getAbsolutePath()
            java.lang.String r3 = ".zip"
            boolean r0 = r0.endsWith(r3)
            if (r0 == 0) goto L_0x001e
            com.airbnb.lottie.t.a r0 = com.airbnb.lottie.p137t.C5783a.Zip
            goto L_0x0020
        L_0x001e:
            com.airbnb.lottie.t.a r0 = com.airbnb.lottie.p137t.C5783a.Json
        L_0x0020:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Cache hit for "
            r3.append(r4)
            java.lang.String r4 = r5.f10464b
            r3.append(r4)
            java.lang.String r4 = " at "
            r3.append(r4)
            java.lang.String r1 = r1.getAbsolutePath()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.airbnb.lottie.C5647c.m10754b(r1)
            l.h.k.d r1 = new l.h.k.d
            r1.<init>(r0, r2)
            return r1
        L_0x0048:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.p137t.C5784b.mo19692a():l.h.k.d");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public File mo19691a(InputStream inputStream, C5783a aVar) throws IOException {
        FileOutputStream fileOutputStream;
        File file = new File(this.f10463a.getCacheDir(), m11248a(this.f10464b, aVar, true));
        try {
            fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    inputStream.close();
                    return file;
                }
            }
        } catch (Throwable th) {
            inputStream.close();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo19693a(C5783a aVar) {
        File file = new File(this.f10463a.getCacheDir(), m11248a(this.f10464b, aVar, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        boolean renameTo = file.renameTo(file2);
        C5647c.m10754b("Copying temp file to real file (" + file2 + ")");
        if (!renameTo) {
            C5647c.m10756d("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
        }
    }

    /* renamed from: a */
    private File m11247a(String str) throws FileNotFoundException {
        File file = new File(this.f10463a.getCacheDir(), m11248a(str, C5783a.Json, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(this.f10463a.getCacheDir(), m11248a(str, C5783a.Zip, false));
        if (file2.exists()) {
            return file2;
        }
        return null;
    }

    /* renamed from: a */
    private static String m11248a(String str, C5783a aVar, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("lottie_cache_");
        sb.append(str.replaceAll("\\W+", ""));
        sb.append(z ? aVar.f10462f : aVar.mo19689a());
        return sb.toString();
    }
}
