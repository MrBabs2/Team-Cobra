package p015cm.aptoide.p016pt.networking;

import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p024v3.BaseBody;
import p015cm.aptoide.p016pt.preferences.AptoideMd5Manager;
import p123rx.Single;
import p123rx.schedulers.Schedulers;

/* renamed from: cm.aptoide.pt.networking.NoAuthenticationBodyInterceptorV3 */
public class NoAuthenticationBodyInterceptorV3 implements BodyInterceptor<BaseBody> {
    private final AptoideMd5Manager aptoideMd5Manager;
    private final String aptoidePackage;
    private final IdsRepository idsRepository;

    public NoAuthenticationBodyInterceptorV3(IdsRepository idsRepository2, AptoideMd5Manager aptoideMd5Manager2, String str) {
        this.aptoideMd5Manager = aptoideMd5Manager2;
        this.aptoidePackage = str;
        this.idsRepository = idsRepository2;
    }

    /* renamed from: a */
    public /* synthetic */ BaseBody mo13065a(BaseBody baseBody, String str) {
        String aptoideMd5 = this.aptoideMd5Manager.getAptoideMd5();
        if (!aptoideMd5.isEmpty()) {
            baseBody.setAptoideMd5sum(aptoideMd5);
        }
        baseBody.setAptoidePackage(this.aptoidePackage);
        baseBody.setAptoideUid(str);
        return baseBody;
    }

    public Single<BaseBody> intercept(BaseBody baseBody) {
        return this.idsRepository.getUniqueIdentifier().mo18569d(new C3447q(this, baseBody)).mo18563b(Schedulers.computation());
    }
}
