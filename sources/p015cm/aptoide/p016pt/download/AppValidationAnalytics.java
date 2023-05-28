package p015cm.aptoide.p016pt.download;

import java.util.HashMap;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.analytics.implementation.navigation.NavigationTracker;

/* renamed from: cm.aptoide.pt.download.AppValidationAnalytics */
public class AppValidationAnalytics {
    public static final String INVALID_DOWNLOAD_PATH_EVENT = "Invalid_Download_Path";
    private final String FILE_TYPE = "File_Type";
    private final String FILE_TYPE_APK = "apk";
    private final String FILE_TYPE_LEVEL = "File_Type_Level";
    private final String FILE_TYPE_LEVEL_ALTERNATIVE = "alternative_download";
    private final String FILE_TYPE_LEVEL_DOWNLOAD_MAIN = "main_download";
    private final String FILE_TYPE_LEVEL_OBB_MAIN = "main_obb";
    private final String FILE_TYPE_LEVEL_OBB_PATCH = "patch_obb";
    private final String FILE_TYPE_OBB = "obb";
    private final String PACKAGE_NAME = "Package_Name";
    private final AnalyticsManager analyticsManager;
    private final NavigationTracker navigationTracker;

    public AppValidationAnalytics(AnalyticsManager analyticsManager2, NavigationTracker navigationTracker2) {
        this.analyticsManager = analyticsManager2;
        this.navigationTracker = navigationTracker2;
    }

    private HashMap<String, Object> createInvalidPathMap(String str, String str2, String str3) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("Package_Name", str);
        hashMap.put("File_Type", str2);
        hashMap.put("File_Type_Level", str3);
        return hashMap;
    }

    private String getViewName(boolean z) {
        return this.navigationTracker.getViewName(z);
    }

    private void sendInvalidDownloadPathEvent(String str, String str2, String str3) {
        this.analyticsManager.logEvent(createInvalidPathMap(str, str2, str3), INVALID_DOWNLOAD_PATH_EVENT, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    public void sendInvalidDownloadAlternativePath(String str) {
        sendInvalidDownloadPathEvent(str, "apk", "alternative_download");
    }

    public void sendInvalidDownloadMainPath(String str) {
        sendInvalidDownloadPathEvent(str, "apk", "main_download");
    }

    public void sendInvalidDownloadObbMainPath(String str) {
        sendInvalidDownloadPathEvent(str, "obb", "main_obb");
    }

    public void sendInvalidDownloadObbPatchPath(String str) {
        sendInvalidDownloadPathEvent(str, "obb", "patch_obb");
    }
}
