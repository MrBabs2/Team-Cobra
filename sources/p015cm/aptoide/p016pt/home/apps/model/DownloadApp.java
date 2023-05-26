package p015cm.aptoide.p016pt.home.apps.model;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.database.room.RoomInstalled;
import p015cm.aptoide.p016pt.home.apps.App;
import p015cm.aptoide.p016pt.home.apps.model.StateApp;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\bHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010'\u001a\u00020\u000eHÆ\u0003Je\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\b\u0010-\u001a\u00020\u0003H\u0016J\b\u0010.\u001a\u00020/H\u0016J\t\u00100\u001a\u00020\bHÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0014\u0010\n\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018¨\u00062"}, mo16641d2 = {"Lcm/aptoide/pt/home/apps/model/DownloadApp;", "Lcm/aptoide/pt/home/apps/model/StateApp;", "name", "", "md5", "icon", "packageName", "progress", "", "version", "versionCode", "status", "Lcm/aptoide/pt/home/apps/model/StateApp$Status;", "appId", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILcm/aptoide/pt/home/apps/model/StateApp$Status;J)V", "getAppId", "()J", "getIcon", "()Ljava/lang/String;", "getMd5", "getName", "getPackageName", "getProgress", "()I", "getStatus", "()Lcm/aptoide/pt/home/apps/model/StateApp$Status;", "setStatus", "(Lcm/aptoide/pt/home/apps/model/StateApp$Status;)V", "getVersion", "getVersionCode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "getIdentifier", "getType", "Lcm/aptoide/pt/home/apps/App$Type;", "hashCode", "toString", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.home.apps.model.DownloadApp */
/* compiled from: DownloadApp.kt */
public final class DownloadApp implements StateApp {
    private final long appId;
    private final String icon;
    private final String md5;
    private final String name;
    private final String packageName;
    private final int progress;
    private StateApp.Status status;
    private final String version;
    private final int versionCode;

    public DownloadApp(String str, String str2, String str3, String str4, int i, String str5, int i2, StateApp.Status status2, long j) {
        C10202j.m34178b(str, "name");
        C10202j.m34178b(str2, "md5");
        C10202j.m34178b(str3, RoomInstalled.ICON);
        C10202j.m34178b(str4, "packageName");
        C10202j.m34178b(str5, "version");
        this.name = str;
        this.md5 = str2;
        this.icon = str3;
        this.packageName = str4;
        this.progress = i;
        this.version = str5;
        this.versionCode = i2;
        this.status = status2;
        this.appId = j;
    }

    public static /* synthetic */ DownloadApp copy$default(DownloadApp downloadApp, String str, String str2, String str3, String str4, int i, String str5, int i2, StateApp.Status status2, long j, int i3, Object obj) {
        DownloadApp downloadApp2 = downloadApp;
        int i4 = i3;
        return downloadApp.copy((i4 & 1) != 0 ? downloadApp2.name : str, (i4 & 2) != 0 ? downloadApp.getMd5() : str2, (i4 & 4) != 0 ? downloadApp2.icon : str3, (i4 & 8) != 0 ? downloadApp.getPackageName() : str4, (i4 & 16) != 0 ? downloadApp.getProgress() : i, (i4 & 32) != 0 ? downloadApp2.version : str5, (i4 & 64) != 0 ? downloadApp.getVersionCode() : i2, (i4 & 128) != 0 ? downloadApp.getStatus() : status2, (i4 & 256) != 0 ? downloadApp2.appId : j);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return getMd5();
    }

    public final String component3() {
        return this.icon;
    }

    public final String component4() {
        return getPackageName();
    }

    public final int component5() {
        return getProgress();
    }

    public final String component6() {
        return this.version;
    }

    public final int component7() {
        return getVersionCode();
    }

    public final StateApp.Status component8() {
        return getStatus();
    }

    public final long component9() {
        return this.appId;
    }

    public final DownloadApp copy(String str, String str2, String str3, String str4, int i, String str5, int i2, StateApp.Status status2, long j) {
        C10202j.m34178b(str, "name");
        C10202j.m34178b(str2, "md5");
        C10202j.m34178b(str3, RoomInstalled.ICON);
        String str6 = str4;
        C10202j.m34178b(str6, "packageName");
        String str7 = str5;
        C10202j.m34178b(str7, "version");
        return new DownloadApp(str, str2, str3, str6, i, str7, i2, status2, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DownloadApp)) {
            return false;
        }
        DownloadApp downloadApp = (DownloadApp) obj;
        return C10202j.m34176a((Object) this.name, (Object) downloadApp.name) && C10202j.m34176a((Object) getMd5(), (Object) downloadApp.getMd5()) && C10202j.m34176a((Object) this.icon, (Object) downloadApp.icon) && C10202j.m34176a((Object) getPackageName(), (Object) downloadApp.getPackageName()) && getProgress() == downloadApp.getProgress() && C10202j.m34176a((Object) this.version, (Object) downloadApp.version) && getVersionCode() == downloadApp.getVersionCode() && C10202j.m34176a((Object) getStatus(), (Object) downloadApp.getStatus()) && this.appId == downloadApp.appId;
    }

    public final long getAppId() {
        return this.appId;
    }

    public final String getIcon() {
        return this.icon;
    }

    public String getIdentifier() {
        return getMd5();
    }

    public String getMd5() {
        return this.md5;
    }

    public final String getName() {
        return this.name;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public int getProgress() {
        return this.progress;
    }

    public StateApp.Status getStatus() {
        return this.status;
    }

    public App.Type getType() {
        return App.Type.DOWNLOAD;
    }

    public final String getVersion() {
        return this.version;
    }

    public int getVersionCode() {
        return this.versionCode;
    }

    public int hashCode() {
        String str = this.name;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String md52 = getMd5();
        int hashCode2 = (hashCode + (md52 != null ? md52.hashCode() : 0)) * 31;
        String str2 = this.icon;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String packageName2 = getPackageName();
        int hashCode4 = (((hashCode3 + (packageName2 != null ? packageName2.hashCode() : 0)) * 31) + getProgress()) * 31;
        String str3 = this.version;
        int hashCode5 = (((hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31) + getVersionCode()) * 31;
        StateApp.Status status2 = getStatus();
        if (status2 != null) {
            i = status2.hashCode();
        }
        return ((hashCode5 + i) * 31) + C4755f.m7799a(this.appId);
    }

    public void setStatus(StateApp.Status status2) {
        this.status = status2;
    }

    public String toString() {
        return "DownloadApp(name=" + this.name + ", md5=" + getMd5() + ", icon=" + this.icon + ", packageName=" + getPackageName() + ", progress=" + getProgress() + ", version=" + this.version + ", versionCode=" + getVersionCode() + ", status=" + getStatus() + ", appId=" + this.appId + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DownloadApp(String str, String str2, String str3, String str4, int i, String str5, int i2, StateApp.Status status2, long j, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, i, str5, i2, (i3 & 128) != 0 ? null : status2, j);
    }
}
