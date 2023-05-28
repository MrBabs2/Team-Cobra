package p015cm.aptoide.p016pt.store.view;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import com.google.android.material.snackbar.Snackbar;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.inject.Inject;
import okhttp3.OkHttpClient;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import p015cm.aptoide.p016pt.AptoideApplication;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.dataprovider.WebService;
import p015cm.aptoide.p016pt.dataprovider.exception.AptoideWsV7Exception;
import p015cm.aptoide.p016pt.dataprovider.interfaces.TokenInvalidator;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.BaseV7Response;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.GetStoreMeta;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.GetStoreMetaRequest;
import p015cm.aptoide.p016pt.logger.Logger;
import p015cm.aptoide.p016pt.navigator.ActivityResultNavigator;
import p015cm.aptoide.p016pt.navigator.FragmentNavigator;
import p015cm.aptoide.p016pt.orientation.ScreenOrientationManager;
import p015cm.aptoide.p016pt.search.SuggestionCursorAdapter;
import p015cm.aptoide.p016pt.search.suggestions.SearchSuggestionManager;
import p015cm.aptoide.p016pt.store.StoreAnalytics;
import p015cm.aptoide.p016pt.store.StoreCredentialsProvider;
import p015cm.aptoide.p016pt.store.StoreUtils;
import p015cm.aptoide.p016pt.store.StoreUtilsProxy;
import p015cm.aptoide.p016pt.utils.AptoideUtils;
import p015cm.aptoide.p016pt.utils.GenericDialogs;
import p015cm.aptoide.p016pt.utils.design.ShowMessage;
import p015cm.aptoide.p016pt.view.fragment.BaseDialogFragment;
import p112n.p118g.p301a.p303b.p308c.p309a.C10686d;
import p112n.p118g.p301a.p303b.p308c.p309a.C10691g;
import p112n.p118g.p301a.p310c.C10695a;
import p123rx.Single;
import p123rx.p124l.p125c.C5376a;
import p123rx.p128t.C5383b;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.store.view.AddStoreDialog */
public class AddStoreDialog extends BaseDialogFragment {
    private static final int COMPLETION_THRESHOLD = 1;
    public static final int PRIVATE_STORE_ERROR_CODE = 22;
    public static final int PRIVATE_STORE_INVALID_CREDENTIALS_CODE = 21;
    private static final String TAG = AddStoreDialog.class.getName();
    private final int PRIVATE_STORE_REQUEST_CODE = 20;
    private AptoideAccountManager accountManager;
    private Button addStoreButton;
    private AnalyticsManager analyticsManager;
    private BodyInterceptor<BaseBody> baseBodyBodyInterceptor;
    private Converter.Factory converterFactory;
    private TextView errorMessage;
    private OkHttpClient httpClient;
    private Dialog loadingDialog;
    private NavigationTracker navigationTracker;
    private FragmentNavigator navigator;
    private ScreenOrientationManager orientationManager;
    private SearchSuggestionManager searchSuggestionManager;
    /* access modifiers changed from: private */
    public SearchView searchView;
    private RelativeLayout searchViewLayout;
    private StoreAnalytics storeAnalytics;
    @Inject
    StoreCredentialsProvider storeCredentialsProvider;
    private String storeName;
    @Inject
    StoreUtilsProxy storeUtilsProxy;
    private C5383b subscriptions;
    private TokenInvalidator tokenInvalidator;
    private Button topStoresButton;

    /* renamed from: cm.aptoide.pt.store.view.AddStoreDialog$2 */
    static /* synthetic */ class C42522 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$store$StoreError;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                cm.aptoide.pt.store.StoreError[] r0 = p015cm.aptoide.p016pt.store.StoreError.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$cm$aptoide$pt$store$StoreError = r0
                cm.aptoide.pt.store.StoreError r1 = p015cm.aptoide.p016pt.store.StoreError.PRIVATE_STORE_ERROR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$cm$aptoide$pt$store$StoreError     // Catch:{ NoSuchFieldError -> 0x001d }
                cm.aptoide.pt.store.StoreError r1 = p015cm.aptoide.p016pt.store.StoreError.STORE_DOESNT_EXIST     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.store.view.AddStoreDialog.C42522.<clinit>():void");
        }
    }

    /* renamed from: cm.aptoide.pt.store.view.AddStoreDialog$BundleArgs */
    private enum BundleArgs {
        STORE_NAME
    }

    /* access modifiers changed from: private */
    /* renamed from: addStoreAction */
    public void mo14606a(String str) {
        this.storeName = str;
        getStore(str);
        showLoadingDialog();
    }

    private void bindViews(View view) {
        this.addStoreButton = (Button) view.findViewById(C1086R.C1088id.button_dialog_add_store);
        this.topStoresButton = (Button) view.findViewById(C1086R.C1088id.button_top_stores);
        this.searchView = (SearchView) view.findViewById(C1086R.C1088id.store_search_view);
        this.searchViewLayout = (RelativeLayout) view.findViewById(C1086R.C1088id.search_box_layout);
        this.errorMessage = (TextView) view.findViewById(C1086R.C1088id.error_message);
        EditText editText = (EditText) this.searchView.findViewById(C1086R.C1088id.search_src_text);
        editText.setTextSize(2, 12.0f);
        editText.setHintTextColor(getResources().getColor(C1086R.color.grey));
    }

    private GetStoreMetaRequest buildRequest(String str) {
        return GetStoreMetaRequest.m5366of(StoreUtils.getStoreCredentials(str, this.storeCredentialsProvider), this.baseBodyBodyInterceptor, this.httpClient, this.converterFactory, this.tokenInvalidator, ((AptoideApplication) getContext().getApplicationContext()).getDefaultSharedPreferences());
    }

    private void dismissIfFocusIsLost() {
        this.subscriptions.mo18721a(C10695a.m36222b(this.searchView).mo18677d(300, TimeUnit.MILLISECONDS).mo18681d(C4344p.f7448f).mo18675c(new C4298k(this)));
    }

    private void executeRequest(GetStoreMetaRequest getStoreMetaRequest) {
        this.storeUtilsProxy.subscribeStore(getStoreMetaRequest, new C4279f(this), new C4347q(this), this.storeName, this.accountManager);
    }

    private void getStore(String str) {
        executeRequest(buildRequest(str));
    }

    private void handleEmptyQuery(SuggestionCursorAdapter suggestionCursorAdapter) {
        this.subscriptions.mo18721a(C10686d.m36212a(this.searchView).mo18644a(C5376a.m10346b()).mo18681d(C4341o.f7444f).mo18664b(new C4286g(suggestionCursorAdapter)).mo18693i());
    }

    private void handleStoreRemoteQuery(SuggestionCursorAdapter suggestionCursorAdapter) {
        this.subscriptions.mo18721a(C10686d.m36212a(this.searchView).mo18681d(C4263a.f7350f).mo18694j(C4292i.f7383f).mo18681d(C4276e.f7364f).mo18692i(new C4338n(this, suggestionCursorAdapter)).mo18686f().mo18693i());
    }

    private void handleSubmittedQuery() {
        this.subscriptions.mo18721a(C10686d.m36212a(this.searchView).mo18644a(C5376a.m10346b()).mo18681d(C4270c.f7357f).mo18694j(C4301l.f7393f).mo18664b(new C4295j(this)).mo18693i());
    }

    private void setDefaultState() {
        this.errorMessage.setVisibility(4);
        this.searchViewLayout.setBackground(getResources().getDrawable(C1086R.C1087drawable.add_stores_dialog_search_box_border));
    }

    private void setupButtonHandlers() {
        this.subscriptions.mo18721a(C10695a.m36221a(this.addStoreButton).mo18675c(new C4304m(this)));
        this.subscriptions.mo18721a(C10695a.m36221a(this.topStoresButton).mo18675c(new C4273d(this)));
    }

    private void setupSearch() {
        final SuggestionCursorAdapter suggestionCursorAdapter = new SuggestionCursorAdapter(getContext());
        this.searchView.setOnSuggestionListener(new SearchView.C0208m() {
            public boolean onSuggestionClick(int i) {
                AddStoreDialog.this.searchView.mo1161a(suggestionCursorAdapter.getSuggestionAt(i), false);
                return true;
            }

            public boolean onSuggestionSelect(int i) {
                return false;
            }
        });
        this.searchView.setSuggestionsAdapter(suggestionCursorAdapter);
        ((AutoCompleteTextView) this.searchView.findViewById(C1086R.C1088id.search_src_text)).setThreshold(1);
        handleEmptyQuery(suggestionCursorAdapter);
        handleSubmittedQuery();
        handleStoreRemoteQuery(suggestionCursorAdapter);
    }

    private void showLoadingDialog() {
        if (this.loadingDialog == null) {
            this.loadingDialog = GenericDialogs.createGenericPleaseWaitDialog(getActivity(), this.themeManager.getAttributeForTheme(C1086R.attr.dialogsTheme).resourceId);
        }
        this.orientationManager.lock();
        this.loadingDialog.show();
    }

    private void topStoresAction() {
        this.navigator.navigateTo(TopStoresFragment.newInstance(), true);
        if (isAdded()) {
            dismiss();
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo14605a(Boolean bool) {
        Dialog dialog = getDialog();
        if (dialog != null && dialog.isShowing() && isResumed()) {
            dialog.dismiss();
        }
    }

    /* access modifiers changed from: package-private */
    public void dismissLoadingDialog() {
        this.orientationManager.unlock();
        this.loadingDialog.dismiss();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 20) {
            return;
        }
        if (i2 == -1) {
            dismiss();
        } else if (i2 != 21) {
            Snackbar.m28075a((View) this.searchView, (int) C1086R.string.error_occured, -1).mo31972k();
        } else {
            Snackbar.m28075a((View) this.searchView, (int) C1086R.string.ws_error_invalid_grant, -1).mo31972k();
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if (ActivityResultNavigator.class.isAssignableFrom(activity.getClass())) {
            this.navigator = ((ActivityResultNavigator) activity).getFragmentNavigator();
            this.orientationManager = new ScreenOrientationManager(activity, activity.getWindowManager());
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException(AddStoreDialog.class.getSimpleName() + " must extend class " + ActivityResultNavigator.class.getSimpleName());
        Logger.getInstance().mo12981e(TAG, (Throwable) illegalStateException);
        throw illegalStateException;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getFragmentComponent(bundle).inject(this);
        this.subscriptions = new C5383b();
        this.tokenInvalidator = ((AptoideApplication) getContext().getApplicationContext()).getTokenInvalidator();
        this.converterFactory = WebService.getDefaultConverter();
        this.accountManager = ((AptoideApplication) getContext().getApplicationContext()).getAccountManager();
        this.httpClient = ((AptoideApplication) getContext().getApplicationContext()).getDefaultClient();
        this.baseBodyBodyInterceptor = ((AptoideApplication) getContext().getApplicationContext()).getAccountSettingsBodyInterceptorPoolV7();
        if (bundle != null) {
            this.storeName = bundle.getString(BundleArgs.STORE_NAME.name());
        }
        AptoideApplication aptoideApplication = (AptoideApplication) getContext().getApplicationContext();
        this.analyticsManager = aptoideApplication.getAnalyticsManager();
        NavigationTracker navigationTracker2 = aptoideApplication.getNavigationTracker();
        this.navigationTracker = navigationTracker2;
        this.storeAnalytics = new StoreAnalytics(this.analyticsManager, navigationTracker2);
        this.searchSuggestionManager = aptoideApplication.getSearchSuggestionManager();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.getWindow().setLayout(-1, -1);
            dialog.getWindow().requestFeature(1);
            dialog.setCancelable(true);
        }
        return layoutInflater.inflate(C1086R.layout.dialog_add_store, viewGroup, false);
    }

    public void onDestroyView() {
        C5383b bVar = this.subscriptions;
        if (bVar != null && !bVar.isUnsubscribed()) {
            this.subscriptions.unsubscribe();
        }
        super.onDestroyView();
    }

    public void onResume() {
        super.onResume();
        Dialog dialog = getDialog();
        Rect rect = new Rect();
        getActivity().getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        double width = (double) rect.width();
        Double.isNaN(width);
        double d = width * 0.8d;
        if (dialog == null) {
            return;
        }
        if (getResources().getConfiguration().orientation == 2) {
            dialog.getWindow().setLayout(Math.round((float) d), -2);
        } else {
            dialog.getWindow().setLayout(-1, -2);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString(BundleArgs.STORE_NAME.name(), this.storeName);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        bindViews(view);
        setupSearch();
        setupButtonHandlers();
        dismissIfFocusIsLost();
    }

    /* renamed from: b */
    public /* synthetic */ void mo14609b(Void voidR) {
        topStoresAction();
    }

    @Deprecated
    private void addStoreAction() {
        String charSequence = this.searchView.getQuery().toString();
        if (charSequence.length() > 0) {
            this.storeName = charSequence;
            getStore(charSequence);
            showLoadingDialog();
            return;
        }
        this.searchViewLayout.setBackground(getResources().getDrawable(C1086R.C1087drawable.add_stores_dialog_seach_box_error));
        this.errorMessage.setVisibility(0);
        this.errorMessage.setText(C1086R.string.add_store_dialog_no_query);
    }

    /* renamed from: b */
    static /* synthetic */ Boolean m7284b(String str) {
        boolean z = true;
        if (str == null || str.length() < 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: a */
    public /* synthetic */ void mo14608a(Void voidR) {
        setDefaultState();
        addStoreAction();
        this.storeAnalytics.sendStoreTabInteractEvent("Add Store", true);
    }

    /* renamed from: a */
    public /* synthetic */ Single mo14603a(SuggestionCursorAdapter suggestionCursorAdapter, String str) {
        return this.searchSuggestionManager.getSuggestionsForStore(str).mo18570e(new C4289h(suggestionCursorAdapter)).mo18556a(C5376a.m10346b()).mo18564b(new C4267b(suggestionCursorAdapter));
    }

    /* renamed from: a */
    static /* synthetic */ Single m7280a(SuggestionCursorAdapter suggestionCursorAdapter, Throwable th) {
        if (th instanceof TimeoutException) {
            Logger.getInstance().mo12984i(TAG, "Timeout reached while waiting for store suggestions");
            return Single.m10119a(suggestionCursorAdapter.getSuggestions());
        }
        Logger.getInstance().mo12988w(TAG, "handleStoreRemoteQuery: ", th);
        return Single.m10120a(th);
    }

    /* renamed from: a */
    static /* synthetic */ Boolean m7279a(C10691g gVar) {
        return Boolean.valueOf(gVar.mo36343c().length() == 0);
    }

    /* renamed from: a */
    public /* synthetic */ void mo14604a(GetStoreMeta getStoreMeta) {
        ShowMessage.asSnack(getView(), AptoideUtils.StringU.getFormattedString(C1086R.string.store_followed, getContext().getResources(), this.storeName));
        dismissLoadingDialog();
        dismiss();
    }

    /* renamed from: a */
    public /* synthetic */ void mo14607a(Throwable th) {
        dismissLoadingDialog();
        if (th instanceof AptoideWsV7Exception) {
            BaseV7Response.Error error = ((AptoideWsV7Exception) th).getBaseResponse().getError();
            int i = C42522.$SwitchMap$cm$aptoide$pt$store$StoreError[StoreUtils.getErrorType(error.getCode()).ordinal()];
            if (i == 1) {
                PrivateStoreDialog.newInstance(this, 20, this.storeName, false).show(getFragmentManager(), PrivateStoreDialog.class.getName());
            } else if (i != 2) {
                this.searchViewLayout.setBackground(getResources().getDrawable(C1086R.C1087drawable.add_stores_dialog_seach_box_error));
                this.errorMessage.setVisibility(0);
                this.errorMessage.setText(error.getDescription());
            } else {
                this.searchViewLayout.setBackground(getResources().getDrawable(C1086R.C1087drawable.add_stores_dialog_seach_box_error));
                this.errorMessage.setVisibility(0);
                this.errorMessage.setText(error.getDescription());
            }
        } else {
            this.searchViewLayout.setBackground(getResources().getDrawable(C1086R.C1087drawable.add_stores_dialog_seach_box_error));
            this.errorMessage.setVisibility(0);
            this.errorMessage.setText(C1086R.string.error_occured);
        }
    }
}
