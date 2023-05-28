package kotlin.p045h0.p046u.p047e.p048k0.p240d;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.AdRequest;
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

/* renamed from: kotlin.h0.u.e.k0.d.g0 */
/* compiled from: ProtoBuf */
public final class C9782g0 extends C10427h.C10431d<C9782g0> implements C9803k0 {

    /* renamed from: y */
    private static final C9782g0 f26872y;

    /* renamed from: z */
    public static C10452q<C9782g0> f26873z = new C9783a();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C10417d f26874g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f26875h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public List<C9784b> f26876i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f26877j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public int f26878k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C9782g0 f26879l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public int f26880m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public int f26881n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public int f26882o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public int f26883p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public int f26884q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public C9782g0 f26885r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public int f26886s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public C9782g0 f26887t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public int f26888u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public int f26889v;

    /* renamed from: w */
    private byte f26890w;

    /* renamed from: x */
    private int f26891x;

    /* renamed from: kotlin.h0.u.e.k0.d.g0$a */
    /* compiled from: ProtoBuf */
    static class C9783a extends C10413b<C9782g0> {
        C9783a() {
        }

        /* renamed from: a */
        public C9782g0 m31927a(C10420e eVar, C10422f fVar) throws InvalidProtocolBufferException {
            return new C9782g0(eVar, fVar);
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.d.g0$b */
    /* compiled from: ProtoBuf */
    public static final class C9784b extends C10427h implements C9793h0 {

        /* renamed from: m */
        private static final C9784b f26892m;

        /* renamed from: n */
        public static C10452q<C9784b> f26893n = new C9785a();
        /* access modifiers changed from: private */

        /* renamed from: f */
        public final C10417d f26894f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public int f26895g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public C9787c f26896h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public C9782g0 f26897i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public int f26898j;

        /* renamed from: k */
        private byte f26899k;

        /* renamed from: l */
        private int f26900l;

        /* renamed from: kotlin.h0.u.e.k0.d.g0$b$a */
        /* compiled from: ProtoBuf */
        static class C9785a extends C10413b<C9784b> {
            C9785a() {
            }

            /* renamed from: a */
            public C9784b m31953a(C10420e eVar, C10422f fVar) throws InvalidProtocolBufferException {
                return new C9784b(eVar, fVar);
            }
        }

        /* renamed from: kotlin.h0.u.e.k0.d.g0$b$c */
        /* compiled from: ProtoBuf */
        public enum C9787c implements C10436i.C10437a {
            IN(0, 0),
            OUT(1, 1),
            INV(2, 2),
            STAR(3, 3);
            

            /* renamed from: f */
            private final int f26910f;

            /* renamed from: kotlin.h0.u.e.k0.d.g0$b$c$a */
            /* compiled from: ProtoBuf */
            static class C9788a implements C10436i.C10438b<C9787c> {
                C9788a() {
                }

                /* renamed from: a */
                public C9787c m31976a(int i) {
                    return C9787c.m31973a(i);
                }
            }

            static {
                new C9788a();
            }

            private C9787c(int i, int i2) {
                this.f26910f = i2;
            }

            /* renamed from: a */
            public static C9787c m31973a(int i) {
                if (i == 0) {
                    return IN;
                }
                if (i == 1) {
                    return OUT;
                }
                if (i == 2) {
                    return INV;
                }
                if (i != 3) {
                    return null;
                }
                return STAR;
            }

            /* renamed from: b */
            public final int mo34424b() {
                return this.f26910f;
            }
        }

        static {
            C9784b bVar = new C9784b(true);
            f26892m = bVar;
            bVar.m31935p();
        }

        /* renamed from: o */
        public static C9784b m31934o() {
            return f26892m;
        }

        /* renamed from: p */
        private void m31935p() {
            this.f26896h = C9787c.INV;
            this.f26897i = C9782g0.m31867P();
            this.f26898j = 0;
        }

        /* renamed from: q */
        public static C9786b m31936q() {
            return C9786b.m31955m();
        }

        /* renamed from: e */
        public int mo34361e() {
            int i = this.f26900l;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.f26895g & 1) == 1) {
                i2 = 0 + CodedOutputStream.m35132e(1, this.f26896h.mo34424b());
            }
            if ((this.f26895g & 2) == 2) {
                i2 += CodedOutputStream.m35130d(2, (C10449o) this.f26897i);
            }
            if ((this.f26895g & 4) == 4) {
                i2 += CodedOutputStream.m35133f(3, this.f26898j);
            }
            int size = i2 + this.f26894f.size();
            this.f26900l = size;
            return size;
        }

        /* renamed from: g */
        public C10452q<C9784b> mo34363g() {
            return f26893n;
        }

        /* renamed from: i */
        public C9787c mo34542i() {
            return this.f26896h;
        }

        public final boolean isInitialized() {
            byte b = this.f26899k;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!mo34546m() || mo34543j().isInitialized()) {
                this.f26899k = 1;
                return true;
            }
            this.f26899k = 0;
            return false;
        }

        /* renamed from: j */
        public C9782g0 mo34543j() {
            return this.f26897i;
        }

        /* renamed from: k */
        public int mo34544k() {
            return this.f26898j;
        }

        /* renamed from: l */
        public boolean mo34545l() {
            return (this.f26895g & 1) == 1;
        }

        /* renamed from: m */
        public boolean mo34546m() {
            return (this.f26895g & 2) == 2;
        }

        /* renamed from: n */
        public boolean mo34547n() {
            return (this.f26895g & 4) == 4;
        }

        /* renamed from: kotlin.h0.u.e.k0.d.g0$b$b */
        /* compiled from: ProtoBuf */
        public static final class C9786b extends C10427h.C10429b<C9784b, C9786b> implements C9793h0 {

            /* renamed from: g */
            private int f26901g;

            /* renamed from: h */
            private C9787c f26902h = C9787c.INV;

            /* renamed from: i */
            private C9782g0 f26903i = C9782g0.m31867P();

            /* renamed from: j */
            private int f26904j;

            private C9786b() {
                m31956n();
            }

            /* access modifiers changed from: private */
            /* renamed from: m */
            public static C9786b m31955m() {
                return new C9786b();
            }

            /* renamed from: n */
            private void m31956n() {
            }

            /* renamed from: i */
            public C9784b mo34552i() {
                C9784b bVar = new C9784b((C10427h.C10429b) this);
                int i = this.f26901g;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                C9787c unused = bVar.f26896h = this.f26902h;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                C9782g0 unused2 = bVar.f26897i = this.f26903i;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                int unused3 = bVar.f26898j = this.f26904j;
                int unused4 = bVar.f26895g = i2;
                return bVar;
            }

            public final boolean isInitialized() {
                return !mo34554k() || mo34553j().isInitialized();
            }

            /* renamed from: j */
            public C9782g0 mo34553j() {
                return this.f26903i;
            }

            /* renamed from: k */
            public boolean mo34554k() {
                return (this.f26901g & 2) == 2;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ C10427h.C10429b mo34379a(C10427h hVar) {
                mo34550a((C9784b) hVar);
                return this;
            }

            /* renamed from: b */
            public C9784b m31969b() {
                return C9784b.m31934o();
            }

            public C9786b clone() {
                C9786b m = m31955m();
                m.mo34550a(mo34552i());
                return m;
            }

            /* renamed from: a */
            public C9784b m31966a() {
                C9784b i = mo34552i();
                if (i.isInitialized()) {
                    return i;
                }
                throw C10410a.C10411a.m35207a(i);
            }

            /* renamed from: a */
            public C9786b mo34550a(C9784b bVar) {
                if (bVar == C9784b.m31934o()) {
                    return this;
                }
                if (bVar.mo34545l()) {
                    mo34549a(bVar.mo34542i());
                }
                if (bVar.mo34546m()) {
                    mo34551a(bVar.mo34543j());
                }
                if (bVar.mo34547n()) {
                    mo34548a(bVar.mo34544k());
                }
                mo35761a(mo35762h().mo35686b(bVar.f26894f));
                return this;
            }

            /* renamed from: a */
            public C9786b mo34377a(C10420e eVar, C10422f fVar) throws IOException {
                C9784b bVar;
                C9784b bVar2 = null;
                try {
                    C9784b a = C9784b.f26893n.mo34369a(eVar, fVar);
                    if (a != null) {
                        mo34550a(a);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    bVar = (C9784b) e.mo35657a();
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    bVar2 = bVar;
                }
                if (bVar2 != null) {
                    mo34550a(bVar2);
                }
                throw th;
            }

            /* renamed from: a */
            public C9786b mo34549a(C9787c cVar) {
                if (cVar != null) {
                    this.f26901g |= 1;
                    this.f26902h = cVar;
                    return this;
                }
                throw null;
            }

            /* renamed from: a */
            public C9786b mo34551a(C9782g0 g0Var) {
                if ((this.f26901g & 2) != 2 || this.f26903i == C9782g0.m31867P()) {
                    this.f26903i = g0Var;
                } else {
                    this.f26903i = C9782g0.m31879c(this.f26903i).mo34379a(g0Var).mo34502j();
                }
                this.f26901g |= 2;
                return this;
            }

            /* renamed from: a */
            public C9786b mo34548a(int i) {
                this.f26901g |= 4;
                this.f26904j = i;
                return this;
            }
        }

        /* renamed from: c */
        public C9786b m31941c() {
            return m31933b(this);
        }

        /* renamed from: f */
        public C9786b m31944f() {
            return m31936q();
        }

        private C9784b(C10427h.C10429b bVar) {
            super(bVar);
            this.f26899k = -1;
            this.f26900l = -1;
            this.f26894f = bVar.mo35762h();
        }

        /* renamed from: b */
        public C9784b m31939b() {
            return f26892m;
        }

        /* renamed from: b */
        public static C9786b m31933b(C9784b bVar) {
            C9786b q = m31936q();
            q.mo34550a(bVar);
            return q;
        }

        /* renamed from: a */
        public void mo34358a(CodedOutputStream codedOutputStream) throws IOException {
            mo34361e();
            if ((this.f26895g & 1) == 1) {
                codedOutputStream.mo35621a(1, this.f26896h.mo34424b());
            }
            if ((this.f26895g & 2) == 2) {
                codedOutputStream.mo35636b(2, (C10449o) this.f26897i);
            }
            if ((this.f26895g & 4) == 4) {
                codedOutputStream.mo35635b(3, this.f26898j);
            }
            codedOutputStream.mo35638b(this.f26894f);
        }

        private C9784b(boolean z) {
            this.f26899k = -1;
            this.f26900l = -1;
            this.f26894f = C10417d.f28215f;
        }

        private C9784b(C10420e eVar, C10422f fVar) throws InvalidProtocolBufferException {
            this.f26899k = -1;
            this.f26900l = -1;
            m31935p();
            C10417d.C10419b j = C10417d.m35229j();
            CodedOutputStream a = CodedOutputStream.m35116a((OutputStream) j, 1);
            boolean z = false;
            while (!z) {
                try {
                    int x = eVar.mo35733x();
                    if (x != 0) {
                        if (x == 8) {
                            int f = eVar.mo35715f();
                            C9787c a2 = C9787c.m31973a(f);
                            if (a2 == null) {
                                a.mo35650f(x);
                                a.mo35650f(f);
                            } else {
                                this.f26895g |= 1;
                                this.f26896h = a2;
                            }
                        } else if (x == 18) {
                            C9789c c = (this.f26895g & 2) == 2 ? this.f26897i.m31908c() : null;
                            C9782g0 g0Var = (C9782g0) eVar.mo35702a(C9782g0.f26873z, fVar);
                            this.f26897i = g0Var;
                            if (c != null) {
                                c.mo34379a(g0Var);
                                this.f26897i = c.mo34502j();
                            }
                            this.f26895g |= 2;
                        } else if (x == 24) {
                            this.f26895g |= 4;
                            this.f26898j = eVar.mo35719j();
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
                        this.f26894f = j.mo35696a();
                        throw th2;
                    }
                    this.f26894f = j.mo35696a();
                    mo35760h();
                    throw th;
                }
            }
            try {
                a.mo35614a();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f26894f = j.mo35696a();
                throw th3;
            }
            this.f26894f = j.mo35696a();
            mo35760h();
        }
    }

    static {
        C9782g0 g0Var = new C9782g0(true);
        f26872y = g0Var;
        g0Var.m31868Q();
    }

    /* renamed from: P */
    public static C9782g0 m31867P() {
        return f26872y;
    }

    /* renamed from: Q */
    private void m31868Q() {
        this.f26876i = Collections.emptyList();
        this.f26877j = false;
        this.f26878k = 0;
        this.f26879l = m31867P();
        this.f26880m = 0;
        this.f26881n = 0;
        this.f26882o = 0;
        this.f26883p = 0;
        this.f26884q = 0;
        this.f26885r = m31867P();
        this.f26886s = 0;
        this.f26887t = m31867P();
        this.f26888u = 0;
        this.f26889v = 0;
    }

    /* renamed from: R */
    public static C9789c m31869R() {
        return C9789c.m31978w();
    }

    /* renamed from: A */
    public int mo34513A() {
        return this.f26882o;
    }

    /* renamed from: B */
    public int mo34514B() {
        return this.f26883p;
    }

    /* renamed from: C */
    public boolean mo34515C() {
        return (this.f26875h & 1024) == 1024;
    }

    /* renamed from: D */
    public boolean mo34516D() {
        return (this.f26875h & RecyclerView.C0638l.FLAG_MOVED) == 2048;
    }

    /* renamed from: E */
    public boolean mo34517E() {
        return (this.f26875h & 16) == 16;
    }

    /* renamed from: F */
    public boolean mo34518F() {
        return (this.f26875h & RecyclerView.C0638l.FLAG_APPEARED_IN_PRE_LAYOUT) == 4096;
    }

    /* renamed from: G */
    public boolean mo34519G() {
        return (this.f26875h & 2) == 2;
    }

    /* renamed from: H */
    public boolean mo34520H() {
        return (this.f26875h & 4) == 4;
    }

    /* renamed from: I */
    public boolean mo34521I() {
        return (this.f26875h & 8) == 8;
    }

    /* renamed from: J */
    public boolean mo34522J() {
        return (this.f26875h & 1) == 1;
    }

    /* renamed from: K */
    public boolean mo34523K() {
        return (this.f26875h & 256) == 256;
    }

    /* renamed from: L */
    public boolean mo34524L() {
        return (this.f26875h & AdRequest.MAX_CONTENT_URL_LENGTH) == 512;
    }

    /* renamed from: M */
    public boolean mo34525M() {
        return (this.f26875h & 128) == 128;
    }

    /* renamed from: N */
    public boolean mo34526N() {
        return (this.f26875h & 32) == 32;
    }

    /* renamed from: O */
    public boolean mo34527O() {
        return (this.f26875h & 64) == 64;
    }

    public final boolean isInitialized() {
        byte b = this.f26890w;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < mo34531n(); i++) {
            if (!mo34528a(i).isInitialized()) {
                this.f26890w = 0;
                return false;
            }
        }
        if (mo34520H() && !mo34536s().isInitialized()) {
            this.f26890w = 0;
            return false;
        } else if (mo34523K() && !mo34539v().isInitialized()) {
            this.f26890w = 0;
            return false;
        } else if (mo34515C() && !mo34529l().isInitialized()) {
            this.f26890w = 0;
            return false;
        } else if (!mo35769i()) {
            this.f26890w = 0;
            return false;
        } else {
            this.f26890w = 1;
            return true;
        }
    }

    /* renamed from: l */
    public C9782g0 mo34529l() {
        return this.f26887t;
    }

    /* renamed from: m */
    public int mo34530m() {
        return this.f26888u;
    }

    /* renamed from: n */
    public int mo34531n() {
        return this.f26876i.size();
    }

    /* renamed from: o */
    public List<C9784b> mo34532o() {
        return this.f26876i;
    }

    /* renamed from: p */
    public int mo34533p() {
        return this.f26881n;
    }

    /* renamed from: q */
    public int mo34534q() {
        return this.f26889v;
    }

    /* renamed from: r */
    public int mo34535r() {
        return this.f26878k;
    }

    /* renamed from: s */
    public C9782g0 mo34536s() {
        return this.f26879l;
    }

    /* renamed from: t */
    public int mo34537t() {
        return this.f26880m;
    }

    /* renamed from: u */
    public boolean mo34538u() {
        return this.f26877j;
    }

    /* renamed from: v */
    public C9782g0 mo34539v() {
        return this.f26885r;
    }

    /* renamed from: w */
    public int mo34540w() {
        return this.f26886s;
    }

    /* renamed from: z */
    public int mo34541z() {
        return this.f26884q;
    }

    /* renamed from: kotlin.h0.u.e.k0.d.g0$c */
    /* compiled from: ProtoBuf */
    public static final class C9789c extends C10427h.C10430c<C9782g0, C9789c> implements C9803k0 {

        /* renamed from: i */
        private int f26911i;

        /* renamed from: j */
        private List<C9784b> f26912j = Collections.emptyList();

        /* renamed from: k */
        private boolean f26913k;

        /* renamed from: l */
        private int f26914l;

        /* renamed from: m */
        private C9782g0 f26915m = C9782g0.m31867P();

        /* renamed from: n */
        private int f26916n;

        /* renamed from: o */
        private int f26917o;

        /* renamed from: p */
        private int f26918p;

        /* renamed from: q */
        private int f26919q;

        /* renamed from: r */
        private int f26920r;

        /* renamed from: s */
        private C9782g0 f26921s = C9782g0.m31867P();

        /* renamed from: t */
        private int f26922t;

        /* renamed from: u */
        private C9782g0 f26923u = C9782g0.m31867P();

        /* renamed from: v */
        private int f26924v;

        /* renamed from: w */
        private int f26925w;

        private C9789c() {
            m31980y();
        }

        /* access modifiers changed from: private */
        /* renamed from: w */
        public static C9789c m31978w() {
            return new C9789c();
        }

        /* renamed from: x */
        private void m31979x() {
            if ((this.f26911i & 1) != 1) {
                this.f26912j = new ArrayList(this.f26912j);
                this.f26911i |= 1;
            }
        }

        /* renamed from: y */
        private void m31980y() {
        }

        /* renamed from: c */
        public C9789c mo34379a(C9782g0 g0Var) {
            if (g0Var == C9782g0.m31867P()) {
                return this;
            }
            if (!g0Var.f26876i.isEmpty()) {
                if (this.f26912j.isEmpty()) {
                    this.f26912j = g0Var.f26876i;
                    this.f26911i &= -2;
                } else {
                    m31979x();
                    this.f26912j.addAll(g0Var.f26876i);
                }
            }
            if (g0Var.mo34522J()) {
                mo34557a(g0Var.mo34538u());
            }
            if (g0Var.mo34519G()) {
                mo34564e(g0Var.mo34535r());
            }
            if (g0Var.mo34520H()) {
                mo34559b(g0Var.mo34536s());
            }
            if (g0Var.mo34521I()) {
                mo34565f(g0Var.mo34537t());
            }
            if (g0Var.mo34517E()) {
                mo34560c(g0Var.mo34533p());
            }
            if (g0Var.mo34526N()) {
                mo34568i(g0Var.mo34513A());
            }
            if (g0Var.mo34527O()) {
                mo34569j(g0Var.mo34514B());
            }
            if (g0Var.mo34525M()) {
                mo34567h(g0Var.mo34541z());
            }
            if (g0Var.mo34523K()) {
                mo34563d(g0Var.mo34539v());
            }
            if (g0Var.mo34524L()) {
                mo34566g(g0Var.mo34540w());
            }
            if (g0Var.mo34515C()) {
                mo34556a(g0Var.mo34529l());
            }
            if (g0Var.mo34516D()) {
                mo34558b(g0Var.mo34530m());
            }
            if (g0Var.mo34518F()) {
                mo34562d(g0Var.mo34534q());
            }
            mo35763a(g0Var);
            mo35761a(mo35762h().mo35686b(g0Var.f26874g));
            return this;
        }

        /* renamed from: d */
        public C9789c mo34563d(C9782g0 g0Var) {
            if ((this.f26911i & AdRequest.MAX_CONTENT_URL_LENGTH) != 512 || this.f26921s == C9782g0.m31867P()) {
                this.f26921s = g0Var;
            } else {
                this.f26921s = C9782g0.m31879c(this.f26921s).mo34379a(g0Var).mo34502j();
            }
            this.f26911i |= AdRequest.MAX_CONTENT_URL_LENGTH;
            return this;
        }

        /* renamed from: e */
        public C9789c mo34564e(int i) {
            this.f26911i |= 4;
            this.f26914l = i;
            return this;
        }

        /* renamed from: f */
        public C9789c mo34565f(int i) {
            this.f26911i |= 16;
            this.f26916n = i;
            return this;
        }

        /* renamed from: g */
        public C9789c mo34566g(int i) {
            this.f26911i |= 1024;
            this.f26922t = i;
            return this;
        }

        /* renamed from: h */
        public C9789c mo34567h(int i) {
            this.f26911i |= 256;
            this.f26920r = i;
            return this;
        }

        /* renamed from: i */
        public C9789c mo34568i(int i) {
            this.f26911i |= 64;
            this.f26918p = i;
            return this;
        }

        public final boolean isInitialized() {
            for (int i = 0; i < mo34570l(); i++) {
                if (!mo34555a(i).isInitialized()) {
                    return false;
                }
            }
            if (mo34574r() && !mo34571m().isInitialized()) {
                return false;
            }
            if (mo34575s() && !mo34572n().isInitialized()) {
                return false;
            }
            if ((!mo34573q() || mo34503k().isInitialized()) && mo35764i()) {
                return true;
            }
            return false;
        }

        /* renamed from: j */
        public C9782g0 mo34502j() {
            C9782g0 g0Var = new C9782g0((C10427h.C10430c) this);
            int i = this.f26911i;
            int i2 = 1;
            if ((i & 1) == 1) {
                this.f26912j = Collections.unmodifiableList(this.f26912j);
                this.f26911i &= -2;
            }
            List unused = g0Var.f26876i = this.f26912j;
            if ((i & 2) != 2) {
                i2 = 0;
            }
            boolean unused2 = g0Var.f26877j = this.f26913k;
            if ((i & 4) == 4) {
                i2 |= 2;
            }
            int unused3 = g0Var.f26878k = this.f26914l;
            if ((i & 8) == 8) {
                i2 |= 4;
            }
            C9782g0 unused4 = g0Var.f26879l = this.f26915m;
            if ((i & 16) == 16) {
                i2 |= 8;
            }
            int unused5 = g0Var.f26880m = this.f26916n;
            if ((i & 32) == 32) {
                i2 |= 16;
            }
            int unused6 = g0Var.f26881n = this.f26917o;
            if ((i & 64) == 64) {
                i2 |= 32;
            }
            int unused7 = g0Var.f26882o = this.f26918p;
            if ((i & 128) == 128) {
                i2 |= 64;
            }
            int unused8 = g0Var.f26883p = this.f26919q;
            if ((i & 256) == 256) {
                i2 |= 128;
            }
            int unused9 = g0Var.f26884q = this.f26920r;
            if ((i & AdRequest.MAX_CONTENT_URL_LENGTH) == 512) {
                i2 |= 256;
            }
            C9782g0 unused10 = g0Var.f26885r = this.f26921s;
            if ((i & 1024) == 1024) {
                i2 |= AdRequest.MAX_CONTENT_URL_LENGTH;
            }
            int unused11 = g0Var.f26886s = this.f26922t;
            if ((i & RecyclerView.C0638l.FLAG_MOVED) == 2048) {
                i2 |= 1024;
            }
            C9782g0 unused12 = g0Var.f26887t = this.f26923u;
            if ((i & RecyclerView.C0638l.FLAG_APPEARED_IN_PRE_LAYOUT) == 4096) {
                i2 |= RecyclerView.C0638l.FLAG_MOVED;
            }
            int unused13 = g0Var.f26888u = this.f26924v;
            if ((i & 8192) == 8192) {
                i2 |= RecyclerView.C0638l.FLAG_APPEARED_IN_PRE_LAYOUT;
            }
            int unused14 = g0Var.f26889v = this.f26925w;
            int unused15 = g0Var.f26875h = i2;
            return g0Var;
        }

        /* renamed from: k */
        public C9782g0 mo34503k() {
            return this.f26923u;
        }

        /* renamed from: l */
        public int mo34570l() {
            return this.f26912j.size();
        }

        /* renamed from: m */
        public C9782g0 mo34571m() {
            return this.f26915m;
        }

        /* renamed from: n */
        public C9782g0 mo34572n() {
            return this.f26921s;
        }

        /* renamed from: q */
        public boolean mo34573q() {
            return (this.f26911i & RecyclerView.C0638l.FLAG_MOVED) == 2048;
        }

        /* renamed from: r */
        public boolean mo34574r() {
            return (this.f26911i & 8) == 8;
        }

        /* renamed from: s */
        public boolean mo34575s() {
            return (this.f26911i & AdRequest.MAX_CONTENT_URL_LENGTH) == 512;
        }

        /* renamed from: b */
        public C9782g0 m31994b() {
            return C9782g0.m31867P();
        }

        public C9789c clone() {
            C9789c w = m31978w();
            w.mo34379a(mo34502j());
            return w;
        }

        /* renamed from: b */
        public C9789c mo34559b(C9782g0 g0Var) {
            if ((this.f26911i & 8) != 8 || this.f26915m == C9782g0.m31867P()) {
                this.f26915m = g0Var;
            } else {
                this.f26915m = C9782g0.m31879c(this.f26915m).mo34379a(g0Var).mo34502j();
            }
            this.f26911i |= 8;
            return this;
        }

        /* renamed from: a */
        public C9782g0 m31989a() {
            C9782g0 j = mo34502j();
            if (j.isInitialized()) {
                return j;
            }
            throw C10410a.C10411a.m35207a(j);
        }

        /* renamed from: d */
        public C9789c mo34562d(int i) {
            this.f26911i |= 8192;
            this.f26925w = i;
            return this;
        }

        /* renamed from: a */
        public C9789c mo34377a(C10420e eVar, C10422f fVar) throws IOException {
            C9782g0 g0Var;
            C9782g0 g0Var2 = null;
            try {
                C9782g0 a = C9782g0.f26873z.mo34369a(eVar, fVar);
                if (a != null) {
                    mo34379a(a);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                g0Var = (C9782g0) e.mo35657a();
                throw e;
            } catch (Throwable th) {
                th = th;
                g0Var2 = g0Var;
            }
            if (g0Var2 != null) {
                mo34379a(g0Var2);
            }
            throw th;
        }

        /* renamed from: b */
        public C9789c mo34558b(int i) {
            this.f26911i |= RecyclerView.C0638l.FLAG_APPEARED_IN_PRE_LAYOUT;
            this.f26924v = i;
            return this;
        }

        /* renamed from: a */
        public C9784b mo34555a(int i) {
            return this.f26912j.get(i);
        }

        /* renamed from: a */
        public C9789c mo34557a(boolean z) {
            this.f26911i |= 2;
            this.f26913k = z;
            return this;
        }

        /* renamed from: a */
        public C9789c mo34556a(C9782g0 g0Var) {
            if ((this.f26911i & RecyclerView.C0638l.FLAG_MOVED) != 2048 || this.f26923u == C9782g0.m31867P()) {
                this.f26923u = g0Var;
            } else {
                this.f26923u = C9782g0.m31879c(this.f26923u).mo34379a(g0Var).mo34502j();
            }
            this.f26911i |= RecyclerView.C0638l.FLAG_MOVED;
            return this;
        }

        /* renamed from: j */
        public C9789c mo34569j(int i) {
            this.f26911i |= 128;
            this.f26919q = i;
            return this;
        }

        /* renamed from: c */
        public C9789c mo34560c(int i) {
            this.f26911i |= 32;
            this.f26917o = i;
            return this;
        }
    }

    /* renamed from: e */
    public int mo34361e() {
        int i = this.f26891x;
        if (i != -1) {
            return i;
        }
        int f = (this.f26875h & RecyclerView.C0638l.FLAG_APPEARED_IN_PRE_LAYOUT) == 4096 ? CodedOutputStream.m35133f(1, this.f26889v) + 0 : 0;
        for (int i2 = 0; i2 < this.f26876i.size(); i2++) {
            f += CodedOutputStream.m35130d(2, (C10449o) this.f26876i.get(i2));
        }
        if ((this.f26875h & 1) == 1) {
            f += CodedOutputStream.m35123b(3, this.f26877j);
        }
        if ((this.f26875h & 2) == 2) {
            f += CodedOutputStream.m35133f(4, this.f26878k);
        }
        if ((this.f26875h & 4) == 4) {
            f += CodedOutputStream.m35130d(5, (C10449o) this.f26879l);
        }
        if ((this.f26875h & 16) == 16) {
            f += CodedOutputStream.m35133f(6, this.f26881n);
        }
        if ((this.f26875h & 32) == 32) {
            f += CodedOutputStream.m35133f(7, this.f26882o);
        }
        if ((this.f26875h & 8) == 8) {
            f += CodedOutputStream.m35133f(8, this.f26880m);
        }
        if ((this.f26875h & 64) == 64) {
            f += CodedOutputStream.m35133f(9, this.f26883p);
        }
        if ((this.f26875h & 256) == 256) {
            f += CodedOutputStream.m35130d(10, (C10449o) this.f26885r);
        }
        if ((this.f26875h & AdRequest.MAX_CONTENT_URL_LENGTH) == 512) {
            f += CodedOutputStream.m35133f(11, this.f26886s);
        }
        if ((this.f26875h & 128) == 128) {
            f += CodedOutputStream.m35133f(12, this.f26884q);
        }
        if ((this.f26875h & 1024) == 1024) {
            f += CodedOutputStream.m35130d(13, (C10449o) this.f26887t);
        }
        if ((this.f26875h & RecyclerView.C0638l.FLAG_MOVED) == 2048) {
            f += CodedOutputStream.m35133f(14, this.f26888u);
        }
        int j = f + mo35770j() + this.f26874g.size();
        this.f26891x = j;
        return j;
    }

    /* renamed from: g */
    public C10452q<C9782g0> mo34363g() {
        return f26873z;
    }

    private C9782g0(C10427h.C10430c<C9782g0, ?> cVar) {
        super(cVar);
        this.f26890w = -1;
        this.f26891x = -1;
        this.f26874g = cVar.mo35762h();
    }

    /* renamed from: f */
    public C9789c m31911f() {
        return m31869R();
    }

    /* renamed from: c */
    public static C9789c m31879c(C9782g0 g0Var) {
        C9789c R = m31869R();
        R.mo34379a(g0Var);
        return R;
    }

    /* renamed from: b */
    public C9782g0 m31906b() {
        return f26872y;
    }

    /* renamed from: c */
    public C9789c m31908c() {
        return m31879c(this);
    }

    /* renamed from: a */
    public C9784b mo34528a(int i) {
        return this.f26876i.get(i);
    }

    private C9782g0(boolean z) {
        this.f26890w = -1;
        this.f26891x = -1;
        this.f26874g = C10417d.f28215f;
    }

    /* renamed from: a */
    public void mo34358a(CodedOutputStream codedOutputStream) throws IOException {
        mo34361e();
        C10427h.C10431d<MessageType>.C0000a k = mo35771k();
        if ((this.f26875h & RecyclerView.C0638l.FLAG_APPEARED_IN_PRE_LAYOUT) == 4096) {
            codedOutputStream.mo35635b(1, this.f26889v);
        }
        for (int i = 0; i < this.f26876i.size(); i++) {
            codedOutputStream.mo35636b(2, (C10449o) this.f26876i.get(i));
        }
        if ((this.f26875h & 1) == 1) {
            codedOutputStream.mo35625a(3, this.f26877j);
        }
        if ((this.f26875h & 2) == 2) {
            codedOutputStream.mo35635b(4, this.f26878k);
        }
        if ((this.f26875h & 4) == 4) {
            codedOutputStream.mo35636b(5, (C10449o) this.f26879l);
        }
        if ((this.f26875h & 16) == 16) {
            codedOutputStream.mo35635b(6, this.f26881n);
        }
        if ((this.f26875h & 32) == 32) {
            codedOutputStream.mo35635b(7, this.f26882o);
        }
        if ((this.f26875h & 8) == 8) {
            codedOutputStream.mo35635b(8, this.f26880m);
        }
        if ((this.f26875h & 64) == 64) {
            codedOutputStream.mo35635b(9, this.f26883p);
        }
        if ((this.f26875h & 256) == 256) {
            codedOutputStream.mo35636b(10, (C10449o) this.f26885r);
        }
        if ((this.f26875h & AdRequest.MAX_CONTENT_URL_LENGTH) == 512) {
            codedOutputStream.mo35635b(11, this.f26886s);
        }
        if ((this.f26875h & 128) == 128) {
            codedOutputStream.mo35635b(12, this.f26884q);
        }
        if ((this.f26875h & 1024) == 1024) {
            codedOutputStream.mo35636b(13, (C10449o) this.f26887t);
        }
        if ((this.f26875h & RecyclerView.C0638l.FLAG_MOVED) == 2048) {
            codedOutputStream.mo35635b(14, this.f26888u);
        }
        k.mo35772a(200, codedOutputStream);
        codedOutputStream.mo35638b(this.f26874g);
    }

    private C9782g0(C10420e eVar, C10422f fVar) throws InvalidProtocolBufferException {
        this.f26890w = -1;
        this.f26891x = -1;
        m31868Q();
        C10417d.C10419b j = C10417d.m35229j();
        CodedOutputStream a = CodedOutputStream.m35116a((OutputStream) j, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int x = eVar.mo35733x();
                C9789c cVar = null;
                switch (x) {
                    case 0:
                        z = true;
                        break;
                    case 8:
                        this.f26875h |= RecyclerView.C0638l.FLAG_APPEARED_IN_PRE_LAYOUT;
                        this.f26889v = eVar.mo35719j();
                        break;
                    case 18:
                        if (!z2 || !true) {
                            this.f26876i = new ArrayList();
                            z2 |= true;
                        }
                        this.f26876i.add(eVar.mo35702a(C9784b.f26893n, fVar));
                        break;
                    case 24:
                        this.f26875h |= 1;
                        this.f26877j = eVar.mo35711c();
                        break;
                    case 32:
                        this.f26875h |= 2;
                        this.f26878k = eVar.mo35719j();
                        break;
                    case 42:
                        cVar = (this.f26875h & 4) == 4 ? this.f26879l.m31908c() : cVar;
                        C9782g0 g0Var = (C9782g0) eVar.mo35702a(f26873z, fVar);
                        this.f26879l = g0Var;
                        if (cVar != null) {
                            cVar.mo34379a(g0Var);
                            this.f26879l = cVar.mo34502j();
                        }
                        this.f26875h |= 4;
                        break;
                    case 48:
                        this.f26875h |= 16;
                        this.f26881n = eVar.mo35719j();
                        break;
                    case 56:
                        this.f26875h |= 32;
                        this.f26882o = eVar.mo35719j();
                        break;
                    case 64:
                        this.f26875h |= 8;
                        this.f26880m = eVar.mo35719j();
                        break;
                    case 72:
                        this.f26875h |= 64;
                        this.f26883p = eVar.mo35719j();
                        break;
                    case 82:
                        cVar = (this.f26875h & 256) == 256 ? this.f26885r.m31908c() : cVar;
                        C9782g0 g0Var2 = (C9782g0) eVar.mo35702a(f26873z, fVar);
                        this.f26885r = g0Var2;
                        if (cVar != null) {
                            cVar.mo34379a(g0Var2);
                            this.f26885r = cVar.mo34502j();
                        }
                        this.f26875h |= 256;
                        break;
                    case 88:
                        this.f26875h |= AdRequest.MAX_CONTENT_URL_LENGTH;
                        this.f26886s = eVar.mo35719j();
                        break;
                    case 96:
                        this.f26875h |= 128;
                        this.f26884q = eVar.mo35719j();
                        break;
                    case 106:
                        cVar = (this.f26875h & 1024) == 1024 ? this.f26887t.m31908c() : cVar;
                        C9782g0 g0Var3 = (C9782g0) eVar.mo35702a(f26873z, fVar);
                        this.f26887t = g0Var3;
                        if (cVar != null) {
                            cVar.mo34379a(g0Var3);
                            this.f26887t = cVar.mo34502j();
                        }
                        this.f26875h |= 1024;
                        break;
                    case 112:
                        this.f26875h |= RecyclerView.C0638l.FLAG_MOVED;
                        this.f26888u = eVar.mo35719j();
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
                if (z2 && true) {
                    this.f26876i = Collections.unmodifiableList(this.f26876i);
                }
                try {
                    a.mo35614a();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f26874g = j.mo35696a();
                    throw th2;
                }
                this.f26874g = j.mo35696a();
                mo35760h();
                throw th;
            }
        }
        if (z2 && true) {
            this.f26876i = Collections.unmodifiableList(this.f26876i);
        }
        try {
            a.mo35614a();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f26874g = j.mo35696a();
            throw th3;
        }
        this.f26874g = j.mo35696a();
        mo35760h();
    }
}
