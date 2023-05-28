package p015cm.aptoide.p016pt.view;

import p015cm.aptoide.p016pt.notification.AppcPromotionNotificationStringProvider;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.FragmentModule_ProvidesAppcPromotionNotificationStringProviderFactory */
public final class C4493xf1dd651 implements C10824b<AppcPromotionNotificationStringProvider> {
    private final FragmentModule module;

    public C4493xf1dd651(FragmentModule fragmentModule) {
        this.module = fragmentModule;
    }

    public static C4493xf1dd651 create(FragmentModule fragmentModule) {
        return new C4493xf1dd651(fragmentModule);
    }

    public static AppcPromotionNotificationStringProvider providesAppcPromotionNotificationStringProvider(FragmentModule fragmentModule) {
        AppcPromotionNotificationStringProvider providesAppcPromotionNotificationStringProvider = fragmentModule.providesAppcPromotionNotificationStringProvider();
        C10825c.m36718a(providesAppcPromotionNotificationStringProvider, "Cannot return null from a non-@Nullable @Provides method");
        return providesAppcPromotionNotificationStringProvider;
    }

    public AppcPromotionNotificationStringProvider get() {
        return providesAppcPromotionNotificationStringProvider(this.module);
    }
}
