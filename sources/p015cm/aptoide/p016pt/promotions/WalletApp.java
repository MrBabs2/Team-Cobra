package p015cm.aptoide.p016pt.promotions;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.ads.AdRequest;
import java.util.List;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import okhttp3.internal.http2.Http2;
import p015cm.aptoide.p016pt.aab.Split;
import p015cm.aptoide.p016pt.app.DownloadModel;
import p015cm.aptoide.p016pt.database.room.RoomInstalled;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Obb;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b<\b\b\u0018\u00002\u00020\u0001BÛ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\n\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0019\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0007¢\u0006\u0002\u0010\u001eJ\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\t\u0010A\u001a\u00020\nHÆ\u0003J\t\u0010B\u001a\u00020\u0007HÆ\u0003J\t\u0010C\u001a\u00020\u0017HÆ\u0003J\u000f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019HÆ\u0003J\u000f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00070\u0019HÆ\u0003J\t\u0010F\u001a\u00020\u0007HÆ\u0003J\t\u0010G\u001a\u00020\u0007HÆ\u0003J\t\u0010H\u001a\u00020\u0005HÆ\u0003J\t\u0010I\u001a\u00020\u0007HÆ\u0003J\t\u0010J\u001a\u00020\u0007HÆ\u0003J\t\u0010K\u001a\u00020\nHÆ\u0003J\t\u0010L\u001a\u00020\u0007HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010N\u001a\u00020\u000eHÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0007HÆ\u0003Jß\u0001\u0010P\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u00172\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001d\u001a\u00020\u0007HÆ\u0001J\u0013\u0010Q\u001a\u00020\u00052\b\u0010R\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\u0006\u0010S\u001a\u00020\u0005J\t\u0010T\u001a\u00020\u000eHÖ\u0001J\t\u0010U\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0015\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b&\u0010 R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010)\"\u0004\b*\u0010+R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b,\u0010 R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b/\u0010 R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b0\u0010 R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b1\u0010 R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0019¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0011\u0010\u0014\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b6\u0010(R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\b\n\u0000\u001a\u0004\b7\u00105R\u0011\u0010\u001c\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b8\u0010 R\u0011\u0010\u001d\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b9\u0010 R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b<\u0010 ¨\u0006V"}, mo16641d2 = {"Lcm/aptoide/pt/promotions/WalletApp;", "", "downloadModel", "Lcm/aptoide/pt/app/DownloadModel;", "isInstalled", "", "appName", "", "icon", "id", "", "packageName", "md5sum", "versionCode", "", "versionName", "path", "pathAlt", "obb", "Lcm/aptoide/pt/dataprovider/model/v7/Obb;", "size", "developer", "rating", "", "splits", "", "Lcm/aptoide/pt/aab/Split;", "requiredSplits", "storeName", "trustedBadge", "(Lcm/aptoide/pt/app/DownloadModel;ZLjava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcm/aptoide/pt/dataprovider/model/v7/Obb;JLjava/lang/String;FLjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getAppName", "()Ljava/lang/String;", "getDeveloper", "getDownloadModel", "()Lcm/aptoide/pt/app/DownloadModel;", "setDownloadModel", "(Lcm/aptoide/pt/app/DownloadModel;)V", "getIcon", "getId", "()J", "()Z", "setInstalled", "(Z)V", "getMd5sum", "getObb", "()Lcm/aptoide/pt/dataprovider/model/v7/Obb;", "getPackageName", "getPath", "getPathAlt", "getRating", "()F", "getRequiredSplits", "()Ljava/util/List;", "getSize", "getSplits", "getStoreName", "getTrustedBadge", "getVersionCode", "()I", "getVersionName", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "exists", "hashCode", "toString", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.promotions.WalletApp */
/* compiled from: WalletApp.kt */
public final class WalletApp {
    private final String appName;
    private final String developer;
    private DownloadModel downloadModel;
    private final String icon;

    /* renamed from: id */
    private final long f6777id;
    private boolean isInstalled;
    private final String md5sum;
    private final Obb obb;
    private final String packageName;
    private final String path;
    private final String pathAlt;
    private final float rating;
    private final List<String> requiredSplits;
    private final long size;
    private final List<Split> splits;
    private final String storeName;
    private final String trustedBadge;
    private final int versionCode;
    private final String versionName;

    public WalletApp() {
        this((DownloadModel) null, false, (String) null, (String) null, 0, (String) null, (String) null, 0, (String) null, (String) null, (String) null, (Obb) null, 0, (String) null, 0.0f, (List) null, (List) null, (String) null, (String) null, 524287, (DefaultConstructorMarker) null);
    }

    public WalletApp(DownloadModel downloadModel2, boolean z, String str, String str2, long j, String str3, String str4, int i, String str5, String str6, String str7, Obb obb2, long j2, String str8, float f, List<Split> list, List<String> list2, String str9, String str10) {
        String str11 = str3;
        String str12 = str8;
        List<Split> list3 = list;
        List<String> list4 = list2;
        String str13 = str9;
        String str14 = str10;
        C10202j.m34178b(str, "appName");
        C10202j.m34178b(str2, RoomInstalled.ICON);
        C10202j.m34178b(str11, "packageName");
        C10202j.m34178b(str12, "developer");
        C10202j.m34178b(list3, "splits");
        C10202j.m34178b(list4, "requiredSplits");
        C10202j.m34178b(str13, "storeName");
        C10202j.m34178b(str14, "trustedBadge");
        this.downloadModel = downloadModel2;
        this.isInstalled = z;
        this.appName = str;
        this.icon = str2;
        this.f6777id = j;
        this.packageName = str11;
        this.md5sum = str4;
        this.versionCode = i;
        this.versionName = str5;
        this.path = str6;
        this.pathAlt = str7;
        this.obb = obb2;
        this.size = j2;
        this.developer = str12;
        this.rating = f;
        this.splits = list3;
        this.requiredSplits = list4;
        this.storeName = str13;
        this.trustedBadge = str14;
    }

    public static /* synthetic */ WalletApp copy$default(WalletApp walletApp, DownloadModel downloadModel2, boolean z, String str, String str2, long j, String str3, String str4, int i, String str5, String str6, String str7, Obb obb2, long j2, String str8, float f, List list, List list2, String str9, String str10, int i2, Object obj) {
        WalletApp walletApp2 = walletApp;
        int i3 = i2;
        return walletApp.copy((i3 & 1) != 0 ? walletApp2.downloadModel : downloadModel2, (i3 & 2) != 0 ? walletApp2.isInstalled : z, (i3 & 4) != 0 ? walletApp2.appName : str, (i3 & 8) != 0 ? walletApp2.icon : str2, (i3 & 16) != 0 ? walletApp2.f6777id : j, (i3 & 32) != 0 ? walletApp2.packageName : str3, (i3 & 64) != 0 ? walletApp2.md5sum : str4, (i3 & 128) != 0 ? walletApp2.versionCode : i, (i3 & 256) != 0 ? walletApp2.versionName : str5, (i3 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? walletApp2.path : str6, (i3 & 1024) != 0 ? walletApp2.pathAlt : str7, (i3 & RecyclerView.C0638l.FLAG_MOVED) != 0 ? walletApp2.obb : obb2, (i3 & RecyclerView.C0638l.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? walletApp2.size : j2, (i3 & 8192) != 0 ? walletApp2.developer : str8, (i3 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? walletApp2.rating : f, (i3 & 32768) != 0 ? walletApp2.splits : list, (i3 & 65536) != 0 ? walletApp2.requiredSplits : list2, (i3 & 131072) != 0 ? walletApp2.storeName : str9, (i3 & 262144) != 0 ? walletApp2.trustedBadge : str10);
    }

    public final DownloadModel component1() {
        return this.downloadModel;
    }

    public final String component10() {
        return this.path;
    }

    public final String component11() {
        return this.pathAlt;
    }

    public final Obb component12() {
        return this.obb;
    }

    public final long component13() {
        return this.size;
    }

    public final String component14() {
        return this.developer;
    }

    public final float component15() {
        return this.rating;
    }

    public final List<Split> component16() {
        return this.splits;
    }

    public final List<String> component17() {
        return this.requiredSplits;
    }

    public final String component18() {
        return this.storeName;
    }

    public final String component19() {
        return this.trustedBadge;
    }

    public final boolean component2() {
        return this.isInstalled;
    }

    public final String component3() {
        return this.appName;
    }

    public final String component4() {
        return this.icon;
    }

    public final long component5() {
        return this.f6777id;
    }

    public final String component6() {
        return this.packageName;
    }

    public final String component7() {
        return this.md5sum;
    }

    public final int component8() {
        return this.versionCode;
    }

    public final String component9() {
        return this.versionName;
    }

    public final WalletApp copy(DownloadModel downloadModel2, boolean z, String str, String str2, long j, String str3, String str4, int i, String str5, String str6, String str7, Obb obb2, long j2, String str8, float f, List<Split> list, List<String> list2, String str9, String str10) {
        DownloadModel downloadModel3 = downloadModel2;
        C10202j.m34178b(str, "appName");
        C10202j.m34178b(str2, RoomInstalled.ICON);
        C10202j.m34178b(str3, "packageName");
        C10202j.m34178b(str8, "developer");
        C10202j.m34178b(list, "splits");
        C10202j.m34178b(list2, "requiredSplits");
        C10202j.m34178b(str9, "storeName");
        C10202j.m34178b(str10, "trustedBadge");
        return new WalletApp(downloadModel2, z, str, str2, j, str3, str4, i, str5, str6, str7, obb2, j2, str8, f, list, list2, str9, str10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletApp)) {
            return false;
        }
        WalletApp walletApp = (WalletApp) obj;
        return C10202j.m34176a((Object) this.downloadModel, (Object) walletApp.downloadModel) && this.isInstalled == walletApp.isInstalled && C10202j.m34176a((Object) this.appName, (Object) walletApp.appName) && C10202j.m34176a((Object) this.icon, (Object) walletApp.icon) && this.f6777id == walletApp.f6777id && C10202j.m34176a((Object) this.packageName, (Object) walletApp.packageName) && C10202j.m34176a((Object) this.md5sum, (Object) walletApp.md5sum) && this.versionCode == walletApp.versionCode && C10202j.m34176a((Object) this.versionName, (Object) walletApp.versionName) && C10202j.m34176a((Object) this.path, (Object) walletApp.path) && C10202j.m34176a((Object) this.pathAlt, (Object) walletApp.pathAlt) && C10202j.m34176a((Object) this.obb, (Object) walletApp.obb) && this.size == walletApp.size && C10202j.m34176a((Object) this.developer, (Object) walletApp.developer) && Float.compare(this.rating, walletApp.rating) == 0 && C10202j.m34176a((Object) this.splits, (Object) walletApp.splits) && C10202j.m34176a((Object) this.requiredSplits, (Object) walletApp.requiredSplits) && C10202j.m34176a((Object) this.storeName, (Object) walletApp.storeName) && C10202j.m34176a((Object) this.trustedBadge, (Object) walletApp.trustedBadge);
    }

    public final boolean exists() {
        return this.f6777id != -1;
    }

    public final String getAppName() {
        return this.appName;
    }

    public final String getDeveloper() {
        return this.developer;
    }

    public final DownloadModel getDownloadModel() {
        return this.downloadModel;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final long getId() {
        return this.f6777id;
    }

    public final String getMd5sum() {
        return this.md5sum;
    }

    public final Obb getObb() {
        return this.obb;
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

    public final float getRating() {
        return this.rating;
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

    public final String getTrustedBadge() {
        return this.trustedBadge;
    }

    public final int getVersionCode() {
        return this.versionCode;
    }

    public final String getVersionName() {
        return this.versionName;
    }

    public int hashCode() {
        DownloadModel downloadModel2 = this.downloadModel;
        int i = 0;
        int hashCode = (downloadModel2 != null ? downloadModel2.hashCode() : 0) * 31;
        boolean z = this.isInstalled;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        String str = this.appName;
        int hashCode2 = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.icon;
        int hashCode3 = (((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + C4755f.m7799a(this.f6777id)) * 31;
        String str3 = this.packageName;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.md5sum;
        int hashCode5 = (((hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.versionCode) * 31;
        String str5 = this.versionName;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.path;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.pathAlt;
        int hashCode8 = (hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31;
        Obb obb2 = this.obb;
        int hashCode9 = (((hashCode8 + (obb2 != null ? obb2.hashCode() : 0)) * 31) + C4755f.m7799a(this.size)) * 31;
        String str8 = this.developer;
        int hashCode10 = (((hashCode9 + (str8 != null ? str8.hashCode() : 0)) * 31) + Float.floatToIntBits(this.rating)) * 31;
        List<Split> list = this.splits;
        int hashCode11 = (hashCode10 + (list != null ? list.hashCode() : 0)) * 31;
        List<String> list2 = this.requiredSplits;
        int hashCode12 = (hashCode11 + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str9 = this.storeName;
        int hashCode13 = (hashCode12 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.trustedBadge;
        if (str10 != null) {
            i = str10.hashCode();
        }
        return hashCode13 + i;
    }

    public final boolean isInstalled() {
        return this.isInstalled;
    }

    public final void setDownloadModel(DownloadModel downloadModel2) {
        this.downloadModel = downloadModel2;
    }

    public final void setInstalled(boolean z) {
        this.isInstalled = z;
    }

    public String toString() {
        return "WalletApp(downloadModel=" + this.downloadModel + ", isInstalled=" + this.isInstalled + ", appName=" + this.appName + ", icon=" + this.icon + ", id=" + this.f6777id + ", packageName=" + this.packageName + ", md5sum=" + this.md5sum + ", versionCode=" + this.versionCode + ", versionName=" + this.versionName + ", path=" + this.path + ", pathAlt=" + this.pathAlt + ", obb=" + this.obb + ", size=" + this.size + ", developer=" + this.developer + ", rating=" + this.rating + ", splits=" + this.splits + ", requiredSplits=" + this.requiredSplits + ", storeName=" + this.storeName + ", trustedBadge=" + this.trustedBadge + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ WalletApp(p015cm.aptoide.p016pt.app.DownloadModel r22, boolean r23, java.lang.String r24, java.lang.String r25, long r26, java.lang.String r28, java.lang.String r29, int r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, p015cm.aptoide.p016pt.dataprovider.model.p020v7.Obb r34, long r35, java.lang.String r37, float r38, java.util.List r39, java.util.List r40, java.lang.String r41, java.lang.String r42, int r43, kotlin.jvm.internal.DefaultConstructorMarker r44) {
        /*
            r21 = this;
            r0 = r43
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000b
        L_0x0009:
            r1 = r22
        L_0x000b:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0011
            r3 = 0
            goto L_0x0013
        L_0x0011:
            r3 = r23
        L_0x0013:
            r4 = r0 & 4
            java.lang.String r5 = ""
            if (r4 == 0) goto L_0x001b
            r4 = r5
            goto L_0x001d
        L_0x001b:
            r4 = r24
        L_0x001d:
            r6 = r0 & 8
            if (r6 == 0) goto L_0x0023
            r6 = r5
            goto L_0x0025
        L_0x0023:
            r6 = r25
        L_0x0025:
            r7 = r0 & 16
            if (r7 == 0) goto L_0x002c
            r7 = -1
            goto L_0x002e
        L_0x002c:
            r7 = r26
        L_0x002e:
            r9 = r0 & 32
            if (r9 == 0) goto L_0x0034
            r9 = r5
            goto L_0x0036
        L_0x0034:
            r9 = r28
        L_0x0036:
            r10 = r0 & 64
            if (r10 == 0) goto L_0x003c
            r10 = r2
            goto L_0x003e
        L_0x003c:
            r10 = r29
        L_0x003e:
            r11 = r0 & 128(0x80, float:1.794E-43)
            if (r11 == 0) goto L_0x0044
            r11 = -1
            goto L_0x0046
        L_0x0044:
            r11 = r30
        L_0x0046:
            r12 = r0 & 256(0x100, float:3.59E-43)
            if (r12 == 0) goto L_0x004c
            r12 = r2
            goto L_0x004e
        L_0x004c:
            r12 = r31
        L_0x004e:
            r13 = r0 & 512(0x200, float:7.175E-43)
            if (r13 == 0) goto L_0x0054
            r13 = r2
            goto L_0x0056
        L_0x0054:
            r13 = r32
        L_0x0056:
            r14 = r0 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L_0x005c
            r14 = r2
            goto L_0x005e
        L_0x005c:
            r14 = r33
        L_0x005e:
            r15 = r0 & 2048(0x800, float:2.87E-42)
            if (r15 == 0) goto L_0x0063
            goto L_0x0065
        L_0x0063:
            r2 = r34
        L_0x0065:
            r15 = r0 & 4096(0x1000, float:5.74E-42)
            if (r15 == 0) goto L_0x006c
            r15 = 0
            goto L_0x006e
        L_0x006c:
            r15 = r35
        L_0x006e:
            r22 = r5
            r5 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r5 == 0) goto L_0x0077
            r5 = r22
            goto L_0x0079
        L_0x0077:
            r5 = r37
        L_0x0079:
            r44 = r5
            r5 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r5 == 0) goto L_0x0082
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x0084
        L_0x0082:
            r5 = r38
        L_0x0084:
            r17 = 32768(0x8000, float:4.5918E-41)
            r17 = r0 & r17
            if (r17 == 0) goto L_0x0090
            java.util.List r17 = kotlin.p262y.C10529o.m35736a()
            goto L_0x0092
        L_0x0090:
            r17 = r39
        L_0x0092:
            r18 = 65536(0x10000, float:9.18355E-41)
            r18 = r0 & r18
            if (r18 == 0) goto L_0x009d
            java.util.List r18 = kotlin.p262y.C10529o.m35736a()
            goto L_0x009f
        L_0x009d:
            r18 = r40
        L_0x009f:
            r19 = 131072(0x20000, float:1.83671E-40)
            r19 = r0 & r19
            if (r19 == 0) goto L_0x00a8
            r19 = r22
            goto L_0x00aa
        L_0x00a8:
            r19 = r41
        L_0x00aa:
            r20 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 & r20
            if (r0 == 0) goto L_0x00b3
            r0 = r22
            goto L_0x00b5
        L_0x00b3:
            r0 = r42
        L_0x00b5:
            r22 = r21
            r23 = r1
            r24 = r3
            r25 = r4
            r26 = r6
            r27 = r7
            r29 = r9
            r30 = r10
            r31 = r11
            r32 = r12
            r33 = r13
            r34 = r14
            r35 = r2
            r36 = r15
            r38 = r44
            r39 = r5
            r40 = r17
            r41 = r18
            r42 = r19
            r43 = r0
            r22.<init>(r23, r24, r25, r26, r27, r29, r30, r31, r32, r33, r34, r35, r36, r38, r39, r40, r41, r42, r43)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.promotions.WalletApp.<init>(cm.aptoide.pt.app.DownloadModel, boolean, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, cm.aptoide.pt.dataprovider.model.v7.Obb, long, java.lang.String, float, java.util.List, java.util.List, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
