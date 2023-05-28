package p015cm.aptoide.p016pt.home.more.appcoins;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import java.text.DecimalFormat;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.C4789l;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;
import kotlin.p215c0.p216c.C9117p;
import p015cm.aptoide.aptoideviews.recyclerview.GridRecyclerView;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.app.DownloadModel;
import p015cm.aptoide.p016pt.home.bundles.apps.RewardApp;
import p015cm.aptoide.p016pt.home.more.base.ListAppsFragment;
import p015cm.aptoide.p016pt.promotions.WalletApp;
import p015cm.aptoide.p016pt.store.view.StoreTabGridRecyclerFragment;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p015cm.aptoide.p016pt.utils.GenericDialogs;
import p112n.p118g.p301a.p310c.C10695a;
import p123rx.C5368e;
import p123rx.C5375k;
import p123rx.p124l.p125c.C5376a;
import p123rx.p126m.C5378b;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 C2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001CB\u0005¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016J\u001a\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00030\u001aH\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020 H\u0014J\b\u0010!\u001a\u00020\u001cH\u0016J\b\u0010\"\u001a\u00020\u001cH\u0016J\u0012\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0002J\b\u0010'\u001a\u00020$H\u0016J\u0012\u0010(\u001a\u00020$2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J&\u0010+\u001a\u0004\u0018\u00010,2\u0006\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u001b2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u00100\u001a\u00020$H\u0016J\u001a\u00101\u001a\u00020$2\u0006\u00102\u001a\u00020,2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u000e\u00103\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016J\u000e\u00104\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016J\u000e\u00105\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016J\u001a\u00106\u001a\u00020$2\u0006\u00107\u001a\u00020\u001c2\b\u0010%\u001a\u0004\u0018\u00010&H\u0002J\u0010\u00108\u001a\u00020$2\u0006\u00109\u001a\u00020:H\u0016J\u0010\u0010;\u001a\u00020$2\u0006\u00109\u001a\u00020:H\u0016J\u0018\u0010<\u001a\u00020$2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020>H\u0002J\u000e\u0010@\u001a\b\u0012\u0004\u0012\u00020A0\u0017H\u0016J\u0010\u0010B\u001a\u00020$2\u0006\u00109\u001a\u00020:H\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006D"}, mo16641d2 = {"Lcm/aptoide/pt/home/more/appcoins/EarnAppcListFragment;", "Lcm/aptoide/pt/home/more/base/ListAppsFragment;", "Lcm/aptoide/pt/home/bundles/apps/RewardApp;", "Lcm/aptoide/pt/home/more/appcoins/EarnAppcListViewHolder;", "Lcm/aptoide/pt/home/more/appcoins/EarnAppcListView;", "()V", "errorMessageSubscription", "Lrx/Subscription;", "oneDecimalFormatter", "Ljava/text/DecimalFormat;", "presenter", "Lcm/aptoide/pt/home/more/appcoins/EarnAppcListPresenter;", "getPresenter", "()Lcm/aptoide/pt/home/more/appcoins/EarnAppcListPresenter;", "setPresenter", "(Lcm/aptoide/pt/home/more/appcoins/EarnAppcListPresenter;)V", "themeManager", "Lcm/aptoide/pt/themes/ThemeManager;", "getThemeManager", "()Lcm/aptoide/pt/themes/ThemeManager;", "setThemeManager", "(Lcm/aptoide/pt/themes/ThemeManager;)V", "cancelDownload", "Lrx/Observable;", "Ljava/lang/Void;", "createViewHolder", "Lkotlin/Function2;", "Landroid/view/ViewGroup;", "", "getAdapterStrategy", "Lcm/aptoide/aptoideviews/recyclerview/GridRecyclerView$AdaptStrategy;", "getContainerPaddingDp", "Landroid/graphics/Rect;", "getItemSizeHeight", "getItemSizeWidth", "handleDownloadError", "", "downloadState", "Lcm/aptoide/pt/app/DownloadModel$DownloadState;", "hideWalletArea", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "onDestroy", "onViewCreated", "view", "onWalletInstallClick", "pauseDownload", "resumeDownload", "setDownloadState", "progress", "setupWallet", "walletApp", "Lcm/aptoide/pt/promotions/WalletApp;", "showDownloadError", "showErrorDialog", "title", "", "message", "showRootInstallWarningPopup", "", "updateState", "Companion", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.home.more.appcoins.EarnAppcListFragment */
/* compiled from: EarnAppcListFragment.kt */
public final class EarnAppcListFragment extends ListAppsFragment<RewardApp, EarnAppcListViewHolder> implements EarnAppcListView {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private HashMap _$_findViewCache;
    private C5375k errorMessageSubscription;
    private final DecimalFormat oneDecimalFormatter = new DecimalFormat("0.0");
    @Inject
    public EarnAppcListPresenter presenter;
    @Inject
    public ThemeManager themeManager;

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\b"}, mo16641d2 = {"Lcm/aptoide/pt/home/more/appcoins/EarnAppcListFragment$Companion;", "", "()V", "newInstance", "Lcm/aptoide/pt/home/more/appcoins/EarnAppcListFragment;", "title", "", "tag", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
    /* renamed from: cm.aptoide.pt.home.more.appcoins.EarnAppcListFragment$Companion */
    /* compiled from: EarnAppcListFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public final EarnAppcListFragment newInstance(String str, String str2) {
            C10202j.m34178b(str, "title");
            C10202j.m34178b(str2, StoreTabGridRecyclerFragment.BundleCons.TAG);
            EarnAppcListFragment earnAppcListFragment = new EarnAppcListFragment();
            Bundle bundle = new Bundle();
            bundle.putString("title", str);
            bundle.putString(StoreTabGridRecyclerFragment.BundleCons.TAG, str2);
            earnAppcListFragment.setArguments(bundle);
            return earnAppcListFragment;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @C4789l(mo16639bv = {1, 0, 3}, mo16642k = 3, mo16643mv = {1, 1, 16})
    /* renamed from: cm.aptoide.pt.home.more.appcoins.EarnAppcListFragment$WhenMappings */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DownloadModel.DownloadState.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[DownloadModel.DownloadState.ACTIVE.ordinal()] = 1;
            $EnumSwitchMapping$0[DownloadModel.DownloadState.INDETERMINATE.ordinal()] = 2;
            $EnumSwitchMapping$0[DownloadModel.DownloadState.PAUSE.ordinal()] = 3;
            $EnumSwitchMapping$0[DownloadModel.DownloadState.COMPLETE.ordinal()] = 4;
            $EnumSwitchMapping$0[DownloadModel.DownloadState.INSTALLING.ordinal()] = 5;
            $EnumSwitchMapping$0[DownloadModel.DownloadState.ERROR.ordinal()] = 6;
            $EnumSwitchMapping$0[DownloadModel.DownloadState.NOT_ENOUGH_STORAGE_ERROR.ordinal()] = 7;
        }
    }

    private final void handleDownloadError(DownloadModel.DownloadState downloadState) {
        if (downloadState == DownloadModel.DownloadState.ERROR) {
            String string = requireContext().getString(C1086R.string.error_occured);
            C10202j.m34174a((Object) string, "requireContext().getString(R.string.error_occured)");
            showErrorDialog("", string);
        }
    }

    private final void setDownloadState(int i, DownloadModel.DownloadState downloadState) {
        int i2 = i;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1, 4.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1, 2.0f);
        if (downloadState != null) {
            switch (WhenMappings.$EnumSwitchMapping$0[downloadState.ordinal()]) {
                case 1:
                    ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C1086R.C1088id.appview_download_progress_bar);
                    C10202j.m34174a((Object) progressBar, "appview_download_progress_bar");
                    progressBar.setIndeterminate(false);
                    ProgressBar progressBar2 = (ProgressBar) _$_findCachedViewById(C1086R.C1088id.appview_download_progress_bar);
                    C10202j.m34174a((Object) progressBar2, "appview_download_progress_bar");
                    progressBar2.setProgress(i2);
                    TextView textView = (TextView) _$_findCachedViewById(C1086R.C1088id.appview_download_progress_number);
                    C10202j.m34174a((Object) textView, "appview_download_progress_number");
                    StringBuilder sb = new StringBuilder();
                    sb.append(i2);
                    sb.append('%');
                    textView.setText(sb.toString());
                    ImageView imageView = (ImageView) _$_findCachedViewById(C1086R.C1088id.appview_download_pause_download);
                    C10202j.m34174a((Object) imageView, "appview_download_pause_download");
                    imageView.setVisibility(0);
                    ImageView imageView2 = (ImageView) _$_findCachedViewById(C1086R.C1088id.appview_download_cancel_button);
                    C10202j.m34174a((Object) imageView2, "appview_download_cancel_button");
                    imageView2.setVisibility(8);
                    ImageView imageView3 = (ImageView) _$_findCachedViewById(C1086R.C1088id.appview_download_resume_download);
                    C10202j.m34174a((Object) imageView3, "appview_download_resume_download");
                    imageView3.setVisibility(8);
                    LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(C1086R.C1088id.install_controls_layout);
                    C10202j.m34174a((Object) linearLayout, "install_controls_layout");
                    linearLayout.setLayoutParams(layoutParams);
                    TextView textView2 = (TextView) _$_findCachedViewById(C1086R.C1088id.appview_download_download_state);
                    C10202j.m34174a((Object) textView2, "appview_download_download_state");
                    textView2.setText(getString(C1086R.string.appview_short_downloading));
                    return;
                case 2:
                    ProgressBar progressBar3 = (ProgressBar) _$_findCachedViewById(C1086R.C1088id.appview_download_progress_bar);
                    C10202j.m34174a((Object) progressBar3, "appview_download_progress_bar");
                    progressBar3.setIndeterminate(true);
                    ImageView imageView4 = (ImageView) _$_findCachedViewById(C1086R.C1088id.appview_download_pause_download);
                    C10202j.m34174a((Object) imageView4, "appview_download_pause_download");
                    imageView4.setVisibility(0);
                    ImageView imageView5 = (ImageView) _$_findCachedViewById(C1086R.C1088id.appview_download_cancel_button);
                    C10202j.m34174a((Object) imageView5, "appview_download_cancel_button");
                    imageView5.setVisibility(8);
                    ImageView imageView6 = (ImageView) _$_findCachedViewById(C1086R.C1088id.appview_download_resume_download);
                    C10202j.m34174a((Object) imageView6, "appview_download_resume_download");
                    imageView6.setVisibility(8);
                    LinearLayout linearLayout2 = (LinearLayout) _$_findCachedViewById(C1086R.C1088id.install_controls_layout);
                    C10202j.m34174a((Object) linearLayout2, "install_controls_layout");
                    linearLayout2.setLayoutParams(layoutParams);
                    TextView textView3 = (TextView) _$_findCachedViewById(C1086R.C1088id.appview_download_download_state);
                    C10202j.m34174a((Object) textView3, "appview_download_download_state");
                    textView3.setText(getString(C1086R.string.appview_short_downloading));
                    return;
                case 3:
                    ProgressBar progressBar4 = (ProgressBar) _$_findCachedViewById(C1086R.C1088id.appview_download_progress_bar);
                    C10202j.m34174a((Object) progressBar4, "appview_download_progress_bar");
                    progressBar4.setIndeterminate(false);
                    ProgressBar progressBar5 = (ProgressBar) _$_findCachedViewById(C1086R.C1088id.appview_download_progress_bar);
                    C10202j.m34174a((Object) progressBar5, "appview_download_progress_bar");
                    progressBar5.setProgress(i2);
                    TextView textView4 = (TextView) _$_findCachedViewById(C1086R.C1088id.appview_download_progress_number);
                    C10202j.m34174a((Object) textView4, "appview_download_progress_number");
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i2);
                    sb2.append('%');
                    textView4.setText(sb2.toString());
                    ImageView imageView7 = (ImageView) _$_findCachedViewById(C1086R.C1088id.appview_download_pause_download);
                    C10202j.m34174a((Object) imageView7, "appview_download_pause_download");
                    imageView7.setVisibility(8);
                    ImageView imageView8 = (ImageView) _$_findCachedViewById(C1086R.C1088id.appview_download_cancel_button);
                    C10202j.m34174a((Object) imageView8, "appview_download_cancel_button");
                    imageView8.setVisibility(0);
                    ImageView imageView9 = (ImageView) _$_findCachedViewById(C1086R.C1088id.appview_download_resume_download);
                    C10202j.m34174a((Object) imageView9, "appview_download_resume_download");
                    imageView9.setVisibility(0);
                    LinearLayout linearLayout3 = (LinearLayout) _$_findCachedViewById(C1086R.C1088id.install_controls_layout);
                    C10202j.m34174a((Object) linearLayout3, "install_controls_layout");
                    linearLayout3.setLayoutParams(layoutParams2);
                    TextView textView5 = (TextView) _$_findCachedViewById(C1086R.C1088id.appview_download_download_state);
                    C10202j.m34174a((Object) textView5, "appview_download_download_state");
                    textView5.setText(getString(C1086R.string.appview_short_downloading));
                    return;
                case 4:
                    ProgressBar progressBar6 = (ProgressBar) _$_findCachedViewById(C1086R.C1088id.appview_download_progress_bar);
                    C10202j.m34174a((Object) progressBar6, "appview_download_progress_bar");
                    progressBar6.setIndeterminate(true);
                    ImageView imageView10 = (ImageView) _$_findCachedViewById(C1086R.C1088id.appview_download_pause_download);
                    C10202j.m34174a((Object) imageView10, "appview_download_pause_download");
                    imageView10.setVisibility(0);
                    ImageView imageView11 = (ImageView) _$_findCachedViewById(C1086R.C1088id.appview_download_cancel_button);
                    C10202j.m34174a((Object) imageView11, "appview_download_cancel_button");
                    imageView11.setVisibility(8);
                    ImageView imageView12 = (ImageView) _$_findCachedViewById(C1086R.C1088id.appview_download_resume_download);
                    C10202j.m34174a((Object) imageView12, "appview_download_resume_download");
                    imageView12.setVisibility(8);
                    LinearLayout linearLayout4 = (LinearLayout) _$_findCachedViewById(C1086R.C1088id.install_controls_layout);
                    C10202j.m34174a((Object) linearLayout4, "install_controls_layout");
                    linearLayout4.setLayoutParams(layoutParams);
                    TextView textView6 = (TextView) _$_findCachedViewById(C1086R.C1088id.appview_download_download_state);
                    C10202j.m34174a((Object) textView6, "appview_download_download_state");
                    textView6.setText(getString(C1086R.string.appview_short_downloading));
                    return;
                case 5:
                    ProgressBar progressBar7 = (ProgressBar) _$_findCachedViewById(C1086R.C1088id.appview_download_progress_bar);
                    C10202j.m34174a((Object) progressBar7, "appview_download_progress_bar");
                    progressBar7.setIndeterminate(true);
                    ImageView imageView13 = (ImageView) _$_findCachedViewById(C1086R.C1088id.appview_download_pause_download);
                    C10202j.m34174a((Object) imageView13, "appview_download_pause_download");
                    imageView13.setVisibility(8);
                    ImageView imageView14 = (ImageView) _$_findCachedViewById(C1086R.C1088id.appview_download_cancel_button);
                    C10202j.m34174a((Object) imageView14, "appview_download_cancel_button");
                    imageView14.setVisibility(8);
                    ImageView imageView15 = (ImageView) _$_findCachedViewById(C1086R.C1088id.appview_download_resume_download);
                    C10202j.m34174a((Object) imageView15, "appview_download_resume_download");
                    imageView15.setVisibility(8);
                    LinearLayout linearLayout5 = (LinearLayout) _$_findCachedViewById(C1086R.C1088id.install_controls_layout);
                    C10202j.m34174a((Object) linearLayout5, "install_controls_layout");
                    linearLayout5.setLayoutParams(layoutParams2);
                    TextView textView7 = (TextView) _$_findCachedViewById(C1086R.C1088id.appview_download_download_state);
                    C10202j.m34174a((Object) textView7, "appview_download_download_state");
                    textView7.setText(getString(C1086R.string.appview_short_installing));
                    return;
                case 6:
                    String string = requireContext().getString(C1086R.string.error_occured);
                    C10202j.m34174a((Object) string, "requireContext().getString(R.string.error_occured)");
                    showErrorDialog("", string);
                    return;
                case 7:
                    String string2 = requireContext().getString(C1086R.string.out_of_space_dialog_title);
                    C10202j.m34174a((Object) string2, "requireContext().getStri…ut_of_space_dialog_title)");
                    String string3 = requireContext().getString(C1086R.string.out_of_space_dialog_message);
                    C10202j.m34174a((Object) string3, "requireContext().getStri…_of_space_dialog_message)");
                    showErrorDialog(string2, string3);
                    return;
                default:
                    return;
            }
        }
    }

    private final void showErrorDialog(String str, String str2) {
        Context context = getContext();
        ThemeManager themeManager2 = this.themeManager;
        if (themeManager2 != null) {
            this.errorMessageSubscription = GenericDialogs.createGenericOkMessage(context, str, str2, themeManager2.getAttributeForTheme(C1086R.attr.dialogsTheme).resourceId).mo18662b(C5376a.m10346b()).mo18655a(EarnAppcListFragment$showErrorDialog$1.INSTANCE, (C5378b<Throwable>) EarnAppcListFragment$showErrorDialog$2.INSTANCE);
        } else {
            C10202j.m34181d("themeManager");
            throw null;
        }
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
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public C5368e<Void> cancelDownload() {
        C5368e<Void> a = C10695a.m36221a((ImageView) _$_findCachedViewById(C1086R.C1088id.appview_download_cancel_button));
        C10202j.m34174a((Object) a, "RxView.clicks(appview_download_cancel_button)");
        return a;
    }

    public C9117p<ViewGroup, Integer, EarnAppcListViewHolder> createViewHolder() {
        return EarnAppcListFragment$createViewHolder$1.INSTANCE;
    }

    public GridRecyclerView.AdaptStrategy getAdapterStrategy() {
        return GridRecyclerView.AdaptStrategy.SCALE_KEEP_ASPECT_RATIO;
    }

    /* access modifiers changed from: protected */
    public Rect getContainerPaddingDp() {
        return new Rect(8, 8, 8, 118);
    }

    public int getItemSizeHeight() {
        return 158;
    }

    public int getItemSizeWidth() {
        return 168;
    }

    public final EarnAppcListPresenter getPresenter() {
        EarnAppcListPresenter earnAppcListPresenter = this.presenter;
        if (earnAppcListPresenter != null) {
            return earnAppcListPresenter;
        }
        C10202j.m34181d("presenter");
        throw null;
    }

    public final ThemeManager getThemeManager() {
        ThemeManager themeManager2 = this.themeManager;
        if (themeManager2 != null) {
            return themeManager2;
        }
        C10202j.m34181d("themeManager");
        throw null;
    }

    public void hideWalletArea() {
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), C1086R.anim.slide_down);
        C10202j.m34174a((Object) loadAnimation, "animation");
        loadAnimation.setFillAfter(true);
        ((RelativeLayout) _$_findCachedViewById(C1086R.C1088id.app_cardview_layout)).startAnimation(loadAnimation);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getFragmentComponent(bundle).inject(this);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C10202j.m34178b(layoutInflater, "inflater");
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        if (onCreateView != null) {
            ViewGroup viewGroup2 = (ViewGroup) onCreateView;
            layoutInflater.inflate(C1086R.layout.earn_appcoins_wallet_install_layout, viewGroup2);
            return viewGroup2;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    public void onDestroy() {
        C5375k kVar = this.errorMessageSubscription;
        if (kVar != null && !kVar.isUnsubscribed()) {
            kVar.unsubscribe();
        }
        super.onDestroy();
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C10202j.m34178b(view, "view");
        super.onViewCreated(view, bundle);
        EarnAppcListPresenter earnAppcListPresenter = this.presenter;
        if (earnAppcListPresenter != null) {
            earnAppcListPresenter.present();
        } else {
            C10202j.m34181d("presenter");
            throw null;
        }
    }

    public C5368e<Void> onWalletInstallClick() {
        C5368e<Void> a = C10695a.m36221a((Button) _$_findCachedViewById(C1086R.C1088id.wallet_install_button));
        C10202j.m34174a((Object) a, "RxView.clicks(wallet_install_button)");
        return a;
    }

    public C5368e<Void> pauseDownload() {
        C5368e<Void> a = C10695a.m36221a((ImageView) _$_findCachedViewById(C1086R.C1088id.appview_download_pause_download));
        C10202j.m34174a((Object) a, "RxView.clicks(appview_download_pause_download)");
        return a;
    }

    public C5368e<Void> resumeDownload() {
        C5368e<Void> a = C10695a.m36221a((ImageView) _$_findCachedViewById(C1086R.C1088id.appview_download_resume_download));
        C10202j.m34174a((Object) a, "RxView.clicks(appview_download_resume_download)");
        return a;
    }

    public final void setPresenter(EarnAppcListPresenter earnAppcListPresenter) {
        C10202j.m34178b(earnAppcListPresenter, "<set-?>");
        this.presenter = earnAppcListPresenter;
    }

    public final void setThemeManager(ThemeManager themeManager2) {
        C10202j.m34178b(themeManager2, "<set-?>");
        this.themeManager = themeManager2;
    }

    public void setupWallet(WalletApp walletApp) {
        C10202j.m34178b(walletApp, "walletApp");
        if (!walletApp.isInstalled()) {
            ((RelativeLayout) _$_findCachedViewById(C1086R.C1088id.app_cardview_layout)).startAnimation(AnimationUtils.loadAnimation(getContext(), C1086R.anim.slide_up));
            RelativeLayout relativeLayout = (RelativeLayout) _$_findCachedViewById(C1086R.C1088id.app_cardview_layout);
            C10202j.m34174a((Object) relativeLayout, "app_cardview_layout");
            relativeLayout.setVisibility(0);
            TextView textView = (TextView) _$_findCachedViewById(C1086R.C1088id.wallet_app_title_textview);
            C10202j.m34174a((Object) textView, "wallet_app_title_textview");
            textView.setText(walletApp.getAppName());
            TextView textView2 = (TextView) _$_findCachedViewById(C1086R.C1088id.rating_label);
            C10202j.m34174a((Object) textView2, "rating_label");
            textView2.setText(this.oneDecimalFormatter.format(Float.valueOf(walletApp.getRating())));
        }
    }

    public void showDownloadError(WalletApp walletApp) {
        C10202j.m34178b(walletApp, "walletApp");
        DownloadModel downloadModel = walletApp.getDownloadModel();
        if (downloadModel != null && downloadModel.hasError()) {
            handleDownloadError(downloadModel.getDownloadState());
        }
    }

    public C5368e<Boolean> showRootInstallWarningPopup() {
        Context requireContext = requireContext();
        String string = getResources().getString(C1086R.string.root_access_dialog);
        ThemeManager themeManager2 = this.themeManager;
        if (themeManager2 != null) {
            C5368e<R> j = GenericDialogs.createGenericYesNoCancelMessage(requireContext, (String) null, string, themeManager2.getAttributeForTheme(C1086R.attr.dialogsTheme).resourceId).mo18694j(EarnAppcListFragment$showRootInstallWarningPopup$1.INSTANCE);
            C10202j.m34174a((Object) j, "GenericDialogs.createGen…cDialogs.EResponse.YES) }");
            return j;
        }
        C10202j.m34181d("themeManager");
        throw null;
    }

    public void updateState(WalletApp walletApp) {
        C10202j.m34178b(walletApp, "walletApp");
        DownloadModel downloadModel = walletApp.getDownloadModel();
        if (downloadModel == null) {
            return;
        }
        if (downloadModel.isDownloadingOrInstalling()) {
            LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(C1086R.C1088id.appview_transfer_info);
            C10202j.m34174a((Object) linearLayout, "appview_transfer_info");
            linearLayout.setVisibility(0);
            Group group = (Group) _$_findCachedViewById(C1086R.C1088id.install_group);
            C10202j.m34174a((Object) group, "install_group");
            group.setVisibility(8);
            setDownloadState(downloadModel.getProgress(), downloadModel.getDownloadState());
        } else if (!walletApp.isInstalled()) {
            LinearLayout linearLayout2 = (LinearLayout) _$_findCachedViewById(C1086R.C1088id.appview_transfer_info);
            C10202j.m34174a((Object) linearLayout2, "appview_transfer_info");
            linearLayout2.setVisibility(8);
            Group group2 = (Group) _$_findCachedViewById(C1086R.C1088id.install_group);
            C10202j.m34174a((Object) group2, "install_group");
            group2.setVisibility(0);
        }
    }
}
