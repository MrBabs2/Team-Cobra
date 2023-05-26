package p015cm.aptoide.p016pt.dataprovider.aab;

/* renamed from: cm.aptoide.pt.dataprovider.aab.AppBundlesVisibilityManager */
public class AppBundlesVisibilityManager {
    private final boolean isDeviceMIUI;
    private final boolean isMIUIWithAABFix;
    private final SettingsValuesProvider settingsValuesProvider;

    public AppBundlesVisibilityManager(boolean z, boolean z2, SettingsValuesProvider settingsValuesProvider2) {
        this.isMIUIWithAABFix = z;
        this.isDeviceMIUI = z2;
        this.settingsValuesProvider = settingsValuesProvider2;
    }

    public boolean shouldEnableAppBundles() {
        return !this.settingsValuesProvider.isEnforceNativeInstaller() && (!this.isDeviceMIUI || !this.settingsValuesProvider.isOnlyShowCompatibleApps() || (this.isDeviceMIUI && this.isMIUIWithAABFix));
    }
}
