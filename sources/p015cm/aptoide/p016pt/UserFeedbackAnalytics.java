package p015cm.aptoide.p016pt;

import java.util.HashMap;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.analytics.AnalyticsManager;
import p015cm.aptoide.analytics.implementation.navigation.NavigationTracker;
import p015cm.aptoide.p016pt.DeepLinkIntentReceiver;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0016\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0011\u001a\u00020\fH\u0016J\u0006\u0010\u0012\u001a\u00020\fJ\u0006\u0010\u0013\u001a\u00020\fJ\u000e\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0016J\u0018\u0010\u0017\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u000fH\u0002J\u0006\u0010\u0019\u001a\u00020\fJ\u0006\u0010\u001a\u001a\u00020\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001c"}, mo16641d2 = {"Lcm/aptoide/pt/UserFeedbackAnalytics;", "", "analyticsManager", "Lcm/aptoide/analytics/AnalyticsManager;", "navigationTracker", "Lcm/aptoide/analytics/implementation/navigation/NavigationTracker;", "(Lcm/aptoide/analytics/AnalyticsManager;Lcm/aptoide/analytics/implementation/navigation/NavigationTracker;)V", "getAnalyticsManager", "()Lcm/aptoide/analytics/AnalyticsManager;", "getNavigationTracker", "()Lcm/aptoide/analytics/implementation/navigation/NavigationTracker;", "sendAppReviewReplyComment", "", "sendFirstLevelCommentEvent", "context", "", "sendRatingEvent", "sendReactionEvent", "sendStoreCommentEvent", "sendStoreCommentReplyEvent", "sendSubmitAppRateEvent", "hasComment", "", "sendUserFeedbackEvent", "type", "sendVoteDownEvent", "sendVoteUpEvent", "Companion", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.UserFeedbackAnalytics */
/* compiled from: UserFeedbackAnalytics.kt */
public class UserFeedbackAnalytics {
    /* access modifiers changed from: private */
    public static String CONTEXT = "context";
    /* access modifiers changed from: private */
    public static String CONTEXT_APP = "app";
    /* access modifiers changed from: private */
    public static String CONTEXT_EDITORIAL = DeepLinkIntentReceiver.DeepLinksTargets.EDITORIAL_DEEPLINK;
    /* access modifiers changed from: private */
    public static String CONTEXT_STORES = "stores";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static String TYPE = "type";
    /* access modifiers changed from: private */
    public static String TYPE_COMMENT_LEVEL_1 = "comment_level_1";
    /* access modifiers changed from: private */
    public static String TYPE_COMMENT_LEVEL_2 = "comment_level_2";
    /* access modifiers changed from: private */
    public static String TYPE_RATE = "rate";
    /* access modifiers changed from: private */
    public static String TYPE_REACTION = "reaction";
    /* access modifiers changed from: private */
    public static String TYPE_VOTE_DOWN = "vote_down";
    /* access modifiers changed from: private */
    public static String TYPE_VOTE_UP = "vote_up";
    public static String USER_FEEDBACK_EVENT_NAME = "user_feedback";
    private final AnalyticsManager analyticsManager;
    private final NavigationTracker navigationTracker;

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b$\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001a\u0010\u001e\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001a\u0010!\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001a\u0010$\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR\u0012\u0010'\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006("}, mo16641d2 = {"Lcm/aptoide/pt/UserFeedbackAnalytics$Companion;", "", "()V", "CONTEXT", "", "getCONTEXT", "()Ljava/lang/String;", "setCONTEXT", "(Ljava/lang/String;)V", "CONTEXT_APP", "getCONTEXT_APP", "setCONTEXT_APP", "CONTEXT_EDITORIAL", "getCONTEXT_EDITORIAL", "setCONTEXT_EDITORIAL", "CONTEXT_STORES", "getCONTEXT_STORES", "setCONTEXT_STORES", "TYPE", "getTYPE", "setTYPE", "TYPE_COMMENT_LEVEL_1", "getTYPE_COMMENT_LEVEL_1", "setTYPE_COMMENT_LEVEL_1", "TYPE_COMMENT_LEVEL_2", "getTYPE_COMMENT_LEVEL_2", "setTYPE_COMMENT_LEVEL_2", "TYPE_RATE", "getTYPE_RATE", "setTYPE_RATE", "TYPE_REACTION", "getTYPE_REACTION", "setTYPE_REACTION", "TYPE_VOTE_DOWN", "getTYPE_VOTE_DOWN", "setTYPE_VOTE_DOWN", "TYPE_VOTE_UP", "getTYPE_VOTE_UP", "setTYPE_VOTE_UP", "USER_FEEDBACK_EVENT_NAME", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
    /* renamed from: cm.aptoide.pt.UserFeedbackAnalytics$Companion */
    /* compiled from: UserFeedbackAnalytics.kt */
    public static final class Companion {
        private Companion() {
        }

        public final String getCONTEXT() {
            return UserFeedbackAnalytics.CONTEXT;
        }

        public final String getCONTEXT_APP() {
            return UserFeedbackAnalytics.CONTEXT_APP;
        }

        public final String getCONTEXT_EDITORIAL() {
            return UserFeedbackAnalytics.CONTEXT_EDITORIAL;
        }

        public final String getCONTEXT_STORES() {
            return UserFeedbackAnalytics.CONTEXT_STORES;
        }

        public final String getTYPE() {
            return UserFeedbackAnalytics.TYPE;
        }

        public final String getTYPE_COMMENT_LEVEL_1() {
            return UserFeedbackAnalytics.TYPE_COMMENT_LEVEL_1;
        }

        public final String getTYPE_COMMENT_LEVEL_2() {
            return UserFeedbackAnalytics.TYPE_COMMENT_LEVEL_2;
        }

        public final String getTYPE_RATE() {
            return UserFeedbackAnalytics.TYPE_RATE;
        }

        public final String getTYPE_REACTION() {
            return UserFeedbackAnalytics.TYPE_REACTION;
        }

        public final String getTYPE_VOTE_DOWN() {
            return UserFeedbackAnalytics.TYPE_VOTE_DOWN;
        }

        public final String getTYPE_VOTE_UP() {
            return UserFeedbackAnalytics.TYPE_VOTE_UP;
        }

        public final void setCONTEXT(String str) {
            C10202j.m34178b(str, "<set-?>");
            UserFeedbackAnalytics.CONTEXT = str;
        }

        public final void setCONTEXT_APP(String str) {
            C10202j.m34178b(str, "<set-?>");
            UserFeedbackAnalytics.CONTEXT_APP = str;
        }

        public final void setCONTEXT_EDITORIAL(String str) {
            C10202j.m34178b(str, "<set-?>");
            UserFeedbackAnalytics.CONTEXT_EDITORIAL = str;
        }

        public final void setCONTEXT_STORES(String str) {
            C10202j.m34178b(str, "<set-?>");
            UserFeedbackAnalytics.CONTEXT_STORES = str;
        }

        public final void setTYPE(String str) {
            C10202j.m34178b(str, "<set-?>");
            UserFeedbackAnalytics.TYPE = str;
        }

        public final void setTYPE_COMMENT_LEVEL_1(String str) {
            C10202j.m34178b(str, "<set-?>");
            UserFeedbackAnalytics.TYPE_COMMENT_LEVEL_1 = str;
        }

        public final void setTYPE_COMMENT_LEVEL_2(String str) {
            C10202j.m34178b(str, "<set-?>");
            UserFeedbackAnalytics.TYPE_COMMENT_LEVEL_2 = str;
        }

        public final void setTYPE_RATE(String str) {
            C10202j.m34178b(str, "<set-?>");
            UserFeedbackAnalytics.TYPE_RATE = str;
        }

        public final void setTYPE_REACTION(String str) {
            C10202j.m34178b(str, "<set-?>");
            UserFeedbackAnalytics.TYPE_REACTION = str;
        }

        public final void setTYPE_VOTE_DOWN(String str) {
            C10202j.m34178b(str, "<set-?>");
            UserFeedbackAnalytics.TYPE_VOTE_DOWN = str;
        }

        public final void setTYPE_VOTE_UP(String str) {
            C10202j.m34178b(str, "<set-?>");
            UserFeedbackAnalytics.TYPE_VOTE_UP = str;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public UserFeedbackAnalytics(AnalyticsManager analyticsManager2, NavigationTracker navigationTracker2) {
        C10202j.m34178b(analyticsManager2, "analyticsManager");
        C10202j.m34178b(navigationTracker2, "navigationTracker");
        this.analyticsManager = analyticsManager2;
        this.navigationTracker = navigationTracker2;
    }

    private final void sendFirstLevelCommentEvent(String str) {
        sendUserFeedbackEvent(str, TYPE_COMMENT_LEVEL_1);
    }

    private final void sendRatingEvent(String str) {
        sendUserFeedbackEvent(str, TYPE_RATE);
    }

    private final void sendUserFeedbackEvent(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(TYPE, str2);
        hashMap.put(CONTEXT, str);
        this.analyticsManager.logEvent(hashMap, USER_FEEDBACK_EVENT_NAME, AnalyticsManager.Action.CLICK, this.navigationTracker.getViewName(true));
    }

    public final AnalyticsManager getAnalyticsManager() {
        return this.analyticsManager;
    }

    public final NavigationTracker getNavigationTracker() {
        return this.navigationTracker;
    }

    public final void sendAppReviewReplyComment() {
        sendUserFeedbackEvent(CONTEXT_APP, TYPE_COMMENT_LEVEL_2);
    }

    public void sendReactionEvent() {
        sendUserFeedbackEvent(CONTEXT_EDITORIAL, TYPE_REACTION);
    }

    public final void sendStoreCommentEvent() {
        sendUserFeedbackEvent(CONTEXT_STORES, TYPE_COMMENT_LEVEL_1);
    }

    public final void sendStoreCommentReplyEvent() {
        sendUserFeedbackEvent(CONTEXT_STORES, TYPE_COMMENT_LEVEL_2);
    }

    public final void sendSubmitAppRateEvent(boolean z) {
        sendRatingEvent(CONTEXT_APP);
        if (z) {
            sendFirstLevelCommentEvent(CONTEXT_APP);
        }
    }

    public final void sendVoteDownEvent() {
        sendUserFeedbackEvent(CONTEXT_APP, TYPE_VOTE_DOWN);
    }

    public final void sendVoteUpEvent() {
        sendUserFeedbackEvent(CONTEXT_APP, TYPE_VOTE_UP);
    }
}
