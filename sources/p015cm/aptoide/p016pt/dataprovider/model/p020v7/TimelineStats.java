package p015cm.aptoide.p016pt.dataprovider.model.p020v7;

/* renamed from: cm.aptoide.pt.dataprovider.model.v7.TimelineStats */
public class TimelineStats extends BaseV7Response {
    private StatusData data;

    /* renamed from: cm.aptoide.pt.dataprovider.model.v7.TimelineStats$StatusData */
    public static class StatusData {
        private long followers;
        private long following;

        /* access modifiers changed from: protected */
        public boolean canEqual(Object obj) {
            return obj instanceof StatusData;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof StatusData)) {
                return false;
            }
            StatusData statusData = (StatusData) obj;
            return statusData.canEqual(this) && getFollowers() == statusData.getFollowers() && getFollowing() == statusData.getFollowing();
        }

        public long getFollowers() {
            return this.followers;
        }

        public long getFollowing() {
            return this.following;
        }

        public int hashCode() {
            long followers2 = getFollowers();
            long following2 = getFollowing();
            return ((((int) (followers2 ^ (followers2 >>> 32))) + 59) * 59) + ((int) (following2 ^ (following2 >>> 32)));
        }

        public void setFollowers(long j) {
            this.followers = j;
        }

        public void setFollowing(long j) {
            this.following = j;
        }

        public String toString() {
            return "TimelineStats.StatusData(followers=" + getFollowers() + ", following=" + getFollowing() + ")";
        }
    }

    /* access modifiers changed from: protected */
    public boolean canEqual(Object obj) {
        return obj instanceof TimelineStats;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TimelineStats)) {
            return false;
        }
        TimelineStats timelineStats = (TimelineStats) obj;
        if (!timelineStats.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        StatusData data2 = getData();
        StatusData data3 = timelineStats.getData();
        return data2 != null ? data2.equals(data3) : data3 == null;
    }

    public StatusData getData() {
        return this.data;
    }

    public int hashCode() {
        int i;
        StatusData data2 = getData();
        int hashCode = (super.hashCode() + 59) * 59;
        if (data2 == null) {
            i = 43;
        } else {
            i = data2.hashCode();
        }
        return hashCode + i;
    }

    public void setData(StatusData statusData) {
        this.data = statusData;
    }

    public String toString() {
        return "TimelineStats(data=" + getData() + ")";
    }
}
