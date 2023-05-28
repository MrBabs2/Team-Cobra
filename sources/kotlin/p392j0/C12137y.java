package kotlin.p392j0;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.C10202j;

/* renamed from: kotlin.j0.y */
/* compiled from: _Strings.kt */
class C12137y extends C12136x {
    /* renamed from: g */
    public static char m40120g(CharSequence charSequence) {
        C10202j.m34178b(charSequence, "$this$last");
        if (!(charSequence.length() == 0)) {
            return charSequence.charAt(C12131w.m40105c(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    /* renamed from: h */
    public static Character m40121h(CharSequence charSequence) {
        C10202j.m34178b(charSequence, "$this$singleOrNull");
        if (charSequence.length() == 1) {
            return Character.valueOf(charSequence.charAt(0));
        }
        return null;
    }
}
