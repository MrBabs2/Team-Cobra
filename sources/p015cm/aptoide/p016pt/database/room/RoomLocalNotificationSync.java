package p015cm.aptoide.p016pt.database.room;

/* renamed from: cm.aptoide.pt.database.room.RoomLocalNotificationSync */
public class RoomLocalNotificationSync {
    private final int actionStringRes;
    private final String body;

    /* renamed from: id */
    private final String f4779id;
    private final String image;
    private final String navigationUrl;
    private final String notificationId;
    private final String title;
    private final long trigger;
    private final int type;

    public RoomLocalNotificationSync(String str, String str2, String str3, String str4, int i, String str5, long j, String str6, int i2) {
        this.notificationId = str;
        this.title = str2;
        this.body = str3;
        this.image = str4;
        this.navigationUrl = str5;
        this.trigger = j;
        this.f4779id = str6;
        this.actionStringRes = i;
        this.type = i2;
    }

    public int getActionStringRes() {
        return this.actionStringRes;
    }

    public String getBody() {
        return this.body;
    }

    public String getId() {
        return this.f4779id;
    }

    public String getImage() {
        return this.image;
    }

    public String getNavigationUrl() {
        return this.navigationUrl;
    }

    public String getNotificationId() {
        return this.notificationId;
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
