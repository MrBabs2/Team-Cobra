package kotlinx.coroutines.p393g2;

import kotlin.TypeCastException;

/* renamed from: kotlinx.coroutines.g2.g */
/* compiled from: LockFreeLinkedList.kt */
public final class C12219g {

    /* renamed from: a */
    private static final Object f31985a = new C12230o("CONDITION_FALSE");

    static {
        new C12230o("LIST_EMPTY");
    }

    /* renamed from: a */
    public static final Object m40265a() {
        return f31985a;
    }

    /* renamed from: a */
    public static final C12220h m40266a(Object obj) {
        C12220h hVar;
        C12227l lVar = (C12227l) (!(obj instanceof C12227l) ? null : obj);
        if (lVar != null && (hVar = lVar.f32001a) != null) {
            return hVar;
        }
        if (obj != null) {
            return (C12220h) obj;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
    }
}
