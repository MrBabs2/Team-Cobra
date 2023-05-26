package p015cm.aptoide.p016pt.home;

import p015cm.aptoide.p016pt.home.bundles.base.HomeEvent;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.home.r3 */
/* compiled from: lambda */
public final /* synthetic */ class C3142r3 implements C5379n {

    /* renamed from: f */
    public static final /* synthetic */ C3142r3 f6068f = new C3142r3();

    private /* synthetic */ C3142r3() {
    }

    public final Object call(Object obj) {
        return Boolean.valueOf(((HomeEvent) obj).getType().equals(HomeEvent.Type.CANCEL_NOTIFY_ME));
    }
}
