package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.download.view.outofspace.OutOfSpaceDialogPresenter;
import p015cm.aptoide.p016pt.download.view.outofspace.OutOfSpaceManager;
import p015cm.aptoide.p016pt.download.view.outofspace.OutOfSpaceNavigator;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.FragmentModule_ProvidesOutOfSpaceDialogPresenterFactory */
public final class FragmentModule_ProvidesOutOfSpaceDialogPresenterFactory implements C10824b<OutOfSpaceDialogPresenter> {
    private final Provider<CrashReport> crashReporterProvider;
    private final FragmentModule module;
    private final Provider<OutOfSpaceManager> outOfSpaceManagerProvider;
    private final Provider<OutOfSpaceNavigator> outOfSpaceNavigatorProvider;

    public FragmentModule_ProvidesOutOfSpaceDialogPresenterFactory(FragmentModule fragmentModule, Provider<CrashReport> provider, Provider<OutOfSpaceManager> provider2, Provider<OutOfSpaceNavigator> provider3) {
        this.module = fragmentModule;
        this.crashReporterProvider = provider;
        this.outOfSpaceManagerProvider = provider2;
        this.outOfSpaceNavigatorProvider = provider3;
    }

    public static FragmentModule_ProvidesOutOfSpaceDialogPresenterFactory create(FragmentModule fragmentModule, Provider<CrashReport> provider, Provider<OutOfSpaceManager> provider2, Provider<OutOfSpaceNavigator> provider3) {
        return new FragmentModule_ProvidesOutOfSpaceDialogPresenterFactory(fragmentModule, provider, provider2, provider3);
    }

    public static OutOfSpaceDialogPresenter providesOutOfSpaceDialogPresenter(FragmentModule fragmentModule, CrashReport crashReport, OutOfSpaceManager outOfSpaceManager, OutOfSpaceNavigator outOfSpaceNavigator) {
        OutOfSpaceDialogPresenter providesOutOfSpaceDialogPresenter = fragmentModule.providesOutOfSpaceDialogPresenter(crashReport, outOfSpaceManager, outOfSpaceNavigator);
        C10825c.m36718a(providesOutOfSpaceDialogPresenter, "Cannot return null from a non-@Nullable @Provides method");
        return providesOutOfSpaceDialogPresenter;
    }

    public OutOfSpaceDialogPresenter get() {
        return providesOutOfSpaceDialogPresenter(this.module, this.crashReporterProvider.get(), this.outOfSpaceManagerProvider.get(), this.outOfSpaceNavigatorProvider.get());
    }
}
