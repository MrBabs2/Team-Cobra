package p050l.p100o.p101a;

/* renamed from: l.o.a.c */
/* compiled from: Target */
public final class C5160c {

    /* renamed from: e */
    public static final C5160c f9139e;

    /* renamed from: f */
    public static final C5160c f9140f;

    /* renamed from: g */
    public static final C5160c f9141g;

    /* renamed from: h */
    public static final C5160c f9142h;

    /* renamed from: i */
    public static final C5160c f9143i;

    /* renamed from: j */
    public static final C5160c f9144j;

    /* renamed from: a */
    final float[] f9145a;

    /* renamed from: b */
    final float[] f9146b = new float[3];

    /* renamed from: c */
    final float[] f9147c = new float[3];

    /* renamed from: d */
    boolean f9148d = true;

    static {
        C5160c cVar = new C5160c();
        f9139e = cVar;
        m9574b(cVar);
        m9577e(f9139e);
        C5160c cVar2 = new C5160c();
        f9140f = cVar2;
        m9576d(cVar2);
        m9577e(f9140f);
        C5160c cVar3 = new C5160c();
        f9141g = cVar3;
        m9572a(cVar3);
        m9577e(f9141g);
        C5160c cVar4 = new C5160c();
        f9142h = cVar4;
        m9574b(cVar4);
        m9575c(f9142h);
        C5160c cVar5 = new C5160c();
        f9143i = cVar5;
        m9576d(cVar5);
        m9575c(f9143i);
        C5160c cVar6 = new C5160c();
        f9144j = cVar6;
        m9572a(cVar6);
        m9575c(f9144j);
    }

    C5160c() {
        float[] fArr = new float[3];
        this.f9145a = fArr;
        m9573a(fArr);
        m9573a(this.f9146b);
        m9578l();
    }

    /* renamed from: l */
    private void m9578l() {
        float[] fArr = this.f9147c;
        fArr[0] = 0.24f;
        fArr[1] = 0.52f;
        fArr[2] = 0.24f;
    }

    /* renamed from: a */
    public float mo17838a() {
        return this.f9147c[1];
    }

    /* renamed from: b */
    public float mo17839b() {
        return this.f9146b[2];
    }

    /* renamed from: c */
    public float mo17840c() {
        return this.f9145a[2];
    }

    /* renamed from: d */
    public float mo17841d() {
        return this.f9146b[0];
    }

    /* renamed from: e */
    public float mo17842e() {
        return this.f9145a[0];
    }

    /* renamed from: f */
    public float mo17843f() {
        return this.f9147c[2];
    }

    /* renamed from: g */
    public float mo17844g() {
        return this.f9147c[0];
    }

    /* renamed from: h */
    public float mo17845h() {
        return this.f9146b[1];
    }

    /* renamed from: i */
    public float mo17846i() {
        return this.f9145a[1];
    }

    /* renamed from: j */
    public boolean mo17847j() {
        return this.f9148d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo17848k() {
        float f = 0.0f;
        for (float f2 : this.f9147c) {
            if (f2 > 0.0f) {
                f += f2;
            }
        }
        if (f != 0.0f) {
            int length = this.f9147c.length;
            for (int i = 0; i < length; i++) {
                float[] fArr = this.f9147c;
                if (fArr[i] > 0.0f) {
                    fArr[i] = fArr[i] / f;
                }
            }
        }
    }

    /* renamed from: a */
    private static void m9573a(float[] fArr) {
        fArr[0] = 0.0f;
        fArr[1] = 0.5f;
        fArr[2] = 1.0f;
    }

    /* renamed from: b */
    private static void m9574b(C5160c cVar) {
        float[] fArr = cVar.f9146b;
        fArr[0] = 0.55f;
        fArr[1] = 0.74f;
    }

    /* renamed from: c */
    private static void m9575c(C5160c cVar) {
        float[] fArr = cVar.f9145a;
        fArr[1] = 0.3f;
        fArr[2] = 0.4f;
    }

    /* renamed from: d */
    private static void m9576d(C5160c cVar) {
        float[] fArr = cVar.f9146b;
        fArr[0] = 0.3f;
        fArr[1] = 0.5f;
        fArr[2] = 0.7f;
    }

    /* renamed from: e */
    private static void m9577e(C5160c cVar) {
        float[] fArr = cVar.f9145a;
        fArr[0] = 0.35f;
        fArr[1] = 1.0f;
    }

    /* renamed from: a */
    private static void m9572a(C5160c cVar) {
        float[] fArr = cVar.f9146b;
        fArr[1] = 0.26f;
        fArr[2] = 0.45f;
    }
}
