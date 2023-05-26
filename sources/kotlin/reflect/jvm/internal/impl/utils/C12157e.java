package kotlin.reflect.jvm.internal.impl.utils;

import java.util.ArrayList;
import java.util.Map;
import kotlin.C9134f;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.jvm.internal.C10211s;
import kotlin.jvm.internal.C10212t;
import kotlin.jvm.internal.C10216x;
import kotlin.p215c0.p216c.C9102a;

/* renamed from: kotlin.reflect.jvm.internal.impl.utils.e */
/* compiled from: Jsr305State.kt */
public final class C12157e {

    /* renamed from: e */
    public static final C12157e f31916e;

    /* renamed from: a */
    private final C12162h f31917a;

    /* renamed from: b */
    private final C12162h f31918b;

    /* renamed from: c */
    private final Map<String, C12162h> f31919c;

    /* renamed from: d */
    private final boolean f31920d;

    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.e$a */
    /* compiled from: Jsr305State.kt */
    public static final class C12158a {
        private C12158a() {
        }

        public /* synthetic */ C12158a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.e$b */
    /* compiled from: Jsr305State.kt */
    static final class C12159b extends C10203k implements C9102a<String[]> {

        /* renamed from: f */
        final /* synthetic */ C12157e f31921f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12159b(C12157e eVar) {
            super(0);
            this.f31921f = eVar;
        }

        public final String[] invoke() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.f31921f.mo38758c().mo38769a());
            C12162h d = this.f31921f.mo38759d();
            if (d != null) {
                arrayList.add("under-migration:" + d.mo38769a());
            }
            for (Map.Entry next : this.f31921f.mo38760e().entrySet()) {
                arrayList.add('@' + ((String) next.getKey()) + ':' + ((C12162h) next.getValue()).mo38769a());
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return (String[]) array;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }

    static {
        C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a(C12157e.class), "description", "getDescription()[Ljava/lang/String;"));
        new C12158a((DefaultConstructorMarker) null);
        new C12157e(C12162h.WARN, (C12162h) null, C10518j0.m35601a(), false, 8, (DefaultConstructorMarker) null);
        C12162h hVar = C12162h.IGNORE;
        f31916e = new C12157e(hVar, hVar, C10518j0.m35601a(), false, 8, (DefaultConstructorMarker) null);
        C12162h hVar2 = C12162h.STRICT;
        new C12157e(hVar2, hVar2, C10518j0.m35601a(), false, 8, (DefaultConstructorMarker) null);
    }

    public C12157e(C12162h hVar, C12162h hVar2, Map<String, ? extends C12162h> map, boolean z) {
        C10202j.m34178b(hVar, "global");
        C10202j.m34178b(map, "user");
        this.f31917a = hVar;
        this.f31918b = hVar2;
        this.f31919c = map;
        this.f31920d = z;
        C9134f<T> unused = C10181i.m34134a(new C12159b(this));
    }

    /* renamed from: a */
    public final boolean mo38756a() {
        return this == f31916e;
    }

    /* renamed from: b */
    public final boolean mo38757b() {
        return this.f31920d;
    }

    /* renamed from: c */
    public final C12162h mo38758c() {
        return this.f31917a;
    }

    /* renamed from: d */
    public final C12162h mo38759d() {
        return this.f31918b;
    }

    /* renamed from: e */
    public final Map<String, C12162h> mo38760e() {
        return this.f31919c;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C12157e) {
                C12157e eVar = (C12157e) obj;
                if (C10202j.m34176a((Object) this.f31917a, (Object) eVar.f31917a) && C10202j.m34176a((Object) this.f31918b, (Object) eVar.f31918b) && C10202j.m34176a((Object) this.f31919c, (Object) eVar.f31919c)) {
                    if (this.f31920d == eVar.f31920d) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C12162h hVar = this.f31917a;
        int i = 0;
        int hashCode = (hVar != null ? hVar.hashCode() : 0) * 31;
        C12162h hVar2 = this.f31918b;
        int hashCode2 = (hashCode + (hVar2 != null ? hVar2.hashCode() : 0)) * 31;
        Map<String, C12162h> map = this.f31919c;
        if (map != null) {
            i = map.hashCode();
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z = this.f31920d;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    public String toString() {
        return "Jsr305State(global=" + this.f31917a + ", migration=" + this.f31918b + ", user=" + this.f31919c + ", enableCompatqualCheckerFrameworkAnnotations=" + this.f31920d + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12157e(C12162h hVar, C12162h hVar2, Map map, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(hVar, hVar2, map, (i & 8) != 0 ? true : z);
    }
}
