package kotlin.p042a0.p043j.p044a;

import java.lang.reflect.Field;
import kotlin.jvm.internal.C10202j;

/* renamed from: kotlin.a0.j.a.f */
/* compiled from: DebugMetadata.kt */
public final class C9086f {
    /* renamed from: a */
    private static final C4782e m29786a(C9082a aVar) {
        return (C4782e) aVar.getClass().getAnnotation(C4782e.class);
    }

    /* renamed from: b */
    private static final int m29788b(C9082a aVar) {
        try {
            Field declaredField = aVar.getClass().getDeclaredField("label");
            C10202j.m34174a((Object) declaredField, "field");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(aVar);
            if (!(obj instanceof Integer)) {
                obj = null;
            }
            Integer num = (Integer) obj;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: c */
    public static final StackTraceElement m29789c(C9082a aVar) {
        int i;
        String str;
        C10202j.m34178b(aVar, "$this$getStackTraceElementImpl");
        C4782e a = m29786a(aVar);
        if (a == null) {
            return null;
        }
        m29787a(1, a.mo16625v());
        int b = m29788b(aVar);
        if (b < 0) {
            i = -1;
        } else {
            i = a.mo16623l()[b];
        }
        String a2 = C9088h.f25666c.mo33467a(aVar);
        if (a2 == null) {
            str = a.mo16621c();
        } else {
            str = a2 + '/' + a.mo16621c();
        }
        return new StackTraceElement(str, a.mo16624m(), a.mo16622f(), i);
    }

    /* renamed from: a */
    private static final void m29787a(int i, int i2) {
        if (i2 > i) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i + ", got " + i2 + ". Please update the Kotlin standard library.").toString());
        }
    }
}
