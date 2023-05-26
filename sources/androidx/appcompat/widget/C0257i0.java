package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.i0 */
/* compiled from: RtlSpacingHelper */
class C0257i0 {

    /* renamed from: a */
    private int f1095a = 0;

    /* renamed from: b */
    private int f1096b = 0;

    /* renamed from: c */
    private int f1097c = Integer.MIN_VALUE;

    /* renamed from: d */
    private int f1098d = Integer.MIN_VALUE;

    /* renamed from: e */
    private int f1099e = 0;

    /* renamed from: f */
    private int f1100f = 0;

    /* renamed from: g */
    private boolean f1101g = false;

    /* renamed from: h */
    private boolean f1102h = false;

    C0257i0() {
    }

    /* renamed from: a */
    public int mo1625a() {
        return this.f1101g ? this.f1095a : this.f1096b;
    }

    /* renamed from: b */
    public int mo1628b() {
        return this.f1095a;
    }

    /* renamed from: c */
    public int mo1630c() {
        return this.f1096b;
    }

    /* renamed from: d */
    public int mo1631d() {
        return this.f1101g ? this.f1096b : this.f1095a;
    }

    /* renamed from: a */
    public void mo1626a(int i, int i2) {
        this.f1102h = false;
        if (i != Integer.MIN_VALUE) {
            this.f1099e = i;
            this.f1095a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f1100f = i2;
            this.f1096b = i2;
        }
    }

    /* renamed from: b */
    public void mo1629b(int i, int i2) {
        this.f1097c = i;
        this.f1098d = i2;
        this.f1102h = true;
        if (this.f1101g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f1095a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f1096b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f1095a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f1096b = i2;
        }
    }

    /* renamed from: a */
    public void mo1627a(boolean z) {
        if (z != this.f1101g) {
            this.f1101g = z;
            if (!this.f1102h) {
                this.f1095a = this.f1099e;
                this.f1096b = this.f1100f;
            } else if (z) {
                int i = this.f1098d;
                if (i == Integer.MIN_VALUE) {
                    i = this.f1099e;
                }
                this.f1095a = i;
                int i2 = this.f1097c;
                if (i2 == Integer.MIN_VALUE) {
                    i2 = this.f1100f;
                }
                this.f1096b = i2;
            } else {
                int i3 = this.f1097c;
                if (i3 == Integer.MIN_VALUE) {
                    i3 = this.f1099e;
                }
                this.f1095a = i3;
                int i4 = this.f1098d;
                if (i4 == Integer.MIN_VALUE) {
                    i4 = this.f1100f;
                }
                this.f1096b = i4;
            }
        }
    }
}
