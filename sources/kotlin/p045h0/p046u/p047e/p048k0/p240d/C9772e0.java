package kotlin.p045h0.p046u.p047e.p048k0.p240d;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.C10410a;
import kotlin.reflect.jvm.internal.impl.protobuf.C10413b;
import kotlin.reflect.jvm.internal.impl.protobuf.C10417d;
import kotlin.reflect.jvm.internal.impl.protobuf.C10420e;
import kotlin.reflect.jvm.internal.impl.protobuf.C10422f;
import kotlin.reflect.jvm.internal.impl.protobuf.C10427h;
import kotlin.reflect.jvm.internal.impl.protobuf.C10444l;
import kotlin.reflect.jvm.internal.impl.protobuf.C10445m;
import kotlin.reflect.jvm.internal.impl.protobuf.C10452q;
import kotlin.reflect.jvm.internal.impl.protobuf.C10453r;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* renamed from: kotlin.h0.u.e.k0.d.e0 */
/* compiled from: ProtoBuf */
public final class C9772e0 extends C10427h implements C9780f0 {

    /* renamed from: j */
    private static final C9772e0 f26813j;

    /* renamed from: k */
    public static C10452q<C9772e0> f26814k = new C9773a();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C10417d f26815f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C10445m f26816g;

    /* renamed from: h */
    private byte f26817h;

    /* renamed from: i */
    private int f26818i;

    /* renamed from: kotlin.h0.u.e.k0.d.e0$a */
    /* compiled from: ProtoBuf */
    static class C9773a extends C10413b<C9772e0> {
        C9773a() {
        }

        /* renamed from: a */
        public C9772e0 m31720a(C10420e eVar, C10422f fVar) throws InvalidProtocolBufferException {
            return new C9772e0(eVar, fVar);
        }
    }

    static {
        C9772e0 e0Var = new C9772e0(true);
        f26813j = e0Var;
        e0Var.m31706k();
    }

    /* renamed from: j */
    public static C9772e0 m31705j() {
        return f26813j;
    }

    /* renamed from: k */
    private void m31706k() {
        this.f26816g = C10444l.f28273g;
    }

    /* renamed from: l */
    public static C9774b m31707l() {
        return C9774b.m31722k();
    }

    /* renamed from: e */
    public int mo34361e() {
        int i = this.f26818i;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f26816g.size(); i3++) {
            i2 += CodedOutputStream.m35127c(this.f26816g.mo35804e(i3));
        }
        int size = 0 + i2 + (mo34451i().size() * 1) + this.f26815f.size();
        this.f26818i = size;
        return size;
    }

    /* renamed from: g */
    public C10452q<C9772e0> mo34363g() {
        return f26814k;
    }

    /* renamed from: i */
    public C10453r mo34451i() {
        return this.f26816g;
    }

    public final boolean isInitialized() {
        byte b = this.f26817h;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f26817h = 1;
        return true;
    }

    /* renamed from: kotlin.h0.u.e.k0.d.e0$b */
    /* compiled from: ProtoBuf */
    public static final class C9774b extends C10427h.C10429b<C9772e0, C9774b> implements C9780f0 {

        /* renamed from: g */
        private int f26819g;

        /* renamed from: h */
        private C10445m f26820h = C10444l.f28273g;

        private C9774b() {
            m31724m();
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public static C9774b m31722k() {
            return new C9774b();
        }

        /* renamed from: l */
        private void m31723l() {
            if ((this.f26819g & 1) != 1) {
                this.f26820h = new C10444l(this.f26820h);
                this.f26819g |= 1;
            }
        }

        /* renamed from: m */
        private void m31724m() {
        }

        /* renamed from: i */
        public C9772e0 mo34453i() {
            C9772e0 e0Var = new C9772e0((C10427h.C10429b) this);
            if ((this.f26819g & 1) == 1) {
                this.f26820h = this.f26820h.mo35796B();
                this.f26819g &= -2;
            }
            C10445m unused = e0Var.f26816g = this.f26820h;
            return e0Var;
        }

        public final boolean isInitialized() {
            return true;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ C10427h.C10429b mo34379a(C10427h hVar) {
            mo34452a((C9772e0) hVar);
            return this;
        }

        /* renamed from: b */
        public C9772e0 m31734b() {
            return C9772e0.m31705j();
        }

        public C9774b clone() {
            C9774b k = m31722k();
            k.mo34452a(mo34453i());
            return k;
        }

        /* renamed from: a */
        public C9772e0 m31731a() {
            C9772e0 i = mo34453i();
            if (i.isInitialized()) {
                return i;
            }
            throw C10410a.C10411a.m35207a(i);
        }

        /* renamed from: a */
        public C9774b mo34452a(C9772e0 e0Var) {
            if (e0Var == C9772e0.m31705j()) {
                return this;
            }
            if (!e0Var.f26816g.isEmpty()) {
                if (this.f26820h.isEmpty()) {
                    this.f26820h = e0Var.f26816g;
                    this.f26819g &= -2;
                } else {
                    m31723l();
                    this.f26820h.addAll(e0Var.f26816g);
                }
            }
            mo35761a(mo35762h().mo35686b(e0Var.f26815f));
            return this;
        }

        /* renamed from: a */
        public C9774b mo34377a(C10420e eVar, C10422f fVar) throws IOException {
            C9772e0 e0Var;
            C9772e0 e0Var2 = null;
            try {
                C9772e0 a = C9772e0.f26814k.mo34369a(eVar, fVar);
                if (a != null) {
                    mo34452a(a);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                e0Var = (C9772e0) e.mo35657a();
                throw e;
            } catch (Throwable th) {
                th = th;
                e0Var2 = e0Var;
            }
            if (e0Var2 != null) {
                mo34452a(e0Var2);
            }
            throw th;
        }
    }

    /* renamed from: c */
    public static C9774b m31704c(C9772e0 e0Var) {
        C9774b l = m31707l();
        l.mo34452a(e0Var);
        return l;
    }

    /* renamed from: f */
    public C9774b m31716f() {
        return m31707l();
    }

    private C9772e0(C10427h.C10429b bVar) {
        super(bVar);
        this.f26817h = -1;
        this.f26818i = -1;
        this.f26815f = bVar.mo35762h();
    }

    /* renamed from: a */
    public String mo34450a(int i) {
        return (String) this.f26816g.get(i);
    }

    /* renamed from: b */
    public C9772e0 m31711b() {
        return f26813j;
    }

    /* renamed from: c */
    public C9774b m31713c() {
        return m31704c(this);
    }

    /* renamed from: a */
    public void mo34358a(CodedOutputStream codedOutputStream) throws IOException {
        mo34361e();
        for (int i = 0; i < this.f26816g.size(); i++) {
            codedOutputStream.mo35623a(1, this.f26816g.mo35804e(i));
        }
        codedOutputStream.mo35638b(this.f26815f);
    }

    private C9772e0(boolean z) {
        this.f26817h = -1;
        this.f26818i = -1;
        this.f26815f = C10417d.f28215f;
    }

    private C9772e0(C10420e eVar, C10422f fVar) throws InvalidProtocolBufferException {
        this.f26817h = -1;
        this.f26818i = -1;
        m31706k();
        C10417d.C10419b j = C10417d.m35229j();
        CodedOutputStream a = CodedOutputStream.m35116a((OutputStream) j, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int x = eVar.mo35733x();
                if (x != 0) {
                    if (x == 10) {
                        C10417d d = eVar.mo35712d();
                        if (!z2 || !true) {
                            this.f26816g = new C10444l();
                            z2 |= true;
                        }
                        this.f26816g.mo35798a(d);
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
                if (z2 && true) {
                    this.f26816g = this.f26816g.mo35796B();
                }
                try {
                    a.mo35614a();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f26815f = j.mo35696a();
                    throw th2;
                }
                this.f26815f = j.mo35696a();
                mo35760h();
                throw th;
            }
        }
        if (z2 && true) {
            this.f26816g = this.f26816g.mo35796B();
        }
        try {
            a.mo35614a();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f26815f = j.mo35696a();
            throw th3;
        }
        this.f26815f = j.mo35696a();
        mo35760h();
    }
}
