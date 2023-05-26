package p015cm.aptoide.p016pt.database.room;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.C0731c;
import androidx.room.C0753j;
import androidx.room.C0762m;
import androidx.room.C0763n;
import androidx.room.p006t.C0777c;
import java.util.concurrent.Callable;
import p050l.p103q.p104a.C5173f;
import p120q.p326a.C11482n;

/* renamed from: cm.aptoide.pt.database.room.MigratedAppDAO_Impl */
public final class MigratedAppDAO_Impl implements MigratedAppDAO {
    /* access modifiers changed from: private */
    public final C0753j __db;
    private final C0731c<RoomMigratedApp> __insertionAdapterOfRoomMigratedApp;

    public MigratedAppDAO_Impl(C0753j jVar) {
        this.__db = jVar;
        this.__insertionAdapterOfRoomMigratedApp = new C0731c<RoomMigratedApp>(jVar) {
            public String createQuery() {
                return "INSERT OR REPLACE INTO `migratedapp` (`packageName`) VALUES (?)";
            }

            public void bind(C5173f fVar, RoomMigratedApp roomMigratedApp) {
                if (roomMigratedApp.getPackageName() == null) {
                    fVar.bindNull(1);
                } else {
                    fVar.bindString(1, roomMigratedApp.getPackageName());
                }
            }
        };
    }

    public C11482n<Integer> isAppMigrated(String str) {
        final C0762m b = C0762m.m3511b("SELECT COUNT(*) from migratedapp where packageName like ?", 1);
        if (str == null) {
            b.bindNull(1);
        } else {
            b.bindString(1, str);
        }
        return C0763n.m3518a(this.__db, false, new String[]{"migratedapp"}, new Callable<Integer>() {
            /* access modifiers changed from: protected */
            public void finalize() {
                b.mo4431b();
            }

            public Integer call() throws Exception {
                Integer num = null;
                Cursor a = C0777c.m3539a(MigratedAppDAO_Impl.this.__db, b, false, (CancellationSignal) null);
                try {
                    if (a.moveToFirst()) {
                        if (!a.isNull(0)) {
                            num = Integer.valueOf(a.getInt(0));
                        }
                    }
                    return num;
                } finally {
                    a.close();
                }
            }
        });
    }

    public void save(RoomMigratedApp roomMigratedApp) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfRoomMigratedApp.insert(roomMigratedApp);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }
}
