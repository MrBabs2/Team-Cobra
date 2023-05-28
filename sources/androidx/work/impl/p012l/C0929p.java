package androidx.work.impl.p012l;

import androidx.work.C0821a;
import androidx.work.C0961j;
import androidx.work.C0974p;

/* renamed from: androidx.work.impl.l.p */
/* compiled from: WorkTypeConverters */
public class C0929p {

    /* renamed from: androidx.work.impl.l.p$a */
    /* compiled from: WorkTypeConverters */
    static /* synthetic */ class C0930a {

        /* renamed from: a */
        static final /* synthetic */ int[] f3235a;

        /* renamed from: b */
        static final /* synthetic */ int[] f3236b;

        /* renamed from: c */
        static final /* synthetic */ int[] f3237c;

        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|27|28|29|30|31|32|33|34|35|36|(3:37|38|40)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|(2:5|6)|7|9|10|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|27|28|29|30|31|32|33|34|35|36|(3:37|38|40)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|(2:17|18)|19|21|22|23|24|25|27|28|29|30|31|32|33|34|35|36|(3:37|38|40)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|24|25|27|28|29|30|31|32|33|34|35|36|(3:37|38|40)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x006a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0074 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x007e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0088 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0092 */
        static {
            /*
                androidx.work.j[] r0 = androidx.work.C0961j.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3237c = r0
                r1 = 1
                androidx.work.j r2 = androidx.work.C0961j.NOT_REQUIRED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f3237c     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.work.j r3 = androidx.work.C0961j.CONNECTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f3237c     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.work.j r4 = androidx.work.C0961j.UNMETERED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f3237c     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.work.j r5 = androidx.work.C0961j.NOT_ROAMING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f3237c     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.work.j r6 = androidx.work.C0961j.METERED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                androidx.work.a[] r5 = androidx.work.C0821a.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                f3236b = r5
                androidx.work.a r6 = androidx.work.C0821a.EXPONENTIAL     // Catch:{ NoSuchFieldError -> 0x004f }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x004f }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x004f }
            L_0x004f:
                int[] r5 = f3236b     // Catch:{ NoSuchFieldError -> 0x0059 }
                androidx.work.a r6 = androidx.work.C0821a.LINEAR     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r5[r6] = r0     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                androidx.work.p[] r5 = androidx.work.C0974p.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                f3235a = r5
                androidx.work.p r6 = androidx.work.C0974p.ENQUEUED     // Catch:{ NoSuchFieldError -> 0x006a }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x006a }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x006a }
            L_0x006a:
                int[] r1 = f3235a     // Catch:{ NoSuchFieldError -> 0x0074 }
                androidx.work.p r5 = androidx.work.C0974p.RUNNING     // Catch:{ NoSuchFieldError -> 0x0074 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0074 }
                r1[r5] = r0     // Catch:{ NoSuchFieldError -> 0x0074 }
            L_0x0074:
                int[] r0 = f3235a     // Catch:{ NoSuchFieldError -> 0x007e }
                androidx.work.p r1 = androidx.work.C0974p.SUCCEEDED     // Catch:{ NoSuchFieldError -> 0x007e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007e }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007e }
            L_0x007e:
                int[] r0 = f3235a     // Catch:{ NoSuchFieldError -> 0x0088 }
                androidx.work.p r1 = androidx.work.C0974p.FAILED     // Catch:{ NoSuchFieldError -> 0x0088 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0088 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0088 }
            L_0x0088:
                int[] r0 = f3235a     // Catch:{ NoSuchFieldError -> 0x0092 }
                androidx.work.p r1 = androidx.work.C0974p.BLOCKED     // Catch:{ NoSuchFieldError -> 0x0092 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0092 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0092 }
            L_0x0092:
                int[] r0 = f3235a     // Catch:{ NoSuchFieldError -> 0x009d }
                androidx.work.p r1 = androidx.work.C0974p.CANCELLED     // Catch:{ NoSuchFieldError -> 0x009d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009d }
            L_0x009d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.p012l.C0929p.C0930a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static int m4040a(C0974p pVar) {
        switch (C0930a.f3235a[pVar.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new IllegalArgumentException("Could not convert " + pVar + " to int");
        }
    }

    /* renamed from: b */
    public static C0961j m4044b(int i) {
        if (i == 0) {
            return C0961j.NOT_REQUIRED;
        }
        if (i == 1) {
            return C0961j.CONNECTED;
        }
        if (i == 2) {
            return C0961j.UNMETERED;
        }
        if (i == 3) {
            return C0961j.NOT_ROAMING;
        }
        if (i == 4) {
            return C0961j.METERED;
        }
        throw new IllegalArgumentException("Could not convert " + i + " to NetworkType");
    }

    /* renamed from: c */
    public static C0974p m4045c(int i) {
        if (i == 0) {
            return C0974p.ENQUEUED;
        }
        if (i == 1) {
            return C0974p.RUNNING;
        }
        if (i == 2) {
            return C0974p.SUCCEEDED;
        }
        if (i == 3) {
            return C0974p.FAILED;
        }
        if (i == 4) {
            return C0974p.BLOCKED;
        }
        if (i == 5) {
            return C0974p.CANCELLED;
        }
        throw new IllegalArgumentException("Could not convert " + i + " to State");
    }

    /* renamed from: a */
    public static int m4038a(C0821a aVar) {
        int i = C0930a.f3236b[aVar.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        throw new IllegalArgumentException("Could not convert " + aVar + " to int");
    }

    /* renamed from: a */
    public static C0821a m4041a(int i) {
        if (i == 0) {
            return C0821a.EXPONENTIAL;
        }
        if (i == 1) {
            return C0821a.LINEAR;
        }
        throw new IllegalArgumentException("Could not convert " + i + " to BackoffPolicy");
    }

    /* renamed from: a */
    public static int m4039a(C0961j jVar) {
        int i = C0930a.f3237c[jVar.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 3;
        }
        if (i == 5) {
            return 4;
        }
        throw new IllegalArgumentException("Could not convert " + jVar + " to int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x005a A[SYNTHETIC, Splitter:B:26:0x005a] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0071 A[SYNTHETIC, Splitter:B:37:0x0071] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:30:0x0062=Splitter:B:30:0x0062, B:15:0x0048=Splitter:B:15:0x0048} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m4043a(androidx.work.C0827d r4) {
        /*
            int r0 = r4.mo4707b()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x0054 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0054 }
            int r1 = r4.mo4707b()     // Catch:{ IOException -> 0x004f, all -> 0x004c }
            r2.writeInt(r1)     // Catch:{ IOException -> 0x004f, all -> 0x004c }
            java.util.Set r4 = r4.mo4705a()     // Catch:{ IOException -> 0x004f, all -> 0x004c }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ IOException -> 0x004f, all -> 0x004c }
        L_0x0021:
            boolean r1 = r4.hasNext()     // Catch:{ IOException -> 0x004f, all -> 0x004c }
            if (r1 == 0) goto L_0x0040
            java.lang.Object r1 = r4.next()     // Catch:{ IOException -> 0x004f, all -> 0x004c }
            androidx.work.d$a r1 = (androidx.work.C0827d.C0828a) r1     // Catch:{ IOException -> 0x004f, all -> 0x004c }
            android.net.Uri r3 = r1.mo4710a()     // Catch:{ IOException -> 0x004f, all -> 0x004c }
            java.lang.String r3 = r3.toString()     // Catch:{ IOException -> 0x004f, all -> 0x004c }
            r2.writeUTF(r3)     // Catch:{ IOException -> 0x004f, all -> 0x004c }
            boolean r1 = r1.mo4711b()     // Catch:{ IOException -> 0x004f, all -> 0x004c }
            r2.writeBoolean(r1)     // Catch:{ IOException -> 0x004f, all -> 0x004c }
            goto L_0x0021
        L_0x0040:
            r2.close()     // Catch:{ IOException -> 0x0044 }
            goto L_0x0048
        L_0x0044:
            r4 = move-exception
            r4.printStackTrace()
        L_0x0048:
            r0.close()     // Catch:{ IOException -> 0x0066 }
            goto L_0x006a
        L_0x004c:
            r4 = move-exception
            r1 = r2
            goto L_0x006f
        L_0x004f:
            r4 = move-exception
            r1 = r2
            goto L_0x0055
        L_0x0052:
            r4 = move-exception
            goto L_0x006f
        L_0x0054:
            r4 = move-exception
        L_0x0055:
            r4.printStackTrace()     // Catch:{ all -> 0x0052 }
            if (r1 == 0) goto L_0x0062
            r1.close()     // Catch:{ IOException -> 0x005e }
            goto L_0x0062
        L_0x005e:
            r4 = move-exception
            r4.printStackTrace()
        L_0x0062:
            r0.close()     // Catch:{ IOException -> 0x0066 }
            goto L_0x006a
        L_0x0066:
            r4 = move-exception
            r4.printStackTrace()
        L_0x006a:
            byte[] r4 = r0.toByteArray()
            return r4
        L_0x006f:
            if (r1 == 0) goto L_0x0079
            r1.close()     // Catch:{ IOException -> 0x0075 }
            goto L_0x0079
        L_0x0075:
            r1 = move-exception
            r1.printStackTrace()
        L_0x0079:
            r0.close()     // Catch:{ IOException -> 0x007d }
            goto L_0x0081
        L_0x007d:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0081:
            goto L_0x0083
        L_0x0082:
            throw r4
        L_0x0083:
            goto L_0x0082
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.p012l.C0929p.m4043a(androidx.work.d):byte[]");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0046 A[SYNTHETIC, Splitter:B:25:0x0046] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x005a A[SYNTHETIC, Splitter:B:36:0x005a] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:15:0x0033=Splitter:B:15:0x0033, B:29:0x004e=Splitter:B:29:0x004e} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.work.C0827d m4042a(byte[] r6) {
        /*
            androidx.work.d r0 = new androidx.work.d
            r0.<init>()
            if (r6 != 0) goto L_0x0008
            return r0
        L_0x0008:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r6)
            r6 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch:{ IOException -> 0x003d, all -> 0x0039 }
            r2.<init>(r1)     // Catch:{ IOException -> 0x003d, all -> 0x0039 }
            int r6 = r2.readInt()     // Catch:{ IOException -> 0x0037 }
        L_0x0017:
            if (r6 <= 0) goto L_0x002b
            java.lang.String r3 = r2.readUTF()     // Catch:{ IOException -> 0x0037 }
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch:{ IOException -> 0x0037 }
            boolean r4 = r2.readBoolean()     // Catch:{ IOException -> 0x0037 }
            r0.mo4706a(r3, r4)     // Catch:{ IOException -> 0x0037 }
            int r6 = r6 + -1
            goto L_0x0017
        L_0x002b:
            r2.close()     // Catch:{ IOException -> 0x002f }
            goto L_0x0033
        L_0x002f:
            r6 = move-exception
            r6.printStackTrace()
        L_0x0033:
            r1.close()     // Catch:{ IOException -> 0x0052 }
            goto L_0x0056
        L_0x0037:
            r6 = move-exception
            goto L_0x0041
        L_0x0039:
            r0 = move-exception
            r2 = r6
            r6 = r0
            goto L_0x0058
        L_0x003d:
            r2 = move-exception
            r5 = r2
            r2 = r6
            r6 = r5
        L_0x0041:
            r6.printStackTrace()     // Catch:{ all -> 0x0057 }
            if (r2 == 0) goto L_0x004e
            r2.close()     // Catch:{ IOException -> 0x004a }
            goto L_0x004e
        L_0x004a:
            r6 = move-exception
            r6.printStackTrace()
        L_0x004e:
            r1.close()     // Catch:{ IOException -> 0x0052 }
            goto L_0x0056
        L_0x0052:
            r6 = move-exception
            r6.printStackTrace()
        L_0x0056:
            return r0
        L_0x0057:
            r6 = move-exception
        L_0x0058:
            if (r2 == 0) goto L_0x0062
            r2.close()     // Catch:{ IOException -> 0x005e }
            goto L_0x0062
        L_0x005e:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0062:
            r1.close()     // Catch:{ IOException -> 0x0066 }
            goto L_0x006a
        L_0x0066:
            r0 = move-exception
            r0.printStackTrace()
        L_0x006a:
            goto L_0x006c
        L_0x006b:
            throw r6
        L_0x006c:
            goto L_0x006b
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.p012l.C0929p.m4042a(byte[]):androidx.work.d");
    }
}
