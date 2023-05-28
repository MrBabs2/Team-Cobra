package p015cm.aptoide.p016pt.view.recycler.displayable;

import android.content.res.Resources;
import android.view.WindowManager;
import java.util.List;
import p015cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.GetStoreWidgets;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.StoreContext;
import p015cm.aptoide.p016pt.store.StoreAnalytics;
import p015cm.aptoide.p016pt.store.view.StoreTabNavigator;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.view.recycler.displayable.c */
/* compiled from: lambda */
public final /* synthetic */ class C4665c implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ GetStoreWidgets.WSWidget f7928f;

    /* renamed from: g */
    private final /* synthetic */ StoreAnalytics f7929g;

    /* renamed from: h */
    private final /* synthetic */ String f7930h;

    /* renamed from: i */
    private final /* synthetic */ String f7931i;

    /* renamed from: j */
    private final /* synthetic */ StoreContext f7932j;

    /* renamed from: k */
    private final /* synthetic */ StoreTabNavigator f7933k;

    /* renamed from: l */
    private final /* synthetic */ NavigationTracker f7934l;

    /* renamed from: m */
    private final /* synthetic */ ThemeManager f7935m;

    /* renamed from: n */
    private final /* synthetic */ WindowManager f7936n;

    /* renamed from: o */
    private final /* synthetic */ Resources f7937o;

    public /* synthetic */ C4665c(GetStoreWidgets.WSWidget wSWidget, StoreAnalytics storeAnalytics, String str, String str2, StoreContext storeContext, StoreTabNavigator storeTabNavigator, NavigationTracker navigationTracker, ThemeManager themeManager, WindowManager windowManager, Resources resources) {
        this.f7928f = wSWidget;
        this.f7929g = storeAnalytics;
        this.f7930h = str;
        this.f7931i = str2;
        this.f7932j = storeContext;
        this.f7933k = storeTabNavigator;
        this.f7934l = navigationTracker;
        this.f7935m = themeManager;
        this.f7936n = windowManager;
        this.f7937o = resources;
    }

    public final Object call(Object obj) {
        return DisplayablesFactory.m7667a(this.f7928f, this.f7929g, this.f7930h, this.f7931i, this.f7932j, this.f7933k, this.f7934l, this.f7935m, this.f7936n, this.f7937o, (List) obj);
    }
}
