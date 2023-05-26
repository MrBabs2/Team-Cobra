package p015cm.aptoide.p016pt.account;

import p015cm.aptoide.accountmanager.AdultContent;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p123rx.Single;

/* renamed from: cm.aptoide.pt.account.MatureBodyInterceptorV7 */
public class MatureBodyInterceptorV7 implements BodyInterceptor<BaseBody> {
    private final AdultContent adultContent;
    private final BodyInterceptor<BaseBody> bodyInterceptorV7;

    public MatureBodyInterceptorV7(BodyInterceptor<BaseBody> bodyInterceptor, AdultContent adultContent2) {
        this.bodyInterceptorV7 = bodyInterceptor;
        this.adultContent = adultContent2;
    }

    public Single<BaseBody> intercept(BaseBody baseBody) {
        return Single.m10124a(this.bodyInterceptorV7.intercept(baseBody), this.adultContent.enabled().mo18669c().mo18700m(), C1148t0.f3575f);
    }
}
