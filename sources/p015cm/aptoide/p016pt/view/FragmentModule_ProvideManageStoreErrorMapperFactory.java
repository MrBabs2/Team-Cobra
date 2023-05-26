package p015cm.aptoide.p016pt.view;

import p015cm.aptoide.p016pt.account.view.store.ManageStoreErrorMapper;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.FragmentModule_ProvideManageStoreErrorMapperFactory */
public final class FragmentModule_ProvideManageStoreErrorMapperFactory implements C10824b<ManageStoreErrorMapper> {
    private final FragmentModule module;

    public FragmentModule_ProvideManageStoreErrorMapperFactory(FragmentModule fragmentModule) {
        this.module = fragmentModule;
    }

    public static FragmentModule_ProvideManageStoreErrorMapperFactory create(FragmentModule fragmentModule) {
        return new FragmentModule_ProvideManageStoreErrorMapperFactory(fragmentModule);
    }

    public static ManageStoreErrorMapper provideManageStoreErrorMapper(FragmentModule fragmentModule) {
        ManageStoreErrorMapper provideManageStoreErrorMapper = fragmentModule.provideManageStoreErrorMapper();
        C10825c.m36718a(provideManageStoreErrorMapper, "Cannot return null from a non-@Nullable @Provides method");
        return provideManageStoreErrorMapper;
    }

    public ManageStoreErrorMapper get() {
        return provideManageStoreErrorMapper(this.module);
    }
}
