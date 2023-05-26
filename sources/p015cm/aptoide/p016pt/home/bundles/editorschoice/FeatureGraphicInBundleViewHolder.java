package p015cm.aptoide.p016pt.home.bundles.editorschoice;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.text.DecimalFormat;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.home.bundles.base.AppHomeEvent;
import p015cm.aptoide.p016pt.home.bundles.base.HomeBundle;
import p015cm.aptoide.p016pt.home.bundles.base.HomeEvent;
import p015cm.aptoide.p016pt.networking.image.ImageLoader;
import p015cm.aptoide.p016pt.view.app.FeatureGraphicApplication;
import p123rx.p127s.C12871b;

/* renamed from: cm.aptoide.pt.home.bundles.editorschoice.FeatureGraphicInBundleViewHolder */
public class FeatureGraphicInBundleViewHolder extends RecyclerView.C0629c0 {
    private final C12871b<HomeEvent> appClickedEvents;
    private final ImageView appIcon = ((ImageView) this.itemView.findViewById(C1086R.C1088id.app_icon));
    private final ImageView featureGraphic = ((ImageView) this.itemView.findViewById(C1086R.C1088id.featured_graphic));
    private final TextView nameTextView = ((TextView) this.itemView.findViewById(C1086R.C1088id.app_name));
    private final DecimalFormat oneDecimalFormatter;
    private final TextView rating = ((TextView) this.itemView.findViewById(C1086R.C1088id.rating_label));

    public FeatureGraphicInBundleViewHolder(View view, DecimalFormat decimalFormat, C12871b<HomeEvent> bVar) {
        super(view);
        this.oneDecimalFormatter = decimalFormat;
        this.appClickedEvents = bVar;
    }

    /* renamed from: a */
    public /* synthetic */ void mo12378a(FeatureGraphicApplication featureGraphicApplication, int i, HomeBundle homeBundle, int i2, View view) {
        this.appClickedEvents.onNext(new AppHomeEvent(featureGraphicApplication, i, homeBundle, i2, HomeEvent.Type.APP));
    }

    public void setFeatureGraphicApplication(FeatureGraphicApplication featureGraphicApplication, HomeBundle homeBundle, int i, int i2) {
        this.nameTextView.setText(featureGraphicApplication.getName());
        ImageLoader.with(this.itemView.getContext()).load(featureGraphicApplication.getFeatureGraphic(), C1086R.attr.placeholder_brick, this.featureGraphic);
        ImageLoader.with(this.itemView.getContext()).load(featureGraphicApplication.getIcon(), C1086R.attr.placeholder_square, this.appIcon);
        float rating2 = featureGraphicApplication.getRating();
        if (rating2 == 0.0f) {
            this.rating.setText(C1086R.string.appcardview_title_no_stars);
        } else {
            this.rating.setText(this.oneDecimalFormatter.format((double) rating2));
        }
        this.itemView.setOnClickListener(new C2905b(this, featureGraphicApplication, i2, homeBundle, i));
    }
}
