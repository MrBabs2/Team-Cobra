package p015cm.aptoide.p016pt.view.app;

import p123rx.Single;

/* renamed from: cm.aptoide.pt.view.app.AppCenter */
public class AppCenter {
    private final AppCenterRepository appCenterRepository;

    public AppCenter(AppCenterRepository appCenterRepository2) {
        this.appCenterRepository = appCenterRepository2;
    }

    public Single<AppsList> getApps(long j, int i) {
        return this.appCenterRepository.getApplications(j, i);
    }

    public Single<AppsList> loadAppcRecommendedApps(int i, String str) {
        return this.appCenterRepository.loadAppcRecommendedApps(i, str);
    }

    public Single<DetailedAppRequestResult> loadDetailedApp(long j, String str, String str2) {
        return this.appCenterRepository.loadDetailedApp(j, str, str2);
    }

    public Single<DetailedAppRequestResult> loadDetailedAppFromMd5(String str) {
        return this.appCenterRepository.loadDetailedAppFromMd5(str);
    }

    public Single<DetailedAppRequestResult> loadDetailedAppFromUniqueName(String str) {
        return this.appCenterRepository.loadDetailedAppFromUniqueName(str);
    }

    public Single<AppsList> loadFreshApps(long j, int i) {
        return this.appCenterRepository.loadFreshApps(j, i);
    }

    public Single<AppsList> loadNextApps(long j, int i) {
        return this.appCenterRepository.loadNextApps(j, i);
    }

    public Single<AppsList> loadRecommendedApps(int i, String str) {
        return this.appCenterRepository.loadRecommendedApps(i, str);
    }

    public Single<DetailedAppRequestResult> unsafeLoadDetailedApp(long j, String str, String str2) {
        return this.appCenterRepository.unsafeLoadDetailedApp(j, str, str2);
    }

    public Single<DetailedAppRequestResult> loadDetailedApp(String str, String str2) {
        return this.appCenterRepository.loadDetailedApp(str, str2);
    }
}
