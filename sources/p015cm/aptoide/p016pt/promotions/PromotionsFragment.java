package p015cm.aptoide.p016pt.promotions;

import android.app.AlertDialog;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.TransformationMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.C0069a;
import androidx.appcompat.app.C0076d;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.C0717q;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.inject.Inject;
import p015cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.app.DownloadModel;
import p015cm.aptoide.p016pt.networking.image.ImageLoader;
import p015cm.aptoide.p016pt.promotions.PromotionAppClick;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p015cm.aptoide.p016pt.util.AppBarStateChangeListener;
import p015cm.aptoide.p016pt.utils.GenericDialogs;
import p015cm.aptoide.p016pt.view.fragment.NavigationTrackFragment;
import p050l.p051a.p052k.p053a.C4800a;
import p112n.p118g.p301a.p310c.C10695a;
import p123rx.C5368e;
import p123rx.C5375k;
import p123rx.exceptions.OnErrorNotImplementedException;
import p123rx.p124l.p125c.C5376a;
import p123rx.p126m.C5378b;
import p123rx.p127s.C12871b;

/* renamed from: cm.aptoide.pt.promotions.PromotionsFragment */
public class PromotionsFragment extends NavigationTrackFragment implements PromotionsView {
    private static final String WALLET_PACKAGE_NAME = "com.appcoins.wallet";
    private AppBarLayout appBarLayout;
    /* access modifiers changed from: private */
    public Drawable backArrow;
    private CollapsingToolbarLayout collapsingToolbarLayout;
    private C5375k errorMessageSubscription;
    private View genericErrorView;
    private View genericErrorViewRetry;
    private ProgressBar loading;
    private Button promotionAction;
    private C12871b<PromotionAppClick> promotionAppClick;
    private TextView promotionFirstMessage;
    private C12871b<Void> promotionOverDialogClick;
    private TextView promotionTitle;
    private PromotionsAdapter promotionsAdapter;
    private RecyclerView promotionsList;
    @Inject
    PromotionsPresenter promotionsPresenter;
    private View promotionsView;
    @Inject
    ThemeManager themeManager;
    /* access modifiers changed from: private */
    public Toolbar toolbar;
    private ImageView toolbarImage;
    private ImageView toolbarImagePlaceholder;
    /* access modifiers changed from: private */
    public TextView toolbarTitle;
    private View walletActiveView;
    private View walletInactiveView;
    private Window window;

    /* renamed from: cm.aptoide.pt.promotions.PromotionsFragment$2 */
    static /* synthetic */ class C37332 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action;
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState;
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$util$AppBarStateChangeListener$State;

        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|29|30|31|32|33|34|(3:35|36|38)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|29|30|31|32|33|34|(3:35|36|38)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(33:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|29|30|31|32|33|34|35|36|38) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x007e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0088 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0092 */
        static {
            /*
                cm.aptoide.pt.app.DownloadModel$Action[] r0 = p015cm.aptoide.p016pt.app.DownloadModel.Action.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action = r0
                r1 = 1
                cm.aptoide.pt.app.DownloadModel$Action r2 = p015cm.aptoide.p016pt.app.DownloadModel.Action.DOWNGRADE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action     // Catch:{ NoSuchFieldError -> 0x001d }
                cm.aptoide.pt.app.DownloadModel$Action r3 = p015cm.aptoide.p016pt.app.DownloadModel.Action.INSTALL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action     // Catch:{ NoSuchFieldError -> 0x0028 }
                cm.aptoide.pt.app.DownloadModel$Action r4 = p015cm.aptoide.p016pt.app.DownloadModel.Action.OPEN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action     // Catch:{ NoSuchFieldError -> 0x0033 }
                cm.aptoide.pt.app.DownloadModel$Action r5 = p015cm.aptoide.p016pt.app.DownloadModel.Action.UPDATE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                cm.aptoide.pt.app.DownloadModel$DownloadState[] r4 = p015cm.aptoide.p016pt.app.DownloadModel.DownloadState.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                $SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState = r4
                cm.aptoide.pt.app.DownloadModel$DownloadState r5 = p015cm.aptoide.p016pt.app.DownloadModel.DownloadState.ACTIVE     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r4 = $SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState     // Catch:{ NoSuchFieldError -> 0x004e }
                cm.aptoide.pt.app.DownloadModel$DownloadState r5 = p015cm.aptoide.p016pt.app.DownloadModel.DownloadState.INDETERMINATE     // Catch:{ NoSuchFieldError -> 0x004e }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r4 = $SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState     // Catch:{ NoSuchFieldError -> 0x0058 }
                cm.aptoide.pt.app.DownloadModel$DownloadState r5 = p015cm.aptoide.p016pt.app.DownloadModel.DownloadState.PAUSE     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r4[r5] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r4 = $SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState     // Catch:{ NoSuchFieldError -> 0x0062 }
                cm.aptoide.pt.app.DownloadModel$DownloadState r5 = p015cm.aptoide.p016pt.app.DownloadModel.DownloadState.COMPLETE     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r4 = $SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState     // Catch:{ NoSuchFieldError -> 0x006d }
                cm.aptoide.pt.app.DownloadModel$DownloadState r5 = p015cm.aptoide.p016pt.app.DownloadModel.DownloadState.ERROR     // Catch:{ NoSuchFieldError -> 0x006d }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r6 = 5
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                cm.aptoide.pt.util.AppBarStateChangeListener$State[] r4 = p015cm.aptoide.p016pt.util.AppBarStateChangeListener.State.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                $SwitchMap$cm$aptoide$pt$util$AppBarStateChangeListener$State = r4
                cm.aptoide.pt.util.AppBarStateChangeListener$State r5 = p015cm.aptoide.p016pt.util.AppBarStateChangeListener.State.EXPANDED     // Catch:{ NoSuchFieldError -> 0x007e }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x007e }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x007e }
            L_0x007e:
                int[] r1 = $SwitchMap$cm$aptoide$pt$util$AppBarStateChangeListener$State     // Catch:{ NoSuchFieldError -> 0x0088 }
                cm.aptoide.pt.util.AppBarStateChangeListener$State r4 = p015cm.aptoide.p016pt.util.AppBarStateChangeListener.State.IDLE     // Catch:{ NoSuchFieldError -> 0x0088 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0088 }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x0088 }
            L_0x0088:
                int[] r0 = $SwitchMap$cm$aptoide$pt$util$AppBarStateChangeListener$State     // Catch:{ NoSuchFieldError -> 0x0092 }
                cm.aptoide.pt.util.AppBarStateChangeListener$State r1 = p015cm.aptoide.p016pt.util.AppBarStateChangeListener.State.MOVING     // Catch:{ NoSuchFieldError -> 0x0092 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0092 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0092 }
            L_0x0092:
                int[] r0 = $SwitchMap$cm$aptoide$pt$util$AppBarStateChangeListener$State     // Catch:{ NoSuchFieldError -> 0x009c }
                cm.aptoide.pt.util.AppBarStateChangeListener$State r1 = p015cm.aptoide.p016pt.util.AppBarStateChangeListener.State.COLLAPSED     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.promotions.PromotionsFragment.C37332.<clinit>():void");
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m6857a(GenericDialogs.EResponse eResponse) {
    }

    /* renamed from: e */
    static /* synthetic */ Boolean m6863e(PromotionAppClick promotionAppClick2) {
        return Boolean.valueOf(promotionAppClick2.getClickType() == PromotionAppClick.ClickType.CLAIM);
    }

    /* renamed from: f */
    static /* synthetic */ Boolean m6864f(PromotionAppClick promotionAppClick2) {
        return Boolean.valueOf(promotionAppClick2.getClickType() == PromotionAppClick.ClickType.UPDATE || promotionAppClick2.getClickType() == PromotionAppClick.ClickType.INSTALL_APP || promotionAppClick2.getClickType() == PromotionAppClick.ClickType.DOWNLOAD || promotionAppClick2.getClickType() == PromotionAppClick.ClickType.DOWNGRADE);
    }

    private int getButtonMessage(int i) {
        if (i == 0) {
            return C1086R.string.appview_button_update;
        }
        if (!(i == 1 || i == 3)) {
            if (i == 4) {
                return C1086R.string.promotion_claim_button;
            }
            if (i == 5) {
                return C1086R.string.holidayspromotion_button_claimed;
            }
            if (i != 6) {
                throw new IllegalArgumentException("Wrong view type of promotion app");
            }
        }
        return C1086R.string.install;
    }

    private PromotionAppClick.ClickType getClickType(int i) {
        if (i == 0) {
            return PromotionAppClick.ClickType.UPDATE;
        }
        if (i == 1) {
            return PromotionAppClick.ClickType.DOWNLOAD;
        }
        if (i == 3) {
            return PromotionAppClick.ClickType.INSTALL_APP;
        }
        if (i == 4) {
            return PromotionAppClick.ClickType.CLAIM;
        }
        if (i == 6) {
            return PromotionAppClick.ClickType.DOWNGRADE;
        }
        throw new IllegalArgumentException("Wrong view type of promotion app");
    }

    private int getState(PromotionViewApp promotionViewApp) {
        DownloadModel downloadModel = promotionViewApp.getDownloadModel();
        if (downloadModel.isDownloading()) {
            return 2;
        }
        int i = C37332.$SwitchMap$cm$aptoide$pt$app$DownloadModel$Action[downloadModel.getAction().ordinal()];
        if (i == 1) {
            return 6;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            if (i == 4) {
                return 0;
            }
            throw new IllegalArgumentException("Invalid type of download action");
        } else if (promotionViewApp.isClaimed()) {
            return 5;
        } else {
            return 4;
        }
    }

    /* renamed from: h */
    static /* synthetic */ Boolean m6866h(PromotionAppClick promotionAppClick2) {
        return Boolean.valueOf(promotionAppClick2.getClickType() == PromotionAppClick.ClickType.PAUSE_DOWNLOAD);
    }

    private void handleDownloadError(DownloadModel.DownloadState downloadState) {
        if (downloadState == DownloadModel.DownloadState.ERROR) {
            showErrorDialog("", getContext().getString(C1086R.string.error_occured));
        }
    }

    private SpannableString handleRewardMessage(float f, String str, double d, boolean z) {
        String str2;
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        String d2 = Double.toString(Math.floor((double) f));
        if (z) {
            str2 = getString(C1086R.string.FIATpromotion_update_to_get_short, d2, str + decimalFormat.format(d));
        } else {
            str2 = getString(C1086R.string.FIATpromotion_install_to_get_short, d2, str + decimalFormat.format(d));
        }
        SpannableString spannableString = new SpannableString(str2);
        spannableString.setSpan(new ForegroundColorSpan(getResources().getColor(C1086R.color.promotions_reward)), str2.indexOf(d2), str2.length(), 33);
        return spannableString;
    }

    /* access modifiers changed from: private */
    public void handleStatusBar(boolean z) {
        if (z) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 21) {
                if (i > 23 && !this.themeManager.isThemeDark()) {
                    this.window.getDecorView().setSystemUiVisibility(8192);
                }
                this.window.setStatusBarColor(getResources().getColor(this.themeManager.getAttributeForTheme(C1086R.attr.statusBarColorSecondary).resourceId));
            }
        } else if (Build.VERSION.SDK_INT >= 21) {
            this.window.setStatusBarColor(getResources().getColor(C1086R.color.black_87_alpha));
            this.window.getDecorView().setSystemUiVisibility(0);
        }
    }

    private boolean isWalletInstalled() {
        for (ApplicationInfo applicationInfo : getContext().getPackageManager().getInstalledApplications(0)) {
            if (applicationInfo.packageName.equals(WALLET_PACKAGE_NAME)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    static /* synthetic */ Boolean m6868j(PromotionAppClick promotionAppClick2) {
        return Boolean.valueOf(promotionAppClick2.getClickType() == PromotionAppClick.ClickType.RESUME_DOWNLOAD);
    }

    private void setClaimedButton() {
        this.promotionAction.setEnabled(false);
        this.promotionAction.setBackgroundColor(getResources().getColor(C1086R.color.grey_fog_light));
        this.promotionAction.setTextColor(getResources().getColor(C1086R.color.black));
        SpannableString spannableString = new SpannableString("  " + getResources().getString(C1086R.string.holidayspromotion_button_claimed).toUpperCase());
        Drawable c = C4800a.m7936c(getContext(), C1086R.C1087drawable.ic_promotion_claimed_check);
        c.setBounds(0, 0, c.getIntrinsicWidth(), c.getIntrinsicHeight());
        spannableString.setSpan(new ImageSpan(c, 1), 0, 1, 18);
        this.promotionAction.setTransformationMethod((TransformationMethod) null);
        this.promotionAction.setText(spannableString);
    }

    private void setWalletItemClickListener(PromotionViewApp promotionViewApp) {
        C3802i1 i1Var = new C3802i1(this, promotionViewApp);
        this.walletInactiveView.setOnClickListener(i1Var);
        this.walletActiveView.setOnClickListener(i1Var);
    }

    private void setupRecyclerView() {
        this.promotionsList.setAdapter(this.promotionsAdapter);
        this.promotionsList.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        RecyclerView.C0638l itemAnimator = this.promotionsList.getItemAnimator();
        if (itemAnimator instanceof C0717q) {
            ((C0717q) itemAnimator).setSupportsChangeAnimations(false);
        }
    }

    private void showErrorDialog(String str, String str2) {
        this.errorMessageSubscription = GenericDialogs.createGenericOkMessage(getContext(), str, str2, this.themeManager.getAttributeForTheme(C1086R.attr.dialogsTheme).resourceId).mo18662b(C5376a.m10346b()).mo18655a(C3842n1.f6912f, (C5378b<Throwable>) C3914w1.f6993f);
    }

    private void showWallet(PromotionViewApp promotionViewApp, boolean z) {
        PromotionViewApp promotionViewApp2 = promotionViewApp;
        if (promotionViewApp.getDownloadModel().isDownloading()) {
            this.walletActiveView.setVisibility(0);
            this.walletInactiveView.setVisibility(8);
            ProgressBar progressBar = (ProgressBar) this.walletActiveView.findViewById(C1086R.C1088id.promotions_download_progress_bar);
            ImageView imageView = (ImageView) this.walletActiveView.findViewById(C1086R.C1088id.promotions_download_cancel_button);
            ImageView imageView2 = (ImageView) this.walletActiveView.findViewById(C1086R.C1088id.promotions_download_resume_download);
            LinearLayout linearLayout = (LinearLayout) this.walletActiveView.findViewById(C1086R.C1088id.install_controls_layout);
            ImageLoader.with(getContext()).load(promotionViewApp.getAppIcon(), (ImageView) this.walletActiveView.findViewById(C1086R.C1088id.app_icon));
            ((TextView) this.walletActiveView.findViewById(C1086R.C1088id.app_name)).setText(promotionViewApp.getName());
            ((TextView) this.walletActiveView.findViewById(C1086R.C1088id.app_description)).setText(promotionViewApp.getDescription());
            float appcValue = promotionViewApp.getAppcValue();
            String fiatSymbol = promotionViewApp.getFiatSymbol();
            double fiatValue = promotionViewApp.getFiatValue();
            boolean equals = promotionViewApp.getDownloadModel().getAction().equals(DownloadModel.Action.UPDATE);
            ImageView imageView3 = (ImageView) this.walletActiveView.findViewById(C1086R.C1088id.promotions_download_pause_download);
            TextView textView = (TextView) this.walletActiveView.findViewById(C1086R.C1088id.promotions_download_progress_number);
            ((TextView) this.walletActiveView.findViewById(C1086R.C1088id.app_reward)).setText(handleRewardMessage(appcValue, fiatSymbol, fiatValue, equals));
            DownloadModel.DownloadState downloadState = promotionViewApp.getDownloadModel().getDownloadState();
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1, 4.0f);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1, 2.0f);
            int i = C37332.$SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState[downloadState.ordinal()];
            if (i == 1) {
                ImageView imageView4 = imageView3;
                progressBar.setIndeterminate(false);
                progressBar.setProgress(promotionViewApp.getDownloadModel().getProgress());
                textView.setText(promotionViewApp.getDownloadModel().getProgress() + "%");
                imageView4.setVisibility(0);
                imageView4.setOnClickListener(new C3834m1(this, promotionViewApp2));
                imageView.setVisibility(8);
                imageView2.setVisibility(8);
                linearLayout.setLayoutParams(layoutParams);
            } else if (i == 2) {
                ImageView imageView5 = imageView3;
                progressBar.setIndeterminate(true);
                imageView5.setVisibility(0);
                imageView5.setOnClickListener(new C3930y1(this, promotionViewApp2));
                imageView.setVisibility(8);
                imageView2.setVisibility(8);
                linearLayout.setLayoutParams(layoutParams);
            } else if (i == 3) {
                progressBar.setIndeterminate(false);
                progressBar.setProgress(promotionViewApp.getDownloadModel().getProgress());
                textView.setText(promotionViewApp.getDownloadModel().getProgress() + "%");
                imageView3.setVisibility(8);
                imageView.setVisibility(0);
                imageView.setOnClickListener(new C3779f2(this, promotionViewApp2));
                imageView2.setVisibility(0);
                imageView2.setOnClickListener(new C3922x1(this, promotionViewApp2));
                linearLayout.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                progressBar.setIndeterminate(true);
                ImageView imageView6 = imageView3;
                imageView6.setVisibility(0);
                imageView6.setOnClickListener(new C3890t1(this, promotionViewApp2));
                imageView.setVisibility(8);
                imageView2.setVisibility(8);
                linearLayout.setLayoutParams(layoutParams);
            } else if (i == 5) {
                showErrorDialog("", getContext().getString(C1086R.string.error_occured));
            }
        } else {
            if (promotionViewApp.getDownloadModel().hasError()) {
                handleDownloadError(promotionViewApp.getDownloadModel().getDownloadState());
            }
            this.walletActiveView.setVisibility(8);
            this.walletInactiveView.setVisibility(0);
            ImageLoader.with(getContext()).load(promotionViewApp.getAppIcon(), (ImageView) this.walletInactiveView.findViewById(C1086R.C1088id.app_icon));
            ((TextView) this.walletInactiveView.findViewById(C1086R.C1088id.app_name)).setText(promotionViewApp.getName());
            ((TextView) this.walletInactiveView.findViewById(C1086R.C1088id.app_description)).setText(promotionViewApp.getDescription());
            ((TextView) this.walletInactiveView.findViewById(C1086R.C1088id.app_reward)).setText(handleRewardMessage(promotionViewApp.getAppcValue(), promotionViewApp.getFiatSymbol(), promotionViewApp.getFiatValue(), promotionViewApp.getDownloadModel().getAction().equals(DownloadModel.Action.UPDATE)));
            this.promotionAction.setText(getContext().getString(getButtonMessage(getState(promotionViewApp)), new Object[]{Float.valueOf(promotionViewApp.getAppcValue())}));
            if (getState(promotionViewApp) == 5) {
                if (!isWalletInstalled()) {
                    this.promotionAction.setEnabled(true);
                    this.promotionAction.setBackgroundDrawable(getContext().getResources().getDrawable(C1086R.C1087drawable.appc_gradient_rounded));
                    this.promotionAction.setText(getContext().getString(C1086R.string.appview_button_install));
                    this.promotionAction.setOnClickListener(new C3746b2(this, promotionViewApp2));
                } else {
                    setClaimedButton();
                }
                this.promotionsAdapter.isWalletInstalled(z);
            } else if (getState(promotionViewApp) == 4) {
                this.promotionAction.setEnabled(true);
                this.promotionAction.setBackgroundDrawable(getContext().getResources().getDrawable(C1086R.C1087drawable.card_border_rounded_green));
                this.promotionAction.setTextColor(-1);
                this.promotionAction.setOnClickListener(new C3882s1(this, promotionViewApp2));
                this.promotionsAdapter.isWalletInstalled(true);
            } else {
                this.promotionAction.setEnabled(true);
                this.promotionAction.setBackgroundDrawable(getContext().getResources().getDrawable(C1086R.C1087drawable.appc_gradient_rounded));
                if (promotionViewApp.isClaimed()) {
                    this.promotionAction.setText(getContext().getString(C1086R.string.appview_button_install));
                }
                this.promotionAction.setOnClickListener(new C3771e2(this, promotionViewApp2));
            }
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo13693a(AlertDialog alertDialog, View view) {
        this.promotionOverDialogClick.onNext(null);
        alertDialog.dismiss();
    }

    public C5368e<PromotionAppClick> appCardClick() {
        return this.promotionAppClick.mo18681d(C3938z1.f7020f);
    }

    public C5368e<PromotionViewApp> cancelDownload() {
        return this.promotionAppClick.mo18681d(C3898u1.f6977f).mo18694j(C3737a2.f6782f);
    }

    public C5368e<PromotionViewApp> claimAppClick() {
        return this.promotionAppClick.mo18681d(C3858p1.f6929f).mo18694j(C3810j1.f6872f);
    }

    public ScreenTagHistory getHistoryTracker() {
        return ScreenTagHistory.Builder.build(PromotionsFragment.class.getSimpleName());
    }

    public C5368e<PromotionViewApp> installButtonClick() {
        return this.promotionAppClick.mo18681d(C3874r1.f6949f).mo18694j(C3906v1.f6985f);
    }

    public void lockPromotionApps(boolean z) {
        this.promotionsAdapter.isWalletInstalled(z);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getFragmentComponent(bundle).inject(this);
        this.window = getActivity().getWindow();
        this.promotionOverDialogClick = C12871b.m41468p();
        setHasOptionsMenu(true);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C1086R.layout.fragment_promotions, viewGroup, false);
    }

    public void onDestroy() {
        super.onDestroy();
        this.window = null;
        this.promotionAppClick = null;
        this.promotionOverDialogClick = null;
        C5375k kVar = this.errorMessageSubscription;
        if (kVar != null && !kVar.isUnsubscribed()) {
            this.errorMessageSubscription.unsubscribe();
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.themeManager.resetToBaseTheme();
        if (Build.VERSION.SDK_INT >= 16) {
            this.window.getDecorView().setSystemUiVisibility(256);
        }
        this.toolbarTitle = null;
        this.toolbar = null;
        this.promotionsList = null;
        this.promotionsAdapter = null;
        this.collapsingToolbarLayout = null;
        this.appBarLayout = null;
        this.backArrow = null;
        this.walletActiveView = null;
        this.walletInactiveView = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.promotionsList = (RecyclerView) view.findViewById(C1086R.C1088id.fragment_promotions_promotions_list);
        this.promotionAppClick = C12871b.m41468p();
        this.promotionsAdapter = new PromotionsAdapter(new ArrayList(), new PromotionsViewHolderFactory(this.promotionAppClick, this.themeManager));
        this.toolbarImage = (ImageView) view.findViewById(C1086R.C1088id.app_graphic);
        this.toolbarImagePlaceholder = (ImageView) view.findViewById(C1086R.C1088id.app_graphic_placeholder);
        this.promotionTitle = (TextView) view.findViewById(C1086R.C1088id.promotions_title);
        this.promotionFirstMessage = (TextView) view.findViewById(C1086R.C1088id.promotions_message_1);
        this.walletActiveView = view.findViewById(C1086R.C1088id.promotion_wallet_active);
        View findViewById = view.findViewById(C1086R.C1088id.promotion_wallet_inactive);
        this.walletInactiveView = findViewById;
        this.promotionAction = (Button) findViewById.findViewById(C1086R.C1088id.promotion_app_action_button);
        this.loading = (ProgressBar) view.findViewById(C1086R.C1088id.progress_bar);
        this.promotionsView = view.findViewById(C1086R.C1088id.promotions_view);
        View findViewById2 = view.findViewById(C1086R.C1088id.generic_error);
        this.genericErrorView = findViewById2;
        this.genericErrorViewRetry = findViewById2.findViewById(C1086R.C1088id.retry);
        this.toolbarTitle = (TextView) view.findViewById(C1086R.C1088id.toolbar_title);
        Toolbar toolbar2 = (Toolbar) view.findViewById(C1086R.C1088id.toolbar);
        this.toolbar = toolbar2;
        toolbar2.setTitle((CharSequence) "");
        C0076d dVar = (C0076d) getActivity();
        dVar.setSupportActionBar(this.toolbar);
        C0069a supportActionBar = dVar.getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo188d(true);
        }
        this.backArrow = this.toolbar.getNavigationIcon();
        this.appBarLayout = (AppBarLayout) view.findViewById(C1086R.C1088id.app_bar_layout);
        CollapsingToolbarLayout collapsingToolbarLayout2 = (CollapsingToolbarLayout) view.findViewById(C1086R.C1088id.collapsing_toolbar_layout);
        this.collapsingToolbarLayout = collapsingToolbarLayout2;
        collapsingToolbarLayout2.setExpandedTitleColor(getResources().getColor(C1086R.color.transparent));
        this.collapsingToolbarLayout.setCollapsedTitleTextColor(getResources().getColor(C1086R.color.transparent));
        this.appBarLayout.mo30728a((AppBarLayout.C8416e) new AppBarStateChangeListener() {
            private void configureAppBarLayout(Drawable drawable, int i, boolean z) {
                PromotionsFragment.this.toolbar.setBackgroundDrawable(drawable);
                PromotionsFragment.this.toolbarTitle.setTextColor(i);
                if (Build.VERSION.SDK_INT >= 21) {
                    PromotionsFragment.this.handleStatusBar(z);
                }
                if (PromotionsFragment.this.backArrow != null) {
                    PromotionsFragment.this.backArrow.setColorFilter(i, PorterDuff.Mode.SRC_IN);
                }
            }

            public void onStateChanged(AppBarLayout appBarLayout, AppBarStateChangeListener.State state) {
                Resources resources = PromotionsFragment.this.getResources();
                int i = C37332.$SwitchMap$cm$aptoide$pt$util$AppBarStateChangeListener$State[state.ordinal()];
                if (i == 1) {
                    return;
                }
                if (i != 4) {
                    PromotionsFragment.this.toolbarTitle.setVisibility(8);
                    configureAppBarLayout(resources.getDrawable(C1086R.C1087drawable.editorial_up_bottom_black_gradient), resources.getColor(C1086R.color.white), false);
                    return;
                }
                PromotionsFragment.this.toolbarTitle.setVisibility(0);
                configureAppBarLayout(resources.getDrawable(C1086R.C1087drawable.transparent), resources.getColor(PromotionsFragment.this.themeManager.getAttributeForTheme(C1086R.attr.textColorBlackAlpha).resourceId), true);
            }
        });
        setupRecyclerView();
        attachPresenter(this.promotionsPresenter);
    }

    public C5368e<PromotionViewApp> pauseDownload() {
        return this.promotionAppClick.mo18681d(C3763d2.f6814f).mo18694j(C3755c2.f6805f);
    }

    public C5368e<Void> promotionOverDialogClick() {
        return this.promotionOverDialogClick;
    }

    public C5368e<PromotionViewApp> resumeDownload() {
        return this.promotionAppClick.mo18681d(C3850o1.f6920f).mo18694j(C3818k1.f6882f);
    }

    public C5368e<Void> retryClicked() {
        return C10695a.m36221a(this.genericErrorViewRetry);
    }

    public void setPromotionMessage(String str) {
        this.promotionFirstMessage.setText(str);
    }

    public void showDownloadError(PromotionViewApp promotionViewApp) {
        if (promotionViewApp.getDownloadModel().hasError()) {
            handleDownloadError(promotionViewApp.getDownloadModel().getDownloadState());
        }
    }

    public void showErrorView() {
        this.toolbarImage.setVisibility(8);
        this.loading.setVisibility(8);
        this.promotionsView.setVisibility(8);
        this.genericErrorView.setVisibility(0);
    }

    public void showLoading() {
        this.toolbarImagePlaceholder.setVisibility(0);
        this.toolbarImage.setVisibility(8);
        this.promotionsView.setVisibility(8);
        this.genericErrorView.setVisibility(8);
        this.loading.setVisibility(0);
    }

    public void showPromotionApp(PromotionViewApp promotionViewApp, boolean z) {
        if (promotionViewApp.getPackageName().equals(WALLET_PACKAGE_NAME)) {
            showWallet(promotionViewApp, z);
            setWalletItemClickListener(promotionViewApp);
        } else {
            this.promotionsAdapter.setPromotionApp(promotionViewApp);
        }
        this.loading.setVisibility(8);
        this.toolbarImagePlaceholder.setVisibility(8);
        this.toolbarImage.setVisibility(0);
        this.promotionsView.setVisibility(0);
    }

    public void showPromotionFeatureGraphic(String str) {
        ImageLoader.with(getContext()).load(str, this.toolbarImage);
    }

    public void showPromotionOverDialog() {
        this.loading.setVisibility(8);
        View inflate = LayoutInflater.from(getContext()).inflate(C1086R.layout.promotions_promotion_over_dialog, (ViewGroup) null);
        AlertDialog create = new AlertDialog.Builder(getContext()).setView(inflate).create();
        create.setCancelable(false);
        inflate.findViewById(C1086R.C1088id.dismiss_button).setOnClickListener(new C3826l1(this, create));
        create.show();
    }

    public void showPromotionTitle(String str) {
        this.promotionTitle.setText(str);
        this.toolbarTitle.setText(str);
    }

    public C5368e<Boolean> showRootInstallWarningPopup() {
        return GenericDialogs.createGenericYesNoCancelMessage(getContext(), (String) null, getResources().getString(C1086R.string.root_access_dialog), this.themeManager.getAttributeForTheme(C1086R.attr.dialogsTheme).resourceId).mo18694j(C3866q1.f6941f);
    }

    public void updateClaimStatus(String str) {
        if (str.equals(WALLET_PACKAGE_NAME)) {
            setClaimedButton();
            this.promotionsAdapter.isWalletInstalled(true);
            return;
        }
        this.promotionsAdapter.updateClaimStatus(str);
    }

    /* renamed from: b */
    static /* synthetic */ Boolean m6859b(PromotionAppClick promotionAppClick2) {
        return Boolean.valueOf(promotionAppClick2.getClickType() == PromotionAppClick.ClickType.CANCEL_DOWNLOAD);
    }

    /* renamed from: c */
    public /* synthetic */ void mo13697c(PromotionViewApp promotionViewApp, View view) {
        this.promotionAppClick.onNext(new PromotionAppClick(promotionViewApp, PromotionAppClick.ClickType.PAUSE_DOWNLOAD));
    }

    /* renamed from: d */
    public /* synthetic */ void mo13700d(PromotionViewApp promotionViewApp, View view) {
        this.promotionAppClick.onNext(new PromotionAppClick(promotionViewApp, PromotionAppClick.ClickType.CANCEL_DOWNLOAD));
    }

    /* renamed from: e */
    public /* synthetic */ void mo13701e(PromotionViewApp promotionViewApp, View view) {
        this.promotionAppClick.onNext(new PromotionAppClick(promotionViewApp, PromotionAppClick.ClickType.RESUME_DOWNLOAD));
    }

    /* renamed from: g */
    public /* synthetic */ void mo13703g(PromotionViewApp promotionViewApp, View view) {
        this.promotionAppClick.onNext(new PromotionAppClick(promotionViewApp, PromotionAppClick.ClickType.INSTALL_APP));
    }

    /* renamed from: h */
    public /* synthetic */ void mo13704h(PromotionViewApp promotionViewApp, View view) {
        this.promotionAppClick.onNext(new PromotionAppClick(promotionViewApp, getClickType(getState(promotionViewApp))));
    }

    /* renamed from: i */
    public /* synthetic */ void mo13705i(PromotionViewApp promotionViewApp, View view) {
        this.promotionAppClick.onNext(new PromotionAppClick(promotionViewApp, getClickType(getState(promotionViewApp))));
    }

    /* renamed from: b */
    public /* synthetic */ void mo13696b(PromotionViewApp promotionViewApp, View view) {
        this.promotionAppClick.onNext(new PromotionAppClick(promotionViewApp, PromotionAppClick.ClickType.PAUSE_DOWNLOAD));
    }

    /* renamed from: a */
    public /* synthetic */ void mo13694a(PromotionViewApp promotionViewApp, View view) {
        this.promotionAppClick.onNext(new PromotionAppClick(promotionViewApp, PromotionAppClick.ClickType.NAVIGATE));
    }

    /* renamed from: f */
    public /* synthetic */ void mo13702f(PromotionViewApp promotionViewApp, View view) {
        this.promotionAppClick.onNext(new PromotionAppClick(promotionViewApp, PromotionAppClick.ClickType.PAUSE_DOWNLOAD));
    }

    /* renamed from: a */
    static /* synthetic */ void m6858a(Throwable th) {
        throw new OnErrorNotImplementedException(th);
    }
}
