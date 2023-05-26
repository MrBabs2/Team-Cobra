package p015cm.aptoide.p016pt.database.room;

import androidx.room.C0753j;

/* renamed from: cm.aptoide.pt.database.room.AptoideDatabase */
public abstract class AptoideDatabase extends C0753j {
    static final int VERSION = 107;

    public abstract AppComingSoonRegistrationDAO appComingSoonRegistrationDAO();

    public abstract AptoideInstallDao aptoideInstallDao();

    public abstract DownloadDAO downloadDAO();

    public abstract EventDAO eventDAO();

    public abstract ExperimentDAO experimentDAO();

    public abstract InstallationDao installationDao();

    public abstract InstalledDao installedDao();

    public abstract LocalNotificationSyncDao localNotificationSyncDao();

    public abstract MigratedAppDAO migratedAppDAO();

    public abstract NotificationDao notificationDao();

    public abstract StoreDao storeDao();

    public abstract StoredMinimalAdDAO storeMinimalAdDAO();

    public abstract UpdateDao updateDao();
}
