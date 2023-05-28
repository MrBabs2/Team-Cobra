package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.Collections;
import java.util.Map;
import p050l.p066e.C4868a;

/* renamed from: com.google.android.gms.common.api.internal.a */
final class C7166a implements OnCompleteListener<Map<zai<?>, String>> {

    /* renamed from: a */
    private SignInConnectionListener f13774a;

    /* renamed from: b */
    private final /* synthetic */ zax f13775b;

    C7166a(zax zax, SignInConnectionListener signInConnectionListener) {
        this.f13775b = zax;
        this.f13774a = signInConnectionListener;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo25093a() {
        this.f13774a.onComplete();
    }

    /* renamed from: a */
    public final void mo6796a(Task<Map<zai<?>, String>> task) {
        this.f13775b.f13999k.lock();
        try {
            if (!this.f13775b.f14007s) {
                this.f13774a.onComplete();
                return;
            }
            if (task.mo30709d()) {
                Map unused = this.f13775b.f14009u = new C4868a(this.f13775b.f13995g.size());
                for (zaw g : this.f13775b.f13995g.values()) {
                    this.f13775b.f14009u.put(g.mo24931g(), ConnectionResult.f13608j);
                }
            } else if (task.mo30706a() instanceof AvailabilityException) {
                AvailabilityException availabilityException = (AvailabilityException) task.mo30706a();
                if (this.f13775b.f14005q) {
                    Map unused2 = this.f13775b.f14009u = new C4868a(this.f13775b.f13995g.size());
                    for (zaw zaw : this.f13775b.f13995g.values()) {
                        zai g2 = zaw.mo24931g();
                        ConnectionResult a = availabilityException.mo24911a(zaw);
                        if (this.f13775b.m15865a((zaw<?>) zaw, a)) {
                            this.f13775b.f14009u.put(g2, new ConnectionResult(16));
                        } else {
                            this.f13775b.f14009u.put(g2, a);
                        }
                    }
                } else {
                    Map unused3 = this.f13775b.f14009u = availabilityException.mo24912a();
                }
            } else {
                Log.e("ConnectionlessGAC", "Unexpected availability exception", task.mo30706a());
                Map unused4 = this.f13775b.f14009u = Collections.emptyMap();
            }
            if (this.f13775b.isConnected()) {
                this.f13775b.f14008t.putAll(this.f13775b.f14009u);
                if (this.f13775b.m15880i() == null) {
                    this.f13775b.m15877g();
                    this.f13775b.m15879h();
                    this.f13775b.f14002n.signalAll();
                }
            }
            this.f13774a.onComplete();
            this.f13775b.f13999k.unlock();
        } finally {
            this.f13775b.f13999k.unlock();
        }
    }
}
