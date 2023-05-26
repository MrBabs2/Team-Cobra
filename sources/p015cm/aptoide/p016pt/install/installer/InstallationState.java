package p015cm.aptoide.p016pt.install.installer;

/* renamed from: cm.aptoide.pt.install.installer.InstallationState */
public class InstallationState {
    private static final int DEFAULT_APP_SIZE = 0;
    private final long appSize;
    private final String icon;
    private final String name;
    private final String packageName;
    private final int status;
    private final int type;
    private final int versionCode;
    private final String versionName;

    public InstallationState(String str, int i, int i2, int i3, long j) {
        this.packageName = str;
        this.versionCode = i;
        this.status = i2;
        this.type = i3;
        this.appSize = j;
        this.name = null;
        this.icon = null;
        this.versionName = "";
    }

    public long getAppSize() {
        return this.appSize;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getName() {
        return this.name;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public int getStatus() {
        return this.status;
    }

    public int getType() {
        return this.type;
    }

    public int getVersionCode() {
        return this.versionCode;
    }

    public String getVersionName() {
        return this.versionName;
    }

    public InstallationState(String str, int i, int i2, int i3) {
        this.packageName = str;
        this.versionCode = i;
        this.status = i2;
        this.type = i3;
        this.appSize = 0;
        this.name = null;
        this.icon = null;
        this.versionName = "";
    }

    public InstallationState(String str, int i, String str2, int i2, int i3, String str3, String str4, long j) {
        this.packageName = str;
        this.versionCode = i;
        this.versionName = str2;
        this.status = i2;
        this.type = i3;
        this.name = str3;
        this.icon = str4;
        this.appSize = j;
    }
}
