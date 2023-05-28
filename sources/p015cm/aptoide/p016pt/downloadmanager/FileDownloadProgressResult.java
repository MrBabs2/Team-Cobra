package p015cm.aptoide.p016pt.downloadmanager;

/* renamed from: cm.aptoide.pt.downloadmanager.FileDownloadProgressResult */
public class FileDownloadProgressResult {
    private long downloadedBytes;
    private long totalFileBytes;

    public FileDownloadProgressResult(long j, long j2) {
        this.downloadedBytes = j;
        this.totalFileBytes = j2;
    }

    public long getDownloadedBytes() {
        return this.downloadedBytes;
    }

    public long getTotalFileBytes() {
        return this.totalFileBytes;
    }
}
