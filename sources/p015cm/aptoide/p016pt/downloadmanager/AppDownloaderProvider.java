package p015cm.aptoide.p016pt.downloadmanager;

import java.util.HashMap;

/* renamed from: cm.aptoide.pt.downloadmanager.AppDownloaderProvider */
public class AppDownloaderProvider {
    private final DownloadAnalytics downloadAnalytics;
    private final RetryFileDownloaderProvider fileDownloaderProvider;

    public AppDownloaderProvider(RetryFileDownloaderProvider retryFileDownloaderProvider, DownloadAnalytics downloadAnalytics2) {
        this.fileDownloaderProvider = retryFileDownloaderProvider;
        this.downloadAnalytics = downloadAnalytics2;
    }

    public AppDownloader getAppDownloader(DownloadApp downloadApp) {
        return new AppDownloadManager(this.fileDownloaderProvider, downloadApp, new HashMap(), this.downloadAnalytics);
    }
}
