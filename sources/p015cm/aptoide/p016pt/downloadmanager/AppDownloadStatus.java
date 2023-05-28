package p015cm.aptoide.p016pt.downloadmanager;

import java.util.List;
import p015cm.aptoide.p016pt.logger.Logger;

/* renamed from: cm.aptoide.pt.downloadmanager.AppDownloadStatus */
public class AppDownloadStatus {
    private static final int PROGRESS_MAX_VALUE = 100;
    private AppDownloadState appDownloadState;
    private long downloadSize;
    private List<FileDownloadCallback> fileDownloadCallbackList;
    private String md5;

    /* renamed from: cm.aptoide.pt.downloadmanager.AppDownloadStatus$1 */
    static /* synthetic */ class C22991 {

        /* renamed from: $SwitchMap$cm$aptoide$pt$downloadmanager$AppDownloadStatus$AppDownloadState */
        static final /* synthetic */ int[] f4995x5e1d6a72;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                cm.aptoide.pt.downloadmanager.AppDownloadStatus$AppDownloadState[] r0 = p015cm.aptoide.p016pt.downloadmanager.AppDownloadStatus.AppDownloadState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4995x5e1d6a72 = r0
                cm.aptoide.pt.downloadmanager.AppDownloadStatus$AppDownloadState r1 = p015cm.aptoide.p016pt.downloadmanager.AppDownloadStatus.AppDownloadState.ERROR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f4995x5e1d6a72     // Catch:{ NoSuchFieldError -> 0x001d }
                cm.aptoide.pt.downloadmanager.AppDownloadStatus$AppDownloadState r1 = p015cm.aptoide.p016pt.downloadmanager.AppDownloadStatus.AppDownloadState.ERROR_MD5_DOES_NOT_MATCH     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f4995x5e1d6a72     // Catch:{ NoSuchFieldError -> 0x0028 }
                cm.aptoide.pt.downloadmanager.AppDownloadStatus$AppDownloadState r1 = p015cm.aptoide.p016pt.downloadmanager.AppDownloadStatus.AppDownloadState.ERROR_FILE_NOT_FOUND     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f4995x5e1d6a72     // Catch:{ NoSuchFieldError -> 0x0033 }
                cm.aptoide.pt.downloadmanager.AppDownloadStatus$AppDownloadState r1 = p015cm.aptoide.p016pt.downloadmanager.AppDownloadStatus.AppDownloadState.ERROR_NOT_ENOUGH_SPACE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f4995x5e1d6a72     // Catch:{ NoSuchFieldError -> 0x003e }
                cm.aptoide.pt.downloadmanager.AppDownloadStatus$AppDownloadState r1 = p015cm.aptoide.p016pt.downloadmanager.AppDownloadStatus.AppDownloadState.WARN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f4995x5e1d6a72     // Catch:{ NoSuchFieldError -> 0x0049 }
                cm.aptoide.pt.downloadmanager.AppDownloadStatus$AppDownloadState r1 = p015cm.aptoide.p016pt.downloadmanager.AppDownloadStatus.AppDownloadState.PAUSED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f4995x5e1d6a72     // Catch:{ NoSuchFieldError -> 0x0054 }
                cm.aptoide.pt.downloadmanager.AppDownloadStatus$AppDownloadState r1 = p015cm.aptoide.p016pt.downloadmanager.AppDownloadStatus.AppDownloadState.INVALID_STATUS     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f4995x5e1d6a72     // Catch:{ NoSuchFieldError -> 0x0060 }
                cm.aptoide.pt.downloadmanager.AppDownloadStatus$AppDownloadState r1 = p015cm.aptoide.p016pt.downloadmanager.AppDownloadStatus.AppDownloadState.VERIFYING_FILE_INTEGRITY     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f4995x5e1d6a72     // Catch:{ NoSuchFieldError -> 0x006c }
                cm.aptoide.pt.downloadmanager.AppDownloadStatus$AppDownloadState r1 = p015cm.aptoide.p016pt.downloadmanager.AppDownloadStatus.AppDownloadState.COMPLETED     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f4995x5e1d6a72     // Catch:{ NoSuchFieldError -> 0x0078 }
                cm.aptoide.pt.downloadmanager.AppDownloadStatus$AppDownloadState r1 = p015cm.aptoide.p016pt.downloadmanager.AppDownloadStatus.AppDownloadState.PENDING     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.downloadmanager.AppDownloadStatus.C22991.<clinit>():void");
        }
    }

    /* renamed from: cm.aptoide.pt.downloadmanager.AppDownloadStatus$AppDownloadState */
    public enum AppDownloadState {
        INVALID_STATUS,
        COMPLETED,
        PENDING,
        PAUSED,
        WARN,
        ERROR,
        ERROR_FILE_NOT_FOUND,
        ERROR_NOT_ENOUGH_SPACE,
        ERROR_MD5_DOES_NOT_MATCH,
        PROGRESS,
        WAITING_TO_MOVE_FILES,
        VERIFYING_FILE_INTEGRITY
    }

    public AppDownloadStatus(String str, List<FileDownloadCallback> list, AppDownloadState appDownloadState2, long j) {
        this.md5 = str;
        this.fileDownloadCallbackList = list;
        this.appDownloadState = appDownloadState2;
        this.downloadSize = j;
    }

    private int calculateProgressByFileNumber(int i) {
        return this.fileDownloadCallbackList.size() > 0 ? i / this.fileDownloadCallbackList.size() : i;
    }

    private int calculateProgressByFileSize(long j) {
        double d = (double) j;
        double d2 = (double) this.downloadSize;
        Double.isNaN(d);
        Double.isNaN(d2);
        return (int) ((d / d2) * 100.0d);
    }

    private AppDownloadState getAppDownloadState() {
        AppDownloadState appDownloadState2 = null;
        for (FileDownloadCallback next : this.fileDownloadCallbackList) {
            if (next.getDownloadState() != null) {
                switch (C22991.f4995x5e1d6a72[next.getDownloadState().ordinal()]) {
                    case 1:
                        return AppDownloadState.ERROR;
                    case 2:
                        return AppDownloadState.ERROR_MD5_DOES_NOT_MATCH;
                    case 3:
                        return AppDownloadState.ERROR_FILE_NOT_FOUND;
                    case 4:
                        return AppDownloadState.ERROR_NOT_ENOUGH_SPACE;
                    case 5:
                        return AppDownloadState.WARN;
                    case 6:
                        return AppDownloadState.PAUSED;
                    case 7:
                        return AppDownloadState.INVALID_STATUS;
                    case 8:
                        if (appDownloadState2 != null && appDownloadState2 != AppDownloadState.VERIFYING_FILE_INTEGRITY && appDownloadState2 != AppDownloadState.COMPLETED) {
                            return AppDownloadState.PROGRESS;
                        }
                        if (this.fileDownloadCallbackList.indexOf(next) == this.fileDownloadCallbackList.size() - 1) {
                            return AppDownloadState.VERIFYING_FILE_INTEGRITY;
                        }
                        break;
                    case 9:
                        if (appDownloadState2 != null && appDownloadState2 != AppDownloadState.COMPLETED) {
                            return AppDownloadState.PROGRESS;
                        }
                        if (this.fileDownloadCallbackList.indexOf(next) == this.fileDownloadCallbackList.size() - 1) {
                            Logger instance = Logger.getInstance();
                            instance.mo12975d("AppDownloadState", "emitting APPDOWNLOADSTATE completed " + this.md5);
                            return AppDownloadState.COMPLETED;
                        }
                        break;
                    case 10:
                        if (appDownloadState2 != null && appDownloadState2 != AppDownloadState.PENDING) {
                            return AppDownloadState.PROGRESS;
                        }
                        if (this.fileDownloadCallbackList.indexOf(next) == this.fileDownloadCallbackList.size() - 1) {
                            return AppDownloadState.PENDING;
                        }
                        break;
                }
                appDownloadState2 = next.getDownloadState();
            }
        }
        return AppDownloadState.PROGRESS;
    }

    private FileDownloadCallback getFileDownloadCallback(String str) {
        for (FileDownloadCallback next : this.fileDownloadCallbackList) {
            if (next.getMd5().equals(str)) {
                return next;
            }
        }
        return null;
    }

    private int getFileDownloadProgressAsPercentage(FileDownloadCallback fileDownloadCallback) {
        double downloadedBytes = (double) fileDownloadCallback.getDownloadProgress().getDownloadedBytes();
        double totalFileBytes = (double) fileDownloadCallback.getDownloadProgress().getTotalFileBytes();
        Double.isNaN(downloadedBytes);
        Double.isNaN(totalFileBytes);
        return (int) Math.floor((downloadedBytes / totalFileBytes) * 100.0d);
    }

    private long getOverallProgressAsBytes() {
        long j = 0;
        for (FileDownloadCallback downloadProgress : this.fileDownloadCallbackList) {
            j += downloadProgress.getDownloadProgress().getDownloadedBytes();
        }
        return j;
    }

    private int getOverallProgressAsPercentage() {
        int i = 0;
        for (FileDownloadCallback fileDownloadProgressAsPercentage : this.fileDownloadCallbackList) {
            i += getFileDownloadProgressAsPercentage(fileDownloadProgressAsPercentage);
        }
        return i;
    }

    private void refreshAppDownloadState() {
        this.appDownloadState = getAppDownloadState();
    }

    public AppDownloadState getDownloadStatus() {
        return this.appDownloadState;
    }

    public int getFileDownloadProgress(String str) {
        FileDownloadCallback fileDownloadCallback = getFileDownloadCallback(str);
        if (fileDownloadCallback == null) {
            return 0;
        }
        return getFileDownloadProgressAsPercentage(fileDownloadCallback);
    }

    public AppDownloadState getFileDownloadStatus(String str) {
        FileDownloadCallback fileDownloadCallback = getFileDownloadCallback(str);
        if (fileDownloadCallback == null) {
            return AppDownloadState.PROGRESS;
        }
        return fileDownloadCallback.getDownloadState();
    }

    public String getMd5() {
        return this.md5;
    }

    public int getOverallProgress() {
        if (this.downloadSize == 0) {
            return calculateProgressByFileNumber(getOverallProgressAsPercentage());
        }
        return calculateProgressByFileSize(getOverallProgressAsBytes());
    }

    public void setFileDownloadCallback(FileDownloadCallback fileDownloadCallback) {
        if (!this.fileDownloadCallbackList.contains(fileDownloadCallback)) {
            this.fileDownloadCallbackList.add(fileDownloadCallback);
        } else {
            this.fileDownloadCallbackList.set(this.fileDownloadCallbackList.indexOf(fileDownloadCallback), fileDownloadCallback);
        }
        refreshAppDownloadState();
    }
}
