package p015cm.aptoide.p016pt.home.bundles;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.text.DecimalFormat;
import java.util.List;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.editorial.CaptionBackgroundPainter;
import p015cm.aptoide.p016pt.home.bundles.ads.AdClick;
import p015cm.aptoide.p016pt.home.bundles.ads.AdsBundlesViewHolderFactory;
import p015cm.aptoide.p016pt.home.bundles.ads.WalletAdsOfferViewHolder;
import p015cm.aptoide.p016pt.home.bundles.appcoins.EarnAppCoinsViewHolder;
import p015cm.aptoide.p016pt.home.bundles.appcoins.FeaturedAppcViewHolder;
import p015cm.aptoide.p016pt.home.bundles.apps.AppsBundleViewHolder;
import p015cm.aptoide.p016pt.home.bundles.apps.EskillsAppsBundleViewHolder;
import p015cm.aptoide.p016pt.home.bundles.base.ActionBundle;
import p015cm.aptoide.p016pt.home.bundles.base.AppBundleViewHolder;
import p015cm.aptoide.p016pt.home.bundles.base.AppComingSoonPromotionalBundle;
import p015cm.aptoide.p016pt.home.bundles.base.HomeBundle;
import p015cm.aptoide.p016pt.home.bundles.base.HomeEvent;
import p015cm.aptoide.p016pt.home.bundles.editorial.EditorialBundleViewHolder;
import p015cm.aptoide.p016pt.home.bundles.editorschoice.EditorsBundleViewHolder;
import p015cm.aptoide.p016pt.home.bundles.info.InfoBundleViewHolder;
import p015cm.aptoide.p016pt.home.bundles.misc.ErrorHomeBundle;
import p015cm.aptoide.p016pt.home.bundles.misc.LoadingBundleViewHolder;
import p015cm.aptoide.p016pt.home.bundles.misc.LoadingMoreErrorViewHolder;
import p015cm.aptoide.p016pt.home.bundles.misc.ProgressBundle;
import p015cm.aptoide.p016pt.home.bundles.promotional.ComingSoonViewHolder;
import p015cm.aptoide.p016pt.home.bundles.promotional.EventViewHolder;
import p015cm.aptoide.p016pt.home.bundles.promotional.NewAppVersionViewHolder;
import p015cm.aptoide.p016pt.home.bundles.promotional.NewAppViewHolder;
import p015cm.aptoide.p016pt.home.bundles.promotional.NewsViewHolder;
import p015cm.aptoide.p016pt.home.bundles.top.TopBundleViewHolder;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p123rx.p127s.C12871b;

/* renamed from: cm.aptoide.pt.home.bundles.BundlesAdapter */
public class BundlesAdapter extends RecyclerView.C0633g<AppBundleViewHolder> {
    private static final int ADS = 3;
    private static final int APPS = 2;
    private static final int APP_COMING_SOON = 18;
    private static final int EARN_APPCOINS = 11;
    private static final int EDITORIAL = 5;
    private static final int EDITORS = 1;
    private static final int ESKILLS = 17;
    private static final int EVENT = 16;
    private static final int FEATURED_BONUS_APPCOINS = 12;
    private static final int INFO = 6;
    private static final int LOADING = 4;
    private static final int LOAD_MORE_ERROR = 10;
    private static final int NEWS = 14;
    private static final int NEW_APP_VERSION = 15;
    private static final int NEW_PACKAGE = 13;
    private static final int TOP = 9;
    private static final int WALLET_ADS_OFFER = 8;
    private final AdsBundlesViewHolderFactory adsBundlesViewHolderFactory;
    private List<HomeBundle> bundles;
    private final CaptionBackgroundPainter captionBackgroundPainter;
    private final ErrorHomeBundle errorBundle;
    private final String marketName;
    private final DecimalFormat oneDecimalFormatter;
    private final ProgressBundle progressBundle;
    private final ThemeManager themeManager;
    private final C12871b<HomeEvent> uiEventsListener;

    /* renamed from: cm.aptoide.pt.home.bundles.BundlesAdapter$1 */
    static /* synthetic */ class C28721 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$home$bundles$base$HomeBundle$BundleType;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                cm.aptoide.pt.home.bundles.base.HomeBundle$BundleType[] r0 = p015cm.aptoide.p016pt.home.bundles.base.HomeBundle.BundleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$cm$aptoide$pt$home$bundles$base$HomeBundle$BundleType = r0
                cm.aptoide.pt.home.bundles.base.HomeBundle$BundleType r1 = p015cm.aptoide.p016pt.home.bundles.base.HomeBundle.BundleType.APPS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$cm$aptoide$pt$home$bundles$base$HomeBundle$BundleType     // Catch:{ NoSuchFieldError -> 0x001d }
                cm.aptoide.pt.home.bundles.base.HomeBundle$BundleType r1 = p015cm.aptoide.p016pt.home.bundles.base.HomeBundle.BundleType.APPCOINS_ADS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$cm$aptoide$pt$home$bundles$base$HomeBundle$BundleType     // Catch:{ NoSuchFieldError -> 0x0028 }
                cm.aptoide.pt.home.bundles.base.HomeBundle$BundleType r1 = p015cm.aptoide.p016pt.home.bundles.base.HomeBundle.BundleType.FEATURED_BONUS_APPC     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$cm$aptoide$pt$home$bundles$base$HomeBundle$BundleType     // Catch:{ NoSuchFieldError -> 0x0033 }
                cm.aptoide.pt.home.bundles.base.HomeBundle$BundleType r1 = p015cm.aptoide.p016pt.home.bundles.base.HomeBundle.BundleType.NEW_APP     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$cm$aptoide$pt$home$bundles$base$HomeBundle$BundleType     // Catch:{ NoSuchFieldError -> 0x003e }
                cm.aptoide.pt.home.bundles.base.HomeBundle$BundleType r1 = p015cm.aptoide.p016pt.home.bundles.base.HomeBundle.BundleType.NEWS_ITEM     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$cm$aptoide$pt$home$bundles$base$HomeBundle$BundleType     // Catch:{ NoSuchFieldError -> 0x0049 }
                cm.aptoide.pt.home.bundles.base.HomeBundle$BundleType r1 = p015cm.aptoide.p016pt.home.bundles.base.HomeBundle.BundleType.IN_GAME_EVENT     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = $SwitchMap$cm$aptoide$pt$home$bundles$base$HomeBundle$BundleType     // Catch:{ NoSuchFieldError -> 0x0054 }
                cm.aptoide.pt.home.bundles.base.HomeBundle$BundleType r1 = p015cm.aptoide.p016pt.home.bundles.base.HomeBundle.BundleType.NEW_APP_VERSION     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = $SwitchMap$cm$aptoide$pt$home$bundles$base$HomeBundle$BundleType     // Catch:{ NoSuchFieldError -> 0x0060 }
                cm.aptoide.pt.home.bundles.base.HomeBundle$BundleType r1 = p015cm.aptoide.p016pt.home.bundles.base.HomeBundle.BundleType.EDITORS     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = $SwitchMap$cm$aptoide$pt$home$bundles$base$HomeBundle$BundleType     // Catch:{ NoSuchFieldError -> 0x006c }
                cm.aptoide.pt.home.bundles.base.HomeBundle$BundleType r1 = p015cm.aptoide.p016pt.home.bundles.base.HomeBundle.BundleType.ADS     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = $SwitchMap$cm$aptoide$pt$home$bundles$base$HomeBundle$BundleType     // Catch:{ NoSuchFieldError -> 0x0078 }
                cm.aptoide.pt.home.bundles.base.HomeBundle$BundleType r1 = p015cm.aptoide.p016pt.home.bundles.base.HomeBundle.BundleType.INFO_BUNDLE     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = $SwitchMap$cm$aptoide$pt$home$bundles$base$HomeBundle$BundleType     // Catch:{ NoSuchFieldError -> 0x0084 }
                cm.aptoide.pt.home.bundles.base.HomeBundle$BundleType r1 = p015cm.aptoide.p016pt.home.bundles.base.HomeBundle.BundleType.LOADING     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = $SwitchMap$cm$aptoide$pt$home$bundles$base$HomeBundle$BundleType     // Catch:{ NoSuchFieldError -> 0x0090 }
                cm.aptoide.pt.home.bundles.base.HomeBundle$BundleType r1 = p015cm.aptoide.p016pt.home.bundles.base.HomeBundle.BundleType.EDITORIAL     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = $SwitchMap$cm$aptoide$pt$home$bundles$base$HomeBundle$BundleType     // Catch:{ NoSuchFieldError -> 0x009c }
                cm.aptoide.pt.home.bundles.base.HomeBundle$BundleType r1 = p015cm.aptoide.p016pt.home.bundles.base.HomeBundle.BundleType.WALLET_ADS_OFFER     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = $SwitchMap$cm$aptoide$pt$home$bundles$base$HomeBundle$BundleType     // Catch:{ NoSuchFieldError -> 0x00a8 }
                cm.aptoide.pt.home.bundles.base.HomeBundle$BundleType r1 = p015cm.aptoide.p016pt.home.bundles.base.HomeBundle.BundleType.TOP     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = $SwitchMap$cm$aptoide$pt$home$bundles$base$HomeBundle$BundleType     // Catch:{ NoSuchFieldError -> 0x00b4 }
                cm.aptoide.pt.home.bundles.base.HomeBundle$BundleType r1 = p015cm.aptoide.p016pt.home.bundles.base.HomeBundle.BundleType.LOAD_MORE_ERROR     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = $SwitchMap$cm$aptoide$pt$home$bundles$base$HomeBundle$BundleType     // Catch:{ NoSuchFieldError -> 0x00c0 }
                cm.aptoide.pt.home.bundles.base.HomeBundle$BundleType r1 = p015cm.aptoide.p016pt.home.bundles.base.HomeBundle.BundleType.ESKILLS     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = $SwitchMap$cm$aptoide$pt$home$bundles$base$HomeBundle$BundleType     // Catch:{ NoSuchFieldError -> 0x00cc }
                cm.aptoide.pt.home.bundles.base.HomeBundle$BundleType r1 = p015cm.aptoide.p016pt.home.bundles.base.HomeBundle.BundleType.APP_COMING_SOON     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.home.bundles.BundlesAdapter.C28721.<clinit>():void");
        }
    }

    public BundlesAdapter(List<HomeBundle> list, ProgressBundle progressBundle2, ErrorHomeBundle errorHomeBundle, DecimalFormat decimalFormat, C12871b<HomeEvent> bVar, AdsBundlesViewHolderFactory adsBundlesViewHolderFactory2, CaptionBackgroundPainter captionBackgroundPainter2, String str, ThemeManager themeManager2) {
        this.bundles = list;
        this.progressBundle = progressBundle2;
        this.errorBundle = errorHomeBundle;
        this.uiEventsListener = bVar;
        this.oneDecimalFormatter = decimalFormat;
        this.marketName = str;
        this.adsBundlesViewHolderFactory = adsBundlesViewHolderFactory2;
        this.captionBackgroundPainter = captionBackgroundPainter2;
        this.themeManager = themeManager2;
    }

    public void add(List<HomeBundle> list) {
        int size = this.bundles.size();
        this.bundles.addAll(list);
        notifyItemRangeInserted(size, list.size());
    }

    public void addHighlightedAd(AdClick adClick) {
        for (HomeBundle next : this.bundles) {
            if (next.getType() == HomeBundle.BundleType.ADS) {
                List<?> content = next.getContent();
                if (content != null) {
                    int i = 0;
                    while (true) {
                        if (i >= content.size()) {
                            break;
                        } else if (((AdClick) content.get(i)).getAd().getPackageName().equals(adClick.getAd().getPackageName())) {
                            content.remove(i);
                            break;
                        } else {
                            i++;
                        }
                    }
                    content.add(0, adClick);
                } else {
                    return;
                }
            }
        }
        notifyDataSetChanged();
    }

    public void addLoadMore() {
        if (getLoadingPosition() < 0) {
            this.bundles.add(this.progressBundle);
            notifyItemInserted(this.bundles.size() - 1);
        }
    }

    public HomeBundle getBundle(int i) {
        return this.bundles.get(i);
    }

    public int getItemCount() {
        return this.bundles.size();
    }

    public int getItemViewType(int i) {
        switch (C28721.$SwitchMap$cm$aptoide$pt$home$bundles$base$HomeBundle$BundleType[this.bundles.get(i).getType().ordinal()]) {
            case 1:
                return 2;
            case 2:
                return 11;
            case 3:
                return 12;
            case 4:
                return 13;
            case 5:
                return 14;
            case 6:
                return 16;
            case 7:
                return 15;
            case 8:
                return 1;
            case 9:
                return 3;
            case 10:
                return 6;
            case 11:
                return 4;
            case 12:
                return 5;
            case 13:
                return 8;
            case 14:
                return 9;
            case 15:
                return 10;
            case 16:
                return 17;
            case 17:
                return 18;
            default:
                throw new IllegalStateException("Bundle type not supported by the adapter: " + this.bundles.get(i).getType().name());
        }
    }

    public synchronized int getLoadingPosition() {
        for (int size = this.bundles.size() - 1; size >= 0; size--) {
            if (this.bundles.get(size) instanceof ProgressBundle) {
                return size;
            }
        }
        return -1;
    }

    public boolean isLoaded() {
        List<HomeBundle> list = this.bundles;
        if (list == null || list.isEmpty()) {
            return false;
        }
        for (HomeBundle content : this.bundles) {
            if (content.getContent() == null) {
                return false;
            }
        }
        return true;
    }

    public void remove(int i) {
        this.bundles.remove(i);
        notifyItemRemoved(i);
    }

    public void removeLoadMore() {
        int loadingPosition = getLoadingPosition();
        if (loadingPosition >= 0) {
            this.bundles.remove(loadingPosition);
            notifyItemRemoved(loadingPosition);
        }
    }

    public void removeLoadMoreError() {
        remove(this.bundles.size() - 1);
    }

    public void showLoadMoreError() {
        this.bundles.add(this.errorBundle);
        notifyItemInserted(this.bundles.indexOf(this.errorBundle));
    }

    public void update(List<HomeBundle> list) {
        this.bundles = list;
        notifyDataSetChanged();
    }

    public void updateAppComingSoonCard(AppComingSoonPromotionalBundle appComingSoonPromotionalBundle, boolean z) {
        int indexOf = this.bundles.indexOf(appComingSoonPromotionalBundle);
        ((AppComingSoonPromotionalBundle) this.bundles.get(indexOf)).setRegisteredForNotification(z);
        notifyItemChanged(indexOf);
    }

    public synchronized void updateEditorials() {
        for (int i = 0; i < this.bundles.size(); i++) {
            if (this.bundles.get(i) instanceof ActionBundle) {
                notifyItemChanged(i);
            }
        }
    }

    public void onBindViewHolder(AppBundleViewHolder appBundleViewHolder, int i) {
        appBundleViewHolder.setBundle(this.bundles.get(i), i);
    }

    public AppBundleViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        switch (i) {
            case 1:
                return new EditorsBundleViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C1086R.layout.editors_choice_bundle_item, viewGroup, false), this.uiEventsListener, this.oneDecimalFormatter, this.marketName);
            case 2:
                return new AppsBundleViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C1086R.layout.apps_bundle_item, viewGroup, false), this.uiEventsListener, this.oneDecimalFormatter, this.marketName);
            case 3:
                return this.adsBundlesViewHolderFactory.createViewHolder(viewGroup);
            case 4:
                return new LoadingBundleViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C1086R.layout.progress_item, viewGroup, false));
            case 5:
                return new EditorialBundleViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C1086R.layout.editorial_action_item, viewGroup, false), this.uiEventsListener, this.captionBackgroundPainter, this.themeManager);
            case 6:
                return new InfoBundleViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C1086R.layout.info_action_item_card, viewGroup, false), this.uiEventsListener);
            case 8:
                return new WalletAdsOfferViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C1086R.layout.info_action_item_card, viewGroup, false), this.uiEventsListener);
            case 9:
                return new TopBundleViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C1086R.layout.top_bundle_item, viewGroup, false), this.uiEventsListener, this.oneDecimalFormatter, this.marketName);
            case 10:
                return new LoadingMoreErrorViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C1086R.layout.load_more_error, viewGroup, false), this.uiEventsListener);
            case 11:
                return new EarnAppCoinsViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C1086R.layout.bundle_earn_appcoins, viewGroup, false), new DecimalFormat("0.00"), this.uiEventsListener);
            case 12:
                return new FeaturedAppcViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C1086R.layout.bundle_featured_appcoins, viewGroup, false), this.oneDecimalFormatter, this.uiEventsListener);
            case 13:
                return new NewAppViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C1086R.layout.card_new_package, viewGroup, false), this.uiEventsListener);
            case 14:
                return new NewsViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C1086R.layout.card_news, viewGroup, false), this.uiEventsListener);
            case 15:
                return new NewAppVersionViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C1086R.layout.card_new_app_version, viewGroup, false), this.uiEventsListener);
            case 16:
                return new EventViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C1086R.layout.card_event, viewGroup, false), this.uiEventsListener);
            case 17:
                return new EskillsAppsBundleViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C1086R.layout.eskills_apps_bundle_item, viewGroup, false), this.uiEventsListener, this.oneDecimalFormatter);
            case 18:
                return new ComingSoonViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C1086R.layout.card_coming_soon, viewGroup, false), this.uiEventsListener);
            default:
                throw new IllegalStateException("Invalid bundle view type");
        }
    }
}
