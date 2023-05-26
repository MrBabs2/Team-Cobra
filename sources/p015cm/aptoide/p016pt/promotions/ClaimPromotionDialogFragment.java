package p015cm.aptoide.p016pt.promotions;

import android.content.ClipboardManager;
import android.graphics.Point;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import javax.inject.Inject;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.navigator.ActivityResultNavigator;
import p015cm.aptoide.p016pt.navigator.Result;
import p015cm.aptoide.p016pt.networking.IdsRepository;
import p015cm.aptoide.p016pt.utils.AptoideUtils;
import p015cm.aptoide.p016pt.view.fragment.BaseDialogView;
import p112n.p118g.p301a.p310c.C10695a;
import p112n.p118g.p301a.p311d.C10707a;
import p112n.p118g.p301a.p311d.C10708b;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.promotions.ClaimPromotionDialogFragment */
public class ClaimPromotionDialogFragment extends BaseDialogView implements ClaimPromotionDialogView {
    private static final String CLAIMED = "claimed";
    private static final String GENERIC_ERROR = "error";
    private static final String PACKAGE_NAME = "package_name";
    private static final String SUCCESS = "success";
    private static final String VIEW = "view";
    private static final String WALLET = "wallet";
    private static final String WALLET_PACKAGE = "com.appcoins.wallet";
    private static final String WALLET_PERMISSIONS_INTENT_EXTRA_KEY = "PERMISSION_NAME_KEY";
    private static final String WALLET_PERMISSIONS_INTENT_EXTRA_VALUE = "WALLET_ADDRESS";
    protected static final int WALLET_PERMISSIONS_INTENT_REQUEST_CODE = 123;
    private static final String WALLET_PERMISSIONS_INTENT_URI_ACTION = "appcoins://wallet/permissions/1";
    protected static final int WALLET_VERIFICATION_INTENT_REQUEST_CODE = 124;
    private static final String WALLET_VERIFICATION_INTENT_URI_ACTION = "appcoins://wallet/validation/1";
    private Button cancelUpdateWalletButton;
    @Inject
    ClaimPromotionsManager claimPromotionsManager;
    private ClipboardManager clipboard;
    private Button genericErrorOkButton;
    private View genericErrorView;
    private TextView genericErrorViewMessage;
    private TextView genericMessageBody;
    private TextView genericMessageButton;
    private TextView genericMessageTitle;
    private View genericMessageView;
    private Button getWalletAddressButton;
    @Inject
    IdsRepository idsRepository;
    private View insertWalletView;
    private ProgressBar loading;
    @Inject
    ClaimPromotionsNavigator navigator;
    @Inject
    ClaimPromotionDialogPresenter presenter;
    @Inject
    PromotionsAnalytics promotionsAnalytics;
    private Button updateWalletButton;
    private View updateWalletView;
    private EditText walletAddressEdit;
    private Button walletCancelButton;
    private View walletErrorView;
    private ImageView walletMessageIcon;
    private Button walletNextButton;

    private void disableNextButton() {
        this.walletNextButton.setClickable(false);
        this.walletNextButton.setFocusable(false);
        this.walletNextButton.setTextColor(getResources().getColor(C1086R.color.grey_fog_light));
    }

    private void disableWalletButton() {
        this.getWalletAddressButton.setClickable(false);
        this.getWalletAddressButton.setFocusable(false);
        this.getWalletAddressButton.setBackgroundColor(this.themeManager.getAttributeForTheme(C1086R.attr.lockedWalletButtonColor).data);
    }

    private void enableNextButton() {
        this.walletNextButton.setClickable(true);
        this.walletNextButton.setFocusable(true);
        this.walletNextButton.setTextColor(this.themeManager.getAttributeForTheme(C1086R.attr.colorPrimaryDark).data);
    }

    private void enableWalletButton() {
        this.getWalletAddressButton.setClickable(true);
        this.getWalletAddressButton.setFocusable(true);
        this.getWalletAddressButton.setBackgroundResource(C1086R.C1087drawable.aptoide_gradient);
    }

    private void handleRestoreViewState(Bundle bundle) {
        if (bundle != null && bundle.getString(VIEW) != null) {
            String string = bundle.getString(VIEW);
            char c = 65535;
            switch (string.hashCode()) {
                case -1867169789:
                    if (string.equals("success")) {
                        c = 3;
                        break;
                    }
                    break;
                case -795192327:
                    if (string.equals(WALLET)) {
                        c = 1;
                        break;
                    }
                    break;
                case 96784904:
                    if (string.equals(GENERIC_ERROR)) {
                        c = 4;
                        break;
                    }
                    break;
                case 853317083:
                    if (string.equals(CLAIMED)) {
                        c = 2;
                        break;
                    }
                    break;
            }
            if (c == 2) {
                showPromotionAlreadyClaimed();
            } else if (c == 3) {
                showClaimSuccess();
            } else if (c != 4) {
                showWalletView();
            } else {
                showGenericError();
            }
        }
    }

    private void setInvalidWalletMessage() {
        this.walletMessageIcon.setImageDrawable(getResources().getDrawable(C1086R.C1087drawable.ic_info));
    }

    private void setValidWalletMessage() {
        this.walletMessageIcon.setImageDrawable(getResources().getDrawable(C1086R.C1087drawable.ic_check_green));
    }

    private void showErrorView(String str) {
        this.loading.setVisibility(8);
        this.genericErrorView.setVisibility(0);
        this.insertWalletView.setVisibility(8);
        this.updateWalletView.setVisibility(8);
        this.genericMessageView.setVisibility(8);
        this.genericErrorViewMessage.setText(str);
    }

    private void showGenericMessageView(String str, String str2) {
        this.walletErrorView.setVisibility(8);
        this.loading.setVisibility(8);
        this.insertWalletView.setVisibility(8);
        this.updateWalletView.setVisibility(8);
        this.genericMessageTitle.setText(str);
        this.genericMessageBody.setText(str2);
        this.genericMessageView.setVisibility(0);
    }

    private void showWalletView() {
        this.walletErrorView.setVisibility(8);
        this.loading.setVisibility(8);
        this.genericMessageView.setVisibility(8);
        this.insertWalletView.setVisibility(0);
        this.updateWalletView.setVisibility(8);
    }

    private boolean validateAddress(String str) {
        if (str != null) {
            return str.matches("(^(0x))([0-9a-f]{40})$");
        }
        return false;
    }

    /* renamed from: a */
    public /* synthetic */ ClaimPromotionsClickWrapper mo13515a(Void voidR) {
        return new ClaimPromotionsClickWrapper(this.walletAddressEdit.getText().toString(), getArguments().getString("package_name"));
    }

    /* renamed from: b */
    public /* synthetic */ ClaimDialogResultWrapper mo13516b(Void voidR) {
        if (this.genericMessageTitle.getText().equals(getResources().getString(C1086R.string.holidayspromotion_title_completed))) {
            return new ClaimDialogResultWrapper(getArguments().getString("package_name"), true);
        }
        return new ClaimDialogResultWrapper(getArguments().getString("package_name"), false);
    }

    /* renamed from: c */
    public /* synthetic */ String mo13517c(Void voidR) {
        return getArguments().getString("package_name");
    }

    public C5368e<ClaimPromotionsClickWrapper> continueWalletClick() {
        return C10695a.m36221a(this.walletNextButton).mo18694j(new C3743b(this));
    }

    /* renamed from: d */
    public /* synthetic */ String mo13519d(Void voidR) {
        return getArguments().getString("package_name");
    }

    public void dismissDialog() {
        dismiss();
    }

    public C5368e<Void> dismissGenericErrorClick() {
        return C10695a.m36221a(this.genericErrorOkButton);
    }

    public C5368e<ClaimDialogResultWrapper> dismissGenericMessage() {
        return C10695a.m36221a(this.genericMessageButton).mo18694j(new C3768e(this));
    }

    public C5368e<C10708b> editTextChanges() {
        return C10707a.m36229a(this.walletAddressEdit);
    }

    public void fetchWalletAddressByClipboard() {
        if (this.clipboard.hasPrimaryClip() && this.clipboard.getPrimaryClipDescription().hasMimeType("text/plain")) {
            updateWalletText(this.clipboard.getPrimaryClip().getItemAt(0).getText().toString());
        }
    }

    public void fetchWalletAddressByIntent() {
        if (this.walletErrorView.getVisibility() != 0) {
            this.navigator.fetchWalletAddressByIntent(WALLET_PERMISSIONS_INTENT_URI_ACTION, 123, WALLET_PERMISSIONS_INTENT_EXTRA_KEY, WALLET_PERMISSIONS_INTENT_EXTRA_VALUE);
        }
    }

    public C5368e<Result> getActivityResults() {
        return ((ActivityResultNavigator) getContext()).results();
    }

    public C5368e<String> getWalletClick() {
        return C10695a.m36221a(this.getWalletAddressButton).mo18694j(new C3760d(this));
    }

    public void handleEmptyEditText(Editable editable) {
        if (editable.toString().equals("")) {
            this.walletMessageIcon.setVisibility(8);
        } else {
            this.walletMessageIcon.setVisibility(0);
        }
        if (validateAddress(editable.toString())) {
            enableNextButton();
            disableWalletButton();
            setValidWalletMessage();
        } else {
            disableNextButton();
            enableWalletButton();
            setInvalidWalletMessage();
        }
        this.walletErrorView.setVisibility(8);
    }

    public C5368e<Void> onCancelWalletUpdate() {
        return C10695a.m36221a(this.cancelUpdateWalletButton);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getFragmentComponent(bundle).inject(this);
        this.clipboard = (ClipboardManager) getContext().getSystemService("clipboard");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        getDialog().getWindow().requestFeature(1);
        return layoutInflater.inflate(C1086R.layout.promotions_claim_dialog, viewGroup, false);
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.walletAddressEdit = null;
        this.getWalletAddressButton = null;
        this.walletNextButton = null;
        this.walletCancelButton = null;
        this.walletMessageIcon = null;
        this.walletErrorView = null;
        this.genericMessageTitle = null;
        this.genericMessageBody = null;
        this.genericMessageButton = null;
        this.genericErrorOkButton = null;
        this.insertWalletView = null;
        this.genericMessageView = null;
        this.genericErrorView = null;
        this.updateWalletView = null;
        this.cancelUpdateWalletButton = null;
        this.updateWalletButton = null;
        this.presenter.dispose();
        this.presenter = null;
    }

    public void onResume() {
        super.onResume();
        Window window = getDialog().getWindow();
        Point point = new Point();
        window.getWindowManager().getDefaultDisplay().getSize(point);
        double d = (double) point.x;
        Double.isNaN(d);
        window.setLayout((int) (d * 0.9d), -2);
        window.setGravity(17);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.insertWalletView.getVisibility() == 0) {
            bundle.putString(VIEW, WALLET);
        } else if (this.genericMessageView.getVisibility() == 0 && this.genericMessageTitle.getText().equals(getResources().getString(C1086R.string.holidayspromotion_title_completed))) {
            bundle.putString(VIEW, "success");
        } else if (this.genericMessageView.getVisibility() == 0 && this.genericMessageTitle.getText().equals(getResources().getString(C1086R.string.holidayspromotion_title_error_claimed))) {
            bundle.putString(VIEW, CLAIMED);
        } else if (this.genericErrorView.getVisibility() == 0) {
            bundle.putString(VIEW, GENERIC_ERROR);
        }
    }

    public C5368e<Void> onUpdateWalletClick() {
        return C10695a.m36221a(this.updateWalletButton);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.loading = (ProgressBar) view.findViewById(C1086R.C1088id.loading);
        this.walletAddressEdit = (EditText) view.findViewById(C1086R.C1088id.wallet_edit);
        this.getWalletAddressButton = (Button) view.findViewById(C1086R.C1088id.get_wallet_button);
        this.walletNextButton = (Button) view.findViewById(C1086R.C1088id.wallet_continue_button);
        this.walletCancelButton = (Button) view.findViewById(C1086R.C1088id.wallet_cancel_button);
        this.walletMessageIcon = (ImageView) view.findViewById(C1086R.C1088id.wallet_message_icon);
        this.walletErrorView = view.findViewById(C1086R.C1088id.wallet_error_view);
        this.genericMessageTitle = (TextView) view.findViewById(C1086R.C1088id.generic_message_title);
        this.genericMessageBody = (TextView) view.findViewById(C1086R.C1088id.generic_message_body);
        this.genericMessageButton = (TextView) view.findViewById(C1086R.C1088id.generic_message_button);
        this.genericErrorOkButton = (Button) view.findViewById(C1086R.C1088id.error_ok_button);
        this.insertWalletView = view.findViewById(C1086R.C1088id.insert_address_view);
        this.genericMessageView = view.findViewById(C1086R.C1088id.generic_message_view);
        this.genericErrorView = view.findViewById(C1086R.C1088id.generic_error);
        this.genericErrorViewMessage = (TextView) view.findViewById(C1086R.C1088id.generic_error_message);
        this.updateWalletView = view.findViewById(C1086R.C1088id.update_wallet_view);
        this.cancelUpdateWalletButton = (Button) view.findViewById(C1086R.C1088id.cancel_wallet_update_button);
        this.updateWalletButton = (Button) view.findViewById(C1086R.C1088id.update_wallet_button);
        attachPresenter(this.presenter);
        handleRestoreViewState(bundle);
    }

    public void sendWalletIntent() {
        AptoideUtils.SystemU.openApp(WALLET_PACKAGE, getContext().getPackageManager(), getContext());
    }

    public void showCanceledVerificationError() {
        showErrorView(getString(C1086R.string.appc_verification_cancelled_by_user_message));
    }

    public void showClaimSuccess() {
        this.loading.setVisibility(8);
        showGenericMessageView(getResources().getString(C1086R.string.holidayspromotion_title_completed), getResources().getString(C1086R.string.holidayspromotion_message_completed));
    }

    public void showGenericError() {
        showErrorView(getString(C1086R.string.error_occured));
    }

    public void showInvalidWalletAddress() {
        this.loading.setVisibility(8);
        showWalletView();
        this.walletAddressEdit.setText("");
        this.walletMessageIcon.setVisibility(8);
        this.walletErrorView.setVisibility(0);
    }

    public void showLoading() {
        this.loading.setVisibility(0);
        this.insertWalletView.setVisibility(8);
        this.genericMessageView.setVisibility(8);
        this.updateWalletView.setVisibility(8);
    }

    public void showPromotionAlreadyClaimed() {
        this.loading.setVisibility(8);
        showGenericMessageView(getResources().getString(C1086R.string.holidayspromotion_title_error_claimed), getResources().getString(C1086R.string.holidayspromotion_short_error_claimed));
    }

    public void showUpdateWalletDialog() {
        this.loading.setVisibility(8);
        this.genericErrorView.setVisibility(8);
        this.insertWalletView.setVisibility(8);
        this.genericMessageView.setVisibility(8);
        this.updateWalletView.setVisibility(0);
    }

    public void updateWalletText(String str) {
        if (validateAddress(str)) {
            this.walletAddressEdit.setText(str);
        }
    }

    public void verifyWallet() {
        if (this.walletErrorView.getVisibility() != 0) {
            this.navigator.validateWallet(WALLET_VERIFICATION_INTENT_URI_ACTION, 124);
        }
    }

    public C5368e<String> walletCancelClick() {
        return C10695a.m36221a(this.walletCancelButton).mo18694j(new C3752c(this));
    }
}
