package kotlin.p045h0.p046u.p047e.p390m0;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p245e.C9934b;
import kotlin.p215c0.C9100a;

/* renamed from: kotlin.h0.u.e.m0.g */
/* compiled from: ReflectJavaAnnotationOwner.kt */
public final class C12038g {
    /* renamed from: a */
    public static final List<C12032c> m39768a(Annotation[] annotationArr) {
        C10202j.m34178b(annotationArr, "$this$getAnnotations");
        ArrayList arrayList = new ArrayList(annotationArr.length);
        for (Annotation cVar : annotationArr) {
            arrayList.add(new C12032c(cVar));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static final C12032c m39769a(Annotation[] annotationArr, C9934b bVar) {
        Annotation annotation;
        C10202j.m34178b(annotationArr, "$this$findAnnotation");
        C10202j.m34178b(bVar, "fqName");
        int length = annotationArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                annotation = null;
                break;
            }
            annotation = annotationArr[i];
            if (C10202j.m34176a((Object) C12029b.m39748b(C9100a.m29804a(C9100a.m29806a(annotation))).mo34983a(), (Object) bVar)) {
                break;
            }
            i++;
        }
        if (annotation != null) {
            return new C12032c(annotation);
        }
        return null;
    }
}
