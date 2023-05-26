package androidx.room;

import android.database.Cursor;
import androidx.room.p005s.C0774a;
import java.util.List;
import p050l.p103q.p104a.C5164a;
import p050l.p103q.p104a.C5165b;
import p050l.p103q.p104a.C5166c;

/* renamed from: androidx.room.l */
/* compiled from: RoomOpenHelper */
public class C0759l extends C5166c.C5167a {

    /* renamed from: b */
    private C0729a f2812b;

    /* renamed from: c */
    private final C0760a f2813c;

    /* renamed from: d */
    private final String f2814d;

    /* renamed from: e */
    private final String f2815e;

    /* renamed from: androidx.room.l$a */
    /* compiled from: RoomOpenHelper */
    public static abstract class C0760a {
        public final int version;

        public C0760a(int i) {
            this.version = i;
        }

        /* access modifiers changed from: protected */
        public abstract void createAllTables(C5165b bVar);

        /* access modifiers changed from: protected */
        public abstract void dropAllTables(C5165b bVar);

        /* access modifiers changed from: protected */
        public abstract void onCreate(C5165b bVar);

        /* access modifiers changed from: protected */
        public abstract void onOpen(C5165b bVar);

        /* access modifiers changed from: protected */
        public abstract void onPostMigrate(C5165b bVar);

        /* access modifiers changed from: protected */
        public abstract void onPreMigrate(C5165b bVar);

        /* access modifiers changed from: protected */
        public C0761b onValidateSchema(C5165b bVar) {
            validateMigration(bVar);
            return new C0761b(true, (String) null);
        }

        /* access modifiers changed from: protected */
        @Deprecated
        public void validateMigration(C5165b bVar) {
            throw new UnsupportedOperationException("validateMigration is deprecated");
        }
    }

    /* renamed from: androidx.room.l$b */
    /* compiled from: RoomOpenHelper */
    public static class C0761b {

        /* renamed from: a */
        public final boolean f2816a;

        /* renamed from: b */
        public final String f2817b;

        public C0761b(boolean z, String str) {
            this.f2816a = z;
            this.f2817b = str;
        }
    }

    public C0759l(C0729a aVar, C0760a aVar2, String str, String str2) {
        super(aVar2.version);
        this.f2812b = aVar;
        this.f2813c = aVar2;
        this.f2814d = str;
        this.f2815e = str2;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: e */
    private void m3501e(C5165b bVar) {
        if (m3504h(bVar)) {
            String str = null;
            Cursor a = bVar.mo17849a(new C5164a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
            try {
                if (a.moveToFirst()) {
                    str = a.getString(0);
                }
                a.close();
                if (!this.f2814d.equals(str) && !this.f2815e.equals(str)) {
                    throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
                }
            } catch (Throwable th) {
                a.close();
                throw th;
            }
        } else {
            C0761b onValidateSchema = this.f2813c.onValidateSchema(bVar);
            if (onValidateSchema.f2816a) {
                this.f2813c.onPostMigrate(bVar);
                m3505i(bVar);
                return;
            }
            throw new IllegalStateException("Pre-packaged database has an invalid schema: " + onValidateSchema.f2817b);
        }
    }

    /* renamed from: f */
    private void m3502f(C5165b bVar) {
        bVar.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    /* renamed from: g */
    private static boolean m3503g(C5165b bVar) {
        Cursor c = bVar.mo17852c("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (c.moveToFirst() && c.getInt(0) == 0) {
                z = true;
            }
            return z;
        } finally {
            c.close();
        }
    }

    /* renamed from: h */
    private static boolean m3504h(C5165b bVar) {
        Cursor c = bVar.mo17852c("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z = false;
            if (c.moveToFirst() && c.getInt(0) != 0) {
                z = true;
            }
            return z;
        } finally {
            c.close();
        }
    }

    /* renamed from: i */
    private void m3505i(C5165b bVar) {
        m3502f(bVar);
        bVar.execSQL(C0758k.m3500a(this.f2814d));
    }

    /* renamed from: a */
    public void mo4415a(C5165b bVar) {
        super.mo4415a(bVar);
    }

    /* renamed from: b */
    public void mo4417b(C5165b bVar, int i, int i2) {
        boolean z;
        List<C0774a> a;
        C0729a aVar = this.f2812b;
        if (aVar == null || (a = aVar.f2734d.mo4413a(i, i2)) == null) {
            z = false;
        } else {
            this.f2813c.onPreMigrate(bVar);
            for (C0774a migrate : a) {
                migrate.migrate(bVar);
            }
            C0761b onValidateSchema = this.f2813c.onValidateSchema(bVar);
            if (onValidateSchema.f2816a) {
                this.f2813c.onPostMigrate(bVar);
                m3505i(bVar);
                z = true;
            } else {
                throw new IllegalStateException("Migration didn't properly handle: " + onValidateSchema.f2817b);
            }
        }
        if (!z) {
            C0729a aVar2 = this.f2812b;
            if (aVar2 == null || aVar2.mo4326a(i, i2)) {
                throw new IllegalStateException("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
            }
            this.f2813c.dropAllTables(bVar);
            this.f2813c.createAllTables(bVar);
        }
    }

    /* renamed from: c */
    public void mo4418c(C5165b bVar) {
        boolean g = m3503g(bVar);
        this.f2813c.createAllTables(bVar);
        if (!g) {
            C0761b onValidateSchema = this.f2813c.onValidateSchema(bVar);
            if (!onValidateSchema.f2816a) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + onValidateSchema.f2817b);
            }
        }
        m3505i(bVar);
        this.f2813c.onCreate(bVar);
    }

    /* renamed from: d */
    public void mo4419d(C5165b bVar) {
        super.mo4419d(bVar);
        m3501e(bVar);
        this.f2813c.onOpen(bVar);
        this.f2812b = null;
    }

    /* renamed from: a */
    public void mo4416a(C5165b bVar, int i, int i2) {
        mo4417b(bVar, i, i2);
    }
}
