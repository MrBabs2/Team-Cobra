package p015cm.aptoide.p016pt.view;

import p015cm.aptoide.p016pt.account.view.AccountErrorMapper;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.FragmentModule_ProvideAccountErrorMapperFactory */
public final class FragmentModule_ProvideAccountErrorMapperFactory implements C10824b<AccountErrorMapper> {
    private final FragmentModule module;

    public FragmentModule_ProvideAccountErrorMapperFactory(FragmentModule fragmentModule) {
        this.module = fragmentModule;
    }

    public static FragmentModule_ProvideAccountErrorMapperFactory create(FragmentModule fragmentModule) {
        return new FragmentModule_ProvideAccountErrorMapperFactory(fragmentModule);
    }

    public static AccountErrorMapper provideAccountErrorMapper(FragmentModule fragmentModule) {
        AccountErrorMapper provideAccountErrorMapper = fragmentModule.provideAccountErrorMapper();
        C10825c.m36718a(provideAccountErrorMapper, "Cannot return null from a non-@Nullable @Provides method");
        return provideAccountErrorMapper;
    }

    public AccountErrorMapper get() {
        return provideAccountErrorMapper(this.module);
    }
}
