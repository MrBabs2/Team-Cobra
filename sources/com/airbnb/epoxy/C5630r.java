package com.airbnb.epoxy;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.airbnb.epoxy.r */
/* compiled from: EpoxyItemSpacingDecorator */
public class C5630r extends RecyclerView.C0643n {

    /* renamed from: a */
    private int f9919a;

    /* renamed from: b */
    private boolean f9920b;

    /* renamed from: c */
    private boolean f9921c;

    /* renamed from: d */
    private boolean f9922d;

    /* renamed from: e */
    private boolean f9923e;

    /* renamed from: f */
    private boolean f9924f;

    /* renamed from: g */
    private boolean f9925g;

    /* renamed from: h */
    private boolean f9926h;

    /* renamed from: i */
    private boolean f9927i;

    /* renamed from: j */
    private boolean f9928j;

    public C5630r() {
        this(0);
    }

    /* renamed from: b */
    private boolean m10708b() {
        if (this.f9924f) {
            if (this.f9921c && !this.f9927i) {
                return true;
            }
            if (!this.f9920b || this.f9925g) {
                return false;
            }
            return true;
        } else if (!this.f9921c || this.f9922d) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: c */
    private boolean m10709c() {
        if (this.f9924f) {
            if (this.f9921c && !this.f9928j) {
                return true;
            }
            if (!this.f9920b || this.f9926h) {
                return false;
            }
            return true;
        } else if (!this.f9921c || this.f9923e) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: d */
    private boolean m10710d() {
        if (this.f9924f) {
            if (this.f9921c && !this.f9925g) {
                return true;
            }
            if (!this.f9920b || this.f9927i) {
                return false;
            }
            return true;
        } else if (!this.f9920b || this.f9922d) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: a */
    public void mo19301a(int i) {
        this.f9919a = i;
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0662z zVar) {
        rect.setEmpty();
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition != -1) {
            RecyclerView.C0644o layoutManager = recyclerView.getLayoutManager();
            m10703a(recyclerView, childAdapterPosition, layoutManager);
            boolean b = m10708b();
            boolean c = m10709c();
            boolean d = m10710d();
            boolean a = m10704a();
            if (!m10707a(layoutManager, this.f9921c)) {
                boolean z = c;
                c = b;
                b = z;
            } else if (!this.f9921c) {
                boolean z2 = c;
                c = b;
                b = z2;
                boolean z3 = a;
                a = d;
                d = z3;
            }
            int i = this.f9919a / 2;
            rect.right = b ? i : 0;
            rect.left = c ? i : 0;
            rect.top = d ? i : 0;
            if (!a) {
                i = 0;
            }
            rect.bottom = i;
        }
    }

    public C5630r(int i) {
        mo19301a(i);
    }

    /* renamed from: a */
    private void m10703a(RecyclerView recyclerView, int i, RecyclerView.C0644o oVar) {
        int itemCount = recyclerView.getAdapter().getItemCount();
        boolean z = false;
        this.f9922d = i == 0;
        this.f9923e = i == itemCount + -1;
        this.f9921c = oVar.canScrollHorizontally();
        this.f9920b = oVar.canScrollVertically();
        boolean z2 = oVar instanceof GridLayoutManager;
        this.f9924f = z2;
        if (z2) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) oVar;
            GridLayoutManager.C0618c spanSizeLookup = gridLayoutManager.getSpanSizeLookup();
            int spanSize = spanSizeLookup.getSpanSize(i);
            int spanCount = gridLayoutManager.getSpanCount();
            int spanIndex = spanSizeLookup.getSpanIndex(i, spanCount);
            this.f9925g = spanIndex == 0;
            this.f9926h = spanIndex + spanSize == spanCount;
            boolean a = m10706a(i, spanSizeLookup, spanCount);
            this.f9927i = a;
            if (!a && m10705a(i, itemCount, spanSizeLookup, spanCount)) {
                z = true;
            }
            this.f9928j = z;
        }
    }

    /* renamed from: a */
    private static boolean m10707a(RecyclerView.C0644o oVar, boolean z) {
        boolean z2 = false;
        boolean z3 = (oVar instanceof LinearLayoutManager) && ((LinearLayoutManager) oVar).getReverseLayout();
        if (oVar.getLayoutDirection() == 1) {
            z2 = true;
        }
        return (!z || !z2) ? z3 : !z3;
    }

    /* renamed from: a */
    private boolean m10704a() {
        if (this.f9924f) {
            if (this.f9921c && !this.f9926h) {
                return true;
            }
            if (!this.f9920b || this.f9928j) {
                return false;
            }
            return true;
        } else if (!this.f9920b || this.f9923e) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: a */
    private static boolean m10706a(int i, GridLayoutManager.C0618c cVar, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 <= i; i4++) {
            i3 += cVar.getSpanSize(i4);
            if (i3 > i2) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m10705a(int i, int i2, GridLayoutManager.C0618c cVar, int i3) {
        int i4 = 0;
        for (int i5 = i2 - 1; i5 >= i; i5--) {
            i4 += cVar.getSpanSize(i5);
            if (i4 > i3) {
                return false;
            }
        }
        return true;
    }
}
