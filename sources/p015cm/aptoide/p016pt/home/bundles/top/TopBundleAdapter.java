package p015cm.aptoide.p016pt.home.bundles.top;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.text.DecimalFormat;
import java.util.List;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.home.bundles.base.HomeBundle;
import p015cm.aptoide.p016pt.home.bundles.base.HomeEvent;
import p015cm.aptoide.p016pt.view.app.AppViewHolder;
import p015cm.aptoide.p016pt.view.app.Application;
import p123rx.p127s.C12871b;

/* renamed from: cm.aptoide.pt.home.bundles.top.TopBundleAdapter */
public class TopBundleAdapter extends RecyclerView.C0633g<RecyclerView.C0629c0> {
    private static final int TOP_APP = 2131493215;
    private final C12871b<HomeEvent> appClickedEvents;
    private List<Application> apps;
    private int bundlePosition = -1;
    private HomeBundle homeBundle = null;
    private final DecimalFormat oneDecimalFormatter;

    TopBundleAdapter(List<Application> list, DecimalFormat decimalFormat, C12871b<HomeEvent> bVar) {
        this.apps = list;
        this.oneDecimalFormatter = decimalFormat;
        this.appClickedEvents = bVar;
    }

    public int getItemCount() {
        return this.apps.size();
    }

    public int getItemViewType(int i) {
        return C1086R.layout.top_app_item;
    }

    public void onBindViewHolder(RecyclerView.C0629c0 c0Var, int i) {
        ((AppViewHolder) c0Var).setApp(this.apps.get(i), this.homeBundle, i);
    }

    public RecyclerView.C0629c0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new TopAppViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C1086R.layout.top_app_item, viewGroup, false), this.appClickedEvents, this.oneDecimalFormatter);
    }

    public void update(List<Application> list) {
        this.apps = list;
        notifyDataSetChanged();
    }

    public void updateBundle(HomeBundle homeBundle2, int i) {
        this.homeBundle = homeBundle2;
        this.bundlePosition = i;
    }
}
