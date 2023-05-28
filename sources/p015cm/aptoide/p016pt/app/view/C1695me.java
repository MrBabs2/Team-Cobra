package p015cm.aptoide.p016pt.app.view;

import p015cm.aptoide.p016pt.home.bundles.base.HomeEvent;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.app.view.me */
/* compiled from: lambda */
public final /* synthetic */ class C1695me implements C5379n {

    /* renamed from: f */
    public static final /* synthetic */ C1695me f4259f = new C1695me();

    private /* synthetic */ C1695me() {
    }

    public final Object call(Object obj) {
        return Boolean.valueOf(((HomeEvent) obj).getType().equals(HomeEvent.Type.APP));
    }
}
