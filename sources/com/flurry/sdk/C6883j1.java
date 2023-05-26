package com.flurry.sdk;

import com.flurry.sdk.C6897k1;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.flurry.sdk.j1 */
public final class C6883j1 {

    /* renamed from: a */
    private Timer f12871a;

    /* renamed from: b */
    private C6884a f12872b;

    /* renamed from: c */
    C6897k1 f12873c;

    /* renamed from: com.flurry.sdk.j1$a */
    class C6884a extends TimerTask {
        private C6884a() {
        }

        public final void run() {
            C6792d1.m14476a(3, "HttpRequestTimeoutTimer", "HttpRequest timed out. Cancelling.");
            C6897k1 k1Var = C6883j1.this.f12873c;
            long currentTimeMillis = System.currentTimeMillis() - k1Var.f12918v;
            C6792d1.m14476a(3, "HttpStreamRequest", "Timeout (" + currentTimeMillis + "MS) for url: " + k1Var.f12908l);
            k1Var.f12919w = 629;
            k1Var.f12904B = true;
            k1Var.mo23633b();
            C6792d1.m14476a(3, "HttpStreamRequest", "Cancelling http request: " + k1Var.f12908l);
            synchronized (k1Var.f12907k) {
                k1Var.f12916t = true;
            }
            if (!k1Var.f12915s) {
                k1Var.f12915s = true;
                if (k1Var.f12914r != null) {
                    new C6897k1.C6898a().start();
                }
            }
        }

        /* synthetic */ C6884a(C6883j1 j1Var, byte b) {
            this();
        }
    }

    public C6883j1(C6897k1 k1Var) {
        this.f12873c = k1Var;
    }

    /* renamed from: a */
    public final synchronized void mo23621a() {
        if (this.f12871a != null) {
            this.f12871a.cancel();
            this.f12871a = null;
            C6792d1.m14476a(3, "HttpRequestTimeoutTimer", "HttpRequestTimeoutTimer stopped.");
        }
        this.f12872b = null;
    }

    /* renamed from: a */
    public final synchronized void mo23622a(long j) {
        if (this.f12871a != null) {
            mo23621a();
        }
        this.f12871a = new Timer("HttpRequestTimeoutTimer");
        C6884a aVar = new C6884a(this, (byte) 0);
        this.f12872b = aVar;
        this.f12871a.schedule(aVar, j);
        C6792d1.m14476a(3, "HttpRequestTimeoutTimer", "HttpRequestTimeoutTimer started: " + j + "MS");
    }
}
