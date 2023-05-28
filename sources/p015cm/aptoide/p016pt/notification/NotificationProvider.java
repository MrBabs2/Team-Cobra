package p015cm.aptoide.p016pt.notification;

import java.util.List;
import p015cm.aptoide.p016pt.database.RoomNotificationPersistence;
import p015cm.aptoide.p016pt.database.room.RoomNotification;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.C5373h;
import p123rx.Single;

/* renamed from: cm.aptoide.pt.notification.NotificationProvider */
public class NotificationProvider {
    private final RoomNotificationPersistence roomNotificationPersistence;
    private final C5373h scheduler;

    public NotificationProvider(RoomNotificationPersistence roomNotificationPersistence2, C5373h hVar) {
        this.scheduler = hVar;
        this.roomNotificationPersistence = roomNotificationPersistence2;
    }

    /* access modifiers changed from: private */
    /* renamed from: convertToAptoideNotification */
    public AptoideNotification mo13172c(RoomNotification roomNotification) {
        return new AptoideNotification(roomNotification.getBody(), roomNotification.getImg(), roomNotification.getTitle(), roomNotification.getUrl(), roomNotification.getType(), roomNotification.getAppName(), roomNotification.getGraphic(), roomNotification.getDismissed(), roomNotification.getOwnerId(), roomNotification.getUrlTrack(), roomNotification.getNotificationCenterUrlTrack(), roomNotification.isProcessed(), roomNotification.getTimeStamp(), roomNotification.getExpire(), roomNotification.getAbTestingGroup(), roomNotification.getCampaignId(), roomNotification.getLang(), roomNotification.getActionStringRes(), roomNotification.getWhitelistedPackages());
    }

    /* access modifiers changed from: private */
    /* renamed from: convertToNotification */
    public RoomNotification mo13166a(AptoideNotification aptoideNotification) {
        return new RoomNotification(aptoideNotification.getExpire(), aptoideNotification.getAbTestingGroup(), aptoideNotification.getBody(), aptoideNotification.getCampaignId(), aptoideNotification.getImg(), aptoideNotification.getLang(), aptoideNotification.getTitle(), aptoideNotification.getUrl(), aptoideNotification.getUrlTrack(), aptoideNotification.getNotificationCenterUrlTrack(), aptoideNotification.getTimeStamp(), aptoideNotification.getType(), aptoideNotification.getDismissed(), aptoideNotification.getAppName(), aptoideNotification.getGraphic(), aptoideNotification.getOwnerId(), aptoideNotification.isProcessed(), aptoideNotification.getActionStringRes(), aptoideNotification.getWhitelistedPackages());
    }

    /* renamed from: b */
    public /* synthetic */ Single mo13171b(List list) {
        return C5368e.m10234a(list).mo18694j(new C3493l(this)).mo18698l().mo18700m();
    }

    /* renamed from: c */
    public /* synthetic */ C5328b mo13173c(List list) {
        return this.roomNotificationPersistence.insertAll(list);
    }

    public C5328b deleteAllForType(int i) {
        return this.roomNotificationPersistence.deleteAllOfType(i);
    }

    public C5368e<List<AptoideNotification>> getAptoideNotifications() {
        return this.roomNotificationPersistence.getAll().mo18687f(new C3496m(this));
    }

    public Single<List<AptoideNotification>> getDismissedNotifications(Integer[] numArr, long j, long j2) {
        return this.roomNotificationPersistence.getDismissed(numArr, j, j2).mo18559a(new C3490k(this));
    }

    public Single<RoomNotification> getLastShowed(Integer[] numArr) {
        return this.roomNotificationPersistence.getLastShowed(numArr);
    }

    public C5368e<List<AptoideNotification>> getNotifications(int i) {
        return this.roomNotificationPersistence.getAllSortedDesc().mo18687f(new C3505p(this, i));
    }

    public C5328b save(List<AptoideNotification> list) {
        return C5368e.m10234a(list).mo18694j(new C3499n(this)).mo18698l().mo18689g(new C3510q(this)).mo18696k();
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo13168a(int i, List list) {
        return C5368e.m10234a(list).mo18694j(new C3513r(this)).mo18657b(i).mo18698l();
    }

    public C5368e<List<RoomNotification>> getNotifications() {
        return this.roomNotificationPersistence.getAll();
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo13169a(List list) {
        return C5368e.m10234a(list).mo18694j(new C3502o(this)).mo18698l();
    }

    public C5328b save(RoomNotification roomNotification) {
        return this.roomNotificationPersistence.insert(roomNotification).mo18600b(this.scheduler);
    }

    public C5328b save(AptoideNotification aptoideNotification) {
        return save(mo13166a(aptoideNotification));
    }
}
