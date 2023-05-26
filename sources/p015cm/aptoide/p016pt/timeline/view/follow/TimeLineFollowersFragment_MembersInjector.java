package p015cm.aptoide.p016pt.timeline.view.follow;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p015cm.aptoide.p016pt.view.fragment.GridRecyclerSwipeWithToolbarFragment_MembersInjector;
import p320o.C10822a;

/* renamed from: cm.aptoide.pt.timeline.view.follow.TimeLineFollowersFragment_MembersInjector */
public final class TimeLineFollowersFragment_MembersInjector implements C10822a<TimeLineFollowersFragment> {
    private final Provider<String> marketNameProvider;
    private final Provider<ThemeManager> themeManagerProvider;

    public TimeLineFollowersFragment_MembersInjector(Provider<String> provider, Provider<ThemeManager> provider2) {
        this.marketNameProvider = provider;
        this.themeManagerProvider = provider2;
    }

    public static C10822a<TimeLineFollowersFragment> create(Provider<String> provider, Provider<ThemeManager> provider2) {
        return new TimeLineFollowersFragment_MembersInjector(provider, provider2);
    }

    public static void injectThemeManager(TimeLineFollowersFragment timeLineFollowersFragment, ThemeManager themeManager) {
        timeLineFollowersFragment.themeManager = themeManager;
    }

    public void injectMembers(TimeLineFollowersFragment timeLineFollowersFragment) {
        GridRecyclerSwipeWithToolbarFragment_MembersInjector.injectMarketName(timeLineFollowersFragment, this.marketNameProvider.get());
        injectThemeManager(timeLineFollowersFragment, this.themeManagerProvider.get());
    }
}
