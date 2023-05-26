package p015cm.aptoide.p016pt.home.apps.list;

import com.airbnb.epoxy.C5607n;
import com.airbnb.epoxy.Typed3EpoxyController;
import java.util.List;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.database.room.RoomStore;
import p015cm.aptoide.p016pt.home.apps.AppClick;
import p015cm.aptoide.p016pt.home.apps.list.models.DownloadCardModel_;
import p015cm.aptoide.p016pt.home.apps.list.models.InstalledCardModel_;
import p015cm.aptoide.p016pt.home.apps.list.models.TitleModel_;
import p015cm.aptoide.p016pt.home.apps.list.models.UpdateCardModel_;
import p015cm.aptoide.p016pt.home.apps.model.DownloadApp;
import p015cm.aptoide.p016pt.home.apps.model.InstalledApp;
import p015cm.aptoide.p016pt.home.apps.model.UpdateApp;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p123rx.p127s.C12871b;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002&\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00020\u0001B\r\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ2\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H\u0014J2\u0010\u0018\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002H\u0016R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\r¨\u0006\u0019"}, mo16641d2 = {"Lcm/aptoide/pt/home/apps/list/AppsController;", "Lcom/airbnb/epoxy/Typed3EpoxyController;", "", "Lcm/aptoide/pt/home/apps/model/UpdateApp;", "Lcm/aptoide/pt/home/apps/model/InstalledApp;", "Lcm/aptoide/pt/home/apps/model/DownloadApp;", "themeManager", "Lcm/aptoide/pt/themes/ThemeManager;", "(Lcm/aptoide/pt/themes/ThemeManager;)V", "appEventListener", "Lrx/subjects/PublishSubject;", "Lcm/aptoide/pt/home/apps/AppClick;", "getAppEventListener", "()Lrx/subjects/PublishSubject;", "getThemeManager", "()Lcm/aptoide/pt/themes/ThemeManager;", "updateAllEvent", "Ljava/lang/Void;", "getUpdateAllEvent", "buildModels", "", "updates", "installedApps", "downloads", "setData", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.home.apps.list.AppsController */
/* compiled from: AppsController.kt */
public final class AppsController extends Typed3EpoxyController<List<? extends UpdateApp>, List<? extends InstalledApp>, List<? extends DownloadApp>> {
    private final C12871b<AppClick> appEventListener;
    private final ThemeManager themeManager;
    private final C12871b<Void> updateAllEvent;

    public AppsController(ThemeManager themeManager2) {
        C10202j.m34178b(themeManager2, "themeManager");
        this.themeManager = themeManager2;
        C12871b<AppClick> p = C12871b.m41468p();
        C10202j.m34174a((Object) p, "PublishSubject.create()");
        this.appEventListener = p;
        C12871b<Void> p2 = C12871b.m41468p();
        C10202j.m34174a((Object) p2, "PublishSubject.create()");
        this.updateAllEvent = p2;
    }

    public final C12871b<AppClick> getAppEventListener() {
        return this.appEventListener;
    }

    public final ThemeManager getThemeManager() {
        return this.themeManager;
    }

    public final C12871b<Void> getUpdateAllEvent() {
        return this.updateAllEvent;
    }

    /* access modifiers changed from: protected */
    public void buildModels(List<UpdateApp> list, List<? extends InstalledApp> list2, List<DownloadApp> list3) {
        C10202j.m34178b(list, "updates");
        C10202j.m34178b(list2, "installedApps");
        C10202j.m34178b(list3, RoomStore.DOWNLOADS);
        new TitleModel_().m6282id((CharSequence) RoomStore.DOWNLOADS, new CharSequence[]{"header"}).title(Integer.valueOf(C1086R.string.apps_title_downloads_header)).shouldShowButton(false).addIf(!list3.isEmpty(), (C5607n) this);
        for (DownloadApp next : list3) {
            new DownloadCardModel_().m6234id((CharSequence) RoomStore.DOWNLOADS, new CharSequence[]{next.getIdentifier()}).application(next).eventSubject((C12871b) this.appEventListener).addTo(this);
        }
        new TitleModel_().m6282id((CharSequence) "updates", new CharSequence[]{"header"}).title(Integer.valueOf(C1086R.string.apps_title_updates_header)).shouldShowButton(true).eventSubject((C12871b) this.updateAllEvent).addIf(!list.isEmpty(), (C5607n) this);
        for (UpdateApp next2 : list) {
            new UpdateCardModel_().m6306id((CharSequence) "updates", new CharSequence[]{next2.getIdentifier()}).application(next2).eventSubject((C12871b) this.appEventListener).themeManager(this.themeManager).addTo(this);
        }
        new TitleModel_().m6282id((CharSequence) "installed", new CharSequence[]{"header"}).title(Integer.valueOf(C1086R.string.apps_title_installed_apps_header)).shouldShowButton(false).addIf(!list2.isEmpty(), (C5607n) this);
        for (InstalledApp installedApp : list2) {
            new InstalledCardModel_().m6258id((CharSequence) "installed", new CharSequence[]{installedApp.getIdentifier()}).application(installedApp).addTo(this);
        }
    }

    public void setData(List<UpdateApp> list, List<? extends InstalledApp> list2, List<DownloadApp> list3) {
        C10202j.m34178b(list, "updates");
        C10202j.m34178b(list2, "installedApps");
        C10202j.m34178b(list3, RoomStore.DOWNLOADS);
        super.setData(list, list2, list3);
    }
}
