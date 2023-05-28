package p015cm.aptoide.p016pt.view;

import android.content.res.Resources;
import javax.inject.Provider;
import p320o.p321b.C10824b;

/* renamed from: cm.aptoide.pt.view.ActivityModule_ProvidesScreenHeightFactory */
public final class ActivityModule_ProvidesScreenHeightFactory implements C10824b<Float> {
    private final ActivityModule module;
    private final Provider<Resources> resourcesProvider;

    public ActivityModule_ProvidesScreenHeightFactory(ActivityModule activityModule, Provider<Resources> provider) {
        this.module = activityModule;
        this.resourcesProvider = provider;
    }

    public static ActivityModule_ProvidesScreenHeightFactory create(ActivityModule activityModule, Provider<Resources> provider) {
        return new ActivityModule_ProvidesScreenHeightFactory(activityModule, provider);
    }

    public static float providesScreenHeight(ActivityModule activityModule, Resources resources) {
        return activityModule.providesScreenHeight(resources);
    }

    public Float get() {
        return Float.valueOf(providesScreenHeight(this.module, this.resourcesProvider.get()));
    }
}
