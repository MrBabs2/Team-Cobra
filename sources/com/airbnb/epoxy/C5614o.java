package com.airbnb.epoxy;

import android.os.Handler;
import androidx.recyclerview.widget.C0688f;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.C5570c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.epoxy.o */
/* compiled from: EpoxyControllerAdapter */
public final class C5614o extends C5583d implements C5570c.C5575e {

    /* renamed from: p */
    private static final C0688f.C0692d<C5631s<?>> f9892p = new C5615a();

    /* renamed from: k */
    private final C5589e0 f9893k = new C5589e0();

    /* renamed from: l */
    private final C5570c f9894l;

    /* renamed from: m */
    private final C5607n f9895m;

    /* renamed from: n */
    private int f9896n;

    /* renamed from: o */
    private final List<C5593g0> f9897o = new ArrayList();

    /* renamed from: com.airbnb.epoxy.o$a */
    /* compiled from: EpoxyControllerAdapter */
    static class C5615a extends C0688f.C0692d<C5631s<?>> {
        C5615a() {
        }

        /* renamed from: a */
        public boolean mo4204a(C5631s<?> sVar, C5631s<?> sVar2) {
            return sVar.equals(sVar2);
        }

        /* renamed from: b */
        public boolean mo4205b(C5631s<?> sVar, C5631s<?> sVar2) {
            return sVar.mo19311id() == sVar2.mo19311id();
        }

        /* renamed from: c */
        public Object mo4206c(C5631s<?> sVar, C5631s<?> sVar2) {
            return new C5599j(sVar);
        }
    }

    C5614o(C5607n nVar, Handler handler) {
        this.f9895m = nVar;
        this.f9894l = new C5570c(handler, this, f9892p);
        registerAdapterDataObserver(this.f9893k);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo19194a(RuntimeException runtimeException) {
        this.f9895m.onExceptionSwallowed(runtimeException);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo19195a() {
        return true;
    }

    /* renamed from: b */
    public void mo19278b(C5593g0 g0Var) {
        this.f9897o.remove(g0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public List<? extends C5631s<?>> mo19200c() {
        return this.f9894l.mo19117b();
    }

    /* renamed from: g */
    public List<C5631s<?>> mo19279g() {
        return mo19200c();
    }

    public int getItemCount() {
        return this.f9896n;
    }

    /* renamed from: h */
    public boolean mo19280h() {
        return this.f9894l.mo19119c();
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        this.f9895m.onAttachedToRecyclerViewInternal(recyclerView);
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.f9895m.onDetachedFromRecyclerViewInternal(recyclerView);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo19277a(C5594h hVar) {
        List<? extends C5631s<?>> c = mo19200c();
        if (!c.isEmpty()) {
            if (((C5631s) c.get(0)).isDebugValidationEnabled()) {
                for (int i = 0; i < c.size(); i++) {
                    ((C5631s) c.get(i)).validateStateHasNotChangedSinceAdded("The model was changed between being bound and when models were rebuilt", i);
                }
            }
        }
        this.f9894l.mo19118b(hVar);
    }

    /* renamed from: b */
    public void onViewAttachedToWindow(C5636u uVar) {
        super.onViewAttachedToWindow(uVar);
        this.f9895m.onViewAttachedToWindow(uVar, uVar.mo19327a());
    }

    /* renamed from: c */
    public void onViewDetachedFromWindow(C5636u uVar) {
        super.onViewDetachedFromWindow(uVar);
        this.f9895m.onViewDetachedFromWindow(uVar, uVar.mo19327a());
    }

    /* renamed from: b */
    public C5586e mo19197b() {
        return super.mo19197b();
    }

    /* renamed from: a */
    public void mo19126a(C5601k kVar) {
        this.f9896n = kVar.f9880b.size();
        this.f9893k.mo19216a();
        kVar.mo19226a((RecyclerView.C0633g) this);
        this.f9893k.mo19217b();
        for (int size = this.f9897o.size() - 1; size >= 0; size--) {
            this.f9897o.get(size).mo19221a(kVar);
        }
    }

    /* renamed from: a */
    public void mo19276a(C5593g0 g0Var) {
        this.f9897o.add(g0Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo19192a(C5636u uVar, C5631s<?> sVar, int i, C5631s<?> sVar2) {
        this.f9895m.onModelBound(uVar, sVar, i, sVar2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo19190a(C5636u uVar, C5631s<?> sVar) {
        this.f9895m.onModelUnbound(uVar, sVar);
    }

    /* renamed from: a */
    public int mo19274a(C5631s<?> sVar) {
        int size = mo19200c().size();
        for (int i = 0; i < size; i++) {
            if (((C5631s) mo19200c().get(i)).mo19311id() == sVar.mo19311id()) {
                return i;
            }
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo19275a(int i, int i2) {
        ArrayList arrayList = new ArrayList(mo19200c());
        arrayList.add(i2, arrayList.remove(i));
        this.f9893k.mo19216a();
        notifyItemMoved(i, i2);
        this.f9893k.mo19217b();
        if (this.f9894l.mo19116a((List<C5631s<?>>) arrayList)) {
            this.f9895m.requestModelBuild();
        }
    }
}
