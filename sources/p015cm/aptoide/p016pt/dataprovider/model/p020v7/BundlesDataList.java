package p015cm.aptoide.p016pt.dataprovider.model.p020v7;

import java.util.List;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.listapp.App;

/* renamed from: cm.aptoide.pt.dataprovider.model.v7.BundlesDataList */
public class BundlesDataList {
    private int count;
    private Integer limit;
    private List<Bundle> list;
    private int next;
    private int offset;
    private int total;

    /* renamed from: cm.aptoide.pt.dataprovider.model.v7.BundlesDataList$Bundle */
    public static class Bundle {
        private List<App> apps;
        private String tag;
        private String title;
        private String type;

        public List<App> getApps() {
            return this.apps;
        }

        public String getTag() {
            return this.tag;
        }

        public String getTitle() {
            return this.title;
        }

        public String getType() {
            return this.type;
        }

        public void setApps(List<App> list) {
            this.apps = list;
        }

        public void setTag(String str) {
            this.tag = str;
        }

        public void setTitle(String str) {
            this.title = str;
        }

        public void setType(String str) {
            this.type = str;
        }
    }

    public int getCount() {
        return this.count;
    }

    public Integer getLimit() {
        return this.limit;
    }

    public List<Bundle> getList() {
        return this.list;
    }

    public int getNext() {
        return this.next;
    }

    public int getOffset() {
        return this.offset;
    }

    public int getTotal() {
        return this.total;
    }

    public void setCount(int i) {
        this.count = i;
    }

    public void setLimit(Integer num) {
        this.limit = num;
    }

    public void setList(List<Bundle> list2) {
        this.list = list2;
    }

    public void setNext(int i) {
        this.next = i;
    }

    public void setOffset(int i) {
        this.offset = i;
    }

    public void setTotal(int i) {
        this.total = i;
    }
}
