package com.liulishuo.filedownloader.services;

import android.database.sqlite.SQLiteFullException;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.liulishuo.filedownloader.exception.FileDownloadGiveUpRetryException;
import com.liulishuo.filedownloader.exception.FileDownloadNetworkPolicyException;
import com.liulishuo.filedownloader.exception.FileDownloadOutOfSpaceException;
import com.liulishuo.filedownloader.model.C8895a;
import com.liulishuo.filedownloader.model.FileDownloadHeader;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p112n.p312h.p313a.C10804x;
import p112n.p312h.p313a.p314b0.C10732a;
import p112n.p312h.p313a.p317e0.C10754a;
import p112n.p312h.p313a.p318f0.C10763c;
import p112n.p312h.p313a.p318f0.C10767d;
import p112n.p312h.p313a.p318f0.C10768e;
import p112n.p312h.p313a.p318f0.C10771f;

/* renamed from: com.liulishuo.filedownloader.services.i */
/* compiled from: FileDownloadRunnable */
public class C8907i implements Runnable {

    /* renamed from: A */
    private long f25291A = 0;

    /* renamed from: B */
    private long f25292B = 0;

    /* renamed from: C */
    private long f25293C = 0;

    /* renamed from: D */
    private final Object f25294D = new Object();

    /* renamed from: f */
    private int f25295f = 0;

    /* renamed from: g */
    private final boolean f25296g;

    /* renamed from: h */
    private boolean f25297h;

    /* renamed from: i */
    private boolean f25298i;

    /* renamed from: j */
    private Throwable f25299j;

    /* renamed from: k */
    private int f25300k;

    /* renamed from: l */
    private C8895a f25301l;

    /* renamed from: m */
    private volatile boolean f25302m = false;

    /* renamed from: n */
    private volatile boolean f25303n = false;

    /* renamed from: o */
    private final C8905g f25304o;

    /* renamed from: p */
    private final int f25305p;

    /* renamed from: q */
    private final FileDownloadHeader f25306q;

    /* renamed from: r */
    private volatile boolean f25307r = false;

    /* renamed from: s */
    private final int f25308s;

    /* renamed from: t */
    private long f25309t;

    /* renamed from: u */
    private final C10804x f25310u;

    /* renamed from: v */
    private final boolean f25311v;

    /* renamed from: w */
    private final int f25312w;

    /* renamed from: x */
    private final C10763c.C10766c f25313x;

    /* renamed from: y */
    private final C10763c.C10764a f25314y;

    /* renamed from: z */
    private long f25315z = 0;

    public C8907i(C10804x xVar, C10763c.C10766c cVar, C10763c.C10764a aVar, C8895a aVar2, C8905g gVar, int i, FileDownloadHeader fileDownloadHeader, int i2, int i3, boolean z, boolean z2) {
        this.f25312w = aVar2.mo32738d();
        this.f25311v = z2;
        this.f25303n = true;
        this.f25302m = false;
        this.f25310u = xVar;
        this.f25313x = cVar;
        this.f25304o = gVar;
        this.f25306q = fileDownloadHeader;
        this.f25308s = i2 < 5 ? 5 : i2;
        this.f25295f = i3;
        this.f25296g = z;
        this.f25297h = false;
        this.f25301l = aVar2;
        this.f25305p = i;
        this.f25314y = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01d8, code lost:
        r13.mo36099d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01db, code lost:
        r1 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01ed, code lost:
        r13.mo36099d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01f1, code lost:
        if (r13 == null) goto L_0x01db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01d6, code lost:
        if (r13 != null) goto L_0x01d8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0202 A[Catch:{ all -> 0x0216 }] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x020d A[EDGE_INSN: B:121:0x020d->B:122:? ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x01eb A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b2 A[Catch:{ all -> 0x01f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0117 A[Catch:{ all -> 0x01f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0122 A[Catch:{ all -> 0x01f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0127 A[Catch:{ all -> 0x01f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x015b A[Catch:{ all -> 0x01f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0176 A[Catch:{ all -> 0x01f4 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m29280a(com.liulishuo.filedownloader.model.C8895a r19) {
        /*
            r18 = this;
            r8 = r18
            r9 = r19
            r10 = 0
            r0 = 0
            r1 = r0
            r11 = 0
            r12 = 0
        L_0x0009:
            int r0 = r8.f25312w
            r2 = 1
            boolean r3 = r18.m29289i()     // Catch:{ all -> 0x01f7 }
            r4 = 2
            if (r3 == 0) goto L_0x0035
            boolean r3 = p112n.p312h.p313a.p318f0.C10767d.f28826a     // Catch:{ all -> 0x01f7 }
            if (r3 == 0) goto L_0x002e
            java.lang.String r3 = "already canceled %d %d"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x01f7 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x01f7 }
            r4[r10] = r0     // Catch:{ all -> 0x01f7 }
            byte r0 = r19.mo32742g()     // Catch:{ all -> 0x01f7 }
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)     // Catch:{ all -> 0x01f7 }
            r4[r2] = r0     // Catch:{ all -> 0x01f7 }
            p112n.p312h.p313a.p318f0.C10767d.m36490a(r8, r3, r4)     // Catch:{ all -> 0x01f7 }
        L_0x002e:
            r18.m29293m()     // Catch:{ all -> 0x01f7 }
            if (r1 == 0) goto L_0x0215
            goto L_0x0212
        L_0x0035:
            boolean r3 = p112n.p312h.p313a.p318f0.C10767d.f28826a     // Catch:{ all -> 0x01f7 }
            if (r3 == 0) goto L_0x004e
            java.lang.Class<com.liulishuo.filedownloader.services.i> r3 = com.liulishuo.filedownloader.services.C8907i.class
            java.lang.String r5 = "start download %s %s"
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ all -> 0x01f7 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x01f7 }
            r6[r10] = r7     // Catch:{ all -> 0x01f7 }
            java.lang.String r7 = r19.mo32746k()     // Catch:{ all -> 0x01f7 }
            r6[r2] = r7     // Catch:{ all -> 0x01f7 }
            p112n.p312h.p313a.p318f0.C10767d.m36490a(r3, r5, r6)     // Catch:{ all -> 0x01f7 }
        L_0x004e:
            r18.m29288h()     // Catch:{ all -> 0x01f7 }
            n.h.a.f0.c$a r3 = r8.f25314y     // Catch:{ all -> 0x01f7 }
            java.lang.String r5 = r19.mo32746k()     // Catch:{ all -> 0x01f7 }
            n.h.a.b0.a r13 = r3.mo36102a(r5)     // Catch:{ all -> 0x01f7 }
            r8.m29282a((p112n.p312h.p313a.p314b0.C10732a) r13)     // Catch:{ all -> 0x01f4 }
            java.util.Map r1 = r13.mo36100e()     // Catch:{ all -> 0x01f4 }
            boolean r3 = p112n.p312h.p313a.p318f0.C10767d.f28826a     // Catch:{ all -> 0x01f4 }
            if (r3 == 0) goto L_0x0075
            java.lang.String r3 = "%s request header %s"
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ all -> 0x01f4 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x01f4 }
            r5[r10] = r6     // Catch:{ all -> 0x01f4 }
            r5[r2] = r1     // Catch:{ all -> 0x01f4 }
            p112n.p312h.p313a.p318f0.C10767d.m36490a(r8, r3, r5)     // Catch:{ all -> 0x01f4 }
        L_0x0075:
            r13.execute()     // Catch:{ all -> 0x01f4 }
            int r3 = r13.mo36098c()     // Catch:{ all -> 0x01f4 }
            r5 = 200(0xc8, float:2.8E-43)
            if (r3 == r5) goto L_0x0085
            if (r3 != 0) goto L_0x0083
            goto L_0x0085
        L_0x0083:
            r5 = 0
            goto L_0x0086
        L_0x0085:
            r5 = 1
        L_0x0086:
            r6 = 206(0xce, float:2.89E-43)
            if (r3 == r6) goto L_0x008c
            if (r3 != r2) goto L_0x0092
        L_0x008c:
            boolean r6 = r8.f25297h     // Catch:{ all -> 0x01f4 }
            if (r6 == 0) goto L_0x0092
            r7 = 1
            goto L_0x0093
        L_0x0092:
            r7 = 0
        L_0x0093:
            boolean r6 = r8.f25297h     // Catch:{ all -> 0x01f4 }
            if (r6 == 0) goto L_0x00b0
            if (r7 != 0) goto L_0x00b0
            java.lang.String r6 = "tried to resume from the break point[%d], but the response code is %d, not 206(PARTIAL)."
            java.lang.Object[] r14 = new java.lang.Object[r4]     // Catch:{ all -> 0x01f4 }
            long r15 = r19.mo32741f()     // Catch:{ all -> 0x01f4 }
            java.lang.Long r15 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x01f4 }
            r14[r10] = r15     // Catch:{ all -> 0x01f4 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x01f4 }
            r14[r2] = r15     // Catch:{ all -> 0x01f4 }
            p112n.p312h.p313a.p318f0.C10767d.m36495e(r8, r6, r14)     // Catch:{ all -> 0x01f4 }
        L_0x00b0:
            if (r5 != 0) goto L_0x0101
            if (r7 == 0) goto L_0x00b5
            goto L_0x0101
        L_0x00b5:
            com.liulishuo.filedownloader.exception.FileDownloadHttpException r5 = new com.liulishuo.filedownloader.exception.FileDownloadHttpException     // Catch:{ all -> 0x01f4 }
            java.util.Map r6 = r13.mo36097b()     // Catch:{ all -> 0x01f4 }
            r5.<init>(r3, r1, r6)     // Catch:{ all -> 0x01f4 }
            if (r11 != 0) goto L_0x0100
            r1 = 416(0x1a0, float:5.83E-43)
            if (r3 != r1) goto L_0x00ff
            r18.m29291k()     // Catch:{ all -> 0x00fa }
            java.lang.Class<com.liulishuo.filedownloader.services.i> r1 = com.liulishuo.filedownloader.services.C8907i.class
            java.lang.String r6 = "%d response code %d, range[%d] isn't make sense, so delete the dirty file[%s], and try to redownload it from byte-0."
            r7 = 4
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x00fa }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00fa }
            r7[r10] = r0     // Catch:{ all -> 0x00fa }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x00fa }
            r7[r2] = r0     // Catch:{ all -> 0x00fa }
            long r14 = r19.mo32741f()     // Catch:{ all -> 0x00fa }
            java.lang.Long r0 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x00fa }
            r7[r4] = r0     // Catch:{ all -> 0x00fa }
            r0 = 3
            java.lang.String r3 = r19.mo32744i()     // Catch:{ all -> 0x00fa }
            r7[r0] = r3     // Catch:{ all -> 0x00fa }
            p112n.p312h.p313a.p318f0.C10767d.m36495e(r1, r6, r7)     // Catch:{ all -> 0x00fa }
            int r1 = r12 + 1
            r8.m29281a((java.lang.Throwable) r5, (int) r12)     // Catch:{ all -> 0x00f7 }
            r12 = r1
            r11 = 1
            goto L_0x01f1
        L_0x00f7:
            r0 = move-exception
            r12 = r1
            goto L_0x00fb
        L_0x00fa:
            r0 = move-exception
        L_0x00fb:
            r1 = r13
            r11 = 1
            goto L_0x01f8
        L_0x00ff:
            throw r5     // Catch:{ all -> 0x00fa }
        L_0x0100:
            throw r5     // Catch:{ all -> 0x01f4 }
        L_0x0101:
            long r3 = r19.mo32745j()     // Catch:{ all -> 0x01f4 }
            java.lang.String r1 = "Transfer-Encoding"
            java.lang.String r1 = r13.mo36094a(r1)     // Catch:{ all -> 0x01f4 }
            r14 = -1
            r16 = 0
            if (r5 != 0) goto L_0x0115
            int r5 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r5 > 0) goto L_0x0123
        L_0x0115:
            if (r1 != 0) goto L_0x0122
            java.lang.String r3 = "Content-Length"
            java.lang.String r3 = r13.mo36094a(r3)     // Catch:{ all -> 0x01f4 }
            long r3 = p112n.p312h.p313a.p318f0.C10771f.m36510b((java.lang.String) r3)     // Catch:{ all -> 0x01f4 }
            goto L_0x0123
        L_0x0122:
            r3 = r14
        L_0x0123:
            int r5 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r5 >= 0) goto L_0x0158
            if (r1 == 0) goto L_0x0133
            java.lang.String r5 = "chunked"
            boolean r1 = r1.equals(r5)     // Catch:{ all -> 0x01f4 }
            if (r1 == 0) goto L_0x0133
            r1 = 1
            goto L_0x0134
        L_0x0133:
            r1 = 0
        L_0x0134:
            if (r1 != 0) goto L_0x0158
            n.h.a.f0.e r1 = p112n.p312h.p313a.p318f0.C10768e.m36497a()     // Catch:{ all -> 0x01f4 }
            boolean r1 = r1.f28829c     // Catch:{ all -> 0x01f4 }
            if (r1 == 0) goto L_0x0150
            boolean r1 = p112n.p312h.p313a.p318f0.C10767d.f28826a     // Catch:{ all -> 0x01f4 }
            if (r1 == 0) goto L_0x0159
            java.lang.String r1 = "%d response header is not legal but HTTP lenient is true, so handle as the case of transfer encoding chunk"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x01f4 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x01f4 }
            r2[r10] = r3     // Catch:{ all -> 0x01f4 }
            p112n.p312h.p313a.p318f0.C10767d.m36490a(r8, r1, r2)     // Catch:{ all -> 0x01f4 }
            goto L_0x0159
        L_0x0150:
            com.liulishuo.filedownloader.exception.FileDownloadGiveUpRetryException r0 = new com.liulishuo.filedownloader.exception.FileDownloadGiveUpRetryException     // Catch:{ all -> 0x01f4 }
            java.lang.String r1 = "can't know the size of the download file, and its Transfer-Encoding is not Chunked either.\nyou can ignore such exception by add http.lenient=true to the filedownloader.properties"
            r0.<init>(r1)     // Catch:{ all -> 0x01f4 }
            throw r0     // Catch:{ all -> 0x01f4 }
        L_0x0158:
            r14 = r3
        L_0x0159:
            if (r7 == 0) goto L_0x0161
            long r1 = r19.mo32741f()     // Catch:{ all -> 0x01f4 }
            r16 = r1
        L_0x0161:
            java.lang.String r5 = r8.m29285b((p112n.p312h.p313a.p314b0.C10732a) r13)     // Catch:{ all -> 0x01f4 }
            java.lang.String r6 = r8.m29287c(r13)     // Catch:{ all -> 0x01f4 }
            r1 = r18
            r2 = r7
            r3 = r14
            r1.m29283a((boolean) r2, (long) r3, (java.lang.String) r5, (java.lang.String) r6)     // Catch:{ all -> 0x01f4 }
            boolean r1 = r19.mo32748m()     // Catch:{ all -> 0x01f4 }
            if (r1 == 0) goto L_0x01de
            java.lang.String r1 = r19.mo32746k()     // Catch:{ all -> 0x01f4 }
            java.lang.String r2 = r19.mo32743h()     // Catch:{ all -> 0x01f4 }
            int r1 = p112n.p312h.p313a.p318f0.C10771f.m36509b(r1, r2)     // Catch:{ all -> 0x01f4 }
            java.lang.String r2 = r19.mo32743h()     // Catch:{ all -> 0x01f4 }
            boolean r3 = r8.f25296g     // Catch:{ all -> 0x01f4 }
            boolean r2 = p112n.p312h.p313a.p318f0.C10763c.m36482a((int) r0, (java.lang.String) r2, (boolean) r3, (boolean) r10)     // Catch:{ all -> 0x01f4 }
            if (r2 == 0) goto L_0x0196
            com.liulishuo.filedownloader.services.g r1 = r8.f25304o     // Catch:{ all -> 0x01f4 }
            r1.remove(r0)     // Catch:{ all -> 0x01f4 }
            if (r13 == 0) goto L_0x0215
        L_0x0195:
            goto L_0x01ed
        L_0x0196:
            com.liulishuo.filedownloader.services.g r2 = r8.f25304o     // Catch:{ all -> 0x01f4 }
            com.liulishuo.filedownloader.model.a r2 = r2.mo32765a((int) r1)     // Catch:{ all -> 0x01f4 }
            if (r2 == 0) goto L_0x01de
            n.h.a.x r3 = r8.f25310u     // Catch:{ all -> 0x01f4 }
            boolean r3 = p112n.p312h.p313a.p318f0.C10763c.m36481a((int) r0, (com.liulishuo.filedownloader.model.C8895a) r2, (p112n.p312h.p313a.C10804x) r3, (boolean) r10)     // Catch:{ all -> 0x01f4 }
            if (r3 == 0) goto L_0x01ae
            com.liulishuo.filedownloader.services.g r1 = r8.f25304o     // Catch:{ all -> 0x01f4 }
            r1.remove(r0)     // Catch:{ all -> 0x01f4 }
            if (r13 == 0) goto L_0x0215
            goto L_0x0195
        L_0x01ae:
            com.liulishuo.filedownloader.services.g r0 = r8.f25304o     // Catch:{ all -> 0x01f4 }
            r0.remove(r1)     // Catch:{ all -> 0x01f4 }
            r18.m29290j()     // Catch:{ all -> 0x01f4 }
            boolean r0 = com.liulishuo.filedownloader.services.C8906h.m29257a((int) r1, (com.liulishuo.filedownloader.model.C8895a) r2)     // Catch:{ all -> 0x01f4 }
            if (r0 == 0) goto L_0x01de
            long r0 = r2.mo32741f()     // Catch:{ all -> 0x01f4 }
            r9.mo32730a((long) r0)     // Catch:{ all -> 0x01f4 }
            long r0 = r2.mo32745j()     // Catch:{ all -> 0x01f4 }
            r9.mo32734b((long) r0)     // Catch:{ all -> 0x01f4 }
            java.lang.String r0 = r2.mo32727a()     // Catch:{ all -> 0x01f4 }
            r9.mo32731a((java.lang.String) r0)     // Catch:{ all -> 0x01f4 }
            com.liulishuo.filedownloader.services.g r0 = r8.f25304o     // Catch:{ all -> 0x01f4 }
            r0.mo32766a((com.liulishuo.filedownloader.model.C8895a) r9)     // Catch:{ all -> 0x01f4 }
            if (r13 == 0) goto L_0x01db
        L_0x01d8:
            r13.mo36099d()
        L_0x01db:
            r1 = r13
            goto L_0x0009
        L_0x01de:
            r1 = r18
            r2 = r13
            r3 = r7
            r4 = r16
            r6 = r14
            boolean r0 = r1.m29284a((p112n.p312h.p313a.p314b0.C10732a) r2, (boolean) r3, (long) r4, (long) r6)     // Catch:{ all -> 0x01f4 }
            if (r0 == 0) goto L_0x01f1
            if (r13 == 0) goto L_0x0215
        L_0x01ed:
            r13.mo36099d()
            goto L_0x0215
        L_0x01f1:
            if (r13 == 0) goto L_0x01db
            goto L_0x01d8
        L_0x01f4:
            r0 = move-exception
            r1 = r13
            goto L_0x01f8
        L_0x01f7:
            r0 = move-exception
        L_0x01f8:
            int r2 = r8.f25305p     // Catch:{ all -> 0x0216 }
            int r3 = r12 + 1
            if (r2 <= r12) goto L_0x020d
            boolean r2 = r0 instanceof com.liulishuo.filedownloader.exception.FileDownloadGiveUpRetryException     // Catch:{ all -> 0x0216 }
            if (r2 != 0) goto L_0x020d
            r8.m29281a((java.lang.Throwable) r0, (int) r3)     // Catch:{ all -> 0x0216 }
            if (r1 == 0) goto L_0x020a
            r1.mo36099d()
        L_0x020a:
            r12 = r3
            goto L_0x0009
        L_0x020d:
            r8.m29286b((java.lang.Throwable) r0)     // Catch:{ all -> 0x0216 }
            if (r1 == 0) goto L_0x0215
        L_0x0212:
            r1.mo36099d()
        L_0x0215:
            return
        L_0x0216:
            r0 = move-exception
            if (r1 == 0) goto L_0x021c
            r1.mo36099d()
        L_0x021c:
            goto L_0x021e
        L_0x021d:
            throw r0
        L_0x021e:
            goto L_0x021d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.liulishuo.filedownloader.services.C8907i.m29280a(com.liulishuo.filedownloader.model.a):void");
    }

    /* renamed from: h */
    private void m29288h() {
        boolean a = this.f25313x.mo36500a();
        if (C8906h.m29258a(this.f25312w, this.f25301l, Boolean.valueOf(a))) {
            this.f25297h = true;
            if (!a) {
                this.f25301l.mo32730a(new File(this.f25301l.mo32744i()).length());
                return;
            }
            return;
        }
        this.f25297h = false;
        m29291k();
    }

    /* renamed from: i */
    private boolean m29289i() {
        if (this.f25307r) {
            return true;
        }
        if (!this.f25311v || C10771f.m36516d()) {
            return false;
        }
        throw new FileDownloadNetworkPolicyException();
    }

    /* renamed from: j */
    private void m29290j() {
        String h = this.f25301l.mo32743h();
        if (h != null) {
            File file = new File(h);
            if (file.exists()) {
                file.delete();
            }
        }
    }

    /* renamed from: k */
    private void m29291k() {
        m29292l();
        m29290j();
    }

    /* renamed from: l */
    private void m29292l() {
        String i = this.f25301l.mo32744i();
        if (i != null) {
            File file = new File(i);
            if (file.exists()) {
                file.delete();
            }
        }
    }

    /* renamed from: m */
    private void m29293m() {
        this.f25302m = false;
        if (C10767d.f28826a) {
            C10767d.m36490a(this, "On paused %d %d %d", Integer.valueOf(this.f25312w), Long.valueOf(this.f25301l.mo32741f()), Long.valueOf(this.f25301l.mo32745j()));
        }
        C8905g gVar = this.f25304o;
        C8895a aVar = this.f25301l;
        gVar.mo32774c(aVar, aVar.mo32741f());
        m29276a(this.f25301l.mo32742g());
    }

    /* renamed from: n */
    private void m29294n() {
        this.f25301l.mo32728a((byte) 6);
        m29276a(this.f25301l.mo32742g());
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: o */
    private void m29295o() {
        String i = this.f25301l.mo32744i();
        String h = this.f25301l.mo32743h();
        File file = new File(i);
        try {
            File file2 = new File(h);
            if (file2.exists()) {
                long length = file2.length();
                if (file2.delete()) {
                    C10767d.m36495e(this, "The target file([%s], [%d]) will be replaced with the new downloaded file[%d]", h, Long.valueOf(length), Long.valueOf(file.length()));
                } else {
                    throw new IllegalStateException(C10771f.m36504a("Can't delete the old file([%s], [%d]), so can't replace it with the new downloaded one.", h, Long.valueOf(length)));
                }
            }
            if (!file.renameTo(file2)) {
                throw new IllegalStateException(C10771f.m36504a("Can't rename the  temp downloaded file(%s) to the target file(%s)", i, h));
            } else if (file.exists() && !file.delete()) {
                C10767d.m36495e(this, "delete the temp file(%s) failed, on completed downloading.", i);
            }
        } catch (Throwable th) {
            if (file.exists() && !file.delete()) {
                C10767d.m36495e(this, "delete the temp file(%s) failed, on completed downloading.", i);
            }
            throw th;
        }
    }

    /* renamed from: b */
    public int mo32818b() {
        return this.f25312w;
    }

    /* renamed from: c */
    public int mo32819c() {
        return this.f25300k;
    }

    /* renamed from: d */
    public Throwable mo32820d() {
        return this.f25299j;
    }

    /* renamed from: e */
    public boolean mo32821e() {
        return this.f25303n || this.f25302m;
    }

    /* renamed from: f */
    public boolean mo32822f() {
        return this.f25298i;
    }

    /* renamed from: g */
    public void mo32823g() {
        if (C10767d.f28826a) {
            C10767d.m36490a(this, "On resume %d", Integer.valueOf(this.f25312w));
        }
        this.f25303n = true;
        this.f25304o.mo32771b(this.f25301l);
        m29276a(this.f25301l.mo32742g());
    }

    public void run() {
        Process.setThreadPriority(10);
        this.f25303n = false;
        this.f25302m = true;
        if (this.f25301l == null) {
            C10767d.m36492b(this, "start runnable but model == null?? %s", Integer.valueOf(this.f25312w));
            C8895a a = this.f25304o.mo32765a(this.f25312w);
            this.f25301l = a;
            if (a == null) {
                C10767d.m36492b(this, "start runnable but downloadMode == null?? %s", Integer.valueOf(this.f25312w));
                this.f25302m = false;
                return;
            }
        }
        try {
            if (this.f25301l.mo32742g() != 1) {
                if (this.f25301l.mo32742g() != -2) {
                    m29286b((Throwable) new RuntimeException(C10771f.m36504a("Task[%d] can't start the download runnable, because its status is %d not %d", Integer.valueOf(this.f25312w), Byte.valueOf(this.f25301l.mo32742g()), (byte) 1)));
                } else if (C10767d.f28826a) {
                    C10767d.m36490a(this, "High concurrent cause, start runnable but already paused %d", Integer.valueOf(this.f25312w));
                }
            } else if (!this.f25311v || C10771f.m36507a("android.permission.ACCESS_NETWORK_STATE")) {
                m29294n();
                m29280a(this.f25301l);
                this.f25302m = false;
            } else {
                m29286b((Throwable) new FileDownloadGiveUpRetryException(C10771f.m36504a("Task[%d] can't start the download runnable, because this task require wifi, but user application nor current process has %s, so we can't check whether the network type connection.", Integer.valueOf(this.f25312w), "android.permission.ACCESS_NETWORK_STATE")));
                this.f25302m = false;
            }
        } finally {
            this.f25302m = false;
        }
    }

    /* renamed from: b */
    private String m29285b(C10732a aVar) {
        if (aVar != null) {
            String a = aVar.mo36094a("Etag");
            if (C10767d.f28826a) {
                C10767d.m36490a(this, "etag find by header %d %s", Integer.valueOf(this.f25312w), a);
            }
            return a;
        }
        throw new RuntimeException("connection is null when findEtag");
    }

    /* renamed from: c */
    private String m29287c(C10732a aVar) {
        if (!this.f25301l.mo32748m() || this.f25301l.mo32736c() != null) {
            return null;
        }
        String k = C10771f.m36523k(aVar.mo36094a("Content-Disposition"));
        return TextUtils.isEmpty(k) ? C10771f.m36513c(this.f25301l.mo32746k()) : k;
    }

    /* renamed from: b */
    private void m29286b(Throwable th) {
        SQLiteFullException sQLiteFullException;
        if (C10767d.f28826a) {
            C10767d.m36490a(this, "On error %d %s", Integer.valueOf(this.f25312w), th);
        }
        Throwable a = m29274a(th);
        if (a instanceof SQLiteFullException) {
            m29279a((SQLiteFullException) a);
            sQLiteFullException = a;
        } else {
            try {
                this.f25304o.mo32770a(this.f25301l, a, this.f25301l.mo32741f());
                sQLiteFullException = th;
            } catch (SQLiteFullException e) {
                m29279a(e);
                sQLiteFullException = e;
            }
        }
        this.f25299j = sQLiteFullException;
        m29276a(this.f25301l.mo32742g());
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a1 A[SYNTHETIC, Splitter:B:50:0x00a1] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ae  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m29284a(p112n.p312h.p313a.p314b0.C10732a r9, boolean r10, long r11, long r13) throws java.lang.Throwable {
        /*
            r8 = this;
            n.h.a.e0.a r10 = r8.m29275a((boolean) r10, (long) r13)
            java.io.InputStream r9 = r9.mo36093a()     // Catch:{ all -> 0x0098 }
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r6 = new byte[r0]     // Catch:{ all -> 0x0096 }
            int r0 = r8.f25295f     // Catch:{ all -> 0x0096 }
            long r0 = (long) r0     // Catch:{ all -> 0x0096 }
            long r0 = r8.m29273a((long) r13, (long) r0)     // Catch:{ all -> 0x0096 }
            r8.f25309t = r0     // Catch:{ all -> 0x0096 }
        L_0x0015:
            int r0 = r9.read(r6)     // Catch:{ all -> 0x0096 }
            r1 = -1
            r2 = 0
            r7 = 1
            if (r0 != r1) goto L_0x0069
            r0 = -1
            int r3 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r3 != 0) goto L_0x0025
            r13 = r11
        L_0x0025:
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r0 != 0) goto L_0x004e
            r8.m29295o()     // Catch:{ all -> 0x0096 }
            com.liulishuo.filedownloader.services.g r11 = r8.f25304o     // Catch:{ all -> 0x0096 }
            int r12 = r8.f25312w     // Catch:{ all -> 0x0096 }
            r11.remove(r12)     // Catch:{ all -> 0x0096 }
            r8.m29277a((long) r13)     // Catch:{ all -> 0x0096 }
            if (r9 == 0) goto L_0x003b
            r9.close()
        L_0x003b:
            if (r10 == 0) goto L_0x0048
            r10.mo36494a()     // Catch:{ all -> 0x0041 }
            goto L_0x0048
        L_0x0041:
            r9 = move-exception
            if (r10 == 0) goto L_0x0047
            r10.close()
        L_0x0047:
            throw r9
        L_0x0048:
            if (r10 == 0) goto L_0x004d
            r10.close()
        L_0x004d:
            return r7
        L_0x004e:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x0096 }
            java.lang.String r1 = "sofar[%d] not equal total[%d]"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0096 }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0096 }
            r3[r2] = r11     // Catch:{ all -> 0x0096 }
            java.lang.Long r11 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x0096 }
            r3[r7] = r11     // Catch:{ all -> 0x0096 }
            java.lang.String r11 = p112n.p312h.p313a.p318f0.C10771f.m36504a((java.lang.String) r1, (java.lang.Object[]) r3)     // Catch:{ all -> 0x0096 }
            r0.<init>(r11)     // Catch:{ all -> 0x0096 }
            throw r0     // Catch:{ all -> 0x0096 }
        L_0x0069:
            r10.write(r6, r2, r0)     // Catch:{ all -> 0x0096 }
            long r0 = (long) r0     // Catch:{ all -> 0x0096 }
            long r11 = r11 + r0
            r0 = r8
            r1 = r11
            r3 = r13
            r5 = r10
            r0.m29278a(r1, r3, r5)     // Catch:{ all -> 0x0096 }
            boolean r0 = r8.m29289i()     // Catch:{ all -> 0x0096 }
            if (r0 == 0) goto L_0x0015
            r8.m29293m()     // Catch:{ all -> 0x0096 }
            if (r9 == 0) goto L_0x0083
            r9.close()
        L_0x0083:
            if (r10 == 0) goto L_0x0090
            r10.mo36494a()     // Catch:{ all -> 0x0089 }
            goto L_0x0090
        L_0x0089:
            r9 = move-exception
            if (r10 == 0) goto L_0x008f
            r10.close()
        L_0x008f:
            throw r9
        L_0x0090:
            if (r10 == 0) goto L_0x0095
            r10.close()
        L_0x0095:
            return r7
        L_0x0096:
            r11 = move-exception
            goto L_0x009a
        L_0x0098:
            r11 = move-exception
            r9 = 0
        L_0x009a:
            if (r9 == 0) goto L_0x009f
            r9.close()
        L_0x009f:
            if (r10 == 0) goto L_0x00ac
            r10.mo36494a()     // Catch:{ all -> 0x00a5 }
            goto L_0x00ac
        L_0x00a5:
            r9 = move-exception
            if (r10 == 0) goto L_0x00ab
            r10.close()
        L_0x00ab:
            throw r9
        L_0x00ac:
            if (r10 == 0) goto L_0x00b1
            r10.close()
        L_0x00b1:
            goto L_0x00b3
        L_0x00b2:
            throw r11
        L_0x00b3:
            goto L_0x00b2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.liulishuo.filedownloader.services.C8907i.m29284a(n.h.a.b0.a, boolean, long, long):boolean");
    }

    /* renamed from: a */
    private long m29273a(long j, long j2) {
        if (j2 <= 0) {
            return -1;
        }
        if (j == -1) {
            return 1;
        }
        long j3 = j / (j2 + 1);
        if (j3 <= 0) {
            return 1;
        }
        return j3;
    }

    /* renamed from: a */
    private void m29282a(C10732a aVar) {
        HashMap<String, List<String>> a;
        FileDownloadHeader fileDownloadHeader = this.f25306q;
        if (!(fileDownloadHeader == null || (a = fileDownloadHeader.mo32720a()) == null)) {
            if (C10767d.f28826a) {
                C10767d.m36494d(this, "%d add outside header: %s", Integer.valueOf(this.f25312w), a);
            }
            for (Map.Entry next : a.entrySet()) {
                String str = (String) next.getKey();
                List<String> list = (List) next.getValue();
                if (list != null) {
                    for (String a2 : list) {
                        aVar.mo36095a(str, a2);
                    }
                }
            }
        }
        String a3 = this.f25301l.mo32727a();
        long f = this.f25301l.mo32741f();
        if (this.f25297h && !aVar.mo36096a(a3, f)) {
            if (!TextUtils.isEmpty(a3)) {
                aVar.mo36095a("If-Match", a3);
            }
            aVar.mo36095a("Range", C10771f.m36504a("bytes=%d-", Long.valueOf(f)));
        }
    }

    /* renamed from: a */
    public void mo32817a() {
        this.f25307r = true;
        m29293m();
    }

    /* renamed from: a */
    private void m29283a(boolean z, long j, String str, String str2) {
        this.f25304o.mo32768a(this.f25301l, j, str, str2);
        this.f25298i = z;
        m29276a(this.f25301l.mo32742g());
    }

    /* renamed from: a */
    private void m29278a(long j, long j2, C10754a aVar) {
        long j3 = j;
        if (j3 != j2) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j4 = elapsedRealtime - this.f25293C;
            if (j3 - this.f25292B <= ((long) C10771f.m36508b()) || j4 <= C10771f.m36512c()) {
                if (this.f25301l.mo32742g() != 3) {
                    this.f25301l.mo32728a((byte) 3);
                }
                this.f25301l.mo32730a(j3);
            } else {
                try {
                    aVar.mo36494a();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                this.f25304o.mo32772b(this.f25301l, j3);
                this.f25292B = j3;
                this.f25293C = elapsedRealtime;
            }
            long j5 = j3 - this.f25315z;
            long j6 = elapsedRealtime - this.f25291A;
            long j7 = this.f25309t;
            if (j7 != -1 && j5 >= j7 && j6 >= ((long) this.f25308s)) {
                this.f25291A = elapsedRealtime;
                this.f25315z = j3;
                if (C10767d.f28826a) {
                    C10767d.m36490a(this, "On progress %d %d %d", Integer.valueOf(this.f25312w), Long.valueOf(j), Long.valueOf(j2));
                }
                m29276a(this.f25301l.mo32742g());
            }
        }
    }

    /* renamed from: a */
    private void m29281a(Throwable th, int i) {
        if (C10767d.f28826a) {
            C10767d.m36490a(this, "On retry %d %s %d %d", Integer.valueOf(this.f25312w), th, Integer.valueOf(i), Integer.valueOf(this.f25305p));
        }
        Throwable a = m29274a(th);
        this.f25304o.mo32769a(this.f25301l, a);
        this.f25299j = a;
        this.f25300k = i;
        m29276a(this.f25301l.mo32742g());
    }

    /* renamed from: a */
    private void m29279a(SQLiteFullException sQLiteFullException) {
        if (C10767d.f28826a) {
            C10767d.m36490a(this, "the data of the task[%d] is dirty, because the SQLite full exception[%s], so remove it from the database directly.", Integer.valueOf(this.f25312w), sQLiteFullException.toString());
        }
        this.f25301l.mo32735b(sQLiteFullException.toString());
        this.f25301l.mo32728a((byte) -1);
        this.f25304o.remove(this.f25312w);
    }

    /* renamed from: a */
    private void m29277a(long j) {
        if (C10767d.f28826a) {
            C10767d.m36490a(this, "On completed %d %d %B", Integer.valueOf(this.f25312w), Long.valueOf(j), Boolean.valueOf(this.f25307r));
        }
        this.f25304o.mo32767a(this.f25301l, j);
        m29276a(this.f25301l.mo32742g());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m29276a(byte r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f25294D
            monitor-enter(r0)
            com.liulishuo.filedownloader.model.a r1 = r4.f25301l     // Catch:{ all -> 0x0032 }
            byte r1 = r1.mo32742g()     // Catch:{ all -> 0x0032 }
            r2 = -2
            if (r1 != r2) goto L_0x0023
            boolean r5 = p112n.p312h.p313a.p318f0.C10767d.f28826a     // Catch:{ all -> 0x0032 }
            if (r5 == 0) goto L_0x0021
            java.lang.String r5 = "High concurrent cause, Already paused and we don't need to call-back to Task in here, %d"
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0032 }
            r2 = 0
            int r3 = r4.f25312w     // Catch:{ all -> 0x0032 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0032 }
            r1[r2] = r3     // Catch:{ all -> 0x0032 }
            p112n.p312h.p313a.p318f0.C10767d.m36490a(r4, r5, r1)     // Catch:{ all -> 0x0032 }
        L_0x0021:
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return
        L_0x0023:
            com.liulishuo.filedownloader.message.b r1 = com.liulishuo.filedownloader.message.C8887b.m29133a()     // Catch:{ all -> 0x0032 }
            com.liulishuo.filedownloader.model.a r2 = r4.f25301l     // Catch:{ all -> 0x0032 }
            com.liulishuo.filedownloader.message.MessageSnapshot r5 = com.liulishuo.filedownloader.message.C8890c.m29138a((byte) r5, (com.liulishuo.filedownloader.model.C8895a) r2, (com.liulishuo.filedownloader.services.C8907i) r4)     // Catch:{ all -> 0x0032 }
            r1.mo32713a((com.liulishuo.filedownloader.message.MessageSnapshot) r5)     // Catch:{ all -> 0x0032 }
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            return
        L_0x0032:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0032 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.liulishuo.filedownloader.services.C8907i.m29276a(byte):void");
    }

    /* renamed from: a */
    private C10754a m29275a(boolean z, long j) throws IOException, IllegalAccessException {
        long j2 = j;
        String i = this.f25301l.mo32744i();
        if (TextUtils.isEmpty(i)) {
            throw new RuntimeException("found invalid internal destination path, empty");
        } else if (C10771f.m36521i(i)) {
            File file = new File(i);
            if (file.exists() && file.isDirectory()) {
                throw new RuntimeException(C10771f.m36504a("found invalid internal destination path[%s], & path is directory[%B]", i, Boolean.valueOf(file.isDirectory())));
            } else if (file.exists() || file.createNewFile()) {
                C10754a a = this.f25313x.mo36499a(file);
                if (j2 > 0) {
                    long length = file.length();
                    long j3 = j2 - length;
                    long e = C10771f.m36517e(i);
                    if (e < j3) {
                        a.close();
                        throw new FileDownloadOutOfSpaceException(e, j3, length);
                    } else if (!C10768e.m36497a().f28832f) {
                        a.mo36495a(j2);
                    }
                }
                if (z && this.f25313x.mo36500a()) {
                    a.mo36496b(this.f25301l.mo32741f());
                }
                return a;
            } else {
                throw new IOException(C10771f.m36504a("create new file error  %s", file.getAbsolutePath()));
            }
        } else {
            throw new RuntimeException(C10771f.m36504a("found invalid internal destination filename %s", i));
        }
    }

    /* renamed from: a */
    private Throwable m29274a(Throwable th) {
        long j;
        String i = this.f25301l.mo32744i();
        if ((this.f25301l.mo32745j() != -1 && !C10768e.m36497a().f28832f) || !(th instanceof IOException) || !new File(i).exists()) {
            return th;
        }
        long e = C10771f.m36517e(i);
        if (e > 4096) {
            return th;
        }
        File file = new File(i);
        if (!file.exists()) {
            C10767d.m36491a((Object) C8907i.class, th, "Exception with: free space isn't enough, and the target file not exist.", new Object[0]);
            j = 0;
        } else {
            j = file.length();
        }
        if (Build.VERSION.SDK_INT >= 9) {
            return new FileDownloadOutOfSpaceException(e, 4096, j, th);
        }
        return new FileDownloadOutOfSpaceException(e, 4096, j);
    }
}
