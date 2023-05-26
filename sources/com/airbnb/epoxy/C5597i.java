package com.airbnb.epoxy;

import android.util.Log;

/* renamed from: com.airbnb.epoxy.i */
/* compiled from: DebugTimer */
class C5597i implements C5602k0 {

    /* renamed from: a */
    private final String f9874a;

    /* renamed from: b */
    private long f9875b;

    /* renamed from: c */
    private String f9876c;

    C5597i(String str) {
        this.f9874a = str;
        m10630a();
    }

    /* renamed from: a */
    private void m10630a() {
        this.f9875b = -1;
        this.f9876c = null;
    }

    public void stop() {
        if (this.f9875b != -1) {
            String str = this.f9874a;
            Log.d(str, String.format(this.f9876c + ": %.3fms", new Object[]{Float.valueOf(((float) (System.nanoTime() - this.f9875b)) / 1000000.0f)}));
            m10630a();
            return;
        }
        throw new IllegalStateException("Timer was not started");
    }

    /* renamed from: a */
    public void mo19207a(String str) {
        if (this.f9875b == -1) {
            this.f9875b = System.nanoTime();
            this.f9876c = str;
            return;
        }
        throw new IllegalStateException("Timer was already started");
    }
}
