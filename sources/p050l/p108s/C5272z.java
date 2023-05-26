package p050l.p108s;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import p050l.p075h.p084l.C5071v;

/* renamed from: l.s.z */
/* compiled from: ViewOverlayApi14 */
class C5272z implements C5204b0 {

    /* renamed from: a */
    protected C5273a f9381a;

    C5272z(Context context, ViewGroup viewGroup, View view) {
        this.f9381a = new C5273a(context, viewGroup, view, this);
    }

    /* renamed from: c */
    static C5272z m9924c(View view) {
        ViewGroup d = m9925d(view);
        if (d == null) {
            return null;
        }
        int childCount = d.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = d.getChildAt(i);
            if (childAt instanceof C5273a) {
                return ((C5273a) childAt).f9385i;
            }
        }
        return new C5266u(d.getContext(), d, view);
    }

    /* renamed from: d */
    static ViewGroup m9925d(View view) {
        while (view != null) {
            if (view.getId() == 16908290 && (view instanceof ViewGroup)) {
                return (ViewGroup) view;
            }
            if (view.getParent() instanceof ViewGroup) {
                view = (ViewGroup) view.getParent();
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo17992a(Drawable drawable) {
        this.f9381a.mo18129a(drawable);
    }

    /* renamed from: b */
    public void mo17993b(Drawable drawable) {
        this.f9381a.mo18131b(drawable);
    }

    /* renamed from: l.s.z$a */
    /* compiled from: ViewOverlayApi14 */
    static class C5273a extends ViewGroup {

        /* renamed from: f */
        ViewGroup f9382f;

        /* renamed from: g */
        View f9383g;

        /* renamed from: h */
        ArrayList<Drawable> f9384h = null;

        /* renamed from: i */
        C5272z f9385i;

        /* renamed from: j */
        private boolean f9386j;

        static {
            Class<ViewGroup> cls = ViewGroup.class;
            try {
                cls.getDeclaredMethod("invalidateChildInParentFast", new Class[]{Integer.TYPE, Integer.TYPE, Rect.class});
            } catch (NoSuchMethodException unused) {
            }
        }

        C5273a(Context context, ViewGroup viewGroup, View view, C5272z zVar) {
            super(context);
            this.f9382f = viewGroup;
            this.f9383g = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f9385i = zVar;
        }

        /* renamed from: a */
        public void mo18129a(Drawable drawable) {
            m9928a();
            if (this.f9384h == null) {
                this.f9384h = new ArrayList<>();
            }
            if (!this.f9384h.contains(drawable)) {
                this.f9384h.add(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(this);
            }
        }

        /* renamed from: b */
        public void mo18131b(Drawable drawable) {
            ArrayList<Drawable> arrayList = this.f9384h;
            if (arrayList != null) {
                arrayList.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback((Drawable.Callback) null);
                m9930b();
            }
        }

        /* access modifiers changed from: protected */
        public void dispatchDraw(Canvas canvas) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            this.f9382f.getLocationOnScreen(iArr);
            this.f9383g.getLocationOnScreen(iArr2);
            canvas.translate((float) (iArr2[0] - iArr[0]), (float) (iArr2[1] - iArr[1]));
            canvas.clipRect(new Rect(0, 0, this.f9383g.getWidth(), this.f9383g.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f9384h;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f9384h.get(i).draw(canvas);
            }
        }

        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f9382f == null) {
                return null;
            }
            rect.offset(iArr[0], iArr[1]);
            if (this.f9382f instanceof ViewGroup) {
                iArr[0] = 0;
                iArr[1] = 0;
                int[] iArr2 = new int[2];
                m9929a(iArr2);
                rect.offset(iArr2[0], iArr2[1]);
                return super.invalidateChildInParent(iArr, rect);
            }
            invalidate(rect);
            return null;
        }

        public void invalidateDrawable(Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
            r0 = r1.f9384h;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean verifyDrawable(android.graphics.drawable.Drawable r2) {
            /*
                r1 = this;
                boolean r0 = super.verifyDrawable(r2)
                if (r0 != 0) goto L_0x0013
                java.util.ArrayList<android.graphics.drawable.Drawable> r0 = r1.f9384h
                if (r0 == 0) goto L_0x0011
                boolean r2 = r0.contains(r2)
                if (r2 == 0) goto L_0x0011
                goto L_0x0013
            L_0x0011:
                r2 = 0
                goto L_0x0014
            L_0x0013:
                r2 = 1
            L_0x0014:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p050l.p108s.C5272z.C5273a.verifyDrawable(android.graphics.drawable.Drawable):boolean");
        }

        /* renamed from: b */
        public void mo18132b(View view) {
            super.removeView(view);
            m9930b();
        }

        /* renamed from: b */
        private void m9930b() {
            if (getChildCount() == 0) {
                ArrayList<Drawable> arrayList = this.f9384h;
                if (arrayList == null || arrayList.size() == 0) {
                    this.f9386j = true;
                    this.f9382f.removeView(this);
                }
            }
        }

        /* renamed from: a */
        public void mo18130a(View view) {
            m9928a();
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (!(viewGroup == this.f9382f || viewGroup.getParent() == null || !C5071v.m9139D(viewGroup))) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.f9382f.getLocationOnScreen(iArr2);
                    C5071v.m9187d(view, iArr[0] - iArr2[0]);
                    C5071v.m9189e(view, iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view);
        }

        /* renamed from: a */
        private void m9928a() {
            if (this.f9386j) {
                throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
            }
        }

        /* renamed from: a */
        private void m9929a(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.f9382f.getLocationOnScreen(iArr2);
            this.f9383g.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }
    }
}
