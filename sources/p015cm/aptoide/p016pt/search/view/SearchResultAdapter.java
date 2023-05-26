package p015cm.aptoide.p016pt.search.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C0688f;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.app.view.screenshots.ScreenShotClickEvent;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.download.view.DownloadClick;
import p015cm.aptoide.p016pt.search.SearchItemDiffCallback;
import p015cm.aptoide.p016pt.search.model.SearchAppResult;
import p015cm.aptoide.p016pt.search.model.SearchAppResultWrapper;
import p015cm.aptoide.p016pt.search.model.SearchItem;
import p015cm.aptoide.p016pt.search.model.SearchLoadingItem;
import p015cm.aptoide.p016pt.search.view.DiffUtilAdapter;
import p015cm.aptoide.p016pt.search.view.item.SearchLoadingViewHolder;
import p015cm.aptoide.p016pt.search.view.item.SearchResultItemView;
import p015cm.aptoide.p016pt.search.view.item.SearchResultViewHolder;
import p123rx.p127s.C12871b;

/* renamed from: cm.aptoide.pt.search.view.SearchResultAdapter */
public class SearchResultAdapter extends DiffUtilAdapter<SearchItem, SearchResultItemView> {
    private CrashReport crashReport;
    private final C12871b<DownloadClick> downloadClickPublishSubject;
    private final C12871b<SearchAppResultWrapper> onItemViewClick;
    private String query;
    private final C12871b<ScreenShotClickEvent> screenShotClick;
    private List<SearchItem> searchResults;

    /* renamed from: cm.aptoide.pt.search.view.SearchResultAdapter$1 */
    static /* synthetic */ class C40051 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$search$model$SearchItem$Type;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                cm.aptoide.pt.search.model.SearchItem$Type[] r0 = p015cm.aptoide.p016pt.search.model.SearchItem.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$cm$aptoide$pt$search$model$SearchItem$Type = r0
                cm.aptoide.pt.search.model.SearchItem$Type r1 = p015cm.aptoide.p016pt.search.model.SearchItem.Type.APP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$cm$aptoide$pt$search$model$SearchItem$Type     // Catch:{ NoSuchFieldError -> 0x001d }
                cm.aptoide.pt.search.model.SearchItem$Type r1 = p015cm.aptoide.p016pt.search.model.SearchItem.Type.LOADING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.search.view.SearchResultAdapter.C40051.<clinit>():void");
        }
    }

    public SearchResultAdapter(C12871b<SearchAppResultWrapper> bVar, C12871b<DownloadClick> bVar2, C12871b<ScreenShotClickEvent> bVar3, List<SearchItem> list, CrashReport crashReport2) {
        this.onItemViewClick = bVar;
        this.searchResults = list;
        this.crashReport = crashReport2;
        this.downloadClickPublishSubject = bVar2;
        this.screenShotClick = bVar3;
    }

    private boolean hasLoadingItem() {
        for (SearchItem searchItem : this.searchResults) {
            if (searchItem instanceof SearchLoadingItem) {
                return true;
            }
        }
        return false;
    }

    public void addResultForSearch(String str, List<SearchAppResult> list, boolean z) {
        this.query = str;
        ArrayList arrayList = new ArrayList(list);
        applyDiffUtil(new DiffUtilAdapter.DiffRequest(arrayList, new SearchItemDiffCallback(new ArrayList(this.searchResults), arrayList)));
    }

    public void dispatchUpdates(List<? extends SearchItem> list, C0688f.C0691c cVar) {
        this.searchResults = list;
        cVar.mo4202a((RecyclerView.C0633g) this);
    }

    public int getItemCount() {
        return this.searchResults.size();
    }

    public int getItemViewType(int i) {
        return C40051.$SwitchMap$cm$aptoide$pt$search$model$SearchItem$Type[this.searchResults.get(i).getType().ordinal()] != 1 ? C1086R.layout.search_ad_loading_list_item : C1086R.layout.search_app_row;
    }

    public void setMoreLoading() {
        if (!hasLoadingItem()) {
            ArrayList arrayList = new ArrayList(this.searchResults);
            arrayList.add(new SearchLoadingItem());
            applyDiffUtil(new DiffUtilAdapter.DiffRequest(arrayList, new SearchItemDiffCallback(new ArrayList(this.searchResults), arrayList)));
        }
    }

    public void setResultForSearch(RecyclerView recyclerView, String str, List<SearchAppResult> list, boolean z) {
        this.query = str;
        this.searchResults = new ArrayList(list);
        recyclerView.getRecycledViewPool().mo3977b();
        notifyDataSetChanged();
    }

    public SearchResultItemView onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
        if (i != C1086R.layout.search_app_row) {
            return new SearchLoadingViewHolder(inflate);
        }
        return new SearchResultViewHolder(inflate, this.onItemViewClick, this.downloadClickPublishSubject, this.screenShotClick, this.query);
    }

    public void onBindViewHolder(SearchResultItemView searchResultItemView, int i) {
        try {
            searchResultItemView.setup(this.searchResults.get(i));
        } catch (ClassCastException e) {
            this.crashReport.log(e);
        }
    }

    public void onBindViewHolder(SearchResultItemView searchResultItemView, int i, List<Object> list) {
        if (!(searchResultItemView instanceof SearchResultViewHolder) || list.isEmpty()) {
            super.onBindViewHolder(searchResultItemView, i, list);
        } else {
            ((SearchResultViewHolder) searchResultItemView).setDownloadStatus((SearchAppResult) list.get(0));
        }
    }
}
