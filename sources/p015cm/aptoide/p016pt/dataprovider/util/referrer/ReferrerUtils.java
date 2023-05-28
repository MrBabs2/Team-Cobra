package p015cm.aptoide.p016pt.dataprovider.util.referrer;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: cm.aptoide.pt.dataprovider.util.referrer.ReferrerUtils */
public class ReferrerUtils {
    public static final int DELAY = 5;
    public static final int RETRIES = 2;
    public static final ReferrersMap excludedNetworks = new ReferrersMap();
    /* access modifiers changed from: protected */
    public static final ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
}
