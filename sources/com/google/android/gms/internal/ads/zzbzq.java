package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import p015cm.aptoide.p016pt.DeepLinkIntentReceiver;

public final class zzbzq implements View.OnClickListener {

    /* renamed from: f */
    private final zzccj f19801f;

    /* renamed from: g */
    private final Clock f19802g;

    /* renamed from: h */
    private zzagd f19803h;

    /* renamed from: i */
    private zzaho f19804i;

    /* renamed from: j */
    String f19805j;

    /* renamed from: k */
    Long f19806k;

    /* renamed from: l */
    WeakReference<View> f19807l;

    public zzbzq(zzccj zzccj, Clock clock) {
        this.f19801f = zzccj;
        this.f19802g = clock;
    }

    /* renamed from: c */
    private final void m22234c() {
        View view;
        this.f19805j = null;
        this.f19806k = null;
        WeakReference<View> weakReference = this.f19807l;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            view.setClickable(false);
            view.setOnClickListener((View.OnClickListener) null);
            this.f19807l = null;
        }
    }

    /* renamed from: a */
    public final void mo28605a(zzagd zzagd) {
        this.f19803h = zzagd;
        zzaho zzaho = this.f19804i;
        if (zzaho != null) {
            this.f19801f.mo28649b("/unconfirmedClick", zzaho);
        }
        C7358cg cgVar = new C7358cg(this, zzagd);
        this.f19804i = cgVar;
        this.f19801f.mo28645a("/unconfirmedClick", (zzaho<Object>) cgVar);
    }

    /* renamed from: b */
    public final zzagd mo28606b() {
        return this.f19803h;
    }

    public final void onClick(View view) {
        WeakReference<View> weakReference = this.f19807l;
        if (weakReference != null && weakReference.get() == view) {
            if (!(this.f19805j == null || this.f19806k == null)) {
                HashMap hashMap = new HashMap();
                hashMap.put(DeepLinkIntentReceiver.DeepLinksKeys.f3452ID, this.f19805j);
                hashMap.put("time_interval", String.valueOf(this.f19802g.mo25498b() - this.f19806k.longValue()));
                hashMap.put("messageType", "onePointFiveClick");
                this.f19801f.mo28646a("sendMessageToNativeJs", (Map<String, ?>) hashMap);
            }
            m22234c();
        }
    }

    /* renamed from: a */
    public final void mo28604a() {
        if (this.f19803h != null && this.f19806k != null) {
            m22234c();
            try {
                this.f19803h.onUnconfirmedClickCancelled();
            } catch (RemoteException e) {
                zzbad.m20524d("#007 Could not call remote method.", e);
            }
        }
    }
}
