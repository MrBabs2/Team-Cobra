package p015cm.aptoide.p016pt.home;

import p015cm.aptoide.p016pt.home.bundles.base.HomeEvent;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.home.k4 */
/* compiled from: lambda */
public final /* synthetic */ class C3041k4 implements C5379n {

    /* renamed from: f */
    public static final /* synthetic */ C3041k4 f5981f = new C3041k4();

    private /* synthetic */ C3041k4() {
    }

    public final Object call(Object obj) {
        return Boolean.valueOf(((HomeEvent) obj).getType().equals(HomeEvent.Type.LOAD_MORE_RETRY));
    }
}
