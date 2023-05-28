package p015cm.aptoide.p016pt.view;

import javax.inject.Provider;
import p015cm.aptoide.accountmanager.AptoideAccountManager;
import p015cm.aptoide.p016pt.UserFeedbackAnalytics;
import p015cm.aptoide.p016pt.editorialList.EditorialListAnalytics;
import p015cm.aptoide.p016pt.editorialList.EditorialListManager;
import p015cm.aptoide.p016pt.editorialList.EditorialListNavigator;
import p015cm.aptoide.p016pt.editorialList.EditorialListPresenter;
import p320o.p321b.C10824b;
import p320o.p321b.C10825c;

/* renamed from: cm.aptoide.pt.view.FragmentModule_ProvidesEditorialListPresenterFactory */
public final class FragmentModule_ProvidesEditorialListPresenterFactory implements C10824b<EditorialListPresenter> {
    private final Provider<AptoideAccountManager> aptoideAccountManagerProvider;
    private final Provider<EditorialListAnalytics> editorialListAnalyticsProvider;
    private final Provider<EditorialListManager> editorialListManagerProvider;
    private final Provider<EditorialListNavigator> editorialListNavigatorProvider;
    private final FragmentModule module;
    private final Provider<UserFeedbackAnalytics> userFeedbackAnalyticsProvider;

    public FragmentModule_ProvidesEditorialListPresenterFactory(FragmentModule fragmentModule, Provider<EditorialListManager> provider, Provider<AptoideAccountManager> provider2, Provider<EditorialListNavigator> provider3, Provider<EditorialListAnalytics> provider4, Provider<UserFeedbackAnalytics> provider5) {
        this.module = fragmentModule;
        this.editorialListManagerProvider = provider;
        this.aptoideAccountManagerProvider = provider2;
        this.editorialListNavigatorProvider = provider3;
        this.editorialListAnalyticsProvider = provider4;
        this.userFeedbackAnalyticsProvider = provider5;
    }

    public static FragmentModule_ProvidesEditorialListPresenterFactory create(FragmentModule fragmentModule, Provider<EditorialListManager> provider, Provider<AptoideAccountManager> provider2, Provider<EditorialListNavigator> provider3, Provider<EditorialListAnalytics> provider4, Provider<UserFeedbackAnalytics> provider5) {
        return new FragmentModule_ProvidesEditorialListPresenterFactory(fragmentModule, provider, provider2, provider3, provider4, provider5);
    }

    public static EditorialListPresenter providesEditorialListPresenter(FragmentModule fragmentModule, EditorialListManager editorialListManager, AptoideAccountManager aptoideAccountManager, EditorialListNavigator editorialListNavigator, EditorialListAnalytics editorialListAnalytics, UserFeedbackAnalytics userFeedbackAnalytics) {
        EditorialListPresenter providesEditorialListPresenter = fragmentModule.providesEditorialListPresenter(editorialListManager, aptoideAccountManager, editorialListNavigator, editorialListAnalytics, userFeedbackAnalytics);
        C10825c.m36718a(providesEditorialListPresenter, "Cannot return null from a non-@Nullable @Provides method");
        return providesEditorialListPresenter;
    }

    public EditorialListPresenter get() {
        return providesEditorialListPresenter(this.module, this.editorialListManagerProvider.get(), this.aptoideAccountManagerProvider.get(), this.editorialListNavigatorProvider.get(), this.editorialListAnalyticsProvider.get(), this.userFeedbackAnalyticsProvider.get());
    }
}
