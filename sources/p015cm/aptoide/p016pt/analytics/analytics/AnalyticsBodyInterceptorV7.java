package p015cm.aptoide.p016pt.analytics.analytics;

import android.content.SharedPreferences;
import android.content.res.Resources;
import p015cm.aptoide.analytics.implementation.network.AnalyticsBaseBody;
import p015cm.aptoide.analytics.implementation.network.AnalyticsBodyInterceptor;
import p015cm.aptoide.p016pt.networking.Authentication;
import p015cm.aptoide.p016pt.networking.AuthenticationPersistence;
import p015cm.aptoide.p016pt.networking.IdsRepository;
import p015cm.aptoide.p016pt.preferences.AptoideMd5Manager;
import p015cm.aptoide.p016pt.preferences.managed.ManagerPreferences;
import p015cm.aptoide.p016pt.utils.AptoideUtils;
import p015cm.aptoide.p016pt.utils.p030q.QManager;
import p123rx.Single;
import p123rx.schedulers.Schedulers;

/* renamed from: cm.aptoide.pt.analytics.analytics.AnalyticsBodyInterceptorV7 */
public class AnalyticsBodyInterceptorV7 implements AnalyticsBodyInterceptor<AnalyticsBaseBody> {
    private final AptoideMd5Manager aptoideMd5Manager;
    private final String aptoidePackage;
    private final int aptoideVersionCode;
    private final AuthenticationPersistence authenticationPersistence;
    private final IdsRepository idsRepository;
    private final QManager qManager;
    private final Resources resources;
    private final SharedPreferences sharedPreferences;

    public AnalyticsBodyInterceptorV7(IdsRepository idsRepository2, AuthenticationPersistence authenticationPersistence2, AptoideMd5Manager aptoideMd5Manager2, String str, Resources resources2, int i, QManager qManager2, SharedPreferences sharedPreferences2) {
        this.idsRepository = idsRepository2;
        this.authenticationPersistence = authenticationPersistence2;
        this.aptoideMd5Manager = aptoideMd5Manager2;
        this.aptoidePackage = str;
        this.resources = resources2;
        this.aptoideVersionCode = i;
        this.qManager = qManager2;
        this.sharedPreferences = sharedPreferences2;
    }

    /* renamed from: a */
    public /* synthetic */ Single mo6794a(AnalyticsBaseBody analyticsBaseBody, Authentication authentication) {
        return this.idsRepository.getUniqueIdentifier().mo18569d(new C1374b(this, authentication, analyticsBaseBody));
    }

    public Single<AnalyticsBaseBody> intercept(AnalyticsBaseBody analyticsBaseBody) {
        return this.authenticationPersistence.getAuthentication().mo18559a(new C1373a(this, analyticsBaseBody)).mo18563b(Schedulers.computation());
    }

    /* renamed from: a */
    public /* synthetic */ AnalyticsBaseBody mo6793a(Authentication authentication, AnalyticsBaseBody analyticsBaseBody, String str) {
        if (authentication.isAuthenticated()) {
            analyticsBaseBody.setAccessToken(authentication.getAccessToken());
        }
        analyticsBaseBody.setAptoideUid(str);
        analyticsBaseBody.setAptoideVercode(this.aptoideVersionCode);
        analyticsBaseBody.setLang(AptoideUtils.SystemU.getCountryCode(this.resources));
        analyticsBaseBody.setQ(this.qManager.getFilters(ManagerPreferences.getHWSpecsFilter(this.sharedPreferences)));
        String aptoideMd5 = this.aptoideMd5Manager.getAptoideMd5();
        if (!aptoideMd5.isEmpty()) {
            analyticsBaseBody.setAptoideMd5sum(aptoideMd5);
        }
        analyticsBaseBody.setAptoidePackage(this.aptoidePackage);
        return analyticsBaseBody;
    }
}
