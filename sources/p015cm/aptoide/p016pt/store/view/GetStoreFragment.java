package p015cm.aptoide.p016pt.store.view;

import androidx.fragment.app.Fragment;
import java.util.List;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Event;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.GetStore;
import p015cm.aptoide.p016pt.view.recycler.displayable.Displayable;
import p123rx.C5368e;
import p123rx.schedulers.Schedulers;

/* renamed from: cm.aptoide.pt.store.view.GetStoreFragment */
public class GetStoreFragment extends StoreTabWidgetsGridRecyclerFragment {
    private C5368e<GetStore> getStoreObservable(boolean z, String str, boolean z2) {
        if (this.name == Event.Name.getUser) {
            return this.requestFactoryCdnPool.newGetUser(str).observe(z, z2);
        }
        return this.requestFactoryCdnPool.newStore(str).observe(z, z2);
    }

    public static Fragment newInstance() {
        return new GetStoreFragment();
    }

    /* renamed from: a */
    public /* synthetic */ C5368e mo14626a(GetStore getStore) {
        return parseDisplayables(getStore.getNodes().getWidgets());
    }

    /* access modifiers changed from: protected */
    public C5368e<List<Displayable>> buildDisplayables(boolean z, String str, boolean z2) {
        return getStoreObservable(z, str, z2).mo18644a(Schedulers.m10352io()).mo18687f(new C4271c0(this));
    }
}
