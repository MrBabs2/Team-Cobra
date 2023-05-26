package p015cm.aptoide.p016pt.store.view;

import android.content.res.Resources;
import android.text.ParcelableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.snackbar.Snackbar;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.account.view.store.ManageStoreFragment;
import p015cm.aptoide.p016pt.account.view.store.ManageStoreViewModel;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.GetStoreMeta;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.StoreContext;
import p015cm.aptoide.p016pt.navigator.FragmentNavigator;
import p015cm.aptoide.p016pt.networking.image.ImageLoader;
import p015cm.aptoide.p016pt.store.StoreUtilsProxy;
import p015cm.aptoide.p016pt.themes.StoreTheme;
import p015cm.aptoide.p016pt.timeline.view.follow.TimeLineFollowersFragment;
import p015cm.aptoide.p016pt.timeline.view.follow.TimeLineFollowingFragment;
import p015cm.aptoide.p016pt.utils.AptoideUtils;
import p015cm.aptoide.p016pt.view.app.ListStoreAppsFragment;
import p015cm.aptoide.p016pt.view.recycler.widget.Widget;
import p015cm.aptoide.p016pt.view.spannable.SpannableFactory;
import p123rx.p124l.p125c.C5376a;
import p123rx.p126m.C5377a;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.store.view.GridStoreMetaWidget */
public class GridStoreMetaWidget extends Widget<GridStoreMetaDisplayable> {
    private AptoideAccountManager accountManager;
    private TextView appsCountTv;
    private BadgeDialogFactory badgeDialogFactory;
    private ImageView badgeIcon;
    private View buttonsLayout;
    private TextView description;
    private View editStoreButton;
    private Button followStoreButton;
    private TextView followersCountTv;
    private TextView followingCountTv;
    private ImageView mainIcon;
    private TextView mainName;
    private ImageView secondaryIcon;
    private TextView secondaryName;
    private SpannableFactory spannableFactory;
    private StoreUtilsProxy storeUtilsProxy;

    /* renamed from: cm.aptoide.pt.store.view.GridStoreMetaWidget$1 */
    static /* synthetic */ class C42551 {

        /* renamed from: $SwitchMap$cm$aptoide$pt$store$view$GridStoreMetaWidget$HomeMeta$Badge */
        static final /* synthetic */ int[] f7349x2685ebd;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                cm.aptoide.pt.store.view.GridStoreMetaWidget$HomeMeta$Badge[] r0 = p015cm.aptoide.p016pt.store.view.GridStoreMetaWidget.HomeMeta.Badge.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f7349x2685ebd = r0
                cm.aptoide.pt.store.view.GridStoreMetaWidget$HomeMeta$Badge r1 = p015cm.aptoide.p016pt.store.view.GridStoreMetaWidget.HomeMeta.Badge.NONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f7349x2685ebd     // Catch:{ NoSuchFieldError -> 0x001d }
                cm.aptoide.pt.store.view.GridStoreMetaWidget$HomeMeta$Badge r1 = p015cm.aptoide.p016pt.store.view.GridStoreMetaWidget.HomeMeta.Badge.TIN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f7349x2685ebd     // Catch:{ NoSuchFieldError -> 0x0028 }
                cm.aptoide.pt.store.view.GridStoreMetaWidget$HomeMeta$Badge r1 = p015cm.aptoide.p016pt.store.view.GridStoreMetaWidget.HomeMeta.Badge.BRONZE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f7349x2685ebd     // Catch:{ NoSuchFieldError -> 0x0033 }
                cm.aptoide.pt.store.view.GridStoreMetaWidget$HomeMeta$Badge r1 = p015cm.aptoide.p016pt.store.view.GridStoreMetaWidget.HomeMeta.Badge.SILVER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f7349x2685ebd     // Catch:{ NoSuchFieldError -> 0x003e }
                cm.aptoide.pt.store.view.GridStoreMetaWidget$HomeMeta$Badge r1 = p015cm.aptoide.p016pt.store.view.GridStoreMetaWidget.HomeMeta.Badge.GOLD     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f7349x2685ebd     // Catch:{ NoSuchFieldError -> 0x0049 }
                cm.aptoide.pt.store.view.GridStoreMetaWidget$HomeMeta$Badge r1 = p015cm.aptoide.p016pt.store.view.GridStoreMetaWidget.HomeMeta.Badge.PLATINUM     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.store.view.GridStoreMetaWidget.C42551.<clinit>():void");
        }
    }

    /* renamed from: cm.aptoide.pt.store.view.GridStoreMetaWidget$HomeMeta */
    public static class HomeMeta {
        private final long appsCount;
        private final Badge badge;
        private final String description;
        private final long followersCount;
        private final long followingCount;
        private final boolean followingStore;
        private final String mainIcon;
        private final String mainName;
        private final boolean owner;
        private final String secondaryIcon;
        private final String secondaryName;
        private final boolean showApps;
        private final boolean showButton;
        private final long storeId;
        private final StoreTheme storeTheme;
        private final int themeColor;

        /* renamed from: cm.aptoide.pt.store.view.GridStoreMetaWidget$HomeMeta$Badge */
        enum Badge {
            NONE,
            TIN,
            BRONZE,
            SILVER,
            GOLD,
            PLATINUM
        }

        public HomeMeta(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, long j, long j2, long j3, String str5, StoreTheme storeTheme2, int i, long j4, boolean z4, Badge badge2) {
            this.mainIcon = str;
            this.secondaryIcon = str2;
            this.mainName = str3;
            this.secondaryName = str4;
            this.owner = z;
            this.showButton = z2;
            this.followingStore = z3;
            this.appsCount = j;
            this.followersCount = j2;
            this.followingCount = j3;
            this.description = str5;
            this.storeTheme = storeTheme2;
            this.themeColor = i;
            this.storeId = j4;
            this.showApps = z4;
            this.badge = badge2;
        }

        public long getAppsCount() {
            return this.appsCount;
        }

        public Badge getBadge() {
            return this.badge;
        }

        public String getDescription() {
            return this.description;
        }

        public long getFollowersCount() {
            return this.followersCount;
        }

        public long getFollowingCount() {
            return this.followingCount;
        }

        public String getMainIcon() {
            return this.mainIcon;
        }

        public String getMainName() {
            return this.mainName;
        }

        public String getSecondaryIcon() {
            return this.secondaryIcon;
        }

        public String getSecondaryName() {
            return this.secondaryName;
        }

        public long getStoreId() {
            return this.storeId;
        }

        public StoreTheme getStoreTheme() {
            return this.storeTheme;
        }

        public int getThemeColor() {
            return this.themeColor;
        }

        public boolean isFollowingStore() {
            return this.followingStore;
        }

        public boolean isOwner() {
            return this.owner;
        }

        public boolean isShowApps() {
            return this.showApps;
        }

        public boolean isShowButton() {
            return this.showButton;
        }
    }

    public GridStoreMetaWidget(View view) {
        super(view);
    }

    private void navigateToAppsListScreen(long j) {
        getFragmentNavigator().navigateTo(ListStoreAppsFragment.newInstance(j), true);
    }

    private void navigateToEditStore(long j, StoreTheme storeTheme, String str, String str2, String str3, int i) {
        getFragmentNavigator().navigateForResult(ManageStoreFragment.newInstance(new ManageStoreViewModel(j, storeTheme, str, str2, str3), false), i, true);
    }

    private void navigateToFollowersScreen(GridStoreMetaDisplayable gridStoreMetaDisplayable, Resources resources, FragmentNavigator fragmentNavigator) {
        String formattedString = AptoideUtils.StringU.getFormattedString(C1086R.string.social_timeline_followers_fragment_title, resources, Long.valueOf(gridStoreMetaDisplayable.getFollowersCount()));
        if (gridStoreMetaDisplayable.hasUser()) {
            fragmentNavigator.navigateTo(TimeLineFollowersFragment.newInstanceUsingUser(Long.valueOf(gridStoreMetaDisplayable.getUserId()), gridStoreMetaDisplayable.getStoreThemeName(), formattedString, StoreContext.meta), true);
        } else {
            fragmentNavigator.navigateTo(TimeLineFollowersFragment.newInstanceUsingStore(Long.valueOf(gridStoreMetaDisplayable.getStoreId()), gridStoreMetaDisplayable.getStoreThemeName(), formattedString, StoreContext.meta), true);
        }
    }

    private void navigateToFollowingScreen(GridStoreMetaDisplayable gridStoreMetaDisplayable, FragmentNavigator fragmentNavigator, Resources resources) {
        String formattedString = AptoideUtils.StringU.getFormattedString(C1086R.string.social_timeline_following_fragment_title, resources, Long.valueOf(gridStoreMetaDisplayable.getFollowingsCount()));
        if (gridStoreMetaDisplayable.hasStore()) {
            fragmentNavigator.navigateTo(TimeLineFollowingFragment.newInstanceUsingStoreId(Long.valueOf(gridStoreMetaDisplayable.getStoreId()), gridStoreMetaDisplayable.getStoreThemeName(), formattedString, StoreContext.meta), true);
        } else {
            fragmentNavigator.navigateTo(TimeLineFollowingFragment.newInstanceUsingUserId(Long.valueOf(gridStoreMetaDisplayable.getUserId()), gridStoreMetaDisplayable.getStoreThemeName(), formattedString, StoreContext.meta), true);
        }
    }

    private void setupActionButton(boolean z, boolean z2, long j, StoreTheme storeTheme, String str, String str2, String str3, boolean z3, int i, int i2) {
        if (z) {
            this.buttonsLayout.setVisibility(0);
            if (z2) {
                setupEditButton(j, storeTheme, str, str2, str3, i);
                return;
            }
            String str4 = str;
            setupFollowButton(str, z3, i2);
            return;
        }
        this.buttonsLayout.setVisibility(8);
    }

    private void setupEditButton(long j, StoreTheme storeTheme, String str, String str2, String str3, int i) {
        this.editStoreButton.setVisibility(0);
        this.followStoreButton.setVisibility(8);
        this.editStoreButton.setOnClickListener(new C4348q0(this, j, storeTheme, str, str2, str3, i));
    }

    private void setupFollowButton(String str, boolean z, int i) {
        this.editStoreButton.setVisibility(8);
        this.followStoreButton.setVisibility(0);
        this.followStoreButton.setBackgroundResource(i);
        if (z) {
            setupUnfollowButton(str);
        } else {
            setupFollowButton(str);
        }
    }

    private void setupUnfollowButton(String str) {
        this.followStoreButton.setOnClickListener(new C4379w0(this, str));
        this.followStoreButton.setText(C1086R.string.unfollow);
    }

    private void showAppsCount(long j, ParcelableSpan[] parcelableSpanArr, boolean z, long j2) {
        if (z) {
            this.appsCountTv.setVisibility(0);
            String withSuffix = AptoideUtils.StringU.withSuffix(j);
            String format = String.format(getContext().getString(C1086R.string.storehometab_short_apps), new Object[]{withSuffix});
            this.appsCountTv.setText(this.spannableFactory.createMultiSpan(format, parcelableSpanArr, withSuffix));
            this.appsCountTv.setOnClickListener(new C4351r0(this, j2));
            return;
        }
        this.appsCountTv.setVisibility(8);
    }

    private void showBadge(HomeMeta.Badge badge, boolean z) {
        switch (C42551.f7349x2685ebd[badge.ordinal()]) {
            case 1:
                this.badgeIcon.setVisibility(8);
                break;
            case 2:
                this.badgeIcon.setImageResource(C1086R.C1087drawable.tin_medal_gradient);
                this.badgeIcon.setVisibility(0);
                break;
            case 3:
                this.badgeIcon.setImageResource(C1086R.C1087drawable.bronze_medal_gradient);
                this.badgeIcon.setVisibility(0);
                break;
            case 4:
                this.badgeIcon.setImageResource(C1086R.C1087drawable.silver_medal_gradient);
                this.badgeIcon.setVisibility(0);
                break;
            case 5:
                this.badgeIcon.setImageResource(C1086R.C1087drawable.gold_medal_gradient);
                this.badgeIcon.setVisibility(0);
                break;
            case 6:
                this.badgeIcon.setImageResource(C1086R.C1087drawable.platinum_medal_gradient);
                this.badgeIcon.setVisibility(0);
                break;
        }
        this.badgeIcon.setOnClickListener(new C4373u0(this, badge, z));
    }

    private void showDescription(String str) {
        if (str == null || str.isEmpty()) {
            this.description.setVisibility(8);
            return;
        }
        this.description.setText(str);
        this.description.setVisibility(0);
    }

    private void showFollowStoreError() {
        this.followStoreButton.setText(C1086R.string.follow);
        this.followStoreButton.setEnabled(true);
        Snackbar.m28075a(this.itemView, (int) C1086R.string.storetab_short_follow_error, 0).mo31972k();
    }

    private void showFollowersCount(long j, ParcelableSpan[] parcelableSpanArr) {
        String withSuffix = AptoideUtils.StringU.withSuffix(j);
        String format = String.format(getContext().getString(C1086R.string.storehometab_short_subscribers), new Object[]{withSuffix});
        this.followersCountTv.setText(this.spannableFactory.createMultiSpan(format, parcelableSpanArr, withSuffix));
    }

    private void showFollowingCount(long j, ParcelableSpan[] parcelableSpanArr) {
        String withSuffix = AptoideUtils.StringU.withSuffix(j);
        String format = String.format(getContext().getString(C1086R.string.storehometab_short_following), new Object[]{withSuffix});
        this.followingCountTv.setText(this.spannableFactory.createMultiSpan(format, parcelableSpanArr, withSuffix));
    }

    private void showMainIcon(String str) {
        ImageLoader.with(getContext()).loadWithShadowCircleTransform(str, this.mainIcon);
    }

    private void showMainName(String str) {
        if (str != null) {
            this.mainName.setText(str);
        }
    }

    private void showSecondaryIcon(String str) {
        if (str != null) {
            ImageLoader.with(getContext()).loadWithShadowCircleTransform(str, this.secondaryIcon);
            this.secondaryIcon.setVisibility(0);
            return;
        }
        this.secondaryIcon.setVisibility(8);
    }

    private void showSecondaryName(String str) {
        TextView textView = this.secondaryName;
        if (textView != null) {
            textView.setText(str);
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo14672a(GridStoreMetaDisplayable gridStoreMetaDisplayable, Resources resources, FragmentNavigator fragmentNavigator, View view) {
        navigateToFollowersScreen(gridStoreMetaDisplayable, resources, fragmentNavigator);
    }

    /* access modifiers changed from: protected */
    public void assignViews(View view) {
        this.mainIcon = (ImageView) view.findViewById(C1086R.C1088id.main_icon);
        this.secondaryIcon = (ImageView) view.findViewById(C1086R.C1088id.secondary_icon);
        this.mainName = (TextView) view.findViewById(C1086R.C1088id.main_name);
        this.secondaryName = (TextView) view.findViewById(C1086R.C1088id.secondary_name);
        this.description = (TextView) view.findViewById(C1086R.C1088id.description);
        this.followStoreButton = (Button) view.findViewById(C1086R.C1088id.follow_store_button);
        this.editStoreButton = view.findViewById(C1086R.C1088id.edit_store_button);
        this.badgeIcon = (ImageView) view.findViewById(C1086R.C1088id.medal_icon);
        this.appsCountTv = (TextView) view.findViewById(C1086R.C1088id.apps_text_view);
        this.followingCountTv = (TextView) view.findViewById(C1086R.C1088id.following_text_view);
        this.buttonsLayout = view.findViewById(C1086R.C1088id.action_button_layout);
        this.followersCountTv = (TextView) view.findViewById(C1086R.C1088id.followers_text_view);
    }

    /* renamed from: b */
    public /* synthetic */ void mo14678b(String str, View view) {
        this.storeUtilsProxy.unSubscribeStore(str);
    }

    /* renamed from: a */
    public /* synthetic */ void mo14673a(GridStoreMetaDisplayable gridStoreMetaDisplayable, FragmentNavigator fragmentNavigator, Resources resources, View view) {
        navigateToFollowingScreen(gridStoreMetaDisplayable, fragmentNavigator, resources);
    }

    public void bindView(GridStoreMetaDisplayable gridStoreMetaDisplayable, int i) {
        this.badgeDialogFactory = gridStoreMetaDisplayable.getBadgeDialogFactory();
        this.accountManager = gridStoreMetaDisplayable.getAptoideAccountManager();
        this.storeUtilsProxy = gridStoreMetaDisplayable.getStoreUtilsProxy();
        this.spannableFactory = new SpannableFactory();
        FragmentNavigator fragmentNavigator = getFragmentNavigator();
        Resources resources = getContext().getResources();
        this.followersCountTv.setOnClickListener(new C4339n0(this, gridStoreMetaDisplayable, resources, fragmentNavigator));
        this.followingCountTv.setOnClickListener(new C4368t0(this, gridStoreMetaDisplayable, fragmentNavigator, resources));
        this.compositeSubscription.mo18721a(gridStoreMetaDisplayable.getHomeMeta(this.accountManager).mo18644a(C5376a.m10346b()).mo18664b(new C4365s0(this, gridStoreMetaDisplayable)).mo18693i());
    }

    /* renamed from: a */
    public /* synthetic */ void mo14674a(GridStoreMetaDisplayable gridStoreMetaDisplayable, HomeMeta homeMeta) {
        ParcelableSpan[] parcelableSpanArr = {new StyleSpan(1), new ForegroundColorSpan(homeMeta.getThemeColor())};
        showMainIcon(homeMeta.getMainIcon());
        showSecondaryIcon(homeMeta.getSecondaryIcon());
        showMainName(homeMeta.getMainName());
        showSecondaryName(homeMeta.getSecondaryName());
        setupActionButton(homeMeta.isShowButton(), homeMeta.isOwner(), homeMeta.getStoreId(), homeMeta.getStoreTheme(), homeMeta.getMainName(), homeMeta.getDescription(), homeMeta.getMainIcon(), homeMeta.isFollowingStore(), gridStoreMetaDisplayable.getRequestCode(), gridStoreMetaDisplayable.getRaisedButtonBackground());
        showAppsCount(homeMeta.getAppsCount(), parcelableSpanArr, homeMeta.isShowApps(), homeMeta.getStoreId());
        showFollowersCount(homeMeta.getFollowersCount(), parcelableSpanArr);
        showFollowingCount(homeMeta.getFollowingCount(), parcelableSpanArr);
        showDescription(homeMeta.getDescription());
        showBadge(homeMeta.getBadge(), homeMeta.isOwner());
    }

    private void setupFollowButton(String str) {
        this.followStoreButton.setText(C1086R.string.follow);
        this.followStoreButton.setOnClickListener(new C4376v0(this, str));
    }

    /* renamed from: a */
    public /* synthetic */ void mo14675a(HomeMeta.Badge badge, boolean z, View view) {
        this.badgeDialogFactory.create(badge, z).show();
    }

    /* renamed from: a */
    public /* synthetic */ void mo14669a(long j, View view) {
        navigateToAppsListScreen(j);
    }

    /* renamed from: a */
    public /* synthetic */ void mo14676a(String str, View view) {
        this.storeUtilsProxy.subscribeStoreObservable(str).mo18644a(C5376a.m10346b()).mo18663b((C5377a) new C4342o0(this)).mo18655a(new C4305m0(this), (C5378b<Throwable>) new C4345p0(this));
    }

    /* renamed from: a */
    public /* synthetic */ void mo14668a() {
        this.followStoreButton.setText(C1086R.string.unfollow);
        this.followStoreButton.setEnabled(false);
    }

    /* renamed from: a */
    public /* synthetic */ void mo14671a(GetStoreMeta getStoreMeta) {
        if (getStoreMeta.isOk()) {
            this.followStoreButton.setText(C1086R.string.unfollow);
            this.followStoreButton.setEnabled(true);
            return;
        }
        showFollowStoreError();
    }

    /* renamed from: a */
    public /* synthetic */ void mo14677a(Throwable th) {
        showFollowStoreError();
    }

    /* renamed from: a */
    public /* synthetic */ void mo14670a(long j, StoreTheme storeTheme, String str, String str2, String str3, int i, View view) {
        navigateToEditStore(j, storeTheme, str, str2, str3, i);
    }
}
