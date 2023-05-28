package p015cm.aptoide.p016pt.download.view.outofspace;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.database.room.RoomInstalled;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010\u0017\u001a\u00020\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, mo16641d2 = {"Lcm/aptoide/pt/download/view/outofspace/InstalledApp;", "", "appName", "", "packageName", "icon", "size", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getAppName", "()Ljava/lang/String;", "getIcon", "getPackageName", "getSize", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "getIdentifier", "hashCode", "", "toString", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.download.view.outofspace.InstalledApp */
/* compiled from: InstalledApp.kt */
public final class InstalledApp {
    private final String appName;
    private final String icon;
    private final String packageName;
    private final long size;

    public InstalledApp(String str, String str2, String str3, long j) {
        C10202j.m34178b(str, "appName");
        C10202j.m34178b(str2, "packageName");
        C10202j.m34178b(str3, RoomInstalled.ICON);
        this.appName = str;
        this.packageName = str2;
        this.icon = str3;
        this.size = j;
    }

    public static /* synthetic */ InstalledApp copy$default(InstalledApp installedApp, String str, String str2, String str3, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = installedApp.appName;
        }
        if ((i & 2) != 0) {
            str2 = installedApp.packageName;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = installedApp.icon;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            j = installedApp.size;
        }
        return installedApp.copy(str, str4, str5, j);
    }

    public final String component1() {
        return this.appName;
    }

    public final String component2() {
        return this.packageName;
    }

    public final String component3() {
        return this.icon;
    }

    public final long component4() {
        return this.size;
    }

    public final InstalledApp copy(String str, String str2, String str3, long j) {
        C10202j.m34178b(str, "appName");
        C10202j.m34178b(str2, "packageName");
        C10202j.m34178b(str3, RoomInstalled.ICON);
        return new InstalledApp(str, str2, str3, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstalledApp)) {
            return false;
        }
        InstalledApp installedApp = (InstalledApp) obj;
        return C10202j.m34176a((Object) this.appName, (Object) installedApp.appName) && C10202j.m34176a((Object) this.packageName, (Object) installedApp.packageName) && C10202j.m34176a((Object) this.icon, (Object) installedApp.icon) && this.size == installedApp.size;
    }

    public final String getAppName() {
        return this.appName;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getIdentifier() {
        return this.packageName;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final long getSize() {
        return this.size;
    }

    public int hashCode() {
        String str = this.appName;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.packageName;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.icon;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((hashCode2 + i) * 31) + C4755f.m7799a(this.size);
    }

    public String toString() {
        return "InstalledApp(appName=" + this.appName + ", packageName=" + this.packageName + ", icon=" + this.icon + ", size=" + this.size + ")";
    }
}
