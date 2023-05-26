package p015cm.aptoide.p016pt.home.bundles.ads;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.text.DecimalFormat;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.home.bundles.base.AppBundleViewHolder;
import p015cm.aptoide.p016pt.home.bundles.base.HomeEvent;
import p123rx.p127s.C12871b;

/* renamed from: cm.aptoide.pt.home.bundles.ads.AdsBundlesViewHolderFactory */
public class AdsBundlesViewHolderFactory {
    private static final int ADS = 2131492898;
    private final C12871b<AdHomeEvent> adClickedEvents;
    private final String marketName;
    private final DecimalFormat oneDecimalFormatter;
    private final C12871b<HomeEvent> uiEventsListener;

    public AdsBundlesViewHolderFactory(C12871b<HomeEvent> bVar, C12871b<AdHomeEvent> bVar2, DecimalFormat decimalFormat, String str) {
        this.uiEventsListener = bVar;
        this.adClickedEvents = bVar2;
        this.oneDecimalFormatter = decimalFormat;
        this.marketName = str;
    }

    public AppBundleViewHolder createViewHolder(ViewGroup viewGroup) {
        return new AdsBundleViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C1086R.layout.ads_bundle_item, viewGroup, false), this.uiEventsListener, this.oneDecimalFormatter, this.adClickedEvents, this.marketName);
    }
}
