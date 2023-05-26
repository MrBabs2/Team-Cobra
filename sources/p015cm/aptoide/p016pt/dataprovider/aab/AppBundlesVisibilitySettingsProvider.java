package p015cm.aptoide.p016pt.dataprovider.aab;

import android.content.SharedPreferences;
import p015cm.aptoide.p016pt.preferences.managed.ManagedKeys;

/* renamed from: cm.aptoide.pt.dataprovider.aab.AppBundlesVisibilitySettingsProvider */
public class AppBundlesVisibilitySettingsProvider implements SettingsValuesProvider {
    private final SharedPreferences sharedPreferences;

    public AppBundlesVisibilitySettingsProvider(SharedPreferences sharedPreferences2) {
        this.sharedPreferences = sharedPreferences2;
    }

    public boolean isEnforceNativeInstaller() {
        return this.sharedPreferences.getBoolean(ManagedKeys.ENFORCE_NATIVE_INSTALLER_KEY, false);
    }

    public boolean isOnlyShowCompatibleApps() {
        return this.sharedPreferences.getBoolean(ManagedKeys.HWSPECS_FILTER, true);
    }
}
