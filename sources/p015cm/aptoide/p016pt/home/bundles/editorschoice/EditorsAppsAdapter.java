package p015cm.aptoide.p016pt.home.bundles.editorschoice;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.text.DecimalFormat;
import java.util.List;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.home.bundles.base.HomeBundle;
import p015cm.aptoide.p016pt.home.bundles.base.HomeEvent;
import p015cm.aptoide.p016pt.view.app.Application;
import p015cm.aptoide.p016pt.view.app.FeatureGraphicApplication;
import p123rx.p127s.C12871b;

/* renamed from: cm.aptoide.pt.home.bundles.editorschoice.EditorsAppsAdapter */
class EditorsAppsAdapter extends RecyclerView.C0633g<FeatureGraphicInBundleViewHolder> {
    private final C12871b<HomeEvent> appClickedEvents;
    private List<Application> apps;
    private int bundlePosition = -1;
    private HomeBundle homeBundle = null;
    private final DecimalFormat oneDecimalFormatter;

    public EditorsAppsAdapter(List<Application> list, DecimalFormat decimalFormat, C12871b<HomeEvent> bVar) {
        this.apps = list;
        this.oneDecimalFormatter = decimalFormat;
        this.appClickedEvents = bVar;
    }

    public int getItemCount() {
        return this.apps.size();
    }

    public void update(List<Application> list) {
        this.apps = list;
        notifyDataSetChanged();
    }

    public void updateBundle(HomeBundle homeBundle2, int i) {
        this.homeBundle = homeBundle2;
        this.bundlePosition = i;
    }

    public void onBindViewHolder(FeatureGraphicInBundleViewHolder featureGraphicInBundleViewHolder, int i) {
        featureGraphicInBundleViewHolder.setFeatureGraphicApplication((FeatureGraphicApplication) this.apps.get(i), this.homeBundle, this.bundlePosition, i);
    }

    public FeatureGraphicInBundleViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new FeatureGraphicInBundleViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C1086R.layout.feature_graphic_home_item, viewGroup, false), this.oneDecimalFormatter, this.appClickedEvents);
    }
}
