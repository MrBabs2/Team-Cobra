package p015cm.aptoide.p016pt.app.view.similar.bundles;

import android.graphics.Rect;
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
import p123rx.p127s.C12871b;

/* renamed from: cm.aptoide.pt.app.view.similar.bundles.SimilarAppsViewHolder */
public class SimilarAppsViewHolder extends SimilarBundleViewHolder {
    private AppViewSimilarAppsAdapter adapter;
    private final DecimalFormat oneDecimalFormat;
    private final C12871b<SimilarAppClickEvent> similarAppClick;
    private final RecyclerView similarApps;

    public SimilarAppsViewHolder(View view, DecimalFormat decimalFormat, C12871b<SimilarAppClickEvent> bVar) {
        super(view);
        this.oneDecimalFormat = decimalFormat;
        this.similarAppClick = bVar;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C1086R.C1088id.similar_list);
        this.similarApps = recyclerView;
        recyclerView.setNestedScrollingEnabled(false);
        this.similarApps.addItemDecoration(new RecyclerView.C0643n() {
            public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0662z zVar) {
                int pixelsForDip = AptoideUtils.ScreenU.getPixelsForDip(5, view.getResources());
                rect.set(pixelsForDip, pixelsForDip, 0, pixelsForDip);
            }
        });
        this.similarApps.setLayoutManager(new LinearLayoutManager(view.getContext(), 0, false));
        new SnapToStartHelper().attachToRecyclerView(this.similarApps);
    }

    private void setSimilarAdapter() {
        AppViewSimilarAppsAdapter appViewSimilarAppsAdapter = new AppViewSimilarAppsAdapter(Collections.emptyList(), this.oneDecimalFormat, this.similarAppClick, AppViewSimilarAppsAdapter.SimilarAppType.SIMILAR_APPS);
        this.adapter = appViewSimilarAppsAdapter;
        this.similarApps.setAdapter(appViewSimilarAppsAdapter);
    }

    public void setBundle(SimilarAppsBundle similarAppsBundle, int i) {
        if (this.adapter == null) {
            setSimilarAdapter();
        }
        this.adapter.update(mapToSimilar(similarAppsBundle.getContent(), similarAppsBundle.getContent().hasAd()));
    }
}
