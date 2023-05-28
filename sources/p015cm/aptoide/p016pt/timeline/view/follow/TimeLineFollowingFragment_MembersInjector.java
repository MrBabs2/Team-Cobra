package p015cm.aptoide.p016pt.timeline.view.follow;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p015cm.aptoide.p016pt.view.fragment.GridRecyclerSwipeWithToolbarFragment_MembersInjector;
import p320o.C10822a;

/* renamed from: cm.aptoide.pt.timeline.view.follow.TimeLineFollowingFragment_MembersInjector */
public final class TimeLineFollowingFragment_MembersInjector implements C10822a<TimeLineFollowingFragment> {
    private final Provider<String> marketNameProvider;
    private final Provider<ThemeManager> themeManagerProvider;

    public TimeLineFollowingFragment_MembersInjector(Provider<String> provider, Provider<ThemeManager> provider2) {
        this.marketNameProvider = provider;
        this.themeManagerProvider = provider2;
    }

    public static C10822a<TimeLineFollowingFragment> create(Provider<String> provider, Provider<ThemeManager> provider2) {
        return new TimeLineFollowingFragment_MembersInjector(provider, provider2);
    }

    public static void injectThemeManager(TimeLineFollowingFragment timeLineFollowingFragment, ThemeManager themeManager) {
        timeLineFollowingFragment.themeManager = themeManager;
    }

    public void injectMembers(TimeLineFollowingFragment timeLineFollowingFragment) {
        GridRecyclerSwipeWithToolbarFragment_MembersInjector.injectMarketName(timeLineFollowingFragment, this.marketNameProvider.get());
        injectThemeManager(timeLineFollowingFragment, this.themeManagerProvider.get());
    }
}
