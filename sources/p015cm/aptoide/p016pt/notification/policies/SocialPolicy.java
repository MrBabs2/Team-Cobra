package p015cm.aptoide.p016pt.notification.policies;

import java.util.List;
import java.util.concurrent.TimeUnit;
import p015cm.aptoide.p016pt.notification.NotificationProvider;
import p015cm.aptoide.p016pt.notification.Policy;
import p123rx.Single;

/* renamed from: cm.aptoide.pt.notification.policies.SocialPolicy */
public class SocialPolicy implements Policy {
    private static final int police1Occurrences = 1;
    private static final long police1timeFrame = TimeUnit.HOURS.toMillis(1);
    private static final int police2Occurrences = 3;
    private static final long police2timeFrame = TimeUnit.DAYS.toMillis(1);
    private NotificationProvider notificationProvider;
    private Integer[] notificationsTypes;

    public SocialPolicy(NotificationProvider notificationProvider2, Integer[] numArr) {
        this.notificationProvider = notificationProvider2;
        this.notificationsTypes = numArr;
    }

    /* renamed from: a */
    static /* synthetic */ Boolean m6629a(Boolean bool, Boolean bool2) {
        return Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
    }

    private Single<Boolean> createPolicy(Integer[] numArr, long j, long j2, int i) {
        return this.notificationProvider.getDismissedNotifications(numArr, j2, j).mo18569d(new C3508a(i));
    }

    public Single<Boolean> shouldShow() {
        long currentTimeMillis = System.currentTimeMillis();
        long j = currentTimeMillis;
        return Single.m10124a(createPolicy(this.notificationsTypes, j, currentTimeMillis - police1timeFrame, 1), createPolicy(this.notificationsTypes, j, currentTimeMillis - police2timeFrame, 3), C3509b.f6509f);
    }

    /* renamed from: a */
    static /* synthetic */ Boolean m6628a(int i, List list) {
        return Boolean.valueOf(list.size() < i);
    }
}
