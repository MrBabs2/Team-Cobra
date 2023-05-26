package p015cm.aptoide.p016pt.home;

import p015cm.aptoide.p016pt.home.bundles.base.ActionBundle;
import p015cm.aptoide.p016pt.home.bundles.base.HomeEvent;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.home.c8 */
/* compiled from: lambda */
public final /* synthetic */ class C2941c8 implements C5379n {

    /* renamed from: f */
    public static final /* synthetic */ C2941c8 f5874f = new C2941c8();

    private /* synthetic */ C2941c8() {
    }

    public final Object call(Object obj) {
        return Boolean.valueOf(((HomeEvent) obj).getBundle() instanceof ActionBundle);
    }
}
