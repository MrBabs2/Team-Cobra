package p015cm.aptoide.p016pt.home;

import p015cm.aptoide.p016pt.home.bundles.base.HomeEvent;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.home.w3 */
/* compiled from: lambda */
public final /* synthetic */ class C3202w3 implements C5379n {

    /* renamed from: f */
    public static final /* synthetic */ C3202w3 f6130f = new C3202w3();

    private /* synthetic */ C3202w3() {
    }

    public final Object call(Object obj) {
        return Boolean.valueOf(((HomeEvent) obj).getType().equals(HomeEvent.Type.NOTIFY_ME));
    }
}
