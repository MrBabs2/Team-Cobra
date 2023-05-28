package p015cm.aptoide.p016pt.view;

import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.FragmentModule_ProvidesBundleEventFactory */
public final class FragmentModule_ProvidesBundleEventFactory implements C10824b<BundleEvent> {
    private final FragmentModule module;

    public FragmentModule_ProvidesBundleEventFactory(FragmentModule fragmentModule) {
        this.module = fragmentModule;
    }

    public static FragmentModule_ProvidesBundleEventFactory create(FragmentModule fragmentModule) {
        return new FragmentModule_ProvidesBundleEventFactory(fragmentModule);
    }

    public static BundleEvent providesBundleEvent(FragmentModule fragmentModule) {
        BundleEvent providesBundleEvent = fragmentModule.providesBundleEvent();
        C10825c.m36718a(providesBundleEvent, "Cannot return null from a non-@Nullable @Provides method");
        return providesBundleEvent;
    }

    public BundleEvent get() {
        return providesBundleEvent(this.module);
    }
}
