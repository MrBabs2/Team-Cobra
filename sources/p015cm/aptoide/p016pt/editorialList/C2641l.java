package p015cm.aptoide.p016pt.editorialList;

import p015cm.aptoide.p016pt.home.bundles.base.HomeEvent;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.editorialList.l */
/* compiled from: lambda */
public final /* synthetic */ class C2641l implements C5379n {

    /* renamed from: f */
    public static final /* synthetic */ C2641l f5473f = new C2641l();

    private /* synthetic */ C2641l() {
    }

    public final Object call(Object obj) {
        return Boolean.valueOf(((HomeEvent) obj).getType().equals(HomeEvent.Type.REACT_LONG_PRESS));
    }
}
