package p015cm.aptoide.p016pt.app.view;

import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.TransitionDrawable;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Pair;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.C0069a;
import androidx.appcompat.app.C0074c;
import androidx.appcompat.app.C0076d;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.C0394a;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.snackbar.Snackbar;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.inject.Inject;
import javax.inject.Named;
import okhttp3.OkHttpClient;
import p015cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import p015cm.aptoide.aptoideviews.appcoins.BonusAppcView;
import p015cm.aptoide.aptoideviews.errors.ErrorView;
import p015cm.aptoide.p016pt.AptoideApplication;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.ads.AdsRepository;
import p015cm.aptoide.p016pt.ads.MinimalAdMapper;
import p015cm.aptoide.p016pt.app.AppModel;
import p015cm.aptoide.p016pt.app.AppReview;
import p015cm.aptoide.p016pt.app.DownloadModel;
import p015cm.aptoide.p016pt.app.ReviewsViewModel;
import p015cm.aptoide.p016pt.app.view.PromotionEvent;
import p015cm.aptoide.p016pt.app.view.donations.DonationsAdapter;
import p015cm.aptoide.p016pt.app.view.screenshots.ScreenShotClickEvent;
import p015cm.aptoide.p016pt.app.view.screenshots.ScreenshotsAdapter;
import p015cm.aptoide.p016pt.app.view.similar.SimilarAppClickEvent;
import p015cm.aptoide.p016pt.app.view.similar.SimilarAppsBundle;
import p015cm.aptoide.p016pt.app.view.similar.SimilarAppsBundleAdapter;
import p015cm.aptoide.p016pt.bonus.BonusAppcModel;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.database.RoomStoredMinimalAdPersistence;
import p015cm.aptoide.p016pt.dataprovider.WebService;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Malware;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.Store;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store.StoreContext;
import p015cm.aptoide.p016pt.donations.Donation;
import p015cm.aptoide.p016pt.home.SnapToStartHelper;
import p015cm.aptoide.p016pt.install.view.remote.RemoteInstallDialog;
import p015cm.aptoide.p016pt.networking.image.ImageLoader;
import p015cm.aptoide.p016pt.permission.DialogPermissions;
import p015cm.aptoide.p016pt.promotions.Promotion;
import p015cm.aptoide.p016pt.promotions.WalletApp;
import p015cm.aptoide.p016pt.reviews.LanguageFilterHelper;
import p015cm.aptoide.p016pt.search.model.SearchAdResult;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p015cm.aptoide.p016pt.util.AppUtils;
import p015cm.aptoide.p016pt.util.ReferrerUtils;
import p015cm.aptoide.p016pt.utils.AptoideUtils;
import p015cm.aptoide.p016pt.utils.GenericDialogs;
import p015cm.aptoide.p016pt.utils.p030q.QManager;
import p015cm.aptoide.p016pt.view.app.AppDeveloper;
import p015cm.aptoide.p016pt.view.app.AppFlags;
import p015cm.aptoide.p016pt.view.app.AppMedia;
import p015cm.aptoide.p016pt.view.app.DetailedAppRequestResult;
import p015cm.aptoide.p016pt.view.app.FlagsVote;
import p015cm.aptoide.p016pt.view.dialog.DialogBadgeV7;
import p015cm.aptoide.p016pt.view.dialog.DialogUtils;
import p015cm.aptoide.p016pt.view.fragment.NavigationTrackFragment;
import p015cm.aptoide.p016pt.view.recycler.LinearLayoutManagerWithSmoothScroller;
import p112n.p118g.p301a.p303b.p306b.p307a.C10676b;
import p112n.p118g.p301a.p303b.p308c.p309a.C10687e;
import p112n.p118g.p301a.p310c.C10695a;
import p112n.p118g.p301a.p310c.C10706f;
import p123rx.C12475j;
import p123rx.C5368e;
import p123rx.C5375k;
import p123rx.exceptions.OnErrorNotImplementedException;
import p123rx.p124l.p125c.C5376a;
import p123rx.p126m.C5378b;
import p123rx.p127s.C12871b;
import p123rx.p128t.C12889e;
import retrofit2.Converter;

/* renamed from: cm.aptoide.pt.app.view.AppViewFragment */
public class AppViewFragment extends NavigationTrackFragment implements AppViewView {
    private static final int APPC_TRANSITION_MS = 1000;
    private static final String BADGE_DIALOG_TAG = "badgeDialog";
    private static final String KEY_SCROLL_Y = "y";
    private DownloadModel.Action action;
    private C0069a actionBar;
    private AdsRepository adsRepository;
    private C12871b<String> apkfyDialogConfirmSubject;
    private View apkfyElement;
    private ImageView appIcon;
    private TextView appName;
    private View appcInfoView;
    private View appcMigrationWarningMessage;
    private View appview;
    private ViewStub appviewInstall;
    private TextView avgReviewScore;
    private RatingBar avgReviewScoreBar;
    private BonusAppcView bonusAppcView;
    private boolean bumpedUp;
    private C12871b<Void> cancelClickSubject;
    private ImageView cancelDownload;
    private ImageView cancelWalletDownload;
    private View catappultCard;
    private View collapsingAppcBackground;
    private CollapsingToolbarLayout collapsingToolbarLayout;
    private Converter.Factory converterFactory;
    private Button descriptionReadMore;
    private TextView descriptionText;
    @Inject
    DialogUtils dialogUtils;
    private DonationsAdapter donationsAdapter;
    private View donationsElement;
    private RecyclerView donationsList;
    private View donationsListEmptyState;
    private View donationsListLayout;
    private ProgressBar donationsProgress;
    private View downloadControlsLayout;
    private LinearLayout downloadInfoLayout;
    private ProgressBar downloadProgressBar;
    private TextView downloadProgressValue;
    private ProgressBar downloadWalletProgressBar;
    private TextView downloadWalletProgressValue;
    private TextView downloadsTop;
    private TextView eSkillsInAppMessage;
    private View eSkillsView;
    private TextView emptyReviewTextView;
    private View emptyReviewsLayout;
    private C5375k errorMessageSubscription;
    private ErrorView errorView;
    private View fakeAppLayout;
    private TextView fakeAppText;
    private View flagThisAppSection;
    private View flagsLayoutWrapper;
    private View goodAppLayoutWrapper;
    private OkHttpClient httpClient;
    private View iabInfo;
    private ImageView iconSizeInfo;
    private View infoEmail;
    private View infoPermissions;
    private View infoPrivacy;
    private View infoWebsite;
    private Button install;
    private C12871b<DownloadModel.Action> installClickSubject;
    private TextView installStateText;
    private TextView latestVersion;
    private TextView latestVersionTitle;
    private Button listDonateButton;
    private C12871b<Void> loginSnackClick;
    @Inject
    @Named
    String marketName;
    private Menu menu;
    private TextView needsLicenceText;
    private View needsLicenseLayout;
    @Inject
    @Named
    DecimalFormat oneDecimalFormat;
    private TextView otherVersions;
    private View otherVersionsTopSeparator;
    private C12871b<Void> pauseClickSubject;
    private ImageView pauseDownload;
    private ImageView pauseWalletDownload;
    private View poaBudgetElement;
    private TextView poaBudgetMessage;
    private ImageView poaCoinsIcon;
    /* access modifiers changed from: private */
    public TextView poaCountdownHours;
    private View poaCountdownMessage;
    /* access modifiers changed from: private */
    public TextView poaCountdownMinutes;
    /* access modifiers changed from: private */
    public TextView poaCountdownSeconds;
    private CountDownTimer poaCountdownTimer;
    private DecimalFormat poaFiatDecimalFormat;
    private View poaIabInfo;
    private ViewStub poaInstall;
    private TextView poaOfferValue;
    @Inject
    AppViewPresenter presenter;
    private C12871b<PromotionEvent> promotionAppClick;
    private View promotionView;
    private QManager qManager;
    private Button rateAppButton;
    private Button rateAppButtonLarge;
    private TextView ratingInfo;
    private View ratingLayout;
    private C12871b<ReadMoreClickEvent> readMoreClick;
    private C12871b<DownloadModel.Action> resumeClickSubject;
    private ImageView resumeDownload;
    private ImageView resumeWalletDownload;
    private TextView reviewUsers;
    private TopReviewsAdapter reviewsAdapter;
    private C12871b<Integer> reviewsAutoScroll;
    private View reviewsLayout;
    private RecyclerView reviewsView;
    private TextView rewardAppLatestVersion;
    @Inject
    RoomStoredMinimalAdPersistence roomStoredMinimalAdPersistence;
    private C12871b<ScreenShotClickEvent> screenShotClick;
    private RecyclerView screenshots;
    private ScreenshotsAdapter screenshotsAdapter;
    private NestedScrollView scrollView;
    private int scrollViewY;
    private Button showAllReviewsButton;
    private C12871b<SimilarAppClickEvent> similarAppClick;
    private C12871b<Boolean> similarAppsVisibilitySubject;
    private View similarBottomPlaceholder;
    private View similarDownloadPlaceholder;
    private SimilarAppsBundleAdapter similarListAdapter;
    private RecyclerView similarListRecyclerView;
    private TextView sizeInfo;
    private TextView storeDownloads;
    private Button storeFollow;
    private TextView storeFollowers;
    private ImageView storeIcon;
    private View storeLayout;
    private TextView storeName;
    @Inject
    ThemeManager themeManager;
    private Toolbar toolbar;
    private View topReviewsLayout;
    private ContentLoadingProgressBar topReviewsProgress;
    private ImageView trustedBadge;
    private View trustedLayout;
    private TextView trustedText;
    private View versionsLayout;
    private ProgressBar viewProgress;
    private View virusLayout;
    private TextView virusText;
    private View walletDownloadControlsLayout;
    private View walletPromotionButtonsLayout;
    private Button walletPromotionCancelButton;
    private Button walletPromotionClaimButton;
    private View walletPromotionClaimLayout;
    private Button walletPromotionDownloadButton;
    private View walletPromotionDownloadLayout;
    private ImageView walletPromotionIcon;
    private Button walletPromotionInstallDisableButton;
    private View walletPromotionInstallDisableLayout;
    private TextView walletPromotionMessage;
    private TextView walletPromotionTitle;
    private View workingWellLayout;
    private TextView workingWellText;

    /* renamed from: cm.aptoide.pt.app.view.AppViewFragment$2 */
    static /* synthetic */ class C14352 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action;
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState;
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Malware$Rank;
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$view$app$DetailedAppRequestResult$Error;
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$view$app$FlagsVote$VoteType;

        /* JADX WARNING: Can't wrap try/catch for region: R(48:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|31|32|33|34|35|36|37|38|39|40|41|42|43|45|46|47|48|49|50|51|52|53|54|55|57|58|(3:59|60|62)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(50:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|31|32|33|34|35|36|37|38|39|40|41|42|43|45|46|47|48|49|50|51|52|53|54|55|57|58|59|60|62) */
        /* JADX WARNING: Can't wrap try/catch for region: R(52:0|(2:1|2)|3|5|6|7|9|10|11|(2:13|14)|15|17|18|19|21|22|23|24|25|26|27|28|29|31|32|33|34|35|36|37|38|39|40|41|42|43|45|46|47|48|49|50|51|52|53|54|55|57|58|59|60|62) */
        /* JADX WARNING: Can't wrap try/catch for region: R(54:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|24|25|26|27|28|29|31|32|33|34|35|36|37|38|39|40|41|42|43|45|46|47|48|49|50|51|52|53|54|55|57|58|59|60|62) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0063 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x007e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0088 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0092 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00a6 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00c2 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00d6 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00e0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00fb */
        static {
            /*
                cm.aptoide.pt.app.DownloadModel$Action[] r0 = p015cm.aptoide.p016pt.app.DownloadModel.Action.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action = r0
                r1 = 1
                cm.aptoide.pt.app.DownloadModel$Action r2 = p015cm.aptoide.p016pt.app.DownloadModel.Action.UPDATE     // Catch:{ NoSuchFieldError -> 0x0012 }
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
                cm.aptoide.pt.app.DownloadModel$Action r5 = p015cm.aptoide.p016pt.app.DownloadModel.Action.DOWNGRADE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action     // Catch:{ NoSuchFieldError -> 0x003e }
                cm.aptoide.pt.app.DownloadModel$Action r6 = p015cm.aptoide.p016pt.app.DownloadModel.Action.MIGRATE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                cm.aptoide.pt.dataprovider.model.v7.Malware$Rank[] r5 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Malware.Rank.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Malware$Rank = r5
                cm.aptoide.pt.dataprovider.model.v7.Malware$Rank r6 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Malware.Rank.TRUSTED     // Catch:{ NoSuchFieldError -> 0x004f }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x004f }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x004f }
            L_0x004f:
                int[] r5 = $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Malware$Rank     // Catch:{ NoSuchFieldError -> 0x0059 }
                cm.aptoide.pt.dataprovider.model.v7.Malware$Rank r6 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Malware.Rank.WARNING     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r5[r6] = r0     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                int[] r5 = $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Malware$Rank     // Catch:{ NoSuchFieldError -> 0x0063 }
                cm.aptoide.pt.dataprovider.model.v7.Malware$Rank r6 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Malware.Rank.CRITICAL     // Catch:{ NoSuchFieldError -> 0x0063 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0063 }
                r5[r6] = r2     // Catch:{ NoSuchFieldError -> 0x0063 }
            L_0x0063:
                int[] r5 = $SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Malware$Rank     // Catch:{ NoSuchFieldError -> 0x006d }
                cm.aptoide.pt.dataprovider.model.v7.Malware$Rank r6 = p015cm.aptoide.p016pt.dataprovider.model.p020v7.Malware.Rank.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x006d }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r5[r6] = r3     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                cm.aptoide.pt.app.DownloadModel$DownloadState[] r5 = p015cm.aptoide.p016pt.app.DownloadModel.DownloadState.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                $SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState = r5
                cm.aptoide.pt.app.DownloadModel$DownloadState r6 = p015cm.aptoide.p016pt.app.DownloadModel.DownloadState.ACTIVE     // Catch:{ NoSuchFieldError -> 0x007e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x007e }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x007e }
            L_0x007e:
                int[] r5 = $SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState     // Catch:{ NoSuchFieldError -> 0x0088 }
                cm.aptoide.pt.app.DownloadModel$DownloadState r6 = p015cm.aptoide.p016pt.app.DownloadModel.DownloadState.INDETERMINATE     // Catch:{ NoSuchFieldError -> 0x0088 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0088 }
                r5[r6] = r0     // Catch:{ NoSuchFieldError -> 0x0088 }
            L_0x0088:
                int[] r5 = $SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState     // Catch:{ NoSuchFieldError -> 0x0092 }
                cm.aptoide.pt.app.DownloadModel$DownloadState r6 = p015cm.aptoide.p016pt.app.DownloadModel.DownloadState.PAUSE     // Catch:{ NoSuchFieldError -> 0x0092 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0092 }
                r5[r6] = r2     // Catch:{ NoSuchFieldError -> 0x0092 }
            L_0x0092:
                int[] r5 = $SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState     // Catch:{ NoSuchFieldError -> 0x009c }
                cm.aptoide.pt.app.DownloadModel$DownloadState r6 = p015cm.aptoide.p016pt.app.DownloadModel.DownloadState.COMPLETE     // Catch:{ NoSuchFieldError -> 0x009c }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r5[r6] = r3     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r5 = $SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState     // Catch:{ NoSuchFieldError -> 0x00a6 }
                cm.aptoide.pt.app.DownloadModel$DownloadState r6 = p015cm.aptoide.p016pt.app.DownloadModel.DownloadState.ERROR     // Catch:{ NoSuchFieldError -> 0x00a6 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a6 }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x00a6 }
            L_0x00a6:
                int[] r5 = $SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState     // Catch:{ NoSuchFieldError -> 0x00b1 }
                cm.aptoide.pt.app.DownloadModel$DownloadState r6 = p015cm.aptoide.p016pt.app.DownloadModel.DownloadState.INSTALLING     // Catch:{ NoSuchFieldError -> 0x00b1 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b1 }
                r7 = 6
                r5[r6] = r7     // Catch:{ NoSuchFieldError -> 0x00b1 }
            L_0x00b1:
                cm.aptoide.pt.view.app.FlagsVote$VoteType[] r5 = p015cm.aptoide.p016pt.view.app.FlagsVote.VoteType.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                $SwitchMap$cm$aptoide$pt$view$app$FlagsVote$VoteType = r5
                cm.aptoide.pt.view.app.FlagsVote$VoteType r6 = p015cm.aptoide.p016pt.view.app.FlagsVote.VoteType.GOOD     // Catch:{ NoSuchFieldError -> 0x00c2 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c2 }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x00c2 }
            L_0x00c2:
                int[] r5 = $SwitchMap$cm$aptoide$pt$view$app$FlagsVote$VoteType     // Catch:{ NoSuchFieldError -> 0x00cc }
                cm.aptoide.pt.view.app.FlagsVote$VoteType r6 = p015cm.aptoide.p016pt.view.app.FlagsVote.VoteType.LICENSE     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r5[r6] = r0     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r5 = $SwitchMap$cm$aptoide$pt$view$app$FlagsVote$VoteType     // Catch:{ NoSuchFieldError -> 0x00d6 }
                cm.aptoide.pt.view.app.FlagsVote$VoteType r6 = p015cm.aptoide.p016pt.view.app.FlagsVote.VoteType.FAKE     // Catch:{ NoSuchFieldError -> 0x00d6 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d6 }
                r5[r6] = r2     // Catch:{ NoSuchFieldError -> 0x00d6 }
            L_0x00d6:
                int[] r2 = $SwitchMap$cm$aptoide$pt$view$app$FlagsVote$VoteType     // Catch:{ NoSuchFieldError -> 0x00e0 }
                cm.aptoide.pt.view.app.FlagsVote$VoteType r5 = p015cm.aptoide.p016pt.view.app.FlagsVote.VoteType.VIRUS     // Catch:{ NoSuchFieldError -> 0x00e0 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e0 }
                r2[r5] = r3     // Catch:{ NoSuchFieldError -> 0x00e0 }
            L_0x00e0:
                int[] r2 = $SwitchMap$cm$aptoide$pt$view$app$FlagsVote$VoteType     // Catch:{ NoSuchFieldError -> 0x00ea }
                cm.aptoide.pt.view.app.FlagsVote$VoteType r3 = p015cm.aptoide.p016pt.view.app.FlagsVote.VoteType.FREEZE     // Catch:{ NoSuchFieldError -> 0x00ea }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ea }
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x00ea }
            L_0x00ea:
                cm.aptoide.pt.view.app.DetailedAppRequestResult$Error[] r2 = p015cm.aptoide.p016pt.view.app.DetailedAppRequestResult.Error.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                $SwitchMap$cm$aptoide$pt$view$app$DetailedAppRequestResult$Error = r2
                cm.aptoide.pt.view.app.DetailedAppRequestResult$Error r3 = p015cm.aptoide.p016pt.view.app.DetailedAppRequestResult.Error.NETWORK     // Catch:{ NoSuchFieldError -> 0x00fb }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fb }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x00fb }
            L_0x00fb:
                int[] r1 = $SwitchMap$cm$aptoide$pt$view$app$DetailedAppRequestResult$Error     // Catch:{ NoSuchFieldError -> 0x0105 }
                cm.aptoide.pt.view.app.DetailedAppRequestResult$Error r2 = p015cm.aptoide.p016pt.view.app.DetailedAppRequestResult.Error.GENERIC     // Catch:{ NoSuchFieldError -> 0x0105 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0105 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0105 }
            L_0x0105:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.app.view.AppViewFragment.C14352.<clinit>():void");
        }
    }

    /* renamed from: cm.aptoide.pt.app.view.AppViewFragment$BundleKeys */
    public enum BundleKeys {
        APP_ID,
        STORE_NAME,
        STORE_THEME,
        MINIMAL_AD,
        PACKAGE_NAME,
        SHOULD_INSTALL,
        MD5,
        UNAME,
        DOWNLOAD_CONVERSION_URL,
        APPC,
        EDITORS_CHOICE_POSITION,
        ORIGIN_TAG,
        OEM_ID,
        ESKILLS
    }

    /* renamed from: cm.aptoide.pt.app.view.AppViewFragment$OpenType */
    public enum OpenType {
        OPEN_ONLY,
        OPEN_AND_INSTALL,
        OPEN_WITH_INSTALL_POPUP,
        APK_FY_INSTALL_POPUP
    }

    private void applyCount(FlagsVote.VoteType voteType, int i) {
        String num = Integer.toString(i);
        int i2 = C14352.$SwitchMap$cm$aptoide$pt$view$app$FlagsVote$VoteType[voteType.ordinal()];
        if (i2 == 1) {
            this.workingWellText.setText(NumberFormat.getIntegerInstance().format(Double.parseDouble(num)));
        } else if (i2 == 2) {
            this.needsLicenceText.setText(NumberFormat.getIntegerInstance().format(Double.parseDouble(num)));
        } else if (i2 == 3) {
            this.fakeAppText.setText(NumberFormat.getIntegerInstance().format(Double.parseDouble(num)));
        } else if (i2 == 4) {
            this.virusText.setText(NumberFormat.getIntegerInstance().format(Double.parseDouble(num)));
        } else if (i2 != 5) {
            throw new IllegalArgumentException("Unable to find Type " + voteType.name());
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m4610b(GenericDialogs.EResponse eResponse) {
    }

    private C5368e<GenericDialogs.EResponse> createCustomDialogForApkfy(String str, double d, float f, String str2, int i) {
        return C5368e.m10241a(new C1609i0(this, str, f, d, i, str2));
    }

    /* renamed from: d */
    static /* synthetic */ Void m4616d(GenericDialogs.EResponse eResponse) {
        return null;
    }

    /* renamed from: f */
    static /* synthetic */ Void m4621f(GenericDialogs.EResponse eResponse) {
        return null;
    }

    private SpannableString formatAppCoinsRewardMessage(String str) {
        SpannableString spannableString;
        String str2;
        if (!str.equals("-1.0")) {
            str2 = getResources().getString(C1086R.string.appc_message_appview_appcoins_reward_with_value, new Object[]{str, "AppCoins Credits"});
            spannableString = new SpannableString(str2);
            spannableString.setSpan(new ForegroundColorSpan(getResources().getColor(C1086R.color.default_orange_gradient_end)), str2.indexOf(str), str2.indexOf(str) + str.length(), 33);
        } else {
            str2 = getResources().getString(C1086R.string.appc_message_appview_appcoins_reward, new Object[]{"AppCoins Credits"});
            spannableString = new SpannableString(str2);
        }
        spannableString.setSpan(new ForegroundColorSpan(getResources().getColor(C1086R.color.default_orange_gradient_end)), str2.indexOf("AppCoins Credits"), str2.indexOf("AppCoins Credits") + 16, 33);
        return spannableString;
    }

    /* renamed from: g */
    static /* synthetic */ Boolean m4622g(PromotionEvent promotionEvent) {
        return Boolean.valueOf(promotionEvent.getClickType() == PromotionEvent.ClickType.UPDATE || promotionEvent.getClickType() == PromotionEvent.ClickType.INSTALL_APP || promotionEvent.getClickType() == PromotionEvent.ClickType.DOWNLOAD || promotionEvent.getClickType() == PromotionEvent.ClickType.DOWNGRADE);
    }

    private int getPromotionMessage(DownloadModel downloadModel) {
        return (downloadModel.getAction().equals(DownloadModel.Action.MIGRATE) || downloadModel.getAction().equals(DownloadModel.Action.UPDATE)) ? C1086R.string.wallet_promotion_wallet_installed_update_message : C1086R.string.wallet_promotion_wallet_notinstalled_message;
    }

    /* renamed from: h */
    static /* synthetic */ void m4625h(GenericDialogs.EResponse eResponse) {
    }

    private void handleDownloadError(DownloadModel.DownloadState downloadState) {
        if (downloadState == DownloadModel.DownloadState.ERROR) {
            showGenericErrorDialog();
            return;
        }
        throw new IllegalStateException("Invalid Download State " + downloadState);
    }

    /* renamed from: i */
    static /* synthetic */ Boolean m4626i(PromotionEvent promotionEvent) {
        return Boolean.valueOf(promotionEvent.getClickType() == PromotionEvent.ClickType.PAUSE_DOWNLOAD);
    }

    /* renamed from: k */
    static /* synthetic */ Boolean m4628k(PromotionEvent promotionEvent) {
        return Boolean.valueOf(promotionEvent.getClickType() == PromotionEvent.ClickType.RESUME_DOWNLOAD);
    }

    private void manageSimilarAppsVisibility(boolean z, boolean z2) {
        if (!this.bumpedUp) {
            if (z2) {
                this.bumpedUp = true;
            }
            if (!z) {
                hideSimilarApps();
                return;
            }
            this.similarListRecyclerView.setVisibility(0);
            LinearLayout linearLayout = (LinearLayout) this.similarListRecyclerView.getParent();
            if (z2) {
                linearLayout.removeView(this.similarListRecyclerView);
                LinearLayout linearLayout2 = (LinearLayout) this.similarDownloadPlaceholder.getParent();
                linearLayout2.addView(this.similarListRecyclerView, linearLayout2.indexOfChild(this.similarDownloadPlaceholder));
                this.similarAppsVisibilitySubject.onNext(true);
                return;
            }
            linearLayout.removeView(this.similarListRecyclerView);
            LinearLayout linearLayout3 = (LinearLayout) this.similarBottomPlaceholder.getParent();
            linearLayout3.addView(this.similarListRecyclerView, linearLayout3.indexOfChild(this.similarBottomPlaceholder));
        }
    }

    private void setAppFlags(boolean z, AppFlags appFlags) {
        if (z) {
            this.goodAppLayoutWrapper.setVisibility(0);
            this.flagsLayoutWrapper.setVisibility(8);
            return;
        }
        this.goodAppLayoutWrapper.setVisibility(8);
        this.flagsLayoutWrapper.setVisibility(0);
        setFlagValues(appFlags);
    }

    private void setButtonText(DownloadModel downloadModel) {
        int i = C14352.$SwitchMap$cm$aptoide$pt$app$DownloadModel$Action[downloadModel.getAction().ordinal()];
        if (i == 1) {
            this.install.setText(getResources().getString(C1086R.string.appview_button_update));
        } else if (i == 2) {
            this.install.setText(getResources().getString(C1086R.string.appview_button_install));
        } else if (i == 3) {
            this.install.setText(getResources().getString(C1086R.string.appview_button_open));
        } else if (i == 4) {
            this.install.setText(getResources().getString(C1086R.string.appview_button_downgrade));
        } else if (i == 5) {
            this.install.setText(getResources().getString(C1086R.string.promo_update2appc_appview_update_button));
        }
    }

    private void setCountdownTimer(String str) {
        long j;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        final DecimalFormat decimalFormat = new DecimalFormat("00");
        simpleDateFormat.setLenient(false);
        long currentTimeMillis = System.currentTimeMillis();
        try {
            j = simpleDateFormat.parse(str).getTime();
        } catch (ParseException e) {
            e.printStackTrace();
            j = 0;
        }
        long j2 = j - currentTimeMillis;
        this.poaCountdownHours.setText(decimalFormat.format(0));
        this.poaCountdownMinutes.setText(decimalFormat.format(0));
        this.poaCountdownSeconds.setText(decimalFormat.format(0));
        if (j2 >= 0) {
            this.poaCountdownTimer = new CountDownTimer(j2, 1000) {
                public void onFinish() {
                }

                public void onTick(long j) {
                    AppViewFragment.this.poaCountdownHours.setText(decimalFormat.format(j / 3600000));
                    AppViewFragment.this.poaCountdownMinutes.setText(decimalFormat.format((j % 3600000) / 60000));
                    AppViewFragment.this.poaCountdownSeconds.setText(decimalFormat.format(((j % 360000) % 60000) / 1000));
                }
            }.start();
        }
    }

    private void setDescription(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.descriptionText.setText(AptoideUtils.HtmlU.parse(str));
            return;
        }
        this.descriptionText.setText(C1086R.string.description_not_available);
        this.descriptionReadMore.setVisibility(8);
    }

    private void setDeveloperDetails(AppDeveloper appDeveloper) {
        if (!TextUtils.isEmpty(appDeveloper.getWebsite())) {
            this.infoWebsite.setVisibility(0);
        } else {
            this.infoWebsite.setVisibility(8);
        }
        if (!TextUtils.isEmpty(appDeveloper.getEmail())) {
            this.infoEmail.setVisibility(0);
        } else {
            this.infoEmail.setVisibility(8);
        }
        if (!TextUtils.isEmpty(appDeveloper.getPrivacy())) {
            this.infoPrivacy.setVisibility(0);
        } else {
            this.infoPrivacy.setVisibility(8);
        }
    }

    private void setDownloadState(int i, DownloadModel.DownloadState downloadState, long j, boolean z) {
        String formatBytes = AptoideUtils.StringU.formatBytes(j, false);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1, 4.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1, 2.0f);
        int i2 = C14352.$SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState[downloadState.ordinal()];
        if (i2 == 1) {
            this.downloadProgressBar.setIndeterminate(false);
            this.downloadProgressBar.setProgress(i);
            if (z) {
                TextView textView = this.downloadProgressValue;
                textView.setText(i + "% of " + formatBytes);
            } else {
                TextView textView2 = this.downloadProgressValue;
                textView2.setText(i + "%");
            }
            this.downloadProgressValue.setVisibility(0);
            this.pauseDownload.setVisibility(0);
            this.cancelDownload.setVisibility(8);
            this.resumeDownload.setVisibility(8);
            this.downloadControlsLayout.setVisibility(0);
            this.downloadControlsLayout.setLayoutParams(layoutParams);
            this.installStateText.setText(getString(C1086R.string.appview_short_downloading));
        } else if (i2 == 2) {
            this.downloadProgressBar.setIndeterminate(true);
            this.pauseDownload.setVisibility(0);
            this.downloadProgressValue.setVisibility(8);
            this.cancelDownload.setVisibility(8);
            this.resumeDownload.setVisibility(8);
            this.downloadControlsLayout.setVisibility(0);
            this.downloadControlsLayout.setLayoutParams(layoutParams);
            this.installStateText.setText(getString(C1086R.string.appview_short_downloading));
        } else if (i2 == 3) {
            this.downloadProgressBar.setIndeterminate(false);
            this.downloadProgressBar.setProgress(i);
            if (z) {
                TextView textView3 = this.downloadProgressValue;
                textView3.setText(i + "% of " + formatBytes);
            } else {
                TextView textView4 = this.downloadProgressValue;
                textView4.setText(i + "%");
            }
            this.downloadProgressValue.setVisibility(0);
            this.pauseDownload.setVisibility(8);
            this.cancelDownload.setVisibility(0);
            this.resumeDownload.setVisibility(0);
            this.downloadControlsLayout.setVisibility(0);
            this.downloadControlsLayout.setLayoutParams(layoutParams2);
            this.installStateText.setText(getString(C1086R.string.appview_short_downloading));
        } else if (i2 == 4) {
            this.downloadProgressBar.setIndeterminate(true);
            this.pauseDownload.setVisibility(0);
            this.downloadProgressValue.setVisibility(8);
            this.cancelDownload.setVisibility(8);
            this.resumeDownload.setVisibility(8);
            this.downloadControlsLayout.setVisibility(0);
            this.downloadControlsLayout.setLayoutParams(layoutParams);
            this.installStateText.setText(getString(C1086R.string.appview_short_downloading));
        } else if (i2 == 6) {
            this.downloadProgressBar.setIndeterminate(true);
            this.pauseDownload.setVisibility(8);
            this.downloadProgressValue.setVisibility(8);
            this.cancelDownload.setVisibility(8);
            this.resumeDownload.setVisibility(8);
            this.downloadControlsLayout.setVisibility(8);
            this.installStateText.setText(getString(C1086R.string.appview_short_installing));
        }
    }

    private void setFlagValues(AppFlags appFlags) {
        if (appFlags != null) {
            try {
                if (appFlags.getVotes() != null && !appFlags.getVotes().isEmpty()) {
                    for (FlagsVote next : appFlags.getVotes()) {
                        applyCount(next.getVoteType(), next.getCount());
                    }
                }
            } catch (NullPointerException e) {
                CrashReport.getInstance().log(e);
            }
        }
    }

    private void setReadMoreClickListener(String str, AppMedia appMedia, Store store, boolean z) {
        this.descriptionReadMore.setOnClickListener(new C1681m0(this, str, appMedia, store, z));
    }

    private void setSimilarAppsAdapters() {
        SimilarAppsBundleAdapter similarAppsBundleAdapter = new SimilarAppsBundleAdapter(new ArrayList(), this.oneDecimalFormat, this.similarAppClick);
        this.similarListAdapter = similarAppsBundleAdapter;
        this.similarListRecyclerView.setAdapter(similarAppsBundleAdapter);
    }

    private void setTrustedBadge(Malware malware) {
        int i;
        int i2;
        int i3 = C14352.$SwitchMap$cm$aptoide$pt$dataprovider$model$v7$Malware$Rank[(malware.getRank() == null ? Malware.Rank.UNKNOWN : malware.getRank()).ordinal()];
        if (i3 == 1) {
            i = C1086R.C1087drawable.ic_badges_trusted;
            i2 = C1086R.string.appview_header_trusted_text;
        } else if (i3 == 2) {
            i = C1086R.C1087drawable.ic_badges_warning;
            i2 = C1086R.string.warning;
        } else if (i3 != 3) {
            i = C1086R.C1087drawable.ic_badges_unknown;
            i2 = C1086R.string.unknown;
        } else {
            i = C1086R.C1087drawable.ic_badges_critical;
            i2 = C1086R.string.critical;
        }
        this.trustedBadge.setImageDrawable(C0394a.m1917c(getContext(), i));
        this.trustedText.setText(i2);
    }

    private void setupActiveWalletPromotion(Promotion promotion, WalletApp walletApp, DownloadModel downloadModel) {
        setupWalletPromotionText(promotion, getPromotionMessage(downloadModel));
        this.walletPromotionDownloadLayout.setVisibility(0);
        this.walletPromotionButtonsLayout.setVisibility(8);
        this.walletPromotionIcon.setVisibility(0);
        DownloadModel.DownloadState downloadState = walletApp.getDownloadModel().getDownloadState();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1, 4.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1, 2.0f);
        int i = C14352.$SwitchMap$cm$aptoide$pt$app$DownloadModel$DownloadState[downloadState.ordinal()];
        if (i == 1) {
            this.downloadWalletProgressBar.setIndeterminate(false);
            this.downloadWalletProgressBar.setProgress(walletApp.getDownloadModel().getProgress());
            TextView textView = this.downloadWalletProgressValue;
            textView.setText(walletApp.getDownloadModel().getProgress() + "%");
            this.pauseWalletDownload.setVisibility(0);
            this.pauseWalletDownload.setOnClickListener(new C1663l0(this, promotion, walletApp));
            this.cancelWalletDownload.setVisibility(8);
            this.resumeWalletDownload.setVisibility(8);
            this.walletDownloadControlsLayout.setLayoutParams(layoutParams);
        } else if (i == 2) {
            this.downloadWalletProgressBar.setIndeterminate(true);
            this.pauseWalletDownload.setVisibility(0);
            this.pauseWalletDownload.setOnClickListener(new C1848v0(this, promotion, walletApp));
            this.cancelWalletDownload.setVisibility(8);
            this.resumeWalletDownload.setVisibility(8);
            this.walletDownloadControlsLayout.setLayoutParams(layoutParams);
        } else if (i == 3) {
            this.downloadWalletProgressBar.setIndeterminate(false);
            this.downloadWalletProgressBar.setProgress(walletApp.getDownloadModel().getProgress());
            TextView textView2 = this.downloadWalletProgressValue;
            textView2.setText(walletApp.getDownloadModel().getProgress() + "%");
            this.pauseWalletDownload.setVisibility(8);
            this.cancelWalletDownload.setVisibility(0);
            this.cancelWalletDownload.setOnClickListener(new C1866w0(this, promotion, walletApp));
            this.resumeWalletDownload.setVisibility(0);
            this.resumeWalletDownload.setOnClickListener(new C1771r0(this, promotion, walletApp));
            this.walletDownloadControlsLayout.setLayoutParams(layoutParams2);
        } else if (i == 4) {
            this.downloadWalletProgressBar.setIndeterminate(true);
            this.pauseWalletDownload.setVisibility(0);
            this.pauseWalletDownload.setOnClickListener(new C1572g(this, promotion, walletApp));
            this.cancelWalletDownload.setVisibility(8);
            this.resumeWalletDownload.setVisibility(8);
            this.walletDownloadControlsLayout.setLayoutParams(layoutParams);
        } else if (i == 5) {
            showErrorDialog("", getContext().getString(C1086R.string.error_occured));
        }
    }

    private void setupClaimWalletPromotion(Promotion promotion, WalletApp walletApp) {
        setupWalletPromotionText(promotion, C1086R.string.wallet_promotion_wallet_claim_message);
        this.walletPromotionClaimButton.setText(String.format(getString(C1086R.string.wallet_promotion_button_claim), new Object[]{Float.valueOf(promotion.getAppc())}));
        this.walletPromotionDownloadLayout.setVisibility(8);
        this.walletPromotionInstallDisableLayout.setVisibility(8);
        this.walletPromotionButtonsLayout.setVisibility(8);
        this.walletPromotionClaimLayout.setVisibility(0);
        this.walletPromotionClaimButton.setOnClickListener(new C1537e0(this, promotion, walletApp));
        this.walletPromotionIcon.setVisibility(0);
    }

    private void setupInactiveWalletPromotion(Promotion promotion, WalletApp walletApp, DownloadModel downloadModel) {
        setupWalletPromotionText(promotion, getPromotionMessage(downloadModel));
        this.walletPromotionDownloadLayout.setVisibility(8);
        this.walletPromotionInstallDisableLayout.setVisibility(8);
        this.walletPromotionClaimLayout.setVisibility(8);
        this.walletPromotionButtonsLayout.setVisibility(0);
        this.walletPromotionIcon.setVisibility(0);
        this.walletPromotionDownloadButton.setOnClickListener(new C1789s0(this, promotion, walletApp));
    }

    private void setupInstallDependencyApp(Promotion promotion, DownloadModel downloadModel) {
        setupWalletPromotionText(promotion, (downloadModel.getAction() == DownloadModel.Action.MIGRATE || downloadModel.getAction() == DownloadModel.Action.UPDATE) ? C1086R.string.wallet_promotion_wallet_installed_update_message : C1086R.string.wallet_promotion_wallet_installed_message);
        this.walletPromotionInstallDisableButton.setText(String.format(getString(C1086R.string.wallet_promotion_button_install_disabled), new Object[]{Float.valueOf(promotion.getAppc())}));
        this.walletPromotionInstallDisableLayout.setVisibility(0);
        this.walletPromotionDownloadLayout.setVisibility(8);
        this.walletPromotionButtonsLayout.setVisibility(8);
        this.walletPromotionClaimLayout.setVisibility(8);
        this.walletPromotionIcon.setImageResource(C1086R.C1087drawable.ic_promotion_coins);
    }

    private void setupWalletPromotionText(Promotion promotion, int i) {
        this.walletPromotionTitle.setText(String.format(getString(C1086R.string.wallet_promotion_title), new Object[]{Float.valueOf(promotion.getAppc())}));
        this.walletPromotionMessage.setText(String.format(getString(i), new Object[]{Float.valueOf(promotion.getAppc())}));
    }

    private void showAppViewLayout() {
        this.appview.setVisibility(0);
        this.viewProgress.setVisibility(8);
        this.errorView.setVisibility(8);
    }

    private void showAppcInfo(boolean z, boolean z2, double d, double d2, String str, double d3, String str2) {
        if (z) {
            this.appcInfoView.setVisibility(0);
            this.poaOfferValue.setText(String.format(getResources().getString(C1086R.string.poa_app_view_card_body_2), new Object[]{Double.valueOf(d), str + this.poaFiatDecimalFormat.format(d2)}));
            if (!str2.equals("")) {
                this.poaCountdownMessage.setVisibility(0);
                setCountdownTimer(str2);
            } else if (d3 != -1.0d) {
                this.poaBudgetElement.setVisibility(0);
                this.poaBudgetMessage.setText(String.format(getResources().getString(C1086R.string.poa_APPCC_left_body), new Object[]{Integer.valueOf((int) (d3 / d))}));
            }
            if (z2) {
                this.poaIabInfo.setVisibility(0);
            }
        }
    }

    private void showErrorDialog(String str, String str2) {
        this.errorMessageSubscription = GenericDialogs.createGenericOkMessage(getContext(), str, str2, this.themeManager.getAttributeForTheme(C1086R.attr.dialogsTheme).resourceId).mo18662b(C5376a.m10346b()).mo18655a(C1811t.f4398f, (C5378b<Throwable>) C1644k.f4195f);
    }

    private void showHideOptionsMenu(boolean z) {
        for (int i = 0; i < this.menu.size(); i++) {
            showHideOptionsMenu(this.menu.getItem(i), z);
        }
    }

    private void showReviews(boolean z, int i, float f) {
        this.topReviewsProgress.setVisibility(8);
        this.reviewUsers.setText(AptoideUtils.StringU.withSuffix((long) i));
        if (f == 0.0f) {
            this.avgReviewScore.setText(C1086R.string.appcardview_title_no_stars);
        } else {
            this.avgReviewScore.setText(String.format(Locale.getDefault(), "%.1f", new Object[]{Float.valueOf(f)}));
        }
        this.avgReviewScoreBar.setRating(f);
        if (z) {
            this.ratingLayout.setVisibility(0);
            this.emptyReviewsLayout.setVisibility(8);
            this.topReviewsLayout.setVisibility(0);
            this.rateAppButtonLarge.setVisibility(8);
            this.rateAppButton.setVisibility(0);
            return;
        }
        this.ratingLayout.setVisibility(0);
        this.emptyReviewsLayout.setVisibility(0);
        this.topReviewsLayout.setVisibility(8);
        this.rateAppButtonLarge.setVisibility(0);
        this.rateAppButton.setVisibility(8);
        if (i == 0) {
            this.emptyReviewTextView.setText(C1086R.string.appview_rate_this_app);
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo7185a(ViewStub viewStub, View view) {
        this.install = (Button) view.findViewById(C1086R.C1088id.appview_install_button);
        this.downloadInfoLayout = (LinearLayout) view.findViewById(C1086R.C1088id.appview_transfer_info);
        this.downloadProgressBar = (ProgressBar) view.findViewById(C1086R.C1088id.appview_download_progress_bar);
        this.downloadProgressValue = (TextView) view.findViewById(C1086R.C1088id.appview_download_progress_number);
        this.cancelDownload = (ImageView) view.findViewById(C1086R.C1088id.appview_download_cancel_button);
        this.resumeDownload = (ImageView) view.findViewById(C1086R.C1088id.appview_download_resume_download);
        this.pauseDownload = (ImageView) view.findViewById(C1086R.C1088id.appview_download_pause_download);
        this.installStateText = (TextView) view.findViewById(C1086R.C1088id.appview_download_download_state);
        this.downloadControlsLayout = view.findViewById(C1086R.C1088id.install_controls_layout);
        this.install.setOnClickListener(new C1554f(this));
        this.resumeDownload.setOnClickListener(new C1443a1(this));
        this.cancelDownload.setOnClickListener(new C1536e(this));
        this.pauseDownload.setOnClickListener(new C1903y(this));
    }

    public C5368e<String> apkfyDialogPositiveClick() {
        return this.apkfyDialogConfirmSubject;
    }

    /* renamed from: b */
    public /* synthetic */ void mo7194b(View view) {
        this.installClickSubject.onNext(null);
    }

    /* renamed from: c */
    public /* synthetic */ void mo7196c(View view) {
        this.resumeClickSubject.onNext(null);
    }

    public C5368e<Void> cancelDownload() {
        return this.cancelClickSubject;
    }

    public C5368e<WalletApp> cancelPromotionDownload() {
        return this.promotionAppClick.mo18681d(C1922z0.f4524f).mo18694j(C1698n.f4262f);
    }

    public C5368e<Promotion> claimAppClick() {
        return this.promotionAppClick.mo18681d(C1788s.f4369f).mo18694j(C1461b0.f3967f);
    }

    public C5368e<Void> clickBonusAppcFlair() {
        return C10695a.m36221a(this.bonusAppcView);
    }

    public C5368e<Void> clickCatappultCard() {
        return C10695a.m36221a(this.catappultCard);
    }

    public C5368e<Void> clickDeveloperEmail() {
        return C10695a.m36221a(this.infoEmail);
    }

    public C5368e<Void> clickDeveloperPermissions() {
        return C10695a.m36221a(this.infoPermissions);
    }

    public C5368e<Void> clickDeveloperPrivacy() {
        return C10695a.m36221a(this.infoPrivacy);
    }

    public C5368e<Void> clickDeveloperWebsite() {
        return C10695a.m36221a(this.infoWebsite);
    }

    public C5368e<Void> clickErrorRetry() {
        return this.errorView.retryClick();
    }

    public C5368e<FlagsVote.VoteType> clickFakeFlag() {
        return C10695a.m36221a(this.fakeAppLayout).mo18687f(C1555f0.f4079f);
    }

    public C5368e<Void> clickFollowStore() {
        return C10695a.m36221a(this.storeFollow);
    }

    public C5368e<Void> clickGetAppcInfo() {
        return C10695a.m36221a(this.poaCoinsIcon);
    }

    public C5368e<FlagsVote.VoteType> clickLicenseFlag() {
        return C10695a.m36221a(this.needsLicenseLayout).mo18687f(C1717o0.f4284f);
    }

    public C5368e<Void> clickLoginSnack() {
        return this.loginSnackClick;
    }

    public C5368e<Void> clickOtherVersions() {
        return C10695a.m36221a(this.otherVersions);
    }

    public C5368e<Void> clickRateApp() {
        return C10695a.m36221a(this.rateAppButton);
    }

    public C5368e<Void> clickRateAppLarge() {
        return C10695a.m36221a(this.rateAppButtonLarge);
    }

    public C5368e<Void> clickRateAppLayout() {
        return C10695a.m36221a(this.ratingLayout);
    }

    public C5368e<Void> clickReadAllReviews() {
        return C10695a.m36221a(this.showAllReviewsButton);
    }

    public C5368e<Void> clickReviewsLayout() {
        return C10695a.m36221a(this.topReviewsLayout);
    }

    public C5368e<SimilarAppClickEvent> clickSimilarApp() {
        return this.similarAppClick;
    }

    public C5368e<Void> clickStoreLayout() {
        return C10695a.m36221a(this.storeLayout);
    }

    public C5368e<MenuItem> clickToolbar() {
        return C10687e.m36213a(this.toolbar);
    }

    public C5368e<Void> clickTopDonorsDonateButton() {
        return C10695a.m36221a(this.listDonateButton);
    }

    public C5368e<Void> clickTrustedBadge() {
        return C10695a.m36221a(this.trustedLayout);
    }

    public C5368e<FlagsVote.VoteType> clickVirusFlag() {
        return C10695a.m36221a(this.virusLayout).mo18687f(C1608i.f4150f);
    }

    public C5368e<FlagsVote.VoteType> clickWorkingFlag() {
        return C10695a.m36221a(this.workingWellLayout).mo18687f(C1829u.f4421f);
    }

    public C5368e<ReadMoreClickEvent> clickedReadMore() {
        return this.readMoreClick;
    }

    /* renamed from: d */
    public /* synthetic */ void mo7227d(View view) {
        this.cancelClickSubject.onNext(null);
    }

    public void defaultShare(String str, String str2) {
        if (str2 != null) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.SUBJECT", getActivity().getString(C1086R.string.install) + " \"" + str + "\"");
            intent.putExtra("android.intent.extra.TEXT", str2);
            getActivity().startActivity(Intent.createChooser(intent, getActivity().getString(C1086R.string.share)));
        }
    }

    public void disableFlags() {
        this.workingWellLayout.setClickable(false);
        this.needsLicenseLayout.setClickable(false);
        this.fakeAppLayout.setClickable(false);
        this.virusLayout.setClickable(false);
    }

    public C5368e<Promotion> dismissWalletPromotionClick() {
        return this.promotionAppClick.mo18681d(C1904y0.f4505f).mo18694j(C1735p0.f4305f);
    }

    public void dismissWalletPromotionView() {
        this.promotionView.setVisibility(8);
    }

    public void displayNotLoggedInSnack() {
        Snackbar a = Snackbar.m28075a(getView(), (int) C1086R.string.you_need_to_be_logged_in, -1);
        a.mo32011a((int) C1086R.string.login, (View.OnClickListener) new C1812t0(this));
        a.mo31972k();
    }

    public void displayStoreFollowedSnack(String str) {
        Toast.makeText(getContext(), String.format(getString(C1086R.string.store_followed), new Object[]{str}), 0).show();
    }

    /* renamed from: e */
    public /* synthetic */ void mo7235e(View view) {
        this.pauseClickSubject.onNext(null);
    }

    public C5368e<Void> eSkillsCardClick() {
        return C10695a.m36221a(this.eSkillsView);
    }

    public void enableFlags() {
        this.workingWellLayout.setClickable(true);
        this.needsLicenseLayout.setClickable(true);
        this.fakeAppLayout.setClickable(true);
        this.virusLayout.setClickable(true);
    }

    public void extractReferrer(SearchAdResult searchAdResult) {
        AptoideUtils.ThreadU.runOnUiThread(new C1885x(this, searchAdResult));
    }

    public ScreenTagHistory getHistoryTracker() {
        return ScreenTagHistory.Builder.build("AppViewFragment", getArguments().getString(BundleKeys.ORIGIN_TAG.name(), ""), StoreContext.meta.name());
    }

    public String getLanguageFilter() {
        return new LanguageFilterHelper(getContext().getResources()).getCurrentLanguageFirst().getCountryCodes().get(0);
    }

    public C5368e<ScreenShotClickEvent> getScreenshotClickEvent() {
        return this.screenShotClick;
    }

    /* renamed from: h */
    public /* synthetic */ void mo7244h(Promotion promotion, WalletApp walletApp, View view) {
        this.promotionAppClick.onNext(new PromotionEvent(promotion, walletApp, PromotionEvent.ClickType.DISMISS));
    }

    public void handleError(DetailedAppRequestResult.Error error) {
        this.viewProgress.setVisibility(8);
        int i = C14352.$SwitchMap$cm$aptoide$pt$view$app$DetailedAppRequestResult$Error[error.ordinal()];
        if (i == 1) {
            this.errorView.setError(ErrorView.Error.NO_NETWORK);
            this.errorView.setVisibility(0);
        } else if (i == 2) {
            this.errorView.setError(ErrorView.Error.GENERIC);
            this.errorView.setVisibility(0);
        }
    }

    public void hideReviews() {
        this.reviewsLayout.setVisibility(8);
    }

    public void hideSimilarApps() {
        this.similarListRecyclerView.setVisibility(8);
    }

    public C5368e<Void> iabInfoClick() {
        return C5368e.m10254b(C10695a.m36221a(this.poaIabInfo), C10695a.m36221a(this.iabInfo));
    }

    public void incrementFlags(FlagsVote.VoteType voteType) {
        disableFlags();
        int i = C14352.$SwitchMap$cm$aptoide$pt$view$app$FlagsVote$VoteType[voteType.ordinal()];
        if (i == 1) {
            this.workingWellText.setText(NumberFormat.getIntegerInstance().format(Double.parseDouble(String.valueOf(new BigDecimal(this.workingWellText.getText().toString()))) + 1.0d));
            this.workingWellLayout.setSelected(true);
            this.workingWellLayout.setPressed(false);
        } else if (i == 2) {
            this.needsLicenceText.setText(NumberFormat.getIntegerInstance().format(Double.parseDouble(String.valueOf(new BigDecimal(this.needsLicenceText.getText().toString()))) + 1.0d));
            this.needsLicenceText.setSelected(true);
            this.needsLicenceText.setPressed(false);
        } else if (i == 3) {
            this.fakeAppText.setText(NumberFormat.getIntegerInstance().format(Double.parseDouble(String.valueOf(new BigDecimal(this.fakeAppText.getText().toString()))) + 1.0d));
            this.fakeAppLayout.setSelected(true);
            this.fakeAppLayout.setPressed(false);
        } else if (i == 4) {
            this.virusText.setText(NumberFormat.getIntegerInstance().format(Double.parseDouble(String.valueOf(new BigDecimal(this.virusText.getText().toString()))) + 1.0d));
            this.virusLayout.setSelected(true);
            this.virusLayout.setPressed(false);
        } else {
            throw new IllegalArgumentException("Unable to find Type " + voteType.name());
        }
    }

    public C5368e<DownloadModel.Action> installAppClick() {
        return this.installClickSubject.mo18694j(new C1699n0(this));
    }

    public C5368e<Pair<Promotion, WalletApp>> installWalletButtonClick() {
        return this.promotionAppClick.mo18681d(C1770r.f4347f).mo18694j(C1479c0.f3990f);
    }

    public boolean isSimilarAppsVisible() {
        Rect rect = new Rect();
        this.scrollView.getHitRect(rect);
        return this.similarListRecyclerView.getLocalVisibleRect(rect);
    }

    public void navigateToDeveloperEmail(AppModel appModel) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("mailto:" + appModel.getDeveloper().getEmail() + "?subject=Feedback&body="));
        getContext().startActivity(intent);
    }

    public void navigateToDeveloperPermissions(AppModel appModel) {
        DialogPermissions.newInstance(appModel.getAppName(), appModel.getVersionName(), appModel.getIcon(), AptoideUtils.StringU.formatBytes(AppUtils.sumFileSizes(appModel.getFileSize(), appModel.getObb()), false), appModel.getUsedPermissions()).show(getActivity().getSupportFragmentManager(), "");
    }

    public void navigateToDeveloperPrivacy(AppModel appModel) {
        getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(appModel.getDeveloper().getPrivacy())));
    }

    public void navigateToDeveloperWebsite(AppModel appModel) {
        getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(appModel.getDeveloper().getWebsite())));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getFragmentComponent(bundle).inject(this);
        this.screenShotClick = C12871b.m41468p();
        this.readMoreClick = C12871b.m41468p();
        this.loginSnackClick = C12871b.m41468p();
        this.similarAppClick = C12871b.m41468p();
        this.reviewsAutoScroll = C12871b.m41468p();
        this.apkfyDialogConfirmSubject = C12871b.m41468p();
        this.similarAppsVisibilitySubject = C12871b.m41468p();
        this.installClickSubject = C12871b.m41468p();
        this.resumeClickSubject = C12871b.m41468p();
        this.cancelClickSubject = C12871b.m41468p();
        this.pauseClickSubject = C12871b.m41468p();
        this.promotionAppClick = C12871b.m41468p();
        this.poaFiatDecimalFormat = new DecimalFormat("0.00");
        AptoideApplication aptoideApplication = (AptoideApplication) getContext().getApplicationContext();
        this.qManager = aptoideApplication.getQManager();
        this.httpClient = aptoideApplication.getDefaultClient();
        this.converterFactory = WebService.getDefaultConverter();
        this.adsRepository = aptoideApplication.getAdsRepository();
        setHasOptionsMenu(true);
    }

    public void onCreateOptionsMenu(Menu menu2, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu2, menuInflater);
        this.menu = menu2;
        menuInflater.inflate(C1086R.C1089menu.fragment_appview, menu2);
        showHideOptionsMenu(true);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        return layoutInflater.inflate(C1086R.layout.fragment_app_view, viewGroup, false);
    }

    public void onDestroy() {
        super.onDestroy();
        C5375k kVar = this.errorMessageSubscription;
        if (kVar != null && !kVar.isUnsubscribed()) {
            this.errorMessageSubscription.unsubscribe();
        }
        this.screenShotClick = null;
        this.readMoreClick = null;
        this.loginSnackClick = null;
        this.similarAppClick = null;
        this.reviewsAutoScroll = null;
        this.dialogUtils = null;
        this.presenter = null;
        this.similarAppsVisibilitySubject = null;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.scrollViewY = this.scrollView.getScrollY();
        this.appviewInstall = null;
        this.poaInstall = null;
        this.appcInfoView = null;
        this.poaIabInfo = null;
        this.poaOfferValue = null;
        this.iabInfo = null;
        this.errorView = null;
        this.appIcon = null;
        this.trustedBadge = null;
        this.appName = null;
        this.trustedLayout = null;
        this.trustedText = null;
        this.downloadsTop = null;
        this.sizeInfo = null;
        this.iconSizeInfo = null;
        this.ratingInfo = null;
        this.latestVersion = null;
        this.otherVersions = null;
        this.screenshots = null;
        this.descriptionText = null;
        this.reviewsAdapter = null;
        this.descriptionReadMore = null;
        this.topReviewsProgress = null;
        this.ratingLayout = null;
        this.emptyReviewsLayout = null;
        this.topReviewsLayout = null;
        this.rateAppButtonLarge = null;
        this.emptyReviewTextView = null;
        this.reviewUsers = null;
        this.avgReviewScore = null;
        this.avgReviewScoreBar = null;
        this.reviewsView = null;
        this.rateAppButton = null;
        this.showAllReviewsButton = null;
        this.goodAppLayoutWrapper = null;
        this.flagsLayoutWrapper = null;
        this.workingWellLayout = null;
        this.needsLicenseLayout = null;
        this.fakeAppLayout = null;
        this.virusLayout = null;
        this.workingWellText = null;
        this.needsLicenceText = null;
        this.fakeAppText = null;
        this.virusText = null;
        this.storeLayout = null;
        this.storeIcon = null;
        this.storeName = null;
        this.storeFollowers = null;
        this.storeDownloads = null;
        this.storeFollow = null;
        this.infoWebsite = null;
        this.infoEmail = null;
        this.infoPrivacy = null;
        this.infoPermissions = null;
        this.viewProgress = null;
        this.appview = null;
        this.screenshotsAdapter = null;
        this.catappultCard = null;
        this.menu = null;
        this.toolbar = null;
        this.actionBar = null;
        this.scrollView = null;
        this.collapsingToolbarLayout = null;
        this.donationsAdapter = null;
        this.donationsElement = null;
        this.donationsList = null;
        CountDownTimer countDownTimer = this.poaCountdownTimer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.poaCountdownTimer = null;
        }
        this.eSkillsView = null;
        this.eSkillsInAppMessage = null;
    }

    public void onResume() {
        super.onResume();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        NestedScrollView nestedScrollView = this.scrollView;
        if (nestedScrollView != null) {
            bundle.putInt(KEY_SCROLL_Y, nestedScrollView.getScrollY());
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C1573g0 g0Var = new C1573g0(this);
        ViewStub viewStub = (ViewStub) view.findViewById(C1086R.C1088id.appview_install_element);
        this.appviewInstall = viewStub;
        viewStub.setLayoutResource(C1086R.layout.install_app_view);
        this.appviewInstall.setOnInflateListener(g0Var);
        ViewStub viewStub2 = (ViewStub) view.findViewById(C1086R.C1088id.poa_install_element);
        this.poaInstall = viewStub2;
        viewStub2.setLayoutResource(C1086R.layout.install_app_view);
        this.poaInstall.setOnInflateListener(g0Var);
        this.scrollView = (NestedScrollView) view.findViewById(C1086R.C1088id.scroll_view_app);
        this.errorView = (ErrorView) view.findViewById(C1086R.C1088id.error_view);
        this.reviewsLayout = view.findViewById(C1086R.C1088id.reviews_layout);
        this.appIcon = (ImageView) view.findViewById(C1086R.C1088id.app_icon);
        this.trustedBadge = (ImageView) view.findViewById(C1086R.C1088id.trusted_badge);
        this.appName = (TextView) view.findViewById(C1086R.C1088id.app_name);
        this.trustedLayout = view.findViewById(C1086R.C1088id.trusted_layout);
        this.trustedText = (TextView) view.findViewById(C1086R.C1088id.trusted_text);
        this.downloadsTop = (TextView) view.findViewById(C1086R.C1088id.header_downloads);
        this.sizeInfo = (TextView) view.findViewById(C1086R.C1088id.header_size);
        this.iconSizeInfo = (ImageView) view.findViewById(C1086R.C1088id.header_size_icon);
        this.ratingInfo = (TextView) view.findViewById(C1086R.C1088id.header_rating);
        this.appcMigrationWarningMessage = view.findViewById(C1086R.C1088id.migration_warning);
        this.otherVersionsTopSeparator = view.findViewById(C1086R.C1088id.other_versions_top_separator);
        this.appcInfoView = view.findViewById(C1086R.C1088id.poa_appc_layout);
        this.poaCoinsIcon = (ImageView) view.findViewById(C1086R.C1088id.coins_icon);
        this.poaIabInfo = view.findViewById(C1086R.C1088id.inapp_purchases);
        this.poaOfferValue = (TextView) view.findViewById(C1086R.C1088id.offer_value);
        this.poaBudgetElement = view.findViewById(C1086R.C1088id.budget_element);
        this.poaBudgetMessage = (TextView) view.findViewById(C1086R.C1088id.budget_left_message);
        this.poaCountdownMessage = view.findViewById(C1086R.C1088id.countdown_element);
        this.poaCountdownHours = (TextView) view.findViewById(C1086R.C1088id.hours);
        this.poaCountdownMinutes = (TextView) view.findViewById(C1086R.C1088id.minutes);
        this.poaCountdownSeconds = (TextView) view.findViewById(C1086R.C1088id.seconds);
        this.iabInfo = view.findViewById(C1086R.C1088id.iap_appc_label);
        this.versionsLayout = view.findViewById(C1086R.C1088id.versions_layout);
        this.latestVersionTitle = (TextView) view.findViewById(C1086R.C1088id.latest_version_title);
        this.latestVersion = (TextView) this.versionsLayout.findViewById(C1086R.C1088id.latest_version);
        this.rewardAppLatestVersion = (TextView) view.findViewById(C1086R.C1088id.appview_reward_app_versions_element);
        this.otherVersions = (TextView) view.findViewById(C1086R.C1088id.other_versions);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C1086R.C1088id.screenshots_list);
        this.screenshots = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext(), 0, false));
        this.screenshots.setNestedScrollingEnabled(false);
        this.descriptionText = (TextView) view.findViewById(C1086R.C1088id.description_text);
        this.descriptionReadMore = (Button) view.findViewById(C1086R.C1088id.description_see_more);
        this.topReviewsProgress = (ContentLoadingProgressBar) view.findViewById(C1086R.C1088id.top_comments_progress);
        this.ratingLayout = view.findViewById(C1086R.C1088id.rating_layout);
        this.emptyReviewsLayout = view.findViewById(C1086R.C1088id.empty_reviews_layout);
        this.topReviewsLayout = view.findViewById(C1086R.C1088id.comments_layout);
        this.rateAppButtonLarge = (Button) view.findViewById(C1086R.C1088id.rate_this_button2);
        this.emptyReviewTextView = (TextView) view.findViewById(C1086R.C1088id.empty_review_text);
        this.reviewUsers = (TextView) view.findViewById(C1086R.C1088id.users_voted);
        this.avgReviewScore = (TextView) view.findViewById(C1086R.C1088id.rating_value);
        this.avgReviewScoreBar = (RatingBar) view.findViewById(C1086R.C1088id.rating_bar);
        this.reviewsView = (RecyclerView) view.findViewById(C1086R.C1088id.top_comments_list);
        this.rateAppButton = (Button) view.findViewById(C1086R.C1088id.rate_this_button);
        this.showAllReviewsButton = (Button) view.findViewById(C1086R.C1088id.read_all_button);
        this.apkfyElement = view.findViewById(C1086R.C1088id.apkfy_element);
        this.flagThisAppSection = view.findViewById(C1086R.C1088id.flag_this_app_section);
        this.goodAppLayoutWrapper = view.findViewById(C1086R.C1088id.good_app_layout);
        this.flagsLayoutWrapper = view.findViewById(C1086R.C1088id.rating_flags_layout);
        this.workingWellLayout = view.findViewById(C1086R.C1088id.working_well_layout);
        this.needsLicenseLayout = view.findViewById(C1086R.C1088id.needs_licence_layout);
        this.fakeAppLayout = view.findViewById(C1086R.C1088id.fake_app_layout);
        this.virusLayout = view.findViewById(C1086R.C1088id.virus_layout);
        this.donationsElement = view.findViewById(C1086R.C1088id.donations_element);
        this.donationsList = (RecyclerView) view.findViewById(C1086R.C1088id.donations_list);
        this.donationsListEmptyState = view.findViewById(C1086R.C1088id.donations_list_empty_state);
        this.donationsProgress = (ProgressBar) view.findViewById(C1086R.C1088id.donations_progress);
        this.donationsListLayout = view.findViewById(C1086R.C1088id.donations_list_layout);
        this.listDonateButton = (Button) view.findViewById(C1086R.C1088id.donate_button);
        this.donationsList.setLayoutManager(new LinearLayoutManager(getContext()));
        this.workingWellText = (TextView) view.findViewById(C1086R.C1088id.working_well_count);
        this.needsLicenceText = (TextView) view.findViewById(C1086R.C1088id.needs_licence_count);
        this.fakeAppText = (TextView) view.findViewById(C1086R.C1088id.fake_app_count);
        this.virusText = (TextView) view.findViewById(C1086R.C1088id.virus_count);
        this.storeLayout = view.findViewById(C1086R.C1088id.store_uploaded_layout);
        this.storeIcon = (ImageView) view.findViewById(C1086R.C1088id.store_icon);
        this.storeName = (TextView) view.findViewById(C1086R.C1088id.store_name);
        this.storeFollowers = (TextView) view.findViewById(C1086R.C1088id.user_count);
        this.storeDownloads = (TextView) view.findViewById(C1086R.C1088id.download_count);
        this.storeFollow = (Button) view.findViewById(C1086R.C1088id.follow_button);
        this.similarListRecyclerView = (RecyclerView) view.findViewById(C1086R.C1088id.similar_list);
        this.similarDownloadPlaceholder = view.findViewById(C1086R.C1088id.similar_download_placeholder);
        this.similarBottomPlaceholder = view.findViewById(C1086R.C1088id.similar_bottom_placeholder);
        this.infoWebsite = view.findViewById(C1086R.C1088id.website_label);
        this.infoEmail = view.findViewById(C1086R.C1088id.email_label);
        this.infoPrivacy = view.findViewById(C1086R.C1088id.privacy_policy_label);
        this.infoPermissions = view.findViewById(C1086R.C1088id.permissions_label);
        this.catappultCard = view.findViewById(C1086R.C1088id.catappult_card);
        this.viewProgress = (ProgressBar) view.findViewById(C1086R.C1088id.appview_progress);
        this.appview = view.findViewById(C1086R.C1088id.appview_full);
        this.toolbar = (Toolbar) view.findViewById(C1086R.C1088id.toolbar);
        this.collapsingAppcBackground = view.findViewById(C1086R.C1088id.collapsing_appc_coins_background);
        this.bonusAppcView = (BonusAppcView) view.findViewById(C1086R.C1088id.bonus_appc_view);
        View findViewById = view.findViewById(C1086R.C1088id.wallet_install_promotion);
        this.promotionView = findViewById;
        this.walletPromotionTitle = (TextView) findViewById.findViewById(C1086R.C1088id.wallet_title);
        this.walletPromotionMessage = (TextView) this.promotionView.findViewById(C1086R.C1088id.wallet_message);
        this.walletPromotionButtonsLayout = this.promotionView.findViewById(C1086R.C1088id.buttons_layout);
        this.walletPromotionCancelButton = (Button) this.promotionView.findViewById(C1086R.C1088id.cancel_button);
        this.walletPromotionDownloadButton = (Button) this.promotionView.findViewById(C1086R.C1088id.download_button);
        View findViewById2 = view.findViewById(C1086R.C1088id.wallet_download_info);
        this.walletPromotionDownloadLayout = findViewById2;
        this.downloadWalletProgressBar = (ProgressBar) findViewById2.findViewById(C1086R.C1088id.wallet_download_progress_bar);
        this.downloadWalletProgressValue = (TextView) this.walletPromotionDownloadLayout.findViewById(C1086R.C1088id.wallet_download_progress_number);
        this.cancelWalletDownload = (ImageView) this.walletPromotionDownloadLayout.findViewById(C1086R.C1088id.wallet_download_cancel_button);
        this.pauseWalletDownload = (ImageView) this.walletPromotionDownloadLayout.findViewById(C1086R.C1088id.wallet_download_pause_download);
        this.resumeWalletDownload = (ImageView) this.walletPromotionDownloadLayout.findViewById(C1086R.C1088id.wallet_download_resume_download);
        this.walletPromotionClaimLayout = view.findViewById(C1086R.C1088id.wallet_claim_appc_layout);
        this.walletPromotionIcon = (ImageView) view.findViewById(C1086R.C1088id.wallet_icon);
        this.walletPromotionClaimButton = (Button) view.findViewById(C1086R.C1088id.wallet_claim_appc_button);
        this.walletDownloadControlsLayout = view.findViewById(C1086R.C1088id.wallet_install_controls_layout);
        this.walletPromotionInstallDisableLayout = view.findViewById(C1086R.C1088id.wallet_install_disabled_layout);
        this.walletPromotionInstallDisableButton = (Button) view.findViewById(C1086R.C1088id.wallet_install_disabled_button);
        this.eSkillsView = view.findViewById(C1086R.C1088id.eskills_card);
        this.eSkillsInAppMessage = (TextView) view.findViewById(C1086R.C1088id.eskills_card_third_message);
        DonationsAdapter donationsAdapter2 = new DonationsAdapter(new ArrayList());
        this.donationsAdapter = donationsAdapter2;
        this.donationsList.setAdapter(donationsAdapter2);
        ScreenshotsAdapter screenshotsAdapter2 = new ScreenshotsAdapter(new ArrayList(), new ArrayList(), this.screenShotClick);
        this.screenshotsAdapter = screenshotsAdapter2;
        this.screenshots.setAdapter(screenshotsAdapter2);
        LinearLayoutManagerWithSmoothScroller linearLayoutManagerWithSmoothScroller = new LinearLayoutManagerWithSmoothScroller(getContext(), 0, false);
        this.similarListRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        this.similarListRecyclerView.setNestedScrollingEnabled(false);
        setSimilarAppsAdapters();
        this.reviewsView.setLayoutManager(linearLayoutManagerWithSmoothScroller);
        this.reviewsView.setNestedScrollingEnabled(false);
        SnapToStartHelper snapToStartHelper = new SnapToStartHelper();
        SnapToStartHelper snapToStartHelper2 = new SnapToStartHelper();
        snapToStartHelper.attachToRecyclerView(this.reviewsView);
        snapToStartHelper2.attachToRecyclerView(this.screenshots);
        setupToolbar();
        ((AppBarLayout) view.findViewById(C1086R.C1088id.app_bar_layout)).mo30728a((AppBarLayout.C8416e) new C1680m(this, view));
        if (bundle != null) {
            this.scrollViewY = bundle.getInt(KEY_SCROLL_Y, 0);
        }
        CollapsingToolbarLayout collapsingToolbarLayout2 = (CollapsingToolbarLayout) view.findViewById(C1086R.C1088id.collapsing_toolbar_layout);
        this.collapsingToolbarLayout = collapsingToolbarLayout2;
        collapsingToolbarLayout2.setExpandedTitleColor(getResources().getColor(17170445));
        attachPresenter(this.presenter);
    }

    public void openApp(String str) {
        AptoideUtils.SystemU.openApp(str, getContext().getPackageManager(), getContext());
    }

    public C5368e<Void> pauseDownload() {
        return this.pauseClickSubject;
    }

    public C5368e<WalletApp> pausePromotionDownload() {
        return this.promotionAppClick.mo18681d(C1662l.f4214f).mo18694j(C1734p.f4304f);
    }

    public void populateReviews(ReviewsViewModel reviewsViewModel, AppModel appModel) {
        List<AppReview> reviewsList = reviewsViewModel.getReviewsList();
        if (reviewsList == null || reviewsList.isEmpty()) {
            showReviews(false, appModel.getRating().getTotal(), appModel.getRating().getAverage());
            this.reviewsAdapter = new TopReviewsAdapter();
        } else {
            showReviews(true, appModel.getRating().getTotal(), appModel.getRating().getAverage());
            this.reviewsAdapter = new TopReviewsAdapter((AppReview[]) reviewsList.toArray(new AppReview[reviewsList.size()]));
        }
        this.reviewsView.setAdapter(this.reviewsAdapter);
        this.reviewsAutoScroll.onNext(Integer.valueOf(this.reviewsAdapter.getItemCount()));
    }

    public void populateSimilar(List<SimilarAppsBundle> list) {
        this.similarListAdapter.add(list);
        manageSimilarAppsVisibility(true, false);
    }

    public void recoverScrollViewState() {
        this.scrollView.post(new C1716o(this));
    }

    public C5368e<DownloadModel.Action> resumeDownload() {
        return this.resumeClickSubject.mo18694j(new C1752q(this));
    }

    public C5368e<WalletApp> resumePromotionDownload() {
        return this.promotionAppClick.mo18681d(C1921z.f4523f).mo18694j(C1830u0.f4422f);
    }

    public void scrollReviews(Integer num) {
        RecyclerView recyclerView = this.reviewsView;
        if (recyclerView != null) {
            recyclerView.smoothScrollToPosition(num.intValue());
        }
    }

    public C5368e<Integer> scrollReviewsResponse() {
        return this.reviewsAutoScroll;
    }

    public C5368e<C10706f> scrollVisibleSimilarApps() {
        return C10676b.m36205a(this.scrollView).mo18681d(new C1627j0(this));
    }

    public void setFollowButton(boolean z) {
        if (!z) {
            this.storeFollow.setText(C1086R.string.followed);
        }
    }

    public void setInstallButton(AppCoinsViewModel appCoinsViewModel) {
        if (appCoinsViewModel.hasAdvertising()) {
            this.poaInstall.inflate();
            this.otherVersionsTopSeparator.setVisibility(4);
            return;
        }
        this.appviewInstall.inflate();
    }

    public void setupAppcAppView(boolean z, BonusAppcModel bonusAppcModel) {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(C1086R.attr.appview_toolbar_bg_appc, typedValue, true);
        TransitionDrawable transitionDrawable = (TransitionDrawable) C0394a.m1917c(getContext(), typedValue.resourceId);
        this.collapsingToolbarLayout.setBackgroundDrawable(transitionDrawable);
        transitionDrawable.startTransition(APPC_TRANSITION_MS);
        if (!z || !bonusAppcModel.getHasBonusAppc()) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(1000);
            this.collapsingAppcBackground.setAlpha(1.0f);
            this.collapsingAppcBackground.setVisibility(0);
            this.collapsingAppcBackground.startAnimation(alphaAnimation);
        } else {
            this.bonusAppcView.setPercentage(bonusAppcModel.getBonusPercentage());
            this.bonusAppcView.setVisibility(0);
        }
        this.install.setBackgroundDrawable(getContext().getResources().getDrawable(C1086R.C1087drawable.appc_gradient_rounded));
        this.downloadProgressBar.setProgressDrawable(C0394a.m1917c(getContext(), C1086R.C1087drawable.appc_progress));
        this.flagThisAppSection.setVisibility(8);
    }

    public void setupToolbar() {
        this.toolbar.setTitle((CharSequence) "");
        C0076d dVar = (C0076d) getActivity();
        dVar.setSupportActionBar(this.toolbar);
        C0069a supportActionBar = dVar.getSupportActionBar();
        this.actionBar = supportActionBar;
        if (supportActionBar != null) {
            supportActionBar.mo188d(true);
            this.actionBar.mo182a(this.toolbar.getTitle());
        }
    }

    public void showApkfyElement(String str) {
        this.apkfyElement.setVisibility(0);
        ((TextView) this.apkfyElement.findViewById(C1086R.C1088id.apkfy_message_1)).setText(String.format(getString(C1086R.string.appview_message_apkfy_1), new Object[]{str}));
        ((TextView) this.apkfyElement.findViewById(C1086R.C1088id.apkfy_title)).setText(getResources().getString(C1086R.string.appview_title_apkfy));
    }

    public void showAppView(AppModel appModel) {
        this.collapsingToolbarLayout.setTitle(appModel.getAppName());
        this.appName.setText(appModel.getAppName());
        ImageLoader.with(getContext()).load(appModel.getIcon(), this.appIcon);
        this.downloadsTop.setText(String.format("%s", new Object[]{AptoideUtils.StringU.withSuffix((long) appModel.getPackageDownloads())}));
        if (!appModel.hasSplits()) {
            this.sizeInfo.setText(AptoideUtils.StringU.formatBytes(appModel.getSize(), false));
        } else {
            this.sizeInfo.setVisibility(8);
            this.iconSizeInfo.setVisibility(8);
        }
        if (appModel.getRating().getAverage() == 0.0f) {
            this.ratingInfo.setText(C1086R.string.appcardview_title_no_stars);
        } else {
            this.ratingInfo.setText(this.oneDecimalFormat.format((double) appModel.getRating().getAverage()));
        }
        if (getArguments().getFloat(BundleKeys.APPC.name(), -1.0f) != -1.0f) {
            this.versionsLayout.setVisibility(8);
            this.rewardAppLatestVersion.setVisibility(0);
            String versionName = appModel.getVersionName();
            String format = String.format(getResources().getString(C1086R.string.appview_latest_version_with_value), new Object[]{versionName});
            SpannableString spannableString = new SpannableString(format);
            spannableString.setSpan(new ForegroundColorSpan(getResources().getColor(C1086R.color.grey_medium)), format.indexOf(versionName), format.indexOf(versionName) + versionName.length(), 33);
            this.rewardAppLatestVersion.setText(spannableString);
        } else {
            this.latestVersion.setText(appModel.getVersionName());
            if (appModel.isBeta()) {
                this.latestVersion.setCompoundDrawablesWithIntrinsicBounds(C1086R.C1087drawable.ic_beta, 0, 0, 0);
                this.latestVersion.setCompoundDrawablePadding(8);
            }
            if (!appModel.isLatestTrustedVersion()) {
                this.latestVersionTitle.setText(getString(C1086R.string.appview_version_text));
                this.otherVersions.setText(getString(C1086R.string.newer_version_available));
            }
        }
        this.storeName.setText(appModel.getStore().getName());
        ImageLoader.with(getContext()).loadWithShadowCircleTransform(appModel.getStore().getAvatar(), this.storeIcon);
        this.storeDownloads.setText(String.format("%s", new Object[]{AptoideUtils.StringU.withSuffix(appModel.getStore().getStats().getDownloads())}));
        this.storeFollowers.setText(String.format("%s", new Object[]{AptoideUtils.StringU.withSuffix((long) appModel.getStore().getStats().getSubscribers())}));
        if (appModel.isStoreFollowed()) {
            this.storeFollow.setText(C1086R.string.followed);
        } else {
            this.storeFollow.setText(C1086R.string.follow);
        }
        if (appModel.hasDonations()) {
            this.donationsElement.setVisibility(0);
            this.donationsListLayout.setVisibility(0);
        }
        if ((appModel.getMedia().getScreenshots() == null || appModel.getMedia().getScreenshots().isEmpty()) && (appModel.getMedia().getVideos() == null || appModel.getMedia().getVideos().isEmpty())) {
            this.screenshots.setVisibility(8);
        } else {
            this.screenshotsAdapter.updateScreenshots(appModel.getMedia().getScreenshots());
            this.screenshotsAdapter.updateVideos(appModel.getMedia().getVideos());
        }
        if (appModel.isEskills()) {
            this.eSkillsView.setVisibility(0);
            TextView textView = this.eSkillsInAppMessage;
            textView.setText(getString(C1086R.string.eskills_header) + " - " + getString(C1086R.string.appc_message_appview_appcoins_iab));
            this.iabInfo.setVisibility(8);
        } else if (appModel.hasBilling()) {
            this.iabInfo.setVisibility(0);
        }
        setTrustedBadge(appModel.getMalware());
        setDescription(appModel.getMedia().getDescription());
        setAppFlags(appModel.isGoodApp(), appModel.getAppFlags());
        setReadMoreClickListener(appModel.getAppName(), appModel.getMedia(), appModel.getStore(), appModel.isAppCoinApp());
        setDeveloperDetails(appModel.getDeveloper());
        showAppViewLayout();
    }

    public void showAppcWalletPromotionView(Promotion promotion, WalletApp walletApp, Promotion.ClaimAction claimAction, DownloadModel downloadModel) {
        this.walletPromotionCancelButton.setOnClickListener(new C1462b1(this, promotion, walletApp));
        if (walletApp.isInstalled()) {
            if (!downloadModel.getAction().equals(DownloadModel.Action.OPEN)) {
                setupInstallDependencyApp(promotion, downloadModel);
            } else {
                setupClaimWalletPromotion(promotion, walletApp);
            }
        } else if (walletApp.getDownloadModel().isDownloading()) {
            setupActiveWalletPromotion(promotion, walletApp, downloadModel);
        } else {
            setupInactiveWalletPromotion(promotion, walletApp, downloadModel);
        }
        this.promotionView.setVisibility(0);
    }

    public void showDonations(List<Donation> list) {
        this.donationsProgress.setVisibility(8);
        if (list == null || list.isEmpty()) {
            this.donationsListEmptyState.setVisibility(0);
            return;
        }
        this.donationsAdapter.setDonations(list);
        this.donationsList.setVisibility(0);
    }

    public C5368e<Boolean> showDowngradeMessage() {
        return GenericDialogs.createGenericContinueCancelMessage(getContext(), (String) null, getContext().getResources().getString(C1086R.string.downgrade_warning_dialog), this.themeManager.getAttributeForTheme(C1086R.attr.dialogsTheme).resourceId).mo18694j(C1591h0.f4128f);
    }

    public void showDowngradingMessage() {
        Snackbar.m28075a(getView(), (int) C1086R.string.downgrading_msg, -1).mo31972k();
    }

    public void showDownloadAppModel(DownloadModel downloadModel, AppCoinsViewModel appCoinsViewModel, boolean z) {
        DownloadModel.Action action2 = downloadModel.getAction();
        this.action = action2;
        if (!action2.equals(DownloadModel.Action.MIGRATE)) {
            showAppcInfo(appCoinsViewModel.getAdvertisingModel().getHasAdvertising(), appCoinsViewModel.hasBilling(), appCoinsViewModel.getAdvertisingModel().getAppcReward(), appCoinsViewModel.getAdvertisingModel().getFiatReward(), appCoinsViewModel.getAdvertisingModel().getFiatCurrency(), appCoinsViewModel.getAdvertisingModel().getAppcBudget(), appCoinsViewModel.getAdvertisingModel().getEndDate());
        }
        if (downloadModel.isDownloadingOrInstalling()) {
            this.downloadInfoLayout.setVisibility(0);
            this.install.setVisibility(8);
            setDownloadState(downloadModel.getProgress(), downloadModel.getDownloadState(), downloadModel.getAppSize(), z);
            return;
        }
        if (this.action.equals(DownloadModel.Action.MIGRATE)) {
            this.appcInfoView.setVisibility(8);
            this.appcMigrationWarningMessage.setVisibility(0);
        }
        this.downloadInfoLayout.setVisibility(8);
        this.install.setVisibility(0);
        setButtonText(downloadModel);
    }

    public void showDownloadError(DownloadModel downloadModel) {
        if (downloadModel.hasError()) {
            handleDownloadError(downloadModel.getDownloadState());
        }
    }

    public void showDownloadingSimilarApps(boolean z) {
        manageSimilarAppsVisibility(z, true);
    }

    public void showFlagVoteSubmittedMessage() {
        Toast.makeText(getContext(), C1086R.string.vote_submitted, 0).show();
    }

    public void showGenericErrorDialog() {
        showErrorDialog("", getContext().getString(C1086R.string.error_occured));
    }

    public void showInvalidAppInfoErrorDialog() {
        showErrorDialog("", getContext().getString(C1086R.string.appview_download_error_missing_splits));
    }

    public void showLoading() {
        this.viewProgress.setVisibility(0);
        this.appview.setVisibility(8);
        this.errorView.setVisibility(8);
    }

    public C5368e<Void> showOpenAndInstallApkFyDialog(String str, String str2, double d, float f, String str3, int i) {
        return createCustomDialogForApkfy(str2, d, f, str3, i).mo18681d(C1442a0.f3940f).mo18694j(C1645k0.f4196f);
    }

    public C5368e<Void> showOpenAndInstallDialog(String str, String str2) {
        return GenericDialogs.createGenericOkCancelMessage(getContext(), str, getContext().getString(C1086R.string.installapp_alrt, new Object[]{str2}), this.themeManager.getAttributeForTheme(C1086R.attr.dialogsTheme).resourceId).mo18681d(C1847v.f4442f).mo18694j(C1626j.f4174f);
    }

    public C5368e<GenericDialogs.EResponse> showRateDialog(String str, String str2, String str3) {
        return this.dialogUtils.showRateDialog(getActivity(), str, str2, str3);
    }

    public C5368e<Boolean> showRootInstallWarningPopup() {
        return GenericDialogs.createGenericYesNoCancelMessage(getContext(), (String) null, getResources().getString(C1086R.string.root_access_dialog), this.themeManager.getAttributeForTheme(C1086R.attr.dialogsTheme).resourceId).mo18694j(C1497d0.f4008f);
    }

    public void showShareOnTvDialog(long j) {
        if (AptoideUtils.SystemU.getConnectionType((ConnectivityManager) getContext().getSystemService("connectivity")).equals("mobile")) {
            GenericDialogs.createGenericOkMessage(getContext(), getContext().getString(C1086R.string.remote_install_menu_title), getContext().getString(C1086R.string.install_on_tv_mobile_error), this.themeManager.getAttributeForTheme(C1086R.attr.dialogsTheme).resourceId).mo18655a(C1865w.f4462f, (C5378b<Throwable>) C1886x0.f4487f);
        } else {
            RemoteInstallDialog.newInstance(j).show(getActivity().getSupportFragmentManager(), RemoteInstallDialog.class.getSimpleName());
        }
    }

    public void showTrustedDialog(AppModel appModel) {
        DialogBadgeV7.newInstance(this.marketName, appModel.getMalware(), appModel.getAppName(), appModel.getMalware().getRank()).show(getFragmentManager(), BADGE_DIALOG_TAG);
    }

    public C5368e<Boolean> similarAppsVisibilityFromInstallClick() {
        return this.similarAppsVisibilitySubject;
    }

    /* renamed from: f */
    public /* synthetic */ void mo7240f(Promotion promotion, WalletApp walletApp, View view) {
        this.promotionAppClick.onNext(new PromotionEvent(promotion, walletApp, PromotionEvent.ClickType.CLAIM));
    }

    /* renamed from: e */
    static /* synthetic */ Boolean m4618e(PromotionEvent promotionEvent) {
        return Boolean.valueOf(promotionEvent.getClickType() == PromotionEvent.ClickType.DISMISS);
    }

    /* renamed from: c */
    static /* synthetic */ Boolean m4612c(PromotionEvent promotionEvent) {
        return Boolean.valueOf(promotionEvent.getClickType() == PromotionEvent.ClickType.CLAIM);
    }

    /* renamed from: d */
    public /* synthetic */ void mo7228d(Promotion promotion, WalletApp walletApp, View view) {
        this.promotionAppClick.onNext(new PromotionEvent(promotion, walletApp, PromotionEvent.ClickType.RESUME_DOWNLOAD));
    }

    /* renamed from: e */
    public /* synthetic */ void mo7236e(Promotion promotion, WalletApp walletApp, View view) {
        this.promotionAppClick.onNext(new PromotionEvent(promotion, walletApp, PromotionEvent.ClickType.PAUSE_DOWNLOAD));
    }

    /* access modifiers changed from: protected */
    public void showHideOptionsMenu(MenuItem menuItem, boolean z) {
        if (menuItem != null) {
            menuItem.setVisible(z);
        }
    }

    /* renamed from: b */
    public /* synthetic */ void mo7193b() {
        NestedScrollView nestedScrollView = this.scrollView;
        if (nestedScrollView != null) {
            nestedScrollView.scrollTo(0, this.scrollViewY);
        }
    }

    /* renamed from: c */
    public /* synthetic */ void mo7197c(Promotion promotion, WalletApp walletApp, View view) {
        this.promotionAppClick.onNext(new PromotionEvent(promotion, walletApp, PromotionEvent.ClickType.CANCEL_DOWNLOAD));
    }

    /* renamed from: g */
    public /* synthetic */ void mo7241g(Promotion promotion, WalletApp walletApp, View view) {
        this.promotionAppClick.onNext(new PromotionEvent(promotion, walletApp, PromotionEvent.ClickType.INSTALL_APP));
    }

    /* renamed from: b */
    public /* synthetic */ void mo7195b(Promotion promotion, WalletApp walletApp, View view) {
        this.promotionAppClick.onNext(new PromotionEvent(promotion, walletApp, PromotionEvent.ClickType.PAUSE_DOWNLOAD));
    }

    /* renamed from: b */
    public /* synthetic */ DownloadModel.Action mo7192b(DownloadModel.Action action2) {
        return this.action;
    }

    /* renamed from: a */
    public /* synthetic */ void mo7184a(View view, AppBarLayout appBarLayout, int i) {
        float abs = ((float) Math.abs(i)) / ((float) appBarLayout.getTotalScrollRange());
        float f = 1.0f - (1.2f * abs);
        view.findViewById(C1086R.C1088id.app_icon).setAlpha(f);
        view.findViewById(C1086R.C1088id.app_name).setAlpha(f);
        this.bonusAppcView.setAlpha(f);
        BonusAppcView bonusAppcView2 = this.bonusAppcView;
        bonusAppcView2.setTranslationX((-(1.15f * abs)) * ((float) bonusAppcView2.getMeasuredWidth()));
        ((ToolbarArcBackground) view.findViewById(C1086R.C1088id.toolbar_background_arc)).setScale(abs);
        this.collapsingAppcBackground.setAlpha(1.0f - abs);
    }

    /* renamed from: a */
    public /* synthetic */ void mo7183a(View view) {
        this.loginSnackClick.onNext(null);
    }

    /* renamed from: a */
    public /* synthetic */ Boolean mo7182a(C10706f fVar) {
        return Boolean.valueOf(isSimilarAppsVisible());
    }

    /* renamed from: a */
    public /* synthetic */ void mo7187a(SearchAdResult searchAdResult) {
        ReferrerUtils.extractReferrer(searchAdResult, 2, false, this.adsRepository, this.httpClient, this.converterFactory, this.qManager, getContext().getApplicationContext(), ((AptoideApplication) getContext().getApplicationContext()).getDefaultSharedPreferences(), new MinimalAdMapper(), this.roomStoredMinimalAdPersistence);
    }

    /* renamed from: a */
    static /* synthetic */ Boolean m4603a(PromotionEvent promotionEvent) {
        return Boolean.valueOf(promotionEvent.getClickType() == PromotionEvent.ClickType.CANCEL_DOWNLOAD);
    }

    /* renamed from: a */
    public /* synthetic */ void mo7186a(Promotion promotion, WalletApp walletApp, View view) {
        this.promotionAppClick.onNext(new PromotionEvent(promotion, walletApp, PromotionEvent.ClickType.PAUSE_DOWNLOAD));
    }

    /* renamed from: a */
    public /* synthetic */ void mo7189a(String str, AppMedia appMedia, Store store, boolean z, View view) {
        this.readMoreClick.onNext(new ReadMoreClickEvent(str, appMedia.getDescription(), store.getAppearance().getTheme(), z));
    }

    /* renamed from: a */
    public /* synthetic */ DownloadModel.Action mo7181a(DownloadModel.Action action2) {
        return this.action;
    }

    /* renamed from: a */
    static /* synthetic */ void m4606a(Throwable th) {
        new OnErrorNotImplementedException(th);
    }

    /* renamed from: a */
    public /* synthetic */ void mo7188a(String str, float f, double d, int i, String str2, C12475j jVar) {
        View inflate = LayoutInflater.from(getContext()).inflate(C1086R.layout.apkfy_new_dialog, (ViewGroup) null);
        C0074c.C0075a aVar = new C0074c.C0075a(getContext());
        aVar.mo229b(inflate);
        C0074c a = aVar.mo225a();
        ((TextView) inflate.findViewById(C1086R.C1088id.app_name)).setText(str);
        ((TextView) inflate.findViewById(C1086R.C1088id.app_rating)).setText(this.oneDecimalFormat.format((double) f));
        if (d > 0.0d) {
            ((TextView) inflate.findViewById(C1086R.C1088id.appc_value)).setText(new DecimalFormat("0.00").format(d));
        } else {
            inflate.findViewById(C1086R.C1088id.appc_layout).setVisibility(8);
        }
        ((TextView) inflate.findViewById(C1086R.C1088id.app_downloads)).setText(String.format("%s %s", new Object[]{AptoideUtils.StringU.withSuffix((long) i), getResources().getString(C1086R.string.downloads)}));
        ImageLoader.with(getContext()).load(str2, (ImageView) inflate.findViewById(C1086R.C1088id.app_icon));
        inflate.findViewById(C1086R.C1088id.positive_button).setOnClickListener(new C1590h(this, jVar, str, a));
        inflate.findViewById(C1086R.C1088id.negative_button).setOnClickListener(new C1753q0(jVar));
        a.getClass();
        jVar.add(C12889e.m41501a(new C1846ug(a)));
        a.show();
    }

    /* renamed from: a */
    public /* synthetic */ void mo7190a(C12475j jVar, String str, C0074c cVar, View view) {
        jVar.onNext(GenericDialogs.EResponse.YES);
        this.apkfyDialogConfirmSubject.onNext(str);
        jVar.onCompleted();
        cVar.dismiss();
    }

    /* renamed from: a */
    static /* synthetic */ void m4607a(C12475j jVar, View view) {
        jVar.onNext(GenericDialogs.EResponse.CANCEL);
        jVar.onCompleted();
    }
}
