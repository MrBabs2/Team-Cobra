package p050l.p103q.p104a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.util.Log;
import java.io.File;

/* renamed from: l.q.a.c */
/* compiled from: SupportSQLiteOpenHelper */
public interface C5166c {

    /* renamed from: l.q.a.c$a */
    /* compiled from: SupportSQLiteOpenHelper */
    public static abstract class C5167a {

        /* renamed from: a */
        public final int f9151a;

        public C5167a(int i) {
            this.f9151a = i;
        }

        /* renamed from: a */
        private void m9600a(String str) {
            if (!str.equalsIgnoreCase(":memory:") && str.trim().length() != 0) {
                Log.w("SupportSQLite", "deleting the database file: " + str);
                try {
                    if (Build.VERSION.SDK_INT >= 16) {
                        SQLiteDatabase.deleteDatabase(new File(str));
                        return;
                    }
                    try {
                        if (!new File(str).delete()) {
                            Log.e("SupportSQLite", "Could not delete the database file " + str);
                        }
                    } catch (Exception e) {
                        Log.e("SupportSQLite", "error while deleting corrupted database file", e);
                    }
                } catch (Exception e2) {
                    Log.w("SupportSQLite", "delete failed: ", e2);
                }
            }
        }

        /* renamed from: a */
        public void mo4415a(C5165b bVar) {
        }

        /* renamed from: a */
        public abstract void mo4416a(C5165b bVar, int i, int i2);

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
            if (r0 != null) goto L_0x0036;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0036, code lost:
            r3 = r0.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
            if (r3.hasNext() != false) goto L_0x0040;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
            m9600a((java.lang.String) r3.next().second);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x004e, code lost:
            m9600a(r3.getPath());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0055, code lost:
            throw r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x002e, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0030 */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0059  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0071  */
        /* JADX WARNING: Removed duplicated region for block: B:7:0x002e A[ExcHandler: all (r1v3 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r0 
          PHI: (r0v10 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) = (r0v3 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r0v4 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r0v4 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) binds: [B:5:0x0029, B:8:0x0030, B:9:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:5:0x0029] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo17861b(p050l.p103q.p104a.C5165b r3) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Corruption reported by sqlite on database: "
                r0.append(r1)
                java.lang.String r1 = r3.getPath()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "SupportSQLite"
                android.util.Log.e(r1, r0)
                boolean r0 = r3.isOpen()
                if (r0 != 0) goto L_0x0028
                java.lang.String r3 = r3.getPath()
                r2.m9600a((java.lang.String) r3)
                return
            L_0x0028:
                r0 = 0
                java.util.List r0 = r3.getAttachedDbs()     // Catch:{ SQLiteException -> 0x0030, all -> 0x002e }
                goto L_0x0030
            L_0x002e:
                r1 = move-exception
                goto L_0x0034
            L_0x0030:
                r3.close()     // Catch:{ IOException -> 0x0056, all -> 0x002e }
                goto L_0x0057
            L_0x0034:
                if (r0 == 0) goto L_0x004e
                java.util.Iterator r3 = r0.iterator()
            L_0x003a:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L_0x0055
                java.lang.Object r0 = r3.next()
                android.util.Pair r0 = (android.util.Pair) r0
                java.lang.Object r0 = r0.second
                java.lang.String r0 = (java.lang.String) r0
                r2.m9600a((java.lang.String) r0)
                goto L_0x003a
            L_0x004e:
                java.lang.String r3 = r3.getPath()
                r2.m9600a((java.lang.String) r3)
            L_0x0055:
                throw r1
            L_0x0056:
            L_0x0057:
                if (r0 == 0) goto L_0x0071
                java.util.Iterator r3 = r0.iterator()
            L_0x005d:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L_0x0078
                java.lang.Object r0 = r3.next()
                android.util.Pair r0 = (android.util.Pair) r0
                java.lang.Object r0 = r0.second
                java.lang.String r0 = (java.lang.String) r0
                r2.m9600a((java.lang.String) r0)
                goto L_0x005d
            L_0x0071:
                java.lang.String r3 = r3.getPath()
                r2.m9600a((java.lang.String) r3)
            L_0x0078:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p050l.p103q.p104a.C5166c.C5167a.mo17861b(l.q.a.b):void");
        }

        /* renamed from: b */
        public abstract void mo4417b(C5165b bVar, int i, int i2);

        /* renamed from: c */
        public abstract void mo4418c(C5165b bVar);

        /* renamed from: d */
        public void mo4419d(C5165b bVar) {
        }
    }

    /* renamed from: l.q.a.c$c */
    /* compiled from: SupportSQLiteOpenHelper */
    public interface C5170c {
        /* renamed from: a */
        C5166c mo4447a(C5168b bVar);
    }

    /* renamed from: a */
    C5165b mo4442a();

    /* renamed from: a */
    void mo4444a(boolean z);

    /* renamed from: b */
    String mo4445b();

    void close();

    /* renamed from: l.q.a.c$b */
    /* compiled from: SupportSQLiteOpenHelper */
    public static class C5168b {

        /* renamed from: a */
        public final Context f9152a;

        /* renamed from: b */
        public final String f9153b;

        /* renamed from: c */
        public final C5167a f9154c;

        C5168b(Context context, String str, C5167a aVar) {
            this.f9152a = context;
            this.f9153b = str;
            this.f9154c = aVar;
        }

        /* renamed from: a */
        public static C5169a m9607a(Context context) {
            return new C5169a(context);
        }

        /* renamed from: l.q.a.c$b$a */
        /* compiled from: SupportSQLiteOpenHelper */
        public static class C5169a {

            /* renamed from: a */
            Context f9155a;

            /* renamed from: b */
            String f9156b;

            /* renamed from: c */
            C5167a f9157c;

            C5169a(Context context) {
                this.f9155a = context;
            }

            /* renamed from: a */
            public C5168b mo17864a() {
                C5167a aVar = this.f9157c;
                if (aVar != null) {
                    Context context = this.f9155a;
                    if (context != null) {
                        return new C5168b(context, this.f9156b, aVar);
                    }
                    throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
                }
                throw new IllegalArgumentException("Must set a callback to create the configuration.");
            }

            /* renamed from: a */
            public C5169a mo17862a(String str) {
                this.f9156b = str;
                return this;
            }

            /* renamed from: a */
            public C5169a mo17863a(C5167a aVar) {
                this.f9157c = aVar;
                return this;
            }
        }
    }
}
