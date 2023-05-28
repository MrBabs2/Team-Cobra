package p015cm.aptoide.p016pt.notification.sync;

import p015cm.aptoide.p016pt.notification.AptoideNotification;
import p015cm.aptoide.p016pt.notification.NotificationProvider;
import p015cm.aptoide.p016pt.sync.Sync;
import p123rx.C5328b;

/* renamed from: cm.aptoide.pt.notification.sync.LocalNotificationSync */
public class LocalNotificationSync extends Sync {
    public static final String APPC_CAMPAIGN_NOTIFICATION = "APPC_CAMPAIGN";
    public static final String NEW_FEATURE = "NEW_FEATURE";
    private static final long TWENTY_FOUR_HOURS = 86400000;
    private final int actionString;
    private final String body;

    /* renamed from: id */
    private final String f6523id;
    private final String image;
    private final String navigationUrl;
    private final NotificationProvider notificationProvider;
    private final String title;
    private final long trigger;
    private final int type;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LocalNotificationSync(NotificationProvider notificationProvider2, boolean z, boolean z2, long j, long j2, String str, String str2, String str3, int i, String str4, String str5, int i2) {
        super(str5, z, z2, j2, j);
        this.notificationProvider = notificationProvider2;
        this.title = str;
        this.body = str2;
        this.image = str3;
        this.navigationUrl = str4;
        this.trigger = j2;
        this.f6523id = str5;
        this.actionString = i;
        this.type = i2;
    }

    private AptoideNotification createNotification() {
        return new AptoideNotification(this.body, this.image, this.title, this.navigationUrl, this.type, System.currentTimeMillis(), "", "", -1, this.f6523id, "", "", false, Long.valueOf(System.currentTimeMillis() + 86400000), this.actionString);
    }

    public C5328b execute() {
        return this.notificationProvider.save(createNotification());
    }

    public int getActionString() {
        return this.actionString;
    }

    public String getBody() {
        return this.body;
    }

    public String getId() {
        return this.f6523id;
    }

    public String getImage() {
        return this.image;
    }

    public String getNavigationUrl() {
        return this.navigationUrl;
    }

    public String getTitle() {
        return this.title;
    }

    public long getTrigger() {
        return this.trigger;
    }

    public int getType() {
        return this.type;
    }
}
