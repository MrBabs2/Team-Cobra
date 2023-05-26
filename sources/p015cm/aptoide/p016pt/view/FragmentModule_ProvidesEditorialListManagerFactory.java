package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.AppCoinsManager;
import p015cm.aptoide.p016pt.editorialList.EditorialCardListRepository;
import p015cm.aptoide.p016pt.editorialList.EditorialListManager;
import p015cm.aptoide.p016pt.reactions.ReactionsManager;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.FragmentModule_ProvidesEditorialListManagerFactory */
public final class FragmentModule_ProvidesEditorialListManagerFactory implements C10824b<EditorialListManager> {
    private final Provider<AppCoinsManager> appCoinsManagerProvider;
    private final Provider<EditorialCardListRepository> editorialCardListRepositoryProvider;
    private final FragmentModule module;
    private final Provider<ReactionsManager> reactionsManagerProvider;

    public FragmentModule_ProvidesEditorialListManagerFactory(FragmentModule fragmentModule, Provider<EditorialCardListRepository> provider, Provider<ReactionsManager> provider2, Provider<AppCoinsManager> provider3) {
        this.module = fragmentModule;
        this.editorialCardListRepositoryProvider = provider;
        this.reactionsManagerProvider = provider2;
        this.appCoinsManagerProvider = provider3;
    }

    public static FragmentModule_ProvidesEditorialListManagerFactory create(FragmentModule fragmentModule, Provider<EditorialCardListRepository> provider, Provider<ReactionsManager> provider2, Provider<AppCoinsManager> provider3) {
        return new FragmentModule_ProvidesEditorialListManagerFactory(fragmentModule, provider, provider2, provider3);
    }

    public static EditorialListManager providesEditorialListManager(FragmentModule fragmentModule, EditorialCardListRepository editorialCardListRepository, ReactionsManager reactionsManager, AppCoinsManager appCoinsManager) {
        EditorialListManager providesEditorialListManager = fragmentModule.providesEditorialListManager(editorialCardListRepository, reactionsManager, appCoinsManager);
        C10825c.m36718a(providesEditorialListManager, "Cannot return null from a non-@Nullable @Provides method");
        return providesEditorialListManager;
    }

    public EditorialListManager get() {
        return providesEditorialListManager(this.module, this.editorialCardListRepositoryProvider.get(), this.reactionsManagerProvider.get(), this.appCoinsManagerProvider.get());
    }
}
