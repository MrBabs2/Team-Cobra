package com.bumptech.glide.load.engine.p145b0;

import android.os.Build;
import android.os.StrictMode;
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* renamed from: com.bumptech.glide.load.engine.b0.b */
/* compiled from: RuntimeCompat */
final class C5943b {

    /* renamed from: com.bumptech.glide.load.engine.b0.b$a */
    /* compiled from: RuntimeCompat */
    class C5944a implements FilenameFilter {

        /* renamed from: a */
        final /* synthetic */ Pattern f10847a;

        C5944a(Pattern pattern) {
            this.f10847a = pattern;
        }

        public boolean accept(File file, String str) {
            return this.f10847a.matcher(str).matches();
        }
    }

    /* renamed from: a */
    static int m11755a() {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        return Build.VERSION.SDK_INT < 17 ? Math.max(m11756b(), availableProcessors) : availableProcessors;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    private static int m11756b() {
        File[] fileArr;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            fileArr = new File("/sys/devices/system/cpu/").listFiles(new C5944a(Pattern.compile("cpu[0-9]+")));
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
        return Math.max(1, fileArr != null ? fileArr.length : 0);
    }
}
