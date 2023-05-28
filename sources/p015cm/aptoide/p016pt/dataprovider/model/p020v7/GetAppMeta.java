package p015cm.aptoide.p016pt.dataprovider.model.p020v7;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.listapp.AppCoinsInfo;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.listapp.File;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.Store;

/* renamed from: cm.aptoide.pt.dataprovider.model.v7.GetAppMeta */
public class GetAppMeta extends BaseV7Response {
    private App data;

    /* renamed from: cm.aptoide.pt.dataprovider.model.v7.GetAppMeta$Age */
    public static class Age {
        private String name;
        private String pegi;
        private int rating;
        private String title;

        public String getName() {
            return this.name;
        }

        public String getPegi() {
            return this.pegi;
        }

        public int getRating() {
            return this.rating;
        }

        public String getTitle() {
            return this.title;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setPegi(String str) {
            this.pegi = str;
        }

        public void setRating(int i) {
            this.rating = i;
        }

        public void setTitle(String str) {
            this.title = str;
        }
    }

    /* renamed from: cm.aptoide.pt.dataprovider.model.v7.GetAppMeta$App */
    public static class App {
        private Aab aab;
        private String added;
        private Age age;
        private AppCoinsInfo appcoins;
        private Developer developer;
        private GetAppMetaFile file;
        private String graphic;
        private String icon;

        /* renamed from: id */
        private long f4848id;
        private Media media;
        private String modified;
        private String name;
        private Obb obb;
        @JsonProperty("package")
        private String packageName;
        private long size;
        private Stats stats;
        private Store store;
        private Urls urls;

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
            String added2 = getAdded();
            String added3 = app.getAdded();
            if (added2 != null ? !added2.equals(added3) : added3 != null) {
                return false;
            }
            String modified2 = getModified();
            String modified3 = app.getModified();
            if (modified2 != null ? !modified2.equals(modified3) : modified3 != null) {
                return false;
            }
            Developer developer2 = getDeveloper();
            Developer developer3 = app.getDeveloper();
            if (developer2 != null ? !developer2.equals(developer3) : developer3 != null) {
                return false;
            }
            Store store2 = getStore();
            Store store3 = app.getStore();
            if (store2 != null ? !store2.equals(store3) : store3 != null) {
                return false;
            }
            GetAppMetaFile file2 = getFile();
            GetAppMetaFile file3 = app.getFile();
            if (file2 != null ? !file2.equals(file3) : file3 != null) {
                return false;
            }
            Media media2 = getMedia();
            Media media3 = app.getMedia();
            if (media2 != null ? !media2.equals(media3) : media3 != null) {
                return false;
            }
            Urls urls2 = getUrls();
            Urls urls3 = app.getUrls();
            if (urls2 != null ? !urls2.equals(urls3) : urls3 != null) {
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

        public String getAdded() {
            return this.added;
        }

        public Age getAge() {
            return this.age;
        }

        public List<String> getBdsFlags() {
            return this.appcoins.getFlags();
        }

        public Developer getDeveloper() {
            return this.developer;
        }

        public GetAppMetaFile getFile() {
            return this.file;
        }

        public String getGraphic() {
            return this.graphic;
        }

        public String getIcon() {
            return this.icon;
        }

        public long getId() {
            return this.f4848id;
        }

        public String getMd5() {
            GetAppMetaFile getAppMetaFile = this.file;
            return getAppMetaFile == null ? "" : getAppMetaFile.getMd5sum();
        }

        public Media getMedia() {
            return this.media;
        }

        public String getModified() {
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

        public Urls getUrls() {
            return this.urls;
        }

        public boolean hasAdvertising() {
            AppCoinsInfo appCoinsInfo = this.appcoins;
            return appCoinsInfo != null && appCoinsInfo.hasAdvertising();
        }

        public boolean hasBilling() {
            AppCoinsInfo appCoinsInfo = this.appcoins;
            return appCoinsInfo != null && appCoinsInfo.hasBilling();
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
            int i12;
            long id = getId();
            String name2 = getName();
            int i13 = (((int) (id ^ (id >>> 32))) + 59) * 59;
            int i14 = 43;
            if (name2 == null) {
                i = 43;
            } else {
                i = name2.hashCode();
            }
            int i15 = i13 + i;
            String packageName2 = getPackageName();
            int i16 = i15 * 59;
            if (packageName2 == null) {
                i2 = 43;
            } else {
                i2 = packageName2.hashCode();
            }
            long size2 = getSize();
            String icon2 = getIcon();
            int i17 = (((i16 + i2) * 59) + ((int) ((size2 >>> 32) ^ size2))) * 59;
            if (icon2 == null) {
                i3 = 43;
            } else {
                i3 = icon2.hashCode();
            }
            int i18 = i17 + i3;
            String graphic2 = getGraphic();
            int i19 = i18 * 59;
            if (graphic2 == null) {
                i4 = 43;
            } else {
                i4 = graphic2.hashCode();
            }
            int i20 = i19 + i4;
            String added2 = getAdded();
            int i21 = i20 * 59;
            if (added2 == null) {
                i5 = 43;
            } else {
                i5 = added2.hashCode();
            }
            int i22 = i21 + i5;
            String modified2 = getModified();
            int i23 = i22 * 59;
            if (modified2 == null) {
                i6 = 43;
            } else {
                i6 = modified2.hashCode();
            }
            int i24 = i23 + i6;
            Developer developer2 = getDeveloper();
            int i25 = i24 * 59;
            if (developer2 == null) {
                i7 = 43;
            } else {
                i7 = developer2.hashCode();
            }
            int i26 = i25 + i7;
            Store store2 = getStore();
            int i27 = i26 * 59;
            if (store2 == null) {
                i8 = 43;
            } else {
                i8 = store2.hashCode();
            }
            int i28 = i27 + i8;
            GetAppMetaFile file2 = getFile();
            int i29 = i28 * 59;
            if (file2 == null) {
                i9 = 43;
            } else {
                i9 = file2.hashCode();
            }
            int i30 = i29 + i9;
            Media media2 = getMedia();
            int i31 = i30 * 59;
            if (media2 == null) {
                i10 = 43;
            } else {
                i10 = media2.hashCode();
            }
            int i32 = i31 + i10;
            Urls urls2 = getUrls();
            int i33 = i32 * 59;
            if (urls2 == null) {
                i11 = 43;
            } else {
                i11 = urls2.hashCode();
            }
            int i34 = i33 + i11;
            Stats stats2 = getStats();
            int i35 = i34 * 59;
            if (stats2 == null) {
                i12 = 43;
            } else {
                i12 = stats2.hashCode();
            }
            int i36 = i35 + i12;
            Obb obb2 = getObb();
            int i37 = i36 * 59;
            if (obb2 != null) {
                i14 = obb2.hashCode();
            }
            return i37 + i14;
        }

        public void setAab(Aab aab2) {
            this.aab = aab2;
        }

        public void setAdded(String str) {
            this.added = str;
        }

        public void setAge(Age age2) {
            this.age = age2;
        }

        public void setAppcoins(AppCoinsInfo appCoinsInfo) {
            this.appcoins = appCoinsInfo;
        }

        public void setDeveloper(Developer developer2) {
            this.developer = developer2;
        }

        public void setFile(GetAppMetaFile getAppMetaFile) {
            this.file = getAppMetaFile;
        }

        public void setGraphic(String str) {
            this.graphic = str;
        }

        public void setIcon(String str) {
            this.icon = str;
        }

        public void setId(long j) {
            this.f4848id = j;
        }

        public void setMedia(Media media2) {
            this.media = media2;
        }

        public void setModified(String str) {
            this.modified = str;
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

        public void setUrls(Urls urls2) {
            this.urls = urls2;
        }

        public String toString() {
            return "GetAppMeta.App(id=" + getId() + ", name=" + getName() + ", packageName=" + getPackageName() + ", size=" + getSize() + ", icon=" + getIcon() + ", graphic=" + getGraphic() + ", added=" + getAdded() + ", modified=" + getModified() + ", developer=" + getDeveloper() + ", store=" + getStore() + ", file=" + getFile() + ", media=" + getMedia() + ", urls=" + getUrls() + ", stats=" + getStats() + ", obb=" + getObb() + ")";
        }
    }

    /* renamed from: cm.aptoide.pt.dataprovider.model.v7.GetAppMeta$Developer */
    public static class Developer {
        private String email;
        private String name;
        private String privacy;
        private String website;

        /* access modifiers changed from: protected */
        public boolean canEqual(Object obj) {
            return obj instanceof Developer;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Developer)) {
                return false;
            }
            Developer developer = (Developer) obj;
            if (!developer.canEqual(this)) {
                return false;
            }
            String name2 = getName();
            String name3 = developer.getName();
            if (name2 != null ? !name2.equals(name3) : name3 != null) {
                return false;
            }
            String website2 = getWebsite();
            String website3 = developer.getWebsite();
            if (website2 != null ? !website2.equals(website3) : website3 != null) {
                return false;
            }
            String email2 = getEmail();
            String email3 = developer.getEmail();
            if (email2 != null ? !email2.equals(email3) : email3 != null) {
                return false;
            }
            String privacy2 = getPrivacy();
            String privacy3 = developer.getPrivacy();
            return privacy2 != null ? privacy2.equals(privacy3) : privacy3 == null;
        }

        public String getEmail() {
            return this.email;
        }

        public String getName() {
            return this.name;
        }

        public String getPrivacy() {
            return this.privacy;
        }

        public String getWebsite() {
            return this.website;
        }

        public int hashCode() {
            int i;
            int i2;
            int i3;
            String name2 = getName();
            int i4 = 43;
            if (name2 == null) {
                i = 43;
            } else {
                i = name2.hashCode();
            }
            String website2 = getWebsite();
            int i5 = (i + 59) * 59;
            if (website2 == null) {
                i2 = 43;
            } else {
                i2 = website2.hashCode();
            }
            int i6 = i5 + i2;
            String email2 = getEmail();
            int i7 = i6 * 59;
            if (email2 == null) {
                i3 = 43;
            } else {
                i3 = email2.hashCode();
            }
            int i8 = i7 + i3;
            String privacy2 = getPrivacy();
            int i9 = i8 * 59;
            if (privacy2 != null) {
                i4 = privacy2.hashCode();
            }
            return i9 + i4;
        }

        public void setEmail(String str) {
            this.email = str;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setPrivacy(String str) {
            this.privacy = str;
        }

        public void setWebsite(String str) {
            this.website = str;
        }

        public String toString() {
            return "GetAppMeta.Developer(name=" + getName() + ", website=" + getWebsite() + ", email=" + getEmail() + ", privacy=" + getPrivacy() + ")";
        }
    }

    /* renamed from: cm.aptoide.pt.dataprovider.model.v7.GetAppMeta$GetAppMetaFile */
    public static class GetAppMetaFile extends File {
        private Flags flags;
        private Hardware hardware;
        private Malware malware;
        private Signature signature;
        private List<String> tags;
        private List<String> usedFeatures;
        private List<String> usedPermissions;

        /* renamed from: cm.aptoide.pt.dataprovider.model.v7.GetAppMeta$GetAppMetaFile$Flags */
        public static class Flags {
            public static final String GOOD = "GOOD";
            public String review;
            private List<Vote> votes;

            /* renamed from: cm.aptoide.pt.dataprovider.model.v7.GetAppMeta$GetAppMetaFile$Flags$Vote */
            public static class Vote {
                private int count;
                private Type type;

                /* renamed from: cm.aptoide.pt.dataprovider.model.v7.GetAppMeta$GetAppMetaFile$Flags$Vote$Type */
                public enum Type {
                    FAKE,
                    FREEZE,
                    GOOD,
                    LICENSE,
                    VIRUS
                }

                /* access modifiers changed from: protected */
                public boolean canEqual(Object obj) {
                    return obj instanceof Vote;
                }

                public boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof Vote)) {
                        return false;
                    }
                    Vote vote = (Vote) obj;
                    if (!vote.canEqual(this)) {
                        return false;
                    }
                    Type type2 = getType();
                    Type type3 = vote.getType();
                    if (type2 != null ? type2.equals(type3) : type3 == null) {
                        return getCount() == vote.getCount();
                    }
                    return false;
                }

                public int getCount() {
                    return this.count;
                }

                public Type getType() {
                    return this.type;
                }

                public int hashCode() {
                    int i;
                    Type type2 = getType();
                    if (type2 == null) {
                        i = 43;
                    } else {
                        i = type2.hashCode();
                    }
                    return ((i + 59) * 59) + getCount();
                }

                public void setCount(int i) {
                    this.count = i;
                }

                public void setType(Type type2) {
                    this.type = type2;
                }

                public String toString() {
                    return "GetAppMeta.GetAppMetaFile.Flags.Vote(type=" + getType() + ", count=" + getCount() + ")";
                }
            }

            /* access modifiers changed from: protected */
            public boolean canEqual(Object obj) {
                return obj instanceof Flags;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Flags)) {
                    return false;
                }
                Flags flags = (Flags) obj;
                if (!flags.canEqual(this)) {
                    return false;
                }
                String review2 = getReview();
                String review3 = flags.getReview();
                if (review2 != null ? !review2.equals(review3) : review3 != null) {
                    return false;
                }
                List<Vote> votes2 = getVotes();
                List<Vote> votes3 = flags.getVotes();
                return votes2 != null ? votes2.equals(votes3) : votes3 == null;
            }

            public String getReview() {
                return this.review;
            }

            public List<Vote> getVotes() {
                return this.votes;
            }

            public int hashCode() {
                int i;
                String review2 = getReview();
                int i2 = 43;
                if (review2 == null) {
                    i = 43;
                } else {
                    i = review2.hashCode();
                }
                List<Vote> votes2 = getVotes();
                int i3 = (i + 59) * 59;
                if (votes2 != null) {
                    i2 = votes2.hashCode();
                }
                return i3 + i2;
            }

            public void setReview(String str) {
                this.review = str;
            }

            public void setVotes(List<Vote> list) {
                this.votes = list;
            }

            public String toString() {
                return "GetAppMeta.GetAppMetaFile.Flags(review=" + getReview() + ", votes=" + getVotes() + ")";
            }
        }

        /* renamed from: cm.aptoide.pt.dataprovider.model.v7.GetAppMeta$GetAppMetaFile$Hardware */
        public static class Hardware {
            private List<String> cpus;
            private List<List<Integer>> densities;
            private int gles;
            private String screen;
            private int sdk;

            /* access modifiers changed from: protected */
            public boolean canEqual(Object obj) {
                return obj instanceof Hardware;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Hardware)) {
                    return false;
                }
                Hardware hardware = (Hardware) obj;
                if (!hardware.canEqual(this) || getSdk() != hardware.getSdk()) {
                    return false;
                }
                String screen2 = getScreen();
                String screen3 = hardware.getScreen();
                if (screen2 != null ? !screen2.equals(screen3) : screen3 != null) {
                    return false;
                }
                if (getGles() != hardware.getGles()) {
                    return false;
                }
                List<String> cpus2 = getCpus();
                List<String> cpus3 = hardware.getCpus();
                if (cpus2 != null ? !cpus2.equals(cpus3) : cpus3 != null) {
                    return false;
                }
                List<List<Integer>> densities2 = getDensities();
                List<List<Integer>> densities3 = hardware.getDensities();
                return densities2 != null ? densities2.equals(densities3) : densities3 == null;
            }

            public List<String> getCpus() {
                return this.cpus;
            }

            public List<List<Integer>> getDensities() {
                return this.densities;
            }

            public int getGles() {
                return this.gles;
            }

            public String getScreen() {
                return this.screen;
            }

            public int getSdk() {
                return this.sdk;
            }

            public int hashCode() {
                int i;
                int i2;
                String screen2 = getScreen();
                int sdk2 = (getSdk() + 59) * 59;
                int i3 = 43;
                if (screen2 == null) {
                    i = 43;
                } else {
                    i = screen2.hashCode();
                }
                int gles2 = ((sdk2 + i) * 59) + getGles();
                List<String> cpus2 = getCpus();
                int i4 = gles2 * 59;
                if (cpus2 == null) {
                    i2 = 43;
                } else {
                    i2 = cpus2.hashCode();
                }
                int i5 = i4 + i2;
                List<List<Integer>> densities2 = getDensities();
                int i6 = i5 * 59;
                if (densities2 != null) {
                    i3 = densities2.hashCode();
                }
                return i6 + i3;
            }

            public void setCpus(List<String> list) {
                this.cpus = list;
            }

            public void setDensities(List<List<Integer>> list) {
                this.densities = list;
            }

            public void setGles(int i) {
                this.gles = i;
            }

            public void setScreen(String str) {
                this.screen = str;
            }

            public void setSdk(int i) {
                this.sdk = i;
            }

            public String toString() {
                return "GetAppMeta.GetAppMetaFile.Hardware(sdk=" + getSdk() + ", screen=" + getScreen() + ", gles=" + getGles() + ", cpus=" + getCpus() + ", densities=" + getDensities() + ")";
            }
        }

        /* renamed from: cm.aptoide.pt.dataprovider.model.v7.GetAppMeta$GetAppMetaFile$Signature */
        public static class Signature {
            private String owner;
            private String sha1;

            /* access modifiers changed from: protected */
            public boolean canEqual(Object obj) {
                return obj instanceof Signature;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Signature)) {
                    return false;
                }
                Signature signature = (Signature) obj;
                if (!signature.canEqual(this)) {
                    return false;
                }
                String sha12 = getSha1();
                String sha13 = signature.getSha1();
                if (sha12 != null ? !sha12.equals(sha13) : sha13 != null) {
                    return false;
                }
                String owner2 = getOwner();
                String owner3 = signature.getOwner();
                return owner2 != null ? owner2.equals(owner3) : owner3 == null;
            }

            public String getOwner() {
                return this.owner;
            }

            public String getSha1() {
                return this.sha1;
            }

            public int hashCode() {
                int i;
                String sha12 = getSha1();
                int i2 = 43;
                if (sha12 == null) {
                    i = 43;
                } else {
                    i = sha12.hashCode();
                }
                String owner2 = getOwner();
                int i3 = (i + 59) * 59;
                if (owner2 != null) {
                    i2 = owner2.hashCode();
                }
                return i3 + i2;
            }

            public void setOwner(String str) {
                this.owner = str;
            }

            public void setSha1(String str) {
                this.sha1 = str;
            }

            public String toString() {
                return "GetAppMeta.GetAppMetaFile.Signature(sha1=" + getSha1() + ", owner=" + getOwner() + ")";
            }
        }

        /* access modifiers changed from: protected */
        public boolean canEqual(Object obj) {
            return obj instanceof GetAppMetaFile;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetAppMetaFile)) {
                return false;
            }
            GetAppMetaFile getAppMetaFile = (GetAppMetaFile) obj;
            if (!getAppMetaFile.canEqual(this) || !super.equals(obj)) {
                return false;
            }
            Signature signature2 = getSignature();
            Signature signature3 = getAppMetaFile.getSignature();
            if (signature2 != null ? !signature2.equals(signature3) : signature3 != null) {
                return false;
            }
            Hardware hardware2 = getHardware();
            Hardware hardware3 = getAppMetaFile.getHardware();
            if (hardware2 != null ? !hardware2.equals(hardware3) : hardware3 != null) {
                return false;
            }
            Malware malware2 = getMalware();
            Malware malware3 = getAppMetaFile.getMalware();
            if (malware2 != null ? !malware2.equals(malware3) : malware3 != null) {
                return false;
            }
            Flags flags2 = getFlags();
            Flags flags3 = getAppMetaFile.getFlags();
            if (flags2 != null ? !flags2.equals(flags3) : flags3 != null) {
                return false;
            }
            List<String> usedFeatures2 = getUsedFeatures();
            List<String> usedFeatures3 = getAppMetaFile.getUsedFeatures();
            if (usedFeatures2 != null ? !usedFeatures2.equals(usedFeatures3) : usedFeatures3 != null) {
                return false;
            }
            List<String> usedPermissions2 = getUsedPermissions();
            List<String> usedPermissions3 = getAppMetaFile.getUsedPermissions();
            if (usedPermissions2 != null ? !usedPermissions2.equals(usedPermissions3) : usedPermissions3 != null) {
                return false;
            }
            List<String> tags2 = getTags();
            List<String> tags3 = getAppMetaFile.getTags();
            return tags2 != null ? tags2.equals(tags3) : tags3 == null;
        }

        public Flags getFlags() {
            return this.flags;
        }

        public Hardware getHardware() {
            return this.hardware;
        }

        public Malware getMalware() {
            return this.malware;
        }

        public Signature getSignature() {
            return this.signature;
        }

        public List<String> getTags() {
            return this.tags;
        }

        public List<String> getUsedFeatures() {
            return this.usedFeatures;
        }

        public List<String> getUsedPermissions() {
            return this.usedPermissions;
        }

        public int hashCode() {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            Signature signature2 = getSignature();
            int hashCode = (super.hashCode() + 59) * 59;
            int i7 = 43;
            if (signature2 == null) {
                i = 43;
            } else {
                i = signature2.hashCode();
            }
            int i8 = hashCode + i;
            Hardware hardware2 = getHardware();
            int i9 = i8 * 59;
            if (hardware2 == null) {
                i2 = 43;
            } else {
                i2 = hardware2.hashCode();
            }
            int i10 = i9 + i2;
            Malware malware2 = getMalware();
            int i11 = i10 * 59;
            if (malware2 == null) {
                i3 = 43;
            } else {
                i3 = malware2.hashCode();
            }
            int i12 = i11 + i3;
            Flags flags2 = getFlags();
            int i13 = i12 * 59;
            if (flags2 == null) {
                i4 = 43;
            } else {
                i4 = flags2.hashCode();
            }
            int i14 = i13 + i4;
            List<String> usedFeatures2 = getUsedFeatures();
            int i15 = i14 * 59;
            if (usedFeatures2 == null) {
                i5 = 43;
            } else {
                i5 = usedFeatures2.hashCode();
            }
            int i16 = i15 + i5;
            List<String> usedPermissions2 = getUsedPermissions();
            int i17 = i16 * 59;
            if (usedPermissions2 == null) {
                i6 = 43;
            } else {
                i6 = usedPermissions2.hashCode();
            }
            int i18 = i17 + i6;
            List<String> tags2 = getTags();
            int i19 = i18 * 59;
            if (tags2 != null) {
                i7 = tags2.hashCode();
            }
            return i19 + i7;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
            r0 = r0.review;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean isGoodApp() {
            /*
                r2 = this;
                cm.aptoide.pt.dataprovider.model.v7.GetAppMeta$GetAppMetaFile$Flags r0 = r2.flags
                if (r0 == 0) goto L_0x0012
                java.lang.String r0 = r0.review
                if (r0 == 0) goto L_0x0012
                java.lang.String r1 = "GOOD"
                boolean r0 = r0.equalsIgnoreCase(r1)
                if (r0 == 0) goto L_0x0012
                r0 = 1
                goto L_0x0013
            L_0x0012:
                r0 = 0
            L_0x0013:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.dataprovider.model.p020v7.GetAppMeta.GetAppMetaFile.isGoodApp():boolean");
        }

        public void setFlags(Flags flags2) {
            this.flags = flags2;
        }

        public void setHardware(Hardware hardware2) {
            this.hardware = hardware2;
        }

        public void setMalware(Malware malware2) {
            this.malware = malware2;
        }

        public void setSignature(Signature signature2) {
            this.signature = signature2;
        }

        public void setTags(List<String> list) {
            this.tags = list;
        }

        public void setUsedFeatures(List<String> list) {
            this.usedFeatures = list;
        }

        public void setUsedPermissions(List<String> list) {
            this.usedPermissions = list;
        }

        public String toString() {
            return "GetAppMeta.GetAppMetaFile(signature=" + getSignature() + ", hardware=" + getHardware() + ", malware=" + getMalware() + ", flags=" + getFlags() + ", usedFeatures=" + getUsedFeatures() + ", usedPermissions=" + getUsedPermissions() + ", tags=" + getTags() + ")";
        }
    }

    /* renamed from: cm.aptoide.pt.dataprovider.model.v7.GetAppMeta$Media */
    public static class Media {
        private String description;
        private List<String> keywords;
        private String news;
        private List<Screenshot> screenshots;
        private List<Video> videos;

        /* renamed from: cm.aptoide.pt.dataprovider.model.v7.GetAppMeta$Media$Screenshot */
        public static class Screenshot {
            private int height;
            private String url;
            private int width;

            /* access modifiers changed from: protected */
            public boolean canEqual(Object obj) {
                return obj instanceof Screenshot;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Screenshot)) {
                    return false;
                }
                Screenshot screenshot = (Screenshot) obj;
                if (!screenshot.canEqual(this)) {
                    return false;
                }
                String url2 = getUrl();
                String url3 = screenshot.getUrl();
                if (url2 != null ? url2.equals(url3) : url3 == null) {
                    return getHeight() == screenshot.getHeight() && getWidth() == screenshot.getWidth();
                }
                return false;
            }

            public int getHeight() {
                return this.height;
            }

            public String getOrientation() {
                return this.height > this.width ? "portrait" : "landscape";
            }

            public String getUrl() {
                return this.url;
            }

            public int getWidth() {
                return this.width;
            }

            public int hashCode() {
                int i;
                String url2 = getUrl();
                if (url2 == null) {
                    i = 43;
                } else {
                    i = url2.hashCode();
                }
                return ((((i + 59) * 59) + getHeight()) * 59) + getWidth();
            }

            public void setHeight(int i) {
                this.height = i;
            }

            public void setUrl(String str) {
                this.url = str;
            }

            public void setWidth(int i) {
                this.width = i;
            }

            public String toString() {
                return "GetAppMeta.Media.Screenshot(url=" + getUrl() + ", height=" + getHeight() + ", width=" + getWidth() + ")";
            }
        }

        /* renamed from: cm.aptoide.pt.dataprovider.model.v7.GetAppMeta$Media$Video */
        public static class Video {
            private String thumbnail;
            private String type;
            private String url;

            /* access modifiers changed from: protected */
            public boolean canEqual(Object obj) {
                return obj instanceof Video;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Video)) {
                    return false;
                }
                Video video = (Video) obj;
                if (!video.canEqual(this)) {
                    return false;
                }
                String type2 = getType();
                String type3 = video.getType();
                if (type2 != null ? !type2.equals(type3) : type3 != null) {
                    return false;
                }
                String url2 = getUrl();
                String url3 = video.getUrl();
                if (url2 != null ? !url2.equals(url3) : url3 != null) {
                    return false;
                }
                String thumbnail2 = getThumbnail();
                String thumbnail3 = video.getThumbnail();
                return thumbnail2 != null ? thumbnail2.equals(thumbnail3) : thumbnail3 == null;
            }

            public String getThumbnail() {
                return this.thumbnail;
            }

            public String getType() {
                return this.type;
            }

            public String getUrl() {
                return this.url;
            }

            public int hashCode() {
                int i;
                int i2;
                String type2 = getType();
                int i3 = 43;
                if (type2 == null) {
                    i = 43;
                } else {
                    i = type2.hashCode();
                }
                String url2 = getUrl();
                int i4 = (i + 59) * 59;
                if (url2 == null) {
                    i2 = 43;
                } else {
                    i2 = url2.hashCode();
                }
                int i5 = i4 + i2;
                String thumbnail2 = getThumbnail();
                int i6 = i5 * 59;
                if (thumbnail2 != null) {
                    i3 = thumbnail2.hashCode();
                }
                return i6 + i3;
            }

            public void setThumbnail(String str) {
                this.thumbnail = str;
            }

            public void setType(String str) {
                this.type = str;
            }

            public void setUrl(String str) {
                this.url = str;
            }

            public String toString() {
                return "GetAppMeta.Media.Video(type=" + getType() + ", url=" + getUrl() + ", thumbnail=" + getThumbnail() + ")";
            }
        }

        /* access modifiers changed from: protected */
        public boolean canEqual(Object obj) {
            return obj instanceof Media;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Media)) {
                return false;
            }
            Media media = (Media) obj;
            if (!media.canEqual(this)) {
                return false;
            }
            List<String> keywords2 = getKeywords();
            List<String> keywords3 = media.getKeywords();
            if (keywords2 != null ? !keywords2.equals(keywords3) : keywords3 != null) {
                return false;
            }
            String description2 = getDescription();
            String description3 = media.getDescription();
            if (description2 != null ? !description2.equals(description3) : description3 != null) {
                return false;
            }
            String news2 = getNews();
            String news3 = media.getNews();
            if (news2 != null ? !news2.equals(news3) : news3 != null) {
                return false;
            }
            List<Screenshot> screenshots2 = getScreenshots();
            List<Screenshot> screenshots3 = media.getScreenshots();
            if (screenshots2 != null ? !screenshots2.equals(screenshots3) : screenshots3 != null) {
                return false;
            }
            List<Video> videos2 = getVideos();
            List<Video> videos3 = media.getVideos();
            return videos2 != null ? videos2.equals(videos3) : videos3 == null;
        }

        public String getDescription() {
            return this.description;
        }

        public List<String> getKeywords() {
            return this.keywords;
        }

        public String getNews() {
            return this.news;
        }

        public List<Screenshot> getScreenshots() {
            return this.screenshots;
        }

        public List<Video> getVideos() {
            return this.videos;
        }

        public int hashCode() {
            int i;
            int i2;
            int i3;
            int i4;
            List<String> keywords2 = getKeywords();
            int i5 = 43;
            if (keywords2 == null) {
                i = 43;
            } else {
                i = keywords2.hashCode();
            }
            String description2 = getDescription();
            int i6 = (i + 59) * 59;
            if (description2 == null) {
                i2 = 43;
            } else {
                i2 = description2.hashCode();
            }
            int i7 = i6 + i2;
            String news2 = getNews();
            int i8 = i7 * 59;
            if (news2 == null) {
                i3 = 43;
            } else {
                i3 = news2.hashCode();
            }
            int i9 = i8 + i3;
            List<Screenshot> screenshots2 = getScreenshots();
            int i10 = i9 * 59;
            if (screenshots2 == null) {
                i4 = 43;
            } else {
                i4 = screenshots2.hashCode();
            }
            int i11 = i10 + i4;
            List<Video> videos2 = getVideos();
            int i12 = i11 * 59;
            if (videos2 != null) {
                i5 = videos2.hashCode();
            }
            return i12 + i5;
        }

        public void setDescription(String str) {
            this.description = str;
        }

        public void setKeywords(List<String> list) {
            this.keywords = list;
        }

        public void setNews(String str) {
            this.news = str;
        }

        public void setScreenshots(List<Screenshot> list) {
            this.screenshots = list;
        }

        public void setVideos(List<Video> list) {
            this.videos = list;
        }

        public String toString() {
            return "GetAppMeta.Media(keywords=" + getKeywords() + ", description=" + getDescription() + ", news=" + getNews() + ", screenshots=" + getScreenshots() + ", videos=" + getVideos() + ")";
        }
    }

    /* renamed from: cm.aptoide.pt.dataprovider.model.v7.GetAppMeta$Stats */
    public static class Stats {
        private int downloads;
        @JsonProperty("prating")
        private Rating globalRating;
        private int pdownloads;
        private Rating rating;

        /* renamed from: cm.aptoide.pt.dataprovider.model.v7.GetAppMeta$Stats$Rating */
        public static class Rating {
            private float avg;
            private int total;
            private List<Vote> votes;

            /* renamed from: cm.aptoide.pt.dataprovider.model.v7.GetAppMeta$Stats$Rating$Vote */
            public static class Vote {
                private int count;
                private int value;

                /* access modifiers changed from: protected */
                public boolean canEqual(Object obj) {
                    return obj instanceof Vote;
                }

                public boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof Vote)) {
                        return false;
                    }
                    Vote vote = (Vote) obj;
                    return vote.canEqual(this) && getValue() == vote.getValue() && getCount() == vote.getCount();
                }

                public int getCount() {
                    return this.count;
                }

                public int getValue() {
                    return this.value;
                }

                public int hashCode() {
                    return ((getValue() + 59) * 59) + getCount();
                }

                public void setCount(int i) {
                    this.count = i;
                }

                public void setValue(int i) {
                    this.value = i;
                }

                public String toString() {
                    return "GetAppMeta.Stats.Rating.Vote(value=" + getValue() + ", count=" + getCount() + ")";
                }
            }

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
                if (!rating.canEqual(this) || Float.compare(getAvg(), rating.getAvg()) != 0 || getTotal() != rating.getTotal()) {
                    return false;
                }
                List<Vote> votes2 = getVotes();
                List<Vote> votes3 = rating.getVotes();
                return votes2 != null ? votes2.equals(votes3) : votes3 == null;
            }

            public float getAvg() {
                return this.avg;
            }

            public int getTotal() {
                return this.total;
            }

            public List<Vote> getVotes() {
                return this.votes;
            }

            public int hashCode() {
                int i;
                int floatToIntBits = ((Float.floatToIntBits(getAvg()) + 59) * 59) + getTotal();
                List<Vote> votes2 = getVotes();
                int i2 = floatToIntBits * 59;
                if (votes2 == null) {
                    i = 43;
                } else {
                    i = votes2.hashCode();
                }
                return i2 + i;
            }

            public void setAvg(float f) {
                this.avg = f;
            }

            public void setTotal(int i) {
                this.total = i;
            }

            public void setVotes(List<Vote> list) {
                this.votes = list;
            }

            public String toString() {
                return "GetAppMeta.Stats.Rating(avg=" + getAvg() + ", total=" + getTotal() + ", votes=" + getVotes() + ")";
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
            if (!stats.canEqual(this)) {
                return false;
            }
            Rating rating2 = getRating();
            Rating rating3 = stats.getRating();
            if (rating2 != null ? !rating2.equals(rating3) : rating3 != null) {
                return false;
            }
            Rating globalRating2 = getGlobalRating();
            Rating globalRating3 = stats.getGlobalRating();
            if (globalRating2 != null ? globalRating2.equals(globalRating3) : globalRating3 == null) {
                return getDownloads() == stats.getDownloads() && getPdownloads() == stats.getPdownloads();
            }
            return false;
        }

        public int getDownloads() {
            return this.downloads;
        }

        public Rating getGlobalRating() {
            return this.globalRating;
        }

        public int getPdownloads() {
            return this.pdownloads;
        }

        public Rating getRating() {
            return this.rating;
        }

        public int hashCode() {
            int i;
            Rating rating2 = getRating();
            int i2 = 43;
            if (rating2 == null) {
                i = 43;
            } else {
                i = rating2.hashCode();
            }
            Rating globalRating2 = getGlobalRating();
            int i3 = (i + 59) * 59;
            if (globalRating2 != null) {
                i2 = globalRating2.hashCode();
            }
            return ((((i3 + i2) * 59) + getDownloads()) * 59) + getPdownloads();
        }

        public void setDownloads(int i) {
            this.downloads = i;
        }

        public void setGlobalRating(Rating rating2) {
            this.globalRating = rating2;
        }

        public void setPdownloads(int i) {
            this.pdownloads = i;
        }

        public void setRating(Rating rating2) {
            this.rating = rating2;
        }

        public String toString() {
            return "GetAppMeta.Stats(rating=" + getRating() + ", globalRating=" + getGlobalRating() + ", downloads=" + getDownloads() + ", pdownloads=" + getPdownloads() + ")";
        }
    }

    /* renamed from: cm.aptoide.pt.dataprovider.model.v7.GetAppMeta$Urls */
    public static class Urls {

        /* renamed from: m */
        private String f4849m;

        /* renamed from: w */
        private String f4850w;

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
            String w = getW();
            String w2 = urls.getW();
            if (w != null ? !w.equals(w2) : w2 != null) {
                return false;
            }
            String m = getM();
            String m2 = urls.getM();
            return m != null ? m.equals(m2) : m2 == null;
        }

        public String getM() {
            return this.f4849m;
        }

        public String getW() {
            return this.f4850w;
        }

        public int hashCode() {
            int i;
            String w = getW();
            int i2 = 43;
            if (w == null) {
                i = 43;
            } else {
                i = w.hashCode();
            }
            String m = getM();
            int i3 = (i + 59) * 59;
            if (m != null) {
                i2 = m.hashCode();
            }
            return i3 + i2;
        }

        public void setM(String str) {
            this.f4849m = str;
        }

        public void setW(String str) {
            this.f4850w = str;
        }

        public String toString() {
            return "GetAppMeta.Urls(w=" + getW() + ", m=" + getM() + ")";
        }
    }

    /* access modifiers changed from: protected */
    public boolean canEqual(Object obj) {
        return obj instanceof GetAppMeta;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetAppMeta)) {
            return false;
        }
        GetAppMeta getAppMeta = (GetAppMeta) obj;
        if (!getAppMeta.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        App data2 = getData();
        App data3 = getAppMeta.getData();
        return data2 != null ? data2.equals(data3) : data3 == null;
    }

    public App getData() {
        return this.data;
    }

    public int hashCode() {
        int i;
        App data2 = getData();
        int hashCode = (super.hashCode() + 59) * 59;
        if (data2 == null) {
            i = 43;
        } else {
            i = data2.hashCode();
        }
        return hashCode + i;
    }

    public void setData(App app) {
        this.data = app;
    }

    public String toString() {
        return "GetAppMeta(data=" + getData() + ")";
    }
}
