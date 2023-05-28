package p015cm.aptoide.p016pt.home.apps.model;

import p015cm.aptoide.p016pt.home.apps.App;

/* renamed from: cm.aptoide.pt.home.apps.model.InstalledApp */
public class InstalledApp implements App {
    private String appName;
    private String icon;
    private String packageName;
    private String version;

    public InstalledApp(String str, String str2, String str3, String str4) {
        this.appName = str;
        this.packageName = str2;
        this.version = str3;
        this.icon = str4;
    }

    public String getAppName() {
        return this.appName;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getIdentifier() {
        return this.packageName;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public App.Type getType() {
        return App.Type.INSTALLED;
    }

    public String getVersion() {
        return this.version;
    }
}
