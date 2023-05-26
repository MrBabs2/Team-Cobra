package p015cm.aptoide.p016pt.home.bundles.apps;

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

/* renamed from: cm.aptoide.pt.home.bundles.apps.AppsInBundleAdapter */
class AppsInBundleAdapter extends RecyclerView.C0633g<RecyclerView.C0629c0> {
    private static final int APP = 2131492901;
    private static final int ESKILLS_APP = 2131493014;
    private static final int REWARD_APP = 2131493169;
    private final C12871b<HomeEvent> appClickedEvents;
    private List<Application> apps;
    private int bundlePosition = -1;
    private HomeBundle homeBundle = null;
    private final DecimalFormat oneDecimalFormatter;

    AppsInBundleAdapter(List<Application> list, DecimalFormat decimalFormat, C12871b<HomeEvent> bVar) {
        this.apps = list;
        this.oneDecimalFormatter = decimalFormat;
        this.appClickedEvents = bVar;
    }

    public int getItemCount() {
        return this.apps.size();
    }

    public int getItemViewType(int i) {
        if (this.apps.get(i) instanceof RewardApp) {
            return C1086R.layout.reward_app_home_item;
        }
        return this.apps.get(i) instanceof EskillsApp ? C1086R.layout.eskills_app_home_item : C1086R.layout.app_home_item;
    }

    public void onBindViewHolder(RecyclerView.C0629c0 c0Var, int i) {
        ((AppViewHolder) c0Var).setApp(this.apps.get(i), this.homeBundle, this.bundlePosition);
    }

    public RecyclerView.C0629c0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == C1086R.layout.app_home_item) {
            return new AppInBundleViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C1086R.layout.app_home_item, viewGroup, false), this.appClickedEvents, this.oneDecimalFormatter);
        }
        if (i == C1086R.layout.eskills_app_home_item) {
            return new EskillsAppInBundleViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C1086R.layout.eskills_app_home_item, viewGroup, false), this.appClickedEvents);
        }
        if (i == C1086R.layout.reward_app_home_item) {
            return new RewardAppInBundleViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C1086R.layout.reward_app_home_item, viewGroup, false), this.appClickedEvents);
        }
        throw new IllegalArgumentException("Wrong type of App");
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
