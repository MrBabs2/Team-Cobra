package p015cm.aptoide.p016pt.editorialList;

import p015cm.aptoide.p016pt.home.bundles.base.HomeEvent;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.editorialList.r */
/* compiled from: lambda */
public final /* synthetic */ class C2665r implements C5379n {

    /* renamed from: f */
    public static final /* synthetic */ C2665r f5498f = new C2665r();

    private /* synthetic */ C2665r() {
    }

    public final Object call(Object obj) {
        return Boolean.valueOf(((HomeEvent) obj).getType().equals(HomeEvent.Type.REACT_SINGLE_PRESS));
    }
}
