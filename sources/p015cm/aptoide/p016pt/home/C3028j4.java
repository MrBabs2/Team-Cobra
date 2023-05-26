package p015cm.aptoide.p016pt.home;

import p015cm.aptoide.p016pt.home.bundles.base.HomeEvent;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.home.j4 */
/* compiled from: lambda */
public final /* synthetic */ class C3028j4 implements C5379n {

    /* renamed from: f */
    public static final /* synthetic */ C3028j4 f5968f = new C3028j4();

    private /* synthetic */ C3028j4() {
    }

    public final Object call(Object obj) {
        return Boolean.valueOf(((HomeEvent) obj).getType().equals(HomeEvent.Type.INSTALL_WALLET));
    }
}
