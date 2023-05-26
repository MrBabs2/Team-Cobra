package p015cm.aptoide.p016pt.view;

import p015cm.aptoide.p016pt.bottomNavigation.BottomNavigationMapper;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.ActivityModule_ProvideBottomNavigationMapperFactory */
public final class ActivityModule_ProvideBottomNavigationMapperFactory implements C10824b<BottomNavigationMapper> {
    private final ActivityModule module;

    public ActivityModule_ProvideBottomNavigationMapperFactory(ActivityModule activityModule) {
        this.module = activityModule;
    }

    public static ActivityModule_ProvideBottomNavigationMapperFactory create(ActivityModule activityModule) {
        return new ActivityModule_ProvideBottomNavigationMapperFactory(activityModule);
    }

    public static BottomNavigationMapper provideBottomNavigationMapper(ActivityModule activityModule) {
        BottomNavigationMapper provideBottomNavigationMapper = activityModule.provideBottomNavigationMapper();
        C10825c.m36718a(provideBottomNavigationMapper, "Cannot return null from a non-@Nullable @Provides method");
        return provideBottomNavigationMapper;
    }

    public BottomNavigationMapper get() {
        return provideBottomNavigationMapper(this.module);
    }
}
