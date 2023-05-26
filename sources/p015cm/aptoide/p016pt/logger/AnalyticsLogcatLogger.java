package p015cm.aptoide.p016pt.logger;

import p015cm.aptoide.analytics.AnalyticsLogger;

/* renamed from: cm.aptoide.pt.logger.AnalyticsLogcatLogger */
public class AnalyticsLogcatLogger implements AnalyticsLogger {
    public void logDebug(String str, String str2) {
        Logger.getInstance().mo12975d(str, str2);
    }

    public void logWarningDebug(String str, String str2) {
        Logger.getInstance().mo12987w(str, str2);
    }
}
