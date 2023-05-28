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

/* renamed from: cm.aptoide.pt.home.bundles.apps.EskillsAppInBundleViewHolder */
public class EskillsAppInBundleViewHolder extends AppViewHolder {
    private final C12871b<HomeEvent> appClicks;
    private final ImageView appIcon;
    private final TextView appName;

    public EskillsAppInBundleViewHolder(View view, C12871b<HomeEvent> bVar) {
        super(view);
        this.appIcon = (ImageView) view.findViewById(C1086R.C1088id.icon);
        this.appName = (TextView) view.findViewById(C1086R.C1088id.name);
        this.appClicks = bVar;
    }

    /* renamed from: a */
    public /* synthetic */ void mo12289a(Application application, HomeBundle homeBundle, int i, View view) {
        this.appClicks.onNext(new AppHomeEvent(application, getAdapterPosition(), homeBundle, i, HomeEvent.Type.ESKILLS));
    }

    public void setApp(Application application, HomeBundle homeBundle, int i) {
        ImageLoader.with(this.itemView.getContext()).loadWithRoundCorners(application.getIcon(), 8, this.appIcon, C1086R.attr.placeholder_square);
        this.appName.setText(application.getName());
        this.itemView.setOnClickListener(new C2889c(this, application, homeBundle, i));
    }
}
