package p015cm.aptoide.p016pt.install;

import java.util.concurrent.Callable;
import p015cm.aptoide.p016pt.database.RoomStoredMinimalAdPersistence;
import p015cm.aptoide.p016pt.database.room.RoomStoredMinimalAd;

/* renamed from: cm.aptoide.pt.install.i2 */
/* compiled from: lambda */
public final /* synthetic */ class C3290i2 implements Callable {

    /* renamed from: f */
    private final /* synthetic */ InstalledIntentService f6221f;

    /* renamed from: g */
    private final /* synthetic */ String f6222g;

    /* renamed from: h */
    private final /* synthetic */ RoomStoredMinimalAd f6223h;

    /* renamed from: i */
    private final /* synthetic */ RoomStoredMinimalAdPersistence f6224i;

    public /* synthetic */ C3290i2(InstalledIntentService installedIntentService, String str, RoomStoredMinimalAd roomStoredMinimalAd, RoomStoredMinimalAdPersistence roomStoredMinimalAdPersistence) {
        this.f6221f = installedIntentService;
        this.f6222g = str;
        this.f6223h = roomStoredMinimalAd;
        this.f6224i = roomStoredMinimalAdPersistence;
    }

    public final Object call() {
        return this.f6221f.mo12792a(this.f6222g, this.f6223h, this.f6224i);
    }
}
