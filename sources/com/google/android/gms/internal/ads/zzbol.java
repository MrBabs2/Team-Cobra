package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

public final class zzbol extends zzbnf {

    /* renamed from: f */
    private final zzaga f19291f;

    /* renamed from: g */
    private final Runnable f19292g;

    /* renamed from: h */
    private final Executor f19293h;

    public zzbol(zzaga zzaga, Runnable runnable, Executor executor) {
        this.f19291f = zzaga;
        this.f19292g = runnable;
        this.f19293h = executor;
    }

    /* renamed from: a */
    public final void mo26811a(ViewGroup viewGroup, zzyd zzyd) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo28285a(Runnable runnable) {
        try {
            if (!this.f19291f.mo27270n(ObjectWrapper.m16391a(runnable))) {
                runnable.run();
            }
        } catch (RemoteException unused) {
            runnable.run();
        }
    }

    /* renamed from: c */
    public final void mo26812c() {
        this.f19293h.execute(new C7429ed(this, new C7392dd(new AtomicReference(this.f19292g))));
    }

    /* renamed from: f */
    public final zzaar mo26813f() {
        return null;
    }

    /* renamed from: g */
    public final View mo26814g() {
        return null;
    }

    /* renamed from: h */
    public final zzcxn mo26815h() {
        return null;
    }

    /* renamed from: i */
    public final int mo26816i() {
        return 0;
    }

    /* renamed from: j */
    public final void mo26817j() {
    }
}
