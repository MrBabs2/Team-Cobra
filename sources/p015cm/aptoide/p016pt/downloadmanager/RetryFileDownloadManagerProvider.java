package p015cm.aptoide.p016pt.downloadmanager;

import p123rx.p127s.C12871b;

/* renamed from: cm.aptoide.pt.downloadmanager.RetryFileDownloadManagerProvider */
public class RetryFileDownloadManagerProvider implements RetryFileDownloaderProvider {
    private FileDownloaderProvider fileDownloaderProvider;

    public RetryFileDownloadManagerProvider(FileDownloaderProvider fileDownloaderProvider2) {
        this.fileDownloaderProvider = fileDownloaderProvider2;
    }

    public RetryFileDownloader createRetryFileDownloader(String str, String str2, int i, String str3, int i2, String str4, C12871b<FileDownloadCallback> bVar, String str5, String str6) {
        return new RetryFileDownloadManager(str2, i, str3, i2, str4, str, this.fileDownloaderProvider, str5, str6);
    }
}
