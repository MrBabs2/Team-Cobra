package com.bumptech.glide.p162p.p163l;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.bumptech.glide.p162p.C6268d;
import com.bumptech.glide.p166r.C6315j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Deprecated
/* renamed from: com.bumptech.glide.p.l.j */
/* compiled from: ViewTarget */
public abstract class C6288j<T extends View, Z> extends C6279a<Z> {

    /* renamed from: k */
    private static Integer f11524k;

    /* renamed from: f */
    protected final T f11525f;

    /* renamed from: g */
    private final C6289a f11526g;

    /* renamed from: h */
    private View.OnAttachStateChangeListener f11527h;

    /* renamed from: i */
    private boolean f11528i;

    /* renamed from: j */
    private boolean f11529j;

    public C6288j(T t) {
        C6315j.m12978a(t);
        this.f11525f = (View) t;
        this.f11526g = new C6289a(t);
    }

    /* renamed from: a */
    private void mo20713a(Object obj) {
        Integer num = f11524k;
        if (num == null) {
            this.f11525f.setTag(obj);
        } else {
            this.f11525f.setTag(num.intValue(), obj);
        }
    }

    /* renamed from: b */
    private Object m12916b() {
        Integer num = f11524k;
        if (num == null) {
            return this.f11525f.getTag();
        }
        return this.f11525f.getTag(num.intValue());
    }

    /* renamed from: c */
    private void m12917c() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f11527h;
        if (onAttachStateChangeListener != null && !this.f11529j) {
            this.f11525f.addOnAttachStateChangeListener(onAttachStateChangeListener);
            this.f11529j = true;
        }
    }

    /* renamed from: d */
    private void m12918d() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f11527h;
        if (onAttachStateChangeListener != null && this.f11529j) {
            this.f11525f.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            this.f11529j = false;
        }
    }

    public C6268d getRequest() {
        Object b = m12916b();
        if (b == null) {
            return null;
        }
        if (b instanceof C6268d) {
            return (C6268d) b;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    public void getSize(C6286h hVar) {
        this.f11526g.mo20721a(hVar);
    }

    public void onLoadCleared(Drawable drawable) {
        super.onLoadCleared(drawable);
        this.f11526g.mo20722b();
        if (!this.f11528i) {
            m12918d();
        }
    }

    public void onLoadStarted(Drawable drawable) {
        super.onLoadStarted(drawable);
        m12917c();
    }

    public void removeCallback(C6286h hVar) {
        this.f11526g.mo20723b(hVar);
    }

    public void setRequest(C6268d dVar) {
        mo20713a(dVar);
    }

    public String toString() {
        return "Target for: " + this.f11525f;
    }

    /* renamed from: com.bumptech.glide.p.l.j$a */
    /* compiled from: ViewTarget */
    static final class C6289a {

        /* renamed from: e */
        static Integer f11530e;

        /* renamed from: a */
        private final View f11531a;

        /* renamed from: b */
        private final List<C6286h> f11532b = new ArrayList();

        /* renamed from: c */
        boolean f11533c;

        /* renamed from: d */
        private C6290a f11534d;

        /* renamed from: com.bumptech.glide.p.l.j$a$a */
        /* compiled from: ViewTarget */
        private static final class C6290a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: f */
            private final WeakReference<C6289a> f11535f;

            C6290a(C6289a aVar) {
                this.f11535f = new WeakReference<>(aVar);
            }

            public boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                C6289a aVar = (C6289a) this.f11535f.get();
                if (aVar == null) {
                    return true;
                }
                aVar.mo20720a();
                return true;
            }
        }

        C6289a(View view) {
            this.f11531a = view;
        }

        /* renamed from: a */
        private static int m12920a(Context context) {
            if (f11530e == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                C6315j.m12978a(windowManager);
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f11530e = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f11530e.intValue();
        }

        /* renamed from: a */
        private boolean m12921a(int i) {
            return i > 0 || i == Integer.MIN_VALUE;
        }

        /* renamed from: b */
        private void m12923b(int i, int i2) {
            Iterator it = new ArrayList(this.f11532b).iterator();
            while (it.hasNext()) {
                ((C6286h) it.next()).mo20710a(i, i2);
            }
        }

        /* renamed from: c */
        private int m12924c() {
            int paddingTop = this.f11531a.getPaddingTop() + this.f11531a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f11531a.getLayoutParams();
            return m12919a(this.f11531a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        /* renamed from: d */
        private int m12925d() {
            int paddingLeft = this.f11531a.getPaddingLeft() + this.f11531a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f11531a.getLayoutParams();
            return m12919a(this.f11531a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo20723b(C6286h hVar) {
            this.f11532b.remove(hVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo20722b() {
            ViewTreeObserver viewTreeObserver = this.f11531a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f11534d);
            }
            this.f11534d = null;
            this.f11532b.clear();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo20720a() {
            if (!this.f11532b.isEmpty()) {
                int d = m12925d();
                int c = m12924c();
                if (m12922a(d, c)) {
                    m12923b(d, c);
                    mo20722b();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo20721a(C6286h hVar) {
            int d = m12925d();
            int c = m12924c();
            if (m12922a(d, c)) {
                hVar.mo20710a(d, c);
                return;
            }
            if (!this.f11532b.contains(hVar)) {
                this.f11532b.add(hVar);
            }
            if (this.f11534d == null) {
                ViewTreeObserver viewTreeObserver = this.f11531a.getViewTreeObserver();
                C6290a aVar = new C6290a(this);
                this.f11534d = aVar;
                viewTreeObserver.addOnPreDrawListener(aVar);
            }
        }

        /* renamed from: a */
        private boolean m12922a(int i, int i2) {
            return m12921a(i) && m12921a(i2);
        }

        /* renamed from: a */
        private int m12919a(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            if (this.f11533c && this.f11531a.isLayoutRequested()) {
                return 0;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            if (this.f11531a.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use .override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return m12920a(this.f11531a.getContext());
        }
    }
}
