package p015cm.aptoide.p016pt.downloadmanager;

import java.util.List;

/* renamed from: cm.aptoide.pt.downloadmanager.DownloadApp */
public class DownloadApp {
    private String attributionId;
    private List<DownloadAppFile> downloadFiles;
    private String md5;
    private final String packageName;
    private long size;
    private final int versionCode;

    public DownloadApp(String str, int i, List<DownloadAppFile> list, String str2, long j, String str3) {
        this.packageName = str;
        this.versionCode = i;
        this.downloadFiles = list;
        this.md5 = str2;
        this.size = j;
        this.attributionId = str3;
    }

    public String getAttributionId() {
        return this.attributionId;
    }

    public List<DownloadAppFile> getDownloadFiles() {
        return this.downloadFiles;
    }

    public String getMd5() {
        return this.md5;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public long getSize() {
        return this.size;
    }

    public int getVersionCode() {
        return this.versionCode;
    }
}
