package com.bumptech.glide.load.engine.p144a0;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* renamed from: com.bumptech.glide.load.engine.a0.i */
/* compiled from: MemorySizeCalculator */
public final class C5928i {

    /* renamed from: a */
    private final int f10819a;

    /* renamed from: b */
    private final int f10820b;

    /* renamed from: c */
    private final Context f10821c;

    /* renamed from: d */
    private final int f10822d;

    /* renamed from: com.bumptech.glide.load.engine.a0.i$a */
    /* compiled from: MemorySizeCalculator */
    public static final class C5929a {

        /* renamed from: i */
        static final int f10823i = (Build.VERSION.SDK_INT < 26 ? 4 : 1);

        /* renamed from: a */
        final Context f10824a;

        /* renamed from: b */
        ActivityManager f10825b;

        /* renamed from: c */
        C5931c f10826c;

        /* renamed from: d */
        float f10827d = 2.0f;

        /* renamed from: e */
        float f10828e = ((float) f10823i);

        /* renamed from: f */
        float f10829f = 0.4f;

        /* renamed from: g */
        float f10830g = 0.33f;

        /* renamed from: h */
        int f10831h = 4194304;

        public C5929a(Context context) {
            this.f10824a = context;
            this.f10825b = (ActivityManager) context.getSystemService("activity");
            this.f10826c = new C5930b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT >= 26 && C5928i.m11729a(this.f10825b)) {
                this.f10828e = 0.0f;
            }
        }

        /* renamed from: a */
        public C5928i mo20116a() {
            return new C5928i(this);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.a0.i$b */
    /* compiled from: MemorySizeCalculator */
    private static final class C5930b implements C5931c {

        /* renamed from: a */
        private final DisplayMetrics f10832a;

        C5930b(DisplayMetrics displayMetrics) {
            this.f10832a = displayMetrics;
        }

        /* renamed from: a */
        public int mo20117a() {
            return this.f10832a.heightPixels;
        }

        /* renamed from: b */
        public int mo20118b() {
            return this.f10832a.widthPixels;
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.a0.i$c */
    /* compiled from: MemorySizeCalculator */
    interface C5931c {
        /* renamed from: a */
        int mo20117a();

        /* renamed from: b */
        int mo20118b();
    }

    C5928i(C5929a aVar) {
        int i;
        this.f10821c = aVar.f10824a;
        if (m11729a(aVar.f10825b)) {
            i = aVar.f10831h / 2;
        } else {
            i = aVar.f10831h;
        }
        this.f10822d = i;
        int a = m11727a(aVar.f10825b, aVar.f10829f, aVar.f10830g);
        float b = (float) (aVar.f10826c.mo20118b() * aVar.f10826c.mo20117a() * 4);
        int round = Math.round(aVar.f10828e * b);
        int round2 = Math.round(b * aVar.f10827d);
        int i2 = a - this.f10822d;
        int i3 = round2 + round;
        if (i3 <= i2) {
            this.f10820b = round2;
            this.f10819a = round;
        } else {
            float f = (float) i2;
            float f2 = aVar.f10828e;
            float f3 = aVar.f10827d;
            float f4 = f / (f2 + f3);
            this.f10820b = Math.round(f3 * f4);
            this.f10819a = Math.round(f4 * aVar.f10828e);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Calculation complete, Calculated memory cache size: ");
            sb.append(m11728a(this.f10820b));
            sb.append(", pool size: ");
            sb.append(m11728a(this.f10819a));
            sb.append(", byte array size: ");
            sb.append(m11728a(this.f10822d));
            sb.append(", memory class limited? ");
            sb.append(i3 > a);
            sb.append(", max size: ");
            sb.append(m11728a(a));
            sb.append(", memoryClass: ");
            sb.append(aVar.f10825b.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(m11729a(aVar.f10825b));
            Log.d("MemorySizeCalculator", sb.toString());
        }
    }

    /* renamed from: a */
    public int mo20113a() {
        return this.f10822d;
    }

    /* renamed from: b */
    public int mo20114b() {
        return this.f10819a;
    }

    /* renamed from: c */
    public int mo20115c() {
        return this.f10820b;
    }

    /* renamed from: a */
    private static int m11727a(ActivityManager activityManager, float f, float f2) {
        boolean a = m11729a(activityManager);
        float memoryClass = (float) (activityManager.getMemoryClass() * 1024 * 1024);
        if (a) {
            f = f2;
        }
        return Math.round(memoryClass * f);
    }

    /* renamed from: a */
    private String m11728a(int i) {
        return Formatter.formatFileSize(this.f10821c, (long) i);
    }

    @TargetApi(19)
    /* renamed from: a */
    static boolean m11729a(ActivityManager activityManager) {
        if (Build.VERSION.SDK_INT >= 19) {
            return activityManager.isLowRamDevice();
        }
        return true;
    }
}
