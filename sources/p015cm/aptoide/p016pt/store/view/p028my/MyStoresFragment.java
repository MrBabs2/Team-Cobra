package p015cm.aptoide.p016pt.store.view.p028my;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.trello.rxlifecycle.p209g.C9008b;
import java.util.List;
import javax.inject.Inject;
import p015cm.aptoide.accountmanager.Account;
import p015cm.aptoide.p016pt.AptoideApplication;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.bottomNavigation.BottomNavigationActivity;
import p015cm.aptoide.p016pt.bottomNavigation.BottomNavigationItem;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Event;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.StoreContext;
import p015cm.aptoide.p016pt.home.bundles.base.HomeEvent;
import p015cm.aptoide.p016pt.logger.Logger;
import p015cm.aptoide.p016pt.networking.image.ImageLoader;
import p015cm.aptoide.p016pt.store.RoomStoreRepository;
import p015cm.aptoide.p016pt.store.view.GridStoreDisplayable;
import p015cm.aptoide.p016pt.store.view.StoreTabGridRecyclerFragment;
import p015cm.aptoide.p016pt.store.view.StoreTabWidgetsGridRecyclerFragment;
import p015cm.aptoide.p016pt.timeline.view.displayable.FollowStoreDisplayable;
import p015cm.aptoide.p016pt.view.recycler.displayable.Displayable;
import p015cm.aptoide.p016pt.view.recycler.displayable.DisplayableGroup;
import p112n.p118g.p301a.p310c.C10695a;
import p123rx.C5368e;
import p123rx.p124l.p125c.C5376a;
import p123rx.p126m.C5378b;
import p123rx.schedulers.Schedulers;

/* renamed from: cm.aptoide.pt.store.view.my.MyStoresFragment */
public class MyStoresFragment extends StoreTabWidgetsGridRecyclerFragment implements MyStoresView {
    private static final BottomNavigationItem BOTTOM_NAVIGATION_ITEM = BottomNavigationItem.STORES;
    private static final String TAG = MyStoresFragment.class.getSimpleName();
    private BottomNavigationActivity bottomNavigationActivity;
    @Inject
    MyStoresPresenter myStoresPresenter;
    @Inject
    RoomStoreRepository storeRepository;
    private ImageView userAvatar;

    /* renamed from: a */
    static /* synthetic */ void m7362a(Object obj) {
    }

    /* access modifiers changed from: private */
    public List<Displayable> addFollowStoreDisplayable(List<Displayable> list) {
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= list.size()) {
                i2 = 0;
                break;
            } else if (list.get(i2) instanceof DisplayableGroup) {
                break;
            } else {
                i2++;
            }
        }
        List<Displayable> children = ((DisplayableGroup) list.get(i2)).getChildren();
        int i3 = 0;
        while (true) {
            if (i3 >= children.size()) {
                break;
            } else if (children.get(i3) instanceof GridStoreDisplayable) {
                i = i3;
                break;
            } else {
                i3++;
            }
        }
        ((DisplayableGroup) list.get(i2)).getChildren().add(i, new FollowStoreDisplayable());
        if (children.size() > 6) {
            ((DisplayableGroup) list.get(i2)).getChildren().remove(children.size() - 1);
        }
        return list;
    }

    public static MyStoresFragment newInstance(Event event, String str, String str2, StoreContext storeContext) {
        Bundle buildBundle = StoreTabGridRecyclerFragment.buildBundle(event, HomeEvent.Type.NO_OP, (String) null, str, str2, storeContext, false);
        MyStoresFragment myStoresFragment = new MyStoresFragment();
        myStoresFragment.setArguments(buildBundle);
        return myStoresFragment;
    }

    private void registerForViewChanges() {
        C5368e.m10254b(((AptoideApplication) getContext().getApplicationContext()).getAccountManager().accountStatus().mo18664b(new C4307a(this)), (C5368e<Account>) this.storeRepository.getAll().mo18633a(1).mo18664b(new C4313d(this))).mo18644a(C5376a.m10346b()).mo18641a(bindUntilEvent(C9008b.DESTROY_VIEW)).mo18655a(C4309b.f7402f, (C5378b<Throwable>) C4311c.f7404f);
    }

    private void reloadData() {
        super.load(false, true, (Bundle) null);
    }

    /* renamed from: a */
    public /* synthetic */ void mo14776a(Account account) {
        reloadData();
    }

    /* access modifiers changed from: protected */
    public C5368e<List<Displayable>> buildDisplayables(boolean z, String str, boolean z2) {
        return this.requestFactoryCdnPool.newStoreWidgets(str).observe(z, z2).mo18644a(Schedulers.m10352io()).mo18687f(new C4310b0(this)).mo18694j(new C4315e(this));
    }

    /* access modifiers changed from: protected */
    public boolean displayHomeUpAsEnabled() {
        return false;
    }

    public C5368e<Void> imageClick() {
        return C10695a.m36221a(this.userAvatar);
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (activity instanceof BottomNavigationActivity) {
            this.bottomNavigationActivity = (BottomNavigationActivity) activity;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getFragmentComponent(bundle).inject(this);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        return layoutInflater.inflate(C1086R.layout.my_stores, viewGroup, false);
    }

    public void onDestroyView() {
        this.userAvatar = null;
        super.onDestroyView();
    }

    public void onDetach() {
        this.bottomNavigationActivity = null;
        super.onDetach();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        BottomNavigationActivity bottomNavigationActivity2 = this.bottomNavigationActivity;
        if (bottomNavigationActivity2 != null) {
            bottomNavigationActivity2.requestFocus(BOTTOM_NAVIGATION_ITEM);
        }
        registerForViewChanges();
        if (getView() != null) {
            this.userAvatar = (ImageView) getView().findViewById(C1086R.C1088id.user_actionbar_icon);
        }
        attachPresenter(this.myStoresPresenter);
    }

    public void scrollToTop() {
        RecyclerView recyclerView = getRecyclerView();
        if (((LinearLayoutManager) recyclerView.getLayoutManager()).findLastVisibleItemPosition() > 10) {
            recyclerView.scrollToPosition(10);
        }
        recyclerView.smoothScrollToPosition(0);
    }

    public void setDefaultUserImage() {
        ImageLoader.with(getContext()).loadUsingCircleTransform((int) C1086R.C1087drawable.ic_account_circle, this.userAvatar);
    }

    public void setUserImage(String str) {
        if (this.userAvatar != null) {
            ImageLoader.with(getContext()).loadWithShadowCircleTransformWithPlaceholder(str, this.userAvatar, C1086R.C1087drawable.ic_account_circle);
        }
    }

    public void setupToolbarDetails(Toolbar toolbar) {
        toolbar.setTitle((CharSequence) null);
        toolbar.setLogo((Drawable) null);
    }

    public void showAvatar() {
        ImageView imageView = this.userAvatar;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo14777a(List list) {
        Logger.getInstance().mo12975d(TAG, "Store database changed, reloading...");
        reloadData();
    }

    public static Fragment newInstance() {
        return new MyStoresFragment();
    }
}
