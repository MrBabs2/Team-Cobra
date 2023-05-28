package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.i */
/* compiled from: LayoutState */
class C0705i {

    /* renamed from: a */
    boolean f2692a = true;

    /* renamed from: b */
    int f2693b;

    /* renamed from: c */
    int f2694c;

    /* renamed from: d */
    int f2695d;

    /* renamed from: e */
    int f2696e;

    /* renamed from: f */
    int f2697f = 0;

    /* renamed from: g */
    int f2698g = 0;

    /* renamed from: h */
    boolean f2699h;

    /* renamed from: i */
    boolean f2700i;

    C0705i() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo4232a(RecyclerView.C0662z zVar) {
        int i = this.f2694c;
        return i >= 0 && i < zVar.mo4041a();
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f2693b + ", mCurrentPosition=" + this.f2694c + ", mItemDirection=" + this.f2695d + ", mLayoutDirection=" + this.f2696e + ", mStartLine=" + this.f2697f + ", mEndLine=" + this.f2698g + '}';
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public View mo4231a(RecyclerView.C0656v vVar) {
        View d = vVar.mo4005d(this.f2694c);
        this.f2694c += this.f2695d;
        return d;
    }
}
