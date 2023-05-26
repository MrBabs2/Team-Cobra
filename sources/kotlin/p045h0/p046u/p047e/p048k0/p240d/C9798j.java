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

/* renamed from: kotlin.h0.u.e.k0.d.j */
/* compiled from: ProtoBuf */
public final class C9798j extends C10427h implements C9802k {

    /* renamed from: j */
    private static final C9798j f26964j;

    /* renamed from: k */
    public static C10452q<C9798j> f26965k = new C9799a();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C10417d f26966f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public List<C9804l> f26967g;

    /* renamed from: h */
    private byte f26968h;

    /* renamed from: i */
    private int f26969i;

    /* renamed from: kotlin.h0.u.e.k0.d.j$a */
    /* compiled from: ProtoBuf */
    static class C9799a extends C10413b<C9798j> {
        C9799a() {
        }

        /* renamed from: a */
        public C9798j m32160a(C10420e eVar, C10422f fVar) throws InvalidProtocolBufferException {
            return new C9798j(eVar, fVar);
        }
    }

    static {
        C9798j jVar = new C9798j(true);
        f26964j = jVar;
        jVar.m32146k();
    }

    /* renamed from: j */
    public static C9798j m32145j() {
        return f26964j;
    }

    /* renamed from: k */
    private void m32146k() {
        this.f26967g = Collections.emptyList();
    }

    /* renamed from: l */
    public static C9800b m32147l() {
        return C9800b.m32162l();
    }

    /* renamed from: e */
    public int mo34361e() {
        int i = this.f26969i;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f26967g.size(); i3++) {
            i2 += CodedOutputStream.m35130d(1, (C10449o) this.f26967g.get(i3));
        }
        int size = i2 + this.f26966f.size();
        this.f26969i = size;
        return size;
    }

    /* renamed from: g */
    public C10452q<C9798j> mo34363g() {
        return f26965k;
    }

    /* renamed from: i */
    public int mo34620i() {
        return this.f26967g.size();
    }

    public final boolean isInitialized() {
        byte b = this.f26968h;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < mo34620i(); i++) {
            if (!mo34619a(i).isInitialized()) {
                this.f26968h = 0;
                return false;
            }
        }
        this.f26968h = 1;
        return true;
    }

    /* renamed from: kotlin.h0.u.e.k0.d.j$b */
    /* compiled from: ProtoBuf */
    public static final class C9800b extends C10427h.C10429b<C9798j, C9800b> implements C9802k {

        /* renamed from: g */
        private int f26970g;

        /* renamed from: h */
        private List<C9804l> f26971h = Collections.emptyList();

        private C9800b() {
            m32164n();
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public static C9800b m32162l() {
            return new C9800b();
        }

        /* renamed from: m */
        private void m32163m() {
            if ((this.f26970g & 1) != 1) {
                this.f26971h = new ArrayList(this.f26971h);
                this.f26970g |= 1;
            }
        }

        /* renamed from: n */
        private void m32164n() {
        }

        /* renamed from: i */
        public C9798j mo34623i() {
            C9798j jVar = new C9798j((C10427h.C10429b) this);
            if ((this.f26970g & 1) == 1) {
                this.f26971h = Collections.unmodifiableList(this.f26971h);
                this.f26970g &= -2;
            }
            List unused = jVar.f26967g = this.f26971h;
            return jVar;
        }

        public final boolean isInitialized() {
            for (int i = 0; i < mo34624j(); i++) {
                if (!mo34622a(i).isInitialized()) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: j */
        public int mo34624j() {
            return this.f26971h.size();
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ C10427h.C10429b mo34379a(C10427h hVar) {
            mo34621a((C9798j) hVar);
            return this;
        }

        /* renamed from: b */
        public C9798j m32175b() {
            return C9798j.m32145j();
        }

        public C9800b clone() {
            C9800b l = m32162l();
            l.mo34621a(mo34623i());
            return l;
        }

        /* renamed from: a */
        public C9798j m32172a() {
            C9798j i = mo34623i();
            if (i.isInitialized()) {
                return i;
            }
            throw C10410a.C10411a.m35207a(i);
        }

        /* renamed from: a */
        public C9800b mo34621a(C9798j jVar) {
            if (jVar == C9798j.m32145j()) {
                return this;
            }
            if (!jVar.f26967g.isEmpty()) {
                if (this.f26971h.isEmpty()) {
                    this.f26971h = jVar.f26967g;
                    this.f26970g &= -2;
                } else {
                    m32163m();
                    this.f26971h.addAll(jVar.f26967g);
                }
            }
            mo35761a(mo35762h().mo35686b(jVar.f26966f));
            return this;
        }

        /* renamed from: a */
        public C9800b mo34377a(C10420e eVar, C10422f fVar) throws IOException {
            C9798j jVar;
            C9798j jVar2 = null;
            try {
                C9798j a = C9798j.f26965k.mo34369a(eVar, fVar);
                if (a != null) {
                    mo34621a(a);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                jVar = (C9798j) e.mo35657a();
                throw e;
            } catch (Throwable th) {
                th = th;
                jVar2 = jVar;
            }
            if (jVar2 != null) {
                mo34621a(jVar2);
            }
            throw th;
        }

        /* renamed from: a */
        public C9804l mo34622a(int i) {
            return this.f26971h.get(i);
        }
    }

    /* renamed from: c */
    public static C9800b m32144c(C9798j jVar) {
        C9800b l = m32147l();
        l.mo34621a(jVar);
        return l;
    }

    /* renamed from: f */
    public C9800b m32156f() {
        return m32147l();
    }

    private C9798j(C10427h.C10429b bVar) {
        super(bVar);
        this.f26968h = -1;
        this.f26969i = -1;
        this.f26966f = bVar.mo35762h();
    }

    /* renamed from: a */
    public C9804l mo34619a(int i) {
        return this.f26967g.get(i);
    }

    /* renamed from: b */
    public C9798j m32151b() {
        return f26964j;
    }

    /* renamed from: c */
    public C9800b m32153c() {
        return m32144c(this);
    }

    /* renamed from: a */
    public void mo34358a(CodedOutputStream codedOutputStream) throws IOException {
        mo34361e();
        for (int i = 0; i < this.f26967g.size(); i++) {
            codedOutputStream.mo35636b(1, (C10449o) this.f26967g.get(i));
        }
        codedOutputStream.mo35638b(this.f26966f);
    }

    private C9798j(boolean z) {
        this.f26968h = -1;
        this.f26969i = -1;
        this.f26966f = C10417d.f28215f;
    }

    private C9798j(C10420e eVar, C10422f fVar) throws InvalidProtocolBufferException {
        this.f26968h = -1;
        this.f26969i = -1;
        m32146k();
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
                            this.f26967g = new ArrayList();
                            z2 |= true;
                        }
                        this.f26967g.add(eVar.mo35702a(C9804l.f26973o, fVar));
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
                    this.f26967g = Collections.unmodifiableList(this.f26967g);
                }
                try {
                    a.mo35614a();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f26966f = j.mo35696a();
                    throw th2;
                }
                this.f26966f = j.mo35696a();
                mo35760h();
                throw th;
            }
        }
        if (z2 && true) {
            this.f26967g = Collections.unmodifiableList(this.f26967g);
        }
        try {
            a.mo35614a();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f26966f = j.mo35696a();
            throw th3;
        }
        this.f26966f = j.mo35696a();
        mo35760h();
    }
}
