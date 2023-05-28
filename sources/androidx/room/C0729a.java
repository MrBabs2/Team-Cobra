package androidx.room;

import android.content.Context;
import androidx.room.C0753j;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import p050l.p103q.p104a.C5166c;

/* renamed from: androidx.room.a */
/* compiled from: DatabaseConfiguration */
public class C0729a {

    /* renamed from: a */
    public final C5166c.C5170c f2731a;

    /* renamed from: b */
    public final Context f2732b;

    /* renamed from: c */
    public final String f2733c;

    /* renamed from: d */
    public final C0753j.C0757d f2734d;

    /* renamed from: e */
    public final List<C0753j.C0755b> f2735e;

    /* renamed from: f */
    public final boolean f2736f;

    /* renamed from: g */
    public final C0753j.C0756c f2737g;

    /* renamed from: h */
    public final Executor f2738h;

    /* renamed from: i */
    public final Executor f2739i;

    /* renamed from: j */
    public final boolean f2740j;

    /* renamed from: k */
    public final boolean f2741k;

    /* renamed from: l */
    public final boolean f2742l;

    /* renamed from: m */
    private final Set<Integer> f2743m;

    public C0729a(Context context, String str, C5166c.C5170c cVar, C0753j.C0757d dVar, List<C0753j.C0755b> list, boolean z, C0753j.C0756c cVar2, Executor executor, Executor executor2, boolean z2, boolean z3, boolean z4, Set<Integer> set, String str2, File file) {
        this.f2731a = cVar;
        this.f2732b = context;
        this.f2733c = str;
        this.f2734d = dVar;
        this.f2735e = list;
        this.f2736f = z;
        this.f2737g = cVar2;
        this.f2738h = executor;
        this.f2739i = executor2;
        this.f2740j = z2;
        this.f2741k = z3;
        this.f2742l = z4;
        this.f2743m = set;
    }

    /* renamed from: a */
    public boolean mo4326a(int i, int i2) {
        Set<Integer> set;
        if ((!(i > i2) || !this.f2742l) && this.f2741k && ((set = this.f2743m) == null || !set.contains(Integer.valueOf(i)))) {
            return true;
        }
        return false;
    }
}
