package p015cm.aptoide.p016pt.timeline.view.follow;

import javax.inject.Provider;
import p015cm.aptoide.p016pt.view.fragment.GridRecyclerSwipeWithToolbarFragment_MembersInjector;
import p320o.C10822a;

/* renamed from: cm.aptoide.pt.timeline.view.follow.TimeLineFollowFragment_MembersInjector */
public final class TimeLineFollowFragment_MembersInjector implements C10822a<TimeLineFollowFragment> {
    private final Provider<String> marketNameProvider;

    public TimeLineFollowFragment_MembersInjector(Provider<String> provider) {
        this.marketNameProvider = provider;
    }

    public static C10822a<TimeLineFollowFragment> create(Provider<String> provider) {
        return new TimeLineFollowFragment_MembersInjector(provider);
    }

    public void injectMembers(TimeLineFollowFragment timeLineFollowFragment) {
        GridRecyclerSwipeWithToolbarFragment_MembersInjector.injectMarketName(timeLineFollowFragment, this.marketNameProvider.get());
    }
}
