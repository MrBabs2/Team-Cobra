package com.google.android.material.badge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.internal.C8561h;
import com.google.android.material.internal.C8566j;
import java.lang.ref.WeakReference;
import p050l.p075h.p084l.C5071v;
import p112n.p277e.p279b.p282b.C10576d;
import p112n.p277e.p279b.p282b.C10581i;
import p112n.p277e.p279b.p282b.C10582j;
import p112n.p277e.p279b.p282b.C10583k;
import p112n.p277e.p279b.p282b.p294w.C10621d;
import p112n.p277e.p279b.p282b.p297z.C10638g;

public class BadgeDrawable extends Drawable implements C8561h.C8563b {

    /* renamed from: f */
    private final WeakReference<Context> f23820f;

    /* renamed from: g */
    private final C10638g f23821g = new C10638g();

    /* renamed from: h */
    private final C8561h f23822h;

    /* renamed from: i */
    private final Rect f23823i = new Rect();

    /* renamed from: j */
    private final float f23824j;

    /* renamed from: k */
    private final float f23825k;

    /* renamed from: l */
    private final float f23826l;

    /* renamed from: m */
    private final SavedState f23827m;

    /* renamed from: n */
    private float f23828n;

    /* renamed from: o */
    private float f23829o;

    /* renamed from: p */
    private int f23830p;

    /* renamed from: q */
    private float f23831q;

    /* renamed from: r */
    private float f23832r;

    /* renamed from: s */
    private float f23833s;

    /* renamed from: t */
    private WeakReference<View> f23834t;

    /* renamed from: u */
    private WeakReference<ViewGroup> f23835u;

    private BadgeDrawable(Context context) {
        this.f23820f = new WeakReference<>(context);
        C8566j.m27995b(context);
        Resources resources = context.getResources();
        this.f23824j = (float) resources.getDimensionPixelSize(C10576d.mtrl_badge_radius);
        this.f23826l = (float) resources.getDimensionPixelSize(C10576d.mtrl_badge_long_text_horizontal_padding);
        this.f23825k = (float) resources.getDimensionPixelSize(C10576d.mtrl_badge_with_text_radius);
        C8561h hVar = new C8561h(this);
        this.f23822h = hVar;
        hVar.mo31948b().setTextAlign(Paint.Align.CENTER);
        this.f23827m = new SavedState(context);
        m27077h(C10583k.TextAppearance_MaterialComponents_Badge);
    }

    /* renamed from: a */
    static BadgeDrawable m27070a(Context context, SavedState savedState) {
        BadgeDrawable badgeDrawable = new BadgeDrawable(context);
        badgeDrawable.m27073a(savedState);
        return badgeDrawable;
    }

    /* renamed from: h */
    private void m27077h(int i) {
        Context context = (Context) this.f23820f.get();
        if (context != null) {
            m27074a(new C10621d(context, i));
        }
    }

    /* renamed from: i */
    private void m27078i() {
        double c = (double) mo30888c();
        Double.isNaN(c);
        this.f23830p = ((int) Math.pow(10.0d, c - 1.0d)) - 1;
    }

    /* renamed from: b */
    public void mo30887b(int i) {
        if (this.f23827m.f23844n != i) {
            int unused = this.f23827m.f23844n = i;
            WeakReference<View> weakReference = this.f23834t;
            if (weakReference != null && weakReference.get() != null) {
                View view = (View) this.f23834t.get();
                WeakReference<ViewGroup> weakReference2 = this.f23835u;
                mo30885a(view, weakReference2 != null ? (ViewGroup) weakReference2.get() : null);
            }
        }
    }

    /* renamed from: c */
    public void mo30889c(int i) {
        int unused = this.f23827m.f23837g = i;
        if (this.f23822h.mo31948b().getColor() != i) {
            this.f23822h.mo31948b().setColor(i);
            invalidateSelf();
        }
    }

    /* renamed from: d */
    public int mo30890d() {
        if (!mo30896f()) {
            return 0;
        }
        return this.f23827m.f23839i;
    }

    public void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && getAlpha() != 0 && isVisible()) {
            this.f23821g.draw(canvas);
            if (mo30896f()) {
                m27072a(canvas);
            }
        }
    }

    /* renamed from: e */
    public SavedState mo30893e() {
        return this.f23827m;
    }

    /* renamed from: f */
    public boolean mo30896f() {
        return this.f23827m.f23839i != -1;
    }

    /* renamed from: g */
    public void mo30897g(int i) {
        int unused = this.f23827m.f23846p = i;
        m27076h();
    }

    public int getAlpha() {
        return this.f23827m.f23838h;
    }

    public int getIntrinsicHeight() {
        return this.f23823i.height();
    }

    public int getIntrinsicWidth() {
        return this.f23823i.width();
    }

    public int getOpacity() {
        return -3;
    }

    public boolean isStateful() {
        return false;
    }

    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    public void setAlpha(int i) {
        int unused = this.f23827m.f23838h = i;
        this.f23822h.mo31948b().setAlpha(i);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    /* renamed from: e */
    public void mo30894e(int i) {
        if (this.f23827m.f23840j != i) {
            int unused = this.f23827m.f23840j = i;
            m27078i();
            this.f23822h.mo31947a(true);
            m27076h();
            invalidateSelf();
        }
    }

    /* renamed from: f */
    public void mo30895f(int i) {
        int max = Math.max(0, i);
        if (this.f23827m.f23839i != max) {
            int unused = this.f23827m.f23839i = max;
            this.f23822h.mo31947a(true);
            m27076h();
            invalidateSelf();
        }
    }

    /* renamed from: a */
    private void m27073a(SavedState savedState) {
        mo30894e(savedState.f23840j);
        if (savedState.f23839i != -1) {
            mo30895f(savedState.f23839i);
        }
        mo30884a(savedState.f23836f);
        mo30889c(savedState.f23837g);
        mo30887b(savedState.f23844n);
        mo30891d(savedState.f23845o);
        mo30897g(savedState.f23846p);
    }

    /* renamed from: g */
    private String m27075g() {
        if (mo30890d() <= this.f23830p) {
            return Integer.toString(mo30890d());
        }
        Context context = (Context) this.f23820f.get();
        if (context == null) {
            return "";
        }
        return context.getString(C10582j.mtrl_exceed_max_badge_number_suffix, new Object[]{Integer.valueOf(this.f23830p), "+"});
    }

    /* renamed from: h */
    private void m27076h() {
        Context context = (Context) this.f23820f.get();
        WeakReference<View> weakReference = this.f23834t;
        ViewGroup viewGroup = null;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (context != null && view != null) {
            Rect rect = new Rect();
            rect.set(this.f23823i);
            Rect rect2 = new Rect();
            view.getDrawingRect(rect2);
            WeakReference<ViewGroup> weakReference2 = this.f23835u;
            if (weakReference2 != null) {
                viewGroup = (ViewGroup) weakReference2.get();
            }
            if (viewGroup != null || C8428a.f23847a) {
                if (viewGroup == null) {
                    viewGroup = (ViewGroup) view.getParent();
                }
                viewGroup.offsetDescendantRectToMyCoords(view, rect2);
            }
            m27071a(context, rect2, view);
            C8428a.m27114a(this.f23823i, this.f23828n, this.f23829o, this.f23832r, this.f23833s);
            this.f23821g.mo36234a(this.f23831q);
            if (!rect.equals(this.f23823i)) {
                this.f23821g.setBounds(this.f23823i);
            }
        }
    }

    /* renamed from: d */
    public void mo30891d(int i) {
        int unused = this.f23827m.f23845o = i;
        m27076h();
    }

    /* renamed from: c */
    public int mo30888c() {
        return this.f23827m.f23840j;
    }

    /* renamed from: b */
    public CharSequence mo30886b() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        if (!mo30896f()) {
            return this.f23827m.f23841k;
        }
        if (this.f23827m.f23842l <= 0 || (context = (Context) this.f23820f.get()) == null) {
            return null;
        }
        if (mo30890d() <= this.f23830p) {
            return context.getResources().getQuantityString(this.f23827m.f23842l, mo30890d(), new Object[]{Integer.valueOf(mo30890d())});
        }
        return context.getString(this.f23827m.f23843m, new Object[]{Integer.valueOf(this.f23830p)});
    }

    public static final class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C8427a();
        /* access modifiers changed from: private */

        /* renamed from: f */
        public int f23836f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public int f23837g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public int f23838h = 255;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public int f23839i = -1;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public int f23840j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public CharSequence f23841k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public int f23842l;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public int f23843m;
        /* access modifiers changed from: private */

        /* renamed from: n */
        public int f23844n;
        /* access modifiers changed from: private */

        /* renamed from: o */
        public int f23845o;
        /* access modifiers changed from: private */

        /* renamed from: p */
        public int f23846p;

        /* renamed from: com.google.android.material.badge.BadgeDrawable$SavedState$a */
        static class C8427a implements Parcelable.Creator<SavedState> {
            C8427a() {
            }

            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Context context) {
            this.f23837g = new C10621d(context, C10583k.TextAppearance_MaterialComponents_Badge).f28509b.getDefaultColor();
            this.f23841k = context.getString(C10582j.mtrl_badge_numberless_content_description);
            this.f23842l = C10581i.mtrl_badge_content_description;
            this.f23843m = C10582j.mtrl_exceed_max_badge_number_content_description;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f23836f);
            parcel.writeInt(this.f23837g);
            parcel.writeInt(this.f23838h);
            parcel.writeInt(this.f23839i);
            parcel.writeInt(this.f23840j);
            parcel.writeString(this.f23841k.toString());
            parcel.writeInt(this.f23842l);
            parcel.writeInt(this.f23844n);
            parcel.writeInt(this.f23845o);
            parcel.writeInt(this.f23846p);
        }

        protected SavedState(Parcel parcel) {
            this.f23836f = parcel.readInt();
            this.f23837g = parcel.readInt();
            this.f23838h = parcel.readInt();
            this.f23839i = parcel.readInt();
            this.f23840j = parcel.readInt();
            this.f23841k = parcel.readString();
            this.f23842l = parcel.readInt();
            this.f23844n = parcel.readInt();
            this.f23845o = parcel.readInt();
            this.f23846p = parcel.readInt();
        }
    }

    /* renamed from: a */
    public void mo30885a(View view, ViewGroup viewGroup) {
        this.f23834t = new WeakReference<>(view);
        this.f23835u = new WeakReference<>(viewGroup);
        m27076h();
        invalidateSelf();
    }

    /* renamed from: a */
    public void mo30884a(int i) {
        int unused = this.f23827m.f23836f = i;
        ColorStateList valueOf = ColorStateList.valueOf(i);
        if (this.f23821g.mo36254f() != valueOf) {
            this.f23821g.mo36240a(valueOf);
            invalidateSelf();
        }
    }

    /* renamed from: a */
    public void mo30883a() {
        invalidateSelf();
    }

    /* renamed from: a */
    private void m27074a(C10621d dVar) {
        Context context;
        if (this.f23822h.mo31943a() != dVar && (context = (Context) this.f23820f.get()) != null) {
            this.f23822h.mo31946a(dVar, context);
            m27076h();
        }
    }

    /* renamed from: a */
    private void m27071a(Context context, Rect rect, View view) {
        float f;
        float f2;
        int f3 = this.f23827m.f23844n;
        if (f3 == 8388691 || f3 == 8388693) {
            this.f23829o = (float) (rect.bottom - this.f23827m.f23846p);
        } else {
            this.f23829o = (float) (rect.top + this.f23827m.f23846p);
        }
        if (mo30890d() <= 9) {
            float f4 = !mo30896f() ? this.f23824j : this.f23825k;
            this.f23831q = f4;
            this.f23833s = f4;
            this.f23832r = f4;
        } else {
            float f5 = this.f23825k;
            this.f23831q = f5;
            this.f23833s = f5;
            this.f23832r = (this.f23822h.mo31942a(m27075g()) / 2.0f) + this.f23826l;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(mo30896f() ? C10576d.mtrl_badge_text_horizontal_edge_offset : C10576d.mtrl_badge_horizontal_edge_offset);
        int f6 = this.f23827m.f23844n;
        if (f6 == 8388659 || f6 == 8388691) {
            if (C5071v.m9204p(view) == 0) {
                f = (((float) rect.left) - this.f23832r) + ((float) dimensionPixelSize) + ((float) this.f23827m.f23845o);
            } else {
                f = ((((float) rect.right) + this.f23832r) - ((float) dimensionPixelSize)) - ((float) this.f23827m.f23845o);
            }
            this.f23828n = f;
            return;
        }
        if (C5071v.m9204p(view) == 0) {
            f2 = ((((float) rect.right) + this.f23832r) - ((float) dimensionPixelSize)) - ((float) this.f23827m.f23845o);
        } else {
            f2 = (((float) rect.left) - this.f23832r) + ((float) dimensionPixelSize) + ((float) this.f23827m.f23845o);
        }
        this.f23828n = f2;
    }

    /* renamed from: a */
    private void m27072a(Canvas canvas) {
        Rect rect = new Rect();
        String g = m27075g();
        this.f23822h.mo31948b().getTextBounds(g, 0, g.length(), rect);
        canvas.drawText(g, this.f23828n, this.f23829o + ((float) (rect.height() / 2)), this.f23822h.mo31948b());
    }
}
