package com.airbnb.epoxy;

import androidx.recyclerview.widget.C0672b;
import androidx.recyclerview.widget.C0688f;
import androidx.recyclerview.widget.C0708l;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;

/* renamed from: com.airbnb.epoxy.k */
/* compiled from: DiffResult */
public class C5601k {

    /* renamed from: a */
    final List<? extends C5631s<?>> f9879a;

    /* renamed from: b */
    final List<? extends C5631s<?>> f9880b;

    /* renamed from: c */
    final C0688f.C0691c f9881c;

    private C5601k(List<? extends C5631s<?>> list, List<? extends C5631s<?>> list2, C0688f.C0691c cVar) {
        this.f9879a = list;
        this.f9880b = list2;
        this.f9881c = cVar;
    }

    /* renamed from: a */
    static C5601k m10635a(List<? extends C5631s<?>> list) {
        return new C5601k(list, Collections.EMPTY_LIST, (C0688f.C0691c) null);
    }

    /* renamed from: b */
    static C5601k m10637b(List<? extends C5631s<?>> list) {
        return new C5601k(Collections.EMPTY_LIST, list, (C0688f.C0691c) null);
    }

    /* renamed from: c */
    static C5601k m10638c(List<? extends C5631s<?>> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        return new C5601k(list, list, (C0688f.C0691c) null);
    }

    /* renamed from: a */
    static C5601k m10636a(List<? extends C5631s<?>> list, List<? extends C5631s<?>> list2, C0688f.C0691c cVar) {
        return new C5601k(list, list2, cVar);
    }

    /* renamed from: a */
    public void mo19226a(RecyclerView.C0633g gVar) {
        mo19227a((C0708l) new C0672b(gVar));
    }

    /* renamed from: a */
    public void mo19227a(C0708l lVar) {
        C0688f.C0691c cVar = this.f9881c;
        if (cVar != null) {
            cVar.mo4203a(lVar);
        } else if (this.f9880b.isEmpty() && !this.f9879a.isEmpty()) {
            lVar.mo4146c(0, this.f9879a.size());
        } else if (!this.f9880b.isEmpty() && this.f9879a.isEmpty()) {
            lVar.mo4145b(0, this.f9880b.size());
        }
    }
}
