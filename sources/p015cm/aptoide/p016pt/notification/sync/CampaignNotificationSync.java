package p015cm.aptoide.p016pt.notification.sync;

import java.util.List;
import p015cm.aptoide.p016pt.notification.AptoideNotification;
import p015cm.aptoide.p016pt.notification.NotificationProvider;
import p015cm.aptoide.p016pt.notification.NotificationService;
import p015cm.aptoide.p016pt.sync.Sync;
import p123rx.C5328b;

/* renamed from: cm.aptoide.pt.notification.sync.CampaignNotificationSync */
public class CampaignNotificationSync extends Sync {
    private final NotificationService networkService;
    private final NotificationProvider provider;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CampaignNotificationSync(String str, NotificationService notificationService, NotificationProvider notificationProvider, boolean z, boolean z2, long j, long j2) {
        super(str, z, z2, j2, j);
        this.networkService = notificationService;
        this.provider = notificationProvider;
    }

    /* renamed from: a */
    public /* synthetic */ C5328b mo13266a(List list) {
        return this.provider.save((List<AptoideNotification>) list);
    }

    public C5328b execute() {
        return this.networkService.getCampaignNotifications().mo18566b(new C3519a(this));
    }
}
