package p015cm.aptoide.p016pt.promotions;

import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.promotions.GetPromotionAppsResponse;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.promotions.w6 */
/* compiled from: lambda */
public final /* synthetic */ class C3919w6 implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ PromotionsService f6998f;

    public /* synthetic */ C3919w6(PromotionsService promotionsService) {
        this.f6998f = promotionsService;
    }

    public final Object call(Object obj) {
        return this.f6998f.mapPromotionsResponse((GetPromotionAppsResponse) obj);
    }
}
