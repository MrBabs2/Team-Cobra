package kotlin.p045h0.p046u.p047e.p048k0.p240d;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.AdRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9831p0;
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

/* renamed from: kotlin.h0.u.e.k0.d.z */
/* compiled from: ProtoBuf */
public final class C9930z extends C10427h.C10431d<C9930z> implements C9747a0 {

    /* renamed from: w */
    private static final C9930z f27390w;

    /* renamed from: x */
    public static C10452q<C9930z> f27391x = new C9931a();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C10417d f27392g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f27393h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f27394i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public int f27395j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public int f27396k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C9782g0 f27397l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public int f27398m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public List<C9811l0> f27399n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C9782g0 f27400o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public int f27401p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public C9831p0 f27402q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public int f27403r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public int f27404s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public List<Integer> f27405t;

    /* renamed from: u */
    private byte f27406u;

    /* renamed from: v */
    private int f27407v;

    /* renamed from: kotlin.h0.u.e.k0.d.z$a */
    /* compiled from: ProtoBuf */
    static class C9931a extends C10413b<C9930z> {
        C9931a() {
        }

        /* renamed from: a */
        public C9930z m33222a(C10420e eVar, C10422f fVar) throws InvalidProtocolBufferException {
            return new C9930z(eVar, fVar);
        }
    }

    static {
        C9930z zVar = new C9930z(true);
        f27390w = zVar;
        zVar.m33169L();
    }

    /* renamed from: K */
    public static C9930z m33168K() {
        return f27390w;
    }

    /* renamed from: L */
    private void m33169L() {
        this.f27394i = 518;
        this.f27395j = 2054;
        this.f27396k = 0;
        this.f27397l = C9782g0.m31867P();
        this.f27398m = 0;
        this.f27399n = Collections.emptyList();
        this.f27400o = C9782g0.m31867P();
        this.f27401p = 0;
        this.f27402q = C9831p0.m32463z();
        this.f27403r = 0;
        this.f27404s = 0;
        this.f27405t = Collections.emptyList();
    }

    /* renamed from: M */
    public static C9932b m33170M() {
        return C9932b.m33225x();
    }

    /* renamed from: A */
    public boolean mo34939A() {
        return (this.f27393h & 1) == 1;
    }

    /* renamed from: B */
    public boolean mo34940B() {
        return (this.f27393h & 256) == 256;
    }

    /* renamed from: C */
    public boolean mo34941C() {
        return (this.f27393h & 4) == 4;
    }

    /* renamed from: D */
    public boolean mo34942D() {
        return (this.f27393h & 2) == 2;
    }

    /* renamed from: E */
    public boolean mo34943E() {
        return (this.f27393h & 32) == 32;
    }

    /* renamed from: F */
    public boolean mo34944F() {
        return (this.f27393h & 64) == 64;
    }

    /* renamed from: G */
    public boolean mo34945G() {
        return (this.f27393h & 8) == 8;
    }

    /* renamed from: H */
    public boolean mo34946H() {
        return (this.f27393h & 16) == 16;
    }

    /* renamed from: I */
    public boolean mo34947I() {
        return (this.f27393h & AdRequest.MAX_CONTENT_URL_LENGTH) == 512;
    }

    /* renamed from: J */
    public boolean mo34948J() {
        return (this.f27393h & 128) == 128;
    }

    public final boolean isInitialized() {
        byte b = this.f27406u;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!mo34941C()) {
            this.f27406u = 0;
            return false;
        } else if (!mo34945G() || mo34956r().isInitialized()) {
            for (int i = 0; i < mo34960v(); i++) {
                if (!mo34949a(i).isInitialized()) {
                    this.f27406u = 0;
                    return false;
                }
            }
            if (mo34943E() && !mo34954p().isInitialized()) {
                this.f27406u = 0;
                return false;
            } else if (mo34948J() && !mo34959u().isInitialized()) {
                this.f27406u = 0;
                return false;
            } else if (!mo35769i()) {
                this.f27406u = 0;
                return false;
            } else {
                this.f27406u = 1;
                return true;
            }
        } else {
            this.f27406u = 0;
            return false;
        }
    }

    /* renamed from: l */
    public int mo34950l() {
        return this.f27394i;
    }

    /* renamed from: m */
    public int mo34951m() {
        return this.f27403r;
    }

    /* renamed from: n */
    public int mo34952n() {
        return this.f27396k;
    }

    /* renamed from: o */
    public int mo34953o() {
        return this.f27395j;
    }

    /* renamed from: p */
    public C9782g0 mo34954p() {
        return this.f27400o;
    }

    /* renamed from: q */
    public int mo34955q() {
        return this.f27401p;
    }

    /* renamed from: r */
    public C9782g0 mo34956r() {
        return this.f27397l;
    }

    /* renamed from: s */
    public int mo34957s() {
        return this.f27398m;
    }

    /* renamed from: t */
    public int mo34958t() {
        return this.f27404s;
    }

    /* renamed from: u */
    public C9831p0 mo34959u() {
        return this.f27402q;
    }

    /* renamed from: v */
    public int mo34960v() {
        return this.f27399n.size();
    }

    /* renamed from: w */
    public List<C9811l0> mo34961w() {
        return this.f27399n;
    }

    /* renamed from: z */
    public List<Integer> mo34962z() {
        return this.f27405t;
    }

    /* renamed from: kotlin.h0.u.e.k0.d.z$b */
    /* compiled from: ProtoBuf */
    public static final class C9932b extends C10427h.C10430c<C9930z, C9932b> implements C9747a0 {

        /* renamed from: i */
        private int f27408i;

        /* renamed from: j */
        private int f27409j = 518;

        /* renamed from: k */
        private int f27410k = 2054;

        /* renamed from: l */
        private int f27411l;

        /* renamed from: m */
        private C9782g0 f27412m = C9782g0.m31867P();

        /* renamed from: n */
        private int f27413n;

        /* renamed from: o */
        private List<C9811l0> f27414o = Collections.emptyList();

        /* renamed from: p */
        private C9782g0 f27415p = C9782g0.m31867P();

        /* renamed from: q */
        private int f27416q;

        /* renamed from: r */
        private C9831p0 f27417r = C9831p0.m32463z();

        /* renamed from: s */
        private int f27418s;

        /* renamed from: t */
        private int f27419t;

        /* renamed from: u */
        private List<Integer> f27420u = Collections.emptyList();

        private C9932b() {
            m33223A();
        }

        /* renamed from: A */
        private void m33223A() {
        }

        /* access modifiers changed from: private */
        /* renamed from: x */
        public static C9932b m33225x() {
            return new C9932b();
        }

        /* renamed from: y */
        private void m33226y() {
            if ((this.f27408i & 32) != 32) {
                this.f27414o = new ArrayList(this.f27414o);
                this.f27408i |= 32;
            }
        }

        /* renamed from: z */
        private void m33227z() {
            if ((this.f27408i & RecyclerView.C0638l.FLAG_MOVED) != 2048) {
                this.f27420u = new ArrayList(this.f27420u);
                this.f27408i |= RecyclerView.C0638l.FLAG_MOVED;
            }
        }

        /* renamed from: c */
        public C9932b mo34969c(int i) {
            this.f27408i |= AdRequest.MAX_CONTENT_URL_LENGTH;
            this.f27418s = i;
            return this;
        }

        /* renamed from: d */
        public C9932b mo34970d(int i) {
            this.f27408i |= 4;
            this.f27411l = i;
            return this;
        }

        /* renamed from: e */
        public C9932b mo34971e(int i) {
            this.f27408i |= 2;
            this.f27410k = i;
            return this;
        }

        /* renamed from: f */
        public C9932b mo34972f(int i) {
            this.f27408i |= 128;
            this.f27416q = i;
            return this;
        }

        /* renamed from: g */
        public C9932b mo34973g(int i) {
            this.f27408i |= 16;
            this.f27413n = i;
            return this;
        }

        /* renamed from: h */
        public C9932b mo34974h(int i) {
            this.f27408i |= 1024;
            this.f27419t = i;
            return this;
        }

        public final boolean isInitialized() {
            if (!mo34978q()) {
                return false;
            }
            if (mo34980s() && !mo34975l().isInitialized()) {
                return false;
            }
            for (int i = 0; i < mo34977n(); i++) {
                if (!mo34963a(i).isInitialized()) {
                    return false;
                }
            }
            if (mo34979r() && !mo34503k().isInitialized()) {
                return false;
            }
            if ((!mo34981u() || mo34976m().isInitialized()) && mo35764i()) {
                return true;
            }
            return false;
        }

        /* renamed from: j */
        public C9930z mo34502j() {
            C9930z zVar = new C9930z((C10427h.C10430c) this);
            int i = this.f27408i;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            int unused = zVar.f27394i = this.f27409j;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            int unused2 = zVar.f27395j = this.f27410k;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            int unused3 = zVar.f27396k = this.f27411l;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            C9782g0 unused4 = zVar.f27397l = this.f27412m;
            if ((i & 16) == 16) {
                i2 |= 16;
            }
            int unused5 = zVar.f27398m = this.f27413n;
            if ((this.f27408i & 32) == 32) {
                this.f27414o = Collections.unmodifiableList(this.f27414o);
                this.f27408i &= -33;
            }
            List unused6 = zVar.f27399n = this.f27414o;
            if ((i & 64) == 64) {
                i2 |= 32;
            }
            C9782g0 unused7 = zVar.f27400o = this.f27415p;
            if ((i & 128) == 128) {
                i2 |= 64;
            }
            int unused8 = zVar.f27401p = this.f27416q;
            if ((i & 256) == 256) {
                i2 |= 128;
            }
            C9831p0 unused9 = zVar.f27402q = this.f27417r;
            if ((i & AdRequest.MAX_CONTENT_URL_LENGTH) == 512) {
                i2 |= 256;
            }
            int unused10 = zVar.f27403r = this.f27418s;
            if ((i & 1024) == 1024) {
                i2 |= AdRequest.MAX_CONTENT_URL_LENGTH;
            }
            int unused11 = zVar.f27404s = this.f27419t;
            if ((this.f27408i & RecyclerView.C0638l.FLAG_MOVED) == 2048) {
                this.f27420u = Collections.unmodifiableList(this.f27420u);
                this.f27408i &= -2049;
            }
            List unused12 = zVar.f27405t = this.f27420u;
            int unused13 = zVar.f27393h = i2;
            return zVar;
        }

        /* renamed from: k */
        public C9782g0 mo34503k() {
            return this.f27415p;
        }

        /* renamed from: l */
        public C9782g0 mo34975l() {
            return this.f27412m;
        }

        /* renamed from: m */
        public C9831p0 mo34976m() {
            return this.f27417r;
        }

        /* renamed from: n */
        public int mo34977n() {
            return this.f27414o.size();
        }

        /* renamed from: q */
        public boolean mo34978q() {
            return (this.f27408i & 4) == 4;
        }

        /* renamed from: r */
        public boolean mo34979r() {
            return (this.f27408i & 64) == 64;
        }

        /* renamed from: s */
        public boolean mo34980s() {
            return (this.f27408i & 8) == 8;
        }

        /* renamed from: u */
        public boolean mo34981u() {
            return (this.f27408i & 256) == 256;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ C10427h.C10429b mo34379a(C10427h hVar) {
            mo34966a((C9930z) hVar);
            return this;
        }

        /* renamed from: b */
        public C9930z m33242b() {
            return C9930z.m33168K();
        }

        public C9932b clone() {
            C9932b x = m33225x();
            x.mo34966a(mo34502j());
            return x;
        }

        /* renamed from: b */
        public C9932b mo34967b(int i) {
            this.f27408i |= 1;
            this.f27409j = i;
            return this;
        }

        /* renamed from: a */
        public C9930z m33237a() {
            C9930z j = mo34502j();
            if (j.isInitialized()) {
                return j;
            }
            throw C10410a.C10411a.m35207a(j);
        }

        /* renamed from: b */
        public C9932b mo34968b(C9782g0 g0Var) {
            if ((this.f27408i & 8) != 8 || this.f27412m == C9782g0.m31867P()) {
                this.f27412m = g0Var;
            } else {
                this.f27412m = C9782g0.m31879c(this.f27412m).mo34379a(g0Var).mo34502j();
            }
            this.f27408i |= 8;
            return this;
        }

        /* renamed from: a */
        public C9932b mo34966a(C9930z zVar) {
            if (zVar == C9930z.m33168K()) {
                return this;
            }
            if (zVar.mo34939A()) {
                mo34967b(zVar.mo34950l());
            }
            if (zVar.mo34942D()) {
                mo34971e(zVar.mo34953o());
            }
            if (zVar.mo34941C()) {
                mo34970d(zVar.mo34952n());
            }
            if (zVar.mo34945G()) {
                mo34968b(zVar.mo34956r());
            }
            if (zVar.mo34946H()) {
                mo34973g(zVar.mo34957s());
            }
            if (!zVar.f27399n.isEmpty()) {
                if (this.f27414o.isEmpty()) {
                    this.f27414o = zVar.f27399n;
                    this.f27408i &= -33;
                } else {
                    m33226y();
                    this.f27414o.addAll(zVar.f27399n);
                }
            }
            if (zVar.mo34943E()) {
                mo34964a(zVar.mo34954p());
            }
            if (zVar.mo34944F()) {
                mo34972f(zVar.mo34955q());
            }
            if (zVar.mo34948J()) {
                mo34965a(zVar.mo34959u());
            }
            if (zVar.mo34940B()) {
                mo34969c(zVar.mo34951m());
            }
            if (zVar.mo34947I()) {
                mo34974h(zVar.mo34958t());
            }
            if (!zVar.f27405t.isEmpty()) {
                if (this.f27420u.isEmpty()) {
                    this.f27420u = zVar.f27405t;
                    this.f27408i &= -2049;
                } else {
                    m33227z();
                    this.f27420u.addAll(zVar.f27405t);
                }
            }
            mo35763a(zVar);
            mo35761a(mo35762h().mo35686b(zVar.f27392g));
            return this;
        }

        /* renamed from: a */
        public C9932b mo34377a(C10420e eVar, C10422f fVar) throws IOException {
            C9930z zVar;
            C9930z zVar2 = null;
            try {
                C9930z a = C9930z.f27391x.mo34369a(eVar, fVar);
                if (a != null) {
                    mo34966a(a);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                zVar = (C9930z) e.mo35657a();
                throw e;
            } catch (Throwable th) {
                th = th;
                zVar2 = zVar;
            }
            if (zVar2 != null) {
                mo34966a(zVar2);
            }
            throw th;
        }

        /* renamed from: a */
        public C9811l0 mo34963a(int i) {
            return this.f27414o.get(i);
        }

        /* renamed from: a */
        public C9932b mo34964a(C9782g0 g0Var) {
            if ((this.f27408i & 64) != 64 || this.f27415p == C9782g0.m31867P()) {
                this.f27415p = g0Var;
            } else {
                this.f27415p = C9782g0.m31879c(this.f27415p).mo34379a(g0Var).mo34502j();
            }
            this.f27408i |= 64;
            return this;
        }

        /* renamed from: a */
        public C9932b mo34965a(C9831p0 p0Var) {
            if ((this.f27408i & 256) != 256 || this.f27417r == C9831p0.m32463z()) {
                this.f27417r = p0Var;
            } else {
                C9831p0.C9833b b = C9831p0.m32459b(this.f27417r);
                b.mo34717a(p0Var);
                this.f27417r = b.mo34502j();
            }
            this.f27408i |= 256;
            return this;
        }
    }

    /* renamed from: d */
    public static C9932b m33183d(C9930z zVar) {
        C9932b M = m33170M();
        M.mo34966a(zVar);
        return M;
    }

    /* renamed from: e */
    public int mo34361e() {
        int i = this.f27407v;
        if (i != -1) {
            return i;
        }
        int f = (this.f27393h & 2) == 2 ? CodedOutputStream.m35133f(1, this.f27395j) + 0 : 0;
        if ((this.f27393h & 4) == 4) {
            f += CodedOutputStream.m35133f(2, this.f27396k);
        }
        if ((this.f27393h & 8) == 8) {
            f += CodedOutputStream.m35130d(3, (C10449o) this.f27397l);
        }
        for (int i2 = 0; i2 < this.f27399n.size(); i2++) {
            f += CodedOutputStream.m35130d(4, (C10449o) this.f27399n.get(i2));
        }
        if ((this.f27393h & 32) == 32) {
            f += CodedOutputStream.m35130d(5, (C10449o) this.f27400o);
        }
        if ((this.f27393h & 128) == 128) {
            f += CodedOutputStream.m35130d(6, (C10449o) this.f27402q);
        }
        if ((this.f27393h & 256) == 256) {
            f += CodedOutputStream.m35133f(7, this.f27403r);
        }
        if ((this.f27393h & AdRequest.MAX_CONTENT_URL_LENGTH) == 512) {
            f += CodedOutputStream.m35133f(8, this.f27404s);
        }
        if ((this.f27393h & 16) == 16) {
            f += CodedOutputStream.m35133f(9, this.f27398m);
        }
        if ((this.f27393h & 64) == 64) {
            f += CodedOutputStream.m35133f(10, this.f27401p);
        }
        if ((this.f27393h & 1) == 1) {
            f += CodedOutputStream.m35133f(11, this.f27394i);
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.f27405t.size(); i4++) {
            i3 += CodedOutputStream.m35140l(this.f27405t.get(i4).intValue());
        }
        int size = f + i3 + (mo34962z().size() * 2) + mo35770j() + this.f27392g.size();
        this.f27407v = size;
        return size;
    }

    /* renamed from: g */
    public C10452q<C9930z> mo34363g() {
        return f27391x;
    }

    private C9930z(C10427h.C10430c<C9930z, ?> cVar) {
        super(cVar);
        this.f27406u = -1;
        this.f27407v = -1;
        this.f27392g = cVar.mo35762h();
    }

    /* renamed from: f */
    public C9932b m33206f() {
        return m33170M();
    }

    /* renamed from: c */
    public C9932b m33203c() {
        return m33183d(this);
    }

    /* renamed from: a */
    public C9811l0 mo34949a(int i) {
        return this.f27399n.get(i);
    }

    /* renamed from: b */
    public C9930z m33201b() {
        return f27390w;
    }

    private C9930z(boolean z) {
        this.f27406u = -1;
        this.f27407v = -1;
        this.f27392g = C10417d.f28215f;
    }

    /* renamed from: a */
    public void mo34358a(CodedOutputStream codedOutputStream) throws IOException {
        mo34361e();
        C10427h.C10431d<MessageType>.C0000a k = mo35771k();
        if ((this.f27393h & 2) == 2) {
            codedOutputStream.mo35635b(1, this.f27395j);
        }
        if ((this.f27393h & 4) == 4) {
            codedOutputStream.mo35635b(2, this.f27396k);
        }
        if ((this.f27393h & 8) == 8) {
            codedOutputStream.mo35636b(3, (C10449o) this.f27397l);
        }
        for (int i = 0; i < this.f27399n.size(); i++) {
            codedOutputStream.mo35636b(4, (C10449o) this.f27399n.get(i));
        }
        if ((this.f27393h & 32) == 32) {
            codedOutputStream.mo35636b(5, (C10449o) this.f27400o);
        }
        if ((this.f27393h & 128) == 128) {
            codedOutputStream.mo35636b(6, (C10449o) this.f27402q);
        }
        if ((this.f27393h & 256) == 256) {
            codedOutputStream.mo35635b(7, this.f27403r);
        }
        if ((this.f27393h & AdRequest.MAX_CONTENT_URL_LENGTH) == 512) {
            codedOutputStream.mo35635b(8, this.f27404s);
        }
        if ((this.f27393h & 16) == 16) {
            codedOutputStream.mo35635b(9, this.f27398m);
        }
        if ((this.f27393h & 64) == 64) {
            codedOutputStream.mo35635b(10, this.f27401p);
        }
        if ((this.f27393h & 1) == 1) {
            codedOutputStream.mo35635b(11, this.f27394i);
        }
        for (int i2 = 0; i2 < this.f27405t.size(); i2++) {
            codedOutputStream.mo35635b(31, this.f27405t.get(i2).intValue());
        }
        k.mo35772a(19000, codedOutputStream);
        codedOutputStream.mo35638b(this.f27392g);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: kotlin.h0.u.e.k0.d.g0$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: kotlin.h0.u.e.k0.d.g0$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: kotlin.h0.u.e.k0.d.p0$b} */
    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v16 */
    /* JADX WARNING: type inference failed for: r8v17 */
    /* JADX WARNING: type inference failed for: r8v18 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C9930z(kotlin.reflect.jvm.internal.impl.protobuf.C10420e r11, kotlin.reflect.jvm.internal.impl.protobuf.C10422f r12) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
        /*
            r10 = this;
            r10.<init>()
            r0 = -1
            r10.f27406u = r0
            r10.f27407v = r0
            r10.m33169L()
            kotlin.reflect.jvm.internal.impl.protobuf.d$b r0 = kotlin.reflect.jvm.internal.impl.protobuf.C10417d.m35229j()
            r1 = 1
            kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r2 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.m35116a((java.io.OutputStream) r0, (int) r1)
            r3 = 0
            r4 = 0
        L_0x0016:
            r5 = 2048(0x800, float:2.87E-42)
            r6 = 32
            if (r3 != 0) goto L_0x01b3
            int r7 = r11.mo35733x()     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            r8 = 0
            switch(r7) {
                case 0: goto L_0x016a;
                case 8: goto L_0x015c;
                case 16: goto L_0x014e;
                case 26: goto L_0x0125;
                case 34: goto L_0x010b;
                case 42: goto L_0x00e4;
                case 50: goto L_0x00bb;
                case 56: goto L_0x00ad;
                case 64: goto L_0x009f;
                case 72: goto L_0x0091;
                case 80: goto L_0x0084;
                case 88: goto L_0x0078;
                case 248: goto L_0x005d;
                case 250: goto L_0x002a;
                default: goto L_0x0024;
            }     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
        L_0x0024:
            boolean r5 = r10.mo35759a(r11, r2, r12, r7)     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            goto L_0x016d
        L_0x002a:
            int r7 = r11.mo35724o()     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            int r7 = r11.mo35710c(r7)     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            r8 = r4 & 2048(0x800, float:2.87E-42)
            if (r8 == r5) goto L_0x0045
            int r8 = r11.mo35701a()     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            if (r8 <= 0) goto L_0x0045
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            r8.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            r10.f27405t = r8     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            r4 = r4 | 2048(0x800, float:2.87E-42)
        L_0x0045:
            int r8 = r11.mo35701a()     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            if (r8 <= 0) goto L_0x0059
            java.util.List<java.lang.Integer> r8 = r10.f27405t     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            int r9 = r11.mo35719j()     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            r8.add(r9)     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            goto L_0x0045
        L_0x0059:
            r11.mo35708b(r7)     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            goto L_0x0016
        L_0x005d:
            r7 = r4 & 2048(0x800, float:2.87E-42)
            if (r7 == r5) goto L_0x006a
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            r7.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            r10.f27405t = r7     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            r4 = r4 | 2048(0x800, float:2.87E-42)
        L_0x006a:
            java.util.List<java.lang.Integer> r7 = r10.f27405t     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            int r8 = r11.mo35719j()     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            r7.add(r8)     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            goto L_0x0016
        L_0x0078:
            int r7 = r10.f27393h     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            r7 = r7 | r1
            r10.f27393h = r7     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            int r7 = r11.mo35719j()     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            r10.f27394i = r7     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            goto L_0x0016
        L_0x0084:
            int r7 = r10.f27393h     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            r7 = r7 | 64
            r10.f27393h = r7     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            int r7 = r11.mo35719j()     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            r10.f27401p = r7     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            goto L_0x0016
        L_0x0091:
            int r7 = r10.f27393h     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            r7 = r7 | 16
            r10.f27393h = r7     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            int r7 = r11.mo35719j()     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            r10.f27398m = r7     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            goto L_0x0016
        L_0x009f:
            int r7 = r10.f27393h     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            r7 = r7 | 512(0x200, float:7.175E-43)
            r10.f27393h = r7     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            int r7 = r11.mo35719j()     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            r10.f27404s = r7     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            goto L_0x0016
        L_0x00ad:
            int r7 = r10.f27393h     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            r7 = r7 | 256(0x100, float:3.59E-43)
            r10.f27393h = r7     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            int r7 = r11.mo35719j()     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            r10.f27403r = r7     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            goto L_0x0016
        L_0x00bb:
            int r7 = r10.f27393h     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            r9 = 128(0x80, float:1.794E-43)
            r7 = r7 & r9
            if (r7 != r9) goto L_0x00c8
            kotlin.h0.u.e.k0.d.p0 r7 = r10.f27402q     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            kotlin.h0.u.e.k0.d.p0$b r8 = r7.m32468c()     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
        L_0x00c8:
            kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.h0.u.e.k0.d.p0> r7 = kotlin.p045h0.p046u.p047e.p048k0.p240d.C9831p0.f27069r     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            kotlin.reflect.jvm.internal.impl.protobuf.o r7 = r11.mo35702a(r7, (kotlin.reflect.jvm.internal.impl.protobuf.C10422f) r12)     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            kotlin.h0.u.e.k0.d.p0 r7 = (kotlin.p045h0.p046u.p047e.p048k0.p240d.C9831p0) r7     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            r10.f27402q = r7     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            if (r8 == 0) goto L_0x00dd
            r8.mo34717a((kotlin.p045h0.p046u.p047e.p048k0.p240d.C9831p0) r7)     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            kotlin.h0.u.e.k0.d.p0 r7 = r8.mo34502j()     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            r10.f27402q = r7     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
        L_0x00dd:
            int r7 = r10.f27393h     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            r7 = r7 | r9
            r10.f27393h = r7     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            goto L_0x0016
        L_0x00e4:
            int r7 = r10.f27393h     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            r7 = r7 & r6
            if (r7 != r6) goto L_0x00ef
            kotlin.h0.u.e.k0.d.g0 r7 = r10.f27400o     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            kotlin.h0.u.e.k0.d.g0$c r8 = r7.m31908c()     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
        L_0x00ef:
            kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.h0.u.e.k0.d.g0> r7 = kotlin.p045h0.p046u.p047e.p048k0.p240d.C9782g0.f26873z     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            kotlin.reflect.jvm.internal.impl.protobuf.o r7 = r11.mo35702a(r7, (kotlin.reflect.jvm.internal.impl.protobuf.C10422f) r12)     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            kotlin.h0.u.e.k0.d.g0 r7 = (kotlin.p045h0.p046u.p047e.p048k0.p240d.C9782g0) r7     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            r10.f27400o = r7     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            if (r8 == 0) goto L_0x0104
            r8.mo34379a((kotlin.p045h0.p046u.p047e.p048k0.p240d.C9782g0) r7)     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            kotlin.h0.u.e.k0.d.g0 r7 = r8.mo34502j()     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            r10.f27400o = r7     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
        L_0x0104:
            int r7 = r10.f27393h     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            r7 = r7 | r6
            r10.f27393h = r7     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            goto L_0x0016
        L_0x010b:
            r7 = r4 & 32
            if (r7 == r6) goto L_0x0118
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            r7.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            r10.f27399n = r7     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            r4 = r4 | 32
        L_0x0118:
            java.util.List<kotlin.h0.u.e.k0.d.l0> r7 = r10.f27399n     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.h0.u.e.k0.d.l0> r8 = kotlin.p045h0.p046u.p047e.p048k0.p240d.C9811l0.f26998s     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            kotlin.reflect.jvm.internal.impl.protobuf.o r8 = r11.mo35702a(r8, (kotlin.reflect.jvm.internal.impl.protobuf.C10422f) r12)     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            r7.add(r8)     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            goto L_0x0016
        L_0x0125:
            int r7 = r10.f27393h     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            r9 = 8
            r7 = r7 & r9
            if (r7 != r9) goto L_0x0132
            kotlin.h0.u.e.k0.d.g0 r7 = r10.f27397l     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            kotlin.h0.u.e.k0.d.g0$c r8 = r7.m31908c()     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
        L_0x0132:
            kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.h0.u.e.k0.d.g0> r7 = kotlin.p045h0.p046u.p047e.p048k0.p240d.C9782g0.f26873z     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            kotlin.reflect.jvm.internal.impl.protobuf.o r7 = r11.mo35702a(r7, (kotlin.reflect.jvm.internal.impl.protobuf.C10422f) r12)     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            kotlin.h0.u.e.k0.d.g0 r7 = (kotlin.p045h0.p046u.p047e.p048k0.p240d.C9782g0) r7     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            r10.f27397l = r7     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            if (r8 == 0) goto L_0x0147
            r8.mo34379a((kotlin.p045h0.p046u.p047e.p048k0.p240d.C9782g0) r7)     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            kotlin.h0.u.e.k0.d.g0 r7 = r8.mo34502j()     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            r10.f27397l = r7     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
        L_0x0147:
            int r7 = r10.f27393h     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            r7 = r7 | r9
            r10.f27393h = r7     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            goto L_0x0016
        L_0x014e:
            int r7 = r10.f27393h     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            r7 = r7 | 4
            r10.f27393h = r7     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            int r7 = r11.mo35719j()     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            r10.f27396k = r7     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            goto L_0x0016
        L_0x015c:
            int r7 = r10.f27393h     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            r7 = r7 | 2
            r10.f27393h = r7     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            int r7 = r11.mo35719j()     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            r10.f27395j = r7     // Catch:{ InvalidProtocolBufferException -> 0x0180, IOException -> 0x0172 }
            goto L_0x0016
        L_0x016a:
            r3 = 1
            goto L_0x0016
        L_0x016d:
            if (r5 != 0) goto L_0x0016
            goto L_0x016a
        L_0x0170:
            r11 = move-exception
            goto L_0x0185
        L_0x0172:
            r11 = move-exception
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r12 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException     // Catch:{ all -> 0x0170 }
            java.lang.String r11 = r11.getMessage()     // Catch:{ all -> 0x0170 }
            r12.<init>(r11)     // Catch:{ all -> 0x0170 }
            r12.mo35656a(r10)     // Catch:{ all -> 0x0170 }
            throw r12     // Catch:{ all -> 0x0170 }
        L_0x0180:
            r11 = move-exception
            r11.mo35656a(r10)     // Catch:{ all -> 0x0170 }
            throw r11     // Catch:{ all -> 0x0170 }
        L_0x0185:
            r12 = r4 & 32
            if (r12 != r6) goto L_0x0191
            java.util.List<kotlin.h0.u.e.k0.d.l0> r12 = r10.f27399n
            java.util.List r12 = java.util.Collections.unmodifiableList(r12)
            r10.f27399n = r12
        L_0x0191:
            r12 = r4 & 2048(0x800, float:2.87E-42)
            if (r12 != r5) goto L_0x019d
            java.util.List<java.lang.Integer> r12 = r10.f27405t
            java.util.List r12 = java.util.Collections.unmodifiableList(r12)
            r10.f27405t = r12
        L_0x019d:
            r2.mo35614a()     // Catch:{ IOException -> 0x01a0, all -> 0x01a7 }
        L_0x01a0:
            kotlin.reflect.jvm.internal.impl.protobuf.d r12 = r0.mo35696a()
            r10.f27392g = r12
            goto L_0x01af
        L_0x01a7:
            r11 = move-exception
            kotlin.reflect.jvm.internal.impl.protobuf.d r12 = r0.mo35696a()
            r10.f27392g = r12
            throw r11
        L_0x01af:
            r10.mo35760h()
            throw r11
        L_0x01b3:
            r11 = r4 & 32
            if (r11 != r6) goto L_0x01bf
            java.util.List<kotlin.h0.u.e.k0.d.l0> r11 = r10.f27399n
            java.util.List r11 = java.util.Collections.unmodifiableList(r11)
            r10.f27399n = r11
        L_0x01bf:
            r11 = r4 & 2048(0x800, float:2.87E-42)
            if (r11 != r5) goto L_0x01cb
            java.util.List<java.lang.Integer> r11 = r10.f27405t
            java.util.List r11 = java.util.Collections.unmodifiableList(r11)
            r10.f27405t = r11
        L_0x01cb:
            r2.mo35614a()     // Catch:{ IOException -> 0x01ce, all -> 0x01d5 }
        L_0x01ce:
            kotlin.reflect.jvm.internal.impl.protobuf.d r11 = r0.mo35696a()
            r10.f27392g = r11
            goto L_0x01dd
        L_0x01d5:
            r11 = move-exception
            kotlin.reflect.jvm.internal.impl.protobuf.d r12 = r0.mo35696a()
            r10.f27392g = r12
            throw r11
        L_0x01dd:
            r10.mo35760h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p045h0.p046u.p047e.p048k0.p240d.C9930z.<init>(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):void");
    }
}
