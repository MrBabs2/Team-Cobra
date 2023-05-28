package p015cm.aptoide.p016pt.dataprovider.model.p020v7.store;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;

/* renamed from: cm.aptoide.pt.dataprovider.model.v7.store.Store */
public class Store {
    public static final String PUBLIC_ACCESS = "PUBLIC";
    private String access;
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss", timezone = "UTC")
    private Date added;
    private Appearance appearance;
    private String avatar;
    private Badge badge;

    /* renamed from: id */
    private long f4862id;
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss", timezone = "UTC")
    private Date modified;
    private String name;
    private Stats stats;
    private String status;
    private Urls urls;

    /* renamed from: cm.aptoide.pt.dataprovider.model.v7.store.Store$Appearance */
    public static class Appearance {
        private String description;
        private String theme;

        public Appearance() {
        }

        public String getDescription() {
            return this.description;
        }

        public String getTheme() {
            return this.theme;
        }

        public void setDescription(String str) {
            this.description = str;
        }

        public void setTheme(String str) {
            this.theme = str;
        }

        public Appearance(String str, String str2) {
            this.theme = str;
            this.description = str2;
        }
    }

    /* renamed from: cm.aptoide.pt.dataprovider.model.v7.store.Store$Badge */
    public static class Badge {
        BadgeType name;

        public BadgeType getName() {
            return this.name;
        }

        public void setName(BadgeType badgeType) {
            this.name = badgeType;
        }
    }

    /* renamed from: cm.aptoide.pt.dataprovider.model.v7.store.Store$BadgeType */
    public enum BadgeType {
        NONE,
        BRONZE,
        SILVER,
        GOLD,
        PLATINUM
    }

    /* renamed from: cm.aptoide.pt.dataprovider.model.v7.store.Store$Stats */
    public static class Stats {
        private int apps;
        private long downloads;
        private int subscribers;

        public int getApps() {
            return this.apps;
        }

        public long getDownloads() {
            return this.downloads;
        }

        public int getSubscribers() {
            return this.subscribers;
        }

        public void setApps(int i) {
            this.apps = i;
        }

        public void setDownloads(long j) {
            this.downloads = j;
        }

        public void setSubscribers(int i) {
            this.subscribers = i;
        }
    }

    /* renamed from: cm.aptoide.pt.dataprovider.model.v7.store.Store$Urls */
    public static class Urls {
        private String mobile;

        /* access modifiers changed from: protected */
        public boolean canEqual(Object obj) {
            return obj instanceof Urls;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Urls)) {
                return false;
            }
            Urls urls = (Urls) obj;
            if (!urls.canEqual(this)) {
                return false;
            }
            String mobile2 = getMobile();
            String mobile3 = urls.getMobile();
            return mobile2 != null ? mobile2.equals(mobile3) : mobile3 == null;
        }

        public String getMobile() {
            return this.mobile;
        }

        public int hashCode() {
            int i;
            String mobile2 = getMobile();
            if (mobile2 == null) {
                i = 43;
            } else {
                i = mobile2.hashCode();
            }
            return 59 + i;
        }

        public void setMobile(String str) {
            this.mobile = str;
        }

        public String toString() {
            return "Store.Urls(mobile=" + getMobile() + ")";
        }
    }

    public String getAccess() {
        return this.access;
    }

    public Date getAdded() {
        return this.added;
    }

    public Appearance getAppearance() {
        return this.appearance;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public Badge getBadge() {
        return this.badge;
    }

    public long getId() {
        return this.f4862id;
    }

    public Date getModified() {
        return this.modified;
    }

    public String getName() {
        return this.name;
    }

    public Stats getStats() {
        return this.stats;
    }

    public String getStatus() {
        return this.status;
    }

    public Urls getUrls() {
        return this.urls;
    }

    public void setAccess(String str) {
        this.access = str;
    }

    public void setAdded(Date date) {
        this.added = date;
    }

    public void setAppearance(Appearance appearance2) {
        this.appearance = appearance2;
    }

    public void setAvatar(String str) {
        this.avatar = str;
    }

    public void setBadge(Badge badge2) {
        this.badge = badge2;
    }

    public void setId(long j) {
        this.f4862id = j;
    }

    public void setModified(Date date) {
        this.modified = date;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setStats(Stats stats2) {
        this.stats = stats2;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public void setUrls(Urls urls2) {
        this.urls = urls2;
    }
}
