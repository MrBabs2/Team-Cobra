package okhttp3;

import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.C4789l;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10187b0;
import kotlin.jvm.internal.C10202j;
import kotlin.p215c0.p216c.C9102a;
import okhttp3.HttpUrl;
import okhttp3.internal.tls.CertificateChainCleaner;
import p413s.C12911i;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 !2\u00020\u0001:\u0003 !\"B\u001f\b\u0000\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J)\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000fH\u0000¢\u0006\u0002\b\u0012J)\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u0014\"\u00020\u0015H\u0007¢\u0006\u0002\u0010\u0016J\u001c\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0010J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u0002J\u001b\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u00102\u0006\u0010\f\u001a\u00020\rH\u0000¢\u0006\u0002\b\u001bJ\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0017\u0010\u001e\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0002\b\u001fR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, mo16641d2 = {"Lokhttp3/CertificatePinner;", "", "pins", "", "Lokhttp3/CertificatePinner$Pin;", "certificateChainCleaner", "Lokhttp3/internal/tls/CertificateChainCleaner;", "(Ljava/util/Set;Lokhttp3/internal/tls/CertificateChainCleaner;)V", "getCertificateChainCleaner$okhttp", "()Lokhttp3/internal/tls/CertificateChainCleaner;", "check", "", "hostname", "", "cleanedPeerCertificatesFn", "Lkotlin/Function0;", "", "Ljava/security/cert/X509Certificate;", "check$okhttp", "peerCertificates", "", "Ljava/security/cert/Certificate;", "(Ljava/lang/String;[Ljava/security/cert/Certificate;)V", "equals", "", "other", "findMatchingPins", "findMatchingPins$okhttp", "hashCode", "", "withCertificateChainCleaner", "withCertificateChainCleaner$okhttp", "Builder", "Companion", "Pin", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
/* compiled from: CertificatePinner.kt */
public final class CertificatePinner {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final CertificatePinner DEFAULT = new Builder().build();
    public static final String WILDCARD = "*.";
    private final CertificateChainCleaner certificateChainCleaner;
    private final Set<Pin> pins;

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J'\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\t\"\u00020\b¢\u0006\u0002\u0010\nJ\u0006\u0010\u000b\u001a\u00020\fR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, mo16641d2 = {"Lokhttp3/CertificatePinner$Builder;", "", "()V", "pins", "", "Lokhttp3/CertificatePinner$Pin;", "add", "pattern", "", "", "(Ljava/lang/String;[Ljava/lang/String;)Lokhttp3/CertificatePinner$Builder;", "build", "Lokhttp3/CertificatePinner;", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
    /* compiled from: CertificatePinner.kt */
    public static final class Builder {
        private final List<Pin> pins = new ArrayList();

        public final Builder add(String str, String... strArr) {
            C10202j.m34178b(str, "pattern");
            C10202j.m34178b(strArr, "pins");
            for (String newPin$okhttp : strArr) {
                this.pins.add(CertificatePinner.Companion.newPin$okhttp(str, newPin$okhttp));
            }
            return this;
        }

        public final CertificatePinner build() {
            return new CertificatePinner(C10539w.m35818q(this.pins), (CertificateChainCleaner) null);
        }
    }

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u000bJ\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\u0011\u0010\u000e\u001a\u00020\u000f*\u00020\u0010H\u0000¢\u0006\u0002\b\u0011J\u0011\u0010\u0012\u001a\u00020\u000f*\u00020\u0010H\u0000¢\u0006\u0002\b\u0013R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0014"}, mo16641d2 = {"Lokhttp3/CertificatePinner$Companion;", "", "()V", "DEFAULT", "Lokhttp3/CertificatePinner;", "WILDCARD", "", "newPin", "Lokhttp3/CertificatePinner$Pin;", "pattern", "pin", "newPin$okhttp", "certificate", "Ljava/security/cert/Certificate;", "toSha1ByteString", "Lokio/ByteString;", "Ljava/security/cert/X509Certificate;", "toSha1ByteString$okhttp", "toSha256ByteString", "toSha256ByteString$okhttp", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
    /* compiled from: CertificatePinner.kt */
    public static final class Companion {
        private Companion() {
        }

        public final Pin newPin$okhttp(String str, String str2) {
            String str3;
            C10202j.m34178b(str, "pattern");
            C10202j.m34178b(str2, "pin");
            if (C12130v.m40056c(str, CertificatePinner.WILDCARD, false, 2, (Object) null)) {
                HttpUrl.Companion companion = HttpUrl.Companion;
                StringBuilder sb = new StringBuilder();
                sb.append("http://");
                String substring = str.substring(2);
                C10202j.m34174a((Object) substring, "(this as java.lang.String).substring(startIndex)");
                sb.append(substring);
                str3 = companion.get(sb.toString()).host();
            } else {
                HttpUrl.Companion companion2 = HttpUrl.Companion;
                str3 = companion2.get("http://" + str).host();
            }
            if (C12130v.m40056c(str2, "sha1/", false, 2, (Object) null)) {
                C12911i.C12912a aVar = C12911i.f33159j;
                String substring2 = str2.substring(5);
                C10202j.m34174a((Object) substring2, "(this as java.lang.String).substring(startIndex)");
                C12911i a = aVar.mo41244a(substring2);
                if (a != null) {
                    return new Pin(str, str3, "sha1/", a);
                }
                C10202j.m34172a();
                throw null;
            } else if (C12130v.m40056c(str2, "sha256/", false, 2, (Object) null)) {
                C12911i.C12912a aVar2 = C12911i.f33159j;
                String substring3 = str2.substring(7);
                C10202j.m34174a((Object) substring3, "(this as java.lang.String).substring(startIndex)");
                C12911i a2 = aVar2.mo41244a(substring3);
                if (a2 != null) {
                    return new Pin(str, str3, "sha256/", a2);
                }
                C10202j.m34172a();
                throw null;
            } else {
                throw new IllegalArgumentException("pins must start with 'sha256/' or 'sha1/': " + str2);
            }
        }

        public final String pin(Certificate certificate) {
            C10202j.m34178b(certificate, "certificate");
            if (certificate instanceof X509Certificate) {
                return "sha256/" + toSha256ByteString$okhttp((X509Certificate) certificate).mo41218a();
            }
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates".toString());
        }

        public final C12911i toSha1ByteString$okhttp(X509Certificate x509Certificate) {
            C10202j.m34178b(x509Certificate, "$this$toSha1ByteString");
            C12911i.C12912a aVar = C12911i.f33159j;
            PublicKey publicKey = x509Certificate.getPublicKey();
            C10202j.m34174a((Object) publicKey, "publicKey");
            byte[] encoded = publicKey.getEncoded();
            C10202j.m34174a((Object) encoded, "publicKey.encoded");
            return C12911i.C12912a.m41657a(aVar, encoded, 0, 0, 3, (Object) null).mo41237q();
        }

        public final C12911i toSha256ByteString$okhttp(X509Certificate x509Certificate) {
            C10202j.m34178b(x509Certificate, "$this$toSha256ByteString");
            C12911i.C12912a aVar = C12911i.f33159j;
            PublicKey publicKey = x509Certificate.getPublicKey();
            C10202j.m34174a((Object) publicKey, "publicKey");
            byte[] encoded = publicKey.getEncoded();
            C10202j.m34174a((Object) encoded, "publicKey.encoded");
            return C12911i.C12912a.m41657a(aVar, encoded, 0, 0, 3, (Object) null).mo41238r();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÂ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u000e\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0003J\b\u0010\u001a\u001a\u00020\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001b"}, mo16641d2 = {"Lokhttp3/CertificatePinner$Pin;", "", "pattern", "", "canonicalHostname", "hashAlgorithm", "hash", "Lokio/ByteString;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getHash", "()Lokio/ByteString;", "getHashAlgorithm", "()Ljava/lang/String;", "getPattern", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "matches", "hostname", "toString", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
    /* compiled from: CertificatePinner.kt */
    public static final class Pin {
        private final String canonicalHostname;
        private final C12911i hash;
        private final String hashAlgorithm;
        private final String pattern;

        public Pin(String str, String str2, String str3, C12911i iVar) {
            C10202j.m34178b(str, "pattern");
            C10202j.m34178b(str2, "canonicalHostname");
            C10202j.m34178b(str3, "hashAlgorithm");
            C10202j.m34178b(iVar, "hash");
            this.pattern = str;
            this.canonicalHostname = str2;
            this.hashAlgorithm = str3;
            this.hash = iVar;
        }

        private final String component2() {
            return this.canonicalHostname;
        }

        public static /* synthetic */ Pin copy$default(Pin pin, String str, String str2, String str3, C12911i iVar, int i, Object obj) {
            if ((i & 1) != 0) {
                str = pin.pattern;
            }
            if ((i & 2) != 0) {
                str2 = pin.canonicalHostname;
            }
            if ((i & 4) != 0) {
                str3 = pin.hashAlgorithm;
            }
            if ((i & 8) != 0) {
                iVar = pin.hash;
            }
            return pin.copy(str, str2, str3, iVar);
        }

        public final String component1() {
            return this.pattern;
        }

        public final String component3() {
            return this.hashAlgorithm;
        }

        public final C12911i component4() {
            return this.hash;
        }

        public final Pin copy(String str, String str2, String str3, C12911i iVar) {
            C10202j.m34178b(str, "pattern");
            C10202j.m34178b(str2, "canonicalHostname");
            C10202j.m34178b(str3, "hashAlgorithm");
            C10202j.m34178b(iVar, "hash");
            return new Pin(str, str2, str3, iVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Pin)) {
                return false;
            }
            Pin pin = (Pin) obj;
            return C10202j.m34176a((Object) this.pattern, (Object) pin.pattern) && C10202j.m34176a((Object) this.canonicalHostname, (Object) pin.canonicalHostname) && C10202j.m34176a((Object) this.hashAlgorithm, (Object) pin.hashAlgorithm) && C10202j.m34176a((Object) this.hash, (Object) pin.hash);
        }

        public final C12911i getHash() {
            return this.hash;
        }

        public final String getHashAlgorithm() {
            return this.hashAlgorithm;
        }

        public final String getPattern() {
            return this.pattern;
        }

        public int hashCode() {
            String str = this.pattern;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.canonicalHostname;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.hashAlgorithm;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            C12911i iVar = this.hash;
            if (iVar != null) {
                i = iVar.hashCode();
            }
            return hashCode3 + i;
        }

        public final boolean matches(String str) {
            C10202j.m34178b(str, "hostname");
            if (!C12130v.m40056c(this.pattern, CertificatePinner.WILDCARD, false, 2, (Object) null)) {
                return C10202j.m34176a((Object) str, (Object) this.canonicalHostname);
            }
            int a = C12131w.m40060a((CharSequence) str, '.', 0, false, 6, (Object) null);
            if ((str.length() - a) - 1 != this.canonicalHostname.length()) {
                return false;
            }
            if (C12130v.m40050a(str, this.canonicalHostname, a + 1, false, 4, (Object) null)) {
                return true;
            }
            return false;
        }

        public String toString() {
            return this.hashAlgorithm + this.hash.mo41218a();
        }
    }

    public CertificatePinner(Set<Pin> set, CertificateChainCleaner certificateChainCleaner2) {
        C10202j.m34178b(set, "pins");
        this.pins = set;
        this.certificateChainCleaner = certificateChainCleaner2;
    }

    public static final String pin(Certificate certificate) {
        return Companion.pin(certificate);
    }

    public final void check(String str, List<? extends Certificate> list) throws SSLPeerUnverifiedException {
        C10202j.m34178b(str, "hostname");
        C10202j.m34178b(list, "peerCertificates");
        check$okhttp(str, new CertificatePinner$check$1(this, list, str));
    }

    public final void check$okhttp(String str, C9102a<? extends List<? extends X509Certificate>> aVar) {
        Pin next;
        C10202j.m34178b(str, "hostname");
        C10202j.m34178b(aVar, "cleanedPeerCertificatesFn");
        List<Pin> findMatchingPins$okhttp = findMatchingPins$okhttp(str);
        if (!findMatchingPins$okhttp.isEmpty()) {
            List<X509Certificate> list = (List) aVar.invoke();
            loop0:
            for (X509Certificate x509Certificate : list) {
                Iterator<Pin> it = findMatchingPins$okhttp.iterator();
                C12911i iVar = null;
                C12911i iVar2 = null;
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        String hashAlgorithm = next.getHashAlgorithm();
                        int hashCode = hashAlgorithm.hashCode();
                        if (hashCode == 109397962) {
                            if (!hashAlgorithm.equals("sha1/")) {
                                break loop0;
                            }
                            if (iVar == null) {
                                iVar = Companion.toSha1ByteString$okhttp(x509Certificate);
                            }
                            if (C10202j.m34176a((Object) next.getHash(), (Object) iVar)) {
                                return;
                            }
                        } else if (hashCode != 2052263656 || !hashAlgorithm.equals("sha256/")) {
                            break loop0;
                        } else {
                            if (iVar2 == null) {
                                iVar2 = Companion.toSha256ByteString$okhttp(x509Certificate);
                            }
                            if (C10202j.m34176a((Object) next.getHash(), (Object) iVar2)) {
                                return;
                            }
                        }
                    }
                }
                throw new AssertionError("unsupported hashAlgorithm: " + next.getHashAlgorithm());
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Certificate pinning failure!");
            sb.append("\n  Peer certificate chain:");
            for (X509Certificate x509Certificate2 : list) {
                if (x509Certificate2 != null) {
                    sb.append("\n    ");
                    sb.append(Companion.pin(x509Certificate2));
                    sb.append(": ");
                    Principal subjectDN = x509Certificate2.getSubjectDN();
                    C10202j.m34174a((Object) subjectDN, "x509Certificate.subjectDN");
                    sb.append(subjectDN.getName());
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                }
            }
            sb.append("\n  Pinned certificates for ");
            sb.append(str);
            sb.append(":");
            for (Pin append : findMatchingPins$okhttp) {
                sb.append("\n    ");
                sb.append(append);
            }
            String sb2 = sb.toString();
            C10202j.m34174a((Object) sb2, "StringBuilder().apply(builderAction).toString()");
            throw new SSLPeerUnverifiedException(sb2);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof CertificatePinner) {
            CertificatePinner certificatePinner = (CertificatePinner) obj;
            return C10202j.m34176a((Object) certificatePinner.pins, (Object) this.pins) && C10202j.m34176a((Object) certificatePinner.certificateChainCleaner, (Object) this.certificateChainCleaner);
        }
    }

    public final List<Pin> findMatchingPins$okhttp(String str) {
        C10202j.m34178b(str, "hostname");
        List<Pin> a = C10529o.m35736a();
        for (Pin next : this.pins) {
            if (next.matches(str)) {
                if (a.isEmpty()) {
                    a = new ArrayList<>();
                }
                if (a != null) {
                    C10187b0.m34145b(a).add(next);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableList<okhttp3.CertificatePinner.Pin>");
                }
            }
        }
        return a;
    }

    public final CertificateChainCleaner getCertificateChainCleaner$okhttp() {
        return this.certificateChainCleaner;
    }

    public int hashCode() {
        int hashCode = (1517 + this.pins.hashCode()) * 41;
        CertificateChainCleaner certificateChainCleaner2 = this.certificateChainCleaner;
        return hashCode + (certificateChainCleaner2 != null ? certificateChainCleaner2.hashCode() : 0);
    }

    public final CertificatePinner withCertificateChainCleaner$okhttp(CertificateChainCleaner certificateChainCleaner2) {
        if (C10202j.m34176a((Object) this.certificateChainCleaner, (Object) certificateChainCleaner2)) {
            return this;
        }
        return new CertificatePinner(this.pins, certificateChainCleaner2);
    }

    public final void check(String str, Certificate... certificateArr) throws SSLPeerUnverifiedException {
        C10202j.m34178b(str, "hostname");
        C10202j.m34178b(certificateArr, "peerCertificates");
        check(str, (List<? extends Certificate>) C10519k.m35653k(certificateArr));
    }
}
