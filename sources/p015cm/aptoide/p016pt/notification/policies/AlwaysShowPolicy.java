package p015cm.aptoide.p016pt.notification.policies;

import p015cm.aptoide.p016pt.notification.Policy;
import p123rx.Single;

/* renamed from: cm.aptoide.pt.notification.policies.AlwaysShowPolicy */
public class AlwaysShowPolicy implements Policy {
    public Single<Boolean> shouldShow() {
        return Single.m10119a(true);
    }
}
