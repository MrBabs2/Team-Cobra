package com.flurry.sdk;

import java.lang.Thread;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.flurry.sdk.c */
public final class C6758c extends C6798d7<C6746b> implements Thread.UncaughtExceptionHandler {

    /* renamed from: o */
    public C6945n7 f12584o = new C6945n7();

    /* renamed from: p */
    public boolean f12585p = false;

    public C6758c() {
        super("FlurryErrorProvider");
        C6994q7 b = C6994q7.m14850b();
        synchronized (b.f13141b) {
            b.f13141b.put(this, (Object) null);
        }
    }

    /* renamed from: a */
    public final void mo23546a(String str, long j, String str2, String str3, Throwable th, Map<String, String> map, Map<String, String> map2) {
        mo23583a(new C6746b(str, j, str2, str3, th, map, map2, Collections.emptyList()));
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        String str;
        th.printStackTrace();
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f12585p) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            if (stackTrace == null || stackTrace.length <= 0) {
                str = th.getMessage() != null ? th.getMessage() : "";
            } else {
                StringBuilder sb = new StringBuilder();
                if (th.getMessage() != null) {
                    sb.append(" (");
                    sb.append(th.getMessage());
                    sb.append(")\n");
                }
                str = sb.toString();
            }
            mo23583a(new C6746b(C6978p7.UNCAUGHT_EXCEPTION_ID.f13116f, currentTimeMillis, str, th.getClass().getName(), th, C6959o7.m14778a(), (Map<String, String>) null, this.f12584o.mo23665a()));
        }
    }
}
