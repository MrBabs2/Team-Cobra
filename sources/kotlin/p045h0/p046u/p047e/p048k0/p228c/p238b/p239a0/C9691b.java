package kotlin.p045h0.p046u.p047e.p048k0.p228c.p238b.p239a0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.C9632s;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p238b.C9724o;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p238b.p239a0.C9688a;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p243y0.p244g.C9917c;
import kotlin.p045h0.p046u.p047e.p048k0.p240d.p243y0.p244g.C9923f;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9933a;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9939f;
import kotlin.p045h0.p046u.p047e.p048k0.p248h.p251m.C10036f;
import kotlin.reflect.jvm.internal.impl.descriptors.C10362n0;

/* renamed from: kotlin.h0.u.e.k0.c.b.a0.b */
/* compiled from: ReadKotlinClassHeaderAnnotationVisitor */
public class C9691b implements C9724o.C9727c {

    /* renamed from: j */
    private static final boolean f26645j = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));

    /* renamed from: k */
    private static final Map<C9933a, C9688a.C9689a> f26646k;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int[] f26647a = null;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C9917c f26648b = null;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public String f26649c = null;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public int f26650d = 0;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public String f26651e = null;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String[] f26652f = null;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public String[] f26653g = null;

    /* renamed from: h */
    private String[] f26654h = null;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C9688a.C9689a f26655i = null;

    static {
        HashMap hashMap = new HashMap();
        f26646k = hashMap;
        hashMap.put(C9933a.m33260a(new C9934b("kotlin.jvm.internal.KotlinClass")), C9688a.C9689a.CLASS);
        f26646k.put(C9933a.m33260a(new C9934b("kotlin.jvm.internal.KotlinFileFacade")), C9688a.C9689a.FILE_FACADE);
        f26646k.put(C9933a.m33260a(new C9934b("kotlin.jvm.internal.KotlinMultifileClass")), C9688a.C9689a.MULTIFILE_CLASS);
        f26646k.put(C9933a.m33260a(new C9934b("kotlin.jvm.internal.KotlinMultifileClassPart")), C9688a.C9689a.MULTIFILE_CLASS_PART);
        f26646k.put(C9933a.m33260a(new C9934b("kotlin.jvm.internal.KotlinSyntheticClass")), C9688a.C9689a.SYNTHETIC_CLASS);
    }

    /* renamed from: a */
    private static /* synthetic */ void m31244a(int i) {
        Object[] objArr = new Object[3];
        if (i != 1) {
            objArr[0] = "classId";
        } else {
            objArr[0] = "source";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor";
        objArr[2] = "visitAnnotation";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* renamed from: c */
    private boolean m31249c() {
        C9688a.C9689a aVar = this.f26655i;
        return aVar == C9688a.C9689a.CLASS || aVar == C9688a.C9689a.FILE_FACADE || aVar == C9688a.C9689a.MULTIFILE_CLASS_PART;
    }

    /* renamed from: a */
    public void mo34256a() {
    }

    /* renamed from: kotlin.h0.u.e.k0.c.b.a0.b$b */
    /* compiled from: ReadKotlinClassHeaderAnnotationVisitor */
    private static abstract class C9693b implements C9724o.C9726b {

        /* renamed from: a */
        private final List<String> f26656a = new ArrayList();

        /* renamed from: a */
        private static /* synthetic */ void m31253a(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "enumEntryName";
            } else if (i != 2) {
                objArr[0] = "enumClassId";
            } else {
                objArr[0] = "classLiteralValue";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$CollectStringArrayAnnotationVisitor";
            if (i != 2) {
                objArr[2] = "visitEnum";
            } else {
                objArr[2] = "visitClassLiteral";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: a */
        public void mo34271a(Object obj) {
            if (obj instanceof String) {
                this.f26656a.add((String) obj);
            }
        }

        /* renamed from: a */
        public void mo34272a(C9933a aVar, C9939f fVar) {
            if (aVar == null) {
                m31253a(0);
                throw null;
            } else if (fVar == null) {
                m31253a(1);
                throw null;
            }
        }

        /* renamed from: a */
        public void mo34273a(C10036f fVar) {
            if (fVar == null) {
                m31253a(2);
                throw null;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo34274a(String[] strArr);

        /* renamed from: a */
        public void mo34270a() {
            mo34274a((String[]) this.f26656a.toArray(new String[0]));
        }
    }

    /* renamed from: b */
    public C9688a mo34269b() {
        if (this.f26655i == null || this.f26647a == null) {
            return null;
        }
        C9923f fVar = new C9923f(this.f26647a, (this.f26650d & 8) != 0);
        if (!fVar.mo34934d()) {
            this.f26654h = this.f26652f;
            this.f26652f = null;
        } else if (m31249c() && this.f26652f == null) {
            return null;
        }
        C9688a.C9689a aVar = this.f26655i;
        C9917c cVar = this.f26648b;
        if (cVar == null) {
            cVar = C9917c.f27373f;
        }
        return new C9688a(aVar, fVar, cVar, this.f26652f, this.f26654h, this.f26653g, this.f26649c, this.f26650d, this.f26651e);
    }

    /* renamed from: kotlin.h0.u.e.k0.c.b.a0.b$d */
    /* compiled from: ReadKotlinClassHeaderAnnotationVisitor */
    private class C9697d implements C9724o.C9725a {

        /* renamed from: kotlin.h0.u.e.k0.c.b.a0.b$d$a */
        /* compiled from: ReadKotlinClassHeaderAnnotationVisitor */
        class C9698a extends C9693b {
            C9698a() {
            }

            /* renamed from: a */
            private static /* synthetic */ void m31281a(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1", "visitEnd"}));
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo34274a(String[] strArr) {
                if (strArr != null) {
                    String[] unused = C9691b.this.f26652f = strArr;
                } else {
                    m31281a(0);
                    throw null;
                }
            }
        }

        /* renamed from: kotlin.h0.u.e.k0.c.b.a0.b$d$b */
        /* compiled from: ReadKotlinClassHeaderAnnotationVisitor */
        class C9699b extends C9693b {
            C9699b() {
            }

            /* renamed from: a */
            private static /* synthetic */ void m31283a(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2", "visitEnd"}));
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo34274a(String[] strArr) {
                if (strArr != null) {
                    String[] unused = C9691b.this.f26653g = strArr;
                } else {
                    m31283a(0);
                    throw null;
                }
            }
        }

        private C9697d() {
        }

        /* renamed from: a */
        private static /* synthetic */ void m31272a(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "classLiteralValue";
            } else if (i == 7) {
                objArr[0] = "classId";
            } else if (i == 4) {
                objArr[0] = "enumClassId";
            } else if (i != 5) {
                objArr[0] = "name";
            } else {
                objArr[0] = "enumEntryName";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor";
            switch (i) {
                case 2:
                    objArr[2] = "visitArray";
                    break;
                case 3:
                case 4:
                case 5:
                    objArr[2] = "visitEnum";
                    break;
                case 6:
                case 7:
                    objArr[2] = "visitAnnotation";
                    break;
                default:
                    objArr[2] = "visitClassLiteral";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: b */
        private C9724o.C9726b m31273b() {
            return new C9698a();
        }

        /* renamed from: c */
        private C9724o.C9726b m31274c() {
            return new C9699b();
        }

        /* renamed from: a */
        public C9724o.C9725a mo34275a(C9939f fVar, C9933a aVar) {
            if (fVar == null) {
                m31272a(6);
                throw null;
            } else if (aVar != null) {
                return null;
            } else {
                m31272a(7);
                throw null;
            }
        }

        /* renamed from: a */
        public void mo34277a() {
        }

        /* renamed from: a */
        public void mo34278a(C9939f fVar, Object obj) {
            if (fVar != null) {
                String a = fVar.mo35021a();
                if ("version".equals(a)) {
                    if (obj instanceof int[]) {
                        int[] iArr = (int[]) obj;
                        int[] unused = C9691b.this.f26647a = iArr;
                        if (C9691b.this.f26648b == null) {
                            C9917c unused2 = C9691b.this.f26648b = new C9917c(iArr);
                        }
                    }
                } else if ("multifileClassName".equals(a)) {
                    String unused3 = C9691b.this.f26649c = obj instanceof String ? (String) obj : null;
                }
            }
        }

        /* renamed from: a */
        public void mo34279a(C9939f fVar, C9933a aVar, C9939f fVar2) {
            if (fVar == null) {
                m31272a(3);
                throw null;
            } else if (aVar == null) {
                m31272a(4);
                throw null;
            } else if (fVar2 == null) {
                m31272a(5);
                throw null;
            }
        }

        /* renamed from: a */
        public void mo34280a(C9939f fVar, C10036f fVar2) {
            if (fVar == null) {
                m31272a(0);
                throw null;
            } else if (fVar2 == null) {
                m31272a(1);
                throw null;
            }
        }

        /* renamed from: a */
        public C9724o.C9726b mo34276a(C9939f fVar) {
            if (fVar != null) {
                String a = fVar.mo35021a();
                if ("data".equals(a) || "filePartClassNames".equals(a)) {
                    return m31273b();
                }
                if ("strings".equals(a)) {
                    return m31274c();
                }
                return null;
            }
            m31272a(2);
            throw null;
        }
    }

    /* renamed from: a */
    public C9724o.C9725a mo34255a(C9933a aVar, C10362n0 n0Var) {
        C9688a.C9689a aVar2;
        if (aVar == null) {
            m31244a(0);
            throw null;
        } else if (n0Var == null) {
            m31244a(1);
            throw null;
        } else if (aVar.mo34983a().equals(C9632s.f26515a)) {
            return new C9694c();
        } else {
            if (f26645j || this.f26655i != null || (aVar2 = f26646k.get(aVar)) == null) {
                return null;
            }
            this.f26655i = aVar2;
            return new C9697d();
        }
    }

    /* renamed from: kotlin.h0.u.e.k0.c.b.a0.b$c */
    /* compiled from: ReadKotlinClassHeaderAnnotationVisitor */
    private class C9694c implements C9724o.C9725a {

        /* renamed from: kotlin.h0.u.e.k0.c.b.a0.b$c$a */
        /* compiled from: ReadKotlinClassHeaderAnnotationVisitor */
        class C9695a extends C9693b {
            C9695a() {
            }

            /* renamed from: a */
            private static /* synthetic */ void m31268a(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1", "visitEnd"}));
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo34274a(String[] strArr) {
                if (strArr != null) {
                    String[] unused = C9691b.this.f26652f = strArr;
                } else {
                    m31268a(0);
                    throw null;
                }
            }
        }

        /* renamed from: kotlin.h0.u.e.k0.c.b.a0.b$c$b */
        /* compiled from: ReadKotlinClassHeaderAnnotationVisitor */
        class C9696b extends C9693b {
            C9696b() {
            }

            /* renamed from: a */
            private static /* synthetic */ void m31270a(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2", "visitEnd"}));
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo34274a(String[] strArr) {
                if (strArr != null) {
                    String[] unused = C9691b.this.f26653g = strArr;
                } else {
                    m31270a(0);
                    throw null;
                }
            }
        }

        private C9694c() {
        }

        /* renamed from: a */
        private static /* synthetic */ void m31259a(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "classLiteralValue";
            } else if (i == 7) {
                objArr[0] = "classId";
            } else if (i == 4) {
                objArr[0] = "enumClassId";
            } else if (i != 5) {
                objArr[0] = "name";
            } else {
                objArr[0] = "enumEntryName";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor";
            switch (i) {
                case 2:
                    objArr[2] = "visitArray";
                    break;
                case 3:
                case 4:
                case 5:
                    objArr[2] = "visitEnum";
                    break;
                case 6:
                case 7:
                    objArr[2] = "visitAnnotation";
                    break;
                default:
                    objArr[2] = "visitClassLiteral";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: b */
        private C9724o.C9726b m31260b() {
            return new C9695a();
        }

        /* renamed from: c */
        private C9724o.C9726b m31261c() {
            return new C9696b();
        }

        /* renamed from: a */
        public C9724o.C9725a mo34275a(C9939f fVar, C9933a aVar) {
            if (fVar == null) {
                m31259a(6);
                throw null;
            } else if (aVar != null) {
                return null;
            } else {
                m31259a(7);
                throw null;
            }
        }

        /* renamed from: a */
        public void mo34277a() {
        }

        /* renamed from: a */
        public void mo34278a(C9939f fVar, Object obj) {
            if (fVar != null) {
                String a = fVar.mo35021a();
                if ("k".equals(a)) {
                    if (obj instanceof Integer) {
                        C9688a.C9689a unused = C9691b.this.f26655i = C9688a.C9689a.m31237a(((Integer) obj).intValue());
                    }
                } else if ("mv".equals(a)) {
                    if (obj instanceof int[]) {
                        int[] unused2 = C9691b.this.f26647a = (int[]) obj;
                    }
                } else if ("bv".equals(a)) {
                    if (obj instanceof int[]) {
                        C9917c unused3 = C9691b.this.f26648b = new C9917c((int[]) obj);
                    }
                } else if ("xs".equals(a)) {
                    if (obj instanceof String) {
                        String unused4 = C9691b.this.f26649c = (String) obj;
                    }
                } else if ("xi".equals(a)) {
                    if (obj instanceof Integer) {
                        int unused5 = C9691b.this.f26650d = ((Integer) obj).intValue();
                    }
                } else if ("pn".equals(a) && (obj instanceof String)) {
                    String unused6 = C9691b.this.f26651e = (String) obj;
                }
            }
        }

        /* renamed from: a */
        public void mo34279a(C9939f fVar, C9933a aVar, C9939f fVar2) {
            if (fVar == null) {
                m31259a(3);
                throw null;
            } else if (aVar == null) {
                m31259a(4);
                throw null;
            } else if (fVar2 == null) {
                m31259a(5);
                throw null;
            }
        }

        /* renamed from: a */
        public void mo34280a(C9939f fVar, C10036f fVar2) {
            if (fVar == null) {
                m31259a(0);
                throw null;
            } else if (fVar2 == null) {
                m31259a(1);
                throw null;
            }
        }

        /* renamed from: a */
        public C9724o.C9726b mo34276a(C9939f fVar) {
            if (fVar != null) {
                String a = fVar.mo35021a();
                if ("d1".equals(a)) {
                    return m31260b();
                }
                if ("d2".equals(a)) {
                    return m31261c();
                }
                return null;
            }
            m31259a(2);
            throw null;
        }
    }
}
