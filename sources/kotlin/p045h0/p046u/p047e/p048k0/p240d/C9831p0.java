package kotlin.p045h0.p046u.p047e.p048k0.p240d;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9782g0;
import kotlin.reflect.jvm.internal.impl.protobuf.C10410a;
import kotlin.reflect.jvm.internal.impl.protobuf.C10413b;
import kotlin.reflect.jvm.internal.impl.protobuf.C10417d;
import kotlin.reflect.jvm.internal.impl.protobuf.C10420e;
import kotlin.reflect.jvm.internal.impl.protobuf.C10422f;
import kotlin.reflect.jvm.internal.impl.protobuf.C10427h;
import kotlin.reflect.jvm.internal.impl.protobuf.C10449o;
import kotlin.reflect.jvm.internal.impl.protobuf.C10452q;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* renamed from: kotlin.h0.u.e.k0.d.p0 */
/* compiled from: ProtoBuf */
public final class C9831p0 extends C10427h.C10431d<C9831p0> implements C9835q0 {

    /* renamed from: q */
    private static final C9831p0 f27068q;

    /* renamed from: r */
    public static C10452q<C9831p0> f27069r = new C9832a();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C10417d f27070g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f27071h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f27072i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public int f27073j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C9782g0 f27074k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f27075l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C9782g0 f27076m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public int f27077n;

    /* renamed from: o */
    private byte f27078o;

    /* renamed from: p */
    private int f27079p;

    /* renamed from: kotlin.h0.u.e.k0.d.p0$a */
    /* compiled from: ProtoBuf */
    static class C9832a extends C10413b<C9831p0> {
        C9832a() {
        }

        /* renamed from: a */
        public C9831p0 m32486a(C10420e eVar, C10422f fVar) throws InvalidProtocolBufferException {
            return new C9831p0(eVar, fVar);
        }
    }

    static {
        C9831p0 p0Var = new C9831p0(true);
        f27068q = p0Var;
        p0Var.m32452A();
    }

    /* renamed from: A */
    private void m32452A() {
        this.f27072i = 0;
        this.f27073j = 0;
        this.f27074k = C9782g0.m31867P();
        this.f27075l = 0;
        this.f27076m = C9782g0.m31867P();
        this.f27077n = 0;
    }

    /* renamed from: B */
    public static C9833b m32453B() {
        return C9833b.m32488s();
    }

    /* renamed from: z */
    public static C9831p0 m32463z() {
        return f27068q;
    }

    /* renamed from: g */
    public C10452q<C9831p0> mo34363g() {
        return f27069r;
    }

    public final boolean isInitialized() {
        byte b = this.f27078o;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!mo34710s()) {
            this.f27078o = 0;
            return false;
        } else if (mo34711t() && !mo34705n().isInitialized()) {
            this.f27078o = 0;
            return false;
        } else if (mo34713v() && !mo34707p().isInitialized()) {
            this.f27078o = 0;
            return false;
        } else if (!mo35769i()) {
            this.f27078o = 0;
            return false;
        } else {
            this.f27078o = 1;
            return true;
        }
    }

    /* renamed from: l */
    public int mo34703l() {
        return this.f27072i;
    }

    /* renamed from: m */
    public int mo34704m() {
        return this.f27073j;
    }

    /* renamed from: n */
    public C9782g0 mo34705n() {
        return this.f27074k;
    }

    /* renamed from: o */
    public int mo34706o() {
        return this.f27075l;
    }

    /* renamed from: p */
    public C9782g0 mo34707p() {
        return this.f27076m;
    }

    /* renamed from: q */
    public int mo34708q() {
        return this.f27077n;
    }

    /* renamed from: r */
    public boolean mo34709r() {
        return (this.f27071h & 1) == 1;
    }

    /* renamed from: s */
    public boolean mo34710s() {
        return (this.f27071h & 2) == 2;
    }

    /* renamed from: t */
    public boolean mo34711t() {
        return (this.f27071h & 4) == 4;
    }

    /* renamed from: u */
    public boolean mo34712u() {
        return (this.f27071h & 8) == 8;
    }

    /* renamed from: v */
    public boolean mo34713v() {
        return (this.f27071h & 16) == 16;
    }

    /* renamed from: w */
    public boolean mo34714w() {
        return (this.f27071h & 32) == 32;
    }

    /* renamed from: kotlin.h0.u.e.k0.d.p0$b */
    /* compiled from: ProtoBuf */
    public static final class C9833b extends C10427h.C10430c<C9831p0, C9833b> implements C9835q0 {

        /* renamed from: i */
        private int f27080i;

        /* renamed from: j */
        private int f27081j;

        /* renamed from: k */
        private int f27082k;

        /* renamed from: l */
        private C9782g0 f27083l = C9782g0.m31867P();

        /* renamed from: m */
        private int f27084m;

        /* renamed from: n */
        private C9782g0 f27085n = C9782g0.m31867P();

        /* renamed from: o */
        private int f27086o;

        private C9833b() {
            m32489u();
        }

        /* access modifiers changed from: private */
        /* renamed from: s */
        public static C9833b m32488s() {
            return new C9833b();
        }

        /* renamed from: u */
        private void m32489u() {
        }

        /* renamed from: c */
        public C9833b mo34720c(int i) {
            this.f27080i |= 8;
            this.f27084m = i;
            return this;
        }

        /* renamed from: d */
        public C9833b mo34721d(int i) {
            this.f27080i |= 32;
            this.f27086o = i;
            return this;
        }

        public final boolean isInitialized() {
            if (!mo34723m()) {
                return false;
            }
            if (mo34724n() && !mo34503k().isInitialized()) {
                return false;
            }
            if ((!mo34725q() || mo34722l().isInitialized()) && mo35764i()) {
                return true;
            }
            return false;
        }

        /* renamed from: j */
        public C9831p0 mo34502j() {
            C9831p0 p0Var = new C9831p0((C10427h.C10430c) this);
            int i = this.f27080i;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            int unused = p0Var.f27072i = this.f27081j;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            int unused2 = p0Var.f27073j = this.f27082k;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            C9782g0 unused3 = p0Var.f27074k = this.f27083l;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            int unused4 = p0Var.f27075l = this.f27084m;
            if ((i & 16) == 16) {
                i2 |= 16;
            }
            C9782g0 unused5 = p0Var.f27076m = this.f27085n;
            if ((i & 32) == 32) {
                i2 |= 32;
            }
            int unused6 = p0Var.f27077n = this.f27086o;
            int unused7 = p0Var.f27071h = i2;
            return p0Var;
        }

        /* renamed from: k */
        public C9782g0 mo34503k() {
            return this.f27083l;
        }

        /* renamed from: l */
        public C9782g0 mo34722l() {
            return this.f27085n;
        }

        /* renamed from: m */
        public boolean mo34723m() {
            return (this.f27080i & 2) == 2;
        }

        /* renamed from: n */
        public boolean mo34724n() {
            return (this.f27080i & 4) == 4;
        }

        /* renamed from: q */
        public boolean mo34725q() {
            return (this.f27080i & 16) == 16;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ C10427h.C10429b mo34379a(C10427h hVar) {
            mo34717a((C9831p0) hVar);
            return this;
        }

        /* renamed from: b */
        public C9831p0 m32503b() {
            return C9831p0.m32463z();
        }

        public C9833b clone() {
            C9833b s = m32488s();
            s.mo34717a(mo34502j());
            return s;
        }

        /* renamed from: b */
        public C9833b mo34718b(int i) {
            this.f27080i |= 2;
            this.f27082k = i;
            return this;
        }

        /* renamed from: a */
        public C9831p0 m32498a() {
            C9831p0 j = mo34502j();
            if (j.isInitialized()) {
                return j;
            }
            throw C10410a.C10411a.m35207a(j);
        }

        /* renamed from: b */
        public C9833b mo34719b(C9782g0 g0Var) {
            if ((this.f27080i & 16) != 16 || this.f27085n == C9782g0.m31867P()) {
                this.f27085n = g0Var;
            } else {
                this.f27085n = C9782g0.m31879c(this.f27085n).mo34379a(g0Var).mo34502j();
            }
            this.f27080i |= 16;
            return this;
        }

        /* renamed from: a */
        public C9833b mo34717a(C9831p0 p0Var) {
            if (p0Var == C9831p0.m32463z()) {
                return this;
            }
            if (p0Var.mo34709r()) {
                mo34715a(p0Var.mo34703l());
            }
            if (p0Var.mo34710s()) {
                mo34718b(p0Var.mo34704m());
            }
            if (p0Var.mo34711t()) {
                mo34716a(p0Var.mo34705n());
            }
            if (p0Var.mo34712u()) {
                mo34720c(p0Var.mo34706o());
            }
            if (p0Var.mo34713v()) {
                mo34719b(p0Var.mo34707p());
            }
            if (p0Var.mo34714w()) {
                mo34721d(p0Var.mo34708q());
            }
            mo35763a(p0Var);
            mo35761a(mo35762h().mo35686b(p0Var.f27070g));
            return this;
        }

        /* renamed from: a */
        public C9833b mo34377a(C10420e eVar, C10422f fVar) throws IOException {
            C9831p0 p0Var;
            C9831p0 p0Var2 = null;
            try {
                C9831p0 a = C9831p0.f27069r.mo34369a(eVar, fVar);
                if (a != null) {
                    mo34717a(a);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                p0Var = (C9831p0) e.mo35657a();
                throw e;
            } catch (Throwable th) {
                th = th;
                p0Var2 = p0Var;
            }
            if (p0Var2 != null) {
                mo34717a(p0Var2);
            }
            throw th;
        }

        /* renamed from: a */
        public C9833b mo34715a(int i) {
            this.f27080i |= 1;
            this.f27081j = i;
            return this;
        }

        /* renamed from: a */
        public C9833b mo34716a(C9782g0 g0Var) {
            if ((this.f27080i & 4) != 4 || this.f27083l == C9782g0.m31867P()) {
                this.f27083l = g0Var;
            } else {
                this.f27083l = C9782g0.m31879c(this.f27083l).mo34379a(g0Var).mo34502j();
            }
            this.f27080i |= 4;
            return this;
        }
    }

    /* renamed from: e */
    public int mo34361e() {
        int i = this.f27079p;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if ((this.f27071h & 1) == 1) {
            i2 = 0 + CodedOutputStream.m35133f(1, this.f27072i);
        }
        if ((this.f27071h & 2) == 2) {
            i2 += CodedOutputStream.m35133f(2, this.f27073j);
        }
        if ((this.f27071h & 4) == 4) {
            i2 += CodedOutputStream.m35130d(3, (C10449o) this.f27074k);
        }
        if ((this.f27071h & 16) == 16) {
            i2 += CodedOutputStream.m35130d(4, (C10449o) this.f27076m);
        }
        if ((this.f27071h & 8) == 8) {
            i2 += CodedOutputStream.m35133f(5, this.f27075l);
        }
        if ((this.f27071h & 32) == 32) {
            i2 += CodedOutputStream.m35133f(6, this.f27077n);
        }
        int j = i2 + mo35770j() + this.f27070g.size();
        this.f27079p = j;
        return j;
    }

    /* renamed from: f */
    public C9833b m32471f() {
        return m32453B();
    }

    private C9831p0(C10427h.C10430c<C9831p0, ?> cVar) {
        super(cVar);
        this.f27078o = -1;
        this.f27079p = -1;
        this.f27070g = cVar.mo35762h();
    }

    /* renamed from: c */
    public C9833b m32468c() {
        return m32459b(this);
    }

    /* renamed from: a */
    public void mo34358a(CodedOutputStream codedOutputStream) throws IOException {
        mo34361e();
        C10427h.C10431d<MessageType>.C0000a k = mo35771k();
        if ((this.f27071h & 1) == 1) {
            codedOutputStream.mo35635b(1, this.f27072i);
        }
        if ((this.f27071h & 2) == 2) {
            codedOutputStream.mo35635b(2, this.f27073j);
        }
        if ((this.f27071h & 4) == 4) {
            codedOutputStream.mo35636b(3, (C10449o) this.f27074k);
        }
        if ((this.f27071h & 16) == 16) {
            codedOutputStream.mo35636b(4, (C10449o) this.f27076m);
        }
        if ((this.f27071h & 8) == 8) {
            codedOutputStream.mo35635b(5, this.f27075l);
        }
        if ((this.f27071h & 32) == 32) {
            codedOutputStream.mo35635b(6, this.f27077n);
        }
        k.mo35772a(200, codedOutputStream);
        codedOutputStream.mo35638b(this.f27070g);
    }

    /* renamed from: b */
    public C9831p0 m32466b() {
        return f27068q;
    }

    /* renamed from: b */
    public static C9833b m32459b(C9831p0 p0Var) {
        C9833b B = m32453B();
        B.mo34717a(p0Var);
        return B;
    }

    private C9831p0(boolean z) {
        this.f27078o = -1;
        this.f27079p = -1;
        this.f27070g = C10417d.f28215f;
    }

    private C9831p0(C10420e eVar, C10422f fVar) throws InvalidProtocolBufferException {
        this.f27078o = -1;
        this.f27079p = -1;
        m32452A();
        C10417d.C10419b j = C10417d.m35229j();
        CodedOutputStream a = CodedOutputStream.m35116a((OutputStream) j, 1);
        boolean z = false;
        while (!z) {
            try {
                int x = eVar.mo35733x();
                if (x != 0) {
                    if (x == 8) {
                        this.f27071h |= 1;
                        this.f27072i = eVar.mo35719j();
                    } else if (x != 16) {
                        C9782g0.C9789c cVar = null;
                        if (x == 26) {
                            cVar = (this.f27071h & 4) == 4 ? this.f27074k.m31908c() : cVar;
                            C9782g0 g0Var = (C9782g0) eVar.mo35702a(C9782g0.f26873z, fVar);
                            this.f27074k = g0Var;
                            if (cVar != null) {
                                cVar.mo34379a(g0Var);
                                this.f27074k = cVar.mo34502j();
                            }
                            this.f27071h |= 4;
                        } else if (x == 34) {
                            cVar = (this.f27071h & 16) == 16 ? this.f27076m.m31908c() : cVar;
                            C9782g0 g0Var2 = (C9782g0) eVar.mo35702a(C9782g0.f26873z, fVar);
                            this.f27076m = g0Var2;
                            if (cVar != null) {
                                cVar.mo34379a(g0Var2);
                                this.f27076m = cVar.mo34502j();
                            }
                            this.f27071h |= 16;
                        } else if (x == 40) {
                            this.f27071h |= 8;
                            this.f27075l = eVar.mo35719j();
                        } else if (x == 48) {
                            this.f27071h |= 32;
                            this.f27077n = eVar.mo35719j();
                        } else if (!mo35759a(eVar, a, fVar, x)) {
                        }
                    } else {
                        this.f27071h |= 2;
                        this.f27073j = eVar.mo35719j();
                    }
                }
                z = true;
            } catch (InvalidProtocolBufferException e) {
                e.mo35656a(this);
                throw e;
            } catch (IOException e2) {
                InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                invalidProtocolBufferException.mo35656a(this);
                throw invalidProtocolBufferException;
            } catch (Throwable th) {
                try {
                    a.mo35614a();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f27070g = j.mo35696a();
                    throw th2;
                }
                this.f27070g = j.mo35696a();
                mo35760h();
                throw th;
            }
        }
        try {
            a.mo35614a();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f27070g = j.mo35696a();
            throw th3;
        }
        this.f27070g = j.mo35696a();
        mo35760h();
    }
}
