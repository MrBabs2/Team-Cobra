package kotlin.p045h0.p046u.p047e.p390m0;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9517d;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\r¨\u0006\u0011"}, mo16641d2 = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotationOwner;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaAnnotationOwner;", "annotations", "", "Lkotlin/reflect/jvm/internal/structure/ReflectJavaAnnotation;", "getAnnotations", "()Ljava/util/List;", "element", "Ljava/lang/reflect/AnnotatedElement;", "getElement", "()Ljava/lang/reflect/AnnotatedElement;", "isDeprecatedInJavaDoc", "", "()Z", "findAnnotation", "fqName", "Lkotlin/reflect/jvm/internal/impl/name/FqName;", "descriptors.runtime"}, mo16642k = 1, mo16643mv = {1, 1, 15})
/* renamed from: kotlin.h0.u.e.m0.f */
/* compiled from: ReflectJavaAnnotationOwner.kt */
public interface C12036f extends C9517d {

    /* renamed from: kotlin.h0.u.e.m0.f$a */
    /* compiled from: ReflectJavaAnnotationOwner.kt */
    public static final class C12037a {
        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
            r0 = kotlin.p045h0.p046u.p047e.p390m0.C12038g.m39768a((r0 = r0.getDeclaredAnnotations()));
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static java.util.List<kotlin.p045h0.p046u.p047e.p390m0.C12032c> m39765a(kotlin.p045h0.p046u.p047e.p390m0.C12036f r0) {
            /*
                java.lang.reflect.AnnotatedElement r0 = r0.mo38671o()
                if (r0 == 0) goto L_0x0013
                java.lang.annotation.Annotation[] r0 = r0.getDeclaredAnnotations()
                if (r0 == 0) goto L_0x0013
                java.util.List r0 = kotlin.p045h0.p046u.p047e.p390m0.C12038g.m39768a(r0)
                if (r0 == 0) goto L_0x0013
                goto L_0x0017
            L_0x0013:
                java.util.List r0 = kotlin.p262y.C10529o.m35736a()
            L_0x0017:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.p045h0.p046u.p047e.p390m0.C12036f.C12037a.m39765a(kotlin.h0.u.e.m0.f):java.util.List");
        }

        /* renamed from: b */
        public static boolean m39767b(C12036f fVar) {
            return false;
        }

        /* renamed from: a */
        public static C12032c m39766a(C12036f fVar, C9934b bVar) {
            Annotation[] declaredAnnotations;
            C10202j.m34178b(bVar, "fqName");
            AnnotatedElement o = fVar.mo38671o();
            if (o == null || (declaredAnnotations = o.getDeclaredAnnotations()) == null) {
                return null;
            }
            return C12038g.m39769a(declaredAnnotations, bVar);
        }
    }

    /* renamed from: o */
    AnnotatedElement mo38671o();
}
