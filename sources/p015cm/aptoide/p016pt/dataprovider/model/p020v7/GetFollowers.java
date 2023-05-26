package p015cm.aptoide.p016pt.dataprovider.model.p020v7;

import p015cm.aptoide.p016pt.dataprovider.model.p020v7.TimelineStats;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.Store;

/* renamed from: cm.aptoide.pt.dataprovider.model.v7.GetFollowers */
public class GetFollowers extends BaseV7EndlessDataListResponse<TimelineUser> {

    /* renamed from: cm.aptoide.pt.dataprovider.model.v7.GetFollowers$TimelineUser */
    public static class TimelineUser {
        String avatar;

        /* renamed from: id */
        long f4851id;
        String name;
        TimelineStats.StatusData stats;
        Store store;

        /* access modifiers changed from: protected */
        public boolean canEqual(Object obj) {
            return obj instanceof TimelineUser;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TimelineUser)) {
                return false;
            }
            TimelineUser timelineUser = (TimelineUser) obj;
            if (!timelineUser.canEqual(this) || getId() != timelineUser.getId()) {
                return false;
            }
            String name2 = getName();
            String name3 = timelineUser.getName();
            if (name2 != null ? !name2.equals(name3) : name3 != null) {
                return false;
            }
            String avatar2 = getAvatar();
            String avatar3 = timelineUser.getAvatar();
            if (avatar2 != null ? !avatar2.equals(avatar3) : avatar3 != null) {
                return false;
            }
            Store store2 = getStore();
            Store store3 = timelineUser.getStore();
            if (store2 != null ? !store2.equals(store3) : store3 != null) {
                return false;
            }
            TimelineStats.StatusData stats2 = getStats();
            TimelineStats.StatusData stats3 = timelineUser.getStats();
            return stats2 != null ? stats2.equals(stats3) : stats3 == null;
        }

        public String getAvatar() {
            return this.avatar;
        }

        public long getId() {
            return this.f4851id;
        }

        public String getName() {
            return this.name;
        }

        public TimelineStats.StatusData getStats() {
            return this.stats;
        }

        public Store getStore() {
            return this.store;
        }

        public int hashCode() {
            int i;
            int i2;
            int i3;
            long id = getId();
            String name2 = getName();
            int i4 = (((int) (id ^ (id >>> 32))) + 59) * 59;
            int i5 = 43;
            if (name2 == null) {
                i = 43;
            } else {
                i = name2.hashCode();
            }
            int i6 = i4 + i;
            String avatar2 = getAvatar();
            int i7 = i6 * 59;
            if (avatar2 == null) {
                i2 = 43;
            } else {
                i2 = avatar2.hashCode();
            }
            int i8 = i7 + i2;
            Store store2 = getStore();
            int i9 = i8 * 59;
            if (store2 == null) {
                i3 = 43;
            } else {
                i3 = store2.hashCode();
            }
            int i10 = i9 + i3;
            TimelineStats.StatusData stats2 = getStats();
            int i11 = i10 * 59;
            if (stats2 != null) {
                i5 = stats2.hashCode();
            }
            return i11 + i5;
        }

        public void setAvatar(String str) {
            this.avatar = str;
        }

        public void setId(long j) {
            this.f4851id = j;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setStats(TimelineStats.StatusData statusData) {
            this.stats = statusData;
        }

        public void setStore(Store store2) {
            this.store = store2;
        }

        public String toString() {
            return "GetFollowers.TimelineUser(id=" + getId() + ", name=" + getName() + ", avatar=" + getAvatar() + ", store=" + getStore() + ", stats=" + getStats() + ")";
        }
    }

    /* access modifiers changed from: protected */
    public boolean canEqual(Object obj) {
        return obj instanceof GetFollowers;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof GetFollowers) && ((GetFollowers) obj).canEqual(this);
    }

    public int hashCode() {
        return 1;
    }

    public String toString() {
        return "GetFollowers()";
    }
}
