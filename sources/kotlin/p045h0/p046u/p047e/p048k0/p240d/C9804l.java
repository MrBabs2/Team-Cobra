package kotlin.p045h0.p046u.p047e.p048k0.p240d;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9826p;
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

/* renamed from: kotlin.h0.u.e.k0.d.l */
/* compiled from: ProtoBuf */
public final class C9804l extends C10427h implements C9816m {

    /* renamed from: n */
    private static final C9804l f26972n;

    /* renamed from: o */
    public static C10452q<C9804l> f26973o = new C9805a();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C10417d f26974f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f26975g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C9807c f26976h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public List<C9826p> f26977i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C9826p f26978j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C9809d f26979k;

    /* renamed from: l */
    private byte f26980l;

    /* renamed from: m */
    private int f26981m;

    /* renamed from: kotlin.h0.u.e.k0.d.l$a */
    /* compiled from: ProtoBuf */
    static class C9805a extends C10413b<C9804l> {
        C9805a() {
        }

        /* renamed from: a */
        public C9804l m32207a(C10420e eVar, C10422f fVar) throws InvalidProtocolBufferException {
            return new C9804l(eVar, fVar);
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.d.l$c */
    /* compiled from: ProtoBuf */
    public enum C9807c implements C10436i.C10437a {
        RETURNS_CONSTANT(0, 0),
        CALLS(1, 1),
        RETURNS_NOT_NULL(2, 2);
        

        /* renamed from: f */
        private final int f26991f;

        /* renamed from: kotlin.h0.u.e.k0.d.l$c$a */
        /* compiled from: ProtoBuf */
        static class C9808a implements C10436i.C10438b<C9807c> {
            C9808a() {
            }

            /* renamed from: a */
            public C9807c m32233a(int i) {
                return C9807c.m32230a(i);
            }
        }

        static {
            new C9808a();
        }

        private C9807c(int i, int i2) {
            this.f26991f = i2;
        }

        /* renamed from: a */
        public static C9807c m32230a(int i) {
            if (i == 0) {
                return RETURNS_CONSTANT;
            }
            if (i == 1) {
                return CALLS;
            }
            if (i != 2) {
                return null;
            }
            return RETURNS_NOT_NULL;
        }

        /* renamed from: b */
        public final int mo34424b() {
            return this.f26991f;
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.d.l$d */
    /* compiled from: ProtoBuf */
    public enum C9809d implements C10436i.C10437a {
        AT_MOST_ONCE(0, 0),
        EXACTLY_ONCE(1, 1),
        AT_LEAST_ONCE(2, 2);
        

        /* renamed from: f */
        private final int f26996f;

        /* renamed from: kotlin.h0.u.e.k0.d.l$d$a */
        /* compiled from: ProtoBuf */
        static class C9810a implements C10436i.C10438b<C9809d> {
            C9810a() {
            }

            /* renamed from: a */
            public C9809d m32237a(int i) {
                return C9809d.m32234a(i);
            }
        }

        static {
            new C9810a();
        }

        private C9809d(int i, int i2) {
            this.f26996f = i2;
        }

        /* renamed from: a */
        public static C9809d m32234a(int i) {
            if (i == 0) {
                return AT_MOST_ONCE;
            }
            if (i == 1) {
                return EXACTLY_ONCE;
            }
            if (i != 2) {
                return null;
            }
            return AT_LEAST_ONCE;
        }

        /* renamed from: b */
        public final int mo34424b() {
            return this.f26996f;
        }
    }

    static {
        C9804l lVar = new C9804l(true);
        f26972n = lVar;
        lVar.m32187q();
    }

    /* renamed from: p */
    public static C9804l m32186p() {
        return f26972n;
    }

    /* renamed from: q */
    private void m32187q() {
        this.f26976h = C9807c.RETURNS_CONSTANT;
        this.f26977i = Collections.emptyList();
        this.f26978j = C9826p.m32393u();
        this.f26979k = C9809d.AT_MOST_ONCE;
    }

    /* renamed from: r */
    public static C9806b m32188r() {
        return C9806b.m32209n();
    }

    /* renamed from: e */
    public int mo34361e() {
        int i = this.f26981m;
        if (i != -1) {
            return i;
        }
        int e = (this.f26975g & 1) == 1 ? CodedOutputStream.m35132e(1, this.f26976h.mo34424b()) + 0 : 0;
        for (int i2 = 0; i2 < this.f26977i.size(); i2++) {
            e += CodedOutputStream.m35130d(2, (C10449o) this.f26977i.get(i2));
        }
        if ((this.f26975g & 2) == 2) {
            e += CodedOutputStream.m35130d(3, (C10449o) this.f26978j);
        }
        if ((this.f26975g & 4) == 4) {
            e += CodedOutputStream.m35132e(4, this.f26979k.mo34424b());
        }
        int size = e + this.f26974f.size();
        this.f26981m = size;
        return size;
    }

    /* renamed from: g */
    public C10452q<C9804l> mo34363g() {
        return f26973o;
    }

    /* renamed from: i */
    public C9826p mo34626i() {
        return this.f26978j;
    }

    public final boolean isInitialized() {
        byte b = this.f26980l;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < mo34627j(); i++) {
            if (!mo34625a(i).isInitialized()) {
                this.f26980l = 0;
                return false;
            }
        }
        if (!mo34630m() || mo34626i().isInitialized()) {
            this.f26980l = 1;
            return true;
        }
        this.f26980l = 0;
        return false;
    }

    /* renamed from: j */
    public int mo34627j() {
        return this.f26977i.size();
    }

    /* renamed from: k */
    public C9807c mo34628k() {
        return this.f26976h;
    }

    /* renamed from: l */
    public C9809d mo34629l() {
        return this.f26979k;
    }

    /* renamed from: m */
    public boolean mo34630m() {
        return (this.f26975g & 2) == 2;
    }

    /* renamed from: n */
    public boolean mo34631n() {
        return (this.f26975g & 1) == 1;
    }

    /* renamed from: o */
    public boolean mo34632o() {
        return (this.f26975g & 4) == 4;
    }

    /* renamed from: kotlin.h0.u.e.k0.d.l$b */
    /* compiled from: ProtoBuf */
    public static final class C9806b extends C10427h.C10429b<C9804l, C9806b> implements C9816m {

        /* renamed from: g */
        private int f26982g;

        /* renamed from: h */
        private C9807c f26983h = C9807c.RETURNS_CONSTANT;

        /* renamed from: i */
        private List<C9826p> f26984i = Collections.emptyList();

        /* renamed from: j */
        private C9826p f26985j = C9826p.m32393u();

        /* renamed from: k */
        private C9809d f26986k = C9809d.AT_MOST_ONCE;

        private C9806b() {
            m32211r();
        }

        /* access modifiers changed from: private */
        /* renamed from: n */
        public static C9806b m32209n() {
            return new C9806b();
        }

        /* renamed from: q */
        private void m32210q() {
            if ((this.f26982g & 2) != 2) {
                this.f26984i = new ArrayList(this.f26984i);
                this.f26982g |= 2;
            }
        }

        /* renamed from: r */
        private void m32211r() {
        }

        /* renamed from: i */
        public C9804l mo34638i() {
            C9804l lVar = new C9804l((C10427h.C10429b) this);
            int i = this.f26982g;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            C9807c unused = lVar.f26976h = this.f26983h;
            if ((this.f26982g & 2) == 2) {
                this.f26984i = Collections.unmodifiableList(this.f26984i);
                this.f26982g &= -3;
            }
            List unused2 = lVar.f26977i = this.f26984i;
            if ((i & 4) == 4) {
                i2 |= 2;
            }
            C9826p unused3 = lVar.f26978j = this.f26985j;
            if ((i & 8) == 8) {
                i2 |= 4;
            }
            C9809d unused4 = lVar.f26979k = this.f26986k;
            int unused5 = lVar.f26975g = i2;
            return lVar;
        }

        public final boolean isInitialized() {
            for (int i = 0; i < mo34640k(); i++) {
                if (!mo34637a(i).isInitialized()) {
                    return false;
                }
            }
            if (!mo34641l() || mo34639j().isInitialized()) {
                return true;
            }
            return false;
        }

        /* renamed from: j */
        public C9826p mo34639j() {
            return this.f26985j;
        }

        /* renamed from: k */
        public int mo34640k() {
            return this.f26984i.size();
        }

        /* renamed from: l */
        public boolean mo34641l() {
            return (this.f26982g & 4) == 4;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ C10427h.C10429b mo34379a(C10427h hVar) {
            mo34635a((C9804l) hVar);
            return this;
        }

        /* renamed from: b */
        public C9804l m32225b() {
            return C9804l.m32186p();
        }

        public C9806b clone() {
            C9806b n = m32209n();
            n.mo34635a(mo34638i());
            return n;
        }

        /* renamed from: a */
        public C9804l m32222a() {
            C9804l i = mo34638i();
            if (i.isInitialized()) {
                return i;
            }
            throw C10410a.C10411a.m35207a(i);
        }

        /* renamed from: a */
        public C9806b mo34635a(C9804l lVar) {
            if (lVar == C9804l.m32186p()) {
                return this;
            }
            if (lVar.mo34631n()) {
                mo34633a(lVar.mo34628k());
            }
            if (!lVar.f26977i.isEmpty()) {
                if (this.f26984i.isEmpty()) {
                    this.f26984i = lVar.f26977i;
                    this.f26982g &= -3;
                } else {
                    m32210q();
                    this.f26984i.addAll(lVar.f26977i);
                }
            }
            if (lVar.mo34630m()) {
                mo34636a(lVar.mo34626i());
            }
            if (lVar.mo34632o()) {
                mo34634a(lVar.mo34629l());
            }
            mo35761a(mo35762h().mo35686b(lVar.f26974f));
            return this;
        }

        /* renamed from: a */
        public C9806b mo34377a(C10420e eVar, C10422f fVar) throws IOException {
            C9804l lVar;
            C9804l lVar2 = null;
            try {
                C9804l a = C9804l.f26973o.mo34369a(eVar, fVar);
                if (a != null) {
                    mo34635a(a);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                lVar = (C9804l) e.mo35657a();
                throw e;
            } catch (Throwable th) {
                th = th;
                lVar2 = lVar;
            }
            if (lVar2 != null) {
                mo34635a(lVar2);
            }
            throw th;
        }

        /* renamed from: a */
        public C9806b mo34633a(C9807c cVar) {
            if (cVar != null) {
                this.f26982g |= 1;
                this.f26983h = cVar;
                return this;
            }
            throw null;
        }

        /* renamed from: a */
        public C9826p mo34637a(int i) {
            return this.f26984i.get(i);
        }

        /* renamed from: a */
        public C9806b mo34636a(C9826p pVar) {
            if ((this.f26982g & 4) != 4 || this.f26985j == C9826p.m32393u()) {
                this.f26985j = pVar;
            } else {
                C9826p.C9828b d = C9826p.m32392d(this.f26985j);
                d.mo34692a(pVar);
                this.f26985j = d.mo34698i();
            }
            this.f26982g |= 4;
            return this;
        }

        /* renamed from: a */
        public C9806b mo34634a(C9809d dVar) {
            if (dVar != null) {
                this.f26982g |= 8;
                this.f26986k = dVar;
                return this;
            }
            throw null;
        }
    }

    /* renamed from: c */
    public static C9806b m32185c(C9804l lVar) {
        C9806b r = m32188r();
        r.mo34635a(lVar);
        return r;
    }

    /* renamed from: f */
    public C9806b m32197f() {
        return m32188r();
    }

    private C9804l(C10427h.C10429b bVar) {
        super(bVar);
        this.f26980l = -1;
        this.f26981m = -1;
        this.f26974f = bVar.mo35762h();
    }

    /* renamed from: b */
    public C9804l m32192b() {
        return f26972n;
    }

    /* renamed from: c */
    public C9806b m32194c() {
        return m32185c(this);
    }

    private C9804l(boolean z) {
        this.f26980l = -1;
        this.f26981m = -1;
        this.f26974f = C10417d.f28215f;
    }

    /* renamed from: a */
    public C9826p mo34625a(int i) {
        return this.f26977i.get(i);
    }

    /* renamed from: a */
    public void mo34358a(CodedOutputStream codedOutputStream) throws IOException {
        mo34361e();
        if ((this.f26975g & 1) == 1) {
            codedOutputStream.mo35621a(1, this.f26976h.mo34424b());
        }
        for (int i = 0; i < this.f26977i.size(); i++) {
            codedOutputStream.mo35636b(2, (C10449o) this.f26977i.get(i));
        }
        if ((this.f26975g & 2) == 2) {
            codedOutputStream.mo35636b(3, (C10449o) this.f26978j);
        }
        if ((this.f26975g & 4) == 4) {
            codedOutputStream.mo35621a(4, this.f26979k.mo34424b());
        }
        codedOutputStream.mo35638b(this.f26974f);
    }

    private C9804l(C10420e eVar, C10422f fVar) throws InvalidProtocolBufferException {
        this.f26980l = -1;
        this.f26981m = -1;
        m32187q();
        C10417d.C10419b j = C10417d.m35229j();
        CodedOutputStream a = CodedOutputStream.m35116a((OutputStream) j, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int x = eVar.mo35733x();
                if (x != 0) {
                    if (x == 8) {
                        int f = eVar.mo35715f();
                        C9807c a2 = C9807c.m32230a(f);
                        if (a2 == null) {
                            a.mo35650f(x);
                            a.mo35650f(f);
                        } else {
                            this.f26975g |= 1;
                            this.f26976h = a2;
                        }
                    } else if (x == 18) {
                        if (!(z2 & true)) {
                            this.f26977i = new ArrayList();
                            z2 |= true;
                        }
                        this.f26977i.add(eVar.mo35702a(C9826p.f27043r, fVar));
                    } else if (x == 26) {
                        C9826p.C9828b c = (this.f26975g & 2) == 2 ? this.f26978j.m32402c() : null;
                        C9826p pVar = (C9826p) eVar.mo35702a(C9826p.f27043r, fVar);
                        this.f26978j = pVar;
                        if (c != null) {
                            c.mo34692a(pVar);
                            this.f26978j = c.mo34698i();
                        }
                        this.f26975g |= 2;
                    } else if (x == 32) {
                        int f2 = eVar.mo35715f();
                        C9809d a3 = C9809d.m32234a(f2);
                        if (a3 == null) {
                            a.mo35650f(x);
                            a.mo35650f(f2);
                        } else {
                            this.f26975g |= 4;
                            this.f26979k = a3;
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
                if (z2 & true) {
                    this.f26977i = Collections.unmodifiableList(this.f26977i);
                }
                try {
                    a.mo35614a();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f26974f = j.mo35696a();
                    throw th2;
                }
                this.f26974f = j.mo35696a();
                mo35760h();
                throw th;
            }
        }
        if (z2 & true) {
            this.f26977i = Collections.unmodifiableList(this.f26977i);
        }
        try {
            a.mo35614a();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f26974f = j.mo35696a();
            throw th3;
        }
        this.f26974f = j.mo35696a();
        mo35760h();
    }
}
