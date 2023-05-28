package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.Collections;
import java.util.Map;
import p050l.p066e.C4868a;

/* renamed from: com.google.android.gms.common.api.internal.w0 */
final class C7211w0 implements OnCompleteListener<Map<zai<?>, String>> {

    /* renamed from: a */
    private final /* synthetic */ zax f13852a;

    private C7211w0(zax zax) {
        this.f13852a = zax;
    }

    /* renamed from: a */
    public final void mo6796a(Task<Map<zai<?>, String>> task) {
        this.f13852a.f13999k.lock();
        try {
            if (this.f13852a.f14007s) {
                if (task.mo30709d()) {
                    Map unused = this.f13852a.f14008t = new C4868a(this.f13852a.f13994f.size());
                    for (zaw g : this.f13852a.f13994f.values()) {
                        this.f13852a.f14008t.put(g.mo24931g(), ConnectionResult.f13608j);
                    }
                } else if (task.mo30706a() instanceof AvailabilityException) {
                    AvailabilityException availabilityException = (AvailabilityException) task.mo30706a();
                    if (this.f13852a.f14005q) {
                        Map unused2 = this.f13852a.f14008t = new C4868a(this.f13852a.f13994f.size());
                        for (zaw zaw : this.f13852a.f13994f.values()) {
                            zai g2 = zaw.mo24931g();
                            ConnectionResult a = availabilityException.mo24911a(zaw);
                            if (this.f13852a.m15865a((zaw<?>) zaw, a)) {
                                this.f13852a.f14008t.put(g2, new ConnectionResult(16));
                            } else {
                                this.f13852a.f14008t.put(g2, a);
                            }
                        }
                    } else {
                        Map unused3 = this.f13852a.f14008t = availabilityException.mo24912a();
                    }
                    ConnectionResult unused4 = this.f13852a.f14011w = this.f13852a.m15880i();
                } else {
                    Log.e("ConnectionlessGAC", "Unexpected availability exception", task.mo30706a());
                    Map unused5 = this.f13852a.f14008t = Collections.emptyMap();
                    ConnectionResult unused6 = this.f13852a.f14011w = new ConnectionResult(8);
                }
                if (this.f13852a.f14009u != null) {
                    this.f13852a.f14008t.putAll(this.f13852a.f14009u);
                    ConnectionResult unused7 = this.f13852a.f14011w = this.f13852a.m15880i();
                }
                if (this.f13852a.f14011w == null) {
                    this.f13852a.m15877g();
                    this.f13852a.m15879h();
                } else {
                    boolean unused8 = this.f13852a.f14007s = false;
                    this.f13852a.f13998j.mo25136a(this.f13852a.f14011w);
                }
                this.f13852a.f14002n.signalAll();
                this.f13852a.f13999k.unlock();
            }
        } finally {
            this.f13852a.f13999k.unlock();
        }
    }
}
