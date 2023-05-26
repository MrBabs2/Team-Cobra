package p015cm.aptoide.p016pt.home;

import p015cm.aptoide.p016pt.home.bundles.base.ActionBundle;
import p015cm.aptoide.p016pt.home.bundles.base.HomeEvent;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.home.e7 */
/* compiled from: lambda */
public final /* synthetic */ class C2966e7 implements C5379n {

    /* renamed from: f */
    public static final /* synthetic */ C2966e7 f5899f = new C2966e7();

    private /* synthetic */ C2966e7() {
    }

    public final Object call(Object obj) {
        return Boolean.valueOf(((HomeEvent) obj).getBundle() instanceof ActionBundle);
    }
}
