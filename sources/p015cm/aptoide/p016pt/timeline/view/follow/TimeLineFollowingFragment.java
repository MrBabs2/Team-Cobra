package p015cm.aptoide.p016pt.timeline.view.follow;

import android.os.Bundle;
import java.util.List;
import javax.inject.Inject;
import okhttp3.OkHttpClient;
import p015cm.aptoide.p016pt.AptoideApplication;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.dataprovider.WebService;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.GetFollowers;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.C2185V7;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.GetFollowingRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.StoreContext;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p015cm.aptoide.p016pt.timeline.view.displayable.FollowUserDisplayable;
import p015cm.aptoide.p016pt.timeline.view.follow.TimeLineFollowFragment;
import p015cm.aptoide.p016pt.view.fragment.GridRecyclerSwipeWithToolbarFragment;
import p015cm.aptoide.p016pt.view.recycler.EndlessRecyclerOnScrollListener;
import p015cm.aptoide.p016pt.view.recycler.displayable.Displayable;
import p015cm.aptoide.p016pt.view.recycler.displayable.MessageWhiteBgDisplayable;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.timeline.view.follow.TimeLineFollowingFragment */
public class TimeLineFollowingFragment extends TimeLineFollowFragment {
    private BodyInterceptor<BaseBody> baseBodyInterceptor;
    private Converter.Factory converterFactory;
    private OkHttpClient httpClient;
    private Long storeId;
    @Inject
    ThemeManager themeManager;
    private TokenInvalidator tokenInvalidator;
    private Long userId;

    private static Bundle buildBundle(String str, String str2, StoreContext storeContext) {
        Bundle buildBundle = TimeLineFollowFragment.buildBundle(storeContext);
        buildBundle.putString(GridRecyclerSwipeWithToolbarFragment.TITLE_KEY, str2);
        buildBundle.putString("storeTheme", str);
        return buildBundle;
    }

    private String getUserStoreTheme(GetFollowers.TimelineUser timelineUser) {
        if (timelineUser.getStore() != null) {
            return timelineUser.getStore().getAppearance().getTheme();
        }
        return this.themeManager.getBaseTheme().getThemeName();
    }

    public static TimeLineFollowFragment newInstanceUsingStoreId(Long l, String str, String str2, StoreContext storeContext) {
        Bundle buildBundle = buildBundle(str, str2, storeContext);
        if (l != null) {
            buildBundle.putLong(TimeLineFollowFragment.BundleKeys.STORE_ID, l.longValue());
        }
        TimeLineFollowingFragment timeLineFollowingFragment = new TimeLineFollowingFragment();
        timeLineFollowingFragment.setArguments(buildBundle);
        return timeLineFollowingFragment;
    }

    public static TimeLineFollowFragment newInstanceUsingUser(String str, String str2, StoreContext storeContext) {
        Bundle buildBundle = buildBundle(str, str2, storeContext);
        TimeLineFollowingFragment timeLineFollowingFragment = new TimeLineFollowingFragment();
        timeLineFollowingFragment.setArguments(buildBundle);
        return timeLineFollowingFragment;
    }

    public static TimeLineFollowFragment newInstanceUsingUserId(Long l, String str, String str2, StoreContext storeContext) {
        Bundle buildBundle = buildBundle(str, str2, storeContext);
        if (l != null) {
            buildBundle.putLong(TimeLineFollowFragment.BundleKeys.USER_ID, l.longValue());
        }
        TimeLineFollowingFragment timeLineFollowingFragment = new TimeLineFollowingFragment();
        timeLineFollowingFragment.setArguments(buildBundle);
        return timeLineFollowingFragment;
    }

    /* renamed from: a */
    public /* synthetic */ boolean mo14955a(List list, GetFollowers getFollowers) {
        list.add(0, new MessageWhiteBgDisplayable(getHeaderMessage()));
        return false;
    }

    /* access modifiers changed from: protected */
    public C2185V7 buildRequest() {
        return GetFollowingRequest.m5255of(this.baseBodyInterceptor, this.userId, this.storeId, this.httpClient, this.converterFactory, this.tokenInvalidator, ((AptoideApplication) getContext().getApplicationContext()).getDefaultSharedPreferences());
    }

    /* access modifiers changed from: protected */
    public Displayable createUserDisplayable(GetFollowers.TimelineUser timelineUser) {
        return new FollowUserDisplayable(timelineUser, getUserStoreTheme(timelineUser));
    }

    /* access modifiers changed from: protected */
    public EndlessRecyclerOnScrollListener.BooleanAction<GetFollowers> getFirstResponseAction(List<Displayable> list) {
        return new C4405g(this, list);
    }

    public String getFooterMessage(int i) {
        return getString(C1086R.string.private_following_message, Integer.valueOf(i));
    }

    public String getHeaderMessage() {
        return getString(C1086R.string.social_timeline_share_bar_following);
    }

    public void loadExtras(Bundle bundle) {
        super.loadExtras(bundle);
        if (bundle.containsKey(TimeLineFollowFragment.BundleKeys.USER_ID)) {
            this.userId = Long.valueOf(bundle.getLong(TimeLineFollowFragment.BundleKeys.USER_ID));
        }
        if (bundle.containsKey(TimeLineFollowFragment.BundleKeys.STORE_ID)) {
            this.storeId = Long.valueOf(bundle.getLong(TimeLineFollowFragment.BundleKeys.STORE_ID));
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getFragmentComponent(bundle).inject(this);
        AptoideApplication aptoideApplication = (AptoideApplication) getContext().getApplicationContext();
        this.baseBodyInterceptor = aptoideApplication.getAccountSettingsBodyInterceptorPoolV7();
        this.httpClient = aptoideApplication.getDefaultClient();
        this.converterFactory = WebService.getDefaultConverter();
        this.tokenInvalidator = aptoideApplication.getTokenInvalidator();
    }
}
