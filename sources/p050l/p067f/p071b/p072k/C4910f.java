package p050l.p067f.p071b.p072k;

import com.google.android.gms.ads.AdRequest;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import p050l.p067f.p071b.C4889d;
import p050l.p067f.p071b.C4892e;
import p050l.p067f.p071b.C4898i;
import p050l.p067f.p071b.p072k.C4907e;
import p050l.p067f.p071b.p072k.p073m.C4919b;
import p050l.p067f.p071b.p072k.p073m.C4924e;
import p050l.p067f.p071b.p072k.p073m.C4928h;
import p050l.p067f.p071b.p072k.p073m.C4929i;

/* renamed from: l.f.b.k.f */
/* compiled from: ConstraintWidgetContainer */
public class C4910f extends C4917l {

    /* renamed from: A0 */
    C4903c[] f8632A0 = new C4903c[4];

    /* renamed from: B0 */
    C4903c[] f8633B0 = new C4903c[4];

    /* renamed from: C0 */
    private int f8634C0 = 257;

    /* renamed from: D0 */
    private boolean f8635D0 = false;

    /* renamed from: E0 */
    private boolean f8636E0 = false;

    /* renamed from: F0 */
    private WeakReference<C4904d> f8637F0 = null;

    /* renamed from: G0 */
    private WeakReference<C4904d> f8638G0 = null;

    /* renamed from: H0 */
    private WeakReference<C4904d> f8639H0 = null;

    /* renamed from: I0 */
    private WeakReference<C4904d> f8640I0 = null;

    /* renamed from: J0 */
    public C4919b.C4920a f8641J0 = new C4919b.C4920a();

    /* renamed from: q0 */
    C4919b f8642q0 = new C4919b(this);

    /* renamed from: r0 */
    public C4924e f8643r0 = new C4924e(this);

    /* renamed from: s0 */
    protected C4919b.C4921b f8644s0 = null;

    /* renamed from: t0 */
    private boolean f8645t0 = false;

    /* renamed from: u0 */
    public C4892e f8646u0;

    /* renamed from: v0 */
    protected C4889d f8647v0 = new C4889d();

    /* renamed from: w0 */
    int f8648w0;

    /* renamed from: x0 */
    int f8649x0;

    /* renamed from: y0 */
    public int f8650y0 = 0;

    /* renamed from: z0 */
    public int f8651z0 = 0;

    /* renamed from: d0 */
    private void m8526d0() {
        this.f8650y0 = 0;
        this.f8651z0 = 0;
    }

    /* renamed from: P */
    public void mo17191P() {
        this.f8647v0.mo17121f();
        this.f8648w0 = 0;
        this.f8649x0 = 0;
        super.mo17191P();
    }

    /* JADX WARNING: type inference failed for: r6v5, types: [boolean] */
    /* JADX WARNING: type inference failed for: r6v7 */
    /* JADX WARNING: type inference failed for: r6v8 */
    /* renamed from: S */
    public void mo17272S() {
        int i;
        int i2;
        boolean z;
        boolean z2;
        ? r6;
        C4907e.C4909b bVar;
        this.f8581W = 0;
        this.f8582X = 0;
        this.f8635D0 = false;
        this.f8636E0 = false;
        int size = this.f8663p0.size();
        int max = Math.max(0, mo17180C());
        int max2 = Math.max(0, mo17244k());
        C4907e.C4909b[] bVarArr = this.f8575Q;
        C4907e.C4909b bVar2 = bVarArr[1];
        C4907e.C4909b bVar3 = bVarArr[0];
        C4892e eVar = this.f8646u0;
        if (eVar != null) {
            eVar.f8468z++;
        }
        if (C4915j.m8580a(this.f8634C0, 1)) {
            C4928h.m8632a(this, mo17273U());
            for (int i3 = 0; i3 < size; i3++) {
                C4907e eVar2 = this.f8663p0.get(i3);
                if (eVar2.mo17189L() && !(eVar2 instanceof C4911g) && !(eVar2 instanceof C4901a) && !(eVar2 instanceof C4916k) && !eVar2.mo17188K()) {
                    C4907e.C4909b b = eVar2.mo17211b(0);
                    C4907e.C4909b b2 = eVar2.mo17211b(1);
                    C4907e.C4909b bVar4 = C4907e.C4909b.MATCH_CONSTRAINT;
                    if (!(b == bVar4 && eVar2.f8611n != 1 && b2 == bVar4 && eVar2.f8613o != 1)) {
                        m8523a(eVar2, this.f8644s0, new C4919b.C4920a(), C4919b.C4920a.f8667k);
                    }
                }
            }
        }
        if (size <= 2 || (!(bVar3 == (bVar = C4907e.C4909b.WRAP_CONTENT) || bVar2 == bVar) || !C4915j.m8580a(this.f8634C0, 1024) || !C4929i.m8639a(this, mo17273U()))) {
            i = max2;
            i2 = max;
            z = false;
        } else {
            if (bVar3 == C4907e.C4909b.WRAP_CONTENT) {
                if (max >= mo17180C() || max <= 0) {
                    max = mo17180C();
                } else {
                    mo17263t(max);
                    this.f8635D0 = true;
                }
            }
            if (bVar2 == C4907e.C4909b.WRAP_CONTENT) {
                if (max2 >= mo17244k() || max2 <= 0) {
                    max2 = mo17244k();
                } else {
                    mo17247l(max2);
                    this.f8636E0 = true;
                }
            }
            i = max2;
            i2 = max;
            z = true;
        }
        boolean z3 = mo17295w(64) || mo17295w(128);
        C4889d dVar = this.f8647v0;
        dVar.f8432h = false;
        dVar.f8433i = false;
        if (this.f8634C0 != 0 && z3) {
            dVar.f8433i = true;
        }
        ArrayList<C4907e> arrayList = this.f8663p0;
        boolean z4 = mo17250n() == C4907e.C4909b.WRAP_CONTENT || mo17271z() == C4907e.C4909b.WRAP_CONTENT;
        m8526d0();
        for (int i4 = 0; i4 < size; i4++) {
            C4907e eVar3 = this.f8663p0.get(i4);
            if (eVar3 instanceof C4917l) {
                ((C4917l) eVar3).mo17272S();
            }
        }
        boolean w = mo17295w(64);
        boolean z5 = z;
        int i5 = 0;
        boolean z6 = true;
        while (z6) {
            int i6 = i5 + 1;
            try {
                this.f8647v0.mo17121f();
                m8526d0();
                mo17203a(this.f8647v0);
                for (int i7 = 0; i7 < size; i7++) {
                    this.f8663p0.get(i7).mo17203a(this.f8647v0);
                }
                z6 = mo17287b(this.f8647v0);
                if (!(this.f8637F0 == null || this.f8637F0.get() == null)) {
                    m8524b((C4904d) this.f8637F0.get(), this.f8647v0.mo17104a((Object) this.f8565G));
                    this.f8637F0 = null;
                }
                if (!(this.f8639H0 == null || this.f8639H0.get() == null)) {
                    m8522a((C4904d) this.f8639H0.get(), this.f8647v0.mo17104a((Object) this.f8567I));
                    this.f8639H0 = null;
                }
                if (!(this.f8638G0 == null || this.f8638G0.get() == null)) {
                    m8524b((C4904d) this.f8638G0.get(), this.f8647v0.mo17104a((Object) this.f8564F));
                    this.f8638G0 = null;
                }
                if (!(this.f8640I0 == null || this.f8640I0.get() == null)) {
                    m8522a((C4904d) this.f8640I0.get(), this.f8647v0.mo17104a((Object) this.f8566H));
                    this.f8640I0 = null;
                }
                if (z6) {
                    this.f8647v0.mo17120e();
                }
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("EXCEPTION : " + e);
            }
            if (z6) {
                mo17280a(this.f8647v0, C4915j.f8661a);
            } else {
                mo17216b(this.f8647v0, w);
                for (int i8 = 0; i8 < size; i8++) {
                    this.f8663p0.get(i8).mo17216b(this.f8647v0, w);
                }
            }
            if (!z4 || i6 >= 8 || !C4915j.f8661a[2]) {
                z2 = false;
            } else {
                int i9 = 0;
                int i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    C4907e eVar4 = this.f8663p0.get(i11);
                    i9 = Math.max(i9, eVar4.f8581W + eVar4.mo17180C());
                    i10 = Math.max(i10, eVar4.f8582X + eVar4.mo17244k());
                }
                int max3 = Math.max(this.f8584Z, i9);
                int max4 = Math.max(this.f8586a0, i10);
                if (bVar3 != C4907e.C4909b.WRAP_CONTENT || mo17180C() >= max3) {
                    z2 = false;
                } else {
                    mo17263t(max3);
                    this.f8575Q[0] = C4907e.C4909b.WRAP_CONTENT;
                    z2 = true;
                    z5 = true;
                }
                if (bVar2 == C4907e.C4909b.WRAP_CONTENT && mo17244k() < max4) {
                    mo17247l(max4);
                    this.f8575Q[1] = C4907e.C4909b.WRAP_CONTENT;
                    z2 = true;
                    z5 = true;
                }
            }
            int max5 = Math.max(this.f8584Z, mo17180C());
            if (max5 > mo17180C()) {
                mo17263t(max5);
                this.f8575Q[0] = C4907e.C4909b.FIXED;
                z2 = true;
                z5 = true;
            }
            int max6 = Math.max(this.f8586a0, mo17244k());
            if (max6 > mo17244k()) {
                mo17247l(max6);
                r6 = 1;
                this.f8575Q[1] = C4907e.C4909b.FIXED;
                z2 = true;
                z5 = true;
            } else {
                r6 = 1;
            }
            if (!z5) {
                if (this.f8575Q[0] == C4907e.C4909b.WRAP_CONTENT && i2 > 0 && mo17180C() > i2) {
                    this.f8635D0 = r6;
                    this.f8575Q[0] = C4907e.C4909b.FIXED;
                    mo17263t(i2);
                    z2 = true;
                    z5 = true;
                }
                if (this.f8575Q[r6] == C4907e.C4909b.WRAP_CONTENT && i > 0 && mo17244k() > i) {
                    this.f8636E0 = r6;
                    this.f8575Q[r6] = C4907e.C4909b.FIXED;
                    mo17247l(i);
                    z5 = true;
                    z6 = true;
                    i5 = i6;
                }
            }
            z6 = z2;
            i5 = i6;
        }
        this.f8663p0 = arrayList;
        if (z5) {
            C4907e.C4909b[] bVarArr2 = this.f8575Q;
            bVarArr2[0] = bVar3;
            bVarArr2[1] = bVar2;
        }
        mo17202a(this.f8647v0.mo17119d());
    }

    /* renamed from: U */
    public C4919b.C4921b mo17273U() {
        return this.f8644s0;
    }

    /* renamed from: V */
    public int mo17274V() {
        return this.f8634C0;
    }

    /* renamed from: W */
    public C4889d mo17275W() {
        return this.f8647v0;
    }

    /* renamed from: X */
    public void mo17276X() {
        this.f8643r0.mo17327b();
    }

    /* renamed from: Y */
    public void mo17277Y() {
        this.f8643r0.mo17329c();
    }

    /* renamed from: Z */
    public boolean mo17278Z() {
        return this.f8636E0;
    }

    /* renamed from: a */
    public boolean mo17284a(boolean z, int i) {
        return this.f8643r0.mo17326a(z, i);
    }

    /* renamed from: a0 */
    public boolean mo17285a0() {
        return this.f8645t0;
    }

    /* renamed from: b */
    public void mo17286b(C4904d dVar) {
        WeakReference<C4904d> weakReference = this.f8638G0;
        if (weakReference == null || weakReference.get() == null || dVar.mo17164b() > ((C4904d) this.f8638G0.get()).mo17164b()) {
            this.f8638G0 = new WeakReference<>(dVar);
        }
    }

    /* renamed from: b0 */
    public boolean mo17288b0() {
        return this.f8635D0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo17289c(C4904d dVar) {
        WeakReference<C4904d> weakReference = this.f8639H0;
        if (weakReference == null || weakReference.get() == null || dVar.mo17164b() > ((C4904d) this.f8639H0.get()).mo17164b()) {
            this.f8639H0 = new WeakReference<>(dVar);
        }
    }

    /* renamed from: c0 */
    public void mo17290c0() {
        this.f8642q0.mo17314a(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo17291d(C4904d dVar) {
        WeakReference<C4904d> weakReference = this.f8637F0;
        if (weakReference == null || weakReference.get() == null || dVar.mo17164b() > ((C4904d) this.f8637F0.get()).mo17164b()) {
            this.f8637F0 = new WeakReference<>(dVar);
        }
    }

    /* renamed from: e */
    public boolean mo17292e(boolean z) {
        return this.f8643r0.mo17325a(z);
    }

    /* renamed from: f */
    public boolean mo17293f(boolean z) {
        return this.f8643r0.mo17328b(z);
    }

    /* renamed from: g */
    public void mo17294g(boolean z) {
        this.f8645t0 = z;
    }

    /* renamed from: w */
    public boolean mo17295w(int i) {
        return (this.f8634C0 & i) == i;
    }

    /* renamed from: x */
    public void mo17296x(int i) {
        this.f8634C0 = i;
        C4889d.f8416r = mo17295w(AdRequest.MAX_CONTENT_URL_LENGTH);
    }

    /* renamed from: e */
    private void m8527e(C4907e eVar) {
        int i = this.f8651z0 + 1;
        C4903c[] cVarArr = this.f8632A0;
        if (i >= cVarArr.length) {
            this.f8632A0 = (C4903c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.f8632A0[this.f8651z0] = new C4903c(eVar, 1, mo17285a0());
        this.f8651z0++;
    }

    /* renamed from: a */
    public long mo17279a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        int i10 = i8;
        this.f8648w0 = i10;
        int i11 = i9;
        this.f8649x0 = i11;
        return this.f8642q0.mo17313a(this, i, i10, i11, i2, i3, i4, i5, i6, i7);
    }

    /* renamed from: b */
    private void m8524b(C4904d dVar, C4898i iVar) {
        this.f8647v0.mo17115b(this.f8647v0.mo17104a((Object) dVar), iVar, 0, 5);
    }

    /* renamed from: d */
    private void m8525d(C4907e eVar) {
        int i = this.f8650y0 + 1;
        C4903c[] cVarArr = this.f8633B0;
        if (i >= cVarArr.length) {
            this.f8633B0 = (C4903c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.f8633B0[this.f8650y0] = new C4903c(eVar, 0, mo17285a0());
        this.f8650y0++;
    }

    /* renamed from: a */
    public void mo17283a(C4919b.C4921b bVar) {
        this.f8644s0 = bVar;
        this.f8643r0.mo17324a(bVar);
    }

    /* renamed from: b */
    public boolean mo17287b(C4889d dVar) {
        boolean w = mo17295w(64);
        mo17151a(dVar, w);
        int size = this.f8663p0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            C4907e eVar = this.f8663p0.get(i);
            eVar.mo17199a(0, false);
            eVar.mo17199a(1, false);
            if (eVar instanceof C4901a) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                C4907e eVar2 = this.f8663p0.get(i2);
                if (eVar2 instanceof C4901a) {
                    ((C4901a) eVar2).mo17150W();
                }
            }
        }
        for (int i3 = 0; i3 < size; i3++) {
            C4907e eVar3 = this.f8663p0.get(i3);
            if (eVar3.mo17220b()) {
                eVar3.mo17151a(dVar, w);
            }
        }
        if (C4889d.f8416r) {
            HashSet hashSet = new HashSet();
            for (int i4 = 0; i4 < size; i4++) {
                C4907e eVar4 = this.f8663p0.get(i4);
                if (!eVar4.mo17220b()) {
                    hashSet.add(eVar4);
                }
            }
            mo17207a(this, dVar, (HashSet<C4907e>) hashSet, mo17250n() == C4907e.C4909b.WRAP_CONTENT ? 0 : 1, false);
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                C4907e eVar5 = (C4907e) it.next();
                C4915j.m8579a(this, dVar, eVar5);
                eVar5.mo17151a(dVar, w);
            }
        } else {
            for (int i5 = 0; i5 < size; i5++) {
                C4907e eVar6 = this.f8663p0.get(i5);
                if (eVar6 instanceof C4910f) {
                    C4907e.C4909b[] bVarArr = eVar6.f8575Q;
                    C4907e.C4909b bVar = bVarArr[0];
                    C4907e.C4909b bVar2 = bVarArr[1];
                    if (bVar == C4907e.C4909b.WRAP_CONTENT) {
                        eVar6.mo17205a(C4907e.C4909b.FIXED);
                    }
                    if (bVar2 == C4907e.C4909b.WRAP_CONTENT) {
                        eVar6.mo17217b(C4907e.C4909b.FIXED);
                    }
                    eVar6.mo17151a(dVar, w);
                    if (bVar == C4907e.C4909b.WRAP_CONTENT) {
                        eVar6.mo17205a(bVar);
                    }
                    if (bVar2 == C4907e.C4909b.WRAP_CONTENT) {
                        eVar6.mo17217b(bVar2);
                    }
                } else {
                    C4915j.m8579a(this, dVar, eVar6);
                    if (!eVar6.mo17220b()) {
                        eVar6.mo17151a(dVar, w);
                    }
                }
            }
        }
        if (this.f8650y0 > 0) {
            C4902b.m8398a(this, dVar, (ArrayList<C4907e>) null, 0);
        }
        if (this.f8651z0 > 0) {
            C4902b.m8398a(this, dVar, (ArrayList<C4907e>) null, 1);
        }
        return true;
    }

    /* renamed from: a */
    public void mo17281a(C4904d dVar) {
        WeakReference<C4904d> weakReference = this.f8640I0;
        if (weakReference == null || weakReference.get() == null || dVar.mo17164b() > ((C4904d) this.f8640I0.get()).mo17164b()) {
            this.f8640I0 = new WeakReference<>(dVar);
        }
    }

    /* renamed from: a */
    private void m8522a(C4904d dVar, C4898i iVar) {
        this.f8647v0.mo17115b(iVar, this.f8647v0.mo17104a((Object) dVar), 0, 5);
    }

    /* renamed from: a */
    public void mo17280a(C4889d dVar, boolean[] zArr) {
        zArr[2] = false;
        boolean w = mo17295w(64);
        mo17216b(dVar, w);
        int size = this.f8663p0.size();
        for (int i = 0; i < size; i++) {
            this.f8663p0.get(i).mo17216b(dVar, w);
        }
    }

    /* renamed from: a */
    public void mo17209a(boolean z, boolean z2) {
        super.mo17209a(z, z2);
        int size = this.f8663p0.size();
        for (int i = 0; i < size; i++) {
            this.f8663p0.get(i).mo17209a(z, z2);
        }
    }

    /* renamed from: a */
    public static boolean m8523a(C4907e eVar, C4919b.C4921b bVar, C4919b.C4920a aVar, int i) {
        int i2;
        int i3;
        if (bVar == null) {
            return false;
        }
        aVar.f8670a = eVar.mo17250n();
        aVar.f8671b = eVar.mo17271z();
        aVar.f8672c = eVar.mo17180C();
        aVar.f8673d = eVar.mo17244k();
        aVar.f8678i = false;
        aVar.f8679j = i;
        boolean z = aVar.f8670a == C4907e.C4909b.MATCH_CONSTRAINT;
        boolean z2 = aVar.f8671b == C4907e.C4909b.MATCH_CONSTRAINT;
        boolean z3 = z && eVar.f8579U > 0.0f;
        boolean z4 = z2 && eVar.f8579U > 0.0f;
        if (z && eVar.mo17237g(0) && eVar.f8611n == 0 && !z3) {
            aVar.f8670a = C4907e.C4909b.WRAP_CONTENT;
            if (z2 && eVar.f8613o == 0) {
                aVar.f8670a = C4907e.C4909b.FIXED;
            }
            z = false;
        }
        if (z2 && eVar.mo17237g(1) && eVar.f8613o == 0 && !z4) {
            aVar.f8671b = C4907e.C4909b.WRAP_CONTENT;
            if (z && eVar.f8611n == 0) {
                aVar.f8671b = C4907e.C4909b.FIXED;
            }
            z2 = false;
        }
        if (eVar.mo17143M()) {
            aVar.f8670a = C4907e.C4909b.FIXED;
            z = false;
        }
        if (eVar.mo17144N()) {
            aVar.f8671b = C4907e.C4909b.FIXED;
            z2 = false;
        }
        if (z3) {
            if (eVar.f8614p[0] == 4) {
                aVar.f8670a = C4907e.C4909b.FIXED;
            } else if (!z2) {
                if (aVar.f8671b == C4907e.C4909b.FIXED) {
                    i3 = aVar.f8673d;
                } else {
                    aVar.f8670a = C4907e.C4909b.WRAP_CONTENT;
                    bVar.mo2017a(eVar, aVar);
                    i3 = aVar.f8675f;
                }
                aVar.f8670a = C4907e.C4909b.FIXED;
                int i4 = eVar.f8580V;
                if (i4 == 0 || i4 == -1) {
                    aVar.f8672c = (int) (eVar.mo17240i() * ((float) i3));
                } else {
                    aVar.f8672c = (int) (eVar.mo17240i() / ((float) i3));
                }
            }
        }
        if (z4) {
            if (eVar.f8614p[1] == 4) {
                aVar.f8671b = C4907e.C4909b.FIXED;
            } else if (!z) {
                if (aVar.f8670a == C4907e.C4909b.FIXED) {
                    i2 = aVar.f8672c;
                } else {
                    aVar.f8671b = C4907e.C4909b.WRAP_CONTENT;
                    bVar.mo2017a(eVar, aVar);
                    i2 = aVar.f8674e;
                }
                aVar.f8671b = C4907e.C4909b.FIXED;
                int i5 = eVar.f8580V;
                if (i5 == 0 || i5 == -1) {
                    aVar.f8673d = (int) (((float) i2) / eVar.mo17240i());
                } else {
                    aVar.f8673d = (int) (((float) i2) * eVar.mo17240i());
                }
            }
        }
        bVar.mo2017a(eVar, aVar);
        eVar.mo17263t(aVar.f8674e);
        eVar.mo17247l(aVar.f8675f);
        eVar.mo17208a(aVar.f8677h);
        eVar.mo17239h(aVar.f8676g);
        aVar.f8679j = C4919b.C4920a.f8667k;
        return aVar.f8678i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo17282a(C4907e eVar, int i) {
        if (i == 0) {
            m8525d(eVar);
        } else if (i == 1) {
            m8527e(eVar);
        }
    }
}
