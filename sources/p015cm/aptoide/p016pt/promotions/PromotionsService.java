package p015cm.aptoide.p016pt.promotions;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.aab.Split;
import p015cm.aptoide.p016pt.aab.SplitsMapper;
import p015cm.aptoide.p016pt.dataprovider.aab.AppBundlesVisibilityManager;
import p015cm.aptoide.p016pt.dataprovider.exception.AptoideWsV7Exception;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.BaseV7Response;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Obb;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.promotions.ClaimPromotionRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.promotions.GetPackagePromotionsRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.promotions.GetPackagePromotionsResponse;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.promotions.GetPromotionAppsRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.promotions.GetPromotionAppsResponse;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.promotions.GetPromotionsRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.promotions.GetPromotionsResponse;
import p015cm.aptoide.p016pt.promotions.ClaimStatusWrapper;
import p123rx.Single;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.promotions.PromotionsService */
public class PromotionsService {
    private static final String ALREADY_CLAIMED = "PROMOTION-3";
    private static final String WALLET_NOT_VERIFIED = "PROMOTION-5";
    private static final String WRONG_ADDRESS = "PROMOTION-2";
    private final AppBundlesVisibilityManager appBundlesVisibilityManager;
    private final BodyInterceptor<BaseBody> bodyInterceptorPoolV7;
    private final Converter.Factory converterFactory;
    private final OkHttpClient okHttpClient;
    private final SharedPreferences sharedPreferences;
    private final SplitsMapper splitsMapper;
    private final TokenInvalidator tokenInvalidator;
    private String walletAddress;

    public PromotionsService(BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient2, TokenInvalidator tokenInvalidator2, Converter.Factory factory, SharedPreferences sharedPreferences2, SplitsMapper splitsMapper2, AppBundlesVisibilityManager appBundlesVisibilityManager2) {
        this.bodyInterceptorPoolV7 = bodyInterceptor;
        this.okHttpClient = okHttpClient2;
        this.tokenInvalidator = tokenInvalidator2;
        this.converterFactory = factory;
        this.sharedPreferences = sharedPreferences2;
        this.splitsMapper = splitsMapper2;
        this.appBundlesVisibilityManager = appBundlesVisibilityManager2;
    }

    /* access modifiers changed from: private */
    /* renamed from: map */
    public List<PromotionMeta> mo13822a(GetPromotionsResponse getPromotionsResponse) {
        ArrayList arrayList = new ArrayList();
        if (!(getPromotionsResponse.getDataList() == null || getPromotionsResponse.getDataList().getList() == null)) {
            for (GetPromotionsResponse.PromotionModel promotionModel : getPromotionsResponse.getDataList().getList()) {
                arrayList.add(new PromotionMeta(promotionModel.getTitle(), promotionModel.getPromotionId(), promotionModel.getType(), promotionModel.getBackground(), promotionModel.getDialogDescription(), promotionModel.getDescription()));
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public ClaimStatusWrapper mapClaim(BaseV7Response baseV7Response) {
        return new ClaimStatusWrapper(mapStatus(baseV7Response.getInfo().getStatus()), mapError(baseV7Response.getErrors()));
    }

    private List<ClaimStatusWrapper.Error> mapError(List<BaseV7Response.Error> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (BaseV7Response.Error next : list) {
                if (next.getCode().equals(WRONG_ADDRESS)) {
                    arrayList.add(ClaimStatusWrapper.Error.WRONG_ADDRESS);
                } else if (next.getCode().equals(ALREADY_CLAIMED)) {
                    arrayList.add(ClaimStatusWrapper.Error.PROMOTION_CLAIMED);
                } else if (next.getCode().equals(WALLET_NOT_VERIFIED)) {
                    arrayList.add(ClaimStatusWrapper.Error.WALLET_NOT_VERIFIED);
                } else {
                    arrayList.add(ClaimStatusWrapper.Error.GENERIC);
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public List<PromotionApp> mapPromotionsResponse(GetPromotionAppsResponse getPromotionAppsResponse) {
        Iterator it;
        List<Split> list;
        ArrayList arrayList = new ArrayList();
        if (!(getPromotionAppsResponse == null || getPromotionAppsResponse.getDataList() == null || getPromotionAppsResponse.getDataList().getList() == null)) {
            for (Iterator it2 = getPromotionAppsResponse.getDataList().getList().iterator(); it2.hasNext(); it2 = it) {
                GetPromotionAppsResponse.PromotionAppModel promotionAppModel = (GetPromotionAppsResponse.PromotionAppModel) it2.next();
                String name = promotionAppModel.getApp().getName();
                String packageName = promotionAppModel.getApp().getPackageName();
                long id = promotionAppModel.getApp().getId();
                String path = promotionAppModel.getApp().getFile().getPath();
                String pathAlt = promotionAppModel.getApp().getFile().getPathAlt();
                String icon = promotionAppModel.getApp().getIcon();
                String promotionDescription = promotionAppModel.getPromotionDescription();
                long size = promotionAppModel.getApp().getSize();
                float avg = promotionAppModel.getApp().getStats().getRating().getAvg();
                int downloads = promotionAppModel.getApp().getStats().getDownloads();
                String md5sum = promotionAppModel.getApp().getFile().getMd5sum();
                int vercode = promotionAppModel.getApp().getFile().getVercode();
                boolean isClaimed = promotionAppModel.isClaimed();
                String vername = promotionAppModel.getApp().getFile().getVername();
                Obb obb = promotionAppModel.getApp().getObb();
                float appc = promotionAppModel.getAppc();
                String sha1 = promotionAppModel.getApp().getFile().getSignature().getSha1();
                boolean z = promotionAppModel.getApp().hasAdvertising() || promotionAppModel.getApp().hasBilling();
                if (promotionAppModel.getApp().hasSplits()) {
                    it = it2;
                    list = this.splitsMapper.mapSplits(promotionAppModel.getApp().getAab().getSplits());
                } else {
                    it = it2;
                    list = Collections.emptyList();
                }
                List<String> requiredSplits = promotionAppModel.getApp().hasSplits() ? promotionAppModel.getApp().getAab().getRequiredSplits() : Collections.emptyList();
                String str = promotionAppModel.getApp().getFile().getMalware().getRank().toString();
                String name2 = promotionAppModel.getApp().getStore().getName();
                double amount = promotionAppModel.getFiat().getAmount();
                String symbol = promotionAppModel.getFiat().getSymbol();
                PromotionApp promotionApp = r3;
                PromotionApp promotionApp2 = new PromotionApp(name, packageName, id, path, pathAlt, icon, promotionDescription, size, avg, downloads, md5sum, vercode, isClaimed, vername, obb, appc, sha1, z, list, requiredSplits, str, name2, amount, symbol);
                arrayList.add(promotionApp);
            }
        }
        return arrayList;
    }

    private ClaimStatusWrapper.Status mapStatus(BaseV7Response.Info.Status status) {
        if (status.equals(BaseV7Response.Info.Status.OK)) {
            return ClaimStatusWrapper.Status.OK;
        }
        return ClaimStatusWrapper.Status.FAIL;
    }

    /* access modifiers changed from: private */
    public List<Promotion> mapToPromotion(GetPackagePromotionsResponse getPackagePromotionsResponse) {
        ArrayList arrayList = new ArrayList();
        if (!(getPackagePromotionsResponse == null || getPackagePromotionsResponse.getDataList() == null || getPackagePromotionsResponse.getDataList().getList() == null)) {
            for (GetPackagePromotionsResponse.PromotionAppModel promotionAppModel : getPackagePromotionsResponse.getDataList().getList()) {
                arrayList.add(new Promotion(promotionAppModel.isClaimed(), promotionAppModel.getAppc(), promotionAppModel.getPackageName(), promotionAppModel.getPromotionId(), Collections.emptyList()));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public /* synthetic */ ClaimStatusWrapper mo13821a(Throwable th) {
        if (th instanceof AptoideWsV7Exception) {
            return mapClaim(((AptoideWsV7Exception) th).getBaseResponse());
        }
        throw new RuntimeException(th);
    }

    public Single<ClaimStatusWrapper> claimPromotion(String str, String str2, String str3) {
        return ClaimPromotionRequest.m5356of(str, str2, str3, this.bodyInterceptorPoolV7, this.okHttpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences).observe(true).mo18694j(new C3903u6(this)).mo18699l(new C3927x6(this)).mo18700m();
    }

    public Single<List<PromotionApp>> getPromotionApps(String str) {
        return GetPromotionAppsRequest.m5358of(str, this.bodyInterceptorPoolV7, this.okHttpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences, this.appBundlesVisibilityManager).observe(false, false).mo18694j(new C3919w6(this)).mo18700m();
    }

    public Single<List<PromotionMeta>> getPromotions(String str) {
        return GetPromotionsRequest.m5359of(str, this.bodyInterceptorPoolV7, this.okHttpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences, this.appBundlesVisibilityManager).observe().mo18694j(new C3935y6(this)).mo18700m();
    }

    public Single<List<Promotion>> getPromotionsForPackage(String str) {
        return GetPackagePromotionsRequest.m5357of(str, this.bodyInterceptorPoolV7, this.okHttpClient, this.converterFactory, this.tokenInvalidator, this.sharedPreferences).observe(false, false).mo18694j(new C3911v6(this)).mo18700m();
    }

    public String getWalletAddress() {
        return this.walletAddress;
    }

    public void saveWalletAddress(String str) {
        this.walletAddress = str;
    }

    private List<Split> map(List<p015cm.aptoide.p016pt.dataprovider.model.p020v7.Split> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        for (p015cm.aptoide.p016pt.dataprovider.model.p020v7.Split next : list) {
            arrayList.add(new Split(next.getName(), next.getType(), next.getPath(), next.getFilesize(), next.getMd5sum()));
        }
        return arrayList;
    }
}
