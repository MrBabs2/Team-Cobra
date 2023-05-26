package p015cm.aptoide.p016pt.dataprovider.model.p020v7.listapp;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Aab;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Obb;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.Store;

/* renamed from: cm.aptoide.pt.dataprovider.model.v7.listapp.App */
public class App {
    private Aab aab;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "UTC")
    private Date added;
    private AppCoinsInfo appcoins;
    private File file;
    private String graphic;
    private String icon;

    /* renamed from: id */
    private long f4860id;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "UTC")
    private Date modified;
    private String name;
    private Obb obb;
    @JsonProperty("package")
    private String packageName;
    private long size;
    private Stats stats;
    private Store store;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "UTC")
    private Date updated;
    private String uptype;

    /* renamed from: cm.aptoide.pt.dataprovider.model.v7.listapp.App$Stats */
    public static class Stats {
        private int apps;
        private int downloads;
        private int pdownloads;
        private Rating rating;
        private int subscribers;

        /* renamed from: cm.aptoide.pt.dataprovider.model.v7.listapp.App$Stats$Rating */
        public static class Rating {
            private float avg;
            private int total;

            /* access modifiers changed from: protected */
            public boolean canEqual(Object obj) {
                return obj instanceof Rating;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Rating)) {
                    return false;
                }
                Rating rating = (Rating) obj;
                return rating.canEqual(this) && Float.compare(getAvg(), rating.getAvg()) == 0 && getTotal() == rating.getTotal();
            }

            public float getAvg() {
                return this.avg;
            }

            public int getTotal() {
                return this.total;
            }

            public int hashCode() {
                return ((Float.floatToIntBits(getAvg()) + 59) * 59) + getTotal();
            }

            public void setAvg(float f) {
                this.avg = f;
            }

            public void setTotal(int i) {
                this.total = i;
            }

            public String toString() {
                return "App.Stats.Rating(avg=" + getAvg() + ", total=" + getTotal() + ")";
            }
        }

        /* access modifiers changed from: protected */
        public boolean canEqual(Object obj) {
            return obj instanceof Stats;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Stats)) {
                return false;
            }
            Stats stats = (Stats) obj;
            if (!stats.canEqual(this) || getApps() != stats.getApps() || getSubscribers() != stats.getSubscribers() || getDownloads() != stats.getDownloads() || getPdownloads() != stats.getPdownloads()) {
                return false;
            }
            Rating rating2 = getRating();
            Rating rating3 = stats.getRating();
            return rating2 != null ? rating2.equals(rating3) : rating3 == null;
        }

        public int getApps() {
            return this.apps;
        }

        public int getDownloads() {
            return this.downloads;
        }

        public int getPdownloads() {
            return this.pdownloads;
        }

        public Rating getRating() {
            return this.rating;
        }

        public int getSubscribers() {
            return this.subscribers;
        }

        public int hashCode() {
            int i;
            int apps2 = ((((((getApps() + 59) * 59) + getSubscribers()) * 59) + getDownloads()) * 59) + getPdownloads();
            Rating rating2 = getRating();
            int i2 = apps2 * 59;
            if (rating2 == null) {
                i = 43;
            } else {
                i = rating2.hashCode();
            }
            return i2 + i;
        }

        public void setApps(int i) {
            this.apps = i;
        }

        public void setDownloads(int i) {
            this.downloads = i;
        }

        public void setPdownloads(int i) {
            this.pdownloads = i;
        }

        public void setRating(Rating rating2) {
            this.rating = rating2;
        }

        public void setSubscribers(int i) {
            this.subscribers = i;
        }

        public String toString() {
            return "App.Stats(apps=" + getApps() + ", subscribers=" + getSubscribers() + ", downloads=" + getDownloads() + ", pdownloads=" + getPdownloads() + ", rating=" + getRating() + ")";
        }
    }

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
        if (!app.canEqual(this) || getId() != app.getId()) {
            return false;
        }
        String name2 = getName();
        String name3 = app.getName();
        if (name2 != null ? !name2.equals(name3) : name3 != null) {
            return false;
        }
        String packageName2 = getPackageName();
        String packageName3 = app.getPackageName();
        if (packageName2 != null ? !packageName2.equals(packageName3) : packageName3 != null) {
            return false;
        }
        if (getSize() != app.getSize()) {
            return false;
        }
        String icon2 = getIcon();
        String icon3 = app.getIcon();
        if (icon2 != null ? !icon2.equals(icon3) : icon3 != null) {
            return false;
        }
        String graphic2 = getGraphic();
        String graphic3 = app.getGraphic();
        if (graphic2 != null ? !graphic2.equals(graphic3) : graphic3 != null) {
            return false;
        }
        Date added2 = getAdded();
        Date added3 = app.getAdded();
        if (added2 != null ? !added2.equals(added3) : added3 != null) {
            return false;
        }
        Date modified2 = getModified();
        Date modified3 = app.getModified();
        if (modified2 != null ? !modified2.equals(modified3) : modified3 != null) {
            return false;
        }
        Date updated2 = getUpdated();
        Date updated3 = app.getUpdated();
        if (updated2 != null ? !updated2.equals(updated3) : updated3 != null) {
            return false;
        }
        String uptype2 = getUptype();
        String uptype3 = app.getUptype();
        if (uptype2 != null ? !uptype2.equals(uptype3) : uptype3 != null) {
            return false;
        }
        Store store2 = getStore();
        Store store3 = app.getStore();
        if (store2 != null ? !store2.equals(store3) : store3 != null) {
            return false;
        }
        File file2 = getFile();
        File file3 = app.getFile();
        if (file2 != null ? !file2.equals(file3) : file3 != null) {
            return false;
        }
        Stats stats2 = getStats();
        Stats stats3 = app.getStats();
        if (stats2 != null ? !stats2.equals(stats3) : stats3 != null) {
            return false;
        }
        Obb obb2 = getObb();
        Obb obb3 = app.getObb();
        return obb2 != null ? obb2.equals(obb3) : obb3 == null;
    }

    public Aab getAab() {
        return this.aab;
    }

    public Date getAdded() {
        return this.added;
    }

    public AppCoinsInfo getAppcoins() {
        return this.appcoins;
    }

    public File getFile() {
        return this.file;
    }

    public String getGraphic() {
        return this.graphic;
    }

    public String getIcon() {
        return this.icon;
    }

    public long getId() {
        return this.f4860id;
    }

    public Date getModified() {
        return this.modified;
    }

    public String getName() {
        return this.name;
    }

    public Obb getObb() {
        return this.obb;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public long getSize() {
        return this.size;
    }

    public Stats getStats() {
        return this.stats;
    }

    public Store getStore() {
        return this.store;
    }

    public Date getUpdated() {
        return this.updated;
    }

    public String getUptype() {
        return this.uptype;
    }

    public boolean hasAdvertising() {
        return getAppcoins() != null && getAppcoins().hasAdvertising();
    }

    public boolean hasBilling() {
        return getAppcoins() != null && getAppcoins().hasBilling();
    }

    public boolean hasSplits() {
        Aab aab2 = this.aab;
        return aab2 != null && !aab2.getRequiredSplits().isEmpty();
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
        int i10;
        int i11;
        long id = getId();
        String name2 = getName();
        int i12 = (((int) (id ^ (id >>> 32))) + 59) * 59;
        int i13 = 43;
        if (name2 == null) {
            i = 43;
        } else {
            i = name2.hashCode();
        }
        int i14 = i12 + i;
        String packageName2 = getPackageName();
        int i15 = i14 * 59;
        if (packageName2 == null) {
            i2 = 43;
        } else {
            i2 = packageName2.hashCode();
        }
        long size2 = getSize();
        String icon2 = getIcon();
        int i16 = (((i15 + i2) * 59) + ((int) ((size2 >>> 32) ^ size2))) * 59;
        if (icon2 == null) {
            i3 = 43;
        } else {
            i3 = icon2.hashCode();
        }
        int i17 = i16 + i3;
        String graphic2 = getGraphic();
        int i18 = i17 * 59;
        if (graphic2 == null) {
            i4 = 43;
        } else {
            i4 = graphic2.hashCode();
        }
        int i19 = i18 + i4;
        Date added2 = getAdded();
        int i20 = i19 * 59;
        if (added2 == null) {
            i5 = 43;
        } else {
            i5 = added2.hashCode();
        }
        int i21 = i20 + i5;
        Date modified2 = getModified();
        int i22 = i21 * 59;
        if (modified2 == null) {
            i6 = 43;
        } else {
            i6 = modified2.hashCode();
        }
        int i23 = i22 + i6;
        Date updated2 = getUpdated();
        int i24 = i23 * 59;
        if (updated2 == null) {
            i7 = 43;
        } else {
            i7 = updated2.hashCode();
        }
        int i25 = i24 + i7;
        String uptype2 = getUptype();
        int i26 = i25 * 59;
        if (uptype2 == null) {
            i8 = 43;
        } else {
            i8 = uptype2.hashCode();
        }
        int i27 = i26 + i8;
        Store store2 = getStore();
        int i28 = i27 * 59;
        if (store2 == null) {
            i9 = 43;
        } else {
            i9 = store2.hashCode();
        }
        int i29 = i28 + i9;
        File file2 = getFile();
        int i30 = i29 * 59;
        if (file2 == null) {
            i10 = 43;
        } else {
            i10 = file2.hashCode();
        }
        int i31 = i30 + i10;
        Stats stats2 = getStats();
        int i32 = i31 * 59;
        if (stats2 == null) {
            i11 = 43;
        } else {
            i11 = stats2.hashCode();
        }
        int i33 = i32 + i11;
        Obb obb2 = getObb();
        int i34 = i33 * 59;
        if (obb2 != null) {
            i13 = obb2.hashCode();
        }
        return i34 + i13;
    }

    public void setAdded(Date date) {
        this.added = date;
    }

    public void setAppcoinsInfo(AppCoinsInfo appCoinsInfo) {
        this.appcoins = appCoinsInfo;
    }

    public void setFile(File file2) {
        this.file = file2;
    }

    public void setGraphic(String str) {
        this.graphic = str;
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public void setId(long j) {
        this.f4860id = j;
    }

    public void setModified(Date date) {
        this.modified = date;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setObb(Obb obb2) {
        this.obb = obb2;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }

    public void setSize(long j) {
        this.size = j;
    }

    public void setSplits(Aab aab2) {
        this.aab = aab2;
    }

    public void setStats(Stats stats2) {
        this.stats = stats2;
    }

    public void setStore(Store store2) {
        this.store = store2;
    }

    public void setUpdated(Date date) {
        this.updated = date;
    }

    public void setUptype(String str) {
        this.uptype = str;
    }

    public String toString() {
        return "App(id=" + getId() + ", name=" + getName() + ", packageName=" + getPackageName() + ", size=" + getSize() + ", icon=" + getIcon() + ", graphic=" + getGraphic() + ", added=" + getAdded() + ", modified=" + getModified() + ", updated=" + getUpdated() + ", uptype=" + getUptype() + ", store=" + getStore() + ", file=" + getFile() + ", stats=" + getStats() + ", obb=" + getObb() + ")";
    }
}
