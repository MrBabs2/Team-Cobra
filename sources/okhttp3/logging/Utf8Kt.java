package okhttp3.logging;

import java.io.EOFException;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p413s.C12905f;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, mo16641d2 = {"isProbablyUtf8", "", "Lokio/Buffer;", "okhttp-logging-interceptor"}, mo16642k = 2, mo16643mv = {1, 1, 15})
/* compiled from: utf8.kt */
public final class Utf8Kt {
    public static final boolean isProbablyUtf8(C12905f fVar) {
        C10202j.m34178b(fVar, "$this$isProbablyUtf8");
        try {
            C12905f fVar2 = new C12905f();
            fVar.mo41145a(fVar2, 0, C9150f.m29852b(fVar.size(), 64));
            for (int i = 0; i < 16; i++) {
                if (fVar2.mo41169g()) {
                    return true;
                }
                int u = fVar2.mo41200u();
                if (Character.isISOControl(u) && !Character.isWhitespace(u)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
