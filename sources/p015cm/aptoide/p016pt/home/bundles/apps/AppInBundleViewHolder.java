package p015cm.aptoide.p016pt.home.bundles.apps;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.text.DecimalFormat;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.home.AppSecondaryInfoViewHolder;
import p015cm.aptoide.p016pt.home.bundles.base.AppHomeEvent;
import p015cm.aptoide.p016pt.home.bundles.base.HomeBundle;
import p015cm.aptoide.p016pt.home.bundles.base.HomeEvent;
import p015cm.aptoide.p016pt.networking.image.ImageLoader;
import p015cm.aptoide.p016pt.view.app.AppViewHolder;
import p015cm.aptoide.p016pt.view.app.Application;
import p123rx.p127s.C12871b;

/* renamed from: cm.aptoide.pt.home.bundles.apps.AppInBundleViewHolder */
public class AppInBundleViewHolder extends AppViewHolder {
    private final C12871b<HomeEvent> appClicks;
    private AppSecondaryInfoViewHolder appInfoViewHolder;
    private final ImageView iconView;
    private final TextView nameTextView;

    public AppInBundleViewHolder(View view, C12871b<HomeEvent> bVar, DecimalFormat decimalFormat) {
        super(view);
        this.appInfoViewHolder = new AppSecondaryInfoViewHolder(view, decimalFormat);
        this.nameTextView = (TextView) view.findViewById(C1086R.C1088id.name);
        this.iconView = (ImageView) view.findViewById(C1086R.C1088id.icon);
        this.appClicks = bVar;
    }

    /* renamed from: a */
    public /* synthetic */ void mo12283a(Application application, HomeBundle homeBundle, int i, View view) {
        this.appClicks.onNext(new AppHomeEvent(application, getAdapterPosition(), homeBundle, i, HomeEvent.Type.APP));
    }

    public void setApp(Application application, HomeBundle homeBundle, int i) {
        this.nameTextView.setText(application.getName());
        ImageLoader.with(this.itemView.getContext()).loadWithRoundCorners(application.getIcon(), 8, this.iconView, C1086R.attr.placeholder_square);
        this.appInfoViewHolder.setInfo(application.hasAppcBilling(), application.getRating(), true, false);
        this.itemView.setOnClickListener(new C2887a(this, application, homeBundle, i));
    }
}
