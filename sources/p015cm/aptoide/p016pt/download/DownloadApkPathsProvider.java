package p015cm.aptoide.p016pt.download;

/* renamed from: cm.aptoide.pt.download.DownloadApkPathsProvider */
public class DownloadApkPathsProvider {
    private static final String DOWNGRADE_ACTION = "?action=downgrade";
    private static final String INSTALL_ACTION = "?action=install";
    private static final String OEMID_QUERY = "&oemid=";
    private static final String UPDATE_ACTION = "?action=update";
    private final OemidProvider oemidProvider;

    public DownloadApkPathsProvider(OemidProvider oemidProvider2) {
        this.oemidProvider = oemidProvider2;
    }

    private String getOemidQueryString(String str) {
        String str2;
        String str3 = "";
        if (str == null || str.isEmpty()) {
            str2 = str3;
        } else {
            str2 = OEMID_QUERY + str;
        }
        if (!str2.isEmpty()) {
            return str2;
        }
        String oemid = this.oemidProvider.getOemid();
        if (!oemid.isEmpty()) {
            str3 = OEMID_QUERY + oemid;
        }
        return str3;
    }

    public ApkPaths getDownloadPaths(int i, String str, String str2) {
        return getDownloadPaths(i, str, str2, (String) null);
    }

    public ApkPaths getDownloadPaths(int i, String str, String str2, String str3) {
        String str4;
        String oemidQueryString = getOemidQueryString(str3);
        if (i == 0) {
            str4 = str + INSTALL_ACTION + oemidQueryString;
            str2 = str2 + INSTALL_ACTION + oemidQueryString;
        } else if (i != 1) {
            if (i == 2) {
                str4 = str + DOWNGRADE_ACTION + oemidQueryString;
                str2 = str2 + DOWNGRADE_ACTION + oemidQueryString;
            }
            return new ApkPaths(str, str2);
        } else {
            str4 = str + UPDATE_ACTION + oemidQueryString;
            str2 = str2 + UPDATE_ACTION + oemidQueryString;
        }
        str = str4;
        return new ApkPaths(str, str2);
    }
}
