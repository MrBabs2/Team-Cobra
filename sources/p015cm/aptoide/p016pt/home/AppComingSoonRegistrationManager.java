package p015cm.aptoide.p016pt.home;

import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.database.room.RoomAppComingSoonRegistration;
import p123rx.C5328b;
import p123rx.C5368e;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, mo16641d2 = {"Lcm/aptoide/pt/home/AppComingSoonRegistrationManager;", "", "appComingSoonRegistrationPersistence", "Lcm/aptoide/pt/home/AppComingSoonRegistrationPersistence;", "(Lcm/aptoide/pt/home/AppComingSoonRegistrationPersistence;)V", "cancelScheduledNotification", "Lrx/Completable;", "packageName", "", "isNotificationScheduled", "Lrx/Observable;", "", "registerUserNotification", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.home.AppComingSoonRegistrationManager */
/* compiled from: AppComingSoonRegistrationManager.kt */
public final class AppComingSoonRegistrationManager {
    private final AppComingSoonRegistrationPersistence appComingSoonRegistrationPersistence;

    public AppComingSoonRegistrationManager(AppComingSoonRegistrationPersistence appComingSoonRegistrationPersistence2) {
        C10202j.m34178b(appComingSoonRegistrationPersistence2, "appComingSoonRegistrationPersistence");
        this.appComingSoonRegistrationPersistence = appComingSoonRegistrationPersistence2;
    }

    public final C5328b cancelScheduledNotification(String str) {
        C10202j.m34178b(str, "packageName");
        C5328b unregisterForAppNotification = this.appComingSoonRegistrationPersistence.unregisterForAppNotification(new RoomAppComingSoonRegistration(str));
        C10202j.m34174a((Object) unregisterForAppNotification, "appComingSoonRegistratio…egistration(packageName))");
        return unregisterForAppNotification;
    }

    public final C5368e<Boolean> isNotificationScheduled(String str) {
        C10202j.m34178b(str, "packageName");
        C5368e<Boolean> isRegisteredForApp = this.appComingSoonRegistrationPersistence.isRegisteredForApp(str);
        C10202j.m34174a((Object) isRegisteredForApp, "appComingSoonRegistratio…steredForApp(packageName)");
        return isRegisteredForApp;
    }

    public final C5328b registerUserNotification(String str) {
        C10202j.m34178b(str, "packageName");
        C5328b registerForAppNotification = this.appComingSoonRegistrationPersistence.registerForAppNotification(new RoomAppComingSoonRegistration(str));
        C10202j.m34174a((Object) registerForAppNotification, "appComingSoonRegistratio…egistration(packageName))");
        return registerForAppNotification;
    }
}
