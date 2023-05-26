package androidx.work.impl.p012l;

import androidx.work.C0821a;
import androidx.work.C0825c;
import androidx.work.C0829e;
import androidx.work.C0834i;
import androidx.work.C0974p;
import p015cm.aptoide.p016pt.notification.sync.LocalNotificationSyncManager;

/* renamed from: androidx.work.impl.l.j */
/* compiled from: WorkSpec */
public class C0911j {

    /* renamed from: q */
    private static final String f3203q = C0834i.m3721a("WorkSpec");

    /* renamed from: a */
    public String f3204a;

    /* renamed from: b */
    public C0974p f3205b = C0974p.ENQUEUED;

    /* renamed from: c */
    public String f3206c;

    /* renamed from: d */
    public String f3207d;

    /* renamed from: e */
    public C0829e f3208e;

    /* renamed from: f */
    public C0829e f3209f;

    /* renamed from: g */
    public long f3210g;

    /* renamed from: h */
    public long f3211h;

    /* renamed from: i */
    public long f3212i;

    /* renamed from: j */
    public C0825c f3213j;

    /* renamed from: k */
    public int f3214k;

    /* renamed from: l */
    public C0821a f3215l;

    /* renamed from: m */
    public long f3216m;

    /* renamed from: n */
    public long f3217n;

    /* renamed from: o */
    public long f3218o;

    /* renamed from: p */
    public long f3219p;

    /* renamed from: androidx.work.impl.l.j$a */
    /* compiled from: WorkSpec */
    static class C0912a {
        C0912a() {
        }
    }

    /* renamed from: androidx.work.impl.l.j$b */
    /* compiled from: WorkSpec */
    public static class C0913b {

        /* renamed from: a */
        public String f3220a;

        /* renamed from: b */
        public C0974p f3221b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0913b.class != obj.getClass()) {
                return false;
            }
            C0913b bVar = (C0913b) obj;
            if (this.f3221b != bVar.f3221b) {
                return false;
            }
            return this.f3220a.equals(bVar.f3220a);
        }

        public int hashCode() {
            return (this.f3220a.hashCode() * 31) + this.f3221b.hashCode();
        }
    }

    static {
        new C0912a();
    }

    public C0911j(String str, String str2) {
        C0829e eVar = C0829e.f2982c;
        this.f3208e = eVar;
        this.f3209f = eVar;
        this.f3213j = C0825c.f2961i;
        this.f3215l = C0821a.EXPONENTIAL;
        this.f3216m = 30000;
        this.f3219p = -1;
        this.f3204a = str;
        this.f3206c = str2;
    }

    /* renamed from: a */
    public void mo4880a(long j) {
        if (j < 900000) {
            C0834i.m3720a().mo4730e(f3203q, String.format("Interval duration lesser than minimum allowed value; Changed to %s", new Object[]{900000L}), new Throwable[0]);
            j = 900000;
        }
        mo4881a(j, j);
    }

    /* renamed from: b */
    public boolean mo4882b() {
        return !C0825c.f2961i.equals(this.f3213j);
    }

    /* renamed from: c */
    public boolean mo4883c() {
        return this.f3205b == C0974p.ENQUEUED && this.f3214k > 0;
    }

    /* renamed from: d */
    public boolean mo4884d() {
        return this.f3211h != 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0911j.class != obj.getClass()) {
            return false;
        }
        C0911j jVar = (C0911j) obj;
        if (this.f3210g != jVar.f3210g || this.f3211h != jVar.f3211h || this.f3212i != jVar.f3212i || this.f3214k != jVar.f3214k || this.f3216m != jVar.f3216m || this.f3217n != jVar.f3217n || this.f3218o != jVar.f3218o || this.f3219p != jVar.f3219p || !this.f3204a.equals(jVar.f3204a) || this.f3205b != jVar.f3205b || !this.f3206c.equals(jVar.f3206c)) {
            return false;
        }
        String str = this.f3207d;
        if (str == null ? jVar.f3207d != null : !str.equals(jVar.f3207d)) {
            return false;
        }
        if (this.f3208e.equals(jVar.f3208e) && this.f3209f.equals(jVar.f3209f) && this.f3213j.equals(jVar.f3213j) && this.f3215l == jVar.f3215l) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((this.f3204a.hashCode() * 31) + this.f3205b.hashCode()) * 31) + this.f3206c.hashCode()) * 31;
        String str = this.f3207d;
        int hashCode2 = str != null ? str.hashCode() : 0;
        long j = this.f3210g;
        long j2 = this.f3211h;
        long j3 = this.f3212i;
        long j4 = this.f3216m;
        long j5 = this.f3217n;
        long j6 = this.f3218o;
        long j7 = this.f3219p;
        return ((((((((((((((((((((((((hashCode + hashCode2) * 31) + this.f3208e.hashCode()) * 31) + this.f3209f.hashCode()) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.f3213j.hashCode()) * 31) + this.f3214k) * 31) + this.f3215l.hashCode()) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + ((int) (j7 ^ (j7 >>> 32)));
    }

    public String toString() {
        return "{WorkSpec: " + this.f3204a + "}";
    }

    /* renamed from: a */
    public void mo4881a(long j, long j2) {
        if (j < 900000) {
            C0834i.m3720a().mo4730e(f3203q, String.format("Interval duration lesser than minimum allowed value; Changed to %s", new Object[]{900000L}), new Throwable[0]);
            j = 900000;
        }
        if (j2 < LocalNotificationSyncManager.FIVE_MINUTES) {
            C0834i.m3720a().mo4730e(f3203q, String.format("Flex duration lesser than minimum allowed value; Changed to %s", new Object[]{Long.valueOf(LocalNotificationSyncManager.FIVE_MINUTES)}), new Throwable[0]);
            j2 = 300000;
        }
        if (j2 > j) {
            C0834i.m3720a().mo4730e(f3203q, String.format("Flex duration greater than interval duration; Changed to %s", new Object[]{Long.valueOf(j)}), new Throwable[0]);
            j2 = j;
        }
        this.f3211h = j;
        this.f3212i = j2;
    }

    public C0911j(C0911j jVar) {
        C0829e eVar = C0829e.f2982c;
        this.f3208e = eVar;
        this.f3209f = eVar;
        this.f3213j = C0825c.f2961i;
        this.f3215l = C0821a.EXPONENTIAL;
        this.f3216m = 30000;
        this.f3219p = -1;
        this.f3204a = jVar.f3204a;
        this.f3206c = jVar.f3206c;
        this.f3205b = jVar.f3205b;
        this.f3207d = jVar.f3207d;
        this.f3208e = new C0829e(jVar.f3208e);
        this.f3209f = new C0829e(jVar.f3209f);
        this.f3210g = jVar.f3210g;
        this.f3211h = jVar.f3211h;
        this.f3212i = jVar.f3212i;
        this.f3213j = new C0825c(jVar.f3213j);
        this.f3214k = jVar.f3214k;
        this.f3215l = jVar.f3215l;
        this.f3216m = jVar.f3216m;
        this.f3217n = jVar.f3217n;
        this.f3218o = jVar.f3218o;
        this.f3219p = jVar.f3219p;
    }

    /* renamed from: a */
    public long mo4879a() {
        long j;
        boolean z = false;
        if (mo4883c()) {
            if (this.f3215l == C0821a.LINEAR) {
                z = true;
            }
            if (z) {
                j = this.f3216m * ((long) this.f3214k);
            } else {
                j = (long) Math.scalb((float) this.f3216m, this.f3214k - 1);
            }
            return this.f3217n + Math.min(18000000, j);
        }
        long j2 = 0;
        if (mo4884d()) {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = this.f3217n;
            if (j3 == 0) {
                j3 = this.f3210g + currentTimeMillis;
            }
            if (this.f3212i != this.f3211h) {
                z = true;
            }
            if (z) {
                if (this.f3217n == 0) {
                    j2 = this.f3212i * -1;
                }
                return j3 + this.f3211h + j2;
            }
            if (this.f3217n != 0) {
                j2 = this.f3211h;
            }
            return j3 + j2;
        }
        long j4 = this.f3217n;
        if (j4 == 0) {
            j4 = System.currentTimeMillis();
        }
        return j4 + this.f3210g;
    }
}
