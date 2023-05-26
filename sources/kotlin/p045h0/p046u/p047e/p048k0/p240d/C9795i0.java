package kotlin.p045h0.p046u.p047e.p048k0.p240d;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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

/* renamed from: kotlin.h0.u.e.k0.d.i0 */
/* compiled from: ProtoBuf */
public final class C9795i0 extends C10427h.C10431d<C9795i0> implements C9801j0 {

    /* renamed from: t */
    private static final C9795i0 f26939t;

    /* renamed from: u */
    public static C10452q<C9795i0> f26940u = new C9796a();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C10417d f26941g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f26942h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f26943i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public int f26944j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public List<C9811l0> f26945k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C9782g0 f26946l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public int f26947m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public C9782g0 f26948n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public int f26949o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public List<C9748b> f26950p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public List<Integer> f26951q;

    /* renamed from: r */
    private byte f26952r;

    /* renamed from: s */
    private int f26953s;

    /* renamed from: kotlin.h0.u.e.k0.d.i0$a */
    /* compiled from: ProtoBuf */
    static class C9796a extends C10413b<C9795i0> {
        C9796a() {
        }

        /* renamed from: a */
        public C9795i0 m32108a(C10420e eVar, C10422f fVar) throws InvalidProtocolBufferException {
            return new C9795i0(eVar, fVar);
        }
    }

    static {
        C9795i0 i0Var = new C9795i0(true);
        f26939t = i0Var;
        i0Var.m32061F();
    }

    /* renamed from: E */
    public static C9795i0 m32060E() {
        return f26939t;
    }

    /* renamed from: F */
    private void m32061F() {
        this.f26943i = 6;
        this.f26944j = 0;
        this.f26945k = Collections.emptyList();
        this.f26946l = C9782g0.m31867P();
        this.f26947m = 0;
        this.f26948n = C9782g0.m31867P();
        this.f26949o = 0;
        this.f26950p = Collections.emptyList();
        this.f26951q = Collections.emptyList();
    }

    /* renamed from: G */
    public static C9797b m32062G() {
        return C9797b.m32111w();
    }

    /* renamed from: A */
    public boolean mo34585A() {
        return (this.f26942h & 1) == 1;
    }

    /* renamed from: B */
    public boolean mo34586B() {
        return (this.f26942h & 2) == 2;
    }

    /* renamed from: C */
    public boolean mo34587C() {
        return (this.f26942h & 4) == 4;
    }

    /* renamed from: D */
    public boolean mo34588D() {
        return (this.f26942h & 8) == 8;
    }

    /* renamed from: g */
    public C10452q<C9795i0> mo34363g() {
        return f26940u;
    }

    public final boolean isInitialized() {
        byte b = this.f26952r;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!mo34586B()) {
            this.f26952r = 0;
            return false;
        }
        for (int i = 0; i < mo34597r(); i++) {
            if (!mo34590b(i).isInitialized()) {
                this.f26952r = 0;
                return false;
            }
        }
        if (mo34587C() && !mo34599t().isInitialized()) {
            this.f26952r = 0;
            return false;
        } else if (!mo34602w() || mo34593n().isInitialized()) {
            for (int i2 = 0; i2 < mo34591l(); i2++) {
                if (!mo34589a(i2).isInitialized()) {
                    this.f26952r = 0;
                    return false;
                }
            }
            if (!mo35769i()) {
                this.f26952r = 0;
                return false;
            }
            this.f26952r = 1;
            return true;
        } else {
            this.f26952r = 0;
            return false;
        }
    }

    /* renamed from: l */
    public int mo34591l() {
        return this.f26950p.size();
    }

    /* renamed from: m */
    public List<C9748b> mo34592m() {
        return this.f26950p;
    }

    /* renamed from: n */
    public C9782g0 mo34593n() {
        return this.f26948n;
    }

    /* renamed from: o */
    public int mo34594o() {
        return this.f26949o;
    }

    /* renamed from: p */
    public int mo34595p() {
        return this.f26943i;
    }

    /* renamed from: q */
    public int mo34596q() {
        return this.f26944j;
    }

    /* renamed from: r */
    public int mo34597r() {
        return this.f26945k.size();
    }

    /* renamed from: s */
    public List<C9811l0> mo34598s() {
        return this.f26945k;
    }

    /* renamed from: t */
    public C9782g0 mo34599t() {
        return this.f26946l;
    }

    /* renamed from: u */
    public int mo34600u() {
        return this.f26947m;
    }

    /* renamed from: v */
    public List<Integer> mo34601v() {
        return this.f26951q;
    }

    /* renamed from: w */
    public boolean mo34602w() {
        return (this.f26942h & 16) == 16;
    }

    /* renamed from: z */
    public boolean mo34603z() {
        return (this.f26942h & 32) == 32;
    }

    /* renamed from: kotlin.h0.u.e.k0.d.i0$b */
    /* compiled from: ProtoBuf */
    public static final class C9797b extends C10427h.C10430c<C9795i0, C9797b> implements C9801j0 {

        /* renamed from: i */
        private int f26954i;

        /* renamed from: j */
        private int f26955j = 6;

        /* renamed from: k */
        private int f26956k;

        /* renamed from: l */
        private List<C9811l0> f26957l = Collections.emptyList();

        /* renamed from: m */
        private C9782g0 f26958m = C9782g0.m31867P();

        /* renamed from: n */
        private int f26959n;

        /* renamed from: o */
        private C9782g0 f26960o = C9782g0.m31867P();

        /* renamed from: p */
        private int f26961p;

        /* renamed from: q */
        private List<C9748b> f26962q = Collections.emptyList();

        /* renamed from: r */
        private List<Integer> f26963r = Collections.emptyList();

        private C9797b() {
            m32109A();
        }

        /* renamed from: A */
        private void m32109A() {
        }

        /* access modifiers changed from: private */
        /* renamed from: w */
        public static C9797b m32111w() {
            return new C9797b();
        }

        /* renamed from: x */
        private void m32112x() {
            if ((this.f26954i & 128) != 128) {
                this.f26962q = new ArrayList(this.f26962q);
                this.f26954i |= 128;
            }
        }

        /* renamed from: y */
        private void m32113y() {
            if ((this.f26954i & 4) != 4) {
                this.f26957l = new ArrayList(this.f26957l);
                this.f26954i |= 4;
            }
        }

        /* renamed from: z */
        private void m32114z() {
            if ((this.f26954i & 256) != 256) {
                this.f26963r = new ArrayList(this.f26963r);
                this.f26954i |= 256;
            }
        }

        /* renamed from: c */
        public C9797b mo34609c(int i) {
            this.f26954i |= 64;
            this.f26961p = i;
            return this;
        }

        /* renamed from: d */
        public C9797b mo34610d(int i) {
            this.f26954i |= 1;
            this.f26955j = i;
            return this;
        }

        /* renamed from: e */
        public C9797b mo34611e(int i) {
            this.f26954i |= 2;
            this.f26956k = i;
            return this;
        }

        /* renamed from: f */
        public C9797b mo34612f(int i) {
            this.f26954i |= 16;
            this.f26959n = i;
            return this;
        }

        public final boolean isInitialized() {
            if (!mo34617r()) {
                return false;
            }
            for (int i = 0; i < mo34614m(); i++) {
                if (!mo34608b(i).isInitialized()) {
                    return false;
                }
            }
            if (mo34618s() && !mo34615n().isInitialized()) {
                return false;
            }
            if (mo34616q() && !mo34613l().isInitialized()) {
                return false;
            }
            for (int i2 = 0; i2 < mo34503k(); i2++) {
                if (!mo34604a(i2).isInitialized()) {
                    return false;
                }
            }
            if (!mo35764i()) {
                return false;
            }
            return true;
        }

        /* renamed from: j */
        public C9795i0 mo34502j() {
            C9795i0 i0Var = new C9795i0((C10427h.C10430c) this);
            int i = this.f26954i;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            int unused = i0Var.f26943i = this.f26955j;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            int unused2 = i0Var.f26944j = this.f26956k;
            if ((this.f26954i & 4) == 4) {
                this.f26957l = Collections.unmodifiableList(this.f26957l);
                this.f26954i &= -5;
            }
            List unused3 = i0Var.f26945k = this.f26957l;
            if ((i & 8) == 8) {
                i2 |= 4;
            }
            C9782g0 unused4 = i0Var.f26946l = this.f26958m;
            if ((i & 16) == 16) {
                i2 |= 8;
            }
            int unused5 = i0Var.f26947m = this.f26959n;
            if ((i & 32) == 32) {
                i2 |= 16;
            }
            C9782g0 unused6 = i0Var.f26948n = this.f26960o;
            if ((i & 64) == 64) {
                i2 |= 32;
            }
            int unused7 = i0Var.f26949o = this.f26961p;
            if ((this.f26954i & 128) == 128) {
                this.f26962q = Collections.unmodifiableList(this.f26962q);
                this.f26954i &= -129;
            }
            List unused8 = i0Var.f26950p = this.f26962q;
            if ((this.f26954i & 256) == 256) {
                this.f26963r = Collections.unmodifiableList(this.f26963r);
                this.f26954i &= -257;
            }
            List unused9 = i0Var.f26951q = this.f26963r;
            int unused10 = i0Var.f26942h = i2;
            return i0Var;
        }

        /* renamed from: k */
        public int mo34503k() {
            return this.f26962q.size();
        }

        /* renamed from: l */
        public C9782g0 mo34613l() {
            return this.f26960o;
        }

        /* renamed from: m */
        public int mo34614m() {
            return this.f26957l.size();
        }

        /* renamed from: n */
        public C9782g0 mo34615n() {
            return this.f26958m;
        }

        /* renamed from: q */
        public boolean mo34616q() {
            return (this.f26954i & 32) == 32;
        }

        /* renamed from: r */
        public boolean mo34617r() {
            return (this.f26954i & 2) == 2;
        }

        /* renamed from: s */
        public boolean mo34618s() {
            return (this.f26954i & 8) == 8;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ C10427h.C10429b mo34379a(C10427h hVar) {
            mo34606a((C9795i0) hVar);
            return this;
        }

        /* renamed from: b */
        public C9795i0 m32128b() {
            return C9795i0.m32060E();
        }

        public C9797b clone() {
            C9797b w = m32111w();
            w.mo34606a(mo34502j());
            return w;
        }

        /* renamed from: b */
        public C9811l0 mo34608b(int i) {
            return this.f26957l.get(i);
        }

        /* renamed from: a */
        public C9795i0 m32123a() {
            C9795i0 j = mo34502j();
            if (j.isInitialized()) {
                return j;
            }
            throw C10410a.C10411a.m35207a(j);
        }

        /* renamed from: b */
        public C9797b mo34607b(C9782g0 g0Var) {
            if ((this.f26954i & 8) != 8 || this.f26958m == C9782g0.m31867P()) {
                this.f26958m = g0Var;
            } else {
                this.f26958m = C9782g0.m31879c(this.f26958m).mo34379a(g0Var).mo34502j();
            }
            this.f26954i |= 8;
            return this;
        }

        /* renamed from: a */
        public C9797b mo34606a(C9795i0 i0Var) {
            if (i0Var == C9795i0.m32060E()) {
                return this;
            }
            if (i0Var.mo34585A()) {
                mo34610d(i0Var.mo34595p());
            }
            if (i0Var.mo34586B()) {
                mo34611e(i0Var.mo34596q());
            }
            if (!i0Var.f26945k.isEmpty()) {
                if (this.f26957l.isEmpty()) {
                    this.f26957l = i0Var.f26945k;
                    this.f26954i &= -5;
                } else {
                    m32113y();
                    this.f26957l.addAll(i0Var.f26945k);
                }
            }
            if (i0Var.mo34587C()) {
                mo34607b(i0Var.mo34599t());
            }
            if (i0Var.mo34588D()) {
                mo34612f(i0Var.mo34600u());
            }
            if (i0Var.mo34602w()) {
                mo34605a(i0Var.mo34593n());
            }
            if (i0Var.mo34603z()) {
                mo34609c(i0Var.mo34594o());
            }
            if (!i0Var.f26950p.isEmpty()) {
                if (this.f26962q.isEmpty()) {
                    this.f26962q = i0Var.f26950p;
                    this.f26954i &= -129;
                } else {
                    m32112x();
                    this.f26962q.addAll(i0Var.f26950p);
                }
            }
            if (!i0Var.f26951q.isEmpty()) {
                if (this.f26963r.isEmpty()) {
                    this.f26963r = i0Var.f26951q;
                    this.f26954i &= -257;
                } else {
                    m32114z();
                    this.f26963r.addAll(i0Var.f26951q);
                }
            }
            mo35763a(i0Var);
            mo35761a(mo35762h().mo35686b(i0Var.f26941g));
            return this;
        }

        /* renamed from: a */
        public C9797b mo34377a(C10420e eVar, C10422f fVar) throws IOException {
            C9795i0 i0Var;
            C9795i0 i0Var2 = null;
            try {
                C9795i0 a = C9795i0.f26940u.mo34369a(eVar, fVar);
                if (a != null) {
                    mo34606a(a);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                i0Var = (C9795i0) e.mo35657a();
                throw e;
            } catch (Throwable th) {
                th = th;
                i0Var2 = i0Var;
            }
            if (i0Var2 != null) {
                mo34606a(i0Var2);
            }
            throw th;
        }

        /* renamed from: a */
        public C9797b mo34605a(C9782g0 g0Var) {
            if ((this.f26954i & 32) != 32 || this.f26960o == C9782g0.m31867P()) {
                this.f26960o = g0Var;
            } else {
                this.f26960o = C9782g0.m31879c(this.f26960o).mo34379a(g0Var).mo34502j();
            }
            this.f26954i |= 32;
            return this;
        }

        /* renamed from: a */
        public C9748b mo34604a(int i) {
            return this.f26962q.get(i);
        }
    }

    /* renamed from: e */
    public int mo34361e() {
        int i = this.f26953s;
        if (i != -1) {
            return i;
        }
        int f = (this.f26942h & 1) == 1 ? CodedOutputStream.m35133f(1, this.f26943i) + 0 : 0;
        if ((this.f26942h & 2) == 2) {
            f += CodedOutputStream.m35133f(2, this.f26944j);
        }
        for (int i2 = 0; i2 < this.f26945k.size(); i2++) {
            f += CodedOutputStream.m35130d(3, (C10449o) this.f26945k.get(i2));
        }
        if ((this.f26942h & 4) == 4) {
            f += CodedOutputStream.m35130d(4, (C10449o) this.f26946l);
        }
        if ((this.f26942h & 8) == 8) {
            f += CodedOutputStream.m35133f(5, this.f26947m);
        }
        if ((this.f26942h & 16) == 16) {
            f += CodedOutputStream.m35130d(6, (C10449o) this.f26948n);
        }
        if ((this.f26942h & 32) == 32) {
            f += CodedOutputStream.m35133f(7, this.f26949o);
        }
        for (int i3 = 0; i3 < this.f26950p.size(); i3++) {
            f += CodedOutputStream.m35130d(8, (C10449o) this.f26950p.get(i3));
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.f26951q.size(); i5++) {
            i4 += CodedOutputStream.m35140l(this.f26951q.get(i5).intValue());
        }
        int size = f + i4 + (mo34601v().size() * 2) + mo35770j() + this.f26941g.size();
        this.f26953s = size;
        return size;
    }

    /* renamed from: f */
    public C9797b m32092f() {
        return m32062G();
    }

    private C9795i0(C10427h.C10430c<C9795i0, ?> cVar) {
        super(cVar);
        this.f26952r = -1;
        this.f26953s = -1;
        this.f26941g = cVar.mo35762h();
    }

    /* renamed from: a */
    public C9748b mo34589a(int i) {
        return this.f26950p.get(i);
    }

    /* renamed from: c */
    public C9797b m32089c() {
        return m32078e(this);
    }

    /* renamed from: a */
    public void mo34358a(CodedOutputStream codedOutputStream) throws IOException {
        mo34361e();
        C10427h.C10431d<MessageType>.C0000a k = mo35771k();
        if ((this.f26942h & 1) == 1) {
            codedOutputStream.mo35635b(1, this.f26943i);
        }
        if ((this.f26942h & 2) == 2) {
            codedOutputStream.mo35635b(2, this.f26944j);
        }
        for (int i = 0; i < this.f26945k.size(); i++) {
            codedOutputStream.mo35636b(3, (C10449o) this.f26945k.get(i));
        }
        if ((this.f26942h & 4) == 4) {
            codedOutputStream.mo35636b(4, (C10449o) this.f26946l);
        }
        if ((this.f26942h & 8) == 8) {
            codedOutputStream.mo35635b(5, this.f26947m);
        }
        if ((this.f26942h & 16) == 16) {
            codedOutputStream.mo35636b(6, (C10449o) this.f26948n);
        }
        if ((this.f26942h & 32) == 32) {
            codedOutputStream.mo35635b(7, this.f26949o);
        }
        for (int i2 = 0; i2 < this.f26950p.size(); i2++) {
            codedOutputStream.mo35636b(8, (C10449o) this.f26950p.get(i2));
        }
        for (int i3 = 0; i3 < this.f26951q.size(); i3++) {
            codedOutputStream.mo35635b(31, this.f26951q.get(i3).intValue());
        }
        k.mo35772a(200, codedOutputStream);
        codedOutputStream.mo35638b(this.f26941g);
    }

    /* renamed from: b */
    public C9795i0 m32087b() {
        return f26939t;
    }

    private C9795i0(boolean z) {
        this.f26952r = -1;
        this.f26953s = -1;
        this.f26941g = C10417d.f28215f;
    }

    /* renamed from: b */
    public C9811l0 mo34590b(int i) {
        return this.f26945k.get(i);
    }

    private C9795i0(C10420e eVar, C10422f fVar) throws InvalidProtocolBufferException {
        this.f26952r = -1;
        this.f26953s = -1;
        m32061F();
        C10417d.C10419b j = C10417d.m35229j();
        CodedOutputStream a = CodedOutputStream.m35116a((OutputStream) j, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int x = eVar.mo35733x();
                C9782g0.C9789c cVar = null;
                switch (x) {
                    case 0:
                        z = true;
                        break;
                    case 8:
                        this.f26942h |= 1;
                        this.f26943i = eVar.mo35719j();
                        break;
                    case 16:
                        this.f26942h |= 2;
                        this.f26944j = eVar.mo35719j();
                        break;
                    case 26:
                        if (!(z2 & true)) {
                            this.f26945k = new ArrayList();
                            z2 |= true;
                        }
                        this.f26945k.add(eVar.mo35702a(C9811l0.f26998s, fVar));
                        break;
                    case 34:
                        cVar = (this.f26942h & 4) == 4 ? this.f26946l.m31908c() : cVar;
                        C9782g0 g0Var = (C9782g0) eVar.mo35702a(C9782g0.f26873z, fVar);
                        this.f26946l = g0Var;
                        if (cVar != null) {
                            cVar.mo34379a(g0Var);
                            this.f26946l = cVar.mo34502j();
                        }
                        this.f26942h |= 4;
                        break;
                    case 40:
                        this.f26942h |= 8;
                        this.f26947m = eVar.mo35719j();
                        break;
                    case 50:
                        cVar = (this.f26942h & 16) == 16 ? this.f26948n.m31908c() : cVar;
                        C9782g0 g0Var2 = (C9782g0) eVar.mo35702a(C9782g0.f26873z, fVar);
                        this.f26948n = g0Var2;
                        if (cVar != null) {
                            cVar.mo34379a(g0Var2);
                            this.f26948n = cVar.mo34502j();
                        }
                        this.f26942h |= 16;
                        break;
                    case 56:
                        this.f26942h |= 32;
                        this.f26949o = eVar.mo35719j();
                        break;
                    case 66:
                        if (!(z2 & true)) {
                            this.f26950p = new ArrayList();
                            z2 |= true;
                        }
                        this.f26950p.add(eVar.mo35702a(C9748b.f26722m, fVar));
                        break;
                    case 248:
                        if (!(z2 & true)) {
                            this.f26951q = new ArrayList();
                            z2 |= true;
                        }
                        this.f26951q.add(Integer.valueOf(eVar.mo35719j()));
                        break;
                    case 250:
                        int c = eVar.mo35710c(eVar.mo35724o());
                        if (!(z2 & true) && eVar.mo35701a() > 0) {
                            this.f26951q = new ArrayList();
                            z2 |= true;
                        }
                        while (eVar.mo35701a() > 0) {
                            this.f26951q.add(Integer.valueOf(eVar.mo35719j()));
                        }
                        eVar.mo35708b(c);
                        break;
                    default:
                        if (mo35759a(eVar, a, fVar, x)) {
                            break;
                        }
                        z = true;
                        break;
                }
            } catch (InvalidProtocolBufferException e) {
                e.mo35656a(this);
                throw e;
            } catch (IOException e2) {
                InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                invalidProtocolBufferException.mo35656a(this);
                throw invalidProtocolBufferException;
            } catch (Throwable th) {
                if (z2 & true) {
                    this.f26945k = Collections.unmodifiableList(this.f26945k);
                }
                if (z2 & true) {
                    this.f26950p = Collections.unmodifiableList(this.f26950p);
                }
                if (z2 & true) {
                    this.f26951q = Collections.unmodifiableList(this.f26951q);
                }
                try {
                    a.mo35614a();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f26941g = j.mo35696a();
                    throw th2;
                }
                this.f26941g = j.mo35696a();
                mo35760h();
                throw th;
            }
        }
        if (z2 & true) {
            this.f26945k = Collections.unmodifiableList(this.f26945k);
        }
        if (z2 & true) {
            this.f26950p = Collections.unmodifiableList(this.f26950p);
        }
        if (z2 & true) {
            this.f26951q = Collections.unmodifiableList(this.f26951q);
        }
        try {
            a.mo35614a();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f26941g = j.mo35696a();
            throw th3;
        }
        this.f26941g = j.mo35696a();
        mo35760h();
    }

    /* renamed from: e */
    public static C9797b m32078e(C9795i0 i0Var) {
        C9797b G = m32062G();
        G.mo34606a(i0Var);
        return G;
    }

    /* renamed from: a */
    public static C9795i0 m32067a(InputStream inputStream, C10422f fVar) throws IOException {
        return f26940u.mo35667b(inputStream, fVar);
    }
}
