package p015cm.aptoide.p016pt.home.apps;

import java.util.List;
import java.util.concurrent.TimeUnit;
import p015cm.aptoide.p016pt.database.room.RoomInstalled;
import p015cm.aptoide.p016pt.database.room.RoomUpdate;
import p015cm.aptoide.p016pt.updates.UpdateRepository;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.Single;

/* renamed from: cm.aptoide.pt.home.apps.UpdatesManager */
public class UpdatesManager {
    private UpdateRepository updateRepository;

    public UpdatesManager(UpdateRepository updateRepository2) {
        this.updateRepository = updateRepository2;
    }

    /* renamed from: a */
    static /* synthetic */ Single m6211a(RoomInstalled roomInstalled, Boolean bool) {
        if (bool.booleanValue()) {
            return Single.m10119a(null);
        }
        return Single.m10119a(roomInstalled);
    }

    public C5328b excludeUpdate(String str) {
        return this.updateRepository.setExcluded(str);
    }

    public Single<RoomInstalled> filterUpdates(RoomInstalled roomInstalled) {
        return this.updateRepository.contains(roomInstalled.getPackageName(), false).mo18559a(new C2848x3(roomInstalled));
    }

    public Single<RoomUpdate> getUpdate(String str) {
        return this.updateRepository.get(str);
    }

    public C5368e<List<RoomUpdate>> getUpdatesList() {
        return this.updateRepository.getAll(false).mo18670c(750, TimeUnit.MILLISECONDS);
    }

    public C5368e<Integer> getUpdatesNumber() {
        return getUpdatesList().mo18694j(C2843w3.f5694f);
    }

    public C5328b refreshUpdates() {
        return this.updateRepository.sync(true, false, true);
    }
}
