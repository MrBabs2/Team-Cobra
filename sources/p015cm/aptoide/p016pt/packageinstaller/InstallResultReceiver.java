package p015cm.aptoide.p016pt.packageinstaller;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import p015cm.aptoide.p016pt.packageinstaller.InstallStatus;

/* renamed from: cm.aptoide.pt.packageinstaller.InstallResultReceiver */
class InstallResultReceiver extends BroadcastReceiver {
    private final PackageInstallerResultCallback packageInstallerResultCallback;

    public InstallResultReceiver(PackageInstallerResultCallback packageInstallerResultCallback2) {
        this.packageInstallerResultCallback = packageInstallerResultCallback2;
    }

    @TargetApi(21)
    public void onReceive(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null && "install_session_api_complete".equals(intent.getAction())) {
            int i = extras.getInt("android.content.pm.extra.STATUS");
            String string = extras.getString("android.content.pm.extra.STATUS_MESSAGE");
            String string2 = extras.getString("android.content.pm.extra.PACKAGE_NAME");
            switch (i) {
                case -1:
                    this.packageInstallerResultCallback.onPendingUserAction(extras);
                    return;
                case 0:
                    this.packageInstallerResultCallback.onInstallationResult(new InstallStatus(InstallStatus.Status.SUCCESS, "Install succeeded", string2));
                    return;
                case 1:
                case 2:
                case 4:
                case 5:
                case 6:
                case 7:
                    PackageInstallerResultCallback packageInstallerResultCallback2 = this.packageInstallerResultCallback;
                    InstallStatus.Status status = InstallStatus.Status.FAIL;
                    packageInstallerResultCallback2.onInstallationResult(new InstallStatus(status, "Install failed " + i + ", " + string, string2));
                    return;
                case 3:
                    PackageInstallerResultCallback packageInstallerResultCallback3 = this.packageInstallerResultCallback;
                    InstallStatus.Status status2 = InstallStatus.Status.CANCELED;
                    packageInstallerResultCallback3.onInstallationResult(new InstallStatus(status2, "Install failed " + i + ", " + string, string2));
                    break;
            }
            this.packageInstallerResultCallback.onInstallationResult(new InstallStatus(InstallStatus.Status.UNKNOWN_ERROR, "Unrecognized status received from installer", string2));
        }
    }
}
