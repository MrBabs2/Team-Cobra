package p015cm.aptoide.p016pt.dataprovider.model.p020v7;

import p015cm.aptoide.p016pt.dataprovider.model.p020v7.GetAppMeta;

/* renamed from: cm.aptoide.pt.dataprovider.model.v7.FullReview */
public class FullReview extends Review {
    private AppData data;

    /* renamed from: cm.aptoide.pt.dataprovider.model.v7.FullReview$AppData */
    public static class AppData {
        private GetAppMeta.App app;

        /* access modifiers changed from: protected */
        public boolean canEqual(Object obj) {
            return obj instanceof AppData;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AppData)) {
                return false;
            }
            AppData appData = (AppData) obj;
            if (!appData.canEqual(this)) {
                return false;
            }
            GetAppMeta.App app2 = getApp();
            GetAppMeta.App app3 = appData.getApp();
            return app2 != null ? app2.equals(app3) : app3 == null;
        }

        public GetAppMeta.App getApp() {
            return this.app;
        }

        public int hashCode() {
            int i;
            GetAppMeta.App app2 = getApp();
            if (app2 == null) {
                i = 43;
            } else {
                i = app2.hashCode();
            }
            return 59 + i;
        }

        public void setApp(GetAppMeta.App app2) {
            this.app = app2;
        }

        public String toString() {
            return "FullReview.AppData(app=" + getApp() + ")";
        }
    }

    /* access modifiers changed from: protected */
    public boolean canEqual(Object obj) {
        return obj instanceof FullReview;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FullReview)) {
            return false;
        }
        FullReview fullReview = (FullReview) obj;
        if (!fullReview.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        AppData data2 = getData();
        AppData data3 = fullReview.getData();
        return data2 != null ? data2.equals(data3) : data3 == null;
    }

    public AppData getData() {
        return this.data;
    }

    public int hashCode() {
        int i;
        AppData data2 = getData();
        int hashCode = (super.hashCode() + 59) * 59;
        if (data2 == null) {
            i = 43;
        } else {
            i = data2.hashCode();
        }
        return hashCode + i;
    }

    public void setData(AppData appData) {
        this.data = appData;
    }

    public String toString() {
        return "FullReview(data=" + getData() + ")";
    }
}
