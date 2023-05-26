package p015cm.aptoide.p016pt;

import androidx.room.p005s.C0774a;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p050l.p103q.p104a.C5165b;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, mo16641d2 = {"cm/aptoide/pt/RoomMigrationProvider$migrations$2", "Landroidx/room/migration/Migration;", "migrate", "", "database", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.RoomMigrationProvider$migrations$2 */
/* compiled from: RoomMigrationProvider.kt */
public final class RoomMigrationProvider$migrations$2 extends C0774a {
    RoomMigrationProvider$migrations$2(int i, int i2) {
        super(i, i2);
    }

    public void migrate(C5165b bVar) {
        C10202j.m34178b(bVar, "database");
        bVar.execSQL("ALTER TABLE installed ADD COLUMN enabled INTEGER DEFAULT 1 NOT NULL");
    }
}
