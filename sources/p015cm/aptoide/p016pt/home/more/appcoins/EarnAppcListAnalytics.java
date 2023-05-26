package p015cm.aptoide.p016pt.home.more.appcoins;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.download.DownloadAnalytics;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, mo16641d2 = {"Lcm/aptoide/pt/home/more/appcoins/EarnAppcListAnalytics;", "", "downloadAnalytics", "Lcm/aptoide/pt/download/DownloadAnalytics;", "(Lcm/aptoide/pt/download/DownloadAnalytics;)V", "sendNotEnoughSpaceErrorEvent", "", "md5", "", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.home.more.appcoins.EarnAppcListAnalytics */
/* compiled from: EarnAppcListAnalytics.kt */
public final class EarnAppcListAnalytics {
    private final DownloadAnalytics downloadAnalytics;

    public EarnAppcListAnalytics(DownloadAnalytics downloadAnalytics2) {
        C10202j.m34178b(downloadAnalytics2, "downloadAnalytics");
        this.downloadAnalytics = downloadAnalytics2;
    }

    public final void sendNotEnoughSpaceErrorEvent(String str) {
        this.downloadAnalytics.sendNotEnoughSpaceError(str);
    }
}
