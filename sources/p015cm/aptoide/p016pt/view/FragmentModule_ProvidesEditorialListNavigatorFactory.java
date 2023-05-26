package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.account.view.AccountNavigator;
import p015cm.aptoide.p016pt.editorialList.EditorialListNavigator;
import p015cm.aptoide.p016pt.navigator.FragmentNavigator;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.FragmentModule_ProvidesEditorialListNavigatorFactory */
public final class FragmentModule_ProvidesEditorialListNavigatorFactory implements C10824b<EditorialListNavigator> {
    private final Provider<AccountNavigator> accountNavigatorProvider;
    private final Provider<FragmentNavigator> fragmentNavigatorProvider;
    private final FragmentModule module;

    public FragmentModule_ProvidesEditorialListNavigatorFactory(FragmentModule fragmentModule, Provider<FragmentNavigator> provider, Provider<AccountNavigator> provider2) {
        this.module = fragmentModule;
        this.fragmentNavigatorProvider = provider;
        this.accountNavigatorProvider = provider2;
    }

    public static FragmentModule_ProvidesEditorialListNavigatorFactory create(FragmentModule fragmentModule, Provider<FragmentNavigator> provider, Provider<AccountNavigator> provider2) {
        return new FragmentModule_ProvidesEditorialListNavigatorFactory(fragmentModule, provider, provider2);
    }

    public static EditorialListNavigator providesEditorialListNavigator(FragmentModule fragmentModule, FragmentNavigator fragmentNavigator, AccountNavigator accountNavigator) {
        EditorialListNavigator providesEditorialListNavigator = fragmentModule.providesEditorialListNavigator(fragmentNavigator, accountNavigator);
        C10825c.m36718a(providesEditorialListNavigator, "Cannot return null from a non-@Nullable @Provides method");
        return providesEditorialListNavigator;
    }

    public EditorialListNavigator get() {
        return providesEditorialListNavigator(this.module, this.fragmentNavigatorProvider.get(), this.accountNavigatorProvider.get());
    }
}
