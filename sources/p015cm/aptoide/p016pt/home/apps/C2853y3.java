package p015cm.aptoide.p016pt.home.apps;

import p015cm.aptoide.p016pt.database.room.RoomInstalled;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.home.apps.y3 */
/* compiled from: lambda */
public final /* synthetic */ class C2853y3 implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ UpdatesManager f5705f;

    public /* synthetic */ C2853y3(UpdatesManager updatesManager) {
        this.f5705f = updatesManager;
    }

    public final Object call(Object obj) {
        return this.f5705f.filterUpdates((RoomInstalled) obj);
    }
}
