package kotlin.p045h0.p046u.p047e.p048k0.p240d;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.C10410a;
import kotlin.reflect.jvm.internal.impl.protobuf.C10413b;
import kotlin.reflect.jvm.internal.impl.protobuf.C10417d;
import kotlin.reflect.jvm.internal.impl.protobuf.C10420e;
import kotlin.reflect.jvm.internal.impl.protobuf.C10422f;
import kotlin.reflect.jvm.internal.impl.protobuf.C10427h;
import kotlin.reflect.jvm.internal.impl.protobuf.C10436i;
import kotlin.reflect.jvm.internal.impl.protobuf.C10449o;
import kotlin.reflect.jvm.internal.impl.protobuf.C10452q;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* renamed from: kotlin.h0.u.e.k0.d.l0 */
/* compiled from: ProtoBuf */
public final class C9811l0 extends C10427h.C10431d<C9811l0> implements C9817m0 {

    /* renamed from: r */
    private static final C9811l0 f26997r;

    /* renamed from: s */
    public static C10452q<C9811l0> f26998s = new C9812a();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C10417d f26999g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f27000h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f27001i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public int f27002j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f27003k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C9814c f27004l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public List<C9782g0> f27005m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public List<Integer> f27006n;

    /* renamed from: o */
    private int f27007o;

    /* renamed from: p */
    private byte f27008p;

    /* renamed from: q */
    private int f27009q;

    /* renamed from: kotlin.h0.u.e.k0.d.l0$a */
    /* compiled from: ProtoBuf */
    static class C9812a extends C10413b<C9811l0> {
        C9812a() {
        }

        /* renamed from: a */
        public C9811l0 m32274a(C10420e eVar, C10422f fVar) throws InvalidProtocolBufferException {
            return new C9811l0(eVar, fVar);
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.d.l0$c */
    /* compiled from: ProtoBuf */
    public enum C9814c implements C10436i.C10437a {
        IN(0, 0),
        OUT(1, 1),
        INV(2, 2);
        

        /* renamed from: f */
        private final int f27021f;

        /* renamed from: kotlin.h0.u.e.k0.d.l0$c$a */
        /* compiled from: ProtoBuf */
        static class C9815a implements C10436i.C10438b<C9814c> {
            C9815a() {
            }

            /* renamed from: a */
            public C9814c m32302a(int i) {
                return C9814c.m32299a(i);
            }
        }

        static {
            new C9815a();
        }

        private C9814c(int i, int i2) {
            this.f27021f = i2;
        }

        /* renamed from: a */
        public static C9814c m32299a(int i) {
            if (i == 0) {
                return IN;
            }
            if (i == 1) {
                return OUT;
            }
            if (i != 2) {
                return null;
            }
            return INV;
        }

        /* renamed from: b */
        public final int mo34424b() {
            return this.f27021f;
        }
    }

    static {
        C9811l0 l0Var = new C9811l0(true);
        f26997r = l0Var;
        l0Var.m32251z();
    }

    /* renamed from: A */
    public static C9813b m32238A() {
        return C9813b.m32276q();
    }

    /* renamed from: d */
    public static C9813b m32249d(C9811l0 l0Var) {
        C9813b A = m32238A();
        A.mo34656a(l0Var);
        return A;
    }

    /* renamed from: w */
    public static C9811l0 m32250w() {
        return f26997r;
    }

    /* renamed from: z */
    private void m32251z() {
        this.f27001i = 0;
        this.f27002j = 0;
        this.f27003k = false;
        this.f27004l = C9814c.INV;
        this.f27005m = Collections.emptyList();
        this.f27006n = Collections.emptyList();
    }

    /* renamed from: e */
    public int mo34361e() {
        int i = this.f27009q;
        if (i != -1) {
            return i;
        }
        int f = (this.f27000h & 1) == 1 ? CodedOutputStream.m35133f(1, this.f27001i) + 0 : 0;
        if ((this.f27000h & 2) == 2) {
            f += CodedOutputStream.m35133f(2, this.f27002j);
        }
        if ((this.f27000h & 4) == 4) {
            f += CodedOutputStream.m35123b(3, this.f27003k);
        }
        if ((this.f27000h & 8) == 8) {
            f += CodedOutputStream.m35132e(4, this.f27004l.mo34424b());
        }
        for (int i2 = 0; i2 < this.f27005m.size(); i2++) {
            f += CodedOutputStream.m35130d(5, (C10449o) this.f27005m.get(i2));
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f27006n.size(); i4++) {
            i3 += CodedOutputStream.m35140l(this.f27006n.get(i4).intValue());
        }
        int i5 = f + i3;
        if (!mo34647p().isEmpty()) {
            i5 = i5 + 1 + CodedOutputStream.m35140l(i3);
        }
        this.f27007o = i3;
        int j = i5 + mo35770j() + this.f26999g.size();
        this.f27009q = j;
        return j;
    }

    /* renamed from: g */
    public C10452q<C9811l0> mo34363g() {
        return f26998s;
    }

    public final boolean isInitialized() {
        byte b = this.f27008p;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!mo34650s()) {
            this.f27008p = 0;
            return false;
        } else if (!mo34651t()) {
            this.f27008p = 0;
            return false;
        } else {
            for (int i = 0; i < mo34646o(); i++) {
                if (!mo34642a(i).isInitialized()) {
                    this.f27008p = 0;
                    return false;
                }
            }
            if (!mo35769i()) {
                this.f27008p = 0;
                return false;
            }
            this.f27008p = 1;
            return true;
        }
    }

    /* renamed from: l */
    public int mo34643l() {
        return this.f27001i;
    }

    /* renamed from: m */
    public int mo34644m() {
        return this.f27002j;
    }

    /* renamed from: n */
    public boolean mo34645n() {
        return this.f27003k;
    }

    /* renamed from: o */
    public int mo34646o() {
        return this.f27005m.size();
    }

    /* renamed from: p */
    public List<Integer> mo34647p() {
        return this.f27006n;
    }

    /* renamed from: q */
    public List<C9782g0> mo34648q() {
        return this.f27005m;
    }

    /* renamed from: r */
    public C9814c mo34649r() {
        return this.f27004l;
    }

    /* renamed from: s */
    public boolean mo34650s() {
        return (this.f27000h & 1) == 1;
    }

    /* renamed from: t */
    public boolean mo34651t() {
        return (this.f27000h & 2) == 2;
    }

    /* renamed from: u */
    public boolean mo34652u() {
        return (this.f27000h & 4) == 4;
    }

    /* renamed from: v */
    public boolean mo34653v() {
        return (this.f27000h & 8) == 8;
    }

    /* renamed from: kotlin.h0.u.e.k0.d.l0$b */
    /* compiled from: ProtoBuf */
    public static final class C9813b extends C10427h.C10430c<C9811l0, C9813b> implements C9817m0 {

        /* renamed from: i */
        private int f27010i;

        /* renamed from: j */
        private int f27011j;

        /* renamed from: k */
        private int f27012k;

        /* renamed from: l */
        private boolean f27013l;

        /* renamed from: m */
        private C9814c f27014m = C9814c.INV;

        /* renamed from: n */
        private List<C9782g0> f27015n = Collections.emptyList();

        /* renamed from: o */
        private List<Integer> f27016o = Collections.emptyList();

        private C9813b() {
            m32279u();
        }

        /* access modifiers changed from: private */
        /* renamed from: q */
        public static C9813b m32276q() {
            return new C9813b();
        }

        /* renamed from: r */
        private void m32277r() {
            if ((this.f27010i & 32) != 32) {
                this.f27016o = new ArrayList(this.f27016o);
                this.f27010i |= 32;
            }
        }

        /* renamed from: s */
        private void m32278s() {
            if ((this.f27010i & 16) != 16) {
                this.f27015n = new ArrayList(this.f27015n);
                this.f27010i |= 16;
            }
        }

        /* renamed from: u */
        private void m32279u() {
        }

        /* renamed from: c */
        public C9813b mo34659c(int i) {
            this.f27010i |= 2;
            this.f27012k = i;
            return this;
        }

        public final boolean isInitialized() {
            if (!mo34660l() || !mo34661m()) {
                return false;
            }
            for (int i = 0; i < mo34503k(); i++) {
                if (!mo34654a(i).isInitialized()) {
                    return false;
                }
            }
            if (!mo35764i()) {
                return false;
            }
            return true;
        }

        /* renamed from: j */
        public C9811l0 mo34502j() {
            C9811l0 l0Var = new C9811l0((C10427h.C10430c) this);
            int i = this.f27010i;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            int unused = l0Var.f27001i = this.f27011j;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            int unused2 = l0Var.f27002j = this.f27012k;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            boolean unused3 = l0Var.f27003k = this.f27013l;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            C9814c unused4 = l0Var.f27004l = this.f27014m;
            if ((this.f27010i & 16) == 16) {
                this.f27015n = Collections.unmodifiableList(this.f27015n);
                this.f27010i &= -17;
            }
            List unused5 = l0Var.f27005m = this.f27015n;
            if ((this.f27010i & 32) == 32) {
                this.f27016o = Collections.unmodifiableList(this.f27016o);
                this.f27010i &= -33;
            }
            List unused6 = l0Var.f27006n = this.f27016o;
            int unused7 = l0Var.f27000h = i2;
            return l0Var;
        }

        /* renamed from: k */
        public int mo34503k() {
            return this.f27015n.size();
        }

        /* renamed from: l */
        public boolean mo34660l() {
            return (this.f27010i & 1) == 1;
        }

        /* renamed from: m */
        public boolean mo34661m() {
            return (this.f27010i & 2) == 2;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ C10427h.C10429b mo34379a(C10427h hVar) {
            mo34656a((C9811l0) hVar);
            return this;
        }

        /* renamed from: b */
        public C9811l0 m32293b() {
            return C9811l0.m32250w();
        }

        public C9813b clone() {
            C9813b q = m32276q();
            q.mo34656a(mo34502j());
            return q;
        }

        /* renamed from: b */
        public C9813b mo34658b(int i) {
            this.f27010i |= 1;
            this.f27011j = i;
            return this;
        }

        /* renamed from: a */
        public C9811l0 m32289a() {
            C9811l0 j = mo34502j();
            if (j.isInitialized()) {
                return j;
            }
            throw C10410a.C10411a.m35207a(j);
        }

        /* renamed from: a */
        public C9813b mo34656a(C9811l0 l0Var) {
            if (l0Var == C9811l0.m32250w()) {
                return this;
            }
            if (l0Var.mo34650s()) {
                mo34658b(l0Var.mo34643l());
            }
            if (l0Var.mo34651t()) {
                mo34659c(l0Var.mo34644m());
            }
            if (l0Var.mo34652u()) {
                mo34657a(l0Var.mo34645n());
            }
            if (l0Var.mo34653v()) {
                mo34655a(l0Var.mo34649r());
            }
            if (!l0Var.f27005m.isEmpty()) {
                if (this.f27015n.isEmpty()) {
                    this.f27015n = l0Var.f27005m;
                    this.f27010i &= -17;
                } else {
                    m32278s();
                    this.f27015n.addAll(l0Var.f27005m);
                }
            }
            if (!l0Var.f27006n.isEmpty()) {
                if (this.f27016o.isEmpty()) {
                    this.f27016o = l0Var.f27006n;
                    this.f27010i &= -33;
                } else {
                    m32277r();
                    this.f27016o.addAll(l0Var.f27006n);
                }
            }
            mo35763a(l0Var);
            mo35761a(mo35762h().mo35686b(l0Var.f26999g));
            return this;
        }

        /* renamed from: a */
        public C9813b mo34377a(C10420e eVar, C10422f fVar) throws IOException {
            C9811l0 l0Var;
            C9811l0 l0Var2 = null;
            try {
                C9811l0 a = C9811l0.f26998s.mo34369a(eVar, fVar);
                if (a != null) {
                    mo34656a(a);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                l0Var = (C9811l0) e.mo35657a();
                throw e;
            } catch (Throwable th) {
                th = th;
                l0Var2 = l0Var;
            }
            if (l0Var2 != null) {
                mo34656a(l0Var2);
            }
            throw th;
        }

        /* renamed from: a */
        public C9813b mo34657a(boolean z) {
            this.f27010i |= 4;
            this.f27013l = z;
            return this;
        }

        /* renamed from: a */
        public C9813b mo34655a(C9814c cVar) {
            if (cVar != null) {
                this.f27010i |= 8;
                this.f27014m = cVar;
                return this;
            }
            throw null;
        }

        /* renamed from: a */
        public C9782g0 mo34654a(int i) {
            return this.f27015n.get(i);
        }
    }

    /* renamed from: f */
    public C9813b m32260f() {
        return m32238A();
    }

    private C9811l0(C10427h.C10430c<C9811l0, ?> cVar) {
        super(cVar);
        this.f27007o = -1;
        this.f27008p = -1;
        this.f27009q = -1;
        this.f26999g = cVar.mo35762h();
    }

    /* renamed from: c */
    public C9813b m32257c() {
        return m32249d(this);
    }

    /* renamed from: b */
    public C9811l0 m32255b() {
        return f26997r;
    }

    /* renamed from: a */
    public C9782g0 mo34642a(int i) {
        return this.f27005m.get(i);
    }

    /* renamed from: a */
    public void mo34358a(CodedOutputStream codedOutputStream) throws IOException {
        mo34361e();
        C10427h.C10431d<MessageType>.C0000a k = mo35771k();
        if ((this.f27000h & 1) == 1) {
            codedOutputStream.mo35635b(1, this.f27001i);
        }
        if ((this.f27000h & 2) == 2) {
            codedOutputStream.mo35635b(2, this.f27002j);
        }
        if ((this.f27000h & 4) == 4) {
            codedOutputStream.mo35625a(3, this.f27003k);
        }
        if ((this.f27000h & 8) == 8) {
            codedOutputStream.mo35621a(4, this.f27004l.mo34424b());
        }
        for (int i = 0; i < this.f27005m.size(); i++) {
            codedOutputStream.mo35636b(5, (C10449o) this.f27005m.get(i));
        }
        if (mo34647p().size() > 0) {
            codedOutputStream.mo35650f(50);
            codedOutputStream.mo35650f(this.f27007o);
        }
        for (int i2 = 0; i2 < this.f27006n.size(); i2++) {
            codedOutputStream.mo35641c(this.f27006n.get(i2).intValue());
        }
        k.mo35772a(1000, codedOutputStream);
        codedOutputStream.mo35638b(this.f26999g);
    }

    private C9811l0(boolean z) {
        this.f27007o = -1;
        this.f27008p = -1;
        this.f27009q = -1;
        this.f26999g = C10417d.f28215f;
    }

    private C9811l0(C10420e eVar, C10422f fVar) throws InvalidProtocolBufferException {
        this.f27007o = -1;
        this.f27008p = -1;
        this.f27009q = -1;
        m32251z();
        C10417d.C10419b j = C10417d.m35229j();
        CodedOutputStream a = CodedOutputStream.m35116a((OutputStream) j, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int x = eVar.mo35733x();
                if (x != 0) {
                    if (x == 8) {
                        this.f27000h |= 1;
                        this.f27001i = eVar.mo35719j();
                    } else if (x == 16) {
                        this.f27000h |= 2;
                        this.f27002j = eVar.mo35719j();
                    } else if (x == 24) {
                        this.f27000h |= 4;
                        this.f27003k = eVar.mo35711c();
                    } else if (x == 32) {
                        int f = eVar.mo35715f();
                        C9814c a2 = C9814c.m32299a(f);
                        if (a2 == null) {
                            a.mo35650f(x);
                            a.mo35650f(f);
                        } else {
                            this.f27000h |= 8;
                            this.f27004l = a2;
                        }
                    } else if (x == 42) {
                        if (!(z2 & true)) {
                            this.f27005m = new ArrayList();
                            z2 |= true;
                        }
                        this.f27005m.add(eVar.mo35702a(C9782g0.f26873z, fVar));
                    } else if (x == 48) {
                        if (!(z2 & true)) {
                            this.f27006n = new ArrayList();
                            z2 |= true;
                        }
                        this.f27006n.add(Integer.valueOf(eVar.mo35719j()));
                    } else if (x == 50) {
                        int c = eVar.mo35710c(eVar.mo35724o());
                        if (!(z2 & true) && eVar.mo35701a() > 0) {
                            this.f27006n = new ArrayList();
                            z2 |= true;
                        }
                        while (eVar.mo35701a() > 0) {
                            this.f27006n.add(Integer.valueOf(eVar.mo35719j()));
                        }
                        eVar.mo35708b(c);
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
                if (z2 & true) {
                    this.f27005m = Collections.unmodifiableList(this.f27005m);
                }
                if (z2 & true) {
                    this.f27006n = Collections.unmodifiableList(this.f27006n);
                }
                try {
                    a.mo35614a();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f26999g = j.mo35696a();
                    throw th2;
                }
                this.f26999g = j.mo35696a();
                mo35760h();
                throw th;
            }
        }
        if (z2 & true) {
            this.f27005m = Collections.unmodifiableList(this.f27005m);
        }
        if (z2 & true) {
            this.f27006n = Collections.unmodifiableList(this.f27006n);
        }
        try {
            a.mo35614a();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f26999g = j.mo35696a();
            throw th3;
        }
        this.f26999g = j.mo35696a();
        mo35760h();
    }
}
