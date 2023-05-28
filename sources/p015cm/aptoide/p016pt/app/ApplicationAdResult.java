package p015cm.aptoide.p016pt.app;

import p015cm.aptoide.p016pt.ads.data.ApplicationAd;
import p015cm.aptoide.p016pt.ads.data.ApplicationAdError;

/* renamed from: cm.aptoide.pt.app.ApplicationAdResult */
public interface ApplicationAdResult {
    ApplicationAd getAd();

    ApplicationAdError getError();
}
