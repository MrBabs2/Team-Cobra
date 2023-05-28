package kotlin.p045h0.p046u.p047e.p048k0.p240d;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9759b0;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9772e0;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9856v;
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

/* renamed from: kotlin.h0.u.e.k0.d.w */
/* compiled from: ProtoBuf */
public final class C9861w extends C10427h.C10431d<C9861w> implements C9867x {

    /* renamed from: o */
    private static final C9861w f27192o;

    /* renamed from: p */
    public static C10452q<C9861w> f27193p = new C9862a();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C10417d f27194g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f27195h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C9772e0 f27196i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C9759b0 f27197j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C9856v f27198k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public List<C9775f> f27199l;

    /* renamed from: m */
    private byte f27200m;

    /* renamed from: n */
    private int f27201n;

    /* renamed from: kotlin.h0.u.e.k0.d.w$a */
    /* compiled from: ProtoBuf */
    static class C9862a extends C10413b<C9861w> {
        C9862a() {
        }

        /* renamed from: a */
        public C9861w m32816a(C10420e eVar, C10422f fVar) throws InvalidProtocolBufferException {
            return new C9861w(eVar, fVar);
        }
    }

    static {
        C9861w wVar = new C9861w(true);
        f27192o = wVar;
        wVar.m32795u();
    }

    /* renamed from: t */
    public static C9861w m32794t() {
        return f27192o;
    }

    /* renamed from: u */
    private void m32795u() {
        this.f27196i = C9772e0.m31705j();
        this.f27197j = C9759b0.m31620j();
        this.f27198k = C9856v.m32727v();
        this.f27199l = Collections.emptyList();
    }

    /* renamed from: v */
    public static C9863b m32796v() {
        return C9863b.m32818s();
    }

    /* renamed from: e */
    public int mo34361e() {
        int i = this.f27201n;
        if (i != -1) {
            return i;
        }
        int d = (this.f27195h & 1) == 1 ? CodedOutputStream.m35130d(1, (C10449o) this.f27196i) + 0 : 0;
        if ((this.f27195h & 2) == 2) {
            d += CodedOutputStream.m35130d(2, (C10449o) this.f27197j);
        }
        if ((this.f27195h & 4) == 4) {
            d += CodedOutputStream.m35130d(3, (C10449o) this.f27198k);
        }
        for (int i2 = 0; i2 < this.f27199l.size(); i2++) {
            d += CodedOutputStream.m35130d(4, (C10449o) this.f27199l.get(i2));
        }
        int j = d + mo35770j() + this.f27194g.size();
        this.f27201n = j;
        return j;
    }

    /* renamed from: g */
    public C10452q<C9861w> mo34363g() {
        return f27193p;
    }

    public final boolean isInitialized() {
        byte b = this.f27200m;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (mo34827r() && !mo34824o().isInitialized()) {
            this.f27200m = 0;
            return false;
        } else if (!mo34826q() || mo34823n().isInitialized()) {
            for (int i = 0; i < mo34821l(); i++) {
                if (!mo34820a(i).isInitialized()) {
                    this.f27200m = 0;
                    return false;
                }
            }
            if (!mo35769i()) {
                this.f27200m = 0;
                return false;
            }
            this.f27200m = 1;
            return true;
        } else {
            this.f27200m = 0;
            return false;
        }
    }

    /* renamed from: l */
    public int mo34821l() {
        return this.f27199l.size();
    }

    /* renamed from: m */
    public List<C9775f> mo34822m() {
        return this.f27199l;
    }

    /* renamed from: n */
    public C9856v mo34823n() {
        return this.f27198k;
    }

    /* renamed from: o */
    public C9759b0 mo34824o() {
        return this.f27197j;
    }

    /* renamed from: p */
    public C9772e0 mo34825p() {
        return this.f27196i;
    }

    /* renamed from: q */
    public boolean mo34826q() {
        return (this.f27195h & 4) == 4;
    }

    /* renamed from: r */
    public boolean mo34827r() {
        return (this.f27195h & 2) == 2;
    }

    /* renamed from: s */
    public boolean mo34828s() {
        return (this.f27195h & 1) == 1;
    }

    /* renamed from: kotlin.h0.u.e.k0.d.w$b */
    /* compiled from: ProtoBuf */
    public static final class C9863b extends C10427h.C10430c<C9861w, C9863b> implements C9867x {

        /* renamed from: i */
        private int f27202i;

        /* renamed from: j */
        private C9772e0 f27203j = C9772e0.m31705j();

        /* renamed from: k */
        private C9759b0 f27204k = C9759b0.m31620j();

        /* renamed from: l */
        private C9856v f27205l = C9856v.m32727v();

        /* renamed from: m */
        private List<C9775f> f27206m = Collections.emptyList();

        private C9863b() {
            m32820w();
        }

        /* access modifiers changed from: private */
        /* renamed from: s */
        public static C9863b m32818s() {
            return new C9863b();
        }

        /* renamed from: u */
        private void m32819u() {
            if ((this.f27202i & 8) != 8) {
                this.f27206m = new ArrayList(this.f27206m);
                this.f27202i |= 8;
            }
        }

        /* renamed from: w */
        private void m32820w() {
        }

        public final boolean isInitialized() {
            if (mo34837q() && !mo34835m().isInitialized()) {
                return false;
            }
            if (mo34836n() && !mo34834l().isInitialized()) {
                return false;
            }
            for (int i = 0; i < mo34503k(); i++) {
                if (!mo34829a(i).isInitialized()) {
                    return false;
                }
            }
            if (!mo35764i()) {
                return false;
            }
            return true;
        }

        /* renamed from: j */
        public C9861w mo34502j() {
            C9861w wVar = new C9861w((C10427h.C10430c) this);
            int i = this.f27202i;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            C9772e0 unused = wVar.f27196i = this.f27203j;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            C9759b0 unused2 = wVar.f27197j = this.f27204k;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            C9856v unused3 = wVar.f27198k = this.f27205l;
            if ((this.f27202i & 8) == 8) {
                this.f27206m = Collections.unmodifiableList(this.f27206m);
                this.f27202i &= -9;
            }
            List unused4 = wVar.f27199l = this.f27206m;
            int unused5 = wVar.f27195h = i2;
            return wVar;
        }

        /* renamed from: k */
        public int mo34503k() {
            return this.f27206m.size();
        }

        /* renamed from: l */
        public C9856v mo34834l() {
            return this.f27205l;
        }

        /* renamed from: m */
        public C9759b0 mo34835m() {
            return this.f27204k;
        }

        /* renamed from: n */
        public boolean mo34836n() {
            return (this.f27202i & 4) == 4;
        }

        /* renamed from: q */
        public boolean mo34837q() {
            return (this.f27202i & 2) == 2;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ C10427h.C10429b mo34379a(C10427h hVar) {
            mo34833a((C9861w) hVar);
            return this;
        }

        /* renamed from: b */
        public C9861w m32834b() {
            return C9861w.m32794t();
        }

        public C9863b clone() {
            C9863b s = m32818s();
            s.mo34833a(mo34502j());
            return s;
        }

        /* renamed from: a */
        public C9861w m32831a() {
            C9861w j = mo34502j();
            if (j.isInitialized()) {
                return j;
            }
            throw C10410a.C10411a.m35207a(j);
        }

        /* renamed from: a */
        public C9863b mo34833a(C9861w wVar) {
            if (wVar == C9861w.m32794t()) {
                return this;
            }
            if (wVar.mo34828s()) {
                mo34831a(wVar.mo34825p());
            }
            if (wVar.mo34827r()) {
                mo34830a(wVar.mo34824o());
            }
            if (wVar.mo34826q()) {
                mo34832a(wVar.mo34823n());
            }
            if (!wVar.f27199l.isEmpty()) {
                if (this.f27206m.isEmpty()) {
                    this.f27206m = wVar.f27199l;
                    this.f27202i &= -9;
                } else {
                    m32819u();
                    this.f27206m.addAll(wVar.f27199l);
                }
            }
            mo35763a(wVar);
            mo35761a(mo35762h().mo35686b(wVar.f27194g));
            return this;
        }

        /* renamed from: a */
        public C9863b mo34377a(C10420e eVar, C10422f fVar) throws IOException {
            C9861w wVar;
            C9861w wVar2 = null;
            try {
                C9861w a = C9861w.f27193p.mo34369a(eVar, fVar);
                if (a != null) {
                    mo34833a(a);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                wVar = (C9861w) e.mo35657a();
                throw e;
            } catch (Throwable th) {
                th = th;
                wVar2 = wVar;
            }
            if (wVar2 != null) {
                mo34833a(wVar2);
            }
            throw th;
        }

        /* renamed from: a */
        public C9863b mo34831a(C9772e0 e0Var) {
            if ((this.f27202i & 1) != 1 || this.f27203j == C9772e0.m31705j()) {
                this.f27203j = e0Var;
            } else {
                C9772e0.C9774b c = C9772e0.m31704c(this.f27203j);
                c.mo34452a(e0Var);
                this.f27203j = c.mo34453i();
            }
            this.f27202i |= 1;
            return this;
        }

        /* renamed from: a */
        public C9863b mo34830a(C9759b0 b0Var) {
            if ((this.f27202i & 2) != 2 || this.f27204k == C9759b0.m31620j()) {
                this.f27204k = b0Var;
            } else {
                C9759b0.C9761b c = C9759b0.m31619c(this.f27204k);
                c.mo34434a(b0Var);
                this.f27204k = c.mo34436i();
            }
            this.f27202i |= 2;
            return this;
        }

        /* renamed from: a */
        public C9863b mo34832a(C9856v vVar) {
            if ((this.f27202i & 4) != 4 || this.f27205l == C9856v.m32727v()) {
                this.f27205l = vVar;
            } else {
                C9856v.C9858b e = C9856v.m32726e(this.f27205l);
                e.mo34813a(vVar);
                this.f27205l = e.mo34502j();
            }
            this.f27202i |= 4;
            return this;
        }

        /* renamed from: a */
        public C9775f mo34829a(int i) {
            return this.f27206m.get(i);
        }
    }

    /* renamed from: c */
    public static C9863b m32793c(C9861w wVar) {
        C9863b v = m32796v();
        v.mo34833a(wVar);
        return v;
    }

    /* renamed from: f */
    public C9863b m32805f() {
        return m32796v();
    }

    private C9861w(C10427h.C10430c<C9861w, ?> cVar) {
        super(cVar);
        this.f27200m = -1;
        this.f27201n = -1;
        this.f27194g = cVar.mo35762h();
    }

    /* renamed from: b */
    public C9861w m32800b() {
        return f27192o;
    }

    /* renamed from: c */
    public C9863b m32802c() {
        return m32793c(this);
    }

    private C9861w(boolean z) {
        this.f27200m = -1;
        this.f27201n = -1;
        this.f27194g = C10417d.f28215f;
    }

    /* renamed from: a */
    public C9775f mo34820a(int i) {
        return this.f27199l.get(i);
    }

    /* renamed from: a */
    public void mo34358a(CodedOutputStream codedOutputStream) throws IOException {
        mo34361e();
        C10427h.C10431d<MessageType>.C0000a k = mo35771k();
        if ((this.f27195h & 1) == 1) {
            codedOutputStream.mo35636b(1, (C10449o) this.f27196i);
        }
        if ((this.f27195h & 2) == 2) {
            codedOutputStream.mo35636b(2, (C10449o) this.f27197j);
        }
        if ((this.f27195h & 4) == 4) {
            codedOutputStream.mo35636b(3, (C10449o) this.f27198k);
        }
        for (int i = 0; i < this.f27199l.size(); i++) {
            codedOutputStream.mo35636b(4, (C10449o) this.f27199l.get(i));
        }
        k.mo35772a(200, codedOutputStream);
        codedOutputStream.mo35638b(this.f27194g);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: kotlin.h0.u.e.k0.d.e0$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: kotlin.h0.u.e.k0.d.b0$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: kotlin.h0.u.e.k0.d.v$b} */
    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v7 */
    /* JADX WARNING: type inference failed for: r8v8 */
    /* JADX WARNING: type inference failed for: r8v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C9861w(kotlin.reflect.jvm.internal.impl.protobuf.C10420e r10, kotlin.reflect.jvm.internal.impl.protobuf.C10422f r11) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
        /*
            r9 = this;
            r9.<init>()
            r0 = -1
            r9.f27200m = r0
            r9.f27201n = r0
            r9.m32795u()
            kotlin.reflect.jvm.internal.impl.protobuf.d$b r0 = kotlin.reflect.jvm.internal.impl.protobuf.C10417d.m35229j()
            r1 = 1
            kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r2 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.m35116a((java.io.OutputStream) r0, (int) r1)
            r3 = 0
            r4 = 0
        L_0x0016:
            r5 = 8
            if (r3 != 0) goto L_0x0102
            int r6 = r10.mo35733x()     // Catch:{ InvalidProtocolBufferException -> 0x00db, IOException -> 0x00cd }
            if (r6 == 0) goto L_0x00c8
            r7 = 10
            r8 = 0
            if (r6 == r7) goto L_0x00a1
            r7 = 18
            if (r6 == r7) goto L_0x0079
            r7 = 26
            if (r6 == r7) goto L_0x0052
            r7 = 34
            if (r6 == r7) goto L_0x0039
            boolean r5 = r9.mo35759a(r10, r2, r11, r6)     // Catch:{ InvalidProtocolBufferException -> 0x00db, IOException -> 0x00cd }
            if (r5 != 0) goto L_0x0016
            goto L_0x00c8
        L_0x0039:
            r6 = r4 & 8
            if (r6 == r5) goto L_0x0046
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x00db, IOException -> 0x00cd }
            r6.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x00db, IOException -> 0x00cd }
            r9.f27199l = r6     // Catch:{ InvalidProtocolBufferException -> 0x00db, IOException -> 0x00cd }
            r4 = r4 | 8
        L_0x0046:
            java.util.List<kotlin.h0.u.e.k0.d.f> r6 = r9.f27199l     // Catch:{ InvalidProtocolBufferException -> 0x00db, IOException -> 0x00cd }
            kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.h0.u.e.k0.d.f> r7 = kotlin.p045h0.p046u.p047e.p048k0.p240d.C9775f.f26822E     // Catch:{ InvalidProtocolBufferException -> 0x00db, IOException -> 0x00cd }
            kotlin.reflect.jvm.internal.impl.protobuf.o r7 = r10.mo35702a(r7, (kotlin.reflect.jvm.internal.impl.protobuf.C10422f) r11)     // Catch:{ InvalidProtocolBufferException -> 0x00db, IOException -> 0x00cd }
            r6.add(r7)     // Catch:{ InvalidProtocolBufferException -> 0x00db, IOException -> 0x00cd }
            goto L_0x0016
        L_0x0052:
            int r6 = r9.f27195h     // Catch:{ InvalidProtocolBufferException -> 0x00db, IOException -> 0x00cd }
            r7 = 4
            r6 = r6 & r7
            if (r6 != r7) goto L_0x005e
            kotlin.h0.u.e.k0.d.v r6 = r9.f27198k     // Catch:{ InvalidProtocolBufferException -> 0x00db, IOException -> 0x00cd }
            kotlin.h0.u.e.k0.d.v$b r8 = r6.m32737c()     // Catch:{ InvalidProtocolBufferException -> 0x00db, IOException -> 0x00cd }
        L_0x005e:
            kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.h0.u.e.k0.d.v> r6 = kotlin.p045h0.p046u.p047e.p048k0.p240d.C9856v.f27168q     // Catch:{ InvalidProtocolBufferException -> 0x00db, IOException -> 0x00cd }
            kotlin.reflect.jvm.internal.impl.protobuf.o r6 = r10.mo35702a(r6, (kotlin.reflect.jvm.internal.impl.protobuf.C10422f) r11)     // Catch:{ InvalidProtocolBufferException -> 0x00db, IOException -> 0x00cd }
            kotlin.h0.u.e.k0.d.v r6 = (kotlin.p045h0.p046u.p047e.p048k0.p240d.C9856v) r6     // Catch:{ InvalidProtocolBufferException -> 0x00db, IOException -> 0x00cd }
            r9.f27198k = r6     // Catch:{ InvalidProtocolBufferException -> 0x00db, IOException -> 0x00cd }
            if (r8 == 0) goto L_0x0073
            r8.mo34813a((kotlin.p045h0.p046u.p047e.p048k0.p240d.C9856v) r6)     // Catch:{ InvalidProtocolBufferException -> 0x00db, IOException -> 0x00cd }
            kotlin.h0.u.e.k0.d.v r6 = r8.mo34502j()     // Catch:{ InvalidProtocolBufferException -> 0x00db, IOException -> 0x00cd }
            r9.f27198k = r6     // Catch:{ InvalidProtocolBufferException -> 0x00db, IOException -> 0x00cd }
        L_0x0073:
            int r6 = r9.f27195h     // Catch:{ InvalidProtocolBufferException -> 0x00db, IOException -> 0x00cd }
            r6 = r6 | r7
            r9.f27195h = r6     // Catch:{ InvalidProtocolBufferException -> 0x00db, IOException -> 0x00cd }
            goto L_0x0016
        L_0x0079:
            int r6 = r9.f27195h     // Catch:{ InvalidProtocolBufferException -> 0x00db, IOException -> 0x00cd }
            r7 = 2
            r6 = r6 & r7
            if (r6 != r7) goto L_0x0085
            kotlin.h0.u.e.k0.d.b0 r6 = r9.f27197j     // Catch:{ InvalidProtocolBufferException -> 0x00db, IOException -> 0x00cd }
            kotlin.h0.u.e.k0.d.b0$b r8 = r6.m31628c()     // Catch:{ InvalidProtocolBufferException -> 0x00db, IOException -> 0x00cd }
        L_0x0085:
            kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.h0.u.e.k0.d.b0> r6 = kotlin.p045h0.p046u.p047e.p048k0.p240d.C9759b0.f26788k     // Catch:{ InvalidProtocolBufferException -> 0x00db, IOException -> 0x00cd }
            kotlin.reflect.jvm.internal.impl.protobuf.o r6 = r10.mo35702a(r6, (kotlin.reflect.jvm.internal.impl.protobuf.C10422f) r11)     // Catch:{ InvalidProtocolBufferException -> 0x00db, IOException -> 0x00cd }
            kotlin.h0.u.e.k0.d.b0 r6 = (kotlin.p045h0.p046u.p047e.p048k0.p240d.C9759b0) r6     // Catch:{ InvalidProtocolBufferException -> 0x00db, IOException -> 0x00cd }
            r9.f27197j = r6     // Catch:{ InvalidProtocolBufferException -> 0x00db, IOException -> 0x00cd }
            if (r8 == 0) goto L_0x009a
            r8.mo34434a((kotlin.p045h0.p046u.p047e.p048k0.p240d.C9759b0) r6)     // Catch:{ InvalidProtocolBufferException -> 0x00db, IOException -> 0x00cd }
            kotlin.h0.u.e.k0.d.b0 r6 = r8.mo34436i()     // Catch:{ InvalidProtocolBufferException -> 0x00db, IOException -> 0x00cd }
            r9.f27197j = r6     // Catch:{ InvalidProtocolBufferException -> 0x00db, IOException -> 0x00cd }
        L_0x009a:
            int r6 = r9.f27195h     // Catch:{ InvalidProtocolBufferException -> 0x00db, IOException -> 0x00cd }
            r6 = r6 | r7
            r9.f27195h = r6     // Catch:{ InvalidProtocolBufferException -> 0x00db, IOException -> 0x00cd }
            goto L_0x0016
        L_0x00a1:
            int r6 = r9.f27195h     // Catch:{ InvalidProtocolBufferException -> 0x00db, IOException -> 0x00cd }
            r6 = r6 & r1
            if (r6 != r1) goto L_0x00ac
            kotlin.h0.u.e.k0.d.e0 r6 = r9.f27196i     // Catch:{ InvalidProtocolBufferException -> 0x00db, IOException -> 0x00cd }
            kotlin.h0.u.e.k0.d.e0$b r8 = r6.m31713c()     // Catch:{ InvalidProtocolBufferException -> 0x00db, IOException -> 0x00cd }
        L_0x00ac:
            kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.h0.u.e.k0.d.e0> r6 = kotlin.p045h0.p046u.p047e.p048k0.p240d.C9772e0.f26814k     // Catch:{ InvalidProtocolBufferException -> 0x00db, IOException -> 0x00cd }
            kotlin.reflect.jvm.internal.impl.protobuf.o r6 = r10.mo35702a(r6, (kotlin.reflect.jvm.internal.impl.protobuf.C10422f) r11)     // Catch:{ InvalidProtocolBufferException -> 0x00db, IOException -> 0x00cd }
            kotlin.h0.u.e.k0.d.e0 r6 = (kotlin.p045h0.p046u.p047e.p048k0.p240d.C9772e0) r6     // Catch:{ InvalidProtocolBufferException -> 0x00db, IOException -> 0x00cd }
            r9.f27196i = r6     // Catch:{ InvalidProtocolBufferException -> 0x00db, IOException -> 0x00cd }
            if (r8 == 0) goto L_0x00c1
            r8.mo34452a((kotlin.p045h0.p046u.p047e.p048k0.p240d.C9772e0) r6)     // Catch:{ InvalidProtocolBufferException -> 0x00db, IOException -> 0x00cd }
            kotlin.h0.u.e.k0.d.e0 r6 = r8.mo34453i()     // Catch:{ InvalidProtocolBufferException -> 0x00db, IOException -> 0x00cd }
            r9.f27196i = r6     // Catch:{ InvalidProtocolBufferException -> 0x00db, IOException -> 0x00cd }
        L_0x00c1:
            int r6 = r9.f27195h     // Catch:{ InvalidProtocolBufferException -> 0x00db, IOException -> 0x00cd }
            r6 = r6 | r1
            r9.f27195h = r6     // Catch:{ InvalidProtocolBufferException -> 0x00db, IOException -> 0x00cd }
            goto L_0x0016
        L_0x00c8:
            r3 = 1
            goto L_0x0016
        L_0x00cb:
            r10 = move-exception
            goto L_0x00e0
        L_0x00cd:
            r10 = move-exception
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r11 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException     // Catch:{ all -> 0x00cb }
            java.lang.String r10 = r10.getMessage()     // Catch:{ all -> 0x00cb }
            r11.<init>(r10)     // Catch:{ all -> 0x00cb }
            r11.mo35656a(r9)     // Catch:{ all -> 0x00cb }
            throw r11     // Catch:{ all -> 0x00cb }
        L_0x00db:
            r10 = move-exception
            r10.mo35656a(r9)     // Catch:{ all -> 0x00cb }
            throw r10     // Catch:{ all -> 0x00cb }
        L_0x00e0:
            r11 = r4 & 8
            if (r11 != r5) goto L_0x00ec
            java.util.List<kotlin.h0.u.e.k0.d.f> r11 = r9.f27199l
            java.util.List r11 = java.util.Collections.unmodifiableList(r11)
            r9.f27199l = r11
        L_0x00ec:
            r2.mo35614a()     // Catch:{ IOException -> 0x00ef, all -> 0x00f6 }
        L_0x00ef:
            kotlin.reflect.jvm.internal.impl.protobuf.d r11 = r0.mo35696a()
            r9.f27194g = r11
            goto L_0x00fe
        L_0x00f6:
            r10 = move-exception
            kotlin.reflect.jvm.internal.impl.protobuf.d r11 = r0.mo35696a()
            r9.f27194g = r11
            throw r10
        L_0x00fe:
            r9.mo35760h()
            throw r10
        L_0x0102:
            r10 = r4 & 8
            if (r10 != r5) goto L_0x010e
            java.util.List<kotlin.h0.u.e.k0.d.f> r10 = r9.f27199l
            java.util.List r10 = java.util.Collections.unmodifiableList(r10)
            r9.f27199l = r10
        L_0x010e:
            r2.mo35614a()     // Catch:{ IOException -> 0x0111, all -> 0x0118 }
        L_0x0111:
            kotlin.reflect.jvm.internal.impl.protobuf.d r10 = r0.mo35696a()
            r9.f27194g = r10
            goto L_0x0120
        L_0x0118:
            r10 = move-exception
            kotlin.reflect.jvm.internal.impl.protobuf.d r11 = r0.mo35696a()
            r9.f27194g = r11
            throw r10
        L_0x0120:
            r9.mo35760h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p045h0.p046u.p047e.p048k0.p240d.C9861w.<init>(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):void");
    }

    /* renamed from: a */
    public static C9861w m32791a(InputStream inputStream, C10422f fVar) throws IOException {
        return f27193p.mo35665a(inputStream, fVar);
    }
}
