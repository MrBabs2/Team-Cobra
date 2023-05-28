package p050l.p075h.p084l;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: l.h.l.q */
/* compiled from: NestedScrollingParentHelper */
public class C5066q {

    /* renamed from: a */
    private int f8927a;

    /* renamed from: b */
    private int f8928b;

    public C5066q(ViewGroup viewGroup) {
    }

    /* renamed from: a */
    public void mo17611a(View view, View view2, int i) {
        mo17612a(view, view2, i, 0);
    }

    /* renamed from: a */
    public void mo17612a(View view, View view2, int i, int i2) {
        if (i2 == 1) {
            this.f8928b = i;
        } else {
            this.f8927a = i;
        }
    }

    /* renamed from: a */
    public int mo17608a() {
        return this.f8927a | this.f8928b;
    }

    /* renamed from: a */
    public void mo17609a(View view) {
        mo17610a(view, 0);
    }

    /* renamed from: a */
    public void mo17610a(View view, int i) {
        if (i == 1) {
            this.f8928b = 0;
        } else {
            this.f8927a = 0;
        }
    }
}
