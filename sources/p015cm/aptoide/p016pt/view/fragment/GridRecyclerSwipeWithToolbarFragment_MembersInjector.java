package p015cm.aptoide.p016pt.view.fragment;

import javax.inject.Provider;
import p320o.C10822a;

/* renamed from: cm.aptoide.pt.view.fragment.GridRecyclerSwipeWithToolbarFragment_MembersInjector */
public final class GridRecyclerSwipeWithToolbarFragment_MembersInjector implements C10822a<GridRecyclerSwipeWithToolbarFragment> {
    private final Provider<String> marketNameProvider;

    public GridRecyclerSwipeWithToolbarFragment_MembersInjector(Provider<String> provider) {
        this.marketNameProvider = provider;
    }

    public static C10822a<GridRecyclerSwipeWithToolbarFragment> create(Provider<String> provider) {
        return new GridRecyclerSwipeWithToolbarFragment_MembersInjector(provider);
    }

    public static void injectMarketName(GridRecyclerSwipeWithToolbarFragment gridRecyclerSwipeWithToolbarFragment, String str) {
        gridRecyclerSwipeWithToolbarFragment.marketName = str;
    }

    public void injectMembers(GridRecyclerSwipeWithToolbarFragment gridRecyclerSwipeWithToolbarFragment) {
        injectMarketName(gridRecyclerSwipeWithToolbarFragment, this.marketNameProvider.get());
    }
}
