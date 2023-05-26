package p015cm.aptoide.p016pt.promotions;

import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.promotions.GetPackagePromotionsResponse;
import p123rx.p126m.C5379n;

/* renamed from: cm.aptoide.pt.promotions.v6 */
/* compiled from: lambda */
public final /* synthetic */ class C3911v6 implements C5379n {

    /* renamed from: f */
    private final /* synthetic */ PromotionsService f6990f;

    public /* synthetic */ C3911v6(PromotionsService promotionsService) {
        this.f6990f = promotionsService;
    }

    public final Object call(Object obj) {
        return this.f6990f.mapToPromotion((GetPackagePromotionsResponse) obj);
    }
}
