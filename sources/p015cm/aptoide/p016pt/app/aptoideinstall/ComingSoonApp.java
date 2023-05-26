package p015cm.aptoide.p016pt.app.aptoideinstall;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, mo16641d2 = {"Lcm/aptoide/pt/app/aptoideinstall/ComingSoonApp;", "", "appName", "", "appIcon", "md5", "storeName", "packageName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAppIcon", "()Ljava/lang/String;", "getAppName", "getMd5", "getPackageName", "getStoreName", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.app.aptoideinstall.ComingSoonApp */
/* compiled from: ComingSoonApp.kt */
public final class ComingSoonApp {
    private final String appIcon;
    private final String appName;
    private final String md5;
    private final String packageName;
    private final String storeName;

    public ComingSoonApp(String str, String str2, String str3, String str4, String str5) {
        C10202j.m34178b(str, "appName");
        C10202j.m34178b(str2, "appIcon");
        C10202j.m34178b(str3, "md5");
        C10202j.m34178b(str4, "storeName");
        C10202j.m34178b(str5, "packageName");
        this.appName = str;
        this.appIcon = str2;
        this.md5 = str3;
        this.storeName = str4;
        this.packageName = str5;
    }

    public static /* synthetic */ ComingSoonApp copy$default(ComingSoonApp comingSoonApp, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = comingSoonApp.appName;
        }
        if ((i & 2) != 0) {
            str2 = comingSoonApp.appIcon;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = comingSoonApp.md5;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = comingSoonApp.storeName;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = comingSoonApp.packageName;
        }
        return comingSoonApp.copy(str, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.appName;
    }

    public final String component2() {
        return this.appIcon;
    }

    public final String component3() {
        return this.md5;
    }

    public final String component4() {
        return this.storeName;
    }

    public final String component5() {
        return this.packageName;
    }

    public final ComingSoonApp copy(String str, String str2, String str3, String str4, String str5) {
        C10202j.m34178b(str, "appName");
        C10202j.m34178b(str2, "appIcon");
        C10202j.m34178b(str3, "md5");
        C10202j.m34178b(str4, "storeName");
        C10202j.m34178b(str5, "packageName");
        return new ComingSoonApp(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComingSoonApp)) {
            return false;
        }
        ComingSoonApp comingSoonApp = (ComingSoonApp) obj;
        return C10202j.m34176a((Object) this.appName, (Object) comingSoonApp.appName) && C10202j.m34176a((Object) this.appIcon, (Object) comingSoonApp.appIcon) && C10202j.m34176a((Object) this.md5, (Object) comingSoonApp.md5) && C10202j.m34176a((Object) this.storeName, (Object) comingSoonApp.storeName) && C10202j.m34176a((Object) this.packageName, (Object) comingSoonApp.packageName);
    }

    public final String getAppIcon() {
        return this.appIcon;
    }

    public final String getAppName() {
        return this.appName;
    }

    public final String getMd5() {
        return this.md5;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final String getStoreName() {
        return this.storeName;
    }

    public int hashCode() {
        String str = this.appName;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.appIcon;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.md5;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.storeName;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.packageName;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        return "ComingSoonApp(appName=" + this.appName + ", appIcon=" + this.appIcon + ", md5=" + this.md5 + ", storeName=" + this.storeName + ", packageName=" + this.packageName + ")";
    }
}
