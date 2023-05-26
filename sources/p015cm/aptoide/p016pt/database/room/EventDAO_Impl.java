package p015cm.aptoide.p016pt.database.room;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.C0730b;
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

/* renamed from: cm.aptoide.pt.database.room.EventDAO_Impl */
public final class EventDAO_Impl implements EventDAO {
    /* access modifiers changed from: private */
    public final C0753j __db;
    private final C0730b<RoomEvent> __deletionAdapterOfRoomEvent;
    private final C0731c<RoomEvent> __insertionAdapterOfRoomEvent;

    public EventDAO_Impl(C0753j jVar) {
        this.__db = jVar;
        this.__insertionAdapterOfRoomEvent = new C0731c<RoomEvent>(jVar) {
            public String createQuery() {
                return "INSERT OR REPLACE INTO `event` (`timestamp`,`eventName`,`action`,`context`,`data`) VALUES (nullif(?, 0),?,?,?,?)";
            }

            public void bind(C5173f fVar, RoomEvent roomEvent) {
                fVar.bindLong(1, roomEvent.getTimestamp());
                if (roomEvent.getEventName() == null) {
                    fVar.bindNull(2);
                } else {
                    fVar.bindString(2, roomEvent.getEventName());
                }
                fVar.bindLong(3, (long) roomEvent.getAction());
                if (roomEvent.getContext() == null) {
                    fVar.bindNull(4);
                } else {
                    fVar.bindString(4, roomEvent.getContext());
                }
                if (roomEvent.getData() == null) {
                    fVar.bindNull(5);
                } else {
                    fVar.bindString(5, roomEvent.getData());
                }
            }
        };
        this.__deletionAdapterOfRoomEvent = new C0730b<RoomEvent>(jVar) {
            public String createQuery() {
                return "DELETE FROM `event` WHERE `timestamp` = ?";
            }

            public void bind(C5173f fVar, RoomEvent roomEvent) {
                fVar.bindLong(1, roomEvent.getTimestamp());
            }
        };
    }

    public void delete(RoomEvent roomEvent) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfRoomEvent.handle(roomEvent);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    public C11482n<List<RoomEvent>> getAll() {
        final C0762m b = C0762m.m3511b("SELECT * FROM event", 0);
        return C0763n.m3518a(this.__db, false, new String[]{"event"}, new Callable<List<RoomEvent>>() {
            /* access modifiers changed from: protected */
            public void finalize() {
                b.mo4431b();
            }

            public List<RoomEvent> call() throws Exception {
                Cursor a = C0777c.m3539a(EventDAO_Impl.this.__db, b, false, (CancellationSignal) null);
                try {
                    int a2 = C0776b.m3535a(a, "timestamp");
                    int a3 = C0776b.m3535a(a, "eventName");
                    int a4 = C0776b.m3535a(a, "action");
                    int a5 = C0776b.m3535a(a, "context");
                    int a6 = C0776b.m3535a(a, "data");
                    ArrayList arrayList = new ArrayList(a.getCount());
                    while (a.moveToNext()) {
                        arrayList.add(new RoomEvent(a.getLong(a2), a.getString(a3), a.getInt(a4), a.getString(a5), a.getString(a6)));
                    }
                    return arrayList;
                } finally {
                    a.close();
                }
            }
        });
    }

    public void insert(RoomEvent roomEvent) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfRoomEvent.insert(roomEvent);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }
}
