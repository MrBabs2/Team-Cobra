package com.airbnb.epoxy;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.airbnb.epoxy.e0 */
/* compiled from: NotifyBlocker */
class C5589e0 extends RecyclerView.C0635i {

    /* renamed from: a */
    private boolean f9870a;

    C5589e0() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo19216a() {
        this.f9870a = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo19217b() {
        this.f9870a = false;
    }

    public void onChanged() {
        if (!this.f9870a) {
            throw new IllegalStateException("You cannot notify item changes directly. Call `requestModelBuild` instead.");
        }
    }

    public void onItemRangeChanged(int i, int i2) {
        onChanged();
    }

    public void onItemRangeInserted(int i, int i2) {
        onChanged();
    }

    public void onItemRangeMoved(int i, int i2, int i3) {
        onChanged();
    }

    public void onItemRangeRemoved(int i, int i2) {
        onChanged();
    }

    public void onItemRangeChanged(int i, int i2, Object obj) {
        onChanged();
    }
}
