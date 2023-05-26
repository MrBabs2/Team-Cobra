package p015cm.aptoide.p016pt.download.view;

import java.util.concurrent.TimeUnit;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.app.migration.AppcMigrationManager;
import p015cm.aptoide.p016pt.download.view.DownloadStatusModel;
import p015cm.aptoide.p016pt.install.Install;
import p015cm.aptoide.p016pt.install.InstallManager;
import p123rx.C5368e;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J@\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u001a\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0013H\u0002J\u001a\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u0013H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, mo16641d2 = {"Lcm/aptoide/pt/download/view/DownloadStatusManager;", "", "installManager", "Lcm/aptoide/pt/install/InstallManager;", "appcMigrationManager", "Lcm/aptoide/pt/app/migration/AppcMigrationManager;", "(Lcm/aptoide/pt/install/InstallManager;Lcm/aptoide/pt/app/migration/AppcMigrationManager;)V", "loadDownloadModel", "Lrx/Observable;", "Lcm/aptoide/pt/download/view/DownloadStatusModel;", "md5", "", "packageName", "versionCode", "", "signature", "storeId", "", "hasAppc", "", "parseStatusDownloadState", "Lcm/aptoide/pt/download/view/DownloadStatusModel$DownloadState;", "state", "Lcm/aptoide/pt/install/Install$InstallationStatus;", "isIndeterminate", "parseStatusDownloadType", "Lcm/aptoide/pt/download/view/DownloadStatusModel$Action;", "type", "Lcm/aptoide/pt/install/Install$InstallationType;", "isMigration", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.download.view.DownloadStatusManager */
/* compiled from: DownloadStatusManager.kt */
public final class DownloadStatusManager {
    private final AppcMigrationManager appcMigrationManager;
    private final InstallManager installManager;

    @C4789l(mo16639bv = {1, 0, 3}, mo16642k = 3, mo16643mv = {1, 1, 16})
    /* renamed from: cm.aptoide.pt.download.view.DownloadStatusManager$WhenMappings */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Install.InstallationType.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[Install.InstallationType.INSTALLED.ordinal()] = 1;
            $EnumSwitchMapping$0[Install.InstallationType.DOWNGRADE.ordinal()] = 2;
            $EnumSwitchMapping$0[Install.InstallationType.UPDATE.ordinal()] = 3;
            $EnumSwitchMapping$0[Install.InstallationType.INSTALL.ordinal()] = 4;
            int[] iArr2 = new int[Install.InstallationStatus.values().length];
            $EnumSwitchMapping$1 = iArr2;
            iArr2[Install.InstallationStatus.INSTALLATION_TIMEOUT.ordinal()] = 1;
            $EnumSwitchMapping$1[Install.InstallationStatus.GENERIC_ERROR.ordinal()] = 2;
            $EnumSwitchMapping$1[Install.InstallationStatus.NOT_ENOUGH_SPACE_ERROR.ordinal()] = 3;
            $EnumSwitchMapping$1[Install.InstallationStatus.IN_QUEUE.ordinal()] = 4;
            $EnumSwitchMapping$1[Install.InstallationStatus.PAUSED.ordinal()] = 5;
            $EnumSwitchMapping$1[Install.InstallationStatus.DOWNLOADING.ordinal()] = 6;
            $EnumSwitchMapping$1[Install.InstallationStatus.INITIAL_STATE.ordinal()] = 7;
            $EnumSwitchMapping$1[Install.InstallationStatus.INSTALLED.ordinal()] = 8;
            $EnumSwitchMapping$1[Install.InstallationStatus.UNINSTALLED.ordinal()] = 9;
            $EnumSwitchMapping$1[Install.InstallationStatus.INSTALLING.ordinal()] = 10;
        }
    }

    public DownloadStatusManager(InstallManager installManager2, AppcMigrationManager appcMigrationManager2) {
        C10202j.m34178b(installManager2, "installManager");
        C10202j.m34178b(appcMigrationManager2, "appcMigrationManager");
        this.installManager = installManager2;
        this.appcMigrationManager = appcMigrationManager2;
    }

    /* access modifiers changed from: private */
    public final DownloadStatusModel.DownloadState parseStatusDownloadState(Install.InstallationStatus installationStatus, boolean z) {
        if (z) {
            return DownloadStatusModel.DownloadState.IN_QUEUE;
        }
        if (installationStatus != null) {
            switch (WhenMappings.$EnumSwitchMapping$1[installationStatus.ordinal()]) {
                case 1:
                case 2:
                    return DownloadStatusModel.DownloadState.GENERIC_ERROR;
                case 3:
                    return DownloadStatusModel.DownloadState.NOT_ENOUGH_STORAGE_ERROR;
                case 4:
                    return DownloadStatusModel.DownloadState.IN_QUEUE;
                case 5:
                    return DownloadStatusModel.DownloadState.PAUSE;
                case 6:
                    return DownloadStatusModel.DownloadState.ACTIVE;
                case 7:
                case 8:
                case 9:
                    return DownloadStatusModel.DownloadState.STANDBY;
                case 10:
                    return DownloadStatusModel.DownloadState.INSTALLING;
            }
        }
        throw new IllegalStateException("Wrong type of download state");
    }

    /* access modifiers changed from: private */
    public final DownloadStatusModel.Action parseStatusDownloadType(Install.InstallationType installationType, boolean z) {
        if (z) {
            return DownloadStatusModel.Action.MIGRATE;
        }
        if (installationType != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[installationType.ordinal()];
            if (i == 1) {
                return DownloadStatusModel.Action.OPEN;
            }
            if (i == 2) {
                return DownloadStatusModel.Action.DOWNGRADE;
            }
            if (i == 3) {
                return DownloadStatusModel.Action.UPDATE;
            }
            if (i == 4) {
                return DownloadStatusModel.Action.INSTALL;
            }
        }
        return DownloadStatusModel.Action.INSTALL;
    }

    public final C5368e<DownloadStatusModel> loadDownloadModel(String str, String str2, int i, String str3, long j, boolean z) {
        C10202j.m34178b(str, "md5");
        C10202j.m34178b(str2, "packageName");
        return C5368e.m10247a(this.installManager.getInstall(str, str2, i), this.appcMigrationManager.isMigrationApp(str2, str3, i, j, z), new DownloadStatusManager$loadDownloadModel$1(this)).mo18682e(200, TimeUnit.MILLISECONDS);
    }
}
