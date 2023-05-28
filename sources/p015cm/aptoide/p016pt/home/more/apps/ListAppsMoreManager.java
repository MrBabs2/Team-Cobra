package p015cm.aptoide.p016pt.home.more.apps;

import java.util.ArrayList;
import java.util.List;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.ads.AdsRepository;
import p015cm.aptoide.p016pt.ads.MinimalAd;
import p015cm.aptoide.p016pt.ads.data.AptoideNativeAd;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.DataList;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.ListApps;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.listapp.App;
import p015cm.aptoide.p016pt.home.bundles.apps.EskillsApp;
import p015cm.aptoide.p016pt.view.app.Application;
import p123rx.C5368e;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J=\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\u0002\u0010\u0019J.\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0013J\u001e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0010H\u0002J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u001f\u001a\u00020 H\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, mo16641d2 = {"Lcm/aptoide/pt/home/more/apps/ListAppsMoreManager;", "", "listAppsMoreRepository", "Lcm/aptoide/pt/home/more/apps/ListAppsMoreRepository;", "adsRepository", "Lcm/aptoide/pt/ads/AdsRepository;", "(Lcm/aptoide/pt/home/more/apps/ListAppsMoreRepository;Lcm/aptoide/pt/ads/AdsRepository;)V", "getAdsRepository", "()Lcm/aptoide/pt/ads/AdsRepository;", "getListAppsMoreRepository", "()Lcm/aptoide/pt/home/more/apps/ListAppsMoreRepository;", "next", "", "total", "loadFreshApps", "Lrx/Observable;", "", "Lcm/aptoide/pt/view/app/Application;", "url", "", "refresh", "", "type", "groupId", "", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Long;)Lrx/Observable;", "loadMoreApps", "mapAdsResponse", "response", "Lcm/aptoide/pt/ads/MinimalAd;", "mapEskillsResponse", "listApps", "Lcm/aptoide/pt/dataprovider/model/v7/ListApps;", "mapResponse", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.home.more.apps.ListAppsMoreManager */
/* compiled from: ListAppsMoreManager.kt */
public final class ListAppsMoreManager {
    private final AdsRepository adsRepository;
    private final ListAppsMoreRepository listAppsMoreRepository;
    private int next;
    private int total;

    public ListAppsMoreManager(ListAppsMoreRepository listAppsMoreRepository2, AdsRepository adsRepository2) {
        C10202j.m34178b(listAppsMoreRepository2, "listAppsMoreRepository");
        C10202j.m34178b(adsRepository2, "adsRepository");
        this.listAppsMoreRepository = listAppsMoreRepository2;
        this.adsRepository = adsRepository2;
    }

    /* access modifiers changed from: private */
    public final List<Application> mapAdsResponse(List<MinimalAd> list) {
        ArrayList arrayList = new ArrayList();
        for (MinimalAd aptoideNativeAd : list) {
            arrayList.add(new AptoideNativeAd(aptoideNativeAd));
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public final List<Application> mapEskillsResponse(ListApps listApps) {
        ArrayList arrayList = new ArrayList();
        DataList dataList = listApps.getDataList();
        C10202j.m34174a((Object) dataList, "listApps.dataList");
        this.total = dataList.getTotal();
        DataList dataList2 = listApps.getDataList();
        C10202j.m34174a((Object) dataList2, "listApps.dataList");
        this.next = dataList2.getNext();
        DataList dataList3 = listApps.getDataList();
        C10202j.m34174a((Object) dataList3, "listApps.dataList");
        for (App app : dataList3.getList()) {
            String name = app.getName();
            C10202j.m34174a((Object) name, "app.name");
            String icon = app.getIcon();
            C10202j.m34174a((Object) icon, "app.icon");
            App.Stats stats = app.getStats();
            C10202j.m34174a((Object) stats, "app.stats");
            App.Stats.Rating rating = stats.getRating();
            C10202j.m34174a((Object) rating, "app.stats.rating");
            float avg = rating.getAvg();
            App.Stats stats2 = app.getStats();
            C10202j.m34174a((Object) stats2, "app.stats");
            int downloads = stats2.getDownloads();
            String packageName = app.getPackageName();
            C10202j.m34174a((Object) packageName, "app.packageName");
            EskillsApp eskillsApp = r4;
            EskillsApp eskillsApp2 = new EskillsApp(name, icon, avg, downloads, packageName, app.getId(), "", app.getAppcoins() != null && app.getAppcoins().hasBilling(), (String) null, 256, (DefaultConstructorMarker) null);
            arrayList.add(eskillsApp);
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public final List<Application> mapResponse(ListApps listApps) {
        ArrayList arrayList = new ArrayList();
        DataList dataList = listApps.getDataList();
        C10202j.m34174a((Object) dataList, "listApps.dataList");
        this.total = dataList.getTotal();
        DataList dataList2 = listApps.getDataList();
        C10202j.m34174a((Object) dataList2, "listApps.dataList");
        this.next = dataList2.getNext();
        DataList dataList3 = listApps.getDataList();
        C10202j.m34174a((Object) dataList3, "listApps.dataList");
        for (App app : dataList3.getList()) {
            String name = app.getName();
            String icon = app.getIcon();
            App.Stats stats = app.getStats();
            C10202j.m34174a((Object) stats, "app.stats");
            App.Stats.Rating rating = stats.getRating();
            C10202j.m34174a((Object) rating, "app.stats.rating");
            float avg = rating.getAvg();
            App.Stats stats2 = app.getStats();
            C10202j.m34174a((Object) stats2, "app.stats");
            arrayList.add(new Application(name, icon, avg, stats2.getDownloads(), app.getPackageName(), app.getId(), "", app.getAppcoins() != null && app.getAppcoins().hasBilling()));
        }
        return arrayList;
    }

    public final AdsRepository getAdsRepository() {
        return this.adsRepository;
    }

    public final ListAppsMoreRepository getListAppsMoreRepository() {
        return this.listAppsMoreRepository;
    }

    public final C5368e<List<Application>> loadFreshApps(String str, boolean z, String str2, Long l) {
        C5368e<R> eVar;
        if (C12130v.m40054b(str2, "getAds", false, 2, (Object) null)) {
            C5368e<R> j = this.adsRepository.getAdsFromHomepageMore(z).mo18694j(new ListAppsMoreManager$loadFreshApps$1(this));
            C10202j.m34174a((Object) j, "adsRepository.getAdsFrom…apAdsResponse(response) }");
            return j;
        }
        if (C12130v.m40054b(str2, "eSkills", false, 2, (Object) null)) {
            ListAppsMoreRepository listAppsMoreRepository2 = this.listAppsMoreRepository;
            if (str != null) {
                eVar = listAppsMoreRepository2.getEskillsApps(str, z).mo18694j(new ListAppsMoreManager$loadFreshApps$2(this));
            } else {
                C10202j.m34172a();
                throw null;
            }
        } else {
            eVar = this.listAppsMoreRepository.getApps(str, z).mo18694j(new ListAppsMoreManager$loadFreshApps$3(this));
        }
        C10202j.m34174a((Object) eVar, "if (type.equals(\"eSkills…> mapResponse(response) }");
        return eVar;
    }

    public final C5368e<List<Application>> loadMoreApps(String str, boolean z, String str2) {
        int i;
        if (C12130v.m40054b(str2, "getAds", false, 2, (Object) null) || (i = this.next) >= this.total) {
            C5368e<List<Application>> c = C5368e.m10257c(null);
            C10202j.m34174a((Object) c, "Observable.just(null)");
            return c;
        }
        C5368e<R> j = this.listAppsMoreRepository.loadMoreApps(str, z, i).mo18694j(new ListAppsMoreManager$loadMoreApps$1(this));
        C10202j.m34174a((Object) j, "listAppsMoreRepository.l…> mapResponse(response) }");
        return j;
    }
}
