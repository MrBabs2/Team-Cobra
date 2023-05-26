package p015cm.aptoide.p016pt.download.view;

import kotlin.C4789l;
import kotlin.jvm.internal.C10204l;
import kotlin.jvm.internal.C10216x;
import kotlin.p045h0.C9156e;
import p015cm.aptoide.p016pt.download.DownloadAnalytics;

@C4789l(mo16639bv = {1, 0, 3}, mo16642k = 3, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.download.view.DownloadViewActionPresenter$present$1 */
/* compiled from: DownloadViewActionPresenter.kt */
final /* synthetic */ class DownloadViewActionPresenter$present$1 extends C10204l {
    DownloadViewActionPresenter$present$1(DownloadViewActionPresenter downloadViewActionPresenter) {
        super(downloadViewActionPresenter);
    }

    public Object get() {
        return DownloadViewActionPresenter.access$getAnalyticsContext$p((DownloadViewActionPresenter) this.receiver);
    }

    public String getName() {
        return "analyticsContext";
    }

    public C9156e getOwner() {
        return C10216x.m34186a(DownloadViewActionPresenter.class);
    }

    public String getSignature() {
        return "getAnalyticsContext()Lcm/aptoide/pt/download/DownloadAnalytics$AppContext;";
    }

    public void set(Object obj) {
        ((DownloadViewActionPresenter) this.receiver).analyticsContext = (DownloadAnalytics.AppContext) obj;
    }
}
