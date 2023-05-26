package p015cm.aptoide.p016pt.view;

import java.util.List;
import p015cm.aptoide.p016pt.store.RoomStoreRepository;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.view.o0 */
/* compiled from: lambda */
public final /* synthetic */ class C4651o0 implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ DeepLinkManager f7905f;

    /* renamed from: g */
    private final /* synthetic */ RoomStoreRepository f7906g;

    public /* synthetic */ C4651o0(DeepLinkManager deepLinkManager, RoomStoreRepository roomStoreRepository) {
        this.f7905f = deepLinkManager;
        this.f7906g = roomStoreRepository;
    }

    public final Object call(Object obj) {
        return this.f7905f.mo15169a(this.f7906g, (List) obj);
    }
}
