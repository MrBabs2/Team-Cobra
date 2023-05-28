package kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C10200h;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10216x;
import kotlin.p045h0.C9156e;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p230a0.C9426k;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p235d0.C9554g;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p235d0.C9555h;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p251m.C10037g;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p251m.C10042j;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p253o.C10071a;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11812d;
import kotlin.p045h0.p046u.p047e.p048k0.p379j.C11817i;
import kotlin.p215c0.p216c.C9113l;
import kotlin.reflect.jvm.internal.impl.descriptors.C10342e;
import kotlin.reflect.jvm.internal.impl.descriptors.C10345f;
import kotlin.reflect.jvm.internal.impl.descriptors.p259b1.C10243c;
import kotlin.reflect.jvm.internal.impl.utils.C12157e;
import kotlin.reflect.jvm.internal.impl.utils.C12162h;

/* renamed from: kotlin.h0.u.e.k0.c.a.a */
/* compiled from: AnnotationTypeQualifierResolver.kt */
public final class C9405a {

    /* renamed from: a */
    private final C11812d<C10342e, C10243c> f26145a;

    /* renamed from: b */
    private final boolean f26146b = this.f26147c.mo38756a();

    /* renamed from: c */
    private final C12157e f26147c;

    /* renamed from: kotlin.h0.u.e.k0.c.a.a$a */
    /* compiled from: AnnotationTypeQualifierResolver.kt */
    public enum C9406a {
        METHOD_RETURN_TYPE,
        VALUE_PARAMETER,
        FIELD,
        TYPE_USE
    }

    /* renamed from: kotlin.h0.u.e.k0.c.a.a$b */
    /* compiled from: AnnotationTypeQualifierResolver.kt */
    public static final class C9407b {

        /* renamed from: a */
        private final C10243c f26153a;

        /* renamed from: b */
        private final int f26154b;

        public C9407b(C10243c cVar, int i) {
            C10202j.m34178b(cVar, "typeQualifier");
            this.f26153a = cVar;
            this.f26154b = i;
        }

        /* renamed from: a */
        public final C10243c mo33859a() {
            return this.f26153a;
        }

        /* renamed from: b */
        public final List<C9406a> mo33860b() {
            C9406a[] values = C9406a.values();
            ArrayList arrayList = new ArrayList();
            for (C9406a aVar : values) {
                if (m30468b(aVar)) {
                    arrayList.add(aVar);
                }
            }
            return arrayList;
        }

        /* renamed from: a */
        private final boolean m30467a(C9406a aVar) {
            return ((1 << aVar.ordinal()) & this.f26154b) != 0;
        }

        /* renamed from: b */
        private final boolean m30468b(C9406a aVar) {
            return m30467a(C9406a.TYPE_USE) || m30467a(aVar);
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.c.a.a$c */
    /* compiled from: AnnotationTypeQualifierResolver.kt */
    static final /* synthetic */ class C9408c extends C10200h implements C9113l<C10342e, C10243c> {
        C9408c(C9405a aVar) {
            super(1, aVar);
        }

        /* renamed from: a */
        public final C10243c invoke(C10342e eVar) {
            C10202j.m34178b(eVar, "p1");
            return ((C9405a) this.receiver).m30458a(eVar);
        }

        public final String getName() {
            return "computeTypeQualifierNickname";
        }

        public final C9156e getOwner() {
            return C10216x.m34186a(C9405a.class);
        }

        public final String getSignature() {
            return "computeTypeQualifierNickname(Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;)Lorg/jetbrains/kotlin/descriptors/annotations/AnnotationDescriptor;";
        }
    }

    public C9405a(C11817i iVar, C12157e eVar) {
        C10202j.m34178b(iVar, "storageManager");
        C10202j.m34178b(eVar, "jsr305State");
        this.f26147c = eVar;
        this.f26145a = iVar.mo38406b(new C9408c(this));
    }

    /* renamed from: c */
    private final C10243c m30460c(C10342e eVar) {
        if (eVar.mo33763g() != C10345f.ANNOTATION_CLASS) {
            return null;
        }
        return this.f26145a.invoke(eVar);
    }

    /* renamed from: b */
    public final C12162h mo33855b(C10243c cVar) {
        C10202j.m34178b(cVar, "annotationDescriptor");
        Map<String, C12162h> e = this.f26147c.mo38760e();
        C9934b c = cVar.mo33922c();
        C12162h hVar = e.get(c != null ? c.mo34994a() : null);
        if (hVar != null) {
            return hVar;
        }
        C10342e b = C10071a.m33893b(cVar);
        if (b != null) {
            return m30459b(b);
        }
        return null;
    }

    /* renamed from: d */
    public final C10243c mo33857d(C10243c cVar) {
        C10342e b;
        C10202j.m34178b(cVar, "annotationDescriptor");
        if (this.f26147c.mo38756a() || (b = C10071a.m33893b(cVar)) == null) {
            return null;
        }
        if (C9507b.m30814b(b)) {
            return cVar;
        }
        return m30460c(b);
    }

    /* renamed from: e */
    public final C9407b mo33858e(C10243c cVar) {
        C10342e b;
        Object obj;
        boolean z;
        List<C9406a> list;
        C10202j.m34178b(cVar, "annotationDescriptor");
        if (!this.f26147c.mo38756a() && (b = C10071a.m33893b(cVar)) != null) {
            if (!b.getAnnotations().mo33886b(C9507b.m30815c())) {
                b = null;
            }
            if (b != null) {
                C10342e b2 = C10071a.m33893b(cVar);
                if (b2 != null) {
                    C10243c a = b2.getAnnotations().mo33885a(C9507b.m30815c());
                    if (a != null) {
                        Map<C9939f, C10037g<?>> a2 = a.mo33921a();
                        ArrayList<C9406a> arrayList = new ArrayList<>();
                        for (Map.Entry next : a2.entrySet()) {
                            C10037g gVar = (C10037g) next.getValue();
                            if (C10202j.m34176a((Object) (C9939f) next.getKey(), (Object) C9632s.f26516b)) {
                                list = m30456a((C10037g<?>) gVar);
                            } else {
                                list = C10529o.m35736a();
                            }
                            boolean unused = C10536t.m35760a(arrayList, list);
                        }
                        int i = 0;
                        for (C9406a ordinal : arrayList) {
                            i |= 1 << ordinal.ordinal();
                        }
                        Iterator it = b.getAnnotations().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            if (mo33857d((C10243c) obj) != null) {
                                z = true;
                                continue;
                            } else {
                                z = false;
                                continue;
                            }
                            if (z) {
                                break;
                            }
                        }
                        C10243c cVar2 = (C10243c) obj;
                        if (cVar2 != null) {
                            return new C9407b(cVar2, i);
                        }
                        return null;
                    }
                    C10202j.m34172a();
                    throw null;
                }
                C10202j.m34172a();
                throw null;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C10243c m30458a(C10342e eVar) {
        if (!eVar.getAnnotations().mo33886b(C9507b.m30816d())) {
            return null;
        }
        for (C10243c d : eVar.getAnnotations()) {
            C10243c d2 = mo33857d(d);
            if (d2 != null) {
                return d2;
            }
        }
        return null;
    }

    /* renamed from: b */
    private final C12162h m30459b(C10342e eVar) {
        C10243c a = eVar.getAnnotations().mo33885a(C9507b.m30813b());
        C10037g<?> a2 = a != null ? C10071a.m33886a(a) : null;
        if (!(a2 instanceof C10042j)) {
            a2 = null;
        }
        C10042j jVar = (C10042j) a2;
        if (jVar == null) {
            return null;
        }
        C12162h d = this.f26147c.mo38759d();
        if (d != null) {
            return d;
        }
        String a3 = jVar.mo35251b().mo35021a();
        int hashCode = a3.hashCode();
        if (hashCode != -2137067054) {
            if (hashCode != -1838656823) {
                if (hashCode == 2656902 && a3.equals("WARN")) {
                    return C12162h.WARN;
                }
                return null;
            } else if (a3.equals("STRICT")) {
                return C12162h.STRICT;
            } else {
                return null;
            }
        } else if (a3.equals("IGNORE")) {
            return C12162h.IGNORE;
        } else {
            return null;
        }
    }

    /* renamed from: c */
    public final C9426k mo33856c(C10243c cVar) {
        C9426k kVar;
        C10202j.m34178b(cVar, "annotationDescriptor");
        if (!this.f26147c.mo38756a() && (kVar = C9507b.m30811a().get(cVar.mo33922c())) != null) {
            C9555h a = kVar.mo33902a();
            Collection<C9406a> b = kVar.mo33903b();
            C12162h a2 = mo33853a(cVar);
            if (!(a2 != C12162h.IGNORE)) {
                a2 = null;
            }
            if (a2 != null) {
                return new C9426k(C9555h.m30903a(a, (C9554g) null, a2.mo38771e(), 1, (Object) null), b);
            }
        }
        return null;
    }

    /* renamed from: a */
    public final C12162h mo33853a(C10243c cVar) {
        C10202j.m34178b(cVar, "annotationDescriptor");
        C12162h b = mo33855b(cVar);
        if (b != null) {
            return b;
        }
        return this.f26147c.mo38758c();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List<kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.C9405a.C9406a> m30456a(kotlin.p045h0.p046u.p047e.p048k0.p248h.p251m.C10037g<?> r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof kotlin.p045h0.p046u.p047e.p048k0.p248h.p251m.C10031b
            if (r0 == 0) goto L_0x0029
            kotlin.h0.u.e.k0.h.m.b r3 = (kotlin.p045h0.p046u.p047e.p048k0.p248h.p251m.C10031b) r3
            java.lang.Object r3 = r3.mo35244a()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x0015:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0075
            java.lang.Object r1 = r3.next()
            kotlin.h0.u.e.k0.h.m.g r1 = (kotlin.p045h0.p046u.p047e.p048k0.p248h.p251m.C10037g) r1
            java.util.List r1 = r2.m30456a((kotlin.p045h0.p046u.p047e.p048k0.p248h.p251m.C10037g<?>) r1)
            boolean unused = kotlin.p262y.C10536t.m35760a(r0, r1)
            goto L_0x0015
        L_0x0029:
            boolean r0 = r3 instanceof kotlin.p045h0.p046u.p047e.p048k0.p248h.p251m.C10042j
            if (r0 == 0) goto L_0x0071
            kotlin.h0.u.e.k0.h.m.j r3 = (kotlin.p045h0.p046u.p047e.p048k0.p248h.p251m.C10042j) r3
            kotlin.h0.u.e.k0.e.f r3 = r3.mo35251b()
            java.lang.String r3 = r3.mo35023d()
            int r0 = r3.hashCode()
            switch(r0) {
                case -2024225567: goto L_0x0060;
                case 66889946: goto L_0x0055;
                case 107598562: goto L_0x004a;
                case 446088073: goto L_0x003f;
                default: goto L_0x003e;
            }
        L_0x003e:
            goto L_0x006b
        L_0x003f:
            java.lang.String r0 = "PARAMETER"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x006b
            kotlin.h0.u.e.k0.c.a.a$a r3 = kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.C9405a.C9406a.VALUE_PARAMETER
            goto L_0x006c
        L_0x004a:
            java.lang.String r0 = "TYPE_USE"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x006b
            kotlin.h0.u.e.k0.c.a.a$a r3 = kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.C9405a.C9406a.TYPE_USE
            goto L_0x006c
        L_0x0055:
            java.lang.String r0 = "FIELD"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x006b
            kotlin.h0.u.e.k0.c.a.a$a r3 = kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.C9405a.C9406a.FIELD
            goto L_0x006c
        L_0x0060:
            java.lang.String r0 = "METHOD"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x006b
            kotlin.h0.u.e.k0.c.a.a$a r3 = kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.C9405a.C9406a.METHOD_RETURN_TYPE
            goto L_0x006c
        L_0x006b:
            r3 = 0
        L_0x006c:
            java.util.List r0 = kotlin.p262y.C10529o.m35739b(r3)
            goto L_0x0075
        L_0x0071:
            java.util.List r0 = kotlin.p262y.C10529o.m35736a()
        L_0x0075:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.C9405a.m30456a(kotlin.h0.u.e.k0.h.m.g):java.util.List");
    }

    /* renamed from: a */
    public final boolean mo33854a() {
        return this.f26146b;
    }
}
