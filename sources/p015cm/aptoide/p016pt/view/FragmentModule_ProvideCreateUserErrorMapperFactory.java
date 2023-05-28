package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.account.view.AccountErrorMapper;
import p015cm.aptoide.p016pt.account.view.user.CreateUserErrorMapper;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.FragmentModule_ProvideCreateUserErrorMapperFactory */
public final class FragmentModule_ProvideCreateUserErrorMapperFactory implements C10824b<CreateUserErrorMapper> {
    private final Provider<AccountErrorMapper> accountErrorMapperProvider;
    private final FragmentModule module;

    public FragmentModule_ProvideCreateUserErrorMapperFactory(FragmentModule fragmentModule, Provider<AccountErrorMapper> provider) {
        this.module = fragmentModule;
        this.accountErrorMapperProvider = provider;
    }

    public static FragmentModule_ProvideCreateUserErrorMapperFactory create(FragmentModule fragmentModule, Provider<AccountErrorMapper> provider) {
        return new FragmentModule_ProvideCreateUserErrorMapperFactory(fragmentModule, provider);
    }

    public static CreateUserErrorMapper provideCreateUserErrorMapper(FragmentModule fragmentModule, AccountErrorMapper accountErrorMapper) {
        CreateUserErrorMapper provideCreateUserErrorMapper = fragmentModule.provideCreateUserErrorMapper(accountErrorMapper);
        C10825c.m36718a(provideCreateUserErrorMapper, "Cannot return null from a non-@Nullable @Provides method");
        return provideCreateUserErrorMapper;
    }

    public CreateUserErrorMapper get() {
        return provideCreateUserErrorMapper(this.module, this.accountErrorMapperProvider.get());
    }
}
