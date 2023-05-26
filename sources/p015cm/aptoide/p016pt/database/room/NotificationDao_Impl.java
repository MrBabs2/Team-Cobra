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
import androidx.room.p006t.C0780f;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p050l.p103q.p104a.C5173f;
import p120q.p326a.C11482n;
import p120q.p326a.C11496w;

/* renamed from: cm.aptoide.pt.database.room.NotificationDao_Impl */
public final class NotificationDao_Impl implements NotificationDao {
    /* access modifiers changed from: private */
    public final C0753j __db;
    private final C0731c<RoomNotification> __insertionAdapterOfRoomNotification;
    private final C0771q __preparedStmtOfDeleteAllByType;

    public NotificationDao_Impl(C0753j jVar) {
        this.__db = jVar;
        this.__insertionAdapterOfRoomNotification = new C0731c<RoomNotification>(jVar) {
            public String createQuery() {
                return "INSERT OR REPLACE INTO `notification` (`expire`,`abTestingGroup`,`body`,`campaignId`,`img`,`lang`,`title`,`url`,`urlTrack`,`notificationCenterUrlTrack`,`type`,`timeStamp`,`appName`,`graphic`,`ownerId`,`processed`,`actionStringRes`,`whitelistedPackages`,`key`,`dismissed`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            public void bind(C5173f fVar, RoomNotification roomNotification) {
                if (roomNotification.getExpire() == null) {
                    fVar.bindNull(1);
                } else {
                    fVar.bindLong(1, roomNotification.getExpire().longValue());
                }
                if (roomNotification.getAbTestingGroup() == null) {
                    fVar.bindNull(2);
                } else {
                    fVar.bindString(2, roomNotification.getAbTestingGroup());
                }
                if (roomNotification.getBody() == null) {
                    fVar.bindNull(3);
                } else {
                    fVar.bindString(3, roomNotification.getBody());
                }
                fVar.bindLong(4, (long) roomNotification.getCampaignId());
                if (roomNotification.getImg() == null) {
                    fVar.bindNull(5);
                } else {
                    fVar.bindString(5, roomNotification.getImg());
                }
                if (roomNotification.getLang() == null) {
                    fVar.bindNull(6);
                } else {
                    fVar.bindString(6, roomNotification.getLang());
                }
                if (roomNotification.getTitle() == null) {
                    fVar.bindNull(7);
                } else {
                    fVar.bindString(7, roomNotification.getTitle());
                }
                if (roomNotification.getUrl() == null) {
                    fVar.bindNull(8);
                } else {
                    fVar.bindString(8, roomNotification.getUrl());
                }
                if (roomNotification.getUrlTrack() == null) {
                    fVar.bindNull(9);
                } else {
                    fVar.bindString(9, roomNotification.getUrlTrack());
                }
                if (roomNotification.getNotificationCenterUrlTrack() == null) {
                    fVar.bindNull(10);
                } else {
                    fVar.bindString(10, roomNotification.getNotificationCenterUrlTrack());
                }
                fVar.bindLong(11, (long) roomNotification.getType());
                fVar.bindLong(12, roomNotification.getTimeStamp());
                if (roomNotification.getAppName() == null) {
                    fVar.bindNull(13);
                } else {
                    fVar.bindString(13, roomNotification.getAppName());
                }
                if (roomNotification.getGraphic() == null) {
                    fVar.bindNull(14);
                } else {
                    fVar.bindString(14, roomNotification.getGraphic());
                }
                if (roomNotification.getOwnerId() == null) {
                    fVar.bindNull(15);
                } else {
                    fVar.bindString(15, roomNotification.getOwnerId());
                }
                fVar.bindLong(16, roomNotification.isProcessed() ? 1 : 0);
                fVar.bindLong(17, (long) roomNotification.getActionStringRes());
                String saveList = StringTypeConverter.saveList(roomNotification.getWhitelistedPackages());
                if (saveList == null) {
                    fVar.bindNull(18);
                } else {
                    fVar.bindString(18, saveList);
                }
                if (roomNotification.getKey() == null) {
                    fVar.bindNull(19);
                } else {
                    fVar.bindString(19, roomNotification.getKey());
                }
                fVar.bindLong(20, roomNotification.getDismissed());
            }
        };
        this.__preparedStmtOfDeleteAllByType = new C0771q(jVar) {
            public String createQuery() {
                return "DELETE FROM notification where type = ?";
            }
        };
    }

    public void deleteAllByType(int i) {
        this.__db.assertNotSuspendingTransaction();
        C5173f acquire = this.__preparedStmtOfDeleteAllByType.acquire();
        acquire.bindLong(1, (long) i);
        this.__db.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDeleteAllByType.release(acquire);
        }
    }

    public void deleteAllExcluding(List<String> list) {
        this.__db.assertNotSuspendingTransaction();
        StringBuilder a = C0780f.m3544a();
        a.append("DELETE FROM notification where ownerId NOT IN (");
        C0780f.m3545a(a, list.size());
        a.append(") ");
        C5173f compileStatement = this.__db.compileStatement(a.toString());
        int i = 1;
        for (String next : list) {
            if (next == null) {
                compileStatement.bindNull(i);
            } else {
                compileStatement.bindString(i, next);
            }
            i++;
        }
        this.__db.beginTransaction();
        try {
            compileStatement.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    public void deleteByKey(List<String> list) {
        this.__db.assertNotSuspendingTransaction();
        StringBuilder a = C0780f.m3544a();
        a.append("DELETE FROM notification where `key` IN (");
        C0780f.m3545a(a, list.size());
        a.append(") ");
        C5173f compileStatement = this.__db.compileStatement(a.toString());
        int i = 1;
        for (String next : list) {
            if (next == null) {
                compileStatement.bindNull(i);
            } else {
                compileStatement.bindString(i, next);
            }
            i++;
        }
        this.__db.beginTransaction();
        try {
            compileStatement.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    public C11482n<List<RoomNotification>> getAll() {
        final C0762m b = C0762m.m3511b("SELECT * FROM notification", 0);
        return C0763n.m3518a(this.__db, false, new String[]{"notification"}, new Callable<List<RoomNotification>>() {
            /* access modifiers changed from: protected */
            public void finalize() {
                b.mo4431b();
            }

            public List<RoomNotification> call() throws Exception {
                Long l;
                boolean z;
                int i;
                Cursor a = C0777c.m3539a(NotificationDao_Impl.this.__db, b, false, (CancellationSignal) null);
                try {
                    int a2 = C0776b.m3535a(a, "expire");
                    int a3 = C0776b.m3535a(a, "abTestingGroup");
                    int a4 = C0776b.m3535a(a, "body");
                    int a5 = C0776b.m3535a(a, "campaignId");
                    int a6 = C0776b.m3535a(a, "img");
                    int a7 = C0776b.m3535a(a, "lang");
                    int a8 = C0776b.m3535a(a, "title");
                    int a9 = C0776b.m3535a(a, "url");
                    int a10 = C0776b.m3535a(a, "urlTrack");
                    int a11 = C0776b.m3535a(a, "notificationCenterUrlTrack");
                    int a12 = C0776b.m3535a(a, "type");
                    int a13 = C0776b.m3535a(a, "timeStamp");
                    int a14 = C0776b.m3535a(a, "appName");
                    int a15 = C0776b.m3535a(a, "graphic");
                    int a16 = C0776b.m3535a(a, "ownerId");
                    int a17 = C0776b.m3535a(a, "processed");
                    int a18 = C0776b.m3535a(a, "actionStringRes");
                    int a19 = C0776b.m3535a(a, "whitelistedPackages");
                    int a20 = C0776b.m3535a(a, RoomNotification.KEY);
                    int a21 = C0776b.m3535a(a, "dismissed");
                    int i2 = a15;
                    ArrayList arrayList = new ArrayList(a.getCount());
                    while (a.moveToNext()) {
                        if (a.isNull(a2)) {
                            l = null;
                        } else {
                            l = Long.valueOf(a.getLong(a2));
                        }
                        String string = a.getString(a3);
                        String string2 = a.getString(a4);
                        int i3 = a.getInt(a5);
                        String string3 = a.getString(a6);
                        String string4 = a.getString(a7);
                        String string5 = a.getString(a8);
                        String string6 = a.getString(a9);
                        String string7 = a.getString(a10);
                        String string8 = a.getString(a11);
                        int i4 = a.getInt(a12);
                        long j = a.getLong(a13);
                        String string9 = a.getString(a14);
                        int i5 = i2;
                        String string10 = a.getString(i5);
                        int i6 = a2;
                        int i7 = a16;
                        String string11 = a.getString(i7);
                        a16 = i7;
                        int i8 = a17;
                        if (a.getInt(i8) != 0) {
                            a17 = i8;
                            i = a18;
                            z = true;
                        } else {
                            a17 = i8;
                            i = a18;
                            z = false;
                        }
                        int i9 = a.getInt(i);
                        a18 = i;
                        int i10 = a19;
                        List<String> restoreList = StringTypeConverter.restoreList(a.getString(i10));
                        a19 = i10;
                        int i11 = a21;
                        a21 = i11;
                        RoomNotification roomNotification = new RoomNotification(l, string, string2, i3, string3, string4, string5, string6, string7, string8, j, i4, a.getLong(i11), string9, string10, string11, z, i9, restoreList);
                        int i12 = a14;
                        int i13 = a20;
                        int i14 = i5;
                        roomNotification.setKey(a.getString(i13));
                        arrayList.add(roomNotification);
                        a2 = i6;
                        i2 = i14;
                        a20 = i13;
                        a14 = i12;
                    }
                    return arrayList;
                } finally {
                    a.close();
                }
            }
        });
    }

    public C11482n<List<RoomNotification>> getAllSortedDesc() {
        final C0762m b = C0762m.m3511b("SELECT * from notification ORDER BY timeStamp DESC", 0);
        return C0763n.m3518a(this.__db, false, new String[]{"notification"}, new Callable<List<RoomNotification>>() {
            /* access modifiers changed from: protected */
            public void finalize() {
                b.mo4431b();
            }

            public List<RoomNotification> call() throws Exception {
                Long l;
                boolean z;
                int i;
                Cursor a = C0777c.m3539a(NotificationDao_Impl.this.__db, b, false, (CancellationSignal) null);
                try {
                    int a2 = C0776b.m3535a(a, "expire");
                    int a3 = C0776b.m3535a(a, "abTestingGroup");
                    int a4 = C0776b.m3535a(a, "body");
                    int a5 = C0776b.m3535a(a, "campaignId");
                    int a6 = C0776b.m3535a(a, "img");
                    int a7 = C0776b.m3535a(a, "lang");
                    int a8 = C0776b.m3535a(a, "title");
                    int a9 = C0776b.m3535a(a, "url");
                    int a10 = C0776b.m3535a(a, "urlTrack");
                    int a11 = C0776b.m3535a(a, "notificationCenterUrlTrack");
                    int a12 = C0776b.m3535a(a, "type");
                    int a13 = C0776b.m3535a(a, "timeStamp");
                    int a14 = C0776b.m3535a(a, "appName");
                    int a15 = C0776b.m3535a(a, "graphic");
                    int a16 = C0776b.m3535a(a, "ownerId");
                    int a17 = C0776b.m3535a(a, "processed");
                    int a18 = C0776b.m3535a(a, "actionStringRes");
                    int a19 = C0776b.m3535a(a, "whitelistedPackages");
                    int a20 = C0776b.m3535a(a, RoomNotification.KEY);
                    int a21 = C0776b.m3535a(a, "dismissed");
                    int i2 = a15;
                    ArrayList arrayList = new ArrayList(a.getCount());
                    while (a.moveToNext()) {
                        if (a.isNull(a2)) {
                            l = null;
                        } else {
                            l = Long.valueOf(a.getLong(a2));
                        }
                        String string = a.getString(a3);
                        String string2 = a.getString(a4);
                        int i3 = a.getInt(a5);
                        String string3 = a.getString(a6);
                        String string4 = a.getString(a7);
                        String string5 = a.getString(a8);
                        String string6 = a.getString(a9);
                        String string7 = a.getString(a10);
                        String string8 = a.getString(a11);
                        int i4 = a.getInt(a12);
                        long j = a.getLong(a13);
                        String string9 = a.getString(a14);
                        int i5 = i2;
                        String string10 = a.getString(i5);
                        int i6 = a2;
                        int i7 = a16;
                        String string11 = a.getString(i7);
                        a16 = i7;
                        int i8 = a17;
                        if (a.getInt(i8) != 0) {
                            a17 = i8;
                            i = a18;
                            z = true;
                        } else {
                            a17 = i8;
                            i = a18;
                            z = false;
                        }
                        int i9 = a.getInt(i);
                        a18 = i;
                        int i10 = a19;
                        List<String> restoreList = StringTypeConverter.restoreList(a.getString(i10));
                        a19 = i10;
                        int i11 = a21;
                        a21 = i11;
                        RoomNotification roomNotification = new RoomNotification(l, string, string2, i3, string3, string4, string5, string6, string7, string8, j, i4, a.getLong(i11), string9, string10, string11, z, i9, restoreList);
                        int i12 = a14;
                        int i13 = a20;
                        int i14 = i5;
                        roomNotification.setKey(a.getString(i13));
                        arrayList.add(roomNotification);
                        a2 = i6;
                        i2 = i14;
                        a20 = i13;
                        a14 = i12;
                    }
                    return arrayList;
                } finally {
                    a.close();
                }
            }
        });
    }

    public C11496w<List<RoomNotification>> getAllSortedDescByType(Integer[] numArr) {
        StringBuilder a = C0780f.m3544a();
        a.append("SELECT ");
        a.append("*");
        a.append(" from notification where type IN (");
        int length = numArr.length;
        C0780f.m3545a(a, length);
        a.append(") ORDER BY timeStamp DESC");
        final C0762m b = C0762m.m3511b(a.toString(), length + 0);
        int i = 1;
        for (Integer num : numArr) {
            if (num == null) {
                b.bindNull(i);
            } else {
                b.bindLong(i, (long) num.intValue());
            }
            i++;
        }
        return C0763n.m3520a(new Callable<List<RoomNotification>>() {
            /* access modifiers changed from: protected */
            public void finalize() {
                b.mo4431b();
            }

            public List<RoomNotification> call() throws Exception {
                Long l;
                boolean z;
                int i;
                Cursor a = C0777c.m3539a(NotificationDao_Impl.this.__db, b, false, (CancellationSignal) null);
                try {
                    int a2 = C0776b.m3535a(a, "expire");
                    int a3 = C0776b.m3535a(a, "abTestingGroup");
                    int a4 = C0776b.m3535a(a, "body");
                    int a5 = C0776b.m3535a(a, "campaignId");
                    int a6 = C0776b.m3535a(a, "img");
                    int a7 = C0776b.m3535a(a, "lang");
                    int a8 = C0776b.m3535a(a, "title");
                    int a9 = C0776b.m3535a(a, "url");
                    int a10 = C0776b.m3535a(a, "urlTrack");
                    int a11 = C0776b.m3535a(a, "notificationCenterUrlTrack");
                    int a12 = C0776b.m3535a(a, "type");
                    int a13 = C0776b.m3535a(a, "timeStamp");
                    int a14 = C0776b.m3535a(a, "appName");
                    int a15 = C0776b.m3535a(a, "graphic");
                    int a16 = C0776b.m3535a(a, "ownerId");
                    int a17 = C0776b.m3535a(a, "processed");
                    int a18 = C0776b.m3535a(a, "actionStringRes");
                    int a19 = C0776b.m3535a(a, "whitelistedPackages");
                    int a20 = C0776b.m3535a(a, RoomNotification.KEY);
                    int a21 = C0776b.m3535a(a, "dismissed");
                    int i2 = a15;
                    ArrayList arrayList = new ArrayList(a.getCount());
                    while (a.moveToNext()) {
                        if (a.isNull(a2)) {
                            l = null;
                        } else {
                            l = Long.valueOf(a.getLong(a2));
                        }
                        String string = a.getString(a3);
                        String string2 = a.getString(a4);
                        int i3 = a.getInt(a5);
                        String string3 = a.getString(a6);
                        String string4 = a.getString(a7);
                        String string5 = a.getString(a8);
                        String string6 = a.getString(a9);
                        String string7 = a.getString(a10);
                        String string8 = a.getString(a11);
                        int i4 = a.getInt(a12);
                        long j = a.getLong(a13);
                        String string9 = a.getString(a14);
                        int i5 = i2;
                        String string10 = a.getString(i5);
                        int i6 = a2;
                        int i7 = a16;
                        String string11 = a.getString(i7);
                        a16 = i7;
                        int i8 = a17;
                        if (a.getInt(i8) != 0) {
                            a17 = i8;
                            i = a18;
                            z = true;
                        } else {
                            a17 = i8;
                            i = a18;
                            z = false;
                        }
                        int i9 = a.getInt(i);
                        a18 = i;
                        int i10 = a19;
                        List<String> restoreList = StringTypeConverter.restoreList(a.getString(i10));
                        a19 = i10;
                        int i11 = a21;
                        a21 = i11;
                        RoomNotification roomNotification = new RoomNotification(l, string, string2, i3, string3, string4, string5, string6, string7, string8, j, i4, a.getLong(i11), string9, string10, string11, z, i9, restoreList);
                        int i12 = a14;
                        int i13 = a20;
                        int i14 = i5;
                        roomNotification.setKey(a.getString(i13));
                        arrayList.add(roomNotification);
                        a2 = i6;
                        i2 = i14;
                        a20 = i13;
                        a14 = i12;
                    }
                    return arrayList;
                } finally {
                    a.close();
                }
            }
        });
    }

    public C11496w<List<RoomNotification>> getDismissed(Integer[] numArr, long j, long j2) {
        StringBuilder a = C0780f.m3544a();
        a.append("SELECT ");
        a.append("*");
        a.append(" from notification where type IN (");
        int length = numArr.length;
        C0780f.m3545a(a, length);
        a.append(") AND dismissed BETWEEN ");
        a.append("?");
        a.append(" AND ");
        a.append("?");
        a.append(" ");
        int i = length + 2;
        final C0762m b = C0762m.m3511b(a.toString(), i);
        int i2 = 1;
        for (Integer num : numArr) {
            if (num == null) {
                b.bindNull(i2);
            } else {
                b.bindLong(i2, (long) num.intValue());
            }
            i2++;
        }
        b.bindLong(length + 1, j);
        b.bindLong(i, j2);
        return C0763n.m3520a(new Callable<List<RoomNotification>>() {
            /* access modifiers changed from: protected */
            public void finalize() {
                b.mo4431b();
            }

            public List<RoomNotification> call() throws Exception {
                Long l;
                boolean z;
                int i;
                Cursor a = C0777c.m3539a(NotificationDao_Impl.this.__db, b, false, (CancellationSignal) null);
                try {
                    int a2 = C0776b.m3535a(a, "expire");
                    int a3 = C0776b.m3535a(a, "abTestingGroup");
                    int a4 = C0776b.m3535a(a, "body");
                    int a5 = C0776b.m3535a(a, "campaignId");
                    int a6 = C0776b.m3535a(a, "img");
                    int a7 = C0776b.m3535a(a, "lang");
                    int a8 = C0776b.m3535a(a, "title");
                    int a9 = C0776b.m3535a(a, "url");
                    int a10 = C0776b.m3535a(a, "urlTrack");
                    int a11 = C0776b.m3535a(a, "notificationCenterUrlTrack");
                    int a12 = C0776b.m3535a(a, "type");
                    int a13 = C0776b.m3535a(a, "timeStamp");
                    int a14 = C0776b.m3535a(a, "appName");
                    int a15 = C0776b.m3535a(a, "graphic");
                    int a16 = C0776b.m3535a(a, "ownerId");
                    int a17 = C0776b.m3535a(a, "processed");
                    int a18 = C0776b.m3535a(a, "actionStringRes");
                    int a19 = C0776b.m3535a(a, "whitelistedPackages");
                    int a20 = C0776b.m3535a(a, RoomNotification.KEY);
                    int a21 = C0776b.m3535a(a, "dismissed");
                    int i2 = a15;
                    ArrayList arrayList = new ArrayList(a.getCount());
                    while (a.moveToNext()) {
                        if (a.isNull(a2)) {
                            l = null;
                        } else {
                            l = Long.valueOf(a.getLong(a2));
                        }
                        String string = a.getString(a3);
                        String string2 = a.getString(a4);
                        int i3 = a.getInt(a5);
                        String string3 = a.getString(a6);
                        String string4 = a.getString(a7);
                        String string5 = a.getString(a8);
                        String string6 = a.getString(a9);
                        String string7 = a.getString(a10);
                        String string8 = a.getString(a11);
                        int i4 = a.getInt(a12);
                        long j = a.getLong(a13);
                        String string9 = a.getString(a14);
                        int i5 = i2;
                        String string10 = a.getString(i5);
                        int i6 = a2;
                        int i7 = a16;
                        String string11 = a.getString(i7);
                        a16 = i7;
                        int i8 = a17;
                        if (a.getInt(i8) != 0) {
                            a17 = i8;
                            i = a18;
                            z = true;
                        } else {
                            a17 = i8;
                            i = a18;
                            z = false;
                        }
                        int i9 = a.getInt(i);
                        a18 = i;
                        int i10 = a19;
                        List<String> restoreList = StringTypeConverter.restoreList(a.getString(i10));
                        a19 = i10;
                        int i11 = a21;
                        a21 = i11;
                        RoomNotification roomNotification = new RoomNotification(l, string, string2, i3, string3, string4, string5, string6, string7, string8, j, i4, a.getLong(i11), string9, string10, string11, z, i9, restoreList);
                        int i12 = a14;
                        int i13 = a20;
                        int i14 = i5;
                        roomNotification.setKey(a.getString(i13));
                        arrayList.add(roomNotification);
                        a2 = i6;
                        i2 = i14;
                        a20 = i13;
                        a14 = i12;
                    }
                    return arrayList;
                } finally {
                    a.close();
                }
            }
        });
    }

    public void insert(RoomNotification roomNotification) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfRoomNotification.insert(roomNotification);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    public void insertAll(List<RoomNotification> list) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfRoomNotification.insert(list);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }
}
