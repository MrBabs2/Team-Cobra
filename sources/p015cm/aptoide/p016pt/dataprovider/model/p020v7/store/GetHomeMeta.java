package p015cm.aptoide.p016pt.dataprovider.model.p020v7.store;

import p015cm.aptoide.p016pt.dataprovider.model.p020v7.BaseV7Response;

/* renamed from: cm.aptoide.pt.dataprovider.model.v7.store.GetHomeMeta */
public class GetHomeMeta extends BaseV7Response {
    private Data data;

    /* renamed from: cm.aptoide.pt.dataprovider.model.v7.store.GetHomeMeta$Data */
    public static class Data {
        private Stats stats;
        private Store store;
        private HomeUser user;

        public Stats getStats() {
            return this.stats;
        }

        public Store getStore() {
            return this.store;
        }

        public HomeUser getUser() {
            return this.user;
        }

        public void setStats(Stats stats2) {
            this.stats = stats2;
        }

        public void setStore(Store store2) {
            this.store = store2;
        }

        public void setUser(HomeUser homeUser) {
            this.user = homeUser;
        }
    }

    /* renamed from: cm.aptoide.pt.dataprovider.model.v7.store.GetHomeMeta$Stats */
    public static class Stats {
        private long followers;
        private long following;

        public long getFollowers() {
            return this.followers;
        }

        public long getFollowing() {
            return this.following;
        }

        public void setFollowers(long j) {
            this.followers = j;
        }

        public void setFollowing(long j) {
            this.following = j;
        }
    }

    public Data getData() {
        return this.data;
    }

    public void setData(Data data2) {
        this.data = data2;
    }
}
