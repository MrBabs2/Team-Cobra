package p015cm.aptoide.p016pt.install;

import p015cm.aptoide.p016pt.database.room.RoomStoredMinimalAd;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.install.h2 */
/* compiled from: lambda */
public final /* synthetic */ class C3286h2 implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ InstalledIntentService f6216f;

    /* renamed from: g */
    private final /* synthetic */ String f6217g;

    public /* synthetic */ C3286h2(InstalledIntentService installedIntentService, String str) {
        this.f6216f = installedIntentService;
        this.f6217g = str;
    }

    public final Object call(Object obj) {
        return this.f6216f.mo12793a(this.f6217g, (RoomStoredMinimalAd) obj);
    }
}
