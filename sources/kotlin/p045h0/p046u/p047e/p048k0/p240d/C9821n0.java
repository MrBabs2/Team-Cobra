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

/* renamed from: kotlin.h0.u.e.k0.d.n0 */
/* compiled from: ProtoBuf */
public final class C9821n0 extends C10427h implements C9825o0 {

    /* renamed from: l */
    private static final C9821n0 f27031l;

    /* renamed from: m */
    public static C10452q<C9821n0> f27032m = new C9822a();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C10417d f27033f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f27034g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public List<C9782g0> f27035h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f27036i;

    /* renamed from: j */
    private byte f27037j;

    /* renamed from: k */
    private int f27038k;

    /* renamed from: kotlin.h0.u.e.k0.d.n0$a */
    /* compiled from: ProtoBuf */
    static class C9822a extends C10413b<C9821n0> {
        C9822a() {
        }

        /* renamed from: a */
        public C9821n0 m32362a(C10420e eVar, C10422f fVar) throws InvalidProtocolBufferException {
            return new C9821n0(eVar, fVar);
        }
    }

    static {
        C9821n0 n0Var = new C9821n0(true);
        f27031l = n0Var;
        n0Var.m32345n();
    }

    /* renamed from: m */
    public static C9821n0 m32344m() {
        return f27031l;
    }

    /* renamed from: n */
    private void m32345n() {
        this.f27035h = Collections.emptyList();
        this.f27036i = -1;
    }

    /* renamed from: o */
    public static C9823b m32346o() {
        return C9823b.m32364l();
    }

    /* renamed from: e */
    public int mo34361e() {
        int i = this.f27038k;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f27035h.size(); i3++) {
            i2 += CodedOutputStream.m35130d(1, (C10449o) this.f27035h.get(i3));
        }
        if ((this.f27034g & 1) == 1) {
            i2 += CodedOutputStream.m35133f(2, this.f27036i);
        }
        int size = i2 + this.f27033f.size();
        this.f27038k = size;
        return size;
    }

    /* renamed from: g */
    public C10452q<C9821n0> mo34363g() {
        return f27032m;
    }

    /* renamed from: i */
    public int mo34667i() {
        return this.f27036i;
    }

    public final boolean isInitialized() {
        byte b = this.f27037j;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < mo34668j(); i++) {
            if (!mo34666a(i).isInitialized()) {
                this.f27037j = 0;
                return false;
            }
        }
        this.f27037j = 1;
        return true;
    }

    /* renamed from: j */
    public int mo34668j() {
        return this.f27035h.size();
    }

    /* renamed from: k */
    public List<C9782g0> mo34669k() {
        return this.f27035h;
    }

    /* renamed from: l */
    public boolean mo34670l() {
        return (this.f27034g & 1) == 1;
    }

    /* renamed from: kotlin.h0.u.e.k0.d.n0$b */
    /* compiled from: ProtoBuf */
    public static final class C9823b extends C10427h.C10429b<C9821n0, C9823b> implements C9825o0 {

        /* renamed from: g */
        private int f27039g;

        /* renamed from: h */
        private List<C9782g0> f27040h = Collections.emptyList();

        /* renamed from: i */
        private int f27041i = -1;

        private C9823b() {
            m32366n();
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public static C9823b m32364l() {
            return new C9823b();
        }

        /* renamed from: m */
        private void m32365m() {
            if ((this.f27039g & 1) != 1) {
                this.f27040h = new ArrayList(this.f27040h);
                this.f27039g |= 1;
            }
        }

        /* renamed from: n */
        private void m32366n() {
        }

        /* renamed from: i */
        public C9821n0 mo34674i() {
            C9821n0 n0Var = new C9821n0((C10427h.C10429b) this);
            int i = this.f27039g;
            int i2 = 1;
            if ((i & 1) == 1) {
                this.f27040h = Collections.unmodifiableList(this.f27040h);
                this.f27039g &= -2;
            }
            List unused = n0Var.f27035h = this.f27040h;
            if ((i & 2) != 2) {
                i2 = 0;
            }
            int unused2 = n0Var.f27036i = this.f27041i;
            int unused3 = n0Var.f27034g = i2;
            return n0Var;
        }

        public final boolean isInitialized() {
            for (int i = 0; i < mo34675j(); i++) {
                if (!mo34671a(i).isInitialized()) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: j */
        public int mo34675j() {
            return this.f27040h.size();
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ C10427h.C10429b mo34379a(C10427h hVar) {
            mo34672a((C9821n0) hVar);
            return this;
        }

        /* renamed from: b */
        public C9821n0 m32378b() {
            return C9821n0.m32344m();
        }

        public C9823b clone() {
            C9823b l = m32364l();
            l.mo34672a(mo34674i());
            return l;
        }

        /* renamed from: b */
        public C9823b mo34673b(int i) {
            this.f27039g |= 2;
            this.f27041i = i;
            return this;
        }

        /* renamed from: a */
        public C9821n0 m32374a() {
            C9821n0 i = mo34674i();
            if (i.isInitialized()) {
                return i;
            }
            throw C10410a.C10411a.m35207a(i);
        }

        /* renamed from: a */
        public C9823b mo34672a(C9821n0 n0Var) {
            if (n0Var == C9821n0.m32344m()) {
                return this;
            }
            if (!n0Var.f27035h.isEmpty()) {
                if (this.f27040h.isEmpty()) {
                    this.f27040h = n0Var.f27035h;
                    this.f27039g &= -2;
                } else {
                    m32365m();
                    this.f27040h.addAll(n0Var.f27035h);
                }
            }
            if (n0Var.mo34670l()) {
                mo34673b(n0Var.mo34667i());
            }
            mo35761a(mo35762h().mo35686b(n0Var.f27033f));
            return this;
        }

        /* renamed from: a */
        public C9823b mo34377a(C10420e eVar, C10422f fVar) throws IOException {
            C9821n0 n0Var;
            C9821n0 n0Var2 = null;
            try {
                C9821n0 a = C9821n0.f27032m.mo34369a(eVar, fVar);
                if (a != null) {
                    mo34672a(a);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                n0Var = (C9821n0) e.mo35657a();
                throw e;
            } catch (Throwable th) {
                th = th;
                n0Var2 = n0Var;
            }
            if (n0Var2 != null) {
                mo34672a(n0Var2);
            }
            throw th;
        }

        /* renamed from: a */
        public C9782g0 mo34671a(int i) {
            return this.f27040h.get(i);
        }
    }

    /* renamed from: c */
    public static C9823b m32343c(C9821n0 n0Var) {
        C9823b o = m32346o();
        o.mo34672a(n0Var);
        return o;
    }

    /* renamed from: f */
    public C9823b m32355f() {
        return m32346o();
    }

    private C9821n0(C10427h.C10429b bVar) {
        super(bVar);
        this.f27037j = -1;
        this.f27038k = -1;
        this.f27033f = bVar.mo35762h();
    }

    /* renamed from: c */
    public C9823b m32352c() {
        return m32343c(this);
    }

    /* renamed from: a */
    public C9782g0 mo34666a(int i) {
        return this.f27035h.get(i);
    }

    /* renamed from: b */
    public C9821n0 m32350b() {
        return f27031l;
    }

    /* renamed from: a */
    public void mo34358a(CodedOutputStream codedOutputStream) throws IOException {
        mo34361e();
        for (int i = 0; i < this.f27035h.size(); i++) {
            codedOutputStream.mo35636b(1, (C10449o) this.f27035h.get(i));
        }
        if ((this.f27034g & 1) == 1) {
            codedOutputStream.mo35635b(2, this.f27036i);
        }
        codedOutputStream.mo35638b(this.f27033f);
    }

    private C9821n0(boolean z) {
        this.f27037j = -1;
        this.f27038k = -1;
        this.f27033f = C10417d.f28215f;
    }

    private C9821n0(C10420e eVar, C10422f fVar) throws InvalidProtocolBufferException {
        this.f27037j = -1;
        this.f27038k = -1;
        m32345n();
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
                            this.f27035h = new ArrayList();
                            z2 |= true;
                        }
                        this.f27035h.add(eVar.mo35702a(C9782g0.f26873z, fVar));
                    } else if (x == 16) {
                        this.f27034g |= 1;
                        this.f27036i = eVar.mo35719j();
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
                    this.f27035h = Collections.unmodifiableList(this.f27035h);
                }
                try {
                    a.mo35614a();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f27033f = j.mo35696a();
                    throw th2;
                }
                this.f27033f = j.mo35696a();
                mo35760h();
                throw th;
            }
        }
        if (z2 && true) {
            this.f27035h = Collections.unmodifiableList(this.f27035h);
        }
        try {
            a.mo35614a();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f27033f = j.mo35696a();
            throw th3;
        }
        this.f27033f = j.mo35696a();
        mo35760h();
    }
}
