package p015cm.aptoide.p016pt.download;

import p015cm.aptoide.p016pt.downloadmanager.Constants;
import p015cm.aptoide.p016pt.downloadmanager.FileDownloadCallback;
import p015cm.aptoide.p016pt.downloadmanager.FileDownloader;
import p112n.p312h.p313a.C10722a;
import p112n.p312h.p313a.C10776i;
import p112n.p312h.p313a.C10794q;
import p123rx.C5328b;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.download.FileDownloadManager */
public class FileDownloadManager implements FileDownloader {
    private static final int APTOIDE_DOWNLOAD_TASK_TAG_KEY = 888;
    public static final int PROGRESS_MAX_VALUE = 100;
    public static final int RETRY_TIMES = 3;
    private int downloadId;
    private String downloadsPath;
    private FileDownloadTask fileDownloadTask;
    private C10794q fileDownloader;
    private final String fileName;
    private final int fileType;
    private final String mainDownloadPath;
    private final String packageName;
    private final int versionCode;

    public FileDownloadManager(C10794q qVar, FileDownloadTask fileDownloadTask2, String str, String str2, int i, String str3, int i2, String str4) {
        this.fileDownloader = qVar;
        this.fileDownloadTask = fileDownloadTask2;
        this.downloadsPath = str;
        this.mainDownloadPath = str2;
        this.fileType = i;
        this.packageName = str3;
        this.versionCode = i2;
        this.fileName = str4;
    }

    private void createBaseDownloadTask(String str, int i, String str2, int i2, String str3) {
        C10722a a = this.fileDownloader.mo36570a(str);
        a.mo36396c(3);
        a.mo36389a(Constants.VERSION_CODE, String.valueOf(i));
        a.mo36389a(Constants.PACKAGE, str2);
        a.mo36389a(Constants.FILE_TYPE, String.valueOf(i2));
        a.mo36388a((int) APTOIDE_DOWNLOAD_TASK_TAG_KEY, (Object) this.fileDownloadTask);
        a.mo36393b((C10776i) this.fileDownloadTask);
        a.mo36397d(100);
        a.mo36392b(this.downloadsPath + str3);
        this.downloadId = a.mo36401g().mo36432a();
    }

    /* renamed from: a */
    public /* synthetic */ void mo10610a() {
        this.fileDownloader.mo36573a((C10776i) this.fileDownloadTask);
    }

    /* renamed from: b */
    public /* synthetic */ void mo10611b() {
        this.fileDownloader.mo36574a(this.downloadId, this.mainDownloadPath);
    }

    /* renamed from: c */
    public /* synthetic */ void mo10612c() {
        String str = this.mainDownloadPath;
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("The url for the download can not be empty");
        }
        createBaseDownloadTask(this.mainDownloadPath, this.versionCode, this.packageName, this.fileType, this.fileName);
        this.fileDownloader.mo36575a((C10776i) this.fileDownloadTask, true);
    }

    public C5368e<FileDownloadCallback> observeFileDownloadProgress() {
        return this.fileDownloadTask.onDownloadStateChanged();
    }

    public C5328b pauseDownload() {
        return C5328b.m10169d(new C2280g(this));
    }

    public C5328b removeDownloadFile() {
        return C5328b.m10169d(new C2279f(this));
    }

    public C5328b startFileDownload() {
        return C5328b.m10169d(new C2281h(this));
    }

    public void stopFailedDownload() {
        int a = this.fileDownloader.mo36569a(this.downloadId, (C10776i) null);
        if (a != 0) {
            this.fileDownloader.mo36568a(a);
        }
    }
}
