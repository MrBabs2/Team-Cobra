package p015cm.aptoide.p016pt.store.view;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import java.util.LinkedList;
import java.util.List;
import javax.inject.Inject;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.ListStores;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.Store;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.C2185V7;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.Endless;
import p015cm.aptoide.p016pt.store.StoreAnalytics;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.store.view.ListStoresFragment */
public class ListStoresFragment extends GetStoreEndlessFragment<ListStores> {
    @Inject
    AnalyticsManager analyticsManager;
    @Inject
    NavigationTracker navigationTracker;
    private StoreAnalytics storeAnalytics;

    public static Fragment newInstance() {
        return new ListStoresFragment();
    }

    /* renamed from: a */
    public /* synthetic */ void mo14698a(ListStores listStores) {
        List<Store> list = listStores.getDataList().getList();
        LinkedList linkedList = new LinkedList();
        for (Store gridStoreDisplayable : list) {
            linkedList.add(new GridStoreDisplayable(gridStoreDisplayable, "Home " + getToolbar().getTitle().toString(), this.storeAnalytics));
        }
        addDisplayables(linkedList);
    }

    /* access modifiers changed from: protected */
    public C5378b<ListStores> buildAction() {
        return new C4385y0(this);
    }

    /* access modifiers changed from: protected */
    public C2185V7<ListStores, ? extends Endless> buildRequest(boolean z, String str) {
        return this.requestFactoryCdnPool.newListStoresRequest(str);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getFragmentComponent(bundle).inject(this);
        this.storeAnalytics = new StoreAnalytics(this.analyticsManager, this.navigationTracker);
    }
}
