package p015cm.aptoide.p016pt.editorialList;

import p015cm.aptoide.p016pt.home.bundles.base.HomeEvent;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.editorialList.i */
/* compiled from: lambda */
public final /* synthetic */ class C2629i implements C5379n {

    /* renamed from: f */
    public static final /* synthetic */ C2629i f5459f = new C2629i();

    private /* synthetic */ C2629i() {
    }

    public final Object call(Object obj) {
        return Boolean.valueOf(((HomeEvent) obj).getType().equals(HomeEvent.Type.POPUP_DISMISS));
    }
}
