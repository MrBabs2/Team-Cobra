package kotlin.p045h0.p046u.p047e.p048k0.p240d;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9821n0;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9850t0;
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

/* renamed from: kotlin.h0.u.e.k0.d.v */
/* compiled from: ProtoBuf */
public final class C9856v extends C10427h.C10431d<C9856v> implements C9889y {

    /* renamed from: p */
    private static final C9856v f27167p;

    /* renamed from: q */
    public static C10452q<C9856v> f27168q = new C9857a();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C10417d f27169g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f27170h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public List<C9836r> f27171i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public List<C9930z> f27172j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public List<C9795i0> f27173k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C9821n0 f27174l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C9850t0 f27175m;

    /* renamed from: n */
    private byte f27176n;

    /* renamed from: o */
    private int f27177o;

    /* renamed from: kotlin.h0.u.e.k0.d.v$a */
    /* compiled from: ProtoBuf */
    static class C9857a extends C10413b<C9856v> {
        C9857a() {
        }

        /* renamed from: a */
        public C9856v m32753a(C10420e eVar, C10422f fVar) throws InvalidProtocolBufferException {
            return new C9856v(eVar, fVar);
        }
    }

    static {
        C9856v vVar = new C9856v(true);
        f27167p = vVar;
        vVar.m32728w();
    }

    /* renamed from: v */
    public static C9856v m32727v() {
        return f27167p;
    }

    /* renamed from: w */
    private void m32728w() {
        this.f27171i = Collections.emptyList();
        this.f27172j = Collections.emptyList();
        this.f27173k = Collections.emptyList();
        this.f27174l = C9821n0.m32344m();
        this.f27175m = C9850t0.m32680k();
    }

    /* renamed from: z */
    public static C9858b m32729z() {
        return C9858b.m32755s();
    }

    /* renamed from: e */
    public int mo34361e() {
        int i = this.f27177o;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f27171i.size(); i3++) {
            i2 += CodedOutputStream.m35130d(3, (C10449o) this.f27171i.get(i3));
        }
        for (int i4 = 0; i4 < this.f27172j.size(); i4++) {
            i2 += CodedOutputStream.m35130d(4, (C10449o) this.f27172j.get(i4));
        }
        for (int i5 = 0; i5 < this.f27173k.size(); i5++) {
            i2 += CodedOutputStream.m35130d(5, (C10449o) this.f27173k.get(i5));
        }
        if ((this.f27170h & 1) == 1) {
            i2 += CodedOutputStream.m35130d(30, (C10449o) this.f27174l);
        }
        if ((this.f27170h & 2) == 2) {
            i2 += CodedOutputStream.m35130d(32, (C10449o) this.f27175m);
        }
        int j = i2 + mo35770j() + this.f27169g.size();
        this.f27177o = j;
        return j;
    }

    /* renamed from: g */
    public C10452q<C9856v> mo34363g() {
        return f27168q;
    }

    public final boolean isInitialized() {
        byte b = this.f27176n;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < mo34800l(); i++) {
            if (!mo34797a(i).isInitialized()) {
                this.f27176n = 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < mo34802n(); i2++) {
            if (!mo34798b(i2).isInitialized()) {
                this.f27176n = 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < mo34804p(); i3++) {
            if (!mo34799c(i3).isInitialized()) {
                this.f27176n = 0;
                return false;
            }
        }
        if (mo34808t() && !mo34806r().isInitialized()) {
            this.f27176n = 0;
            return false;
        } else if (!mo35769i()) {
            this.f27176n = 0;
            return false;
        } else {
            this.f27176n = 1;
            return true;
        }
    }

    /* renamed from: l */
    public int mo34800l() {
        return this.f27171i.size();
    }

    /* renamed from: m */
    public List<C9836r> mo34801m() {
        return this.f27171i;
    }

    /* renamed from: n */
    public int mo34802n() {
        return this.f27172j.size();
    }

    /* renamed from: o */
    public List<C9930z> mo34803o() {
        return this.f27172j;
    }

    /* renamed from: p */
    public int mo34804p() {
        return this.f27173k.size();
    }

    /* renamed from: q */
    public List<C9795i0> mo34805q() {
        return this.f27173k;
    }

    /* renamed from: r */
    public C9821n0 mo34806r() {
        return this.f27174l;
    }

    /* renamed from: s */
    public C9850t0 mo34807s() {
        return this.f27175m;
    }

    /* renamed from: t */
    public boolean mo34808t() {
        return (this.f27170h & 1) == 1;
    }

    /* renamed from: u */
    public boolean mo34809u() {
        return (this.f27170h & 2) == 2;
    }

    /* renamed from: kotlin.h0.u.e.k0.d.v$b */
    /* compiled from: ProtoBuf */
    public static final class C9858b extends C10427h.C10430c<C9856v, C9858b> implements C9889y {

        /* renamed from: i */
        private int f27178i;

        /* renamed from: j */
        private List<C9836r> f27179j = Collections.emptyList();

        /* renamed from: k */
        private List<C9930z> f27180k = Collections.emptyList();

        /* renamed from: l */
        private List<C9795i0> f27181l = Collections.emptyList();

        /* renamed from: m */
        private C9821n0 f27182m = C9821n0.m32344m();

        /* renamed from: n */
        private C9850t0 f27183n = C9850t0.m32680k();

        private C9858b() {
            m32759y();
        }

        /* access modifiers changed from: private */
        /* renamed from: s */
        public static C9858b m32755s() {
            return new C9858b();
        }

        /* renamed from: u */
        private void m32756u() {
            if ((this.f27178i & 1) != 1) {
                this.f27179j = new ArrayList(this.f27179j);
                this.f27178i |= 1;
            }
        }

        /* renamed from: w */
        private void m32757w() {
            if ((this.f27178i & 2) != 2) {
                this.f27180k = new ArrayList(this.f27180k);
                this.f27178i |= 2;
            }
        }

        /* renamed from: x */
        private void m32758x() {
            if ((this.f27178i & 4) != 4) {
                this.f27181l = new ArrayList(this.f27181l);
                this.f27178i |= 4;
            }
        }

        /* renamed from: y */
        private void m32759y() {
        }

        /* renamed from: c */
        public C9795i0 mo34815c(int i) {
            return this.f27181l.get(i);
        }

        public final boolean isInitialized() {
            for (int i = 0; i < mo34503k(); i++) {
                if (!mo34810a(i).isInitialized()) {
                    return false;
                }
            }
            for (int i2 = 0; i2 < mo34816l(); i2++) {
                if (!mo34814b(i2).isInitialized()) {
                    return false;
                }
            }
            for (int i3 = 0; i3 < mo34817m(); i3++) {
                if (!mo34815c(i3).isInitialized()) {
                    return false;
                }
            }
            if ((!mo34819q() || mo34818n().isInitialized()) && mo35764i()) {
                return true;
            }
            return false;
        }

        /* renamed from: j */
        public C9856v mo34502j() {
            C9856v vVar = new C9856v((C10427h.C10430c) this);
            int i = this.f27178i;
            int i2 = 1;
            if ((i & 1) == 1) {
                this.f27179j = Collections.unmodifiableList(this.f27179j);
                this.f27178i &= -2;
            }
            List unused = vVar.f27171i = this.f27179j;
            if ((this.f27178i & 2) == 2) {
                this.f27180k = Collections.unmodifiableList(this.f27180k);
                this.f27178i &= -3;
            }
            List unused2 = vVar.f27172j = this.f27180k;
            if ((this.f27178i & 4) == 4) {
                this.f27181l = Collections.unmodifiableList(this.f27181l);
                this.f27178i &= -5;
            }
            List unused3 = vVar.f27173k = this.f27181l;
            if ((i & 8) != 8) {
                i2 = 0;
            }
            C9821n0 unused4 = vVar.f27174l = this.f27182m;
            if ((i & 16) == 16) {
                i2 |= 2;
            }
            C9850t0 unused5 = vVar.f27175m = this.f27183n;
            int unused6 = vVar.f27170h = i2;
            return vVar;
        }

        /* renamed from: k */
        public int mo34503k() {
            return this.f27179j.size();
        }

        /* renamed from: l */
        public int mo34816l() {
            return this.f27180k.size();
        }

        /* renamed from: m */
        public int mo34817m() {
            return this.f27181l.size();
        }

        /* renamed from: n */
        public C9821n0 mo34818n() {
            return this.f27182m;
        }

        /* renamed from: q */
        public boolean mo34819q() {
            return (this.f27178i & 8) == 8;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ C10427h.C10429b mo34379a(C10427h hVar) {
            mo34813a((C9856v) hVar);
            return this;
        }

        /* renamed from: b */
        public C9856v m32773b() {
            return C9856v.m32727v();
        }

        public C9858b clone() {
            C9858b s = m32755s();
            s.mo34813a(mo34502j());
            return s;
        }

        /* renamed from: b */
        public C9930z mo34814b(int i) {
            return this.f27180k.get(i);
        }

        /* renamed from: a */
        public C9856v m32769a() {
            C9856v j = mo34502j();
            if (j.isInitialized()) {
                return j;
            }
            throw C10410a.C10411a.m35207a(j);
        }

        /* renamed from: a */
        public C9858b mo34813a(C9856v vVar) {
            if (vVar == C9856v.m32727v()) {
                return this;
            }
            if (!vVar.f27171i.isEmpty()) {
                if (this.f27179j.isEmpty()) {
                    this.f27179j = vVar.f27171i;
                    this.f27178i &= -2;
                } else {
                    m32756u();
                    this.f27179j.addAll(vVar.f27171i);
                }
            }
            if (!vVar.f27172j.isEmpty()) {
                if (this.f27180k.isEmpty()) {
                    this.f27180k = vVar.f27172j;
                    this.f27178i &= -3;
                } else {
                    m32757w();
                    this.f27180k.addAll(vVar.f27172j);
                }
            }
            if (!vVar.f27173k.isEmpty()) {
                if (this.f27181l.isEmpty()) {
                    this.f27181l = vVar.f27173k;
                    this.f27178i &= -5;
                } else {
                    m32758x();
                    this.f27181l.addAll(vVar.f27173k);
                }
            }
            if (vVar.mo34808t()) {
                mo34811a(vVar.mo34806r());
            }
            if (vVar.mo34809u()) {
                mo34812a(vVar.mo34807s());
            }
            mo35763a(vVar);
            mo35761a(mo35762h().mo35686b(vVar.f27169g));
            return this;
        }

        /* renamed from: a */
        public C9858b mo34377a(C10420e eVar, C10422f fVar) throws IOException {
            C9856v vVar;
            C9856v vVar2 = null;
            try {
                C9856v a = C9856v.f27168q.mo34369a(eVar, fVar);
                if (a != null) {
                    mo34813a(a);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                vVar = (C9856v) e.mo35657a();
                throw e;
            } catch (Throwable th) {
                th = th;
                vVar2 = vVar;
            }
            if (vVar2 != null) {
                mo34813a(vVar2);
            }
            throw th;
        }

        /* renamed from: a */
        public C9836r mo34810a(int i) {
            return this.f27179j.get(i);
        }

        /* renamed from: a */
        public C9858b mo34811a(C9821n0 n0Var) {
            if ((this.f27178i & 8) != 8 || this.f27182m == C9821n0.m32344m()) {
                this.f27182m = n0Var;
            } else {
                C9821n0.C9823b c = C9821n0.m32343c(this.f27182m);
                c.mo34672a(n0Var);
                this.f27182m = c.mo34674i();
            }
            this.f27178i |= 8;
            return this;
        }

        /* renamed from: a */
        public C9858b mo34812a(C9850t0 t0Var) {
            if ((this.f27178i & 16) != 16 || this.f27183n == C9850t0.m32680k()) {
                this.f27183n = t0Var;
            } else {
                C9850t0.C9852b c = C9850t0.m32679c(this.f27183n);
                c.mo34795a(t0Var);
                this.f27183n = c.mo34796i();
            }
            this.f27178i |= 16;
            return this;
        }
    }

    /* renamed from: f */
    public C9858b m32740f() {
        return m32729z();
    }

    private C9856v(C10427h.C10430c<C9856v, ?> cVar) {
        super(cVar);
        this.f27176n = -1;
        this.f27177o = -1;
        this.f27169g = cVar.mo35762h();
    }

    /* renamed from: b */
    public C9856v m32734b() {
        return f27167p;
    }

    /* renamed from: c */
    public C9795i0 mo34799c(int i) {
        return this.f27173k.get(i);
    }

    /* renamed from: b */
    public C9930z mo34798b(int i) {
        return this.f27172j.get(i);
    }

    /* renamed from: c */
    public C9858b m32737c() {
        return m32726e(this);
    }

    /* renamed from: a */
    public C9836r mo34797a(int i) {
        return this.f27171i.get(i);
    }

    private C9856v(boolean z) {
        this.f27176n = -1;
        this.f27177o = -1;
        this.f27169g = C10417d.f28215f;
    }

    /* renamed from: a */
    public void mo34358a(CodedOutputStream codedOutputStream) throws IOException {
        mo34361e();
        C10427h.C10431d<MessageType>.C0000a k = mo35771k();
        for (int i = 0; i < this.f27171i.size(); i++) {
            codedOutputStream.mo35636b(3, (C10449o) this.f27171i.get(i));
        }
        for (int i2 = 0; i2 < this.f27172j.size(); i2++) {
            codedOutputStream.mo35636b(4, (C10449o) this.f27172j.get(i2));
        }
        for (int i3 = 0; i3 < this.f27173k.size(); i3++) {
            codedOutputStream.mo35636b(5, (C10449o) this.f27173k.get(i3));
        }
        if ((this.f27170h & 1) == 1) {
            codedOutputStream.mo35636b(30, (C10449o) this.f27174l);
        }
        if ((this.f27170h & 2) == 2) {
            codedOutputStream.mo35636b(32, (C10449o) this.f27175m);
        }
        k.mo35772a(200, codedOutputStream);
        codedOutputStream.mo35638b(this.f27169g);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: kotlin.h0.u.e.k0.d.n0$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: kotlin.h0.u.e.k0.d.t0$b} */
    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v5 */
    /* JADX WARNING: type inference failed for: r9v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C9856v(kotlin.reflect.jvm.internal.impl.protobuf.C10420e r11, kotlin.reflect.jvm.internal.impl.protobuf.C10422f r12) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
        /*
            r10 = this;
            r10.<init>()
            r0 = -1
            r10.f27176n = r0
            r10.f27177o = r0
            r10.m32728w()
            kotlin.reflect.jvm.internal.impl.protobuf.d$b r0 = kotlin.reflect.jvm.internal.impl.protobuf.C10417d.m35229j()
            r1 = 1
            kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r2 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.m35116a((java.io.OutputStream) r0, (int) r1)
            r3 = 0
            r4 = 0
        L_0x0016:
            r5 = 4
            r6 = 2
            if (r3 != 0) goto L_0x0129
            int r7 = r11.mo35733x()     // Catch:{ InvalidProtocolBufferException -> 0x00ea, IOException -> 0x00dc }
            if (r7 == 0) goto L_0x00d7
            r8 = 26
            if (r7 == r8) goto L_0x00bd
            r8 = 34
            if (r7 == r8) goto L_0x00a3
            r8 = 42
            if (r7 == r8) goto L_0x0089
            r8 = 242(0xf2, float:3.39E-43)
            r9 = 0
            if (r7 == r8) goto L_0x0063
            r8 = 258(0x102, float:3.62E-43)
            if (r7 == r8) goto L_0x003d
            boolean r5 = r10.mo35759a(r11, r2, r12, r7)     // Catch:{ InvalidProtocolBufferException -> 0x00ea, IOException -> 0x00dc }
            if (r5 != 0) goto L_0x0016
            goto L_0x00d7
        L_0x003d:
            int r7 = r10.f27170h     // Catch:{ InvalidProtocolBufferException -> 0x00ea, IOException -> 0x00dc }
            r7 = r7 & r6
            if (r7 != r6) goto L_0x0048
            kotlin.h0.u.e.k0.d.t0 r7 = r10.f27175m     // Catch:{ InvalidProtocolBufferException -> 0x00ea, IOException -> 0x00dc }
            kotlin.h0.u.e.k0.d.t0$b r9 = r7.m32687c()     // Catch:{ InvalidProtocolBufferException -> 0x00ea, IOException -> 0x00dc }
        L_0x0048:
            kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.h0.u.e.k0.d.t0> r7 = kotlin.p045h0.p046u.p047e.p048k0.p240d.C9850t0.f27154k     // Catch:{ InvalidProtocolBufferException -> 0x00ea, IOException -> 0x00dc }
            kotlin.reflect.jvm.internal.impl.protobuf.o r7 = r11.mo35702a(r7, (kotlin.reflect.jvm.internal.impl.protobuf.C10422f) r12)     // Catch:{ InvalidProtocolBufferException -> 0x00ea, IOException -> 0x00dc }
            kotlin.h0.u.e.k0.d.t0 r7 = (kotlin.p045h0.p046u.p047e.p048k0.p240d.C9850t0) r7     // Catch:{ InvalidProtocolBufferException -> 0x00ea, IOException -> 0x00dc }
            r10.f27175m = r7     // Catch:{ InvalidProtocolBufferException -> 0x00ea, IOException -> 0x00dc }
            if (r9 == 0) goto L_0x005d
            r9.mo34795a((kotlin.p045h0.p046u.p047e.p048k0.p240d.C9850t0) r7)     // Catch:{ InvalidProtocolBufferException -> 0x00ea, IOException -> 0x00dc }
            kotlin.h0.u.e.k0.d.t0 r7 = r9.mo34796i()     // Catch:{ InvalidProtocolBufferException -> 0x00ea, IOException -> 0x00dc }
            r10.f27175m = r7     // Catch:{ InvalidProtocolBufferException -> 0x00ea, IOException -> 0x00dc }
        L_0x005d:
            int r7 = r10.f27170h     // Catch:{ InvalidProtocolBufferException -> 0x00ea, IOException -> 0x00dc }
            r7 = r7 | r6
            r10.f27170h = r7     // Catch:{ InvalidProtocolBufferException -> 0x00ea, IOException -> 0x00dc }
            goto L_0x0016
        L_0x0063:
            int r7 = r10.f27170h     // Catch:{ InvalidProtocolBufferException -> 0x00ea, IOException -> 0x00dc }
            r7 = r7 & r1
            if (r7 != r1) goto L_0x006e
            kotlin.h0.u.e.k0.d.n0 r7 = r10.f27174l     // Catch:{ InvalidProtocolBufferException -> 0x00ea, IOException -> 0x00dc }
            kotlin.h0.u.e.k0.d.n0$b r9 = r7.m32352c()     // Catch:{ InvalidProtocolBufferException -> 0x00ea, IOException -> 0x00dc }
        L_0x006e:
            kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.h0.u.e.k0.d.n0> r7 = kotlin.p045h0.p046u.p047e.p048k0.p240d.C9821n0.f27032m     // Catch:{ InvalidProtocolBufferException -> 0x00ea, IOException -> 0x00dc }
            kotlin.reflect.jvm.internal.impl.protobuf.o r7 = r11.mo35702a(r7, (kotlin.reflect.jvm.internal.impl.protobuf.C10422f) r12)     // Catch:{ InvalidProtocolBufferException -> 0x00ea, IOException -> 0x00dc }
            kotlin.h0.u.e.k0.d.n0 r7 = (kotlin.p045h0.p046u.p047e.p048k0.p240d.C9821n0) r7     // Catch:{ InvalidProtocolBufferException -> 0x00ea, IOException -> 0x00dc }
            r10.f27174l = r7     // Catch:{ InvalidProtocolBufferException -> 0x00ea, IOException -> 0x00dc }
            if (r9 == 0) goto L_0x0083
            r9.mo34672a((kotlin.p045h0.p046u.p047e.p048k0.p240d.C9821n0) r7)     // Catch:{ InvalidProtocolBufferException -> 0x00ea, IOException -> 0x00dc }
            kotlin.h0.u.e.k0.d.n0 r7 = r9.mo34674i()     // Catch:{ InvalidProtocolBufferException -> 0x00ea, IOException -> 0x00dc }
            r10.f27174l = r7     // Catch:{ InvalidProtocolBufferException -> 0x00ea, IOException -> 0x00dc }
        L_0x0083:
            int r7 = r10.f27170h     // Catch:{ InvalidProtocolBufferException -> 0x00ea, IOException -> 0x00dc }
            r7 = r7 | r1
            r10.f27170h = r7     // Catch:{ InvalidProtocolBufferException -> 0x00ea, IOException -> 0x00dc }
            goto L_0x0016
        L_0x0089:
            r7 = r4 & 4
            if (r7 == r5) goto L_0x0096
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x00ea, IOException -> 0x00dc }
            r7.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x00ea, IOException -> 0x00dc }
            r10.f27173k = r7     // Catch:{ InvalidProtocolBufferException -> 0x00ea, IOException -> 0x00dc }
            r4 = r4 | 4
        L_0x0096:
            java.util.List<kotlin.h0.u.e.k0.d.i0> r7 = r10.f27173k     // Catch:{ InvalidProtocolBufferException -> 0x00ea, IOException -> 0x00dc }
            kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.h0.u.e.k0.d.i0> r8 = kotlin.p045h0.p046u.p047e.p048k0.p240d.C9795i0.f26940u     // Catch:{ InvalidProtocolBufferException -> 0x00ea, IOException -> 0x00dc }
            kotlin.reflect.jvm.internal.impl.protobuf.o r8 = r11.mo35702a(r8, (kotlin.reflect.jvm.internal.impl.protobuf.C10422f) r12)     // Catch:{ InvalidProtocolBufferException -> 0x00ea, IOException -> 0x00dc }
            r7.add(r8)     // Catch:{ InvalidProtocolBufferException -> 0x00ea, IOException -> 0x00dc }
            goto L_0x0016
        L_0x00a3:
            r7 = r4 & 2
            if (r7 == r6) goto L_0x00b0
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x00ea, IOException -> 0x00dc }
            r7.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x00ea, IOException -> 0x00dc }
            r10.f27172j = r7     // Catch:{ InvalidProtocolBufferException -> 0x00ea, IOException -> 0x00dc }
            r4 = r4 | 2
        L_0x00b0:
            java.util.List<kotlin.h0.u.e.k0.d.z> r7 = r10.f27172j     // Catch:{ InvalidProtocolBufferException -> 0x00ea, IOException -> 0x00dc }
            kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.h0.u.e.k0.d.z> r8 = kotlin.p045h0.p046u.p047e.p048k0.p240d.C9930z.f27391x     // Catch:{ InvalidProtocolBufferException -> 0x00ea, IOException -> 0x00dc }
            kotlin.reflect.jvm.internal.impl.protobuf.o r8 = r11.mo35702a(r8, (kotlin.reflect.jvm.internal.impl.protobuf.C10422f) r12)     // Catch:{ InvalidProtocolBufferException -> 0x00ea, IOException -> 0x00dc }
            r7.add(r8)     // Catch:{ InvalidProtocolBufferException -> 0x00ea, IOException -> 0x00dc }
            goto L_0x0016
        L_0x00bd:
            r7 = r4 & 1
            if (r7 == r1) goto L_0x00ca
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x00ea, IOException -> 0x00dc }
            r7.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x00ea, IOException -> 0x00dc }
            r10.f27171i = r7     // Catch:{ InvalidProtocolBufferException -> 0x00ea, IOException -> 0x00dc }
            r4 = r4 | 1
        L_0x00ca:
            java.util.List<kotlin.h0.u.e.k0.d.r> r7 = r10.f27171i     // Catch:{ InvalidProtocolBufferException -> 0x00ea, IOException -> 0x00dc }
            kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.h0.u.e.k0.d.r> r8 = kotlin.p045h0.p046u.p047e.p048k0.p240d.C9836r.f27088x     // Catch:{ InvalidProtocolBufferException -> 0x00ea, IOException -> 0x00dc }
            kotlin.reflect.jvm.internal.impl.protobuf.o r8 = r11.mo35702a(r8, (kotlin.reflect.jvm.internal.impl.protobuf.C10422f) r12)     // Catch:{ InvalidProtocolBufferException -> 0x00ea, IOException -> 0x00dc }
            r7.add(r8)     // Catch:{ InvalidProtocolBufferException -> 0x00ea, IOException -> 0x00dc }
            goto L_0x0016
        L_0x00d7:
            r3 = 1
            goto L_0x0016
        L_0x00da:
            r11 = move-exception
            goto L_0x00ef
        L_0x00dc:
            r11 = move-exception
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r12 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException     // Catch:{ all -> 0x00da }
            java.lang.String r11 = r11.getMessage()     // Catch:{ all -> 0x00da }
            r12.<init>(r11)     // Catch:{ all -> 0x00da }
            r12.mo35656a(r10)     // Catch:{ all -> 0x00da }
            throw r12     // Catch:{ all -> 0x00da }
        L_0x00ea:
            r11 = move-exception
            r11.mo35656a(r10)     // Catch:{ all -> 0x00da }
            throw r11     // Catch:{ all -> 0x00da }
        L_0x00ef:
            r12 = r4 & 1
            if (r12 != r1) goto L_0x00fb
            java.util.List<kotlin.h0.u.e.k0.d.r> r12 = r10.f27171i
            java.util.List r12 = java.util.Collections.unmodifiableList(r12)
            r10.f27171i = r12
        L_0x00fb:
            r12 = r4 & 2
            if (r12 != r6) goto L_0x0107
            java.util.List<kotlin.h0.u.e.k0.d.z> r12 = r10.f27172j
            java.util.List r12 = java.util.Collections.unmodifiableList(r12)
            r10.f27172j = r12
        L_0x0107:
            r12 = r4 & 4
            if (r12 != r5) goto L_0x0113
            java.util.List<kotlin.h0.u.e.k0.d.i0> r12 = r10.f27173k
            java.util.List r12 = java.util.Collections.unmodifiableList(r12)
            r10.f27173k = r12
        L_0x0113:
            r2.mo35614a()     // Catch:{ IOException -> 0x0116, all -> 0x011d }
        L_0x0116:
            kotlin.reflect.jvm.internal.impl.protobuf.d r12 = r0.mo35696a()
            r10.f27169g = r12
            goto L_0x0125
        L_0x011d:
            r11 = move-exception
            kotlin.reflect.jvm.internal.impl.protobuf.d r12 = r0.mo35696a()
            r10.f27169g = r12
            throw r11
        L_0x0125:
            r10.mo35760h()
            throw r11
        L_0x0129:
            r11 = r4 & 1
            if (r11 != r1) goto L_0x0135
            java.util.List<kotlin.h0.u.e.k0.d.r> r11 = r10.f27171i
            java.util.List r11 = java.util.Collections.unmodifiableList(r11)
            r10.f27171i = r11
        L_0x0135:
            r11 = r4 & 2
            if (r11 != r6) goto L_0x0141
            java.util.List<kotlin.h0.u.e.k0.d.z> r11 = r10.f27172j
            java.util.List r11 = java.util.Collections.unmodifiableList(r11)
            r10.f27172j = r11
        L_0x0141:
            r11 = r4 & 4
            if (r11 != r5) goto L_0x014d
            java.util.List<kotlin.h0.u.e.k0.d.i0> r11 = r10.f27173k
            java.util.List r11 = java.util.Collections.unmodifiableList(r11)
            r10.f27173k = r11
        L_0x014d:
            r2.mo35614a()     // Catch:{ IOException -> 0x0150, all -> 0x0157 }
        L_0x0150:
            kotlin.reflect.jvm.internal.impl.protobuf.d r11 = r0.mo35696a()
            r10.f27169g = r11
            goto L_0x015f
        L_0x0157:
            r11 = move-exception
            kotlin.reflect.jvm.internal.impl.protobuf.d r12 = r0.mo35696a()
            r10.f27169g = r12
            throw r11
        L_0x015f:
            r10.mo35760h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p045h0.p046u.p047e.p048k0.p240d.C9856v.<init>(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):void");
    }

    /* renamed from: e */
    public static C9858b m32726e(C9856v vVar) {
        C9858b z = m32729z();
        z.mo34813a(vVar);
        return z;
    }

    /* renamed from: a */
    public static C9856v m32720a(InputStream inputStream, C10422f fVar) throws IOException {
        return f27168q.mo35665a(inputStream, fVar);
    }
}
