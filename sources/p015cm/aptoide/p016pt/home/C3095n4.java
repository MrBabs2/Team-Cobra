package p015cm.aptoide.p016pt.home;

import p015cm.aptoide.p016pt.home.bundles.base.HomeEvent;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.home.n4 */
/* compiled from: lambda */
public final /* synthetic */ class C3095n4 implements C5379n {

    /* renamed from: f */
    public static final /* synthetic */ C3095n4 f6021f = new C3095n4();

    private /* synthetic */ C3095n4() {
    }

    public final Object call(Object obj) {
        return Boolean.valueOf(((HomeEvent) obj).getType().equals(HomeEvent.Type.DISMISS_BUNDLE));
    }
}
