package p015cm.aptoide.p016pt.install;

import p015cm.aptoide.p016pt.install.installer.InstallationState;
import p123rx.C5328b;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.install.Installer */
public interface Installer {
    void dispatchInstallations();

    C5328b downgrade(String str, boolean z, boolean z2);

    C5368e<InstallationState> getState(String str, int i);

    C5328b install(String str, boolean z, boolean z2);

    void stopDispatching();

    C5328b uninstall(String str);

    C5328b update(String str, boolean z, boolean z2);
}
