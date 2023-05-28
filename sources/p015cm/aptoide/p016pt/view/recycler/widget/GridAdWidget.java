package p015cm.aptoide.p016pt.view.recycler.widget;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.text.DecimalFormat;
import p015cm.aptoide.p016pt.AptoideApplication;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.ads.MinimalAd;
import p015cm.aptoide.p016pt.networking.image.ImageLoader;
import p015cm.aptoide.p016pt.search.model.SearchAdResult;
import p015cm.aptoide.p016pt.view.recycler.displayable.GridAdDisplayable;
import p112n.p118g.p301a.p310c.C10695a;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.view.recycler.widget.GridAdWidget */
public class GridAdWidget extends Widget<GridAdDisplayable> {
    private ImageView icon;
    private TextView name;
    private TextView rating;

    public GridAdWidget(View view) {
        super(view);
    }

    /* renamed from: a */
    public /* synthetic */ void mo15719a(MinimalAd minimalAd, GridAdDisplayable gridAdDisplayable, Void voidR) {
        getFragmentNavigator().navigateTo(AptoideApplication.getFragmentProvider().newAppViewFragment(new SearchAdResult(minimalAd), gridAdDisplayable.getTag()), true);
    }

    /* access modifiers changed from: protected */
    public void assignViews(View view) {
        this.name = (TextView) view.findViewById(C1086R.C1088id.name);
        this.icon = (ImageView) view.findViewById(C1086R.C1088id.icon);
        this.rating = (TextView) view.findViewById(C1086R.C1088id.rating_label);
    }

    public void bindView(GridAdDisplayable gridAdDisplayable, int i) {
        MinimalAd minimalAd = (MinimalAd) gridAdDisplayable.getPojo();
        this.name.setText(minimalAd.getName());
        ImageLoader.with(getContext()).load(minimalAd.getIconPath(), this.icon);
        this.compositeSubscription.mo18721a(C10695a.m36221a(this.itemView).mo18655a(new C4675b(this, minimalAd, gridAdDisplayable), (C5378b<Throwable>) C4674a.f7948f));
        try {
            this.rating.setText(new DecimalFormat("0.0").format((long) minimalAd.getStars()));
        } catch (Exception unused) {
            this.rating.setText(C1086R.string.appcardview_title_no_stars);
        }
    }
}
