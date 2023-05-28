package androidx.room;

import java.io.File;
import p050l.p103q.p104a.C5166c;

/* renamed from: androidx.room.p */
/* compiled from: SQLiteCopyOpenHelperFactory */
class C0770p implements C5166c.C5170c {

    /* renamed from: a */
    private final String f2842a;

    /* renamed from: b */
    private final File f2843b;

    /* renamed from: c */
    private final C5166c.C5170c f2844c;

    C0770p(String str, File file, C5166c.C5170c cVar) {
        this.f2842a = str;
        this.f2843b = file;
        this.f2844c = cVar;
    }

    /* renamed from: a */
    public C5166c mo4447a(C5166c.C5168b bVar) {
        return new C0769o(bVar.f9152a, this.f2842a, this.f2843b, bVar.f9154c.f9151a, this.f2844c.mo4447a(bVar));
    }
}
