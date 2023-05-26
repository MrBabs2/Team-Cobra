package p015cm.aptoide.p016pt.database.room;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.C0731c;
import androidx.room.C0753j;
import androidx.room.C0762m;
import androidx.room.C0763n;
import androidx.room.C0771q;
import androidx.room.EmptyResultSetException;
import androidx.room.p006t.C0776b;
import androidx.room.p006t.C0777c;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p015cm.aptoide.p016pt.account.AccountAnalytics;
import p050l.p103q.p104a.C5173f;
import p120q.p326a.C11482n;
import p120q.p326a.C11496w;

/* renamed from: cm.aptoide.pt.database.room.StoreDao_Impl */
public final class StoreDao_Impl implements StoreDao {
    /* access modifiers changed from: private */
    public final C0753j __db;
    private final C0731c<RoomStore> __insertionAdapterOfRoomStore;
    private final C0771q __preparedStmtOfRemoveByStoreName;

    public StoreDao_Impl(C0753j jVar) {
        this.__db = jVar;
        this.__insertionAdapterOfRoomStore = new C0731c<RoomStore>(jVar) {
            public String createQuery() {
                return "INSERT OR REPLACE INTO `store` (`storeId`,`iconPath`,`theme`,`downloads`,`storeName`,`username`,`passwordSha1`) VALUES (?,?,?,?,?,?,?)";
            }

            public void bind(C5173f fVar, RoomStore roomStore) {
                fVar.bindLong(1, roomStore.getStoreId());
                if (roomStore.getIconPath() == null) {
                    fVar.bindNull(2);
                } else {
                    fVar.bindString(2, roomStore.getIconPath());
                }
                if (roomStore.getTheme() == null) {
                    fVar.bindNull(3);
                } else {
                    fVar.bindString(3, roomStore.getTheme());
                }
                fVar.bindLong(4, roomStore.getDownloads());
                if (roomStore.getStoreName() == null) {
                    fVar.bindNull(5);
                } else {
                    fVar.bindString(5, roomStore.getStoreName());
                }
                if (roomStore.getUsername() == null) {
                    fVar.bindNull(6);
                } else {
                    fVar.bindString(6, roomStore.getUsername());
                }
                if (roomStore.getPasswordSha1() == null) {
                    fVar.bindNull(7);
                } else {
                    fVar.bindString(7, roomStore.getPasswordSha1());
                }
            }
        };
        this.__preparedStmtOfRemoveByStoreName = new C0771q(jVar) {
            public String createQuery() {
                return "DELETE FROM store where storeName = ?";
            }
        };
    }

    public C11482n<List<RoomStore>> getAll() {
        final C0762m b = C0762m.m3511b("SELECT * from store", 0);
        return C0763n.m3518a(this.__db, false, new String[]{AccountAnalytics.STORE}, new Callable<List<RoomStore>>() {
            /* access modifiers changed from: protected */
            public void finalize() {
                b.mo4431b();
            }

            public List<RoomStore> call() throws Exception {
                Cursor a = C0777c.m3539a(StoreDao_Impl.this.__db, b, false, (CancellationSignal) null);
                try {
                    int a2 = C0776b.m3535a(a, RoomStore.STORE_ID);
                    int a3 = C0776b.m3535a(a, RoomStore.ICON_PATH);
                    int a4 = C0776b.m3535a(a, RoomStore.THEME);
                    int a5 = C0776b.m3535a(a, RoomStore.DOWNLOADS);
                    int a6 = C0776b.m3535a(a, "storeName");
                    int a7 = C0776b.m3535a(a, "username");
                    int a8 = C0776b.m3535a(a, RoomStore.PASSWORD_SHA1);
                    ArrayList arrayList = new ArrayList(a.getCount());
                    while (a.moveToNext()) {
                        RoomStore roomStore = new RoomStore();
                        roomStore.setStoreId(a.getLong(a2));
                        roomStore.setIconPath(a.getString(a3));
                        roomStore.setTheme(a.getString(a4));
                        roomStore.setDownloads(a.getLong(a5));
                        roomStore.setStoreName(a.getString(a6));
                        roomStore.setUsername(a.getString(a7));
                        roomStore.setPasswordSha1(a.getString(a8));
                        arrayList.add(roomStore);
                    }
                    return arrayList;
                } finally {
                    a.close();
                }
            }
        });
    }

    public C11496w<RoomStore> getByStoreId(long j) {
        final C0762m b = C0762m.m3511b("SELECT * from store where storeId = ?", 1);
        b.bindLong(1, j);
        return C0763n.m3520a(new Callable<RoomStore>() {
            /* access modifiers changed from: protected */
            public void finalize() {
                b.mo4431b();
            }

            public RoomStore call() throws Exception {
                RoomStore roomStore = null;
                Cursor a = C0777c.m3539a(StoreDao_Impl.this.__db, b, false, (CancellationSignal) null);
                try {
                    int a2 = C0776b.m3535a(a, RoomStore.STORE_ID);
                    int a3 = C0776b.m3535a(a, RoomStore.ICON_PATH);
                    int a4 = C0776b.m3535a(a, RoomStore.THEME);
                    int a5 = C0776b.m3535a(a, RoomStore.DOWNLOADS);
                    int a6 = C0776b.m3535a(a, "storeName");
                    int a7 = C0776b.m3535a(a, "username");
                    int a8 = C0776b.m3535a(a, RoomStore.PASSWORD_SHA1);
                    if (a.moveToFirst()) {
                        roomStore = new RoomStore();
                        roomStore.setStoreId(a.getLong(a2));
                        roomStore.setIconPath(a.getString(a3));
                        roomStore.setTheme(a.getString(a4));
                        roomStore.setDownloads(a.getLong(a5));
                        roomStore.setStoreName(a.getString(a6));
                        roomStore.setUsername(a.getString(a7));
                        roomStore.setPasswordSha1(a.getString(a8));
                    }
                    if (roomStore != null) {
                        return roomStore;
                    }
                    throw new EmptyResultSetException("Query returned empty result set: " + b.mo4428a());
                } finally {
                    a.close();
                }
            }
        });
    }

    public C11496w<RoomStore> getByStoreName(String str) {
        final C0762m b = C0762m.m3511b("SELECT * from store where storeName = ?", 1);
        if (str == null) {
            b.bindNull(1);
        } else {
            b.bindString(1, str);
        }
        return C0763n.m3520a(new Callable<RoomStore>() {
            /* access modifiers changed from: protected */
            public void finalize() {
                b.mo4431b();
            }

            public RoomStore call() throws Exception {
                RoomStore roomStore = null;
                Cursor a = C0777c.m3539a(StoreDao_Impl.this.__db, b, false, (CancellationSignal) null);
                try {
                    int a2 = C0776b.m3535a(a, RoomStore.STORE_ID);
                    int a3 = C0776b.m3535a(a, RoomStore.ICON_PATH);
                    int a4 = C0776b.m3535a(a, RoomStore.THEME);
                    int a5 = C0776b.m3535a(a, RoomStore.DOWNLOADS);
                    int a6 = C0776b.m3535a(a, "storeName");
                    int a7 = C0776b.m3535a(a, "username");
                    int a8 = C0776b.m3535a(a, RoomStore.PASSWORD_SHA1);
                    if (a.moveToFirst()) {
                        roomStore = new RoomStore();
                        roomStore.setStoreId(a.getLong(a2));
                        roomStore.setIconPath(a.getString(a3));
                        roomStore.setTheme(a.getString(a4));
                        roomStore.setDownloads(a.getLong(a5));
                        roomStore.setStoreName(a.getString(a6));
                        roomStore.setUsername(a.getString(a7));
                        roomStore.setPasswordSha1(a.getString(a8));
                    }
                    if (roomStore != null) {
                        return roomStore;
                    }
                    throw new EmptyResultSetException("Query returned empty result set: " + b.mo4428a());
                } finally {
                    a.close();
                }
            }
        });
    }

    public void insert(RoomStore roomStore) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfRoomStore.insert(roomStore);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    public C11482n<Integer> isSubscribed(long j) {
        final C0762m b = C0762m.m3511b("SELECT COUNT(*) from store where storeId = ?", 1);
        b.bindLong(1, j);
        return C0763n.m3518a(this.__db, false, new String[]{AccountAnalytics.STORE}, new Callable<Integer>() {
            /* access modifiers changed from: protected */
            public void finalize() {
                b.mo4431b();
            }

            public Integer call() throws Exception {
                Integer num = null;
                Cursor a = C0777c.m3539a(StoreDao_Impl.this.__db, b, false, (CancellationSignal) null);
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

    public void removeByStoreName(String str) {
        this.__db.assertNotSuspendingTransaction();
        C5173f acquire = this.__preparedStmtOfRemoveByStoreName.acquire();
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
            this.__preparedStmtOfRemoveByStoreName.release(acquire);
        }
    }

    public void saveAll(List<RoomStore> list) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfRoomStore.insert(list);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }
}
