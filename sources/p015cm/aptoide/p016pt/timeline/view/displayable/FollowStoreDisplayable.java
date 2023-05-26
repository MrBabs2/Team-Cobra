package p015cm.aptoide.p016pt.timeline.view.displayable;

import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Type;
import p015cm.aptoide.p016pt.view.recycler.displayable.Displayable;

/* renamed from: cm.aptoide.pt.timeline.view.displayable.FollowStoreDisplayable */
public class FollowStoreDisplayable extends Displayable {
    /* access modifiers changed from: protected */
    public Displayable.Configs getConfig() {
        return new Displayable.Configs(Type.FOLLOW_STORE.getDefaultPerLineCount(), Type.FOLLOW_STORE.isFixedPerLineCount());
    }

    public int getViewLayout() {
        return C1086R.layout.displayable_grid_follow_store;
    }
}
