package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import p050l.p067f.p071b.p072k.C4901a;
import p050l.p067f.p071b.p072k.C4907e;

public class Barrier extends C0323b {

    /* renamed from: n */
    private int f1328n;

    /* renamed from: o */
    private int f1329o;

    /* renamed from: p */
    private C4901a f1330p;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    /* renamed from: a */
    private void m1567a(C4907e eVar, int i, boolean z) {
        this.f1329o = i;
        if (Build.VERSION.SDK_INT < 17) {
            int i2 = this.f1328n;
            if (i2 == 5) {
                this.f1329o = 0;
            } else if (i2 == 6) {
                this.f1329o = 1;
            }
        } else if (z) {
            int i3 = this.f1328n;
            if (i3 == 5) {
                this.f1329o = 1;
            } else if (i3 == 6) {
                this.f1329o = 0;
            }
        } else {
            int i4 = this.f1328n;
            if (i4 == 5) {
                this.f1329o = 0;
            } else if (i4 == 6) {
                this.f1329o = 1;
            }
        }
        if (eVar instanceof C4901a) {
            ((C4901a) eVar).mo17155x(this.f1329o);
        }
    }

    /* renamed from: c */
    public boolean mo1969c() {
        return this.f1330p.mo17146S();
    }

    public int getMargin() {
        return this.f1330p.mo17148U();
    }

    public int getType() {
        return this.f1328n;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f1330p.mo17153e(z);
    }

    public void setDpMargin(int i) {
        C4901a aVar = this.f1330p;
        aVar.mo17156y((int) ((((float) i) * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i) {
        this.f1330p.mo17156y(i);
    }

    public void setType(int i) {
        this.f1328n = i;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }

    /* renamed from: a */
    public void mo1968a(C4907e eVar, boolean z) {
        m1567a(eVar, this.f1328n, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo1967a(AttributeSet attributeSet) {
        super.mo1967a(attributeSet);
        this.f1330p = new C4901a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0338i.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0338i.ConstraintLayout_Layout_barrierDirection) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C0338i.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.f1330p.mo17153e(obtainStyledAttributes.getBoolean(index, true));
                } else if (index == C0338i.ConstraintLayout_Layout_barrierMargin) {
                    this.f1330p.mo17156y(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f1445i = this.f1330p;
        mo2031b();
    }
}
