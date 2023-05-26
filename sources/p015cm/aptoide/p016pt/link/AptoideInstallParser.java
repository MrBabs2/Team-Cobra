package p015cm.aptoide.p016pt.link;

import p015cm.aptoide.p016pt.DeepLinkIntentReceiver;
import p015cm.aptoide.p016pt.account.AccountAnalytics;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.downloadmanager.Constants;

/* renamed from: cm.aptoide.pt.link.AptoideInstallParser */
public class AptoideInstallParser {
    public AptoideInstall parse(String str) {
        String[] split = str.replace("\"", "").split("&");
        String str2 = "open_only";
        String str3 = "no_origin";
        String str4 = null;
        String str5 = null;
        boolean z = false;
        for (String str6 : split) {
            if (str6.toLowerCase().contains(Constants.PACKAGE)) {
                str5 = str6.split("=")[1];
            } else if (str6.toLowerCase().contains(AccountAnalytics.STORE)) {
                str4 = str6.split("=")[1];
            } else if (str6.toLowerCase().contains("show_install_popup")) {
                z = str6.split("=")[1].equals("true");
            } else if (str6.toLowerCase().contains(DeepLinkIntentReceiver.DeepLinksKeys.OPEN_TYPE)) {
                str2 = str6.split("=")[1];
            } else if (str6.toLowerCase().contains("origin")) {
                str3 = str6.split("=")[1];
            } else if (str6.toLowerCase().contains(DeepLinkIntentReceiver.DeepLinksKeys.UNAME)) {
                return new AptoideInstall(str6.split("=")[1], str5);
            } else {
                try {
                    return new AptoideInstall(Long.parseLong(split[0]), str5, (String) null);
                } catch (NumberFormatException e) {
                    CrashReport.getInstance().log(e);
                }
            }
        }
        if (z) {
            str2 = "open_with_install_popup";
        }
        return new AptoideInstall(str4, str5, str2, str3);
    }
}
