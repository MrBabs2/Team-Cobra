package p015cm.aptoide.p016pt.util;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, mo16641d2 = {"Lcm/aptoide/pt/util/ApkfyParameters;", "", "appId", "", "oemId", "", "(Ljava/lang/Long;Ljava/lang/String;)V", "getAppId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getOemId", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/Long;Ljava/lang/String;)Lcm/aptoide/pt/util/ApkfyParameters;", "equals", "", "other", "hashCode", "", "toString", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.util.ApkfyParameters */
/* compiled from: ApkfyParameters.kt */
public final class ApkfyParameters {
    private final Long appId;
    private final String oemId;

    public ApkfyParameters(Long l, String str) {
        this.appId = l;
        this.oemId = str;
    }

    public static /* synthetic */ ApkfyParameters copy$default(ApkfyParameters apkfyParameters, Long l, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            l = apkfyParameters.appId;
        }
        if ((i & 2) != 0) {
            str = apkfyParameters.oemId;
        }
        return apkfyParameters.copy(l, str);
    }

    public final Long component1() {
        return this.appId;
    }

    public final String component2() {
        return this.oemId;
    }

    public final ApkfyParameters copy(Long l, String str) {
        return new ApkfyParameters(l, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApkfyParameters)) {
            return false;
        }
        ApkfyParameters apkfyParameters = (ApkfyParameters) obj;
        return C10202j.m34176a((Object) this.appId, (Object) apkfyParameters.appId) && C10202j.m34176a((Object) this.oemId, (Object) apkfyParameters.oemId);
    }

    public final Long getAppId() {
        return this.appId;
    }

    public final String getOemId() {
        return this.oemId;
    }

    public int hashCode() {
        Long l = this.appId;
        int i = 0;
        int hashCode = (l != null ? l.hashCode() : 0) * 31;
        String str = this.oemId;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "ApkfyParameters(appId=" + this.appId + ", oemId=" + this.oemId + ")";
    }
}
