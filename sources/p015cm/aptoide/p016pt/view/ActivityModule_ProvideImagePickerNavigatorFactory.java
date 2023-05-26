package p015cm.aptoide.p016pt.view;

import p015cm.aptoide.p016pt.account.view.ImagePickerNavigator;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.ActivityModule_ProvideImagePickerNavigatorFactory */
public final class ActivityModule_ProvideImagePickerNavigatorFactory implements C10824b<ImagePickerNavigator> {
    private final ActivityModule module;

    public ActivityModule_ProvideImagePickerNavigatorFactory(ActivityModule activityModule) {
        this.module = activityModule;
    }

    public static ActivityModule_ProvideImagePickerNavigatorFactory create(ActivityModule activityModule) {
        return new ActivityModule_ProvideImagePickerNavigatorFactory(activityModule);
    }

    public static ImagePickerNavigator provideImagePickerNavigator(ActivityModule activityModule) {
        ImagePickerNavigator provideImagePickerNavigator = activityModule.provideImagePickerNavigator();
        C10825c.m36718a(provideImagePickerNavigator, "Cannot return null from a non-@Nullable @Provides method");
        return provideImagePickerNavigator;
    }

    public ImagePickerNavigator get() {
        return provideImagePickerNavigator(this.module);
    }
}
