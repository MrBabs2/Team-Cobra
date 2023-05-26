package p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.promotions;

import p015cm.aptoide.p016pt.dataprovider.model.p020v7.BaseV7EndlessDataListResponse;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v7.promotions.GetPromotionsResponse */
public class GetPromotionsResponse extends BaseV7EndlessDataListResponse<PromotionModel> {

    /* renamed from: cm.aptoide.pt.dataprovider.ws.v7.promotions.GetPromotionsResponse$PromotionModel */
    public static class PromotionModel {
        private String background;
        private String description;
        private String dialogDescription;
        private String promotionId;
        private String title;
        private String type;

        public String getBackground() {
            return this.background;
        }

        public String getDescription() {
            return this.description;
        }

        public String getDialogDescription() {
            return this.dialogDescription;
        }

        public String getPromotionId() {
            return this.promotionId;
        }

        public String getTitle() {
            return this.title;
        }

        public String getType() {
            return this.type;
        }

        public void setBackground(String str) {
            this.background = str;
        }

        public void setDescription(String str) {
            this.description = str;
        }

        public void setDialogDescription(String str) {
            this.dialogDescription = str;
        }

        public void setPromotionId(String str) {
            this.promotionId = str;
        }

        public void setTitle(String str) {
            this.title = str;
        }

        public void setType(String str) {
            this.type = str;
        }
    }
}
