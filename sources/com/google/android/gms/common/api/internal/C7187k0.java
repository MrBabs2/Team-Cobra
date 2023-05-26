package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import com.google.android.gms.common.api.zac;
import java.lang.ref.WeakReference;
import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.common.api.internal.k0 */
final class C7187k0 implements IBinder.DeathRecipient, C7189l0 {

    /* renamed from: a */
    private final WeakReference<BasePendingResult<?>> f13806a;

    /* renamed from: b */
    private final WeakReference<zac> f13807b;

    /* renamed from: c */
    private final WeakReference<IBinder> f13808c;

    private C7187k0(BasePendingResult<?> basePendingResult, zac zac, IBinder iBinder) {
        this.f13807b = new WeakReference<>(zac);
        this.f13806a = new WeakReference<>(basePendingResult);
        this.f13808c = new WeakReference<>(iBinder);
    }

    /* renamed from: a */
    public final void mo25107a(BasePendingResult<?> basePendingResult) {
        m15552a();
    }

    public final void binderDied() {
        m15552a();
    }

    /* renamed from: a */
    private final void m15552a() {
        BasePendingResult basePendingResult = (BasePendingResult) this.f13806a.get();
        zac zac = (zac) this.f13807b.get();
        if (!(zac == null || basePendingResult == null)) {
            zac.mo25208a(basePendingResult.mo25017d().intValue());
        }
        IBinder iBinder = (IBinder) this.f13808c.get();
        if (iBinder != null) {
            try {
                iBinder.unlinkToDeath(this, 0);
            } catch (NoSuchElementException unused) {
            }
        }
    }

    /* synthetic */ C7187k0(BasePendingResult basePendingResult, zac zac, IBinder iBinder, C7185j0 j0Var) {
        this(basePendingResult, (zac) null, iBinder);
    }
}
