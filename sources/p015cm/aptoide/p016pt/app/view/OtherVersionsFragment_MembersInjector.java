package p015cm.aptoide.p016pt.app.view;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.store.RoomStoreRepository;
import p320o.C10822a;

/* renamed from: cm.aptoide.pt.app.view.OtherVersionsFragment_MembersInjector */
public final class OtherVersionsFragment_MembersInjector implements C10822a<OtherVersionsFragment> {
    private final Provider<RoomStoreRepository> storeRepositoryProvider;

    public OtherVersionsFragment_MembersInjector(Provider<RoomStoreRepository> provider) {
        this.storeRepositoryProvider = provider;
    }

    public static C10822a<OtherVersionsFragment> create(Provider<RoomStoreRepository> provider) {
        return new OtherVersionsFragment_MembersInjector(provider);
    }

    public static void injectStoreRepository(OtherVersionsFragment otherVersionsFragment, RoomStoreRepository roomStoreRepository) {
        otherVersionsFragment.storeRepository = roomStoreRepository;
    }

    public void injectMembers(OtherVersionsFragment otherVersionsFragment) {
        injectStoreRepository(otherVersionsFragment, this.storeRepositoryProvider.get());
    }
}
