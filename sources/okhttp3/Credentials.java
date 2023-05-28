package okhttp3;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p413s.C12911i;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, mo16641d2 = {"Lokhttp3/Credentials;", "", "()V", "basic", "", "username", "password", "charset", "Ljava/nio/charset/Charset;", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
/* compiled from: Credentials.kt */
public final class Credentials {
    public static final Credentials INSTANCE = new Credentials();

    private Credentials() {
    }

    public static final String basic(String str, String str2) {
        return basic$default(str, str2, (Charset) null, 4, (Object) null);
    }

    public static final String basic(String str, String str2, Charset charset) {
        C10202j.m34178b(str, "username");
        C10202j.m34178b(str2, "password");
        C10202j.m34178b(charset, "charset");
        String a = C12911i.f33159j.mo41245a(str + ':' + str2, charset).mo41218a();
        return "Basic " + a;
    }

    public static /* synthetic */ String basic$default(String str, String str2, Charset charset, int i, Object obj) {
        if ((i & 4) != 0) {
            charset = StandardCharsets.ISO_8859_1;
            C10202j.m34174a((Object) charset, "ISO_8859_1");
        }
        return basic(str, str2, charset);
    }
}
