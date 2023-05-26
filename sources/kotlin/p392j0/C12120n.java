package kotlin.p392j0;

import kotlin.jvm.internal.C10202j;
import kotlin.p215c0.p216c.C9113l;

/* renamed from: kotlin.j0.n */
/* compiled from: Appendable.kt */
class C12120n {
    /* renamed from: a */
    public static <T> void m40024a(Appendable appendable, T t, C9113l<? super T, ? extends CharSequence> lVar) {
        C10202j.m34178b(appendable, "$this$appendElement");
        if (lVar != null) {
            appendable.append((CharSequence) lVar.invoke(t));
            return;
        }
        if (t != null ? t instanceof CharSequence : true) {
            appendable.append((CharSequence) t);
        } else if (t instanceof Character) {
            appendable.append(((Character) t).charValue());
        } else {
            appendable.append(String.valueOf(t));
        }
    }
}
