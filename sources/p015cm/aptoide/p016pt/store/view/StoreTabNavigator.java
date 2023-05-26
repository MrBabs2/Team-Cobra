package p015cm.aptoide.p016pt.store.view;

import p015cm.aptoide.p016pt.comments.view.CommentListFragment;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Event;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.StoreContext;
import p015cm.aptoide.p016pt.dataprovider.util.CommentType;
import p015cm.aptoide.p016pt.navigator.FragmentNavigator;

/* renamed from: cm.aptoide.pt.store.view.StoreTabNavigator */
public class StoreTabNavigator {
    private final FragmentNavigator fragmentNavigator;

    public StoreTabNavigator(FragmentNavigator fragmentNavigator2) {
        this.fragmentNavigator = fragmentNavigator2;
    }

    public void navigateToCommentGridRecyclerView(CommentType commentType, String str, String str2, StoreContext storeContext) {
        this.fragmentNavigator.navigateTo(CommentListFragment.newInstanceUrl(commentType, str, str2, storeContext), true);
    }

    public void navigateToStoreTabGridRecyclerView(Event event, String str, String str2, String str3, StoreContext storeContext, boolean z) {
        this.fragmentNavigator.navigateTo(StoreTabGridRecyclerFragment.newInstance(event, str, str2, str3, storeContext, z), true);
    }
}
