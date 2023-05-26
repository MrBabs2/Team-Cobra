package p015cm.aptoide.p016pt.home.apps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p015cm.aptoide.p016pt.database.room.RoomInstalled;
import p015cm.aptoide.p016pt.database.room.RoomUpdate;
import p015cm.aptoide.p016pt.home.apps.model.DownloadApp;
import p015cm.aptoide.p016pt.home.apps.model.InstalledApp;
import p015cm.aptoide.p016pt.home.apps.model.StateApp;
import p015cm.aptoide.p016pt.home.apps.model.UpdateApp;
import p015cm.aptoide.p016pt.install.Install;

/* renamed from: cm.aptoide.pt.home.apps.AppMapper */
public class AppMapper {

    /* renamed from: cm.aptoide.pt.home.apps.AppMapper$1 */
    static /* synthetic */ class C27231 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$install$Install$InstallationStatus;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                cm.aptoide.pt.install.Install$InstallationStatus[] r0 = p015cm.aptoide.p016pt.install.Install.InstallationStatus.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$cm$aptoide$pt$install$Install$InstallationStatus = r0
                cm.aptoide.pt.install.Install$InstallationStatus r1 = p015cm.aptoide.p016pt.install.Install.InstallationStatus.GENERIC_ERROR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$cm$aptoide$pt$install$Install$InstallationStatus     // Catch:{ NoSuchFieldError -> 0x001d }
                cm.aptoide.pt.install.Install$InstallationStatus r1 = p015cm.aptoide.p016pt.install.Install.InstallationStatus.INSTALLATION_TIMEOUT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$cm$aptoide$pt$install$Install$InstallationStatus     // Catch:{ NoSuchFieldError -> 0x0028 }
                cm.aptoide.pt.install.Install$InstallationStatus r1 = p015cm.aptoide.p016pt.install.Install.InstallationStatus.NOT_ENOUGH_SPACE_ERROR     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$cm$aptoide$pt$install$Install$InstallationStatus     // Catch:{ NoSuchFieldError -> 0x0033 }
                cm.aptoide.pt.install.Install$InstallationStatus r1 = p015cm.aptoide.p016pt.install.Install.InstallationStatus.IN_QUEUE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$cm$aptoide$pt$install$Install$InstallationStatus     // Catch:{ NoSuchFieldError -> 0x003e }
                cm.aptoide.pt.install.Install$InstallationStatus r1 = p015cm.aptoide.p016pt.install.Install.InstallationStatus.PAUSED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$cm$aptoide$pt$install$Install$InstallationStatus     // Catch:{ NoSuchFieldError -> 0x0049 }
                cm.aptoide.pt.install.Install$InstallationStatus r1 = p015cm.aptoide.p016pt.install.Install.InstallationStatus.DOWNLOADING     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = $SwitchMap$cm$aptoide$pt$install$Install$InstallationStatus     // Catch:{ NoSuchFieldError -> 0x0054 }
                cm.aptoide.pt.install.Install$InstallationStatus r1 = p015cm.aptoide.p016pt.install.Install.InstallationStatus.INSTALLING     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = $SwitchMap$cm$aptoide$pt$install$Install$InstallationStatus     // Catch:{ NoSuchFieldError -> 0x0060 }
                cm.aptoide.pt.install.Install$InstallationStatus r1 = p015cm.aptoide.p016pt.install.Install.InstallationStatus.UNINSTALLED     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = $SwitchMap$cm$aptoide$pt$install$Install$InstallationStatus     // Catch:{ NoSuchFieldError -> 0x006c }
                cm.aptoide.pt.install.Install$InstallationStatus r1 = p015cm.aptoide.p016pt.install.Install.InstallationStatus.INITIAL_STATE     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.home.apps.AppMapper.C27231.<clinit>():void");
        }
    }

    private StateApp.Status mapDownloadStatus(Install.InstallationStatus installationStatus, boolean z) {
        if (z && installationStatus != Install.InstallationStatus.INSTALLING) {
            return StateApp.Status.IN_QUEUE;
        }
        switch (C27231.$SwitchMap$cm$aptoide$pt$install$Install$InstallationStatus[installationStatus.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return StateApp.Status.ERROR;
            case 4:
                return StateApp.Status.IN_QUEUE;
            case 5:
                return StateApp.Status.PAUSE;
            case 6:
                return StateApp.Status.ACTIVE;
            case 7:
                return StateApp.Status.INSTALLING;
            default:
                return StateApp.Status.STANDBY;
        }
    }

    public List<DownloadApp> getDownloadApps(List<Install> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            Install install = list.get(i);
            arrayList.add(new DownloadApp(install.getAppName(), install.getMd5(), install.getIcon(), install.getPackageName(), install.getProgress(), install.getVersionName(), install.getVersionCode(), mapDownloadStatus(install.getState(), install.isIndeterminate()), -1));
        }
        Collections.sort(arrayList, C2737c.f5570f);
        return arrayList;
    }

    public UpdateApp mapInstallToUpdateApp(Install install, boolean z) {
        return new UpdateApp(install.getAppName(), install.getMd5(), install.getIcon(), install.getPackageName(), install.getProgress(), install.getVersionName(), install.getVersionCode(), mapDownloadStatus(install.getState(), install.isIndeterminate()), -1, z);
    }

    public List<InstalledApp> mapInstalledToInstalledApps(List<RoomInstalled> list) {
        ArrayList arrayList = new ArrayList();
        for (RoomInstalled next : list) {
            arrayList.add(new InstalledApp(next.getName(), next.getPackageName(), next.getVersionName(), next.getIcon()));
        }
        return arrayList;
    }

    public UpdateApp mapUpdateToUpdateApp(RoomUpdate roomUpdate, boolean z) {
        return new UpdateApp(roomUpdate.getLabel(), roomUpdate.getMd5(), roomUpdate.getIcon(), roomUpdate.getPackageName(), 0, roomUpdate.getUpdateVersionName(), roomUpdate.getUpdateVersionCode(), StateApp.Status.STANDBY, roomUpdate.getAppId(), z);
    }
}
