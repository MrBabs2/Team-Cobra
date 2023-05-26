package com.airbnb.epoxy;

import android.os.Bundle;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.airbnb.epoxy.d */
/* compiled from: BaseEpoxyAdapter */
public abstract class C5583d extends RecyclerView.C0633g<C5636u> {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f9861f = 1;

    /* renamed from: g */
    private final C5606m0 f9862g = new C5606m0();

    /* renamed from: h */
    private final C5586e f9863h = new C5586e();

    /* renamed from: i */
    private ViewHolderState f9864i = new ViewHolderState();

    /* renamed from: j */
    private final GridLayoutManager.C0618c f9865j = new C5584a();

    /* renamed from: com.airbnb.epoxy.d$a */
    /* compiled from: BaseEpoxyAdapter */
    class C5584a extends GridLayoutManager.C0618c {
        C5584a() {
        }

        public int getSpanSize(int i) {
            try {
                return C5583d.this.mo19186a(i).spanSize(C5583d.this.f9861f, i, C5583d.this.getItemCount());
            } catch (IndexOutOfBoundsException e) {
                C5583d.this.mo19194a((RuntimeException) e);
                return 1;
            }
        }
    }

    public C5583d() {
        setHasStableIds(true);
        this.f9865j.setSpanIndexCacheEnabled(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo19190a(C5636u uVar, C5631s<?> sVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo19191a(C5636u uVar, C5631s<?> sVar, int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo19194a(RuntimeException runtimeException) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo19195a() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C5586e mo19197b() {
        return this.f9863h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract List<? extends C5631s<?>> mo19200c();

    /* renamed from: c */
    public void onViewDetachedFromWindow(C5636u uVar) {
        uVar.mo19327a().onViewDetachedFromWindow(uVar.mo19329b());
    }

    /* renamed from: d */
    public void onViewRecycled(C5636u uVar) {
        this.f9864i.mo19101b(uVar);
        this.f9863h.mo19210b(uVar);
        C5631s<?> a = uVar.mo19327a();
        uVar.mo19331d();
        mo19190a(uVar, a);
    }

    /* renamed from: e */
    public GridLayoutManager.C0618c mo19204e() {
        return this.f9865j;
    }

    /* renamed from: f */
    public boolean mo19205f() {
        return this.f9861f > 1;
    }

    public int getItemCount() {
        return mo19200c().size();
    }

    public long getItemId(int i) {
        return ((C5631s) mo19200c().get(i)).mo19311id();
    }

    public int getItemViewType(int i) {
        return this.f9862g.mo19228a(mo19186a(i));
    }

    public void onSaveInstanceState(Bundle bundle) {
        Iterator<C5636u> it = this.f9863h.iterator();
        while (it.hasNext()) {
            this.f9864i.mo19101b(it.next());
        }
        if (this.f9864i.mo16942c() <= 0 || hasStableIds()) {
            bundle.putParcelable("saved_state_view_holders", this.f9864i);
            return;
        }
        throw new IllegalStateException("Must have stable ids when saving view holder state");
    }

    /* renamed from: a */
    public void onBindViewHolder(C5636u uVar, int i) {
        onBindViewHolder(uVar, i, (List<Object>) Collections.emptyList());
    }

    /* renamed from: b */
    public void onViewAttachedToWindow(C5636u uVar) {
        uVar.mo19327a().onViewAttachedToWindow(uVar.mo19329b());
    }

    public C5636u onCreateViewHolder(ViewGroup viewGroup, int i) {
        C5631s<?> a = this.f9862g.mo19229a(this, i);
        return new C5636u(a.buildView(viewGroup), a.shouldSaveViewState());
    }

    /* renamed from: a */
    public void onBindViewHolder(C5636u uVar, int i, List<Object> list) {
        C5631s<?> a = mo19186a(i);
        C5631s<?> a2 = mo19195a() ? C5599j.m10633a(list, getItemId(i)) : null;
        uVar.mo19328a(a, a2, list, i);
        if (list.isEmpty()) {
            this.f9864i.mo19100a(uVar);
        }
        this.f9863h.mo19209a(uVar);
        if (mo19195a()) {
            mo19192a(uVar, a, i, a2);
        } else {
            mo19193a(uVar, a, i, list);
        }
    }

    /* renamed from: b */
    public void mo19198b(int i) {
        this.f9861f = i;
    }

    /* renamed from: d */
    public int mo19202d() {
        return this.f9861f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo19193a(C5636u uVar, C5631s<?> sVar, int i, List<Object> list) {
        mo19191a(uVar, sVar, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo19192a(C5636u uVar, C5631s<?> sVar, int i, C5631s<?> sVar2) {
        mo19191a(uVar, sVar, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C5631s<?> mo19186a(int i) {
        return (C5631s) mo19200c().get(i);
    }

    /* renamed from: a */
    public boolean onFailedToRecycleView(C5636u uVar) {
        return uVar.mo19327a().onFailedToRecycleView(uVar.mo19329b());
    }

    /* renamed from: a */
    public void mo19187a(Bundle bundle) {
        if (this.f9863h.size() > 0) {
            throw new IllegalStateException("State cannot be restored once views have been bound. It should be done before adding the adapter to the recycler view.");
        } else if (bundle != null) {
            ViewHolderState viewHolderState = (ViewHolderState) bundle.getParcelable("saved_state_view_holders");
            this.f9864i = viewHolderState;
            if (viewHolderState == null) {
                throw new IllegalStateException("Tried to restore instance state, but onSaveInstanceState was never called.");
            }
        }
    }
}
