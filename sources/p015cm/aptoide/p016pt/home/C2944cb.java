package p015cm.aptoide.p016pt.home;

import p015cm.aptoide.p016pt.home.bundles.base.HomeEvent;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.home.cb */
/* compiled from: lambda */
public final /* synthetic */ class C2944cb implements C5378b {

    /* renamed from: f */
    private final /* synthetic */ HomeNavigator f5877f;

    public /* synthetic */ C2944cb(HomeNavigator homeNavigator) {
        this.f5877f = homeNavigator;
    }

    public final void call(Object obj) {
        this.f5877f.navigateWithAction((HomeEvent) obj);
    }
}
