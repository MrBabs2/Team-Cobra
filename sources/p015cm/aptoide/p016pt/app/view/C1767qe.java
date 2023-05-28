package p015cm.aptoide.p016pt.app.view;

import p015cm.aptoide.p016pt.home.bundles.base.HomeEvent;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.app.view.qe */
/* compiled from: lambda */
public final /* synthetic */ class C1767qe implements C5379n {

    /* renamed from: f */
    public static final /* synthetic */ C1767qe f4344f = new C1767qe();

    private /* synthetic */ C1767qe() {
    }

    public final Object call(Object obj) {
        return Boolean.valueOf(((HomeEvent) obj).getType().equals(HomeEvent.Type.SCROLL_RIGHT));
    }
}
