package p015cm.aptoide.p016pt.preferences.toolbox;

import android.content.SharedPreferences;

/* renamed from: cm.aptoide.pt.preferences.toolbox.ToolboxManager */
public class ToolboxManager {
    public static String getForceCountry(SharedPreferences sharedPreferences) {
        return isDebug(sharedPreferences) ? sharedPreferences.getString(ToolboxKeys.FORCE_COUNTRY, "") : "";
    }

    public static String getNotificationType(SharedPreferences sharedPreferences) {
        return isDebug(sharedPreferences) ? sharedPreferences.getString("notificationtype", "") : "";
    }

    public static long getPushNotificationPullingInterval(SharedPreferences sharedPreferences) {
        if (isDebug(sharedPreferences)) {
            return sharedPreferences.getLong(ToolboxKeys.PUSH_NOTIFICATION_PULL_INTERVAL, -1);
        }
        return -1;
    }

    public static boolean isDebug(SharedPreferences sharedPreferences) {
        return sharedPreferences.getBoolean("debugmode", false);
    }

    public static boolean isToolboxEnableHttpScheme(SharedPreferences sharedPreferences) {
        if (isDebug(sharedPreferences)) {
            return sharedPreferences.getBoolean(ToolboxKeys.TOOLBOX_ENABLE_HTTP_SCHEME, false);
        }
        return false;
    }

    public static boolean isToolboxEnableRetrofitLogs(SharedPreferences sharedPreferences) {
        if (isDebug(sharedPreferences)) {
            return sharedPreferences.getBoolean(ToolboxKeys.TOOLBOX_RETROFIT_LOGS, false);
        }
        return false;
    }

    public static void setDebug(boolean z, SharedPreferences sharedPreferences) {
        sharedPreferences.edit().putBoolean("debugmode", z).apply();
    }

    public static void setForceCountry(String str, SharedPreferences sharedPreferences) {
        sharedPreferences.edit().putString(ToolboxKeys.FORCE_COUNTRY, str).apply();
    }

    public static void setNotificationType(String str, SharedPreferences sharedPreferences) {
        sharedPreferences.edit().putString("notificationtype", str).apply();
    }

    public static void setPushNotificationPullingInterval(long j, SharedPreferences sharedPreferences) {
        sharedPreferences.edit().putLong(ToolboxKeys.PUSH_NOTIFICATION_PULL_INTERVAL, j).apply();
    }

    public static void setToolboxEnableHttpScheme(boolean z, SharedPreferences sharedPreferences) {
        sharedPreferences.edit().putBoolean(ToolboxKeys.TOOLBOX_ENABLE_HTTP_SCHEME, z).apply();
    }

    public static void setToolboxEnableRetrofitLogs(boolean z, SharedPreferences sharedPreferences) {
        sharedPreferences.edit().putBoolean(ToolboxKeys.TOOLBOX_RETROFIT_LOGS, z).apply();
    }
}
