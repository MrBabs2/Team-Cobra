package p015cm.aptoide.p016pt.store.view;

import p015cm.aptoide.p016pt.account.AccountAnalytics;
import p015cm.aptoide.p016pt.account.view.AccountNavigator;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.store.view.a1 */
/* compiled from: lambda */
public final /* synthetic */ class C4265a1 implements C5378b {

    /* renamed from: f */
    private final /* synthetic */ AccountNavigator f7352f;

    public /* synthetic */ C4265a1(AccountNavigator accountNavigator) {
        this.f7352f = accountNavigator;
    }

    public final void call(Object obj) {
        this.f7352f.navigateToAccountView(AccountAnalytics.AccountOrigins.STORE);
    }
}
