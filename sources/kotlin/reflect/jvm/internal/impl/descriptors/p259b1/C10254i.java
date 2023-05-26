package kotlin.reflect.jvm.internal.impl.descriptors.p259b1;

import kotlin.jvm.internal.C10202j;

/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.b1.i */
/* compiled from: Annotations.kt */
public final class C10254i {
    /* renamed from: a */
    public static final C10249g m34293a(C10249g gVar, C10249g gVar2) {
        C10202j.m34178b(gVar, "first");
        C10202j.m34178b(gVar2, "second");
        if (gVar.isEmpty()) {
            return gVar2;
        }
        if (gVar2.isEmpty()) {
            return gVar;
        }
        return new C10257k(gVar, gVar2);
    }
}
