package p015cm.aptoide.p016pt.preferences;

import android.content.pm.PackageManager;
import p015cm.aptoide.p016pt.appview.PreferencesPersister;
import p015cm.aptoide.p016pt.preferences.managed.ManagedKeys;
import p015cm.aptoide.p016pt.utils.AptoideUtils;

/* renamed from: cm.aptoide.pt.preferences.AptoideMd5Manager */
public class AptoideMd5Manager {
    private String cachedMd5;
    private PackageManager packageManager;
    private String packageName;
    private PreferencesPersister preferencesPersister;
    private int vercode;

    public AptoideMd5Manager(PreferencesPersister preferencesPersister2, PackageManager packageManager2, String str, int i) {
        this.preferencesPersister = preferencesPersister2;
        this.packageManager = packageManager2;
        this.packageName = str;
        this.vercode = i;
    }

    private String parseMd5(String str, int i) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        String[] split = str.split("_", 2);
        try {
            return (split.length == 2 && Integer.parseInt(split[0]) == i) ? split[1] : "";
        } catch (NumberFormatException unused) {
            return "";
        }
    }

    private void persistAptoideMd5(int i, String str) {
        PreferencesPersister preferencesPersister2 = this.preferencesPersister;
        preferencesPersister2.save(ManagedKeys.APTOIDE_MD5, i + "_" + str);
    }

    public Void calculateMd5Sum() {
        if (this.cachedMd5 != null) {
            return null;
        }
        String parseMd5 = parseMd5(this.preferencesPersister.get(ManagedKeys.APTOIDE_MD5, ""), this.vercode);
        if (!parseMd5.isEmpty()) {
            this.cachedMd5 = parseMd5;
            return null;
        }
        try {
            String computeMd5 = AptoideUtils.AlgorithmU.computeMd5(this.packageManager.getPackageInfo(this.packageName, 0));
            this.cachedMd5 = computeMd5;
            persistAptoideMd5(this.vercode, computeMd5);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getAptoideMd5() {
        String str = this.cachedMd5;
        if (str != null) {
            return str;
        }
        return parseMd5(this.preferencesPersister.get(ManagedKeys.APTOIDE_MD5, ""), this.vercode);
    }
}
