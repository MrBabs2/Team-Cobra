package p015cm.aptoide.p016pt.home.bundles.appcoins;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.text.DecimalFormat;
import java.util.List;
import kotlin.C4789l;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.home.bundles.apps.RewardApp;
import p015cm.aptoide.p016pt.home.bundles.base.AppBundle;
import p015cm.aptoide.p016pt.home.bundles.base.HomeBundle;
import p015cm.aptoide.p016pt.home.bundles.base.HomeEvent;
import p015cm.aptoide.p016pt.view.app.Application;
import p123rx.p127s.C12871b;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\b\u0010\r\u001a\u00020\fH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\fH\u0016J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\fH\u0016J\u0016\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\fR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, mo16641d2 = {"Lcm/aptoide/pt/home/bundles/appcoins/EarnAppCoinsListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcm/aptoide/pt/home/bundles/appcoins/EarnAppCoinsItemViewHolder;", "decimalFormatter", "Ljava/text/DecimalFormat;", "appClickedEvents", "Lrx/subjects/PublishSubject;", "Lcm/aptoide/pt/home/bundles/base/HomeEvent;", "(Ljava/text/DecimalFormat;Lrx/subjects/PublishSubject;)V", "appBundle", "Lcm/aptoide/pt/home/bundles/base/AppBundle;", "bundlePosition", "", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateBundle", "bundle", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.home.bundles.appcoins.EarnAppCoinsListAdapter */
/* compiled from: EarnAppCoinsListAdapter.kt */
public final class EarnAppCoinsListAdapter extends RecyclerView.C0633g<EarnAppCoinsItemViewHolder> {
    private AppBundle appBundle;
    private final C12871b<HomeEvent> appClickedEvents;
    private int bundlePosition = -1;
    private final DecimalFormat decimalFormatter;

    public EarnAppCoinsListAdapter(DecimalFormat decimalFormat, C12871b<HomeEvent> bVar) {
        C10202j.m34178b(decimalFormat, "decimalFormatter");
        C10202j.m34178b(bVar, "appClickedEvents");
        this.decimalFormatter = decimalFormat;
        this.appClickedEvents = bVar;
    }

    public int getItemCount() {
        List<Application> apps;
        AppBundle appBundle2 = this.appBundle;
        if (appBundle2 == null || (apps = appBundle2.getApps()) == null) {
            return 0;
        }
        return apps.size();
    }

    public final void updateBundle(AppBundle appBundle2, int i) {
        C10202j.m34178b(appBundle2, "bundle");
        if (appBundle2.getType() == HomeBundle.BundleType.APPCOINS_ADS) {
            this.appBundle = appBundle2;
            this.bundlePosition = i;
            return;
        }
        throw new IllegalArgumentException("Wrong bundle type");
    }

    public void onBindViewHolder(EarnAppCoinsItemViewHolder earnAppCoinsItemViewHolder, int i) {
        C10202j.m34178b(earnAppCoinsItemViewHolder, "holder");
        AppBundle appBundle2 = this.appBundle;
        if (appBundle2 != null) {
            List<Application> apps = appBundle2.getApps();
            if (apps != null) {
                Application application = apps.get(i);
                if (application != null) {
                    earnAppCoinsItemViewHolder.setApp((RewardApp) application, this.appBundle, this.bundlePosition);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type cm.aptoide.pt.home.bundles.apps.RewardApp");
            }
            C10202j.m34172a();
            throw null;
        }
        C10202j.m34172a();
        throw null;
    }

    public EarnAppCoinsItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C10202j.m34178b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C1086R.layout.earn_appcoins_item_home, viewGroup, false);
        C10202j.m34174a((Object) inflate, "LayoutInflater.from(pare…item_home, parent, false)");
        return new EarnAppCoinsItemViewHolder(inflate, this.appClickedEvents, this.decimalFormatter);
    }
}
