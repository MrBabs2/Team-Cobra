package com.liulishuo.filedownloader.services;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.util.SparseArray;
import com.liulishuo.filedownloader.model.C8895a;
import p112n.p312h.p313a.p318f0.C10763c;
import p112n.p312h.p313a.p318f0.C10767d;

/* renamed from: com.liulishuo.filedownloader.services.b */
/* compiled from: DefaultDatabaseImpl */
class C8898b implements C8905g {

    /* renamed from: a */
    private final SQLiteDatabase f25275a = new C8899c(C10763c.m36479a()).getWritableDatabase();

    /* renamed from: b */
    private final SparseArray<C8895a> f25276b = new SparseArray<>();

    public C8898b() {
        m29187a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x015e A[Catch:{ all -> 0x019f }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x016a A[Catch:{ all -> 0x019f }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x021f  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0247  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x024c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m29187a() {
        /*
            r23 = this;
            r1 = r23
            java.lang.String r2 = "delete %s"
            java.lang.String r3 = "filedownloader"
            java.lang.String r4 = "DELETE FROM %s WHERE %s IN (%s);"
            java.lang.String r5 = "refresh data %d , will delete: %d consume %d"
            java.lang.String r6 = ", "
            java.lang.String r7 = "_id"
            long r8 = java.lang.System.currentTimeMillis()
            android.database.sqlite.SQLiteDatabase r0 = r1.f25275a
            r10 = 0
            java.lang.String r11 = "SELECT * FROM filedownloader"
            android.database.Cursor r11 = r0.rawQuery(r11, r10)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
        L_0x0020:
            r15 = 1
            boolean r0 = r11.moveToNext()     // Catch:{ all -> 0x020e }
            if (r0 == 0) goto L_0x01a3
            com.liulishuo.filedownloader.model.a r0 = new com.liulishuo.filedownloader.model.a     // Catch:{ all -> 0x020e }
            r0.<init>()     // Catch:{ all -> 0x020e }
            int r10 = r11.getColumnIndex(r7)     // Catch:{ all -> 0x020e }
            int r10 = r11.getInt(r10)     // Catch:{ all -> 0x020e }
            r0.mo32729a((int) r10)     // Catch:{ all -> 0x020e }
            java.lang.String r10 = "url"
            int r10 = r11.getColumnIndex(r10)     // Catch:{ all -> 0x020e }
            java.lang.String r10 = r11.getString(r10)     // Catch:{ all -> 0x020e }
            r0.mo32739d(r10)     // Catch:{ all -> 0x020e }
            java.lang.String r10 = "path"
            int r10 = r11.getColumnIndex(r10)     // Catch:{ all -> 0x020e }
            java.lang.String r10 = r11.getString(r10)     // Catch:{ all -> 0x020e }
            java.lang.String r13 = "pathAsDirectory"
            int r13 = r11.getColumnIndex(r13)     // Catch:{ all -> 0x020e }
            short r13 = r11.getShort(r13)     // Catch:{ all -> 0x020e }
            if (r13 != r15) goto L_0x005c
            r13 = 1
            goto L_0x005d
        L_0x005c:
            r13 = 0
        L_0x005d:
            r0.mo32732a(r10, r13)     // Catch:{ all -> 0x020e }
            java.lang.String r10 = "status"
            int r10 = r11.getColumnIndex(r10)     // Catch:{ all -> 0x020e }
            short r10 = r11.getShort(r10)     // Catch:{ all -> 0x020e }
            byte r10 = (byte) r10     // Catch:{ all -> 0x020e }
            r0.mo32728a((byte) r10)     // Catch:{ all -> 0x020e }
            java.lang.String r10 = "sofar"
            int r10 = r11.getColumnIndex(r10)     // Catch:{ all -> 0x020e }
            long r14 = r11.getLong(r10)     // Catch:{ all -> 0x020e }
            r0.mo32730a((long) r14)     // Catch:{ all -> 0x020e }
            java.lang.String r10 = "total"
            int r10 = r11.getColumnIndex(r10)     // Catch:{ all -> 0x020e }
            long r14 = r11.getLong(r10)     // Catch:{ all -> 0x020e }
            r0.mo32734b((long) r14)     // Catch:{ all -> 0x020e }
            java.lang.String r10 = "errMsg"
            int r10 = r11.getColumnIndex(r10)     // Catch:{ all -> 0x020e }
            java.lang.String r10 = r11.getString(r10)     // Catch:{ all -> 0x020e }
            r0.mo32735b((java.lang.String) r10)     // Catch:{ all -> 0x020e }
            java.lang.String r10 = "etag"
            int r10 = r11.getColumnIndex(r10)     // Catch:{ all -> 0x020e }
            java.lang.String r10 = r11.getString(r10)     // Catch:{ all -> 0x020e }
            r0.mo32731a((java.lang.String) r10)     // Catch:{ all -> 0x020e }
            java.lang.String r10 = "filename"
            int r10 = r11.getColumnIndex(r10)     // Catch:{ all -> 0x020e }
            java.lang.String r10 = r11.getString(r10)     // Catch:{ all -> 0x020e }
            r0.mo32737c(r10)     // Catch:{ all -> 0x020e }
            byte r10 = r0.mo32742g()     // Catch:{ all -> 0x020e }
            r14 = 0
            r13 = 3
            if (r10 == r13) goto L_0x00d5
            byte r13 = r0.mo32742g()     // Catch:{ all -> 0x020e }
            r10 = 2
            if (r13 == r10) goto L_0x00d5
            byte r10 = r0.mo32742g()     // Catch:{ all -> 0x020e }
            r13 = -1
            if (r10 == r13) goto L_0x00d5
            byte r10 = r0.mo32742g()     // Catch:{ all -> 0x020e }
            r13 = 1
            if (r10 != r13) goto L_0x00d9
            long r21 = r0.mo32741f()     // Catch:{ all -> 0x020e }
            int r10 = (r21 > r14 ? 1 : (r21 == r14 ? 0 : -1))
            if (r10 <= 0) goto L_0x00d9
        L_0x00d5:
            r10 = -2
            r0.mo32728a((byte) r10)     // Catch:{ all -> 0x020e }
        L_0x00d9:
            java.lang.String r10 = r0.mo32743h()     // Catch:{ all -> 0x020e }
            if (r10 != 0) goto L_0x00ed
            int r0 = r0.mo32738d()     // Catch:{ all -> 0x020e }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x020e }
            r12.add(r0)     // Catch:{ all -> 0x020e }
        L_0x00ea:
            r10 = 0
            goto L_0x0020
        L_0x00ed:
            java.io.File r13 = new java.io.File     // Catch:{ all -> 0x020e }
            r13.<init>(r10)     // Catch:{ all -> 0x020e }
            byte r10 = r0.mo32742g()     // Catch:{ all -> 0x020e }
            r14 = -2
            if (r10 != r14) goto L_0x0149
            int r10 = r0.mo32738d()     // Catch:{ all -> 0x020e }
            java.lang.String r14 = r0.mo32740e()     // Catch:{ all -> 0x020e }
            r15 = 0
            boolean r10 = com.liulishuo.filedownloader.services.C8906h.m29259a(r10, r0, r14, r15)     // Catch:{ all -> 0x020e }
            if (r10 == 0) goto L_0x0149
            java.io.File r10 = new java.io.File     // Catch:{ all -> 0x020e }
            java.lang.String r14 = r0.mo32744i()     // Catch:{ all -> 0x020e }
            r10.<init>(r14)     // Catch:{ all -> 0x020e }
            boolean r14 = r10.exists()     // Catch:{ all -> 0x020e }
            if (r14 != 0) goto L_0x0149
            boolean r14 = r13.exists()     // Catch:{ all -> 0x020e }
            if (r14 == 0) goto L_0x0149
            boolean r14 = r13.renameTo(r10)     // Catch:{ all -> 0x020e }
            boolean r17 = p112n.p312h.p313a.p318f0.C10767d.f28826a     // Catch:{ all -> 0x020e }
            if (r17 == 0) goto L_0x0149
            java.lang.String r15 = "resume from the old no-temp-file architecture [%B], [%s]->[%s]"
            r19 = r5
            r20 = r13
            r13 = 3
            java.lang.Object[] r5 = new java.lang.Object[r13]     // Catch:{ all -> 0x019f }
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)     // Catch:{ all -> 0x019f }
            r16 = 0
            r5[r16] = r14     // Catch:{ all -> 0x019f }
            java.lang.String r14 = r20.getPath()     // Catch:{ all -> 0x019f }
            r18 = 1
            r5[r18] = r14     // Catch:{ all -> 0x019f }
            java.lang.String r10 = r10.getPath()     // Catch:{ all -> 0x019f }
            r14 = 2
            r5[r14] = r10     // Catch:{ all -> 0x019f }
            p112n.p312h.p313a.p318f0.C10767d.m36490a(r1, r15, r5)     // Catch:{ all -> 0x019f }
            goto L_0x014d
        L_0x0149:
            r19 = r5
            r20 = r13
        L_0x014d:
            byte r5 = r0.mo32742g()     // Catch:{ all -> 0x019f }
            r10 = 1
            if (r5 != r10) goto L_0x016a
            long r14 = r0.mo32741f()     // Catch:{ all -> 0x019f }
            r21 = 0
            int r5 = (r14 > r21 ? 1 : (r14 == r21 ? 0 : -1))
            if (r5 > 0) goto L_0x016a
            int r0 = r0.mo32738d()     // Catch:{ all -> 0x019f }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x019f }
            r12.add(r0)     // Catch:{ all -> 0x019f }
            goto L_0x019b
        L_0x016a:
            int r5 = r0.mo32738d()     // Catch:{ all -> 0x019f }
            boolean r5 = com.liulishuo.filedownloader.services.C8906h.m29257a((int) r5, (com.liulishuo.filedownloader.model.C8895a) r0)     // Catch:{ all -> 0x019f }
            if (r5 != 0) goto L_0x0180
            int r0 = r0.mo32738d()     // Catch:{ all -> 0x019f }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x019f }
            r12.add(r0)     // Catch:{ all -> 0x019f }
            goto L_0x019b
        L_0x0180:
            boolean r5 = r20.exists()     // Catch:{ all -> 0x019f }
            if (r5 == 0) goto L_0x0192
            int r0 = r0.mo32738d()     // Catch:{ all -> 0x019f }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x019f }
            r12.add(r0)     // Catch:{ all -> 0x019f }
            goto L_0x019b
        L_0x0192:
            android.util.SparseArray<com.liulishuo.filedownloader.model.a> r5 = r1.f25276b     // Catch:{ all -> 0x019f }
            int r10 = r0.mo32738d()     // Catch:{ all -> 0x019f }
            r5.put(r10, r0)     // Catch:{ all -> 0x019f }
        L_0x019b:
            r5 = r19
            goto L_0x00ea
        L_0x019f:
            r0 = move-exception
            r5 = r19
            goto L_0x020f
        L_0x01a3:
            r19 = r5
            r11.close()
            android.content.Context r0 = p112n.p312h.p313a.p318f0.C10763c.m36479a()
            p112n.p312h.p313a.p318f0.C10771f.m36514c((android.content.Context) r0)
            int r0 = r12.size()
            if (r0 <= 0) goto L_0x01dd
            java.lang.String r0 = android.text.TextUtils.join(r6, r12)
            boolean r5 = p112n.p312h.p313a.p318f0.C10767d.f28826a
            if (r5 == 0) goto L_0x01c7
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r10 = 0
            r6[r10] = r0
            p112n.p312h.p313a.p318f0.C10767d.m36490a(r1, r2, r6)
            goto L_0x01c9
        L_0x01c7:
            r5 = 1
            r10 = 0
        L_0x01c9:
            android.database.sqlite.SQLiteDatabase r2 = r1.f25275a
            r6 = 3
            java.lang.Object[] r11 = new java.lang.Object[r6]
            r11[r10] = r3
            r11[r5] = r7
            r3 = 2
            r11[r3] = r0
            java.lang.String r0 = p112n.p312h.p313a.p318f0.C10771f.m36504a((java.lang.String) r4, (java.lang.Object[]) r11)
            r2.execSQL(r0)
            goto L_0x01de
        L_0x01dd:
            r6 = 3
        L_0x01de:
            boolean r0 = p112n.p312h.p313a.p318f0.C10767d.f28826a
            if (r0 == 0) goto L_0x020d
            java.lang.Object[] r0 = new java.lang.Object[r6]
            android.util.SparseArray<com.liulishuo.filedownloader.model.a> r2 = r1.f25276b
            int r2 = r2.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 0
            r0[r3] = r2
            int r2 = r12.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 1
            r0[r3] = r2
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r8
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = 2
            r0[r3] = r2
            r5 = r19
            p112n.p312h.p313a.p318f0.C10767d.m36490a(r1, r5, r0)
        L_0x020d:
            return
        L_0x020e:
            r0 = move-exception
        L_0x020f:
            r11.close()
            android.content.Context r10 = p112n.p312h.p313a.p318f0.C10763c.m36479a()
            p112n.p312h.p313a.p318f0.C10771f.m36514c((android.content.Context) r10)
            int r10 = r12.size()
            if (r10 <= 0) goto L_0x0247
            java.lang.String r6 = android.text.TextUtils.join(r6, r12)
            boolean r10 = p112n.p312h.p313a.p318f0.C10767d.f28826a
            if (r10 == 0) goto L_0x0231
            r10 = 1
            java.lang.Object[] r11 = new java.lang.Object[r10]
            r14 = 0
            r11[r14] = r6
            p112n.p312h.p313a.p318f0.C10767d.m36490a(r1, r2, r11)
            goto L_0x0233
        L_0x0231:
            r10 = 1
            r14 = 0
        L_0x0233:
            android.database.sqlite.SQLiteDatabase r2 = r1.f25275a
            r11 = 3
            java.lang.Object[] r13 = new java.lang.Object[r11]
            r13[r14] = r3
            r13[r10] = r7
            r3 = 2
            r13[r3] = r6
            java.lang.String r3 = p112n.p312h.p313a.p318f0.C10771f.m36504a((java.lang.String) r4, (java.lang.Object[]) r13)
            r2.execSQL(r3)
            goto L_0x0248
        L_0x0247:
            r11 = 3
        L_0x0248:
            boolean r2 = p112n.p312h.p313a.p318f0.C10767d.f28826a
            if (r2 == 0) goto L_0x0275
            java.lang.Object[] r2 = new java.lang.Object[r11]
            android.util.SparseArray<com.liulishuo.filedownloader.model.a> r3 = r1.f25276b
            int r3 = r3.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 0
            r2[r4] = r3
            int r3 = r12.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 1
            r2[r4] = r3
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r8
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r4 = 2
            r2[r4] = r3
            p112n.p312h.p313a.p318f0.C10767d.m36490a(r1, r5, r2)
        L_0x0275:
            goto L_0x0277
        L_0x0276:
            throw r0
        L_0x0277:
            goto L_0x0276
        */
        throw new UnsupportedOperationException("Method not decompiled: com.liulishuo.filedownloader.services.C8898b.m29187a():void");
    }

    /* renamed from: b */
    public void mo32772b(C8895a aVar, long j) {
        aVar.mo32728a((byte) 3);
        aVar.mo32730a(j);
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (byte) 3);
        contentValues.put("sofar", Long.valueOf(j));
        m29188a(aVar.mo32738d(), contentValues);
    }

    /* renamed from: c */
    public void mo32773c(C8895a aVar) {
        this.f25276b.put(aVar.mo32738d(), aVar);
        this.f25275a.insert("filedownloader", (String) null, aVar.mo32749n());
    }

    public void clear() {
        this.f25276b.clear();
        this.f25275a.delete("filedownloader", (String) null, (String[]) null);
    }

    public boolean remove(int i) {
        this.f25276b.remove(i);
        return this.f25275a.delete("filedownloader", "_id = ?", new String[]{String.valueOf(i)}) != 0;
    }

    /* renamed from: c */
    public void mo32774c(C8895a aVar, long j) {
        aVar.mo32728a((byte) -2);
        aVar.mo32730a(j);
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (byte) -2);
        contentValues.put("sofar", Long.valueOf(j));
        m29188a(aVar.mo32738d(), contentValues);
    }

    /* renamed from: b */
    public void mo32771b(C8895a aVar) {
        aVar.mo32728a((byte) 1);
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (byte) 1);
        m29188a(aVar.mo32738d(), contentValues);
    }

    /* renamed from: a */
    public C8895a mo32765a(int i) {
        return this.f25276b.get(i);
    }

    /* renamed from: a */
    public void mo32766a(C8895a aVar) {
        if (aVar == null) {
            C10767d.m36495e(this, "update but model == null!", new Object[0]);
        } else if (mo32765a(aVar.mo32738d()) != null) {
            this.f25276b.remove(aVar.mo32738d());
            this.f25276b.put(aVar.mo32738d(), aVar);
            ContentValues n = aVar.mo32749n();
            this.f25275a.update("filedownloader", n, "_id = ? ", new String[]{String.valueOf(aVar.mo32738d())});
        } else {
            mo32773c(aVar);
        }
    }

    /* renamed from: a */
    public void mo32768a(C8895a aVar, long j, String str, String str2) {
        aVar.mo32728a((byte) 2);
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (byte) 2);
        if (aVar.mo32745j() != j) {
            aVar.mo32734b(j);
            contentValues.put("total", Long.valueOf(j));
        }
        String a = aVar.mo32727a();
        if ((str != null && !str.equals(a)) || (a != null && !a.equals(str))) {
            aVar.mo32731a(str);
            contentValues.put("etag", str);
        }
        if (aVar.mo32748m() && aVar.mo32736c() == null && str2 != null) {
            aVar.mo32737c(str2);
            contentValues.put("filename", str2);
        }
        m29188a(aVar.mo32738d(), contentValues);
    }

    /* renamed from: a */
    public void mo32770a(C8895a aVar, Throwable th, long j) {
        String th2 = th.toString();
        aVar.mo32728a((byte) -1);
        aVar.mo32735b(th2);
        aVar.mo32730a(j);
        ContentValues contentValues = new ContentValues();
        contentValues.put("errMsg", th2);
        contentValues.put("status", (byte) -1);
        contentValues.put("sofar", Long.valueOf(j));
        m29188a(aVar.mo32738d(), contentValues);
    }

    /* renamed from: a */
    public void mo32769a(C8895a aVar, Throwable th) {
        String th2 = th.toString();
        aVar.mo32728a((byte) 5);
        aVar.mo32735b(th2);
        ContentValues contentValues = new ContentValues();
        contentValues.put("errMsg", th2);
        contentValues.put("status", (byte) 5);
        m29188a(aVar.mo32738d(), contentValues);
    }

    /* renamed from: a */
    public void mo32767a(C8895a aVar, long j) {
        aVar.mo32728a((byte) -3);
        aVar.mo32730a(j);
        aVar.mo32734b(j);
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (byte) -3);
        contentValues.put("total", Long.valueOf(j));
        contentValues.put("sofar", Long.valueOf(j));
        m29188a(aVar.mo32738d(), contentValues);
    }

    /* renamed from: a */
    private void m29188a(int i, ContentValues contentValues) {
        this.f25275a.update("filedownloader", contentValues, "_id = ? ", new String[]{String.valueOf(i)});
    }
}
