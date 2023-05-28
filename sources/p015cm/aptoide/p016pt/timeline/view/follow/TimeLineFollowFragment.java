package p015cm.aptoide.p016pt.timeline.view.follow;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import java.util.LinkedList;
import java.util.List;
import p015cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.GetFollowers;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.C2185V7;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.StoreContext;
import p015cm.aptoide.p016pt.view.fragment.GridRecyclerSwipeWithToolbarFragment;
import p015cm.aptoide.p016pt.view.recycler.EndlessRecyclerOnScrollListener;
import p015cm.aptoide.p016pt.view.recycler.displayable.Displayable;
import p015cm.aptoide.p016pt.view.recycler.displayable.MessageWhiteBgDisplayable;
import p123rx.p126m.C5377a;

/* renamed from: cm.aptoide.pt.timeline.view.follow.TimeLineFollowFragment */
public abstract class TimeLineFollowFragment extends GridRecyclerSwipeWithToolbarFragment {
    private EndlessRecyclerOnScrollListener endlessRecyclerOnScrollListener;
    private StoreContext storeContext;

    /* renamed from: cm.aptoide.pt.timeline.view.follow.TimeLineFollowFragment$BundleKeys */
    public class BundleKeys {
        public static final String STORE_CONTEXT = "STORE_CONTEXT";
        public static final String STORE_ID = "STORE_ID";
        public static final String USER_ID = "user_id";

        public BundleKeys() {
        }
    }

    protected static Bundle buildBundle(StoreContext storeContext2) {
        Bundle bundle = new Bundle();
        bundle.putSerializable(BundleKeys.STORE_CONTEXT, storeContext2);
        return bundle;
    }

    /* renamed from: a */
    public /* synthetic */ void mo14944a(int[] iArr, LinkedList linkedList, GetFollowers getFollowers) {
        iArr[0] = iArr[0] + getFollowers.getDataList().getHidden();
        for (GetFollowers.TimelineUser createUserDisplayable : getFollowers.getDataList().getList()) {
            linkedList.add(createUserDisplayable(createUserDisplayable));
        }
        addDisplayables(linkedList);
        linkedList.clear();
    }

    /* access modifiers changed from: protected */
    public abstract C2185V7 buildRequest();

    /* access modifiers changed from: protected */
    public abstract Displayable createUserDisplayable(GetFollowers.TimelineUser timelineUser);

    /* access modifiers changed from: protected */
    public boolean displayHomeUpAsEnabled() {
        return true;
    }

    /* access modifiers changed from: protected */
    public abstract EndlessRecyclerOnScrollListener.BooleanAction<GetFollowers> getFirstResponseAction(List<Displayable> list);

    /* access modifiers changed from: protected */
    public abstract String getFooterMessage(int i);

    /* access modifiers changed from: protected */
    public abstract String getHeaderMessage();

    public ScreenTagHistory getHistoryTracker() {
        String simpleName = getClass().getSimpleName();
        StoreContext storeContext2 = this.storeContext;
        return ScreenTagHistory.Builder.build(simpleName, "", storeContext2 != null ? storeContext2.name() : null);
    }

    public void load(boolean z, boolean z2, Bundle bundle) {
        super.load(z, z2, bundle);
        if (z || z2) {
            C2185V7 buildRequest = buildRequest();
            LinkedList linkedList = new LinkedList();
            int[] iArr = {0};
            C4403e eVar = new C4403e(this, iArr, linkedList);
            EndlessRecyclerOnScrollListener.BooleanAction<GetFollowers> firstResponseAction = getFirstResponseAction(linkedList);
            getRecyclerView().clearOnScrollListeners();
            EndlessRecyclerOnScrollListener endlessRecyclerOnScrollListener2 = new EndlessRecyclerOnScrollListener(getAdapter(), buildRequest, eVar, C4406h.f7570a, 6, true, firstResponseAction, (C5377a) null);
            this.endlessRecyclerOnScrollListener = endlessRecyclerOnScrollListener2;
            endlessRecyclerOnScrollListener2.addOnEndlessFinishListener(new C4402d(this, iArr));
            getRecyclerView().addOnScrollListener(this.endlessRecyclerOnScrollListener);
            this.endlessRecyclerOnScrollListener.onLoadMore(z2, z2);
            return;
        }
        getRecyclerView().addOnScrollListener(this.endlessRecyclerOnScrollListener);
    }

    public void loadExtras(Bundle bundle) {
        super.loadExtras(bundle);
        this.storeContext = (StoreContext) bundle.getSerializable(BundleKeys.STORE_CONTEXT);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        menuInflater.inflate(C1086R.C1089menu.menu_empty, menu);
    }

    public void onDestroyView() {
        this.endlessRecyclerOnScrollListener.removeListeners();
        super.onDestroyView();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        getActivity().onBackPressed();
        return true;
    }

    /* renamed from: a */
    public /* synthetic */ void mo14943a(int[] iArr, EndlessRecyclerOnScrollListener endlessRecyclerOnScrollListener2) {
        addDisplayable(new MessageWhiteBgDisplayable(getFooterMessage(iArr[0])));
    }
}
