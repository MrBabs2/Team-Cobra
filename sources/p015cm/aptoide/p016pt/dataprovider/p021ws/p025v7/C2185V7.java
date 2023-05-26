package p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7;

import android.accounts.NetworkErrorException;
import android.content.SharedPreferences;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import p015cm.aptoide.p016pt.dataprovider.BuildConfig;
import p015cm.aptoide.p016pt.dataprovider.WebService;
import p015cm.aptoide.p016pt.dataprovider.exception.AptoideWsV7Exception;
import p015cm.aptoide.p016pt.dataprovider.exception.NoNetworkConnectionException;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.BaseV7Response;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.EditorialCard;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.GetApp;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.GetFollowers;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.GetMySubscribedStoresResponse;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.GetStoreWidgets;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.GetUserInfo;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.ListAppCoinsCampaigns;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.ListApps;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.ListComments;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.ListFullReviews;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.ListReviews;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.SetComment;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.TimelineStats;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.listapp.ListAppVersions;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.listapp.ListAppsUpdates;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.search.ListSearchApps;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.GetHome;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.GetHomeMeta;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.GetStore;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.GetStoreDisplays;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.GetStoreMeta;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.ListStores;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.RefreshBody;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.EditorialListRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.GetAppCoinsCampaignsRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.GetFollowersRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.GetMySubscribedStoresRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.GetTimelineStatsRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.GetUserInfoRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.ListCommentsRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.ListFullReviewsRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.ListReviewsRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.PostCommentForReview;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.PostReviewRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.SetReviewRatingRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.SetUserRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.SetUserSettings;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.SimpleSetStoreRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.analyticsbody.DownloadInstallAnalyticsBaseBody;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.home.ActionItemResponse;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.home.GetActionItemRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.home.GetHomeBundlesRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.listapps.ListAppVersionsRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.listapps.ListAppsUpdatesRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.promotions.ClaimPromotionRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.promotions.GetPackagePromotionsRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.promotions.GetPackagePromotionsResponse;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.promotions.GetPromotionAppsRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.promotions.GetPromotionAppsResponse;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.promotions.GetPromotionsRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.promotions.GetPromotionsResponse;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.ChangeStoreSubscriptionRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.GetHomeBody;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.GetHomeMetaRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.GetMyStoreListRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.GetRecommendedStoresRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.GetStoreBody;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.GetStoreDisplaysRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.GetStoreWidgetsRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.GetUserRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.ListStoresRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.PostCommentForStore;
import p015cm.aptoide.p016pt.dataprovider.util.HashMapNotNull;
import p015cm.aptoide.p016pt.dataprovider.util.ToRetryThrowable;
import p015cm.aptoide.p016pt.preferences.toolbox.ToolboxManager;
import p123rx.C5368e;
import p123rx.schedulers.Schedulers;
import retrofit2.Converter;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.HttpException;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.PartMap;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v7.V7 */
public abstract class C2185V7<U, B extends RefreshBody> extends WebService<Interfaces, U> {
    private final String INVALID_ACCESS_TOKEN_CODE = "AUTH-2";
    private final int MAX_RETRY_COUNT = 3;
    private boolean accessTokenRetry = false;
    protected final B body;
    protected final BodyInterceptor bodyInterceptor;
    private QueryStringMapper queryStringMapper;
    private final TokenInvalidator tokenInvalidator;

    /* renamed from: cm.aptoide.pt.dataprovider.ws.v7.V7$Interfaces */
    public interface Interfaces {
        @POST("user/addEvent/name={name}/action={action}/context={context}")
        C5368e<BaseV7Response> addEvent(@Path("name") String str, @Path("action") String str2, @Path("context") String str3, @Body BiUtmAnalyticsRequestBody biUtmAnalyticsRequestBody);

        @POST("user/addEvent/name={name}/action={action}/context={context}")
        C5368e<BaseV7Response> addEvent(@Path("name") String str, @Path("action") String str2, @Path("context") String str3, @Body DownloadInstallAnalyticsBaseBody downloadInstallAnalyticsBaseBody);

        @POST("store/subscription/set")
        C5368e<ChangeStoreSubscriptionResponse> changeStoreSubscription(@Header("X-Bypass-Cache") boolean z, @Body ChangeStoreSubscriptionRequest.Body body);

        @POST("appcoins/promotions/claim")
        C5368e<BaseV7Response> claimPromotion(@Body ClaimPromotionRequest.Body body, @Header("X-Bypass-Cache") boolean z);

        @POST("store/set")
        C5368e<BaseV7Response> editStore(@Body SimpleSetStoreRequest.Body body);

        @POST("store/set")
        @Multipart
        C5368e<BaseV7Response> editStore(@Part MultipartBody.Part part, @PartMap HashMapNotNull<String, RequestBody> hashMapNotNull);

        @POST("user/set")
        @Multipart
        C5368e<BaseV7Response> editUser(@Part MultipartBody.Part part, @PartMap HashMapNotNull<String, RequestBody> hashMapNotNull);

        @POST("{url}")
        C5368e<ActionItemResponse> getActionItem(@Path(encoded = true, value = "url") String str, @Body GetActionItemRequest.Body body, @Header("X-Bypass-Cache") boolean z);

        @GET("getApp")
        C5368e<GetApp> getApp(@Header("Cache-Control") String str, @QueryMap(encoded = true) Map<String, String> map);

        @POST("appcoins/catappult/campaigns/get/limit={limit}")
        C5368e<ListAppCoinsCampaigns> getAppCoinsAds(@Body GetAppCoinsCampaignsRequest.Body body, @Header("X-Bypass-Cache") boolean z, @Path("limit") int i, @Query("aab") boolean z2);

        @GET("getApp/{url}")
        C5368e<GetApp> getAppMeta(@Header("X-Bypass-Cache") boolean z, @Path(encoded = true, value = "url") String str);

        @POST("user/action/item/card/get/id={cardId}")
        C5368e<EditorialCard> getEditorialFromCardId(@Path("cardId") String str, @Body BaseBody baseBody, @Query("aab") boolean z);

        @POST("user/action/item/card/get/slug={slug}")
        C5368e<EditorialCard> getEditorialFromSlug(@Path("slug") String str, @Body BaseBody baseBody, @Query("aab") boolean z);

        @POST("user/action/item/cards/get/type=CURATION_1/limit={limit}")
        C5368e<EditorialListResponse> getEditorialList(@Path("limit") int i, @Body EditorialListRequest.Body body);

        @POST("listApps/{url}")
        C5368e<ListApps> getEskillsApps(@Header("X-Bypass-Cache") boolean z, @Path(encoded = true, value = "url") String str, @Query("aab") boolean z2);

        @POST("home/get")
        C5368e<GetHome> getHome(@Body GetHomeBody getHomeBody, @Header("X-Bypass-Cache") boolean z);

        @POST("getStoreWidgets/")
        C5368e<GetStoreWidgets> getHomeBundles(@Body GetHomeBundlesRequest.Body body, @Header("X-Bypass-Cache") boolean z);

        @POST("home/getMeta{url}")
        C5368e<GetHomeMeta> getHomeMeta(@Path(encoded = true, value = "url") String str, @Body GetHomeMetaRequest.Body body, @Header("X-Bypass-Cache") boolean z);

        @POST("my/stores/getSubscribed")
        C5368e<ListStores> getMyStoreList(@Body GetMyStoreListRequest.Body body, @Header("X-Bypass-Cache") boolean z);

        @POST("{url}")
        C5368e<ListStores> getMyStoreList(@Path(encoded = true, value = "url") String str, @Body GetMyStoreListRequest.Body body, @Header("X-Bypass-Cache") boolean z);

        @POST("{url}")
        C5368e<ListStores> getMyStoreListEndless(@Path(encoded = true, value = "url") String str, @Body GetMyStoreListRequest.EndlessBody endlessBody, @Header("X-Bypass-Cache") boolean z);

        @POST("my/store/getMeta")
        C5368e<GetStoreMeta> getMyStoreMeta(@Body BaseBody baseBody, @Header("X-Bypass-Cache") boolean z);

        @POST("my/stores/getSubscribed/")
        C5368e<GetMySubscribedStoresResponse> getMySubscribedStores(@Header("X-Bypass-Cache") boolean z, @Body GetMySubscribedStoresRequest.Body body);

        @POST("appcoins/promotions/promotion/get/limit={limit}")
        C5368e<GetPromotionAppsResponse> getPromotionApps(@Path("limit") int i, @Body GetPromotionAppsRequest.Body body, @Header("X-Bypass-Cache") boolean z, @Query("aab") boolean z2);

        @POST("appcoins/promotions/get")
        C5368e<GetPromotionsResponse> getPromotions(@Body GetPromotionsRequest.Body body, @Header("X-Bypass-Cache") boolean z, @Query("aab") boolean z2);

        @POST("appcoins/promotions/packages/getPromotions")
        C5368e<GetPackagePromotionsResponse> getPromotionsForPackage(@Body GetPackagePromotionsRequest.Body body, @Header("X-Bypass-Cache") boolean z);

        @GET("apps/getRecommended")
        C5368e<ListApps> getRecommended(@Header("Cache-Control") String str, @QueryMap(encoded = true) Map<String, String> map);

        @POST("{url}")
        C5368e<ListStores> getRecommendedStore(@Path(encoded = true, value = "url") String str, @Body GetRecommendedStoresRequest.EndlessBody endlessBody, @Header("X-Bypass-Cache") boolean z);

        @POST("getStore{url}")
        C5368e<GetStore> getStore(@Path(encoded = true, value = "url") String str, @Body GetStoreBody getStoreBody, @Header("X-Bypass-Cache") boolean z);

        @POST("getStoreDisplays{url}")
        C5368e<GetStoreDisplays> getStoreDisplays(@Path(encoded = true, value = "url") String str, @Body GetStoreDisplaysRequest.Body body, @Header("X-Bypass-Cache") boolean z);

        @POST("store/getMeta")
        C5368e<GetStoreMeta> getStoreMeta(@Body GetHomeMetaRequest.Body body, @Header("X-Bypass-Cache") boolean z);

        @POST("{url}")
        C5368e<GetStoreMeta> getStoreMeta(@Path(encoded = true, value = "url") String str, @Body GetHomeMetaRequest.Body body, @Header("X-Bypass-Cache") boolean z);

        @POST("getStoreWidgets{url}")
        C5368e<GetStoreWidgets> getStoreWidgets(@Path(encoded = true, value = "url") String str, @Body GetStoreWidgetsRequest.Body body, @Header("X-Bypass-Cache") boolean z);

        @POST("user/getFollowers")
        C5368e<GetFollowers> getTimelineFollowers(@Body GetFollowersRequest.Body body, @Header("X-Bypass-Cache") boolean z);

        @POST("user/getFollowing")
        C5368e<GetFollowers> getTimelineGetFollowing(@Body GetFollowersRequest.Body body, @Header("X-Bypass-Cache") boolean z);

        @POST("user/getTimelineStats")
        C5368e<TimelineStats> getTimelineStats(@Body GetTimelineStatsRequest.Body body, @Header("X-Bypass-Cache") boolean z);

        @POST("user/get{url}")
        C5368e<GetStore> getUser(@Path(encoded = true, value = "url") String str, @Body GetUserRequest.Body body, @Header("X-Bypass-Cache") boolean z);

        @POST("user/get")
        C5368e<GetUserInfo> getUserInfo(@Body GetUserInfoRequest.Body body, @Header("X-Bypass-Cache") boolean z);

        @POST("listAppVersions")
        C5368e<ListAppVersions> listAppVersions(@Body ListAppVersionsRequest.Body body, @Header("X-Bypass-Cache") boolean z, @Query("aab") boolean z2);

        @GET("listApps{url}")
        C5368e<ListApps> listApps(@Path(encoded = true, value = "url") String str, @Header("Cache-Control") String str2, @QueryMap(encoded = true) Map<String, String> map);

        @POST("listAppsUpdates")
        C5368e<ListAppsUpdates> listAppsUpdates(@Body ListAppsUpdatesRequest.Body body, @Header("X-Bypass-Cache") boolean z, @Query("aab") boolean z2);

        @POST("listComments")
        C5368e<ListComments> listComments(@Body ListCommentsRequest.Body body, @Header("X-Bypass-Cache") boolean z);

        @POST
        C5368e<ListComments> listComments(@Url String str, @Body ListCommentsRequest.Body body, @Header("X-Bypass-Cache") boolean z);

        @POST("listFullReviews")
        C5368e<ListFullReviews> listFullReviews(@Body ListFullReviewsRequest.Body body, @Header("X-Bypass-Cache") boolean z);

        @POST("listFullReviews{url}")
        C5368e<ListFullReviews> listFullReviews(@Path(encoded = true, value = "url") String str, @Body ListFullReviewsRequest.Body body, @Header("X-Bypass-Cache") boolean z);

        @POST("listReviews")
        C5368e<ListReviews> listReviews(@Body ListReviewsRequest.Body body, @Header("X-Bypass-Cache") boolean z);

        @GET("listSearchApps")
        C5368e<ListSearchApps> listSearchApps(@Header("Cache-Control") String str, @QueryMap(encoded = true) Map<String, String> map);

        @POST("listStores{url}")
        C5368e<ListStores> listStores(@Path(encoded = true, value = "url") String str, @Body ListStoresRequest.Body body, @Header("X-Bypass-Cache") boolean z);

        @POST("listStores/sort/{sort}/limit/{limit}")
        C5368e<ListStores> listTopStores(@Path(encoded = true, value = "sort") String str, @Path(encoded = true, value = "limit") int i, @Body ListStoresRequest.Body body, @Header("X-Bypass-Cache") boolean z);

        @POST("setReview")
        C5368e<BaseV7Response> postReview(@Body PostReviewRequest.Body body, @Header("X-Bypass-Cache") boolean z);

        @POST("setComment")
        C5368e<BaseV7Response> postReviewComment(@Body PostCommentForReview.Body body, @Header("X-Bypass-Cache") boolean z);

        @POST("setComment")
        C5368e<SetComment> postStoreComment(@Body PostCommentForStore.Body body, @Header("X-Bypass-Cache") boolean z);

        @POST("review/set/access_token={accessToken}/card_uid={cardUid}/rating={rating}")
        C5368e<BaseV7Response> setReview(@Body BaseBody baseBody, @Path("cardUid") String str, @Path("accessToken") String str2, @Path("rating") String str3, @Header("X-Bypass-Cache") boolean z);

        @POST("setReviewVote")
        C5368e<BaseV7Response> setReviewVote(@Body SetReviewRatingRequest.Body body, @Header("X-Bypass-Cache") boolean z);

        @POST("user/set")
        C5368e<BaseV7Response> setUser(@Body SetUserRequest.Body body);

        @POST("user/settings/set")
        C5368e<BaseV7Response> setUserSettings(@Body SetUserSettings.Body body);
    }

    protected C2185V7(B b, String str, OkHttpClient okHttpClient, Converter.Factory factory, BodyInterceptor bodyInterceptor2, TokenInvalidator tokenInvalidator2) {
        super(Interfaces.class, okHttpClient, factory, str);
        this.body = b;
        this.bodyInterceptor = bodyInterceptor2;
        this.tokenInvalidator = tokenInvalidator2;
    }

    public static String getErrorMessage(BaseV7Response baseV7Response) {
        StringBuilder sb = new StringBuilder();
        if (baseV7Response == null || baseV7Response.getErrors() == null) {
            sb.append("Server returned null response.");
        } else {
            for (BaseV7Response.Error description : baseV7Response.getErrors()) {
                sb.append(description.getDescription());
                sb.append(". ");
            }
            if (sb.length() == 0) {
                sb.append("Server failed with empty error list.");
            }
        }
        return sb.toString();
    }

    public static String getHost(SharedPreferences sharedPreferences) {
        StringBuilder sb = new StringBuilder();
        sb.append(ToolboxManager.isToolboxEnableHttpScheme(sharedPreferences) ? "http" : BuildConfig.APTOIDE_WEB_SERVICES_SCHEME);
        sb.append("://");
        sb.append(BuildConfig.APTOIDE_WEB_SERVICES_V7_HOST);
        sb.append("/api/7/");
        return sb.toString();
    }

    private C5368e<U> handleToken(C5368e<U> eVar, boolean z) {
        return eVar.mo18697k(new C2199e(this, z));
    }

    private C5368e<U> retryOnTicket(C5368e<U> eVar) {
        return eVar.mo18662b(Schedulers.m10352io()).mo18687f(new C2205g(this)).mo18701m(new C2193c(this));
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo10199a(Object obj) {
        BaseV7Response baseV7Response;
        if (obj instanceof Response) {
            Response response = (Response) obj;
            if (response.isSuccessful()) {
                baseV7Response = (BaseV7Response) response.body();
            } else {
                try {
                    BaseV7Response convert = this.retrofit.responseBodyConverter(BaseV7Response.class, new Annotation[0]).convert(((Response) obj).errorBody());
                    if (response.code() == 401) {
                        AptoideWsV7Exception aptoideWsV7Exception = new AptoideWsV7Exception();
                        aptoideWsV7Exception.setBaseResponse(convert);
                        return C5368e.m10238a((Throwable) aptoideWsV7Exception);
                    }
                    baseV7Response = convert;
                } catch (IOException e) {
                    return C5368e.m10238a((Throwable) e);
                }
            }
        } else {
            baseV7Response = (BaseV7Response) obj;
        }
        if (baseV7Response.getInfo() == null || !BaseV7Response.Info.Status.QUEUED.equals(baseV7Response.getInfo().getStatus())) {
            return C5368e.m10257c(obj);
        }
        return C5368e.m10238a((Throwable) new ToRetryThrowable());
    }

    /* renamed from: b */
    public /* synthetic */ Object mo10202b(boolean z, Object obj) {
        return handleToken(retryOnTicket(super.observe(z)), z);
    }

    public B getBody() {
        return this.body;
    }

    /* access modifiers changed from: protected */
    public QueryStringMapper getQueryStringMapper() {
        if (this.queryStringMapper == null) {
            this.queryStringMapper = new QueryStringMapper();
        }
        return this.queryStringMapper;
    }

    /* access modifiers changed from: protected */
    public TokenInvalidator getTokenInvalidator() {
        return this.tokenInvalidator;
    }

    public C5368e<U> observe(boolean z, boolean z2) {
        B b = this.body;
        if (b != null) {
            b.setRefresh(z2);
        }
        return observe(z);
    }

    public C5368e<U> observe(boolean z) {
        B b = this.body;
        if (b == null) {
            return handleToken(retryOnTicket(super.observe(z)), z);
        }
        return this.bodyInterceptor.intercept(b).mo18568c(new C2196d(this, z));
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo10200a(C5368e eVar) {
        return eVar.mo18643a(C5368e.m10231a(1, 3), new C2202f(this)).mo18658b(500, TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    public /* synthetic */ Object mo10198a(Throwable th, Integer num) {
        if ((th instanceof ToRetryThrowable) && num.intValue() < 3) {
            return null;
        }
        if (isNoNetworkException(th)) {
            throw new NoNetworkConnectionException(th);
        } else if (th instanceof AptoideWsV7Exception) {
            throw ((AptoideWsV7Exception) th);
        } else if (th instanceof HttpException) {
            try {
                AptoideWsV7Exception aptoideWsV7Exception = new AptoideWsV7Exception(th);
                aptoideWsV7Exception.setBaseResponse((BaseV7Response) this.converterFactory.responseBodyConverter(BaseV7Response.class, (Annotation[]) null, (Retrofit) null).convert(((HttpException) th).response().errorBody()));
                throw aptoideWsV7Exception;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            throw new RuntimeException(th);
        }
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo10201a(boolean z, Throwable th) {
        if (!(th instanceof AptoideWsV7Exception)) {
            return C5368e.m10238a(th);
        }
        if (!"AUTH-2".equals(((AptoideWsV7Exception) th).getBaseResponse().getError().getCode())) {
            return C5368e.m10238a(th);
        }
        if (this.accessTokenRetry) {
            return C5368e.m10238a((Throwable) new NetworkErrorException());
        }
        this.accessTokenRetry = true;
        return this.tokenInvalidator.invalidateAccessToken().mo18585a(500, TimeUnit.MILLISECONDS).mo18593a(observe(z));
    }
}
