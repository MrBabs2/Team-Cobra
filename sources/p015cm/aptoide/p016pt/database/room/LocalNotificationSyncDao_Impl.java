package p015cm.aptoide.p016pt.database.room;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.C0731c;
import androidx.room.C0753j;
import androidx.room.C0762m;
import androidx.room.C0763n;
import androidx.room.C0771q;
import androidx.room.p006t.C0776b;
import androidx.room.p006t.C0777c;
import java.util.concurrent.Callable;
import p015cm.aptoide.p016pt.DeepLinkIntentReceiver;
import p050l.p103q.p104a.C5173f;
import p120q.p326a.C11482n;

/* renamed from: cm.aptoide.pt.database.room.LocalNotificationSyncDao_Impl */
public final class LocalNotificationSyncDao_Impl implements LocalNotificationSyncDao {
    /* access modifiers changed from: private */
    public final C0753j __db;
    private final C0731c<RoomLocalNotificationSync> __insertionAdapterOfRoomLocalNotificationSync;
    private final C0771q __preparedStmtOfDelete;

    public LocalNotificationSyncDao_Impl(C0753j jVar) {
        this.__db = jVar;
        this.__insertionAdapterOfRoomLocalNotificationSync = new C0731c<RoomLocalNotificationSync>(jVar) {
            public String createQuery() {
                return "INSERT OR REPLACE INTO `localNotificationSync` (`notificationId`,`title`,`body`,`image`,`navigationUrl`,`trigger`,`id`,`actionStringRes`,`type`) VALUES (?,?,?,?,?,?,?,?,?)";
            }

            public void bind(C5173f fVar, RoomLocalNotificationSync roomLocalNotificationSync) {
                if (roomLocalNotificationSync.getNotificationId() == null) {
                    fVar.bindNull(1);
                } else {
                    fVar.bindString(1, roomLocalNotificationSync.getNotificationId());
                }
                if (roomLocalNotificationSync.getTitle() == null) {
                    fVar.bindNull(2);
                } else {
                    fVar.bindString(2, roomLocalNotificationSync.getTitle());
                }
                if (roomLocalNotificationSync.getBody() == null) {
                    fVar.bindNull(3);
                } else {
                    fVar.bindString(3, roomLocalNotificationSync.getBody());
                }
                if (roomLocalNotificationSync.getImage() == null) {
                    fVar.bindNull(4);
                } else {
                    fVar.bindString(4, roomLocalNotificationSync.getImage());
                }
                if (roomLocalNotificationSync.getNavigationUrl() == null) {
                    fVar.bindNull(5);
                } else {
                    fVar.bindString(5, roomLocalNotificationSync.getNavigationUrl());
                }
                fVar.bindLong(6, roomLocalNotificationSync.getTrigger());
                if (roomLocalNotificationSync.getId() == null) {
                    fVar.bindNull(7);
                } else {
                    fVar.bindString(7, roomLocalNotificationSync.getId());
                }
                fVar.bindLong(8, (long) roomLocalNotificationSync.getActionStringRes());
                fVar.bindLong(9, (long) roomLocalNotificationSync.getType());
            }
        };
        this.__preparedStmtOfDelete = new C0771q(jVar) {
            public String createQuery() {
                return "DELETE FROM localNotificationSync WHERE notificationId = ?";
            }
        };
    }

    public void delete(String str) {
        this.__db.assertNotSuspendingTransaction();
        C5173f acquire = this.__preparedStmtOfDelete.acquire();
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.__db.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDelete.release(acquire);
        }
    }

    public C11482n<RoomLocalNotificationSync> get(String str) {
        final C0762m b = C0762m.m3511b("SELECT * FROM localNotificationSync WHERE notificationId = ?", 1);
        if (str == null) {
            b.bindNull(1);
        } else {
            b.bindString(1, str);
        }
        return C0763n.m3518a(this.__db, false, new String[]{"localNotificationSync"}, new Callable<RoomLocalNotificationSync>() {
            /* access modifiers changed from: protected */
            public void finalize() {
                b.mo4431b();
            }

            public RoomLocalNotificationSync call() throws Exception {
                RoomLocalNotificationSync roomLocalNotificationSync = null;
                Cursor a = C0777c.m3539a(LocalNotificationSyncDao_Impl.this.__db, b, false, (CancellationSignal) null);
                try {
                    int a2 = C0776b.m3535a(a, "notificationId");
                    int a3 = C0776b.m3535a(a, "title");
                    int a4 = C0776b.m3535a(a, "body");
                    int a5 = C0776b.m3535a(a, "image");
                    int a6 = C0776b.m3535a(a, "navigationUrl");
                    int a7 = C0776b.m3535a(a, "trigger");
                    int a8 = C0776b.m3535a(a, DeepLinkIntentReceiver.DeepLinksKeys.f3452ID);
                    int a9 = C0776b.m3535a(a, "actionStringRes");
                    int a10 = C0776b.m3535a(a, "type");
                    if (a.moveToFirst()) {
                        roomLocalNotificationSync = new RoomLocalNotificationSync(a.getString(a2), a.getString(a3), a.getString(a4), a.getString(a5), a.getInt(a9), a.getString(a6), a.getLong(a7), a.getString(a8), a.getInt(a10));
                    }
                    return roomLocalNotificationSync;
                } finally {
                    a.close();
                }
            }
        });
    }

    public void save(RoomLocalNotificationSync roomLocalNotificationSync) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfRoomLocalNotificationSync.insert(roomLocalNotificationSync);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }
}
