package kotlinx.coroutines;

import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;
import kotlinx.coroutines.p393g2.C12218f;
import kotlinx.coroutines.p393g2.C12220h;

/* renamed from: kotlinx.coroutines.t1 */
/* compiled from: JobSupport.kt */
public final class C12311t1 extends C12218f implements C12201f1 {
    /* renamed from: a */
    public final String mo39035a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("List{");
        sb.append(str);
        sb.append("}[");
        Object d = mo38877d();
        if (d != null) {
            boolean z = true;
            for (C12220h hVar = (C12220h) d; !C10202j.m34176a((Object) hVar, (Object) this); hVar = hVar.mo38878e()) {
                if (hVar instanceof C12296p1) {
                    C12296p1 p1Var = (C12296p1) hVar;
                    if (z) {
                        z = false;
                    } else {
                        sb.append(", ");
                    }
                    sb.append(p1Var);
                }
            }
            sb.append("]");
            String sb2 = sb.toString();
            C10202j.m34174a((Object) sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
    }

    /* renamed from: b */
    public boolean mo38848b() {
        return true;
    }

    /* renamed from: c */
    public C12311t1 mo38849c() {
        return this;
    }

    public String toString() {
        return C12248i0.m40398c() ? mo39035a("Active") : super.toString();
    }
}
