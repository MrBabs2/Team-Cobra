package p015cm.aptoide.p016pt.repository.request;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.dataprovider.aab.AppBundlesVisibilityManager;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.AppCoinsCampaign;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.DataList;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.ListAppCoinsCampaigns;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.GetAppCoinsCampaignsRequest;
import p015cm.aptoide.p016pt.home.bundles.apps.RewardApp;
import p015cm.aptoide.p016pt.install.InstallManager;
import p123rx.C5368e;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.repository.request.RewardAppCoinsAppsRepository */
public class RewardAppCoinsAppsRepository {
    private static final int APPCOINS_REWARD_LIMIT = 50;
    private AppBundlesVisibilityManager appBundlesVisibilityManager;
    private BodyInterceptor<BaseBody> bodyInterceptor;
    private Converter.Factory converterFactory;
    private OkHttpClient httpClient;
    private InstallManager installManager;
    private int next = 0;
    private SharedPreferences sharedPreferences;
    private TokenInvalidator tokenInvalidator;
    private int total = 0;

    public RewardAppCoinsAppsRepository(OkHttpClient okHttpClient, Converter.Factory factory, BodyInterceptor<BaseBody> bodyInterceptor2, TokenInvalidator tokenInvalidator2, SharedPreferences sharedPreferences2, InstallManager installManager2, AppBundlesVisibilityManager appBundlesVisibilityManager2) {
        this.httpClient = okHttpClient;
        this.converterFactory = factory;
        this.bodyInterceptor = bodyInterceptor2;
        this.tokenInvalidator = tokenInvalidator2;
        this.sharedPreferences = sharedPreferences2;
        this.installManager = installManager2;
        this.appBundlesVisibilityManager = appBundlesVisibilityManager2;
    }

    private C5368e<List<RewardApp>> map(DataList<AppCoinsCampaign> dataList, String str) {
        this.total = dataList.getTotal();
        this.next = dataList.getNext();
        ArrayList arrayList = new ArrayList();
        for (AppCoinsCampaign next2 : dataList.getList()) {
            AppCoinsCampaign.CampaignApp app = next2.getApp();
            if (!this.installManager.wasAppEverInstalled(app.getPackageName())) {
                arrayList.add(new RewardApp(app.getName(), app.getIcon(), app.getStats().getRating().getAvg(), app.getStats().getPdownloads(), app.getPackageName(), app.getId(), str, app.getAppcoins() != null, app.getAppcoins().getClicks().getClick(), app.getAppcoins().getClicks().getInstall(), mapReward(next2.getReward()), app.getGraphic()));
            }
        }
        return C5368e.m10257c(arrayList);
    }

    private RewardApp.Reward mapReward(AppCoinsCampaign.Reward reward) {
        AppCoinsCampaign.Fiat fiat = reward.getFiat();
        return new RewardApp.Reward(reward.getAppc(), new RewardApp.Fiat(fiat.getAmount(), fiat.getCurrency(), fiat.getSymbol()));
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo13990a(String str, ListAppCoinsCampaigns listAppCoinsCampaigns) {
        return map(listAppCoinsCampaigns.getDataList(), str);
    }

    /* renamed from: b */
    public /* synthetic */ C5368e mo13991b(String str, ListAppCoinsCampaigns listAppCoinsCampaigns) {
        return map(listAppCoinsCampaigns.getDataList(), str);
    }

    public C5368e<List<RewardApp>> getFreshAppCoinsRewardAppsFromHomeMore(String str) {
        return new GetAppCoinsCampaignsRequest(new GetAppCoinsCampaignsRequest.Body(0, 50), this.httpClient, this.converterFactory, this.bodyInterceptor, this.tokenInvalidator, this.sharedPreferences, this.appBundlesVisibilityManager).observe(true).mo18687f(new C3957a(this, str));
    }

    public C5368e<List<RewardApp>> getNextAppCoinsRewardAppsFromHomeMore(String str) {
        int i = this.next;
        if (i >= this.total) {
            return C5368e.m10257c(Collections.emptyList());
        }
        return new GetAppCoinsCampaignsRequest(new GetAppCoinsCampaignsRequest.Body(i, 50), this.httpClient, this.converterFactory, this.bodyInterceptor, this.tokenInvalidator, this.sharedPreferences, this.appBundlesVisibilityManager).observe(false).mo18687f(new C3958b(this, str));
    }
}
