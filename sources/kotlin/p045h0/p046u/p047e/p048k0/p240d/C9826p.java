package kotlin.p045h0.p046u.p047e.p048k0.p240d;

import java.io.IOException;
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
import kotlin.reflect.jvm.internal.impl.protobuf.C10436i;
import kotlin.reflect.jvm.internal.impl.protobuf.C10449o;
import kotlin.reflect.jvm.internal.impl.protobuf.C10452q;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* renamed from: kotlin.h0.u.e.k0.d.p */
/* compiled from: ProtoBuf */
public final class C9826p extends C10427h implements C9834q {

    /* renamed from: q */
    private static final C9826p f27042q;

    /* renamed from: r */
    public static C10452q<C9826p> f27043r = new C9827a();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C10417d f27044f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f27045g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f27046h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f27047i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C9829c f27048j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C9782g0 f27049k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f27050l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public List<C9826p> f27051m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public List<C9826p> f27052n;

    /* renamed from: o */
    private byte f27053o;

    /* renamed from: p */
    private int f27054p;

    /* renamed from: kotlin.h0.u.e.k0.d.p$a */
    /* compiled from: ProtoBuf */
    static class C9827a extends C10413b<C9826p> {
        C9827a() {
        }

        /* renamed from: a */
        public C9826p m32420a(C10420e eVar, C10422f fVar) throws InvalidProtocolBufferException {
            return new C9826p(eVar, fVar);
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.d.p$c */
    /* compiled from: ProtoBuf */
    public enum C9829c implements C10436i.C10437a {
        TRUE(0, 0),
        FALSE(1, 1),
        NULL(2, 2);
        

        /* renamed from: f */
        private final int f27067f;

        /* renamed from: kotlin.h0.u.e.k0.d.p$c$a */
        /* compiled from: ProtoBuf */
        static class C9830a implements C10436i.C10438b<C9829c> {
            C9830a() {
            }

            /* renamed from: a */
            public C9829c m32451a(int i) {
                return C9829c.m32448a(i);
            }
        }

        static {
            new C9830a();
        }

        private C9829c(int i, int i2) {
            this.f27067f = i2;
        }

        /* renamed from: a */
        public static C9829c m32448a(int i) {
            if (i == 0) {
                return TRUE;
            }
            if (i == 1) {
                return FALSE;
            }
            if (i != 2) {
                return null;
            }
            return NULL;
        }

        /* renamed from: b */
        public final int mo34424b() {
            return this.f27067f;
        }
    }

    static {
        C9826p pVar = new C9826p(true);
        f27042q = pVar;
        pVar.m32394v();
    }

    /* renamed from: u */
    public static C9826p m32393u() {
        return f27042q;
    }

    /* renamed from: v */
    private void m32394v() {
        this.f27046h = 0;
        this.f27047i = 0;
        this.f27048j = C9829c.TRUE;
        this.f27049k = C9782g0.m31867P();
        this.f27050l = 0;
        this.f27051m = Collections.emptyList();
        this.f27052n = Collections.emptyList();
    }

    /* renamed from: w */
    public static C9828b m32395w() {
        return C9828b.m32422q();
    }

    /* renamed from: e */
    public int mo34361e() {
        int i = this.f27054p;
        if (i != -1) {
            return i;
        }
        int f = (this.f27045g & 1) == 1 ? CodedOutputStream.m35133f(1, this.f27046h) + 0 : 0;
        if ((this.f27045g & 2) == 2) {
            f += CodedOutputStream.m35133f(2, this.f27047i);
        }
        if ((this.f27045g & 4) == 4) {
            f += CodedOutputStream.m35132e(3, this.f27048j.mo34424b());
        }
        if ((this.f27045g & 8) == 8) {
            f += CodedOutputStream.m35130d(4, (C10449o) this.f27049k);
        }
        if ((this.f27045g & 16) == 16) {
            f += CodedOutputStream.m35133f(5, this.f27050l);
        }
        for (int i2 = 0; i2 < this.f27051m.size(); i2++) {
            f += CodedOutputStream.m35130d(6, (C10449o) this.f27051m.get(i2));
        }
        for (int i3 = 0; i3 < this.f27052n.size(); i3++) {
            f += CodedOutputStream.m35130d(7, (C10449o) this.f27052n.get(i3));
        }
        int size = f + this.f27044f.size();
        this.f27054p = size;
        return size;
    }

    /* renamed from: g */
    public C10452q<C9826p> mo34363g() {
        return f27043r;
    }

    /* renamed from: i */
    public int mo34678i() {
        return this.f27051m.size();
    }

    public final boolean isInitialized() {
        byte b = this.f27053o;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!mo34687r() || mo34681l().isInitialized()) {
            for (int i = 0; i < mo34678i(); i++) {
                if (!mo34676a(i).isInitialized()) {
                    this.f27053o = 0;
                    return false;
                }
            }
            for (int i2 = 0; i2 < mo34683n(); i2++) {
                if (!mo34677b(i2).isInitialized()) {
                    this.f27053o = 0;
                    return false;
                }
            }
            this.f27053o = 1;
            return true;
        }
        this.f27053o = 0;
        return false;
    }

    /* renamed from: j */
    public C9829c mo34679j() {
        return this.f27048j;
    }

    /* renamed from: k */
    public int mo34680k() {
        return this.f27046h;
    }

    /* renamed from: l */
    public C9782g0 mo34681l() {
        return this.f27049k;
    }

    /* renamed from: m */
    public int mo34682m() {
        return this.f27050l;
    }

    /* renamed from: n */
    public int mo34683n() {
        return this.f27052n.size();
    }

    /* renamed from: o */
    public int mo34684o() {
        return this.f27047i;
    }

    /* renamed from: p */
    public boolean mo34685p() {
        return (this.f27045g & 4) == 4;
    }

    /* renamed from: q */
    public boolean mo34686q() {
        return (this.f27045g & 1) == 1;
    }

    /* renamed from: r */
    public boolean mo34687r() {
        return (this.f27045g & 8) == 8;
    }

    /* renamed from: s */
    public boolean mo34688s() {
        return (this.f27045g & 16) == 16;
    }

    /* renamed from: t */
    public boolean mo34689t() {
        return (this.f27045g & 2) == 2;
    }

    /* renamed from: kotlin.h0.u.e.k0.d.p$b */
    /* compiled from: ProtoBuf */
    public static final class C9828b extends C10427h.C10429b<C9826p, C9828b> implements C9834q {

        /* renamed from: g */
        private int f27055g;

        /* renamed from: h */
        private int f27056h;

        /* renamed from: i */
        private int f27057i;

        /* renamed from: j */
        private C9829c f27058j = C9829c.TRUE;

        /* renamed from: k */
        private C9782g0 f27059k = C9782g0.m31867P();

        /* renamed from: l */
        private int f27060l;

        /* renamed from: m */
        private List<C9826p> f27061m = Collections.emptyList();

        /* renamed from: n */
        private List<C9826p> f27062n = Collections.emptyList();

        private C9828b() {
            m32425u();
        }

        /* access modifiers changed from: private */
        /* renamed from: q */
        public static C9828b m32422q() {
            return new C9828b();
        }

        /* renamed from: r */
        private void m32423r() {
            if ((this.f27055g & 32) != 32) {
                this.f27061m = new ArrayList(this.f27061m);
                this.f27055g |= 32;
            }
        }

        /* renamed from: s */
        private void m32424s() {
            if ((this.f27055g & 64) != 64) {
                this.f27062n = new ArrayList(this.f27062n);
                this.f27055g |= 64;
            }
        }

        /* renamed from: u */
        private void m32425u() {
        }

        /* renamed from: c */
        public C9828b mo34695c(int i) {
            this.f27055g |= 1;
            this.f27056h = i;
            return this;
        }

        /* renamed from: d */
        public C9828b mo34696d(int i) {
            this.f27055g |= 16;
            this.f27060l = i;
            return this;
        }

        /* renamed from: e */
        public C9828b mo34697e(int i) {
            this.f27055g |= 2;
            this.f27057i = i;
            return this;
        }

        /* renamed from: i */
        public C9826p mo34698i() {
            C9826p pVar = new C9826p((C10427h.C10429b) this);
            int i = this.f27055g;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            int unused = pVar.f27046h = this.f27056h;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            int unused2 = pVar.f27047i = this.f27057i;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            C9829c unused3 = pVar.f27048j = this.f27058j;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            C9782g0 unused4 = pVar.f27049k = this.f27059k;
            if ((i & 16) == 16) {
                i2 |= 16;
            }
            int unused5 = pVar.f27050l = this.f27060l;
            if ((this.f27055g & 32) == 32) {
                this.f27061m = Collections.unmodifiableList(this.f27061m);
                this.f27055g &= -33;
            }
            List unused6 = pVar.f27051m = this.f27061m;
            if ((this.f27055g & 64) == 64) {
                this.f27062n = Collections.unmodifiableList(this.f27062n);
                this.f27055g &= -65;
            }
            List unused7 = pVar.f27052n = this.f27062n;
            int unused8 = pVar.f27045g = i2;
            return pVar;
        }

        public final boolean isInitialized() {
            if (mo34702m() && !mo34700k().isInitialized()) {
                return false;
            }
            for (int i = 0; i < mo34699j(); i++) {
                if (!mo34693a(i).isInitialized()) {
                    return false;
                }
            }
            for (int i2 = 0; i2 < mo34701l(); i2++) {
                if (!mo34694b(i2).isInitialized()) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: j */
        public int mo34699j() {
            return this.f27061m.size();
        }

        /* renamed from: k */
        public C9782g0 mo34700k() {
            return this.f27059k;
        }

        /* renamed from: l */
        public int mo34701l() {
            return this.f27062n.size();
        }

        /* renamed from: m */
        public boolean mo34702m() {
            return (this.f27055g & 8) == 8;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ C10427h.C10429b mo34379a(C10427h hVar) {
            mo34692a((C9826p) hVar);
            return this;
        }

        /* renamed from: b */
        public C9826p m32439b() {
            return C9826p.m32393u();
        }

        public C9828b clone() {
            C9828b q = m32422q();
            q.mo34692a(mo34698i());
            return q;
        }

        /* renamed from: b */
        public C9826p mo34694b(int i) {
            return this.f27062n.get(i);
        }

        /* renamed from: a */
        public C9826p m32435a() {
            C9826p i = mo34698i();
            if (i.isInitialized()) {
                return i;
            }
            throw C10410a.C10411a.m35207a(i);
        }

        /* renamed from: a */
        public C9828b mo34692a(C9826p pVar) {
            if (pVar == C9826p.m32393u()) {
                return this;
            }
            if (pVar.mo34686q()) {
                mo34695c(pVar.mo34680k());
            }
            if (pVar.mo34689t()) {
                mo34697e(pVar.mo34684o());
            }
            if (pVar.mo34685p()) {
                mo34691a(pVar.mo34679j());
            }
            if (pVar.mo34687r()) {
                mo34690a(pVar.mo34681l());
            }
            if (pVar.mo34688s()) {
                mo34696d(pVar.mo34682m());
            }
            if (!pVar.f27051m.isEmpty()) {
                if (this.f27061m.isEmpty()) {
                    this.f27061m = pVar.f27051m;
                    this.f27055g &= -33;
                } else {
                    m32423r();
                    this.f27061m.addAll(pVar.f27051m);
                }
            }
            if (!pVar.f27052n.isEmpty()) {
                if (this.f27062n.isEmpty()) {
                    this.f27062n = pVar.f27052n;
                    this.f27055g &= -65;
                } else {
                    m32424s();
                    this.f27062n.addAll(pVar.f27052n);
                }
            }
            mo35761a(mo35762h().mo35686b(pVar.f27044f));
            return this;
        }

        /* renamed from: a */
        public C9828b mo34377a(C10420e eVar, C10422f fVar) throws IOException {
            C9826p pVar;
            C9826p pVar2 = null;
            try {
                C9826p a = C9826p.f27043r.mo34369a(eVar, fVar);
                if (a != null) {
                    mo34692a(a);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                pVar = (C9826p) e.mo35657a();
                throw e;
            } catch (Throwable th) {
                th = th;
                pVar2 = pVar;
            }
            if (pVar2 != null) {
                mo34692a(pVar2);
            }
            throw th;
        }

        /* renamed from: a */
        public C9828b mo34691a(C9829c cVar) {
            if (cVar != null) {
                this.f27055g |= 4;
                this.f27058j = cVar;
                return this;
            }
            throw null;
        }

        /* renamed from: a */
        public C9828b mo34690a(C9782g0 g0Var) {
            if ((this.f27055g & 8) != 8 || this.f27059k == C9782g0.m31867P()) {
                this.f27059k = g0Var;
            } else {
                this.f27059k = C9782g0.m31879c(this.f27059k).mo34379a(g0Var).mo34502j();
            }
            this.f27055g |= 8;
            return this;
        }

        /* renamed from: a */
        public C9826p mo34693a(int i) {
            return this.f27061m.get(i);
        }
    }

    /* renamed from: d */
    public static C9828b m32392d(C9826p pVar) {
        C9828b w = m32395w();
        w.mo34692a(pVar);
        return w;
    }

    /* renamed from: f */
    public C9828b m32405f() {
        return m32395w();
    }

    private C9826p(C10427h.C10429b bVar) {
        super(bVar);
        this.f27053o = -1;
        this.f27054p = -1;
        this.f27044f = bVar.mo35762h();
    }

    /* renamed from: c */
    public C9828b m32402c() {
        return m32392d(this);
    }

    /* renamed from: b */
    public C9826p m32400b() {
        return f27042q;
    }

    /* renamed from: a */
    public C9826p mo34676a(int i) {
        return this.f27051m.get(i);
    }

    /* renamed from: b */
    public C9826p mo34677b(int i) {
        return this.f27052n.get(i);
    }

    private C9826p(boolean z) {
        this.f27053o = -1;
        this.f27054p = -1;
        this.f27044f = C10417d.f28215f;
    }

    /* renamed from: a */
    public void mo34358a(CodedOutputStream codedOutputStream) throws IOException {
        mo34361e();
        if ((this.f27045g & 1) == 1) {
            codedOutputStream.mo35635b(1, this.f27046h);
        }
        if ((this.f27045g & 2) == 2) {
            codedOutputStream.mo35635b(2, this.f27047i);
        }
        if ((this.f27045g & 4) == 4) {
            codedOutputStream.mo35621a(3, this.f27048j.mo34424b());
        }
        if ((this.f27045g & 8) == 8) {
            codedOutputStream.mo35636b(4, (C10449o) this.f27049k);
        }
        if ((this.f27045g & 16) == 16) {
            codedOutputStream.mo35635b(5, this.f27050l);
        }
        for (int i = 0; i < this.f27051m.size(); i++) {
            codedOutputStream.mo35636b(6, (C10449o) this.f27051m.get(i));
        }
        for (int i2 = 0; i2 < this.f27052n.size(); i2++) {
            codedOutputStream.mo35636b(7, (C10449o) this.f27052n.get(i2));
        }
        codedOutputStream.mo35638b(this.f27044f);
    }

    private C9826p(C10420e eVar, C10422f fVar) throws InvalidProtocolBufferException {
        this.f27053o = -1;
        this.f27054p = -1;
        m32394v();
        C10417d.C10419b j = C10417d.m35229j();
        CodedOutputStream a = CodedOutputStream.m35116a((OutputStream) j, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int x = eVar.mo35733x();
                if (x != 0) {
                    if (x == 8) {
                        this.f27045g |= 1;
                        this.f27046h = eVar.mo35719j();
                    } else if (x == 16) {
                        this.f27045g |= 2;
                        this.f27047i = eVar.mo35719j();
                    } else if (x == 24) {
                        int f = eVar.mo35715f();
                        C9829c a2 = C9829c.m32448a(f);
                        if (a2 == null) {
                            a.mo35650f(x);
                            a.mo35650f(f);
                        } else {
                            this.f27045g |= 4;
                            this.f27048j = a2;
                        }
                    } else if (x == 34) {
                        C9782g0.C9789c c = (this.f27045g & 8) == 8 ? this.f27049k.m31908c() : null;
                        C9782g0 g0Var = (C9782g0) eVar.mo35702a(C9782g0.f26873z, fVar);
                        this.f27049k = g0Var;
                        if (c != null) {
                            c.mo34379a(g0Var);
                            this.f27049k = c.mo34502j();
                        }
                        this.f27045g |= 8;
                    } else if (x == 40) {
                        this.f27045g |= 16;
                        this.f27050l = eVar.mo35719j();
                    } else if (x == 50) {
                        if (!(z2 & true)) {
                            this.f27051m = new ArrayList();
                            z2 |= true;
                        }
                        this.f27051m.add(eVar.mo35702a(f27043r, fVar));
                    } else if (x == 58) {
                        if (!(z2 & true)) {
                            this.f27052n = new ArrayList();
                            z2 |= true;
                        }
                        this.f27052n.add(eVar.mo35702a(f27043r, fVar));
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
                    this.f27051m = Collections.unmodifiableList(this.f27051m);
                }
                if (z2 & true) {
                    this.f27052n = Collections.unmodifiableList(this.f27052n);
                }
                try {
                    a.mo35614a();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f27044f = j.mo35696a();
                    throw th2;
                }
                this.f27044f = j.mo35696a();
                mo35760h();
                throw th;
            }
        }
        if (z2 & true) {
            this.f27051m = Collections.unmodifiableList(this.f27051m);
        }
        if (z2 & true) {
            this.f27052n = Collections.unmodifiableList(this.f27052n);
        }
        try {
            a.mo35614a();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f27044f = j.mo35696a();
            throw th3;
        }
        this.f27044f = j.mo35696a();
        mo35760h();
    }
}
