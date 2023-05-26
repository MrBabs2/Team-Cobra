package com.flurry.sdk;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLPeerUnverifiedException;

/* renamed from: com.flurry.sdk.l1 */
public final class C6915l1 {

    /* renamed from: a */
    public static final Set<String> f12960a;

    /* renamed from: b */
    private static X509TrustManagerExtensions f12961b;

    static {
        HashSet hashSet = new HashSet(13);
        f12960a = hashSet;
        hashSet.add("WoiWRyIOVNa9ihaBciRSC7XHjliYS9VwUGOIud4PB18=");
        f12960a.add("SVqWumuteCQHvVIaALrOZXuzVVVeS7f4FGxxu6V+es4=");
        f12960a.add("cAajgxHlj7GTSEIzIYIQxmEloOSoJq7VOaxWHfv72QM=");
        f12960a.add("I/Lt/z7ekCWanjD0Cvj5EqXls2lOaThEA0H2Bg4BT/o=");
        f12960a.add("Wd8xe/qfTwq3ylFNd3IpaqLHZbh2ZNCLluVzmeNkcpw=");
        f12960a.add("JbQbUG5JMJUoI6brnx0x3vZF6jilxsapbXGVfjhN8Fg=");
        f12960a.add("r/mIkG3eEpVdm+u/ko/cwxzOMo1bk4TyHIlByibiA5E=");
        f12960a.add("UZJDjsNp1+4M5x9cbbdflB779y5YRBcV6Z6rBMLIrO4=");
        f12960a.add("lnsM2T/O9/J84sJFdnrpsFp3awZJ+ZZbYpCWhGloaHI=");
        f12960a.add("i7WTqTvh0OioIruIfFR4kMPnBqrS2rdiVPl/s2uC/CY=");
        f12960a.add("uUwZgwDOxcBXrQcntwu+kYFpkiVkOaezL0WYEZ3anJc=");
        f12960a.add("dolnbtzEBnELx/9lOEQ22e6OZO/QNb6VSSX2XHA3E7A=");
        f12960a.add("2fRAUXyxl4A1/XHrKNBmc8bTkzA7y4FB/GLJuNAzCqY=");
        f12961b = null;
        if (Build.VERSION.SDK_INT >= 17) {
            f12961b = new X509TrustManagerExtensions(m14693a());
        }
    }

    /* renamed from: a */
    public static void m14694a(HttpsURLConnection httpsURLConnection) throws SSLException {
        if (Build.VERSION.SDK_INT >= 17 && f12961b != null) {
            String str = "";
            try {
                Certificate[] serverCertificates = httpsURLConnection.getServerCertificates();
                List<X509Certificate> checkServerTrusted = f12961b.checkServerTrusted((X509Certificate[]) Arrays.copyOf(serverCertificates, serverCertificates.length, X509Certificate[].class), "RSA", httpsURLConnection.getURL().getHost());
                if (checkServerTrusted != null) {
                    MessageDigest instance = MessageDigest.getInstance("SHA-256");
                    for (X509Certificate next : checkServerTrusted) {
                        byte[] encoded = next.getPublicKey().getEncoded();
                        instance.update(encoded, 0, encoded.length);
                        String encodeToString = Base64.encodeToString(instance.digest(), 2);
                        if (f12960a.contains(encodeToString)) {
                            C6792d1.m14478a("SslPinningValidator", "Found matched pin: ".concat(String.valueOf(encodeToString)));
                            return;
                        }
                        str = str + "    sha256/" + encodeToString + ": " + next.getSubjectDN().toString() + "\n";
                    }
                    throw new SSLPeerUnverifiedException("Certificate pinning failure!\n  Peer certificate chain:\n".concat(String.valueOf(str)));
                }
                throw new SSLPeerUnverifiedException("Empty trusted chain Certificate.");
            } catch (NoSuchAlgorithmException e) {
                C6792d1.m14479a("SslPinningValidator", "Error in validating pinning: ", (Throwable) e);
            } catch (CertificateException e2) {
                C6792d1.m14479a("SslPinningValidator", "Error in getting certificate: ", (Throwable) e2);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0022 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static javax.net.ssl.X509TrustManager m14693a() {
        /*
            java.lang.String r0 = "Error in getting trust manager: "
            java.lang.String r1 = "SslPinningValidator"
            r2 = 0
            java.lang.String r3 = javax.net.ssl.TrustManagerFactory.getDefaultAlgorithm()     // Catch:{ NoSuchAlgorithmException -> 0x001b, KeyStoreException -> 0x0015 }
            javax.net.ssl.TrustManagerFactory r3 = javax.net.ssl.TrustManagerFactory.getInstance(r3)     // Catch:{ NoSuchAlgorithmException -> 0x001b, KeyStoreException -> 0x0015 }
            r3.init(r2)     // Catch:{ NoSuchAlgorithmException -> 0x0013, KeyStoreException -> 0x0011 }
            goto L_0x0020
        L_0x0011:
            r4 = move-exception
            goto L_0x0017
        L_0x0013:
            r4 = move-exception
            goto L_0x001d
        L_0x0015:
            r4 = move-exception
            r3 = r2
        L_0x0017:
            com.flurry.sdk.C6792d1.m14479a((java.lang.String) r1, (java.lang.String) r0, (java.lang.Throwable) r4)
            goto L_0x0020
        L_0x001b:
            r4 = move-exception
            r3 = r2
        L_0x001d:
            com.flurry.sdk.C6792d1.m14479a((java.lang.String) r1, (java.lang.String) r0, (java.lang.Throwable) r4)
        L_0x0020:
            if (r3 != 0) goto L_0x0023
            return r2
        L_0x0023:
            javax.net.ssl.TrustManager[] r0 = r3.getTrustManagers()
            int r1 = r0.length
            r3 = 0
        L_0x0029:
            if (r3 >= r1) goto L_0x0038
            r4 = r0[r3]
            boolean r5 = r4 instanceof javax.net.ssl.X509TrustManager
            if (r5 == 0) goto L_0x0035
            r2 = r4
            javax.net.ssl.X509TrustManager r2 = (javax.net.ssl.X509TrustManager) r2
            goto L_0x0038
        L_0x0035:
            int r3 = r3 + 1
            goto L_0x0029
        L_0x0038:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.flurry.sdk.C6915l1.m14693a():javax.net.ssl.X509TrustManager");
    }
}
