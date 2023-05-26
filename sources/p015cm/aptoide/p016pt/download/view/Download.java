package p015cm.aptoide.p016pt.download.view;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.AdRequest;
import java.util.List;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import okhttp3.internal.http2.Http2;
import p015cm.aptoide.p016pt.DeepLinkIntentReceiver;
import p015cm.aptoide.p016pt.aab.Split;
import p015cm.aptoide.p016pt.database.room.RoomInstalled;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Malware;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Obb;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b5\b\b\u0018\u00002\u00020\u0001B­\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u0005\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\u0002\u0010\u001eJ\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u0010=\u001a\u00020\u0005HÆ\u0003J\t\u0010>\u001a\u00020\u0013HÆ\u0003J\t\u0010?\u001a\u00020\u0013HÆ\u0003J\t\u0010@\u001a\u00020\u0016HÆ\u0003J\u000f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018HÆ\u0003J\u000f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00050\u0018HÆ\u0003J\t\u0010C\u001a\u00020\u0005HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\t\u0010E\u001a\u00020\u0005HÆ\u0003J\t\u0010F\u001a\u00020\u0005HÆ\u0003J\t\u0010G\u001a\u00020\u0005HÆ\u0003J\t\u0010H\u001a\u00020\u0005HÆ\u0003J\t\u0010I\u001a\u00020\nHÆ\u0003J\t\u0010J\u001a\u00020\u0005HÆ\u0003J\t\u0010K\u001a\u00020\u0005HÆ\u0003J\t\u0010L\u001a\u00020\u0005HÆ\u0003J×\u0001\u0010M\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00162\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u00052\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÆ\u0001J\u0013\u0010N\u001a\u00020\u00132\b\u0010O\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010P\u001a\u00020\nHÖ\u0001J\t\u0010Q\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u0014\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\"R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\"R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\u001b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\"R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\"R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\"R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\"R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0018¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u0010 R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018¢\u0006\b\n\u0000\u001a\u0004\b5\u00103R\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b6\u0010\"R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\"¨\u0006R"}, mo16641d2 = {"Lcm/aptoide/pt/download/view/Download;", "", "appId", "", "appName", "", "packageName", "md5", "versionName", "versionCode", "", "icon", "path", "pathAlt", "size", "obb", "Lcm/aptoide/pt/dataprovider/model/v7/Obb;", "storeName", "hasAdvertising", "", "hasBilling", "malware", "Lcm/aptoide/pt/dataprovider/model/v7/Malware;", "splits", "", "Lcm/aptoide/pt/aab/Split;", "requiredSplits", "oemId", "downloadModel", "Lcm/aptoide/pt/download/view/DownloadStatusModel;", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLcm/aptoide/pt/dataprovider/model/v7/Obb;Ljava/lang/String;ZZLcm/aptoide/pt/dataprovider/model/v7/Malware;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcm/aptoide/pt/download/view/DownloadStatusModel;)V", "getAppId", "()J", "getAppName", "()Ljava/lang/String;", "getDownloadModel", "()Lcm/aptoide/pt/download/view/DownloadStatusModel;", "getHasAdvertising", "()Z", "getHasBilling", "getIcon", "getMalware", "()Lcm/aptoide/pt/dataprovider/model/v7/Malware;", "getMd5", "getObb", "()Lcm/aptoide/pt/dataprovider/model/v7/Obb;", "getOemId", "getPackageName", "getPath", "getPathAlt", "getRequiredSplits", "()Ljava/util/List;", "getSize", "getSplits", "getStoreName", "getVersionCode", "()I", "getVersionName", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.download.view.Download */
/* compiled from: Download.kt */
public final class Download {
    private final long appId;
    private final String appName;
    private final DownloadStatusModel downloadModel;
    private final boolean hasAdvertising;
    private final boolean hasBilling;
    private final String icon;
    private final Malware malware;
    private final String md5;
    private final Obb obb;
    private final String oemId;
    private final String packageName;
    private final String path;
    private final String pathAlt;
    private final List<String> requiredSplits;
    private final long size;
    private final List<Split> splits;
    private final String storeName;
    private final int versionCode;
    private final String versionName;

    public Download(long j, String str, String str2, String str3, String str4, int i, String str5, String str6, String str7, long j2, Obb obb2, String str8, boolean z, boolean z2, Malware malware2, List<Split> list, List<String> list2, String str9, DownloadStatusModel downloadStatusModel) {
        String str10 = str;
        String str11 = str2;
        String str12 = str3;
        String str13 = str4;
        String str14 = str5;
        String str15 = str6;
        String str16 = str7;
        String str17 = str8;
        Malware malware3 = malware2;
        List<Split> list3 = list;
        List<String> list4 = list2;
        String str18 = str9;
        C10202j.m34178b(str10, "appName");
        C10202j.m34178b(str11, "packageName");
        C10202j.m34178b(str12, "md5");
        C10202j.m34178b(str13, RoomInstalled.VERSION_NAME);
        C10202j.m34178b(str14, RoomInstalled.ICON);
        C10202j.m34178b(str15, "path");
        C10202j.m34178b(str16, "pathAlt");
        C10202j.m34178b(str17, "storeName");
        C10202j.m34178b(malware3, "malware");
        C10202j.m34178b(list3, "splits");
        C10202j.m34178b(list4, "requiredSplits");
        C10202j.m34178b(str18, DeepLinkIntentReceiver.DeepLinksKeys.OEM_ID_KEY);
        this.appId = j;
        this.appName = str10;
        this.packageName = str11;
        this.md5 = str12;
        this.versionName = str13;
        this.versionCode = i;
        this.icon = str14;
        this.path = str15;
        this.pathAlt = str16;
        this.size = j2;
        this.obb = obb2;
        this.storeName = str17;
        this.hasAdvertising = z;
        this.hasBilling = z2;
        this.malware = malware3;
        this.splits = list3;
        this.requiredSplits = list4;
        this.oemId = str18;
        this.downloadModel = downloadStatusModel;
    }

    public static /* synthetic */ Download copy$default(Download download, long j, String str, String str2, String str3, String str4, int i, String str5, String str6, String str7, long j2, Obb obb2, String str8, boolean z, boolean z2, Malware malware2, List list, List list2, String str9, DownloadStatusModel downloadStatusModel, int i2, Object obj) {
        Download download2 = download;
        int i3 = i2;
        return download.copy((i3 & 1) != 0 ? download2.appId : j, (i3 & 2) != 0 ? download2.appName : str, (i3 & 4) != 0 ? download2.packageName : str2, (i3 & 8) != 0 ? download2.md5 : str3, (i3 & 16) != 0 ? download2.versionName : str4, (i3 & 32) != 0 ? download2.versionCode : i, (i3 & 64) != 0 ? download2.icon : str5, (i3 & 128) != 0 ? download2.path : str6, (i3 & 256) != 0 ? download2.pathAlt : str7, (i3 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? download2.size : j2, (i3 & 1024) != 0 ? download2.obb : obb2, (i3 & RecyclerView.C0638l.FLAG_MOVED) != 0 ? download2.storeName : str8, (i3 & RecyclerView.C0638l.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? download2.hasAdvertising : z, (i3 & 8192) != 0 ? download2.hasBilling : z2, (i3 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? download2.malware : malware2, (i3 & 32768) != 0 ? download2.splits : list, (i3 & 65536) != 0 ? download2.requiredSplits : list2, (i3 & 131072) != 0 ? download2.oemId : str9, (i3 & 262144) != 0 ? download2.downloadModel : downloadStatusModel);
    }

    public final long component1() {
        return this.appId;
    }

    public final long component10() {
        return this.size;
    }

    public final Obb component11() {
        return this.obb;
    }

    public final String component12() {
        return this.storeName;
    }

    public final boolean component13() {
        return this.hasAdvertising;
    }

    public final boolean component14() {
        return this.hasBilling;
    }

    public final Malware component15() {
        return this.malware;
    }

    public final List<Split> component16() {
        return this.splits;
    }

    public final List<String> component17() {
        return this.requiredSplits;
    }

    public final String component18() {
        return this.oemId;
    }

    public final DownloadStatusModel component19() {
        return this.downloadModel;
    }

    public final String component2() {
        return this.appName;
    }

    public final String component3() {
        return this.packageName;
    }

    public final String component4() {
        return this.md5;
    }

    public final String component5() {
        return this.versionName;
    }

    public final int component6() {
        return this.versionCode;
    }

    public final String component7() {
        return this.icon;
    }

    public final String component8() {
        return this.path;
    }

    public final String component9() {
        return this.pathAlt;
    }

    public final Download copy(long j, String str, String str2, String str3, String str4, int i, String str5, String str6, String str7, long j2, Obb obb2, String str8, boolean z, boolean z2, Malware malware2, List<Split> list, List<String> list2, String str9, DownloadStatusModel downloadStatusModel) {
        long j3 = j;
        C10202j.m34178b(str, "appName");
        C10202j.m34178b(str2, "packageName");
        C10202j.m34178b(str3, "md5");
        C10202j.m34178b(str4, RoomInstalled.VERSION_NAME);
        C10202j.m34178b(str5, RoomInstalled.ICON);
        C10202j.m34178b(str6, "path");
        C10202j.m34178b(str7, "pathAlt");
        C10202j.m34178b(str8, "storeName");
        C10202j.m34178b(malware2, "malware");
        C10202j.m34178b(list, "splits");
        C10202j.m34178b(list2, "requiredSplits");
        C10202j.m34178b(str9, DeepLinkIntentReceiver.DeepLinksKeys.OEM_ID_KEY);
        return new Download(j, str, str2, str3, str4, i, str5, str6, str7, j2, obb2, str8, z, z2, malware2, list, list2, str9, downloadStatusModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Download)) {
            return false;
        }
        Download download = (Download) obj;
        return this.appId == download.appId && C10202j.m34176a((Object) this.appName, (Object) download.appName) && C10202j.m34176a((Object) this.packageName, (Object) download.packageName) && C10202j.m34176a((Object) this.md5, (Object) download.md5) && C10202j.m34176a((Object) this.versionName, (Object) download.versionName) && this.versionCode == download.versionCode && C10202j.m34176a((Object) this.icon, (Object) download.icon) && C10202j.m34176a((Object) this.path, (Object) download.path) && C10202j.m34176a((Object) this.pathAlt, (Object) download.pathAlt) && this.size == download.size && C10202j.m34176a((Object) this.obb, (Object) download.obb) && C10202j.m34176a((Object) this.storeName, (Object) download.storeName) && this.hasAdvertising == download.hasAdvertising && this.hasBilling == download.hasBilling && C10202j.m34176a((Object) this.malware, (Object) download.malware) && C10202j.m34176a((Object) this.splits, (Object) download.splits) && C10202j.m34176a((Object) this.requiredSplits, (Object) download.requiredSplits) && C10202j.m34176a((Object) this.oemId, (Object) download.oemId) && C10202j.m34176a((Object) this.downloadModel, (Object) download.downloadModel);
    }

    public final long getAppId() {
        return this.appId;
    }

    public final String getAppName() {
        return this.appName;
    }

    public final DownloadStatusModel getDownloadModel() {
        return this.downloadModel;
    }

    public final boolean getHasAdvertising() {
        return this.hasAdvertising;
    }

    public final boolean getHasBilling() {
        return this.hasBilling;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final Malware getMalware() {
        return this.malware;
    }

    public final String getMd5() {
        return this.md5;
    }

    public final Obb getObb() {
        return this.obb;
    }

    public final String getOemId() {
        return this.oemId;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getPathAlt() {
        return this.pathAlt;
    }

    public final List<String> getRequiredSplits() {
        return this.requiredSplits;
    }

    public final long getSize() {
        return this.size;
    }

    public final List<Split> getSplits() {
        return this.splits;
    }

    public final String getStoreName() {
        return this.storeName;
    }

    public final int getVersionCode() {
        return this.versionCode;
    }

    public final String getVersionName() {
        return this.versionName;
    }

    public int hashCode() {
        int a = C4755f.m7799a(this.appId) * 31;
        String str = this.appName;
        int i = 0;
        int hashCode = (a + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.packageName;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.md5;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.versionName;
        int hashCode4 = (((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.versionCode) * 31;
        String str5 = this.icon;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.path;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.pathAlt;
        int hashCode7 = (((hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31) + C4755f.m7799a(this.size)) * 31;
        Obb obb2 = this.obb;
        int hashCode8 = (hashCode7 + (obb2 != null ? obb2.hashCode() : 0)) * 31;
        String str8 = this.storeName;
        int hashCode9 = (hashCode8 + (str8 != null ? str8.hashCode() : 0)) * 31;
        boolean z = this.hasAdvertising;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode9 + (z ? 1 : 0)) * 31;
        boolean z3 = this.hasBilling;
        if (!z3) {
            z2 = z3;
        }
        int i3 = (i2 + (z2 ? 1 : 0)) * 31;
        Malware malware2 = this.malware;
        int hashCode10 = (i3 + (malware2 != null ? malware2.hashCode() : 0)) * 31;
        List<Split> list = this.splits;
        int hashCode11 = (hashCode10 + (list != null ? list.hashCode() : 0)) * 31;
        List<String> list2 = this.requiredSplits;
        int hashCode12 = (hashCode11 + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str9 = this.oemId;
        int hashCode13 = (hashCode12 + (str9 != null ? str9.hashCode() : 0)) * 31;
        DownloadStatusModel downloadStatusModel = this.downloadModel;
        if (downloadStatusModel != null) {
            i = downloadStatusModel.hashCode();
        }
        return hashCode13 + i;
    }

    public String toString() {
        return "Download(appId=" + this.appId + ", appName=" + this.appName + ", packageName=" + this.packageName + ", md5=" + this.md5 + ", versionName=" + this.versionName + ", versionCode=" + this.versionCode + ", icon=" + this.icon + ", path=" + this.path + ", pathAlt=" + this.pathAlt + ", size=" + this.size + ", obb=" + this.obb + ", storeName=" + this.storeName + ", hasAdvertising=" + this.hasAdvertising + ", hasBilling=" + this.hasBilling + ", malware=" + this.malware + ", splits=" + this.splits + ", requiredSplits=" + this.requiredSplits + ", oemId=" + this.oemId + ", downloadModel=" + this.downloadModel + ")";
    }
}
