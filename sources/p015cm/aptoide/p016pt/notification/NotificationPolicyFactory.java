package p015cm.aptoide.p016pt.notification;

import p015cm.aptoide.p016pt.install.InstalledAppsRepository;
import p015cm.aptoide.p016pt.notification.policies.AlwaysShowPolicy;
import p015cm.aptoide.p016pt.notification.policies.CampaignPolicy;
import p015cm.aptoide.p016pt.notification.policies.DefaultPolicy;
import p015cm.aptoide.p016pt.notification.policies.SocialPolicy;

/* renamed from: cm.aptoide.pt.notification.NotificationPolicyFactory */
public class NotificationPolicyFactory {
    private final InstalledAppsRepository installedAppsRepository;
    private final NotificationProvider notificationProvider;

    public NotificationPolicyFactory(NotificationProvider notificationProvider2, InstalledAppsRepository installedAppsRepository2) {
        this.notificationProvider = notificationProvider2;
        this.installedAppsRepository = installedAppsRepository2;
    }

    /* access modifiers changed from: package-private */
    public Policy getPolicy(AptoideNotification aptoideNotification) {
        switch (aptoideNotification.getType()) {
            case 0:
                return new CampaignPolicy(aptoideNotification.getWhitelistedPackages(), this.installedAppsRepository);
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
                return new SocialPolicy(this.notificationProvider, new Integer[]{1, 2, 5, 6, 4});
            case 3:
                return new SocialPolicy(this.notificationProvider, new Integer[]{3});
            case 7:
            case 8:
            case 9:
                return new AlwaysShowPolicy();
            default:
                return new DefaultPolicy();
        }
    }
}
