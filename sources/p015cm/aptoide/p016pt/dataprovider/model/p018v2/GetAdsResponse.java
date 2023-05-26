package p015cm.aptoide.p016pt.dataprovider.model.p018v2;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import java.util.List;

/* renamed from: cm.aptoide.pt.dataprovider.model.v2.GetAdsResponse */
public class GetAdsResponse {
    private List<C2176Ad> ads;
    private Options options;

    /* renamed from: cm.aptoide.pt.dataprovider.model.v2.GetAdsResponse$Ad */
    public static class C2176Ad {
        private Data data;
        private Info info;
        private Partner partner;
        private Partner tracker;

        /* access modifiers changed from: protected */
        public boolean canEqual(Object obj) {
            return obj instanceof C2176Ad;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C2176Ad)) {
                return false;
            }
            C2176Ad ad = (C2176Ad) obj;
            if (!ad.canEqual(this)) {
                return false;
            }
            Data data2 = getData();
            Data data3 = ad.getData();
            if (data2 != null ? !data2.equals(data3) : data3 != null) {
                return false;
            }
            Info info2 = getInfo();
            Info info3 = ad.getInfo();
            if (info2 != null ? !info2.equals(info3) : info3 != null) {
                return false;
            }
            Partner partner2 = getPartner();
            Partner partner3 = ad.getPartner();
            if (partner2 != null ? !partner2.equals(partner3) : partner3 != null) {
                return false;
            }
            Partner tracker2 = getTracker();
            Partner tracker3 = ad.getTracker();
            return tracker2 != null ? tracker2.equals(tracker3) : tracker3 == null;
        }

        public Data getData() {
            return this.data;
        }

        public Info getInfo() {
            return this.info;
        }

        public Partner getPartner() {
            return this.partner;
        }

        public Partner getTracker() {
            return this.tracker;
        }

        public int hashCode() {
            int i;
            int i2;
            int i3;
            Data data2 = getData();
            int i4 = 43;
            if (data2 == null) {
                i = 43;
            } else {
                i = data2.hashCode();
            }
            Info info2 = getInfo();
            int i5 = (i + 59) * 59;
            if (info2 == null) {
                i2 = 43;
            } else {
                i2 = info2.hashCode();
            }
            int i6 = i5 + i2;
            Partner partner2 = getPartner();
            int i7 = i6 * 59;
            if (partner2 == null) {
                i3 = 43;
            } else {
                i3 = partner2.hashCode();
            }
            int i8 = i7 + i3;
            Partner tracker2 = getTracker();
            int i9 = i8 * 59;
            if (tracker2 != null) {
                i4 = tracker2.hashCode();
            }
            return i9 + i4;
        }

        public void setData(Data data2) {
            this.data = data2;
        }

        public void setInfo(Info info2) {
            this.info = info2;
        }

        public void setPartner(Partner partner2) {
            this.partner = partner2;
        }

        public void setTracker(Partner partner2) {
            this.tracker = partner2;
        }

        public String toString() {
            return "GetAdsResponse.Ad(data=" + getData() + ", info=" + getInfo() + ", partner=" + getPartner() + ", tracker=" + getTracker() + ")";
        }
    }

    /* renamed from: cm.aptoide.pt.dataprovider.model.v2.GetAdsResponse$Data */
    public static class Data {
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "UTC")
        private Date added;
        private String description;
        private int downloads;
        private String icon;

        /* renamed from: id */
        private long f4837id;
        private String md5sum;
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "UTC")
        private Date modified;
        private String name;
        @JsonProperty("package")
        private String packageName;
        private String repo;
        private long size;
        private int stars;
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "UTC")
        private Date updated;
        private int vercode;
        private String vername;

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
            if (!data.canEqual(this) || getId() != data.getId()) {
                return false;
            }
            String name2 = getName();
            String name3 = data.getName();
            if (name2 != null ? !name2.equals(name3) : name3 != null) {
                return false;
            }
            String repo2 = getRepo();
            String repo3 = data.getRepo();
            if (repo2 != null ? !repo2.equals(repo3) : repo3 != null) {
                return false;
            }
            String packageName2 = getPackageName();
            String packageName3 = data.getPackageName();
            if (packageName2 != null ? !packageName2.equals(packageName3) : packageName3 != null) {
                return false;
            }
            String md5sum2 = getMd5sum();
            String md5sum3 = data.getMd5sum();
            if (md5sum2 != null ? !md5sum2.equals(md5sum3) : md5sum3 != null) {
                return false;
            }
            if (getSize() != data.getSize() || getVercode() != data.getVercode()) {
                return false;
            }
            String vername2 = getVername();
            String vername3 = data.getVername();
            if (vername2 != null ? !vername2.equals(vername3) : vername3 != null) {
                return false;
            }
            String icon2 = getIcon();
            String icon3 = data.getIcon();
            if (icon2 != null ? !icon2.equals(icon3) : icon3 != null) {
                return false;
            }
            if (getDownloads() != data.getDownloads() || getStars() != data.getStars()) {
                return false;
            }
            String description2 = getDescription();
            String description3 = data.getDescription();
            if (description2 != null ? !description2.equals(description3) : description3 != null) {
                return false;
            }
            Date added2 = getAdded();
            Date added3 = data.getAdded();
            if (added2 != null ? !added2.equals(added3) : added3 != null) {
                return false;
            }
            Date modified2 = getModified();
            Date modified3 = data.getModified();
            if (modified2 != null ? !modified2.equals(modified3) : modified3 != null) {
                return false;
            }
            Date updated2 = getUpdated();
            Date updated3 = data.getUpdated();
            return updated2 != null ? updated2.equals(updated3) : updated3 == null;
        }

        public Date getAdded() {
            return this.added;
        }

        public String getDescription() {
            return this.description;
        }

        public int getDownloads() {
            return this.downloads;
        }

        public String getIcon() {
            return this.icon;
        }

        public long getId() {
            return this.f4837id;
        }

        public String getMd5sum() {
            return this.md5sum;
        }

        public Date getModified() {
            return this.modified;
        }

        public String getName() {
            return this.name;
        }

        public String getPackageName() {
            return this.packageName;
        }

        public String getRepo() {
            return this.repo;
        }

        public long getSize() {
            return this.size;
        }

        public int getStars() {
            return this.stars;
        }

        public Date getUpdated() {
            return this.updated;
        }

        public int getVercode() {
            return this.vercode;
        }

        public String getVername() {
            return this.vername;
        }

        public int hashCode() {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            long id = getId();
            String name2 = getName();
            int i10 = (((int) (id ^ (id >>> 32))) + 59) * 59;
            int i11 = 43;
            if (name2 == null) {
                i = 43;
            } else {
                i = name2.hashCode();
            }
            int i12 = i10 + i;
            String repo2 = getRepo();
            int i13 = i12 * 59;
            if (repo2 == null) {
                i2 = 43;
            } else {
                i2 = repo2.hashCode();
            }
            int i14 = i13 + i2;
            String packageName2 = getPackageName();
            int i15 = i14 * 59;
            if (packageName2 == null) {
                i3 = 43;
            } else {
                i3 = packageName2.hashCode();
            }
            int i16 = i15 + i3;
            String md5sum2 = getMd5sum();
            int i17 = i16 * 59;
            if (md5sum2 == null) {
                i4 = 43;
            } else {
                i4 = md5sum2.hashCode();
            }
            long size2 = getSize();
            int vercode2 = ((((i17 + i4) * 59) + ((int) ((size2 >>> 32) ^ size2))) * 59) + getVercode();
            String vername2 = getVername();
            int i18 = vercode2 * 59;
            if (vername2 == null) {
                i5 = 43;
            } else {
                i5 = vername2.hashCode();
            }
            int i19 = i18 + i5;
            String icon2 = getIcon();
            int i20 = i19 * 59;
            if (icon2 == null) {
                i6 = 43;
            } else {
                i6 = icon2.hashCode();
            }
            int downloads2 = ((((i20 + i6) * 59) + getDownloads()) * 59) + getStars();
            String description2 = getDescription();
            int i21 = downloads2 * 59;
            if (description2 == null) {
                i7 = 43;
            } else {
                i7 = description2.hashCode();
            }
            int i22 = i21 + i7;
            Date added2 = getAdded();
            int i23 = i22 * 59;
            if (added2 == null) {
                i8 = 43;
            } else {
                i8 = added2.hashCode();
            }
            int i24 = i23 + i8;
            Date modified2 = getModified();
            int i25 = i24 * 59;
            if (modified2 == null) {
                i9 = 43;
            } else {
                i9 = modified2.hashCode();
            }
            int i26 = i25 + i9;
            Date updated2 = getUpdated();
            int i27 = i26 * 59;
            if (updated2 != null) {
                i11 = updated2.hashCode();
            }
            return i27 + i11;
        }

        public void setAdded(Date date) {
            this.added = date;
        }

        public void setDescription(String str) {
            this.description = str;
        }

        public void setDownloads(int i) {
            this.downloads = i;
        }

        public void setIcon(String str) {
            this.icon = str;
        }

        public void setId(long j) {
            this.f4837id = j;
        }

        public void setMd5sum(String str) {
            this.md5sum = str;
        }

        public void setModified(Date date) {
            this.modified = date;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setPackageName(String str) {
            this.packageName = str;
        }

        public void setRepo(String str) {
            this.repo = str;
        }

        public void setSize(long j) {
            this.size = j;
        }

        public void setStars(int i) {
            this.stars = i;
        }

        public void setUpdated(Date date) {
            this.updated = date;
        }

        public void setVercode(int i) {
            this.vercode = i;
        }

        public void setVername(String str) {
            this.vername = str;
        }

        public String toString() {
            return "GetAdsResponse.Data(id=" + getId() + ", name=" + getName() + ", repo=" + getRepo() + ", packageName=" + getPackageName() + ", md5sum=" + getMd5sum() + ", size=" + getSize() + ", vercode=" + getVercode() + ", vername=" + getVername() + ", icon=" + getIcon() + ", downloads=" + getDownloads() + ", stars=" + getStars() + ", description=" + getDescription() + ", added=" + getAdded() + ", modified=" + getModified() + ", updated=" + getUpdated() + ")";
        }
    }

    /* renamed from: cm.aptoide.pt.dataprovider.model.v2.GetAdsResponse$Info */
    public static class Info {
        private long adId;
        private String adType;
        private String cpcUrl;
        private String cpdUrl;
        private String cpiUrl;
        private Payout payout;

        /* renamed from: cm.aptoide.pt.dataprovider.model.v2.GetAdsResponse$Info$Fiat */
        public static class Fiat {
            private double amount;
            private String currency;
            private String symbol;

            public double getAmount() {
                return this.amount;
            }

            public String getCurrency() {
                return this.currency;
            }

            public String getSymbol() {
                return this.symbol;
            }

            public void setAmount(double d) {
                this.amount = d;
            }

            public void setCurrency(String str) {
                this.currency = str;
            }

            public void setSymbol(String str) {
                this.symbol = str;
            }
        }

        /* renamed from: cm.aptoide.pt.dataprovider.model.v2.GetAdsResponse$Info$Payout */
        public static class Payout {
            private double appc;
            private Fiat fiat;

            public double getAppc() {
                return this.appc;
            }

            public Fiat getFiat() {
                return this.fiat;
            }

            public void setAppc(double d) {
                this.appc = d;
            }

            public void setFiat(Fiat fiat2) {
                this.fiat = fiat2;
            }
        }

        /* access modifiers changed from: protected */
        public boolean canEqual(Object obj) {
            return obj instanceof Info;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Info)) {
                return false;
            }
            Info info = (Info) obj;
            if (!info.canEqual(this) || getAdId() != info.getAdId()) {
                return false;
            }
            String adType2 = getAdType();
            String adType3 = info.getAdType();
            if (adType2 != null ? !adType2.equals(adType3) : adType3 != null) {
                return false;
            }
            String cpcUrl2 = getCpcUrl();
            String cpcUrl3 = info.getCpcUrl();
            if (cpcUrl2 != null ? !cpcUrl2.equals(cpcUrl3) : cpcUrl3 != null) {
                return false;
            }
            String cpiUrl2 = getCpiUrl();
            String cpiUrl3 = info.getCpiUrl();
            if (cpiUrl2 != null ? !cpiUrl2.equals(cpiUrl3) : cpiUrl3 != null) {
                return false;
            }
            String cpdUrl2 = getCpdUrl();
            String cpdUrl3 = info.getCpdUrl();
            if (cpdUrl2 != null ? !cpdUrl2.equals(cpdUrl3) : cpdUrl3 != null) {
                return false;
            }
            Payout payout2 = getPayout();
            Payout payout3 = info.getPayout();
            return payout2 != null ? payout2.equals(payout3) : payout3 == null;
        }

        public long getAdId() {
            return this.adId;
        }

        public String getAdType() {
            return this.adType;
        }

        public String getCpcUrl() {
            return this.cpcUrl;
        }

        public String getCpdUrl() {
            return this.cpdUrl;
        }

        public String getCpiUrl() {
            return this.cpiUrl;
        }

        public Payout getPayout() {
            return this.payout;
        }

        public int hashCode() {
            int i;
            int i2;
            int i3;
            int i4;
            long adId2 = getAdId();
            String adType2 = getAdType();
            int i5 = (((int) (adId2 ^ (adId2 >>> 32))) + 59) * 59;
            int i6 = 43;
            if (adType2 == null) {
                i = 43;
            } else {
                i = adType2.hashCode();
            }
            int i7 = i5 + i;
            String cpcUrl2 = getCpcUrl();
            int i8 = i7 * 59;
            if (cpcUrl2 == null) {
                i2 = 43;
            } else {
                i2 = cpcUrl2.hashCode();
            }
            int i9 = i8 + i2;
            String cpiUrl2 = getCpiUrl();
            int i10 = i9 * 59;
            if (cpiUrl2 == null) {
                i3 = 43;
            } else {
                i3 = cpiUrl2.hashCode();
            }
            int i11 = i10 + i3;
            String cpdUrl2 = getCpdUrl();
            int i12 = i11 * 59;
            if (cpdUrl2 == null) {
                i4 = 43;
            } else {
                i4 = cpdUrl2.hashCode();
            }
            int i13 = i12 + i4;
            Payout payout2 = getPayout();
            int i14 = i13 * 59;
            if (payout2 != null) {
                i6 = payout2.hashCode();
            }
            return i14 + i6;
        }

        public void setAdId(long j) {
            this.adId = j;
        }

        public void setAdType(String str) {
            this.adType = str;
        }

        public void setCpcUrl(String str) {
            this.cpcUrl = str;
        }

        public void setCpdUrl(String str) {
            this.cpdUrl = str;
        }

        public void setCpiUrl(String str) {
            this.cpiUrl = str;
        }

        public void setPayout(Payout payout2) {
            this.payout = payout2;
        }

        public String toString() {
            return "GetAdsResponse.Info(adId=" + getAdId() + ", adType=" + getAdType() + ", cpcUrl=" + getCpcUrl() + ", cpiUrl=" + getCpiUrl() + ", cpdUrl=" + getCpdUrl() + ", payout=" + this.payout.toString() + ")";
        }
    }

    /* renamed from: cm.aptoide.pt.dataprovider.model.v2.GetAdsResponse$Options */
    public static class Options {
        private Boolean mediation = true;

        /* access modifiers changed from: protected */
        public boolean canEqual(Object obj) {
            return obj instanceof Options;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Options)) {
                return false;
            }
            Options options = (Options) obj;
            if (!options.canEqual(this)) {
                return false;
            }
            Boolean mediation2 = getMediation();
            Boolean mediation3 = options.getMediation();
            return mediation2 != null ? mediation2.equals(mediation3) : mediation3 == null;
        }

        public Boolean getMediation() {
            return this.mediation;
        }

        public int hashCode() {
            int i;
            Boolean mediation2 = getMediation();
            if (mediation2 == null) {
                i = 43;
            } else {
                i = mediation2.hashCode();
            }
            return 59 + i;
        }

        public void setMediation(Boolean bool) {
            this.mediation = bool;
        }

        public String toString() {
            return "GetAdsResponse.Options(mediation=" + getMediation() + ")";
        }
    }

    /* renamed from: cm.aptoide.pt.dataprovider.model.v2.GetAdsResponse$Partner */
    public static class Partner {
        private Data data;
        private Info info;

        /* renamed from: cm.aptoide.pt.dataprovider.model.v2.GetAdsResponse$Partner$Data */
        public static class Data {
            private String clickUrl;
            private String impressionUrl;

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
                String clickUrl2 = getClickUrl();
                String clickUrl3 = data.getClickUrl();
                if (clickUrl2 != null ? !clickUrl2.equals(clickUrl3) : clickUrl3 != null) {
                    return false;
                }
                String impressionUrl2 = getImpressionUrl();
                String impressionUrl3 = data.getImpressionUrl();
                return impressionUrl2 != null ? impressionUrl2.equals(impressionUrl3) : impressionUrl3 == null;
            }

            public String getClickUrl() {
                return this.clickUrl;
            }

            public String getImpressionUrl() {
                return this.impressionUrl;
            }

            public int hashCode() {
                int i;
                String clickUrl2 = getClickUrl();
                int i2 = 43;
                if (clickUrl2 == null) {
                    i = 43;
                } else {
                    i = clickUrl2.hashCode();
                }
                String impressionUrl2 = getImpressionUrl();
                int i3 = (i + 59) * 59;
                if (impressionUrl2 != null) {
                    i2 = impressionUrl2.hashCode();
                }
                return i3 + i2;
            }

            public void setClickUrl(String str) {
                this.clickUrl = str;
            }

            public void setImpressionUrl(String str) {
                this.impressionUrl = str;
            }

            public String toString() {
                return "GetAdsResponse.Partner.Data(clickUrl=" + getClickUrl() + ", impressionUrl=" + getImpressionUrl() + ")";
            }
        }

        /* renamed from: cm.aptoide.pt.dataprovider.model.v2.GetAdsResponse$Partner$Info */
        public static class Info {

            /* renamed from: id */
            private int f4838id;
            private String name;

            /* access modifiers changed from: protected */
            public boolean canEqual(Object obj) {
                return obj instanceof Info;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Info)) {
                    return false;
                }
                Info info = (Info) obj;
                if (!info.canEqual(this) || getId() != info.getId()) {
                    return false;
                }
                String name2 = getName();
                String name3 = info.getName();
                return name2 != null ? name2.equals(name3) : name3 == null;
            }

            public int getId() {
                return this.f4838id;
            }

            public String getName() {
                return this.name;
            }

            public int hashCode() {
                int i;
                String name2 = getName();
                int id = (getId() + 59) * 59;
                if (name2 == null) {
                    i = 43;
                } else {
                    i = name2.hashCode();
                }
                return id + i;
            }

            public void setId(int i) {
                this.f4838id = i;
            }

            public void setName(String str) {
                this.name = str;
            }

            public String toString() {
                return "GetAdsResponse.Partner.Info(id=" + getId() + ", name=" + getName() + ")";
            }
        }

        /* access modifiers changed from: protected */
        public boolean canEqual(Object obj) {
            return obj instanceof Partner;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Partner)) {
                return false;
            }
            Partner partner = (Partner) obj;
            if (!partner.canEqual(this)) {
                return false;
            }
            Info info2 = getInfo();
            Info info3 = partner.getInfo();
            if (info2 != null ? !info2.equals(info3) : info3 != null) {
                return false;
            }
            Data data2 = getData();
            Data data3 = partner.getData();
            return data2 != null ? data2.equals(data3) : data3 == null;
        }

        public Data getData() {
            return this.data;
        }

        public Info getInfo() {
            return this.info;
        }

        public int hashCode() {
            int i;
            Info info2 = getInfo();
            int i2 = 43;
            if (info2 == null) {
                i = 43;
            } else {
                i = info2.hashCode();
            }
            Data data2 = getData();
            int i3 = (i + 59) * 59;
            if (data2 != null) {
                i2 = data2.hashCode();
            }
            return i3 + i2;
        }

        public void setData(Data data2) {
            this.data = data2;
        }

        public void setInfo(Info info2) {
            this.info = info2;
        }

        public String toString() {
            return "GetAdsResponse.Partner(info=" + getInfo() + ", data=" + getData() + ")";
        }
    }

    /* access modifiers changed from: protected */
    public boolean canEqual(Object obj) {
        return obj instanceof GetAdsResponse;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetAdsResponse)) {
            return false;
        }
        GetAdsResponse getAdsResponse = (GetAdsResponse) obj;
        if (!getAdsResponse.canEqual(this)) {
            return false;
        }
        List<C2176Ad> ads2 = getAds();
        List<C2176Ad> ads3 = getAdsResponse.getAds();
        if (ads2 != null ? !ads2.equals(ads3) : ads3 != null) {
            return false;
        }
        Options options2 = getOptions();
        Options options3 = getAdsResponse.getOptions();
        return options2 != null ? options2.equals(options3) : options3 == null;
    }

    public List<C2176Ad> getAds() {
        return this.ads;
    }

    public Options getOptions() {
        return this.options;
    }

    public int hashCode() {
        int i;
        List<C2176Ad> ads2 = getAds();
        int i2 = 43;
        if (ads2 == null) {
            i = 43;
        } else {
            i = ads2.hashCode();
        }
        Options options2 = getOptions();
        int i3 = (i + 59) * 59;
        if (options2 != null) {
            i2 = options2.hashCode();
        }
        return i3 + i2;
    }

    public void setAds(List<C2176Ad> list) {
        this.ads = list;
    }

    public void setOptions(Options options2) {
        this.options = options2;
    }

    public String toString() {
        return "GetAdsResponse(ads=" + getAds() + ", options=" + getOptions() + ")";
    }
}
