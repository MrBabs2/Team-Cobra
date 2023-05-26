package p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7;

import p015cm.aptoide.p016pt.dataprovider.model.p020v7.TimelineStats;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.GetHomeMeta;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v7.MyStore */
public class MyStore {
    private final GetHomeMeta getHomeMeta;
    private final TimelineStats timelineStats;

    public MyStore(TimelineStats timelineStats2, GetHomeMeta getHomeMeta2) {
        this.timelineStats = timelineStats2;
        this.getHomeMeta = getHomeMeta2;
    }

    public GetHomeMeta getGetHomeMeta() {
        return this.getHomeMeta;
    }

    public TimelineStats getTimelineStats() {
        return this.timelineStats;
    }

    public boolean isCreateStore() {
        return this.getHomeMeta == null;
    }
}
