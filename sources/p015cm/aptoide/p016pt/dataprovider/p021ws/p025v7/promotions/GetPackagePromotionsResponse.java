package p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.promotions;

import p015cm.aptoide.p016pt.dataprovider.model.p020v7.BaseV7EndlessDataListResponse;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v7.promotions.GetPackagePromotionsResponse */
public class GetPackagePromotionsResponse extends BaseV7EndlessDataListResponse<PromotionAppModel> {

    /* renamed from: cm.aptoide.pt.dataprovider.ws.v7.promotions.GetPackagePromotionsResponse$PromotionAppModel */
    public static class PromotionAppModel {
        private float appc;
        private boolean claimed;
        private String packageName;
        private String promotionId;

        public float getAppc() {
            return this.appc;
        }

        public String getPackageName() {
            return this.packageName;
        }

        public String getPromotionId() {
            return this.promotionId;
        }

        public boolean isClaimed() {
            return this.claimed;
        }

        public void setAppc(float f) {
            this.appc = f;
        }

        public void setClaimed(boolean z) {
            this.claimed = z;
        }

        public void setPackageName(String str) {
            this.packageName = str;
        }

        public void setPromotionId(String str) {
            this.promotionId = str;
        }
    }
}
