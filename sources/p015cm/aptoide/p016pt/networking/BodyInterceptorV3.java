package p015cm.aptoide.p016pt.networking;

import android.content.SharedPreferences;
import android.text.TextUtils;
import p015cm.aptoide.p016pt.dataprovider.NetworkOperatorManager;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p024v3.BaseBody;
import p015cm.aptoide.p016pt.preferences.AptoideMd5Manager;
import p015cm.aptoide.p016pt.preferences.managed.ManagerPreferences;
import p015cm.aptoide.p016pt.preferences.toolbox.ToolboxManager;
import p015cm.aptoide.p016pt.utils.p030q.QManager;
import p123rx.Single;
import p123rx.schedulers.Schedulers;

/* renamed from: cm.aptoide.pt.networking.BodyInterceptorV3 */
public class BodyInterceptorV3 implements BodyInterceptor<BaseBody> {
    public static final String RESPONSE_MODE_JSON = "json";
    private final int androidVersion;
    private final AptoideMd5Manager aptoideMd5Manager;
    private final String aptoidePackage;
    private final AuthenticationPersistence authenticationPersistence;
    private final IdsRepository idsRepository;
    private final NetworkOperatorManager operatorManager;
    private final QManager qManager;
    private final String responseMode;
    private final SharedPreferences sharedPreferences;

    public BodyInterceptorV3(IdsRepository idsRepository2, AptoideMd5Manager aptoideMd5Manager2, String str, QManager qManager2, SharedPreferences sharedPreferences2, String str2, int i, NetworkOperatorManager networkOperatorManager, AuthenticationPersistence authenticationPersistence2) {
        this.idsRepository = idsRepository2;
        this.aptoideMd5Manager = aptoideMd5Manager2;
        this.aptoidePackage = str;
        this.authenticationPersistence = authenticationPersistence2;
        this.qManager = qManager2;
        this.sharedPreferences = sharedPreferences2;
        this.responseMode = str2;
        this.androidVersion = i;
        this.operatorManager = networkOperatorManager;
    }

    /* renamed from: a */
    public /* synthetic */ Single mo13048a(BaseBody baseBody, Authentication authentication) {
        return this.idsRepository.getUniqueIdentifier().mo18569d(new C3435f(this, baseBody, authentication));
    }

    public Single<BaseBody> intercept(BaseBody baseBody) {
        return this.authenticationPersistence.getAuthentication().mo18559a(new C3434e(this, baseBody)).mo18563b(Schedulers.computation());
    }

    /* renamed from: a */
    public /* synthetic */ BaseBody mo13047a(BaseBody baseBody, Authentication authentication, String str) {
        baseBody.setAndroidVersion(this.androidVersion);
        String aptoideMd5 = this.aptoideMd5Manager.getAptoideMd5();
        if (!aptoideMd5.isEmpty()) {
            baseBody.setAptoideMd5sum(aptoideMd5);
        }
        baseBody.setAptoidePackage(this.aptoidePackage);
        baseBody.setAptoideUid(str);
        baseBody.setQ(this.qManager.getFilters(ManagerPreferences.getHWSpecsFilter(this.sharedPreferences)));
        baseBody.setResponseMode(this.responseMode);
        if (authentication.isAuthenticated()) {
            baseBody.setAccessToken(authentication.getAccessToken());
        }
        String forceCountry = ToolboxManager.getForceCountry(this.sharedPreferences);
        if (!TextUtils.isEmpty(forceCountry)) {
            baseBody.setSimCountryISOCode(forceCountry);
        } else if (this.operatorManager.isSimStateReady()) {
            baseBody.setMobileCountryCode(this.operatorManager.getMobileCountryCode());
            baseBody.setMobileNetworkCode(this.operatorManager.getMobileNetworkCode());
            baseBody.setSimCountryISOCode(this.operatorManager.getSimCountryISO());
        }
        return baseBody;
    }
}
