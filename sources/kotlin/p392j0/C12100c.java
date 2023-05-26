package kotlin.p392j0;

import java.nio.charset.Charset;
import kotlin.jvm.internal.C10202j;

/* renamed from: kotlin.j0.c */
/* compiled from: Charsets.kt */
public final class C12100c {

    /* renamed from: a */
    public static final Charset f31866a;

    /* renamed from: b */
    private static Charset f31867b;

    /* renamed from: c */
    private static Charset f31868c;

    /* renamed from: d */
    public static final C12100c f31869d = new C12100c();

    static {
        Charset forName = Charset.forName("UTF-8");
        C10202j.m34174a((Object) forName, "Charset.forName(\"UTF-8\")");
        f31866a = forName;
        C10202j.m34174a((Object) Charset.forName("UTF-16"), "Charset.forName(\"UTF-16\")");
        C10202j.m34174a((Object) Charset.forName("UTF-16BE"), "Charset.forName(\"UTF-16BE\")");
        C10202j.m34174a((Object) Charset.forName("UTF-16LE"), "Charset.forName(\"UTF-16LE\")");
        C10202j.m34174a((Object) Charset.forName("US-ASCII"), "Charset.forName(\"US-ASCII\")");
        C10202j.m34174a((Object) Charset.forName("ISO-8859-1"), "Charset.forName(\"ISO-8859-1\")");
    }

    private C12100c() {
    }

    /* renamed from: a */
    public final Charset mo38724a() {
        Charset charset = f31868c;
        if (charset != null) {
            return charset;
        }
        Charset forName = Charset.forName("UTF-32BE");
        C10202j.m34174a((Object) forName, "Charset.forName(\"UTF-32BE\")");
        f31868c = forName;
        return forName;
    }

    /* renamed from: b */
    public final Charset mo38725b() {
        Charset charset = f31867b;
        if (charset != null) {
            return charset;
        }
        Charset forName = Charset.forName("UTF-32LE");
        C10202j.m34174a((Object) forName, "Charset.forName(\"UTF-32LE\")");
        f31867b = forName;
        return forName;
    }
}
