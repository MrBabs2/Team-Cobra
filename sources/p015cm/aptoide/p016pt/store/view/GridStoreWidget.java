package p015cm.aptoide.p016pt.store.view;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.C0456c;
import p015cm.aptoide.p016pt.AptoideApplication;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.Store;
import p015cm.aptoide.p016pt.networking.image.ImageLoader;
import p015cm.aptoide.p016pt.view.recycler.widget.Widget;
import p112n.p118g.p301a.p310c.C10695a;

/* renamed from: cm.aptoide.pt.store.view.GridStoreWidget */
public class GridStoreWidget extends Widget<GridStoreDisplayable> {
    private ImageView storeAvatar;
    private View storeLayout;
    private TextView storeName;

    public GridStoreWidget(View view) {
        super(view);
    }

    /* renamed from: a */
    public /* synthetic */ void mo14696a(GridStoreDisplayable gridStoreDisplayable, Store store, Void voidR) {
        String origin = gridStoreDisplayable.getOrigin();
        if (!origin.isEmpty()) {
            gridStoreDisplayable.getStoreAnalytics().sendStoreTabInteractEvent(origin, true);
            gridStoreDisplayable.getStoreAnalytics().sendStoreOpenEvent(origin, ((Store) gridStoreDisplayable.getPojo()).getName(), true);
        }
        getFragmentNavigator().navigateTo(AptoideApplication.getFragmentProvider().newStoreFragment(((Store) gridStoreDisplayable.getPojo()).getName(), store.getAppearance().getTheme()), true);
    }

    /* access modifiers changed from: protected */
    public void assignViews(View view) {
        this.storeAvatar = (ImageView) view.findViewById(C1086R.C1088id.store_avatar_row);
        this.storeName = (TextView) view.findViewById(C1086R.C1088id.store_name_row);
        this.storeLayout = view.findViewById(C1086R.C1088id.store_main_layout_row);
    }

    public void bindView(GridStoreDisplayable gridStoreDisplayable, int i) {
        Store store = (Store) gridStoreDisplayable.getPojo();
        this.storeName.setText(store.getName());
        this.compositeSubscription.mo18721a(C10695a.m36221a(this.storeLayout).mo18675c(new C4382x0(this, gridStoreDisplayable, store)));
        C0456c context = getContext();
        if (store.getId() == -1 || TextUtils.isEmpty(store.getAvatar())) {
            ImageLoader.with(context).loadUsingCircleTransform((int) C1086R.C1087drawable.ic_avatar_apps, this.storeAvatar);
        } else {
            ImageLoader.with(context).loadUsingCircleTransform(store.getAvatar(), this.storeAvatar);
        }
    }
}
