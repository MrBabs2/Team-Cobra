package p015cm.aptoide.p016pt.database.room;

import androidx.room.C0730b;
import androidx.room.C0731c;
import androidx.room.C0753j;
import androidx.room.C0762m;
import androidx.room.C0763n;
import java.util.concurrent.Callable;
import p050l.p103q.p104a.C5173f;
import p120q.p326a.C11482n;

/* renamed from: cm.aptoide.pt.database.room.StoredMinimalAdDAO_Impl */
public final class StoredMinimalAdDAO_Impl implements StoredMinimalAdDAO {
    /* access modifiers changed from: private */
    public final C0753j __db;
    private final C0730b<RoomStoredMinimalAd> __deletionAdapterOfRoomStoredMinimalAd;
    private final C0731c<RoomStoredMinimalAd> __insertionAdapterOfRoomStoredMinimalAd;

    public StoredMinimalAdDAO_Impl(C0753j jVar) {
        this.__db = jVar;
        this.__insertionAdapterOfRoomStoredMinimalAd = new C0731c<RoomStoredMinimalAd>(jVar) {
            public String createQuery() {
                return "INSERT OR REPLACE INTO `storedMinimalAd` (`packageName`,`referrer`,`cpcUrl`,`cpdUrl`,`cpiUrl`,`timestamp`,`adId`) VALUES (?,?,?,?,?,?,?)";
            }

            public void bind(C5173f fVar, RoomStoredMinimalAd roomStoredMinimalAd) {
                if (roomStoredMinimalAd.getPackageName() == null) {
                    fVar.bindNull(1);
                } else {
                    fVar.bindString(1, roomStoredMinimalAd.getPackageName());
                }
                if (roomStoredMinimalAd.getReferrer() == null) {
                    fVar.bindNull(2);
                } else {
                    fVar.bindString(2, roomStoredMinimalAd.getReferrer());
                }
                if (roomStoredMinimalAd.getCpcUrl() == null) {
                    fVar.bindNull(3);
                } else {
                    fVar.bindString(3, roomStoredMinimalAd.getCpcUrl());
                }
                if (roomStoredMinimalAd.getCpdUrl() == null) {
                    fVar.bindNull(4);
                } else {
                    fVar.bindString(4, roomStoredMinimalAd.getCpdUrl());
                }
                if (roomStoredMinimalAd.getCpiUrl() == null) {
                    fVar.bindNull(5);
                } else {
                    fVar.bindString(5, roomStoredMinimalAd.getCpiUrl());
                }
                if (roomStoredMinimalAd.getTimestamp() == null) {
                    fVar.bindNull(6);
                } else {
                    fVar.bindLong(6, roomStoredMinimalAd.getTimestamp().longValue());
                }
                if (roomStoredMinimalAd.getAdId() == null) {
                    fVar.bindNull(7);
                } else {
                    fVar.bindLong(7, roomStoredMinimalAd.getAdId().longValue());
                }
            }
        };
        this.__deletionAdapterOfRoomStoredMinimalAd = new C0730b<RoomStoredMinimalAd>(jVar) {
            public String createQuery() {
                return "DELETE FROM `storedMinimalAd` WHERE `packageName` = ?";
            }

            public void bind(C5173f fVar, RoomStoredMinimalAd roomStoredMinimalAd) {
                if (roomStoredMinimalAd.getPackageName() == null) {
                    fVar.bindNull(1);
                } else {
                    fVar.bindString(1, roomStoredMinimalAd.getPackageName());
                }
            }
        };
    }

    public void delete(RoomStoredMinimalAd roomStoredMinimalAd) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfRoomStoredMinimalAd.handle(roomStoredMinimalAd);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    public C11482n<RoomStoredMinimalAd> get(String str) {
        final C0762m b = C0762m.m3511b("SELECT * FROM storedMinimalAd WHERE packageName = ?", 1);
        if (str == null) {
            b.bindNull(1);
        } else {
            b.bindString(1, str);
        }
        return C0763n.m3518a(this.__db, false, new String[]{"storedMinimalAd"}, new Callable<RoomStoredMinimalAd>() {
            /* access modifiers changed from: protected */
            public void finalize() {
                b.mo4431b();
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: cm.aptoide.pt.database.room.RoomStoredMinimalAd} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Long} */
            /* JADX WARNING: type inference failed for: r3v0 */
            /* JADX WARNING: type inference failed for: r3v3 */
            /* JADX WARNING: type inference failed for: r3v6 */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public p015cm.aptoide.p016pt.database.room.RoomStoredMinimalAd call() throws java.lang.Exception {
                /*
                    r18 = this;
                    r1 = r18
                    cm.aptoide.pt.database.room.StoredMinimalAdDAO_Impl r0 = p015cm.aptoide.p016pt.database.room.StoredMinimalAdDAO_Impl.this
                    androidx.room.j r0 = r0.__db
                    androidx.room.m r2 = r1
                    r3 = 0
                    r4 = 0
                    android.database.Cursor r2 = androidx.room.p006t.C0777c.m3539a(r0, r2, r4, r3)
                    java.lang.String r0 = "packageName"
                    int r0 = androidx.room.p006t.C0776b.m3535a(r2, r0)     // Catch:{ all -> 0x0084 }
                    java.lang.String r4 = "referrer"
                    int r4 = androidx.room.p006t.C0776b.m3535a(r2, r4)     // Catch:{ all -> 0x0084 }
                    java.lang.String r5 = "cpcUrl"
                    int r5 = androidx.room.p006t.C0776b.m3535a(r2, r5)     // Catch:{ all -> 0x0084 }
                    java.lang.String r6 = "cpdUrl"
                    int r6 = androidx.room.p006t.C0776b.m3535a(r2, r6)     // Catch:{ all -> 0x0084 }
                    java.lang.String r7 = "cpiUrl"
                    int r7 = androidx.room.p006t.C0776b.m3535a(r2, r7)     // Catch:{ all -> 0x0084 }
                    java.lang.String r8 = "timestamp"
                    int r8 = androidx.room.p006t.C0776b.m3535a(r2, r8)     // Catch:{ all -> 0x0084 }
                    java.lang.String r9 = "adId"
                    int r9 = androidx.room.p006t.C0776b.m3535a(r2, r9)     // Catch:{ all -> 0x0084 }
                    boolean r10 = r2.moveToFirst()     // Catch:{ all -> 0x0084 }
                    if (r10 == 0) goto L_0x0080
                    java.lang.String r12 = r2.getString(r0)     // Catch:{ all -> 0x0084 }
                    java.lang.String r13 = r2.getString(r4)     // Catch:{ all -> 0x0084 }
                    java.lang.String r14 = r2.getString(r5)     // Catch:{ all -> 0x0084 }
                    java.lang.String r15 = r2.getString(r6)     // Catch:{ all -> 0x0084 }
                    java.lang.String r16 = r2.getString(r7)     // Catch:{ all -> 0x0084 }
                    boolean r0 = r2.isNull(r9)     // Catch:{ all -> 0x0084 }
                    if (r0 == 0) goto L_0x005d
                    r17 = r3
                    goto L_0x0067
                L_0x005d:
                    long r4 = r2.getLong(r9)     // Catch:{ all -> 0x0084 }
                    java.lang.Long r0 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0084 }
                    r17 = r0
                L_0x0067:
                    cm.aptoide.pt.database.room.RoomStoredMinimalAd r0 = new cm.aptoide.pt.database.room.RoomStoredMinimalAd     // Catch:{ all -> 0x0084 }
                    r11 = r0
                    r11.<init>(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0084 }
                    boolean r4 = r2.isNull(r8)     // Catch:{ all -> 0x0084 }
                    if (r4 == 0) goto L_0x0074
                    goto L_0x007c
                L_0x0074:
                    long r3 = r2.getLong(r8)     // Catch:{ all -> 0x0084 }
                    java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0084 }
                L_0x007c:
                    r0.setTimestamp(r3)     // Catch:{ all -> 0x0084 }
                    r3 = r0
                L_0x0080:
                    r2.close()
                    return r3
                L_0x0084:
                    r0 = move-exception
                    r2.close()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.database.room.StoredMinimalAdDAO_Impl.C21423.call():cm.aptoide.pt.database.room.RoomStoredMinimalAd");
            }
        });
    }

    public void insert(RoomStoredMinimalAd roomStoredMinimalAd) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfRoomStoredMinimalAd.insert(roomStoredMinimalAd);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }
}
