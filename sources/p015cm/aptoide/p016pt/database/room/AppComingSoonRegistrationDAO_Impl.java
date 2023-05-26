package p015cm.aptoide.p016pt.database.room;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.C0730b;
import androidx.room.C0731c;
import androidx.room.C0753j;
import androidx.room.C0762m;
import androidx.room.C0763n;
import androidx.room.p006t.C0777c;
import java.util.concurrent.Callable;
import p050l.p103q.p104a.C5173f;
import p120q.p326a.C11482n;

/* renamed from: cm.aptoide.pt.database.room.AppComingSoonRegistrationDAO_Impl */
public final class AppComingSoonRegistrationDAO_Impl implements AppComingSoonRegistrationDAO {
    /* access modifiers changed from: private */
    public final C0753j __db;
    private final C0730b<RoomAppComingSoonRegistration> __deletionAdapterOfRoomAppComingSoonRegistration;
    private final C0731c<RoomAppComingSoonRegistration> __insertionAdapterOfRoomAppComingSoonRegistration;

    public AppComingSoonRegistrationDAO_Impl(C0753j jVar) {
        this.__db = jVar;
        this.__insertionAdapterOfRoomAppComingSoonRegistration = new C0731c<RoomAppComingSoonRegistration>(jVar) {
            public String createQuery() {
                return "INSERT OR REPLACE INTO `appComingSoonRegistration` (`packageName`) VALUES (?)";
            }

            public void bind(C5173f fVar, RoomAppComingSoonRegistration roomAppComingSoonRegistration) {
                if (roomAppComingSoonRegistration.getPackageName() == null) {
                    fVar.bindNull(1);
                } else {
                    fVar.bindString(1, roomAppComingSoonRegistration.getPackageName());
                }
            }
        };
        this.__deletionAdapterOfRoomAppComingSoonRegistration = new C0730b<RoomAppComingSoonRegistration>(jVar) {
            public String createQuery() {
                return "DELETE FROM `appComingSoonRegistration` WHERE `packageName` = ?";
            }

            public void bind(C5173f fVar, RoomAppComingSoonRegistration roomAppComingSoonRegistration) {
                if (roomAppComingSoonRegistration.getPackageName() == null) {
                    fVar.bindNull(1);
                } else {
                    fVar.bindString(1, roomAppComingSoonRegistration.getPackageName());
                }
            }
        };
    }

    public C11482n<Integer> isRegisteredForApp(String str) {
        final C0762m b = C0762m.m3511b("SELECT COUNT(*) from appComingSoonRegistration where packageName like ?", 1);
        if (str == null) {
            b.bindNull(1);
        } else {
            b.bindString(1, str);
        }
        return C0763n.m3518a(this.__db, false, new String[]{"appComingSoonRegistration"}, new Callable<Integer>() {
            /* access modifiers changed from: protected */
            public void finalize() {
                b.mo4431b();
            }

            public Integer call() throws Exception {
                Integer num = null;
                Cursor a = C0777c.m3539a(AppComingSoonRegistrationDAO_Impl.this.__db, b, false, (CancellationSignal) null);
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

    public void remove(RoomAppComingSoonRegistration roomAppComingSoonRegistration) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfRoomAppComingSoonRegistration.handle(roomAppComingSoonRegistration);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    public void save(RoomAppComingSoonRegistration roomAppComingSoonRegistration) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfRoomAppComingSoonRegistration.insert(roomAppComingSoonRegistration);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }
}
