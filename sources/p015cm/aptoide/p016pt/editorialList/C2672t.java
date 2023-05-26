package p015cm.aptoide.p016pt.editorialList;

import p015cm.aptoide.p016pt.home.bundles.base.HomeEvent;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.editorialList.t */
/* compiled from: lambda */
public final /* synthetic */ class C2672t implements C5379n {

    /* renamed from: f */
    public static final /* synthetic */ C2672t f5505f = new C2672t();

    private /* synthetic */ C2672t() {
    }

    public final Object call(Object obj) {
        return Boolean.valueOf(((HomeEvent) obj).getType().equals(HomeEvent.Type.REACTION));
    }
}
