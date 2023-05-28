package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class zzag {

    /* renamed from: a */
    private static String f18073a = "Volley";

    /* renamed from: b */
    public static boolean f18074b = Log.isLoggable("Volley", 2);

    /* renamed from: c */
    private static final String f18075c = zzag.class.getName();

    /* renamed from: a */
    public static void m19159a(String str, Object... objArr) {
        Log.d(f18073a, m19163d(str, objArr));
    }

    /* renamed from: b */
    public static void m19161b(String str, Object... objArr) {
        Log.e(f18073a, m19163d(str, objArr));
    }

    /* renamed from: c */
    public static void m19162c(String str, Object... objArr) {
        if (f18074b) {
            Log.v(f18073a, m19163d(str, objArr));
        }
    }

    /* renamed from: d */
    private static String m19163d(String str, Object... objArr) {
        String str2;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i = 2;
        while (true) {
            if (i >= stackTrace.length) {
                str2 = "<unknown>";
                break;
            } else if (!stackTrace[i].getClassName().equals(f18075c)) {
                String className = stackTrace[i].getClassName();
                String substring = className.substring(className.lastIndexOf(46) + 1);
                String substring2 = substring.substring(substring.lastIndexOf(36) + 1);
                String methodName = stackTrace[i].getMethodName();
                StringBuilder sb = new StringBuilder(String.valueOf(substring2).length() + 1 + String.valueOf(methodName).length());
                sb.append(substring2);
                sb.append(".");
                sb.append(methodName);
                str2 = sb.toString();
                break;
            } else {
                i++;
            }
        }
        return String.format(Locale.US, "[%d] %s: %s", new Object[]{Long.valueOf(Thread.currentThread().getId()), str2, str});
    }

    /* renamed from: a */
    public static void m19160a(Throwable th, String str, Object... objArr) {
        Log.e(f18073a, m19163d(str, objArr), th);
    }

    /* renamed from: com.google.android.gms.internal.ads.zzag$a */
    static class C8232a {

        /* renamed from: c */
        public static final boolean f18076c = zzag.f18074b;

        /* renamed from: a */
        private final List<C8158y> f18077a = new ArrayList();

        /* renamed from: b */
        private boolean f18078b = false;

        C8232a() {
        }

        /* renamed from: a */
        public final synchronized void mo27268a(String str, long j) {
            if (!this.f18078b) {
                this.f18077a.add(new C8158y(str, j, SystemClock.elapsedRealtime()));
            } else {
                throw new IllegalStateException("Marker added to finished log");
            }
        }

        /* access modifiers changed from: protected */
        public final void finalize() throws Throwable {
            if (!this.f18078b) {
                mo27267a("Request on the loose");
                zzag.m19161b("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
            }
        }

        /* renamed from: a */
        public final synchronized void mo27267a(String str) {
            long j;
            this.f18078b = true;
            if (this.f18077a.size() == 0) {
                j = 0;
            } else {
                j = this.f18077a.get(this.f18077a.size() - 1).f17255c - this.f18077a.get(0).f17255c;
            }
            if (j > 0) {
                long j2 = this.f18077a.get(0).f17255c;
                zzag.m19159a("(%-4d ms) %s", Long.valueOf(j), str);
                for (C8158y next : this.f18077a) {
                    long j3 = next.f17255c;
                    zzag.m19159a("(+%-4d) [%2d] %s", Long.valueOf(j3 - j2), Long.valueOf(next.f17254b), next.f17253a);
                    j2 = j3;
                }
            }
        }
    }
}
