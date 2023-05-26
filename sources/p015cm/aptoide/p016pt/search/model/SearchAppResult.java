package p015cm.aptoide.p016pt.search.model;

import java.util.List;
import p015cm.aptoide.p016pt.aab.Split;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Malware;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Obb;
import p015cm.aptoide.p016pt.download.view.Download;
import p015cm.aptoide.p016pt.download.view.DownloadStatusModel;
import p015cm.aptoide.p016pt.search.model.SearchItem;
import p015cm.aptoide.p016pt.view.app.AppScreenshot;

/* renamed from: cm.aptoide.pt.search.model.SearchAppResult */
public class SearchAppResult implements SearchItem {
    private float averageRating;
    private Download download;
    private boolean hasOtherVersions;
    private boolean isHighlightedResult;
    private long modifiedDate;
    private int rank;
    private List<AppScreenshot> screenshots;
    private Long storeId;
    private String storeTheme;
    private long totalDownloads;

    public SearchAppResult() {
    }

    public long getAppId() {
        return this.download.getAppId();
    }

    public String getAppName() {
        return this.download.getAppName();
    }

    public float getAverageRating() {
        return this.averageRating;
    }

    public Download getDownload() {
        return this.download;
    }

    public DownloadStatusModel getDownloadModel() {
        return this.download.getDownloadModel();
    }

    public String getIcon() {
        return this.download.getIcon();
    }

    public long getId() {
        return ((long) SearchItem.Type.APP.ordinal()) + this.download.getAppId();
    }

    public Malware getMalware() {
        return this.download.getMalware();
    }

    public String getMd5() {
        return this.download.getMd5();
    }

    public long getModifiedDate() {
        return this.modifiedDate;
    }

    public Obb getObb() {
        return this.download.getObb();
    }

    public String getOemId() {
        return this.download.getOemId();
    }

    public String getPackageName() {
        return this.download.getPackageName();
    }

    public String getPath() {
        return this.download.getPath();
    }

    public String getPathAlt() {
        return this.download.getPathAlt();
    }

    public int getRank() {
        return this.rank;
    }

    public List<String> getRequiredSplits() {
        return this.download.getRequiredSplits();
    }

    public List<AppScreenshot> getScreenshots() {
        return this.screenshots;
    }

    public long getSize() {
        return this.download.getSize();
    }

    public List<Split> getSplits() {
        return this.download.getSplits();
    }

    public Long getStoreId() {
        return this.storeId;
    }

    public String getStoreName() {
        return this.download.getStoreName();
    }

    public String getStoreTheme() {
        return this.storeTheme;
    }

    public long getTotalDownloads() {
        return this.totalDownloads;
    }

    public SearchItem.Type getType() {
        return SearchItem.Type.APP;
    }

    public int getVersionCode() {
        return this.download.getVersionCode();
    }

    public String getVersionName() {
        return this.download.getVersionName();
    }

    public boolean hasAdvertising() {
        return this.download.getHasAdvertising();
    }

    public boolean hasBilling() {
        return this.download.getHasBilling();
    }

    public boolean hasOtherVersions() {
        return this.hasOtherVersions;
    }

    public boolean isAppcApp() {
        return hasBilling() || hasAdvertising();
    }

    public boolean isHighlightedResult() {
        return this.isHighlightedResult;
    }

    public SearchAppResult(int i, String str, String str2, Long l, String str3, long j, float f, long j2, String str4, String str5, String str6, long j3, int i2, String str7, String str8, String str9, Malware malware, long j4, boolean z, boolean z2, boolean z3, String str10, boolean z4, Obb obb, List<String> list, List<Split> list2, DownloadStatusModel downloadStatusModel, List<AppScreenshot> list3) {
        String str11 = str7;
        boolean z5 = z3;
        Obb obb2 = obb;
        List<Split> list4 = list2;
        this.rank = i;
        this.storeTheme = str3;
        this.modifiedDate = j;
        this.averageRating = f;
        this.totalDownloads = j2;
        this.hasOtherVersions = z;
        this.storeId = l;
        this.isHighlightedResult = z4;
        this.screenshots = list3;
        Download download2 = r1;
        long j5 = j3;
        Download download3 = new Download(j5, str4, str5, str6, str11, i2, str, str8, str9, j4, obb2, str2, z5, z2, malware, list4, list, str10, downloadStatusModel);
        this.download = download2;
    }

    public SearchAppResult(SearchAppResult searchAppResult, DownloadStatusModel downloadStatusModel, List<AppScreenshot> list) {
        this(searchAppResult.getRank(), searchAppResult.getIcon(), searchAppResult.getStoreName(), searchAppResult.getStoreId(), searchAppResult.getStoreTheme(), searchAppResult.getModifiedDate(), searchAppResult.getAverageRating(), searchAppResult.getTotalDownloads(), searchAppResult.getAppName(), searchAppResult.getPackageName(), searchAppResult.getMd5(), searchAppResult.getAppId(), searchAppResult.getVersionCode(), searchAppResult.getVersionName(), searchAppResult.getPath(), searchAppResult.getPathAlt(), searchAppResult.getMalware(), searchAppResult.getSize(), searchAppResult.hasOtherVersions(), searchAppResult.hasBilling(), searchAppResult.hasAdvertising(), searchAppResult.getOemId(), searchAppResult.isHighlightedResult(), searchAppResult.getObb(), searchAppResult.getRequiredSplits(), searchAppResult.getSplits(), downloadStatusModel, list);
    }
}
