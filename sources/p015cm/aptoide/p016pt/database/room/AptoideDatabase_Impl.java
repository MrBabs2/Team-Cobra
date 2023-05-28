package p015cm.aptoide.p016pt.database.room;

import androidx.room.C0729a;
import androidx.room.C0739g;
import androidx.room.C0753j;
import androidx.room.C0759l;
import androidx.room.p006t.C0777c;
import androidx.room.p006t.C0781g;
import java.util.HashMap;
import java.util.HashSet;
import p015cm.aptoide.p016pt.DeepLinkIntentReceiver;
import p015cm.aptoide.p016pt.account.AccountAnalytics;
import p015cm.aptoide.p016pt.download.DownloadAnalytics;
import p050l.p103q.p104a.C5165b;
import p050l.p103q.p104a.C5166c;

/* renamed from: cm.aptoide.pt.database.room.AptoideDatabase_Impl */
public final class AptoideDatabase_Impl extends AptoideDatabase {
    private volatile AppComingSoonRegistrationDAO _appComingSoonRegistrationDAO;
    private volatile AptoideInstallDao _aptoideInstallDao;
    private volatile DownloadDAO _downloadDAO;
    private volatile EventDAO _eventDAO;
    private volatile ExperimentDAO _experimentDAO;
    private volatile InstallationDao _installationDao;
    private volatile InstalledDao _installedDao;
    private volatile LocalNotificationSyncDao _localNotificationSyncDao;
    private volatile MigratedAppDAO _migratedAppDAO;
    private volatile NotificationDao _notificationDao;
    private volatile StoreDao _storeDao;
    private volatile StoredMinimalAdDAO _storedMinimalAdDAO;
    private volatile UpdateDao _updateDao;

    public AppComingSoonRegistrationDAO appComingSoonRegistrationDAO() {
        AppComingSoonRegistrationDAO appComingSoonRegistrationDAO;
        if (this._appComingSoonRegistrationDAO != null) {
            return this._appComingSoonRegistrationDAO;
        }
        synchronized (this) {
            if (this._appComingSoonRegistrationDAO == null) {
                this._appComingSoonRegistrationDAO = new AppComingSoonRegistrationDAO_Impl(this);
            }
            appComingSoonRegistrationDAO = this._appComingSoonRegistrationDAO;
        }
        return appComingSoonRegistrationDAO;
    }

    public AptoideInstallDao aptoideInstallDao() {
        AptoideInstallDao aptoideInstallDao;
        if (this._aptoideInstallDao != null) {
            return this._aptoideInstallDao;
        }
        synchronized (this) {
            if (this._aptoideInstallDao == null) {
                this._aptoideInstallDao = new AptoideInstallDao_Impl(this);
            }
            aptoideInstallDao = this._aptoideInstallDao;
        }
        return aptoideInstallDao;
    }

    public void clearAllTables() {
        super.assertNotMainThread();
        C5165b a = super.getOpenHelper().mo4442a();
        try {
            super.beginTransaction();
            a.execSQL("DELETE FROM `event`");
            a.execSQL("DELETE FROM `experiment`");
            a.execSQL("DELETE FROM `storedMinimalAd`");
            a.execSQL("DELETE FROM `notification`");
            a.execSQL("DELETE FROM `localNotificationSync`");
            a.execSQL("DELETE FROM `installed`");
            a.execSQL("DELETE FROM `installation`");
            a.execSQL("DELETE FROM `migratedapp`");
            a.execSQL("DELETE FROM `update`");
            a.execSQL("DELETE FROM `download`");
            a.execSQL("DELETE FROM `store`");
            a.execSQL("DELETE FROM `aptoideinstallapp`");
            a.execSQL("DELETE FROM `appComingSoonRegistration`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            a.mo17852c("PRAGMA wal_checkpoint(FULL)").close();
            if (!a.inTransaction()) {
                a.execSQL("VACUUM");
            }
        }
    }

    /* access modifiers changed from: protected */
    public C0739g createInvalidationTracker() {
        return new C0739g(this, new HashMap(0), new HashMap(0), "event", "experiment", "storedMinimalAd", "notification", "localNotificationSync", "installed", "installation", "migratedapp", "update", DownloadAnalytics.RAKAM_DOWNLOAD_EVENT, AccountAnalytics.STORE, "aptoideinstallapp", "appComingSoonRegistration");
    }

    /* access modifiers changed from: protected */
    public C5166c createOpenHelper(C0729a aVar) {
        C0759l lVar = new C0759l(aVar, new C0759l.C0760a(107) {
            public void createAllTables(C5165b bVar) {
                bVar.execSQL("CREATE TABLE IF NOT EXISTS `event` (`timestamp` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `eventName` TEXT, `action` INTEGER NOT NULL, `context` TEXT, `data` TEXT)");
                bVar.execSQL("CREATE TABLE IF NOT EXISTS `experiment` (`experimentName` TEXT NOT NULL, `requestTime` INTEGER NOT NULL, `assignment` TEXT, `payload` TEXT, `partOfExperiment` INTEGER NOT NULL, `experimentOver` INTEGER NOT NULL, PRIMARY KEY(`experimentName`))");
                bVar.execSQL("CREATE TABLE IF NOT EXISTS `storedMinimalAd` (`packageName` TEXT NOT NULL, `referrer` TEXT, `cpcUrl` TEXT, `cpdUrl` TEXT, `cpiUrl` TEXT, `timestamp` INTEGER, `adId` INTEGER, PRIMARY KEY(`packageName`))");
                bVar.execSQL("CREATE TABLE IF NOT EXISTS `notification` (`expire` INTEGER, `abTestingGroup` TEXT, `body` TEXT, `campaignId` INTEGER NOT NULL, `img` TEXT, `lang` TEXT, `title` TEXT, `url` TEXT, `urlTrack` TEXT, `notificationCenterUrlTrack` TEXT, `type` INTEGER NOT NULL, `timeStamp` INTEGER NOT NULL, `appName` TEXT, `graphic` TEXT, `ownerId` TEXT, `processed` INTEGER NOT NULL, `actionStringRes` INTEGER NOT NULL, `whitelistedPackages` TEXT, `key` TEXT NOT NULL, `dismissed` INTEGER NOT NULL, PRIMARY KEY(`key`))");
                bVar.execSQL("CREATE TABLE IF NOT EXISTS `localNotificationSync` (`notificationId` TEXT NOT NULL, `title` TEXT, `body` TEXT, `image` TEXT, `navigationUrl` TEXT, `trigger` INTEGER NOT NULL, `id` TEXT, `actionStringRes` INTEGER NOT NULL, `type` INTEGER NOT NULL, PRIMARY KEY(`notificationId`))");
                bVar.execSQL("CREATE TABLE IF NOT EXISTS `installed` (`packageAndVersionCode` TEXT NOT NULL, `icon` TEXT, `packageName` TEXT, `name` TEXT, `versionCode` INTEGER NOT NULL, `versionName` TEXT, `signature` TEXT, `systemApp` INTEGER NOT NULL, `storeName` TEXT, `status` INTEGER NOT NULL, `type` INTEGER NOT NULL, `enabled` INTEGER NOT NULL, `appSize` INTEGER NOT NULL, PRIMARY KEY(`packageAndVersionCode`))");
                bVar.execSQL("CREATE TABLE IF NOT EXISTS `installation` (`packageName` TEXT NOT NULL, `icon` TEXT, `name` TEXT, `versionCode` INTEGER NOT NULL, `versionName` TEXT, PRIMARY KEY(`packageName`))");
                bVar.execSQL("CREATE TABLE IF NOT EXISTS `migratedapp` (`packageName` TEXT NOT NULL, PRIMARY KEY(`packageName`))");
                bVar.execSQL("CREATE TABLE IF NOT EXISTS `update` (`packageName` TEXT NOT NULL, `appId` INTEGER NOT NULL, `label` TEXT, `icon` TEXT, `md5` TEXT, `apkPath` TEXT, `size` INTEGER NOT NULL, `updateVersionName` TEXT, `updateVersionCode` INTEGER NOT NULL, `excluded` INTEGER NOT NULL, `trustedBadge` TEXT, `alternativeApkPath` TEXT, `storeName` TEXT, `mainObbName` TEXT, `mainObbPath` TEXT, `mainObbMd5` TEXT, `patchObbName` TEXT, `patchObbPath` TEXT, `patchObbMd5` TEXT, `roomSplits` TEXT, `requiredSplits` TEXT, `hasAppc` INTEGER NOT NULL, PRIMARY KEY(`packageName`))");
                bVar.execSQL("CREATE TABLE IF NOT EXISTS `download` (`filesToDownload` TEXT, `overallDownloadStatus` INTEGER NOT NULL, `overallProgress` INTEGER NOT NULL, `md5` TEXT NOT NULL, `appName` TEXT, `Icon` TEXT, `timeStamp` INTEGER NOT NULL, `downloadSpeed` INTEGER NOT NULL, `packageName` TEXT, `versionCode` INTEGER NOT NULL, `action` INTEGER NOT NULL, `versionName` TEXT, `hasAppc` INTEGER NOT NULL, `size` INTEGER NOT NULL, `storeName` TEXT, `trustedBadge` TEXT, `downloadError` INTEGER NOT NULL, `attributionId` TEXT, PRIMARY KEY(`md5`))");
                bVar.execSQL("CREATE TABLE IF NOT EXISTS `store` (`storeId` INTEGER NOT NULL, `iconPath` TEXT, `theme` TEXT, `downloads` INTEGER NOT NULL, `storeName` TEXT, `username` TEXT, `passwordSha1` TEXT, PRIMARY KEY(`storeId`))");
                bVar.execSQL("CREATE TABLE IF NOT EXISTS `aptoideinstallapp` (`packageName` TEXT NOT NULL, PRIMARY KEY(`packageName`))");
                bVar.execSQL("CREATE TABLE IF NOT EXISTS `appComingSoonRegistration` (`packageName` TEXT NOT NULL, PRIMARY KEY(`packageName`))");
                bVar.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                bVar.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'bfce038c5ef7f0c99d0a6317a549edf0')");
            }

            public void dropAllTables(C5165b bVar) {
                bVar.execSQL("DROP TABLE IF EXISTS `event`");
                bVar.execSQL("DROP TABLE IF EXISTS `experiment`");
                bVar.execSQL("DROP TABLE IF EXISTS `storedMinimalAd`");
                bVar.execSQL("DROP TABLE IF EXISTS `notification`");
                bVar.execSQL("DROP TABLE IF EXISTS `localNotificationSync`");
                bVar.execSQL("DROP TABLE IF EXISTS `installed`");
                bVar.execSQL("DROP TABLE IF EXISTS `installation`");
                bVar.execSQL("DROP TABLE IF EXISTS `migratedapp`");
                bVar.execSQL("DROP TABLE IF EXISTS `update`");
                bVar.execSQL("DROP TABLE IF EXISTS `download`");
                bVar.execSQL("DROP TABLE IF EXISTS `store`");
                bVar.execSQL("DROP TABLE IF EXISTS `aptoideinstallapp`");
                bVar.execSQL("DROP TABLE IF EXISTS `appComingSoonRegistration`");
                if (AptoideDatabase_Impl.this.mCallbacks != null) {
                    int size = AptoideDatabase_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((C0753j.C0755b) AptoideDatabase_Impl.this.mCallbacks.get(i)).mo4410b(bVar);
                    }
                }
            }

            /* access modifiers changed from: protected */
            public void onCreate(C5165b bVar) {
                if (AptoideDatabase_Impl.this.mCallbacks != null) {
                    int size = AptoideDatabase_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((C0753j.C0755b) AptoideDatabase_Impl.this.mCallbacks.get(i)).mo4409a(bVar);
                    }
                }
            }

            public void onOpen(C5165b bVar) {
                C5165b unused = AptoideDatabase_Impl.this.mDatabase = bVar;
                AptoideDatabase_Impl.this.internalInitInvalidationTracker(bVar);
                if (AptoideDatabase_Impl.this.mCallbacks != null) {
                    int size = AptoideDatabase_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((C0753j.C0755b) AptoideDatabase_Impl.this.mCallbacks.get(i)).mo4411c(bVar);
                    }
                }
            }

            public void onPostMigrate(C5165b bVar) {
            }

            public void onPreMigrate(C5165b bVar) {
                C0777c.m3540a(bVar);
            }

            /* access modifiers changed from: protected */
            public C0759l.C0761b onValidateSchema(C5165b bVar) {
                C5165b bVar2 = bVar;
                HashMap hashMap = new HashMap(5);
                hashMap.put("timestamp", new C0781g.C0782a("timestamp", "INTEGER", true, 1, (String) null, 1));
                hashMap.put("eventName", new C0781g.C0782a("eventName", "TEXT", false, 0, (String) null, 1));
                hashMap.put("action", new C0781g.C0782a("action", "INTEGER", true, 0, (String) null, 1));
                hashMap.put("context", new C0781g.C0782a("context", "TEXT", false, 0, (String) null, 1));
                hashMap.put("data", new C0781g.C0782a("data", "TEXT", false, 0, (String) null, 1));
                C0781g gVar = new C0781g("event", hashMap, new HashSet(0), new HashSet(0));
                C0781g a = C0781g.m3547a(bVar2, "event");
                if (!gVar.equals(a)) {
                    return new C0759l.C0761b(false, "event(cm.aptoide.pt.database.room.RoomEvent).\n Expected:\n" + gVar + "\n Found:\n" + a);
                }
                HashMap hashMap2 = new HashMap(6);
                hashMap2.put("experimentName", new C0781g.C0782a("experimentName", "TEXT", true, 1, (String) null, 1));
                hashMap2.put("requestTime", new C0781g.C0782a("requestTime", "INTEGER", true, 0, (String) null, 1));
                hashMap2.put("assignment", new C0781g.C0782a("assignment", "TEXT", false, 0, (String) null, 1));
                hashMap2.put("payload", new C0781g.C0782a("payload", "TEXT", false, 0, (String) null, 1));
                hashMap2.put("partOfExperiment", new C0781g.C0782a("partOfExperiment", "INTEGER", true, 0, (String) null, 1));
                hashMap2.put("experimentOver", new C0781g.C0782a("experimentOver", "INTEGER", true, 0, (String) null, 1));
                C0781g gVar2 = new C0781g("experiment", hashMap2, new HashSet(0), new HashSet(0));
                C0781g a2 = C0781g.m3547a(bVar2, "experiment");
                if (!gVar2.equals(a2)) {
                    return new C0759l.C0761b(false, "experiment(cm.aptoide.pt.database.room.RoomExperiment).\n Expected:\n" + gVar2 + "\n Found:\n" + a2);
                }
                HashMap hashMap3 = new HashMap(7);
                hashMap3.put("packageName", new C0781g.C0782a("packageName", "TEXT", true, 1, (String) null, 1));
                hashMap3.put("referrer", new C0781g.C0782a("referrer", "TEXT", false, 0, (String) null, 1));
                hashMap3.put("cpcUrl", new C0781g.C0782a("cpcUrl", "TEXT", false, 0, (String) null, 1));
                hashMap3.put("cpdUrl", new C0781g.C0782a("cpdUrl", "TEXT", false, 0, (String) null, 1));
                hashMap3.put("cpiUrl", new C0781g.C0782a("cpiUrl", "TEXT", false, 0, (String) null, 1));
                hashMap3.put("timestamp", new C0781g.C0782a("timestamp", "INTEGER", false, 0, (String) null, 1));
                hashMap3.put("adId", new C0781g.C0782a("adId", "INTEGER", false, 0, (String) null, 1));
                C0781g gVar3 = new C0781g("storedMinimalAd", hashMap3, new HashSet(0), new HashSet(0));
                C0781g a3 = C0781g.m3547a(bVar2, "storedMinimalAd");
                if (!gVar3.equals(a3)) {
                    return new C0759l.C0761b(false, "storedMinimalAd(cm.aptoide.pt.database.room.RoomStoredMinimalAd).\n Expected:\n" + gVar3 + "\n Found:\n" + a3);
                }
                HashMap hashMap4 = new HashMap(20);
                hashMap4.put("expire", new C0781g.C0782a("expire", "INTEGER", false, 0, (String) null, 1));
                hashMap4.put("abTestingGroup", new C0781g.C0782a("abTestingGroup", "TEXT", false, 0, (String) null, 1));
                hashMap4.put("body", new C0781g.C0782a("body", "TEXT", false, 0, (String) null, 1));
                hashMap4.put("campaignId", new C0781g.C0782a("campaignId", "INTEGER", true, 0, (String) null, 1));
                hashMap4.put("img", new C0781g.C0782a("img", "TEXT", false, 0, (String) null, 1));
                hashMap4.put("lang", new C0781g.C0782a("lang", "TEXT", false, 0, (String) null, 1));
                hashMap4.put("title", new C0781g.C0782a("title", "TEXT", false, 0, (String) null, 1));
                hashMap4.put("url", new C0781g.C0782a("url", "TEXT", false, 0, (String) null, 1));
                hashMap4.put("urlTrack", new C0781g.C0782a("urlTrack", "TEXT", false, 0, (String) null, 1));
                hashMap4.put("notificationCenterUrlTrack", new C0781g.C0782a("notificationCenterUrlTrack", "TEXT", false, 0, (String) null, 1));
                hashMap4.put("type", new C0781g.C0782a("type", "INTEGER", true, 0, (String) null, 1));
                hashMap4.put("timeStamp", new C0781g.C0782a("timeStamp", "INTEGER", true, 0, (String) null, 1));
                hashMap4.put("appName", new C0781g.C0782a("appName", "TEXT", false, 0, (String) null, 1));
                hashMap4.put("graphic", new C0781g.C0782a("graphic", "TEXT", false, 0, (String) null, 1));
                hashMap4.put("ownerId", new C0781g.C0782a("ownerId", "TEXT", false, 0, (String) null, 1));
                hashMap4.put("processed", new C0781g.C0782a("processed", "INTEGER", true, 0, (String) null, 1));
                hashMap4.put("actionStringRes", new C0781g.C0782a("actionStringRes", "INTEGER", true, 0, (String) null, 1));
                hashMap4.put("whitelistedPackages", new C0781g.C0782a("whitelistedPackages", "TEXT", false, 0, (String) null, 1));
                hashMap4.put(RoomNotification.KEY, new C0781g.C0782a(RoomNotification.KEY, "TEXT", true, 1, (String) null, 1));
                hashMap4.put("dismissed", new C0781g.C0782a("dismissed", "INTEGER", true, 0, (String) null, 1));
                C0781g gVar4 = new C0781g("notification", hashMap4, new HashSet(0), new HashSet(0));
                C0781g a4 = C0781g.m3547a(bVar2, "notification");
                if (!gVar4.equals(a4)) {
                    return new C0759l.C0761b(false, "notification(cm.aptoide.pt.database.room.RoomNotification).\n Expected:\n" + gVar4 + "\n Found:\n" + a4);
                }
                HashMap hashMap5 = new HashMap(9);
                hashMap5.put("notificationId", new C0781g.C0782a("notificationId", "TEXT", true, 1, (String) null, 1));
                hashMap5.put("title", new C0781g.C0782a("title", "TEXT", false, 0, (String) null, 1));
                hashMap5.put("body", new C0781g.C0782a("body", "TEXT", false, 0, (String) null, 1));
                hashMap5.put("image", new C0781g.C0782a("image", "TEXT", false, 0, (String) null, 1));
                hashMap5.put("navigationUrl", new C0781g.C0782a("navigationUrl", "TEXT", false, 0, (String) null, 1));
                hashMap5.put("trigger", new C0781g.C0782a("trigger", "INTEGER", true, 0, (String) null, 1));
                hashMap5.put(DeepLinkIntentReceiver.DeepLinksKeys.f3452ID, new C0781g.C0782a(DeepLinkIntentReceiver.DeepLinksKeys.f3452ID, "TEXT", false, 0, (String) null, 1));
                hashMap5.put("actionStringRes", new C0781g.C0782a("actionStringRes", "INTEGER", true, 0, (String) null, 1));
                hashMap5.put("type", new C0781g.C0782a("type", "INTEGER", true, 0, (String) null, 1));
                C0781g gVar5 = new C0781g("localNotificationSync", hashMap5, new HashSet(0), new HashSet(0));
                C0781g a5 = C0781g.m3547a(bVar2, "localNotificationSync");
                if (!gVar5.equals(a5)) {
                    return new C0759l.C0761b(false, "localNotificationSync(cm.aptoide.pt.database.room.RoomLocalNotificationSync).\n Expected:\n" + gVar5 + "\n Found:\n" + a5);
                }
                HashMap hashMap6 = new HashMap(13);
                hashMap6.put("packageAndVersionCode", new C0781g.C0782a("packageAndVersionCode", "TEXT", true, 1, (String) null, 1));
                hashMap6.put(RoomInstalled.ICON, new C0781g.C0782a(RoomInstalled.ICON, "TEXT", false, 0, (String) null, 1));
                hashMap6.put("packageName", new C0781g.C0782a("packageName", "TEXT", false, 0, (String) null, 1));
                hashMap6.put("name", new C0781g.C0782a("name", "TEXT", false, 0, (String) null, 1));
                hashMap6.put(RoomInstalled.VERSION_CODE, new C0781g.C0782a(RoomInstalled.VERSION_CODE, "INTEGER", true, 0, (String) null, 1));
                hashMap6.put(RoomInstalled.VERSION_NAME, new C0781g.C0782a(RoomInstalled.VERSION_NAME, "TEXT", false, 0, (String) null, 1));
                hashMap6.put(RoomInstalled.SIGNATURE, new C0781g.C0782a(RoomInstalled.SIGNATURE, "TEXT", false, 0, (String) null, 1));
                hashMap6.put("systemApp", new C0781g.C0782a("systemApp", "INTEGER", true, 0, (String) null, 1));
                hashMap6.put("storeName", new C0781g.C0782a("storeName", "TEXT", false, 0, (String) null, 1));
                hashMap6.put("status", new C0781g.C0782a("status", "INTEGER", true, 0, (String) null, 1));
                hashMap6.put("type", new C0781g.C0782a("type", "INTEGER", true, 0, (String) null, 1));
                hashMap6.put("enabled", new C0781g.C0782a("enabled", "INTEGER", true, 0, (String) null, 1));
                hashMap6.put("appSize", new C0781g.C0782a("appSize", "INTEGER", true, 0, (String) null, 1));
                C0781g gVar6 = new C0781g("installed", hashMap6, new HashSet(0), new HashSet(0));
                C0781g a6 = C0781g.m3547a(bVar2, "installed");
                if (!gVar6.equals(a6)) {
                    return new C0759l.C0761b(false, "installed(cm.aptoide.pt.database.room.RoomInstalled).\n Expected:\n" + gVar6 + "\n Found:\n" + a6);
                }
                HashMap hashMap7 = new HashMap(5);
                hashMap7.put("packageName", new C0781g.C0782a("packageName", "TEXT", true, 1, (String) null, 1));
                hashMap7.put(RoomInstalled.ICON, new C0781g.C0782a(RoomInstalled.ICON, "TEXT", false, 0, (String) null, 1));
                hashMap7.put("name", new C0781g.C0782a("name", "TEXT", false, 0, (String) null, 1));
                hashMap7.put(RoomInstalled.VERSION_CODE, new C0781g.C0782a(RoomInstalled.VERSION_CODE, "INTEGER", true, 0, (String) null, 1));
                hashMap7.put(RoomInstalled.VERSION_NAME, new C0781g.C0782a(RoomInstalled.VERSION_NAME, "TEXT", false, 0, (String) null, 1));
                C0781g gVar7 = new C0781g("installation", hashMap7, new HashSet(0), new HashSet(0));
                C0781g a7 = C0781g.m3547a(bVar2, "installation");
                if (!gVar7.equals(a7)) {
                    return new C0759l.C0761b(false, "installation(cm.aptoide.pt.database.room.RoomInstallation).\n Expected:\n" + gVar7 + "\n Found:\n" + a7);
                }
                HashMap hashMap8 = new HashMap(1);
                hashMap8.put("packageName", new C0781g.C0782a("packageName", "TEXT", true, 1, (String) null, 1));
                C0781g gVar8 = new C0781g("migratedapp", hashMap8, new HashSet(0), new HashSet(0));
                C0781g a8 = C0781g.m3547a(bVar2, "migratedapp");
                if (!gVar8.equals(a8)) {
                    return new C0759l.C0761b(false, "migratedapp(cm.aptoide.pt.database.room.RoomMigratedApp).\n Expected:\n" + gVar8 + "\n Found:\n" + a8);
                }
                HashMap hashMap9 = new HashMap(22);
                hashMap9.put("packageName", new C0781g.C0782a("packageName", "TEXT", true, 1, (String) null, 1));
                hashMap9.put("appId", new C0781g.C0782a("appId", "INTEGER", true, 0, (String) null, 1));
                hashMap9.put("label", new C0781g.C0782a("label", "TEXT", false, 0, (String) null, 1));
                hashMap9.put(RoomInstalled.ICON, new C0781g.C0782a(RoomInstalled.ICON, "TEXT", false, 0, (String) null, 1));
                hashMap9.put("md5", new C0781g.C0782a("md5", "TEXT", false, 0, (String) null, 1));
                hashMap9.put("apkPath", new C0781g.C0782a("apkPath", "TEXT", false, 0, (String) null, 1));
                hashMap9.put("size", new C0781g.C0782a("size", "INTEGER", true, 0, (String) null, 1));
                hashMap9.put("updateVersionName", new C0781g.C0782a("updateVersionName", "TEXT", false, 0, (String) null, 1));
                hashMap9.put("updateVersionCode", new C0781g.C0782a("updateVersionCode", "INTEGER", true, 0, (String) null, 1));
                hashMap9.put("excluded", new C0781g.C0782a("excluded", "INTEGER", true, 0, (String) null, 1));
                hashMap9.put("trustedBadge", new C0781g.C0782a("trustedBadge", "TEXT", false, 0, (String) null, 1));
                hashMap9.put("alternativeApkPath", new C0781g.C0782a("alternativeApkPath", "TEXT", false, 0, (String) null, 1));
                hashMap9.put("storeName", new C0781g.C0782a("storeName", "TEXT", false, 0, (String) null, 1));
                hashMap9.put("mainObbName", new C0781g.C0782a("mainObbName", "TEXT", false, 0, (String) null, 1));
                hashMap9.put("mainObbPath", new C0781g.C0782a("mainObbPath", "TEXT", false, 0, (String) null, 1));
                hashMap9.put("mainObbMd5", new C0781g.C0782a("mainObbMd5", "TEXT", false, 0, (String) null, 1));
                hashMap9.put("patchObbName", new C0781g.C0782a("patchObbName", "TEXT", false, 0, (String) null, 1));
                hashMap9.put("patchObbPath", new C0781g.C0782a("patchObbPath", "TEXT", false, 0, (String) null, 1));
                hashMap9.put("patchObbMd5", new C0781g.C0782a("patchObbMd5", "TEXT", false, 0, (String) null, 1));
                hashMap9.put("roomSplits", new C0781g.C0782a("roomSplits", "TEXT", false, 0, (String) null, 1));
                hashMap9.put("requiredSplits", new C0781g.C0782a("requiredSplits", "TEXT", false, 0, (String) null, 1));
                hashMap9.put("hasAppc", new C0781g.C0782a("hasAppc", "INTEGER", true, 0, (String) null, 1));
                C0781g gVar9 = new C0781g("update", hashMap9, new HashSet(0), new HashSet(0));
                C0781g a9 = C0781g.m3547a(bVar2, "update");
                if (!gVar9.equals(a9)) {
                    return new C0759l.C0761b(false, "update(cm.aptoide.pt.database.room.RoomUpdate).\n Expected:\n" + gVar9 + "\n Found:\n" + a9);
                }
                HashMap hashMap10 = new HashMap(18);
                hashMap10.put("filesToDownload", new C0781g.C0782a("filesToDownload", "TEXT", false, 0, (String) null, 1));
                hashMap10.put("overallDownloadStatus", new C0781g.C0782a("overallDownloadStatus", "INTEGER", true, 0, (String) null, 1));
                hashMap10.put("overallProgress", new C0781g.C0782a("overallProgress", "INTEGER", true, 0, (String) null, 1));
                hashMap10.put("md5", new C0781g.C0782a("md5", "TEXT", true, 1, (String) null, 1));
                hashMap10.put("appName", new C0781g.C0782a("appName", "TEXT", false, 0, (String) null, 1));
                hashMap10.put("Icon", new C0781g.C0782a("Icon", "TEXT", false, 0, (String) null, 1));
                hashMap10.put("timeStamp", new C0781g.C0782a("timeStamp", "INTEGER", true, 0, (String) null, 1));
                hashMap10.put("downloadSpeed", new C0781g.C0782a("downloadSpeed", "INTEGER", true, 0, (String) null, 1));
                hashMap10.put("packageName", new C0781g.C0782a("packageName", "TEXT", false, 0, (String) null, 1));
                hashMap10.put(RoomInstalled.VERSION_CODE, new C0781g.C0782a(RoomInstalled.VERSION_CODE, "INTEGER", true, 0, (String) null, 1));
                hashMap10.put("action", new C0781g.C0782a("action", "INTEGER", true, 0, (String) null, 1));
                hashMap10.put(RoomInstalled.VERSION_NAME, new C0781g.C0782a(RoomInstalled.VERSION_NAME, "TEXT", false, 0, (String) null, 1));
                hashMap10.put("hasAppc", new C0781g.C0782a("hasAppc", "INTEGER", true, 0, (String) null, 1));
                hashMap10.put("size", new C0781g.C0782a("size", "INTEGER", true, 0, (String) null, 1));
                hashMap10.put("storeName", new C0781g.C0782a("storeName", "TEXT", false, 0, (String) null, 1));
                hashMap10.put("trustedBadge", new C0781g.C0782a("trustedBadge", "TEXT", false, 0, (String) null, 1));
                hashMap10.put("downloadError", new C0781g.C0782a("downloadError", "INTEGER", true, 0, (String) null, 1));
                hashMap10.put("attributionId", new C0781g.C0782a("attributionId", "TEXT", false, 0, (String) null, 1));
                C0781g gVar10 = new C0781g(DownloadAnalytics.RAKAM_DOWNLOAD_EVENT, hashMap10, new HashSet(0), new HashSet(0));
                C0781g a10 = C0781g.m3547a(bVar2, DownloadAnalytics.RAKAM_DOWNLOAD_EVENT);
                if (!gVar10.equals(a10)) {
                    return new C0759l.C0761b(false, "download(cm.aptoide.pt.database.room.RoomDownload).\n Expected:\n" + gVar10 + "\n Found:\n" + a10);
                }
                HashMap hashMap11 = new HashMap(7);
                hashMap11.put(RoomStore.STORE_ID, new C0781g.C0782a(RoomStore.STORE_ID, "INTEGER", true, 1, (String) null, 1));
                hashMap11.put(RoomStore.ICON_PATH, new C0781g.C0782a(RoomStore.ICON_PATH, "TEXT", false, 0, (String) null, 1));
                hashMap11.put(RoomStore.THEME, new C0781g.C0782a(RoomStore.THEME, "TEXT", false, 0, (String) null, 1));
                hashMap11.put(RoomStore.DOWNLOADS, new C0781g.C0782a(RoomStore.DOWNLOADS, "INTEGER", true, 0, (String) null, 1));
                hashMap11.put("storeName", new C0781g.C0782a("storeName", "TEXT", false, 0, (String) null, 1));
                hashMap11.put("username", new C0781g.C0782a("username", "TEXT", false, 0, (String) null, 1));
                hashMap11.put(RoomStore.PASSWORD_SHA1, new C0781g.C0782a(RoomStore.PASSWORD_SHA1, "TEXT", false, 0, (String) null, 1));
                C0781g gVar11 = new C0781g(AccountAnalytics.STORE, hashMap11, new HashSet(0), new HashSet(0));
                C0781g a11 = C0781g.m3547a(bVar2, AccountAnalytics.STORE);
                if (!gVar11.equals(a11)) {
                    return new C0759l.C0761b(false, "store(cm.aptoide.pt.database.room.RoomStore).\n Expected:\n" + gVar11 + "\n Found:\n" + a11);
                }
                HashMap hashMap12 = new HashMap(1);
                hashMap12.put("packageName", new C0781g.C0782a("packageName", "TEXT", true, 1, (String) null, 1));
                C0781g gVar12 = new C0781g("aptoideinstallapp", hashMap12, new HashSet(0), new HashSet(0));
                C0781g a12 = C0781g.m3547a(bVar2, "aptoideinstallapp");
                if (!gVar12.equals(a12)) {
                    return new C0759l.C0761b(false, "aptoideinstallapp(cm.aptoide.pt.database.room.RoomAptoideInstallApp).\n Expected:\n" + gVar12 + "\n Found:\n" + a12);
                }
                HashMap hashMap13 = new HashMap(1);
                hashMap13.put("packageName", new C0781g.C0782a("packageName", "TEXT", true, 1, (String) null, 1));
                C0781g gVar13 = new C0781g("appComingSoonRegistration", hashMap13, new HashSet(0), new HashSet(0));
                C0781g a13 = C0781g.m3547a(bVar2, "appComingSoonRegistration");
                if (gVar13.equals(a13)) {
                    return new C0759l.C0761b(true, (String) null);
                }
                return new C0759l.C0761b(false, "appComingSoonRegistration(cm.aptoide.pt.database.room.RoomAppComingSoonRegistration).\n Expected:\n" + gVar13 + "\n Found:\n" + a13);
            }
        }, "bfce038c5ef7f0c99d0a6317a549edf0", "0ccb1b4967115d54d18138b4f6c7c9ca");
        C5166c.C5168b.C5169a a = C5166c.C5168b.m9607a(aVar.f2732b);
        a.mo17862a(aVar.f2733c);
        a.mo17863a((C5166c.C5167a) lVar);
        return aVar.f2731a.mo4447a(a.mo17864a());
    }

    public DownloadDAO downloadDAO() {
        DownloadDAO downloadDAO;
        if (this._downloadDAO != null) {
            return this._downloadDAO;
        }
        synchronized (this) {
            if (this._downloadDAO == null) {
                this._downloadDAO = new DownloadDAO_Impl(this);
            }
            downloadDAO = this._downloadDAO;
        }
        return downloadDAO;
    }

    public EventDAO eventDAO() {
        EventDAO eventDAO;
        if (this._eventDAO != null) {
            return this._eventDAO;
        }
        synchronized (this) {
            if (this._eventDAO == null) {
                this._eventDAO = new EventDAO_Impl(this);
            }
            eventDAO = this._eventDAO;
        }
        return eventDAO;
    }

    public ExperimentDAO experimentDAO() {
        ExperimentDAO experimentDAO;
        if (this._experimentDAO != null) {
            return this._experimentDAO;
        }
        synchronized (this) {
            if (this._experimentDAO == null) {
                this._experimentDAO = new ExperimentDAO_Impl(this);
            }
            experimentDAO = this._experimentDAO;
        }
        return experimentDAO;
    }

    public InstallationDao installationDao() {
        InstallationDao installationDao;
        if (this._installationDao != null) {
            return this._installationDao;
        }
        synchronized (this) {
            if (this._installationDao == null) {
                this._installationDao = new InstallationDao_Impl(this);
            }
            installationDao = this._installationDao;
        }
        return installationDao;
    }

    public InstalledDao installedDao() {
        InstalledDao installedDao;
        if (this._installedDao != null) {
            return this._installedDao;
        }
        synchronized (this) {
            if (this._installedDao == null) {
                this._installedDao = new InstalledDao_Impl(this);
            }
            installedDao = this._installedDao;
        }
        return installedDao;
    }

    public LocalNotificationSyncDao localNotificationSyncDao() {
        LocalNotificationSyncDao localNotificationSyncDao;
        if (this._localNotificationSyncDao != null) {
            return this._localNotificationSyncDao;
        }
        synchronized (this) {
            if (this._localNotificationSyncDao == null) {
                this._localNotificationSyncDao = new LocalNotificationSyncDao_Impl(this);
            }
            localNotificationSyncDao = this._localNotificationSyncDao;
        }
        return localNotificationSyncDao;
    }

    public MigratedAppDAO migratedAppDAO() {
        MigratedAppDAO migratedAppDAO;
        if (this._migratedAppDAO != null) {
            return this._migratedAppDAO;
        }
        synchronized (this) {
            if (this._migratedAppDAO == null) {
                this._migratedAppDAO = new MigratedAppDAO_Impl(this);
            }
            migratedAppDAO = this._migratedAppDAO;
        }
        return migratedAppDAO;
    }

    public NotificationDao notificationDao() {
        NotificationDao notificationDao;
        if (this._notificationDao != null) {
            return this._notificationDao;
        }
        synchronized (this) {
            if (this._notificationDao == null) {
                this._notificationDao = new NotificationDao_Impl(this);
            }
            notificationDao = this._notificationDao;
        }
        return notificationDao;
    }

    public StoreDao storeDao() {
        StoreDao storeDao;
        if (this._storeDao != null) {
            return this._storeDao;
        }
        synchronized (this) {
            if (this._storeDao == null) {
                this._storeDao = new StoreDao_Impl(this);
            }
            storeDao = this._storeDao;
        }
        return storeDao;
    }

    public StoredMinimalAdDAO storeMinimalAdDAO() {
        StoredMinimalAdDAO storedMinimalAdDAO;
        if (this._storedMinimalAdDAO != null) {
            return this._storedMinimalAdDAO;
        }
        synchronized (this) {
            if (this._storedMinimalAdDAO == null) {
                this._storedMinimalAdDAO = new StoredMinimalAdDAO_Impl(this);
            }
            storedMinimalAdDAO = this._storedMinimalAdDAO;
        }
        return storedMinimalAdDAO;
    }

    public UpdateDao updateDao() {
        UpdateDao updateDao;
        if (this._updateDao != null) {
            return this._updateDao;
        }
        synchronized (this) {
            if (this._updateDao == null) {
                this._updateDao = new UpdateDao_Impl(this);
            }
            updateDao = this._updateDao;
        }
        return updateDao;
    }
}
