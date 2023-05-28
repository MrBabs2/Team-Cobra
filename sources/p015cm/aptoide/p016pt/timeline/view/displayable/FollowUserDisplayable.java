package p015cm.aptoide.p016pt.timeline.view.displayable;

import android.text.TextUtils;
import p015cm.aptoide.p016pt.AptoideApplication;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.GetFollowers;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.Store;
import p015cm.aptoide.p016pt.navigator.FragmentNavigator;
import p015cm.aptoide.p016pt.store.view.StoreFragment;
import p015cm.aptoide.p016pt.view.recycler.displayable.Displayable;
import p015cm.aptoide.p016pt.view.recycler.displayable.DisplayablePojo;

/* renamed from: cm.aptoide.pt.timeline.view.displayable.FollowUserDisplayable */
public class FollowUserDisplayable extends DisplayablePojo<GetFollowers.TimelineUser> {
    private String theme;

    public FollowUserDisplayable() {
    }

    /* access modifiers changed from: protected */
    public Displayable.Configs getConfig() {
        return new Displayable.Configs(1, false);
    }

    public String getFollowers() {
        return String.valueOf(((GetFollowers.TimelineUser) getPojo()).getStats() != null ? ((GetFollowers.TimelineUser) getPojo()).getStats().getFollowers() : 0);
    }

    public String getFollowing() {
        return String.valueOf(((GetFollowers.TimelineUser) getPojo()).getStats() != null ? ((GetFollowers.TimelineUser) getPojo()).getStats().getFollowing() : 0);
    }

    public String getStoreAvatar() {
        return ((GetFollowers.TimelineUser) getPojo()).getStore().getAvatar();
    }

    public String getStoreName() {
        if (((GetFollowers.TimelineUser) getPojo()).getStore() == null) {
            return null;
        }
        return ((GetFollowers.TimelineUser) getPojo()).getStore().getName();
    }

    public String getUserAvatar() {
        return ((GetFollowers.TimelineUser) getPojo()).getAvatar();
    }

    public String getUserName() {
        return ((GetFollowers.TimelineUser) getPojo()).getName();
    }

    public int getViewLayout() {
        return C1086R.layout.timeline_follow_user;
    }

    public boolean hasStore() {
        return ((GetFollowers.TimelineUser) getPojo()).getStore() != null && (!TextUtils.isEmpty(((GetFollowers.TimelineUser) getPojo()).getStore().getName()) || !TextUtils.isEmpty(((GetFollowers.TimelineUser) getPojo()).getStore().getAvatar()));
    }

    public boolean hasStoreAndUser() {
        return hasStore() && hasUser();
    }

    public boolean hasUser() {
        return !TextUtils.isEmpty(((GetFollowers.TimelineUser) getPojo()).getName()) || !TextUtils.isEmpty(((GetFollowers.TimelineUser) getPojo()).getAvatar());
    }

    public String storeName() {
        return ((GetFollowers.TimelineUser) getPojo()).getStore().getName();
    }

    public void viewClicked(FragmentNavigator fragmentNavigator) {
        Store store = ((GetFollowers.TimelineUser) getPojo()).getStore();
        if (store != null) {
            fragmentNavigator.navigateTo(AptoideApplication.getFragmentProvider().newStoreFragment(store.getName(), this.theme, StoreFragment.OpenType.GetHome), true);
        } else {
            fragmentNavigator.navigateTo(AptoideApplication.getFragmentProvider().newStoreFragment(((GetFollowers.TimelineUser) getPojo()).getId(), this.theme, StoreFragment.OpenType.GetHome), true);
        }
    }

    public FollowUserDisplayable(GetFollowers.TimelineUser timelineUser, String str) {
        super(timelineUser);
        this.theme = str;
    }
}
