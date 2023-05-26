package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.ResultCallbacks;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.TransformedResult;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.ref.WeakReference;

public final class zacm<R extends Result> extends TransformedResult<R> implements ResultCallback<R> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public ResultTransform<? super R, ? extends Result> f13950a;

    /* renamed from: b */
    private zacm<? extends Result> f13951b;

    /* renamed from: c */
    private volatile ResultCallbacks<? super R> f13952c;

    /* renamed from: d */
    private final Object f13953d;

    /* renamed from: e */
    private Status f13954e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final WeakReference<GoogleApiClient> f13955f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C7183i0 f13956g;

    /* renamed from: b */
    private final void m15800b(Status status) {
        synchronized (this.f13953d) {
            if (this.f13950a != null) {
                Status a = this.f13950a.mo24974a(status);
                Preconditions.m16038a(a, (Object) "onFailure must not return null");
                this.f13951b.m15796a(a);
            } else if (m15801b()) {
                this.f13952c.mo24967a(status);
            }
        }
    }

    /* renamed from: a */
    public final void mo24971a(R r) {
        synchronized (this.f13953d) {
            if (!r.getStatus().mo24986q()) {
                m15796a(r.getStatus());
                m15799b((Result) r);
            } else if (this.f13950a != null) {
                zacc.m15778a().submit(new C7181h0(this, r));
            } else if (m15801b()) {
                this.f13952c.mo24972b(r);
            }
        }
    }

    /* renamed from: b */
    private final boolean m15801b() {
        return (this.f13952c == null || ((GoogleApiClient) this.f13955f.get()) == null) ? false : true;
    }

    /* renamed from: a */
    private final void m15796a(Status status) {
        synchronized (this.f13953d) {
            this.f13954e = status;
            m15800b(status);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m15799b(Result result) {
        if (result instanceof Releasable) {
            try {
                ((Releasable) result).mo24917a();
            } catch (RuntimeException e) {
                String valueOf = String.valueOf(result);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                sb.append("Unable to release ");
                sb.append(valueOf);
                Log.w("TransformedResultImpl", sb.toString(), e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo25181a() {
        this.f13952c = null;
    }
}
