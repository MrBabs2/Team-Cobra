package p120q.p121b.p353h;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import p120q.p121b.p359l.C11542b;
import p415t.p417b.C12938b;
import p415t.p417b.C12939c;

/* renamed from: q.b.h.b */
/* compiled from: DiskBuffer */
public class C11510b implements C11509a {

    /* renamed from: c */
    private static final C12938b f30752c = C12939c.m41777a((Class<?>) C11510b.class);

    /* renamed from: a */
    private int f30753a;

    /* renamed from: b */
    private final File f30754b;

    /* renamed from: q.b.h.b$a */
    /* compiled from: DiskBuffer */
    class C11511a implements Iterator<C11542b> {

        /* renamed from: f */
        private C11542b f30755f = C11510b.this.m37662a((Iterator<File>) this.f30756g);

        /* renamed from: g */
        final /* synthetic */ Iterator f30756g;

        C11511a(Iterator it) {
            this.f30756g = it;
        }

        public boolean hasNext() {
            return this.f30755f != null;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public C11542b next() {
            C11542b bVar = this.f30755f;
            this.f30755f = C11510b.this.m37662a((Iterator<File>) this.f30756g);
            return bVar;
        }
    }

    public C11510b(File file, int i) {
        this.f30754b = file;
        this.f30753a = i;
        String str = "Could not create or write to disk buffer dir: " + file.getAbsolutePath();
        try {
            file.mkdirs();
            if (!file.isDirectory() || !file.canWrite()) {
                throw new RuntimeException(str);
            }
            f30752c.mo41310b(Integer.toString(m37664b()) + " stored events found in dir: " + file.getAbsolutePath());
        } catch (RuntimeException e) {
            throw new RuntimeException(str, e);
        }
    }

    /* renamed from: b */
    public void mo37628b(C11542b bVar) {
        File file = this.f30754b;
        File file2 = new File(file, bVar.mo37681i().toString() + ".sentry-event");
        if (file2.exists()) {
            C12938b bVar2 = f30752c;
            bVar2.mo41310b("Discarding Event from offline storage: " + file2.getAbsolutePath());
            if (!file2.delete()) {
                C12938b bVar3 = f30752c;
                bVar3.mo41315c("Failed to delete Event: " + file2.getAbsolutePath());
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:22|23|24|25|26) */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a6, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        throw r2;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x00aa */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00b1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo37627a(p120q.p121b.p359l.C11542b r5) {
        /*
            r4 = this;
            int r0 = r4.m37664b()
            int r1 = r4.f30753a
            if (r0 < r1) goto L_0x0031
            t.b.b r0 = f30752c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Not adding Event because at least "
            r1.append(r2)
            int r2 = r4.f30753a
            java.lang.String r2 = java.lang.Integer.toString(r2)
            r1.append(r2)
            java.lang.String r2 = " events are already stored: "
            r1.append(r2)
            java.util.UUID r5 = r5.mo37681i()
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.mo41315c(r5)
            return
        L_0x0031:
            java.io.File r0 = new java.io.File
            java.io.File r1 = r4.f30754b
            java.lang.String r1 = r1.getAbsolutePath()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.util.UUID r3 = r5.mo37681i()
            java.lang.String r3 = r3.toString()
            r2.append(r3)
            java.lang.String r3 = ".sentry-event"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r1, r2)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L_0x0076
            t.b.b r5 = f30752c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Not adding Event to offline storage because it already exists: "
            r1.append(r2)
            java.lang.String r0 = r0.getAbsolutePath()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r5.mo41319d(r0)
            return
        L_0x0076:
            t.b.b r1 = f30752c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Adding Event to offline storage: "
            r2.append(r3)
            java.lang.String r3 = r0.getAbsolutePath()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.mo41310b(r2)
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00b4, RuntimeException -> 0x00b2 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x00b4, RuntimeException -> 0x00b2 }
            java.io.ObjectOutputStream r0 = new java.io.ObjectOutputStream     // Catch:{ all -> 0x00ab }
            r0.<init>(r1)     // Catch:{ all -> 0x00ab }
            r0.writeObject(r5)     // Catch:{ all -> 0x00a4 }
            r0.close()     // Catch:{ all -> 0x00ab }
            r1.close()     // Catch:{ IOException -> 0x00b4, RuntimeException -> 0x00b2 }
            goto L_0x00cf
        L_0x00a4:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x00a6 }
        L_0x00a6:
            r2 = move-exception
            r0.close()     // Catch:{ all -> 0x00aa }
        L_0x00aa:
            throw r2     // Catch:{ all -> 0x00ab }
        L_0x00ab:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00ad }
        L_0x00ad:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x00b1 }
        L_0x00b1:
            throw r0     // Catch:{ IOException -> 0x00b4, RuntimeException -> 0x00b2 }
        L_0x00b2:
            r0 = move-exception
            goto L_0x00b5
        L_0x00b4:
            r0 = move-exception
        L_0x00b5:
            t.b.b r1 = f30752c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error writing Event to offline storage: "
            r2.append(r3)
            java.util.UUID r5 = r5.mo37681i()
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r1.mo41308a((java.lang.String) r5, (java.lang.Throwable) r0)
        L_0x00cf:
            t.b.b r5 = f30752c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r4.m37664b()
            java.lang.String r1 = java.lang.Integer.toString(r1)
            r0.append(r1)
            java.lang.String r1 = " stored events are now in dir: "
            r0.append(r1)
            java.io.File r1 = r4.f30754b
            java.lang.String r1 = r1.getAbsolutePath()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.mo41310b(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p120q.p121b.p353h.C11510b.mo37627a(q.b.l.b):void");
    }

    /* renamed from: b */
    private int m37664b() {
        int i = 0;
        for (File absolutePath : this.f30754b.listFiles()) {
            if (absolutePath.getAbsolutePath().endsWith(".sentry-event")) {
                i++;
            }
        }
        return i;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:22|23|24|25|26) */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005f, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        throw r4;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0063 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x006a */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p120q.p121b.p359l.C11542b m37661a(java.io.File r7) {
        /*
            r6 = this;
            java.lang.String r0 = "Failed to delete Event: "
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x00a8, IOException -> 0x006f, ClassNotFoundException -> 0x006d, RuntimeException -> 0x006b }
            java.io.File r3 = new java.io.File     // Catch:{ FileNotFoundException -> 0x00a8, IOException -> 0x006f, ClassNotFoundException -> 0x006d, RuntimeException -> 0x006b }
            java.lang.String r4 = r7.getAbsolutePath()     // Catch:{ FileNotFoundException -> 0x00a8, IOException -> 0x006f, ClassNotFoundException -> 0x006d, RuntimeException -> 0x006b }
            r3.<init>(r4)     // Catch:{ FileNotFoundException -> 0x00a8, IOException -> 0x006f, ClassNotFoundException -> 0x006d, RuntimeException -> 0x006b }
            r2.<init>(r3)     // Catch:{ FileNotFoundException -> 0x00a8, IOException -> 0x006f, ClassNotFoundException -> 0x006d, RuntimeException -> 0x006b }
            java.io.ObjectInputStream r3 = new java.io.ObjectInputStream     // Catch:{ all -> 0x0064 }
            r3.<init>(r2)     // Catch:{ all -> 0x0064 }
            java.lang.Object r4 = r3.readObject()     // Catch:{ all -> 0x005d }
            r3.close()     // Catch:{ all -> 0x0064 }
            r2.close()     // Catch:{ FileNotFoundException -> 0x00a8, IOException -> 0x006f, ClassNotFoundException -> 0x006d, RuntimeException -> 0x006b }
            q.b.l.b r4 = (p120q.p121b.p359l.C11542b) r4     // Catch:{ RuntimeException -> 0x0023 }
            return r4
        L_0x0023:
            r2 = move-exception
            t.b.b r3 = f30752c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Error casting Object to Event: "
            r4.append(r5)
            java.lang.String r5 = r7.getAbsolutePath()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.mo41308a((java.lang.String) r4, (java.lang.Throwable) r2)
            boolean r2 = r7.delete()
            if (r2 != 0) goto L_0x005c
            t.b.b r2 = f30752c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r7 = r7.getAbsolutePath()
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            r2.mo41315c(r7)
        L_0x005c:
            return r1
        L_0x005d:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x005f }
        L_0x005f:
            r4 = move-exception
            r3.close()     // Catch:{ all -> 0x0063 }
        L_0x0063:
            throw r4     // Catch:{ all -> 0x0064 }
        L_0x0064:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0066 }
        L_0x0066:
            r3 = move-exception
            r2.close()     // Catch:{ all -> 0x006a }
        L_0x006a:
            throw r3     // Catch:{ FileNotFoundException -> 0x00a8, IOException -> 0x006f, ClassNotFoundException -> 0x006d, RuntimeException -> 0x006b }
        L_0x006b:
            r2 = move-exception
            goto L_0x0070
        L_0x006d:
            r2 = move-exception
            goto L_0x0070
        L_0x006f:
            r2 = move-exception
        L_0x0070:
            t.b.b r3 = f30752c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Error reading Event file: "
            r4.append(r5)
            java.lang.String r5 = r7.getAbsolutePath()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.mo41308a((java.lang.String) r4, (java.lang.Throwable) r2)
            boolean r2 = r7.delete()
            if (r2 != 0) goto L_0x00a8
            t.b.b r2 = f30752c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r7 = r7.getAbsolutePath()
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            r2.mo41315c(r7)
        L_0x00a8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p120q.p121b.p353h.C11510b.m37661a(java.io.File):q.b.l.b");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C11542b m37662a(Iterator<File> it) {
        C11542b a;
        while (it.hasNext()) {
            File next = it.next();
            if (next.getAbsolutePath().endsWith(".sentry-event") && (a = m37661a(next)) != null) {
                return a;
            }
        }
        return null;
    }

    /* renamed from: a */
    public Iterator<C11542b> mo37626a() {
        File[] listFiles = this.f30754b.listFiles();
        if (listFiles == null) {
            return Collections.emptyList().iterator();
        }
        return new C11511a(Arrays.asList(listFiles).iterator());
    }
}
