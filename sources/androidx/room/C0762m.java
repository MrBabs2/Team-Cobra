package androidx.room;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import p050l.p103q.p104a.C5171d;
import p050l.p103q.p104a.C5172e;

/* renamed from: androidx.room.m */
/* compiled from: RoomSQLiteQuery */
public class C0762m implements C5172e, C5171d {

    /* renamed from: n */
    static final TreeMap<Integer, C0762m> f2818n = new TreeMap<>();

    /* renamed from: f */
    private volatile String f2819f;

    /* renamed from: g */
    final long[] f2820g;

    /* renamed from: h */
    final double[] f2821h;

    /* renamed from: i */
    final String[] f2822i;

    /* renamed from: j */
    final byte[][] f2823j;

    /* renamed from: k */
    private final int[] f2824k;

    /* renamed from: l */
    final int f2825l;

    /* renamed from: m */
    int f2826m;

    private C0762m(int i) {
        this.f2825l = i;
        int i2 = i + 1;
        this.f2824k = new int[i2];
        this.f2820g = new long[i2];
        this.f2821h = new double[i2];
        this.f2822i = new String[i2];
        this.f2823j = new byte[i2][];
    }

    /* renamed from: b */
    public static C0762m m3511b(String str, int i) {
        synchronized (f2818n) {
            Map.Entry<Integer, C0762m> ceilingEntry = f2818n.ceilingEntry(Integer.valueOf(i));
            if (ceilingEntry != null) {
                f2818n.remove(ceilingEntry.getKey());
                C0762m value = ceilingEntry.getValue();
                value.mo4429a(str, i);
                return value;
            }
            C0762m mVar = new C0762m(i);
            mVar.mo4429a(str, i);
            return mVar;
        }
    }

    /* renamed from: d */
    private static void m3512d() {
        if (f2818n.size() > 15) {
            int size = f2818n.size() - 10;
            Iterator<Integer> it = f2818n.descendingKeySet().iterator();
            while (true) {
                int i = size - 1;
                if (size > 0) {
                    it.next();
                    it.remove();
                    size = i;
                } else {
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4429a(String str, int i) {
        this.f2819f = str;
        this.f2826m = i;
    }

    public void bindBlob(int i, byte[] bArr) {
        this.f2824k[i] = 5;
        this.f2823j[i] = bArr;
    }

    public void bindDouble(int i, double d) {
        this.f2824k[i] = 3;
        this.f2821h[i] = d;
    }

    public void bindLong(int i, long j) {
        this.f2824k[i] = 2;
        this.f2820g[i] = j;
    }

    public void bindNull(int i) {
        this.f2824k[i] = 1;
    }

    public void bindString(int i, String str) {
        this.f2824k[i] = 4;
        this.f2822i[i] = str;
    }

    public void close() {
    }

    /* renamed from: a */
    public String mo4428a() {
        return this.f2819f;
    }

    /* renamed from: a */
    public void mo4430a(C5171d dVar) {
        for (int i = 1; i <= this.f2826m; i++) {
            int i2 = this.f2824k[i];
            if (i2 == 1) {
                dVar.bindNull(i);
            } else if (i2 == 2) {
                dVar.bindLong(i, this.f2820g[i]);
            } else if (i2 == 3) {
                dVar.bindDouble(i, this.f2821h[i]);
            } else if (i2 == 4) {
                dVar.bindString(i, this.f2822i[i]);
            } else if (i2 == 5) {
                dVar.bindBlob(i, this.f2823j[i]);
            }
        }
    }

    /* renamed from: b */
    public void mo4431b() {
        synchronized (f2818n) {
            f2818n.put(Integer.valueOf(this.f2825l), this);
            m3512d();
        }
    }
}
