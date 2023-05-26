package p015cm.aptoide.p016pt.database.room;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Environment;
import java.io.File;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.utils.AptoideUtils;
import p015cm.aptoide.p016pt.utils.FileUtils;

/* renamed from: cm.aptoide.pt.database.room.RoomInstalled */
public class RoomInstalled {
    public static final String ICON = "icon";
    public static final String NAME = "name";
    public static final String PACKAGE_NAME = "packageName";
    public static final String SIGNATURE = "signature";
    public static final int STATUS_COMPLETED = 4;
    public static final int STATUS_INSTALLING = 3;
    public static final int STATUS_PRE_INSTALL = 2;
    public static final int STATUS_ROOT_TIMEOUT = 5;
    public static final int STATUS_UNINSTALLED = 1;
    public static final int STATUS_WAITING_INSTALL_FEEDBACK = 6;
    public static final String STORE_NAME = "storeName";
    public static final int TYPE_DEFAULT = 0;
    public static final int TYPE_PACKAGE_INSTALLER = 3;
    public static final int TYPE_ROOT = 1;
    public static final int TYPE_SYSTEM = 2;
    public static final int TYPE_UNKNOWN = -1;
    public static final String VERSION_CODE = "versionCode";
    public static final String VERSION_NAME = "versionName";
    private long appSize;
    private boolean enabled;
    private String icon;
    private String name;
    private String packageAndVersionCode;
    private String packageName;
    private String signature;
    private int status;
    private String storeName;
    private boolean systemApp;
    private int type;
    private int versionCode;
    private String versionName;

    public RoomInstalled() {
    }

    private long getObbSize(String str, FileUtils fileUtils) {
        File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/Android/obb/" + str);
        if (!file.exists() || !file.isDirectory() || file.listFiles() == null || file.listFiles().length <= 0) {
            return 0;
        }
        return fileUtils.dirSize(file);
    }

    public long calculateAppSize(PackageInfo packageInfo, FileUtils fileUtils) {
        return new File(packageInfo.applicationInfo.publicSourceDir).length() + getObbSize(packageInfo.packageName, fileUtils);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RoomInstalled.class != obj.getClass()) {
            return false;
        }
        RoomInstalled roomInstalled = (RoomInstalled) obj;
        if (this.versionCode == roomInstalled.getVersionCode() && this.packageAndVersionCode.equals(roomInstalled.getPackageAndVersionCode())) {
            return this.packageName.equals(roomInstalled.getPackageName());
        }
        return false;
    }

    public Long getAppSize() {
        return Long.valueOf(this.appSize);
    }

    public String getIcon() {
        return this.icon;
    }

    public String getName() {
        return this.name;
    }

    public String getPackageAndVersionCode() {
        return this.packageAndVersionCode;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public String getSignature() {
        return this.signature;
    }

    public int getStatus() {
        return this.status;
    }

    public String getStoreName() {
        return this.storeName;
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

    public int hashCode() {
        return (((this.packageAndVersionCode.hashCode() * 31) + this.packageName.hashCode()) * 31) + this.versionCode;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public boolean isSystemApp() {
        return this.systemApp;
    }

    public void setAppSize(Long l) {
        this.appSize = l.longValue();
    }

    public void setEnabled(boolean z) {
        this.enabled = z;
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPackageAndVersionCode(String str) {
        this.packageAndVersionCode = str;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public void setSignature(String str) {
        this.signature = str;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setStoreName(String str) {
        this.storeName = str;
    }

    public void setSystemApp(boolean z) {
        this.systemApp = z;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setVersionCode(int i) {
        this.versionCode = i;
    }

    public void setVersionName(String str) {
        this.versionName = str;
    }

    public RoomInstalled(PackageInfo packageInfo, PackageManager packageManager, FileUtils fileUtils) {
        this(packageInfo, (String) null, packageManager, fileUtils);
    }

    public RoomInstalled(PackageInfo packageInfo, String str, PackageManager packageManager, FileUtils fileUtils) {
        boolean z;
        setIcon(AptoideUtils.SystemU.getApkIconPath(packageInfo));
        setName(AptoideUtils.SystemU.getApkLabel(packageInfo, packageManager));
        setAppSize(Long.valueOf(calculateAppSize(packageInfo, fileUtils)));
        setPackageName(packageInfo.packageName);
        setVersionCode(packageInfo.versionCode);
        setVersionName(packageInfo.versionName);
        boolean z2 = true;
        try {
            z = packageManager.getApplicationInfo(packageInfo.packageName, 0).enabled;
        } catch (PackageManager.NameNotFoundException e) {
            CrashReport.getInstance().log(e);
            z = true;
        }
        setEnabled(z);
        setStoreName(str);
        this.packageAndVersionCode = packageInfo.packageName + packageInfo.versionCode;
        setSystemApp((packageInfo.applicationInfo.flags & 1) == 0 ? false : z2);
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null && signatureArr.length > 0) {
            setSignature(AptoideUtils.AlgorithmU.computeSha1WithColon(signatureArr[0].toByteArray()));
        }
        setStatus(4);
        setType(-1);
    }
}
