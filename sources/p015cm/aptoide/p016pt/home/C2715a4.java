package p015cm.aptoide.p016pt.home;

import p015cm.aptoide.p016pt.home.bundles.base.HomeEvent;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.home.a4 */
/* compiled from: lambda */
public final /* synthetic */ class C2715a4 implements C5379n {

    /* renamed from: f */
    public static final /* synthetic */ C2715a4 f5550f = new C2715a4();

    private /* synthetic */ C2715a4() {
    }

    public final Object call(Object obj) {
        return Boolean.valueOf(((HomeEvent) obj).getType().equals(HomeEvent.Type.REACTION));
    }
}
