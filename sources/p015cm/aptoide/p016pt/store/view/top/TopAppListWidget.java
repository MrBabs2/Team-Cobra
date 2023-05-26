package p015cm.aptoide.p016pt.store.view.top;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.text.DecimalFormat;
import p015cm.aptoide.p016pt.AptoideApplication;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.listapp.App;
import p015cm.aptoide.p016pt.home.AppSecondaryInfoViewHolder;
import p015cm.aptoide.p016pt.networking.image.ImageLoader;
import p015cm.aptoide.p016pt.utils.AptoideUtils;
import p015cm.aptoide.p016pt.view.recycler.widget.Widget;
import p112n.p118g.p301a.p310c.C10695a;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.store.view.top.TopAppListWidget */
public class TopAppListWidget extends Widget<TopAppListDisplayable> {
    private ImageView appIcon;
    private AppSecondaryInfoViewHolder appInfoViewHolder;
    private TextView downloadNumber;
    private TextView name;
    private DecimalFormat oneDecimalFormatter;
    private TextView topNumber;

    public TopAppListWidget(View view) {
        super(view);
    }

    /* renamed from: a */
    public /* synthetic */ void mo14842a(App app, TopAppListDisplayable topAppListDisplayable, Void voidR) {
        getFragmentNavigator().navigateTo(AptoideApplication.getFragmentProvider().newAppViewFragment(app.getId(), app.getPackageName(), app.getStore().getAppearance().getTheme(), app.getStore().getName(), topAppListDisplayable.getTag(), String.valueOf(getAdapterPosition())), true);
    }

    /* access modifiers changed from: protected */
    public void assignViews(View view) {
        this.topNumber = (TextView) view.findViewById(C1086R.C1088id.top_number);
        this.appIcon = (ImageView) view.findViewById(C1086R.C1088id.icon);
        this.name = (TextView) view.findViewById(C1086R.C1088id.name_label);
        this.downloadNumber = (TextView) view.findViewById(C1086R.C1088id.download_number_label);
        DecimalFormat decimalFormat = new DecimalFormat("0.0");
        this.oneDecimalFormatter = decimalFormat;
        this.appInfoViewHolder = new AppSecondaryInfoViewHolder(view, decimalFormat);
        ((TextView) view.findViewById(C1086R.C1088id.rating_label)).setTextAppearance(view.getContext(), C1086R.style.Aptoide_TextView_Medium_XXS_Black);
    }

    public void bindView(TopAppListDisplayable topAppListDisplayable, int i) {
        App app = (App) topAppListDisplayable.getPojo();
        ImageLoader.with(this.itemView.getContext()).loadWithRoundCorners(app.getIcon(), 8, this.appIcon, C1086R.attr.placeholder_square);
        this.name.setText(app.getName());
        this.topNumber.setText(String.valueOf(i + 1));
        this.appInfoViewHolder.setInfo(app.getAppcoins().hasBilling(), app.getStats().getRating().getAvg(), true, true);
        this.downloadNumber.setText(String.format("%s %s", new Object[]{AptoideUtils.StringU.withSuffix((long) app.getStats().getDownloads()), this.itemView.getContext().getResources().getString(C1086R.string.downloads)}));
        this.compositeSubscription.mo18721a(C10695a.m36221a(this.itemView).mo18655a(new C4370a(this, app, topAppListDisplayable), (C5378b<Throwable>) C4371b.f7505f));
    }
}
