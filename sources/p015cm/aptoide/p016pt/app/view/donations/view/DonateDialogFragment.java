package p015cm.aptoide.p016pt.app.view.donations.view;

import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Point;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import javax.inject.Inject;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.app.AppNavigator;
import p015cm.aptoide.p016pt.app.view.donations.DonationsAnalytics;
import p015cm.aptoide.p016pt.app.view.donations.WalletService;
import p015cm.aptoide.p016pt.app.view.donations.model.DonationsDialogResult;
import p015cm.aptoide.p016pt.app.view.donations.utils.GenericPaymentIntentBuilder;
import p015cm.aptoide.p016pt.view.MainActivity;
import p015cm.aptoide.p016pt.view.fragment.BaseDialogFragment;
import p112n.p118g.p301a.p310c.C10695a;
import p123rx.C5368e;
import p123rx.p124l.p125c.C5376a;
import p123rx.p128t.C5383b;

/* renamed from: cm.aptoide.pt.app.view.donations.view.DonateDialogFragment */
public class DonateDialogFragment extends BaseDialogFragment implements DonateDialogView {
    private static final String HAS_WALLET = "wallet";
    private static final int MAX = 125000;
    private static final String PACKAGE_NAME = "package_name";
    private static final int RC_REQUEST = 666;
    private static final int SEEKBAR_MAX = 20;
    private static final int SEEKBAR_START = 2;
    @Inject
    AppNavigator appNavigator;
    /* access modifiers changed from: private */
    public SeekBar appcSlider;
    /* access modifiers changed from: private */
    public EditText appcValue;
    private Button cancelButton;
    private Button donateButton;
    @Inject
    DonationsAnalytics donationsAnalytics;
    private ProgressBar donationsProgress;
    private View donationsView;
    private InputFilter editTextFilter;
    private Button errorOkButton;
    private View errorView;
    /* access modifiers changed from: private */
    public InputMethodManager imm;
    private EditText nickname;
    private Button noWalletCancelButton;
    private Button noWalletContinueButton;
    private View noWalletView;
    private String packageName;
    private DonateDialogPresenter presenter;
    boolean sliderUpdate;
    boolean textUpdate;
    private Button thankYouOkButton;
    private View thankYouView;
    @Inject
    WalletService walletService;

    private void chooseViewToPresent(boolean z) {
        this.donationsView.setOnClickListener(new C1523e(this));
        if (z) {
            setSliderProperties();
            setValueInsertProperties();
            return;
        }
        this.donationsView.setVisibility(8);
        showNoWalletView();
        this.noWalletCancelButton.setOnClickListener(new C1524f(this));
    }

    private void handleValueInputFiltering() {
        this.imm = (InputMethodManager) getContext().getSystemService("input_method");
        this.editTextFilter = new InputFilter() {
            final int maxDigitsAfterDecimalPoint = 2;
            final int maxDigitsBeforeDecimalPoint = 6;

            public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                StringBuilder sb = new StringBuilder(spanned);
                sb.replace(i3, i4, charSequence.subSequence(i, i2).toString());
                if (!sb.toString().matches("(([1-9]{1})([0-9]{0,5})?)?(\\.[0-9]{0,2})?")) {
                    return charSequence.length() == 0 ? spanned.subSequence(i3, i4) : "";
                }
                return null;
            }
        };
    }

    public static DonateDialogFragment newInstance(String str, boolean z) {
        Bundle bundle = new Bundle();
        DonateDialogFragment donateDialogFragment = new DonateDialogFragment();
        bundle.putString("package_name", str);
        bundle.putBoolean(HAS_WALLET, z);
        donateDialogFragment.setArguments(bundle);
        return donateDialogFragment;
    }

    private void setSliderProperties() {
        this.appcSlider.setMax(20);
        this.appcSlider.setProgress(2);
        this.appcSlider.incrementProgressBy(1);
        this.appcSlider.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                DonateDialogFragment donateDialogFragment = DonateDialogFragment.this;
                donateDialogFragment.sliderUpdate = false;
                if (donateDialogFragment.textUpdate) {
                    donateDialogFragment.appcValue.setText(String.valueOf(Math.round((((float) (i * i)) / 1000000.0f) * 125000.0f)));
                }
                DonateDialogFragment.this.sliderUpdate = true;
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
                if (DonateDialogFragment.this.imm != null) {
                    DonateDialogFragment.this.imm.hideSoftInputFromWindow(DonateDialogFragment.this.getView().getRootView().getWindowToken(), 0);
                }
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
    }

    private void setValueInsertProperties() {
        this.appcValue.setText(String.valueOf(2));
        this.appcValue.setFilters(new InputFilter[]{this.editTextFilter});
        this.appcValue.addTextChangedListener(new TextWatcher() {
            public void afterTextChanged(Editable editable) {
                float f;
                String obj = editable.toString();
                if (!obj.equals("")) {
                    if (obj.substring(0, 1).equals(".")) {
                        obj = "0".concat(obj);
                    }
                    f = Float.parseFloat(obj);
                } else {
                    f = 0.0f;
                }
                if (f > 0.0f) {
                    DonateDialogFragment donateDialogFragment = DonateDialogFragment.this;
                    donateDialogFragment.textUpdate = false;
                    if (donateDialogFragment.sliderUpdate) {
                        donateDialogFragment.appcSlider.setProgress((int) Math.sqrt((double) ((f / 125000.0f) * 1000.0f * 1000.0f)));
                    }
                    DonateDialogFragment.this.textUpdate = true;
                    return;
                }
                DonateDialogFragment.this.appcSlider.setProgress(Math.round(f));
            }

            public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                DonateDialogFragment.this.appcValue.setSelection(DonateDialogFragment.this.appcValue.getText().toString().length());
            }

            public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        });
    }

    private void showThankYouMessage() {
        this.donationsProgress.setVisibility(8);
        this.thankYouView.setVisibility(0);
        this.thankYouOkButton.setOnClickListener(new C1519a(this));
    }

    /* renamed from: a */
    public /* synthetic */ DonationsDialogResult mo7654a(Void voidR) {
        return new DonationsDialogResult(this.packageName, this.nickname.getText().toString(), Float.parseFloat(this.appcValue.getText().toString()));
    }

    /* renamed from: b */
    public /* synthetic */ DonationsDialogResult mo7656b(Void voidR) {
        return new DonationsDialogResult(this.packageName, this.nickname.getText().toString(), Float.parseFloat(this.appcValue.getText().toString()));
    }

    /* renamed from: c */
    public /* synthetic */ void mo7658c(View view) {
        dismiss();
    }

    public C5368e<DonationsDialogResult> cancelClick() {
        return C10695a.m36221a(this.cancelButton).mo18694j(new C1520b(this));
    }

    /* renamed from: d */
    public /* synthetic */ void mo7660d(View view) {
        dismiss();
    }

    public void dismissDialog() {
        dismiss();
    }

    public C5368e<DonationsDialogResult> donateClick() {
        return C10695a.m36221a(this.donateButton).mo18694j(new C1521c(this));
    }

    public C5368e<Void> noWalletContinueClick() {
        return C10695a.m36221a(this.noWalletContinueButton);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == RC_REQUEST && i2 == 0) {
            showErrorMessage();
        } else if (i == RC_REQUEST && i2 == -1) {
            showThankYouMessage();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((MainActivity) getContext()).getActivityComponent().inject(this);
        this.packageName = getArguments().getString("package_name");
        this.presenter = new DonateDialogPresenter(this, this.walletService, new C5383b(), C5376a.m10346b(), this.appNavigator, this.donationsAnalytics);
        this.textUpdate = true;
        this.sliderUpdate = true;
        handleValueInputFiltering();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        return layoutInflater.inflate(C1086R.layout.appview_donations_dialog, viewGroup, false);
    }

    public void onDestroy() {
        super.onDestroy();
        this.packageName = null;
        this.presenter.dispose();
        this.presenter = null;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.nickname = null;
        this.appcValue = null;
        this.appcSlider = null;
        this.donateButton = null;
        this.cancelButton = null;
        this.donationsView = null;
        this.donationsProgress = null;
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

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        EditText editText = (EditText) view.findViewById(C1086R.C1088id.nickname);
        this.nickname = editText;
        editText.setImeOptions(6);
        this.nickname.setSingleLine();
        this.appcValue = (EditText) view.findViewById(C1086R.C1088id.appc_value);
        this.appcSlider = (SeekBar) view.findViewById(C1086R.C1088id.appc_slider);
        this.donateButton = (Button) view.findViewById(C1086R.C1088id.donate_button);
        this.cancelButton = (Button) view.findViewById(C1086R.C1088id.cancel_button);
        this.donationsView = view.findViewById(C1086R.C1088id.donations_view);
        this.donationsProgress = (ProgressBar) view.findViewById(C1086R.C1088id.donations_progress);
        this.noWalletView = view.findViewById(C1086R.C1088id.no_wallet_layout);
        this.noWalletCancelButton = (Button) view.findViewById(C1086R.C1088id.no_wallet_cancel_button);
        this.noWalletContinueButton = (Button) view.findViewById(C1086R.C1088id.no_wallet_continue_button);
        this.errorView = view.findViewById(C1086R.C1088id.error_layout);
        this.errorOkButton = (Button) view.findViewById(C1086R.C1088id.error_ok_button);
        this.thankYouView = view.findViewById(C1086R.C1088id.thank_you_layout);
        this.thankYouOkButton = (Button) view.findViewById(C1086R.C1088id.thank_you_ok_button);
        chooseViewToPresent(getArguments().getBoolean(HAS_WALLET, true));
        this.presenter.present();
    }

    public void sendWalletIntent(float f, String str, String str2, String str3) {
        try {
            startIntentSenderForResult(GenericPaymentIntentBuilder.buildBuyIntent(getContext(), "donation", String.valueOf(f), str, str2, GenericPaymentIntentBuilder.TransactionData.TYPE_DONATION, str3, false).getIntentSender(), RC_REQUEST, new Intent(), 0, 0, 0, (Bundle) null);
        } catch (IntentSender.SendIntentException e) {
            e.printStackTrace();
        }
        this.donationsProgress.setVisibility(8);
    }

    public void showErrorMessage() {
        this.donationsView.setVisibility(8);
        this.donationsProgress.setVisibility(8);
        this.errorView.setVisibility(0);
        this.errorOkButton.setOnClickListener(new C1522d(this));
    }

    public void showLoading() {
        this.donationsView.setVisibility(8);
        this.donationsProgress.setVisibility(0);
    }

    public void showNoWalletView() {
        this.donationsProgress.setVisibility(8);
        this.noWalletView.setVisibility(0);
    }

    /* renamed from: a */
    public /* synthetic */ void mo7655a(View view) {
        InputMethodManager inputMethodManager = this.imm;
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(getView().getRootView().getWindowToken(), 0);
        }
    }

    /* renamed from: b */
    public /* synthetic */ void mo7657b(View view) {
        dismiss();
    }
}
