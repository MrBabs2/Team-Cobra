package p015cm.aptoide.p016pt.view;

import android.content.res.Resources;
import javax.inject.Provider;
import p320o.p321b.C10824b;

/* renamed from: cm.aptoide.pt.view.ActivityModule_ProvidesScreenWidthFactory */
public final class ActivityModule_ProvidesScreenWidthFactory implements C10824b<Float> {
    private final ActivityModule module;
    private final Provider<Resources> resourcesProvider;

    public ActivityModule_ProvidesScreenWidthFactory(ActivityModule activityModule, Provider<Resources> provider) {
        this.module = activityModule;
        this.resourcesProvider = provider;
    }

    public static ActivityModule_ProvidesScreenWidthFactory create(ActivityModule activityModule, Provider<Resources> provider) {
        return new ActivityModule_ProvidesScreenWidthFactory(activityModule, provider);
    }

    public static float providesScreenWidth(ActivityModule activityModule, Resources resources) {
        return activityModule.providesScreenWidth(resources);
    }

    public Float get() {
        return Float.valueOf(providesScreenWidth(this.module, this.resourcesProvider.get()));
    }
}
