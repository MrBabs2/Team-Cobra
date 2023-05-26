package p015cm.aptoide.p016pt.store.view.recommended;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.trello.rxlifecycle.p209g.C9008b;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.p016pt.AptoideApplication;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.ListStores;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.Store;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.C2185V7;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.Endless;
import p015cm.aptoide.p016pt.store.RoomStoreRepository;
import p015cm.aptoide.p016pt.store.StoreCredentialsProvider;
import p015cm.aptoide.p016pt.store.StoreUtilsProxy;
import p015cm.aptoide.p016pt.store.view.GetStoreEndlessFragment;
import p015cm.aptoide.p016pt.view.recycler.displayable.Displayable;
import p123rx.C5368e;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.store.view.recommended.RecommendedStoresFragment */
public class RecommendedStoresFragment extends GetStoreEndlessFragment<ListStores> {
    private AptoideAccountManager accountManager;
    @Inject
    StoreCredentialsProvider storeCredentialsProvider;
    @Inject
    RoomStoreRepository storeRepository;
    @Inject
    StoreUtilsProxy storeUtilsProxy;

    public static Fragment newInstance() {
        return new RecommendedStoresFragment();
    }

    /* renamed from: a */
    public /* synthetic */ void mo14832a(ListStores listStores) {
        C5368e.m10257c(listStores).mo18691h(C4360h.f7484f).mo18694j(new C4363k(this)).mo18698l().mo18641a(bindUntilEvent(C9008b.DESTROY_VIEW)).mo18675c(new C4362j(this));
    }

    /* access modifiers changed from: protected */
    public C5378b<ListStores> buildAction() {
        return new C4361i(this);
    }

    /* access modifiers changed from: protected */
    public C2185V7<ListStores, ? extends Endless> buildRequest(boolean z, String str) {
        return this.requestFactoryCdnPool.newGetRecommendedStores(str);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getFragmentComponent(bundle).inject(this);
        this.accountManager = ((AptoideApplication) getContext().getApplicationContext()).getAccountManager();
    }

    /* renamed from: a */
    public /* synthetic */ RecommendedStoreDisplayable mo14831a(Store store) {
        return new RecommendedStoreDisplayable(store, this.storeRepository, this.accountManager, this.storeUtilsProxy, this.storeCredentialsProvider, "Recommended Stores More");
    }

    /* renamed from: a */
    public /* synthetic */ void mo14833a(List list) {
        addDisplayables((List<? extends Displayable>) new ArrayList(list), true);
    }
}
