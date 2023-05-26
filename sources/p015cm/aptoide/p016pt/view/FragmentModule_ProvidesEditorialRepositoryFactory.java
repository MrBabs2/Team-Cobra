package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.editorial.EditorialRepository;
import p015cm.aptoide.p016pt.editorial.EditorialService;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.FragmentModule_ProvidesEditorialRepositoryFactory */
public final class FragmentModule_ProvidesEditorialRepositoryFactory implements C10824b<EditorialRepository> {
    private final Provider<EditorialService> editorialServiceProvider;
    private final FragmentModule module;

    public FragmentModule_ProvidesEditorialRepositoryFactory(FragmentModule fragmentModule, Provider<EditorialService> provider) {
        this.module = fragmentModule;
        this.editorialServiceProvider = provider;
    }

    public static FragmentModule_ProvidesEditorialRepositoryFactory create(FragmentModule fragmentModule, Provider<EditorialService> provider) {
        return new FragmentModule_ProvidesEditorialRepositoryFactory(fragmentModule, provider);
    }

    public static EditorialRepository providesEditorialRepository(FragmentModule fragmentModule, EditorialService editorialService) {
        EditorialRepository providesEditorialRepository = fragmentModule.providesEditorialRepository(editorialService);
        C10825c.m36718a(providesEditorialRepository, "Cannot return null from a non-@Nullable @Provides method");
        return providesEditorialRepository;
    }

    public EditorialRepository get() {
        return providesEditorialRepository(this.module, this.editorialServiceProvider.get());
    }
}
