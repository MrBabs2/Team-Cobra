package com.airbnb.lottie;

import com.airbnb.lottie.p139v.C5827d;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p050l.p066e.C4870b;
import p050l.p075h.p083k.C5004d;

/* renamed from: com.airbnb.lottie.m */
/* compiled from: PerformanceTracker */
public class C5675m {

    /* renamed from: a */
    private boolean f10058a = false;

    /* renamed from: b */
    private final Set<C5677b> f10059b = new C4870b();

    /* renamed from: c */
    private final Map<String, C5827d> f10060c = new HashMap();

    /* renamed from: com.airbnb.lottie.m$a */
    /* compiled from: PerformanceTracker */
    class C5676a implements Comparator<C5004d<String, Float>> {
        C5676a(C5675m mVar) {
        }

        /* renamed from: a */
        public int compare(C5004d<String, Float> dVar, C5004d<String, Float> dVar2) {
            float floatValue = ((Float) dVar.f8863b).floatValue();
            float floatValue2 = ((Float) dVar2.f8863b).floatValue();
            if (floatValue2 > floatValue) {
                return 1;
            }
            return floatValue > floatValue2 ? -1 : 0;
        }
    }

    /* renamed from: com.airbnb.lottie.m$b */
    /* compiled from: PerformanceTracker */
    public interface C5677b {
        /* renamed from: a */
        void mo19488a(float f);
    }

    public C5675m() {
        new C5676a(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo19485a(boolean z) {
        this.f10058a = z;
    }

    /* renamed from: a */
    public void mo19484a(String str, float f) {
        if (this.f10058a) {
            C5827d dVar = this.f10060c.get(str);
            if (dVar == null) {
                dVar = new C5827d();
                this.f10060c.put(str, dVar);
            }
            dVar.mo19737a(f);
            if (str.equals("__container")) {
                for (C5677b a : this.f10059b) {
                    a.mo19488a(f);
                }
            }
        }
    }
}
