package p015cm.aptoide.p016pt.link;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: cm.aptoide.pt.link.CustomTabNativeReceiver */
public class CustomTabNativeReceiver extends BroadcastReceiver {
    private static final String MOCKUP_URL = "http://www.example.com";
    private static final String REFERER_ATTRIBUTE = "Referer";
    private static final String REFERER_VALUE = "http://m.aptoide.com";

    private Set<String> extractPackagenames(List<ResolveInfo> list) {
        HashSet hashSet = new HashSet();
        for (ResolveInfo resolveInfo : list) {
            hashSet.add(resolveInfo.activityInfo.packageName);
        }
        return hashSet;
    }

    private Set<String> getNativeAppPackage(Context context, Uri uri) {
        PackageManager packageManager = context.getPackageManager();
        Set<String> extractPackagenames = extractPackagenames(packageManager.queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(MOCKUP_URL)), 0));
        Set<String> extractPackagenames2 = extractPackagenames(packageManager.queryIntentActivities(new Intent("android.intent.action.VIEW", uri), 0));
        extractPackagenames2.removeAll(extractPackagenames);
        return extractPackagenames2;
    }

    public void onReceive(Context context, Intent intent) {
        String dataString = intent.getDataString();
        if (dataString != null) {
            Set<String> nativeAppPackage = getNativeAppPackage(context, Uri.parse(dataString));
            String str = null;
            if (nativeAppPackage.iterator().hasNext()) {
                str = nativeAppPackage.iterator().next();
            }
            if (str != null) {
                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(dataString));
                Bundle bundle = new Bundle();
                bundle.putString(REFERER_ATTRIBUTE, REFERER_VALUE);
                intent2.putExtra("com.android.browser.headers", bundle);
                intent2.setFlags(268435456);
                context.startActivity(intent2);
                return;
            }
            Toast.makeText(context, "No application to open.", 0).show();
        }
    }
}
