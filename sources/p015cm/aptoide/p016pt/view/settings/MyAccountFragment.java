package p015cm.aptoide.p016pt.view.settings;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.C0069a;
import androidx.appcompat.app.C0076d;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.content.C0394a;
import androidx.fragment.app.Fragment;
import javax.inject.Inject;
import javax.inject.Named;
import okhttp3.OkHttpClient;
import p015cm.aptoide.accountmanager.Account;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import p015cm.aptoide.aptoideviews.socialmedia.SocialMediaView;
import p015cm.aptoide.p016pt.AptoideApplication;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.MyAccountManager;
import p015cm.aptoide.p016pt.account.AccountAnalytics;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.dataprovider.WebService;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.GetStore;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.Store;
import p015cm.aptoide.p016pt.dataprovider.p021ws.BodyInterceptor;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseBody;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.BaseRequestWithStore;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.GetStoreRequest;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.StoreContext;
import p015cm.aptoide.p016pt.link.CustomTabsHelper;
import p015cm.aptoide.p016pt.networking.image.ImageLoader;
import p015cm.aptoide.p016pt.socialmedia.SocialMediaAnalytics;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p015cm.aptoide.p016pt.view.BackButtonFragment;
import p015cm.aptoide.p016pt.view.NotBottomNavigationView;
import p112n.p118g.p301a.p310c.C10695a;
import p123rx.C5368e;
import p123rx.p124l.p125c.C5376a;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.view.settings.MyAccountFragment */
public class MyAccountFragment extends BackButtonFragment implements SharedPreferences.OnSharedPreferenceChangeListener, MyAccountView, NotBottomNavigationView {
    private static final float STROKE_SIZE = 0.04f;
    @Inject
    AccountAnalytics accountAnalytics;
    private AptoideAccountManager accountManager;
    private View accountView;
    private CardView aptoideBackupAppsCardView;
    private CardView aptoideTvCardView;
    private CardView aptoideUploaderCardView;
    private BodyInterceptor<BaseBody> bodyInterceptor;
    private Converter.Factory converterFactory;
    private Button createStoreButton;
    private TextView createStoreMessage;
    private Button editProfileButton;
    private Button editStoreButton;
    private OkHttpClient httpClient;
    private Button loginButton;
    private View loginView;
    private Button logoutButton;
    @Inject
    @Named
    String marketName;
    private ImageView myAccountAvatar;
    @Inject
    MyAccountManager myAccountManager;
    private TextView myAccountName;
    @Inject
    MyAccountNavigator myAccountNavigator;
    private TextView myAccountProductCardTitle;
    private View myProfileView;
    private ImageView myStoreAvatar;
    private TextView myStoreName;
    private View myStoreView;
    private View settings;
    @Inject
    SocialMediaAnalytics socialMediaAnalytics;
    private SocialMediaView socialMediaView;
    @Inject
    ThemeManager themeManager;
    protected Toolbar toolbar;

    public static Fragment newInstance() {
        return new MyAccountFragment();
    }

    private void setAccountViews(View view) {
        this.myProfileView = view.findViewById(C1086R.C1088id.my_profile);
        this.myStoreView = view.findViewById(C1086R.C1088id.my_store);
        this.accountView = view.findViewById(C1086R.C1088id.account_displayables);
        this.loginView = view.findViewById(C1086R.C1088id.login_register_container);
        this.myAccountAvatar = (ImageView) this.myProfileView.findViewById(C1086R.C1088id.user_icon);
        this.myAccountName = (TextView) this.myProfileView.findViewById(C1086R.C1088id.description);
        this.myStoreAvatar = (ImageView) this.myStoreView.findViewById(C1086R.C1088id.user_icon);
        this.myStoreName = (TextView) this.myStoreView.findViewById(C1086R.C1088id.description);
        ((TextView) this.myStoreView.findViewById(C1086R.C1088id.name)).setText(C1086R.string.newaccount_my_store);
        ((TextView) this.myProfileView.findViewById(C1086R.C1088id.name)).setText(C1086R.string.newaccount_my_profile);
        this.loginButton = (Button) view.findViewById(C1086R.C1088id.login_button);
        this.logoutButton = (Button) view.findViewById(C1086R.C1088id.logout_button);
        this.createStoreMessage = (TextView) view.findViewById(C1086R.C1088id.create_store_message);
        this.createStoreButton = (Button) view.findViewById(C1086R.C1088id.create_store_button);
        this.editStoreButton = (Button) this.myStoreView.findViewById(C1086R.C1088id.edit_button);
        this.editProfileButton = (Button) this.myProfileView.findViewById(C1086R.C1088id.edit_button);
        this.aptoideTvCardView = (CardView) view.findViewById(C1086R.C1088id.product_aptoideTv_cardview);
        this.aptoideUploaderCardView = (CardView) view.findViewById(C1086R.C1088id.product_uploader_cardview);
        this.aptoideBackupAppsCardView = (CardView) view.findViewById(C1086R.C1088id.product_backup_cardview);
        this.socialMediaView = (SocialMediaView) view.findViewById(C1086R.C1088id.social_media_view);
    }

    private void setUserProfile(Account account) {
        if (!TextUtils.isEmpty(account.getNickname())) {
            this.myAccountName.setText(account.getNickname());
        } else {
            this.myAccountName.setText(account.getEmail());
        }
        if (!TextUtils.isEmpty(account.getAvatar())) {
            ImageLoader.with(getContext()).loadWithShadowCircleTransformWithPlaceholder(account.getAvatar(), this.myAccountAvatar, STROKE_SIZE, C1086R.attr.placeholder_myaccount);
        }
    }

    private void setUserStore(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            this.myStoreName.setText(str);
            ImageLoader.with(getContext()).loadWithShadowCircleTransformWithPlaceholder(str2, this.myStoreAvatar, STROKE_SIZE, C1086R.attr.placeholder_myaccount);
        }
    }

    private void setupProductCardViews() {
        ((TextView) this.aptoideTvCardView.findViewById(C1086R.C1088id.product_title_textview)).setText(getString(C1086R.string.product_card_aptoide_tv_title));
        ((TextView) this.aptoideTvCardView.findViewById(C1086R.C1088id.product_subtitle_textview)).setText(getString(C1086R.string.product_card_aptoide_tv_subtitle));
        ((ImageView) this.aptoideTvCardView.findViewById(C1086R.C1088id.product_icon_imageview)).setImageDrawable(C0394a.m1917c(getContext(), C1086R.C1087drawable.ic_product_tv));
        ((TextView) this.aptoideUploaderCardView.findViewById(C1086R.C1088id.product_title_textview)).setText(getString(C1086R.string.product_card_aptoide_uploader_title));
        ((TextView) this.aptoideUploaderCardView.findViewById(C1086R.C1088id.product_subtitle_textview)).setText(getString(C1086R.string.product_card_aptoide_uploader_subtitle));
        ((ImageView) this.aptoideUploaderCardView.findViewById(C1086R.C1088id.product_icon_imageview)).setImageDrawable(C0394a.m1917c(getContext(), C1086R.C1087drawable.ic_product_uploader));
        ((TextView) this.aptoideBackupAppsCardView.findViewById(C1086R.C1088id.product_title_textview)).setText(getString(C1086R.string.product_card_aptoide_backup_apps_title));
        ((TextView) this.aptoideBackupAppsCardView.findViewById(C1086R.C1088id.product_subtitle_textview)).setText(getString(C1086R.string.product_card_aptoide_backup_apps_subtitle));
        ((ImageView) this.aptoideBackupAppsCardView.findViewById(C1086R.C1088id.product_icon_imageview)).setImageDrawable(C0394a.m1917c(getContext(), C1086R.C1087drawable.ic_product_backup_apps));
    }

    private void setupToolbar() {
        this.toolbar.setTitle((int) C1086R.string.my_account_title_my_account);
        C0076d dVar = (C0076d) getActivity();
        dVar.setSupportActionBar(this.toolbar);
        C0069a supportActionBar = dVar.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo188d(true);
            supportActionBar.mo182a(this.toolbar.getTitle());
        }
        this.toolbar.setNavigationOnClickListener(new C5386a(this));
    }

    private void showAccountAndStoreDisplayable() {
        this.loginView.setVisibility(8);
        this.accountView.setVisibility(0);
        this.myProfileView.setVisibility(0);
        this.myStoreView.setVisibility(0);
        this.createStoreButton.setVisibility(8);
        this.createStoreMessage.setVisibility(8);
    }

    private void showAccountNoStoreDisplayable() {
        this.loginView.setVisibility(8);
        this.accountView.setVisibility(0);
        this.myProfileView.setVisibility(0);
        this.myStoreView.setVisibility(8);
        if (this.myAccountManager.shouldShowCreateStore()) {
            this.createStoreButton.setVisibility(0);
            this.createStoreMessage.setVisibility(0);
            return;
        }
        this.createStoreButton.setVisibility(8);
        this.createStoreMessage.setVisibility(8);
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo18731a(Account account) {
        return GetStoreRequest.m5367of(new BaseRequestWithStore.StoreCredentials(account.getStore().getName(), (String) null, (String) null), StoreContext.meta, this.bodyInterceptor, this.httpClient, this.converterFactory, ((AptoideApplication) getContext().getApplicationContext()).getTokenInvalidator(), ((AptoideApplication) getContext().getApplicationContext()).getDefaultSharedPreferences(), getContext().getResources(), (WindowManager) getContext().getSystemService("window")).observe();
    }

    public C5368e<Void> aptoideBackupCardViewClick() {
        return C10695a.m36221a(this.aptoideBackupAppsCardView);
    }

    public C5368e<Void> aptoideTvCardViewClick() {
        return C10695a.m36221a(this.aptoideTvCardView);
    }

    public C5368e<Void> aptoideUploaderCardViewClick() {
        return C10695a.m36221a(this.aptoideUploaderCardView);
    }

    public C5368e<Void> createStoreClick() {
        return C10695a.m36221a(this.createStoreButton);
    }

    public C5368e<Void> editStoreClick() {
        return C10695a.m36221a(this.editStoreButton);
    }

    public C5368e<Void> editUserProfileClick() {
        return C10695a.m36221a(this.editProfileButton);
    }

    public ScreenTagHistory getHistoryTracker() {
        return ScreenTagHistory.Builder.build(MyAccountFragment.class.getSimpleName());
    }

    public C5368e<GetStore> getStore() {
        return this.accountManager.accountStatus().mo18669c().mo18687f(new C5392b(this));
    }

    public C5368e<Void> loginClick() {
        return C10695a.m36221a(this.loginButton);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getFragmentComponent(bundle).inject(this);
        AptoideApplication aptoideApplication = (AptoideApplication) getContext().getApplicationContext();
        this.accountManager = ((AptoideApplication) getContext().getApplicationContext()).getAccountManager();
        this.bodyInterceptor = aptoideApplication.getAccountSettingsBodyInterceptorPoolV7();
        this.httpClient = aptoideApplication.getDefaultClient();
        this.converterFactory = WebService.getDefaultConverter();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C1086R.layout.fragment_my_account, viewGroup, false);
    }

    public void onDestroyView() {
        this.myProfileView = null;
        this.myStoreView = null;
        this.loginView = null;
        this.accountView = null;
        this.createStoreMessage = null;
        this.myAccountAvatar = null;
        this.myAccountName = null;
        this.myStoreName = null;
        this.loginButton = null;
        this.logoutButton = null;
        this.createStoreButton = null;
        this.editStoreButton = null;
        this.editProfileButton = null;
        this.aptoideBackupAppsCardView = null;
        this.aptoideTvCardView = null;
        this.aptoideUploaderCardView = null;
        this.socialMediaView = null;
        super.onDestroyView();
    }

    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        ((TextView) view.findViewById(C1086R.C1088id.sign_in_message)).setText(getString(C1086R.string.newaccount_signin_message, this.marketName));
        this.toolbar = (Toolbar) view.findViewById(C1086R.C1088id.toolbar);
        this.settings = view.findViewById(C1086R.C1088id.settings);
        TextView textView = (TextView) view.findViewById(C1086R.C1088id.my_account_product_card_title);
        this.myAccountProductCardTitle = textView;
        textView.setText(getString(C1086R.string.my_account_product_card_section_title));
        setAccountViews(view);
        setupToolbar();
        setupProductCardViews();
        attachPresenter(new MyAccountPresenter(this, this.accountManager, CrashReport.getInstance(), C5376a.m10346b(), this.myAccountNavigator, this.accountAnalytics, this.socialMediaAnalytics));
    }

    public void refreshUI(Store store) {
        this.myStoreName.setText(store.getName());
        setUserStore(store.getName(), store.getAvatar());
    }

    public C5368e<Void> settingsClicked() {
        return C10695a.m36221a(this.settings);
    }

    public void showAccount(Account account) {
        if (TextUtils.isEmpty(account.getEmail())) {
            showLoginAccountDisplayable();
        } else if (account.getStore().getName().isEmpty()) {
            showAccountNoStoreDisplayable();
            setUserProfile(account);
        } else {
            showAccountAndStoreDisplayable();
            setUserProfile(account);
            setUserStore(account.getStore().getName(), account.getStore().getAvatar());
        }
    }

    public void showLoginAccountDisplayable() {
        this.loginView.setVisibility(0);
        this.accountView.setVisibility(8);
    }

    public C5368e<Void> signOutClick() {
        return C10695a.m36221a(this.logoutButton);
    }

    public C5368e<SocialMediaView.SocialMediaType> socialMediaClick() {
        return this.socialMediaView.onSocialMediaClick();
    }

    public void startAptoideTvWebView() {
        CustomTabsHelper.getInstance().openInChromeCustomTab("https://blog.aptoide.com/what-is-aptoidetv/", getContext(), this.themeManager.getAttributeForTheme(C1086R.attr.colorPrimary).resourceId);
    }

    public C5368e<Void> storeClick() {
        return C10695a.m36221a(this.myStoreView);
    }

    public C5368e<Void> userClick() {
        return C10695a.m36221a(this.myProfileView);
    }

    /* renamed from: a */
    public /* synthetic */ void mo18732a(View view) {
        getActivity().onBackPressed();
    }
}
