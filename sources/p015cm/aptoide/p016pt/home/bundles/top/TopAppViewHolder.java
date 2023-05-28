package p015cm.aptoide.p016pt.home.bundles.top;

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
import p015cm.aptoide.p016pt.utils.AptoideUtils;
import p015cm.aptoide.p016pt.view.app.AppViewHolder;
import p015cm.aptoide.p016pt.view.app.Application;
import p123rx.p127s.C12871b;

/* renamed from: cm.aptoide.pt.home.bundles.top.TopAppViewHolder */
public class TopAppViewHolder extends AppViewHolder {
    private final C12871b<HomeEvent> appClicks;
    private ImageView appIcon;
    private final AppSecondaryInfoViewHolder appInfoViewHolder;
    private TextView downloadNumber;
    private TextView name;
    private TextView topNumber;

    public TopAppViewHolder(View view, C12871b<HomeEvent> bVar, DecimalFormat decimalFormat) {
        super(view);
        this.appClicks = bVar;
        this.topNumber = (TextView) view.findViewById(C1086R.C1088id.top_number);
        this.appIcon = (ImageView) view.findViewById(C1086R.C1088id.icon);
        this.name = (TextView) view.findViewById(C1086R.C1088id.name_label);
        this.downloadNumber = (TextView) view.findViewById(C1086R.C1088id.download_number_label);
        this.appInfoViewHolder = new AppSecondaryInfoViewHolder(view, decimalFormat);
        ((TextView) view.findViewById(C1086R.C1088id.rating_label)).setTextAppearance(view.getContext(), C1086R.style.Aptoide_TextView_Medium_XXS_Black);
    }

    /* renamed from: a */
    public /* synthetic */ void mo12406a(Application application, HomeBundle homeBundle, int i, View view) {
        this.appClicks.onNext(new AppHomeEvent(application, getAdapterPosition(), homeBundle, i, HomeEvent.Type.APP));
    }

    public void setApp(Application application, HomeBundle homeBundle, int i) {
        ImageLoader.with(this.itemView.getContext()).loadWithRoundCorners(application.getIcon(), 8, this.appIcon, C1086R.attr.placeholder_square);
        this.name.setText(application.getName());
        this.topNumber.setText(String.valueOf(i + 1));
        this.appInfoViewHolder.setInfo(application.hasAppcBilling(), application.getRating(), true, true);
        this.downloadNumber.setText(String.format("%s %s", new Object[]{AptoideUtils.StringU.withSuffix((long) application.getDownloads()), this.itemView.getContext().getResources().getString(C1086R.string.downloads)}));
        this.itemView.setOnClickListener(new C2925a(this, application, homeBundle, i));
    }
}
