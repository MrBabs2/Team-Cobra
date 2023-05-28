package androidx.recyclerview.widget;

/* renamed from: androidx.recyclerview.widget.c */
/* compiled from: BatchingListUpdateCallback */
public class C0673c implements C0708l {

    /* renamed from: a */
    final C0708l f2572a;

    /* renamed from: b */
    int f2573b = 0;

    /* renamed from: c */
    int f2574c = -1;

    /* renamed from: d */
    int f2575d = -1;

    /* renamed from: e */
    Object f2576e = null;

    public C0673c(C0708l lVar) {
        this.f2572a = lVar;
    }

    /* renamed from: a */
    public void mo4147a() {
        int i = this.f2573b;
        if (i != 0) {
            if (i == 1) {
                this.f2572a.mo4145b(this.f2574c, this.f2575d);
            } else if (i == 2) {
                this.f2572a.mo4146c(this.f2574c, this.f2575d);
            } else if (i == 3) {
                this.f2572a.mo4144a(this.f2574c, this.f2575d, this.f2576e);
            }
            this.f2576e = null;
            this.f2573b = 0;
        }
    }

    /* renamed from: b */
    public void mo4145b(int i, int i2) {
        int i3;
        if (this.f2573b == 1 && i >= (i3 = this.f2574c)) {
            int i4 = this.f2575d;
            if (i <= i3 + i4) {
                this.f2575d = i4 + i2;
                this.f2574c = Math.min(i, i3);
                return;
            }
        }
        mo4147a();
        this.f2574c = i;
        this.f2575d = i2;
        this.f2573b = 1;
    }

    /* renamed from: c */
    public void mo4146c(int i, int i2) {
        int i3;
        if (this.f2573b != 2 || (i3 = this.f2574c) < i || i3 > i + i2) {
            mo4147a();
            this.f2574c = i;
            this.f2575d = i2;
            this.f2573b = 2;
            return;
        }
        this.f2575d += i2;
        this.f2574c = i;
    }

    /* renamed from: a */
    public void mo4143a(int i, int i2) {
        mo4147a();
        this.f2572a.mo4143a(i, i2);
    }

    /* renamed from: a */
    public void mo4144a(int i, int i2, Object obj) {
        int i3;
        if (this.f2573b == 3) {
            int i4 = this.f2574c;
            int i5 = this.f2575d;
            if (i <= i4 + i5 && (i3 = i + i2) >= i4 && this.f2576e == obj) {
                this.f2574c = Math.min(i, i4);
                this.f2575d = Math.max(i5 + i4, i3) - this.f2574c;
                return;
            }
        }
        mo4147a();
        this.f2574c = i;
        this.f2575d = i2;
        this.f2576e = obj;
        this.f2573b = 3;
    }
}
