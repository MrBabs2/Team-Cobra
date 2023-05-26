package p015cm.aptoide.p016pt.install;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import p015cm.aptoide.p016pt.install.installer.RootCommandOnSubscribe;
import p015cm.aptoide.p016pt.packageinstaller.InstallStatus;
import p015cm.aptoide.p016pt.preferences.managed.ManagerPreferences;
import p015cm.aptoide.p016pt.root.RootAvailabilityManager;

/* renamed from: cm.aptoide.pt.install.InstallEvents */
public class InstallEvents implements InstallerAnalytics {
    private static final String CONCAT = "CONCAT";
    private static final String INSTALLFABRICCONTEXT = "Install_Fabric_Event";
    public static final String IS_INSTALLATION_TYPE_EVENT_NAME = "INSTALLATION_TYPE";
    private static final String IS_ROOT = "IS_ROOT";
    public static final String MIUI_INSTALLATION_ABOVE_20_EVENT_NAME = "MIUI_Installation_Above_20";
    public static final String ROOT_V2_COMPLETE = "Root_v2_Complete";
    public static final String ROOT_V2_START = "Root_v2_Start";
    private static final String SETTING_ROOT = "SETTING_ROOT";
    private final AnalyticsManager analyticsManager;
    private final InstallAnalytics installAnalytics;
    private final NavigationTracker navigationTracker;
    private final RootAvailabilityManager rootAvailabilityManager;
    private final SharedPreferences sharedPreferences;

    public InstallEvents(AnalyticsManager analyticsManager2, InstallAnalytics installAnalytics2, SharedPreferences sharedPreferences2, RootAvailabilityManager rootAvailabilityManager2, NavigationTracker navigationTracker2) {
        this.analyticsManager = analyticsManager2;
        this.installAnalytics = installAnalytics2;
        this.sharedPreferences = sharedPreferences2;
        this.rootAvailabilityManager = rootAvailabilityManager2;
        this.navigationTracker = navigationTracker2;
    }

    public void installationType(boolean z, boolean z2) {
        HashMap hashMap = new HashMap();
        hashMap.put(IS_ROOT, String.valueOf(z2));
        hashMap.put(SETTING_ROOT, String.valueOf(z));
        hashMap.put(CONCAT, z + "_" + z2);
        this.analyticsManager.logEvent(hashMap, IS_INSTALLATION_TYPE_EVENT_NAME, AnalyticsManager.Action.ROOT, INSTALLFABRICCONTEXT);
    }

    public void logInstallCancelEvent(String str, int i) {
        this.installAnalytics.logInstallCancelEvent(str, i);
    }

    public void logInstallErrorEvent(String str, int i, Exception exc) {
        this.installAnalytics.logInstallErrorEvent(str, i, exc, this.rootAvailabilityManager.isRootAvailable().mo18562a().mo41082a().booleanValue(), ManagerPreferences.allowRootInstallation(this.sharedPreferences));
    }

    public void rootInstallCancelled() {
        HashMap hashMap = new HashMap();
        hashMap.put("Result", "cancel");
        this.analyticsManager.logEvent(hashMap, ROOT_V2_COMPLETE, AnalyticsManager.Action.ROOT, INSTALLFABRICCONTEXT);
    }

    public void rootInstallCompleted(int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("Result", RootCommandOnSubscribe.SUCCESS_OUTPUT_CONFIRMATION);
        hashMap.put("Exit_Code", String.valueOf(i));
        this.analyticsManager.logEvent(hashMap, ROOT_V2_COMPLETE, AnalyticsManager.Action.ROOT, INSTALLFABRICCONTEXT);
    }

    public void rootInstallFail(Exception exc) {
        HashMap hashMap = new HashMap();
        hashMap.put("Result", "fail");
        hashMap.put("Error", exc.getMessage());
        this.analyticsManager.logEvent(hashMap, ROOT_V2_COMPLETE, AnalyticsManager.Action.ROOT, INSTALLFABRICCONTEXT);
    }

    public void rootInstallStart() {
        this.analyticsManager.logEvent((Map<String, Object>) null, ROOT_V2_START, AnalyticsManager.Action.ROOT, INSTALLFABRICCONTEXT);
    }

    public void rootInstallTimeout() {
        HashMap hashMap = new HashMap();
        hashMap.put("Result", "timeout");
        this.analyticsManager.logEvent(hashMap, ROOT_V2_COMPLETE, AnalyticsManager.Action.ROOT, INSTALLFABRICCONTEXT);
    }

    public void sendMiuiInstallResultEvent(InstallStatus.Status status) {
        HashMap hashMap = new HashMap();
        if (status.equals(InstallStatus.Status.SUCCESS)) {
            hashMap.put("successful_installation_type", "split_install");
        } else if (status.equals(InstallStatus.Status.FAIL)) {
            hashMap.put("successful_installation_type", "default_install");
        }
        this.analyticsManager.logEvent(hashMap, MIUI_INSTALLATION_ABOVE_20_EVENT_NAME, AnalyticsManager.Action.INSTALL, this.navigationTracker.getViewName(false));
    }
}
