package com.google.android.gms.internal.ads;

import java.io.PrintWriter;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.wt */
final class C8114wt extends C8003tt {

    /* renamed from: a */
    private final C8040ut f17104a = new C8040ut();

    C8114wt() {
    }

    /* renamed from: a */
    public final void mo26583a(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException("Self suppression is not allowed.", th2);
        } else if (th2 != null) {
            this.f17104a.mo26664a(th, true).add(th2);
        } else {
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
    }

    /* renamed from: a */
    public final void mo26581a(Throwable th) {
        th.printStackTrace();
        List<Throwable> a = this.f17104a.mo26664a(th, false);
        if (a != null) {
            synchronized (a) {
                for (Throwable printStackTrace : a) {
                    System.err.print("Suppressed: ");
                    printStackTrace.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo26582a(Throwable th, PrintWriter printWriter) {
        th.printStackTrace(printWriter);
        List<Throwable> a = this.f17104a.mo26664a(th, false);
        if (a != null) {
            synchronized (a) {
                for (Throwable printStackTrace : a) {
                    printWriter.print("Suppressed: ");
                    printStackTrace.printStackTrace(printWriter);
                }
            }
        }
    }
}
