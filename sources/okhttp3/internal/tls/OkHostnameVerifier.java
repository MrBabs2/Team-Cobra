package okhttp3.internal.tls;

import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.C4789l;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;
import okhttp3.CertificatePinner;
import okhttp3.internal.Util;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nJ\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u001c\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\bH\u0002J\u0018\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0017"}, mo16641d2 = {"Lokhttp3/internal/tls/OkHostnameVerifier;", "Ljavax/net/ssl/HostnameVerifier;", "()V", "ALT_DNS_NAME", "", "ALT_IPA_NAME", "allSubjectAltNames", "", "", "certificate", "Ljava/security/cert/X509Certificate;", "getSubjectAltNames", "type", "verify", "", "host", "session", "Ljavax/net/ssl/SSLSession;", "verifyHostname", "hostname", "pattern", "verifyIpAddress", "ipAddress", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
/* compiled from: OkHostnameVerifier.kt */
public final class OkHostnameVerifier implements HostnameVerifier {
    private static final int ALT_DNS_NAME = 2;
    private static final int ALT_IPA_NAME = 7;
    public static final OkHostnameVerifier INSTANCE = new OkHostnameVerifier();

    private OkHostnameVerifier() {
    }

    private final List<String> getSubjectAltNames(X509Certificate x509Certificate, int i) {
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return C10529o.m35736a();
            }
            ArrayList arrayList = new ArrayList();
            for (List next : subjectAlternativeNames) {
                if (next != null) {
                    if (next.size() >= 2) {
                        if (!(!C10202j.m34176a(next.get(0), (Object) Integer.valueOf(i)))) {
                            Object obj = next.get(1);
                            if (obj == null) {
                                continue;
                            } else if (obj != null) {
                                arrayList.add((String) obj);
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type kotlin.String");
                            }
                        }
                    }
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return C10529o.m35736a();
        }
    }

    private final boolean verifyHostname(String str, X509Certificate x509Certificate) {
        Locale locale = Locale.US;
        C10202j.m34174a((Object) locale, "Locale.US");
        if (str != null) {
            String lowerCase = str.toLowerCase(locale);
            C10202j.m34174a((Object) lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            List<String> subjectAltNames = getSubjectAltNames(x509Certificate, 2);
            if ((subjectAltNames instanceof Collection) && subjectAltNames.isEmpty()) {
                return false;
            }
            for (String verifyHostname : subjectAltNames) {
                if (INSTANCE.verifyHostname(lowerCase, verifyHostname)) {
                    return true;
                }
            }
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    private final boolean verifyIpAddress(String str, X509Certificate x509Certificate) {
        List<String> subjectAltNames = getSubjectAltNames(x509Certificate, 7);
        if (!(subjectAltNames instanceof Collection) || !subjectAltNames.isEmpty()) {
            for (String b : subjectAltNames) {
                if (C12130v.m40053b(str, b, true)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final List<String> allSubjectAltNames(X509Certificate x509Certificate) {
        C10202j.m34178b(x509Certificate, "certificate");
        return C10539w.m35796d(getSubjectAltNames(x509Certificate, 7), getSubjectAltNames(x509Certificate, 2));
    }

    public boolean verify(String str, SSLSession sSLSession) {
        C10202j.m34178b(str, "host");
        C10202j.m34178b(sSLSession, "session");
        try {
            Certificate certificate = sSLSession.getPeerCertificates()[0];
            if (certificate != null) {
                return verify(str, (X509Certificate) certificate);
            }
            throw new TypeCastException("null cannot be cast to non-null type java.security.cert.X509Certificate");
        } catch (SSLException unused) {
            return false;
        }
    }

    public final boolean verify(String str, X509Certificate x509Certificate) {
        C10202j.m34178b(str, "host");
        C10202j.m34178b(x509Certificate, "certificate");
        if (Util.canParseAsIpAddress(str)) {
            return verifyIpAddress(str, x509Certificate);
        }
        return verifyHostname(str, x509Certificate);
    }

    private final boolean verifyHostname(String str, String str2) {
        if (!(str == null || str.length() == 0) && !C12130v.m40056c(str, ".", false, 2, (Object) null) && !C12130v.m40052a(str, "..", false, 2, (Object) null)) {
            if (!(str2 == null || str2.length() == 0) && !C12130v.m40056c(str2, ".", false, 2, (Object) null) && !C12130v.m40052a(str2, "..", false, 2, (Object) null)) {
                if (!C12130v.m40052a(str, ".", false, 2, (Object) null)) {
                    str = str + ".";
                }
                String str3 = str;
                if (!C12130v.m40052a(str2, ".", false, 2, (Object) null)) {
                    str2 = str2 + ".";
                }
                Locale locale = Locale.US;
                C10202j.m34174a((Object) locale, "Locale.US");
                if (str2 != null) {
                    String lowerCase = str2.toLowerCase(locale);
                    C10202j.m34174a((Object) lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    if (!C12131w.m40085a((CharSequence) lowerCase, (CharSequence) "*", false, 2, (Object) null)) {
                        return C10202j.m34176a((Object) str3, (Object) lowerCase);
                    }
                    if (!C12130v.m40056c(lowerCase, CertificatePinner.WILDCARD, false, 2, (Object) null) || C12131w.m40060a((CharSequence) lowerCase, '*', 1, false, 4, (Object) null) != -1 || str3.length() < lowerCase.length() || C10202j.m34176a((Object) CertificatePinner.WILDCARD, (Object) lowerCase)) {
                        return false;
                    }
                    if (lowerCase != null) {
                        String substring = lowerCase.substring(1);
                        C10202j.m34174a((Object) substring, "(this as java.lang.String).substring(startIndex)");
                        if (!C12130v.m40052a(str3, substring, false, 2, (Object) null)) {
                            return false;
                        }
                        int length = str3.length() - substring.length();
                        return length <= 0 || C12131w.m40087b((CharSequence) str3, '.', length + -1, false, 4, (Object) null) == -1;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
        }
        return false;
    }
}
