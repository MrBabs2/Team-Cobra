package kotlin.p045h0.p046u.p047e.p048k0.p240d;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.C10410a;
import kotlin.reflect.jvm.internal.impl.protobuf.C10413b;
import kotlin.reflect.jvm.internal.impl.protobuf.C10417d;
import kotlin.reflect.jvm.internal.impl.protobuf.C10420e;
import kotlin.reflect.jvm.internal.impl.protobuf.C10422f;
import kotlin.reflect.jvm.internal.impl.protobuf.C10427h;
import kotlin.reflect.jvm.internal.impl.protobuf.C10452q;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* renamed from: kotlin.h0.u.e.k0.d.n */
/* compiled from: ProtoBuf */
public final class C9818n extends C10427h.C10431d<C9818n> implements C9824o {

    /* renamed from: l */
    private static final C9818n f27022l;

    /* renamed from: m */
    public static C10452q<C9818n> f27023m = new C9819a();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C10417d f27024g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f27025h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f27026i;

    /* renamed from: j */
    private byte f27027j;

    /* renamed from: k */
    private int f27028k;

    /* renamed from: kotlin.h0.u.e.k0.d.n$a */
    /* compiled from: ProtoBuf */
    static class C9819a extends C10413b<C9818n> {
        C9819a() {
        }

        /* renamed from: a */
        public C9818n m32322a(C10420e eVar, C10422f fVar) throws InvalidProtocolBufferException {
            return new C9818n(eVar, fVar);
        }
    }

    static {
        C9818n nVar = new C9818n(true);
        f27022l = nVar;
        nVar.m32308o();
    }

    /* renamed from: n */
    public static C9818n m32307n() {
        return f27022l;
    }

    /* renamed from: o */
    private void m32308o() {
        this.f27026i = 0;
    }

    /* renamed from: p */
    public static C9820b m32309p() {
        return C9820b.m32324l();
    }

    /* renamed from: e */
    public int mo34361e() {
        int i = this.f27028k;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if ((this.f27025h & 1) == 1) {
            i2 = 0 + CodedOutputStream.m35133f(1, this.f27026i);
        }
        int j = i2 + mo35770j() + this.f27024g.size();
        this.f27028k = j;
        return j;
    }

    /* renamed from: g */
    public C10452q<C9818n> mo34363g() {
        return f27023m;
    }

    public final boolean isInitialized() {
        byte b = this.f27027j;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!mo35769i()) {
            this.f27027j = 0;
            return false;
        }
        this.f27027j = 1;
        return true;
    }

    /* renamed from: l */
    public int mo34662l() {
        return this.f27026i;
    }

    /* renamed from: m */
    public boolean mo34663m() {
        return (this.f27025h & 1) == 1;
    }

    /* renamed from: kotlin.h0.u.e.k0.d.n$b */
    /* compiled from: ProtoBuf */
    public static final class C9820b extends C10427h.C10430c<C9818n, C9820b> implements C9824o {

        /* renamed from: i */
        private int f27029i;

        /* renamed from: j */
        private int f27030j;

        private C9820b() {
            m32325m();
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public static C9820b m32324l() {
            return new C9820b();
        }

        /* renamed from: m */
        private void m32325m() {
        }

        public final boolean isInitialized() {
            return mo35764i();
        }

        /* renamed from: j */
        public C9818n mo34502j() {
            C9818n nVar = new C9818n((C10427h.C10430c) this);
            int i = 1;
            if ((this.f27029i & 1) != 1) {
                i = 0;
            }
            int unused = nVar.f27026i = this.f27030j;
            int unused2 = nVar.f27025h = i;
            return nVar;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ C10427h.C10429b mo34379a(C10427h hVar) {
            mo34665a((C9818n) hVar);
            return this;
        }

        /* renamed from: b */
        public C9818n m32336b() {
            return C9818n.m32307n();
        }

        public C9820b clone() {
            C9820b l = m32324l();
            l.mo34665a(mo34502j());
            return l;
        }

        /* renamed from: a */
        public C9818n m32333a() {
            C9818n j = mo34502j();
            if (j.isInitialized()) {
                return j;
            }
            throw C10410a.C10411a.m35207a(j);
        }

        /* renamed from: a */
        public C9820b mo34665a(C9818n nVar) {
            if (nVar == C9818n.m32307n()) {
                return this;
            }
            if (nVar.mo34663m()) {
                mo34664a(nVar.mo34662l());
            }
            mo35763a(nVar);
            mo35761a(mo35762h().mo35686b(nVar.f27024g));
            return this;
        }

        /* renamed from: a */
        public C9820b mo34377a(C10420e eVar, C10422f fVar) throws IOException {
            C9818n nVar;
            C9818n nVar2 = null;
            try {
                C9818n a = C9818n.f27023m.mo34369a(eVar, fVar);
                if (a != null) {
                    mo34665a(a);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                nVar = (C9818n) e.mo35657a();
                throw e;
            } catch (Throwable th) {
                th = th;
                nVar2 = nVar;
            }
            if (nVar2 != null) {
                mo34665a(nVar2);
            }
            throw th;
        }

        /* renamed from: a */
        public C9820b mo34664a(int i) {
            this.f27029i |= 1;
            this.f27030j = i;
            return this;
        }
    }

    /* renamed from: c */
    public C9820b m32314c() {
        return m32306b(this);
    }

    /* renamed from: f */
    public C9820b m32317f() {
        return m32309p();
    }

    private C9818n(C10427h.C10430c<C9818n, ?> cVar) {
        super(cVar);
        this.f27027j = -1;
        this.f27028k = -1;
        this.f27024g = cVar.mo35762h();
    }

    /* renamed from: a */
    public void mo34358a(CodedOutputStream codedOutputStream) throws IOException {
        mo34361e();
        C10427h.C10431d<MessageType>.C0000a k = mo35771k();
        if ((this.f27025h & 1) == 1) {
            codedOutputStream.mo35635b(1, this.f27026i);
        }
        k.mo35772a(200, codedOutputStream);
        codedOutputStream.mo35638b(this.f27024g);
    }

    /* renamed from: b */
    public C9818n m32312b() {
        return f27022l;
    }

    /* renamed from: b */
    public static C9820b m32306b(C9818n nVar) {
        C9820b p = m32309p();
        p.mo34665a(nVar);
        return p;
    }

    private C9818n(boolean z) {
        this.f27027j = -1;
        this.f27028k = -1;
        this.f27024g = C10417d.f28215f;
    }

    private C9818n(C10420e eVar, C10422f fVar) throws InvalidProtocolBufferException {
        this.f27027j = -1;
        this.f27028k = -1;
        m32308o();
        C10417d.C10419b j = C10417d.m35229j();
        CodedOutputStream a = CodedOutputStream.m35116a((OutputStream) j, 1);
        boolean z = false;
        while (!z) {
            try {
                int x = eVar.mo35733x();
                if (x != 0) {
                    if (x == 8) {
                        this.f27025h |= 1;
                        this.f27026i = eVar.mo35719j();
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
                    this.f27024g = j.mo35696a();
                    throw th2;
                }
                this.f27024g = j.mo35696a();
                mo35760h();
                throw th;
            }
        }
        try {
            a.mo35614a();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f27024g = j.mo35696a();
            throw th3;
        }
        this.f27024g = j.mo35696a();
        mo35760h();
    }
}
