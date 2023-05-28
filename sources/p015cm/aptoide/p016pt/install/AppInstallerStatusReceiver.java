package p015cm.aptoide.p016pt.install;

import p015cm.aptoide.p016pt.packageinstaller.InstallStatus;
import p123rx.C5368e;
import p123rx.p127s.C12871b;

/* renamed from: cm.aptoide.pt.install.AppInstallerStatusReceiver */
public class AppInstallerStatusReceiver {
    private C12871b<InstallStatus> installStatusPublishSubject;

    public AppInstallerStatusReceiver(C12871b<InstallStatus> bVar) {
        this.installStatusPublishSubject = bVar;
    }

    public C5368e<InstallStatus> getInstallerInstallStatus() {
        return this.installStatusPublishSubject;
    }

    public void onStatusReceived(InstallStatus installStatus) {
        this.installStatusPublishSubject.onNext(installStatus);
    }
}
