package androidx.coordinatorlayout.widget;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p050l.p066e.C4881g;
import p050l.p075h.p083k.C5005e;
import p050l.p075h.p083k.C5006f;

/* renamed from: androidx.coordinatorlayout.widget.a */
/* compiled from: DirectedAcyclicGraph */
public final class C0349a<T> {

    /* renamed from: a */
    private final C5005e<ArrayList<T>> f1631a = new C5006f(10);

    /* renamed from: b */
    private final C4881g<T, ArrayList<T>> f1632b = new C4881g<>();

    /* renamed from: c */
    private final ArrayList<T> f1633c = new ArrayList<>();

    /* renamed from: d */
    private final HashSet<T> f1634d = new HashSet<>();

    /* renamed from: a */
    public void mo2184a(T t) {
        if (!this.f1632b.containsKey(t)) {
            this.f1632b.put(t, null);
        }
    }

    /* renamed from: b */
    public boolean mo2187b(T t) {
        return this.f1632b.containsKey(t);
    }

    /* renamed from: c */
    public List mo2188c(T t) {
        return this.f1632b.get(t);
    }

    /* renamed from: d */
    public List<T> mo2189d(T t) {
        int size = this.f1632b.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ArrayList d = this.f1632b.mo17028d(i);
            if (d != null && d.contains(t)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f1632b.mo17022b(i));
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public boolean mo2190e(T t) {
        int size = this.f1632b.size();
        for (int i = 0; i < size; i++) {
            ArrayList d = this.f1632b.mo17028d(i);
            if (d != null && d.contains(t)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private ArrayList<T> m1754c() {
        ArrayList<T> a = this.f1631a.mo17456a();
        return a == null ? new ArrayList<>() : a;
    }

    /* renamed from: b */
    public ArrayList<T> mo2186b() {
        this.f1633c.clear();
        this.f1634d.clear();
        int size = this.f1632b.size();
        for (int i = 0; i < size; i++) {
            m1752a(this.f1632b.mo17022b(i), this.f1633c, this.f1634d);
        }
        return this.f1633c;
    }

    /* renamed from: a */
    public void mo2185a(T t, T t2) {
        if (!this.f1632b.containsKey(t) || !this.f1632b.containsKey(t2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList arrayList = this.f1632b.get(t);
        if (arrayList == null) {
            arrayList = m1754c();
            this.f1632b.put(t, arrayList);
        }
        arrayList.add(t2);
    }

    /* renamed from: a */
    public void mo2183a() {
        int size = this.f1632b.size();
        for (int i = 0; i < size; i++) {
            ArrayList d = this.f1632b.mo17028d(i);
            if (d != null) {
                m1753a(d);
            }
        }
        this.f1632b.clear();
    }

    /* renamed from: a */
    private void m1752a(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (!arrayList.contains(t)) {
            if (!hashSet.contains(t)) {
                hashSet.add(t);
                ArrayList arrayList2 = this.f1632b.get(t);
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        m1752a(arrayList2.get(i), arrayList, hashSet);
                    }
                }
                hashSet.remove(t);
                arrayList.add(t);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }

    /* renamed from: a */
    private void m1753a(ArrayList<T> arrayList) {
        arrayList.clear();
        this.f1631a.mo17457a(arrayList);
    }
}
