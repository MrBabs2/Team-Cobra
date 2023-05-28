package p015cm.aptoide.p016pt.store.view;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.store.RoomStoreRepository;
import p320o.C10822a;

/* renamed from: cm.aptoide.pt.store.view.StoreTabGridRecyclerFragment_MembersInjector */
public final class StoreTabGridRecyclerFragment_MembersInjector implements C10822a<StoreTabGridRecyclerFragment> {
    private final Provider<String> marketNameProvider;
    private final Provider<RoomStoreRepository> storeRepositoryProvider;

    public StoreTabGridRecyclerFragment_MembersInjector(Provider<RoomStoreRepository> provider, Provider<String> provider2) {
        this.storeRepositoryProvider = provider;
        this.marketNameProvider = provider2;
    }

    public static C10822a<StoreTabGridRecyclerFragment> create(Provider<RoomStoreRepository> provider, Provider<String> provider2) {
        return new StoreTabGridRecyclerFragment_MembersInjector(provider, provider2);
    }

    public static void injectMarketName(StoreTabGridRecyclerFragment storeTabGridRecyclerFragment, String str) {
        storeTabGridRecyclerFragment.marketName = str;
    }

    public static void injectStoreRepository(StoreTabGridRecyclerFragment storeTabGridRecyclerFragment, RoomStoreRepository roomStoreRepository) {
        storeTabGridRecyclerFragment.storeRepository = roomStoreRepository;
    }

    public void injectMembers(StoreTabGridRecyclerFragment storeTabGridRecyclerFragment) {
        injectStoreRepository(storeTabGridRecyclerFragment, this.storeRepositoryProvider.get());
        injectMarketName(storeTabGridRecyclerFragment, this.marketNameProvider.get());
    }
}
