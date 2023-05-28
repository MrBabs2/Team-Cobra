package p015cm.aptoide.p016pt.store.view.featured;

import android.view.View;
import android.widget.ImageView;
import p015cm.aptoide.p016pt.AptoideApplication;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.listapp.App;
import p015cm.aptoide.p016pt.networking.image.ImageLoader;
import p015cm.aptoide.p016pt.view.recycler.widget.Widget;
import p112n.p118g.p301a.p310c.C10695a;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.store.view.featured.AppBrickWidget */
public class AppBrickWidget extends Widget<AppBrickDisplayable> {
    private ImageView graphic;

    public AppBrickWidget(View view) {
        super(view);
    }

    /* renamed from: a */
    public /* synthetic */ void mo14774a(AppBrickDisplayable appBrickDisplayable, Void voidR) {
        getFragmentNavigator().navigateTo(AptoideApplication.getFragmentProvider().newAppViewFragment(((App) appBrickDisplayable.getPojo()).getId(), ((App) appBrickDisplayable.getPojo()).getPackageName(), ((App) appBrickDisplayable.getPojo()).getStore().getAppearance().getTheme(), ((App) appBrickDisplayable.getPojo()).getStore().getName(), appBrickDisplayable.getTag(), String.valueOf(getAdapterPosition())), true);
    }

    /* access modifiers changed from: protected */
    public void assignViews(View view) {
        this.graphic = (ImageView) view.findViewById(C1086R.C1088id.featured_graphic);
    }

    public void bindView(AppBrickDisplayable appBrickDisplayable, int i) {
        ImageLoader.with(getContext()).load(((App) appBrickDisplayable.getPojo()).getGraphic(), C1086R.attr.placeholder_brick, this.graphic);
        this.compositeSubscription.mo18721a(C10695a.m36221a(this.itemView).mo18655a(new C4285d(this, appBrickDisplayable), (C5378b<Throwable>) C4284c.f7374f));
    }
}
