package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzuo;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.s0 */
final class C8341s0 implements C8309k3 {

    /* renamed from: a */
    private final zztv f23341a;

    private C8341s0(zztv zztv) {
        zzuq.m26679a(zztv, "output");
        zztv zztv2 = zztv;
        this.f23341a = zztv2;
        zztv2.f23437a = this;
    }

    /* renamed from: a */
    public static C8341s0 m26133a(zztv zztv) {
        C8341s0 s0Var = zztv.f23437a;
        if (s0Var != null) {
            return s0Var;
        }
        return new C8341s0(zztv);
    }

    /* renamed from: b */
    public final void mo30164b(int i, int i2) throws IOException {
        this.f23341a.mo30401b(i, i2);
    }

    /* renamed from: c */
    public final void mo30170c(int i, int i2) throws IOException {
        this.f23341a.mo30412e(i, i2);
    }

    /* renamed from: d */
    public final void mo30174d(int i, long j) throws IOException {
        this.f23341a.mo30388a(i, j);
    }

    /* renamed from: e */
    public final void mo30177e(int i, long j) throws IOException {
        this.f23341a.mo30388a(i, j);
    }

    /* renamed from: f */
    public final void mo30179f(int i, int i2) throws IOException {
        this.f23341a.mo30407c(i, i2);
    }

    /* renamed from: g */
    public final void mo30181g(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f23341a.mo30387a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zztv.m26567g(list.get(i4).intValue());
            }
            this.f23341a.mo30400b(i3);
            while (i2 < list.size()) {
                this.f23341a.mo30400b(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f23341a.mo30407c(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: h */
    public final void mo30182h(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f23341a.mo30387a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zztv.m26578j(list.get(i4).intValue());
            }
            this.f23341a.mo30400b(i3);
            while (i2 < list.size()) {
                this.f23341a.mo30410d(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f23341a.mo30412e(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: i */
    public final void mo30183i(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f23341a.mo30387a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zztv.m26570g(list.get(i4).longValue());
            }
            this.f23341a.mo30400b(i3);
            while (i2 < list.size()) {
                this.f23341a.mo30409c(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f23341a.mo30408c(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: j */
    public final void mo30184j(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f23341a.mo30387a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zztv.m26566f(list.get(i4).longValue());
            }
            this.f23341a.mo30400b(i3);
            while (i2 < list.size()) {
                this.f23341a.mo30404b(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f23341a.mo30402b(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: k */
    public final void mo30185k(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f23341a.mo30387a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zztv.m26562e(list.get(i4).longValue());
            }
            this.f23341a.mo30400b(i3);
            while (i2 < list.size()) {
                this.f23341a.mo30394a(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f23341a.mo30388a(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: l */
    public final void mo30186l(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f23341a.mo30387a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zztv.m26571h(list.get(i4).intValue());
            }
            this.f23341a.mo30400b(i3);
            while (i2 < list.size()) {
                this.f23341a.mo30406c(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f23341a.mo30411d(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: m */
    public final void mo30187m(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f23341a.mo30387a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zztv.m26538b(list.get(i4).doubleValue());
            }
            this.f23341a.mo30400b(i3);
            while (i2 < list.size()) {
                this.f23341a.mo30382a(list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f23341a.mo30385a(i, list.get(i2).doubleValue());
            i2++;
        }
    }

    /* renamed from: n */
    public final void mo30188n(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f23341a.mo30387a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zztv.m26539b(list.get(i4).floatValue());
            }
            this.f23341a.mo30400b(i3);
            while (i2 < list.size()) {
                this.f23341a.mo30383a(list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f23341a.mo30386a(i, list.get(i2).floatValue());
            i2++;
        }
    }

    /* renamed from: b */
    public final void mo30165b(int i, long j) throws IOException {
        this.f23341a.mo30408c(i, j);
    }

    /* renamed from: e */
    public final void mo30176e(int i, int i2) throws IOException {
        this.f23341a.mo30412e(i, i2);
    }

    /* renamed from: f */
    public final void mo30180f(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f23341a.mo30387a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zztv.m26575i(list.get(i4).intValue());
            }
            this.f23341a.mo30400b(i3);
            while (i2 < list.size()) {
                this.f23341a.mo30410d(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f23341a.mo30412e(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: a */
    public final int mo30148a() {
        return zzuo.zze.f23507i;
    }

    /* renamed from: b */
    public final void mo30166b(int i, Object obj, C8273d2 d2Var) throws IOException {
        zztv zztv = this.f23341a;
        zztv.mo30387a(i, 3);
        d2Var.mo30088a((zzvv) obj, (C8309k3) zztv.f23437a);
        zztv.mo30387a(i, 4);
    }

    /* renamed from: c */
    public final void mo30171c(int i, long j) throws IOException {
        this.f23341a.mo30408c(i, j);
    }

    /* renamed from: d */
    public final void mo30173d(int i, int i2) throws IOException {
        this.f23341a.mo30411d(i, i2);
    }

    /* renamed from: e */
    public final void mo30178e(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f23341a.mo30387a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zztv.m26574h(list.get(i4).longValue());
            }
            this.f23341a.mo30400b(i3);
            while (i2 < list.size()) {
                this.f23341a.mo30409c(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f23341a.mo30408c(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: a */
    public final void mo30151a(int i, float f) throws IOException {
        this.f23341a.mo30386a(i, f);
    }

    /* renamed from: d */
    public final void mo30175d(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f23341a.mo30387a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zztv.m26559d(list.get(i4).longValue());
            }
            this.f23341a.mo30400b(i3);
            while (i2 < list.size()) {
                this.f23341a.mo30394a(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f23341a.mo30388a(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: a */
    public final void mo30150a(int i, double d) throws IOException {
        this.f23341a.mo30385a(i, d);
    }

    /* renamed from: c */
    public final void mo30172c(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f23341a.mo30387a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zztv.m26580k(list.get(i4).intValue());
            }
            this.f23341a.mo30400b(i3);
            while (i2 < list.size()) {
                this.f23341a.mo30384a(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f23341a.mo30401b(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: a */
    public final void mo30152a(int i, int i2) throws IOException {
        this.f23341a.mo30401b(i, i2);
    }

    /* renamed from: b */
    public final void mo30163b(int i) throws IOException {
        this.f23341a.mo30387a(i, 3);
    }

    /* renamed from: a */
    public final void mo30162a(int i, boolean z) throws IOException {
        this.f23341a.mo30393a(i, z);
    }

    /* renamed from: b */
    public final void mo30169b(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f23341a.mo30387a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zztv.m26563f(list.get(i4).intValue());
            }
            this.f23341a.mo30400b(i3);
            while (i2 < list.size()) {
                this.f23341a.mo30384a(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f23341a.mo30401b(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: a */
    public final void mo30158a(int i, String str) throws IOException {
        this.f23341a.mo30392a(i, str);
    }

    /* renamed from: a */
    public final void mo30155a(int i, zzte zzte) throws IOException {
        this.f23341a.mo30389a(i, zzte);
    }

    /* renamed from: a */
    public final void mo30153a(int i, long j) throws IOException {
        this.f23341a.mo30402b(i, j);
    }

    /* renamed from: a */
    public final void mo30157a(int i, Object obj, C8273d2 d2Var) throws IOException {
        this.f23341a.mo30391a(i, (zzvv) obj, d2Var);
    }

    /* renamed from: a */
    public final void mo30149a(int i) throws IOException {
        this.f23341a.mo30387a(i, 4);
    }

    /* renamed from: a */
    public final void mo30156a(int i, Object obj) throws IOException {
        if (obj instanceof zzte) {
            this.f23341a.mo30403b(i, (zzte) obj);
        } else {
            this.f23341a.mo30390a(i, (zzvv) obj);
        }
    }

    /* renamed from: b */
    public final void mo30167b(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (list instanceof zzve) {
            zzve zzve = (zzve) list;
            while (i2 < list.size()) {
                Object a = zzve.mo30446a(i2);
                if (a instanceof String) {
                    this.f23341a.mo30392a(i, (String) a);
                } else {
                    this.f23341a.mo30389a(i, (zzte) a);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f23341a.mo30392a(i, list.get(i2));
            i2++;
        }
    }

    /* renamed from: a */
    public final void mo30161a(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f23341a.mo30387a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zztv.m26550b(list.get(i4).booleanValue());
            }
            this.f23341a.mo30400b(i3);
            while (i2 < list.size()) {
                this.f23341a.mo30399a(list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f23341a.mo30393a(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    /* renamed from: a */
    public final void mo30159a(int i, List<zzte> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f23341a.mo30389a(i, list.get(i2));
        }
    }

    /* renamed from: b */
    public final void mo30168b(int i, List<?> list, C8273d2 d2Var) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo30157a(i, (Object) list.get(i2), d2Var);
        }
    }

    /* renamed from: a */
    public final void mo30160a(int i, List<?> list, C8273d2 d2Var) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo30166b(i, (Object) list.get(i2), d2Var);
        }
    }

    /* renamed from: a */
    public final <K, V> void mo30154a(int i, C8326o1<K, V> o1Var, Map<K, V> map) throws IOException {
        for (Map.Entry next : map.entrySet()) {
            this.f23341a.mo30387a(i, 2);
            this.f23341a.mo30400b(zzvn.m26704a(o1Var, next.getKey(), next.getValue()));
            zzvn.m26705a(this.f23341a, o1Var, next.getKey(), next.getValue());
        }
    }
}
