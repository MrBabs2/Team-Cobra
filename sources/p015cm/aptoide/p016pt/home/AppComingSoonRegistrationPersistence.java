package p015cm.aptoide.p016pt.home;

import p015cm.aptoide.p016pt.database.room.RoomAppComingSoonRegistration;
import p123rx.C5328b;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.home.AppComingSoonRegistrationPersistence */
public interface AppComingSoonRegistrationPersistence {
    C5368e<Boolean> isRegisteredForApp(String str);

    C5328b registerForAppNotification(RoomAppComingSoonRegistration roomAppComingSoonRegistration);

    C5328b unregisterForAppNotification(RoomAppComingSoonRegistration roomAppComingSoonRegistration);
}
