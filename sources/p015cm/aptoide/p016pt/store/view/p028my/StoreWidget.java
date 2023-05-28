package p015cm.aptoide.p016pt.store.view.p028my;

import android.text.ParcelableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.C0456c;
import p015cm.aptoide.p016pt.AptoideApplication;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.Store;
import p015cm.aptoide.p016pt.networking.image.ImageLoader;
import p015cm.aptoide.p016pt.store.StoreAnalytics;
import p015cm.aptoide.p016pt.timeline.view.follow.TimeLineFollowersFragment;
import p015cm.aptoide.p016pt.timeline.view.follow.TimeLineFollowingFragment;
import p015cm.aptoide.p016pt.utils.AptoideUtils;
import p015cm.aptoide.p016pt.view.recycler.widget.Widget;
import p015cm.aptoide.p016pt.view.spannable.SpannableFactory;
import p112n.p118g.p301a.p310c.C10695a;

/* renamed from: cm.aptoide.pt.store.view.my.StoreWidget */
public class StoreWidget extends Widget<StoreDisplayable> {
    private Button exploreButton;
    private TextView firstStat;
    private TextView secondStat;
    private StoreAnalytics storeAnalytics = new StoreAnalytics(((AptoideApplication) getContext().getApplicationContext()).getAnalyticsManager(), ((AptoideApplication) getContext().getApplicationContext()).getNavigationTracker());
    private ImageView storeIcon;
    private TextView storeName;
    private TextView suggestionMessage;

    public StoreWidget(View view) {
        super(view);
    }

    private void showStats(StoreDisplayable storeDisplayable) {
        SpannableFactory spannableFactory = new SpannableFactory();
        ParcelableSpan[] parcelableSpanArr = {new StyleSpan(1), new ForegroundColorSpan(storeDisplayable.getTextColor())};
        String format = String.format(getContext().getString(storeDisplayable.getFirstStatsLabel()), new Object[]{String.valueOf(storeDisplayable.getFirstStatsNumber())});
        this.firstStat.setText(spannableFactory.createMultiSpan(format, parcelableSpanArr, String.valueOf(storeDisplayable.getFirstStatsNumber())));
        String format2 = String.format(getContext().getString(storeDisplayable.getSecondStatsLabel()), new Object[]{String.valueOf(storeDisplayable.getSecondStatsNumber())});
        this.secondStat.setText(spannableFactory.createMultiSpan(format2, parcelableSpanArr, String.valueOf(storeDisplayable.getSecondStatsNumber())));
    }

    private void showStoreDescription(StoreDisplayable storeDisplayable, C0456c cVar) {
        String suggestionMessage2 = storeDisplayable.getSuggestionMessage(cVar);
        if (suggestionMessage2.isEmpty()) {
            this.suggestionMessage.setVisibility(8);
            return;
        }
        this.suggestionMessage.setText(suggestionMessage2);
        this.suggestionMessage.setVisibility(0);
    }

    /* renamed from: a */
    public /* synthetic */ void mo14810a(Store store, String str, Void voidR) {
        getFragmentNavigator().navigateTo(AptoideApplication.getFragmentProvider().newStoreFragment(store.getName(), str), true);
        this.storeAnalytics.sendStoreTabInteractEvent("View Store", false);
        this.storeAnalytics.sendStoreOpenEvent("View Own Store", store.getName(), false);
    }

    /* access modifiers changed from: protected */
    public void assignViews(View view) {
        this.storeIcon = (ImageView) view.findViewById(C1086R.C1088id.store_icon);
        this.storeName = (TextView) view.findViewById(C1086R.C1088id.store_name);
        this.suggestionMessage = (TextView) view.findViewById(C1086R.C1088id.create_store_text);
        this.firstStat = (TextView) view.findViewById(C1086R.C1088id.first_stat);
        this.secondStat = (TextView) view.findViewById(C1086R.C1088id.second_stat);
        this.exploreButton = (Button) view.findViewById(C1086R.C1088id.explore_button);
    }

    /* renamed from: b */
    public /* synthetic */ void mo14812b(String str, StoreDisplayable storeDisplayable, Void voidR) {
        this.storeAnalytics.sendFollowersStoresInteractEvent();
        getFragmentNavigator().navigateTo(TimeLineFollowersFragment.newInstanceUsingUser(str, AptoideUtils.StringU.getFormattedString(C1086R.string.social_timeline_followers_fragment_title, getContext().getResources(), Long.valueOf(storeDisplayable.getSecondStatsNumber())), storeDisplayable.getStoreContext()), true);
    }

    public void bindView(StoreDisplayable storeDisplayable, int i) {
        C0456c context = getContext();
        Store store = storeDisplayable.getStore();
        showStoreDescription(storeDisplayable, context);
        this.exploreButton.setText(storeDisplayable.getExploreButtonText());
        String theme = store.getAppearance().getTheme();
        ImageLoader.with(context).loadWithShadowCircleTransform(store.getAvatar(), this.storeIcon);
        this.storeName.setText(store.getName());
        this.compositeSubscription.mo18721a(C10695a.m36221a(this.exploreButton).mo18675c(new C4314d0(this, store, theme)));
        showStats(storeDisplayable);
        if (storeDisplayable.isStatsClickable()) {
            this.compositeSubscription.mo18721a(C10695a.m36221a(this.firstStat).mo18675c(new C4316e0(this, theme, storeDisplayable)));
            this.compositeSubscription.mo18721a(C10695a.m36221a(this.secondStat).mo18675c(new C4312c0(this, theme, storeDisplayable)));
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo14811a(String str, StoreDisplayable storeDisplayable, Void voidR) {
        this.storeAnalytics.sendFollowingStoresInteractEvent();
        getFragmentNavigator().navigateTo(TimeLineFollowingFragment.newInstanceUsingUser(str, AptoideUtils.StringU.getFormattedString(C1086R.string.social_timeline_following_fragment_title, getContext().getResources(), Long.valueOf(storeDisplayable.getFirstStatsNumber())), storeDisplayable.getStoreContext()), true);
    }
}
