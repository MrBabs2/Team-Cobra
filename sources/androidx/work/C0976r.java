package androidx.work;

import androidx.work.impl.p012l.C0911j;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* renamed from: androidx.work.r */
/* compiled from: WorkRequest */
public abstract class C0976r {

    /* renamed from: a */
    private UUID f3330a;

    /* renamed from: b */
    private C0911j f3331b;

    /* renamed from: c */
    private Set<String> f3332c;

    protected C0976r(UUID uuid, C0911j jVar, Set<String> set) {
        this.f3330a = uuid;
        this.f3331b = jVar;
        this.f3332c = set;
    }

    /* renamed from: a */
    public String mo4979a() {
        return this.f3330a.toString();
    }

    /* renamed from: b */
    public Set<String> mo4980b() {
        return this.f3332c;
    }

    /* renamed from: c */
    public C0911j mo4981c() {
        return this.f3331b;
    }

    /* renamed from: androidx.work.r$a */
    /* compiled from: WorkRequest */
    public static abstract class C0977a<B extends C0977a, W extends C0976r> {

        /* renamed from: a */
        boolean f3333a = false;

        /* renamed from: b */
        UUID f3334b = UUID.randomUUID();

        /* renamed from: c */
        C0911j f3335c;

        /* renamed from: d */
        Set<String> f3336d = new HashSet();

        C0977a(Class<? extends ListenableWorker> cls) {
            this.f3335c = new C0911j(this.f3334b.toString(), cls.getName());
            mo4985a(cls.getName());
        }

        /* renamed from: a */
        public final B mo4983a(C0825c cVar) {
            this.f3335c.f3213j = cVar;
            return mo4972c();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract W mo4971b();

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract B mo4972c();

        /* renamed from: a */
        public final B mo4984a(C0829e eVar) {
            this.f3335c.f3208e = eVar;
            return mo4972c();
        }

        /* renamed from: a */
        public final B mo4985a(String str) {
            this.f3336d.add(str);
            return mo4972c();
        }

        /* renamed from: a */
        public B mo4982a(long j, TimeUnit timeUnit) {
            this.f3335c.f3210g = timeUnit.toMillis(j);
            return mo4972c();
        }

        /* renamed from: a */
        public final W mo4986a() {
            W b = mo4971b();
            this.f3334b = UUID.randomUUID();
            C0911j jVar = new C0911j(this.f3335c);
            this.f3335c = jVar;
            jVar.f3204a = this.f3334b.toString();
            return b;
        }
    }
}
