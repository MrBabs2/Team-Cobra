package p015cm.aptoide.p016pt.home;

import p015cm.aptoide.p016pt.home.bundles.base.HomeEvent;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.home.d4 */
/* compiled from: lambda */
public final /* synthetic */ class C2950d4 implements C5379n {

    /* renamed from: f */
    public static final /* synthetic */ C2950d4 f5883f = new C2950d4();

    private /* synthetic */ C2950d4() {
    }

    public final Object call(Object obj) {
        return Boolean.valueOf(((HomeEvent) obj).getType().equals(HomeEvent.Type.SCROLL_RIGHT));
    }
}
