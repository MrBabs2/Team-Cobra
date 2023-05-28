package androidx.work;

import android.net.Network;
import android.net.Uri;
import androidx.work.impl.utils.p014k.C0956a;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

public final class WorkerParameters {

    /* renamed from: a */
    private UUID f2933a;

    /* renamed from: b */
    private C0829e f2934b;

    /* renamed from: c */
    private Set<String> f2935c;

    /* renamed from: d */
    private C0820a f2936d;

    /* renamed from: e */
    private int f2937e;

    /* renamed from: f */
    private Executor f2938f;

    /* renamed from: g */
    private C0956a f2939g;

    /* renamed from: h */
    private C0978s f2940h;

    /* renamed from: androidx.work.WorkerParameters$a */
    public static class C0820a {

        /* renamed from: a */
        public List<String> f2941a = Collections.emptyList();

        /* renamed from: b */
        public List<Uri> f2942b = Collections.emptyList();

        /* renamed from: c */
        public Network f2943c;
    }

    public WorkerParameters(UUID uuid, C0829e eVar, Collection<String> collection, C0820a aVar, int i, Executor executor, C0956a aVar2, C0978s sVar) {
        this.f2933a = uuid;
        this.f2934b = eVar;
        this.f2935c = new HashSet(collection);
        this.f2936d = aVar;
        this.f2937e = i;
        this.f2938f = executor;
        this.f2939g = aVar2;
        this.f2940h = sVar;
    }

    /* renamed from: a */
    public Executor mo4663a() {
        return this.f2938f;
    }

    /* renamed from: b */
    public UUID mo4664b() {
        return this.f2933a;
    }

    /* renamed from: c */
    public C0829e mo4665c() {
        return this.f2934b;
    }

    /* renamed from: d */
    public Network mo4666d() {
        return this.f2936d.f2943c;
    }

    /* renamed from: e */
    public int mo4667e() {
        return this.f2937e;
    }

    /* renamed from: f */
    public Set<String> mo4668f() {
        return this.f2935c;
    }

    /* renamed from: g */
    public C0956a mo4669g() {
        return this.f2939g;
    }

    /* renamed from: h */
    public List<String> mo4670h() {
        return this.f2936d.f2941a;
    }

    /* renamed from: i */
    public List<Uri> mo4671i() {
        return this.f2936d.f2942b;
    }

    /* renamed from: j */
    public C0978s mo4672j() {
        return this.f2940h;
    }
}
