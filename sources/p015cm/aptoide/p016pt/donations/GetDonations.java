package p015cm.aptoide.p016pt.donations;

import java.util.List;

/* renamed from: cm.aptoide.pt.donations.GetDonations */
public class GetDonations extends BaseResponse {
    private List<Donor> items;
    private String next;

    /* renamed from: cm.aptoide.pt.donations.GetDonations$Donor */
    public static class Donor {
        private String appc;
        private String domain;
        private String owner;

        public String getAppc() {
            return this.appc;
        }

        public String getDomain() {
            return this.domain;
        }

        public String getOwner() {
            return this.owner;
        }

        public void setAppc(String str) {
            this.appc = str;
        }

        public void setDomain(String str) {
            this.domain = str;
        }

        public void setOwner(String str) {
            this.owner = str;
        }
    }

    public List<Donor> getItems() {
        return this.items;
    }

    public String getNext() {
        return this.next;
    }

    public void setItems(List<Donor> list) {
        this.items = list;
    }

    public void setNext(String str) {
        this.next = str;
    }
}
