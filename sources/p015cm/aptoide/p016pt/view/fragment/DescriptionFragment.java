package p015cm.aptoide.p016pt.view.fragment;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.C0069a;
import androidx.appcompat.app.C0076d;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.C0394a;
import javax.inject.Inject;
import okhttp3.OkHttpClient;
import p015cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import p015cm.aptoide.p016pt.AptoideApplication;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.dataprovider.WebService;
import p015cm.aptoide.p016pt.dataprovider.aab.AppBundlesVisibilityManager;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.GetApp;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.GetAppMeta;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.GetAppRequest;
import p015cm.aptoide.p016pt.logger.Logger;
import p015cm.aptoide.p016pt.store.StoreCredentialsProvider;
import p015cm.aptoide.p016pt.store.StoreUtils;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p015cm.aptoide.p016pt.utils.AptoideUtils;
import p015cm.aptoide.p016pt.view.NotBottomNavigationView;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.view.fragment.DescriptionFragment */
public class DescriptionFragment extends BaseLoaderToolbarFragment implements NotBottomNavigationView {
    private static final String APP_ID = "app_id";
    private static final String APP_NAME = "APP_NAME";
    private static final String DESCRIPTION = "description";
    private static final String HAS_APPC = "HAS_APPC";
    private static final String PACKAGE_NAME = "packageName";
    private static final String STORE_NAME = "store_name";
    private static final String TAG = DescriptionFragment.class.getSimpleName();
    @Inject
    AppBundlesVisibilityManager appBundlesVisibilityManager;
    private long appId;
    private String appName;
    private BodyInterceptor<BaseBody> baseBodyBodyInterceptor;
    private Converter.Factory converterFactory;
    private String description;
    private TextView descriptionContainer;
    private TextView emptyData;
    private boolean hasAppId = false;
    private boolean hasAppc;
    private OkHttpClient httpClient;
    private String packageName;
    private String partnerId;
    @Inject
    StoreCredentialsProvider storeCredentialsProvider;
    private String storeName;
    @Inject
    ThemeManager themeManager;
    private Toolbar toolbar;

    private boolean hasAppc(GetApp getApp) {
        return getApp.getNodes().getMeta().getData().hasAdvertising() || getApp.getNodes().getMeta().getData().hasBilling();
    }

    public static DescriptionFragment newInstance(String str, String str2, boolean z) {
        DescriptionFragment descriptionFragment = new DescriptionFragment();
        Bundle bundle = new Bundle();
        bundle.putString(APP_NAME, str);
        bundle.putString(DESCRIPTION, str2);
        bundle.putBoolean(HAS_APPC, z);
        descriptionFragment.setArguments(bundle);
        return descriptionFragment;
    }

    private void setDataUnavailable() {
        this.emptyData.setVisibility(0);
        this.descriptionContainer.setVisibility(8);
    }

    private void setupAppDescription(GetApp getApp) {
        try {
            GetAppMeta.Media media = getApp.getNodes().getMeta().getData().getMedia();
            if (!TextUtils.isEmpty(media.getDescription())) {
                this.descriptionContainer.setText(AptoideUtils.HtmlU.parse(media.getDescription()));
                return;
            }
        } catch (NullPointerException e) {
            CrashReport.getInstance().log(e);
        }
        setDataUnavailable();
    }

    private void setupAppcAppView() {
        this.toolbar.setBackground(C0394a.m1917c(getContext(), this.themeManager.getAttributeForTheme(C1086R.attr.appDescriptionToolbarAppc).resourceId));
    }

    private void setupTitle(GetApp getApp) {
        try {
            String name = getApp.getNodes().getMeta().getData().getName();
            if (!TextUtils.isEmpty(name) && hasToolbar()) {
                ((C0076d) getActivity()).getSupportActionBar().mo182a((CharSequence) name);
                return;
            }
        } catch (NullPointerException e) {
            CrashReport.getInstance().log(e);
        }
        setDataUnavailable();
    }

    /* renamed from: a */
    public /* synthetic */ void mo15619a(GetApp getApp) {
        setupAppDescription(getApp);
        setupTitle(getApp);
        finishLoading();
        if (hasAppc(getApp)) {
            this.hasAppc = true;
            setupAppcAppView();
        }
    }

    public void bindViews(View view) {
        super.bindViews(view);
        this.emptyData = (TextView) view.findViewById(C1086R.C1088id.empty_data);
        this.descriptionContainer = (TextView) view.findViewById(C1086R.C1088id.data_container);
        this.toolbar = (Toolbar) view.findViewById(C1086R.C1088id.toolbar);
    }

    /* access modifiers changed from: protected */
    public boolean displayHomeUpAsEnabled() {
        return true;
    }

    public int getContentViewId() {
        return C1086R.layout.fragment_app_view_description;
    }

    public ScreenTagHistory getHistoryTracker() {
        return ScreenTagHistory.Builder.build(DescriptionFragment.class.getSimpleName());
    }

    /* access modifiers changed from: protected */
    public int getViewToShowAfterLoadingId() {
        return C1086R.C1088id.data_container;
    }

    /* access modifiers changed from: protected */
    public int[] getViewsToShowAfterLoadingId() {
        return new int[0];
    }

    public void load(boolean z, boolean z2, Bundle bundle) {
        if (!TextUtils.isEmpty(this.description) && !TextUtils.isEmpty(this.appName)) {
            this.descriptionContainer.setText(AptoideUtils.HtmlU.parse(this.description));
            if (hasToolbar()) {
                C0069a supportActionBar = ((C0076d) getActivity()).getSupportActionBar();
                if (supportActionBar != null) {
                    supportActionBar.mo182a((CharSequence) this.appName);
                }
                if (this.hasAppc) {
                    setupAppcAppView();
                }
            }
            finishLoading();
        } else if (this.hasAppId) {
            GetAppRequest.m5250of(this.appId, this.partnerId == null ? null : this.storeName, StoreUtils.getStoreCredentials(this.storeName, this.storeCredentialsProvider), this.packageName, this.baseBodyBodyInterceptor, this.httpClient, this.converterFactory, ((AptoideApplication) getContext().getApplicationContext()).getTokenInvalidator(), ((AptoideApplication) getContext().getApplicationContext()).getDefaultSharedPreferences(), this.appBundlesVisibilityManager).execute(new C4632c(this), false);
        } else {
            Logger.getInstance().mo12979e(TAG, "App id unavailable");
            setDataUnavailable();
        }
    }

    public void loadExtras(Bundle bundle) {
        super.loadExtras(bundle);
        if (bundle.containsKey("app_id")) {
            this.appId = bundle.getLong("app_id", -1);
            this.hasAppId = true;
        }
        if (bundle.containsKey("packageName")) {
            this.packageName = bundle.getString("packageName");
        }
        if (bundle.containsKey("store_name")) {
            this.storeName = bundle.getString("store_name");
        }
        if (bundle.containsKey(DESCRIPTION)) {
            this.description = bundle.getString(DESCRIPTION);
        }
        if (bundle.containsKey(APP_NAME)) {
            this.appName = bundle.getString(APP_NAME);
        }
        if (bundle.containsKey(HAS_APPC)) {
            this.hasAppc = bundle.getBoolean(HAS_APPC);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getFragmentComponent(bundle).inject(this);
        AptoideApplication aptoideApplication = (AptoideApplication) getContext().getApplicationContext();
        this.baseBodyBodyInterceptor = aptoideApplication.getAccountSettingsBodyInterceptorPoolV7();
        this.httpClient = aptoideApplication.getDefaultClient();
        this.converterFactory = WebService.getDefaultConverter();
        this.partnerId = aptoideApplication.getPartnerId();
        setHasOptionsMenu(true);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        menuInflater.inflate(C1086R.C1089menu.menu_empty, menu);
    }

    public void onDestroyView() {
        super.onDestroyView();
    }
}
