package p015cm.aptoide.p016pt.packageinstaller;

import android.os.Bundle;

/* renamed from: cm.aptoide.pt.packageinstaller.PackageInstallerResultCallback */
public interface PackageInstallerResultCallback {
    void onInstallationResult(InstallStatus installStatus);

    void onPendingUserAction(Bundle bundle);
}
