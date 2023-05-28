package p015cm.aptoide.p016pt.search.analytics;

import java.util.HashMap;
import java.util.Map;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import p015cm.aptoide.p016pt.DeepLinkIntentReceiver;
import p015cm.aptoide.p016pt.search.model.SearchQueryModel;
import p015cm.aptoide.p016pt.search.model.Source;

/* renamed from: cm.aptoide.pt.search.analytics.SearchAnalytics */
public class SearchAnalytics {
    public static final String AB_SEARCH_ACTION = "AB_Search_Action";
    public static final String AB_SEARCH_IMPRESSION = "AB_Search_Impression";
    public static final String APP_CLICK = "Search_Results_App_View_Click";
    private static final String EMPTY = "empty";
    public static final String NO_RESULTS = "Search_No_Results";
    public static final String SEARCH = "Search";
    public static final String SEARCH_RESULT_CLICK = "Search_Result_Click";
    public static final String SEARCH_START = "Search_Start";
    private final AnalyticsManager analyticsManager;
    private final NavigationTracker navigationTracker;

    /* renamed from: cm.aptoide.pt.search.analytics.SearchAnalytics$1 */
    static /* synthetic */ class C39881 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$search$model$Source;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                cm.aptoide.pt.search.model.Source[] r0 = p015cm.aptoide.p016pt.search.model.Source.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$cm$aptoide$pt$search$model$Source = r0
                cm.aptoide.pt.search.model.Source r1 = p015cm.aptoide.p016pt.search.model.Source.FROM_TRENDING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$cm$aptoide$pt$search$model$Source     // Catch:{ NoSuchFieldError -> 0x001d }
                cm.aptoide.pt.search.model.Source r1 = p015cm.aptoide.p016pt.search.model.Source.FROM_AUTOCOMPLETE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$cm$aptoide$pt$search$model$Source     // Catch:{ NoSuchFieldError -> 0x0028 }
                cm.aptoide.pt.search.model.Source r1 = p015cm.aptoide.p016pt.search.model.Source.DEEPLINK     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$cm$aptoide$pt$search$model$Source     // Catch:{ NoSuchFieldError -> 0x0033 }
                cm.aptoide.pt.search.model.Source r1 = p015cm.aptoide.p016pt.search.model.Source.MANUAL     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.search.analytics.SearchAnalytics.C39881.<clinit>():void");
        }
    }

    /* renamed from: cm.aptoide.pt.search.analytics.SearchAnalytics$AttributeKey */
    private static final class AttributeKey {
        private static final String AB_TEST_GROUP = "ab_test_group";
        private static final String AB_TEST_ID = "ab_test_uid";
        private static final String IS_AD = "is_ad";
        private static final String IS_APPC = "is_appc";
        private static final String KEYWORD_INPUT = "inserted_keyword";
        private static final String PACKAGE_NAME = "package_name";
        private static final String POSITION = "position";
        private static final String QUERY = "search_term";
        private static final String SEARCH_TERM_POSITION = "search_term_position";
        private static final String SEARCH_TERM_SOURCE = "search_term_source";
        private static final String SOURCE = "source";

        private AttributeKey() {
        }
    }

    public SearchAnalytics(AnalyticsManager analyticsManager2, NavigationTracker navigationTracker2) {
        this.analyticsManager = analyticsManager2;
        this.navigationTracker = navigationTracker2;
    }

    private Map<String, Object> createMapData(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(str, str2);
        return hashMap;
    }

    private String getViewName(boolean z) {
        return this.navigationTracker.getViewName(z);
    }

    private String parseSource(Source source) {
        int i = C39881.$SwitchMap$cm$aptoide$pt$search$model$Source[source.ordinal()];
        if (i == 1) {
            return "trending";
        }
        if (i != 2) {
            return i != 3 ? "manual" : DeepLinkIntentReceiver.DEEP_LINK;
        }
        return "autocomplete";
    }

    public void search(SearchQueryModel searchQueryModel) {
        search(searchQueryModel, 0);
    }

    public void searchAdClick(SearchQueryModel searchQueryModel, String str, int i, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("search_term", searchQueryModel.getFinalQuery());
        hashMap.put("package_name", str);
        hashMap.put("is_ad", true);
        hashMap.put("position", Integer.valueOf(i));
        this.analyticsManager.logEvent(hashMap, APP_CLICK, AnalyticsManager.Action.CLICK, getViewName(true));
        sendRakkamSearchResults(searchQueryModel, false, str, true, z, i);
    }

    public void searchAppClick(SearchQueryModel searchQueryModel, String str, int i, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("search_term", searchQueryModel.getFinalQuery());
        hashMap.put("package_name", str);
        hashMap.put("is_ad", false);
        hashMap.put("position", Integer.valueOf(i));
        this.analyticsManager.logEvent(hashMap, APP_CLICK, AnalyticsManager.Action.CLICK, getViewName(true));
        sendRakkamSearchResults(searchQueryModel, false, str, false, z, i);
    }

    public void searchFromSuggestion(SearchQueryModel searchQueryModel, int i) {
        search(searchQueryModel, i);
    }

    public void searchNoResults(SearchQueryModel searchQueryModel) {
        this.analyticsManager.logEvent(createMapData("search_term", searchQueryModel.getFinalQuery()), NO_RESULTS, AnalyticsManager.Action.CLICK, getViewName(false));
        sendRakkamSearchResults(searchQueryModel, true, (String) null, false, false, 0);
    }

    public void searchStart(SearchSource searchSource, boolean z) {
        this.analyticsManager.logEvent(createMapData("source", searchSource.getIdentifier()), SEARCH_START, AnalyticsManager.Action.CLICK, getViewName(z));
    }

    public void sendRakkamSearchResults(SearchQueryModel searchQueryModel, boolean z, String str, boolean z2, boolean z3, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("search_term", searchQueryModel.getFinalQuery());
        hashMap.put("inserted_keyword", searchQueryModel.getUserQuery());
        hashMap.put("search_term_source", parseSource(searchQueryModel.getSource()));
        if (!z) {
            hashMap.put("package_name", str);
            hashMap.put("position", Integer.valueOf(i));
            hashMap.put("is_ad", Boolean.valueOf(z2));
            hashMap.put("is_appc", Boolean.valueOf(z3));
        } else {
            hashMap.put("package_name", EMPTY);
            hashMap.put("position", EMPTY);
            hashMap.put("is_ad", EMPTY);
            hashMap.put("is_appc", EMPTY);
        }
        this.analyticsManager.logEvent(hashMap, SEARCH_RESULT_CLICK, AnalyticsManager.Action.CLICK, getViewName(true));
    }

    private void search(SearchQueryModel searchQueryModel, int i) {
        HashMap hashMap = new HashMap();
        hashMap.put("search_term", searchQueryModel.getFinalQuery());
        hashMap.put("search_term_source", parseSource(searchQueryModel.getSource()));
        hashMap.put("inserted_keyword", searchQueryModel.getUserQuery());
        if (searchQueryModel.getSource() != Source.MANUAL) {
            hashMap.put("search_term_position", Integer.toString(i));
        }
        this.analyticsManager.logEvent(hashMap, SEARCH, AnalyticsManager.Action.CLICK, getViewName(false));
    }
}
