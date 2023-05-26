package p015cm.aptoide.p016pt.updates.view.excluded;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.updates.UpdatePersistence;
import p320o.C10822a;

/* renamed from: cm.aptoide.pt.updates.view.excluded.ExcludedUpdatesFragment_MembersInjector */
public final class ExcludedUpdatesFragment_MembersInjector implements C10822a<ExcludedUpdatesFragment> {
    private final Provider<UpdatePersistence> updatesPersistenceProvider;

    public ExcludedUpdatesFragment_MembersInjector(Provider<UpdatePersistence> provider) {
        this.updatesPersistenceProvider = provider;
    }

    public static C10822a<ExcludedUpdatesFragment> create(Provider<UpdatePersistence> provider) {
        return new ExcludedUpdatesFragment_MembersInjector(provider);
    }

    public static void injectUpdatesPersistence(ExcludedUpdatesFragment excludedUpdatesFragment, UpdatePersistence updatePersistence) {
        excludedUpdatesFragment.updatesPersistence = updatePersistence;
    }

    public void injectMembers(ExcludedUpdatesFragment excludedUpdatesFragment) {
        injectUpdatesPersistence(excludedUpdatesFragment, this.updatesPersistenceProvider.get());
    }
}
