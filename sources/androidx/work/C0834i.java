package androidx.work;

import android.util.Log;

/* renamed from: androidx.work.i */
/* compiled from: Logger */
public abstract class C0834i {

    /* renamed from: a */
    private static C0834i f2993a = null;

    /* renamed from: b */
    private static final int f2994b = 20;

    /* renamed from: androidx.work.i$a */
    /* compiled from: Logger */
    public static class C0835a extends C0834i {

        /* renamed from: c */
        private int f2995c;

        public C0835a(int i) {
            super(i);
            this.f2995c = i;
        }

        /* renamed from: a */
        public void mo4726a(String str, String str2, Throwable... thArr) {
            if (this.f2995c > 3) {
                return;
            }
            if (thArr == null || thArr.length < 1) {
                Log.d(str, str2);
            } else {
                Log.d(str, str2, thArr[0]);
            }
        }

        /* renamed from: b */
        public void mo4727b(String str, String str2, Throwable... thArr) {
            if (this.f2995c > 6) {
                return;
            }
            if (thArr == null || thArr.length < 1) {
                Log.e(str, str2);
            } else {
                Log.e(str, str2, thArr[0]);
            }
        }

        /* renamed from: c */
        public void mo4728c(String str, String str2, Throwable... thArr) {
            if (this.f2995c > 4) {
                return;
            }
            if (thArr == null || thArr.length < 1) {
                Log.i(str, str2);
            } else {
                Log.i(str, str2, thArr[0]);
            }
        }

        /* renamed from: d */
        public void mo4729d(String str, String str2, Throwable... thArr) {
            if (this.f2995c > 2) {
                return;
            }
            if (thArr == null || thArr.length < 1) {
                Log.v(str, str2);
            } else {
                Log.v(str, str2, thArr[0]);
            }
        }

        /* renamed from: e */
        public void mo4730e(String str, String str2, Throwable... thArr) {
            if (this.f2995c > 5) {
                return;
            }
            if (thArr == null || thArr.length < 1) {
                Log.w(str, str2);
            } else {
                Log.w(str, str2, thArr[0]);
            }
        }
    }

    public C0834i(int i) {
    }

    /* renamed from: a */
    public static synchronized void m3722a(C0834i iVar) {
        synchronized (C0834i.class) {
            f2993a = iVar;
        }
    }

    /* renamed from: a */
    public abstract void mo4726a(String str, String str2, Throwable... thArr);

    /* renamed from: b */
    public abstract void mo4727b(String str, String str2, Throwable... thArr);

    /* renamed from: c */
    public abstract void mo4728c(String str, String str2, Throwable... thArr);

    /* renamed from: d */
    public abstract void mo4729d(String str, String str2, Throwable... thArr);

    /* renamed from: e */
    public abstract void mo4730e(String str, String str2, Throwable... thArr);

    /* renamed from: a */
    public static String m3721a(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        int i = f2994b;
        if (length >= i) {
            sb.append(str.substring(0, i));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static synchronized C0834i m3720a() {
        C0834i iVar;
        synchronized (C0834i.class) {
            if (f2993a == null) {
                f2993a = new C0835a(3);
            }
            iVar = f2993a;
        }
        return iVar;
    }
}
