package p015cm.aptoide.p016pt.view;

import p015cm.aptoide.p016pt.home.apps.AppMapper;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.FragmentModule_ProvidesAppMapperFactory */
public final class FragmentModule_ProvidesAppMapperFactory implements C10824b<AppMapper> {
    private final FragmentModule module;

    public FragmentModule_ProvidesAppMapperFactory(FragmentModule fragmentModule) {
        this.module = fragmentModule;
    }

    public static FragmentModule_ProvidesAppMapperFactory create(FragmentModule fragmentModule) {
        return new FragmentModule_ProvidesAppMapperFactory(fragmentModule);
    }

    public static AppMapper providesAppMapper(FragmentModule fragmentModule) {
        AppMapper providesAppMapper = fragmentModule.providesAppMapper();
        C10825c.m36718a(providesAppMapper, "Cannot return null from a non-@Nullable @Provides method");
        return providesAppMapper;
    }

    public AppMapper get() {
        return providesAppMapper(this.module);
    }
}
