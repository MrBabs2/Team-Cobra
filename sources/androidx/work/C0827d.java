package androidx.work;

import android.net.Uri;
import java.util.HashSet;
import java.util.Set;

/* renamed from: androidx.work.d */
/* compiled from: ContentUriTriggers */
public final class C0827d {

    /* renamed from: a */
    private final Set<C0828a> f2978a = new HashSet();

    /* renamed from: androidx.work.d$a */
    /* compiled from: ContentUriTriggers */
    public static final class C0828a {

        /* renamed from: a */
        private final Uri f2979a;

        /* renamed from: b */
        private final boolean f2980b;

        C0828a(Uri uri, boolean z) {
            this.f2979a = uri;
            this.f2980b = z;
        }

        /* renamed from: a */
        public Uri mo4710a() {
            return this.f2979a;
        }

        /* renamed from: b */
        public boolean mo4711b() {
            return this.f2980b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0828a.class != obj.getClass()) {
                return false;
            }
            C0828a aVar = (C0828a) obj;
            if (this.f2980b != aVar.f2980b || !this.f2979a.equals(aVar.f2979a)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (this.f2979a.hashCode() * 31) + (this.f2980b ? 1 : 0);
        }
    }

    /* renamed from: a */
    public void mo4706a(Uri uri, boolean z) {
        this.f2978a.add(new C0828a(uri, z));
    }

    /* renamed from: b */
    public int mo4707b() {
        return this.f2978a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0827d.class != obj.getClass()) {
            return false;
        }
        return this.f2978a.equals(((C0827d) obj).f2978a);
    }

    public int hashCode() {
        return this.f2978a.hashCode();
    }

    /* renamed from: a */
    public Set<C0828a> mo4705a() {
        return this.f2978a;
    }
}
