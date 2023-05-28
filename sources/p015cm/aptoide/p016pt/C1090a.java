package p015cm.aptoide.p016pt;

import p015cm.aptoide.p016pt.install.AppInstallerStatusReceiver;
import p015cm.aptoide.p016pt.packageinstaller.InstallResultCallback;
import p015cm.aptoide.p016pt.packageinstaller.InstallStatus;

/* renamed from: cm.aptoide.pt.a */
/* compiled from: lambda */
public final /* synthetic */ class C1090a implements InstallResultCallback {

    /* renamed from: a */
    private final /* synthetic */ AppInstallerStatusReceiver f3483a;

    public /* synthetic */ C1090a(AppInstallerStatusReceiver appInstallerStatusReceiver) {
        this.f3483a = appInstallerStatusReceiver;
    }

    public final void onInstallationResult(InstallStatus installStatus) {
        this.f3483a.onStatusReceived(installStatus);
    }
}
