package p015cm.aptoide.p016pt.home;

import p015cm.aptoide.p016pt.home.bundles.base.HomeEvent;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.home.z3 */
/* compiled from: lambda */
public final /* synthetic */ class C3238z3 implements C5379n {

    /* renamed from: f */
    public static final /* synthetic */ C3238z3 f6166f = new C3238z3();

    private /* synthetic */ C3238z3() {
    }

    public final Object call(Object obj) {
        return Boolean.valueOf(((HomeEvent) obj).getType().equals(HomeEvent.Type.REACT_SINGLE_PRESS));
    }
}
