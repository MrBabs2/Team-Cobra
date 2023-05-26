package p015cm.aptoide.p016pt.app;

import android.content.SharedPreferences;
import java.util.List;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.dataprovider.aab.AppBundlesVisibilityManager;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.AppCoinsCampaign;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.ListAppCoinsCampaigns;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.GetAppCoinsCampaignsRequest;
import p123rx.Single;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.app.AppCoinsService */
public class AppCoinsService {
    private final AppBundlesVisibilityManager appBundlesVisibilityManager;
    private final BodyInterceptor<BaseBody> bodyInterceptor;
    private final Converter.Factory converterFactory;
    private final OkHttpClient httpClient;
    private final SharedPreferences preferences;
    private final TokenInvalidator tokenInvalidator;

    public AppCoinsService(OkHttpClient okHttpClient, TokenInvalidator tokenInvalidator2, SharedPreferences sharedPreferences, BodyInterceptor<BaseBody> bodyInterceptor2, Converter.Factory factory, AppBundlesVisibilityManager appBundlesVisibilityManager2) {
        this.httpClient = okHttpClient;
        this.tokenInvalidator = tokenInvalidator2;
        this.preferences = sharedPreferences;
        this.bodyInterceptor = bodyInterceptor2;
        this.converterFactory = factory;
        this.appBundlesVisibilityManager = appBundlesVisibilityManager2;
    }

    /* access modifiers changed from: private */
    /* renamed from: mapAdvertising */
    public AppCoinsAdvertisingModel mo6821a(ListAppCoinsCampaigns listAppCoinsCampaigns) {
        List list = listAppCoinsCampaigns.getDataList().getList();
        if (list.isEmpty()) {
            return new AppCoinsAdvertisingModel();
        }
        return new AppCoinsAdvertisingModel(((AppCoinsCampaign) list.get(0)).getReward().getAppc(), true, ((AppCoinsCampaign) list.get(0)).getReward().getFiat().getAmount(), ((AppCoinsCampaign) list.get(0)).getReward().getFiat().getSymbol(), ((AppCoinsCampaign) list.get(0)).getBudget() != null ? ((AppCoinsCampaign) list.get(0)).getBudget().getAppc() : -1.0d, ((AppCoinsCampaign) list.get(0)).getEndDate() != null ? ((AppCoinsCampaign) list.get(0)).getEndDate() : "");
    }

    public Single<AppCoinsAdvertisingModel> getValidCampaign(String str, int i) {
        return new GetAppCoinsCampaignsRequest(new GetAppCoinsCampaignsRequest.Body(str, i), this.httpClient, this.converterFactory, this.bodyInterceptor, this.tokenInvalidator, this.preferences, this.appBundlesVisibilityManager).observe().mo18700m().mo18569d(new C1389c(this));
    }
}
