package p015cm.aptoide.p016pt.home.more.apps;

import android.content.SharedPreferences;
import java.util.List;
import kotlin.C10219k;
import kotlin.C4789l;
import kotlin.C9134f;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.ads.data.AptoideNativeAd;
import p015cm.aptoide.p016pt.app.AppNavigator;
import p015cm.aptoide.p016pt.app.view.AppViewFragment;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.home.bundles.apps.EskillsApp;
import p015cm.aptoide.p016pt.home.more.base.ListAppsClickEvent;
import p015cm.aptoide.p016pt.home.more.base.ListAppsPresenter;
import p015cm.aptoide.p016pt.home.more.base.ListAppsView;
import p015cm.aptoide.p016pt.search.model.SearchAdResult;
import p015cm.aptoide.p016pt.view.app.Application;
import p123rx.C5368e;
import p123rx.C5373h;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BC\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\u001c\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u001a0\u00192\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0013H\u0016J\u0016\u0010\u001e\u001a\u00020\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020!H\u0016J\b\u0010\"\u001a\u00020\u001fH\u0016J\u0014\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u001a0\u0019H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u00138BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015¨\u0006$"}, mo16641d2 = {"Lcm/aptoide/pt/home/more/apps/ListAppsMorePresenter;", "Lcm/aptoide/pt/home/more/base/ListAppsPresenter;", "Lcm/aptoide/pt/view/app/Application;", "view", "Lcm/aptoide/pt/home/more/base/ListAppsView;", "viewScheduler", "Lrx/Scheduler;", "crashReporter", "Lcm/aptoide/pt/crashreports/CrashReport;", "appNavigator", "Lcm/aptoide/pt/app/AppNavigator;", "sharedPreferences", "Landroid/content/SharedPreferences;", "listAppsConfiguration", "Lcm/aptoide/pt/home/more/apps/ListAppsConfiguration;", "listAppsMoreManager", "Lcm/aptoide/pt/home/more/apps/ListAppsMoreManager;", "(Lcm/aptoide/pt/home/more/base/ListAppsView;Lrx/Scheduler;Lcm/aptoide/pt/crashreports/CrashReport;Lcm/aptoide/pt/app/AppNavigator;Landroid/content/SharedPreferences;Lcm/aptoide/pt/home/more/apps/ListAppsConfiguration;Lcm/aptoide/pt/home/more/apps/ListAppsMoreManager;)V", "url", "", "getUrl", "()Ljava/lang/String;", "url$delegate", "Lkotlin/Lazy;", "getApps", "Lrx/Observable;", "", "refresh", "", "getTitle", "handleAppClick", "", "appClickEvent", "Lcm/aptoide/pt/home/more/base/ListAppsClickEvent;", "handleHeaderClick", "loadMoreApps", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.home.more.apps.ListAppsMorePresenter */
/* compiled from: ListAppsMorePresenter.kt */
public final class ListAppsMorePresenter extends ListAppsPresenter<Application> {
    private final AppNavigator appNavigator;
    /* access modifiers changed from: private */
    public final ListAppsConfiguration listAppsConfiguration;
    private final ListAppsMoreManager listAppsMoreManager;
    /* access modifiers changed from: private */
    public final SharedPreferences sharedPreferences;
    private final C9134f url$delegate = C10181i.m34135a(C10219k.NONE, new ListAppsMorePresenter$url$2(this));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListAppsMorePresenter(ListAppsView<Application> listAppsView, C5373h hVar, CrashReport crashReport, AppNavigator appNavigator2, SharedPreferences sharedPreferences2, ListAppsConfiguration listAppsConfiguration2, ListAppsMoreManager listAppsMoreManager2) {
        super(listAppsView, hVar, crashReport);
        C10202j.m34178b(listAppsView, "view");
        C10202j.m34178b(hVar, "viewScheduler");
        C10202j.m34178b(crashReport, "crashReporter");
        C10202j.m34178b(appNavigator2, "appNavigator");
        C10202j.m34178b(sharedPreferences2, "sharedPreferences");
        C10202j.m34178b(listAppsConfiguration2, "listAppsConfiguration");
        C10202j.m34178b(listAppsMoreManager2, "listAppsMoreManager");
        this.appNavigator = appNavigator2;
        this.sharedPreferences = sharedPreferences2;
        this.listAppsConfiguration = listAppsConfiguration2;
        this.listAppsMoreManager = listAppsMoreManager2;
    }

    private final String getUrl() {
        return (String) this.url$delegate.getValue();
    }

    public C5368e<List<Application>> getApps(boolean z) {
        return this.listAppsMoreManager.loadFreshApps(getUrl(), z, this.listAppsConfiguration.getEventName(), this.listAppsConfiguration.getGroupId());
    }

    public String getTitle() {
        String title = this.listAppsConfiguration.getTitle();
        return title != null ? title : "";
    }

    public void handleAppClick(ListAppsClickEvent<Application> listAppsClickEvent) {
        C10202j.m34178b(listAppsClickEvent, "appClickEvent");
        if (listAppsClickEvent.getApplication() instanceof AptoideNativeAd) {
            this.appNavigator.navigateWithAd(new SearchAdResult((AptoideNativeAd) listAppsClickEvent.getApplication()), this.listAppsConfiguration.getTag());
        } else if (listAppsClickEvent.getApplication() instanceof EskillsApp) {
            this.appNavigator.navigateWithAppIdFromEskills(((EskillsApp) listAppsClickEvent.getApplication()).getAppId(), ((EskillsApp) listAppsClickEvent.getApplication()).getPackageName(), AppViewFragment.OpenType.OPEN_ONLY, this.listAppsConfiguration.getTag());
        } else {
            this.appNavigator.navigateWithAppId(listAppsClickEvent.getApplication().getAppId(), listAppsClickEvent.getApplication().getPackageName(), AppViewFragment.OpenType.OPEN_ONLY, this.listAppsConfiguration.getTag());
        }
    }

    public void handleHeaderClick() {
        this.appNavigator.navigateToESkillsSectionOfAppCoinsInfoView();
    }

    public C5368e<List<Application>> loadMoreApps() {
        return this.listAppsMoreManager.loadMoreApps(getUrl(), true, this.listAppsConfiguration.getEventName());
    }
}
