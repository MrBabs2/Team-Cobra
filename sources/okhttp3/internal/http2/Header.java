package okhttp3.internal.http2;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.app.view.donations.DonationsAnalytics;
import p413s.C12911i;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0006\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0006\u0012\u0006\u0010\u0004\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000b\u001a\u00020\u0006HÆ\u0003J\t\u0010\f\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00062\b\b\u0002\u0010\u0004\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\nHÖ\u0001J\b\u0010\u0012\u001a\u00020\u0003H\u0016R\u0010\u0010\t\u001a\u00020\n8\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00068\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, mo16641d2 = {"Lokhttp3/internal/http2/Header;", "", "name", "", "value", "(Ljava/lang/String;Ljava/lang/String;)V", "Lokio/ByteString;", "(Lokio/ByteString;Ljava/lang/String;)V", "(Lokio/ByteString;Lokio/ByteString;)V", "hpackSize", "", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
/* compiled from: Header.kt */
public final class Header {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final C12911i PSEUDO_PREFIX = C12911i.f33159j.mo41249c(":");
    public static final C12911i RESPONSE_STATUS = C12911i.f33159j.mo41249c(RESPONSE_STATUS_UTF8);
    public static final String RESPONSE_STATUS_UTF8 = ":status";
    public static final C12911i TARGET_AUTHORITY = C12911i.f33159j.mo41249c(TARGET_AUTHORITY_UTF8);
    public static final String TARGET_AUTHORITY_UTF8 = ":authority";
    public static final C12911i TARGET_METHOD = C12911i.f33159j.mo41249c(TARGET_METHOD_UTF8);
    public static final String TARGET_METHOD_UTF8 = ":method";
    public static final C12911i TARGET_PATH = C12911i.f33159j.mo41249c(TARGET_PATH_UTF8);
    public static final String TARGET_PATH_UTF8 = ":path";
    public static final C12911i TARGET_SCHEME = C12911i.f33159j.mo41249c(TARGET_SCHEME_UTF8);
    public static final String TARGET_SCHEME_UTF8 = ":scheme";
    public final int hpackSize;
    public final C12911i name;
    public final C12911i value;

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000¨\u0006\u0010"}, mo16641d2 = {"Lokhttp3/internal/http2/Header$Companion;", "", "()V", "PSEUDO_PREFIX", "Lokio/ByteString;", "RESPONSE_STATUS", "RESPONSE_STATUS_UTF8", "", "TARGET_AUTHORITY", "TARGET_AUTHORITY_UTF8", "TARGET_METHOD", "TARGET_METHOD_UTF8", "TARGET_PATH", "TARGET_PATH_UTF8", "TARGET_SCHEME", "TARGET_SCHEME_UTF8", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
    /* compiled from: Header.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public Header(C12911i iVar, C12911i iVar2) {
        C10202j.m34178b(iVar, "name");
        C10202j.m34178b(iVar2, DonationsAnalytics.VALUE);
        this.name = iVar;
        this.value = iVar2;
        this.hpackSize = iVar.mo41239s() + 32 + this.value.mo41239s();
    }

    public static /* synthetic */ Header copy$default(Header header, C12911i iVar, C12911i iVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            iVar = header.name;
        }
        if ((i & 2) != 0) {
            iVar2 = header.value;
        }
        return header.copy(iVar, iVar2);
    }

    public final C12911i component1() {
        return this.name;
    }

    public final C12911i component2() {
        return this.value;
    }

    public final Header copy(C12911i iVar, C12911i iVar2) {
        C10202j.m34178b(iVar, "name");
        C10202j.m34178b(iVar2, DonationsAnalytics.VALUE);
        return new Header(iVar, iVar2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Header)) {
            return false;
        }
        Header header = (Header) obj;
        return C10202j.m34176a((Object) this.name, (Object) header.name) && C10202j.m34176a((Object) this.value, (Object) header.value);
    }

    public int hashCode() {
        C12911i iVar = this.name;
        int i = 0;
        int hashCode = (iVar != null ? iVar.hashCode() : 0) * 31;
        C12911i iVar2 = this.value;
        if (iVar2 != null) {
            i = iVar2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return this.name.mo41242v() + ": " + this.value.mo41242v();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Header(String str, String str2) {
        this(C12911i.f33159j.mo41249c(str), C12911i.f33159j.mo41249c(str2));
        C10202j.m34178b(str, "name");
        C10202j.m34178b(str2, DonationsAnalytics.VALUE);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Header(C12911i iVar, String str) {
        this(iVar, C12911i.f33159j.mo41249c(str));
        C10202j.m34178b(iVar, "name");
        C10202j.m34178b(str, DonationsAnalytics.VALUE);
    }
}
