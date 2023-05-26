package okhttp3;

import java.security.cert.Certificate;
import java.util.List;
import kotlin.C4789l;
import kotlin.jvm.internal.C10203k;
import kotlin.p215c0.p216c.C9102a;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, mo16641d2 = {"<anonymous>", "", "Ljava/security/cert/Certificate;", "invoke"}, mo16642k = 3, mo16643mv = {1, 1, 15})
/* compiled from: Handshake.kt */
final class Handshake$Companion$get$1 extends C10203k implements C9102a<List<? extends Certificate>> {
    final /* synthetic */ List $peerCertificatesCopy;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Handshake$Companion$get$1(List list) {
        super(0);
        this.$peerCertificatesCopy = list;
    }

    public final List<Certificate> invoke() {
        return this.$peerCertificatesCopy;
    }
}
