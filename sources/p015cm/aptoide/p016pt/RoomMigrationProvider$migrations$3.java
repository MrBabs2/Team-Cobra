package p015cm.aptoide.p016pt;

import androidx.room.p005s.C0774a;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p050l.p103q.p104a.C5165b;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, mo16641d2 = {"cm/aptoide/pt/RoomMigrationProvider$migrations$3", "Landroidx/room/migration/Migration;", "migrate", "", "database", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.RoomMigrationProvider$migrations$3 */
/* compiled from: RoomMigrationProvider.kt */
public final class RoomMigrationProvider$migrations$3 extends C0774a {
    RoomMigrationProvider$migrations$3(int i, int i2) {
        super(i, i2);
    }

    public void migrate(C5165b bVar) {
        C10202j.m34178b(bVar, "database");
        bVar.execSQL("DELETE FROM `update` WHERE appcUpgrade=1");
        bVar.execSQL("CREATE TABLE IF NOT EXISTS update_tmp (`packageName` TEXT NOT NULL, `appId` INTEGER NOT NULL, `label` TEXT, `icon` TEXT, `md5` TEXT, `apkPath` TEXT, `size` INTEGER NOT NULL, `updateVersionName` TEXT, `updateVersionCode` INTEGER NOT NULL, `excluded` INTEGER NOT NULL, `trustedBadge` TEXT, `alternativeApkPath` TEXT, `storeName` TEXT, `mainObbName` TEXT, `mainObbPath` TEXT, `mainObbMd5` TEXT, `patchObbName` TEXT, `patchObbPath` TEXT, `patchObbMd5` TEXT, `roomSplits` TEXT, `requiredSplits` TEXT, `hasAppc` INTEGER NOT NULL, PRIMARY KEY(`packageName`))");
        bVar.execSQL("INSERT INTO update_tmp (packageName, appId, label, icon, md5, apkPath, size, updateVersionName, updateVersionCode, excluded, trustedBadge, alternativeApkPath, storeName, mainObbName, mainObbPath, mainObbMd5, patchObbName, patchObbPath, patchObbMd5, roomSplits, requiredSplits, hasAppc) SELECT packageName, appId, label, icon, md5, apkPath, size, updateVersionName, updateVersionCode, excluded, trustedBadge, alternativeApkPath, storeName, mainObbName, mainObbPath, mainObbMd5, patchObbName, patchObbPath, patchObbMd5, roomSplits, requiredSplits, hasAppc FROM `update`");
        bVar.execSQL("DROP TABLE `update`");
        bVar.execSQL("ALTER TABLE update_tmp RENAME TO `update`");
    }
}
