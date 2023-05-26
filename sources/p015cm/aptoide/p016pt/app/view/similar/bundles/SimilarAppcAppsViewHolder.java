package p015cm.aptoide.p016pt.app.view.similar.bundles;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.text.DecimalFormat;
import java.util.Collections;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.app.view.AppViewSimilarAppsAdapter;
import p015cm.aptoide.p016pt.app.view.similar.SimilarAppClickEvent;
import p015cm.aptoide.p016pt.app.view.similar.SimilarAppsBundle;
import p015cm.aptoide.p016pt.app.view.similar.SimilarBundleViewHolder;
import p015cm.aptoide.p016pt.home.SnapToStartHelper;
import p015cm.aptoide.p016pt.utils.AptoideUtils;
import p015cm.aptoide.p016pt.view.custom.HorizontalHeaderItemDecoration;
import p123rx.p127s.C12871b;

/* renamed from: cm.aptoide.pt.app.view.similar.bundles.SimilarAppcAppsViewHolder */
public class SimilarAppcAppsViewHolder extends SimilarBundleViewHolder {
    private AppViewSimilarAppsAdapter adapter;
    private final DecimalFormat oneDecimalFormat;
    private final C12871b<SimilarAppClickEvent> similarAppClick;
    private final RecyclerView similarAppcApps;

    public SimilarAppcAppsViewHolder(View view, DecimalFormat decimalFormat, C12871b<SimilarAppClickEvent> bVar) {
        super(view);
        this.oneDecimalFormat = decimalFormat;
        this.similarAppClick = bVar;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C1086R.C1088id.similar_appc_list);
        this.similarAppcApps = recyclerView;
        recyclerView.setNestedScrollingEnabled(false);
        this.similarAppcApps.addItemDecoration(new HorizontalHeaderItemDecoration(view.getContext(), this.similarAppcApps, C1086R.layout.appview_appc_similar_header, AptoideUtils.ScreenU.getPixelsForDip(112, view.getResources()), AptoideUtils.ScreenU.getPixelsForDip(5, view.getResources())));
        this.similarAppcApps.setLayoutManager(new LinearLayoutManager(view.getContext(), 0, false));
        new SnapToStartHelper().attachToRecyclerView(this.similarAppcApps);
        this.similarAppcApps.setAdapter(getSimilarAdapter());
    }

    private RecyclerView.C0633g getSimilarAdapter() {
        AppViewSimilarAppsAdapter appViewSimilarAppsAdapter = new AppViewSimilarAppsAdapter(Collections.emptyList(), this.oneDecimalFormat, this.similarAppClick, AppViewSimilarAppsAdapter.SimilarAppType.APPC_SIMILAR_APPS);
        this.adapter = appViewSimilarAppsAdapter;
        return appViewSimilarAppsAdapter;
    }

    public void setBundle(SimilarAppsBundle similarAppsBundle, int i) {
        this.adapter.update(mapToSimilar(similarAppsBundle.getContent(), false));
    }
}
