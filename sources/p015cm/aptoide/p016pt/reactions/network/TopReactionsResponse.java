package p015cm.aptoide.p016pt.reactions.network;

import java.util.List;

/* renamed from: cm.aptoide.pt.reactions.network.TopReactionsResponse */
public class TopReactionsResponse {

    /* renamed from: my */
    private C3950My f7039my;
    private List<ReactionTypeResponse> top;
    private int total;

    /* renamed from: cm.aptoide.pt.reactions.network.TopReactionsResponse$My */
    public static class C3950My {
        private String type;
        private String uid;

        public String getType() {
            return this.type;
        }

        public String getUid() {
            return this.uid;
        }

        public void setType(String str) {
            this.type = str;
        }

        public void setUid(String str) {
            this.uid = str;
        }
    }

    /* renamed from: cm.aptoide.pt.reactions.network.TopReactionsResponse$ReactionTypeResponse */
    public static class ReactionTypeResponse {
        private int total;
        private String type;

        public int getTotal() {
            return this.total;
        }

        public String getType() {
            return this.type;
        }

        public void setTotal(int i) {
            this.total = i;
        }

        public void setType(String str) {
            this.type = str;
        }
    }

    public C3950My getMy() {
        return this.f7039my;
    }

    public List<ReactionTypeResponse> getTop() {
        return this.top;
    }

    public int getTotal() {
        return this.total;
    }

    public void setMy(C3950My my) {
        this.f7039my = my;
    }

    public void setTop(List<ReactionTypeResponse> list) {
        this.top = list;
    }

    public void setTotal(int i) {
        this.total = i;
    }
}
