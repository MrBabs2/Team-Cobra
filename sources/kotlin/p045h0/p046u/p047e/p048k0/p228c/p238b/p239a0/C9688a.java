package kotlin.p045h0.p046u.p047e.p048k0.p228c.p238b.p239a0;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p243y0.p244g.C9917c;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p243y0.p244g.C9923f;

/* renamed from: kotlin.h0.u.e.k0.c.b.a0.a */
/* compiled from: KotlinClassHeader.kt */
public final class C9688a {

    /* renamed from: a */
    private final C9689a f26628a;

    /* renamed from: b */
    private final C9923f f26629b;

    /* renamed from: c */
    private final String[] f26630c;

    /* renamed from: d */
    private final String[] f26631d;

    /* renamed from: e */
    private final String[] f26632e;

    /* renamed from: f */
    private final String f26633f;

    /* renamed from: g */
    private final int f26634g;

    /* renamed from: kotlin.h0.u.e.k0.c.b.a0.a$a */
    /* compiled from: KotlinClassHeader.kt */
    public enum C9689a {
        UNKNOWN(0),
        CLASS(1),
        FILE_FACADE(2),
        SYNTHETIC_CLASS(3),
        MULTIFILE_CLASS(4),
        MULTIFILE_CLASS_PART(5);
        
        /* access modifiers changed from: private */

        /* renamed from: n */
        public static final Map<Integer, C9689a> f26642n = null;

        /* renamed from: o */
        public static final C9690a f26643o = null;

        /* renamed from: f */
        private final int f26644f;

        /* renamed from: kotlin.h0.u.e.k0.c.b.a0.a$a$a */
        /* compiled from: KotlinClassHeader.kt */
        public static final class C9690a {
            private C9690a() {
            }

            /* renamed from: a */
            public final C9689a mo34268a(int i) {
                C9689a aVar = (C9689a) C9689a.f26642n.get(Integer.valueOf(i));
                return aVar != null ? aVar : C9689a.UNKNOWN;
            }

            public /* synthetic */ C9690a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            int i;
            f26643o = new C9690a((DefaultConstructorMarker) null);
            C9689a[] values = values();
            LinkedHashMap linkedHashMap = new LinkedHashMap(C9150f.m29847a(C10515i0.m35582a(values.length), 16));
            for (C9689a aVar : values) {
                linkedHashMap.put(Integer.valueOf(aVar.f26644f), aVar);
            }
            f26642n = linkedHashMap;
        }

        private C9689a(int i) {
            this.f26644f = i;
        }

        /* renamed from: a */
        public static final C9689a m31237a(int i) {
            return f26643o.mo34268a(i);
        }
    }

    public C9688a(C9689a aVar, C9923f fVar, C9917c cVar, String[] strArr, String[] strArr2, String[] strArr3, String str, int i, String str2) {
        C10202j.m34178b(aVar, "kind");
        C10202j.m34178b(fVar, "metadataVersion");
        C10202j.m34178b(cVar, "bytecodeVersion");
        this.f26628a = aVar;
        this.f26629b = fVar;
        this.f26630c = strArr;
        this.f26631d = strArr2;
        this.f26632e = strArr3;
        this.f26633f = str;
        this.f26634g = i;
    }

    /* renamed from: a */
    public final String[] mo34259a() {
        return this.f26630c;
    }

    /* renamed from: b */
    public final String[] mo34260b() {
        return this.f26631d;
    }

    /* renamed from: c */
    public final C9689a mo34261c() {
        return this.f26628a;
    }

    /* renamed from: d */
    public final C9923f mo34262d() {
        return this.f26629b;
    }

    /* renamed from: e */
    public final String mo34263e() {
        String str = this.f26633f;
        if (this.f26628a == C9689a.MULTIFILE_CLASS_PART) {
            return str;
        }
        return null;
    }

    /* renamed from: f */
    public final List<String> mo34264f() {
        String[] strArr = this.f26630c;
        List<String> list = null;
        if (!(this.f26628a == C9689a.MULTIFILE_CLASS)) {
            strArr = null;
        }
        if (strArr != null) {
            list = C10516j.m35587a((T[]) strArr);
        }
        return list != null ? list : C10529o.m35736a();
    }

    /* renamed from: g */
    public final String[] mo34265g() {
        return this.f26632e;
    }

    /* renamed from: h */
    public final boolean mo34266h() {
        return (this.f26634g & 2) != 0;
    }

    public String toString() {
        return this.f26628a + " version=" + this.f26629b;
    }
}
