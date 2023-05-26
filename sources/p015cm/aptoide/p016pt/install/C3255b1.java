package p015cm.aptoide.p016pt.install;

import java.util.List;
import p015cm.aptoide.p016pt.database.room.RoomInstalled;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.install.b1 */
/* compiled from: lambda */
public final /* synthetic */ class C3255b1 implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ RoomInstalled f6182f;

    public /* synthetic */ C3255b1(RoomInstalled roomInstalled) {
        this.f6182f = roomInstalled;
    }

    public final Object call(Object obj) {
        List list = (List) obj;
        InstallManager.m6380a(this.f6182f, list);
        return list;
    }
}
