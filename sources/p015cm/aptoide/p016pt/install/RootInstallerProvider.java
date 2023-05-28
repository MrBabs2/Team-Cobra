package p015cm.aptoide.p016pt.install;

import android.os.Build;
import java.io.File;
import p015cm.aptoide.p016pt.install.installer.Installation;
import p015cm.aptoide.p016pt.install.installer.RootCommandOnSubscribe;
import p015cm.aptoide.p016pt.install.installer.RootInstaller;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.install.RootInstallerProvider */
public class RootInstallerProvider {
    private InstallerAnalytics installerAnalytics;
    private final String packageName;

    public RootInstallerProvider(InstallerAnalytics installerAnalytics2, String str) {
        this.installerAnalytics = installerAnalytics2;
        this.packageName = str;
    }

    private String getRootInstallCommand(Installation installation) {
        File file = installation.getFile();
        if (Build.VERSION.SDK_INT >= 28) {
            return "cat " + file.getAbsolutePath() + " | pm install -S " + file.length();
        }
        return "pm install -r " + file.getAbsolutePath();
    }

    public C5368e.C5370a<Void> provideRootInstaller(Installation installation) {
        if (Build.VERSION.SDK_INT >= 21) {
            return new RootInstaller(this.packageName, this.installerAnalytics, installation);
        }
        return new RootCommandOnSubscribe(installation.getId().hashCode(), getRootInstallCommand(installation), this.installerAnalytics);
    }
}
