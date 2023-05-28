package p015cm.aptoide.p016pt.home.bundles.appcoins;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.text.DecimalFormat;
import java.util.List;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.DeepLinkIntentReceiver;
import p015cm.aptoide.p016pt.home.bundles.apps.AppInBundleViewHolder;
import p015cm.aptoide.p016pt.home.bundles.base.HomeBundle;
import p015cm.aptoide.p016pt.home.bundles.base.HomeEvent;
import p015cm.aptoide.p016pt.view.app.AppViewHolder;
import p015cm.aptoide.p016pt.view.app.Application;
import p123rx.p127s.C12871b;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\b\u0010\u0018\u001a\u00020\u0013H\u0016J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0013H\u0016J\u0018\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0013H\u0016J\u0014\u0010!\u001a\u00020\u001a2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u0016\u0010\"\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u0013R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006#"}, mo16641d2 = {"Lcm/aptoide/pt/home/bundles/appcoins/FeaturedAppcBundleAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "apps", "", "Lcm/aptoide/pt/view/app/Application;", "oneDecimalFormatter", "Ljava/text/DecimalFormat;", "appClickedEvents", "Lrx/subjects/PublishSubject;", "Lcm/aptoide/pt/home/bundles/base/HomeEvent;", "(Ljava/util/List;Ljava/text/DecimalFormat;Lrx/subjects/PublishSubject;)V", "getAppClickedEvents", "()Lrx/subjects/PublishSubject;", "getApps", "()Ljava/util/List;", "setApps", "(Ljava/util/List;)V", "bundlePosition", "", "homeBundle", "Lcm/aptoide/pt/home/bundles/base/HomeBundle;", "getOneDecimalFormatter", "()Ljava/text/DecimalFormat;", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "update", "updateBundle", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.home.bundles.appcoins.FeaturedAppcBundleAdapter */
/* compiled from: FeaturedAppcBundleAdapter.kt */
public final class FeaturedAppcBundleAdapter extends RecyclerView.C0633g<RecyclerView.C0629c0> {
    private final C12871b<HomeEvent> appClickedEvents;
    private List<? extends Application> apps;
    private int bundlePosition = -1;
    private HomeBundle homeBundle;
    private final DecimalFormat oneDecimalFormatter;

    public FeaturedAppcBundleAdapter(List<? extends Application> list, DecimalFormat decimalFormat, C12871b<HomeEvent> bVar) {
        C10202j.m34178b(list, DeepLinkIntentReceiver.DeepLinksTargets.APPS);
        C10202j.m34178b(decimalFormat, "oneDecimalFormatter");
        C10202j.m34178b(bVar, "appClickedEvents");
        this.apps = list;
        this.oneDecimalFormatter = decimalFormat;
        this.appClickedEvents = bVar;
    }

    public final C12871b<HomeEvent> getAppClickedEvents() {
        return this.appClickedEvents;
    }

    public final List<Application> getApps() {
        return this.apps;
    }

    public int getItemCount() {
        return this.apps.size();
    }

    public final DecimalFormat getOneDecimalFormatter() {
        return this.oneDecimalFormatter;
    }

    public void onBindViewHolder(RecyclerView.C0629c0 c0Var, int i) {
        C10202j.m34178b(c0Var, "holder");
        ((AppViewHolder) c0Var).setApp((Application) this.apps.get(i), this.homeBundle, this.bundlePosition);
    }

    public RecyclerView.C0629c0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C10202j.m34178b(viewGroup, "parent");
        return new AppInBundleViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C1086R.layout.bonus_appc_home_item, viewGroup, false), this.appClickedEvents, this.oneDecimalFormatter);
    }

    public final void setApps(List<? extends Application> list) {
        C10202j.m34178b(list, "<set-?>");
        this.apps = list;
    }

    public final void update(List<? extends Application> list) {
        C10202j.m34178b(list, DeepLinkIntentReceiver.DeepLinksTargets.APPS);
        this.apps = list;
        notifyDataSetChanged();
    }

    public final void updateBundle(HomeBundle homeBundle2, int i) {
        C10202j.m34178b(homeBundle2, "homeBundle");
        this.homeBundle = homeBundle2;
        this.bundlePosition = i;
    }
}
