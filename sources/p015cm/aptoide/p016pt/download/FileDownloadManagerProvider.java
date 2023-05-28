package p015cm.aptoide.p016pt.download;

import p015cm.aptoide.p016pt.downloadmanager.FileDownloadCallback;
import p015cm.aptoide.p016pt.downloadmanager.FileDownloader;
import p015cm.aptoide.p016pt.downloadmanager.FileDownloaderProvider;
import p112n.p312h.p313a.C10794q;
import p123rx.p127s.C12871b;

/* renamed from: cm.aptoide.pt.download.FileDownloadManagerProvider */
public class FileDownloadManagerProvider implements FileDownloaderProvider {
    private final String downloadsPath;
    private final C10794q fileDownloader;
    private final Md5Comparator md5Comparator;

    public FileDownloadManagerProvider(String str, C10794q qVar, Md5Comparator md5Comparator2) {
        this.downloadsPath = str;
        this.fileDownloader = qVar;
        this.md5Comparator = md5Comparator2;
    }

    public FileDownloader createFileDownloader(String str, String str2, int i, String str3, int i2, String str4, C12871b<FileDownloadCallback> bVar, String str5) {
        return new FileDownloadManager(this.fileDownloader, new FileDownloadTask(bVar, str, this.md5Comparator, str4, str5, !str3.equals("com.igg.android.lordsmobile")), this.downloadsPath, str2, i, str3, i2, str4);
    }
}
