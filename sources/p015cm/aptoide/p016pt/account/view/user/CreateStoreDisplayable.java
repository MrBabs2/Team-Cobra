package p015cm.aptoide.p016pt.account.view.user;

import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.TimelineStats;
import p015cm.aptoide.p016pt.store.StoreAnalytics;
import p015cm.aptoide.p016pt.view.recycler.displayable.Displayable;

/* renamed from: cm.aptoide.pt.account.view.user.CreateStoreDisplayable */
public class CreateStoreDisplayable extends Displayable {
    private StoreAnalytics storeAnalytics;
    private int textAccentColor;
    private TimelineStats timelineStats;

    public CreateStoreDisplayable() {
    }

    /* access modifiers changed from: protected */
    public Displayable.Configs getConfig() {
        return new Displayable.Configs(1, true);
    }

    public long getFollowers() {
        return this.timelineStats.getData().getFollowers();
    }

    public long getFollowings() {
        return this.timelineStats.getData().getFollowing();
    }

    public StoreAnalytics getStoreAnalytics() {
        return this.storeAnalytics;
    }

    public int getTextAccentColor() {
        return this.textAccentColor;
    }

    public int getViewLayout() {
        return C1086R.layout.create_store_displayable_layout;
    }

    public CreateStoreDisplayable(StoreAnalytics storeAnalytics2, TimelineStats timelineStats2, int i) {
        this.storeAnalytics = storeAnalytics2;
        this.timelineStats = timelineStats2;
        this.textAccentColor = i;
    }
}
