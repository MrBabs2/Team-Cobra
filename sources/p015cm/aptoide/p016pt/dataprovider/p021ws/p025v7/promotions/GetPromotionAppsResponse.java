package p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.promotions;

import p015cm.aptoide.p016pt.dataprovider.model.p020v7.AppCoinsCampaign;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.BaseV7EndlessDataListResponse;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.GetAppMeta;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v7.promotions.GetPromotionAppsResponse */
public class GetPromotionAppsResponse extends BaseV7EndlessDataListResponse<PromotionAppModel> {

    /* renamed from: cm.aptoide.pt.dataprovider.ws.v7.promotions.GetPromotionAppsResponse$PromotionAppModel */
    public static class PromotionAppModel {
        private GetAppMeta.App app;
        private float appc;
        private boolean claimed;
        private AppCoinsCampaign.Fiat fiat;
        private String promotionDescription;

        public GetAppMeta.App getApp() {
            return this.app;
        }

        public float getAppc() {
            return this.appc;
        }

        public AppCoinsCampaign.Fiat getFiat() {
            return this.fiat;
        }

        public String getPromotionDescription() {
            return this.promotionDescription;
        }

        public boolean isClaimed() {
            return this.claimed;
        }

        public void setApp(GetAppMeta.App app2) {
            this.app = app2;
        }

        public void setAppc(float f) {
            this.appc = f;
        }

        public void setClaimed(boolean z) {
            this.claimed = z;
        }

        public void setFiat(AppCoinsCampaign.Fiat fiat2) {
            this.fiat = fiat2;
        }

        public void setPromotionDescription(String str) {
            this.promotionDescription = str;
        }
    }
}
