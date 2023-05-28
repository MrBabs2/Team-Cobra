package p015cm.aptoide.p016pt.database.room;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.C0731c;
import androidx.room.C0753j;
import androidx.room.C0762m;
import androidx.room.C0763n;
import androidx.room.p006t.C0776b;
import androidx.room.p006t.C0777c;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p050l.p103q.p104a.C5173f;
import p120q.p326a.C11482n;

/* renamed from: cm.aptoide.pt.database.room.InstallationDao_Impl */
public final class InstallationDao_Impl implements InstallationDao {
    /* access modifiers changed from: private */
    public final C0753j __db;
    private final C0731c<RoomInstallation> __insertionAdapterOfRoomInstallation;

    public InstallationDao_Impl(C0753j jVar) {
        this.__db = jVar;
        this.__insertionAdapterOfRoomInstallation = new C0731c<RoomInstallation>(jVar) {
            public String createQuery() {
                return "INSERT OR REPLACE INTO `installation` (`packageName`,`icon`,`name`,`versionCode`,`versionName`) VALUES (?,?,?,?,?)";
            }

            public void bind(C5173f fVar, RoomInstallation roomInstallation) {
                if (roomInstallation.getPackageName() == null) {
                    fVar.bindNull(1);
                } else {
                    fVar.bindString(1, roomInstallation.getPackageName());
                }
                if (roomInstallation.getIcon() == null) {
                    fVar.bindNull(2);
                } else {
                    fVar.bindString(2, roomInstallation.getIcon());
                }
                if (roomInstallation.getName() == null) {
                    fVar.bindNull(3);
                } else {
                    fVar.bindString(3, roomInstallation.getName());
                }
                fVar.bindLong(4, (long) roomInstallation.getVersionCode());
                if (roomInstallation.getVersionName() == null) {
                    fVar.bindNull(5);
                } else {
                    fVar.bindString(5, roomInstallation.getVersionName());
                }
            }
        };
    }

    public C11482n<List<RoomInstallation>> getAll() {
        final C0762m b = C0762m.m3511b("SELECT * FROM installation", 0);
        return C0763n.m3518a(this.__db, false, new String[]{"installation"}, new Callable<List<RoomInstallation>>() {
            /* access modifiers changed from: protected */
            public void finalize() {
                b.mo4431b();
            }

            public List<RoomInstallation> call() throws Exception {
                Cursor a = C0777c.m3539a(InstallationDao_Impl.this.__db, b, false, (CancellationSignal) null);
                try {
                    int a2 = C0776b.m3535a(a, "packageName");
                    int a3 = C0776b.m3535a(a, RoomInstalled.ICON);
                    int a4 = C0776b.m3535a(a, "name");
                    int a5 = C0776b.m3535a(a, RoomInstalled.VERSION_CODE);
                    int a6 = C0776b.m3535a(a, RoomInstalled.VERSION_NAME);
                    ArrayList arrayList = new ArrayList(a.getCount());
                    while (a.moveToNext()) {
                        arrayList.add(new RoomInstallation(a.getString(a2), a.getString(a4), a.getString(a3), a.getInt(a5), a.getString(a6)));
                    }
                    return arrayList;
                } finally {
                    a.close();
                }
            }
        });
    }

    public void insert(RoomInstallation roomInstallation) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfRoomInstallation.insert(roomInstallation);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    public void insertAll(List<RoomInstallation> list) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfRoomInstallation.insert(list);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }
}
