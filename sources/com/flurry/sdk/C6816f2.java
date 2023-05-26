package com.flurry.sdk;

import java.io.PrintStream;
import java.io.PrintWriter;

/* renamed from: com.flurry.sdk.f2 */
public abstract class C6816f2 implements Runnable {

    /* renamed from: f */
    private PrintStream f12723f;

    /* renamed from: g */
    private PrintWriter f12724g;

    /* renamed from: a */
    public abstract void mo23531a() throws Exception;

    public final void run() {
        try {
            mo23531a();
        } catch (Throwable th) {
            PrintStream printStream = this.f12723f;
            if (printStream != null) {
                th.printStackTrace(printStream);
            } else {
                PrintWriter printWriter = this.f12724g;
                if (printWriter != null) {
                    th.printStackTrace(printWriter);
                } else {
                    th.printStackTrace();
                }
            }
            C6792d1.m14477a(6, "SafeRunnable", "", th);
            C6826g0.m14532b();
            C6826g0.m14530a("SafeRunnableException", "Exception caught by SafeRunnable", th);
        }
    }
}
