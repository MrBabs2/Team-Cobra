package com.flurry.sdk;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: com.flurry.sdk.y0 */
public final class C7088y0 extends C6760c1<C6897k1> {

    /* renamed from: e */
    private static C7088y0 f13356e;

    protected C7088y0() {
        super("HttpRequestManager", TimeUnit.MILLISECONDS, new PriorityBlockingQueue(11, new C6736a1()));
    }

    /* renamed from: a */
    public static synchronized C7088y0 m15035a() {
        C7088y0 y0Var;
        synchronized (C7088y0.class) {
            if (f13356e == null) {
                f13356e = new C7088y0();
            }
            y0Var = f13356e;
        }
        return y0Var;
    }
}
