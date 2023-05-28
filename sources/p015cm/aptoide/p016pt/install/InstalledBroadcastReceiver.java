package p015cm.aptoide.p016pt.install;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: cm.aptoide.pt.install.InstalledBroadcastReceiver */
public class InstalledBroadcastReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        Intent intent2 = new Intent(intent);
        intent2.setClassName(context, InstalledIntentService.class.getName());
        context.startService(intent2);
    }
}
