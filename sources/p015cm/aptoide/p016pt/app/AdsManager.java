package p015cm.aptoide.p016pt.app;

import java.util.List;
import p015cm.aptoide.p016pt.ads.AdsRepository;
import p015cm.aptoide.p016pt.ads.MinimalAd;
import p015cm.aptoide.p016pt.ads.MinimalAdMapper;
import p015cm.aptoide.p016pt.database.RoomStoredMinimalAdPersistence;
import p015cm.aptoide.p016pt.dataprovider.ads.AdNetworkUtils;
import p015cm.aptoide.p016pt.dataprovider.exception.NoNetworkConnectionException;
import p015cm.aptoide.p016pt.search.model.SearchAdResult;
import p015cm.aptoide.p016pt.view.app.AppsList;
import p123rx.Single;

/* renamed from: cm.aptoide.pt.app.AdsManager */
public class AdsManager {
    private final MinimalAdMapper adMapper;
    private final AdsRepository adsRepository;
    private final RoomStoredMinimalAdPersistence storedMinimalAdPersistence;

    public AdsManager(AdsRepository adsRepository2, RoomStoredMinimalAdPersistence roomStoredMinimalAdPersistence, MinimalAdMapper minimalAdMapper) {
        this.adsRepository = adsRepository2;
        this.storedMinimalAdPersistence = roomStoredMinimalAdPersistence;
        this.adMapper = minimalAdMapper;
    }

    /* access modifiers changed from: private */
    /* renamed from: createMinimalAdRequestResultError */
    public MinimalAdRequestResult mo6800a(Throwable th) {
        if (th instanceof NoNetworkConnectionException) {
            return new MinimalAdRequestResult(AppsList.Error.NETWORK);
        }
        return new MinimalAdRequestResult(AppsList.Error.GENERIC);
    }

    public void handleAdsLogic(SearchAdResult searchAdResult) {
        this.storedMinimalAdPersistence.insert(this.adMapper.map(searchAdResult, (String) null));
        AdNetworkUtils.knockCpc(this.adMapper.map(searchAdResult));
    }

    public Single<MinimalAdRequestResult> loadAd(String str, List<String> list) {
        return this.adsRepository.loadAdsFromAppviewSuggested(str, list).mo18687f(C1385a.f3854f).mo18700m().mo18571f(new C1387b(this));
    }

    public Single<MinimalAd> loadAds(String str, String str2) {
        return this.adsRepository.loadAdsFromAppView(str, str2).mo18700m();
    }
}
