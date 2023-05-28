package kotlin.p045h0.p046u.p047e.p390m0;

import java.lang.reflect.Modifier;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.C9627q;
import kotlin.p045h0.p046u.p047e.p048k0.p228c.p229a.p234c0.C9532r;
import kotlin.reflect.jvm.internal.impl.descriptors.C10237a1;
import kotlin.reflect.jvm.internal.impl.descriptors.C10397z0;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, mo16641d2 = {"Lkotlin/reflect/jvm/internal/structure/ReflectJavaModifierListOwner;", "Lkotlin/reflect/jvm/internal/impl/load/java/structure/JavaModifierListOwner;", "isAbstract", "", "()Z", "isFinal", "isStatic", "modifiers", "", "getModifiers", "()I", "visibility", "Lkotlin/reflect/jvm/internal/impl/descriptors/Visibility;", "getVisibility", "()Lorg/jetbrains/kotlin/descriptors/Visibility;", "descriptors.runtime"}, mo16642k = 1, mo16643mv = {1, 1, 15})
/* renamed from: kotlin.h0.u.e.m0.t */
/* compiled from: ReflectJavaModifierListOwner.kt */
public interface C12059t extends C9532r {

    /* renamed from: kotlin.h0.u.e.m0.t$a */
    /* compiled from: ReflectJavaModifierListOwner.kt */
    public static final class C12060a {
        /* renamed from: a */
        public static C10237a1 m39841a(C12059t tVar) {
            C10237a1 a1Var;
            int w = tVar.mo38676w();
            if (Modifier.isPublic(w)) {
                C10237a1 a1Var2 = C10397z0.f28192e;
                C10202j.m34174a((Object) a1Var2, "Visibilities.PUBLIC");
                return a1Var2;
            } else if (Modifier.isPrivate(w)) {
                C10237a1 a1Var3 = C10397z0.f28188a;
                C10202j.m34174a((Object) a1Var3, "Visibilities.PRIVATE");
                return a1Var3;
            } else if (Modifier.isProtected(w)) {
                if (Modifier.isStatic(w)) {
                    a1Var = C9627q.f26512b;
                } else {
                    a1Var = C9627q.f26513c;
                }
                C10202j.m34174a((Object) a1Var, "if (Modifier.isStatic(mo…ies.PROTECTED_AND_PACKAGE");
                return a1Var;
            } else {
                C10237a1 a1Var4 = C9627q.f26511a;
                C10202j.m34174a((Object) a1Var4, "JavaVisibilities.PACKAGE_VISIBILITY");
                return a1Var4;
            }
        }

        /* renamed from: b */
        public static boolean m39842b(C12059t tVar) {
            return Modifier.isAbstract(tVar.mo38676w());
        }

        /* renamed from: c */
        public static boolean m39843c(C12059t tVar) {
            return Modifier.isFinal(tVar.mo38676w());
        }

        /* renamed from: d */
        public static boolean m39844d(C12059t tVar) {
            return Modifier.isStatic(tVar.mo38676w());
        }
    }

    /* renamed from: w */
    int mo38676w();
}
