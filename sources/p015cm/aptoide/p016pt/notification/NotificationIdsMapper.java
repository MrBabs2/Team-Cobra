package p015cm.aptoide.p016pt.notification;

/* renamed from: cm.aptoide.pt.notification.NotificationIdsMapper */
public class NotificationIdsMapper {
    /* access modifiers changed from: package-private */
    public int getNotificationId(int i) throws RuntimeException {
        switch (i) {
            case 0:
                return 0;
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
                return 1;
            case 3:
                return 2;
            case 7:
                return 3;
            case 8:
                return 4;
            case 9:
                return 5;
            default:
                throw new IllegalArgumentException("unknown notification type " + i);
        }
    }

    /* access modifiers changed from: package-private */
    public Integer[] getNotificationType(int i) throws RuntimeException {
        if (i == 0) {
            return new Integer[]{0};
        } else if (i == 1) {
            return new Integer[]{2, 1, 5, 6, 4};
        } else if (i == 2) {
            return new Integer[]{3};
        } else if (i == 3) {
            return new Integer[]{7};
        } else if (i == 4) {
            return new Integer[]{8};
        } else if (i == 5) {
            return new Integer[]{9};
        } else {
            throw new IllegalArgumentException("unknown notification notificationId " + i);
        }
    }
}
