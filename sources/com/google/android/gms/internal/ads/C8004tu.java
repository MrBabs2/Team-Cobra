package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.tu */
final class C8004tu implements C8118wx {

    /* renamed from: a */
    private final zzdni f16917a;

    private C8004tu(zzdni zzdni) {
        zzdod.m24036a(zzdni, "output");
        zzdni zzdni2 = zzdni;
        this.f16917a = zzdni2;
        zzdni2.f21496a = this;
    }

    /* renamed from: a */
    public static C8004tu m18208a(zzdni zzdni) {
        C8004tu tuVar = zzdni.f21496a;
        if (tuVar != null) {
            return tuVar;
        }
        return new C8004tu(zzdni);
    }

    /* renamed from: b */
    public final void mo26599b(int i, int i2) throws IOException {
        this.f16917a.mo29084a(i, i2);
    }

    /* renamed from: c */
    public final void mo26605c(int i, long j) throws IOException {
        this.f16917a.mo29108c(i, j);
    }

    /* renamed from: d */
    public final void mo26607d(int i, int i2) throws IOException {
        this.f16917a.mo29107c(i, i2);
    }

    /* renamed from: e */
    public final void mo26611e(int i, long j) throws IOException {
        this.f16917a.mo29085a(i, j);
    }

    /* renamed from: f */
    public final void mo26614f(int i, long j) throws IOException {
        this.f16917a.mo29085a(i, j);
    }

    /* renamed from: g */
    public final void mo26616g(int i, long j) throws IOException {
        this.f16917a.mo29108c(i, j);
    }

    /* renamed from: h */
    public final void mo26618h(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f16917a.mo29099b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzdni.m23853j(list.get(i4).intValue());
            }
            this.f16917a.mo29098b(i3);
            while (i2 < list.size()) {
                this.f16917a.mo29111d(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f16917a.mo29084a(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: i */
    public final void mo26619i(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f16917a.mo29099b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzdni.m23845g(list.get(i4).longValue());
            }
            this.f16917a.mo29098b(i3);
            while (i2 < list.size()) {
                this.f16917a.mo29109c(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f16917a.mo29108c(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: j */
    public final void mo26620j(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f16917a.mo29099b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzdni.m23841f(list.get(i4).longValue());
            }
            this.f16917a.mo29098b(i3);
            while (i2 < list.size()) {
                this.f16917a.mo29103b(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f16917a.mo29100b(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: k */
    public final void mo26621k(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f16917a.mo29099b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzdni.m23837e(list.get(i4).longValue());
            }
            this.f16917a.mo29098b(i3);
            while (i2 < list.size()) {
                this.f16917a.mo29091a(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f16917a.mo29085a(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: l */
    public final void mo26622l(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f16917a.mo29099b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzdni.m23846h(list.get(i4).intValue());
            }
            this.f16917a.mo29098b(i3);
            while (i2 < list.size()) {
                this.f16917a.mo29106c(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f16917a.mo29113e(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: m */
    public final void mo26623m(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f16917a.mo29099b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzdni.m23813b(list.get(i4).doubleValue());
            }
            this.f16917a.mo29098b(i3);
            while (i2 < list.size()) {
                this.f16917a.mo29079a(list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f16917a.mo29082a(i, list.get(i2).doubleValue());
            i2++;
        }
    }

    /* renamed from: n */
    public final void mo26624n(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f16917a.mo29099b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzdni.m23814b(list.get(i4).floatValue());
            }
            this.f16917a.mo29098b(i3);
            while (i2 < list.size()) {
                this.f16917a.mo29080a(list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f16917a.mo29083a(i, list.get(i2).floatValue());
            i2++;
        }
    }

    /* renamed from: c */
    public final void mo26604c(int i, int i2) throws IOException {
        this.f16917a.mo29112d(i, i2);
    }

    /* renamed from: f */
    public final void mo26613f(int i, int i2) throws IOException {
        this.f16917a.mo29107c(i, i2);
    }

    /* renamed from: a */
    public final int mo26584a() {
        return zzdob.zze.f21584k;
    }

    /* renamed from: b */
    public final void mo26600b(int i, Object obj, C7784nw nwVar) throws IOException {
        this.f16917a.mo29088a(i, (zzdpk) obj, nwVar);
    }

    /* renamed from: c */
    public final void mo26606c(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f16917a.mo29099b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzdni.m23855k(list.get(i4).intValue());
            }
            this.f16917a.mo29098b(i3);
            while (i2 < list.size()) {
                this.f16917a.mo29081a(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f16917a.mo29107c(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: d */
    public final void mo26608d(int i, long j) throws IOException {
        this.f16917a.mo29100b(i, j);
    }

    /* renamed from: e */
    public final void mo26610e(int i, int i2) throws IOException {
        this.f16917a.mo29113e(i, i2);
    }

    /* renamed from: f */
    public final void mo26615f(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f16917a.mo29099b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzdni.m23850i(list.get(i4).intValue());
            }
            this.f16917a.mo29098b(i3);
            while (i2 < list.size()) {
                this.f16917a.mo29111d(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f16917a.mo29084a(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: g */
    public final void mo26617g(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f16917a.mo29099b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzdni.m23842g(list.get(i4).intValue());
            }
            this.f16917a.mo29098b(i3);
            while (i2 < list.size()) {
                this.f16917a.mo29098b(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f16917a.mo29112d(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: a */
    public final void mo26587a(int i, float f) throws IOException {
        this.f16917a.mo29083a(i, f);
    }

    /* renamed from: b */
    public final void mo26598b(int i) throws IOException {
        this.f16917a.mo29099b(i, 3);
    }

    /* renamed from: d */
    public final void mo26609d(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f16917a.mo29099b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzdni.m23833d(list.get(i4).longValue());
            }
            this.f16917a.mo29098b(i3);
            while (i2 < list.size()) {
                this.f16917a.mo29091a(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f16917a.mo29085a(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: e */
    public final void mo26612e(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f16917a.mo29099b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzdni.m23849h(list.get(i4).longValue());
            }
            this.f16917a.mo29098b(i3);
            while (i2 < list.size()) {
                this.f16917a.mo29109c(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f16917a.mo29108c(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: a */
    public final void mo26586a(int i, double d) throws IOException {
        this.f16917a.mo29082a(i, d);
    }

    /* renamed from: b */
    public final void mo26603b(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f16917a.mo29099b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzdni.m23838f(list.get(i4).intValue());
            }
            this.f16917a.mo29098b(i3);
            while (i2 < list.size()) {
                this.f16917a.mo29081a(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f16917a.mo29107c(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: a */
    public final void mo26588a(int i, int i2) throws IOException {
        this.f16917a.mo29084a(i, i2);
    }

    /* renamed from: a */
    public final void mo26597a(int i, boolean z) throws IOException {
        this.f16917a.mo29090a(i, z);
    }

    /* renamed from: a */
    public final void mo26593a(int i, String str) throws IOException {
        this.f16917a.mo29089a(i, str);
    }

    /* renamed from: a */
    public final void mo26590a(int i, zzdmr zzdmr) throws IOException {
        this.f16917a.mo29086a(i, zzdmr);
    }

    /* renamed from: a */
    public final void mo26592a(int i, Object obj, C7784nw nwVar) throws IOException {
        zzdni zzdni = this.f16917a;
        zzdni.mo29099b(i, 3);
        nwVar.mo25746a((zzdpk) obj, (C8118wx) zzdni.f21496a);
        zzdni.mo29099b(i, 4);
    }

    /* renamed from: b */
    public final void mo26601b(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (list instanceof zzdot) {
            zzdot zzdot = (zzdot) list;
            while (i2 < list.size()) {
                Object g = zzdot.mo29155g(i2);
                if (g instanceof String) {
                    this.f16917a.mo29089a(i, (String) g);
                } else {
                    this.f16917a.mo29086a(i, (zzdmr) g);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f16917a.mo29089a(i, list.get(i2));
            i2++;
        }
    }

    /* renamed from: a */
    public final void mo26585a(int i) throws IOException {
        this.f16917a.mo29099b(i, 4);
    }

    /* renamed from: a */
    public final void mo26591a(int i, Object obj) throws IOException {
        if (obj instanceof zzdmr) {
            this.f16917a.mo29101b(i, (zzdmr) obj);
        } else {
            this.f16917a.mo29102b(i, (zzdpk) obj);
        }
    }

    /* renamed from: a */
    public final void mo26596a(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f16917a.mo29099b(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzdni.m23824b(list.get(i4).booleanValue());
            }
            this.f16917a.mo29098b(i3);
            while (i2 < list.size()) {
                this.f16917a.mo29096a(list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f16917a.mo29090a(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    /* renamed from: b */
    public final void mo26602b(int i, List<?> list, C7784nw nwVar) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo26600b(i, (Object) list.get(i2), nwVar);
        }
    }

    /* renamed from: a */
    public final void mo26594a(int i, List<zzdmr> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f16917a.mo29086a(i, list.get(i2));
        }
    }

    /* renamed from: a */
    public final void mo26595a(int i, List<?> list, C7784nw nwVar) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo26592a(i, (Object) list.get(i2), nwVar);
        }
    }

    /* renamed from: a */
    public final <K, V> void mo26589a(int i, C8042uv<K, V> uvVar, Map<K, V> map) throws IOException {
        for (Map.Entry next : map.entrySet()) {
            this.f16917a.mo29099b(i, 2);
            this.f16917a.mo29098b(zzdpc.m24072a(uvVar, next.getKey(), next.getValue()));
            zzdpc.m24073a(this.f16917a, uvVar, next.getKey(), next.getValue());
        }
    }
}
