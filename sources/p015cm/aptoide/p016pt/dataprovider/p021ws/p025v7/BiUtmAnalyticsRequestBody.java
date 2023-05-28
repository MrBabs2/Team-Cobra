package p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v7.BiUtmAnalyticsRequestBody */
public class BiUtmAnalyticsRequestBody extends BaseBody {
    private final Data data;

    /* renamed from: cm.aptoide.pt.dataprovider.ws.v7.BiUtmAnalyticsRequestBody$App */
    public static class App {
        private String packageName;
        private String url;

        /* access modifiers changed from: protected */
        public boolean canEqual(Object obj) {
            return obj instanceof App;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof App)) {
                return false;
            }
            App app = (App) obj;
            if (!app.canEqual(this)) {
                return false;
            }
            String url2 = getUrl();
            String url3 = app.getUrl();
            if (url2 != null ? !url2.equals(url3) : url3 != null) {
                return false;
            }
            String packageName2 = getPackageName();
            String packageName3 = app.getPackageName();
            return packageName2 != null ? packageName2.equals(packageName3) : packageName3 == null;
        }

        public String getPackageName() {
            return this.packageName;
        }

        public String getUrl() {
            return this.url;
        }

        public int hashCode() {
            int i;
            String url2 = getUrl();
            int i2 = 43;
            if (url2 == null) {
                i = 43;
            } else {
                i = url2.hashCode();
            }
            String packageName2 = getPackageName();
            int i3 = (i + 59) * 59;
            if (packageName2 != null) {
                i2 = packageName2.hashCode();
            }
            return i3 + i2;
        }

        public void setPackageName(String str) {
            this.packageName = str;
        }

        public void setUrl(String str) {
            this.url = str;
        }

        public String toString() {
            return "BiUtmAnalyticsRequestBody.App(url=" + getUrl() + ", packageName=" + getPackageName() + ")";
        }
    }

    /* renamed from: cm.aptoide.pt.dataprovider.ws.v7.BiUtmAnalyticsRequestBody$Data */
    public static class Data {
        private App app;
        private String entryPoint;
        private String siteVersion;
        private String userAgent;
        private UTM utm;

        /* access modifiers changed from: protected */
        public boolean canEqual(Object obj) {
            return obj instanceof Data;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            if (!data.canEqual(this)) {
                return false;
            }
            String entryPoint2 = getEntryPoint();
            String entryPoint3 = data.getEntryPoint();
            if (entryPoint2 != null ? !entryPoint2.equals(entryPoint3) : entryPoint3 != null) {
                return false;
            }
            String siteVersion2 = getSiteVersion();
            String siteVersion3 = data.getSiteVersion();
            if (siteVersion2 != null ? !siteVersion2.equals(siteVersion3) : siteVersion3 != null) {
                return false;
            }
            App app2 = getApp();
            App app3 = data.getApp();
            if (app2 != null ? !app2.equals(app3) : app3 != null) {
                return false;
            }
            UTM utm2 = getUtm();
            UTM utm3 = data.getUtm();
            if (utm2 != null ? !utm2.equals(utm3) : utm3 != null) {
                return false;
            }
            String userAgent2 = getUserAgent();
            String userAgent3 = data.getUserAgent();
            return userAgent2 != null ? userAgent2.equals(userAgent3) : userAgent3 == null;
        }

        public App getApp() {
            return this.app;
        }

        public String getEntryPoint() {
            return this.entryPoint;
        }

        public String getSiteVersion() {
            return this.siteVersion;
        }

        public String getUserAgent() {
            return this.userAgent;
        }

        public UTM getUtm() {
            return this.utm;
        }

        public int hashCode() {
            int i;
            int i2;
            int i3;
            int i4;
            String entryPoint2 = getEntryPoint();
            int i5 = 43;
            if (entryPoint2 == null) {
                i = 43;
            } else {
                i = entryPoint2.hashCode();
            }
            String siteVersion2 = getSiteVersion();
            int i6 = (i + 59) * 59;
            if (siteVersion2 == null) {
                i2 = 43;
            } else {
                i2 = siteVersion2.hashCode();
            }
            int i7 = i6 + i2;
            App app2 = getApp();
            int i8 = i7 * 59;
            if (app2 == null) {
                i3 = 43;
            } else {
                i3 = app2.hashCode();
            }
            int i9 = i8 + i3;
            UTM utm2 = getUtm();
            int i10 = i9 * 59;
            if (utm2 == null) {
                i4 = 43;
            } else {
                i4 = utm2.hashCode();
            }
            int i11 = i10 + i4;
            String userAgent2 = getUserAgent();
            int i12 = i11 * 59;
            if (userAgent2 != null) {
                i5 = userAgent2.hashCode();
            }
            return i12 + i5;
        }

        public void setApp(App app2) {
            this.app = app2;
        }

        public void setEntryPoint(String str) {
            this.entryPoint = str;
        }

        public void setSiteVersion(String str) {
            this.siteVersion = str;
        }

        public void setUserAgent(String str) {
            this.userAgent = str;
        }

        public void setUtm(UTM utm2) {
            this.utm = utm2;
        }

        public String toString() {
            return "BiUtmAnalyticsRequestBody.Data(entryPoint=" + getEntryPoint() + ", siteVersion=" + getSiteVersion() + ", app=" + getApp() + ", utm=" + getUtm() + ", userAgent=" + getUserAgent() + ")";
        }
    }

    /* renamed from: cm.aptoide.pt.dataprovider.ws.v7.BiUtmAnalyticsRequestBody$UTM */
    public static class UTM {
        private String campaign;
        private String content;
        private String medium;
        private String source;

        /* access modifiers changed from: protected */
        public boolean canEqual(Object obj) {
            return obj instanceof UTM;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UTM)) {
                return false;
            }
            UTM utm = (UTM) obj;
            if (!utm.canEqual(this)) {
                return false;
            }
            String source2 = getSource();
            String source3 = utm.getSource();
            if (source2 != null ? !source2.equals(source3) : source3 != null) {
                return false;
            }
            String medium2 = getMedium();
            String medium3 = utm.getMedium();
            if (medium2 != null ? !medium2.equals(medium3) : medium3 != null) {
                return false;
            }
            String campaign2 = getCampaign();
            String campaign3 = utm.getCampaign();
            if (campaign2 != null ? !campaign2.equals(campaign3) : campaign3 != null) {
                return false;
            }
            String content2 = getContent();
            String content3 = utm.getContent();
            return content2 != null ? content2.equals(content3) : content3 == null;
        }

        public String getCampaign() {
            return this.campaign;
        }

        public String getContent() {
            return this.content;
        }

        public String getMedium() {
            return this.medium;
        }

        public String getSource() {
            return this.source;
        }

        public int hashCode() {
            int i;
            int i2;
            int i3;
            String source2 = getSource();
            int i4 = 43;
            if (source2 == null) {
                i = 43;
            } else {
                i = source2.hashCode();
            }
            String medium2 = getMedium();
            int i5 = (i + 59) * 59;
            if (medium2 == null) {
                i2 = 43;
            } else {
                i2 = medium2.hashCode();
            }
            int i6 = i5 + i2;
            String campaign2 = getCampaign();
            int i7 = i6 * 59;
            if (campaign2 == null) {
                i3 = 43;
            } else {
                i3 = campaign2.hashCode();
            }
            int i8 = i7 + i3;
            String content2 = getContent();
            int i9 = i8 * 59;
            if (content2 != null) {
                i4 = content2.hashCode();
            }
            return i9 + i4;
        }

        public void setCampaign(String str) {
            this.campaign = str;
        }

        public void setContent(String str) {
            this.content = str;
        }

        public void setMedium(String str) {
            this.medium = str;
        }

        public void setSource(String str) {
            this.source = str;
        }

        public String toString() {
            return "BiUtmAnalyticsRequestBody.UTM(source=" + getSource() + ", medium=" + getMedium() + ", campaign=" + getCampaign() + ", content=" + getContent() + ")";
        }
    }

    public BiUtmAnalyticsRequestBody(Data data2) {
        this.data = data2;
    }

    /* access modifiers changed from: protected */
    public boolean canEqual(Object obj) {
        return obj instanceof BiUtmAnalyticsRequestBody;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BiUtmAnalyticsRequestBody)) {
            return false;
        }
        BiUtmAnalyticsRequestBody biUtmAnalyticsRequestBody = (BiUtmAnalyticsRequestBody) obj;
        if (!biUtmAnalyticsRequestBody.canEqual(this)) {
            return false;
        }
        Data data2 = getData();
        Data data3 = biUtmAnalyticsRequestBody.getData();
        return data2 != null ? data2.equals(data3) : data3 == null;
    }

    public Data getData() {
        return this.data;
    }

    public int hashCode() {
        int i;
        Data data2 = getData();
        if (data2 == null) {
            i = 43;
        } else {
            i = data2.hashCode();
        }
        return 59 + i;
    }

    public String toString() {
        return "BiUtmAnalyticsRequestBody(data=" + getData() + ")";
    }
}
