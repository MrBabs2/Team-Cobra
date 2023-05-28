package kotlin.p392j0;

import kotlin.p220g0.C9146c;

/* renamed from: kotlin.j0.a */
/* compiled from: CharJVM.kt */
class C12098a {
    /* renamed from: a */
    public static final boolean m39942a(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }

    /* renamed from: a */
    public static final int m39940a(char c, int i) {
        return Character.digit(c, i);
    }

    /* renamed from: a */
    public static final int m39941a(int i) {
        if (2 <= i && 36 >= i) {
            return i;
        }
        throw new IllegalArgumentException("radix " + i + " was not in valid range " + new C9146c(2, 36));
    }
}
