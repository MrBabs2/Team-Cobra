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
import kotlin.reflect.jvm.internal.impl.protobuf.C10449o;
import kotlin.reflect.jvm.internal.impl.protobuf.C10452q;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* renamed from: kotlin.h0.u.e.k0.d.t0 */
/* compiled from: ProtoBuf */
public final class C9850t0 extends C10427h implements C9855u0 {

    /* renamed from: j */
    private static final C9850t0 f27153j;

    /* renamed from: k */
    public static C10452q<C9850t0> f27154k = new C9851a();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C10417d f27155f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public List<C9839r0> f27156g;

    /* renamed from: h */
    private byte f27157h;

    /* renamed from: i */
    private int f27158i;

    /* renamed from: kotlin.h0.u.e.k0.d.t0$a */
    /* compiled from: ProtoBuf */
    static class C9851a extends C10413b<C9850t0> {
        C9851a() {
        }

        /* renamed from: a */
        public C9850t0 m32695a(C10420e eVar, C10422f fVar) throws InvalidProtocolBufferException {
            return new C9850t0(eVar, fVar);
        }
    }

    static {
        C9850t0 t0Var = new C9850t0(true);
        f27153j = t0Var;
        t0Var.m32681l();
    }

    /* renamed from: k */
    public static C9850t0 m32680k() {
        return f27153j;
    }

    /* renamed from: l */
    private void m32681l() {
        this.f27156g = Collections.emptyList();
    }

    /* renamed from: m */
    public static C9852b m32682m() {
        return C9852b.m32697k();
    }

    /* renamed from: e */
    public int mo34361e() {
        int i = this.f27158i;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f27156g.size(); i3++) {
            i2 += CodedOutputStream.m35130d(1, (C10449o) this.f27156g.get(i3));
        }
        int size = i2 + this.f27155f.size();
        this.f27158i = size;
        return size;
    }

    /* renamed from: g */
    public C10452q<C9850t0> mo34363g() {
        return f27154k;
    }

    /* renamed from: i */
    public int mo34793i() {
        return this.f27156g.size();
    }

    public final boolean isInitialized() {
        byte b = this.f27157h;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.f27157h = 1;
        return true;
    }

    /* renamed from: j */
    public List<C9839r0> mo34794j() {
        return this.f27156g;
    }

    /* renamed from: kotlin.h0.u.e.k0.d.t0$b */
    /* compiled from: ProtoBuf */
    public static final class C9852b extends C10427h.C10429b<C9850t0, C9852b> implements C9855u0 {

        /* renamed from: g */
        private int f27159g;

        /* renamed from: h */
        private List<C9839r0> f27160h = Collections.emptyList();

        private C9852b() {
            m32699m();
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public static C9852b m32697k() {
            return new C9852b();
        }

        /* renamed from: l */
        private void m32698l() {
            if ((this.f27159g & 1) != 1) {
                this.f27160h = new ArrayList(this.f27160h);
                this.f27159g |= 1;
            }
        }

        /* renamed from: m */
        private void m32699m() {
        }

        /* renamed from: i */
        public C9850t0 mo34796i() {
            C9850t0 t0Var = new C9850t0((C10427h.C10429b) this);
            if ((this.f27159g & 1) == 1) {
                this.f27160h = Collections.unmodifiableList(this.f27160h);
                this.f27159g &= -2;
            }
            List unused = t0Var.f27156g = this.f27160h;
            return t0Var;
        }

        public final boolean isInitialized() {
            return true;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ C10427h.C10429b mo34379a(C10427h hVar) {
            mo34795a((C9850t0) hVar);
            return this;
        }

        /* renamed from: b */
        public C9850t0 m32709b() {
            return C9850t0.m32680k();
        }

        public C9852b clone() {
            C9852b k = m32697k();
            k.mo34795a(mo34796i());
            return k;
        }

        /* renamed from: a */
        public C9850t0 m32706a() {
            C9850t0 i = mo34796i();
            if (i.isInitialized()) {
                return i;
            }
            throw C10410a.C10411a.m35207a(i);
        }

        /* renamed from: a */
        public C9852b mo34795a(C9850t0 t0Var) {
            if (t0Var == C9850t0.m32680k()) {
                return this;
            }
            if (!t0Var.f27156g.isEmpty()) {
                if (this.f27160h.isEmpty()) {
                    this.f27160h = t0Var.f27156g;
                    this.f27159g &= -2;
                } else {
                    m32698l();
                    this.f27160h.addAll(t0Var.f27156g);
                }
            }
            mo35761a(mo35762h().mo35686b(t0Var.f27155f));
            return this;
        }

        /* renamed from: a */
        public C9852b mo34377a(C10420e eVar, C10422f fVar) throws IOException {
            C9850t0 t0Var;
            C9850t0 t0Var2 = null;
            try {
                C9850t0 a = C9850t0.f27154k.mo34369a(eVar, fVar);
                if (a != null) {
                    mo34795a(a);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                t0Var = (C9850t0) e.mo35657a();
                throw e;
            } catch (Throwable th) {
                th = th;
                t0Var2 = t0Var;
            }
            if (t0Var2 != null) {
                mo34795a(t0Var2);
            }
            throw th;
        }
    }

    /* renamed from: c */
    public static C9852b m32679c(C9850t0 t0Var) {
        C9852b m = m32682m();
        m.mo34795a(t0Var);
        return m;
    }

    /* renamed from: f */
    public C9852b m32690f() {
        return m32682m();
    }

    private C9850t0(C10427h.C10429b bVar) {
        super(bVar);
        this.f27157h = -1;
        this.f27158i = -1;
        this.f27155f = bVar.mo35762h();
    }

    /* renamed from: a */
    public void mo34358a(CodedOutputStream codedOutputStream) throws IOException {
        mo34361e();
        for (int i = 0; i < this.f27156g.size(); i++) {
            codedOutputStream.mo35636b(1, (C10449o) this.f27156g.get(i));
        }
        codedOutputStream.mo35638b(this.f27155f);
    }

    /* renamed from: b */
    public C9850t0 m32685b() {
        return f27153j;
    }

    /* renamed from: c */
    public C9852b m32687c() {
        return m32679c(this);
    }

    private C9850t0(boolean z) {
        this.f27157h = -1;
        this.f27158i = -1;
        this.f27155f = C10417d.f28215f;
    }

    private C9850t0(C10420e eVar, C10422f fVar) throws InvalidProtocolBufferException {
        this.f27157h = -1;
        this.f27158i = -1;
        m32681l();
        C10417d.C10419b j = C10417d.m35229j();
        CodedOutputStream a = CodedOutputStream.m35116a((OutputStream) j, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int x = eVar.mo35733x();
                if (x != 0) {
                    if (x == 10) {
                        if (!z2 || !true) {
                            this.f27156g = new ArrayList();
                            z2 |= true;
                        }
                        this.f27156g.add(eVar.mo35702a(C9839r0.f27119q, fVar));
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
                    this.f27156g = Collections.unmodifiableList(this.f27156g);
                }
                try {
                    a.mo35614a();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f27155f = j.mo35696a();
                    throw th2;
                }
                this.f27155f = j.mo35696a();
                mo35760h();
                throw th;
            }
        }
        if (z2 && true) {
            this.f27156g = Collections.unmodifiableList(this.f27156g);
        }
        try {
            a.mo35614a();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f27155f = j.mo35696a();
            throw th3;
        }
        this.f27155f = j.mo35696a();
        mo35760h();
    }
}
