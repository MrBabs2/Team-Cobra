package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.b */
/* compiled from: AdapterListUpdateCallback */
public final class C0672b implements C0708l {

    /* renamed from: a */
    private final RecyclerView.C0633g f2571a;

    public C0672b(RecyclerView.C0633g gVar) {
        this.f2571a = gVar;
    }

    /* renamed from: a */
    public void mo4143a(int i, int i2) {
        this.f2571a.notifyItemMoved(i, i2);
    }

    /* renamed from: b */
    public void mo4145b(int i, int i2) {
        this.f2571a.notifyItemRangeInserted(i, i2);
    }

    /* renamed from: c */
    public void mo4146c(int i, int i2) {
        this.f2571a.notifyItemRangeRemoved(i, i2);
    }

    /* renamed from: a */
    public void mo4144a(int i, int i2, Object obj) {
        this.f2571a.notifyItemRangeChanged(i, i2, obj);
    }
}
