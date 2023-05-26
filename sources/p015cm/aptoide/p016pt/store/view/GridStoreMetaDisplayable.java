package p015cm.aptoide.p016pt.store.view;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.List;
import okhttp3.OkHttpClient;
import p015cm.aptoide.accountmanager.Account;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.p016pt.BuildConfig;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.database.room.RoomStore;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.GetHomeMeta;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.HomeUser;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.Store;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.GetHomeMetaRequest;
import p015cm.aptoide.p016pt.navigator.FragmentNavigator;
import p015cm.aptoide.p016pt.navigator.Result;
import p015cm.aptoide.p016pt.store.RoomStoreRepository;
import p015cm.aptoide.p016pt.store.StoreAnalytics;
import p015cm.aptoide.p016pt.store.StoreCredentialsProvider;
import p015cm.aptoide.p016pt.store.StoreUtilsProxy;
import p015cm.aptoide.p016pt.store.view.GridStoreMetaWidget;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p015cm.aptoide.p016pt.view.recycler.displayable.Displayable;
import p015cm.aptoide.p016pt.view.recycler.displayable.DisplayablePojo;
import p123rx.C5368e;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.store.view.GridStoreMetaDisplayable */
public class GridStoreMetaDisplayable extends DisplayablePojo<GetHomeMeta> {
    public static final int REQUEST_CODE = 53298475;
    private AptoideAccountManager aptoideAccountManager;
    private BadgeDialogFactory badgeDialogFactory;
    private BodyInterceptor<BaseBody> bodyInterceptorV7;
    private OkHttpClient client;
    private Converter.Factory converter;
    private FragmentNavigator fragmentNavigator;
    private SharedPreferences sharedPreferences;
    private StoreAnalytics storeAnalytics;
    private StoreCredentialsProvider storeCredentialsProvider;
    private RoomStoreRepository storeRepository;
    private StoreUtilsProxy storeUtilsProxy;
    private ThemeManager themeManager;
    private TokenInvalidator tokenInvalidator;

    /* renamed from: cm.aptoide.pt.store.view.GridStoreMetaDisplayable$1 */
    static /* synthetic */ class C42541 {

        /* renamed from: $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$store$Store$BadgeType */
        static final /* synthetic */ int[] f7348x6cf1c276;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                cm.aptoide.pt.dataprovider.model.v7.store.Store$BadgeType[] r0 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.Store.BadgeType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f7348x6cf1c276 = r0
                cm.aptoide.pt.dataprovider.model.v7.store.Store$BadgeType r1 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.Store.BadgeType.BRONZE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f7348x6cf1c276     // Catch:{ NoSuchFieldError -> 0x001d }
                cm.aptoide.pt.dataprovider.model.v7.store.Store$BadgeType r1 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.Store.BadgeType.SILVER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f7348x6cf1c276     // Catch:{ NoSuchFieldError -> 0x0028 }
                cm.aptoide.pt.dataprovider.model.v7.store.Store$BadgeType r1 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.Store.BadgeType.GOLD     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f7348x6cf1c276     // Catch:{ NoSuchFieldError -> 0x0033 }
                cm.aptoide.pt.dataprovider.model.v7.store.Store$BadgeType r1 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.Store.BadgeType.PLATINUM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f7348x6cf1c276     // Catch:{ NoSuchFieldError -> 0x003e }
                cm.aptoide.pt.dataprovider.model.v7.store.Store$BadgeType r1 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.Store.BadgeType.NONE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.store.view.GridStoreMetaDisplayable.C42541.<clinit>():void");
        }
    }

    public GridStoreMetaDisplayable() {
    }

    /* renamed from: b */
    static /* synthetic */ Boolean m7309b(Result result) {
        return Boolean.valueOf(result.getResultCode() == -1);
    }

    private Store getStore() {
        return ((GetHomeMeta) getPojo()).getData().getStore();
    }

    private HomeUser getUser() {
        return ((GetHomeMeta) getPojo()).getData().getUser();
    }

    private String getUserName() {
        if (getUser() == null) {
            return null;
        }
        return getUser().getName();
    }

    private C5368e<GetHomeMeta> updateStoreMeta() {
        return this.fragmentNavigator.results(REQUEST_CODE).mo18681d(C4277e0.f7365f).mo18687f(new C4287g0(this)).mo18664b(new C4296j0(this));
    }

    /* renamed from: a */
    public /* synthetic */ Boolean mo14636a(Account account) {
        return Boolean.valueOf((getStore() == null || account.getStore() == null || !account.getStore().getName().equals(getStore().getName())) ? false : true);
    }

    public long getAppsCount() {
        Store store = getStore();
        if (store != null) {
            return (long) store.getStats().getApps();
        }
        return 0;
    }

    public AptoideAccountManager getAptoideAccountManager() {
        return this.aptoideAccountManager;
    }

    public GridStoreMetaWidget.HomeMeta.Badge getBadge() {
        if (!hasStore()) {
            return GridStoreMetaWidget.HomeMeta.Badge.NONE;
        }
        int i = C42541.f7348x6cf1c276[((GetHomeMeta) getPojo()).getData().getStore().getBadge().getName().ordinal()];
        if (i == 1) {
            return GridStoreMetaWidget.HomeMeta.Badge.BRONZE;
        }
        if (i == 2) {
            return GridStoreMetaWidget.HomeMeta.Badge.SILVER;
        }
        if (i == 3) {
            return GridStoreMetaWidget.HomeMeta.Badge.GOLD;
        }
        if (i == 4) {
            return GridStoreMetaWidget.HomeMeta.Badge.PLATINUM;
        }
        if (i != 5) {
            return GridStoreMetaWidget.HomeMeta.Badge.NONE;
        }
        return GridStoreMetaWidget.HomeMeta.Badge.TIN;
    }

    public BadgeDialogFactory getBadgeDialogFactory() {
        return this.badgeDialogFactory;
    }

    /* access modifiers changed from: protected */
    public Displayable.Configs getConfig() {
        return new Displayable.Configs(1, true);
    }

    public String getDescription() {
        Store store = getStore();
        if (store != null) {
            return store.getAppearance().getDescription();
        }
        return null;
    }

    public long getFollowersCount() {
        return ((GetHomeMeta) getPojo()).getData().getStats().getFollowers();
    }

    public long getFollowingsCount() {
        return ((GetHomeMeta) getPojo()).getData().getStats().getFollowing();
    }

    public C5368e<GridStoreMetaWidget.HomeMeta> getHomeMeta(AptoideAccountManager aptoideAccountManager2) {
        return C5368e.m10254b(isFollowingStore(), (C5368e<Boolean>) updateStoreMeta().mo18687f(new C4290h0(this)).mo18669c()).mo18687f(new C4302l0(this, aptoideAccountManager2));
    }

    public String getMainIcon() {
        if (getStore() != null) {
            return getStore().getAvatar();
        }
        return getUserIcon();
    }

    public String getMainName() {
        Store store = getStore();
        if (store != null) {
            return store.getName();
        }
        return getUserName();
    }

    public int getRaisedButtonBackground() {
        return this.themeManager.getAttributeForTheme(C1086R.attr.raisedButtonSecondaryBackground).resourceId;
    }

    public int getRequestCode() {
        return REQUEST_CODE;
    }

    public String getSecondaryIcon() {
        if (getStore() == null) {
            return null;
        }
        return getUserIcon();
    }

    public String getSecondaryName() {
        if (getStore() != null) {
            return getUserName();
        }
        return null;
    }

    public StoreAnalytics getStoreAnalytics() {
        return this.storeAnalytics;
    }

    public StoreCredentialsProvider getStoreCredentialsProvider() {
        return this.storeCredentialsProvider;
    }

    public long getStoreId() {
        if (getStore() == null) {
            return 0;
        }
        return getStore().getId();
    }

    public String getStoreName() {
        return getStore().getName();
    }

    public String getStoreThemeName() {
        Store store = getStore();
        return (store == null || store.getAppearance() == null) ? BuildConfig.APTOIDE_THEME : store.getAppearance().getTheme();
    }

    public StoreUtilsProxy getStoreUtilsProxy() {
        return this.storeUtilsProxy;
    }

    public String getUserIcon() {
        if (getUser() != null) {
            return getUser().getAvatar();
        }
        return null;
    }

    public long getUserId() {
        return getUser().getId();
    }

    public int getViewLayout() {
        return C1086R.layout.displayable_store_meta;
    }

    public boolean hasStore() {
        return getStore() != null;
    }

    public boolean hasUser() {
        return getUser() != null;
    }

    public C5368e<Boolean> isFollowingStore() {
        if (getStore() != null) {
            return this.storeRepository.getAll().mo18694j(new C4280f0(this)).mo18656b();
        }
        return C5368e.m10257c(false);
    }

    public C5368e<Boolean> isStoreOwner(AptoideAccountManager aptoideAccountManager2) {
        return aptoideAccountManager2.accountStatus().mo18669c().mo18694j(new C4299k0(this));
    }

    public GridStoreMetaDisplayable(GetHomeMeta getHomeMeta, StoreCredentialsProvider storeCredentialsProvider2, StoreAnalytics storeAnalytics2, BadgeDialogFactory badgeDialogFactory2, FragmentNavigator fragmentNavigator2, RoomStoreRepository roomStoreRepository, BodyInterceptor<BaseBody> bodyInterceptor, OkHttpClient okHttpClient, Converter.Factory factory, TokenInvalidator tokenInvalidator2, SharedPreferences sharedPreferences2, ThemeManager themeManager2, StoreUtilsProxy storeUtilsProxy2, AptoideAccountManager aptoideAccountManager2) {
        super(getHomeMeta);
        this.storeCredentialsProvider = storeCredentialsProvider2;
        this.storeAnalytics = storeAnalytics2;
        this.badgeDialogFactory = badgeDialogFactory2;
        this.fragmentNavigator = fragmentNavigator2;
        this.storeRepository = roomStoreRepository;
        this.bodyInterceptorV7 = bodyInterceptor;
        this.client = okHttpClient;
        this.converter = factory;
        this.tokenInvalidator = tokenInvalidator2;
        this.sharedPreferences = sharedPreferences2;
        this.themeManager = themeManager2;
        this.storeUtilsProxy = storeUtilsProxy2;
        this.aptoideAccountManager = aptoideAccountManager2;
    }

    /* renamed from: b */
    public /* synthetic */ void mo14641b(GetHomeMeta getHomeMeta) {
        setPojo(getHomeMeta);
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo14639a(GetHomeMeta getHomeMeta) {
        return isFollowingStore();
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo14638a(AptoideAccountManager aptoideAccountManager2, Boolean bool) {
        return isStoreOwner(aptoideAccountManager2).mo18694j(new C4293i0(this, bool));
    }

    /* renamed from: a */
    public /* synthetic */ GridStoreMetaWidget.HomeMeta mo14635a(Boolean bool, Boolean bool2) {
        return new GridStoreMetaWidget.HomeMeta(getMainIcon(), getSecondaryIcon(), getMainName(), getSecondaryName(), bool2.booleanValue(), hasStore(), bool.booleanValue(), getAppsCount(), getFollowersCount(), getFollowingsCount(), getDescription(), this.themeManager.getStoreTheme(getStoreThemeName()), this.themeManager.getAttributeForTheme(C1086R.attr.themeTextColor).data, getStoreId(), hasStore(), getBadge());
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo14640a(Result result) {
        return GetHomeMetaRequest.m5361of(this.storeCredentialsProvider.get(getStoreId()), this.bodyInterceptorV7, this.client, this.converter, this.tokenInvalidator, this.sharedPreferences).observe(true, true);
    }

    /* renamed from: a */
    public /* synthetic */ Boolean mo14637a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((RoomStore) it.next()).getStoreName().equals(getStoreName())) {
                return true;
            }
        }
        return false;
    }
}
