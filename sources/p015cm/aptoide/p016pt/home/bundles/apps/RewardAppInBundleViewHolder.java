package p015cm.aptoide.p016pt.home.bundles.apps;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.home.bundles.base.AppHomeEvent;
import p015cm.aptoide.p016pt.home.bundles.base.HomeBundle;
import p015cm.aptoide.p016pt.home.bundles.base.HomeEvent;
import p015cm.aptoide.p016pt.networking.image.ImageLoader;
import p015cm.aptoide.p016pt.view.app.AppViewHolder;
import p015cm.aptoide.p016pt.view.app.Application;
import p123rx.p127s.C12871b;

/* renamed from: cm.aptoide.pt.home.bundles.apps.RewardAppInBundleViewHolder */
public class RewardAppInBundleViewHolder extends AppViewHolder {
    private final C12871b<HomeEvent> appClicks;
    private final ImageView appIcon;
    private final TextView appName;
    private final TextView appReward;

    public RewardAppInBundleViewHolder(View view, C12871b<HomeEvent> bVar) {
        super(view);
        this.appIcon = (ImageView) view.findViewById(C1086R.C1088id.icon);
        this.appName = (TextView) view.findViewById(C1086R.C1088id.name);
        this.appReward = (TextView) view.findViewById(C1086R.C1088id.appc_text);
        this.appClicks = bVar;
    }

    /* renamed from: a */
    public /* synthetic */ void mo12317a(Application application, HomeBundle homeBundle, int i, View view) {
        this.appClicks.onNext(new AppHomeEvent(application, getAdapterPosition(), homeBundle, i, HomeEvent.Type.REWARD_APP));
    }

    public void setApp(Application application, HomeBundle homeBundle, int i) {
        ImageLoader.with(this.itemView.getContext()).loadWithRoundCorners(application.getIcon(), 8, this.appIcon, C1086R.attr.placeholder_square);
        this.appName.setText(application.getName());
        this.appReward.setText(this.itemView.getResources().getString(C1086R.string.appc_card_short));
        this.itemView.setOnClickListener(new C2892f(this, application, homeBundle, i));
    }
}
