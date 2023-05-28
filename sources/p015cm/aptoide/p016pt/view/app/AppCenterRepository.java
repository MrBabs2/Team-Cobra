package p015cm.aptoide.p016pt.view.app;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import p123rx.Single;

/* renamed from: cm.aptoide.pt.view.app.AppCenterRepository */
public class AppCenterRepository {
    private final AppService appService;
    private final Map<Long, AbstractMap.SimpleEntry<Integer, List<Application>>> cachedStoreApplications;

    public AppCenterRepository(AppService appService2, Map<Long, AbstractMap.SimpleEntry<Integer, List<Application>>> map) {
        this.appService = appService2;
        this.cachedStoreApplications = map;
    }

    /* access modifiers changed from: private */
    /* renamed from: cloneList */
    public AppsList mo15302b(AppsList appsList) {
        return (appsList.hasErrors() || appsList.isLoading()) ? appsList : new AppsList(new ArrayList(appsList.getList()), appsList.isLoading(), appsList.getOffset());
    }

    private void updateCache(long j, AppsList appsList, boolean z) {
        if (!appsList.hasErrors() && !appsList.isLoading()) {
            AbstractMap.SimpleEntry simpleEntry = this.cachedStoreApplications.get(Long.valueOf(j));
            if (simpleEntry == null || z) {
                this.cachedStoreApplications.put(Long.valueOf(j), new AbstractMap.SimpleEntry(Integer.valueOf(appsList.getOffset()), appsList.getList()));
                return;
            }
            List list = (List) simpleEntry.getValue();
            list.addAll(appsList.getList());
            this.cachedStoreApplications.put(Long.valueOf(j), new AbstractMap.SimpleEntry(Integer.valueOf(appsList.getOffset()), list));
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo15301a(long j, AppsList appsList) {
        updateCache(j, appsList, true);
    }

    /* renamed from: b */
    public /* synthetic */ void mo15303b(long j, AppsList appsList) {
        updateCache(j, appsList, false);
    }

    public Single<AppsList> getApplications(long j, int i) {
        AbstractMap.SimpleEntry simpleEntry = this.cachedStoreApplications.get(Long.valueOf(j));
        if (simpleEntry == null || ((List) simpleEntry.getValue()).isEmpty()) {
            return loadNextApps(j, i);
        }
        int size = i - (((List) simpleEntry.getValue()).size() % i);
        if (size == 0) {
            return Single.m10119a(new AppsList(new ArrayList((Collection) simpleEntry.getValue()), false, ((Integer) simpleEntry.getKey()).intValue()));
        }
        return loadNextApps(j, size).mo18569d(new C4519e(simpleEntry));
    }

    public Single<AppsList> loadAppcRecommendedApps(int i, String str) {
        return this.appService.loadAppcRecommendedApps(i, str).mo18568c(new C4511c(str)).mo18700m();
    }

    public Single<DetailedAppRequestResult> loadDetailedApp(long j, String str, String str2) {
        return this.appService.loadDetailedApp(j, str, str2);
    }

    public Single<DetailedAppRequestResult> loadDetailedAppFromMd5(String str) {
        return this.appService.loadDetailedAppFromMd5(str);
    }

    public Single<DetailedAppRequestResult> loadDetailedAppFromUniqueName(String str) {
        return this.appService.loadDetailedAppFromUniqueName(str);
    }

    public Single<AppsList> loadFreshApps(long j, int i) {
        return this.appService.loadFreshApps(j, i).mo18564b(new C4530h(this, j)).mo18569d(new C4507b(this));
    }

    public Single<AppsList> loadNextApps(long j, int i) {
        AbstractMap.SimpleEntry simpleEntry = this.cachedStoreApplications.get(Long.valueOf(j));
        return this.appService.loadApps(j, simpleEntry != null ? ((Integer) simpleEntry.getKey()).intValue() : 0, i).mo18564b(new C4539k(this, j)).mo18569d(new C4527g(this));
    }

    public Single<AppsList> loadRecommendedApps(int i, String str) {
        return this.appService.loadRecommendedApps(i, str).mo18568c(new C4523f(str)).mo18700m();
    }

    public Single<DetailedAppRequestResult> unsafeLoadDetailedApp(long j, String str, String str2) {
        return this.appService.unsafeLoadDetailedApp(j, str, str2);
    }

    public Single<DetailedAppRequestResult> loadDetailedApp(String str, String str2) {
        return this.appService.loadDetailedApp(str, str2);
    }

    /* renamed from: a */
    static /* synthetic */ AppsList m7547a(AbstractMap.SimpleEntry simpleEntry, AppsList appsList) {
        return new AppsList(new ArrayList((Collection) simpleEntry.getValue()), false, ((Integer) simpleEntry.getKey()).intValue());
    }

    /* renamed from: b */
    static /* synthetic */ AppsList m7550b(AppsList appsList, List list) {
        return new AppsList(list, appsList.isLoading(), appsList.getOffset());
    }

    /* renamed from: a */
    static /* synthetic */ AppsList m7546a(AppsList appsList, List list) {
        return new AppsList(list, appsList.isLoading(), appsList.getOffset());
    }
}
