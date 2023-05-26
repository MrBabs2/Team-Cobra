package p015cm.aptoide.p016pt.socialmedia;

import java.util.HashMap;
import kotlin.C4789l;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import p015cm.aptoide.aptoideviews.socialmedia.SocialMediaView;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, mo16641d2 = {"Lcm/aptoide/pt/socialmedia/SocialMediaAnalytics;", "", "analyticsManager", "Lcm/aptoide/analytics/AnalyticsManager;", "navigationTracker", "Lcm/aptoide/analytics/implementation/navigation/NavigationTracker;", "(Lcm/aptoide/analytics/AnalyticsManager;Lcm/aptoide/analytics/implementation/navigation/NavigationTracker;)V", "getAnalyticsManager", "()Lcm/aptoide/analytics/AnalyticsManager;", "getNavigationTracker", "()Lcm/aptoide/analytics/implementation/navigation/NavigationTracker;", "mapSocialMediaTypeToAction", "", "socialMediaType", "Lcm/aptoide/aptoideviews/socialmedia/SocialMediaView$SocialMediaType;", "sendPromoteSocialMediaClickEvent", "", "Companion", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.socialmedia.SocialMediaAnalytics */
/* compiled from: SocialMediaAnalytics.kt */
public class SocialMediaAnalytics {
    /* access modifiers changed from: private */
    public static final String ACTION = "action";
    /* access modifiers changed from: private */
    public static final String CONTEXT = CONTEXT;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final String FACEBOOK_ACTION = FACEBOOK_ACTION;
    /* access modifiers changed from: private */
    public static final String INSTAGRAM_ACTION = INSTAGRAM_ACTION;
    public static final String PROMOTE_SOCIAL_MEDIA_EVENT_NAME = "promote_social_media_click";
    /* access modifiers changed from: private */
    public static final String TWITTER_ACTION = TWITTER_ACTION;
    private final AnalyticsManager analyticsManager;
    private final NavigationTracker navigationTracker;

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0006¨\u0006\u0010"}, mo16641d2 = {"Lcm/aptoide/pt/socialmedia/SocialMediaAnalytics$Companion;", "", "()V", "ACTION", "", "getACTION", "()Ljava/lang/String;", "CONTEXT", "getCONTEXT", "FACEBOOK_ACTION", "getFACEBOOK_ACTION", "INSTAGRAM_ACTION", "getINSTAGRAM_ACTION", "PROMOTE_SOCIAL_MEDIA_EVENT_NAME", "TWITTER_ACTION", "getTWITTER_ACTION", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
    /* renamed from: cm.aptoide.pt.socialmedia.SocialMediaAnalytics$Companion */
    /* compiled from: SocialMediaAnalytics.kt */
    public static final class Companion {
        private Companion() {
        }

        public final String getACTION() {
            return SocialMediaAnalytics.ACTION;
        }

        public final String getCONTEXT() {
            return SocialMediaAnalytics.CONTEXT;
        }

        public final String getFACEBOOK_ACTION() {
            return SocialMediaAnalytics.FACEBOOK_ACTION;
        }

        public final String getINSTAGRAM_ACTION() {
            return SocialMediaAnalytics.INSTAGRAM_ACTION;
        }

        public final String getTWITTER_ACTION() {
            return SocialMediaAnalytics.TWITTER_ACTION;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @C4789l(mo16639bv = {1, 0, 3}, mo16642k = 3, mo16643mv = {1, 1, 16})
    /* renamed from: cm.aptoide.pt.socialmedia.SocialMediaAnalytics$WhenMappings */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SocialMediaView.SocialMediaType.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[SocialMediaView.SocialMediaType.FACEBOOK_CLICK.ordinal()] = 1;
            $EnumSwitchMapping$0[SocialMediaView.SocialMediaType.TWITTER_CLICK.ordinal()] = 2;
            $EnumSwitchMapping$0[SocialMediaView.SocialMediaType.INSTAGRAM_CLICK.ordinal()] = 3;
        }
    }

    public SocialMediaAnalytics(AnalyticsManager analyticsManager2, NavigationTracker navigationTracker2) {
        C10202j.m34178b(analyticsManager2, "analyticsManager");
        C10202j.m34178b(navigationTracker2, "navigationTracker");
        this.analyticsManager = analyticsManager2;
        this.navigationTracker = navigationTracker2;
    }

    private final String mapSocialMediaTypeToAction(SocialMediaView.SocialMediaType socialMediaType) {
        int i = WhenMappings.$EnumSwitchMapping$0[socialMediaType.ordinal()];
        if (i == 1) {
            return FACEBOOK_ACTION;
        }
        if (i == 2) {
            return TWITTER_ACTION;
        }
        if (i == 3) {
            return INSTAGRAM_ACTION;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final AnalyticsManager getAnalyticsManager() {
        return this.analyticsManager;
    }

    public final NavigationTracker getNavigationTracker() {
        return this.navigationTracker;
    }

    public final void sendPromoteSocialMediaClickEvent(SocialMediaView.SocialMediaType socialMediaType) {
        C10202j.m34178b(socialMediaType, "socialMediaType");
        HashMap hashMap = new HashMap();
        hashMap.put(ACTION, mapSocialMediaTypeToAction(socialMediaType));
        String str = CONTEXT;
        String viewName = this.navigationTracker.getViewName(true);
        C10202j.m34174a((Object) viewName, "navigationTracker.getViewName(true)");
        hashMap.put(str, viewName);
        this.analyticsManager.logEvent(hashMap, PROMOTE_SOCIAL_MEDIA_EVENT_NAME, AnalyticsManager.Action.CLICK, this.navigationTracker.getViewName(true));
    }
}
