package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.n */
/* compiled from: OrientationHelper */
public abstract class C0711n {

    /* renamed from: a */
    protected final RecyclerView.C0644o f2702a;

    /* renamed from: b */
    private int f2703b;

    /* renamed from: c */
    final Rect f2704c;

    /* renamed from: androidx.recyclerview.widget.n$a */
    /* compiled from: OrientationHelper */
    static class C0712a extends C0711n {
        C0712a(RecyclerView.C0644o oVar) {
            super(oVar, (C0712a) null);
        }

        /* renamed from: a */
        public int mo4249a() {
            return this.f2702a.getWidth();
        }

        /* renamed from: b */
        public int mo4252b() {
            return this.f2702a.getWidth() - this.f2702a.getPaddingRight();
        }

        /* renamed from: c */
        public int mo4255c(View view) {
            RecyclerView.C0649p pVar = (RecyclerView.C0649p) view.getLayoutParams();
            return this.f2702a.getDecoratedMeasuredHeight(view) + pVar.topMargin + pVar.bottomMargin;
        }

        /* renamed from: d */
        public int mo4257d(View view) {
            return this.f2702a.getDecoratedLeft(view) - ((RecyclerView.C0649p) view.getLayoutParams()).leftMargin;
        }

        /* renamed from: e */
        public int mo4259e(View view) {
            this.f2702a.getTransformedBoundingBox(view, true, this.f2704c);
            return this.f2704c.right;
        }

        /* renamed from: f */
        public int mo4260f() {
            return this.f2702a.getPaddingLeft();
        }

        /* renamed from: g */
        public int mo4262g() {
            return (this.f2702a.getWidth() - this.f2702a.getPaddingLeft()) - this.f2702a.getPaddingRight();
        }

        /* renamed from: a */
        public void mo4251a(int i) {
            this.f2702a.offsetChildrenHorizontal(i);
        }

        /* renamed from: b */
        public int mo4253b(View view) {
            RecyclerView.C0649p pVar = (RecyclerView.C0649p) view.getLayoutParams();
            return this.f2702a.getDecoratedMeasuredWidth(view) + pVar.leftMargin + pVar.rightMargin;
        }

        /* renamed from: f */
        public int mo4261f(View view) {
            this.f2702a.getTransformedBoundingBox(view, true, this.f2704c);
            return this.f2704c.left;
        }

        /* renamed from: a */
        public int mo4250a(View view) {
            return this.f2702a.getDecoratedRight(view) + ((RecyclerView.C0649p) view.getLayoutParams()).rightMargin;
        }

        /* renamed from: c */
        public int mo4254c() {
            return this.f2702a.getPaddingRight();
        }

        /* renamed from: d */
        public int mo4256d() {
            return this.f2702a.getWidthMode();
        }

        /* renamed from: e */
        public int mo4258e() {
            return this.f2702a.getHeightMode();
        }
    }

    /* renamed from: androidx.recyclerview.widget.n$b */
    /* compiled from: OrientationHelper */
    static class C0713b extends C0711n {
        C0713b(RecyclerView.C0644o oVar) {
            super(oVar, (C0712a) null);
        }

        /* renamed from: a */
        public int mo4249a() {
            return this.f2702a.getHeight();
        }

        /* renamed from: b */
        public int mo4252b() {
            return this.f2702a.getHeight() - this.f2702a.getPaddingBottom();
        }

        /* renamed from: c */
        public int mo4255c(View view) {
            RecyclerView.C0649p pVar = (RecyclerView.C0649p) view.getLayoutParams();
            return this.f2702a.getDecoratedMeasuredWidth(view) + pVar.leftMargin + pVar.rightMargin;
        }

        /* renamed from: d */
        public int mo4257d(View view) {
            return this.f2702a.getDecoratedTop(view) - ((RecyclerView.C0649p) view.getLayoutParams()).topMargin;
        }

        /* renamed from: e */
        public int mo4259e(View view) {
            this.f2702a.getTransformedBoundingBox(view, true, this.f2704c);
            return this.f2704c.bottom;
        }

        /* renamed from: f */
        public int mo4260f() {
            return this.f2702a.getPaddingTop();
        }

        /* renamed from: g */
        public int mo4262g() {
            return (this.f2702a.getHeight() - this.f2702a.getPaddingTop()) - this.f2702a.getPaddingBottom();
        }

        /* renamed from: a */
        public void mo4251a(int i) {
            this.f2702a.offsetChildrenVertical(i);
        }

        /* renamed from: b */
        public int mo4253b(View view) {
            RecyclerView.C0649p pVar = (RecyclerView.C0649p) view.getLayoutParams();
            return this.f2702a.getDecoratedMeasuredHeight(view) + pVar.topMargin + pVar.bottomMargin;
        }

        /* renamed from: f */
        public int mo4261f(View view) {
            this.f2702a.getTransformedBoundingBox(view, true, this.f2704c);
            return this.f2704c.top;
        }

        /* renamed from: a */
        public int mo4250a(View view) {
            return this.f2702a.getDecoratedBottom(view) + ((RecyclerView.C0649p) view.getLayoutParams()).bottomMargin;
        }

        /* renamed from: c */
        public int mo4254c() {
            return this.f2702a.getPaddingBottom();
        }

        /* renamed from: d */
        public int mo4256d() {
            return this.f2702a.getHeightMode();
        }

        /* renamed from: e */
        public int mo4258e() {
            return this.f2702a.getWidthMode();
        }
    }

    /* synthetic */ C0711n(RecyclerView.C0644o oVar, C0712a aVar) {
        this(oVar);
    }

    /* renamed from: a */
    public static C0711n m3338a(RecyclerView.C0644o oVar, int i) {
        if (i == 0) {
            return m3337a(oVar);
        }
        if (i == 1) {
            return m3339b(oVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    /* renamed from: b */
    public static C0711n m3339b(RecyclerView.C0644o oVar) {
        return new C0713b(oVar);
    }

    /* renamed from: a */
    public abstract int mo4249a();

    /* renamed from: a */
    public abstract int mo4250a(View view);

    /* renamed from: a */
    public abstract void mo4251a(int i);

    /* renamed from: b */
    public abstract int mo4252b();

    /* renamed from: b */
    public abstract int mo4253b(View view);

    /* renamed from: c */
    public abstract int mo4254c();

    /* renamed from: c */
    public abstract int mo4255c(View view);

    /* renamed from: d */
    public abstract int mo4256d();

    /* renamed from: d */
    public abstract int mo4257d(View view);

    /* renamed from: e */
    public abstract int mo4258e();

    /* renamed from: e */
    public abstract int mo4259e(View view);

    /* renamed from: f */
    public abstract int mo4260f();

    /* renamed from: f */
    public abstract int mo4261f(View view);

    /* renamed from: g */
    public abstract int mo4262g();

    /* renamed from: h */
    public int mo4263h() {
        if (Integer.MIN_VALUE == this.f2703b) {
            return 0;
        }
        return mo4262g() - this.f2703b;
    }

    /* renamed from: i */
    public void mo4264i() {
        this.f2703b = mo4262g();
    }

    private C0711n(RecyclerView.C0644o oVar) {
        this.f2703b = Integer.MIN_VALUE;
        this.f2704c = new Rect();
        this.f2702a = oVar;
    }

    /* renamed from: a */
    public static C0711n m3337a(RecyclerView.C0644o oVar) {
        return new C0712a(oVar);
    }
}
