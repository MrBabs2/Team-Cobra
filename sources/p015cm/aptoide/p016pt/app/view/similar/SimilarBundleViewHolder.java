package p015cm.aptoide.p016pt.app.view.similar;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import p015cm.aptoide.p016pt.ads.data.ApplicationAd;
import p015cm.aptoide.p016pt.app.AppViewSimilarApp;
import p015cm.aptoide.p016pt.app.SimilarAppsViewModel;
import p015cm.aptoide.p016pt.view.app.Application;

/* renamed from: cm.aptoide.pt.app.view.similar.SimilarBundleViewHolder */
public abstract class SimilarBundleViewHolder extends RecyclerView.C0629c0 {
    public SimilarBundleViewHolder(View view) {
        super(view);
    }

    public List<AppViewSimilarApp> mapToSimilar(SimilarAppsViewModel similarAppsViewModel, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(new AppViewSimilarApp((Application) null, similarAppsViewModel.getAd()));
        }
        for (Application appViewSimilarApp : similarAppsViewModel.getRecommendedApps()) {
            arrayList.add(new AppViewSimilarApp(appViewSimilarApp, (ApplicationAd) null));
        }
        return arrayList;
    }

    public abstract void setBundle(SimilarAppsBundle similarAppsBundle, int i);
}
