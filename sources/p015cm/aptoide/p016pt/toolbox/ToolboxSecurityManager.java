package p015cm.aptoide.p016pt.toolbox;

import android.content.pm.PackageManager;
import android.content.pm.Signature;

/* renamed from: cm.aptoide.pt.toolbox.ToolboxSecurityManager */
public class ToolboxSecurityManager {
    private final PackageManager packageManager;

    public ToolboxSecurityManager(PackageManager packageManager2) {
        this.packageManager = packageManager2;
    }

    private String getPackageName(int i) {
        String[] packagesForUid = this.packageManager.getPackagesForUid(i);
        if (packagesForUid != null) {
            return packagesForUid[0];
        }
        return null;
    }

    private String getSignature(String str) {
        try {
            Signature[] signatureArr = this.packageManager.getPackageInfo(str, 64).signatures;
            if (signatureArr != null) {
                return signatureArr[0].toCharsString();
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public boolean checkSignature(int i, String str, String str2) {
        String packageName = getPackageName(i);
        return str.equals(getSignature(packageName)) && str2.equals(packageName);
    }
}
