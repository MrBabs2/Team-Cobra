package p015cm.aptoide.p016pt.app.appsflyer;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, mo16641d2 = {"Lcm/aptoide/pt/app/appsflyer/AppsFlyerResponse;", "", "ok", "", "(Ljava/lang/String;)V", "getOk", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.app.appsflyer.AppsFlyerResponse */
/* compiled from: AppsFlyerResponse.kt */
public final class AppsFlyerResponse {

    /* renamed from: ok */
    private final String f3856ok;

    public AppsFlyerResponse(String str) {
        C10202j.m34178b(str, "ok");
        this.f3856ok = str;
    }

    public static /* synthetic */ AppsFlyerResponse copy$default(AppsFlyerResponse appsFlyerResponse, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appsFlyerResponse.f3856ok;
        }
        return appsFlyerResponse.copy(str);
    }

    public final String component1() {
        return this.f3856ok;
    }

    public final AppsFlyerResponse copy(String str) {
        C10202j.m34178b(str, "ok");
        return new AppsFlyerResponse(str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof AppsFlyerResponse) && C10202j.m34176a((Object) this.f3856ok, (Object) ((AppsFlyerResponse) obj).f3856ok);
        }
        return true;
    }

    public final String getOk() {
        return this.f3856ok;
    }

    public int hashCode() {
        String str = this.f3856ok;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "AppsFlyerResponse(ok=" + this.f3856ok + ")";
    }
}
