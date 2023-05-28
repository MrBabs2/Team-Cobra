package p015cm.aptoide.p016pt.app.migration;

import p015cm.aptoide.p016pt.database.room.RoomInstalled;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.app.migration.a */
/* compiled from: lambda */
public final /* synthetic */ class C1411a implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ String f3899f;

    /* renamed from: g */
    private final /* synthetic */ int f3900g;

    /* renamed from: h */
    private final /* synthetic */ long f3901h;

    /* renamed from: i */
    private final /* synthetic */ boolean f3902i;

    public /* synthetic */ C1411a(String str, int i, long j, boolean z) {
        this.f3899f = str;
        this.f3900g = i;
        this.f3901h = j;
        this.f3902i = z;
    }

    public final Object call(Object obj) {
        return AppcMigrationManager.m4599a(this.f3899f, this.f3900g, this.f3901h, this.f3902i, (RoomInstalled) obj);
    }
}
