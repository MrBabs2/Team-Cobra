package p015cm.aptoide.p016pt.util;

import p015cm.aptoide.p016pt.ads.MinimalAdMapper;
import p015cm.aptoide.p016pt.database.RoomStoredMinimalAdPersistence;
import p015cm.aptoide.p016pt.search.model.SearchAdResult;
import p123rx.p126m.C5377a;

/* renamed from: cm.aptoide.pt.util.b */
/* compiled from: lambda */
public final /* synthetic */ class C4440b implements C5377a {

    /* renamed from: f */
    private final /* synthetic */ RoomStoredMinimalAdPersistence f7608f;

    /* renamed from: g */
    private final /* synthetic */ MinimalAdMapper f7609g;

    /* renamed from: h */
    private final /* synthetic */ SearchAdResult f7610h;

    /* renamed from: i */
    private final /* synthetic */ String f7611i;

    public /* synthetic */ C4440b(RoomStoredMinimalAdPersistence roomStoredMinimalAdPersistence, MinimalAdMapper minimalAdMapper, SearchAdResult searchAdResult, String str) {
        this.f7608f = roomStoredMinimalAdPersistence;
        this.f7609g = minimalAdMapper;
        this.f7610h = searchAdResult;
        this.f7611i = str;
    }

    public final void call() {
        this.f7608f.insert(this.f7609g.map(this.f7610h, this.f7611i));
    }
}
