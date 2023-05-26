package okhttp3;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import kotlin.C4789l;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10203k;
import kotlin.p215c0.p216c.C9102a;
import okhttp3.internal.tls.CertificateChainCleaner;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, mo16641d2 = {"<anonymous>", "", "Ljava/security/cert/X509Certificate;", "invoke"}, mo16642k = 3, mo16643mv = {1, 1, 15})
/* compiled from: CertificatePinner.kt */
final class CertificatePinner$check$1 extends C10203k implements C9102a<List<? extends X509Certificate>> {
    final /* synthetic */ String $hostname;
    final /* synthetic */ List $peerCertificates;
    final /* synthetic */ CertificatePinner this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CertificatePinner$check$1(CertificatePinner certificatePinner, List list, String str) {
        super(0);
        this.this$0 = certificatePinner;
        this.$peerCertificates = list;
        this.$hostname = str;
    }

    public final List<X509Certificate> invoke() {
        List<Certificate> list;
        CertificateChainCleaner certificateChainCleaner$okhttp = this.this$0.getCertificateChainCleaner$okhttp();
        if (certificateChainCleaner$okhttp == null || (list = certificateChainCleaner$okhttp.clean(this.$peerCertificates, this.$hostname)) == null) {
            list = this.$peerCertificates;
        }
        ArrayList arrayList = new ArrayList(C10531p.m35750a(list, 10));
        for (Certificate certificate : list) {
            if (certificate != null) {
                arrayList.add((X509Certificate) certificate);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type java.security.cert.X509Certificate");
            }
        }
        return arrayList;
    }
}
