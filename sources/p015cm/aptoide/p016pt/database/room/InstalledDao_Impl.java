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
import p050l.p103q.p104a.C5173f;
import p120q.p326a.C10839b;
import p120q.p326a.C11482n;
import p120q.p326a.C11496w;

/* renamed from: cm.aptoide.pt.database.room.InstalledDao_Impl */
public final class InstalledDao_Impl implements InstalledDao {
    /* access modifiers changed from: private */
    public final C0753j __db;
    private final C0731c<RoomInstalled> __insertionAdapterOfRoomInstalled;
    /* access modifiers changed from: private */
    public final C0771q __preparedStmtOfRemove;
    private final C0771q __preparedStmtOfRemoveAll;

    public InstalledDao_Impl(C0753j jVar) {
        this.__db = jVar;
        this.__insertionAdapterOfRoomInstalled = new C0731c<RoomInstalled>(jVar) {
            public String createQuery() {
                return "INSERT OR REPLACE INTO `installed` (`packageAndVersionCode`,`icon`,`packageName`,`name`,`versionCode`,`versionName`,`signature`,`systemApp`,`storeName`,`status`,`type`,`enabled`,`appSize`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            public void bind(C5173f fVar, RoomInstalled roomInstalled) {
                if (roomInstalled.getPackageAndVersionCode() == null) {
                    fVar.bindNull(1);
                } else {
                    fVar.bindString(1, roomInstalled.getPackageAndVersionCode());
                }
                if (roomInstalled.getIcon() == null) {
                    fVar.bindNull(2);
                } else {
                    fVar.bindString(2, roomInstalled.getIcon());
                }
                if (roomInstalled.getPackageName() == null) {
                    fVar.bindNull(3);
                } else {
                    fVar.bindString(3, roomInstalled.getPackageName());
                }
                if (roomInstalled.getName() == null) {
                    fVar.bindNull(4);
                } else {
                    fVar.bindString(4, roomInstalled.getName());
                }
                fVar.bindLong(5, (long) roomInstalled.getVersionCode());
                if (roomInstalled.getVersionName() == null) {
                    fVar.bindNull(6);
                } else {
                    fVar.bindString(6, roomInstalled.getVersionName());
                }
                if (roomInstalled.getSignature() == null) {
                    fVar.bindNull(7);
                } else {
                    fVar.bindString(7, roomInstalled.getSignature());
                }
                fVar.bindLong(8, roomInstalled.isSystemApp() ? 1 : 0);
                if (roomInstalled.getStoreName() == null) {
                    fVar.bindNull(9);
                } else {
                    fVar.bindString(9, roomInstalled.getStoreName());
                }
                fVar.bindLong(10, (long) roomInstalled.getStatus());
                fVar.bindLong(11, (long) roomInstalled.getType());
                fVar.bindLong(12, roomInstalled.isEnabled() ? 1 : 0);
                fVar.bindLong(13, roomInstalled.getAppSize().longValue());
            }
        };
        this.__preparedStmtOfRemove = new C0771q(jVar) {
            public String createQuery() {
                return "DELETE FROM Installed where packageName = ? AND versionCode = ?";
            }
        };
        this.__preparedStmtOfRemoveAll = new C0771q(jVar) {
            public String createQuery() {
                return "DELETE FROM installed";
            }
        };
    }

    public C11482n<RoomInstalled> get(String str, int i) {
        final C0762m b = C0762m.m3511b("SELECT * FROM Installed where packageName = ? AND versionCode = ? LIMIT 1", 2);
        if (str == null) {
            b.bindNull(1);
        } else {
            b.bindString(1, str);
        }
        b.bindLong(2, (long) i);
        return C0763n.m3518a(this.__db, false, new String[]{"Installed"}, new Callable<RoomInstalled>() {
            /* access modifiers changed from: protected */
            public void finalize() {
                b.mo4431b();
            }

            public RoomInstalled call() throws Exception {
                RoomInstalled roomInstalled;
                Cursor a = C0777c.m3539a(InstalledDao_Impl.this.__db, b, false, (CancellationSignal) null);
                try {
                    int a2 = C0776b.m3535a(a, "packageAndVersionCode");
                    int a3 = C0776b.m3535a(a, RoomInstalled.ICON);
                    int a4 = C0776b.m3535a(a, "packageName");
                    int a5 = C0776b.m3535a(a, "name");
                    int a6 = C0776b.m3535a(a, RoomInstalled.VERSION_CODE);
                    int a7 = C0776b.m3535a(a, RoomInstalled.VERSION_NAME);
                    int a8 = C0776b.m3535a(a, RoomInstalled.SIGNATURE);
                    int a9 = C0776b.m3535a(a, "systemApp");
                    int a10 = C0776b.m3535a(a, "storeName");
                    int a11 = C0776b.m3535a(a, "status");
                    int a12 = C0776b.m3535a(a, "type");
                    int a13 = C0776b.m3535a(a, "enabled");
                    int a14 = C0776b.m3535a(a, "appSize");
                    if (a.moveToFirst()) {
                        RoomInstalled roomInstalled2 = new RoomInstalled();
                        roomInstalled2.setPackageAndVersionCode(a.getString(a2));
                        roomInstalled2.setIcon(a.getString(a3));
                        roomInstalled2.setPackageName(a.getString(a4));
                        roomInstalled2.setName(a.getString(a5));
                        roomInstalled2.setVersionCode(a.getInt(a6));
                        roomInstalled2.setVersionName(a.getString(a7));
                        roomInstalled2.setSignature(a.getString(a8));
                        boolean z = true;
                        roomInstalled2.setSystemApp(a.getInt(a9) != 0);
                        roomInstalled2.setStoreName(a.getString(a10));
                        roomInstalled2.setStatus(a.getInt(a11));
                        roomInstalled2.setType(a.getInt(a12));
                        if (a.getInt(a13) == 0) {
                            z = false;
                        }
                        roomInstalled2.setEnabled(z);
                        roomInstalled2.setAppSize(Long.valueOf(a.getLong(a14)));
                        roomInstalled = roomInstalled2;
                    } else {
                        roomInstalled = null;
                    }
                    return roomInstalled;
                } finally {
                    a.close();
                }
            }
        });
    }

    public C11482n<List<RoomInstalled>> getAll() {
        final C0762m b = C0762m.m3511b("SELECT * FROM Installed", 0);
        return C0763n.m3518a(this.__db, false, new String[]{"Installed"}, new Callable<List<RoomInstalled>>() {
            /* access modifiers changed from: protected */
            public void finalize() {
                b.mo4431b();
            }

            public List<RoomInstalled> call() throws Exception {
                Cursor a = C0777c.m3539a(InstalledDao_Impl.this.__db, b, false, (CancellationSignal) null);
                try {
                    int a2 = C0776b.m3535a(a, "packageAndVersionCode");
                    int a3 = C0776b.m3535a(a, RoomInstalled.ICON);
                    int a4 = C0776b.m3535a(a, "packageName");
                    int a5 = C0776b.m3535a(a, "name");
                    int a6 = C0776b.m3535a(a, RoomInstalled.VERSION_CODE);
                    int a7 = C0776b.m3535a(a, RoomInstalled.VERSION_NAME);
                    int a8 = C0776b.m3535a(a, RoomInstalled.SIGNATURE);
                    int a9 = C0776b.m3535a(a, "systemApp");
                    int a10 = C0776b.m3535a(a, "storeName");
                    int a11 = C0776b.m3535a(a, "status");
                    int a12 = C0776b.m3535a(a, "type");
                    int a13 = C0776b.m3535a(a, "enabled");
                    int a14 = C0776b.m3535a(a, "appSize");
                    ArrayList arrayList = new ArrayList(a.getCount());
                    while (a.moveToNext()) {
                        RoomInstalled roomInstalled = new RoomInstalled();
                        ArrayList arrayList2 = arrayList;
                        roomInstalled.setPackageAndVersionCode(a.getString(a2));
                        roomInstalled.setIcon(a.getString(a3));
                        roomInstalled.setPackageName(a.getString(a4));
                        roomInstalled.setName(a.getString(a5));
                        roomInstalled.setVersionCode(a.getInt(a6));
                        roomInstalled.setVersionName(a.getString(a7));
                        roomInstalled.setSignature(a.getString(a8));
                        roomInstalled.setSystemApp(a.getInt(a9) != 0);
                        roomInstalled.setStoreName(a.getString(a10));
                        roomInstalled.setStatus(a.getInt(a11));
                        roomInstalled.setType(a.getInt(a12));
                        roomInstalled.setEnabled(a.getInt(a13) != 0);
                        roomInstalled.setAppSize(Long.valueOf(a.getLong(a14)));
                        arrayList = arrayList2;
                        arrayList.add(roomInstalled);
                    }
                    return arrayList;
                } finally {
                    a.close();
                }
            }
        });
    }

    public C11482n<List<RoomInstalled>> getAllFilteringSystemApps() {
        final C0762m b = C0762m.m3511b("SELECT * FROM Installed where systemApp = 0 ORDER BY name ASC", 0);
        return C0763n.m3518a(this.__db, false, new String[]{"Installed"}, new Callable<List<RoomInstalled>>() {
            /* access modifiers changed from: protected */
            public void finalize() {
                b.mo4431b();
            }

            public List<RoomInstalled> call() throws Exception {
                Cursor a = C0777c.m3539a(InstalledDao_Impl.this.__db, b, false, (CancellationSignal) null);
                try {
                    int a2 = C0776b.m3535a(a, "packageAndVersionCode");
                    int a3 = C0776b.m3535a(a, RoomInstalled.ICON);
                    int a4 = C0776b.m3535a(a, "packageName");
                    int a5 = C0776b.m3535a(a, "name");
                    int a6 = C0776b.m3535a(a, RoomInstalled.VERSION_CODE);
                    int a7 = C0776b.m3535a(a, RoomInstalled.VERSION_NAME);
                    int a8 = C0776b.m3535a(a, RoomInstalled.SIGNATURE);
                    int a9 = C0776b.m3535a(a, "systemApp");
                    int a10 = C0776b.m3535a(a, "storeName");
                    int a11 = C0776b.m3535a(a, "status");
                    int a12 = C0776b.m3535a(a, "type");
                    int a13 = C0776b.m3535a(a, "enabled");
                    int a14 = C0776b.m3535a(a, "appSize");
                    ArrayList arrayList = new ArrayList(a.getCount());
                    while (a.moveToNext()) {
                        RoomInstalled roomInstalled = new RoomInstalled();
                        ArrayList arrayList2 = arrayList;
                        roomInstalled.setPackageAndVersionCode(a.getString(a2));
                        roomInstalled.setIcon(a.getString(a3));
                        roomInstalled.setPackageName(a.getString(a4));
                        roomInstalled.setName(a.getString(a5));
                        roomInstalled.setVersionCode(a.getInt(a6));
                        roomInstalled.setVersionName(a.getString(a7));
                        roomInstalled.setSignature(a.getString(a8));
                        roomInstalled.setSystemApp(a.getInt(a9) != 0);
                        roomInstalled.setStoreName(a.getString(a10));
                        roomInstalled.setStatus(a.getInt(a11));
                        roomInstalled.setType(a.getInt(a12));
                        roomInstalled.setEnabled(a.getInt(a13) != 0);
                        roomInstalled.setAppSize(Long.valueOf(a.getLong(a14)));
                        arrayList = arrayList2;
                        arrayList.add(roomInstalled);
                    }
                    return arrayList;
                } finally {
                    a.close();
                }
            }
        });
    }

    public C11482n<List<RoomInstalled>> getAllSortedAsc() {
        final C0762m b = C0762m.m3511b("SELECT * FROM Installed ORDER BY name ASC", 0);
        return C0763n.m3518a(this.__db, false, new String[]{"Installed"}, new Callable<List<RoomInstalled>>() {
            /* access modifiers changed from: protected */
            public void finalize() {
                b.mo4431b();
            }

            public List<RoomInstalled> call() throws Exception {
                Cursor a = C0777c.m3539a(InstalledDao_Impl.this.__db, b, false, (CancellationSignal) null);
                try {
                    int a2 = C0776b.m3535a(a, "packageAndVersionCode");
                    int a3 = C0776b.m3535a(a, RoomInstalled.ICON);
                    int a4 = C0776b.m3535a(a, "packageName");
                    int a5 = C0776b.m3535a(a, "name");
                    int a6 = C0776b.m3535a(a, RoomInstalled.VERSION_CODE);
                    int a7 = C0776b.m3535a(a, RoomInstalled.VERSION_NAME);
                    int a8 = C0776b.m3535a(a, RoomInstalled.SIGNATURE);
                    int a9 = C0776b.m3535a(a, "systemApp");
                    int a10 = C0776b.m3535a(a, "storeName");
                    int a11 = C0776b.m3535a(a, "status");
                    int a12 = C0776b.m3535a(a, "type");
                    int a13 = C0776b.m3535a(a, "enabled");
                    int a14 = C0776b.m3535a(a, "appSize");
                    ArrayList arrayList = new ArrayList(a.getCount());
                    while (a.moveToNext()) {
                        RoomInstalled roomInstalled = new RoomInstalled();
                        ArrayList arrayList2 = arrayList;
                        roomInstalled.setPackageAndVersionCode(a.getString(a2));
                        roomInstalled.setIcon(a.getString(a3));
                        roomInstalled.setPackageName(a.getString(a4));
                        roomInstalled.setName(a.getString(a5));
                        roomInstalled.setVersionCode(a.getInt(a6));
                        roomInstalled.setVersionName(a.getString(a7));
                        roomInstalled.setSignature(a.getString(a8));
                        roomInstalled.setSystemApp(a.getInt(a9) != 0);
                        roomInstalled.setStoreName(a.getString(a10));
                        roomInstalled.setStatus(a.getInt(a11));
                        roomInstalled.setType(a.getInt(a12));
                        roomInstalled.setEnabled(a.getInt(a13) != 0);
                        roomInstalled.setAppSize(Long.valueOf(a.getLong(a14)));
                        arrayList = arrayList2;
                        arrayList.add(roomInstalled);
                    }
                    return arrayList;
                } finally {
                    a.close();
                }
            }
        });
    }

    public C11482n<List<RoomInstalled>> getAsList(String str, int i) {
        final C0762m b = C0762m.m3511b("SELECT * FROM Installed where packageName = ? AND versionCode = ?", 2);
        if (str == null) {
            b.bindNull(1);
        } else {
            b.bindString(1, str);
        }
        b.bindLong(2, (long) i);
        return C0763n.m3518a(this.__db, false, new String[]{"Installed"}, new Callable<List<RoomInstalled>>() {
            /* access modifiers changed from: protected */
            public void finalize() {
                b.mo4431b();
            }

            public List<RoomInstalled> call() throws Exception {
                Cursor a = C0777c.m3539a(InstalledDao_Impl.this.__db, b, false, (CancellationSignal) null);
                try {
                    int a2 = C0776b.m3535a(a, "packageAndVersionCode");
                    int a3 = C0776b.m3535a(a, RoomInstalled.ICON);
                    int a4 = C0776b.m3535a(a, "packageName");
                    int a5 = C0776b.m3535a(a, "name");
                    int a6 = C0776b.m3535a(a, RoomInstalled.VERSION_CODE);
                    int a7 = C0776b.m3535a(a, RoomInstalled.VERSION_NAME);
                    int a8 = C0776b.m3535a(a, RoomInstalled.SIGNATURE);
                    int a9 = C0776b.m3535a(a, "systemApp");
                    int a10 = C0776b.m3535a(a, "storeName");
                    int a11 = C0776b.m3535a(a, "status");
                    int a12 = C0776b.m3535a(a, "type");
                    int a13 = C0776b.m3535a(a, "enabled");
                    int a14 = C0776b.m3535a(a, "appSize");
                    ArrayList arrayList = new ArrayList(a.getCount());
                    while (a.moveToNext()) {
                        RoomInstalled roomInstalled = new RoomInstalled();
                        ArrayList arrayList2 = arrayList;
                        roomInstalled.setPackageAndVersionCode(a.getString(a2));
                        roomInstalled.setIcon(a.getString(a3));
                        roomInstalled.setPackageName(a.getString(a4));
                        roomInstalled.setName(a.getString(a5));
                        roomInstalled.setVersionCode(a.getInt(a6));
                        roomInstalled.setVersionName(a.getString(a7));
                        roomInstalled.setSignature(a.getString(a8));
                        roomInstalled.setSystemApp(a.getInt(a9) != 0);
                        roomInstalled.setStoreName(a.getString(a10));
                        roomInstalled.setStatus(a.getInt(a11));
                        roomInstalled.setType(a.getInt(a12));
                        roomInstalled.setEnabled(a.getInt(a13) != 0);
                        roomInstalled.setAppSize(Long.valueOf(a.getLong(a14)));
                        arrayList = arrayList2;
                        arrayList.add(roomInstalled);
                    }
                    return arrayList;
                } finally {
                    a.close();
                }
            }
        });
    }

    public C11482n<List<RoomInstalled>> getAsListByPackageName(String str) {
        final C0762m b = C0762m.m3511b("SELECT * FROM Installed where packageName = ?", 1);
        if (str == null) {
            b.bindNull(1);
        } else {
            b.bindString(1, str);
        }
        return C0763n.m3518a(this.__db, false, new String[]{"Installed"}, new Callable<List<RoomInstalled>>() {
            /* access modifiers changed from: protected */
            public void finalize() {
                b.mo4431b();
            }

            public List<RoomInstalled> call() throws Exception {
                Cursor a = C0777c.m3539a(InstalledDao_Impl.this.__db, b, false, (CancellationSignal) null);
                try {
                    int a2 = C0776b.m3535a(a, "packageAndVersionCode");
                    int a3 = C0776b.m3535a(a, RoomInstalled.ICON);
                    int a4 = C0776b.m3535a(a, "packageName");
                    int a5 = C0776b.m3535a(a, "name");
                    int a6 = C0776b.m3535a(a, RoomInstalled.VERSION_CODE);
                    int a7 = C0776b.m3535a(a, RoomInstalled.VERSION_NAME);
                    int a8 = C0776b.m3535a(a, RoomInstalled.SIGNATURE);
                    int a9 = C0776b.m3535a(a, "systemApp");
                    int a10 = C0776b.m3535a(a, "storeName");
                    int a11 = C0776b.m3535a(a, "status");
                    int a12 = C0776b.m3535a(a, "type");
                    int a13 = C0776b.m3535a(a, "enabled");
                    int a14 = C0776b.m3535a(a, "appSize");
                    ArrayList arrayList = new ArrayList(a.getCount());
                    while (a.moveToNext()) {
                        RoomInstalled roomInstalled = new RoomInstalled();
                        ArrayList arrayList2 = arrayList;
                        roomInstalled.setPackageAndVersionCode(a.getString(a2));
                        roomInstalled.setIcon(a.getString(a3));
                        roomInstalled.setPackageName(a.getString(a4));
                        roomInstalled.setName(a.getString(a5));
                        roomInstalled.setVersionCode(a.getInt(a6));
                        roomInstalled.setVersionName(a.getString(a7));
                        roomInstalled.setSignature(a.getString(a8));
                        roomInstalled.setSystemApp(a.getInt(a9) != 0);
                        roomInstalled.setStoreName(a.getString(a10));
                        roomInstalled.setStatus(a.getInt(a11));
                        roomInstalled.setType(a.getInt(a12));
                        roomInstalled.setEnabled(a.getInt(a13) != 0);
                        roomInstalled.setAppSize(Long.valueOf(a.getLong(a14)));
                        arrayList = arrayList2;
                        arrayList.add(roomInstalled);
                    }
                    return arrayList;
                } finally {
                    a.close();
                }
            }
        });
    }

    public void insert(RoomInstalled roomInstalled) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfRoomInstalled.insert(roomInstalled);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    public void insertAll(List<RoomInstalled> list) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfRoomInstalled.insert(list);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    public C11496w<RoomInstalled> isInstalledByVersion(String str, int i) {
        final C0762m b = C0762m.m3511b("SELECT * FROM installed where packageName = ? AND versionCode = ?", 2);
        if (str == null) {
            b.bindNull(1);
        } else {
            b.bindString(1, str);
        }
        b.bindLong(2, (long) i);
        return C0763n.m3520a(new Callable<RoomInstalled>() {
            /* access modifiers changed from: protected */
            public void finalize() {
                b.mo4431b();
            }

            public RoomInstalled call() throws Exception {
                RoomInstalled roomInstalled;
                Cursor a = C0777c.m3539a(InstalledDao_Impl.this.__db, b, false, (CancellationSignal) null);
                try {
                    int a2 = C0776b.m3535a(a, "packageAndVersionCode");
                    int a3 = C0776b.m3535a(a, RoomInstalled.ICON);
                    int a4 = C0776b.m3535a(a, "packageName");
                    int a5 = C0776b.m3535a(a, "name");
                    int a6 = C0776b.m3535a(a, RoomInstalled.VERSION_CODE);
                    int a7 = C0776b.m3535a(a, RoomInstalled.VERSION_NAME);
                    int a8 = C0776b.m3535a(a, RoomInstalled.SIGNATURE);
                    int a9 = C0776b.m3535a(a, "systemApp");
                    int a10 = C0776b.m3535a(a, "storeName");
                    int a11 = C0776b.m3535a(a, "status");
                    int a12 = C0776b.m3535a(a, "type");
                    int a13 = C0776b.m3535a(a, "enabled");
                    int a14 = C0776b.m3535a(a, "appSize");
                    if (a.moveToFirst()) {
                        RoomInstalled roomInstalled2 = new RoomInstalled();
                        roomInstalled2.setPackageAndVersionCode(a.getString(a2));
                        roomInstalled2.setIcon(a.getString(a3));
                        roomInstalled2.setPackageName(a.getString(a4));
                        roomInstalled2.setName(a.getString(a5));
                        roomInstalled2.setVersionCode(a.getInt(a6));
                        roomInstalled2.setVersionName(a.getString(a7));
                        roomInstalled2.setSignature(a.getString(a8));
                        boolean z = true;
                        roomInstalled2.setSystemApp(a.getInt(a9) != 0);
                        roomInstalled2.setStoreName(a.getString(a10));
                        roomInstalled2.setStatus(a.getInt(a11));
                        roomInstalled2.setType(a.getInt(a12));
                        if (a.getInt(a13) == 0) {
                            z = false;
                        }
                        roomInstalled2.setEnabled(z);
                        roomInstalled2.setAppSize(Long.valueOf(a.getLong(a14)));
                        roomInstalled = roomInstalled2;
                    } else {
                        roomInstalled = null;
                    }
                    if (roomInstalled != null) {
                        return roomInstalled;
                    }
                    throw new EmptyResultSetException("Query returned empty result set: " + b.mo4428a());
                } finally {
                    a.close();
                }
            }
        });
    }

    public C10839b remove(final String str, final int i) {
        return C10839b.m36736a((Callable<?>) new Callable<Void>() {
            public Void call() throws Exception {
                C5173f acquire = InstalledDao_Impl.this.__preparedStmtOfRemove.acquire();
                String str = str;
                if (str == null) {
                    acquire.bindNull(1);
                } else {
                    acquire.bindString(1, str);
                }
                acquire.bindLong(2, (long) i);
                InstalledDao_Impl.this.__db.beginTransaction();
                try {
                    acquire.executeUpdateDelete();
                    InstalledDao_Impl.this.__db.setTransactionSuccessful();
                    return null;
                } finally {
                    InstalledDao_Impl.this.__db.endTransaction();
                    InstalledDao_Impl.this.__preparedStmtOfRemove.release(acquire);
                }
            }
        });
    }

    public void removeAll() {
        this.__db.assertNotSuspendingTransaction();
        C5173f acquire = this.__preparedStmtOfRemoveAll.acquire();
        this.__db.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfRemoveAll.release(acquire);
        }
    }
}
