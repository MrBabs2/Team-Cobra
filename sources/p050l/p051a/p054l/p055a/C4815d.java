package p050l.p051a.p054l.p055a;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import p050l.p051a.p054l.p055a.C4810b;

@SuppressLint({"RestrictedAPI"})
/* renamed from: l.a.l.a.d */
/* compiled from: StateListDrawable */
class C4815d extends C4810b {

    /* renamed from: r */
    private C4816a f8208r;

    /* renamed from: s */
    private boolean f8209s;

    /* renamed from: l.a.l.a.d$a */
    /* compiled from: StateListDrawable */
    static class C4816a extends C4810b.C4813c {

        /* renamed from: J */
        int[][] f8210J;

        C4816a(C4816a aVar, C4815d dVar, Resources resources) {
            super(aVar, dVar, resources);
            if (aVar != null) {
                this.f8210J = aVar.f8210J;
            } else {
                this.f8210J = new int[mo16723c()][];
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo16767a(int[] iArr, Drawable drawable) {
            int a = mo16712a(drawable);
            this.f8210J[a] = iArr;
            return a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo16664m() {
            int[][] iArr = this.f8210J;
            int[][] iArr2 = new int[iArr.length][];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[][] iArr3 = this.f8210J;
                iArr2[length] = iArr3[length] != null ? (int[]) iArr3[length].clone() : null;
            }
            this.f8210J = iArr2;
        }

        public Drawable newDrawable() {
            return new C4815d(this, (Resources) null);
        }

        public Drawable newDrawable(Resources resources) {
            return new C4815d(this, resources);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo16766a(int[] iArr) {
            int[][] iArr2 = this.f8210J;
            int d = mo16726d();
            for (int i = 0; i < d; i++) {
                if (StateSet.stateSetMatches(iArr2[i], iArr)) {
                    return i;
                }
            }
            return -1;
        }

        /* renamed from: a */
        public void mo16714a(int i, int i2) {
            super.mo16714a(i, i2);
            int[][] iArr = new int[i2][];
            System.arraycopy(this.f8210J, 0, iArr, 0, i);
            this.f8210J = iArr;
        }
    }

    C4815d(C4816a aVar, Resources resources) {
        mo16649a((C4810b.C4813c) new C4816a(aVar, this, resources));
        onStateChange(getState());
    }

    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    public boolean isStateful() {
        return true;
    }

    public Drawable mutate() {
        if (!this.f8209s) {
            super.mutate();
            if (this == this) {
                this.f8208r.mo16664m();
                this.f8209s = true;
            }
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int a = this.f8208r.mo16766a(iArr);
        if (a < 0) {
            a = this.f8208r.mo16766a(StateSet.WILD_CARD);
        }
        return mo16674a(a) || onStateChange;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int[] mo16765a(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i = 0;
        for (int i2 = 0; i2 < attributeCount; i2++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i2);
            if (!(attributeNameResource == 0 || attributeNameResource == 16842960 || attributeNameResource == 16843161)) {
                int i3 = i + 1;
                if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i] = attributeNameResource;
                i = i3;
            }
        }
        return StateSet.trimStateSet(iArr, i);
    }

    C4815d(C4816a aVar) {
        if (aVar != null) {
            mo16649a((C4810b.C4813c) aVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C4816a m8013a() {
        return new C4816a(this.f8208r, this, (Resources) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo16649a(C4810b.C4813c cVar) {
        super.mo16649a(cVar);
        if (cVar instanceof C4816a) {
            this.f8208r = (C4816a) cVar;
        }
    }
}
