package kotlin.p392j0;

/* renamed from: kotlin.j0.b */
/* compiled from: Char.kt */
class C12099b extends C12098a {
    /* renamed from: a */
    public static final boolean m39943a(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        return Character.toUpperCase(c) == Character.toUpperCase(c2) || Character.toLowerCase(c) == Character.toLowerCase(c2);
    }
}
