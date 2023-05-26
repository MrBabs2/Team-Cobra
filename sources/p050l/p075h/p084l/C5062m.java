package p050l.p075h.p084l;

import android.view.View;
import android.view.ViewParent;

/* renamed from: l.h.l.m */
/* compiled from: NestedScrollingChildHelper */
public class C5062m {

    /* renamed from: a */
    private ViewParent f8922a;

    /* renamed from: b */
    private ViewParent f8923b;

    /* renamed from: c */
    private final View f8924c;

    /* renamed from: d */
    private boolean f8925d;

    /* renamed from: e */
    private int[] f8926e;

    public C5062m(View view) {
        this.f8924c = view;
    }

    /* renamed from: d */
    private ViewParent m9103d(int i) {
        if (i == 0) {
            return this.f8922a;
        }
        if (i != 1) {
            return null;
        }
        return this.f8923b;
    }

    /* renamed from: a */
    public void mo17594a(boolean z) {
        if (this.f8925d) {
            C5071v.m9146K(this.f8924c);
        }
        this.f8925d = z;
    }

    /* renamed from: b */
    public boolean mo17604b() {
        return this.f8925d;
    }

    /* renamed from: c */
    public void mo17606c() {
        mo17607c(0);
    }

    /* renamed from: b */
    public boolean mo17605b(int i) {
        return mo17599a(i, 0);
    }

    /* renamed from: c */
    public void mo17607c(int i) {
        ViewParent d = m9103d(i);
        if (d != null) {
            C5085y.m9260a(d, this.f8924c, i);
            m9101a(i, (ViewParent) null);
        }
    }

    /* renamed from: b */
    private boolean m9102b(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent d;
        int i6;
        int i7;
        int[] iArr3;
        int[] iArr4 = iArr;
        if (!mo17604b() || (d = m9103d(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr4 != null) {
                iArr4[0] = 0;
                iArr4[1] = 0;
            }
            return false;
        }
        if (iArr4 != null) {
            this.f8924c.getLocationInWindow(iArr4);
            i7 = iArr4[0];
            i6 = iArr4[1];
        } else {
            i7 = 0;
            i6 = 0;
        }
        if (iArr2 == null) {
            int[] d2 = m9104d();
            d2[0] = 0;
            d2[1] = 0;
            iArr3 = d2;
        } else {
            iArr3 = iArr2;
        }
        C5085y.m9261a(d, this.f8924c, i, i2, i3, i4, i5, iArr3);
        if (iArr4 != null) {
            this.f8924c.getLocationInWindow(iArr4);
            iArr4[0] = iArr4[0] - i7;
            iArr4[1] = iArr4[1] - i6;
        }
        return true;
    }

    /* renamed from: d */
    private int[] m9104d() {
        if (this.f8926e == null) {
            this.f8926e = new int[2];
        }
        return this.f8926e;
    }

    /* renamed from: a */
    public boolean mo17595a() {
        return mo17598a(0);
    }

    /* renamed from: a */
    public boolean mo17598a(int i) {
        return m9103d(i) != null;
    }

    /* renamed from: a */
    public boolean mo17599a(int i, int i2) {
        if (mo17598a(i2)) {
            return true;
        }
        if (!mo17604b()) {
            return false;
        }
        View view = this.f8924c;
        for (ViewParent parent = this.f8924c.getParent(); parent != null; parent = parent.getParent()) {
            if (C5085y.m9267b(parent, view, this.f8924c, i, i2)) {
                m9101a(i2, parent);
                C5085y.m9263a(parent, view, this.f8924c, i, i2);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo17600a(int i, int i2, int i3, int i4, int[] iArr) {
        return m9102b(i, i2, i3, i4, iArr, 0, (int[]) null);
    }

    /* renamed from: a */
    public boolean mo17601a(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return m9102b(i, i2, i3, i4, iArr, i5, (int[]) null);
    }

    /* renamed from: a */
    public void mo17593a(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        m9102b(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* renamed from: a */
    public boolean mo17602a(int i, int i2, int[] iArr, int[] iArr2) {
        return mo17603a(i, i2, iArr, iArr2, 0);
    }

    /* renamed from: a */
    public boolean mo17603a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent d;
        int i4;
        int i5;
        if (!mo17604b() || (d = m9103d(i3)) == null) {
            return false;
        }
        if (i != 0 || i2 != 0) {
            if (iArr2 != null) {
                this.f8924c.getLocationInWindow(iArr2);
                i5 = iArr2[0];
                i4 = iArr2[1];
            } else {
                i5 = 0;
                i4 = 0;
            }
            if (iArr == null) {
                iArr = m9104d();
            }
            iArr[0] = 0;
            iArr[1] = 0;
            C5085y.m9262a(d, this.f8924c, i, i2, iArr, i3);
            if (iArr2 != null) {
                this.f8924c.getLocationInWindow(iArr2);
                iArr2[0] = iArr2[0] - i5;
                iArr2[1] = iArr2[1] - i4;
            }
            if (iArr[0] == 0 && iArr[1] == 0) {
                return false;
            }
            return true;
        } else if (iArr2 == null) {
            return false;
        } else {
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
    }

    /* renamed from: a */
    public boolean mo17597a(float f, float f2, boolean z) {
        ViewParent d;
        if (!mo17604b() || (d = m9103d(0)) == null) {
            return false;
        }
        return C5085y.m9265a(d, this.f8924c, f, f2, z);
    }

    /* renamed from: a */
    public boolean mo17596a(float f, float f2) {
        ViewParent d;
        if (!mo17604b() || (d = m9103d(0)) == null) {
            return false;
        }
        return C5085y.m9264a(d, this.f8924c, f, f2);
    }

    /* renamed from: a */
    private void m9101a(int i, ViewParent viewParent) {
        if (i == 0) {
            this.f8922a = viewParent;
        } else if (i == 1) {
            this.f8923b = viewParent;
        }
    }
}
