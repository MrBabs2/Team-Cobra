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

/* renamed from: cm.aptoide.pt.database.room.ExperimentDAO_Impl */
public final class ExperimentDAO_Impl implements ExperimentDAO {
    /* access modifiers changed from: private */
    public final C0753j __db;
    private final C0731c<RoomExperiment> __insertionAdapterOfRoomExperiment;

    public ExperimentDAO_Impl(C0753j jVar) {
        this.__db = jVar;
        this.__insertionAdapterOfRoomExperiment = new C0731c<RoomExperiment>(jVar) {
            public String createQuery() {
                return "INSERT OR REPLACE INTO `experiment` (`experimentName`,`requestTime`,`assignment`,`payload`,`partOfExperiment`,`experimentOver`) VALUES (?,?,?,?,?,?)";
            }

            public void bind(C5173f fVar, RoomExperiment roomExperiment) {
                if (roomExperiment.getExperimentName() == null) {
                    fVar.bindNull(1);
                } else {
                    fVar.bindString(1, roomExperiment.getExperimentName());
                }
                fVar.bindLong(2, roomExperiment.getRequestTime());
                if (roomExperiment.getAssignment() == null) {
                    fVar.bindNull(3);
                } else {
                    fVar.bindString(3, roomExperiment.getAssignment());
                }
                if (roomExperiment.getPayload() == null) {
                    fVar.bindNull(4);
                } else {
                    fVar.bindString(4, roomExperiment.getPayload());
                }
                fVar.bindLong(5, roomExperiment.isPartOfExperiment() ? 1 : 0);
                fVar.bindLong(6, roomExperiment.isExperimentOver() ? 1 : 0);
            }
        };
    }

    public C11496w<RoomExperiment> get(String str) {
        final C0762m b = C0762m.m3511b("SELECT * FROM experiment WHERE experimentName = ?", 1);
        if (str == null) {
            b.bindNull(1);
        } else {
            b.bindString(1, str);
        }
        return C0763n.m3520a(new Callable<RoomExperiment>() {
            /* access modifiers changed from: protected */
            public void finalize() {
                b.mo4431b();
            }

            public RoomExperiment call() throws Exception {
                RoomExperiment roomExperiment = null;
                Cursor a = C0777c.m3539a(ExperimentDAO_Impl.this.__db, b, false, (CancellationSignal) null);
                try {
                    int a2 = C0776b.m3535a(a, "experimentName");
                    int a3 = C0776b.m3535a(a, "requestTime");
                    int a4 = C0776b.m3535a(a, "assignment");
                    int a5 = C0776b.m3535a(a, "payload");
                    int a6 = C0776b.m3535a(a, "partOfExperiment");
                    int a7 = C0776b.m3535a(a, "experimentOver");
                    if (a.moveToFirst()) {
                        roomExperiment = new RoomExperiment(a.getString(a2), a.getLong(a3), a.getString(a4), a.getString(a5), a.getInt(a6) != 0, a.getInt(a7) != 0);
                    }
                    if (roomExperiment != null) {
                        return roomExperiment;
                    }
                    throw new EmptyResultSetException("Query returned empty result set: " + b.mo4428a());
                } finally {
                    a.close();
                }
            }
        });
    }

    public void save(RoomExperiment roomExperiment) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfRoomExperiment.insert(roomExperiment);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }
}
