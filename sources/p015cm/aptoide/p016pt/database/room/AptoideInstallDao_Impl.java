package p015cm.aptoide.p016pt.database.room;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.C0731c;
import androidx.room.C0753j;
import androidx.room.C0762m;
import androidx.room.C0763n;
import androidx.room.EmptyResultSetException;
import androidx.room.p006t.C0776b;
import androidx.room.p006t.C0777c;
import java.util.concurrent.Callable;
import p050l.p103q.p104a.C5173f;
import p120q.p326a.C11496w;

/* renamed from: cm.aptoide.pt.database.room.AptoideInstallDao_Impl */
public final class AptoideInstallDao_Impl implements AptoideInstallDao {
    /* access modifiers changed from: private */
    public final C0753j __db;
    private final C0731c<RoomAptoideInstallApp> __insertionAdapterOfRoomAptoideInstallApp;

    public AptoideInstallDao_Impl(C0753j jVar) {
        this.__db = jVar;
        this.__insertionAdapterOfRoomAptoideInstallApp = new C0731c<RoomAptoideInstallApp>(jVar) {
            public String createQuery() {
                return "INSERT OR REPLACE INTO `aptoideinstallapp` (`packageName`) VALUES (?)";
            }

            public void bind(C5173f fVar, RoomAptoideInstallApp roomAptoideInstallApp) {
                if (roomAptoideInstallApp.getPackageName() == null) {
                    fVar.bindNull(1);
                } else {
                    fVar.bindString(1, roomAptoideInstallApp.getPackageName());
                }
            }
        };
    }

    public C11496w<RoomAptoideInstallApp> get(String str) {
        final C0762m b = C0762m.m3511b("SELECT * from aptoideinstallapp where packageName = ? LIMIT 1", 1);
        if (str == null) {
            b.bindNull(1);
        } else {
            b.bindString(1, str);
        }
        return C0763n.m3520a(new Callable<RoomAptoideInstallApp>() {
            /* access modifiers changed from: protected */
            public void finalize() {
                b.mo4431b();
            }

            public RoomAptoideInstallApp call() throws Exception {
                RoomAptoideInstallApp roomAptoideInstallApp = null;
                Cursor a = C0777c.m3539a(AptoideInstallDao_Impl.this.__db, b, false, (CancellationSignal) null);
                try {
                    int a2 = C0776b.m3535a(a, "packageName");
                    if (a.moveToFirst()) {
                        roomAptoideInstallApp = new RoomAptoideInstallApp(a.getString(a2));
                    }
                    if (roomAptoideInstallApp != null) {
                        return roomAptoideInstallApp;
                    }
                    throw new EmptyResultSetException("Query returned empty result set: " + b.mo4428a());
                } finally {
                    a.close();
                }
            }
        });
    }

    public void insert(RoomAptoideInstallApp roomAptoideInstallApp) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfRoomAptoideInstallApp.insert(roomAptoideInstallApp);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }
}
