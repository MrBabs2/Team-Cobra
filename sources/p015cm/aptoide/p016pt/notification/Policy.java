package p015cm.aptoide.p016pt.notification;

import p123rx.Single;

/* renamed from: cm.aptoide.pt.notification.Policy */
public interface Policy {
    Single<Boolean> shouldShow();
}
