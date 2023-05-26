package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.editorialList.EditorialCardListRepository;
import p015cm.aptoide.p016pt.editorialList.EditorialCardListService;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.FragmentModule_ProvidesEditorialListRepositoryFactory */
public final class FragmentModule_ProvidesEditorialListRepositoryFactory implements C10824b<EditorialCardListRepository> {
    private final Provider<EditorialCardListService> editorialCardListServiceProvider;
    private final FragmentModule module;

    public FragmentModule_ProvidesEditorialListRepositoryFactory(FragmentModule fragmentModule, Provider<EditorialCardListService> provider) {
        this.module = fragmentModule;
        this.editorialCardListServiceProvider = provider;
    }

    public static FragmentModule_ProvidesEditorialListRepositoryFactory create(FragmentModule fragmentModule, Provider<EditorialCardListService> provider) {
        return new FragmentModule_ProvidesEditorialListRepositoryFactory(fragmentModule, provider);
    }

    public static EditorialCardListRepository providesEditorialListRepository(FragmentModule fragmentModule, EditorialCardListService editorialCardListService) {
        EditorialCardListRepository providesEditorialListRepository = fragmentModule.providesEditorialListRepository(editorialCardListService);
        C10825c.m36718a(providesEditorialListRepository, "Cannot return null from a non-@Nullable @Provides method");
        return providesEditorialListRepository;
    }

    public EditorialCardListRepository get() {
        return providesEditorialListRepository(this.module, this.editorialCardListServiceProvider.get());
    }
}
