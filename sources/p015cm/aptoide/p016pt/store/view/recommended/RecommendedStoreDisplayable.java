package p015cm.aptoide.p016pt.store.view.recommended;

import android.content.Context;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.p016pt.AptoideApplication;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.store.Store;
import p015cm.aptoide.p016pt.navigator.FragmentNavigator;
import p015cm.aptoide.p016pt.store.RoomStoreRepository;
import p015cm.aptoide.p016pt.store.StoreCredentialsProvider;
import p015cm.aptoide.p016pt.store.StoreUtils;
import p015cm.aptoide.p016pt.store.StoreUtilsProxy;
import p015cm.aptoide.p016pt.view.recycler.displayable.Displayable;
import p015cm.aptoide.p016pt.view.recycler.displayable.DisplayablePojo;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.store.view.recommended.RecommendedStoreDisplayable */
public class RecommendedStoreDisplayable extends DisplayablePojo<Store> {
    private AptoideAccountManager accountManager;
    private String origin = "";
    private StoreCredentialsProvider storeCredentialsProvider;
    private RoomStoreRepository storeRepository;
    private StoreUtilsProxy storeUtilsProxy;

    public RecommendedStoreDisplayable() {
    }

    /* access modifiers changed from: protected */
    public Displayable.Configs getConfig() {
        return new Displayable.Configs(1, false);
    }

    public String getOrigin() {
        return this.origin;
    }

    public int getViewLayout() {
        return C1086R.layout.displayable_recommended_store;
    }

    /* access modifiers changed from: package-private */
    public C5368e<Boolean> isFollowing() {
        return this.storeRepository.isSubscribed(((Store) getPojo()).getId());
    }

    /* access modifiers changed from: package-private */
    public void openStoreFragment(FragmentNavigator fragmentNavigator) {
        fragmentNavigator.navigateTo(AptoideApplication.getFragmentProvider().newStoreFragment(((Store) getPojo()).getName(), ((Store) getPojo()).getAppearance().getTheme()), true);
    }

    public void subscribeStore() {
        this.storeUtilsProxy.subscribeStore(((Store) getPojo()).getName());
    }

    /* access modifiers changed from: package-private */
    public void unsubscribeStore(Context context) {
        if (this.accountManager.isLoggedIn()) {
            this.accountManager.unsubscribeStore(((Store) getPojo()).getName(), this.storeCredentialsProvider.get(((Store) getPojo()).getName()).getName(), this.storeCredentialsProvider.get(((Store) getPojo()).getName()).getPasswordSha1());
        }
        StoreUtils.unSubscribeStore(((Store) getPojo()).getName(), this.accountManager, this.storeCredentialsProvider, this.storeRepository);
    }

    public RecommendedStoreDisplayable(Store store, RoomStoreRepository roomStoreRepository, AptoideAccountManager aptoideAccountManager, StoreUtilsProxy storeUtilsProxy2, StoreCredentialsProvider storeCredentialsProvider2) {
        super(store);
        this.storeRepository = roomStoreRepository;
        this.accountManager = aptoideAccountManager;
        this.storeUtilsProxy = storeUtilsProxy2;
        this.storeCredentialsProvider = storeCredentialsProvider2;
    }

    public RecommendedStoreDisplayable(Store store, RoomStoreRepository roomStoreRepository, AptoideAccountManager aptoideAccountManager, StoreUtilsProxy storeUtilsProxy2, StoreCredentialsProvider storeCredentialsProvider2, String str) {
        super(store);
        this.storeRepository = roomStoreRepository;
        this.accountManager = aptoideAccountManager;
        this.storeUtilsProxy = storeUtilsProxy2;
        this.storeCredentialsProvider = storeCredentialsProvider2;
        this.origin = str;
    }
}
