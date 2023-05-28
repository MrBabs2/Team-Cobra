package kotlin.p045h0.p046u.p047e.p048k0.p240d;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.AdRequest;
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
import kotlin.reflect.jvm.internal.impl.protobuf.C10436i;
import kotlin.reflect.jvm.internal.impl.protobuf.C10449o;
import kotlin.reflect.jvm.internal.impl.protobuf.C10452q;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import okhttp3.internal.http2.Http2;

/* renamed from: kotlin.h0.u.e.k0.d.f */
/* compiled from: ProtoBuf */
public final class C9775f extends C10427h.C10431d<C9775f> implements C9781g {

    /* renamed from: D */
    private static final C9775f f26821D;

    /* renamed from: E */
    public static C10452q<C9775f> f26822E = new C9776a();
    /* access modifiers changed from: private */

    /* renamed from: A */
    public C9850t0 f26823A;

    /* renamed from: B */
    private byte f26824B;

    /* renamed from: C */
    private int f26825C;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C10417d f26826g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f26827h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f26828i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public int f26829j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public int f26830k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public List<C9811l0> f26831l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public List<C9782g0> f26832m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public List<Integer> f26833n;

    /* renamed from: o */
    private int f26834o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public List<Integer> f26835p;

    /* renamed from: q */
    private int f26836q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public List<C9790h> f26837r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public List<C9836r> f26838s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public List<C9930z> f26839t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public List<C9795i0> f26840u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public List<C9818n> f26841v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public List<Integer> f26842w;

    /* renamed from: x */
    private int f26843x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public C9821n0 f26844y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public List<Integer> f26845z;

    /* renamed from: kotlin.h0.u.e.k0.d.f$a */
    /* compiled from: ProtoBuf */
    static class C9776a extends C10413b<C9775f> {
        C9776a() {
        }

        /* renamed from: a */
        public C9775f m31815a(C10420e eVar, C10422f fVar) throws InvalidProtocolBufferException {
            return new C9775f(eVar, fVar);
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.d.f$c */
    /* compiled from: ProtoBuf */
    public enum C9778c implements C10436i.C10437a {
        CLASS(0, 0),
        INTERFACE(1, 1),
        ENUM_CLASS(2, 2),
        ENUM_ENTRY(3, 3),
        ANNOTATION_CLASS(4, 4),
        OBJECT(5, 5),
        COMPANION_OBJECT(6, 6);
        

        /* renamed from: f */
        private final int f26871f;

        /* renamed from: kotlin.h0.u.e.k0.d.f$c$a */
        /* compiled from: ProtoBuf */
        static class C9779a implements C10436i.C10438b<C9778c> {
            C9779a() {
            }

            /* renamed from: a */
            public C9778c m31866a(int i) {
                return C9778c.m31863a(i);
            }
        }

        static {
            new C9779a();
        }

        private C9778c(int i, int i2) {
            this.f26871f = i2;
        }

        /* renamed from: a */
        public static C9778c m31863a(int i) {
            switch (i) {
                case 0:
                    return CLASS;
                case 1:
                    return INTERFACE;
                case 2:
                    return ENUM_CLASS;
                case 3:
                    return ENUM_ENTRY;
                case 4:
                    return ANNOTATION_CLASS;
                case 5:
                    return OBJECT;
                case 6:
                    return COMPANION_OBJECT;
                default:
                    return null;
            }
        }

        /* renamed from: b */
        public final int mo34424b() {
            return this.f26871f;
        }
    }

    static {
        C9775f fVar = new C9775f(true);
        f26821D = fVar;
        fVar.m31737Q();
    }

    /* renamed from: P */
    public static C9775f m31736P() {
        return f26821D;
    }

    /* renamed from: Q */
    private void m31737Q() {
        this.f26828i = 6;
        this.f26829j = 0;
        this.f26830k = 0;
        this.f26831l = Collections.emptyList();
        this.f26832m = Collections.emptyList();
        this.f26833n = Collections.emptyList();
        this.f26835p = Collections.emptyList();
        this.f26837r = Collections.emptyList();
        this.f26838s = Collections.emptyList();
        this.f26839t = Collections.emptyList();
        this.f26840u = Collections.emptyList();
        this.f26841v = Collections.emptyList();
        this.f26842w = Collections.emptyList();
        this.f26844y = C9821n0.m32344m();
        this.f26845z = Collections.emptyList();
        this.f26823A = C9850t0.m32680k();
    }

    /* renamed from: R */
    public static C9777b m31738R() {
        return C9777b.m31829z();
    }

    /* renamed from: A */
    public int mo34454A() {
        return this.f26832m.size();
    }

    /* renamed from: B */
    public List<Integer> mo34455B() {
        return this.f26833n;
    }

    /* renamed from: C */
    public List<C9782g0> mo34456C() {
        return this.f26832m;
    }

    /* renamed from: D */
    public int mo34457D() {
        return this.f26840u.size();
    }

    /* renamed from: E */
    public List<C9795i0> mo34458E() {
        return this.f26840u;
    }

    /* renamed from: F */
    public int mo34459F() {
        return this.f26831l.size();
    }

    /* renamed from: G */
    public List<C9811l0> mo34460G() {
        return this.f26831l;
    }

    /* renamed from: H */
    public C9821n0 mo34461H() {
        return this.f26844y;
    }

    /* renamed from: I */
    public List<Integer> mo34462I() {
        return this.f26845z;
    }

    /* renamed from: J */
    public C9850t0 mo34463J() {
        return this.f26823A;
    }

    /* renamed from: K */
    public boolean mo34464K() {
        return (this.f26827h & 4) == 4;
    }

    /* renamed from: L */
    public boolean mo34465L() {
        return (this.f26827h & 1) == 1;
    }

    /* renamed from: M */
    public boolean mo34466M() {
        return (this.f26827h & 2) == 2;
    }

    /* renamed from: N */
    public boolean mo34467N() {
        return (this.f26827h & 8) == 8;
    }

    /* renamed from: O */
    public boolean mo34468O() {
        return (this.f26827h & 16) == 16;
    }

    public final boolean isInitialized() {
        byte b = this.f26824B;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!mo34466M()) {
            this.f26824B = 0;
            return false;
        }
        for (int i = 0; i < mo34459F(); i++) {
            if (!mo34475g(i).isInitialized()) {
                this.f26824B = 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < mo34454A(); i2++) {
            if (!mo34473e(i2).isInitialized()) {
                this.f26824B = 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < mo34477m(); i3++) {
            if (!mo34469a(i3).isInitialized()) {
                this.f26824B = 0;
                return false;
            }
        }
        for (int i4 = 0; i4 < mo34483s(); i4++) {
            if (!mo34471c(i4).isInitialized()) {
                this.f26824B = 0;
                return false;
            }
        }
        for (int i5 = 0; i5 < mo34486v(); i5++) {
            if (!mo34472d(i5).isInitialized()) {
                this.f26824B = 0;
                return false;
            }
        }
        for (int i6 = 0; i6 < mo34457D(); i6++) {
            if (!mo34474f(i6).isInitialized()) {
                this.f26824B = 0;
                return false;
            }
        }
        for (int i7 = 0; i7 < mo34479o(); i7++) {
            if (!mo34470b(i7).isInitialized()) {
                this.f26824B = 0;
                return false;
            }
        }
        if (mo34467N() && !mo34461H().isInitialized()) {
            this.f26824B = 0;
            return false;
        } else if (!mo35769i()) {
            this.f26824B = 0;
            return false;
        } else {
            this.f26824B = 1;
            return true;
        }
    }

    /* renamed from: m */
    public int mo34477m() {
        return this.f26837r.size();
    }

    /* renamed from: n */
    public List<C9790h> mo34478n() {
        return this.f26837r;
    }

    /* renamed from: o */
    public int mo34479o() {
        return this.f26841v.size();
    }

    /* renamed from: p */
    public List<C9818n> mo34480p() {
        return this.f26841v;
    }

    /* renamed from: q */
    public int mo34481q() {
        return this.f26828i;
    }

    /* renamed from: r */
    public int mo34482r() {
        return this.f26829j;
    }

    /* renamed from: s */
    public int mo34483s() {
        return this.f26838s.size();
    }

    /* renamed from: t */
    public List<C9836r> mo34484t() {
        return this.f26838s;
    }

    /* renamed from: u */
    public List<Integer> mo34485u() {
        return this.f26835p;
    }

    /* renamed from: v */
    public int mo34486v() {
        return this.f26839t.size();
    }

    /* renamed from: w */
    public List<C9930z> mo34487w() {
        return this.f26839t;
    }

    /* renamed from: z */
    public List<Integer> mo34488z() {
        return this.f26842w;
    }

    /* renamed from: kotlin.h0.u.e.k0.d.f$b */
    /* compiled from: ProtoBuf */
    public static final class C9777b extends C10427h.C10430c<C9775f, C9777b> implements C9781g {

        /* renamed from: i */
        private int f26846i;

        /* renamed from: j */
        private int f26847j = 6;

        /* renamed from: k */
        private int f26848k;

        /* renamed from: l */
        private int f26849l;

        /* renamed from: m */
        private List<C9811l0> f26850m = Collections.emptyList();

        /* renamed from: n */
        private List<C9782g0> f26851n = Collections.emptyList();

        /* renamed from: o */
        private List<Integer> f26852o = Collections.emptyList();

        /* renamed from: p */
        private List<Integer> f26853p = Collections.emptyList();

        /* renamed from: q */
        private List<C9790h> f26854q = Collections.emptyList();

        /* renamed from: r */
        private List<C9836r> f26855r = Collections.emptyList();

        /* renamed from: s */
        private List<C9930z> f26856s = Collections.emptyList();

        /* renamed from: t */
        private List<C9795i0> f26857t = Collections.emptyList();

        /* renamed from: u */
        private List<C9818n> f26858u = Collections.emptyList();

        /* renamed from: v */
        private List<Integer> f26859v = Collections.emptyList();

        /* renamed from: w */
        private C9821n0 f26860w = C9821n0.m32344m();

        /* renamed from: x */
        private List<Integer> f26861x = Collections.emptyList();

        /* renamed from: y */
        private C9850t0 f26862y = C9850t0.m32680k();

        private C9777b() {
            m31827M();
        }

        /* renamed from: A */
        private void m31816A() {
            if ((this.f26846i & 128) != 128) {
                this.f26854q = new ArrayList(this.f26854q);
                this.f26846i |= 128;
            }
        }

        /* renamed from: B */
        private void m31817B() {
            if ((this.f26846i & RecyclerView.C0638l.FLAG_MOVED) != 2048) {
                this.f26858u = new ArrayList(this.f26858u);
                this.f26846i |= RecyclerView.C0638l.FLAG_MOVED;
            }
        }

        /* renamed from: C */
        private void m31818C() {
            if ((this.f26846i & 256) != 256) {
                this.f26855r = new ArrayList(this.f26855r);
                this.f26846i |= 256;
            }
        }

        /* renamed from: E */
        private void m31819E() {
            if ((this.f26846i & 64) != 64) {
                this.f26853p = new ArrayList(this.f26853p);
                this.f26846i |= 64;
            }
        }

        /* renamed from: F */
        private void m31820F() {
            if ((this.f26846i & AdRequest.MAX_CONTENT_URL_LENGTH) != 512) {
                this.f26856s = new ArrayList(this.f26856s);
                this.f26846i |= AdRequest.MAX_CONTENT_URL_LENGTH;
            }
        }

        /* renamed from: G */
        private void m31821G() {
            if ((this.f26846i & RecyclerView.C0638l.FLAG_APPEARED_IN_PRE_LAYOUT) != 4096) {
                this.f26859v = new ArrayList(this.f26859v);
                this.f26846i |= RecyclerView.C0638l.FLAG_APPEARED_IN_PRE_LAYOUT;
            }
        }

        /* renamed from: H */
        private void m31822H() {
            if ((this.f26846i & 32) != 32) {
                this.f26852o = new ArrayList(this.f26852o);
                this.f26846i |= 32;
            }
        }

        /* renamed from: I */
        private void m31823I() {
            if ((this.f26846i & 16) != 16) {
                this.f26851n = new ArrayList(this.f26851n);
                this.f26846i |= 16;
            }
        }

        /* renamed from: J */
        private void m31824J() {
            if ((this.f26846i & 1024) != 1024) {
                this.f26857t = new ArrayList(this.f26857t);
                this.f26846i |= 1024;
            }
        }

        /* renamed from: K */
        private void m31825K() {
            if ((this.f26846i & 8) != 8) {
                this.f26850m = new ArrayList(this.f26850m);
                this.f26846i |= 8;
            }
        }

        /* renamed from: L */
        private void m31826L() {
            if ((this.f26846i & Http2.INITIAL_MAX_FRAME_SIZE) != 16384) {
                this.f26861x = new ArrayList(this.f26861x);
                this.f26846i |= Http2.INITIAL_MAX_FRAME_SIZE;
            }
        }

        /* renamed from: M */
        private void m31827M() {
        }

        /* access modifiers changed from: private */
        /* renamed from: z */
        public static C9777b m31829z() {
            return new C9777b();
        }

        /* renamed from: c */
        public C9836r mo34494c(int i) {
            return this.f26855r.get(i);
        }

        /* renamed from: d */
        public C9930z mo34495d(int i) {
            return this.f26856s.get(i);
        }

        /* renamed from: e */
        public C9782g0 mo34496e(int i) {
            return this.f26851n.get(i);
        }

        /* renamed from: f */
        public C9795i0 mo34497f(int i) {
            return this.f26857t.get(i);
        }

        /* renamed from: g */
        public C9811l0 mo34498g(int i) {
            return this.f26850m.get(i);
        }

        /* renamed from: h */
        public C9777b mo34499h(int i) {
            this.f26846i |= 4;
            this.f26849l = i;
            return this;
        }

        /* renamed from: i */
        public C9777b mo34500i(int i) {
            this.f26846i |= 1;
            this.f26847j = i;
            return this;
        }

        public final boolean isInitialized() {
            if (!mo34511w()) {
                return false;
            }
            for (int i = 0; i < mo34509s(); i++) {
                if (!mo34498g(i).isInitialized()) {
                    return false;
                }
            }
            for (int i2 = 0; i2 < mo34507q(); i2++) {
                if (!mo34496e(i2).isInitialized()) {
                    return false;
                }
            }
            for (int i3 = 0; i3 < mo34503k(); i3++) {
                if (!mo34492a(i3).isInitialized()) {
                    return false;
                }
            }
            for (int i4 = 0; i4 < mo34505m(); i4++) {
                if (!mo34494c(i4).isInitialized()) {
                    return false;
                }
            }
            for (int i5 = 0; i5 < mo34506n(); i5++) {
                if (!mo34495d(i5).isInitialized()) {
                    return false;
                }
            }
            for (int i6 = 0; i6 < mo34508r(); i6++) {
                if (!mo34497f(i6).isInitialized()) {
                    return false;
                }
            }
            for (int i7 = 0; i7 < mo34504l(); i7++) {
                if (!mo34493b(i7).isInitialized()) {
                    return false;
                }
            }
            if ((!mo34512x() || mo34510u().isInitialized()) && mo35764i()) {
                return true;
            }
            return false;
        }

        /* renamed from: j */
        public C9775f mo34502j() {
            C9775f fVar = new C9775f((C10427h.C10430c) this);
            int i = this.f26846i;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            int unused = fVar.f26828i = this.f26847j;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            int unused2 = fVar.f26829j = this.f26848k;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            int unused3 = fVar.f26830k = this.f26849l;
            if ((this.f26846i & 8) == 8) {
                this.f26850m = Collections.unmodifiableList(this.f26850m);
                this.f26846i &= -9;
            }
            List unused4 = fVar.f26831l = this.f26850m;
            if ((this.f26846i & 16) == 16) {
                this.f26851n = Collections.unmodifiableList(this.f26851n);
                this.f26846i &= -17;
            }
            List unused5 = fVar.f26832m = this.f26851n;
            if ((this.f26846i & 32) == 32) {
                this.f26852o = Collections.unmodifiableList(this.f26852o);
                this.f26846i &= -33;
            }
            List unused6 = fVar.f26833n = this.f26852o;
            if ((this.f26846i & 64) == 64) {
                this.f26853p = Collections.unmodifiableList(this.f26853p);
                this.f26846i &= -65;
            }
            List unused7 = fVar.f26835p = this.f26853p;
            if ((this.f26846i & 128) == 128) {
                this.f26854q = Collections.unmodifiableList(this.f26854q);
                this.f26846i &= -129;
            }
            List unused8 = fVar.f26837r = this.f26854q;
            if ((this.f26846i & 256) == 256) {
                this.f26855r = Collections.unmodifiableList(this.f26855r);
                this.f26846i &= -257;
            }
            List unused9 = fVar.f26838s = this.f26855r;
            if ((this.f26846i & AdRequest.MAX_CONTENT_URL_LENGTH) == 512) {
                this.f26856s = Collections.unmodifiableList(this.f26856s);
                this.f26846i &= -513;
            }
            List unused10 = fVar.f26839t = this.f26856s;
            if ((this.f26846i & 1024) == 1024) {
                this.f26857t = Collections.unmodifiableList(this.f26857t);
                this.f26846i &= -1025;
            }
            List unused11 = fVar.f26840u = this.f26857t;
            if ((this.f26846i & RecyclerView.C0638l.FLAG_MOVED) == 2048) {
                this.f26858u = Collections.unmodifiableList(this.f26858u);
                this.f26846i &= -2049;
            }
            List unused12 = fVar.f26841v = this.f26858u;
            if ((this.f26846i & RecyclerView.C0638l.FLAG_APPEARED_IN_PRE_LAYOUT) == 4096) {
                this.f26859v = Collections.unmodifiableList(this.f26859v);
                this.f26846i &= -4097;
            }
            List unused13 = fVar.f26842w = this.f26859v;
            if ((i & 8192) == 8192) {
                i2 |= 8;
            }
            C9821n0 unused14 = fVar.f26844y = this.f26860w;
            if ((this.f26846i & Http2.INITIAL_MAX_FRAME_SIZE) == 16384) {
                this.f26861x = Collections.unmodifiableList(this.f26861x);
                this.f26846i &= -16385;
            }
            List unused15 = fVar.f26845z = this.f26861x;
            if ((i & 32768) == 32768) {
                i2 |= 16;
            }
            C9850t0 unused16 = fVar.f26823A = this.f26862y;
            int unused17 = fVar.f26827h = i2;
            return fVar;
        }

        /* renamed from: k */
        public int mo34503k() {
            return this.f26854q.size();
        }

        /* renamed from: l */
        public int mo34504l() {
            return this.f26858u.size();
        }

        /* renamed from: m */
        public int mo34505m() {
            return this.f26855r.size();
        }

        /* renamed from: n */
        public int mo34506n() {
            return this.f26856s.size();
        }

        /* renamed from: q */
        public int mo34507q() {
            return this.f26851n.size();
        }

        /* renamed from: r */
        public int mo34508r() {
            return this.f26857t.size();
        }

        /* renamed from: s */
        public int mo34509s() {
            return this.f26850m.size();
        }

        /* renamed from: u */
        public C9821n0 mo34510u() {
            return this.f26860w;
        }

        /* renamed from: w */
        public boolean mo34511w() {
            return (this.f26846i & 2) == 2;
        }

        /* renamed from: x */
        public boolean mo34512x() {
            return (this.f26846i & 8192) == 8192;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ C10427h.C10429b mo34379a(C10427h hVar) {
            mo34489a((C9775f) hVar);
            return this;
        }

        /* renamed from: b */
        public C9775f m31843b() {
            return C9775f.m31736P();
        }

        public C9777b clone() {
            C9777b z = m31829z();
            z.mo34489a(mo34502j());
            return z;
        }

        /* renamed from: b */
        public C9818n mo34493b(int i) {
            return this.f26858u.get(i);
        }

        /* renamed from: a */
        public C9775f m31839a() {
            C9775f j = mo34502j();
            if (j.isInitialized()) {
                return j;
            }
            throw C10410a.C10411a.m35207a(j);
        }

        /* renamed from: a */
        public C9777b mo34489a(C9775f fVar) {
            if (fVar == C9775f.m31736P()) {
                return this;
            }
            if (fVar.mo34465L()) {
                mo34500i(fVar.mo34481q());
            }
            if (fVar.mo34466M()) {
                mo34501j(fVar.mo34482r());
            }
            if (fVar.mo34464K()) {
                mo34499h(fVar.mo34476l());
            }
            if (!fVar.f26831l.isEmpty()) {
                if (this.f26850m.isEmpty()) {
                    this.f26850m = fVar.f26831l;
                    this.f26846i &= -9;
                } else {
                    m31825K();
                    this.f26850m.addAll(fVar.f26831l);
                }
            }
            if (!fVar.f26832m.isEmpty()) {
                if (this.f26851n.isEmpty()) {
                    this.f26851n = fVar.f26832m;
                    this.f26846i &= -17;
                } else {
                    m31823I();
                    this.f26851n.addAll(fVar.f26832m);
                }
            }
            if (!fVar.f26833n.isEmpty()) {
                if (this.f26852o.isEmpty()) {
                    this.f26852o = fVar.f26833n;
                    this.f26846i &= -33;
                } else {
                    m31822H();
                    this.f26852o.addAll(fVar.f26833n);
                }
            }
            if (!fVar.f26835p.isEmpty()) {
                if (this.f26853p.isEmpty()) {
                    this.f26853p = fVar.f26835p;
                    this.f26846i &= -65;
                } else {
                    m31819E();
                    this.f26853p.addAll(fVar.f26835p);
                }
            }
            if (!fVar.f26837r.isEmpty()) {
                if (this.f26854q.isEmpty()) {
                    this.f26854q = fVar.f26837r;
                    this.f26846i &= -129;
                } else {
                    m31816A();
                    this.f26854q.addAll(fVar.f26837r);
                }
            }
            if (!fVar.f26838s.isEmpty()) {
                if (this.f26855r.isEmpty()) {
                    this.f26855r = fVar.f26838s;
                    this.f26846i &= -257;
                } else {
                    m31818C();
                    this.f26855r.addAll(fVar.f26838s);
                }
            }
            if (!fVar.f26839t.isEmpty()) {
                if (this.f26856s.isEmpty()) {
                    this.f26856s = fVar.f26839t;
                    this.f26846i &= -513;
                } else {
                    m31820F();
                    this.f26856s.addAll(fVar.f26839t);
                }
            }
            if (!fVar.f26840u.isEmpty()) {
                if (this.f26857t.isEmpty()) {
                    this.f26857t = fVar.f26840u;
                    this.f26846i &= -1025;
                } else {
                    m31824J();
                    this.f26857t.addAll(fVar.f26840u);
                }
            }
            if (!fVar.f26841v.isEmpty()) {
                if (this.f26858u.isEmpty()) {
                    this.f26858u = fVar.f26841v;
                    this.f26846i &= -2049;
                } else {
                    m31817B();
                    this.f26858u.addAll(fVar.f26841v);
                }
            }
            if (!fVar.f26842w.isEmpty()) {
                if (this.f26859v.isEmpty()) {
                    this.f26859v = fVar.f26842w;
                    this.f26846i &= -4097;
                } else {
                    m31821G();
                    this.f26859v.addAll(fVar.f26842w);
                }
            }
            if (fVar.mo34467N()) {
                mo34490a(fVar.mo34461H());
            }
            if (!fVar.f26845z.isEmpty()) {
                if (this.f26861x.isEmpty()) {
                    this.f26861x = fVar.f26845z;
                    this.f26846i &= -16385;
                } else {
                    m31826L();
                    this.f26861x.addAll(fVar.f26845z);
                }
            }
            if (fVar.mo34468O()) {
                mo34491a(fVar.mo34463J());
            }
            mo35763a(fVar);
            mo35761a(mo35762h().mo35686b(fVar.f26826g));
            return this;
        }

        /* renamed from: j */
        public C9777b mo34501j(int i) {
            this.f26846i |= 2;
            this.f26848k = i;
            return this;
        }

        /* renamed from: a */
        public C9777b mo34377a(C10420e eVar, C10422f fVar) throws IOException {
            C9775f fVar2;
            C9775f fVar3 = null;
            try {
                C9775f a = C9775f.f26822E.mo34369a(eVar, fVar);
                if (a != null) {
                    mo34489a(a);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                fVar2 = (C9775f) e.mo35657a();
                throw e;
            } catch (Throwable th) {
                th = th;
                fVar3 = fVar2;
            }
            if (fVar3 != null) {
                mo34489a(fVar3);
            }
            throw th;
        }

        /* renamed from: a */
        public C9790h mo34492a(int i) {
            return this.f26854q.get(i);
        }

        /* renamed from: a */
        public C9777b mo34490a(C9821n0 n0Var) {
            if ((this.f26846i & 8192) != 8192 || this.f26860w == C9821n0.m32344m()) {
                this.f26860w = n0Var;
            } else {
                C9821n0.C9823b c = C9821n0.m32343c(this.f26860w);
                c.mo34672a(n0Var);
                this.f26860w = c.mo34674i();
            }
            this.f26846i |= 8192;
            return this;
        }

        /* renamed from: a */
        public C9777b mo34491a(C9850t0 t0Var) {
            if ((this.f26846i & 32768) != 32768 || this.f26862y == C9850t0.m32680k()) {
                this.f26862y = t0Var;
            } else {
                C9850t0.C9852b c = C9850t0.m32679c(this.f26862y);
                c.mo34795a(t0Var);
                this.f26862y = c.mo34796i();
            }
            this.f26846i |= 32768;
            return this;
        }
    }

    /* renamed from: m */
    public static C9777b m31769m(C9775f fVar) {
        C9777b R = m31738R();
        R.mo34489a(fVar);
        return R;
    }

    /* renamed from: l */
    public int mo34476l() {
        return this.f26830k;
    }

    private C9775f(C10427h.C10430c<C9775f, ?> cVar) {
        super(cVar);
        this.f26834o = -1;
        this.f26836q = -1;
        this.f26843x = -1;
        this.f26824B = -1;
        this.f26825C = -1;
        this.f26826g = cVar.mo35762h();
    }

    /* renamed from: e */
    public C9782g0 mo34473e(int i) {
        return this.f26832m.get(i);
    }

    /* renamed from: g */
    public C10452q<C9775f> mo34363g() {
        return f26822E;
    }

    /* renamed from: d */
    public C9930z mo34472d(int i) {
        return this.f26839t.get(i);
    }

    /* renamed from: e */
    public int mo34361e() {
        int i = this.f26825C;
        if (i != -1) {
            return i;
        }
        int f = (this.f26827h & 1) == 1 ? CodedOutputStream.m35133f(1, this.f26828i) + 0 : 0;
        int i2 = 0;
        for (int i3 = 0; i3 < this.f26833n.size(); i3++) {
            i2 += CodedOutputStream.m35140l(this.f26833n.get(i3).intValue());
        }
        int i4 = f + i2;
        if (!mo34455B().isEmpty()) {
            i4 = i4 + 1 + CodedOutputStream.m35140l(i2);
        }
        this.f26834o = i2;
        if ((this.f26827h & 2) == 2) {
            i4 += CodedOutputStream.m35133f(3, this.f26829j);
        }
        if ((this.f26827h & 4) == 4) {
            i4 += CodedOutputStream.m35133f(4, this.f26830k);
        }
        for (int i5 = 0; i5 < this.f26831l.size(); i5++) {
            i4 += CodedOutputStream.m35130d(5, (C10449o) this.f26831l.get(i5));
        }
        for (int i6 = 0; i6 < this.f26832m.size(); i6++) {
            i4 += CodedOutputStream.m35130d(6, (C10449o) this.f26832m.get(i6));
        }
        int i7 = 0;
        for (int i8 = 0; i8 < this.f26835p.size(); i8++) {
            i7 += CodedOutputStream.m35140l(this.f26835p.get(i8).intValue());
        }
        int i9 = i4 + i7;
        if (!mo34485u().isEmpty()) {
            i9 = i9 + 1 + CodedOutputStream.m35140l(i7);
        }
        this.f26836q = i7;
        for (int i10 = 0; i10 < this.f26837r.size(); i10++) {
            i9 += CodedOutputStream.m35130d(8, (C10449o) this.f26837r.get(i10));
        }
        for (int i11 = 0; i11 < this.f26838s.size(); i11++) {
            i9 += CodedOutputStream.m35130d(9, (C10449o) this.f26838s.get(i11));
        }
        for (int i12 = 0; i12 < this.f26839t.size(); i12++) {
            i9 += CodedOutputStream.m35130d(10, (C10449o) this.f26839t.get(i12));
        }
        for (int i13 = 0; i13 < this.f26840u.size(); i13++) {
            i9 += CodedOutputStream.m35130d(11, (C10449o) this.f26840u.get(i13));
        }
        for (int i14 = 0; i14 < this.f26841v.size(); i14++) {
            i9 += CodedOutputStream.m35130d(13, (C10449o) this.f26841v.get(i14));
        }
        int i15 = 0;
        for (int i16 = 0; i16 < this.f26842w.size(); i16++) {
            i15 += CodedOutputStream.m35140l(this.f26842w.get(i16).intValue());
        }
        int i17 = i9 + i15;
        if (!mo34488z().isEmpty()) {
            i17 = i17 + 2 + CodedOutputStream.m35140l(i15);
        }
        this.f26843x = i15;
        if ((this.f26827h & 8) == 8) {
            i17 += CodedOutputStream.m35130d(30, (C10449o) this.f26844y);
        }
        int i18 = 0;
        for (int i19 = 0; i19 < this.f26845z.size(); i19++) {
            i18 += CodedOutputStream.m35140l(this.f26845z.get(i19).intValue());
        }
        int size = i17 + i18 + (mo34462I().size() * 2);
        if ((this.f26827h & 16) == 16) {
            size += CodedOutputStream.m35130d(32, (C10449o) this.f26823A);
        }
        int j = size + mo35770j() + this.f26826g.size();
        this.f26825C = j;
        return j;
    }

    /* renamed from: f */
    public C9795i0 mo34474f(int i) {
        return this.f26840u.get(i);
    }

    /* renamed from: g */
    public C9811l0 mo34475g(int i) {
        return this.f26831l.get(i);
    }

    /* renamed from: b */
    public C9775f m31789b() {
        return f26821D;
    }

    /* renamed from: c */
    public C9836r mo34471c(int i) {
        return this.f26838s.get(i);
    }

    /* renamed from: f */
    public C9777b m31798f() {
        return m31738R();
    }

    /* renamed from: a */
    public C9790h mo34469a(int i) {
        return this.f26837r.get(i);
    }

    /* renamed from: b */
    public C9818n mo34470b(int i) {
        return this.f26841v.get(i);
    }

    /* renamed from: c */
    public C9777b m31792c() {
        return m31769m(this);
    }

    /* renamed from: a */
    public void mo34358a(CodedOutputStream codedOutputStream) throws IOException {
        mo34361e();
        C10427h.C10431d<MessageType>.C0000a k = mo35771k();
        if ((this.f26827h & 1) == 1) {
            codedOutputStream.mo35635b(1, this.f26828i);
        }
        if (mo34455B().size() > 0) {
            codedOutputStream.mo35650f(18);
            codedOutputStream.mo35650f(this.f26834o);
        }
        for (int i = 0; i < this.f26833n.size(); i++) {
            codedOutputStream.mo35641c(this.f26833n.get(i).intValue());
        }
        if ((this.f26827h & 2) == 2) {
            codedOutputStream.mo35635b(3, this.f26829j);
        }
        if ((this.f26827h & 4) == 4) {
            codedOutputStream.mo35635b(4, this.f26830k);
        }
        for (int i2 = 0; i2 < this.f26831l.size(); i2++) {
            codedOutputStream.mo35636b(5, (C10449o) this.f26831l.get(i2));
        }
        for (int i3 = 0; i3 < this.f26832m.size(); i3++) {
            codedOutputStream.mo35636b(6, (C10449o) this.f26832m.get(i3));
        }
        if (mo34485u().size() > 0) {
            codedOutputStream.mo35650f(58);
            codedOutputStream.mo35650f(this.f26836q);
        }
        for (int i4 = 0; i4 < this.f26835p.size(); i4++) {
            codedOutputStream.mo35641c(this.f26835p.get(i4).intValue());
        }
        for (int i5 = 0; i5 < this.f26837r.size(); i5++) {
            codedOutputStream.mo35636b(8, (C10449o) this.f26837r.get(i5));
        }
        for (int i6 = 0; i6 < this.f26838s.size(); i6++) {
            codedOutputStream.mo35636b(9, (C10449o) this.f26838s.get(i6));
        }
        for (int i7 = 0; i7 < this.f26839t.size(); i7++) {
            codedOutputStream.mo35636b(10, (C10449o) this.f26839t.get(i7));
        }
        for (int i8 = 0; i8 < this.f26840u.size(); i8++) {
            codedOutputStream.mo35636b(11, (C10449o) this.f26840u.get(i8));
        }
        for (int i9 = 0; i9 < this.f26841v.size(); i9++) {
            codedOutputStream.mo35636b(13, (C10449o) this.f26841v.get(i9));
        }
        if (mo34488z().size() > 0) {
            codedOutputStream.mo35650f(130);
            codedOutputStream.mo35650f(this.f26843x);
        }
        for (int i10 = 0; i10 < this.f26842w.size(); i10++) {
            codedOutputStream.mo35641c(this.f26842w.get(i10).intValue());
        }
        if ((this.f26827h & 8) == 8) {
            codedOutputStream.mo35636b(30, (C10449o) this.f26844y);
        }
        for (int i11 = 0; i11 < this.f26845z.size(); i11++) {
            codedOutputStream.mo35635b(31, this.f26845z.get(i11).intValue());
        }
        if ((this.f26827h & 16) == 16) {
            codedOutputStream.mo35636b(32, (C10449o) this.f26823A);
        }
        k.mo35772a(19000, codedOutputStream);
        codedOutputStream.mo35638b(this.f26826g);
    }

    private C9775f(boolean z) {
        this.f26834o = -1;
        this.f26836q = -1;
        this.f26843x = -1;
        this.f26824B = -1;
        this.f26825C = -1;
        this.f26826g = C10417d.f28215f;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: kotlin.h0.u.e.k0.d.n0$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: kotlin.h0.u.e.k0.d.n0$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v4, resolved type: kotlin.h0.u.e.k0.d.n0$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v16, resolved type: kotlin.h0.u.e.k0.d.t0$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v6, resolved type: kotlin.h0.u.e.k0.d.n0$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v7, resolved type: kotlin.h0.u.e.k0.d.n0$b} */
    /* JADX WARNING: type inference failed for: r16v5, types: [kotlin.h0.u.e.k0.d.t0$b] */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02c0, code lost:
        r6 = true;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C9775f(kotlin.reflect.jvm.internal.impl.protobuf.C10420e r18, kotlin.reflect.jvm.internal.impl.protobuf.C10422f r19) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r19
            r17.<init>()
            r3 = -1
            r1.f26834o = r3
            r1.f26836q = r3
            r1.f26843x = r3
            r1.f26824B = r3
            r1.f26825C = r3
            r17.m31737Q()
            kotlin.reflect.jvm.internal.impl.protobuf.d$b r3 = kotlin.reflect.jvm.internal.impl.protobuf.C10417d.m35229j()
            r4 = 1
            kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r5 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.m35116a((java.io.OutputStream) r3, (int) r4)
            r6 = 0
            r7 = 0
        L_0x0022:
            r8 = 2048(0x800, float:2.87E-42)
            r9 = 1024(0x400, float:1.435E-42)
            r10 = 512(0x200, float:7.175E-43)
            r13 = 16384(0x4000, float:2.2959E-41)
            r14 = 4096(0x1000, float:5.74E-42)
            r4 = 16
            r15 = 8
            if (r6 != 0) goto L_0x0382
            int r12 = r18.mo35733x()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r16 = 0
            switch(r12) {
                case 0: goto L_0x02bf;
                case 8: goto L_0x02b2;
                case 16: goto L_0x0294;
                case 18: goto L_0x025f;
                case 24: goto L_0x0252;
                case 32: goto L_0x0245;
                case 42: goto L_0x022c;
                case 50: goto L_0x0210;
                case 56: goto L_0x01f2;
                case 58: goto L_0x01bc;
                case 66: goto L_0x01a0;
                case 74: goto L_0x0184;
                case 82: goto L_0x016a;
                case 90: goto L_0x0150;
                case 106: goto L_0x0136;
                case 128: goto L_0x011a;
                case 130: goto L_0x00e6;
                case 242: goto L_0x00bd;
                case 248: goto L_0x00a1;
                case 250: goto L_0x006b;
                case 258: goto L_0x0042;
                default: goto L_0x003b;
            }     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
        L_0x003b:
            r11 = 1
            boolean r4 = r1.mo35759a(r0, r5, r2, r12)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            goto L_0x02c2
        L_0x0042:
            int r12 = r1.f26827h     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r12 = r12 & r4
            if (r12 != r4) goto L_0x004d
            kotlin.h0.u.e.k0.d.t0 r12 = r1.f26823A     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            kotlin.h0.u.e.k0.d.t0$b r16 = r12.m32687c()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
        L_0x004d:
            r12 = r16
            kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.h0.u.e.k0.d.t0> r11 = kotlin.p045h0.p046u.p047e.p048k0.p240d.C9850t0.f27154k     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            kotlin.reflect.jvm.internal.impl.protobuf.o r11 = r0.mo35702a(r11, (kotlin.reflect.jvm.internal.impl.protobuf.C10422f) r2)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            kotlin.h0.u.e.k0.d.t0 r11 = (kotlin.p045h0.p046u.p047e.p048k0.p240d.C9850t0) r11     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r1.f26823A = r11     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            if (r12 == 0) goto L_0x0064
            r12.mo34795a((kotlin.p045h0.p046u.p047e.p048k0.p240d.C9850t0) r11)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            kotlin.h0.u.e.k0.d.t0 r11 = r12.mo34796i()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r1.f26823A = r11     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
        L_0x0064:
            int r11 = r1.f26827h     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r11 = r11 | r4
            r1.f26827h = r11     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            goto L_0x02b0
        L_0x006b:
            int r11 = r18.mo35724o()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            int r11 = r0.mo35710c(r11)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r12 = r7 & 16384(0x4000, float:2.2959E-41)
            if (r12 == r13) goto L_0x0086
            int r12 = r18.mo35701a()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            if (r12 <= 0) goto L_0x0086
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r12.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r1.f26845z = r12     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r7 = r7 | 16384(0x4000, float:2.2959E-41)
        L_0x0086:
            int r12 = r18.mo35701a()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            if (r12 <= 0) goto L_0x009c
            java.util.List<java.lang.Integer> r12 = r1.f26845z     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            int r16 = r18.mo35719j()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r16)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r12.add(r4)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r4 = 16
            goto L_0x0086
        L_0x009c:
            r0.mo35708b(r11)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            goto L_0x02b0
        L_0x00a1:
            r4 = r7 & 16384(0x4000, float:2.2959E-41)
            if (r4 == r13) goto L_0x00ae
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r4.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r1.f26845z = r4     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r7 = r7 | 16384(0x4000, float:2.2959E-41)
        L_0x00ae:
            java.util.List<java.lang.Integer> r4 = r1.f26845z     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            int r11 = r18.mo35719j()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r4.add(r11)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            goto L_0x02b0
        L_0x00bd:
            int r4 = r1.f26827h     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r4 = r4 & r15
            if (r4 != r15) goto L_0x00c8
            kotlin.h0.u.e.k0.d.n0 r4 = r1.f26844y     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            kotlin.h0.u.e.k0.d.n0$b r16 = r4.m32352c()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
        L_0x00c8:
            r4 = r16
            kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.h0.u.e.k0.d.n0> r11 = kotlin.p045h0.p046u.p047e.p048k0.p240d.C9821n0.f27032m     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            kotlin.reflect.jvm.internal.impl.protobuf.o r11 = r0.mo35702a(r11, (kotlin.reflect.jvm.internal.impl.protobuf.C10422f) r2)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            kotlin.h0.u.e.k0.d.n0 r11 = (kotlin.p045h0.p046u.p047e.p048k0.p240d.C9821n0) r11     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r1.f26844y = r11     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            if (r4 == 0) goto L_0x00df
            r4.mo34672a((kotlin.p045h0.p046u.p047e.p048k0.p240d.C9821n0) r11)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            kotlin.h0.u.e.k0.d.n0 r4 = r4.mo34674i()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r1.f26844y = r4     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
        L_0x00df:
            int r4 = r1.f26827h     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r4 = r4 | r15
            r1.f26827h = r4     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            goto L_0x02b0
        L_0x00e6:
            int r4 = r18.mo35724o()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            int r4 = r0.mo35710c(r4)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r11 = r7 & 4096(0x1000, float:5.74E-42)
            if (r11 == r14) goto L_0x0101
            int r11 = r18.mo35701a()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            if (r11 <= 0) goto L_0x0101
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r11.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r1.f26842w = r11     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r7 = r7 | 4096(0x1000, float:5.74E-42)
        L_0x0101:
            int r11 = r18.mo35701a()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            if (r11 <= 0) goto L_0x0115
            java.util.List<java.lang.Integer> r11 = r1.f26842w     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            int r12 = r18.mo35719j()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r11.add(r12)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            goto L_0x0101
        L_0x0115:
            r0.mo35708b(r4)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            goto L_0x02b0
        L_0x011a:
            r4 = r7 & 4096(0x1000, float:5.74E-42)
            if (r4 == r14) goto L_0x0127
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r4.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r1.f26842w = r4     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r7 = r7 | 4096(0x1000, float:5.74E-42)
        L_0x0127:
            java.util.List<java.lang.Integer> r4 = r1.f26842w     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            int r11 = r18.mo35719j()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r4.add(r11)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            goto L_0x02b0
        L_0x0136:
            r4 = r7 & 2048(0x800, float:2.87E-42)
            if (r4 == r8) goto L_0x0143
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r4.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r1.f26841v = r4     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r7 = r7 | 2048(0x800, float:2.87E-42)
        L_0x0143:
            java.util.List<kotlin.h0.u.e.k0.d.n> r4 = r1.f26841v     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.h0.u.e.k0.d.n> r11 = kotlin.p045h0.p046u.p047e.p048k0.p240d.C9818n.f27023m     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            kotlin.reflect.jvm.internal.impl.protobuf.o r11 = r0.mo35702a(r11, (kotlin.reflect.jvm.internal.impl.protobuf.C10422f) r2)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r4.add(r11)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            goto L_0x02b0
        L_0x0150:
            r4 = r7 & 1024(0x400, float:1.435E-42)
            if (r4 == r9) goto L_0x015d
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r4.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r1.f26840u = r4     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r7 = r7 | 1024(0x400, float:1.435E-42)
        L_0x015d:
            java.util.List<kotlin.h0.u.e.k0.d.i0> r4 = r1.f26840u     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.h0.u.e.k0.d.i0> r11 = kotlin.p045h0.p046u.p047e.p048k0.p240d.C9795i0.f26940u     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            kotlin.reflect.jvm.internal.impl.protobuf.o r11 = r0.mo35702a(r11, (kotlin.reflect.jvm.internal.impl.protobuf.C10422f) r2)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r4.add(r11)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            goto L_0x02b0
        L_0x016a:
            r4 = r7 & 512(0x200, float:7.175E-43)
            if (r4 == r10) goto L_0x0177
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r4.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r1.f26839t = r4     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r7 = r7 | 512(0x200, float:7.175E-43)
        L_0x0177:
            java.util.List<kotlin.h0.u.e.k0.d.z> r4 = r1.f26839t     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.h0.u.e.k0.d.z> r11 = kotlin.p045h0.p046u.p047e.p048k0.p240d.C9930z.f27391x     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            kotlin.reflect.jvm.internal.impl.protobuf.o r11 = r0.mo35702a(r11, (kotlin.reflect.jvm.internal.impl.protobuf.C10422f) r2)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r4.add(r11)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            goto L_0x02b0
        L_0x0184:
            r4 = r7 & 256(0x100, float:3.59E-43)
            r11 = 256(0x100, float:3.59E-43)
            if (r4 == r11) goto L_0x0193
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r4.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r1.f26838s = r4     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r7 = r7 | 256(0x100, float:3.59E-43)
        L_0x0193:
            java.util.List<kotlin.h0.u.e.k0.d.r> r4 = r1.f26838s     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.h0.u.e.k0.d.r> r11 = kotlin.p045h0.p046u.p047e.p048k0.p240d.C9836r.f27088x     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            kotlin.reflect.jvm.internal.impl.protobuf.o r11 = r0.mo35702a(r11, (kotlin.reflect.jvm.internal.impl.protobuf.C10422f) r2)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r4.add(r11)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            goto L_0x02b0
        L_0x01a0:
            r4 = r7 & 128(0x80, float:1.794E-43)
            r11 = 128(0x80, float:1.794E-43)
            if (r4 == r11) goto L_0x01af
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r4.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r1.f26837r = r4     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r7 = r7 | 128(0x80, float:1.794E-43)
        L_0x01af:
            java.util.List<kotlin.h0.u.e.k0.d.h> r4 = r1.f26837r     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.h0.u.e.k0.d.h> r11 = kotlin.p045h0.p046u.p047e.p048k0.p240d.C9790h.f26927o     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            kotlin.reflect.jvm.internal.impl.protobuf.o r11 = r0.mo35702a(r11, (kotlin.reflect.jvm.internal.impl.protobuf.C10422f) r2)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r4.add(r11)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            goto L_0x02b0
        L_0x01bc:
            int r4 = r18.mo35724o()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            int r4 = r0.mo35710c(r4)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r11 = r7 & 64
            r12 = 64
            if (r11 == r12) goto L_0x01d9
            int r11 = r18.mo35701a()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            if (r11 <= 0) goto L_0x01d9
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r11.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r1.f26835p = r11     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r7 = r7 | 64
        L_0x01d9:
            int r11 = r18.mo35701a()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            if (r11 <= 0) goto L_0x01ed
            java.util.List<java.lang.Integer> r11 = r1.f26835p     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            int r12 = r18.mo35719j()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r11.add(r12)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            goto L_0x01d9
        L_0x01ed:
            r0.mo35708b(r4)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            goto L_0x02b0
        L_0x01f2:
            r4 = r7 & 64
            r11 = 64
            if (r4 == r11) goto L_0x0201
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r4.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r1.f26835p = r4     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r7 = r7 | 64
        L_0x0201:
            java.util.List<java.lang.Integer> r4 = r1.f26835p     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            int r11 = r18.mo35719j()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r4.add(r11)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            goto L_0x02b0
        L_0x0210:
            r4 = r7 & 16
            r11 = 16
            if (r4 == r11) goto L_0x021f
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r4.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r1.f26832m = r4     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r7 = r7 | 16
        L_0x021f:
            java.util.List<kotlin.h0.u.e.k0.d.g0> r4 = r1.f26832m     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.h0.u.e.k0.d.g0> r11 = kotlin.p045h0.p046u.p047e.p048k0.p240d.C9782g0.f26873z     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            kotlin.reflect.jvm.internal.impl.protobuf.o r11 = r0.mo35702a(r11, (kotlin.reflect.jvm.internal.impl.protobuf.C10422f) r2)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r4.add(r11)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            goto L_0x02b0
        L_0x022c:
            r4 = r7 & 8
            if (r4 == r15) goto L_0x0239
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r4.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r1.f26831l = r4     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r7 = r7 | 8
        L_0x0239:
            java.util.List<kotlin.h0.u.e.k0.d.l0> r4 = r1.f26831l     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.h0.u.e.k0.d.l0> r11 = kotlin.p045h0.p046u.p047e.p048k0.p240d.C9811l0.f26998s     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            kotlin.reflect.jvm.internal.impl.protobuf.o r11 = r0.mo35702a(r11, (kotlin.reflect.jvm.internal.impl.protobuf.C10422f) r2)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r4.add(r11)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            goto L_0x02b0
        L_0x0245:
            int r4 = r1.f26827h     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r4 = r4 | 4
            r1.f26827h = r4     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            int r4 = r18.mo35719j()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r1.f26830k = r4     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            goto L_0x02b0
        L_0x0252:
            int r4 = r1.f26827h     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r4 = r4 | 2
            r1.f26827h = r4     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            int r4 = r18.mo35719j()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r1.f26829j = r4     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            goto L_0x02b0
        L_0x025f:
            int r4 = r18.mo35724o()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            int r4 = r0.mo35710c(r4)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r11 = r7 & 32
            r12 = 32
            if (r11 == r12) goto L_0x027c
            int r11 = r18.mo35701a()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            if (r11 <= 0) goto L_0x027c
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r11.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r1.f26833n = r11     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r7 = r7 | 32
        L_0x027c:
            int r11 = r18.mo35701a()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            if (r11 <= 0) goto L_0x0290
            java.util.List<java.lang.Integer> r11 = r1.f26833n     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            int r12 = r18.mo35719j()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r11.add(r12)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            goto L_0x027c
        L_0x0290:
            r0.mo35708b(r4)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            goto L_0x02b0
        L_0x0294:
            r4 = r7 & 32
            r11 = 32
            if (r4 == r11) goto L_0x02a3
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r4.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r1.f26833n = r4     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r7 = r7 | 32
        L_0x02a3:
            java.util.List<java.lang.Integer> r4 = r1.f26833n     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            int r11 = r18.mo35719j()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r4.add(r11)     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
        L_0x02b0:
            r11 = 1
            goto L_0x02c5
        L_0x02b2:
            int r4 = r1.f26827h     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r11 = 1
            r4 = r4 | r11
            r1.f26827h = r4     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            int r4 = r18.mo35719j()     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            r1.f26828i = r4     // Catch:{ InvalidProtocolBufferException -> 0x02d8, IOException -> 0x02ca }
            goto L_0x02c5
        L_0x02bf:
            r11 = 1
        L_0x02c0:
            r6 = 1
            goto L_0x02c5
        L_0x02c2:
            if (r4 != 0) goto L_0x02c5
            goto L_0x02c0
        L_0x02c5:
            r4 = 1
            goto L_0x0022
        L_0x02c8:
            r0 = move-exception
            goto L_0x02dd
        L_0x02ca:
            r0 = move-exception
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r2 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException     // Catch:{ all -> 0x02c8 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x02c8 }
            r2.<init>(r0)     // Catch:{ all -> 0x02c8 }
            r2.mo35656a(r1)     // Catch:{ all -> 0x02c8 }
            throw r2     // Catch:{ all -> 0x02c8 }
        L_0x02d8:
            r0 = move-exception
            r0.mo35656a(r1)     // Catch:{ all -> 0x02c8 }
            throw r0     // Catch:{ all -> 0x02c8 }
        L_0x02dd:
            r2 = r7 & 32
            r4 = 32
            if (r2 != r4) goto L_0x02eb
            java.util.List<java.lang.Integer> r2 = r1.f26833n
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.f26833n = r2
        L_0x02eb:
            r2 = r7 & 8
            if (r2 != r15) goto L_0x02f7
            java.util.List<kotlin.h0.u.e.k0.d.l0> r2 = r1.f26831l
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.f26831l = r2
        L_0x02f7:
            r2 = r7 & 16
            r4 = 16
            if (r2 != r4) goto L_0x0305
            java.util.List<kotlin.h0.u.e.k0.d.g0> r2 = r1.f26832m
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.f26832m = r2
        L_0x0305:
            r2 = r7 & 64
            r4 = 64
            if (r2 != r4) goto L_0x0313
            java.util.List<java.lang.Integer> r2 = r1.f26835p
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.f26835p = r2
        L_0x0313:
            r2 = r7 & 128(0x80, float:1.794E-43)
            r4 = 128(0x80, float:1.794E-43)
            if (r2 != r4) goto L_0x0321
            java.util.List<kotlin.h0.u.e.k0.d.h> r2 = r1.f26837r
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.f26837r = r2
        L_0x0321:
            r2 = r7 & 256(0x100, float:3.59E-43)
            r4 = 256(0x100, float:3.59E-43)
            if (r2 != r4) goto L_0x032f
            java.util.List<kotlin.h0.u.e.k0.d.r> r2 = r1.f26838s
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.f26838s = r2
        L_0x032f:
            r2 = r7 & 512(0x200, float:7.175E-43)
            if (r2 != r10) goto L_0x033b
            java.util.List<kotlin.h0.u.e.k0.d.z> r2 = r1.f26839t
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.f26839t = r2
        L_0x033b:
            r2 = r7 & 1024(0x400, float:1.435E-42)
            if (r2 != r9) goto L_0x0347
            java.util.List<kotlin.h0.u.e.k0.d.i0> r2 = r1.f26840u
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.f26840u = r2
        L_0x0347:
            r2 = r7 & 2048(0x800, float:2.87E-42)
            if (r2 != r8) goto L_0x0353
            java.util.List<kotlin.h0.u.e.k0.d.n> r2 = r1.f26841v
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.f26841v = r2
        L_0x0353:
            r2 = r7 & 4096(0x1000, float:5.74E-42)
            if (r2 != r14) goto L_0x035f
            java.util.List<java.lang.Integer> r2 = r1.f26842w
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.f26842w = r2
        L_0x035f:
            r2 = r7 & 16384(0x4000, float:2.2959E-41)
            if (r2 != r13) goto L_0x036b
            java.util.List<java.lang.Integer> r2 = r1.f26845z
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.f26845z = r2
        L_0x036b:
            r5.mo35614a()     // Catch:{ IOException -> 0x036e, all -> 0x0375 }
        L_0x036e:
            kotlin.reflect.jvm.internal.impl.protobuf.d r2 = r3.mo35696a()
            r1.f26826g = r2
            goto L_0x037e
        L_0x0375:
            r0 = move-exception
            r2 = r0
            kotlin.reflect.jvm.internal.impl.protobuf.d r0 = r3.mo35696a()
            r1.f26826g = r0
            throw r2
        L_0x037e:
            r17.mo35760h()
            throw r0
        L_0x0382:
            r0 = r7 & 32
            r2 = 32
            if (r0 != r2) goto L_0x0390
            java.util.List<java.lang.Integer> r0 = r1.f26833n
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r1.f26833n = r0
        L_0x0390:
            r0 = r7 & 8
            if (r0 != r15) goto L_0x039c
            java.util.List<kotlin.h0.u.e.k0.d.l0> r0 = r1.f26831l
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r1.f26831l = r0
        L_0x039c:
            r0 = r7 & 16
            r2 = 16
            if (r0 != r2) goto L_0x03aa
            java.util.List<kotlin.h0.u.e.k0.d.g0> r0 = r1.f26832m
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r1.f26832m = r0
        L_0x03aa:
            r0 = r7 & 64
            r2 = 64
            if (r0 != r2) goto L_0x03b8
            java.util.List<java.lang.Integer> r0 = r1.f26835p
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r1.f26835p = r0
        L_0x03b8:
            r0 = r7 & 128(0x80, float:1.794E-43)
            r2 = 128(0x80, float:1.794E-43)
            if (r0 != r2) goto L_0x03c6
            java.util.List<kotlin.h0.u.e.k0.d.h> r0 = r1.f26837r
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r1.f26837r = r0
        L_0x03c6:
            r0 = r7 & 256(0x100, float:3.59E-43)
            r2 = 256(0x100, float:3.59E-43)
            if (r0 != r2) goto L_0x03d4
            java.util.List<kotlin.h0.u.e.k0.d.r> r0 = r1.f26838s
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r1.f26838s = r0
        L_0x03d4:
            r0 = r7 & 512(0x200, float:7.175E-43)
            if (r0 != r10) goto L_0x03e0
            java.util.List<kotlin.h0.u.e.k0.d.z> r0 = r1.f26839t
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r1.f26839t = r0
        L_0x03e0:
            r0 = r7 & 1024(0x400, float:1.435E-42)
            if (r0 != r9) goto L_0x03ec
            java.util.List<kotlin.h0.u.e.k0.d.i0> r0 = r1.f26840u
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r1.f26840u = r0
        L_0x03ec:
            r0 = r7 & 2048(0x800, float:2.87E-42)
            if (r0 != r8) goto L_0x03f8
            java.util.List<kotlin.h0.u.e.k0.d.n> r0 = r1.f26841v
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r1.f26841v = r0
        L_0x03f8:
            r0 = r7 & 4096(0x1000, float:5.74E-42)
            if (r0 != r14) goto L_0x0404
            java.util.List<java.lang.Integer> r0 = r1.f26842w
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r1.f26842w = r0
        L_0x0404:
            r0 = r7 & 16384(0x4000, float:2.2959E-41)
            if (r0 != r13) goto L_0x0410
            java.util.List<java.lang.Integer> r0 = r1.f26845z
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            r1.f26845z = r0
        L_0x0410:
            r5.mo35614a()     // Catch:{ IOException -> 0x0413, all -> 0x041a }
        L_0x0413:
            kotlin.reflect.jvm.internal.impl.protobuf.d r0 = r3.mo35696a()
            r1.f26826g = r0
            goto L_0x0423
        L_0x041a:
            r0 = move-exception
            r2 = r0
            kotlin.reflect.jvm.internal.impl.protobuf.d r0 = r3.mo35696a()
            r1.f26826g = r0
            throw r2
        L_0x0423:
            r17.mo35760h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p045h0.p046u.p047e.p048k0.p240d.C9775f.<init>(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):void");
    }

    /* renamed from: a */
    public static C9775f m31742a(InputStream inputStream, C10422f fVar) throws IOException {
        return f26822E.mo35665a(inputStream, fVar);
    }
}
