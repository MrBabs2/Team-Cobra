package p015cm.aptoide.p016pt.comments.view;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.UserFeedbackAnalytics;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p015cm.aptoide.p016pt.view.fragment.BaseDialogFragment_MembersInjector;
import p320o.C10822a;

/* renamed from: cm.aptoide.pt.comments.view.CommentDialogFragment_MembersInjector */
public final class CommentDialogFragment_MembersInjector implements C10822a<CommentDialogFragment> {
    private final Provider<ThemeManager> themeManagerProvider;
    private final Provider<UserFeedbackAnalytics> userFeedbackAnalyticsProvider;

    public CommentDialogFragment_MembersInjector(Provider<ThemeManager> provider, Provider<UserFeedbackAnalytics> provider2) {
        this.themeManagerProvider = provider;
        this.userFeedbackAnalyticsProvider = provider2;
    }

    public static C10822a<CommentDialogFragment> create(Provider<ThemeManager> provider, Provider<UserFeedbackAnalytics> provider2) {
        return new CommentDialogFragment_MembersInjector(provider, provider2);
    }

    public static void injectUserFeedbackAnalytics(CommentDialogFragment commentDialogFragment, UserFeedbackAnalytics userFeedbackAnalytics) {
        commentDialogFragment.userFeedbackAnalytics = userFeedbackAnalytics;
    }

    public void injectMembers(CommentDialogFragment commentDialogFragment) {
        BaseDialogFragment_MembersInjector.injectThemeManager(commentDialogFragment, this.themeManagerProvider.get());
        injectUserFeedbackAnalytics(commentDialogFragment, this.userFeedbackAnalyticsProvider.get());
    }
}
