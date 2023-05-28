package p015cm.aptoide.p016pt.database;

import p015cm.aptoide.p016pt.database.room.AppComingSoonRegistrationDAO;
import p015cm.aptoide.p016pt.database.room.RoomAppComingSoonRegistration;
import p015cm.aptoide.p016pt.home.AppComingSoonRegistrationPersistence;
import p120q.p326a.C10837a;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.schedulers.Schedulers;
import p322p.p323a.p324a.p325a.C10832d;

/* renamed from: cm.aptoide.pt.database.RoomAppComingSoonPersistence */
public class RoomAppComingSoonPersistence implements AppComingSoonRegistrationPersistence {
    private final AppComingSoonRegistrationDAO appComingSoonRegistrationDAO;

    public RoomAppComingSoonPersistence(AppComingSoonRegistrationDAO appComingSoonRegistrationDAO2) {
        this.appComingSoonRegistrationDAO = appComingSoonRegistrationDAO2;
    }

    /* renamed from: a */
    static /* synthetic */ Boolean m5156a(Integer num) {
        return Boolean.valueOf(num.intValue() > 0);
    }

    /* renamed from: b */
    public /* synthetic */ void mo7995b(RoomAppComingSoonRegistration roomAppComingSoonRegistration) {
        this.appComingSoonRegistrationDAO.remove(roomAppComingSoonRegistration);
    }

    public C5368e<Boolean> isRegisteredForApp(String str) {
        return C10832d.m36729a(this.appComingSoonRegistrationDAO.isRegisteredForApp(str), C10837a.BUFFER).mo18662b(Schedulers.m10352io()).mo18694j(C2037b.f4712f);
    }

    public C5328b registerForAppNotification(RoomAppComingSoonRegistration roomAppComingSoonRegistration) {
        return C5328b.m10169d(new C2040c(this, roomAppComingSoonRegistration)).mo18600b(Schedulers.m10352io());
    }

    public C5328b unregisterForAppNotification(RoomAppComingSoonRegistration roomAppComingSoonRegistration) {
        return C5328b.m10169d(new C2043d(this, roomAppComingSoonRegistration)).mo18600b(Schedulers.m10352io());
    }

    /* renamed from: a */
    public /* synthetic */ void mo7994a(RoomAppComingSoonRegistration roomAppComingSoonRegistration) {
        this.appComingSoonRegistrationDAO.save(roomAppComingSoonRegistration);
    }
}
