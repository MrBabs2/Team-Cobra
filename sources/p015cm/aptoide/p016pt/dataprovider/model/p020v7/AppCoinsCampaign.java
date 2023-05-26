package p015cm.aptoide.p016pt.dataprovider.model.p020v7;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.listapp.File;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.Store;

/* renamed from: cm.aptoide.pt.dataprovider.model.v7.AppCoinsCampaign */
public class AppCoinsCampaign {
    private CampaignApp app;
    private Budget budget;
    private String endDate;
    private Reward reward;

    /* renamed from: cm.aptoide.pt.dataprovider.model.v7.AppCoinsCampaign$Budget */
    public static class Budget {
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

    /* renamed from: cm.aptoide.pt.dataprovider.model.v7.AppCoinsCampaign$CampaignApp */
    public static class CampaignApp {
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "UTC")
        private Date added;
        private AppCoinsCampaignInfo appcoins;
        private File file;
        private String graphic;
        private boolean hasVersions;
        private String icon;

        /* renamed from: id */
        private long f4841id;
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "UTC")
        private Date modified;
        private String name;
        private Obb obb;
        @JsonProperty("package")
        private String packageName;
        private long size;
        private Stats stats;
        private Store store;
        private String uname;
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "UTC")
        private Date updated;
        private String uptype;

        /* renamed from: cm.aptoide.pt.dataprovider.model.v7.AppCoinsCampaign$CampaignApp$AppCoinsCampaignInfo */
        public static class AppCoinsCampaignInfo {
            private boolean advertising;
            private ClickUrls clicks;

            /* renamed from: cm.aptoide.pt.dataprovider.model.v7.AppCoinsCampaign$CampaignApp$AppCoinsCampaignInfo$ClickUrls */
            public static class ClickUrls {
                private String click;
                private String install;

                public String getClick() {
                    return this.click;
                }

                public String getInstall() {
                    return this.install;
                }

                public void setClick(String str) {
                    this.click = str;
                }

                public void setInstall(String str) {
                    this.install = str;
                }
            }

            public ClickUrls getClicks() {
                return this.clicks;
            }

            public boolean hasAdvertising() {
                return this.advertising;
            }

            public void setAdvertising(boolean z) {
                this.advertising = z;
            }

            public void setClicks(ClickUrls clickUrls) {
                this.clicks = clickUrls;
            }
        }

        /* renamed from: cm.aptoide.pt.dataprovider.model.v7.AppCoinsCampaign$CampaignApp$Stats */
        public static class Stats {
            private int downloads;
            private int pdownloads;
            private Rating prating;
            private Rating rating;

            /* renamed from: cm.aptoide.pt.dataprovider.model.v7.AppCoinsCampaign$CampaignApp$Stats$Rating */
            public static class Rating {
                private float avg;
                private int total;

                public float getAvg() {
                    return this.avg;
                }

                public int getTotal() {
                    return this.total;
                }

                public void setAvg(float f) {
                    this.avg = f;
                }

                public void setTotal(int i) {
                    this.total = i;
                }
            }

            public int getDownloads() {
                return this.downloads;
            }

            public int getPdownloads() {
                return this.pdownloads;
            }

            public Rating getPrating() {
                return this.prating;
            }

            public Rating getRating() {
                return this.rating;
            }

            public void setDownloads(int i) {
                this.downloads = i;
            }

            public void setPdownloads(int i) {
                this.pdownloads = i;
            }

            public void setPrating(Rating rating2) {
                this.prating = rating2;
            }

            public void setRating(Rating rating2) {
                this.rating = rating2;
            }
        }

        public Date getAdded() {
            return this.added;
        }

        public AppCoinsCampaignInfo getAppcoins() {
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
            return this.f4841id;
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

        public String getUname() {
            return this.uname;
        }

        public Date getUpdated() {
            return this.updated;
        }

        public String getUptype() {
            return this.uptype;
        }

        public boolean isHasVersions() {
            return this.hasVersions;
        }

        public void setAdded(Date date) {
            this.added = date;
        }

        public void setAppcoins(AppCoinsCampaignInfo appCoinsCampaignInfo) {
            this.appcoins = appCoinsCampaignInfo;
        }

        public void setFile(File file2) {
            this.file = file2;
        }

        public void setGraphic(String str) {
            this.graphic = str;
        }

        public void setHasVersions(boolean z) {
            this.hasVersions = z;
        }

        public void setIcon(String str) {
            this.icon = str;
        }

        public void setId(long j) {
            this.f4841id = j;
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

        public void setStats(Stats stats2) {
            this.stats = stats2;
        }

        public void setStore(Store store2) {
            this.store = store2;
        }

        public void setUname(String str) {
            this.uname = str;
        }

        public void setUpdated(Date date) {
            this.updated = date;
        }

        public void setUptype(String str) {
            this.uptype = str;
        }
    }

    /* renamed from: cm.aptoide.pt.dataprovider.model.v7.AppCoinsCampaign$Fiat */
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

    /* renamed from: cm.aptoide.pt.dataprovider.model.v7.AppCoinsCampaign$Reward */
    public static class Reward {
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

    public CampaignApp getApp() {
        return this.app;
    }

    public Budget getBudget() {
        return this.budget;
    }

    public String getEndDate() {
        return this.endDate;
    }

    public Reward getReward() {
        return this.reward;
    }

    public void setApp(CampaignApp campaignApp) {
        this.app = campaignApp;
    }

    public void setBudget(Budget budget2) {
        this.budget = budget2;
    }

    public void setEndDate(String str) {
        this.endDate = str;
    }

    public void setReward(Reward reward2) {
        this.reward = reward2;
    }
}
