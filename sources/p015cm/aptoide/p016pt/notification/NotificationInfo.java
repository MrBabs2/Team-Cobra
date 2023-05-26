package p015cm.aptoide.p016pt.notification;

/* renamed from: cm.aptoide.pt.notification.NotificationInfo */
public class NotificationInfo {
    private String action;
    private String notificationTrackUrl;
    private int notificationType;
    private String notificationUrl;

    public NotificationInfo(String str, int i, String str2, String str3) {
        this.action = str;
        this.notificationType = i;
        this.notificationTrackUrl = str2;
        this.notificationUrl = str3;
    }

    public String getAction() {
        return this.action;
    }

    public String getNotificationTrackUrl() {
        return this.notificationTrackUrl;
    }

    public int getNotificationType() {
        return this.notificationType;
    }

    public String getNotificationUrl() {
        return this.notificationUrl;
    }

    public NotificationInfo(String str) {
        this.action = str;
    }
}
