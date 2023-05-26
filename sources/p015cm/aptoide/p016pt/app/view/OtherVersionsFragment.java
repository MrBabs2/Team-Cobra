package p015cm.aptoide.p016pt.app.view;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import okhttp3.OkHttpClient;
import p015cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import p015cm.aptoide.p016pt.AptoideApplication;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.app.view.displayable.OtherVersionDisplayable;
import p015cm.aptoide.p016pt.dataprovider.WebService;
import p015cm.aptoide.p016pt.dataprovider.aab.AppBundlesVisibilityManager;
import p015cm.aptoide.p016pt.dataprovider.aab.AppBundlesVisibilitySettingsProvider;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.listapp.App;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.listapp.ListAppVersions;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.listapps.ListAppVersionsRequest;
import p015cm.aptoide.p016pt.logger.Logger;
import p015cm.aptoide.p016pt.networking.image.ImageLoader;
import p015cm.aptoide.p016pt.preferences.managed.ManagerPreferences;
import p015cm.aptoide.p016pt.store.RoomStoreRepository;
import p015cm.aptoide.p016pt.store.StoreUtils;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p015cm.aptoide.p016pt.util.AppBarStateChangeListener;
import p015cm.aptoide.p016pt.utils.AptoideUtils;
import p015cm.aptoide.p016pt.view.fragment.AptoideBaseFragment;
import p015cm.aptoide.p016pt.view.recycler.BaseAdapter;
import p015cm.aptoide.p016pt.view.recycler.EndlessRecyclerOnScrollListener;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.app.view.OtherVersionsFragment */
public class OtherVersionsFragment extends AptoideBaseFragment<BaseAdapter> {
    private static final String TAG = OtherVersionsFragment.class.getSimpleName();
    private String appImgUrl;
    private String appName;
    private String appPackge;
    private BodyInterceptor<BaseBody> baseBodyInterceptor;
    private CollapsingToolbarLayout collapsingToolbarLayout;
    private Converter.Factory converterFactory;
    private EndlessRecyclerOnScrollListener endlessRecyclerOnScrollListener;
    private ViewHeader header;
    private OkHttpClient httpClient;
    private SharedPreferences sharedPreferences;
    @Inject
    RoomStoreRepository storeRepository;
    private ThemeManager themeManager;

    /* renamed from: cm.aptoide.pt.app.view.OtherVersionsFragment$1 */
    static /* synthetic */ class C14391 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$util$AppBarStateChangeListener$State;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                cm.aptoide.pt.util.AppBarStateChangeListener$State[] r0 = p015cm.aptoide.p016pt.util.AppBarStateChangeListener.State.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$cm$aptoide$pt$util$AppBarStateChangeListener$State = r0
                cm.aptoide.pt.util.AppBarStateChangeListener$State r1 = p015cm.aptoide.p016pt.util.AppBarStateChangeListener.State.EXPANDED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$cm$aptoide$pt$util$AppBarStateChangeListener$State     // Catch:{ NoSuchFieldError -> 0x001d }
                cm.aptoide.pt.util.AppBarStateChangeListener$State r1 = p015cm.aptoide.p016pt.util.AppBarStateChangeListener.State.IDLE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$cm$aptoide$pt$util$AppBarStateChangeListener$State     // Catch:{ NoSuchFieldError -> 0x0028 }
                cm.aptoide.pt.util.AppBarStateChangeListener$State r1 = p015cm.aptoide.p016pt.util.AppBarStateChangeListener.State.MOVING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.app.view.OtherVersionsFragment.C14391.<clinit>():void");
        }
    }

    /* renamed from: cm.aptoide.pt.app.view.OtherVersionsFragment$BundleCons */
    public class BundleCons {
        public static final String APP_IMG_URL = "app_img_url";
        public static final String APP_NAME = "app_name";
        public static final String APP_PACKAGE = "app_package";

        public BundleCons() {
        }
    }

    /* renamed from: cm.aptoide.pt.app.view.OtherVersionsFragment$ViewHeader */
    private static final class ViewHeader {
        /* access modifiers changed from: private */
        public final boolean animationsEnabled;
        private final AppBarLayout appBarLayout;
        /* access modifiers changed from: private */
        public final ImageView appIcon;
        /* access modifiers changed from: private */
        public final TextView otherVersionsTitle;
        private final View view;

        ViewHeader(View view2, SharedPreferences sharedPreferences) {
            this.view = view2;
            this.animationsEnabled = ManagerPreferences.getAnimationsEnabledStatus(sharedPreferences);
            this.otherVersionsTitle = (TextView) view2.findViewById(C1086R.C1088id.other_versions_title);
            this.appBarLayout = (AppBarLayout) view2.findViewById(C1086R.C1088id.app_bar);
            this.appIcon = (ImageView) view2.findViewById(C1086R.C1088id.app_icon);
            this.appBarLayout.mo30728a((AppBarLayout.C8416e) new AppBarStateChangeListener() {
                public void onStateChanged(AppBarLayout appBarLayout, AppBarStateChangeListener.State state) {
                    if (C14391.$SwitchMap$cm$aptoide$pt$util$AppBarStateChangeListener$State[state.ordinal()] != 1) {
                        if (ViewHeader.this.animationsEnabled) {
                            ViewHeader.this.appIcon.animate().alpha(0.0f).start();
                        } else {
                            ViewHeader.this.appIcon.setVisibility(4);
                        }
                        ViewHeader.this.otherVersionsTitle.setVisibility(4);
                        return;
                    }
                    if (ViewHeader.this.animationsEnabled) {
                        ViewHeader.this.appIcon.animate().alpha(1.0f).start();
                    } else {
                        ViewHeader.this.appIcon.setVisibility(0);
                    }
                    ViewHeader.this.otherVersionsTitle.setVisibility(0);
                }
            });
        }

        /* access modifiers changed from: private */
        public void setImage(String str) {
            ImageLoader.with(this.view.getContext()).load(str, this.appIcon);
        }
    }

    public static OtherVersionsFragment newInstance(String str, String str2, String str3) {
        OtherVersionsFragment otherVersionsFragment = new OtherVersionsFragment();
        Bundle bundle = new Bundle();
        bundle.putString("app_name", str);
        bundle.putString(BundleCons.APP_IMG_URL, str2);
        bundle.putString(BundleCons.APP_PACKAGE, str3);
        otherVersionsFragment.setArguments(bundle);
        return otherVersionsFragment;
    }

    private void setTitle(String str) {
        if (hasToolbar()) {
            getToolbar().setTitle((CharSequence) str);
            this.collapsingToolbarLayout.setTitle(str);
            this.collapsingToolbarLayout.setExpandedTitleColor(getView().getResources().getColor(this.themeManager.getAttributeForTheme(C1086R.attr.textColorGrey900).resourceId));
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo7610a(ListAppVersions listAppVersions) {
        List<App> list = listAppVersions.getList();
        ArrayList arrayList = new ArrayList(list.size());
        for (App otherVersionDisplayable : list) {
            arrayList.add(new OtherVersionDisplayable(otherVersionDisplayable, this.themeManager));
        }
        addDisplayables(arrayList);
        getRecyclerView().setVisibility(0);
    }

    /* access modifiers changed from: protected */
    public boolean displayHomeUpAsEnabled() {
        return true;
    }

    /* access modifiers changed from: protected */
    public void fetchOtherVersions() {
        EndlessRecyclerOnScrollListener endlessRecyclerOnScrollListener2 = new EndlessRecyclerOnScrollListener(getAdapter(), ListAppVersionsRequest.m5347of(this.appPackge, StoreUtils.getSubscribedStoresAuthMap(this.storeRepository), this.baseBodyInterceptor, this.httpClient, this.converterFactory, ((AptoideApplication) getContext().getApplicationContext()).getTokenInvalidator(), ((AptoideApplication) getContext().getApplicationContext()).getDefaultSharedPreferences(), getContext().getResources(), new AppBundlesVisibilityManager(AptoideUtils.isMIUIwithAABFix(), AptoideUtils.isDeviceMIUI(), new AppBundlesVisibilitySettingsProvider(((AptoideApplication) getContext().getApplicationContext()).getDefaultSharedPreferences()))), new C1882wg(this), C1864vg.f4461a);
        this.endlessRecyclerOnScrollListener = endlessRecyclerOnScrollListener2;
        getRecyclerView().addOnScrollListener(this.endlessRecyclerOnScrollListener);
        this.endlessRecyclerOnScrollListener.onLoadMore(false, false);
    }

    public int getContentViewId() {
        return C1086R.layout.fragment_other_versions;
    }

    public ScreenTagHistory getHistoryTracker() {
        return ScreenTagHistory.Builder.build(OtherVersionsFragment.class.getSimpleName());
    }

    public void load(boolean z, boolean z2, Bundle bundle) {
        Logger instance = Logger.getInstance();
        String str = TAG;
        instance.mo12975d(str, "Other versions should refresh? " + z);
        fetchOtherVersions();
        setHeader();
    }

    public void loadExtras(Bundle bundle) {
        super.loadExtras(bundle);
        this.appName = bundle.getString("app_name");
        this.appImgUrl = bundle.getString(BundleCons.APP_IMG_URL);
        this.appPackge = bundle.getString(BundleCons.APP_PACKAGE);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getFragmentComponent(bundle).inject(this);
        this.themeManager = new ThemeManager(getActivity(), ((AptoideApplication) getActivity().getApplicationContext()).getDefaultSharedPreferences());
        this.sharedPreferences = ((AptoideApplication) getContext().getApplicationContext()).getDefaultSharedPreferences();
        this.baseBodyInterceptor = ((AptoideApplication) getContext().getApplicationContext()).getAccountSettingsBodyInterceptorPoolV7();
        this.httpClient = ((AptoideApplication) getContext().getApplicationContext()).getDefaultClient();
        this.converterFactory = WebService.getDefaultConverter();
        setHasOptionsMenu(true);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        menuInflater.inflate(C1086R.C1089menu.menu_empty, menu);
    }

    public void onDestroyView() {
        EndlessRecyclerOnScrollListener endlessRecyclerOnScrollListener2;
        RecyclerView recyclerView = getRecyclerView();
        if (!(recyclerView == null || (endlessRecyclerOnScrollListener2 = this.endlessRecyclerOnScrollListener) == null)) {
            recyclerView.removeOnScrollListener(endlessRecyclerOnScrollListener2);
        }
        this.endlessRecyclerOnScrollListener = null;
        this.header = null;
        this.collapsingToolbarLayout = null;
        super.onDestroyView();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        getActivity().onBackPressed();
        return true;
    }

    public void onResume() {
        super.onResume();
    }

    public void onViewCreated(View view, Bundle bundle) {
        this.header = new ViewHeader(view, this.sharedPreferences);
        this.collapsingToolbarLayout = (CollapsingToolbarLayout) view.findViewById(C1086R.C1088id.collapsing_toolbar);
        super.onViewCreated(view, bundle);
    }

    /* access modifiers changed from: protected */
    public void setHeader() {
        ViewHeader viewHeader = this.header;
        if (viewHeader != null) {
            viewHeader.setImage(this.appImgUrl);
            setTitle(this.appName);
        }
    }
}
