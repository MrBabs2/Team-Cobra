package com.airbnb.epoxy;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.ViewHolderState;
import java.util.List;

/* renamed from: com.airbnb.epoxy.u */
/* compiled from: EpoxyViewHolder */
public class C5636u extends RecyclerView.C0629c0 {

    /* renamed from: a */
    private C5631s f9931a;

    /* renamed from: b */
    private C5629q f9932b;

    /* renamed from: c */
    ViewHolderState.ViewState f9933c;

    public C5636u(View view, boolean z) {
        super(view);
        if (z) {
            ViewHolderState.ViewState viewState = new ViewHolderState.ViewState();
            this.f9933c = viewState;
            viewState.mo19105b(this.itemView);
        }
    }

    /* renamed from: e */
    private void m10723e() {
        if (this.f9931a == null) {
            throw new IllegalStateException("This holder is not currently bound.");
        }
    }

    /* renamed from: a */
    public void mo19328a(C5631s sVar, C5631s<?> sVar2, List<Object> list, int i) {
        if (this.f9932b == null && (sVar instanceof C5635t)) {
            C5629q createNewHolder = ((C5635t) sVar).createNewHolder();
            this.f9932b = createNewHolder;
            createNewHolder.bindView(this.itemView);
        }
        boolean z = sVar instanceof C5637v;
        if (z) {
            ((C5637v) sVar).handlePreBind(this, mo19329b(), i);
        }
        if (sVar2 != null) {
            sVar.bind(mo19329b(), sVar2);
        } else if (list.isEmpty()) {
            sVar.bind(mo19329b());
        } else {
            sVar.bind(mo19329b(), list);
        }
        if (z) {
            ((C5637v) sVar).handlePostBind(mo19329b(), i);
        }
        this.f9931a = sVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Object mo19329b() {
        C5629q qVar = this.f9932b;
        return qVar != null ? qVar : this.itemView;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo19330c() {
        ViewHolderState.ViewState viewState = this.f9933c;
        if (viewState != null) {
            viewState.mo19104a(this.itemView);
        }
    }

    /* renamed from: d */
    public void mo19331d() {
        m10723e();
        this.f9931a.unbind(mo19329b());
        this.f9931a = null;
    }

    public String toString() {
        return "EpoxyViewHolder{epoxyModel=" + this.f9931a + ", view=" + this.itemView + ", super=" + super.toString() + '}';
    }

    /* renamed from: a */
    public C5631s<?> mo19327a() {
        m10723e();
        return this.f9931a;
    }
}
