package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.C0542v;
import androidx.lifecycle.C0543w;
import androidx.lifecycle.C0546x;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: androidx.fragment.app.j */
/* compiled from: FragmentManagerViewModel */
class C0481j extends C0542v {

    /* renamed from: h */
    private static final C0543w.C0544a f2043h = new C0482a();

    /* renamed from: b */
    private final HashSet<Fragment> f2044b = new HashSet<>();

    /* renamed from: c */
    private final HashMap<String, C0481j> f2045c = new HashMap<>();

    /* renamed from: d */
    private final HashMap<String, C0546x> f2046d = new HashMap<>();

    /* renamed from: e */
    private final boolean f2047e;

    /* renamed from: f */
    private boolean f2048f = false;

    /* renamed from: g */
    private boolean f2049g = false;

    /* renamed from: androidx.fragment.app.j$a */
    /* compiled from: FragmentManagerViewModel */
    static class C0482a implements C0543w.C0544a {
        C0482a() {
        }

        /* renamed from: a */
        public <T extends C0542v> T mo2931a(Class<T> cls) {
            return new C0481j(true);
        }
    }

    C0481j(boolean z) {
        this.f2047e = z;
    }

    /* renamed from: a */
    static C0481j m2426a(C0546x xVar) {
        return (C0481j) new C0543w(xVar, f2043h).mo3094a(C0481j.class);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo2920b() {
        if (C0466i.f1978M) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f2048f = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Collection<Fragment> mo2923c() {
        return this.f2044b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo2925d() {
        return this.f2048f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo2926e(Fragment fragment) {
        return this.f2044b.remove(fragment);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0481j.class != obj.getClass()) {
            return false;
        }
        C0481j jVar = (C0481j) obj;
        if (!this.f2044b.equals(jVar.f2044b) || !this.f2045c.equals(jVar.f2045c) || !this.f2046d.equals(jVar.f2046d)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo2928f(Fragment fragment) {
        if (!this.f2044b.contains(fragment)) {
            return true;
        }
        if (this.f2047e) {
            return this.f2048f;
        }
        return !this.f2049g;
    }

    public int hashCode() {
        return (((this.f2044b.hashCode() * 31) + this.f2045c.hashCode()) * 31) + this.f2046d.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.f2044b.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f2045c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f2046d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C0481j mo2922c(Fragment fragment) {
        C0481j jVar = this.f2045c.get(fragment.mWho);
        if (jVar != null) {
            return jVar;
        }
        C0481j jVar2 = new C0481j(this.f2047e);
        this.f2045c.put(fragment.mWho, jVar2);
        return jVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C0546x mo2924d(Fragment fragment) {
        C0546x xVar = this.f2046d.get(fragment.mWho);
        if (xVar != null) {
            return xVar;
        }
        C0546x xVar2 = new C0546x();
        this.f2046d.put(fragment.mWho, xVar2);
        return xVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo2919a(Fragment fragment) {
        return this.f2044b.add(fragment);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2921b(Fragment fragment) {
        if (C0466i.f1978M) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        C0481j jVar = this.f2045c.get(fragment.mWho);
        if (jVar != null) {
            jVar.mo2920b();
            this.f2045c.remove(fragment.mWho);
        }
        C0546x xVar = this.f2046d.get(fragment.mWho);
        if (xVar != null) {
            xVar.mo3098a();
            this.f2046d.remove(fragment.mWho);
        }
    }
}
