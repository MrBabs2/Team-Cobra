package p015cm.aptoide.p016pt.editorialList;

import p015cm.aptoide.p016pt.home.bundles.base.HomeEvent;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.editorialList.k */
/* compiled from: lambda */
public final /* synthetic */ class C2637k implements C5379n {

    /* renamed from: f */
    public static final /* synthetic */ C2637k f5468f = new C2637k();

    private /* synthetic */ C2637k() {
    }

    public final Object call(Object obj) {
        return Boolean.valueOf(((HomeEvent) obj).getType().equals(HomeEvent.Type.EDITORIAL));
    }
}
