package p015cm.aptoide.p016pt.preferences.secure;

import android.content.SharedPreferences;
import p015cm.aptoide.p016pt.logger.Logger;

/* renamed from: cm.aptoide.pt.preferences.secure.SecurePreferences */
public class SecurePreferences {
    public static int getLatestVersionCode(SharedPreferences sharedPreferences) {
        return sharedPreferences.getInt(SecureKeys.LATEST_VERSION_CODE, -1);
    }

    public static boolean isFirstRun(SharedPreferences sharedPreferences) {
        return sharedPreferences.getBoolean(SecureKeys.FIRST_RUN, true);
    }

    public static boolean isRootDialogShowed(SharedPreferences sharedPreferences) {
        return sharedPreferences.getBoolean(SecureKeys.ROOT_DIALOG_ShOWED, false);
    }

    public static boolean isUpdatesFirstLoad(SharedPreferences sharedPreferences) {
        return sharedPreferences.getBoolean(SecureKeys.UPDATES_FIRST_LOAD, true);
    }

    public static boolean isWizardAvailable(SharedPreferences sharedPreferences) {
        return sharedPreferences.getBoolean(SecureKeys.WIZARD_AVAILABLE, true);
    }

    public static void setApkFyRun(SharedPreferences sharedPreferences) {
        sharedPreferences.edit().putBoolean(SecureKeys.SHOULD_RUN_APK_FY, false).apply();
    }

    public static void setCurrentVersionCode(int i, SharedPreferences sharedPreferences) {
        sharedPreferences.edit().putInt(SecureKeys.LATEST_VERSION_CODE, i).apply();
    }

    public static void setFirstRun(boolean z, SharedPreferences sharedPreferences) {
        Logger instance = Logger.getInstance();
        instance.mo12975d("First Run", "set first run -> " + z);
        sharedPreferences.edit().putBoolean(SecureKeys.FIRST_RUN, z).apply();
    }

    public static void setRootDialogShowed(boolean z, SharedPreferences sharedPreferences) {
        sharedPreferences.edit().putBoolean(SecureKeys.ROOT_DIALOG_ShOWED, z).apply();
    }

    public static void setUpdatesFirstLoad(boolean z, SharedPreferences sharedPreferences) {
        sharedPreferences.edit().putBoolean(SecureKeys.UPDATES_FIRST_LOAD, z).apply();
    }

    public static void setWizardAvailable(boolean z, SharedPreferences sharedPreferences) {
        sharedPreferences.edit().putBoolean(SecureKeys.WIZARD_AVAILABLE, z).commit();
    }

    public static boolean shouldRunApkFy(SharedPreferences sharedPreferences) {
        return sharedPreferences.getBoolean(SecureKeys.SHOULD_RUN_APK_FY, true);
    }
}
