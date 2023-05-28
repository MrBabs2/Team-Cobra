package kotlin.p045h0.p046u.p047e.p048k0.p240d;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.AdRequest;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9798j;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.C9821n0;
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

/* renamed from: kotlin.h0.u.e.k0.d.r */
/* compiled from: ProtoBuf */
public final class C9836r extends C10427h.C10431d<C9836r> implements C9846s {

    /* renamed from: w */
    private static final C9836r f27087w;

    /* renamed from: x */
    public static C10452q<C9836r> f27088x = new C9837a();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C10417d f27089g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f27090h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f27091i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public int f27092j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public int f27093k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C9782g0 f27094l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public int f27095m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public List<C9811l0> f27096n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C9782g0 f27097o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public int f27098p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public List<C9831p0> f27099q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public C9821n0 f27100r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public List<Integer> f27101s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public C9798j f27102t;

    /* renamed from: u */
    private byte f27103u;

    /* renamed from: v */
    private int f27104v;

    /* renamed from: kotlin.h0.u.e.k0.d.r$a */
    /* compiled from: ProtoBuf */
    static class C9837a extends C10413b<C9836r> {
        C9837a() {
        }

        /* renamed from: a */
        public C9836r m32569a(C10420e eVar, C10422f fVar) throws InvalidProtocolBufferException {
            return new C9836r(eVar, fVar);
        }
    }

    static {
        C9836r rVar = new C9836r(true);
        f27087w = rVar;
        rVar.m32513L();
    }

    /* renamed from: K */
    public static C9836r m32512K() {
        return f27087w;
    }

    /* renamed from: L */
    private void m32513L() {
        this.f27091i = 6;
        this.f27092j = 6;
        this.f27093k = 0;
        this.f27094l = C9782g0.m31867P();
        this.f27095m = 0;
        this.f27096n = Collections.emptyList();
        this.f27097o = C9782g0.m31867P();
        this.f27098p = 0;
        this.f27099q = Collections.emptyList();
        this.f27100r = C9821n0.m32344m();
        this.f27101s = Collections.emptyList();
        this.f27102t = C9798j.m32145j();
    }

    /* renamed from: M */
    public static C9838b m32514M() {
        return C9838b.m32570A();
    }

    /* renamed from: A */
    public List<Integer> mo34726A() {
        return this.f27101s;
    }

    /* renamed from: B */
    public boolean mo34727B() {
        return (this.f27090h & 256) == 256;
    }

    /* renamed from: C */
    public boolean mo34728C() {
        return (this.f27090h & 1) == 1;
    }

    /* renamed from: D */
    public boolean mo34729D() {
        return (this.f27090h & 4) == 4;
    }

    /* renamed from: E */
    public boolean mo34730E() {
        return (this.f27090h & 2) == 2;
    }

    /* renamed from: F */
    public boolean mo34731F() {
        return (this.f27090h & 32) == 32;
    }

    /* renamed from: G */
    public boolean mo34732G() {
        return (this.f27090h & 64) == 64;
    }

    /* renamed from: H */
    public boolean mo34733H() {
        return (this.f27090h & 8) == 8;
    }

    /* renamed from: I */
    public boolean mo34734I() {
        return (this.f27090h & 16) == 16;
    }

    /* renamed from: J */
    public boolean mo34735J() {
        return (this.f27090h & 128) == 128;
    }

    /* renamed from: g */
    public C10452q<C9836r> mo34363g() {
        return f27088x;
    }

    public final boolean isInitialized() {
        byte b = this.f27103u;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!mo34729D()) {
            this.f27103u = 0;
            return false;
        } else if (!mo34733H() || mo34744r().isInitialized()) {
            for (int i = 0; i < mo34746t(); i++) {
                if (!mo34736a(i).isInitialized()) {
                    this.f27103u = 0;
                    return false;
                }
            }
            if (!mo34731F() || mo34742p().isInitialized()) {
                for (int i2 = 0; i2 < mo34749w(); i2++) {
                    if (!mo34737b(i2).isInitialized()) {
                        this.f27103u = 0;
                        return false;
                    }
                }
                if (mo34735J() && !mo34748v().isInitialized()) {
                    this.f27103u = 0;
                    return false;
                } else if (mo34727B() && !mo34738l().isInitialized()) {
                    this.f27103u = 0;
                    return false;
                } else if (!mo35769i()) {
                    this.f27103u = 0;
                    return false;
                } else {
                    this.f27103u = 1;
                    return true;
                }
            } else {
                this.f27103u = 0;
                return false;
            }
        } else {
            this.f27103u = 0;
            return false;
        }
    }

    /* renamed from: l */
    public C9798j mo34738l() {
        return this.f27102t;
    }

    /* renamed from: m */
    public int mo34739m() {
        return this.f27091i;
    }

    /* renamed from: n */
    public int mo34740n() {
        return this.f27093k;
    }

    /* renamed from: o */
    public int mo34741o() {
        return this.f27092j;
    }

    /* renamed from: p */
    public C9782g0 mo34742p() {
        return this.f27097o;
    }

    /* renamed from: q */
    public int mo34743q() {
        return this.f27098p;
    }

    /* renamed from: r */
    public C9782g0 mo34744r() {
        return this.f27094l;
    }

    /* renamed from: s */
    public int mo34745s() {
        return this.f27095m;
    }

    /* renamed from: t */
    public int mo34746t() {
        return this.f27096n.size();
    }

    /* renamed from: u */
    public List<C9811l0> mo34747u() {
        return this.f27096n;
    }

    /* renamed from: v */
    public C9821n0 mo34748v() {
        return this.f27100r;
    }

    /* renamed from: w */
    public int mo34749w() {
        return this.f27099q.size();
    }

    /* renamed from: z */
    public List<C9831p0> mo34750z() {
        return this.f27099q;
    }

    /* renamed from: kotlin.h0.u.e.k0.d.r$b */
    /* compiled from: ProtoBuf */
    public static final class C9838b extends C10427h.C10430c<C9836r, C9838b> implements C9846s {

        /* renamed from: i */
        private int f27105i;

        /* renamed from: j */
        private int f27106j = 6;

        /* renamed from: k */
        private int f27107k = 6;

        /* renamed from: l */
        private int f27108l;

        /* renamed from: m */
        private C9782g0 f27109m = C9782g0.m31867P();

        /* renamed from: n */
        private int f27110n;

        /* renamed from: o */
        private List<C9811l0> f27111o = Collections.emptyList();

        /* renamed from: p */
        private C9782g0 f27112p = C9782g0.m31867P();

        /* renamed from: q */
        private int f27113q;

        /* renamed from: r */
        private List<C9831p0> f27114r = Collections.emptyList();

        /* renamed from: s */
        private C9821n0 f27115s = C9821n0.m32344m();

        /* renamed from: t */
        private List<Integer> f27116t = Collections.emptyList();

        /* renamed from: u */
        private C9798j f27117u = C9798j.m32145j();

        private C9838b() {
            m32574F();
        }

        /* access modifiers changed from: private */
        /* renamed from: A */
        public static C9838b m32570A() {
            return new C9838b();
        }

        /* renamed from: B */
        private void m32571B() {
            if ((this.f27105i & 32) != 32) {
                this.f27111o = new ArrayList(this.f27111o);
                this.f27105i |= 32;
            }
        }

        /* renamed from: C */
        private void m32572C() {
            if ((this.f27105i & 256) != 256) {
                this.f27114r = new ArrayList(this.f27114r);
                this.f27105i |= 256;
            }
        }

        /* renamed from: E */
        private void m32573E() {
            if ((this.f27105i & 1024) != 1024) {
                this.f27116t = new ArrayList(this.f27116t);
                this.f27105i |= 1024;
            }
        }

        /* renamed from: F */
        private void m32574F() {
        }

        /* renamed from: c */
        public C9838b mo34758c(int i) {
            this.f27105i |= 1;
            this.f27106j = i;
            return this;
        }

        /* renamed from: d */
        public C9838b mo34759d(int i) {
            this.f27105i |= 4;
            this.f27108l = i;
            return this;
        }

        /* renamed from: e */
        public C9838b mo34760e(int i) {
            this.f27105i |= 2;
            this.f27107k = i;
            return this;
        }

        /* renamed from: f */
        public C9838b mo34761f(int i) {
            this.f27105i |= 128;
            this.f27113q = i;
            return this;
        }

        /* renamed from: g */
        public C9838b mo34762g(int i) {
            this.f27105i |= 16;
            this.f27110n = i;
            return this;
        }

        public final boolean isInitialized() {
            if (!mo34769u()) {
                return false;
            }
            if (mo34771x() && !mo34764m().isInitialized()) {
                return false;
            }
            for (int i = 0; i < mo34765n(); i++) {
                if (!mo34751a(i).isInitialized()) {
                    return false;
                }
            }
            if (mo34770w() && !mo34763l().isInitialized()) {
                return false;
            }
            for (int i2 = 0; i2 < mo34767r(); i2++) {
                if (!mo34756b(i2).isInitialized()) {
                    return false;
                }
            }
            if (mo34772y() && !mo34766q().isInitialized()) {
                return false;
            }
            if ((!mo34768s() || mo34503k().isInitialized()) && mo35764i()) {
                return true;
            }
            return false;
        }

        /* renamed from: j */
        public C9836r mo34502j() {
            C9836r rVar = new C9836r((C10427h.C10430c) this);
            int i = this.f27105i;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            int unused = rVar.f27091i = this.f27106j;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            int unused2 = rVar.f27092j = this.f27107k;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            int unused3 = rVar.f27093k = this.f27108l;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            C9782g0 unused4 = rVar.f27094l = this.f27109m;
            if ((i & 16) == 16) {
                i2 |= 16;
            }
            int unused5 = rVar.f27095m = this.f27110n;
            if ((this.f27105i & 32) == 32) {
                this.f27111o = Collections.unmodifiableList(this.f27111o);
                this.f27105i &= -33;
            }
            List unused6 = rVar.f27096n = this.f27111o;
            if ((i & 64) == 64) {
                i2 |= 32;
            }
            C9782g0 unused7 = rVar.f27097o = this.f27112p;
            if ((i & 128) == 128) {
                i2 |= 64;
            }
            int unused8 = rVar.f27098p = this.f27113q;
            if ((this.f27105i & 256) == 256) {
                this.f27114r = Collections.unmodifiableList(this.f27114r);
                this.f27105i &= -257;
            }
            List unused9 = rVar.f27099q = this.f27114r;
            if ((i & AdRequest.MAX_CONTENT_URL_LENGTH) == 512) {
                i2 |= 128;
            }
            C9821n0 unused10 = rVar.f27100r = this.f27115s;
            if ((this.f27105i & 1024) == 1024) {
                this.f27116t = Collections.unmodifiableList(this.f27116t);
                this.f27105i &= -1025;
            }
            List unused11 = rVar.f27101s = this.f27116t;
            if ((i & RecyclerView.C0638l.FLAG_MOVED) == 2048) {
                i2 |= 256;
            }
            C9798j unused12 = rVar.f27102t = this.f27117u;
            int unused13 = rVar.f27090h = i2;
            return rVar;
        }

        /* renamed from: k */
        public C9798j mo34503k() {
            return this.f27117u;
        }

        /* renamed from: l */
        public C9782g0 mo34763l() {
            return this.f27112p;
        }

        /* renamed from: m */
        public C9782g0 mo34764m() {
            return this.f27109m;
        }

        /* renamed from: n */
        public int mo34765n() {
            return this.f27111o.size();
        }

        /* renamed from: q */
        public C9821n0 mo34766q() {
            return this.f27115s;
        }

        /* renamed from: r */
        public int mo34767r() {
            return this.f27114r.size();
        }

        /* renamed from: s */
        public boolean mo34768s() {
            return (this.f27105i & RecyclerView.C0638l.FLAG_MOVED) == 2048;
        }

        /* renamed from: u */
        public boolean mo34769u() {
            return (this.f27105i & 4) == 4;
        }

        /* renamed from: w */
        public boolean mo34770w() {
            return (this.f27105i & 64) == 64;
        }

        /* renamed from: x */
        public boolean mo34771x() {
            return (this.f27105i & 8) == 8;
        }

        /* renamed from: y */
        public boolean mo34772y() {
            return (this.f27105i & AdRequest.MAX_CONTENT_URL_LENGTH) == 512;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ C10427h.C10429b mo34379a(C10427h hVar) {
            mo34755a((C9836r) hVar);
            return this;
        }

        /* renamed from: b */
        public C9836r m32591b() {
            return C9836r.m32512K();
        }

        public C9838b clone() {
            C9838b A = m32570A();
            A.mo34755a(mo34502j());
            return A;
        }

        /* renamed from: b */
        public C9838b mo34757b(C9782g0 g0Var) {
            if ((this.f27105i & 8) != 8 || this.f27109m == C9782g0.m31867P()) {
                this.f27109m = g0Var;
            } else {
                this.f27109m = C9782g0.m31879c(this.f27109m).mo34379a(g0Var).mo34502j();
            }
            this.f27105i |= 8;
            return this;
        }

        /* renamed from: a */
        public C9836r m32586a() {
            C9836r j = mo34502j();
            if (j.isInitialized()) {
                return j;
            }
            throw C10410a.C10411a.m35207a(j);
        }

        /* renamed from: a */
        public C9838b mo34755a(C9836r rVar) {
            if (rVar == C9836r.m32512K()) {
                return this;
            }
            if (rVar.mo34728C()) {
                mo34758c(rVar.mo34739m());
            }
            if (rVar.mo34730E()) {
                mo34760e(rVar.mo34741o());
            }
            if (rVar.mo34729D()) {
                mo34759d(rVar.mo34740n());
            }
            if (rVar.mo34733H()) {
                mo34757b(rVar.mo34744r());
            }
            if (rVar.mo34734I()) {
                mo34762g(rVar.mo34745s());
            }
            if (!rVar.f27096n.isEmpty()) {
                if (this.f27111o.isEmpty()) {
                    this.f27111o = rVar.f27096n;
                    this.f27105i &= -33;
                } else {
                    m32571B();
                    this.f27111o.addAll(rVar.f27096n);
                }
            }
            if (rVar.mo34731F()) {
                mo34752a(rVar.mo34742p());
            }
            if (rVar.mo34732G()) {
                mo34761f(rVar.mo34743q());
            }
            if (!rVar.f27099q.isEmpty()) {
                if (this.f27114r.isEmpty()) {
                    this.f27114r = rVar.f27099q;
                    this.f27105i &= -257;
                } else {
                    m32572C();
                    this.f27114r.addAll(rVar.f27099q);
                }
            }
            if (rVar.mo34735J()) {
                mo34754a(rVar.mo34748v());
            }
            if (!rVar.f27101s.isEmpty()) {
                if (this.f27116t.isEmpty()) {
                    this.f27116t = rVar.f27101s;
                    this.f27105i &= -1025;
                } else {
                    m32573E();
                    this.f27116t.addAll(rVar.f27101s);
                }
            }
            if (rVar.mo34727B()) {
                mo34753a(rVar.mo34738l());
            }
            mo35763a(rVar);
            mo35761a(mo35762h().mo35686b(rVar.f27089g));
            return this;
        }

        /* renamed from: b */
        public C9831p0 mo34756b(int i) {
            return this.f27114r.get(i);
        }

        /* renamed from: a */
        public C9838b mo34377a(C10420e eVar, C10422f fVar) throws IOException {
            C9836r rVar;
            C9836r rVar2 = null;
            try {
                C9836r a = C9836r.f27088x.mo34369a(eVar, fVar);
                if (a != null) {
                    mo34755a(a);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                rVar = (C9836r) e.mo35657a();
                throw e;
            } catch (Throwable th) {
                th = th;
                rVar2 = rVar;
            }
            if (rVar2 != null) {
                mo34755a(rVar2);
            }
            throw th;
        }

        /* renamed from: a */
        public C9811l0 mo34751a(int i) {
            return this.f27111o.get(i);
        }

        /* renamed from: a */
        public C9838b mo34752a(C9782g0 g0Var) {
            if ((this.f27105i & 64) != 64 || this.f27112p == C9782g0.m31867P()) {
                this.f27112p = g0Var;
            } else {
                this.f27112p = C9782g0.m31879c(this.f27112p).mo34379a(g0Var).mo34502j();
            }
            this.f27105i |= 64;
            return this;
        }

        /* renamed from: a */
        public C9838b mo34754a(C9821n0 n0Var) {
            if ((this.f27105i & AdRequest.MAX_CONTENT_URL_LENGTH) != 512 || this.f27115s == C9821n0.m32344m()) {
                this.f27115s = n0Var;
            } else {
                C9821n0.C9823b c = C9821n0.m32343c(this.f27115s);
                c.mo34672a(n0Var);
                this.f27115s = c.mo34674i();
            }
            this.f27105i |= AdRequest.MAX_CONTENT_URL_LENGTH;
            return this;
        }

        /* renamed from: a */
        public C9838b mo34753a(C9798j jVar) {
            if ((this.f27105i & RecyclerView.C0638l.FLAG_MOVED) != 2048 || this.f27117u == C9798j.m32145j()) {
                this.f27117u = jVar;
            } else {
                C9798j.C9800b c = C9798j.m32144c(this.f27117u);
                c.mo34621a(jVar);
                this.f27117u = c.mo34623i();
            }
            this.f27105i |= RecyclerView.C0638l.FLAG_MOVED;
            return this;
        }
    }

    /* renamed from: e */
    public int mo34361e() {
        int i = this.f27104v;
        if (i != -1) {
            return i;
        }
        int f = (this.f27090h & 2) == 2 ? CodedOutputStream.m35133f(1, this.f27092j) + 0 : 0;
        if ((this.f27090h & 4) == 4) {
            f += CodedOutputStream.m35133f(2, this.f27093k);
        }
        if ((this.f27090h & 8) == 8) {
            f += CodedOutputStream.m35130d(3, (C10449o) this.f27094l);
        }
        for (int i2 = 0; i2 < this.f27096n.size(); i2++) {
            f += CodedOutputStream.m35130d(4, (C10449o) this.f27096n.get(i2));
        }
        if ((this.f27090h & 32) == 32) {
            f += CodedOutputStream.m35130d(5, (C10449o) this.f27097o);
        }
        for (int i3 = 0; i3 < this.f27099q.size(); i3++) {
            f += CodedOutputStream.m35130d(6, (C10449o) this.f27099q.get(i3));
        }
        if ((this.f27090h & 16) == 16) {
            f += CodedOutputStream.m35133f(7, this.f27095m);
        }
        if ((this.f27090h & 64) == 64) {
            f += CodedOutputStream.m35133f(8, this.f27098p);
        }
        if ((this.f27090h & 1) == 1) {
            f += CodedOutputStream.m35133f(9, this.f27091i);
        }
        if ((this.f27090h & 128) == 128) {
            f += CodedOutputStream.m35130d(30, (C10449o) this.f27100r);
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.f27101s.size(); i5++) {
            i4 += CodedOutputStream.m35140l(this.f27101s.get(i5).intValue());
        }
        int size = f + i4 + (mo34726A().size() * 2);
        if ((this.f27090h & 256) == 256) {
            size += CodedOutputStream.m35130d(32, (C10449o) this.f27102t);
        }
        int j = size + mo35770j() + this.f27089g.size();
        this.f27104v = j;
        return j;
    }

    private C9836r(C10427h.C10430c<C9836r, ?> cVar) {
        super(cVar);
        this.f27103u = -1;
        this.f27104v = -1;
        this.f27089g = cVar.mo35762h();
    }

    /* renamed from: f */
    public C9838b m32553f() {
        return m32514M();
    }

    /* renamed from: c */
    public C9838b m32550c() {
        return m32532e(this);
    }

    /* renamed from: b */
    public C9836r m32548b() {
        return f27087w;
    }

    private C9836r(boolean z) {
        this.f27103u = -1;
        this.f27104v = -1;
        this.f27089g = C10417d.f28215f;
    }

    /* renamed from: a */
    public C9811l0 mo34736a(int i) {
        return this.f27096n.get(i);
    }

    /* renamed from: b */
    public C9831p0 mo34737b(int i) {
        return this.f27099q.get(i);
    }

    /* renamed from: a */
    public void mo34358a(CodedOutputStream codedOutputStream) throws IOException {
        mo34361e();
        C10427h.C10431d<MessageType>.C0000a k = mo35771k();
        if ((this.f27090h & 2) == 2) {
            codedOutputStream.mo35635b(1, this.f27092j);
        }
        if ((this.f27090h & 4) == 4) {
            codedOutputStream.mo35635b(2, this.f27093k);
        }
        if ((this.f27090h & 8) == 8) {
            codedOutputStream.mo35636b(3, (C10449o) this.f27094l);
        }
        for (int i = 0; i < this.f27096n.size(); i++) {
            codedOutputStream.mo35636b(4, (C10449o) this.f27096n.get(i));
        }
        if ((this.f27090h & 32) == 32) {
            codedOutputStream.mo35636b(5, (C10449o) this.f27097o);
        }
        for (int i2 = 0; i2 < this.f27099q.size(); i2++) {
            codedOutputStream.mo35636b(6, (C10449o) this.f27099q.get(i2));
        }
        if ((this.f27090h & 16) == 16) {
            codedOutputStream.mo35635b(7, this.f27095m);
        }
        if ((this.f27090h & 64) == 64) {
            codedOutputStream.mo35635b(8, this.f27098p);
        }
        if ((this.f27090h & 1) == 1) {
            codedOutputStream.mo35635b(9, this.f27091i);
        }
        if ((this.f27090h & 128) == 128) {
            codedOutputStream.mo35636b(30, (C10449o) this.f27100r);
        }
        for (int i3 = 0; i3 < this.f27101s.size(); i3++) {
            codedOutputStream.mo35635b(31, this.f27101s.get(i3).intValue());
        }
        if ((this.f27090h & 256) == 256) {
            codedOutputStream.mo35636b(32, (C10449o) this.f27102t);
        }
        k.mo35772a(19000, codedOutputStream);
        codedOutputStream.mo35638b(this.f27089g);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: kotlin.h0.u.e.k0.d.g0$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: kotlin.h0.u.e.k0.d.g0$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: kotlin.h0.u.e.k0.d.n0$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v18, resolved type: kotlin.h0.u.e.k0.d.j$b} */
    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v20 */
    /* JADX WARNING: type inference failed for: r9v21 */
    /* JADX WARNING: type inference failed for: r9v22 */
    /* JADX WARNING: type inference failed for: r9v23 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C9836r(kotlin.reflect.jvm.internal.impl.protobuf.C10420e r12, kotlin.reflect.jvm.internal.impl.protobuf.C10422f r13) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
        /*
            r11 = this;
            r11.<init>()
            r0 = -1
            r11.f27103u = r0
            r11.f27104v = r0
            r11.m32513L()
            kotlin.reflect.jvm.internal.impl.protobuf.d$b r0 = kotlin.reflect.jvm.internal.impl.protobuf.C10417d.m35229j()
            r1 = 1
            kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r2 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.m35116a((java.io.OutputStream) r0, (int) r1)
            r3 = 0
            r4 = 0
        L_0x0016:
            r5 = 1024(0x400, float:1.435E-42)
            r6 = 256(0x100, float:3.59E-43)
            r7 = 32
            if (r3 != 0) goto L_0x01e8
            int r8 = r12.mo35733x()     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            r9 = 0
            switch(r8) {
                case 0: goto L_0x0193;
                case 8: goto L_0x0185;
                case 16: goto L_0x0177;
                case 26: goto L_0x014e;
                case 34: goto L_0x0134;
                case 42: goto L_0x010d;
                case 50: goto L_0x00f3;
                case 56: goto L_0x00e5;
                case 64: goto L_0x00d7;
                case 72: goto L_0x00ca;
                case 242: goto L_0x00a1;
                case 248: goto L_0x0085;
                case 250: goto L_0x0052;
                case 258: goto L_0x002c;
                default: goto L_0x0026;
            }     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
        L_0x0026:
            boolean r5 = r11.mo35759a(r12, r2, r13, r8)     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            goto L_0x0196
        L_0x002c:
            int r8 = r11.f27090h     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            r8 = r8 & r6
            if (r8 != r6) goto L_0x0037
            kotlin.h0.u.e.k0.d.j r8 = r11.f27102t     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            kotlin.h0.u.e.k0.d.j$b r9 = r8.m32153c()     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
        L_0x0037:
            kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.h0.u.e.k0.d.j> r8 = kotlin.p045h0.p046u.p047e.p048k0.p240d.C9798j.f26965k     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            kotlin.reflect.jvm.internal.impl.protobuf.o r8 = r12.mo35702a(r8, (kotlin.reflect.jvm.internal.impl.protobuf.C10422f) r13)     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            kotlin.h0.u.e.k0.d.j r8 = (kotlin.p045h0.p046u.p047e.p048k0.p240d.C9798j) r8     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            r11.f27102t = r8     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            if (r9 == 0) goto L_0x004c
            r9.mo34621a((kotlin.p045h0.p046u.p047e.p048k0.p240d.C9798j) r8)     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            kotlin.h0.u.e.k0.d.j r8 = r9.mo34623i()     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            r11.f27102t = r8     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
        L_0x004c:
            int r8 = r11.f27090h     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            r8 = r8 | r6
            r11.f27090h = r8     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            goto L_0x0016
        L_0x0052:
            int r8 = r12.mo35724o()     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            int r8 = r12.mo35710c(r8)     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            r9 = r4 & 1024(0x400, float:1.435E-42)
            if (r9 == r5) goto L_0x006d
            int r9 = r12.mo35701a()     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            if (r9 <= 0) goto L_0x006d
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            r9.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            r11.f27101s = r9     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            r4 = r4 | 1024(0x400, float:1.435E-42)
        L_0x006d:
            int r9 = r12.mo35701a()     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            if (r9 <= 0) goto L_0x0081
            java.util.List<java.lang.Integer> r9 = r11.f27101s     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            int r10 = r12.mo35719j()     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            r9.add(r10)     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            goto L_0x006d
        L_0x0081:
            r12.mo35708b(r8)     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            goto L_0x0016
        L_0x0085:
            r8 = r4 & 1024(0x400, float:1.435E-42)
            if (r8 == r5) goto L_0x0092
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            r8.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            r11.f27101s = r8     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            r4 = r4 | 1024(0x400, float:1.435E-42)
        L_0x0092:
            java.util.List<java.lang.Integer> r8 = r11.f27101s     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            int r9 = r12.mo35719j()     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            r8.add(r9)     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            goto L_0x0016
        L_0x00a1:
            int r8 = r11.f27090h     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            r10 = 128(0x80, float:1.794E-43)
            r8 = r8 & r10
            if (r8 != r10) goto L_0x00ae
            kotlin.h0.u.e.k0.d.n0 r8 = r11.f27100r     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            kotlin.h0.u.e.k0.d.n0$b r9 = r8.m32352c()     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
        L_0x00ae:
            kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.h0.u.e.k0.d.n0> r8 = kotlin.p045h0.p046u.p047e.p048k0.p240d.C9821n0.f27032m     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            kotlin.reflect.jvm.internal.impl.protobuf.o r8 = r12.mo35702a(r8, (kotlin.reflect.jvm.internal.impl.protobuf.C10422f) r13)     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            kotlin.h0.u.e.k0.d.n0 r8 = (kotlin.p045h0.p046u.p047e.p048k0.p240d.C9821n0) r8     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            r11.f27100r = r8     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            if (r9 == 0) goto L_0x00c3
            r9.mo34672a((kotlin.p045h0.p046u.p047e.p048k0.p240d.C9821n0) r8)     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            kotlin.h0.u.e.k0.d.n0 r8 = r9.mo34674i()     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            r11.f27100r = r8     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
        L_0x00c3:
            int r8 = r11.f27090h     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            r8 = r8 | r10
            r11.f27090h = r8     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            goto L_0x0016
        L_0x00ca:
            int r8 = r11.f27090h     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            r8 = r8 | r1
            r11.f27090h = r8     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            int r8 = r12.mo35719j()     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            r11.f27091i = r8     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            goto L_0x0016
        L_0x00d7:
            int r8 = r11.f27090h     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            r8 = r8 | 64
            r11.f27090h = r8     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            int r8 = r12.mo35719j()     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            r11.f27098p = r8     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            goto L_0x0016
        L_0x00e5:
            int r8 = r11.f27090h     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            r8 = r8 | 16
            r11.f27090h = r8     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            int r8 = r12.mo35719j()     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            r11.f27095m = r8     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            goto L_0x0016
        L_0x00f3:
            r8 = r4 & 256(0x100, float:3.59E-43)
            if (r8 == r6) goto L_0x0100
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            r8.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            r11.f27099q = r8     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            r4 = r4 | 256(0x100, float:3.59E-43)
        L_0x0100:
            java.util.List<kotlin.h0.u.e.k0.d.p0> r8 = r11.f27099q     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.h0.u.e.k0.d.p0> r9 = kotlin.p045h0.p046u.p047e.p048k0.p240d.C9831p0.f27069r     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            kotlin.reflect.jvm.internal.impl.protobuf.o r9 = r12.mo35702a(r9, (kotlin.reflect.jvm.internal.impl.protobuf.C10422f) r13)     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            r8.add(r9)     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            goto L_0x0016
        L_0x010d:
            int r8 = r11.f27090h     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            r8 = r8 & r7
            if (r8 != r7) goto L_0x0118
            kotlin.h0.u.e.k0.d.g0 r8 = r11.f27097o     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            kotlin.h0.u.e.k0.d.g0$c r9 = r8.m31908c()     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
        L_0x0118:
            kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.h0.u.e.k0.d.g0> r8 = kotlin.p045h0.p046u.p047e.p048k0.p240d.C9782g0.f26873z     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            kotlin.reflect.jvm.internal.impl.protobuf.o r8 = r12.mo35702a(r8, (kotlin.reflect.jvm.internal.impl.protobuf.C10422f) r13)     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            kotlin.h0.u.e.k0.d.g0 r8 = (kotlin.p045h0.p046u.p047e.p048k0.p240d.C9782g0) r8     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            r11.f27097o = r8     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            if (r9 == 0) goto L_0x012d
            r9.mo34379a((kotlin.p045h0.p046u.p047e.p048k0.p240d.C9782g0) r8)     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            kotlin.h0.u.e.k0.d.g0 r8 = r9.mo34502j()     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            r11.f27097o = r8     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
        L_0x012d:
            int r8 = r11.f27090h     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            r8 = r8 | r7
            r11.f27090h = r8     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            goto L_0x0016
        L_0x0134:
            r8 = r4 & 32
            if (r8 == r7) goto L_0x0141
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            r8.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            r11.f27096n = r8     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            r4 = r4 | 32
        L_0x0141:
            java.util.List<kotlin.h0.u.e.k0.d.l0> r8 = r11.f27096n     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.h0.u.e.k0.d.l0> r9 = kotlin.p045h0.p046u.p047e.p048k0.p240d.C9811l0.f26998s     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            kotlin.reflect.jvm.internal.impl.protobuf.o r9 = r12.mo35702a(r9, (kotlin.reflect.jvm.internal.impl.protobuf.C10422f) r13)     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            r8.add(r9)     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            goto L_0x0016
        L_0x014e:
            int r8 = r11.f27090h     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            r10 = 8
            r8 = r8 & r10
            if (r8 != r10) goto L_0x015b
            kotlin.h0.u.e.k0.d.g0 r8 = r11.f27094l     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            kotlin.h0.u.e.k0.d.g0$c r9 = r8.m31908c()     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
        L_0x015b:
            kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.h0.u.e.k0.d.g0> r8 = kotlin.p045h0.p046u.p047e.p048k0.p240d.C9782g0.f26873z     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            kotlin.reflect.jvm.internal.impl.protobuf.o r8 = r12.mo35702a(r8, (kotlin.reflect.jvm.internal.impl.protobuf.C10422f) r13)     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            kotlin.h0.u.e.k0.d.g0 r8 = (kotlin.p045h0.p046u.p047e.p048k0.p240d.C9782g0) r8     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            r11.f27094l = r8     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            if (r9 == 0) goto L_0x0170
            r9.mo34379a((kotlin.p045h0.p046u.p047e.p048k0.p240d.C9782g0) r8)     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            kotlin.h0.u.e.k0.d.g0 r8 = r9.mo34502j()     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            r11.f27094l = r8     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
        L_0x0170:
            int r8 = r11.f27090h     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            r8 = r8 | r10
            r11.f27090h = r8     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            goto L_0x0016
        L_0x0177:
            int r8 = r11.f27090h     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            r8 = r8 | 4
            r11.f27090h = r8     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            int r8 = r12.mo35719j()     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            r11.f27093k = r8     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            goto L_0x0016
        L_0x0185:
            int r8 = r11.f27090h     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            r8 = r8 | 2
            r11.f27090h = r8     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            int r8 = r12.mo35719j()     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            r11.f27092j = r8     // Catch:{ InvalidProtocolBufferException -> 0x01a9, IOException -> 0x019b }
            goto L_0x0016
        L_0x0193:
            r3 = 1
            goto L_0x0016
        L_0x0196:
            if (r5 != 0) goto L_0x0016
            goto L_0x0193
        L_0x0199:
            r12 = move-exception
            goto L_0x01ae
        L_0x019b:
            r12 = move-exception
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r13 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException     // Catch:{ all -> 0x0199 }
            java.lang.String r12 = r12.getMessage()     // Catch:{ all -> 0x0199 }
            r13.<init>(r12)     // Catch:{ all -> 0x0199 }
            r13.mo35656a(r11)     // Catch:{ all -> 0x0199 }
            throw r13     // Catch:{ all -> 0x0199 }
        L_0x01a9:
            r12 = move-exception
            r12.mo35656a(r11)     // Catch:{ all -> 0x0199 }
            throw r12     // Catch:{ all -> 0x0199 }
        L_0x01ae:
            r13 = r4 & 32
            if (r13 != r7) goto L_0x01ba
            java.util.List<kotlin.h0.u.e.k0.d.l0> r13 = r11.f27096n
            java.util.List r13 = java.util.Collections.unmodifiableList(r13)
            r11.f27096n = r13
        L_0x01ba:
            r13 = r4 & 256(0x100, float:3.59E-43)
            if (r13 != r6) goto L_0x01c6
            java.util.List<kotlin.h0.u.e.k0.d.p0> r13 = r11.f27099q
            java.util.List r13 = java.util.Collections.unmodifiableList(r13)
            r11.f27099q = r13
        L_0x01c6:
            r13 = r4 & 1024(0x400, float:1.435E-42)
            if (r13 != r5) goto L_0x01d2
            java.util.List<java.lang.Integer> r13 = r11.f27101s
            java.util.List r13 = java.util.Collections.unmodifiableList(r13)
            r11.f27101s = r13
        L_0x01d2:
            r2.mo35614a()     // Catch:{ IOException -> 0x01d5, all -> 0x01dc }
        L_0x01d5:
            kotlin.reflect.jvm.internal.impl.protobuf.d r13 = r0.mo35696a()
            r11.f27089g = r13
            goto L_0x01e4
        L_0x01dc:
            r12 = move-exception
            kotlin.reflect.jvm.internal.impl.protobuf.d r13 = r0.mo35696a()
            r11.f27089g = r13
            throw r12
        L_0x01e4:
            r11.mo35760h()
            throw r12
        L_0x01e8:
            r12 = r4 & 32
            if (r12 != r7) goto L_0x01f4
            java.util.List<kotlin.h0.u.e.k0.d.l0> r12 = r11.f27096n
            java.util.List r12 = java.util.Collections.unmodifiableList(r12)
            r11.f27096n = r12
        L_0x01f4:
            r12 = r4 & 256(0x100, float:3.59E-43)
            if (r12 != r6) goto L_0x0200
            java.util.List<kotlin.h0.u.e.k0.d.p0> r12 = r11.f27099q
            java.util.List r12 = java.util.Collections.unmodifiableList(r12)
            r11.f27099q = r12
        L_0x0200:
            r12 = r4 & 1024(0x400, float:1.435E-42)
            if (r12 != r5) goto L_0x020c
            java.util.List<java.lang.Integer> r12 = r11.f27101s
            java.util.List r12 = java.util.Collections.unmodifiableList(r12)
            r11.f27101s = r12
        L_0x020c:
            r2.mo35614a()     // Catch:{ IOException -> 0x020f, all -> 0x0216 }
        L_0x020f:
            kotlin.reflect.jvm.internal.impl.protobuf.d r12 = r0.mo35696a()
            r11.f27089g = r12
            goto L_0x021e
        L_0x0216:
            r12 = move-exception
            kotlin.reflect.jvm.internal.impl.protobuf.d r13 = r0.mo35696a()
            r11.f27089g = r13
            throw r12
        L_0x021e:
            r11.mo35760h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p045h0.p046u.p047e.p048k0.p240d.C9836r.<init>(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):void");
    }

    /* renamed from: e */
    public static C9838b m32532e(C9836r rVar) {
        C9838b M = m32514M();
        M.mo34755a(rVar);
        return M;
    }

    /* renamed from: a */
    public static C9836r m32521a(InputStream inputStream, C10422f fVar) throws IOException {
        return f27088x.mo35665a(inputStream, fVar);
    }
}
