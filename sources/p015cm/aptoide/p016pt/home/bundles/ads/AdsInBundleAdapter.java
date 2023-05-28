package p015cm.aptoide.p016pt.home.bundles.ads;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.text.DecimalFormat;
import java.util.List;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.home.bundles.base.HomeBundle;
import p123rx.p127s.C12871b;

/* renamed from: cm.aptoide.pt.home.bundles.ads.AdsInBundleAdapter */
class AdsInBundleAdapter extends RecyclerView.C0633g<AdInBundleViewHolder> {
    private final C12871b<AdHomeEvent> adClickedEvents;
    private List<AdClick> ads;
    private int bundlePosition = -1;
    private HomeBundle homeBundle = null;
    private final DecimalFormat oneDecimalFormatter;

    public AdsInBundleAdapter(List<AdClick> list, DecimalFormat decimalFormat, C12871b<AdHomeEvent> bVar) {
        this.ads = list;
        this.oneDecimalFormatter = decimalFormat;
        this.adClickedEvents = bVar;
    }

    public int getItemCount() {
        return this.ads.size();
    }

    public int getItemViewType(int i) {
        return this.ads.get(i).getAd().getNetwork().ordinal();
    }

    public void update(List<AdClick> list) {
        this.ads = list;
        notifyDataSetChanged();
    }

    public void updateBundle(HomeBundle homeBundle2, int i) {
        this.homeBundle = homeBundle2;
        this.bundlePosition = i;
    }

    public void onBindViewHolder(AdInBundleViewHolder adInBundleViewHolder, int i) {
        adInBundleViewHolder.setApp(this.ads.get(i), this.homeBundle, this.bundlePosition, i);
    }

    public AdInBundleViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new AdInBundleViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C1086R.layout.displayable_grid_ad, viewGroup, false), this.adClickedEvents, this.oneDecimalFormatter);
    }
}
