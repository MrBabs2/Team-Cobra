package p015cm.aptoide.p016pt.util;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import p015cm.aptoide.p016pt.DeepLinkIntentReceiver;
import p015cm.aptoide.p016pt.preferences.secure.SecurePreferences;

/* renamed from: cm.aptoide.pt.util.ApkFyManager */
public class ApkFyManager {
    private static final String TAG = "ApkFy";
    private final Context context;
    private final Intent intent;
    private final SharedPreferences securePreferences;

    public ApkFyManager(Context context2, Intent intent2, SharedPreferences sharedPreferences) {
        this.context = context2;
        this.intent = intent2;
        this.securePreferences = sharedPreferences;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0064  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p015cm.aptoide.p016pt.util.ApkfyParameters extractApkfyParameters(android.content.Context r7) {
        /*
            r6 = this;
            java.lang.String r0 = "oemid"
            java.lang.String r1 = "downloadId"
            r2 = 0
            android.content.pm.PackageManager r7 = r7.getPackageManager()     // Catch:{ Exception -> 0x005f }
            java.lang.String r3 = "cm.aptoide.pt"
            r4 = 0
            android.content.pm.PackageInfo r7 = r7.getPackageInfo(r3, r4)     // Catch:{ Exception -> 0x005f }
            android.content.pm.ApplicationInfo r7 = r7.applicationInfo     // Catch:{ Exception -> 0x005f }
            java.lang.String r7 = r7.sourceDir     // Catch:{ Exception -> 0x005f }
            java.util.zip.ZipFile r3 = new java.util.zip.ZipFile     // Catch:{ Exception -> 0x005f }
            r3.<init>(r7)     // Catch:{ Exception -> 0x005f }
            java.lang.String r7 = "META-INF/aob"
            java.util.zip.ZipEntry r7 = r3.getEntry(r7)     // Catch:{ Exception -> 0x005f }
            if (r7 == 0) goto L_0x005d
            java.io.InputStream r7 = r3.getInputStream(r7)     // Catch:{ Exception -> 0x005f }
            java.util.Properties r3 = new java.util.Properties     // Catch:{ Exception -> 0x005f }
            r3.<init>()     // Catch:{ Exception -> 0x005f }
            r3.load(r7)     // Catch:{ Exception -> 0x005f }
            boolean r7 = r3.containsKey(r1)     // Catch:{ Exception -> 0x005f }
            if (r7 == 0) goto L_0x0038
            java.lang.String r7 = r3.getProperty(r1)     // Catch:{ Exception -> 0x005f }
            goto L_0x0039
        L_0x0038:
            r7 = r2
        L_0x0039:
            boolean r1 = r3.containsKey(r0)     // Catch:{ Exception -> 0x0057 }
            if (r1 == 0) goto L_0x0044
            java.lang.String r0 = r3.getProperty(r0)     // Catch:{ Exception -> 0x0057 }
            goto L_0x0045
        L_0x0044:
            r0 = r2
        L_0x0045:
            if (r7 == 0) goto L_0x0082
            long r3 = java.lang.Long.parseLong(r7)     // Catch:{ Exception -> 0x0051 }
            java.lang.Long r7 = java.lang.Long.valueOf(r3)     // Catch:{ Exception -> 0x0051 }
            r2 = r7
            goto L_0x0082
        L_0x0051:
            r1 = move-exception
            r5 = r0
            r0 = r7
            r7 = r1
            r1 = r5
            goto L_0x0062
        L_0x0057:
            r0 = move-exception
            r1 = r2
            r5 = r0
            r0 = r7
            r7 = r5
            goto L_0x0062
        L_0x005d:
            r0 = r2
            goto L_0x0082
        L_0x005f:
            r7 = move-exception
            r0 = r2
            r1 = r0
        L_0x0062:
            if (r0 == 0) goto L_0x006d
            cm.aptoide.pt.crashreports.CrashReport r3 = p015cm.aptoide.p016pt.crashreports.CrashReport.getInstance()
            java.lang.String r4 = "APKFY_APP_ID"
            r3.log(r4, r0)
        L_0x006d:
            cm.aptoide.pt.logger.Logger r0 = p015cm.aptoide.p016pt.logger.Logger.getInstance()
            java.lang.String r3 = r7.getMessage()
            java.lang.String r4 = "ApkFy"
            r0.mo12975d((java.lang.String) r4, (java.lang.String) r3)
            cm.aptoide.pt.crashreports.CrashReport r0 = p015cm.aptoide.p016pt.crashreports.CrashReport.getInstance()
            r0.log(r7)
            r0 = r1
        L_0x0082:
            cm.aptoide.pt.util.ApkfyParameters r7 = new cm.aptoide.pt.util.ApkfyParameters
            r7.<init>(r2, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.util.ApkFyManager.extractApkfyParameters(android.content.Context):cm.aptoide.pt.util.ApkfyParameters");
    }

    public void run() {
        if (SecurePreferences.shouldRunApkFy(this.securePreferences)) {
            ApkfyParameters extractApkfyParameters = extractApkfyParameters(this.context);
            if (extractApkfyParameters.getAppId() != null) {
                this.intent.putExtra(DeepLinkIntentReceiver.DeepLinksTargets.APP_VIEW_FRAGMENT, true);
                this.intent.putExtra("appId", extractApkfyParameters.getAppId());
                if (extractApkfyParameters.getOemId() != null && !extractApkfyParameters.getOemId().isEmpty()) {
                    this.intent.putExtra(DeepLinkIntentReceiver.DeepLinksKeys.OEM_ID_KEY, extractApkfyParameters.getOemId());
                }
                this.intent.putExtra(DeepLinkIntentReceiver.DeepLinksKeys.APK_FY, true);
            }
            SecurePreferences.setApkFyRun(this.securePreferences);
        }
    }
}
