package p015cm.aptoide.p016pt.downloadmanager;

import p015cm.aptoide.p016pt.downloadmanager.AppDownloadStatus;

/* renamed from: cm.aptoide.pt.downloadmanager.DownloadStatusMapper */
public class DownloadStatusMapper {

    /* renamed from: cm.aptoide.pt.downloadmanager.DownloadStatusMapper$1 */
    static /* synthetic */ class C23001 {

        /* renamed from: $SwitchMap$cm$aptoide$pt$downloadmanager$AppDownloadStatus$AppDownloadState */
        static final /* synthetic */ int[] f4996x5e1d6a72;

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|(3:21|22|24)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|24) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                cm.aptoide.pt.downloadmanager.AppDownloadStatus$AppDownloadState[] r0 = p015cm.aptoide.p016pt.downloadmanager.AppDownloadStatus.AppDownloadState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4996x5e1d6a72 = r0
                cm.aptoide.pt.downloadmanager.AppDownloadStatus$AppDownloadState r1 = p015cm.aptoide.p016pt.downloadmanager.AppDownloadStatus.AppDownloadState.PROGRESS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f4996x5e1d6a72     // Catch:{ NoSuchFieldError -> 0x001d }
                cm.aptoide.pt.downloadmanager.AppDownloadStatus$AppDownloadState r1 = p015cm.aptoide.p016pt.downloadmanager.AppDownloadStatus.AppDownloadState.INVALID_STATUS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f4996x5e1d6a72     // Catch:{ NoSuchFieldError -> 0x0028 }
                cm.aptoide.pt.downloadmanager.AppDownloadStatus$AppDownloadState r1 = p015cm.aptoide.p016pt.downloadmanager.AppDownloadStatus.AppDownloadState.VERIFYING_FILE_INTEGRITY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f4996x5e1d6a72     // Catch:{ NoSuchFieldError -> 0x0033 }
                cm.aptoide.pt.downloadmanager.AppDownloadStatus$AppDownloadState r1 = p015cm.aptoide.p016pt.downloadmanager.AppDownloadStatus.AppDownloadState.COMPLETED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f4996x5e1d6a72     // Catch:{ NoSuchFieldError -> 0x003e }
                cm.aptoide.pt.downloadmanager.AppDownloadStatus$AppDownloadState r1 = p015cm.aptoide.p016pt.downloadmanager.AppDownloadStatus.AppDownloadState.PENDING     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f4996x5e1d6a72     // Catch:{ NoSuchFieldError -> 0x0049 }
                cm.aptoide.pt.downloadmanager.AppDownloadStatus$AppDownloadState r1 = p015cm.aptoide.p016pt.downloadmanager.AppDownloadStatus.AppDownloadState.PAUSED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f4996x5e1d6a72     // Catch:{ NoSuchFieldError -> 0x0054 }
                cm.aptoide.pt.downloadmanager.AppDownloadStatus$AppDownloadState r1 = p015cm.aptoide.p016pt.downloadmanager.AppDownloadStatus.AppDownloadState.WARN     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f4996x5e1d6a72     // Catch:{ NoSuchFieldError -> 0x0060 }
                cm.aptoide.pt.downloadmanager.AppDownloadStatus$AppDownloadState r1 = p015cm.aptoide.p016pt.downloadmanager.AppDownloadStatus.AppDownloadState.ERROR     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f4996x5e1d6a72     // Catch:{ NoSuchFieldError -> 0x006c }
                cm.aptoide.pt.downloadmanager.AppDownloadStatus$AppDownloadState r1 = p015cm.aptoide.p016pt.downloadmanager.AppDownloadStatus.AppDownloadState.ERROR_MD5_DOES_NOT_MATCH     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f4996x5e1d6a72     // Catch:{ NoSuchFieldError -> 0x0078 }
                cm.aptoide.pt.downloadmanager.AppDownloadStatus$AppDownloadState r1 = p015cm.aptoide.p016pt.downloadmanager.AppDownloadStatus.AppDownloadState.ERROR_NOT_ENOUGH_SPACE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f4996x5e1d6a72     // Catch:{ NoSuchFieldError -> 0x0084 }
                cm.aptoide.pt.downloadmanager.AppDownloadStatus$AppDownloadState r1 = p015cm.aptoide.p016pt.downloadmanager.AppDownloadStatus.AppDownloadState.ERROR_FILE_NOT_FOUND     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.downloadmanager.DownloadStatusMapper.C23001.<clinit>():void");
        }
    }

    public int mapAppDownloadStatus(AppDownloadStatus.AppDownloadState appDownloadState) {
        switch (C23001.f4996x5e1d6a72[appDownloadState.ordinal()]) {
            case 1:
                return 5;
            case 2:
                return 0;
            case 3:
                return 15;
            case 4:
                return 14;
            case 5:
                return 4;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
            case 9:
            case 10:
            case 11:
                return 9;
            default:
                throw new IllegalArgumentException("Invalid app download state " + appDownloadState);
        }
    }

    public int mapDownloadError(AppDownloadStatus.AppDownloadState appDownloadState) {
        switch (C23001.f4996x5e1d6a72[appDownloadState.ordinal()]) {
            case 8:
            case 9:
            case 11:
                return 1;
            case 10:
                return 2;
            default:
                return 0;
        }
    }
}
