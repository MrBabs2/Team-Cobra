package p015cm.aptoide.p016pt.database.room;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.C0730b;
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
import p120q.p326a.C11482n;
import p120q.p326a.C11496w;

/* renamed from: cm.aptoide.pt.database.room.UpdateDao_Impl */
public final class UpdateDao_Impl implements UpdateDao {
    /* access modifiers changed from: private */
    public final C0753j __db;
    private final C0730b<RoomUpdate> __deletionAdapterOfRoomUpdate;
    private final C0731c<RoomUpdate> __insertionAdapterOfRoomUpdate;
    private final C0771q __preparedStmtOfDeleteByPackageName;

    public UpdateDao_Impl(C0753j jVar) {
        this.__db = jVar;
        this.__insertionAdapterOfRoomUpdate = new C0731c<RoomUpdate>(jVar) {
            public String createQuery() {
                return "INSERT OR REPLACE INTO `update` (`packageName`,`appId`,`label`,`icon`,`md5`,`apkPath`,`size`,`updateVersionName`,`updateVersionCode`,`excluded`,`trustedBadge`,`alternativeApkPath`,`storeName`,`mainObbName`,`mainObbPath`,`mainObbMd5`,`patchObbName`,`patchObbPath`,`patchObbMd5`,`roomSplits`,`requiredSplits`,`hasAppc`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            public void bind(C5173f fVar, RoomUpdate roomUpdate) {
                if (roomUpdate.getPackageName() == null) {
                    fVar.bindNull(1);
                } else {
                    fVar.bindString(1, roomUpdate.getPackageName());
                }
                fVar.bindLong(2, roomUpdate.getAppId());
                if (roomUpdate.getLabel() == null) {
                    fVar.bindNull(3);
                } else {
                    fVar.bindString(3, roomUpdate.getLabel());
                }
                if (roomUpdate.getIcon() == null) {
                    fVar.bindNull(4);
                } else {
                    fVar.bindString(4, roomUpdate.getIcon());
                }
                if (roomUpdate.getMd5() == null) {
                    fVar.bindNull(5);
                } else {
                    fVar.bindString(5, roomUpdate.getMd5());
                }
                if (roomUpdate.getApkPath() == null) {
                    fVar.bindNull(6);
                } else {
                    fVar.bindString(6, roomUpdate.getApkPath());
                }
                fVar.bindLong(7, roomUpdate.getSize());
                if (roomUpdate.getUpdateVersionName() == null) {
                    fVar.bindNull(8);
                } else {
                    fVar.bindString(8, roomUpdate.getUpdateVersionName());
                }
                fVar.bindLong(9, (long) roomUpdate.getUpdateVersionCode());
                fVar.bindLong(10, roomUpdate.isExcluded() ? 1 : 0);
                if (roomUpdate.getTrustedBadge() == null) {
                    fVar.bindNull(11);
                } else {
                    fVar.bindString(11, roomUpdate.getTrustedBadge());
                }
                if (roomUpdate.getAlternativeApkPath() == null) {
                    fVar.bindNull(12);
                } else {
                    fVar.bindString(12, roomUpdate.getAlternativeApkPath());
                }
                if (roomUpdate.getStoreName() == null) {
                    fVar.bindNull(13);
                } else {
                    fVar.bindString(13, roomUpdate.getStoreName());
                }
                if (roomUpdate.getMainObbName() == null) {
                    fVar.bindNull(14);
                } else {
                    fVar.bindString(14, roomUpdate.getMainObbName());
                }
                if (roomUpdate.getMainObbPath() == null) {
                    fVar.bindNull(15);
                } else {
                    fVar.bindString(15, roomUpdate.getMainObbPath());
                }
                if (roomUpdate.getMainObbMd5() == null) {
                    fVar.bindNull(16);
                } else {
                    fVar.bindString(16, roomUpdate.getMainObbMd5());
                }
                if (roomUpdate.getPatchObbName() == null) {
                    fVar.bindNull(17);
                } else {
                    fVar.bindString(17, roomUpdate.getPatchObbName());
                }
                if (roomUpdate.getPatchObbPath() == null) {
                    fVar.bindNull(18);
                } else {
                    fVar.bindString(18, roomUpdate.getPatchObbPath());
                }
                if (roomUpdate.getPatchObbMd5() == null) {
                    fVar.bindNull(19);
                } else {
                    fVar.bindString(19, roomUpdate.getPatchObbMd5());
                }
                String saveSplitList = SplitTypeConverter.saveSplitList(roomUpdate.getRoomSplits());
                if (saveSplitList == null) {
                    fVar.bindNull(20);
                } else {
                    fVar.bindString(20, saveSplitList);
                }
                String saveList = StringTypeConverter.saveList(roomUpdate.getRequiredSplits());
                if (saveList == null) {
                    fVar.bindNull(21);
                } else {
                    fVar.bindString(21, saveList);
                }
                fVar.bindLong(22, roomUpdate.hasAppc() ? 1 : 0);
            }
        };
        this.__deletionAdapterOfRoomUpdate = new C0730b<RoomUpdate>(jVar) {
            public String createQuery() {
                return "DELETE FROM `update` WHERE `packageName` = ?";
            }

            public void bind(C5173f fVar, RoomUpdate roomUpdate) {
                if (roomUpdate.getPackageName() == null) {
                    fVar.bindNull(1);
                } else {
                    fVar.bindString(1, roomUpdate.getPackageName());
                }
            }
        };
        this.__preparedStmtOfDeleteByPackageName = new C0771q(jVar) {
            public String createQuery() {
                return "DELETE from `update` where packageName = ?";
            }
        };
    }

    public void deleteAll(List<RoomUpdate> list) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__deletionAdapterOfRoomUpdate.handleMultiple(list);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    public void deleteByPackageName(String str) {
        this.__db.assertNotSuspendingTransaction();
        C5173f acquire = this.__preparedStmtOfDeleteByPackageName.acquire();
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
            this.__preparedStmtOfDeleteByPackageName.release(acquire);
        }
    }

    public C11496w<RoomUpdate> get(String str) {
        final C0762m b = C0762m.m3511b("SELECT * from `update` where packageName = ?", 1);
        if (str == null) {
            b.bindNull(1);
        } else {
            b.bindString(1, str);
        }
        return C0763n.m3520a(new Callable<RoomUpdate>() {
            /* access modifiers changed from: protected */
            public void finalize() {
                b.mo4431b();
            }

            public RoomUpdate call() throws Exception {
                RoomUpdate roomUpdate;
                Cursor a = C0777c.m3539a(UpdateDao_Impl.this.__db, b, false, (CancellationSignal) null);
                try {
                    int a2 = C0776b.m3535a(a, "packageName");
                    int a3 = C0776b.m3535a(a, "appId");
                    int a4 = C0776b.m3535a(a, "label");
                    int a5 = C0776b.m3535a(a, RoomInstalled.ICON);
                    int a6 = C0776b.m3535a(a, "md5");
                    int a7 = C0776b.m3535a(a, "apkPath");
                    int a8 = C0776b.m3535a(a, "size");
                    int a9 = C0776b.m3535a(a, "updateVersionName");
                    int a10 = C0776b.m3535a(a, "updateVersionCode");
                    int a11 = C0776b.m3535a(a, "excluded");
                    int a12 = C0776b.m3535a(a, "trustedBadge");
                    int a13 = C0776b.m3535a(a, "alternativeApkPath");
                    int a14 = C0776b.m3535a(a, "storeName");
                    int a15 = C0776b.m3535a(a, "mainObbName");
                    try {
                        int a16 = C0776b.m3535a(a, "mainObbPath");
                        int i = a11;
                        int a17 = C0776b.m3535a(a, "mainObbMd5");
                        int a18 = C0776b.m3535a(a, "patchObbName");
                        int a19 = C0776b.m3535a(a, "patchObbPath");
                        int a20 = C0776b.m3535a(a, "patchObbMd5");
                        int a21 = C0776b.m3535a(a, "roomSplits");
                        int a22 = C0776b.m3535a(a, "requiredSplits");
                        int a23 = C0776b.m3535a(a, "hasAppc");
                        if (a.moveToFirst()) {
                            String string = a.getString(a2);
                            long j = a.getLong(a3);
                            String string2 = a.getString(a4);
                            String string3 = a.getString(a5);
                            String string4 = a.getString(a6);
                            String string5 = a.getString(a7);
                            long j2 = a.getLong(a8);
                            String string6 = a.getString(a9);
                            int i2 = a.getInt(a10);
                            String string7 = a.getString(a12);
                            roomUpdate = new RoomUpdate(j, string2, string3, string, string4, string5, j2, string6, a.getString(a13), i2, string7, a.getString(a15), a.getString(a16), a.getString(a17), a.getString(a18), a.getString(a19), a.getString(a20), a.getInt(a23) != 0, SplitTypeConverter.restoreSplitList(a.getString(a21)), StringTypeConverter.restoreList(a.getString(a22)), a.getString(a14));
                            roomUpdate.setExcluded(a.getInt(i) != 0);
                        } else {
                            roomUpdate = null;
                        }
                        if (roomUpdate != null) {
                            a.close();
                            return roomUpdate;
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("Query returned empty result set: ");
                        try {
                            sb.append(b.mo4428a());
                            throw new EmptyResultSetException(sb.toString());
                        } catch (Throwable th) {
                            th = th;
                            a.close();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        a.close();
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    a.close();
                    throw th;
                }
            }
        });
    }

    public C11496w<List<RoomUpdate>> getAllByExcluded(boolean z) {
        final C0762m b = C0762m.m3511b("SELECT * from `update` where excluded = ?", 1);
        b.bindLong(1, z ? 1 : 0);
        return C0763n.m3520a(new Callable<List<RoomUpdate>>() {
            /* access modifiers changed from: protected */
            public void finalize() {
                b.mo4431b();
            }

            public List<RoomUpdate> call() throws Exception {
                boolean z;
                boolean z2;
                Cursor a = C0777c.m3539a(UpdateDao_Impl.this.__db, b, false, (CancellationSignal) null);
                try {
                    int a2 = C0776b.m3535a(a, "packageName");
                    int a3 = C0776b.m3535a(a, "appId");
                    int a4 = C0776b.m3535a(a, "label");
                    int a5 = C0776b.m3535a(a, RoomInstalled.ICON);
                    int a6 = C0776b.m3535a(a, "md5");
                    int a7 = C0776b.m3535a(a, "apkPath");
                    int a8 = C0776b.m3535a(a, "size");
                    int a9 = C0776b.m3535a(a, "updateVersionName");
                    int a10 = C0776b.m3535a(a, "updateVersionCode");
                    int a11 = C0776b.m3535a(a, "excluded");
                    int a12 = C0776b.m3535a(a, "trustedBadge");
                    int a13 = C0776b.m3535a(a, "alternativeApkPath");
                    int a14 = C0776b.m3535a(a, "storeName");
                    int a15 = C0776b.m3535a(a, "mainObbName");
                    int a16 = C0776b.m3535a(a, "mainObbPath");
                    int i = a11;
                    int a17 = C0776b.m3535a(a, "mainObbMd5");
                    int a18 = C0776b.m3535a(a, "patchObbName");
                    int a19 = C0776b.m3535a(a, "patchObbPath");
                    int a20 = C0776b.m3535a(a, "patchObbMd5");
                    int a21 = C0776b.m3535a(a, "roomSplits");
                    int a22 = C0776b.m3535a(a, "requiredSplits");
                    int a23 = C0776b.m3535a(a, "hasAppc");
                    int i2 = a16;
                    ArrayList arrayList = new ArrayList(a.getCount());
                    while (a.moveToNext()) {
                        String string = a.getString(a2);
                        long j = a.getLong(a3);
                        String string2 = a.getString(a4);
                        String string3 = a.getString(a5);
                        String string4 = a.getString(a6);
                        String string5 = a.getString(a7);
                        long j2 = a.getLong(a8);
                        String string6 = a.getString(a9);
                        int i3 = a.getInt(a10);
                        String string7 = a.getString(a12);
                        String string8 = a.getString(a13);
                        String string9 = a.getString(a14);
                        String string10 = a.getString(a15);
                        int i4 = i2;
                        String string11 = a.getString(i4);
                        int i5 = a2;
                        int i6 = a17;
                        String string12 = a.getString(i6);
                        a17 = i6;
                        int i7 = a18;
                        String string13 = a.getString(i7);
                        a18 = i7;
                        int i8 = a19;
                        String string14 = a.getString(i8);
                        a19 = i8;
                        int i9 = a20;
                        String string15 = a.getString(i9);
                        a20 = i9;
                        int i10 = a21;
                        List<RoomSplit> restoreSplitList = SplitTypeConverter.restoreSplitList(a.getString(i10));
                        a21 = i10;
                        int i11 = a22;
                        List<String> restoreList = StringTypeConverter.restoreList(a.getString(i11));
                        a22 = i11;
                        int i12 = a23;
                        if (a.getInt(i12) != 0) {
                            a23 = i12;
                            z = true;
                        } else {
                            a23 = i12;
                            z = false;
                        }
                        RoomUpdate roomUpdate = new RoomUpdate(j, string2, string3, string, string4, string5, j2, string6, string8, i3, string7, string10, string11, string12, string13, string14, string15, z, restoreSplitList, restoreList, string9);
                        int i13 = i4;
                        int i14 = i;
                        if (a.getInt(i14) != 0) {
                            i = i14;
                            z2 = true;
                        } else {
                            i = i14;
                            z2 = false;
                        }
                        roomUpdate.setExcluded(z2);
                        arrayList.add(roomUpdate);
                        a2 = i5;
                        i2 = i13;
                    }
                    return arrayList;
                } finally {
                    a.close();
                }
            }
        });
    }

    public C11482n<List<RoomUpdate>> getAllByExcludedSorted(boolean z) {
        final C0762m b = C0762m.m3511b("SELECT * from `update` where excluded = ? ORDER BY label", 1);
        b.bindLong(1, z ? 1 : 0);
        return C0763n.m3518a(this.__db, false, new String[]{"update"}, new Callable<List<RoomUpdate>>() {
            /* access modifiers changed from: protected */
            public void finalize() {
                b.mo4431b();
            }

            public List<RoomUpdate> call() throws Exception {
                boolean z;
                boolean z2;
                Cursor a = C0777c.m3539a(UpdateDao_Impl.this.__db, b, false, (CancellationSignal) null);
                try {
                    int a2 = C0776b.m3535a(a, "packageName");
                    int a3 = C0776b.m3535a(a, "appId");
                    int a4 = C0776b.m3535a(a, "label");
                    int a5 = C0776b.m3535a(a, RoomInstalled.ICON);
                    int a6 = C0776b.m3535a(a, "md5");
                    int a7 = C0776b.m3535a(a, "apkPath");
                    int a8 = C0776b.m3535a(a, "size");
                    int a9 = C0776b.m3535a(a, "updateVersionName");
                    int a10 = C0776b.m3535a(a, "updateVersionCode");
                    int a11 = C0776b.m3535a(a, "excluded");
                    int a12 = C0776b.m3535a(a, "trustedBadge");
                    int a13 = C0776b.m3535a(a, "alternativeApkPath");
                    int a14 = C0776b.m3535a(a, "storeName");
                    int a15 = C0776b.m3535a(a, "mainObbName");
                    int a16 = C0776b.m3535a(a, "mainObbPath");
                    int i = a11;
                    int a17 = C0776b.m3535a(a, "mainObbMd5");
                    int a18 = C0776b.m3535a(a, "patchObbName");
                    int a19 = C0776b.m3535a(a, "patchObbPath");
                    int a20 = C0776b.m3535a(a, "patchObbMd5");
                    int a21 = C0776b.m3535a(a, "roomSplits");
                    int a22 = C0776b.m3535a(a, "requiredSplits");
                    int a23 = C0776b.m3535a(a, "hasAppc");
                    int i2 = a16;
                    ArrayList arrayList = new ArrayList(a.getCount());
                    while (a.moveToNext()) {
                        String string = a.getString(a2);
                        long j = a.getLong(a3);
                        String string2 = a.getString(a4);
                        String string3 = a.getString(a5);
                        String string4 = a.getString(a6);
                        String string5 = a.getString(a7);
                        long j2 = a.getLong(a8);
                        String string6 = a.getString(a9);
                        int i3 = a.getInt(a10);
                        String string7 = a.getString(a12);
                        String string8 = a.getString(a13);
                        String string9 = a.getString(a14);
                        String string10 = a.getString(a15);
                        int i4 = i2;
                        String string11 = a.getString(i4);
                        int i5 = a2;
                        int i6 = a17;
                        String string12 = a.getString(i6);
                        a17 = i6;
                        int i7 = a18;
                        String string13 = a.getString(i7);
                        a18 = i7;
                        int i8 = a19;
                        String string14 = a.getString(i8);
                        a19 = i8;
                        int i9 = a20;
                        String string15 = a.getString(i9);
                        a20 = i9;
                        int i10 = a21;
                        List<RoomSplit> restoreSplitList = SplitTypeConverter.restoreSplitList(a.getString(i10));
                        a21 = i10;
                        int i11 = a22;
                        List<String> restoreList = StringTypeConverter.restoreList(a.getString(i11));
                        a22 = i11;
                        int i12 = a23;
                        if (a.getInt(i12) != 0) {
                            a23 = i12;
                            z = true;
                        } else {
                            a23 = i12;
                            z = false;
                        }
                        RoomUpdate roomUpdate = new RoomUpdate(j, string2, string3, string, string4, string5, j2, string6, string8, i3, string7, string10, string11, string12, string13, string14, string15, z, restoreSplitList, restoreList, string9);
                        int i13 = i4;
                        int i14 = i;
                        if (a.getInt(i14) != 0) {
                            i = i14;
                            z2 = true;
                        } else {
                            i = i14;
                            z2 = false;
                        }
                        roomUpdate.setExcluded(z2);
                        arrayList.add(roomUpdate);
                        a2 = i5;
                        i2 = i13;
                    }
                    return arrayList;
                } finally {
                    a.close();
                }
            }
        });
    }

    public C11496w<RoomUpdate> getByPackageAndExcluded(String str, boolean z) {
        final C0762m b = C0762m.m3511b("SELECT * from `update` where excluded = ? and packageName = ? LIMIT 1", 2);
        b.bindLong(1, z ? 1 : 0);
        if (str == null) {
            b.bindNull(2);
        } else {
            b.bindString(2, str);
        }
        return C0763n.m3520a(new Callable<RoomUpdate>() {
            /* access modifiers changed from: protected */
            public void finalize() {
                b.mo4431b();
            }

            public RoomUpdate call() throws Exception {
                RoomUpdate roomUpdate;
                Cursor a = C0777c.m3539a(UpdateDao_Impl.this.__db, b, false, (CancellationSignal) null);
                try {
                    int a2 = C0776b.m3535a(a, "packageName");
                    int a3 = C0776b.m3535a(a, "appId");
                    int a4 = C0776b.m3535a(a, "label");
                    int a5 = C0776b.m3535a(a, RoomInstalled.ICON);
                    int a6 = C0776b.m3535a(a, "md5");
                    int a7 = C0776b.m3535a(a, "apkPath");
                    int a8 = C0776b.m3535a(a, "size");
                    int a9 = C0776b.m3535a(a, "updateVersionName");
                    int a10 = C0776b.m3535a(a, "updateVersionCode");
                    int a11 = C0776b.m3535a(a, "excluded");
                    int a12 = C0776b.m3535a(a, "trustedBadge");
                    int a13 = C0776b.m3535a(a, "alternativeApkPath");
                    int a14 = C0776b.m3535a(a, "storeName");
                    int a15 = C0776b.m3535a(a, "mainObbName");
                    try {
                        int a16 = C0776b.m3535a(a, "mainObbPath");
                        int i = a11;
                        int a17 = C0776b.m3535a(a, "mainObbMd5");
                        int a18 = C0776b.m3535a(a, "patchObbName");
                        int a19 = C0776b.m3535a(a, "patchObbPath");
                        int a20 = C0776b.m3535a(a, "patchObbMd5");
                        int a21 = C0776b.m3535a(a, "roomSplits");
                        int a22 = C0776b.m3535a(a, "requiredSplits");
                        int a23 = C0776b.m3535a(a, "hasAppc");
                        if (a.moveToFirst()) {
                            String string = a.getString(a2);
                            long j = a.getLong(a3);
                            String string2 = a.getString(a4);
                            String string3 = a.getString(a5);
                            String string4 = a.getString(a6);
                            String string5 = a.getString(a7);
                            long j2 = a.getLong(a8);
                            String string6 = a.getString(a9);
                            int i2 = a.getInt(a10);
                            String string7 = a.getString(a12);
                            roomUpdate = new RoomUpdate(j, string2, string3, string, string4, string5, j2, string6, a.getString(a13), i2, string7, a.getString(a15), a.getString(a16), a.getString(a17), a.getString(a18), a.getString(a19), a.getString(a20), a.getInt(a23) != 0, SplitTypeConverter.restoreSplitList(a.getString(a21)), StringTypeConverter.restoreList(a.getString(a22)), a.getString(a14));
                            roomUpdate.setExcluded(a.getInt(i) != 0);
                        } else {
                            roomUpdate = null;
                        }
                        if (roomUpdate != null) {
                            a.close();
                            return roomUpdate;
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("Query returned empty result set: ");
                        try {
                            sb.append(b.mo4428a());
                            throw new EmptyResultSetException(sb.toString());
                        } catch (Throwable th) {
                            th = th;
                            a.close();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        a.close();
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    a.close();
                    throw th;
                }
            }
        });
    }

    public void insert(RoomUpdate roomUpdate) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfRoomUpdate.insert(roomUpdate);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    public void insertAll(List<RoomUpdate> list) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfRoomUpdate.insert(list);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }
}
