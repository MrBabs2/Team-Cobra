package p015cm.aptoide.p016pt.wallet;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.C10221n;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.app.DownloadModel;
import p015cm.aptoide.p016pt.logger.Logger;
import p015cm.aptoide.p016pt.networking.image.ImageLoader;
import p015cm.aptoide.p016pt.promotions.WalletApp;
import p015cm.aptoide.p016pt.utils.GenericDialogs;
import p015cm.aptoide.p016pt.view.ActivityView;
import p112n.p118g.p301a.p310c.C10695a;
import p123rx.C5368e;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0002J\u0012\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u000fH\u0016J\b\u0010\u001c\u001a\u00020\u000fH\u0016J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u000bH\u0016J\b\u0010\u001f\u001a\u00020\u000fH\u0016J\u0010\u0010 \u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u001aH\u0002J\u001a\u0010\"\u001a\u00020\u000f2\b\u0010#\u001a\u0004\u0018\u00010\u001a2\u0006\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020\u000fH\u0016J;\u0010'\u001a\u00020\u000f*\u00020(2*\u0010)\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020,0+0*\"\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020,0+¢\u0006\u0002\u0010-R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006."}, mo16641d2 = {"Lcm/aptoide/pt/wallet/WalletInstallActivity;", "Lcm/aptoide/pt/view/ActivityView;", "Lcm/aptoide/pt/wallet/WalletInstallView;", "()V", "presenter", "Lcm/aptoide/pt/wallet/WalletInstallPresenter;", "getPresenter", "()Lcm/aptoide/pt/wallet/WalletInstallPresenter;", "setPresenter", "(Lcm/aptoide/pt/wallet/WalletInstallPresenter;)V", "cancelDownloadButtonClicked", "Lrx/Observable;", "Ljava/lang/Void;", "closeButtonClicked", "dismissDialog", "", "initStyling", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setDownloadProgress", "downloadModel", "Lcm/aptoide/pt/app/DownloadModel;", "showDownloadState", "showErrorMessage", "errorMessage", "", "showIndeterminateDownload", "showInstallationSuccessView", "showRootInstallWarningPopup", "", "showSdkErrorView", "showSuccessView", "title", "showWalletInstallationView", "appIcon", "walletApp", "Lcm/aptoide/pt/promotions/WalletApp;", "showWalletInstalledAlreadyView", "setSubstringTypeface", "Landroid/widget/TextView;", "textsToStyle", "", "Lkotlin/Pair;", "", "(Landroid/widget/TextView;[Lkotlin/Pair;)V", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.wallet.WalletInstallActivity */
/* compiled from: WalletInstallActivity.kt */
public final class WalletInstallActivity extends ActivityView implements WalletInstallView {
    private HashMap _$_findViewCache;
    @Inject
    public WalletInstallPresenter presenter;

    @C4789l(mo16639bv = {1, 0, 3}, mo16642k = 3, mo16643mv = {1, 1, 16})
    /* renamed from: cm.aptoide.pt.wallet.WalletInstallActivity$WhenMappings */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DownloadModel.DownloadState.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[DownloadModel.DownloadState.ACTIVE.ordinal()] = 1;
            $EnumSwitchMapping$0[DownloadModel.DownloadState.PAUSE.ordinal()] = 2;
            $EnumSwitchMapping$0[DownloadModel.DownloadState.INDETERMINATE.ordinal()] = 3;
            $EnumSwitchMapping$0[DownloadModel.DownloadState.INSTALLING.ordinal()] = 4;
            $EnumSwitchMapping$0[DownloadModel.DownloadState.COMPLETE.ordinal()] = 5;
            $EnumSwitchMapping$0[DownloadModel.DownloadState.ERROR.ordinal()] = 6;
            $EnumSwitchMapping$0[DownloadModel.DownloadState.NOT_ENOUGH_STORAGE_ERROR.ordinal()] = 7;
        }
    }

    private final void initStyling() {
        String string = getString(C1086R.string.wallet_install_appcoins_wallet);
        String string2 = getString(C1086R.string.wallet_install_request_message_body, new Object[]{string});
        TextView textView = (TextView) _$_findCachedViewById(C1086R.C1088id.message_textview);
        C10202j.m34174a((Object) textView, "message_textview");
        textView.setText(string2);
        TextView textView2 = (TextView) _$_findCachedViewById(C1086R.C1088id.message_textview);
        C10202j.m34174a((Object) textView2, "message_textview");
        setSubstringTypeface(textView2, new C10221n(string, 1));
    }

    private final void setDownloadProgress(DownloadModel downloadModel) {
        View _$_findCachedViewById = _$_findCachedViewById(C1086R.C1088id.wallet_install_download_view);
        C10202j.m34174a((Object) _$_findCachedViewById, "wallet_install_download_view");
        _$_findCachedViewById.setVisibility(0);
        DownloadModel.DownloadState downloadState = downloadModel.getDownloadState();
        if (downloadState != null) {
            switch (WhenMappings.$EnumSwitchMapping$0[downloadState.ordinal()]) {
                case 1:
                case 2:
                    Group group = (Group) _$_findCachedViewById(C1086R.C1088id.wallet_install_view_group);
                    C10202j.m34174a((Object) group, "wallet_install_view_group");
                    group.setVisibility(0);
                    ImageView imageView = (ImageView) _$_findCachedViewById(C1086R.C1088id.wallet_download_cancel_button);
                    C10202j.m34174a((Object) imageView, "wallet_download_cancel_button");
                    imageView.setVisibility(0);
                    ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C1086R.C1088id.wallet_download_progress_bar);
                    C10202j.m34174a((Object) progressBar, "wallet_download_progress_bar");
                    progressBar.setIndeterminate(false);
                    ProgressBar progressBar2 = (ProgressBar) _$_findCachedViewById(C1086R.C1088id.wallet_download_progress_bar);
                    C10202j.m34174a((Object) progressBar2, "wallet_download_progress_bar");
                    progressBar2.setProgress(downloadModel.getProgress());
                    TextView textView = (TextView) _$_findCachedViewById(C1086R.C1088id.wallet_download_progress_number);
                    C10202j.m34174a((Object) textView, "wallet_download_progress_number");
                    textView.setText(String.valueOf(downloadModel.getProgress()) + "%");
                    TextView textView2 = (TextView) _$_findCachedViewById(C1086R.C1088id.wallet_download_progress_number);
                    C10202j.m34174a((Object) textView2, "wallet_download_progress_number");
                    textView2.setVisibility(0);
                    return;
                case 3:
                    ProgressBar progressBar3 = (ProgressBar) _$_findCachedViewById(C1086R.C1088id.wallet_download_progress_bar);
                    C10202j.m34174a((Object) progressBar3, "wallet_download_progress_bar");
                    progressBar3.setIndeterminate(true);
                    Group group2 = (Group) _$_findCachedViewById(C1086R.C1088id.wallet_install_view_group);
                    C10202j.m34174a((Object) group2, "wallet_install_view_group");
                    group2.setVisibility(0);
                    ImageView imageView2 = (ImageView) _$_findCachedViewById(C1086R.C1088id.wallet_download_cancel_button);
                    C10202j.m34174a((Object) imageView2, "wallet_download_cancel_button");
                    imageView2.setVisibility(0);
                    return;
                case 4:
                case 5:
                    ProgressBar progressBar4 = (ProgressBar) _$_findCachedViewById(C1086R.C1088id.wallet_download_progress_bar);
                    C10202j.m34174a((Object) progressBar4, "wallet_download_progress_bar");
                    progressBar4.setIndeterminate(true);
                    TextView textView3 = (TextView) _$_findCachedViewById(C1086R.C1088id.wallet_download_progress_number);
                    C10202j.m34174a((Object) textView3, "wallet_download_progress_number");
                    textView3.setVisibility(8);
                    Group group3 = (Group) _$_findCachedViewById(C1086R.C1088id.wallet_install_view_group);
                    C10202j.m34174a((Object) group3, "wallet_install_view_group");
                    group3.setVisibility(0);
                    ImageView imageView3 = (ImageView) _$_findCachedViewById(C1086R.C1088id.wallet_download_cancel_button);
                    C10202j.m34174a((Object) imageView3, "wallet_download_cancel_button");
                    imageView3.setVisibility(4);
                    return;
                case 6:
                    String string = getString(C1086R.string.error_occured);
                    C10202j.m34174a((Object) string, "getString(R.string.error_occured)");
                    showErrorMessage(string);
                    return;
                case 7:
                    String string2 = getString(C1086R.string.out_of_space_dialog_title);
                    C10202j.m34174a((Object) string2, "getString(R.string.out_of_space_dialog_title)");
                    showErrorMessage(string2);
                    return;
            }
        }
        throw new IllegalArgumentException("Invalid download state" + downloadModel.getDownloadState());
    }

    private final void showErrorMessage(String str) {
        TextView textView = (TextView) _$_findCachedViewById(C1086R.C1088id.wallet_download_download_state);
        C10202j.m34174a((Object) textView, "wallet_download_download_state");
        textView.setText(str);
    }

    private final void showSuccessView(String str) {
        ((ImageView) _$_findCachedViewById(C1086R.C1088id.app_icon_imageview)).setImageDrawable(getResources().getDrawable(C1086R.C1087drawable.ic_check_orange_gradient_start));
        TextView textView = (TextView) _$_findCachedViewById(C1086R.C1088id.message_textview);
        C10202j.m34174a((Object) textView, "message_textview");
        textView.setText(str);
        TextView textView2 = (TextView) _$_findCachedViewById(C1086R.C1088id.message_textview);
        C10202j.m34174a((Object) textView2, "message_textview");
        setSubstringTypeface(textView2, new C10221n(str, 1));
        ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C1086R.C1088id.progress_view);
        C10202j.m34174a((Object) progressBar, "progress_view");
        progressBar.setVisibility(8);
        Group group = (Group) _$_findCachedViewById(C1086R.C1088id.wallet_install_success_view_group);
        C10202j.m34174a((Object) group, "wallet_install_success_view_group");
        group.setVisibility(0);
        Button button = (Button) _$_findCachedViewById(C1086R.C1088id.close_button);
        C10202j.m34174a((Object) button, "close_button");
        button.setVisibility(0);
        Group group2 = (Group) _$_findCachedViewById(C1086R.C1088id.wallet_install_view_group);
        C10202j.m34174a((Object) group2, "wallet_install_view_group");
        group2.setVisibility(0);
        View _$_findCachedViewById = _$_findCachedViewById(C1086R.C1088id.wallet_install_download_view);
        C10202j.m34174a((Object) _$_findCachedViewById, "wallet_install_download_view");
        _$_findCachedViewById.setVisibility(8);
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public C5368e<Void> cancelDownloadButtonClicked() {
        C5368e<Void> a = C10695a.m36221a((ImageView) _$_findCachedViewById(C1086R.C1088id.wallet_download_cancel_button));
        C10202j.m34174a((Object) a, "RxView.clicks(wallet_download_cancel_button)");
        return a;
    }

    public C5368e<Void> closeButtonClicked() {
        C5368e<Void> a = C10695a.m36221a((Button) _$_findCachedViewById(C1086R.C1088id.close_button));
        C10202j.m34174a((Object) a, "RxView.clicks(close_button)");
        return a;
    }

    public void dismissDialog() {
        finish();
    }

    public final WalletInstallPresenter getPresenter() {
        WalletInstallPresenter walletInstallPresenter = this.presenter;
        if (walletInstallPresenter != null) {
            return walletInstallPresenter;
        }
        C10202j.m34181d("presenter");
        throw null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getActivityComponent().inject(this);
        setContentView((int) C1086R.layout.wallet_install_activity);
        initStyling();
        WalletInstallPresenter walletInstallPresenter = this.presenter;
        if (walletInstallPresenter != null) {
            attachPresenter(walletInstallPresenter);
        } else {
            C10202j.m34181d("presenter");
            throw null;
        }
    }

    public final void setPresenter(WalletInstallPresenter walletInstallPresenter) {
        C10202j.m34178b(walletInstallPresenter, "<set-?>");
        this.presenter = walletInstallPresenter;
    }

    public final void setSubstringTypeface(TextView textView, C10221n<String, Integer>... nVarArr) {
        C10202j.m34178b(textView, "$this$setSubstringTypeface");
        C10202j.m34178b(nVarArr, "textsToStyle");
        SpannableString spannableString = new SpannableString(textView.getText());
        for (C10221n<String, Integer> nVar : nVarArr) {
            int a = C12131w.m40064a((CharSequence) textView.getText().toString(), nVar.mo35391c(), 0, false, 6, (Object) null);
            int length = nVar.mo35391c().length() + a;
            if (a >= 0) {
                spannableString.setSpan(new StyleSpan(nVar.mo35392d().intValue()), a, length, 33);
            }
        }
        textView.setText(spannableString, TextView.BufferType.SPANNABLE);
    }

    public void showDownloadState(DownloadModel downloadModel) {
        C10202j.m34178b(downloadModel, "downloadModel");
        if (downloadModel.isDownloadingOrInstalling()) {
            View _$_findCachedViewById = _$_findCachedViewById(C1086R.C1088id.wallet_install_download_view);
            C10202j.m34174a((Object) _$_findCachedViewById, "wallet_install_download_view");
            _$_findCachedViewById.setVisibility(0);
            setDownloadProgress(downloadModel);
            return;
        }
        View _$_findCachedViewById2 = _$_findCachedViewById(C1086R.C1088id.wallet_install_download_view);
        C10202j.m34174a((Object) _$_findCachedViewById2, "wallet_install_download_view");
        _$_findCachedViewById2.setVisibility(8);
        ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C1086R.C1088id.progress_view);
        C10202j.m34174a((Object) progressBar, "progress_view");
        progressBar.setVisibility(8);
        Group group = (Group) _$_findCachedViewById(C1086R.C1088id.wallet_install_view_group);
        C10202j.m34174a((Object) group, "wallet_install_view_group");
        group.setVisibility(0);
    }

    public void showIndeterminateDownload() {
        View _$_findCachedViewById = _$_findCachedViewById(C1086R.C1088id.wallet_install_download_view);
        C10202j.m34174a((Object) _$_findCachedViewById, "wallet_install_download_view");
        _$_findCachedViewById.setVisibility(0);
        ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C1086R.C1088id.wallet_download_progress_bar);
        C10202j.m34174a((Object) progressBar, "wallet_download_progress_bar");
        progressBar.setIndeterminate(true);
        Group group = (Group) _$_findCachedViewById(C1086R.C1088id.wallet_install_view_group);
        C10202j.m34174a((Object) group, "wallet_install_view_group");
        group.setVisibility(0);
    }

    public void showInstallationSuccessView() {
        TextView textView = (TextView) _$_findCachedViewById(C1086R.C1088id.install_complete_message);
        C10202j.m34174a((Object) textView, "install_complete_message");
        textView.setVisibility(4);
        String string = getString(C1086R.string.wallet_install_complete_title);
        C10202j.m34174a((Object) string, "getString(R.string.wallet_install_complete_title)");
        showSuccessView(string);
    }

    public C5368e<Boolean> showRootInstallWarningPopup() {
        C5368e<R> j = GenericDialogs.createGenericYesNoCancelMessage(getApplicationContext(), (String) null, getResources().getString(C1086R.string.root_access_dialog), this.themeManager.getAttributeForTheme(C1086R.attr.dialogsTheme).resourceId).mo18694j(WalletInstallActivity$showRootInstallWarningPopup$1.INSTANCE);
        C10202j.m34174a((Object) j, "GenericDialogs.createGen…cDialogs.EResponse.YES) }");
        return j;
    }

    public void showSdkErrorView() {
        Group group = (Group) _$_findCachedViewById(C1086R.C1088id.sdk_error_view_group);
        C10202j.m34174a((Object) group, "sdk_error_view_group");
        group.setVisibility(0);
        ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C1086R.C1088id.progress_view);
        C10202j.m34174a((Object) progressBar, "progress_view");
        progressBar.setVisibility(8);
        Button button = (Button) _$_findCachedViewById(C1086R.C1088id.close_button);
        C10202j.m34174a((Object) button, "close_button");
        button.setVisibility(0);
        Group group2 = (Group) _$_findCachedViewById(C1086R.C1088id.wallet_install_success_view_group);
        C10202j.m34174a((Object) group2, "wallet_install_success_view_group");
        group2.setVisibility(8);
        Group group3 = (Group) _$_findCachedViewById(C1086R.C1088id.wallet_install_view_group);
        C10202j.m34174a((Object) group3, "wallet_install_view_group");
        group3.setVisibility(4);
    }

    public void showWalletInstallationView(String str, WalletApp walletApp) {
        C10202j.m34178b(walletApp, "walletApp");
        ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C1086R.C1088id.progress_view);
        C10202j.m34174a((Object) progressBar, "progress_view");
        progressBar.setVisibility(8);
        Group group = (Group) _$_findCachedViewById(C1086R.C1088id.wallet_install_success_view_group);
        C10202j.m34174a((Object) group, "wallet_install_success_view_group");
        group.setVisibility(8);
        Button button = (Button) _$_findCachedViewById(C1086R.C1088id.close_button);
        C10202j.m34174a((Object) button, "close_button");
        button.setVisibility(8);
        if (str != null) {
            ImageLoader.with(this).load(str, (ImageView) _$_findCachedViewById(C1086R.C1088id.app_icon_imageview));
        }
        DownloadModel downloadModel = walletApp.getDownloadModel();
        if (downloadModel != null) {
            Logger instance = Logger.getInstance();
            instance.mo12975d("WalletInstallActivity", "download state is " + downloadModel.getDownloadState());
            if (downloadModel.isDownloading()) {
                setDownloadProgress(downloadModel);
                return;
            }
            View _$_findCachedViewById = _$_findCachedViewById(C1086R.C1088id.wallet_install_download_view);
            C10202j.m34174a((Object) _$_findCachedViewById, "wallet_install_download_view");
            _$_findCachedViewById.setVisibility(8);
            ProgressBar progressBar2 = (ProgressBar) _$_findCachedViewById(C1086R.C1088id.progress_view);
            C10202j.m34174a((Object) progressBar2, "progress_view");
            progressBar2.setVisibility(8);
            Group group2 = (Group) _$_findCachedViewById(C1086R.C1088id.wallet_install_view_group);
            C10202j.m34174a((Object) group2, "wallet_install_view_group");
            group2.setVisibility(0);
        }
    }

    public void showWalletInstalledAlreadyView() {
        TextView textView = (TextView) _$_findCachedViewById(C1086R.C1088id.install_complete_message);
        C10202j.m34174a((Object) textView, "install_complete_message");
        textView.setText(getString(C1086R.string.wallet_install_request_already_installed_body));
        String string = getString(C1086R.string.wallet_install_request_already_installed_title);
        C10202j.m34174a((Object) string, "getString(R.string.walle…_already_installed_title)");
        showSuccessView(string);
    }
}
