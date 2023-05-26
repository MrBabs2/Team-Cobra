package p015cm.aptoide.p016pt.app;

import p015cm.aptoide.p016pt.app.DownloadModel;
import p015cm.aptoide.p016pt.download.InstallType;
import p015cm.aptoide.p016pt.download.Origin;
import p015cm.aptoide.p016pt.install.Install;

/* renamed from: cm.aptoide.pt.app.DownloadStateParser */
public class DownloadStateParser {

    /* renamed from: cm.aptoide.pt.app.DownloadStateParser$1 */
    static /* synthetic */ class C13841 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action;
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$install$Install$InstallationStatus;
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$install$Install$InstallationType;

        /* JADX WARNING: Can't wrap try/catch for region: R(37:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|(2:23|24)|25|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|(3:45|46|48)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(39:0|(2:1|2)|3|5|6|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|(3:45|46|48)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(43:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|48) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0073 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x007d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0087 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0091 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00a7 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00b2 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00be */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00ca */
        static {
            /*
                cm.aptoide.pt.app.DownloadModel$Action[] r0 = p015cm.aptoide.p016pt.app.DownloadModel.Action.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action = r0
                r1 = 1
                cm.aptoide.pt.app.DownloadModel$Action r2 = p015cm.aptoide.p016pt.app.DownloadModel.Action.INSTALL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action     // Catch:{ NoSuchFieldError -> 0x001d }
                cm.aptoide.pt.app.DownloadModel$Action r3 = p015cm.aptoide.p016pt.app.DownloadModel.Action.UPDATE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action     // Catch:{ NoSuchFieldError -> 0x0028 }
                cm.aptoide.pt.app.DownloadModel$Action r4 = p015cm.aptoide.p016pt.app.DownloadModel.Action.DOWNGRADE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action     // Catch:{ NoSuchFieldError -> 0x0033 }
                cm.aptoide.pt.app.DownloadModel$Action r5 = p015cm.aptoide.p016pt.app.DownloadModel.Action.MIGRATE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                cm.aptoide.pt.install.Install$InstallationType[] r4 = p015cm.aptoide.p016pt.install.Install.InstallationType.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                $SwitchMap$cm$aptoide$pt$install$Install$InstallationType = r4
                cm.aptoide.pt.install.Install$InstallationType r5 = p015cm.aptoide.p016pt.install.Install.InstallationType.INSTALLED     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r4 = $SwitchMap$cm$aptoide$pt$install$Install$InstallationType     // Catch:{ NoSuchFieldError -> 0x004e }
                cm.aptoide.pt.install.Install$InstallationType r5 = p015cm.aptoide.p016pt.install.Install.InstallationType.INSTALL     // Catch:{ NoSuchFieldError -> 0x004e }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r4 = $SwitchMap$cm$aptoide$pt$install$Install$InstallationType     // Catch:{ NoSuchFieldError -> 0x0058 }
                cm.aptoide.pt.install.Install$InstallationType r5 = p015cm.aptoide.p016pt.install.Install.InstallationType.DOWNGRADE     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r4[r5] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r4 = $SwitchMap$cm$aptoide$pt$install$Install$InstallationType     // Catch:{ NoSuchFieldError -> 0x0062 }
                cm.aptoide.pt.install.Install$InstallationType r5 = p015cm.aptoide.p016pt.install.Install.InstallationType.UPDATE     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                cm.aptoide.pt.install.Install$InstallationStatus[] r4 = p015cm.aptoide.p016pt.install.Install.InstallationStatus.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                $SwitchMap$cm$aptoide$pt$install$Install$InstallationStatus = r4
                cm.aptoide.pt.install.Install$InstallationStatus r5 = p015cm.aptoide.p016pt.install.Install.InstallationStatus.DOWNLOADING     // Catch:{ NoSuchFieldError -> 0x0073 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0073 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0073 }
            L_0x0073:
                int[] r1 = $SwitchMap$cm$aptoide$pt$install$Install$InstallationStatus     // Catch:{ NoSuchFieldError -> 0x007d }
                cm.aptoide.pt.install.Install$InstallationStatus r4 = p015cm.aptoide.p016pt.install.Install.InstallationStatus.PAUSED     // Catch:{ NoSuchFieldError -> 0x007d }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x007d }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x007d }
            L_0x007d:
                int[] r0 = $SwitchMap$cm$aptoide$pt$install$Install$InstallationStatus     // Catch:{ NoSuchFieldError -> 0x0087 }
                cm.aptoide.pt.install.Install$InstallationStatus r1 = p015cm.aptoide.p016pt.install.Install.InstallationStatus.IN_QUEUE     // Catch:{ NoSuchFieldError -> 0x0087 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0087 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0087 }
            L_0x0087:
                int[] r0 = $SwitchMap$cm$aptoide$pt$install$Install$InstallationStatus     // Catch:{ NoSuchFieldError -> 0x0091 }
                cm.aptoide.pt.install.Install$InstallationStatus r1 = p015cm.aptoide.p016pt.install.Install.InstallationStatus.INITIAL_STATE     // Catch:{ NoSuchFieldError -> 0x0091 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0091 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0091 }
            L_0x0091:
                int[] r0 = $SwitchMap$cm$aptoide$pt$install$Install$InstallationStatus     // Catch:{ NoSuchFieldError -> 0x009c }
                cm.aptoide.pt.install.Install$InstallationStatus r1 = p015cm.aptoide.p016pt.install.Install.InstallationStatus.INSTALLED     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = $SwitchMap$cm$aptoide$pt$install$Install$InstallationStatus     // Catch:{ NoSuchFieldError -> 0x00a7 }
                cm.aptoide.pt.install.Install$InstallationStatus r1 = p015cm.aptoide.p016pt.install.Install.InstallationStatus.UNINSTALLED     // Catch:{ NoSuchFieldError -> 0x00a7 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a7 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a7 }
            L_0x00a7:
                int[] r0 = $SwitchMap$cm$aptoide$pt$install$Install$InstallationStatus     // Catch:{ NoSuchFieldError -> 0x00b2 }
                cm.aptoide.pt.install.Install$InstallationStatus r1 = p015cm.aptoide.p016pt.install.Install.InstallationStatus.INSTALLATION_TIMEOUT     // Catch:{ NoSuchFieldError -> 0x00b2 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b2 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b2 }
            L_0x00b2:
                int[] r0 = $SwitchMap$cm$aptoide$pt$install$Install$InstallationStatus     // Catch:{ NoSuchFieldError -> 0x00be }
                cm.aptoide.pt.install.Install$InstallationStatus r1 = p015cm.aptoide.p016pt.install.Install.InstallationStatus.GENERIC_ERROR     // Catch:{ NoSuchFieldError -> 0x00be }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00be }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00be }
            L_0x00be:
                int[] r0 = $SwitchMap$cm$aptoide$pt$install$Install$InstallationStatus     // Catch:{ NoSuchFieldError -> 0x00ca }
                cm.aptoide.pt.install.Install$InstallationStatus r1 = p015cm.aptoide.p016pt.install.Install.InstallationStatus.NOT_ENOUGH_SPACE_ERROR     // Catch:{ NoSuchFieldError -> 0x00ca }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ca }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00ca }
            L_0x00ca:
                int[] r0 = $SwitchMap$cm$aptoide$pt$install$Install$InstallationStatus     // Catch:{ NoSuchFieldError -> 0x00d6 }
                cm.aptoide.pt.install.Install$InstallationStatus r1 = p015cm.aptoide.p016pt.install.Install.InstallationStatus.INSTALLING     // Catch:{ NoSuchFieldError -> 0x00d6 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d6 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d6 }
            L_0x00d6:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.app.DownloadStateParser.C13841.<clinit>():void");
        }
    }

    public InstallType getInstallType(int i) {
        if (i == 1) {
            return InstallType.UPDATE;
        }
        if (i != 2) {
            return InstallType.INSTALL;
        }
        return InstallType.DOWNGRADE;
    }

    public Origin getOrigin(int i) {
        if (i == 1) {
            return Origin.UPDATE;
        }
        if (i != 2) {
            return Origin.INSTALL;
        }
        return Origin.DOWNGRADE;
    }

    public int parseDownloadAction(DownloadModel.Action action) {
        int i = C13841.$SwitchMap$cm$aptoide$pt$app$DownloadModel$Action[action.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3 || i == 4) {
            return 2;
        }
        throw new IllegalArgumentException("Invalid action " + action.toString());
    }

    public DownloadModel.DownloadState parseDownloadState(Install.InstallationStatus installationStatus, boolean z) {
        if (z && installationStatus != Install.InstallationStatus.INSTALLING) {
            return DownloadModel.DownloadState.INDETERMINATE;
        }
        switch (C13841.$SwitchMap$cm$aptoide$pt$install$Install$InstallationStatus[installationStatus.ordinal()]) {
            case 1:
                return DownloadModel.DownloadState.ACTIVE;
            case 2:
                return DownloadModel.DownloadState.PAUSE;
            case 3:
            case 4:
                return DownloadModel.DownloadState.INDETERMINATE;
            case 5:
            case 6:
                return DownloadModel.DownloadState.COMPLETE;
            case 7:
            case 8:
                return DownloadModel.DownloadState.ERROR;
            case 9:
                return DownloadModel.DownloadState.NOT_ENOUGH_STORAGE_ERROR;
            case 10:
                return DownloadModel.DownloadState.INSTALLING;
            default:
                throw new IllegalStateException("Wrong type of download state");
        }
    }

    public DownloadModel.Action parseDownloadType(Install.InstallationType installationType, boolean z) {
        if (z) {
            return DownloadModel.Action.MIGRATE;
        }
        int i = C13841.$SwitchMap$cm$aptoide$pt$install$Install$InstallationType[installationType.ordinal()];
        if (i == 1) {
            return DownloadModel.Action.OPEN;
        }
        if (i == 2) {
            return DownloadModel.Action.INSTALL;
        }
        if (i == 3) {
            return DownloadModel.Action.DOWNGRADE;
        }
        if (i != 4) {
            return DownloadModel.Action.INSTALL;
        }
        return DownloadModel.Action.UPDATE;
    }
}
