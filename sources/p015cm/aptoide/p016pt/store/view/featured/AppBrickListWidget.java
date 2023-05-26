package p015cm.aptoide.p016pt.store.view.featured;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.text.DecimalFormat;
import p015cm.aptoide.p016pt.AptoideApplication;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.listapp.App;
import p015cm.aptoide.p016pt.networking.image.ImageLoader;
import p015cm.aptoide.p016pt.view.recycler.widget.Widget;
import p112n.p118g.p301a.p310c.C10695a;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.store.view.featured.AppBrickListWidget */
public class AppBrickListWidget extends Widget<AppBrickListDisplayable> {
    private ImageView appIcon;
    private ImageView graphic;
    private TextView name;
    private DecimalFormat oneDecimalFormatter = new DecimalFormat("0.0");
    private TextView rating;

    public AppBrickListWidget(View view) {
        super(view);
    }

    /* renamed from: a */
    public /* synthetic */ void mo14772a(App app, AppBrickListDisplayable appBrickListDisplayable, Void voidR) {
        getFragmentNavigator().navigateTo(AptoideApplication.getFragmentProvider().newAppViewFragment(app.getId(), app.getPackageName(), app.getStore().getAppearance().getTheme(), app.getStore().getName(), appBrickListDisplayable.getTag(), String.valueOf(getAdapterPosition())), true);
    }

    /* access modifiers changed from: protected */
    public void assignViews(View view) {
        this.appIcon = (ImageView) view.findViewById(C1086R.C1088id.app_icon);
        this.name = (TextView) view.findViewById(C1086R.C1088id.app_name);
        this.graphic = (ImageView) view.findViewById(C1086R.C1088id.featured_graphic);
        this.rating = (TextView) view.findViewById(C1086R.C1088id.rating_label);
    }

    public void bindView(AppBrickListDisplayable appBrickListDisplayable, int i) {
        App app = (App) appBrickListDisplayable.getPojo();
        ImageLoader.with(getContext()).load(app.getIcon(), C1086R.attr.placeholder_square, this.appIcon);
        ImageLoader.with(getContext()).load(app.getGraphic(), C1086R.attr.placeholder_brick, this.graphic);
        this.name.setText(app.getName());
        float avg = app.getStats().getRating().getAvg();
        if (avg == 0.0f) {
            this.rating.setText(C1086R.string.appcardview_title_no_stars);
        } else {
            this.rating.setText(this.oneDecimalFormatter.format((double) avg));
        }
        this.compositeSubscription.mo18721a(C10695a.m36221a(this.itemView).mo18655a(new C4283b(this, app, appBrickListDisplayable), (C5378b<Throwable>) C4282a.f7370f));
    }
}
