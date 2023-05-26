package com.airbnb.lottie.p129q.p131b;

import android.graphics.Path;
import com.airbnb.lottie.p133s.p135j.C5750g;
import com.airbnb.lottie.p133s.p135j.C5758l;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.q.b.g */
/* compiled from: MaskKeyframeAnimation */
public class C5710g {

    /* renamed from: a */
    private final List<C5703a<C5758l, Path>> f10190a;

    /* renamed from: b */
    private final List<C5703a<Integer, Integer>> f10191b;

    /* renamed from: c */
    private final List<C5750g> f10192c;

    public C5710g(List<C5750g> list) {
        this.f10192c = list;
        this.f10190a = new ArrayList(list.size());
        this.f10191b = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.f10190a.add(list.get(i).mo19601b().mo19562a());
            this.f10191b.add(list.get(i).mo19602c().mo19562a());
        }
    }

    /* renamed from: a */
    public List<C5703a<C5758l, Path>> mo19516a() {
        return this.f10190a;
    }

    /* renamed from: b */
    public List<C5750g> mo19517b() {
        return this.f10192c;
    }

    /* renamed from: c */
    public List<C5703a<Integer, Integer>> mo19518c() {
        return this.f10191b;
    }
}
