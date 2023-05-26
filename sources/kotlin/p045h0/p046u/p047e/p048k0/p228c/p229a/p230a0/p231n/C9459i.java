package kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p230a0.p231n;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.C10221n;
import kotlin.C10481t;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.jvm.internal.C10211s;
import kotlin.jvm.internal.C10212t;
import kotlin.jvm.internal.C10216x;
import kotlin.p045h0.C9168l;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p230a0.C9409a;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p230a0.C9419f;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p230a0.C9422h;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9520g;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9534t;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9538x;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p238b.C9723n;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p238b.C9724o;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p238b.C9730p;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p238b.C9735t;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p238b.p239a0.C9688a;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9933a;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p254p.C10080c;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11814f;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11816h;
import kotlin.p215c0.p216c.C9102a;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10347g;
import kotlin.reflect.jvm.internal.impl.descriptors.C10362n0;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10249g;
import kotlin.reflect.jvm.internal.impl.descriptors.p261d1.C10338x;

/* renamed from: kotlin.h0.u.e.k0.c.a.a0.n.i */
/* compiled from: LazyJavaPackageFragment.kt */
public final class C9459i extends C10338x {

    /* renamed from: q */
    static final /* synthetic */ C9168l[] f26267q;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C9422h f26268k;

    /* renamed from: l */
    private final C11814f f26269l;

    /* renamed from: m */
    private final C9435d f26270m = new C9435d(this.f26268k, this.f26273p, this);

    /* renamed from: n */
    private final C11814f<List<C9934b>> f26271n = this.f26268k.mo33896e().mo38402a(new C9462c(this), C10529o.m35736a());

    /* renamed from: o */
    private final C10249g f26272o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final C9534t f26273p;

    /* renamed from: kotlin.h0.u.e.k0.c.a.a0.n.i$a */
    /* compiled from: LazyJavaPackageFragment.kt */
    static final class C9460a extends C10203k implements C9102a<Map<String, ? extends C9724o>> {

        /* renamed from: f */
        final /* synthetic */ C9459i f26274f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9460a(C9459i iVar) {
            super(0);
            this.f26274f = iVar;
        }

        public final Map<String, C9724o> invoke() {
            C9735t l = this.f26274f.f26268k.mo33892a().mo33874l();
            String a = this.f26274f.mo35425c().mo34994a();
            C10202j.m34174a((Object) a, "fqName.asString()");
            List<String> a2 = l.mo34333a(a);
            ArrayList arrayList = new ArrayList();
            for (String str : a2) {
                C10080c a3 = C10080c.m33921a(str);
                C10202j.m34174a((Object) a3, "JvmClassName.byInternalName(partName)");
                C9933a a4 = C9933a.m33260a(a3.mo35281a());
                C10202j.m34174a((Object) a4, "ClassId.topLevel(JvmClas…velClassMaybeWithDollars)");
                C9724o a5 = C9723n.m31362a(this.f26274f.f26268k.mo33892a().mo33870h(), a4);
                C10221n a6 = a5 != null ? C10481t.m35502a(str, a5) : null;
                if (a6 != null) {
                    arrayList.add(a6);
                }
            }
            return C10518j0.m35602a(arrayList);
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.c.a.a0.n.i$b */
    /* compiled from: LazyJavaPackageFragment.kt */
    static final class C9461b extends C10203k implements C9102a<HashMap<C10080c, C10080c>> {

        /* renamed from: f */
        final /* synthetic */ C9459i f26275f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9461b(C9459i iVar) {
            super(0);
            this.f26275f = iVar;
        }

        public final HashMap<C10080c, C10080c> invoke() {
            HashMap<C10080c, C10080c> hashMap = new HashMap<>();
            for (Map.Entry next : this.f26275f.mo33954r().entrySet()) {
                C10080c a = C10080c.m33921a((String) next.getKey());
                C10202j.m34174a((Object) a, "JvmClassName.byInternalName(partInternalName)");
                C9688a a2 = ((C9724o) next.getValue()).mo33661a();
                int i = C9458h.f26266a[a2.mo34261c().ordinal()];
                if (i == 1) {
                    String e = a2.mo34263e();
                    if (e != null) {
                        C10080c a3 = C10080c.m33921a(e);
                        C10202j.m34174a((Object) a3, "JvmClassName.byInternalN…: continue@kotlinClasses)");
                        hashMap.put(a, a3);
                    }
                } else if (i == 2) {
                    hashMap.put(a, a);
                }
            }
            return hashMap;
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.c.a.a0.n.i$c */
    /* compiled from: LazyJavaPackageFragment.kt */
    static final class C9462c extends C10203k implements C9102a<List<? extends C9934b>> {

        /* renamed from: f */
        final /* synthetic */ C9459i f26276f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9462c(C9459i iVar) {
            super(0);
            this.f26276f = iVar;
        }

        public final List<C9934b> invoke() {
            Collection<C9534t> s = this.f26276f.f26273p.mo34068s();
            ArrayList arrayList = new ArrayList(C10531p.m35750a(s, 10));
            for (C9534t c : s) {
                arrayList.add(c.mo34067c());
            }
            return arrayList;
        }
    }

    static {
        Class<C9459i> cls = C9459i.class;
        f26267q = new C9168l[]{C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a((Class) cls), "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;")), C10216x.m34192a((C10211s) new C10212t(C10216x.m34186a((Class) cls), "partToFacade", "getPartToFacade()Ljava/util/HashMap;"))};
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9459i(C9422h hVar, C9534t tVar) {
        super(hVar.mo33895d(), tVar.mo34067c());
        C10249g gVar;
        C10202j.m34178b(hVar, "outerContext");
        C10202j.m34178b(tVar, "jPackage");
        this.f26273p = tVar;
        C9422h a = C9409a.m30476a(hVar, (C10347g) this, (C9538x) null, 0, 6, (Object) null);
        this.f26268k = a;
        this.f26269l = a.mo33896e().mo38401a(new C9460a(this));
        if (this.f26268k.mo33892a().mo33863a().mo33854a()) {
            gVar = C10249g.f27910c.mo35429a();
        } else {
            gVar = C9419f.m30510a(this.f26268k, this.f26273p);
        }
        this.f26272o = gVar;
        this.f26268k.mo33896e().mo38401a(new C9461b(this));
    }

    /* renamed from: B */
    public final List<C9934b> mo33952B() {
        return (List) this.f26271n.invoke();
    }

    public C10249g getAnnotations() {
        return this.f26272o;
    }

    /* renamed from: p */
    public C10362n0 mo33773p() {
        return new C9730p(this);
    }

    /* renamed from: r */
    public final Map<String, C9724o> mo33954r() {
        return (Map) C11816h.m38876a(this.f26269l, (Object) this, (C9168l<?>) f26267q[0]);
    }

    public String toString() {
        return "Lazy Java package fragment: " + mo35425c();
    }

    /* renamed from: a */
    public final C10342e mo33953a(C9520g gVar) {
        C10202j.m34178b(gVar, "jClass");
        return this.f26270m.mo33919c().mo33956a(gVar);
    }

    /* renamed from: m */
    public C9435d m30678m() {
        return this.f26270m;
    }
}
