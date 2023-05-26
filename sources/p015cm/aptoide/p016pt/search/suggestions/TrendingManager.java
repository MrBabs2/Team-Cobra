package p015cm.aptoide.p016pt.search.suggestions;

import java.util.List;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.listapp.App;
import p015cm.aptoide.p016pt.search.model.Suggestion;
import p123rx.Single;

/* renamed from: cm.aptoide.pt.search.suggestions.TrendingManager */
public class TrendingManager {
    private static final int SUGGESTION_COUNT = 10;
    private static final int SUGGESTION_STORE_ID = 15;
    private final TrendingService trendingService;

    public TrendingManager(TrendingService trendingService2) {
        this.trendingService = trendingService2;
    }

    /* renamed from: a */
    static /* synthetic */ Iterable m7035a(List list) {
        return list;
    }

    /* renamed from: b */
    static /* synthetic */ Iterable m7037b(List list) {
        return list;
    }

    /* access modifiers changed from: private */
    /* renamed from: mapToSuggestion */
    public Suggestion mo14274a(App app) {
        return new Suggestion(app.getName(), app.getIcon());
    }

    public Single<List<String>> getTrendingCursorSuggestions() {
        return this.trendingService.getTrendingApps(10, 15).mo18694j(C4000f.f7086f).mo18691h(C3998d.f7084f).mo18694j(C3999e.f7085f).mo18698l().mo18669c().mo18700m();
    }

    public Single<List<Suggestion>> getTrendingListSuggestions() {
        return this.trendingService.getTrendingApps(10, 15).mo18694j(C3997c.f7083f).mo18691h(C4001g.f7087f).mo18694j(new C4002h(this)).mo18698l().mo18669c().mo18700m();
    }
}
