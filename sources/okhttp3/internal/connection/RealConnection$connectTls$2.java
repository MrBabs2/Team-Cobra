package okhttp3.internal.connection;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import kotlin.C4789l;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.p215c0.p216c.C9102a;
import okhttp3.Handshake;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, mo16641d2 = {"<anonymous>", "", "Ljava/security/cert/X509Certificate;", "invoke"}, mo16642k = 3, mo16643mv = {1, 1, 15})
/* compiled from: RealConnection.kt */
final class RealConnection$connectTls$2 extends C10203k implements C9102a<List<? extends X509Certificate>> {
    final /* synthetic */ RealConnection this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RealConnection$connectTls$2(RealConnection realConnection) {
        super(0);
        this.this$0 = realConnection;
    }

    public final List<X509Certificate> invoke() {
        Handshake access$getHandshake$p = this.this$0.handshake;
        if (access$getHandshake$p != null) {
            List<Certificate> peerCertificates = access$getHandshake$p.peerCertificates();
            ArrayList arrayList = new ArrayList(C10531p.m35750a(peerCertificates, 10));
            for (Certificate certificate : peerCertificates) {
                if (certificate != null) {
                    arrayList.add((X509Certificate) certificate);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                }
            }
            return arrayList;
        }
        C10202j.m34172a();
        throw null;
    }
}
