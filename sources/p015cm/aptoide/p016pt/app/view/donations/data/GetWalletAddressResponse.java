package p015cm.aptoide.p016pt.app.view.donations.data;

import p015cm.aptoide.p016pt.dataprovider.model.p020v7.BaseV7Response;

/* renamed from: cm.aptoide.pt.app.view.donations.data.GetWalletAddressResponse */
public class GetWalletAddressResponse extends BaseV7Response {
    private Data data;

    /* renamed from: cm.aptoide.pt.app.view.donations.data.GetWalletAddressResponse$Data */
    public class Data {
        private String address;

        public Data() {
        }

        public String getAddress() {
            return this.address;
        }

        public void setAddress(String str) {
            this.address = str;
        }
    }

    public Data getData() {
        return this.data;
    }

    public void setData(Data data2) {
        this.data = data2;
    }
}
