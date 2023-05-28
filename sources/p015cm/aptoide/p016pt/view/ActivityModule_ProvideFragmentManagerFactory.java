package p015cm.aptoide.p016pt.view;

import androidx.fragment.app.C0462h;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.ActivityModule_ProvideFragmentManagerFactory */
public final class ActivityModule_ProvideFragmentManagerFactory implements C10824b<C0462h> {
    private final ActivityModule module;

    public ActivityModule_ProvideFragmentManagerFactory(ActivityModule activityModule) {
        this.module = activityModule;
    }

    public static ActivityModule_ProvideFragmentManagerFactory create(ActivityModule activityModule) {
        return new ActivityModule_ProvideFragmentManagerFactory(activityModule);
    }

    public static C0462h provideFragmentManager(ActivityModule activityModule) {
        C0462h provideFragmentManager = activityModule.provideFragmentManager();
        C10825c.m36718a(provideFragmentManager, "Cannot return null from a non-@Nullable @Provides method");
        return provideFragmentManager;
    }

    public C0462h get() {
        return provideFragmentManager(this.module);
    }
}
