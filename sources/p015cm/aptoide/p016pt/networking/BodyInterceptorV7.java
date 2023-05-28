package p015cm.aptoide.p016pt.networking;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.text.TextUtils;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p015cm.aptoide.p016pt.preferences.AptoideMd5Manager;
import p015cm.aptoide.p016pt.preferences.managed.ManagerPreferences;
import p015cm.aptoide.p016pt.preferences.toolbox.ToolboxManager;
import p015cm.aptoide.p016pt.utils.AptoideUtils;
import p015cm.aptoide.p016pt.utils.p030q.QManager;
import p123rx.Single;
import p123rx.schedulers.Schedulers;

/* renamed from: cm.aptoide.pt.networking.BodyInterceptorV7 */
public class BodyInterceptorV7 implements BodyInterceptor<BaseBody> {
    private final AptoideMd5Manager aptoideMd5Manager;
    private final String aptoidePackage;
    private final int aptoideVersionCode;
    private final AuthenticationPersistence authenticationPersistence;
    private final Cdn cdn;
    private final IdsRepository idsRepository;
    private final QManager qManager;
    private final Resources resources;
    private final SharedPreferences sharedPreferences;

    public BodyInterceptorV7(IdsRepository idsRepository2, AuthenticationPersistence authenticationPersistence2, AptoideMd5Manager aptoideMd5Manager2, String str, QManager qManager2, Cdn cdn2, SharedPreferences sharedPreferences2, Resources resources2, int i) {
        this.idsRepository = idsRepository2;
        this.authenticationPersistence = authenticationPersistence2;
        this.aptoideMd5Manager = aptoideMd5Manager2;
        this.aptoidePackage = str;
        this.qManager = qManager2;
        this.cdn = cdn2;
        this.aptoideVersionCode = i;
        this.sharedPreferences = sharedPreferences2;
        this.resources = resources2;
    }

    /* renamed from: a */
    public /* synthetic */ Single mo13051a(BaseBody baseBody, Authentication authentication) {
        return this.idsRepository.getUniqueIdentifier().mo18569d(new C3437h(this, authentication, baseBody));
    }

    public Single<BaseBody> intercept(BaseBody baseBody) {
        return this.authenticationPersistence.getAuthentication().mo18559a(new C3436g(this, baseBody)).mo18563b(Schedulers.computation());
    }

    /* renamed from: a */
    public /* synthetic */ BaseBody mo13050a(Authentication authentication, BaseBody baseBody, String str) {
        if (authentication.isAuthenticated()) {
            baseBody.setAccessToken(authentication.getAccessToken());
        } else {
            baseBody.setAccessToken((String) null);
        }
        baseBody.setAptoideId(str);
        baseBody.setAptoideVercode(this.aptoideVersionCode);
        baseBody.setCdn(this.cdn.name().toLowerCase());
        baseBody.setLang(AptoideUtils.SystemU.getCountryCode(this.resources));
        baseBody.setQ(this.qManager.getFilters(ManagerPreferences.getHWSpecsFilter(this.sharedPreferences)));
        String forceCountry = ToolboxManager.getForceCountry(this.sharedPreferences);
        if (!TextUtils.isEmpty(forceCountry)) {
            baseBody.setCountry(forceCountry);
        }
        String aptoideMd5 = this.aptoideMd5Manager.getAptoideMd5();
        if (!aptoideMd5.isEmpty()) {
            baseBody.setAptoideMd5sum(aptoideMd5);
        }
        baseBody.setAptoidePackage(this.aptoidePackage);
        return baseBody;
    }
}
