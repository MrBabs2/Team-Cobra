package p015cm.aptoide.p016pt.home;

import p015cm.aptoide.p016pt.home.bundles.base.AppHomeEvent;
import p015cm.aptoide.p016pt.home.bundles.base.PromotionalBundle;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.home.k5 */
/* compiled from: lambda */
public final /* synthetic */ class C3042k5 implements C5379n {

    /* renamed from: f */
    public static final /* synthetic */ C3042k5 f5982f = new C3042k5();

    private /* synthetic */ C3042k5() {
    }

    public final Object call(Object obj) {
        return Boolean.valueOf(((AppHomeEvent) obj).getBundle() instanceof PromotionalBundle);
    }
}
