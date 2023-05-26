package kotlin.p045h0.p046u.p047e.p048k0.p240d.p243y0;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9748b;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9775f;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9782g0;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9790h;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9811l0;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9836r;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9856v;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9930z;
import kotlin.reflect.jvm.internal.impl.protobuf.C10410a;
import kotlin.reflect.jvm.internal.impl.protobuf.C10413b;
import kotlin.reflect.jvm.internal.impl.protobuf.C10417d;
import kotlin.reflect.jvm.internal.impl.protobuf.C10420e;
import kotlin.reflect.jvm.internal.impl.protobuf.C10422f;
import kotlin.reflect.jvm.internal.impl.protobuf.C10427h;
import kotlin.reflect.jvm.internal.impl.protobuf.C10436i;
import kotlin.reflect.jvm.internal.impl.protobuf.C10449o;
import kotlin.reflect.jvm.internal.impl.protobuf.C10452q;
import kotlin.reflect.jvm.internal.impl.protobuf.C10472w;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* renamed from: kotlin.h0.u.e.k0.d.y0.a */
/* compiled from: JvmProtoBuf */
public final class C9890a {

    /* renamed from: a */
    public static final C10427h.C10435g<C9790h, C9895c> f27284a = C10427h.m35333a(C9790h.m32021q(), C9895c.m32949m(), (C10449o) C9895c.m32949m(), (C10436i.C10438b<?>) null, 100, C10472w.C10474b.MESSAGE, C9895c.class);

    /* renamed from: b */
    public static final C10427h.C10435g<C9836r, C9895c> f27285b = C10427h.m35333a(C9836r.m32512K(), C9895c.m32949m(), (C10449o) C9895c.m32949m(), (C10436i.C10438b<?>) null, 100, C10472w.C10474b.MESSAGE, C9895c.class);

    /* renamed from: c */
    public static final C10427h.C10435g<C9836r, Integer> f27286c = C10427h.m35333a(C9836r.m32512K(), null, (C10449o) null, (C10436i.C10438b<?>) null, 101, C10472w.C10474b.INT32, Integer.class);

    /* renamed from: d */
    public static final C10427h.C10435g<C9930z, C9898d> f27287d = C10427h.m35333a(C9930z.m33168K(), C9898d.m32990q(), (C10449o) C9898d.m32990q(), (C10436i.C10438b<?>) null, 100, C10472w.C10474b.MESSAGE, C9898d.class);

    /* renamed from: e */
    public static final C10427h.C10435g<C9930z, Integer> f27288e = C10427h.m35333a(C9930z.m33168K(), null, (C10449o) null, (C10436i.C10438b<?>) null, 101, C10472w.C10474b.INT32, Integer.class);

    /* renamed from: f */
    public static final C10427h.C10435g<C9782g0, List<C9748b>> f27289f = C10427h.m35334a(C9782g0.m31867P(), (C10449o) C9748b.m31451m(), (C10436i.C10438b<?>) null, 100, C10472w.C10474b.MESSAGE, false, C9748b.class);

    /* renamed from: g */
    public static final C10427h.C10435g<C9782g0, Boolean> f27290g = C10427h.m35333a(C9782g0.m31867P(), false, (C10449o) null, (C10436i.C10438b<?>) null, 101, C10472w.C10474b.BOOL, Boolean.class);

    /* renamed from: h */
    public static final C10427h.C10435g<C9811l0, List<C9748b>> f27291h = C10427h.m35334a(C9811l0.m32250w(), (C10449o) C9748b.m31451m(), (C10436i.C10438b<?>) null, 100, C10472w.C10474b.MESSAGE, false, C9748b.class);

    /* renamed from: i */
    public static final C10427h.C10435g<C9775f, Integer> f27292i = C10427h.m35333a(C9775f.m31736P(), null, (C10449o) null, (C10436i.C10438b<?>) null, 101, C10472w.C10474b.INT32, Integer.class);

    /* renamed from: j */
    public static final C10427h.C10435g<C9775f, List<C9930z>> f27293j = C10427h.m35334a(C9775f.m31736P(), (C10449o) C9930z.m33168K(), (C10436i.C10438b<?>) null, 102, C10472w.C10474b.MESSAGE, false, C9930z.class);

    /* renamed from: k */
    public static final C10427h.C10435g<C9775f, Integer> f27294k = C10427h.m35333a(C9775f.m31736P(), null, (C10449o) null, (C10436i.C10438b<?>) null, 103, C10472w.C10474b.INT32, Integer.class);

    /* renamed from: l */
    public static final C10427h.C10435g<C9856v, Integer> f27295l = C10427h.m35333a(C9856v.m32727v(), null, (C10449o) null, (C10436i.C10438b<?>) null, 101, C10472w.C10474b.INT32, Integer.class);

    /* renamed from: m */
    public static final C10427h.C10435g<C9856v, List<C9930z>> f27296m = C10427h.m35334a(C9856v.m32727v(), (C10449o) C9930z.m33168K(), (C10436i.C10438b<?>) null, 102, C10472w.C10474b.MESSAGE, false, C9930z.class);

    /* renamed from: kotlin.h0.u.e.k0.d.y0.a$b */
    /* compiled from: JvmProtoBuf */
    public static final class C9892b extends C10427h implements C9909b {

        /* renamed from: l */
        private static final C9892b f27297l;

        /* renamed from: m */
        public static C10452q<C9892b> f27298m = new C9893a();
        /* access modifiers changed from: private */

        /* renamed from: f */
        public final C10417d f27299f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public int f27300g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public int f27301h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public int f27302i;

        /* renamed from: j */
        private byte f27303j;

        /* renamed from: k */
        private int f27304k;

        /* renamed from: kotlin.h0.u.e.k0.d.y0.a$b$a */
        /* compiled from: JvmProtoBuf */
        static class C9893a extends C10413b<C9892b> {
            C9893a() {
            }

            /* renamed from: a */
            public C9892b m32927a(C10420e eVar, C10422f fVar) throws InvalidProtocolBufferException {
                return new C9892b(eVar, fVar);
            }
        }

        static {
            C9892b bVar = new C9892b(true);
            f27297l = bVar;
            bVar.m32911n();
        }

        /* renamed from: m */
        public static C9892b m32910m() {
            return f27297l;
        }

        /* renamed from: n */
        private void m32911n() {
            this.f27301h = 0;
            this.f27302i = 0;
        }

        /* renamed from: o */
        public static C9894b m32912o() {
            return C9894b.m32929k();
        }

        /* renamed from: e */
        public int mo34361e() {
            int i = this.f27304k;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.f27300g & 1) == 1) {
                i2 = 0 + CodedOutputStream.m35133f(1, this.f27301h);
            }
            if ((this.f27300g & 2) == 2) {
                i2 += CodedOutputStream.m35133f(2, this.f27302i);
            }
            int size = i2 + this.f27299f.size();
            this.f27304k = size;
            return size;
        }

        /* renamed from: g */
        public C10452q<C9892b> mo34363g() {
            return f27298m;
        }

        /* renamed from: i */
        public int mo34870i() {
            return this.f27302i;
        }

        public final boolean isInitialized() {
            byte b = this.f27303j;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.f27303j = 1;
            return true;
        }

        /* renamed from: j */
        public int mo34871j() {
            return this.f27301h;
        }

        /* renamed from: k */
        public boolean mo34872k() {
            return (this.f27300g & 2) == 2;
        }

        /* renamed from: l */
        public boolean mo34873l() {
            return (this.f27300g & 1) == 1;
        }

        /* renamed from: kotlin.h0.u.e.k0.d.y0.a$b$b */
        /* compiled from: JvmProtoBuf */
        public static final class C9894b extends C10427h.C10429b<C9892b, C9894b> implements C9909b {

            /* renamed from: g */
            private int f27305g;

            /* renamed from: h */
            private int f27306h;

            /* renamed from: i */
            private int f27307i;

            private C9894b() {
                m32930l();
            }

            /* access modifiers changed from: private */
            /* renamed from: k */
            public static C9894b m32929k() {
                return new C9894b();
            }

            /* renamed from: l */
            private void m32930l() {
            }

            /* renamed from: i */
            public C9892b mo34877i() {
                C9892b bVar = new C9892b((C10427h.C10429b) this);
                int i = this.f27305g;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                int unused = bVar.f27301h = this.f27306h;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                int unused2 = bVar.f27302i = this.f27307i;
                int unused3 = bVar.f27300g = i2;
                return bVar;
            }

            public final boolean isInitialized() {
                return true;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ C10427h.C10429b mo34379a(C10427h hVar) {
                mo34875a((C9892b) hVar);
                return this;
            }

            /* renamed from: b */
            public C9892b m32942b() {
                return C9892b.m32910m();
            }

            public C9894b clone() {
                C9894b k = m32929k();
                k.mo34875a(mo34877i());
                return k;
            }

            /* renamed from: b */
            public C9894b mo34876b(int i) {
                this.f27305g |= 1;
                this.f27306h = i;
                return this;
            }

            /* renamed from: a */
            public C9892b m32938a() {
                C9892b i = mo34877i();
                if (i.isInitialized()) {
                    return i;
                }
                throw C10410a.C10411a.m35207a(i);
            }

            /* renamed from: a */
            public C9894b mo34875a(C9892b bVar) {
                if (bVar == C9892b.m32910m()) {
                    return this;
                }
                if (bVar.mo34873l()) {
                    mo34876b(bVar.mo34871j());
                }
                if (bVar.mo34872k()) {
                    mo34874a(bVar.mo34870i());
                }
                mo35761a(mo35762h().mo35686b(bVar.f27299f));
                return this;
            }

            /* renamed from: a */
            public C9894b mo34377a(C10420e eVar, C10422f fVar) throws IOException {
                C9892b bVar;
                C9892b bVar2 = null;
                try {
                    C9892b a = C9892b.f27298m.mo34369a(eVar, fVar);
                    if (a != null) {
                        mo34875a(a);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    bVar = (C9892b) e.mo35657a();
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    bVar2 = bVar;
                }
                if (bVar2 != null) {
                    mo34875a(bVar2);
                }
                throw th;
            }

            /* renamed from: a */
            public C9894b mo34874a(int i) {
                this.f27305g |= 2;
                this.f27307i = i;
                return this;
            }
        }

        /* renamed from: f */
        public C9894b m32920f() {
            return m32912o();
        }

        private C9892b(C10427h.C10429b bVar) {
            super(bVar);
            this.f27303j = -1;
            this.f27304k = -1;
            this.f27299f = bVar.mo35762h();
        }

        /* renamed from: a */
        public void mo34358a(CodedOutputStream codedOutputStream) throws IOException {
            mo34361e();
            if ((this.f27300g & 1) == 1) {
                codedOutputStream.mo35635b(1, this.f27301h);
            }
            if ((this.f27300g & 2) == 2) {
                codedOutputStream.mo35635b(2, this.f27302i);
            }
            codedOutputStream.mo35638b(this.f27299f);
        }

        /* renamed from: b */
        public C9892b m32915b() {
            return f27297l;
        }

        /* renamed from: c */
        public C9894b m32917c() {
            return m32908b(this);
        }

        /* renamed from: b */
        public static C9894b m32908b(C9892b bVar) {
            C9894b o = m32912o();
            o.mo34875a(bVar);
            return o;
        }

        private C9892b(boolean z) {
            this.f27303j = -1;
            this.f27304k = -1;
            this.f27299f = C10417d.f28215f;
        }

        private C9892b(C10420e eVar, C10422f fVar) throws InvalidProtocolBufferException {
            this.f27303j = -1;
            this.f27304k = -1;
            m32911n();
            C10417d.C10419b j = C10417d.m35229j();
            CodedOutputStream a = CodedOutputStream.m35116a((OutputStream) j, 1);
            boolean z = false;
            while (!z) {
                try {
                    int x = eVar.mo35733x();
                    if (x != 0) {
                        if (x == 8) {
                            this.f27300g |= 1;
                            this.f27301h = eVar.mo35719j();
                        } else if (x == 16) {
                            this.f27300g |= 2;
                            this.f27302i = eVar.mo35719j();
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
                        this.f27299f = j.mo35696a();
                        throw th2;
                    }
                    this.f27299f = j.mo35696a();
                    mo35760h();
                    throw th;
                }
            }
            try {
                a.mo35614a();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f27299f = j.mo35696a();
                throw th3;
            }
            this.f27299f = j.mo35696a();
            mo35760h();
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.d.y0.a$c */
    /* compiled from: JvmProtoBuf */
    public static final class C9895c extends C10427h implements C9910c {

        /* renamed from: l */
        private static final C9895c f27308l;

        /* renamed from: m */
        public static C10452q<C9895c> f27309m = new C9896a();
        /* access modifiers changed from: private */

        /* renamed from: f */
        public final C10417d f27310f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public int f27311g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public int f27312h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public int f27313i;

        /* renamed from: j */
        private byte f27314j;

        /* renamed from: k */
        private int f27315k;

        /* renamed from: kotlin.h0.u.e.k0.d.y0.a$c$a */
        /* compiled from: JvmProtoBuf */
        static class C9896a extends C10413b<C9895c> {
            C9896a() {
            }

            /* renamed from: a */
            public C9895c m32966a(C10420e eVar, C10422f fVar) throws InvalidProtocolBufferException {
                return new C9895c(eVar, fVar);
            }
        }

        static {
            C9895c cVar = new C9895c(true);
            f27308l = cVar;
            cVar.m32950n();
        }

        /* renamed from: m */
        public static C9895c m32949m() {
            return f27308l;
        }

        /* renamed from: n */
        private void m32950n() {
            this.f27312h = 0;
            this.f27313i = 0;
        }

        /* renamed from: o */
        public static C9897b m32951o() {
            return C9897b.m32968k();
        }

        /* renamed from: e */
        public int mo34361e() {
            int i = this.f27315k;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.f27311g & 1) == 1) {
                i2 = 0 + CodedOutputStream.m35133f(1, this.f27312h);
            }
            if ((this.f27311g & 2) == 2) {
                i2 += CodedOutputStream.m35133f(2, this.f27313i);
            }
            int size = i2 + this.f27310f.size();
            this.f27315k = size;
            return size;
        }

        /* renamed from: g */
        public C10452q<C9895c> mo34363g() {
            return f27309m;
        }

        /* renamed from: i */
        public int mo34878i() {
            return this.f27313i;
        }

        public final boolean isInitialized() {
            byte b = this.f27314j;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.f27314j = 1;
            return true;
        }

        /* renamed from: j */
        public int mo34879j() {
            return this.f27312h;
        }

        /* renamed from: k */
        public boolean mo34880k() {
            return (this.f27311g & 2) == 2;
        }

        /* renamed from: l */
        public boolean mo34881l() {
            return (this.f27311g & 1) == 1;
        }

        /* renamed from: kotlin.h0.u.e.k0.d.y0.a$c$b */
        /* compiled from: JvmProtoBuf */
        public static final class C9897b extends C10427h.C10429b<C9895c, C9897b> implements C9910c {

            /* renamed from: g */
            private int f27316g;

            /* renamed from: h */
            private int f27317h;

            /* renamed from: i */
            private int f27318i;

            private C9897b() {
                m32969l();
            }

            /* access modifiers changed from: private */
            /* renamed from: k */
            public static C9897b m32968k() {
                return new C9897b();
            }

            /* renamed from: l */
            private void m32969l() {
            }

            /* renamed from: i */
            public C9895c mo34885i() {
                C9895c cVar = new C9895c((C10427h.C10429b) this);
                int i = this.f27316g;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                int unused = cVar.f27312h = this.f27317h;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                int unused2 = cVar.f27313i = this.f27318i;
                int unused3 = cVar.f27311g = i2;
                return cVar;
            }

            public final boolean isInitialized() {
                return true;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ C10427h.C10429b mo34379a(C10427h hVar) {
                mo34883a((C9895c) hVar);
                return this;
            }

            /* renamed from: b */
            public C9895c m32981b() {
                return C9895c.m32949m();
            }

            public C9897b clone() {
                C9897b k = m32968k();
                k.mo34883a(mo34885i());
                return k;
            }

            /* renamed from: b */
            public C9897b mo34884b(int i) {
                this.f27316g |= 1;
                this.f27317h = i;
                return this;
            }

            /* renamed from: a */
            public C9895c m32977a() {
                C9895c i = mo34885i();
                if (i.isInitialized()) {
                    return i;
                }
                throw C10410a.C10411a.m35207a(i);
            }

            /* renamed from: a */
            public C9897b mo34883a(C9895c cVar) {
                if (cVar == C9895c.m32949m()) {
                    return this;
                }
                if (cVar.mo34881l()) {
                    mo34884b(cVar.mo34879j());
                }
                if (cVar.mo34880k()) {
                    mo34882a(cVar.mo34878i());
                }
                mo35761a(mo35762h().mo35686b(cVar.f27310f));
                return this;
            }

            /* renamed from: a */
            public C9897b mo34377a(C10420e eVar, C10422f fVar) throws IOException {
                C9895c cVar;
                C9895c cVar2 = null;
                try {
                    C9895c a = C9895c.f27309m.mo34369a(eVar, fVar);
                    if (a != null) {
                        mo34883a(a);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    cVar = (C9895c) e.mo35657a();
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    cVar2 = cVar;
                }
                if (cVar2 != null) {
                    mo34883a(cVar2);
                }
                throw th;
            }

            /* renamed from: a */
            public C9897b mo34882a(int i) {
                this.f27316g |= 2;
                this.f27318i = i;
                return this;
            }
        }

        /* renamed from: f */
        public C9897b m32959f() {
            return m32951o();
        }

        private C9895c(C10427h.C10429b bVar) {
            super(bVar);
            this.f27314j = -1;
            this.f27315k = -1;
            this.f27310f = bVar.mo35762h();
        }

        /* renamed from: a */
        public void mo34358a(CodedOutputStream codedOutputStream) throws IOException {
            mo34361e();
            if ((this.f27311g & 1) == 1) {
                codedOutputStream.mo35635b(1, this.f27312h);
            }
            if ((this.f27311g & 2) == 2) {
                codedOutputStream.mo35635b(2, this.f27313i);
            }
            codedOutputStream.mo35638b(this.f27310f);
        }

        /* renamed from: b */
        public C9895c m32954b() {
            return f27308l;
        }

        /* renamed from: c */
        public C9897b m32956c() {
            return m32947b(this);
        }

        /* renamed from: b */
        public static C9897b m32947b(C9895c cVar) {
            C9897b o = m32951o();
            o.mo34883a(cVar);
            return o;
        }

        private C9895c(boolean z) {
            this.f27314j = -1;
            this.f27315k = -1;
            this.f27310f = C10417d.f28215f;
        }

        private C9895c(C10420e eVar, C10422f fVar) throws InvalidProtocolBufferException {
            this.f27314j = -1;
            this.f27315k = -1;
            m32950n();
            C10417d.C10419b j = C10417d.m35229j();
            CodedOutputStream a = CodedOutputStream.m35116a((OutputStream) j, 1);
            boolean z = false;
            while (!z) {
                try {
                    int x = eVar.mo35733x();
                    if (x != 0) {
                        if (x == 8) {
                            this.f27311g |= 1;
                            this.f27312h = eVar.mo35719j();
                        } else if (x == 16) {
                            this.f27311g |= 2;
                            this.f27313i = eVar.mo35719j();
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
                        this.f27310f = j.mo35696a();
                        throw th2;
                    }
                    this.f27310f = j.mo35696a();
                    mo35760h();
                    throw th;
                }
            }
            try {
                a.mo35614a();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f27310f = j.mo35696a();
                throw th3;
            }
            this.f27310f = j.mo35696a();
            mo35760h();
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.d.y0.a$d */
    /* compiled from: JvmProtoBuf */
    public static final class C9898d extends C10427h implements C9911d {

        /* renamed from: n */
        private static final C9898d f27319n;

        /* renamed from: o */
        public static C10452q<C9898d> f27320o = new C9899a();
        /* access modifiers changed from: private */

        /* renamed from: f */
        public final C10417d f27321f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public int f27322g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public C9892b f27323h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public C9895c f27324i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public C9895c f27325j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public C9895c f27326k;

        /* renamed from: l */
        private byte f27327l;

        /* renamed from: m */
        private int f27328m;

        /* renamed from: kotlin.h0.u.e.k0.d.y0.a$d$a */
        /* compiled from: JvmProtoBuf */
        static class C9899a extends C10413b<C9898d> {
            C9899a() {
            }

            /* renamed from: a */
            public C9898d m33011a(C10420e eVar, C10422f fVar) throws InvalidProtocolBufferException {
                return new C9898d(eVar, fVar);
            }
        }

        static {
            C9898d dVar = new C9898d(true);
            f27319n = dVar;
            dVar.m32991r();
        }

        /* renamed from: q */
        public static C9898d m32990q() {
            return f27319n;
        }

        /* renamed from: r */
        private void m32991r() {
            this.f27323h = C9892b.m32910m();
            this.f27324i = C9895c.m32949m();
            this.f27325j = C9895c.m32949m();
            this.f27326k = C9895c.m32949m();
        }

        /* renamed from: s */
        public static C9900b m32992s() {
            return C9900b.m33013k();
        }

        /* renamed from: e */
        public int mo34361e() {
            int i = this.f27328m;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.f27322g & 1) == 1) {
                i2 = 0 + CodedOutputStream.m35130d(1, (C10449o) this.f27323h);
            }
            if ((this.f27322g & 2) == 2) {
                i2 += CodedOutputStream.m35130d(2, (C10449o) this.f27324i);
            }
            if ((this.f27322g & 4) == 4) {
                i2 += CodedOutputStream.m35130d(3, (C10449o) this.f27325j);
            }
            if ((this.f27322g & 8) == 8) {
                i2 += CodedOutputStream.m35130d(4, (C10449o) this.f27326k);
            }
            int size = i2 + this.f27321f.size();
            this.f27328m = size;
            return size;
        }

        /* renamed from: g */
        public C10452q<C9898d> mo34363g() {
            return f27320o;
        }

        /* renamed from: i */
        public C9892b mo34886i() {
            return this.f27323h;
        }

        public final boolean isInitialized() {
            byte b = this.f27327l;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.f27327l = 1;
            return true;
        }

        /* renamed from: j */
        public C9895c mo34887j() {
            return this.f27325j;
        }

        /* renamed from: k */
        public C9895c mo34888k() {
            return this.f27326k;
        }

        /* renamed from: l */
        public C9895c mo34889l() {
            return this.f27324i;
        }

        /* renamed from: m */
        public boolean mo34890m() {
            return (this.f27322g & 1) == 1;
        }

        /* renamed from: n */
        public boolean mo34891n() {
            return (this.f27322g & 4) == 4;
        }

        /* renamed from: o */
        public boolean mo34892o() {
            return (this.f27322g & 8) == 8;
        }

        /* renamed from: p */
        public boolean mo34893p() {
            return (this.f27322g & 2) == 2;
        }

        /* renamed from: kotlin.h0.u.e.k0.d.y0.a$d$b */
        /* compiled from: JvmProtoBuf */
        public static final class C9900b extends C10427h.C10429b<C9898d, C9900b> implements C9911d {

            /* renamed from: g */
            private int f27329g;

            /* renamed from: h */
            private C9892b f27330h = C9892b.m32910m();

            /* renamed from: i */
            private C9895c f27331i = C9895c.m32949m();

            /* renamed from: j */
            private C9895c f27332j = C9895c.m32949m();

            /* renamed from: k */
            private C9895c f27333k = C9895c.m32949m();

            private C9900b() {
                m33014l();
            }

            /* access modifiers changed from: private */
            /* renamed from: k */
            public static C9900b m33013k() {
                return new C9900b();
            }

            /* renamed from: l */
            private void m33014l() {
            }

            /* renamed from: c */
            public C9900b mo34898c(C9895c cVar) {
                if ((this.f27329g & 2) != 2 || this.f27331i == C9895c.m32949m()) {
                    this.f27331i = cVar;
                } else {
                    C9895c.C9897b b = C9895c.m32947b(this.f27331i);
                    b.mo34883a(cVar);
                    this.f27331i = b.mo34885i();
                }
                this.f27329g |= 2;
                return this;
            }

            /* renamed from: i */
            public C9898d mo34899i() {
                C9898d dVar = new C9898d((C10427h.C10429b) this);
                int i = this.f27329g;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                C9892b unused = dVar.f27323h = this.f27330h;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                C9895c unused2 = dVar.f27324i = this.f27331i;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                C9895c unused3 = dVar.f27325j = this.f27332j;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                C9895c unused4 = dVar.f27326k = this.f27333k;
                int unused5 = dVar.f27322g = i2;
                return dVar;
            }

            public final boolean isInitialized() {
                return true;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ C10427h.C10429b mo34379a(C10427h hVar) {
                mo34896a((C9898d) hVar);
                return this;
            }

            /* renamed from: b */
            public C9898d m33027b() {
                return C9898d.m32990q();
            }

            public C9900b clone() {
                C9900b k = m33013k();
                k.mo34896a(mo34899i());
                return k;
            }

            /* renamed from: b */
            public C9900b mo34897b(C9895c cVar) {
                if ((this.f27329g & 8) != 8 || this.f27333k == C9895c.m32949m()) {
                    this.f27333k = cVar;
                } else {
                    C9895c.C9897b b = C9895c.m32947b(this.f27333k);
                    b.mo34883a(cVar);
                    this.f27333k = b.mo34885i();
                }
                this.f27329g |= 8;
                return this;
            }

            /* renamed from: a */
            public C9898d m33023a() {
                C9898d i = mo34899i();
                if (i.isInitialized()) {
                    return i;
                }
                throw C10410a.C10411a.m35207a(i);
            }

            /* renamed from: a */
            public C9900b mo34896a(C9898d dVar) {
                if (dVar == C9898d.m32990q()) {
                    return this;
                }
                if (dVar.mo34890m()) {
                    mo34894a(dVar.mo34886i());
                }
                if (dVar.mo34893p()) {
                    mo34898c(dVar.mo34889l());
                }
                if (dVar.mo34891n()) {
                    mo34895a(dVar.mo34887j());
                }
                if (dVar.mo34892o()) {
                    mo34897b(dVar.mo34888k());
                }
                mo35761a(mo35762h().mo35686b(dVar.f27321f));
                return this;
            }

            /* renamed from: a */
            public C9900b mo34377a(C10420e eVar, C10422f fVar) throws IOException {
                C9898d dVar;
                C9898d dVar2 = null;
                try {
                    C9898d a = C9898d.f27320o.mo34369a(eVar, fVar);
                    if (a != null) {
                        mo34896a(a);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    dVar = (C9898d) e.mo35657a();
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    dVar2 = dVar;
                }
                if (dVar2 != null) {
                    mo34896a(dVar2);
                }
                throw th;
            }

            /* renamed from: a */
            public C9900b mo34894a(C9892b bVar) {
                if ((this.f27329g & 1) != 1 || this.f27330h == C9892b.m32910m()) {
                    this.f27330h = bVar;
                } else {
                    C9892b.C9894b b = C9892b.m32908b(this.f27330h);
                    b.mo34875a(bVar);
                    this.f27330h = b.mo34877i();
                }
                this.f27329g |= 1;
                return this;
            }

            /* renamed from: a */
            public C9900b mo34895a(C9895c cVar) {
                if ((this.f27329g & 4) != 4 || this.f27332j == C9895c.m32949m()) {
                    this.f27332j = cVar;
                } else {
                    C9895c.C9897b b = C9895c.m32947b(this.f27332j);
                    b.mo34883a(cVar);
                    this.f27332j = b.mo34885i();
                }
                this.f27329g |= 4;
                return this;
            }
        }

        /* renamed from: f */
        public C9900b m33000f() {
            return m32992s();
        }

        private C9898d(C10427h.C10429b bVar) {
            super(bVar);
            this.f27327l = -1;
            this.f27328m = -1;
            this.f27321f = bVar.mo35762h();
        }

        /* renamed from: b */
        public C9898d m32995b() {
            return f27319n;
        }

        /* renamed from: c */
        public C9900b m32997c() {
            return m32988b(this);
        }

        /* renamed from: b */
        public static C9900b m32988b(C9898d dVar) {
            C9900b s = m32992s();
            s.mo34896a(dVar);
            return s;
        }

        /* renamed from: a */
        public void mo34358a(CodedOutputStream codedOutputStream) throws IOException {
            mo34361e();
            if ((this.f27322g & 1) == 1) {
                codedOutputStream.mo35636b(1, (C10449o) this.f27323h);
            }
            if ((this.f27322g & 2) == 2) {
                codedOutputStream.mo35636b(2, (C10449o) this.f27324i);
            }
            if ((this.f27322g & 4) == 4) {
                codedOutputStream.mo35636b(3, (C10449o) this.f27325j);
            }
            if ((this.f27322g & 8) == 8) {
                codedOutputStream.mo35636b(4, (C10449o) this.f27326k);
            }
            codedOutputStream.mo35638b(this.f27321f);
        }

        private C9898d(boolean z) {
            this.f27327l = -1;
            this.f27328m = -1;
            this.f27321f = C10417d.f28215f;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: kotlin.h0.u.e.k0.d.y0.a$b$b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: kotlin.h0.u.e.k0.d.y0.a$c$b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: kotlin.h0.u.e.k0.d.y0.a$c$b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: kotlin.h0.u.e.k0.d.y0.a$c$b} */
        /* JADX WARNING: type inference failed for: r6v0 */
        /* JADX WARNING: type inference failed for: r6v9 */
        /* JADX WARNING: type inference failed for: r6v10 */
        /* JADX WARNING: type inference failed for: r6v11 */
        /* JADX WARNING: type inference failed for: r6v12 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private C9898d(kotlin.reflect.jvm.internal.impl.protobuf.C10420e r8, kotlin.reflect.jvm.internal.impl.protobuf.C10422f r9) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            /*
                r7 = this;
                r7.<init>()
                r0 = -1
                r7.f27327l = r0
                r7.f27328m = r0
                r7.m32991r()
                kotlin.reflect.jvm.internal.impl.protobuf.d$b r0 = kotlin.reflect.jvm.internal.impl.protobuf.C10417d.m35229j()
                r1 = 1
                kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r2 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.m35116a((java.io.OutputStream) r0, (int) r1)
                r3 = 0
            L_0x0015:
                if (r3 != 0) goto L_0x0102
                int r4 = r8.mo35733x()     // Catch:{ InvalidProtocolBufferException -> 0x00e7, IOException -> 0x00d9 }
                if (r4 == 0) goto L_0x00d4
                r5 = 10
                r6 = 0
                if (r4 == r5) goto L_0x00ad
                r5 = 18
                if (r4 == r5) goto L_0x0085
                r5 = 26
                if (r4 == r5) goto L_0x005e
                r5 = 34
                if (r4 == r5) goto L_0x0036
                boolean r4 = r7.mo35759a(r8, r2, r9, r4)     // Catch:{ InvalidProtocolBufferException -> 0x00e7, IOException -> 0x00d9 }
                if (r4 != 0) goto L_0x0015
                goto L_0x00d4
            L_0x0036:
                int r4 = r7.f27322g     // Catch:{ InvalidProtocolBufferException -> 0x00e7, IOException -> 0x00d9 }
                r5 = 8
                r4 = r4 & r5
                if (r4 != r5) goto L_0x0043
                kotlin.h0.u.e.k0.d.y0.a$c r4 = r7.f27326k     // Catch:{ InvalidProtocolBufferException -> 0x00e7, IOException -> 0x00d9 }
                kotlin.h0.u.e.k0.d.y0.a$c$b r6 = r4.m32956c()     // Catch:{ InvalidProtocolBufferException -> 0x00e7, IOException -> 0x00d9 }
            L_0x0043:
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.h0.u.e.k0.d.y0.a$c> r4 = kotlin.p045h0.p046u.p047e.p048k0.p240d.p243y0.C9890a.C9895c.f27309m     // Catch:{ InvalidProtocolBufferException -> 0x00e7, IOException -> 0x00d9 }
                kotlin.reflect.jvm.internal.impl.protobuf.o r4 = r8.mo35702a(r4, (kotlin.reflect.jvm.internal.impl.protobuf.C10422f) r9)     // Catch:{ InvalidProtocolBufferException -> 0x00e7, IOException -> 0x00d9 }
                kotlin.h0.u.e.k0.d.y0.a$c r4 = (kotlin.p045h0.p046u.p047e.p048k0.p240d.p243y0.C9890a.C9895c) r4     // Catch:{ InvalidProtocolBufferException -> 0x00e7, IOException -> 0x00d9 }
                r7.f27326k = r4     // Catch:{ InvalidProtocolBufferException -> 0x00e7, IOException -> 0x00d9 }
                if (r6 == 0) goto L_0x0058
                r6.mo34883a((kotlin.p045h0.p046u.p047e.p048k0.p240d.p243y0.C9890a.C9895c) r4)     // Catch:{ InvalidProtocolBufferException -> 0x00e7, IOException -> 0x00d9 }
                kotlin.h0.u.e.k0.d.y0.a$c r4 = r6.mo34885i()     // Catch:{ InvalidProtocolBufferException -> 0x00e7, IOException -> 0x00d9 }
                r7.f27326k = r4     // Catch:{ InvalidProtocolBufferException -> 0x00e7, IOException -> 0x00d9 }
            L_0x0058:
                int r4 = r7.f27322g     // Catch:{ InvalidProtocolBufferException -> 0x00e7, IOException -> 0x00d9 }
                r4 = r4 | r5
                r7.f27322g = r4     // Catch:{ InvalidProtocolBufferException -> 0x00e7, IOException -> 0x00d9 }
                goto L_0x0015
            L_0x005e:
                int r4 = r7.f27322g     // Catch:{ InvalidProtocolBufferException -> 0x00e7, IOException -> 0x00d9 }
                r5 = 4
                r4 = r4 & r5
                if (r4 != r5) goto L_0x006a
                kotlin.h0.u.e.k0.d.y0.a$c r4 = r7.f27325j     // Catch:{ InvalidProtocolBufferException -> 0x00e7, IOException -> 0x00d9 }
                kotlin.h0.u.e.k0.d.y0.a$c$b r6 = r4.m32956c()     // Catch:{ InvalidProtocolBufferException -> 0x00e7, IOException -> 0x00d9 }
            L_0x006a:
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.h0.u.e.k0.d.y0.a$c> r4 = kotlin.p045h0.p046u.p047e.p048k0.p240d.p243y0.C9890a.C9895c.f27309m     // Catch:{ InvalidProtocolBufferException -> 0x00e7, IOException -> 0x00d9 }
                kotlin.reflect.jvm.internal.impl.protobuf.o r4 = r8.mo35702a(r4, (kotlin.reflect.jvm.internal.impl.protobuf.C10422f) r9)     // Catch:{ InvalidProtocolBufferException -> 0x00e7, IOException -> 0x00d9 }
                kotlin.h0.u.e.k0.d.y0.a$c r4 = (kotlin.p045h0.p046u.p047e.p048k0.p240d.p243y0.C9890a.C9895c) r4     // Catch:{ InvalidProtocolBufferException -> 0x00e7, IOException -> 0x00d9 }
                r7.f27325j = r4     // Catch:{ InvalidProtocolBufferException -> 0x00e7, IOException -> 0x00d9 }
                if (r6 == 0) goto L_0x007f
                r6.mo34883a((kotlin.p045h0.p046u.p047e.p048k0.p240d.p243y0.C9890a.C9895c) r4)     // Catch:{ InvalidProtocolBufferException -> 0x00e7, IOException -> 0x00d9 }
                kotlin.h0.u.e.k0.d.y0.a$c r4 = r6.mo34885i()     // Catch:{ InvalidProtocolBufferException -> 0x00e7, IOException -> 0x00d9 }
                r7.f27325j = r4     // Catch:{ InvalidProtocolBufferException -> 0x00e7, IOException -> 0x00d9 }
            L_0x007f:
                int r4 = r7.f27322g     // Catch:{ InvalidProtocolBufferException -> 0x00e7, IOException -> 0x00d9 }
                r4 = r4 | r5
                r7.f27322g = r4     // Catch:{ InvalidProtocolBufferException -> 0x00e7, IOException -> 0x00d9 }
                goto L_0x0015
            L_0x0085:
                int r4 = r7.f27322g     // Catch:{ InvalidProtocolBufferException -> 0x00e7, IOException -> 0x00d9 }
                r5 = 2
                r4 = r4 & r5
                if (r4 != r5) goto L_0x0091
                kotlin.h0.u.e.k0.d.y0.a$c r4 = r7.f27324i     // Catch:{ InvalidProtocolBufferException -> 0x00e7, IOException -> 0x00d9 }
                kotlin.h0.u.e.k0.d.y0.a$c$b r6 = r4.m32956c()     // Catch:{ InvalidProtocolBufferException -> 0x00e7, IOException -> 0x00d9 }
            L_0x0091:
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.h0.u.e.k0.d.y0.a$c> r4 = kotlin.p045h0.p046u.p047e.p048k0.p240d.p243y0.C9890a.C9895c.f27309m     // Catch:{ InvalidProtocolBufferException -> 0x00e7, IOException -> 0x00d9 }
                kotlin.reflect.jvm.internal.impl.protobuf.o r4 = r8.mo35702a(r4, (kotlin.reflect.jvm.internal.impl.protobuf.C10422f) r9)     // Catch:{ InvalidProtocolBufferException -> 0x00e7, IOException -> 0x00d9 }
                kotlin.h0.u.e.k0.d.y0.a$c r4 = (kotlin.p045h0.p046u.p047e.p048k0.p240d.p243y0.C9890a.C9895c) r4     // Catch:{ InvalidProtocolBufferException -> 0x00e7, IOException -> 0x00d9 }
                r7.f27324i = r4     // Catch:{ InvalidProtocolBufferException -> 0x00e7, IOException -> 0x00d9 }
                if (r6 == 0) goto L_0x00a6
                r6.mo34883a((kotlin.p045h0.p046u.p047e.p048k0.p240d.p243y0.C9890a.C9895c) r4)     // Catch:{ InvalidProtocolBufferException -> 0x00e7, IOException -> 0x00d9 }
                kotlin.h0.u.e.k0.d.y0.a$c r4 = r6.mo34885i()     // Catch:{ InvalidProtocolBufferException -> 0x00e7, IOException -> 0x00d9 }
                r7.f27324i = r4     // Catch:{ InvalidProtocolBufferException -> 0x00e7, IOException -> 0x00d9 }
            L_0x00a6:
                int r4 = r7.f27322g     // Catch:{ InvalidProtocolBufferException -> 0x00e7, IOException -> 0x00d9 }
                r4 = r4 | r5
                r7.f27322g = r4     // Catch:{ InvalidProtocolBufferException -> 0x00e7, IOException -> 0x00d9 }
                goto L_0x0015
            L_0x00ad:
                int r4 = r7.f27322g     // Catch:{ InvalidProtocolBufferException -> 0x00e7, IOException -> 0x00d9 }
                r4 = r4 & r1
                if (r4 != r1) goto L_0x00b8
                kotlin.h0.u.e.k0.d.y0.a$b r4 = r7.f27323h     // Catch:{ InvalidProtocolBufferException -> 0x00e7, IOException -> 0x00d9 }
                kotlin.h0.u.e.k0.d.y0.a$b$b r6 = r4.m32917c()     // Catch:{ InvalidProtocolBufferException -> 0x00e7, IOException -> 0x00d9 }
            L_0x00b8:
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.h0.u.e.k0.d.y0.a$b> r4 = kotlin.p045h0.p046u.p047e.p048k0.p240d.p243y0.C9890a.C9892b.f27298m     // Catch:{ InvalidProtocolBufferException -> 0x00e7, IOException -> 0x00d9 }
                kotlin.reflect.jvm.internal.impl.protobuf.o r4 = r8.mo35702a(r4, (kotlin.reflect.jvm.internal.impl.protobuf.C10422f) r9)     // Catch:{ InvalidProtocolBufferException -> 0x00e7, IOException -> 0x00d9 }
                kotlin.h0.u.e.k0.d.y0.a$b r4 = (kotlin.p045h0.p046u.p047e.p048k0.p240d.p243y0.C9890a.C9892b) r4     // Catch:{ InvalidProtocolBufferException -> 0x00e7, IOException -> 0x00d9 }
                r7.f27323h = r4     // Catch:{ InvalidProtocolBufferException -> 0x00e7, IOException -> 0x00d9 }
                if (r6 == 0) goto L_0x00cd
                r6.mo34875a((kotlin.p045h0.p046u.p047e.p048k0.p240d.p243y0.C9890a.C9892b) r4)     // Catch:{ InvalidProtocolBufferException -> 0x00e7, IOException -> 0x00d9 }
                kotlin.h0.u.e.k0.d.y0.a$b r4 = r6.mo34877i()     // Catch:{ InvalidProtocolBufferException -> 0x00e7, IOException -> 0x00d9 }
                r7.f27323h = r4     // Catch:{ InvalidProtocolBufferException -> 0x00e7, IOException -> 0x00d9 }
            L_0x00cd:
                int r4 = r7.f27322g     // Catch:{ InvalidProtocolBufferException -> 0x00e7, IOException -> 0x00d9 }
                r4 = r4 | r1
                r7.f27322g = r4     // Catch:{ InvalidProtocolBufferException -> 0x00e7, IOException -> 0x00d9 }
                goto L_0x0015
            L_0x00d4:
                r3 = 1
                goto L_0x0015
            L_0x00d7:
                r8 = move-exception
                goto L_0x00ec
            L_0x00d9:
                r8 = move-exception
                kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r9 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException     // Catch:{ all -> 0x00d7 }
                java.lang.String r8 = r8.getMessage()     // Catch:{ all -> 0x00d7 }
                r9.<init>(r8)     // Catch:{ all -> 0x00d7 }
                r9.mo35656a(r7)     // Catch:{ all -> 0x00d7 }
                throw r9     // Catch:{ all -> 0x00d7 }
            L_0x00e7:
                r8 = move-exception
                r8.mo35656a(r7)     // Catch:{ all -> 0x00d7 }
                throw r8     // Catch:{ all -> 0x00d7 }
            L_0x00ec:
                r2.mo35614a()     // Catch:{ IOException -> 0x00ef, all -> 0x00f6 }
            L_0x00ef:
                kotlin.reflect.jvm.internal.impl.protobuf.d r9 = r0.mo35696a()
                r7.f27321f = r9
                goto L_0x00fe
            L_0x00f6:
                r8 = move-exception
                kotlin.reflect.jvm.internal.impl.protobuf.d r9 = r0.mo35696a()
                r7.f27321f = r9
                throw r8
            L_0x00fe:
                r7.mo35760h()
                throw r8
            L_0x0102:
                r2.mo35614a()     // Catch:{ IOException -> 0x0105, all -> 0x010c }
            L_0x0105:
                kotlin.reflect.jvm.internal.impl.protobuf.d r8 = r0.mo35696a()
                r7.f27321f = r8
                goto L_0x0114
            L_0x010c:
                r8 = move-exception
                kotlin.reflect.jvm.internal.impl.protobuf.d r9 = r0.mo35696a()
                r7.f27321f = r9
                throw r8
            L_0x0114:
                r7.mo35760h()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.p045h0.p046u.p047e.p048k0.p240d.p243y0.C9890a.C9898d.<init>(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):void");
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.d.y0.a$e */
    /* compiled from: JvmProtoBuf */
    public static final class C9901e extends C10427h implements C9913f {

        /* renamed from: l */
        private static final C9901e f27334l;

        /* renamed from: m */
        public static C10452q<C9901e> f27335m = new C9902a();
        /* access modifiers changed from: private */

        /* renamed from: f */
        public final C10417d f27336f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public List<C9904c> f27337g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public List<Integer> f27338h;

        /* renamed from: i */
        private int f27339i;

        /* renamed from: j */
        private byte f27340j;

        /* renamed from: k */
        private int f27341k;

        /* renamed from: kotlin.h0.u.e.k0.d.y0.a$e$a */
        /* compiled from: JvmProtoBuf */
        static class C9902a extends C10413b<C9901e> {
            C9902a() {
            }

            /* renamed from: a */
            public C9901e m33052a(C10420e eVar, C10422f fVar) throws InvalidProtocolBufferException {
                return new C9901e(eVar, fVar);
            }
        }

        /* renamed from: kotlin.h0.u.e.k0.d.y0.a$e$c */
        /* compiled from: JvmProtoBuf */
        public static final class C9904c extends C10427h implements C9912e {

            /* renamed from: r */
            private static final C9904c f27345r;

            /* renamed from: s */
            public static C10452q<C9904c> f27346s = new C9905a();
            /* access modifiers changed from: private */

            /* renamed from: f */
            public final C10417d f27347f;
            /* access modifiers changed from: private */

            /* renamed from: g */
            public int f27348g;
            /* access modifiers changed from: private */

            /* renamed from: h */
            public int f27349h;
            /* access modifiers changed from: private */

            /* renamed from: i */
            public int f27350i;
            /* access modifiers changed from: private */

            /* renamed from: j */
            public Object f27351j;
            /* access modifiers changed from: private */

            /* renamed from: k */
            public C9907c f27352k;
            /* access modifiers changed from: private */

            /* renamed from: l */
            public List<Integer> f27353l;

            /* renamed from: m */
            private int f27354m;
            /* access modifiers changed from: private */

            /* renamed from: n */
            public List<Integer> f27355n;

            /* renamed from: o */
            private int f27356o;

            /* renamed from: p */
            private byte f27357p;

            /* renamed from: q */
            private int f27358q;

            /* renamed from: kotlin.h0.u.e.k0.d.y0.a$e$c$a */
            /* compiled from: JvmProtoBuf */
            static class C9905a extends C10413b<C9904c> {
                C9905a() {
                }

                /* renamed from: a */
                public C9904c m33107a(C10420e eVar, C10422f fVar) throws InvalidProtocolBufferException {
                    return new C9904c(eVar, fVar);
                }
            }

            /* renamed from: kotlin.h0.u.e.k0.d.y0.a$e$c$c */
            /* compiled from: JvmProtoBuf */
            public enum C9907c implements C10436i.C10437a {
                NONE(0, 0),
                INTERNAL_TO_CLASS_ID(1, 1),
                DESC_TO_CLASS_ID(2, 2);
                

                /* renamed from: f */
                private final int f27370f;

                /* renamed from: kotlin.h0.u.e.k0.d.y0.a$e$c$c$a */
                /* compiled from: JvmProtoBuf */
                static class C9908a implements C10436i.C10438b<C9907c> {
                    C9908a() {
                    }

                    /* renamed from: a */
                    public C9907c m33130a(int i) {
                        return C9907c.m33127a(i);
                    }
                }

                static {
                    new C9908a();
                }

                private C9907c(int i, int i2) {
                    this.f27370f = i2;
                }

                /* renamed from: a */
                public static C9907c m33127a(int i) {
                    if (i == 0) {
                        return NONE;
                    }
                    if (i == 1) {
                        return INTERNAL_TO_CLASS_ID;
                    }
                    if (i != 2) {
                        return null;
                    }
                    return DESC_TO_CLASS_ID;
                }

                /* renamed from: b */
                public final int mo34424b() {
                    return this.f27370f;
                }
            }

            static {
                C9904c cVar = new C9904c(true);
                f27345r = cVar;
                cVar.m33082w();
            }

            /* renamed from: v */
            public static C9904c m33081v() {
                return f27345r;
            }

            /* renamed from: w */
            private void m33082w() {
                this.f27349h = 1;
                this.f27350i = 0;
                this.f27351j = "";
                this.f27352k = C9907c.NONE;
                this.f27353l = Collections.emptyList();
                this.f27355n = Collections.emptyList();
            }

            /* renamed from: z */
            public static C9906b m33083z() {
                return C9906b.m33109k();
            }

            /* renamed from: e */
            public int mo34361e() {
                int i = this.f27358q;
                if (i != -1) {
                    return i;
                }
                int f = (this.f27348g & 1) == 1 ? CodedOutputStream.m35133f(1, this.f27349h) + 0 : 0;
                if ((this.f27348g & 2) == 2) {
                    f += CodedOutputStream.m35133f(2, this.f27350i);
                }
                if ((this.f27348g & 8) == 8) {
                    f += CodedOutputStream.m35132e(3, this.f27352k.mo34424b());
                }
                int i2 = 0;
                for (int i3 = 0; i3 < this.f27353l.size(); i3++) {
                    i2 += CodedOutputStream.m35140l(this.f27353l.get(i3).intValue());
                }
                int i4 = f + i2;
                if (!mo34912q().isEmpty()) {
                    i4 = i4 + 1 + CodedOutputStream.m35140l(i2);
                }
                this.f27354m = i2;
                int i5 = 0;
                for (int i6 = 0; i6 < this.f27355n.size(); i6++) {
                    i5 += CodedOutputStream.m35140l(this.f27355n.get(i6).intValue());
                }
                int i7 = i4 + i5;
                if (!mo34908m().isEmpty()) {
                    i7 = i7 + 1 + CodedOutputStream.m35140l(i5);
                }
                this.f27356o = i5;
                if ((this.f27348g & 4) == 4) {
                    i7 += CodedOutputStream.m35122b(6, mo34910o());
                }
                int size = i7 + this.f27347f.size();
                this.f27358q = size;
                return size;
            }

            /* renamed from: g */
            public C10452q<C9904c> mo34363g() {
                return f27346s;
            }

            /* renamed from: i */
            public C9907c mo34904i() {
                return this.f27352k;
            }

            public final boolean isInitialized() {
                byte b = this.f27357p;
                if (b == 1) {
                    return true;
                }
                if (b == 0) {
                    return false;
                }
                this.f27357p = 1;
                return true;
            }

            /* renamed from: j */
            public int mo34905j() {
                return this.f27350i;
            }

            /* renamed from: k */
            public int mo34906k() {
                return this.f27349h;
            }

            /* renamed from: l */
            public int mo34907l() {
                return this.f27355n.size();
            }

            /* renamed from: m */
            public List<Integer> mo34908m() {
                return this.f27355n;
            }

            /* renamed from: n */
            public String mo34909n() {
                Object obj = this.f27351j;
                if (obj instanceof String) {
                    return (String) obj;
                }
                C10417d dVar = (C10417d) obj;
                String h = dVar.mo35693h();
                if (dVar.mo35689c()) {
                    this.f27351j = h;
                }
                return h;
            }

            /* renamed from: o */
            public C10417d mo34910o() {
                Object obj = this.f27351j;
                if (!(obj instanceof String)) {
                    return (C10417d) obj;
                }
                C10417d b = C10417d.m35228b((String) obj);
                this.f27351j = b;
                return b;
            }

            /* renamed from: p */
            public int mo34911p() {
                return this.f27353l.size();
            }

            /* renamed from: q */
            public List<Integer> mo34912q() {
                return this.f27353l;
            }

            /* renamed from: r */
            public boolean mo34913r() {
                return (this.f27348g & 8) == 8;
            }

            /* renamed from: s */
            public boolean mo34914s() {
                return (this.f27348g & 2) == 2;
            }

            /* renamed from: t */
            public boolean mo34915t() {
                return (this.f27348g & 1) == 1;
            }

            /* renamed from: u */
            public boolean mo34916u() {
                return (this.f27348g & 4) == 4;
            }

            /* renamed from: kotlin.h0.u.e.k0.d.y0.a$e$c$b */
            /* compiled from: JvmProtoBuf */
            public static final class C9906b extends C10427h.C10429b<C9904c, C9906b> implements C9912e {

                /* renamed from: g */
                private int f27359g;

                /* renamed from: h */
                private int f27360h = 1;

                /* renamed from: i */
                private int f27361i;

                /* renamed from: j */
                private Object f27362j = "";

                /* renamed from: k */
                private C9907c f27363k = C9907c.NONE;

                /* renamed from: l */
                private List<Integer> f27364l = Collections.emptyList();

                /* renamed from: m */
                private List<Integer> f27365m = Collections.emptyList();

                private C9906b() {
                    m33112n();
                }

                /* access modifiers changed from: private */
                /* renamed from: k */
                public static C9906b m33109k() {
                    return new C9906b();
                }

                /* renamed from: l */
                private void m33110l() {
                    if ((this.f27359g & 32) != 32) {
                        this.f27365m = new ArrayList(this.f27365m);
                        this.f27359g |= 32;
                    }
                }

                /* renamed from: m */
                private void m33111m() {
                    if ((this.f27359g & 16) != 16) {
                        this.f27364l = new ArrayList(this.f27364l);
                        this.f27359g |= 16;
                    }
                }

                /* renamed from: n */
                private void m33112n() {
                }

                /* renamed from: i */
                public C9904c mo34921i() {
                    C9904c cVar = new C9904c((C10427h.C10429b) this);
                    int i = this.f27359g;
                    int i2 = 1;
                    if ((i & 1) != 1) {
                        i2 = 0;
                    }
                    int unused = cVar.f27349h = this.f27360h;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    int unused2 = cVar.f27350i = this.f27361i;
                    if ((i & 4) == 4) {
                        i2 |= 4;
                    }
                    Object unused3 = cVar.f27351j = this.f27362j;
                    if ((i & 8) == 8) {
                        i2 |= 8;
                    }
                    C9907c unused4 = cVar.f27352k = this.f27363k;
                    if ((this.f27359g & 16) == 16) {
                        this.f27364l = Collections.unmodifiableList(this.f27364l);
                        this.f27359g &= -17;
                    }
                    List unused5 = cVar.f27353l = this.f27364l;
                    if ((this.f27359g & 32) == 32) {
                        this.f27365m = Collections.unmodifiableList(this.f27365m);
                        this.f27359g &= -33;
                    }
                    List unused6 = cVar.f27355n = this.f27365m;
                    int unused7 = cVar.f27348g = i2;
                    return cVar;
                }

                public final boolean isInitialized() {
                    return true;
                }

                /* renamed from: a */
                public /* bridge */ /* synthetic */ C10427h.C10429b mo34379a(C10427h hVar) {
                    mo34919a((C9904c) hVar);
                    return this;
                }

                /* renamed from: b */
                public C9904c m33125b() {
                    return C9904c.m33081v();
                }

                public C9906b clone() {
                    C9906b k = m33109k();
                    k.mo34919a(mo34921i());
                    return k;
                }

                /* renamed from: b */
                public C9906b mo34920b(int i) {
                    this.f27359g |= 1;
                    this.f27360h = i;
                    return this;
                }

                /* renamed from: a */
                public C9904c m33121a() {
                    C9904c i = mo34921i();
                    if (i.isInitialized()) {
                        return i;
                    }
                    throw C10410a.C10411a.m35207a(i);
                }

                /* renamed from: a */
                public C9906b mo34919a(C9904c cVar) {
                    if (cVar == C9904c.m33081v()) {
                        return this;
                    }
                    if (cVar.mo34915t()) {
                        mo34920b(cVar.mo34906k());
                    }
                    if (cVar.mo34914s()) {
                        mo34917a(cVar.mo34905j());
                    }
                    if (cVar.mo34916u()) {
                        this.f27359g |= 4;
                        this.f27362j = cVar.f27351j;
                    }
                    if (cVar.mo34913r()) {
                        mo34918a(cVar.mo34904i());
                    }
                    if (!cVar.f27353l.isEmpty()) {
                        if (this.f27364l.isEmpty()) {
                            this.f27364l = cVar.f27353l;
                            this.f27359g &= -17;
                        } else {
                            m33111m();
                            this.f27364l.addAll(cVar.f27353l);
                        }
                    }
                    if (!cVar.f27355n.isEmpty()) {
                        if (this.f27365m.isEmpty()) {
                            this.f27365m = cVar.f27355n;
                            this.f27359g &= -33;
                        } else {
                            m33110l();
                            this.f27365m.addAll(cVar.f27355n);
                        }
                    }
                    mo35761a(mo35762h().mo35686b(cVar.f27347f));
                    return this;
                }

                /* renamed from: a */
                public C9906b mo34377a(C10420e eVar, C10422f fVar) throws IOException {
                    C9904c cVar;
                    C9904c cVar2 = null;
                    try {
                        C9904c a = C9904c.f27346s.mo34369a(eVar, fVar);
                        if (a != null) {
                            mo34919a(a);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        cVar = (C9904c) e.mo35657a();
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        cVar2 = cVar;
                    }
                    if (cVar2 != null) {
                        mo34919a(cVar2);
                    }
                    throw th;
                }

                /* renamed from: a */
                public C9906b mo34917a(int i) {
                    this.f27359g |= 2;
                    this.f27361i = i;
                    return this;
                }

                /* renamed from: a */
                public C9906b mo34918a(C9907c cVar) {
                    if (cVar != null) {
                        this.f27359g |= 8;
                        this.f27363k = cVar;
                        return this;
                    }
                    throw null;
                }
            }

            /* renamed from: f */
            public C9906b m33091f() {
                return m33083z();
            }

            private C9904c(C10427h.C10429b bVar) {
                super(bVar);
                this.f27354m = -1;
                this.f27356o = -1;
                this.f27357p = -1;
                this.f27358q = -1;
                this.f27347f = bVar.mo35762h();
            }

            /* renamed from: c */
            public C9906b m33088c() {
                return m33080e(this);
            }

            /* renamed from: b */
            public C9904c m33086b() {
                return f27345r;
            }

            /* renamed from: a */
            public void mo34358a(CodedOutputStream codedOutputStream) throws IOException {
                mo34361e();
                if ((this.f27348g & 1) == 1) {
                    codedOutputStream.mo35635b(1, this.f27349h);
                }
                if ((this.f27348g & 2) == 2) {
                    codedOutputStream.mo35635b(2, this.f27350i);
                }
                if ((this.f27348g & 8) == 8) {
                    codedOutputStream.mo35621a(3, this.f27352k.mo34424b());
                }
                if (mo34912q().size() > 0) {
                    codedOutputStream.mo35650f(34);
                    codedOutputStream.mo35650f(this.f27354m);
                }
                for (int i = 0; i < this.f27353l.size(); i++) {
                    codedOutputStream.mo35641c(this.f27353l.get(i).intValue());
                }
                if (mo34908m().size() > 0) {
                    codedOutputStream.mo35650f(42);
                    codedOutputStream.mo35650f(this.f27356o);
                }
                for (int i2 = 0; i2 < this.f27355n.size(); i2++) {
                    codedOutputStream.mo35641c(this.f27355n.get(i2).intValue());
                }
                if ((this.f27348g & 4) == 4) {
                    codedOutputStream.mo35623a(6, mo34910o());
                }
                codedOutputStream.mo35638b(this.f27347f);
            }

            private C9904c(boolean z) {
                this.f27354m = -1;
                this.f27356o = -1;
                this.f27357p = -1;
                this.f27358q = -1;
                this.f27347f = C10417d.f28215f;
            }

            private C9904c(C10420e eVar, C10422f fVar) throws InvalidProtocolBufferException {
                this.f27354m = -1;
                this.f27356o = -1;
                this.f27357p = -1;
                this.f27358q = -1;
                m33082w();
                C10417d.C10419b j = C10417d.m35229j();
                CodedOutputStream a = CodedOutputStream.m35116a((OutputStream) j, 1);
                boolean z = false;
                boolean z2 = false;
                while (!z) {
                    try {
                        int x = eVar.mo35733x();
                        if (x != 0) {
                            if (x == 8) {
                                this.f27348g |= 1;
                                this.f27349h = eVar.mo35719j();
                            } else if (x == 16) {
                                this.f27348g |= 2;
                                this.f27350i = eVar.mo35719j();
                            } else if (x == 24) {
                                int f = eVar.mo35715f();
                                C9907c a2 = C9907c.m33127a(f);
                                if (a2 == null) {
                                    a.mo35650f(x);
                                    a.mo35650f(f);
                                } else {
                                    this.f27348g |= 8;
                                    this.f27352k = a2;
                                }
                            } else if (x == 32) {
                                if (!(z2 & true)) {
                                    this.f27353l = new ArrayList();
                                    z2 |= true;
                                }
                                this.f27353l.add(Integer.valueOf(eVar.mo35719j()));
                            } else if (x == 34) {
                                int c = eVar.mo35710c(eVar.mo35724o());
                                if (!(z2 & true) && eVar.mo35701a() > 0) {
                                    this.f27353l = new ArrayList();
                                    z2 |= true;
                                }
                                while (eVar.mo35701a() > 0) {
                                    this.f27353l.add(Integer.valueOf(eVar.mo35719j()));
                                }
                                eVar.mo35708b(c);
                            } else if (x == 40) {
                                if (!(z2 & true)) {
                                    this.f27355n = new ArrayList();
                                    z2 |= true;
                                }
                                this.f27355n.add(Integer.valueOf(eVar.mo35719j()));
                            } else if (x == 42) {
                                int c2 = eVar.mo35710c(eVar.mo35724o());
                                if (!(z2 & true) && eVar.mo35701a() > 0) {
                                    this.f27355n = new ArrayList();
                                    z2 |= true;
                                }
                                while (eVar.mo35701a() > 0) {
                                    this.f27355n.add(Integer.valueOf(eVar.mo35719j()));
                                }
                                eVar.mo35708b(c2);
                            } else if (x == 50) {
                                C10417d d = eVar.mo35712d();
                                this.f27348g |= 4;
                                this.f27351j = d;
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
                            this.f27353l = Collections.unmodifiableList(this.f27353l);
                        }
                        if (z2 & true) {
                            this.f27355n = Collections.unmodifiableList(this.f27355n);
                        }
                        try {
                            a.mo35614a();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.f27347f = j.mo35696a();
                            throw th2;
                        }
                        this.f27347f = j.mo35696a();
                        mo35760h();
                        throw th;
                    }
                }
                if (z2 & true) {
                    this.f27353l = Collections.unmodifiableList(this.f27353l);
                }
                if (z2 & true) {
                    this.f27355n = Collections.unmodifiableList(this.f27355n);
                }
                try {
                    a.mo35614a();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.f27347f = j.mo35696a();
                    throw th3;
                }
                this.f27347f = j.mo35696a();
                mo35760h();
            }

            /* renamed from: e */
            public static C9906b m33080e(C9904c cVar) {
                C9906b z = m33083z();
                z.mo34919a(cVar);
                return z;
            }
        }

        static {
            C9901e eVar = new C9901e(true);
            f27334l = eVar;
            eVar.m33038l();
        }

        /* renamed from: d */
        public static C9903b m33036d(C9901e eVar) {
            C9903b m = m33039m();
            m.mo34902a(eVar);
            return m;
        }

        /* renamed from: k */
        public static C9901e m33037k() {
            return f27334l;
        }

        /* renamed from: l */
        private void m33038l() {
            this.f27337g = Collections.emptyList();
            this.f27338h = Collections.emptyList();
        }

        /* renamed from: m */
        public static C9903b m33039m() {
            return C9903b.m33054k();
        }

        /* renamed from: e */
        public int mo34361e() {
            int i = this.f27341k;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.f27337g.size(); i3++) {
                i2 += CodedOutputStream.m35130d(1, (C10449o) this.f27337g.get(i3));
            }
            int i4 = 0;
            for (int i5 = 0; i5 < this.f27338h.size(); i5++) {
                i4 += CodedOutputStream.m35140l(this.f27338h.get(i5).intValue());
            }
            int i6 = i2 + i4;
            if (!mo34900i().isEmpty()) {
                i6 = i6 + 1 + CodedOutputStream.m35140l(i4);
            }
            this.f27339i = i4;
            int size = i6 + this.f27336f.size();
            this.f27341k = size;
            return size;
        }

        /* renamed from: g */
        public C10452q<C9901e> mo34363g() {
            return f27335m;
        }

        /* renamed from: i */
        public List<Integer> mo34900i() {
            return this.f27338h;
        }

        public final boolean isInitialized() {
            byte b = this.f27340j;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.f27340j = 1;
            return true;
        }

        /* renamed from: j */
        public List<C9904c> mo34901j() {
            return this.f27337g;
        }

        /* renamed from: kotlin.h0.u.e.k0.d.y0.a$e$b */
        /* compiled from: JvmProtoBuf */
        public static final class C9903b extends C10427h.C10429b<C9901e, C9903b> implements C9913f {

            /* renamed from: g */
            private int f27342g;

            /* renamed from: h */
            private List<C9904c> f27343h = Collections.emptyList();

            /* renamed from: i */
            private List<Integer> f27344i = Collections.emptyList();

            private C9903b() {
                m33057n();
            }

            /* access modifiers changed from: private */
            /* renamed from: k */
            public static C9903b m33054k() {
                return new C9903b();
            }

            /* renamed from: l */
            private void m33055l() {
                if ((this.f27342g & 2) != 2) {
                    this.f27344i = new ArrayList(this.f27344i);
                    this.f27342g |= 2;
                }
            }

            /* renamed from: m */
            private void m33056m() {
                if ((this.f27342g & 1) != 1) {
                    this.f27343h = new ArrayList(this.f27343h);
                    this.f27342g |= 1;
                }
            }

            /* renamed from: n */
            private void m33057n() {
            }

            /* renamed from: i */
            public C9901e mo34903i() {
                C9901e eVar = new C9901e((C10427h.C10429b) this);
                if ((this.f27342g & 1) == 1) {
                    this.f27343h = Collections.unmodifiableList(this.f27343h);
                    this.f27342g &= -2;
                }
                List unused = eVar.f27337g = this.f27343h;
                if ((this.f27342g & 2) == 2) {
                    this.f27344i = Collections.unmodifiableList(this.f27344i);
                    this.f27342g &= -3;
                }
                List unused2 = eVar.f27338h = this.f27344i;
                return eVar;
            }

            public final boolean isInitialized() {
                return true;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ C10427h.C10429b mo34379a(C10427h hVar) {
                mo34902a((C9901e) hVar);
                return this;
            }

            /* renamed from: b */
            public C9901e m33067b() {
                return C9901e.m33037k();
            }

            public C9903b clone() {
                C9903b k = m33054k();
                k.mo34902a(mo34903i());
                return k;
            }

            /* renamed from: a */
            public C9901e m33064a() {
                C9901e i = mo34903i();
                if (i.isInitialized()) {
                    return i;
                }
                throw C10410a.C10411a.m35207a(i);
            }

            /* renamed from: a */
            public C9903b mo34902a(C9901e eVar) {
                if (eVar == C9901e.m33037k()) {
                    return this;
                }
                if (!eVar.f27337g.isEmpty()) {
                    if (this.f27343h.isEmpty()) {
                        this.f27343h = eVar.f27337g;
                        this.f27342g &= -2;
                    } else {
                        m33056m();
                        this.f27343h.addAll(eVar.f27337g);
                    }
                }
                if (!eVar.f27338h.isEmpty()) {
                    if (this.f27344i.isEmpty()) {
                        this.f27344i = eVar.f27338h;
                        this.f27342g &= -3;
                    } else {
                        m33055l();
                        this.f27344i.addAll(eVar.f27338h);
                    }
                }
                mo35761a(mo35762h().mo35686b(eVar.f27336f));
                return this;
            }

            /* renamed from: a */
            public C9903b mo34377a(C10420e eVar, C10422f fVar) throws IOException {
                C9901e eVar2;
                C9901e eVar3 = null;
                try {
                    C9901e a = C9901e.f27335m.mo34369a(eVar, fVar);
                    if (a != null) {
                        mo34902a(a);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    eVar2 = (C9901e) e.mo35657a();
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    eVar3 = eVar2;
                }
                if (eVar3 != null) {
                    mo34902a(eVar3);
                }
                throw th;
            }
        }

        /* renamed from: f */
        public C9903b m33047f() {
            return m33039m();
        }

        private C9901e(C10427h.C10429b bVar) {
            super(bVar);
            this.f27339i = -1;
            this.f27340j = -1;
            this.f27341k = -1;
            this.f27336f = bVar.mo35762h();
        }

        /* renamed from: a */
        public void mo34358a(CodedOutputStream codedOutputStream) throws IOException {
            mo34361e();
            for (int i = 0; i < this.f27337g.size(); i++) {
                codedOutputStream.mo35636b(1, (C10449o) this.f27337g.get(i));
            }
            if (mo34900i().size() > 0) {
                codedOutputStream.mo35650f(42);
                codedOutputStream.mo35650f(this.f27339i);
            }
            for (int i2 = 0; i2 < this.f27338h.size(); i2++) {
                codedOutputStream.mo35641c(this.f27338h.get(i2).intValue());
            }
            codedOutputStream.mo35638b(this.f27336f);
        }

        /* renamed from: c */
        public C9903b m33044c() {
            return m33036d(this);
        }

        /* renamed from: b */
        public C9901e m33042b() {
            return f27334l;
        }

        private C9901e(boolean z) {
            this.f27339i = -1;
            this.f27340j = -1;
            this.f27341k = -1;
            this.f27336f = C10417d.f28215f;
        }

        /* renamed from: a */
        public static C9901e m33032a(InputStream inputStream, C10422f fVar) throws IOException {
            return f27335m.mo35667b(inputStream, fVar);
        }

        private C9901e(C10420e eVar, C10422f fVar) throws InvalidProtocolBufferException {
            this.f27339i = -1;
            this.f27340j = -1;
            this.f27341k = -1;
            m33038l();
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
                                this.f27337g = new ArrayList();
                                z2 |= true;
                            }
                            this.f27337g.add(eVar.mo35702a(C9904c.f27346s, fVar));
                        } else if (x == 40) {
                            if (!(z2 & true)) {
                                this.f27338h = new ArrayList();
                                z2 |= true;
                            }
                            this.f27338h.add(Integer.valueOf(eVar.mo35719j()));
                        } else if (x == 42) {
                            int c = eVar.mo35710c(eVar.mo35724o());
                            if (!(z2 & true) && eVar.mo35701a() > 0) {
                                this.f27338h = new ArrayList();
                                z2 |= true;
                            }
                            while (eVar.mo35701a() > 0) {
                                this.f27338h.add(Integer.valueOf(eVar.mo35719j()));
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
                    if (z2 && true) {
                        this.f27337g = Collections.unmodifiableList(this.f27337g);
                    }
                    if (z2 & true) {
                        this.f27338h = Collections.unmodifiableList(this.f27338h);
                    }
                    try {
                        a.mo35614a();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f27336f = j.mo35696a();
                        throw th2;
                    }
                    this.f27336f = j.mo35696a();
                    mo35760h();
                    throw th;
                }
            }
            if (z2 && true) {
                this.f27337g = Collections.unmodifiableList(this.f27337g);
            }
            if (z2 & true) {
                this.f27338h = Collections.unmodifiableList(this.f27338h);
            }
            try {
                a.mo35614a();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f27336f = j.mo35696a();
                throw th3;
            }
            this.f27336f = j.mo35696a();
            mo35760h();
        }
    }

    /* renamed from: a */
    public static void m32904a(C10422f fVar) {
        fVar.mo35738a(f27284a);
        fVar.mo35738a(f27285b);
        fVar.mo35738a(f27286c);
        fVar.mo35738a(f27287d);
        fVar.mo35738a(f27288e);
        fVar.mo35738a(f27289f);
        fVar.mo35738a(f27290g);
        fVar.mo35738a(f27291h);
        fVar.mo35738a(f27292i);
        fVar.mo35738a(f27293j);
        fVar.mo35738a(f27294k);
        fVar.mo35738a(f27295l);
        fVar.mo35738a(f27296m);
    }
}
