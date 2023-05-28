package p015cm.aptoide.p016pt.install;

/* renamed from: cm.aptoide.pt.install.PackageInstallerManager */
public class PackageInstallerManager {
    private boolean isDeviceMiui;
    private boolean isMIUIWithAABFix;

    public PackageInstallerManager(boolean z, boolean z2) {
        this.isDeviceMiui = z;
        this.isMIUIWithAABFix = z2;
    }

    /* access modifiers changed from: package-private */
    public boolean shouldSetInstallerPackageName() {
        boolean z = this.isDeviceMiui;
        return !z || (z && this.isMIUIWithAABFix);
    }
}
