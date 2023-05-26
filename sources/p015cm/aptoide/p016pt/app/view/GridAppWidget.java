package p015cm.aptoide.p016pt.app.view;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.text.DecimalFormat;
import p015cm.aptoide.p016pt.AptoideApplication;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.app.view.GridAppDisplayable;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.listapp.App;
import p015cm.aptoide.p016pt.home.AppSecondaryInfoViewHolder;
import p015cm.aptoide.p016pt.networking.image.ImageLoader;
import p015cm.aptoide.p016pt.view.recycler.widget.Widget;
import p112n.p118g.p301a.p310c.C10695a;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.app.view.GridAppWidget */
public class GridAppWidget<T extends GridAppDisplayable> extends Widget<T> {
    private AppSecondaryInfoViewHolder appInfoViewHolder;
    private ImageView icon;
    private TextView name;
    private String storeName;

    public GridAppWidget(View view) {
        super(view);
    }

    /* access modifiers changed from: protected */
    public void assignViews(View view) {
        this.name = (TextView) this.itemView.findViewById(C1086R.C1088id.name);
        this.icon = (ImageView) this.itemView.findViewById(C1086R.C1088id.icon);
        this.appInfoViewHolder = new AppSecondaryInfoViewHolder(this.itemView, new DecimalFormat("0.0"));
    }

    /* access modifiers changed from: protected */
    public C5378b<Void> newOnClickListener(T t, App app, long j) {
        return new C1587ge(this, j, app, t);
    }

    public void bindView(T t, int i) {
        App app = (App) t.getPojo();
        long id = app.getId();
        ImageLoader.with(getContext()).load(app.getIcon(), this.icon);
        this.name.setText(app.getName());
        this.appInfoViewHolder.setInfo(app.hasBilling(), app.getStats().getRating().getAvg(), true, false);
        this.storeName = app.getStore().getName();
        this.compositeSubscription.mo18721a(C10695a.m36221a(this.itemView).mo18655a(newOnClickListener(t, app, id), (C5378b<Throwable>) C1605he.f4147f));
    }

    /* renamed from: a */
    public /* synthetic */ void mo7529a(long j, App app, GridAppDisplayable gridAppDisplayable, Void voidR) {
        getFragmentNavigator().navigateTo(AptoideApplication.getFragmentProvider().newAppViewFragment(j, app.getPackageName(), app.getStore().getAppearance().getTheme(), this.storeName, gridAppDisplayable.getTag()), true);
    }
}
