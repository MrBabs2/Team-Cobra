package p413s;

import kotlin.jvm.internal.C10202j;
import kotlin.p392j0.C12100c;

/* renamed from: s.b */
/* compiled from: -Platform.kt */
public final class C12893b {
    /* renamed from: a */
    public static final void m41507a(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        C10202j.m34178b(bArr, "src");
        C10202j.m34178b(bArr2, "dest");
        System.arraycopy(bArr, i, bArr2, i2, i3);
    }

    /* renamed from: a */
    public static final String m41506a(byte[] bArr) {
        C10202j.m34178b(bArr, "$receiver");
        return new String(bArr, C12100c.f31866a);
    }

    /* renamed from: a */
    public static final byte[] m41508a(String str) {
        C10202j.m34178b(str, "$receiver");
        byte[] bytes = str.getBytes(C12100c.f31866a);
        C10202j.m34174a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
        return bytes;
    }
}
