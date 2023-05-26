package kotlin.p045h0.p046u.p047e.p048k0.p240d;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.C10410a;
import kotlin.reflect.jvm.internal.impl.protobuf.C10413b;
import kotlin.reflect.jvm.internal.impl.protobuf.C10417d;
import kotlin.reflect.jvm.internal.impl.protobuf.C10420e;
import kotlin.reflect.jvm.internal.impl.protobuf.C10422f;
import kotlin.reflect.jvm.internal.impl.protobuf.C10427h;
import kotlin.reflect.jvm.internal.impl.protobuf.C10436i;
import kotlin.reflect.jvm.internal.impl.protobuf.C10452q;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* renamed from: kotlin.h0.u.e.k0.d.r0 */
/* compiled from: ProtoBuf */
public final class C9839r0 extends C10427h implements C9847s0 {

    /* renamed from: p */
    private static final C9839r0 f27118p;

    /* renamed from: q */
    public static C10452q<C9839r0> f27119q = new C9840a();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C10417d f27120f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f27121g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f27122h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f27123i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C9842c f27124j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public int f27125k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f27126l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C9844d f27127m;

    /* renamed from: n */
    private byte f27128n;

    /* renamed from: o */
    private int f27129o;

    /* renamed from: kotlin.h0.u.e.k0.d.r0$a */
    /* compiled from: ProtoBuf */
    static class C9840a extends C10413b<C9839r0> {
        C9840a() {
        }

        /* renamed from: a */
        public C9839r0 m32643a(C10420e eVar, C10422f fVar) throws InvalidProtocolBufferException {
            return new C9839r0(eVar, fVar);
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.d.r0$c */
    /* compiled from: ProtoBuf */
    public enum C9842c implements C10436i.C10437a {
        WARNING(0, 0),
        ERROR(1, 1),
        HIDDEN(2, 2);
        

        /* renamed from: f */
        private final int f27141f;

        /* renamed from: kotlin.h0.u.e.k0.d.r0$c$a */
        /* compiled from: ProtoBuf */
        static class C9843a implements C10436i.C10438b<C9842c> {
            C9843a() {
            }

            /* renamed from: a */
            public C9842c m32667a(int i) {
                return C9842c.m32664a(i);
            }
        }

        static {
            new C9843a();
        }

        private C9842c(int i, int i2) {
            this.f27141f = i2;
        }

        /* renamed from: a */
        public static C9842c m32664a(int i) {
            if (i == 0) {
                return WARNING;
            }
            if (i == 1) {
                return ERROR;
            }
            if (i != 2) {
                return null;
            }
            return HIDDEN;
        }

        /* renamed from: b */
        public final int mo34424b() {
            return this.f27141f;
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.d.r0$d */
    /* compiled from: ProtoBuf */
    public enum C9844d implements C10436i.C10437a {
        LANGUAGE_VERSION(0, 0),
        COMPILER_VERSION(1, 1),
        API_VERSION(2, 2);
        

        /* renamed from: f */
        private final int f27146f;

        /* renamed from: kotlin.h0.u.e.k0.d.r0$d$a */
        /* compiled from: ProtoBuf */
        static class C9845a implements C10436i.C10438b<C9844d> {
            C9845a() {
            }

            /* renamed from: a */
            public C9844d m32671a(int i) {
                return C9844d.m32668a(i);
            }
        }

        static {
            new C9845a();
        }

        private C9844d(int i, int i2) {
            this.f27146f = i2;
        }

        /* renamed from: a */
        public static C9844d m32668a(int i) {
            if (i == 0) {
                return LANGUAGE_VERSION;
            }
            if (i == 1) {
                return COMPILER_VERSION;
            }
            if (i != 2) {
                return null;
            }
            return API_VERSION;
        }

        /* renamed from: b */
        public final int mo34424b() {
            return this.f27146f;
        }
    }

    static {
        C9839r0 r0Var = new C9839r0(true);
        f27118p = r0Var;
        r0Var.m32619v();
    }

    /* renamed from: u */
    public static C9839r0 m32618u() {
        return f27118p;
    }

    /* renamed from: v */
    private void m32619v() {
        this.f27122h = 0;
        this.f27123i = 0;
        this.f27124j = C9842c.ERROR;
        this.f27125k = 0;
        this.f27126l = 0;
        this.f27127m = C9844d.LANGUAGE_VERSION;
    }

    /* renamed from: w */
    public static C9841b m32620w() {
        return C9841b.m32645k();
    }

    /* renamed from: g */
    public C10452q<C9839r0> mo34363g() {
        return f27119q;
    }

    /* renamed from: i */
    public int mo34773i() {
        return this.f27125k;
    }

    public final boolean isInitialized() {
        byte b = this.f27128n;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f27128n = 1;
        return true;
    }

    /* renamed from: j */
    public C9842c mo34774j() {
        return this.f27124j;
    }

    /* renamed from: k */
    public int mo34775k() {
        return this.f27126l;
    }

    /* renamed from: l */
    public int mo34776l() {
        return this.f27122h;
    }

    /* renamed from: m */
    public int mo34777m() {
        return this.f27123i;
    }

    /* renamed from: n */
    public C9844d mo34778n() {
        return this.f27127m;
    }

    /* renamed from: o */
    public boolean mo34779o() {
        return (this.f27121g & 8) == 8;
    }

    /* renamed from: p */
    public boolean mo34780p() {
        return (this.f27121g & 4) == 4;
    }

    /* renamed from: q */
    public boolean mo34781q() {
        return (this.f27121g & 16) == 16;
    }

    /* renamed from: r */
    public boolean mo34782r() {
        return (this.f27121g & 1) == 1;
    }

    /* renamed from: s */
    public boolean mo34783s() {
        return (this.f27121g & 2) == 2;
    }

    /* renamed from: t */
    public boolean mo34784t() {
        return (this.f27121g & 32) == 32;
    }

    /* renamed from: kotlin.h0.u.e.k0.d.r0$b */
    /* compiled from: ProtoBuf */
    public static final class C9841b extends C10427h.C10429b<C9839r0, C9841b> implements C9847s0 {

        /* renamed from: g */
        private int f27130g;

        /* renamed from: h */
        private int f27131h;

        /* renamed from: i */
        private int f27132i;

        /* renamed from: j */
        private C9842c f27133j = C9842c.ERROR;

        /* renamed from: k */
        private int f27134k;

        /* renamed from: l */
        private int f27135l;

        /* renamed from: m */
        private C9844d f27136m = C9844d.LANGUAGE_VERSION;

        private C9841b() {
            m32646l();
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public static C9841b m32645k() {
            return new C9841b();
        }

        /* renamed from: l */
        private void m32646l() {
        }

        /* renamed from: c */
        public C9841b mo34790c(int i) {
            this.f27130g |= 1;
            this.f27131h = i;
            return this;
        }

        /* renamed from: d */
        public C9841b mo34791d(int i) {
            this.f27130g |= 2;
            this.f27132i = i;
            return this;
        }

        /* renamed from: i */
        public C9839r0 mo34792i() {
            C9839r0 r0Var = new C9839r0((C10427h.C10429b) this);
            int i = this.f27130g;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            int unused = r0Var.f27122h = this.f27131h;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            int unused2 = r0Var.f27123i = this.f27132i;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            C9842c unused3 = r0Var.f27124j = this.f27133j;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            int unused4 = r0Var.f27125k = this.f27134k;
            if ((i & 16) == 16) {
                i2 |= 16;
            }
            int unused5 = r0Var.f27126l = this.f27135l;
            if ((i & 32) == 32) {
                i2 |= 32;
            }
            C9844d unused6 = r0Var.f27127m = this.f27136m;
            int unused7 = r0Var.f27121g = i2;
            return r0Var;
        }

        public final boolean isInitialized() {
            return true;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ C10427h.C10429b mo34379a(C10427h hVar) {
            mo34788a((C9839r0) hVar);
            return this;
        }

        /* renamed from: b */
        public C9839r0 m32660b() {
            return C9839r0.m32618u();
        }

        public C9841b clone() {
            C9841b k = m32645k();
            k.mo34788a(mo34792i());
            return k;
        }

        /* renamed from: b */
        public C9841b mo34789b(int i) {
            this.f27130g |= 16;
            this.f27135l = i;
            return this;
        }

        /* renamed from: a */
        public C9839r0 m32656a() {
            C9839r0 i = mo34792i();
            if (i.isInitialized()) {
                return i;
            }
            throw C10410a.C10411a.m35207a(i);
        }

        /* renamed from: a */
        public C9841b mo34788a(C9839r0 r0Var) {
            if (r0Var == C9839r0.m32618u()) {
                return this;
            }
            if (r0Var.mo34782r()) {
                mo34790c(r0Var.mo34776l());
            }
            if (r0Var.mo34783s()) {
                mo34791d(r0Var.mo34777m());
            }
            if (r0Var.mo34780p()) {
                mo34786a(r0Var.mo34774j());
            }
            if (r0Var.mo34779o()) {
                mo34785a(r0Var.mo34773i());
            }
            if (r0Var.mo34781q()) {
                mo34789b(r0Var.mo34775k());
            }
            if (r0Var.mo34784t()) {
                mo34787a(r0Var.mo34778n());
            }
            mo35761a(mo35762h().mo35686b(r0Var.f27120f));
            return this;
        }

        /* renamed from: a */
        public C9841b mo34377a(C10420e eVar, C10422f fVar) throws IOException {
            C9839r0 r0Var;
            C9839r0 r0Var2 = null;
            try {
                C9839r0 a = C9839r0.f27119q.mo34369a(eVar, fVar);
                if (a != null) {
                    mo34788a(a);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                r0Var = (C9839r0) e.mo35657a();
                throw e;
            } catch (Throwable th) {
                th = th;
                r0Var2 = r0Var;
            }
            if (r0Var2 != null) {
                mo34788a(r0Var2);
            }
            throw th;
        }

        /* renamed from: a */
        public C9841b mo34786a(C9842c cVar) {
            if (cVar != null) {
                this.f27130g |= 4;
                this.f27133j = cVar;
                return this;
            }
            throw null;
        }

        /* renamed from: a */
        public C9841b mo34785a(int i) {
            this.f27130g |= 8;
            this.f27134k = i;
            return this;
        }

        /* renamed from: a */
        public C9841b mo34787a(C9844d dVar) {
            if (dVar != null) {
                this.f27130g |= 32;
                this.f27136m = dVar;
                return this;
            }
            throw null;
        }
    }

    /* renamed from: e */
    public int mo34361e() {
        int i = this.f27129o;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if ((this.f27121g & 1) == 1) {
            i2 = 0 + CodedOutputStream.m35133f(1, this.f27122h);
        }
        if ((this.f27121g & 2) == 2) {
            i2 += CodedOutputStream.m35133f(2, this.f27123i);
        }
        if ((this.f27121g & 4) == 4) {
            i2 += CodedOutputStream.m35132e(3, this.f27124j.mo34424b());
        }
        if ((this.f27121g & 8) == 8) {
            i2 += CodedOutputStream.m35133f(4, this.f27125k);
        }
        if ((this.f27121g & 16) == 16) {
            i2 += CodedOutputStream.m35133f(5, this.f27126l);
        }
        if ((this.f27121g & 32) == 32) {
            i2 += CodedOutputStream.m35132e(6, this.f27127m.mo34424b());
        }
        int size = i2 + this.f27120f.size();
        this.f27129o = size;
        return size;
    }

    /* renamed from: f */
    public C9841b m32628f() {
        return m32620w();
    }

    private C9839r0(C10427h.C10429b bVar) {
        super(bVar);
        this.f27128n = -1;
        this.f27129o = -1;
        this.f27120f = bVar.mo35762h();
    }

    /* renamed from: b */
    public C9839r0 m32623b() {
        return f27118p;
    }

    /* renamed from: c */
    public C9841b m32625c() {
        return m32614b(this);
    }

    /* renamed from: b */
    public static C9841b m32614b(C9839r0 r0Var) {
        C9841b w = m32620w();
        w.mo34788a(r0Var);
        return w;
    }

    /* renamed from: a */
    public void mo34358a(CodedOutputStream codedOutputStream) throws IOException {
        mo34361e();
        if ((this.f27121g & 1) == 1) {
            codedOutputStream.mo35635b(1, this.f27122h);
        }
        if ((this.f27121g & 2) == 2) {
            codedOutputStream.mo35635b(2, this.f27123i);
        }
        if ((this.f27121g & 4) == 4) {
            codedOutputStream.mo35621a(3, this.f27124j.mo34424b());
        }
        if ((this.f27121g & 8) == 8) {
            codedOutputStream.mo35635b(4, this.f27125k);
        }
        if ((this.f27121g & 16) == 16) {
            codedOutputStream.mo35635b(5, this.f27126l);
        }
        if ((this.f27121g & 32) == 32) {
            codedOutputStream.mo35621a(6, this.f27127m.mo34424b());
        }
        codedOutputStream.mo35638b(this.f27120f);
    }

    private C9839r0(boolean z) {
        this.f27128n = -1;
        this.f27129o = -1;
        this.f27120f = C10417d.f28215f;
    }

    private C9839r0(C10420e eVar, C10422f fVar) throws InvalidProtocolBufferException {
        this.f27128n = -1;
        this.f27129o = -1;
        m32619v();
        C10417d.C10419b j = C10417d.m35229j();
        CodedOutputStream a = CodedOutputStream.m35116a((OutputStream) j, 1);
        boolean z = false;
        while (!z) {
            try {
                int x = eVar.mo35733x();
                if (x != 0) {
                    if (x == 8) {
                        this.f27121g |= 1;
                        this.f27122h = eVar.mo35719j();
                    } else if (x == 16) {
                        this.f27121g |= 2;
                        this.f27123i = eVar.mo35719j();
                    } else if (x == 24) {
                        int f = eVar.mo35715f();
                        C9842c a2 = C9842c.m32664a(f);
                        if (a2 == null) {
                            a.mo35650f(x);
                            a.mo35650f(f);
                        } else {
                            this.f27121g |= 4;
                            this.f27124j = a2;
                        }
                    } else if (x == 32) {
                        this.f27121g |= 8;
                        this.f27125k = eVar.mo35719j();
                    } else if (x == 40) {
                        this.f27121g |= 16;
                        this.f27126l = eVar.mo35719j();
                    } else if (x == 48) {
                        int f2 = eVar.mo35715f();
                        C9844d a3 = C9844d.m32668a(f2);
                        if (a3 == null) {
                            a.mo35650f(x);
                            a.mo35650f(f2);
                        } else {
                            this.f27121g |= 32;
                            this.f27127m = a3;
                        }
                    } else if (!mo35759a(eVar, a, fVar, x)) {
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
                    this.f27120f = j.mo35696a();
                    throw th2;
                }
                this.f27120f = j.mo35696a();
                mo35760h();
                throw th;
            }
        }
        try {
            a.mo35614a();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f27120f = j.mo35696a();
            throw th3;
        }
        this.f27120f = j.mo35696a();
        mo35760h();
    }
}
