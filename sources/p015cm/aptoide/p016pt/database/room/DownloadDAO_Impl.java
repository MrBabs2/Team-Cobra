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
import p015cm.aptoide.p016pt.download.DownloadAnalytics;
import p050l.p103q.p104a.C5173f;
import p120q.p326a.C11482n;
import p120q.p326a.C11496w;

/* renamed from: cm.aptoide.pt.database.room.DownloadDAO_Impl */
public final class DownloadDAO_Impl implements DownloadDAO {
    /* access modifiers changed from: private */
    public final C0753j __db;
    private final C0731c<RoomDownload> __insertionAdapterOfRoomDownload;
    private final C0771q __preparedStmtOfRemove;
    private final C0771q __preparedStmtOfRemove_1;

    public DownloadDAO_Impl(C0753j jVar) {
        this.__db = jVar;
        this.__insertionAdapterOfRoomDownload = new C0731c<RoomDownload>(jVar) {
            public String createQuery() {
                return "INSERT OR REPLACE INTO `download` (`filesToDownload`,`overallDownloadStatus`,`overallProgress`,`md5`,`appName`,`Icon`,`timeStamp`,`downloadSpeed`,`packageName`,`versionCode`,`action`,`versionName`,`hasAppc`,`size`,`storeName`,`trustedBadge`,`downloadError`,`attributionId`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            public void bind(C5173f fVar, RoomDownload roomDownload) {
                String saveFileToDownloadList = FileToDownloadTypeConverter.saveFileToDownloadList(roomDownload.getFilesToDownload());
                if (saveFileToDownloadList == null) {
                    fVar.bindNull(1);
                } else {
                    fVar.bindString(1, saveFileToDownloadList);
                }
                fVar.bindLong(2, (long) roomDownload.getOverallDownloadStatus());
                fVar.bindLong(3, (long) roomDownload.getOverallProgress());
                if (roomDownload.getMd5() == null) {
                    fVar.bindNull(4);
                } else {
                    fVar.bindString(4, roomDownload.getMd5());
                }
                if (roomDownload.getAppName() == null) {
                    fVar.bindNull(5);
                } else {
                    fVar.bindString(5, roomDownload.getAppName());
                }
                if (roomDownload.getIcon() == null) {
                    fVar.bindNull(6);
                } else {
                    fVar.bindString(6, roomDownload.getIcon());
                }
                fVar.bindLong(7, roomDownload.getTimeStamp());
                fVar.bindLong(8, (long) roomDownload.getDownloadSpeed());
                if (roomDownload.getPackageName() == null) {
                    fVar.bindNull(9);
                } else {
                    fVar.bindString(9, roomDownload.getPackageName());
                }
                fVar.bindLong(10, (long) roomDownload.getVersionCode());
                fVar.bindLong(11, (long) roomDownload.getAction());
                if (roomDownload.getVersionName() == null) {
                    fVar.bindNull(12);
                } else {
                    fVar.bindString(12, roomDownload.getVersionName());
                }
                fVar.bindLong(13, roomDownload.hasAppc() ? 1 : 0);
                fVar.bindLong(14, roomDownload.getSize());
                if (roomDownload.getStoreName() == null) {
                    fVar.bindNull(15);
                } else {
                    fVar.bindString(15, roomDownload.getStoreName());
                }
                if (roomDownload.getTrustedBadge() == null) {
                    fVar.bindNull(16);
                } else {
                    fVar.bindString(16, roomDownload.getTrustedBadge());
                }
                fVar.bindLong(17, (long) roomDownload.getDownloadError());
                if (roomDownload.getAttributionId() == null) {
                    fVar.bindNull(18);
                } else {
                    fVar.bindString(18, roomDownload.getAttributionId());
                }
            }
        };
        this.__preparedStmtOfRemove = new C0771q(jVar) {
            public String createQuery() {
                return "DELETE from download where md5= ?";
            }
        };
        this.__preparedStmtOfRemove_1 = new C0771q(jVar) {
            public String createQuery() {
                return "DELETE from download where packageName=? and versionCode=?";
            }
        };
    }

    public C11482n<List<RoomDownload>> getAll() {
        final C0762m b = C0762m.m3511b("SELECT * from download", 0);
        return C0763n.m3518a(this.__db, false, new String[]{DownloadAnalytics.RAKAM_DOWNLOAD_EVENT}, new Callable<List<RoomDownload>>() {
            /* access modifiers changed from: protected */
            public void finalize() {
                b.mo4431b();
            }

            public List<RoomDownload> call() throws Exception {
                Cursor a = C0777c.m3539a(DownloadDAO_Impl.this.__db, b, false, (CancellationSignal) null);
                try {
                    int a2 = C0776b.m3535a(a, "filesToDownload");
                    int a3 = C0776b.m3535a(a, "overallDownloadStatus");
                    int a4 = C0776b.m3535a(a, "overallProgress");
                    int a5 = C0776b.m3535a(a, "md5");
                    int a6 = C0776b.m3535a(a, "appName");
                    int a7 = C0776b.m3535a(a, "Icon");
                    int a8 = C0776b.m3535a(a, "timeStamp");
                    int a9 = C0776b.m3535a(a, "downloadSpeed");
                    int a10 = C0776b.m3535a(a, "packageName");
                    int a11 = C0776b.m3535a(a, RoomInstalled.VERSION_CODE);
                    int a12 = C0776b.m3535a(a, "action");
                    int a13 = C0776b.m3535a(a, RoomInstalled.VERSION_NAME);
                    int a14 = C0776b.m3535a(a, "hasAppc");
                    int a15 = C0776b.m3535a(a, "size");
                    int a16 = C0776b.m3535a(a, "storeName");
                    int a17 = C0776b.m3535a(a, "trustedBadge");
                    int a18 = C0776b.m3535a(a, "downloadError");
                    int a19 = C0776b.m3535a(a, "attributionId");
                    int i = a15;
                    ArrayList arrayList = new ArrayList(a.getCount());
                    while (a.moveToNext()) {
                        RoomDownload roomDownload = new RoomDownload();
                        int i2 = a2;
                        roomDownload.setFilesToDownload(FileToDownloadTypeConverter.restoreFileToDownloadList(a.getString(a2)));
                        roomDownload.setOverallDownloadStatus(a.getInt(a3));
                        roomDownload.setOverallProgress(a.getInt(a4));
                        roomDownload.setMd5(a.getString(a5));
                        roomDownload.setAppName(a.getString(a6));
                        roomDownload.setIcon(a.getString(a7));
                        int i3 = a3;
                        int i4 = a4;
                        roomDownload.setTimeStamp(a.getLong(a8));
                        roomDownload.setDownloadSpeed(a.getInt(a9));
                        roomDownload.setPackageName(a.getString(a10));
                        roomDownload.setVersionCode(a.getInt(a11));
                        roomDownload.setAction(a.getInt(a12));
                        roomDownload.setVersionName(a.getString(a13));
                        roomDownload.setHasAppc(a.getInt(a14) != 0);
                        int i5 = i;
                        int i6 = a5;
                        roomDownload.setSize(a.getLong(i5));
                        int i7 = a16;
                        roomDownload.setStoreName(a.getString(i7));
                        int i8 = i3;
                        int i9 = a17;
                        roomDownload.setTrustedBadge(a.getString(i9));
                        int i10 = i5;
                        int i11 = a18;
                        roomDownload.setDownloadError(a.getInt(i11));
                        a18 = i11;
                        int i12 = a19;
                        roomDownload.setAttributionId(a.getString(i12));
                        arrayList.add(roomDownload);
                        a19 = i12;
                        a3 = i8;
                        a2 = i2;
                        a16 = i7;
                        a4 = i4;
                        int i13 = i10;
                        a17 = i9;
                        a5 = i6;
                        i = i13;
                    }
                    return arrayList;
                } finally {
                    a.close();
                }
            }
        });
    }

    public C11482n<List<RoomDownload>> getAsList(String str) {
        final C0762m b = C0762m.m3511b("SELECT * from download where md5 = ?", 1);
        if (str == null) {
            b.bindNull(1);
        } else {
            b.bindString(1, str);
        }
        return C0763n.m3518a(this.__db, false, new String[]{DownloadAnalytics.RAKAM_DOWNLOAD_EVENT}, new Callable<List<RoomDownload>>() {
            /* access modifiers changed from: protected */
            public void finalize() {
                b.mo4431b();
            }

            public List<RoomDownload> call() throws Exception {
                Cursor a = C0777c.m3539a(DownloadDAO_Impl.this.__db, b, false, (CancellationSignal) null);
                try {
                    int a2 = C0776b.m3535a(a, "filesToDownload");
                    int a3 = C0776b.m3535a(a, "overallDownloadStatus");
                    int a4 = C0776b.m3535a(a, "overallProgress");
                    int a5 = C0776b.m3535a(a, "md5");
                    int a6 = C0776b.m3535a(a, "appName");
                    int a7 = C0776b.m3535a(a, "Icon");
                    int a8 = C0776b.m3535a(a, "timeStamp");
                    int a9 = C0776b.m3535a(a, "downloadSpeed");
                    int a10 = C0776b.m3535a(a, "packageName");
                    int a11 = C0776b.m3535a(a, RoomInstalled.VERSION_CODE);
                    int a12 = C0776b.m3535a(a, "action");
                    int a13 = C0776b.m3535a(a, RoomInstalled.VERSION_NAME);
                    int a14 = C0776b.m3535a(a, "hasAppc");
                    int a15 = C0776b.m3535a(a, "size");
                    int a16 = C0776b.m3535a(a, "storeName");
                    int a17 = C0776b.m3535a(a, "trustedBadge");
                    int a18 = C0776b.m3535a(a, "downloadError");
                    int a19 = C0776b.m3535a(a, "attributionId");
                    int i = a15;
                    ArrayList arrayList = new ArrayList(a.getCount());
                    while (a.moveToNext()) {
                        RoomDownload roomDownload = new RoomDownload();
                        int i2 = a2;
                        roomDownload.setFilesToDownload(FileToDownloadTypeConverter.restoreFileToDownloadList(a.getString(a2)));
                        roomDownload.setOverallDownloadStatus(a.getInt(a3));
                        roomDownload.setOverallProgress(a.getInt(a4));
                        roomDownload.setMd5(a.getString(a5));
                        roomDownload.setAppName(a.getString(a6));
                        roomDownload.setIcon(a.getString(a7));
                        int i3 = a3;
                        int i4 = a4;
                        roomDownload.setTimeStamp(a.getLong(a8));
                        roomDownload.setDownloadSpeed(a.getInt(a9));
                        roomDownload.setPackageName(a.getString(a10));
                        roomDownload.setVersionCode(a.getInt(a11));
                        roomDownload.setAction(a.getInt(a12));
                        roomDownload.setVersionName(a.getString(a13));
                        roomDownload.setHasAppc(a.getInt(a14) != 0);
                        int i5 = i;
                        int i6 = a5;
                        roomDownload.setSize(a.getLong(i5));
                        int i7 = a16;
                        roomDownload.setStoreName(a.getString(i7));
                        int i8 = i3;
                        int i9 = a17;
                        roomDownload.setTrustedBadge(a.getString(i9));
                        int i10 = i5;
                        int i11 = a18;
                        roomDownload.setDownloadError(a.getInt(i11));
                        a18 = i11;
                        int i12 = a19;
                        roomDownload.setAttributionId(a.getString(i12));
                        arrayList.add(roomDownload);
                        a19 = i12;
                        a3 = i8;
                        a2 = i2;
                        a16 = i7;
                        a4 = i4;
                        int i13 = i10;
                        a17 = i9;
                        a5 = i6;
                        i = i13;
                    }
                    return arrayList;
                } finally {
                    a.close();
                }
            }
        });
    }

    public C11482n<RoomDownload> getAsObservable(String str) {
        final C0762m b = C0762m.m3511b("SELECT * from download where md5 = ? LIMIT 1 ", 1);
        if (str == null) {
            b.bindNull(1);
        } else {
            b.bindString(1, str);
        }
        return C0763n.m3518a(this.__db, false, new String[]{DownloadAnalytics.RAKAM_DOWNLOAD_EVENT}, new Callable<RoomDownload>() {
            /* access modifiers changed from: protected */
            public void finalize() {
                b.mo4431b();
            }

            public RoomDownload call() throws Exception {
                RoomDownload roomDownload;
                Cursor a = C0777c.m3539a(DownloadDAO_Impl.this.__db, b, false, (CancellationSignal) null);
                try {
                    int a2 = C0776b.m3535a(a, "filesToDownload");
                    int a3 = C0776b.m3535a(a, "overallDownloadStatus");
                    int a4 = C0776b.m3535a(a, "overallProgress");
                    int a5 = C0776b.m3535a(a, "md5");
                    int a6 = C0776b.m3535a(a, "appName");
                    int a7 = C0776b.m3535a(a, "Icon");
                    int a8 = C0776b.m3535a(a, "timeStamp");
                    int a9 = C0776b.m3535a(a, "downloadSpeed");
                    int a10 = C0776b.m3535a(a, "packageName");
                    int a11 = C0776b.m3535a(a, RoomInstalled.VERSION_CODE);
                    int a12 = C0776b.m3535a(a, "action");
                    int a13 = C0776b.m3535a(a, RoomInstalled.VERSION_NAME);
                    int a14 = C0776b.m3535a(a, "hasAppc");
                    int a15 = C0776b.m3535a(a, "size");
                    int a16 = C0776b.m3535a(a, "storeName");
                    int a17 = C0776b.m3535a(a, "trustedBadge");
                    int a18 = C0776b.m3535a(a, "downloadError");
                    int a19 = C0776b.m3535a(a, "attributionId");
                    if (a.moveToFirst()) {
                        int i = a19;
                        RoomDownload roomDownload2 = new RoomDownload();
                        roomDownload2.setFilesToDownload(FileToDownloadTypeConverter.restoreFileToDownloadList(a.getString(a2)));
                        roomDownload2.setOverallDownloadStatus(a.getInt(a3));
                        roomDownload2.setOverallProgress(a.getInt(a4));
                        roomDownload2.setMd5(a.getString(a5));
                        roomDownload2.setAppName(a.getString(a6));
                        roomDownload2.setIcon(a.getString(a7));
                        roomDownload2.setTimeStamp(a.getLong(a8));
                        roomDownload2.setDownloadSpeed(a.getInt(a9));
                        roomDownload2.setPackageName(a.getString(a10));
                        roomDownload2.setVersionCode(a.getInt(a11));
                        roomDownload2.setAction(a.getInt(a12));
                        roomDownload2.setVersionName(a.getString(a13));
                        roomDownload2.setHasAppc(a.getInt(a14) != 0);
                        roomDownload2.setSize(a.getLong(a15));
                        roomDownload2.setStoreName(a.getString(a16));
                        roomDownload2.setTrustedBadge(a.getString(a17));
                        roomDownload2.setDownloadError(a.getInt(a18));
                        roomDownload2.setAttributionId(a.getString(i));
                        roomDownload = roomDownload2;
                    } else {
                        roomDownload = null;
                    }
                    return roomDownload;
                } finally {
                    a.close();
                }
            }
        });
    }

    public C11496w<RoomDownload> getAsSingle(String str) {
        final C0762m b = C0762m.m3511b("SELECT * from download where md5 = ? LIMIT 1 ", 1);
        if (str == null) {
            b.bindNull(1);
        } else {
            b.bindString(1, str);
        }
        return C0763n.m3520a(new Callable<RoomDownload>() {
            /* access modifiers changed from: protected */
            public void finalize() {
                b.mo4431b();
            }

            public RoomDownload call() throws Exception {
                RoomDownload roomDownload;
                Cursor a = C0777c.m3539a(DownloadDAO_Impl.this.__db, b, false, (CancellationSignal) null);
                try {
                    int a2 = C0776b.m3535a(a, "filesToDownload");
                    int a3 = C0776b.m3535a(a, "overallDownloadStatus");
                    int a4 = C0776b.m3535a(a, "overallProgress");
                    int a5 = C0776b.m3535a(a, "md5");
                    int a6 = C0776b.m3535a(a, "appName");
                    int a7 = C0776b.m3535a(a, "Icon");
                    int a8 = C0776b.m3535a(a, "timeStamp");
                    int a9 = C0776b.m3535a(a, "downloadSpeed");
                    int a10 = C0776b.m3535a(a, "packageName");
                    int a11 = C0776b.m3535a(a, RoomInstalled.VERSION_CODE);
                    int a12 = C0776b.m3535a(a, "action");
                    int a13 = C0776b.m3535a(a, RoomInstalled.VERSION_NAME);
                    int a14 = C0776b.m3535a(a, "hasAppc");
                    int a15 = C0776b.m3535a(a, "size");
                    try {
                        int a16 = C0776b.m3535a(a, "storeName");
                        int a17 = C0776b.m3535a(a, "trustedBadge");
                        int a18 = C0776b.m3535a(a, "downloadError");
                        int a19 = C0776b.m3535a(a, "attributionId");
                        if (a.moveToFirst()) {
                            int i = a19;
                            RoomDownload roomDownload2 = new RoomDownload();
                            roomDownload2.setFilesToDownload(FileToDownloadTypeConverter.restoreFileToDownloadList(a.getString(a2)));
                            roomDownload2.setOverallDownloadStatus(a.getInt(a3));
                            roomDownload2.setOverallProgress(a.getInt(a4));
                            roomDownload2.setMd5(a.getString(a5));
                            roomDownload2.setAppName(a.getString(a6));
                            roomDownload2.setIcon(a.getString(a7));
                            roomDownload2.setTimeStamp(a.getLong(a8));
                            roomDownload2.setDownloadSpeed(a.getInt(a9));
                            roomDownload2.setPackageName(a.getString(a10));
                            roomDownload2.setVersionCode(a.getInt(a11));
                            roomDownload2.setAction(a.getInt(a12));
                            roomDownload2.setVersionName(a.getString(a13));
                            roomDownload2.setHasAppc(a.getInt(a14) != 0);
                            roomDownload2.setSize(a.getLong(a15));
                            roomDownload2.setStoreName(a.getString(a16));
                            roomDownload2.setTrustedBadge(a.getString(a17));
                            roomDownload2.setDownloadError(a.getInt(a18));
                            roomDownload2.setAttributionId(a.getString(i));
                            roomDownload = roomDownload2;
                        } else {
                            roomDownload = null;
                        }
                        if (roomDownload != null) {
                            a.close();
                            return roomDownload;
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

    public C11482n<List<RoomDownload>> getInQueueSortedDownloads() {
        final C0762m b = C0762m.m3511b("SELECT * from download where overallDownloadStatus=13 ORDER BY timeStamp ASC", 0);
        return C0763n.m3518a(this.__db, false, new String[]{DownloadAnalytics.RAKAM_DOWNLOAD_EVENT}, new Callable<List<RoomDownload>>() {
            /* access modifiers changed from: protected */
            public void finalize() {
                b.mo4431b();
            }

            public List<RoomDownload> call() throws Exception {
                Cursor a = C0777c.m3539a(DownloadDAO_Impl.this.__db, b, false, (CancellationSignal) null);
                try {
                    int a2 = C0776b.m3535a(a, "filesToDownload");
                    int a3 = C0776b.m3535a(a, "overallDownloadStatus");
                    int a4 = C0776b.m3535a(a, "overallProgress");
                    int a5 = C0776b.m3535a(a, "md5");
                    int a6 = C0776b.m3535a(a, "appName");
                    int a7 = C0776b.m3535a(a, "Icon");
                    int a8 = C0776b.m3535a(a, "timeStamp");
                    int a9 = C0776b.m3535a(a, "downloadSpeed");
                    int a10 = C0776b.m3535a(a, "packageName");
                    int a11 = C0776b.m3535a(a, RoomInstalled.VERSION_CODE);
                    int a12 = C0776b.m3535a(a, "action");
                    int a13 = C0776b.m3535a(a, RoomInstalled.VERSION_NAME);
                    int a14 = C0776b.m3535a(a, "hasAppc");
                    int a15 = C0776b.m3535a(a, "size");
                    int a16 = C0776b.m3535a(a, "storeName");
                    int a17 = C0776b.m3535a(a, "trustedBadge");
                    int a18 = C0776b.m3535a(a, "downloadError");
                    int a19 = C0776b.m3535a(a, "attributionId");
                    int i = a15;
                    ArrayList arrayList = new ArrayList(a.getCount());
                    while (a.moveToNext()) {
                        RoomDownload roomDownload = new RoomDownload();
                        int i2 = a2;
                        roomDownload.setFilesToDownload(FileToDownloadTypeConverter.restoreFileToDownloadList(a.getString(a2)));
                        roomDownload.setOverallDownloadStatus(a.getInt(a3));
                        roomDownload.setOverallProgress(a.getInt(a4));
                        roomDownload.setMd5(a.getString(a5));
                        roomDownload.setAppName(a.getString(a6));
                        roomDownload.setIcon(a.getString(a7));
                        int i3 = a3;
                        int i4 = a4;
                        roomDownload.setTimeStamp(a.getLong(a8));
                        roomDownload.setDownloadSpeed(a.getInt(a9));
                        roomDownload.setPackageName(a.getString(a10));
                        roomDownload.setVersionCode(a.getInt(a11));
                        roomDownload.setAction(a.getInt(a12));
                        roomDownload.setVersionName(a.getString(a13));
                        roomDownload.setHasAppc(a.getInt(a14) != 0);
                        int i5 = i;
                        int i6 = a5;
                        roomDownload.setSize(a.getLong(i5));
                        int i7 = a16;
                        roomDownload.setStoreName(a.getString(i7));
                        int i8 = i3;
                        int i9 = a17;
                        roomDownload.setTrustedBadge(a.getString(i9));
                        int i10 = i5;
                        int i11 = a18;
                        roomDownload.setDownloadError(a.getInt(i11));
                        a18 = i11;
                        int i12 = a19;
                        roomDownload.setAttributionId(a.getString(i12));
                        arrayList.add(roomDownload);
                        a19 = i12;
                        a3 = i8;
                        a2 = i2;
                        a16 = i7;
                        a4 = i4;
                        int i13 = i10;
                        a17 = i9;
                        a5 = i6;
                        i = i13;
                    }
                    return arrayList;
                } finally {
                    a.close();
                }
            }
        });
    }

    public C11482n<List<RoomDownload>> getOutOfSpaceDownloads() {
        final C0762m b = C0762m.m3511b("SELECT * from download where overallDownloadStatus=9 and downloadError=2 ORDER BY timeStamp ASC", 0);
        return C0763n.m3518a(this.__db, false, new String[]{DownloadAnalytics.RAKAM_DOWNLOAD_EVENT}, new Callable<List<RoomDownload>>() {
            /* access modifiers changed from: protected */
            public void finalize() {
                b.mo4431b();
            }

            public List<RoomDownload> call() throws Exception {
                Cursor a = C0777c.m3539a(DownloadDAO_Impl.this.__db, b, false, (CancellationSignal) null);
                try {
                    int a2 = C0776b.m3535a(a, "filesToDownload");
                    int a3 = C0776b.m3535a(a, "overallDownloadStatus");
                    int a4 = C0776b.m3535a(a, "overallProgress");
                    int a5 = C0776b.m3535a(a, "md5");
                    int a6 = C0776b.m3535a(a, "appName");
                    int a7 = C0776b.m3535a(a, "Icon");
                    int a8 = C0776b.m3535a(a, "timeStamp");
                    int a9 = C0776b.m3535a(a, "downloadSpeed");
                    int a10 = C0776b.m3535a(a, "packageName");
                    int a11 = C0776b.m3535a(a, RoomInstalled.VERSION_CODE);
                    int a12 = C0776b.m3535a(a, "action");
                    int a13 = C0776b.m3535a(a, RoomInstalled.VERSION_NAME);
                    int a14 = C0776b.m3535a(a, "hasAppc");
                    int a15 = C0776b.m3535a(a, "size");
                    int a16 = C0776b.m3535a(a, "storeName");
                    int a17 = C0776b.m3535a(a, "trustedBadge");
                    int a18 = C0776b.m3535a(a, "downloadError");
                    int a19 = C0776b.m3535a(a, "attributionId");
                    int i = a15;
                    ArrayList arrayList = new ArrayList(a.getCount());
                    while (a.moveToNext()) {
                        RoomDownload roomDownload = new RoomDownload();
                        int i2 = a2;
                        roomDownload.setFilesToDownload(FileToDownloadTypeConverter.restoreFileToDownloadList(a.getString(a2)));
                        roomDownload.setOverallDownloadStatus(a.getInt(a3));
                        roomDownload.setOverallProgress(a.getInt(a4));
                        roomDownload.setMd5(a.getString(a5));
                        roomDownload.setAppName(a.getString(a6));
                        roomDownload.setIcon(a.getString(a7));
                        int i3 = a3;
                        int i4 = a4;
                        roomDownload.setTimeStamp(a.getLong(a8));
                        roomDownload.setDownloadSpeed(a.getInt(a9));
                        roomDownload.setPackageName(a.getString(a10));
                        roomDownload.setVersionCode(a.getInt(a11));
                        roomDownload.setAction(a.getInt(a12));
                        roomDownload.setVersionName(a.getString(a13));
                        roomDownload.setHasAppc(a.getInt(a14) != 0);
                        int i5 = i;
                        int i6 = a5;
                        roomDownload.setSize(a.getLong(i5));
                        int i7 = a16;
                        roomDownload.setStoreName(a.getString(i7));
                        int i8 = i3;
                        int i9 = a17;
                        roomDownload.setTrustedBadge(a.getString(i9));
                        int i10 = i5;
                        int i11 = a18;
                        roomDownload.setDownloadError(a.getInt(i11));
                        a18 = i11;
                        int i12 = a19;
                        roomDownload.setAttributionId(a.getString(i12));
                        arrayList.add(roomDownload);
                        a19 = i12;
                        a3 = i8;
                        a2 = i2;
                        a16 = i7;
                        a4 = i4;
                        int i13 = i10;
                        a17 = i9;
                        a5 = i6;
                        i = i13;
                    }
                    return arrayList;
                } finally {
                    a.close();
                }
            }
        });
    }

    public C11482n<List<RoomDownload>> getRunningDownloads() {
        final C0762m b = C0762m.m3511b("SELECT * from download where overallDownloadStatus = 5 OR overallDownloadStatus = 13 OR overallDownloadStatus = 4", 0);
        return C0763n.m3518a(this.__db, false, new String[]{DownloadAnalytics.RAKAM_DOWNLOAD_EVENT}, new Callable<List<RoomDownload>>() {
            /* access modifiers changed from: protected */
            public void finalize() {
                b.mo4431b();
            }

            public List<RoomDownload> call() throws Exception {
                Cursor a = C0777c.m3539a(DownloadDAO_Impl.this.__db, b, false, (CancellationSignal) null);
                try {
                    int a2 = C0776b.m3535a(a, "filesToDownload");
                    int a3 = C0776b.m3535a(a, "overallDownloadStatus");
                    int a4 = C0776b.m3535a(a, "overallProgress");
                    int a5 = C0776b.m3535a(a, "md5");
                    int a6 = C0776b.m3535a(a, "appName");
                    int a7 = C0776b.m3535a(a, "Icon");
                    int a8 = C0776b.m3535a(a, "timeStamp");
                    int a9 = C0776b.m3535a(a, "downloadSpeed");
                    int a10 = C0776b.m3535a(a, "packageName");
                    int a11 = C0776b.m3535a(a, RoomInstalled.VERSION_CODE);
                    int a12 = C0776b.m3535a(a, "action");
                    int a13 = C0776b.m3535a(a, RoomInstalled.VERSION_NAME);
                    int a14 = C0776b.m3535a(a, "hasAppc");
                    int a15 = C0776b.m3535a(a, "size");
                    int a16 = C0776b.m3535a(a, "storeName");
                    int a17 = C0776b.m3535a(a, "trustedBadge");
                    int a18 = C0776b.m3535a(a, "downloadError");
                    int a19 = C0776b.m3535a(a, "attributionId");
                    int i = a15;
                    ArrayList arrayList = new ArrayList(a.getCount());
                    while (a.moveToNext()) {
                        RoomDownload roomDownload = new RoomDownload();
                        int i2 = a2;
                        roomDownload.setFilesToDownload(FileToDownloadTypeConverter.restoreFileToDownloadList(a.getString(a2)));
                        roomDownload.setOverallDownloadStatus(a.getInt(a3));
                        roomDownload.setOverallProgress(a.getInt(a4));
                        roomDownload.setMd5(a.getString(a5));
                        roomDownload.setAppName(a.getString(a6));
                        roomDownload.setIcon(a.getString(a7));
                        int i3 = a3;
                        int i4 = a4;
                        roomDownload.setTimeStamp(a.getLong(a8));
                        roomDownload.setDownloadSpeed(a.getInt(a9));
                        roomDownload.setPackageName(a.getString(a10));
                        roomDownload.setVersionCode(a.getInt(a11));
                        roomDownload.setAction(a.getInt(a12));
                        roomDownload.setVersionName(a.getString(a13));
                        roomDownload.setHasAppc(a.getInt(a14) != 0);
                        int i5 = i;
                        int i6 = a5;
                        roomDownload.setSize(a.getLong(i5));
                        int i7 = a16;
                        roomDownload.setStoreName(a.getString(i7));
                        int i8 = i3;
                        int i9 = a17;
                        roomDownload.setTrustedBadge(a.getString(i9));
                        int i10 = i5;
                        int i11 = a18;
                        roomDownload.setDownloadError(a.getInt(i11));
                        a18 = i11;
                        int i12 = a19;
                        roomDownload.setAttributionId(a.getString(i12));
                        arrayList.add(roomDownload);
                        a19 = i12;
                        a3 = i8;
                        a2 = i2;
                        a16 = i7;
                        a4 = i4;
                        int i13 = i10;
                        a17 = i9;
                        a5 = i6;
                        i = i13;
                    }
                    return arrayList;
                } finally {
                    a.close();
                }
            }
        });
    }

    public C11482n<List<RoomDownload>> getUnmovedFilesDownloads() {
        final C0762m b = C0762m.m3511b("SELECT * from download where overallDownloadStatus=14 ORDER BY timeStamp ASC", 0);
        return C0763n.m3518a(this.__db, false, new String[]{DownloadAnalytics.RAKAM_DOWNLOAD_EVENT}, new Callable<List<RoomDownload>>() {
            /* access modifiers changed from: protected */
            public void finalize() {
                b.mo4431b();
            }

            public List<RoomDownload> call() throws Exception {
                Cursor a = C0777c.m3539a(DownloadDAO_Impl.this.__db, b, false, (CancellationSignal) null);
                try {
                    int a2 = C0776b.m3535a(a, "filesToDownload");
                    int a3 = C0776b.m3535a(a, "overallDownloadStatus");
                    int a4 = C0776b.m3535a(a, "overallProgress");
                    int a5 = C0776b.m3535a(a, "md5");
                    int a6 = C0776b.m3535a(a, "appName");
                    int a7 = C0776b.m3535a(a, "Icon");
                    int a8 = C0776b.m3535a(a, "timeStamp");
                    int a9 = C0776b.m3535a(a, "downloadSpeed");
                    int a10 = C0776b.m3535a(a, "packageName");
                    int a11 = C0776b.m3535a(a, RoomInstalled.VERSION_CODE);
                    int a12 = C0776b.m3535a(a, "action");
                    int a13 = C0776b.m3535a(a, RoomInstalled.VERSION_NAME);
                    int a14 = C0776b.m3535a(a, "hasAppc");
                    int a15 = C0776b.m3535a(a, "size");
                    int a16 = C0776b.m3535a(a, "storeName");
                    int a17 = C0776b.m3535a(a, "trustedBadge");
                    int a18 = C0776b.m3535a(a, "downloadError");
                    int a19 = C0776b.m3535a(a, "attributionId");
                    int i = a15;
                    ArrayList arrayList = new ArrayList(a.getCount());
                    while (a.moveToNext()) {
                        RoomDownload roomDownload = new RoomDownload();
                        int i2 = a2;
                        roomDownload.setFilesToDownload(FileToDownloadTypeConverter.restoreFileToDownloadList(a.getString(a2)));
                        roomDownload.setOverallDownloadStatus(a.getInt(a3));
                        roomDownload.setOverallProgress(a.getInt(a4));
                        roomDownload.setMd5(a.getString(a5));
                        roomDownload.setAppName(a.getString(a6));
                        roomDownload.setIcon(a.getString(a7));
                        int i3 = a3;
                        int i4 = a4;
                        roomDownload.setTimeStamp(a.getLong(a8));
                        roomDownload.setDownloadSpeed(a.getInt(a9));
                        roomDownload.setPackageName(a.getString(a10));
                        roomDownload.setVersionCode(a.getInt(a11));
                        roomDownload.setAction(a.getInt(a12));
                        roomDownload.setVersionName(a.getString(a13));
                        roomDownload.setHasAppc(a.getInt(a14) != 0);
                        int i5 = i;
                        int i6 = a5;
                        roomDownload.setSize(a.getLong(i5));
                        int i7 = a16;
                        roomDownload.setStoreName(a.getString(i7));
                        int i8 = i3;
                        int i9 = a17;
                        roomDownload.setTrustedBadge(a.getString(i9));
                        int i10 = i5;
                        int i11 = a18;
                        roomDownload.setDownloadError(a.getInt(i11));
                        a18 = i11;
                        int i12 = a19;
                        roomDownload.setAttributionId(a.getString(i12));
                        arrayList.add(roomDownload);
                        a19 = i12;
                        a3 = i8;
                        a2 = i2;
                        a16 = i7;
                        a4 = i4;
                        int i13 = i10;
                        a17 = i9;
                        a5 = i6;
                        i = i13;
                    }
                    return arrayList;
                } finally {
                    a.close();
                }
            }
        });
    }

    public void insert(RoomDownload roomDownload) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfRoomDownload.insert(roomDownload);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    public void insertAll(List<RoomDownload> list) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfRoomDownload.insert(list);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    public void remove(String str) {
        this.__db.assertNotSuspendingTransaction();
        C5173f acquire = this.__preparedStmtOfRemove.acquire();
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
            this.__preparedStmtOfRemove.release(acquire);
        }
    }

    public void remove(String str, int i) {
        this.__db.assertNotSuspendingTransaction();
        C5173f acquire = this.__preparedStmtOfRemove_1.acquire();
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        acquire.bindLong(2, (long) i);
        this.__db.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfRemove_1.release(acquire);
        }
    }
}
