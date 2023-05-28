package kotlin.p045h0.p046u.p047e.p048k0.p240d;

import com.google.android.gms.ads.AdRequest;
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
import kotlin.reflect.jvm.internal.impl.protobuf.C10436i;
import kotlin.reflect.jvm.internal.impl.protobuf.C10449o;
import kotlin.reflect.jvm.internal.impl.protobuf.C10452q;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* renamed from: kotlin.h0.u.e.k0.d.b */
/* compiled from: ProtoBuf */
public final class C9748b extends C10427h implements C9771e {

    /* renamed from: l */
    private static final C9748b f26721l;

    /* renamed from: m */
    public static C10452q<C9748b> f26722m = new C9749a();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C10417d f26723f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f26724g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f26725h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public List<C9750b> f26726i;

    /* renamed from: j */
    private byte f26727j;

    /* renamed from: k */
    private int f26728k;

    /* renamed from: kotlin.h0.u.e.k0.d.b$a */
    /* compiled from: ProtoBuf */
    static class C9749a extends C10413b<C9748b> {
        C9749a() {
        }

        /* renamed from: a */
        public C9748b m31469a(C10420e eVar, C10422f fVar) throws InvalidProtocolBufferException {
            return new C9748b(eVar, fVar);
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.d.b$b */
    /* compiled from: ProtoBuf */
    public static final class C9750b extends C10427h implements C9769d {

        /* renamed from: l */
        private static final C9750b f26729l;

        /* renamed from: m */
        public static C10452q<C9750b> f26730m = new C9751a();
        /* access modifiers changed from: private */

        /* renamed from: f */
        public final C10417d f26731f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public int f26732g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public int f26733h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public C9753c f26734i;

        /* renamed from: j */
        private byte f26735j;

        /* renamed from: k */
        private int f26736k;

        /* renamed from: kotlin.h0.u.e.k0.d.b$b$a */
        /* compiled from: ProtoBuf */
        static class C9751a extends C10413b<C9750b> {
            C9751a() {
            }

            /* renamed from: a */
            public C9750b m31492a(C10420e eVar, C10422f fVar) throws InvalidProtocolBufferException {
                return new C9750b(eVar, fVar);
            }
        }

        /* renamed from: kotlin.h0.u.e.k0.d.b$b$c */
        /* compiled from: ProtoBuf */
        public static final class C9753c extends C10427h implements C9767c {

            /* renamed from: u */
            private static final C9753c f26740u;

            /* renamed from: v */
            public static C10452q<C9753c> f26741v = new C9754a();
            /* access modifiers changed from: private */

            /* renamed from: f */
            public final C10417d f26742f;
            /* access modifiers changed from: private */

            /* renamed from: g */
            public int f26743g;
            /* access modifiers changed from: private */

            /* renamed from: h */
            public C9756c f26744h;
            /* access modifiers changed from: private */

            /* renamed from: i */
            public long f26745i;
            /* access modifiers changed from: private */

            /* renamed from: j */
            public float f26746j;
            /* access modifiers changed from: private */

            /* renamed from: k */
            public double f26747k;
            /* access modifiers changed from: private */

            /* renamed from: l */
            public int f26748l;
            /* access modifiers changed from: private */

            /* renamed from: m */
            public int f26749m;
            /* access modifiers changed from: private */

            /* renamed from: n */
            public int f26750n;
            /* access modifiers changed from: private */

            /* renamed from: o */
            public C9748b f26751o;
            /* access modifiers changed from: private */

            /* renamed from: p */
            public List<C9753c> f26752p;
            /* access modifiers changed from: private */

            /* renamed from: q */
            public int f26753q;
            /* access modifiers changed from: private */

            /* renamed from: r */
            public int f26754r;

            /* renamed from: s */
            private byte f26755s;

            /* renamed from: t */
            private int f26756t;

            /* renamed from: kotlin.h0.u.e.k0.d.b$b$c$a */
            /* compiled from: ProtoBuf */
            static class C9754a extends C10413b<C9753c> {
                C9754a() {
                }

                /* renamed from: a */
                public C9753c m31563a(C10420e eVar, C10422f fVar) throws InvalidProtocolBufferException {
                    return new C9753c(eVar, fVar);
                }
            }

            /* renamed from: kotlin.h0.u.e.k0.d.b$b$c$c */
            /* compiled from: ProtoBuf */
            public enum C9756c implements C10436i.C10437a {
                BYTE(0, 0),
                CHAR(1, 1),
                SHORT(2, 2),
                INT(3, 3),
                LONG(4, 4),
                FLOAT(5, 5),
                DOUBLE(6, 6),
                BOOLEAN(7, 7),
                STRING(8, 8),
                CLASS(9, 9),
                ENUM(10, 10),
                ANNOTATION(11, 11),
                ARRAY(12, 12);
                

                /* renamed from: f */
                private final int f26783f;

                /* renamed from: kotlin.h0.u.e.k0.d.b$b$c$c$a */
                /* compiled from: ProtoBuf */
                static class C9757a implements C10436i.C10438b<C9756c> {
                    C9757a() {
                    }

                    /* renamed from: a */
                    public C9756c m31596a(int i) {
                        return C9756c.m31593a(i);
                    }
                }

                static {
                    new C9757a();
                }

                private C9756c(int i, int i2) {
                    this.f26783f = i2;
                }

                /* renamed from: a */
                public static C9756c m31593a(int i) {
                    switch (i) {
                        case 0:
                            return BYTE;
                        case 1:
                            return CHAR;
                        case 2:
                            return SHORT;
                        case 3:
                            return INT;
                        case 4:
                            return LONG;
                        case 5:
                            return FLOAT;
                        case 6:
                            return DOUBLE;
                        case 7:
                            return BOOLEAN;
                        case 8:
                            return STRING;
                        case 9:
                            return CLASS;
                        case 10:
                            return ENUM;
                        case 11:
                            return ANNOTATION;
                        case 12:
                            return ARRAY;
                        default:
                            return null;
                    }
                }

                /* renamed from: b */
                public final int mo34424b() {
                    return this.f26783f;
                }
            }

            static {
                C9753c cVar = new C9753c(true);
                f26740u = cVar;
                cVar.m31513H();
            }

            /* renamed from: G */
            public static C9753c m31512G() {
                return f26740u;
            }

            /* renamed from: H */
            private void m31513H() {
                this.f26744h = C9756c.BYTE;
                this.f26745i = 0;
                this.f26746j = 0.0f;
                this.f26747k = 0.0d;
                this.f26748l = 0;
                this.f26749m = 0;
                this.f26750n = 0;
                this.f26751o = C9748b.m31451m();
                this.f26752p = Collections.emptyList();
                this.f26753q = 0;
                this.f26754r = 0;
            }

            /* renamed from: I */
            public static C9755b m31514I() {
                return C9755b.m31565n();
            }

            /* renamed from: A */
            public boolean mo34385A() {
                return (this.f26743g & 64) == 64;
            }

            /* renamed from: B */
            public boolean mo34386B() {
                return (this.f26743g & AdRequest.MAX_CONTENT_URL_LENGTH) == 512;
            }

            /* renamed from: C */
            public boolean mo34387C() {
                return (this.f26743g & 4) == 4;
            }

            /* renamed from: D */
            public boolean mo34388D() {
                return (this.f26743g & 2) == 2;
            }

            /* renamed from: E */
            public boolean mo34389E() {
                return (this.f26743g & 16) == 16;
            }

            /* renamed from: F */
            public boolean mo34390F() {
                return (this.f26743g & 1) == 1;
            }

            /* renamed from: g */
            public C10452q<C9753c> mo34363g() {
                return f26741v;
            }

            /* renamed from: i */
            public C9748b mo34392i() {
                return this.f26751o;
            }

            public final boolean isInitialized() {
                byte b = this.f26755s;
                if (b == 1) {
                    return true;
                }
                if (b == 0) {
                    return false;
                }
                if (!mo34404u() || mo34392i().isInitialized()) {
                    for (int i = 0; i < mo34394k(); i++) {
                        if (!mo34391a(i).isInitialized()) {
                            this.f26755s = 0;
                            return false;
                        }
                    }
                    this.f26755s = 1;
                    return true;
                }
                this.f26755s = 0;
                return false;
            }

            /* renamed from: j */
            public int mo34393j() {
                return this.f26753q;
            }

            /* renamed from: k */
            public int mo34394k() {
                return this.f26752p.size();
            }

            /* renamed from: l */
            public List<C9753c> mo34395l() {
                return this.f26752p;
            }

            /* renamed from: m */
            public int mo34396m() {
                return this.f26749m;
            }

            /* renamed from: n */
            public double mo34397n() {
                return this.f26747k;
            }

            /* renamed from: o */
            public int mo34398o() {
                return this.f26750n;
            }

            /* renamed from: p */
            public int mo34399p() {
                return this.f26754r;
            }

            /* renamed from: q */
            public float mo34400q() {
                return this.f26746j;
            }

            /* renamed from: r */
            public long mo34401r() {
                return this.f26745i;
            }

            /* renamed from: s */
            public int mo34402s() {
                return this.f26748l;
            }

            /* renamed from: t */
            public C9756c mo34403t() {
                return this.f26744h;
            }

            /* renamed from: u */
            public boolean mo34404u() {
                return (this.f26743g & 128) == 128;
            }

            /* renamed from: v */
            public boolean mo34405v() {
                return (this.f26743g & 256) == 256;
            }

            /* renamed from: w */
            public boolean mo34406w() {
                return (this.f26743g & 32) == 32;
            }

            /* renamed from: z */
            public boolean mo34407z() {
                return (this.f26743g & 8) == 8;
            }

            /* renamed from: kotlin.h0.u.e.k0.d.b$b$c$b */
            /* compiled from: ProtoBuf */
            public static final class C9755b extends C10427h.C10429b<C9753c, C9755b> implements C9767c {

                /* renamed from: g */
                private int f26757g;

                /* renamed from: h */
                private C9756c f26758h = C9756c.BYTE;

                /* renamed from: i */
                private long f26759i;

                /* renamed from: j */
                private float f26760j;

                /* renamed from: k */
                private double f26761k;

                /* renamed from: l */
                private int f26762l;

                /* renamed from: m */
                private int f26763m;

                /* renamed from: n */
                private int f26764n;

                /* renamed from: o */
                private C9748b f26765o = C9748b.m31451m();

                /* renamed from: p */
                private List<C9753c> f26766p = Collections.emptyList();

                /* renamed from: q */
                private int f26767q;

                /* renamed from: r */
                private int f26768r;

                private C9755b() {
                    m31567r();
                }

                /* access modifiers changed from: private */
                /* renamed from: n */
                public static C9755b m31565n() {
                    return new C9755b();
                }

                /* renamed from: q */
                private void m31566q() {
                    if ((this.f26757g & 256) != 256) {
                        this.f26766p = new ArrayList(this.f26766p);
                        this.f26757g |= 256;
                    }
                }

                /* renamed from: r */
                private void m31567r() {
                }

                /* renamed from: c */
                public C9755b mo34416c(int i) {
                    this.f26757g |= 32;
                    this.f26763m = i;
                    return this;
                }

                /* renamed from: d */
                public C9755b mo34417d(int i) {
                    this.f26757g |= 64;
                    this.f26764n = i;
                    return this;
                }

                /* renamed from: e */
                public C9755b mo34418e(int i) {
                    this.f26757g |= 1024;
                    this.f26768r = i;
                    return this;
                }

                /* renamed from: f */
                public C9755b mo34419f(int i) {
                    this.f26757g |= 16;
                    this.f26762l = i;
                    return this;
                }

                /* renamed from: i */
                public C9753c mo34420i() {
                    C9753c cVar = new C9753c((C10427h.C10429b) this);
                    int i = this.f26757g;
                    int i2 = 1;
                    if ((i & 1) != 1) {
                        i2 = 0;
                    }
                    C9756c unused = cVar.f26744h = this.f26758h;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    long unused2 = cVar.f26745i = this.f26759i;
                    if ((i & 4) == 4) {
                        i2 |= 4;
                    }
                    float unused3 = cVar.f26746j = this.f26760j;
                    if ((i & 8) == 8) {
                        i2 |= 8;
                    }
                    double unused4 = cVar.f26747k = this.f26761k;
                    if ((i & 16) == 16) {
                        i2 |= 16;
                    }
                    int unused5 = cVar.f26748l = this.f26762l;
                    if ((i & 32) == 32) {
                        i2 |= 32;
                    }
                    int unused6 = cVar.f26749m = this.f26763m;
                    if ((i & 64) == 64) {
                        i2 |= 64;
                    }
                    int unused7 = cVar.f26750n = this.f26764n;
                    if ((i & 128) == 128) {
                        i2 |= 128;
                    }
                    C9748b unused8 = cVar.f26751o = this.f26765o;
                    if ((this.f26757g & 256) == 256) {
                        this.f26766p = Collections.unmodifiableList(this.f26766p);
                        this.f26757g &= -257;
                    }
                    List unused9 = cVar.f26752p = this.f26766p;
                    if ((i & AdRequest.MAX_CONTENT_URL_LENGTH) == 512) {
                        i2 |= 256;
                    }
                    int unused10 = cVar.f26753q = this.f26767q;
                    if ((i & 1024) == 1024) {
                        i2 |= AdRequest.MAX_CONTENT_URL_LENGTH;
                    }
                    int unused11 = cVar.f26754r = this.f26768r;
                    int unused12 = cVar.f26743g = i2;
                    return cVar;
                }

                public final boolean isInitialized() {
                    if (mo34423l() && !mo34421j().isInitialized()) {
                        return false;
                    }
                    for (int i = 0; i < mo34422k(); i++) {
                        if (!mo34414a(i).isInitialized()) {
                            return false;
                        }
                    }
                    return true;
                }

                /* renamed from: j */
                public C9748b mo34421j() {
                    return this.f26765o;
                }

                /* renamed from: k */
                public int mo34422k() {
                    return this.f26766p.size();
                }

                /* renamed from: l */
                public boolean mo34423l() {
                    return (this.f26757g & 128) == 128;
                }

                /* renamed from: a */
                public /* bridge */ /* synthetic */ C10427h.C10429b mo34379a(C10427h hVar) {
                    mo34412a((C9753c) hVar);
                    return this;
                }

                /* renamed from: b */
                public C9753c m31584b() {
                    return C9753c.m31512G();
                }

                public C9755b clone() {
                    C9755b n = m31565n();
                    n.mo34412a(mo34420i());
                    return n;
                }

                /* renamed from: b */
                public C9755b mo34415b(int i) {
                    this.f26757g |= AdRequest.MAX_CONTENT_URL_LENGTH;
                    this.f26767q = i;
                    return this;
                }

                /* renamed from: a */
                public C9753c m31580a() {
                    C9753c i = mo34420i();
                    if (i.isInitialized()) {
                        return i;
                    }
                    throw C10410a.C10411a.m35207a(i);
                }

                /* renamed from: a */
                public C9755b mo34412a(C9753c cVar) {
                    if (cVar == C9753c.m31512G()) {
                        return this;
                    }
                    if (cVar.mo34390F()) {
                        mo34411a(cVar.mo34403t());
                    }
                    if (cVar.mo34388D()) {
                        mo34410a(cVar.mo34401r());
                    }
                    if (cVar.mo34387C()) {
                        mo34409a(cVar.mo34400q());
                    }
                    if (cVar.mo34407z()) {
                        mo34408a(cVar.mo34397n());
                    }
                    if (cVar.mo34389E()) {
                        mo34419f(cVar.mo34402s());
                    }
                    if (cVar.mo34406w()) {
                        mo34416c(cVar.mo34396m());
                    }
                    if (cVar.mo34385A()) {
                        mo34417d(cVar.mo34398o());
                    }
                    if (cVar.mo34404u()) {
                        mo34413a(cVar.mo34392i());
                    }
                    if (!cVar.f26752p.isEmpty()) {
                        if (this.f26766p.isEmpty()) {
                            this.f26766p = cVar.f26752p;
                            this.f26757g &= -257;
                        } else {
                            m31566q();
                            this.f26766p.addAll(cVar.f26752p);
                        }
                    }
                    if (cVar.mo34405v()) {
                        mo34415b(cVar.mo34393j());
                    }
                    if (cVar.mo34386B()) {
                        mo34418e(cVar.mo34399p());
                    }
                    mo35761a(mo35762h().mo35686b(cVar.f26742f));
                    return this;
                }

                /* renamed from: a */
                public C9755b mo34377a(C10420e eVar, C10422f fVar) throws IOException {
                    C9753c cVar;
                    C9753c cVar2 = null;
                    try {
                        C9753c a = C9753c.f26741v.mo34369a(eVar, fVar);
                        if (a != null) {
                            mo34412a(a);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        cVar = (C9753c) e.mo35657a();
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        cVar2 = cVar;
                    }
                    if (cVar2 != null) {
                        mo34412a(cVar2);
                    }
                    throw th;
                }

                /* renamed from: a */
                public C9755b mo34411a(C9756c cVar) {
                    if (cVar != null) {
                        this.f26757g |= 1;
                        this.f26758h = cVar;
                        return this;
                    }
                    throw null;
                }

                /* renamed from: a */
                public C9755b mo34410a(long j) {
                    this.f26757g |= 2;
                    this.f26759i = j;
                    return this;
                }

                /* renamed from: a */
                public C9755b mo34409a(float f) {
                    this.f26757g |= 4;
                    this.f26760j = f;
                    return this;
                }

                /* renamed from: a */
                public C9755b mo34408a(double d) {
                    this.f26757g |= 8;
                    this.f26761k = d;
                    return this;
                }

                /* renamed from: a */
                public C9755b mo34413a(C9748b bVar) {
                    if ((this.f26757g & 128) != 128 || this.f26765o == C9748b.m31451m()) {
                        this.f26765o = bVar;
                    } else {
                        C9758c c = C9748b.m31450c(this.f26765o);
                        c.mo34427a(bVar);
                        this.f26765o = c.mo34429i();
                    }
                    this.f26757g |= 128;
                    return this;
                }

                /* renamed from: a */
                public C9753c mo34414a(int i) {
                    return this.f26766p.get(i);
                }
            }

            /* renamed from: e */
            public int mo34361e() {
                int i = this.f26756t;
                if (i != -1) {
                    return i;
                }
                int e = (this.f26743g & 1) == 1 ? CodedOutputStream.m35132e(1, this.f26744h.mo34424b()) + 0 : 0;
                if ((this.f26743g & 2) == 2) {
                    e += CodedOutputStream.m35121b(2, this.f26745i);
                }
                if ((this.f26743g & 4) == 4) {
                    e += CodedOutputStream.m35120b(3, this.f26746j);
                }
                if ((this.f26743g & 8) == 8) {
                    e += CodedOutputStream.m35119b(4, this.f26747k);
                }
                if ((this.f26743g & 16) == 16) {
                    e += CodedOutputStream.m35133f(5, this.f26748l);
                }
                if ((this.f26743g & 32) == 32) {
                    e += CodedOutputStream.m35133f(6, this.f26749m);
                }
                if ((this.f26743g & 64) == 64) {
                    e += CodedOutputStream.m35133f(7, this.f26750n);
                }
                if ((this.f26743g & 128) == 128) {
                    e += CodedOutputStream.m35130d(8, (C10449o) this.f26751o);
                }
                for (int i2 = 0; i2 < this.f26752p.size(); i2++) {
                    e += CodedOutputStream.m35130d(9, (C10449o) this.f26752p.get(i2));
                }
                if ((this.f26743g & AdRequest.MAX_CONTENT_URL_LENGTH) == 512) {
                    e += CodedOutputStream.m35133f(10, this.f26754r);
                }
                if ((this.f26743g & 256) == 256) {
                    e += CodedOutputStream.m35133f(11, this.f26753q);
                }
                int size = e + this.f26742f.size();
                this.f26756t = size;
                return size;
            }

            private C9753c(C10427h.C10429b bVar) {
                super(bVar);
                this.f26755s = -1;
                this.f26756t = -1;
                this.f26742f = bVar.mo35762h();
            }

            /* renamed from: c */
            public static C9755b m31526c(C9753c cVar) {
                C9755b I = m31514I();
                I.mo34412a(cVar);
                return I;
            }

            /* renamed from: f */
            public C9755b m31544f() {
                return m31514I();
            }

            /* renamed from: b */
            public C9753c m31539b() {
                return f26740u;
            }

            /* renamed from: c */
            public C9755b m31541c() {
                return m31526c(this);
            }

            private C9753c(boolean z) {
                this.f26755s = -1;
                this.f26756t = -1;
                this.f26742f = C10417d.f28215f;
            }

            /* renamed from: a */
            public C9753c mo34391a(int i) {
                return this.f26752p.get(i);
            }

            /* renamed from: a */
            public void mo34358a(CodedOutputStream codedOutputStream) throws IOException {
                mo34361e();
                if ((this.f26743g & 1) == 1) {
                    codedOutputStream.mo35621a(1, this.f26744h.mo34424b());
                }
                if ((this.f26743g & 2) == 2) {
                    codedOutputStream.mo35622a(2, this.f26745i);
                }
                if ((this.f26743g & 4) == 4) {
                    codedOutputStream.mo35620a(3, this.f26746j);
                }
                if ((this.f26743g & 8) == 8) {
                    codedOutputStream.mo35619a(4, this.f26747k);
                }
                if ((this.f26743g & 16) == 16) {
                    codedOutputStream.mo35635b(5, this.f26748l);
                }
                if ((this.f26743g & 32) == 32) {
                    codedOutputStream.mo35635b(6, this.f26749m);
                }
                if ((this.f26743g & 64) == 64) {
                    codedOutputStream.mo35635b(7, this.f26750n);
                }
                if ((this.f26743g & 128) == 128) {
                    codedOutputStream.mo35636b(8, (C10449o) this.f26751o);
                }
                for (int i = 0; i < this.f26752p.size(); i++) {
                    codedOutputStream.mo35636b(9, (C10449o) this.f26752p.get(i));
                }
                if ((this.f26743g & AdRequest.MAX_CONTENT_URL_LENGTH) == 512) {
                    codedOutputStream.mo35635b(10, this.f26754r);
                }
                if ((this.f26743g & 256) == 256) {
                    codedOutputStream.mo35635b(11, this.f26753q);
                }
                codedOutputStream.mo35638b(this.f26742f);
            }

            private C9753c(C10420e eVar, C10422f fVar) throws InvalidProtocolBufferException {
                this.f26755s = -1;
                this.f26756t = -1;
                m31513H();
                C10417d.C10419b j = C10417d.m35229j();
                CodedOutputStream a = CodedOutputStream.m35116a((OutputStream) j, 1);
                boolean z = false;
                boolean z2 = false;
                while (!z) {
                    try {
                        int x = eVar.mo35733x();
                        switch (x) {
                            case 0:
                                z = true;
                                break;
                            case 8:
                                int f = eVar.mo35715f();
                                C9756c a2 = C9756c.m31593a(f);
                                if (a2 != null) {
                                    this.f26743g |= 1;
                                    this.f26744h = a2;
                                    break;
                                } else {
                                    a.mo35650f(x);
                                    a.mo35650f(f);
                                    break;
                                }
                            case 16:
                                this.f26743g |= 2;
                                this.f26745i = eVar.mo35730u();
                                break;
                            case 29:
                                this.f26743g |= 4;
                                this.f26746j = eVar.mo35718i();
                                break;
                            case 33:
                                this.f26743g |= 8;
                                this.f26747k = eVar.mo35714e();
                                break;
                            case 40:
                                this.f26743g |= 16;
                                this.f26748l = eVar.mo35719j();
                                break;
                            case 48:
                                this.f26743g |= 32;
                                this.f26749m = eVar.mo35719j();
                                break;
                            case 56:
                                this.f26743g |= 64;
                                this.f26750n = eVar.mo35719j();
                                break;
                            case 66:
                                C9758c c = (this.f26743g & 128) == 128 ? this.f26751o.m31459c() : null;
                                C9748b bVar = (C9748b) eVar.mo35702a(C9748b.f26722m, fVar);
                                this.f26751o = bVar;
                                if (c != null) {
                                    c.mo34427a(bVar);
                                    this.f26751o = c.mo34429i();
                                }
                                this.f26743g |= 128;
                                break;
                            case 74:
                                if (!(z2 & true)) {
                                    this.f26752p = new ArrayList();
                                    z2 |= true;
                                }
                                this.f26752p.add(eVar.mo35702a(f26741v, fVar));
                                break;
                            case 80:
                                this.f26743g |= AdRequest.MAX_CONTENT_URL_LENGTH;
                                this.f26754r = eVar.mo35719j();
                                break;
                            case 88:
                                this.f26743g |= 256;
                                this.f26753q = eVar.mo35719j();
                                break;
                            default:
                                if (mo35759a(eVar, a, fVar, x)) {
                                    break;
                                }
                                z = true;
                                break;
                        }
                    } catch (InvalidProtocolBufferException e) {
                        e.mo35656a(this);
                        throw e;
                    } catch (IOException e2) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
                        invalidProtocolBufferException.mo35656a(this);
                        throw invalidProtocolBufferException;
                    } catch (Throwable th) {
                        if (z2 & true) {
                            this.f26752p = Collections.unmodifiableList(this.f26752p);
                        }
                        try {
                            a.mo35614a();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.f26742f = j.mo35696a();
                            throw th2;
                        }
                        this.f26742f = j.mo35696a();
                        mo35760h();
                        throw th;
                    }
                }
                if (z2 & true) {
                    this.f26752p = Collections.unmodifiableList(this.f26752p);
                }
                try {
                    a.mo35614a();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.f26742f = j.mo35696a();
                    throw th3;
                }
                this.f26742f = j.mo35696a();
                mo35760h();
            }
        }

        static {
            C9750b bVar = new C9750b(true);
            f26729l = bVar;
            bVar.m31476n();
        }

        /* renamed from: m */
        public static C9750b m31475m() {
            return f26729l;
        }

        /* renamed from: n */
        private void m31476n() {
            this.f26733h = 0;
            this.f26734i = C9753c.m31512G();
        }

        /* renamed from: o */
        public static C9752b m31477o() {
            return C9752b.m31494n();
        }

        /* renamed from: e */
        public int mo34361e() {
            int i = this.f26736k;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.f26732g & 1) == 1) {
                i2 = 0 + CodedOutputStream.m35133f(1, this.f26733h);
            }
            if ((this.f26732g & 2) == 2) {
                i2 += CodedOutputStream.m35130d(2, (C10449o) this.f26734i);
            }
            int size = i2 + this.f26731f.size();
            this.f26736k = size;
            return size;
        }

        /* renamed from: g */
        public C10452q<C9750b> mo34363g() {
            return f26730m;
        }

        /* renamed from: i */
        public int mo34370i() {
            return this.f26733h;
        }

        public final boolean isInitialized() {
            byte b = this.f26735j;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!mo34372k()) {
                this.f26735j = 0;
                return false;
            } else if (!mo34373l()) {
                this.f26735j = 0;
                return false;
            } else if (!mo34371j().isInitialized()) {
                this.f26735j = 0;
                return false;
            } else {
                this.f26735j = 1;
                return true;
            }
        }

        /* renamed from: j */
        public C9753c mo34371j() {
            return this.f26734i;
        }

        /* renamed from: k */
        public boolean mo34372k() {
            return (this.f26732g & 1) == 1;
        }

        /* renamed from: l */
        public boolean mo34373l() {
            return (this.f26732g & 2) == 2;
        }

        /* renamed from: kotlin.h0.u.e.k0.d.b$b$b */
        /* compiled from: ProtoBuf */
        public static final class C9752b extends C10427h.C10429b<C9750b, C9752b> implements C9769d {

            /* renamed from: g */
            private int f26737g;

            /* renamed from: h */
            private int f26738h;

            /* renamed from: i */
            private C9753c f26739i = C9753c.m31512G();

            private C9752b() {
                m31495q();
            }

            /* access modifiers changed from: private */
            /* renamed from: n */
            public static C9752b m31494n() {
                return new C9752b();
            }

            /* renamed from: q */
            private void m31495q() {
            }

            /* renamed from: i */
            public C9750b mo34381i() {
                C9750b bVar = new C9750b((C10427h.C10429b) this);
                int i = this.f26737g;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                int unused = bVar.f26733h = this.f26738h;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                C9753c unused2 = bVar.f26734i = this.f26739i;
                int unused3 = bVar.f26732g = i2;
                return bVar;
            }

            public final boolean isInitialized() {
                if (mo34383k() && mo34384l() && mo34382j().isInitialized()) {
                    return true;
                }
                return false;
            }

            /* renamed from: j */
            public C9753c mo34382j() {
                return this.f26739i;
            }

            /* renamed from: k */
            public boolean mo34383k() {
                return (this.f26737g & 1) == 1;
            }

            /* renamed from: l */
            public boolean mo34384l() {
                return (this.f26737g & 2) == 2;
            }

            /* renamed from: a */
            public /* bridge */ /* synthetic */ C10427h.C10429b mo34379a(C10427h hVar) {
                mo34376a((C9750b) hVar);
                return this;
            }

            /* renamed from: b */
            public C9750b m31507b() {
                return C9750b.m31475m();
            }

            public C9752b clone() {
                C9752b n = m31494n();
                n.mo34376a(mo34381i());
                return n;
            }

            /* renamed from: a */
            public C9750b m31504a() {
                C9750b i = mo34381i();
                if (i.isInitialized()) {
                    return i;
                }
                throw C10410a.C10411a.m35207a(i);
            }

            /* renamed from: a */
            public C9752b mo34376a(C9750b bVar) {
                if (bVar == C9750b.m31475m()) {
                    return this;
                }
                if (bVar.mo34372k()) {
                    mo34374a(bVar.mo34370i());
                }
                if (bVar.mo34373l()) {
                    mo34375a(bVar.mo34371j());
                }
                mo35761a(mo35762h().mo35686b(bVar.f26731f));
                return this;
            }

            /* renamed from: a */
            public C9752b mo34377a(C10420e eVar, C10422f fVar) throws IOException {
                C9750b bVar;
                C9750b bVar2 = null;
                try {
                    C9750b a = C9750b.f26730m.mo34369a(eVar, fVar);
                    if (a != null) {
                        mo34376a(a);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    bVar = (C9750b) e.mo35657a();
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    bVar2 = bVar;
                }
                if (bVar2 != null) {
                    mo34376a(bVar2);
                }
                throw th;
            }

            /* renamed from: a */
            public C9752b mo34374a(int i) {
                this.f26737g |= 1;
                this.f26738h = i;
                return this;
            }

            /* renamed from: a */
            public C9752b mo34375a(C9753c cVar) {
                if ((this.f26737g & 2) != 2 || this.f26739i == C9753c.m31512G()) {
                    this.f26739i = cVar;
                } else {
                    C9753c.C9755b c = C9753c.m31526c(this.f26739i);
                    c.mo34412a(cVar);
                    this.f26739i = c.mo34420i();
                }
                this.f26737g |= 2;
                return this;
            }
        }

        /* renamed from: c */
        public C9752b m31482c() {
            return m31474b(this);
        }

        /* renamed from: f */
        public C9752b m31485f() {
            return m31477o();
        }

        private C9750b(C10427h.C10429b bVar) {
            super(bVar);
            this.f26735j = -1;
            this.f26736k = -1;
            this.f26731f = bVar.mo35762h();
        }

        /* renamed from: b */
        public C9750b m31480b() {
            return f26729l;
        }

        /* renamed from: b */
        public static C9752b m31474b(C9750b bVar) {
            C9752b o = m31477o();
            o.mo34376a(bVar);
            return o;
        }

        /* renamed from: a */
        public void mo34358a(CodedOutputStream codedOutputStream) throws IOException {
            mo34361e();
            if ((this.f26732g & 1) == 1) {
                codedOutputStream.mo35635b(1, this.f26733h);
            }
            if ((this.f26732g & 2) == 2) {
                codedOutputStream.mo35636b(2, (C10449o) this.f26734i);
            }
            codedOutputStream.mo35638b(this.f26731f);
        }

        private C9750b(boolean z) {
            this.f26735j = -1;
            this.f26736k = -1;
            this.f26731f = C10417d.f28215f;
        }

        private C9750b(C10420e eVar, C10422f fVar) throws InvalidProtocolBufferException {
            this.f26735j = -1;
            this.f26736k = -1;
            m31476n();
            C10417d.C10419b j = C10417d.m35229j();
            CodedOutputStream a = CodedOutputStream.m35116a((OutputStream) j, 1);
            boolean z = false;
            while (!z) {
                try {
                    int x = eVar.mo35733x();
                    if (x != 0) {
                        if (x == 8) {
                            this.f26732g |= 1;
                            this.f26733h = eVar.mo35719j();
                        } else if (x == 18) {
                            C9753c.C9755b c = (this.f26732g & 2) == 2 ? this.f26734i.m31541c() : null;
                            C9753c cVar = (C9753c) eVar.mo35702a(C9753c.f26741v, fVar);
                            this.f26734i = cVar;
                            if (c != null) {
                                c.mo34412a(cVar);
                                this.f26734i = c.mo34420i();
                            }
                            this.f26732g |= 2;
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
                        this.f26731f = j.mo35696a();
                        throw th2;
                    }
                    this.f26731f = j.mo35696a();
                    mo35760h();
                    throw th;
                }
            }
            try {
                a.mo35614a();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f26731f = j.mo35696a();
                throw th3;
            }
            this.f26731f = j.mo35696a();
            mo35760h();
        }
    }

    static {
        C9748b bVar = new C9748b(true);
        f26721l = bVar;
        bVar.m31452n();
    }

    /* renamed from: m */
    public static C9748b m31451m() {
        return f26721l;
    }

    /* renamed from: n */
    private void m31452n() {
        this.f26725h = 0;
        this.f26726i = Collections.emptyList();
    }

    /* renamed from: o */
    public static C9758c m31453o() {
        return C9758c.m31598m();
    }

    /* renamed from: e */
    public int mo34361e() {
        int i = this.f26728k;
        if (i != -1) {
            return i;
        }
        int f = (this.f26724g & 1) == 1 ? CodedOutputStream.m35133f(1, this.f26725h) + 0 : 0;
        for (int i2 = 0; i2 < this.f26726i.size(); i2++) {
            f += CodedOutputStream.m35130d(2, (C10449o) this.f26726i.get(i2));
        }
        int size = f + this.f26723f.size();
        this.f26728k = size;
        return size;
    }

    /* renamed from: g */
    public C10452q<C9748b> mo34363g() {
        return f26722m;
    }

    /* renamed from: i */
    public int mo34364i() {
        return this.f26726i.size();
    }

    public final boolean isInitialized() {
        byte b = this.f26727j;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if (!mo34368l()) {
            this.f26727j = 0;
            return false;
        }
        for (int i = 0; i < mo34364i(); i++) {
            if (!mo34357a(i).isInitialized()) {
                this.f26727j = 0;
                return false;
            }
        }
        this.f26727j = 1;
        return true;
    }

    /* renamed from: j */
    public List<C9750b> mo34366j() {
        return this.f26726i;
    }

    /* renamed from: k */
    public int mo34367k() {
        return this.f26725h;
    }

    /* renamed from: l */
    public boolean mo34368l() {
        return (this.f26724g & 1) == 1;
    }

    /* renamed from: kotlin.h0.u.e.k0.d.b$c */
    /* compiled from: ProtoBuf */
    public static final class C9758c extends C10427h.C10429b<C9748b, C9758c> implements C9771e {

        /* renamed from: g */
        private int f26784g;

        /* renamed from: h */
        private int f26785h;

        /* renamed from: i */
        private List<C9750b> f26786i = Collections.emptyList();

        private C9758c() {
            m31600q();
        }

        /* access modifiers changed from: private */
        /* renamed from: m */
        public static C9758c m31598m() {
            return new C9758c();
        }

        /* renamed from: n */
        private void m31599n() {
            if ((this.f26784g & 2) != 2) {
                this.f26786i = new ArrayList(this.f26786i);
                this.f26784g |= 2;
            }
        }

        /* renamed from: q */
        private void m31600q() {
        }

        /* renamed from: i */
        public C9748b mo34429i() {
            C9748b bVar = new C9748b((C10427h.C10429b) this);
            int i = 1;
            if ((this.f26784g & 1) != 1) {
                i = 0;
            }
            int unused = bVar.f26725h = this.f26785h;
            if ((this.f26784g & 2) == 2) {
                this.f26786i = Collections.unmodifiableList(this.f26786i);
                this.f26784g &= -3;
            }
            List unused2 = bVar.f26726i = this.f26786i;
            int unused3 = bVar.f26724g = i;
            return bVar;
        }

        public final boolean isInitialized() {
            if (!mo34431k()) {
                return false;
            }
            for (int i = 0; i < mo34430j(); i++) {
                if (!mo34426a(i).isInitialized()) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: j */
        public int mo34430j() {
            return this.f26786i.size();
        }

        /* renamed from: k */
        public boolean mo34431k() {
            return (this.f26784g & 1) == 1;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ C10427h.C10429b mo34379a(C10427h hVar) {
            mo34427a((C9748b) hVar);
            return this;
        }

        /* renamed from: b */
        public C9748b m31612b() {
            return C9748b.m31451m();
        }

        public C9758c clone() {
            C9758c m = m31598m();
            m.mo34427a(mo34429i());
            return m;
        }

        /* renamed from: b */
        public C9758c mo34428b(int i) {
            this.f26784g |= 1;
            this.f26785h = i;
            return this;
        }

        /* renamed from: a */
        public C9748b m31608a() {
            C9748b i = mo34429i();
            if (i.isInitialized()) {
                return i;
            }
            throw C10410a.C10411a.m35207a(i);
        }

        /* renamed from: a */
        public C9758c mo34427a(C9748b bVar) {
            if (bVar == C9748b.m31451m()) {
                return this;
            }
            if (bVar.mo34368l()) {
                mo34428b(bVar.mo34367k());
            }
            if (!bVar.f26726i.isEmpty()) {
                if (this.f26786i.isEmpty()) {
                    this.f26786i = bVar.f26726i;
                    this.f26784g &= -3;
                } else {
                    m31599n();
                    this.f26786i.addAll(bVar.f26726i);
                }
            }
            mo35761a(mo35762h().mo35686b(bVar.f26723f));
            return this;
        }

        /* renamed from: a */
        public C9758c mo34377a(C10420e eVar, C10422f fVar) throws IOException {
            C9748b bVar;
            C9748b bVar2 = null;
            try {
                C9748b a = C9748b.f26722m.mo34369a(eVar, fVar);
                if (a != null) {
                    mo34427a(a);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                bVar = (C9748b) e.mo35657a();
                throw e;
            } catch (Throwable th) {
                th = th;
                bVar2 = bVar;
            }
            if (bVar2 != null) {
                mo34427a(bVar2);
            }
            throw th;
        }

        /* renamed from: a */
        public C9750b mo34426a(int i) {
            return this.f26786i.get(i);
        }
    }

    /* renamed from: c */
    public static C9758c m31450c(C9748b bVar) {
        C9758c o = m31453o();
        o.mo34427a(bVar);
        return o;
    }

    /* renamed from: f */
    public C9758c m31462f() {
        return m31453o();
    }

    private C9748b(C10427h.C10429b bVar) {
        super(bVar);
        this.f26727j = -1;
        this.f26728k = -1;
        this.f26723f = bVar.mo35762h();
    }

    /* renamed from: c */
    public C9758c m31459c() {
        return m31450c(this);
    }

    /* renamed from: a */
    public C9750b mo34357a(int i) {
        return this.f26726i.get(i);
    }

    /* renamed from: b */
    public C9748b m31457b() {
        return f26721l;
    }

    /* renamed from: a */
    public void mo34358a(CodedOutputStream codedOutputStream) throws IOException {
        mo34361e();
        if ((this.f26724g & 1) == 1) {
            codedOutputStream.mo35635b(1, this.f26725h);
        }
        for (int i = 0; i < this.f26726i.size(); i++) {
            codedOutputStream.mo35636b(2, (C10449o) this.f26726i.get(i));
        }
        codedOutputStream.mo35638b(this.f26723f);
    }

    private C9748b(boolean z) {
        this.f26727j = -1;
        this.f26728k = -1;
        this.f26723f = C10417d.f28215f;
    }

    private C9748b(C10420e eVar, C10422f fVar) throws InvalidProtocolBufferException {
        this.f26727j = -1;
        this.f26728k = -1;
        m31452n();
        C10417d.C10419b j = C10417d.m35229j();
        CodedOutputStream a = CodedOutputStream.m35116a((OutputStream) j, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int x = eVar.mo35733x();
                if (x != 0) {
                    if (x == 8) {
                        this.f26724g |= 1;
                        this.f26725h = eVar.mo35719j();
                    } else if (x == 18) {
                        if (!(z2 & true)) {
                            this.f26726i = new ArrayList();
                            z2 |= true;
                        }
                        this.f26726i.add(eVar.mo35702a(C9750b.f26730m, fVar));
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
                    this.f26726i = Collections.unmodifiableList(this.f26726i);
                }
                try {
                    a.mo35614a();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f26723f = j.mo35696a();
                    throw th2;
                }
                this.f26723f = j.mo35696a();
                mo35760h();
                throw th;
            }
        }
        if (z2 & true) {
            this.f26726i = Collections.unmodifiableList(this.f26726i);
        }
        try {
            a.mo35614a();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f26723f = j.mo35696a();
            throw th3;
        }
        this.f26723f = j.mo35696a();
        mo35760h();
    }
}
