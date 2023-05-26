package p015cm.aptoide.p016pt.store.view.recommended;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import p015cm.aptoide.p016pt.AptoideApplication;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.Store;
import p015cm.aptoide.p016pt.networking.image.ImageLoader;
import p015cm.aptoide.p016pt.store.StoreAnalytics;
import p015cm.aptoide.p016pt.utils.AptoideUtils;
import p015cm.aptoide.p016pt.utils.design.ShowMessage;
import p015cm.aptoide.p016pt.view.recycler.widget.Widget;
import p112n.p118g.p301a.p310c.C10695a;
import p123rx.C5368e;
import p123rx.p124l.p125c.C5376a;
import p123rx.p126m.C5378b;
import p123rx.schedulers.Schedulers;

/* renamed from: cm.aptoide.pt.store.view.recommended.RecommendedStoreWidget */
public class RecommendedStoreWidget extends Widget<RecommendedStoreDisplayable> {
    private AppCompatButton followButton;
    private TextView followingUsers;
    private TextView numberStoreApps;
    private StoreAnalytics storeAnalytics = new StoreAnalytics(((AptoideApplication) getContext().getApplicationContext()).getAnalyticsManager(), ((AptoideApplication) getContext().getApplicationContext()).getNavigationTracker());
    private ImageView storeIcon;
    private TextView storeName;

    public RecommendedStoreWidget(View view) {
        super(view);
    }

    private void setButtonText(RecommendedStoreDisplayable recommendedStoreDisplayable) {
        this.followButton.setVisibility(8);
        this.compositeSubscription.mo18721a(recommendedStoreDisplayable.isFollowing().mo18644a(C5376a.m10346b()).mo18675c(new C4357e(this, recommendedStoreDisplayable)));
    }

    private void setFollowButtonListener(RecommendedStoreDisplayable recommendedStoreDisplayable) {
        this.compositeSubscription.mo18721a(C10695a.m36221a(this.followButton).mo18687f(new C4354b(this, recommendedStoreDisplayable)).mo18644a(C5376a.m10346b()).mo18655a(new C4353a(this, recommendedStoreDisplayable), (C5378b<Throwable>) new C4355c(this)));
    }

    /* renamed from: a */
    public /* synthetic */ void mo14825a(RecommendedStoreDisplayable recommendedStoreDisplayable, Store store, Void voidR) {
        recommendedStoreDisplayable.openStoreFragment(getFragmentNavigator());
        if (!recommendedStoreDisplayable.getOrigin().isEmpty()) {
            this.storeAnalytics.sendStoreOpenEvent(recommendedStoreDisplayable.getOrigin(), store.getName(), false);
            this.storeAnalytics.sendStoreTabInteractEvent("More Recommended Stores", false);
            return;
        }
        this.storeAnalytics.sendStoreOpenEvent("Recommended Stores", store.getName(), false);
        this.storeAnalytics.sendStoreTabInteractEvent("Open a Recommended Store", false);
    }

    /* access modifiers changed from: protected */
    public void assignViews(View view) {
        this.storeName = (TextView) view.findViewById(C1086R.C1088id.recommended_store_name);
        this.followingUsers = (TextView) view.findViewById(C1086R.C1088id.recommended_store_users);
        this.numberStoreApps = (TextView) view.findViewById(C1086R.C1088id.recommended_store_apps);
        this.storeIcon = (ImageView) view.findViewById(C1086R.C1088id.store_avatar_row);
        this.followButton = (AppCompatButton) view.findViewById(C1086R.C1088id.recommended_store_action);
    }

    /* renamed from: c */
    public /* synthetic */ void mo14830c(RecommendedStoreDisplayable recommendedStoreDisplayable, Boolean bool) {
        this.followButton.setEnabled(true);
        ShowMessage.asSnack(this.itemView, AptoideUtils.StringU.getFormattedString(bool.booleanValue() ? C1086R.string.store_followed : C1086R.string.unfollowing_store_message, getContext().getResources(), ((Store) recommendedStoreDisplayable.getPojo()).getName()));
    }

    public void bindView(RecommendedStoreDisplayable recommendedStoreDisplayable, int i) {
        Store store = (Store) recommendedStoreDisplayable.getPojo();
        this.storeName.setText(store.getName());
        this.followingUsers.setText(String.valueOf(store.getStats().getSubscribers()));
        this.numberStoreApps.setText(String.valueOf(store.getStats().getApps()));
        ImageLoader.with(getContext()).loadUsingCircleTransform(store.getAvatar(), this.storeIcon);
        setFollowButtonListener(recommendedStoreDisplayable);
        setButtonText(recommendedStoreDisplayable);
        this.compositeSubscription.mo18721a(C10695a.m36221a(this.itemView).mo18655a(new C4358f(this, recommendedStoreDisplayable, store), (C5378b<Throwable>) C4356d.f7476f));
    }

    /* renamed from: b */
    public /* synthetic */ Boolean mo14828b(RecommendedStoreDisplayable recommendedStoreDisplayable, Boolean bool) {
        if (bool.booleanValue()) {
            recommendedStoreDisplayable.unsubscribeStore(getContext().getApplicationContext());
        } else {
            recommendedStoreDisplayable.subscribeStore();
        }
        return Boolean.valueOf(!bool.booleanValue());
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo14824a(RecommendedStoreDisplayable recommendedStoreDisplayable, Void voidR) {
        this.followButton.setEnabled(false);
        this.storeAnalytics.sendStoreTabInteractEvent("Follow a Recommended Store", ((Store) recommendedStoreDisplayable.getPojo()).getStats().getApps(), ((Store) recommendedStoreDisplayable.getPojo()).getStats().getSubscribers());
        return recommendedStoreDisplayable.isFollowing().mo18669c().mo18644a(Schedulers.computation()).mo18694j(new C4359g(this, recommendedStoreDisplayable));
    }

    /* renamed from: a */
    public /* synthetic */ void mo14827a(Throwable th) {
        CrashReport.getInstance().log(th);
        ShowMessage.asSnack(this.itemView, (int) C1086R.string.error_occured);
    }

    /* renamed from: a */
    public /* synthetic */ void mo14826a(RecommendedStoreDisplayable recommendedStoreDisplayable, Boolean bool) {
        this.followButton.setText(AptoideUtils.StringU.getFormattedString(bool.booleanValue() ? C1086R.string.followed : C1086R.string.follow, getContext().getResources(), ((Store) recommendedStoreDisplayable.getPojo()).getName()));
        this.followButton.setVisibility(0);
    }
}
