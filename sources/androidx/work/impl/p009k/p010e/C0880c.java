package androidx.work.impl.p009k.p010e;

import androidx.work.impl.p009k.C0874a;
import androidx.work.impl.p009k.p011f.C0891d;
import androidx.work.impl.p012l.C0911j;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.work.impl.k.e.c */
/* compiled from: ConstraintController */
public abstract class C0880c<T> implements C0874a<T> {

    /* renamed from: a */
    private final List<String> f3159a = new ArrayList();

    /* renamed from: b */
    private T f3160b;

    /* renamed from: c */
    private C0891d<T> f3161c;

    /* renamed from: d */
    private C0881a f3162d;

    /* renamed from: androidx.work.impl.k.e.c$a */
    /* compiled from: ConstraintController */
    public interface C0881a {
        /* renamed from: a */
        void mo4831a(List<String> list);

        /* renamed from: b */
        void mo4833b(List<String> list);
    }

    C0880c(C0891d<T> dVar) {
        this.f3161c = dVar;
    }

    /* renamed from: b */
    private void m3911b() {
        if (!this.f3159a.isEmpty() && this.f3162d != null) {
            T t = this.f3160b;
            if (t == null || mo4837b(t)) {
                this.f3162d.mo4833b(this.f3159a);
            } else {
                this.f3162d.mo4831a(this.f3159a);
            }
        }
    }

    /* renamed from: a */
    public void mo4840a(C0881a aVar) {
        if (this.f3162d != aVar) {
            this.f3162d = aVar;
            m3911b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract boolean mo4835a(C0911j jVar);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract boolean mo4837b(T t);

    /* renamed from: a */
    public void mo4841a(List<C0911j> list) {
        this.f3159a.clear();
        for (C0911j next : list) {
            if (mo4835a(next)) {
                this.f3159a.add(next.f3204a);
            }
        }
        if (this.f3159a.isEmpty()) {
            this.f3161c.mo4856b(this);
        } else {
            this.f3161c.mo4854a(this);
        }
        m3911b();
    }

    /* renamed from: a */
    public void mo4839a() {
        if (!this.f3159a.isEmpty()) {
            this.f3159a.clear();
            this.f3161c.mo4856b(this);
        }
    }

    /* renamed from: a */
    public boolean mo4842a(String str) {
        T t = this.f3160b;
        return t != null && mo4837b(t) && this.f3159a.contains(str);
    }

    /* renamed from: a */
    public void mo4822a(T t) {
        this.f3160b = t;
        m3911b();
    }
}
