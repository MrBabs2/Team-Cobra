package p015cm.aptoide.p016pt.install.installer;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import androidx.core.app.C0373i;

/* renamed from: cm.aptoide.pt.install.installer.RootInstallErrorNotification */
public class RootInstallErrorNotification {
    private final C0373i.C0374a action;
    private final PendingIntent deleteAction;
    private final Bitmap icon;
    private final String message;
    public final int notificationId;

    public RootInstallErrorNotification(int i, Bitmap bitmap, String str, C0373i.C0374a aVar, PendingIntent pendingIntent) {
        this.notificationId = i;
        this.icon = bitmap;
        this.message = str;
        this.action = aVar;
        this.deleteAction = pendingIntent;
    }

    public C0373i.C0374a getAction() {
        return this.action;
    }

    public PendingIntent getDeleteAction() {
        return this.deleteAction;
    }

    public Bitmap getIcon() {
        return this.icon;
    }

    public String getMessage() {
        return this.message;
    }

    public int getNotificationId() {
        return this.notificationId;
    }
}
