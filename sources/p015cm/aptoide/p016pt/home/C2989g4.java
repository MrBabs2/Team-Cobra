package p015cm.aptoide.p016pt.home;

import p015cm.aptoide.p016pt.home.bundles.base.HomeEvent;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.home.g4 */
/* compiled from: lambda */
public final /* synthetic */ class C2989g4 implements C5379n {

    /* renamed from: f */
    public static final /* synthetic */ C2989g4 f5926f = new C2989g4();

    private /* synthetic */ C2989g4() {
    }

    public final Object call(Object obj) {
        return Boolean.valueOf(((HomeEvent) obj).getType().equals(HomeEvent.Type.REACT_LONG_PRESS));
    }
}
