package p015cm.aptoide.p016pt.install.installer;

import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.core.app.C0373i;
import java.util.List;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.install.Install;

/* renamed from: cm.aptoide.pt.install.installer.RootInstallErrorNotificationFactory */
public class RootInstallErrorNotificationFactory {
    private final PendingIntent dismissAction;
    private final Bitmap icon;
    private final C0373i.C0374a notificationAction;
    private final int notificationId;

    public RootInstallErrorNotificationFactory(int i, Bitmap bitmap, C0373i.C0374a aVar, PendingIntent pendingIntent) {
        this.notificationId = i;
        this.icon = bitmap;
        this.notificationAction = aVar;
        this.dismissAction = pendingIntent;
    }

    private String getNotificationTitle(Context context, List<Install> list) {
        if (list.size() == 1) {
            return context.getString(C1086R.string.f3456xaa2d1690);
        }
        return context.getString(C1086R.string.generalscreen_short_root_install_timeout_error_message, new Object[]{Integer.valueOf(list.size())});
    }

    public RootInstallErrorNotification create(Context context, List<Install> list) {
        return new RootInstallErrorNotification(this.notificationId, this.icon, getNotificationTitle(context, list), this.notificationAction, this.dismissAction);
    }
}
