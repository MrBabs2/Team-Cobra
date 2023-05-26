package p050l.p108s;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p050l.p066e.C4868a;
import p050l.p066e.C4873d;
import p050l.p066e.C4881g;
import p050l.p075h.p084l.C5071v;

/* renamed from: l.s.m */
/* compiled from: Transition */
public abstract class C5247m implements Cloneable {

    /* renamed from: L */
    private static final int[] f9307L = {2, 1, 3, 4};

    /* renamed from: M */
    private static final C5232g f9308M = new C5248a();

    /* renamed from: N */
    private static ThreadLocal<C4868a<Animator, C5251d>> f9309N = new ThreadLocal<>();

    /* renamed from: A */
    boolean f9310A = false;

    /* renamed from: B */
    ArrayList<Animator> f9311B = new ArrayList<>();

    /* renamed from: C */
    private int f9312C = 0;

    /* renamed from: D */
    private boolean f9313D = false;

    /* renamed from: E */
    private boolean f9314E = false;

    /* renamed from: F */
    private ArrayList<C5253f> f9315F = null;

    /* renamed from: G */
    private ArrayList<Animator> f9316G = new ArrayList<>();

    /* renamed from: H */
    C5259p f9317H;

    /* renamed from: I */
    private C5252e f9318I;

    /* renamed from: J */
    private C4868a<String, String> f9319J;

    /* renamed from: K */
    private C5232g f9320K = f9308M;

    /* renamed from: f */
    private String f9321f = getClass().getName();

    /* renamed from: g */
    private long f9322g = -1;

    /* renamed from: h */
    long f9323h = -1;

    /* renamed from: i */
    private TimeInterpolator f9324i = null;

    /* renamed from: j */
    ArrayList<Integer> f9325j = new ArrayList<>();

    /* renamed from: k */
    ArrayList<View> f9326k = new ArrayList<>();

    /* renamed from: l */
    private ArrayList<String> f9327l = null;

    /* renamed from: m */
    private ArrayList<Class<?>> f9328m = null;

    /* renamed from: n */
    private ArrayList<Integer> f9329n = null;

    /* renamed from: o */
    private ArrayList<View> f9330o = null;

    /* renamed from: p */
    private ArrayList<Class<?>> f9331p = null;

    /* renamed from: q */
    private ArrayList<String> f9332q = null;

    /* renamed from: r */
    private ArrayList<Integer> f9333r = null;

    /* renamed from: s */
    private ArrayList<View> f9334s = null;

    /* renamed from: t */
    private ArrayList<Class<?>> f9335t = null;

    /* renamed from: u */
    private C5265t f9336u = new C5265t();

    /* renamed from: v */
    private C5265t f9337v = new C5265t();

    /* renamed from: w */
    C5260q f9338w = null;

    /* renamed from: x */
    private int[] f9339x = f9307L;

    /* renamed from: y */
    private ArrayList<C5264s> f9340y;

    /* renamed from: z */
    private ArrayList<C5264s> f9341z;

    /* renamed from: l.s.m$a */
    /* compiled from: Transition */
    static class C5248a extends C5232g {
        C5248a() {
        }

        /* renamed from: a */
        public Path mo18051a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    /* renamed from: l.s.m$b */
    /* compiled from: Transition */
    class C5249b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C4868a f9342a;

        C5249b(C4868a aVar) {
            this.f9342a = aVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f9342a.remove(animator);
            C5247m.this.f9311B.remove(animator);
        }

        public void onAnimationStart(Animator animator) {
            C5247m.this.f9311B.add(animator);
        }
    }

    /* renamed from: l.s.m$c */
    /* compiled from: Transition */
    class C5250c extends AnimatorListenerAdapter {
        C5250c() {
        }

        public void onAnimationEnd(Animator animator) {
            C5247m.this.mo18088b();
            animator.removeListener(this);
        }
    }

    /* renamed from: l.s.m$d */
    /* compiled from: Transition */
    private static class C5251d {

        /* renamed from: a */
        View f9345a;

        /* renamed from: b */
        String f9346b;

        /* renamed from: c */
        C5264s f9347c;

        /* renamed from: d */
        C5254m0 f9348d;

        /* renamed from: e */
        C5247m f9349e;

        C5251d(View view, String str, C5247m mVar, C5254m0 m0Var, C5264s sVar) {
            this.f9345a = view;
            this.f9346b = str;
            this.f9347c = sVar;
            this.f9348d = m0Var;
            this.f9349e = mVar;
        }
    }

    /* renamed from: l.s.m$e */
    /* compiled from: Transition */
    public static abstract class C5252e {
    }

    /* renamed from: l.s.m$f */
    /* compiled from: Transition */
    public interface C5253f {
        /* renamed from: a */
        void mo18047a(C5247m mVar);

        /* renamed from: b */
        void mo18025b(C5247m mVar);

        /* renamed from: c */
        void mo18026c(C5247m mVar);

        /* renamed from: d */
        void mo18027d(C5247m mVar);

        /* renamed from: e */
        void mo18028e(C5247m mVar);
    }

    /* renamed from: u */
    private static C4868a<Animator, C5251d> mo18122u() {
        C4868a<Animator, C5251d> aVar = f9309N.get();
        if (aVar != null) {
            return aVar;
        }
        C4868a<Animator, C5251d> aVar2 = new C4868a<>();
        f9309N.set(aVar2);
        return aVar2;
    }

    /* renamed from: a */
    public Animator mo17994a(ViewGroup viewGroup, C5264s sVar, C5264s sVar2) {
        return null;
    }

    /* renamed from: a */
    public C5247m mo18072a(long j) {
        this.f9323h = j;
        return this;
    }

    /* renamed from: a */
    public abstract void mo17995a(C5264s sVar);

    /* renamed from: b */
    public C5247m mo18085b(long j) {
        this.f9322g = j;
        return this;
    }

    /* renamed from: c */
    public long mo18091c() {
        return this.f9323h;
    }

    /* renamed from: c */
    public abstract void mo17996c(C5264s sVar);

    /* access modifiers changed from: protected */
    public void cancel() {
        for (int size = this.f9311B.size() - 1; size >= 0; size--) {
            this.f9311B.get(size).cancel();
        }
        ArrayList<C5253f> arrayList = this.f9315F;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.f9315F.clone();
            int size2 = arrayList2.size();
            for (int i = 0; i < size2; i++) {
                ((C5253f) arrayList2.get(i)).mo18027d(this);
            }
        }
    }

    /* renamed from: d */
    public C5247m mo18095d(View view) {
        this.f9326k.remove(view);
        return this;
    }

    /* renamed from: e */
    public void mo18097e(View view) {
        if (this.f9313D) {
            if (!this.f9314E) {
                C4868a<Animator, C5251d> u = mo18122u();
                int size = u.size();
                C5254m0 d = C5217c0.m9713d(view);
                for (int i = size - 1; i >= 0; i--) {
                    C5251d d2 = u.mo17028d(i);
                    if (d2.f9345a != null && d.equals(d2.f9348d)) {
                        C5200a.m9674b(u.mo17022b(i));
                    }
                }
                ArrayList<C5253f> arrayList = this.f9315F;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f9315F.clone();
                    int size2 = arrayList2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((C5253f) arrayList2.get(i2)).mo18028e(this);
                    }
                }
            }
            this.f9313D = false;
        }
    }

    /* renamed from: f */
    public TimeInterpolator mo18098f() {
        return this.f9324i;
    }

    /* renamed from: g */
    public String mo18099g() {
        return this.f9321f;
    }

    /* renamed from: h */
    public C5232g mo18100h() {
        return this.f9320K;
    }

    /* renamed from: i */
    public C5259p mo18101i() {
        return this.f9317H;
    }

    /* renamed from: j */
    public long mo18102j() {
        return this.f9322g;
    }

    /* renamed from: k */
    public List<Integer> mo18103k() {
        return this.f9325j;
    }

    /* renamed from: l */
    public List<String> mo18104l() {
        return this.f9327l;
    }

    /* renamed from: m */
    public List<Class<?>> mo18105m() {
        return this.f9328m;
    }

    /* renamed from: n */
    public List<View> mo18106n() {
        return this.f9326k;
    }

    /* renamed from: q */
    public String[] mo17997q() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo18107r() {
        mo18108s();
        C4868a<Animator, C5251d> u = mo18122u();
        Iterator<Animator> it = this.f9316G.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (u.containsKey(next)) {
                mo18108s();
                m9802a(next, u);
            }
        }
        this.f9316G.clear();
        mo18088b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo18108s() {
        if (this.f9312C == 0) {
            ArrayList<C5253f> arrayList = this.f9315F;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f9315F.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((C5253f) arrayList2.get(i)).mo18047a(this);
                }
            }
            this.f9314E = false;
        }
        this.f9312C++;
    }

    public String toString() {
        return mo18071a("");
    }

    /* renamed from: b */
    private void m9810b(C4868a<View, C5264s> aVar, C4868a<View, C5264s> aVar2) {
        C5264s remove;
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View b = aVar.mo17022b(size);
            if (b != null && mo18090b(b) && (remove = aVar2.remove(b)) != null && mo18090b(remove.f9368b)) {
                this.f9340y.add(aVar.mo17024c(size));
                this.f9341z.add(remove);
            }
        }
    }

    /* renamed from: c */
    private void m9811c(View view, boolean z) {
        if (view != null) {
            int id = view.getId();
            ArrayList<Integer> arrayList = this.f9329n;
            if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
                ArrayList<View> arrayList2 = this.f9330o;
                if (arrayList2 == null || !arrayList2.contains(view)) {
                    ArrayList<Class<?>> arrayList3 = this.f9331p;
                    if (arrayList3 != null) {
                        int size = arrayList3.size();
                        int i = 0;
                        while (i < size) {
                            if (!this.f9331p.get(i).isInstance(view)) {
                                i++;
                            } else {
                                return;
                            }
                        }
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        C5264s sVar = new C5264s(view);
                        if (z) {
                            mo17996c(sVar);
                        } else {
                            mo17995a(sVar);
                        }
                        sVar.f9369c.add(this);
                        mo18089b(sVar);
                        if (z) {
                            m9807a(this.f9336u, view, sVar);
                        } else {
                            m9807a(this.f9337v, view, sVar);
                        }
                    }
                    if (view instanceof ViewGroup) {
                        ArrayList<Integer> arrayList4 = this.f9333r;
                        if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                            ArrayList<View> arrayList5 = this.f9334s;
                            if (arrayList5 == null || !arrayList5.contains(view)) {
                                ArrayList<Class<?>> arrayList6 = this.f9335t;
                                if (arrayList6 != null) {
                                    int size2 = arrayList6.size();
                                    int i2 = 0;
                                    while (i2 < size2) {
                                        if (!this.f9335t.get(i2).isInstance(view)) {
                                            i2++;
                                        } else {
                                            return;
                                        }
                                    }
                                }
                                ViewGroup viewGroup = (ViewGroup) view;
                                for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                                    m9811c(viewGroup.getChildAt(i3), z);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public C5247m mo18073a(TimeInterpolator timeInterpolator) {
        this.f9324i = timeInterpolator;
        return this;
    }

    public C5247m clone() {
        try {
            C5247m mVar = (C5247m) super.clone();
            mVar.f9316G = new ArrayList<>();
            mVar.f9336u = new C5265t();
            mVar.f9337v = new C5265t();
            mVar.f9340y = null;
            mVar.f9341z = null;
            return mVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private void m9806a(C4868a<View, C5264s> aVar, C4868a<View, C5264s> aVar2, C4873d<View> dVar, C4873d<View> dVar2) {
        View a;
        int c = dVar.mo16942c();
        for (int i = 0; i < c; i++) {
            View c2 = dVar.mo16943c(i);
            if (c2 != null && mo18090b(c2) && (a = dVar2.mo16936a(dVar.mo16935a(i))) != null && mo18090b(a)) {
                C5264s sVar = aVar.get(c2);
                C5264s sVar2 = aVar2.get(a);
                if (!(sVar == null || sVar2 == null)) {
                    this.f9340y.add(sVar);
                    this.f9341z.add(sVar2);
                    aVar.remove(c2);
                    aVar2.remove(a);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo18090b(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.f9329n;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.f9330o;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.f9331p;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i = 0; i < size; i++) {
                if (this.f9331p.get(i).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f9332q != null && C5071v.m9211w(view) != null && this.f9332q.contains(C5071v.m9211w(view))) {
            return false;
        }
        if ((this.f9325j.size() == 0 && this.f9326k.size() == 0 && (((arrayList = this.f9328m) == null || arrayList.isEmpty()) && ((arrayList2 = this.f9327l) == null || arrayList2.isEmpty()))) || this.f9325j.contains(Integer.valueOf(id)) || this.f9326k.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.f9327l;
        if (arrayList6 != null && arrayList6.contains(C5071v.m9211w(view))) {
            return true;
        }
        if (this.f9328m != null) {
            for (int i2 = 0; i2 < this.f9328m.size(); i2++) {
                if (this.f9328m.get(i2).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private void m9804a(C4868a<View, C5264s> aVar, C4868a<View, C5264s> aVar2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            View valueAt = sparseArray.valueAt(i);
            if (valueAt != null && mo18090b(valueAt) && (view = sparseArray2.get(sparseArray.keyAt(i))) != null && mo18090b(view)) {
                C5264s sVar = aVar.get(valueAt);
                C5264s sVar2 = aVar2.get(view);
                if (!(sVar == null || sVar2 == null)) {
                    this.f9340y.add(sVar);
                    this.f9341z.add(sVar2);
                    aVar.remove(valueAt);
                    aVar2.remove(view);
                }
            }
        }
    }

    /* renamed from: e */
    public C5252e mo18096e() {
        return this.f9318I;
    }

    /* renamed from: a */
    private void m9805a(C4868a<View, C5264s> aVar, C4868a<View, C5264s> aVar2, C4868a<String, View> aVar3, C4868a<String, View> aVar4) {
        View view;
        int size = aVar3.size();
        for (int i = 0; i < size; i++) {
            View d = aVar3.mo17028d(i);
            if (d != null && mo18090b(d) && (view = aVar4.get(aVar3.mo17022b(i))) != null && mo18090b(view)) {
                C5264s sVar = aVar.get(d);
                C5264s sVar2 = aVar2.get(view);
                if (!(sVar == null || sVar2 == null)) {
                    this.f9340y.add(sVar);
                    this.f9341z.add(sVar2);
                    aVar.remove(d);
                    aVar2.remove(view);
                }
            }
        }
    }

    /* renamed from: c */
    public void mo18092c(View view) {
        if (!this.f9314E) {
            C4868a<Animator, C5251d> u = mo18122u();
            int size = u.size();
            C5254m0 d = C5217c0.m9713d(view);
            for (int i = size - 1; i >= 0; i--) {
                C5251d d2 = u.mo17028d(i);
                if (d2.f9345a != null && d.equals(d2.f9348d)) {
                    C5200a.m9672a(u.mo17022b(i));
                }
            }
            ArrayList<C5253f> arrayList = this.f9315F;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f9315F.clone();
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((C5253f) arrayList2.get(i2)).mo18025b(this);
                }
            }
            this.f9313D = true;
        }
    }

    /* renamed from: b */
    public C5264s mo18087b(View view, boolean z) {
        C5260q qVar = this.f9338w;
        if (qVar != null) {
            return qVar.mo18087b(view, z);
        }
        return (z ? this.f9336u : this.f9337v).f9370a.get(view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo18088b() {
        int i = this.f9312C - 1;
        this.f9312C = i;
        if (i == 0) {
            ArrayList<C5253f> arrayList = this.f9315F;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f9315F.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((C5253f) arrayList2.get(i2)).mo18026c(this);
                }
            }
            for (int i3 = 0; i3 < this.f9336u.f9372c.mo16942c(); i3++) {
                View c = this.f9336u.f9372c.mo16943c(i3);
                if (c != null) {
                    C5071v.m9184c(c, false);
                }
            }
            for (int i4 = 0; i4 < this.f9337v.f9372c.mo16942c(); i4++) {
                View c2 = this.f9337v.f9372c.mo16943c(i4);
                if (c2 != null) {
                    C5071v.m9184c(c2, false);
                }
            }
            this.f9314E = true;
        }
    }

    /* renamed from: a */
    private void m9803a(C4868a<View, C5264s> aVar, C4868a<View, C5264s> aVar2) {
        for (int i = 0; i < aVar.size(); i++) {
            C5264s d = aVar.mo17028d(i);
            if (mo18090b(d.f9368b)) {
                this.f9340y.add(d);
                this.f9341z.add((Object) null);
            }
        }
        for (int i2 = 0; i2 < aVar2.size(); i2++) {
            C5264s d2 = aVar2.mo17028d(i2);
            if (mo18090b(d2.f9368b)) {
                this.f9341z.add(d2);
                this.f9340y.add((Object) null);
            }
        }
    }

    /* renamed from: b */
    public C5247m mo18086b(C5253f fVar) {
        ArrayList<C5253f> arrayList = this.f9315F;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(fVar);
        if (this.f9315F.size() == 0) {
            this.f9315F = null;
        }
        return this;
    }

    /* renamed from: a */
    private void m9808a(C5265t tVar, C5265t tVar2) {
        C4868a aVar = new C4868a((C4881g) tVar.f9370a);
        C4868a aVar2 = new C4868a((C4881g) tVar2.f9370a);
        int i = 0;
        while (true) {
            int[] iArr = this.f9339x;
            if (i < iArr.length) {
                int i2 = iArr[i];
                if (i2 == 1) {
                    m9810b((C4868a<View, C5264s>) aVar, (C4868a<View, C5264s>) aVar2);
                } else if (i2 == 2) {
                    m9805a((C4868a<View, C5264s>) aVar, (C4868a<View, C5264s>) aVar2, tVar.f9373d, tVar2.f9373d);
                } else if (i2 == 3) {
                    m9804a((C4868a<View, C5264s>) aVar, (C4868a<View, C5264s>) aVar2, tVar.f9371b, tVar2.f9371b);
                } else if (i2 == 4) {
                    m9806a((C4868a<View, C5264s>) aVar, (C4868a<View, C5264s>) aVar2, tVar.f9372c, tVar2.f9372c);
                }
                i++;
            } else {
                m9803a((C4868a<View, C5264s>) aVar, (C4868a<View, C5264s>) aVar2);
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo18089b(C5264s sVar) {
        String[] a;
        if (this.f9317H != null && !sVar.f9367a.isEmpty() && (a = this.f9317H.mo18118a()) != null) {
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= a.length) {
                    z = true;
                    break;
                } else if (!sVar.f9367a.containsKey(a[i])) {
                    break;
                } else {
                    i++;
                }
            }
            if (!z) {
                this.f9317H.mo18117a(sVar);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18079a(ViewGroup viewGroup, C5265t tVar, C5265t tVar2, ArrayList<C5264s> arrayList, ArrayList<C5264s> arrayList2) {
        int i;
        int i2;
        Animator a;
        View view;
        Animator animator;
        C5264s sVar;
        C5264s sVar2;
        Animator animator2;
        ViewGroup viewGroup2 = viewGroup;
        C4868a<Animator, C5251d> u = mo18122u();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long j = Long.MAX_VALUE;
        int i3 = 0;
        while (i3 < size) {
            C5264s sVar3 = arrayList.get(i3);
            C5264s sVar4 = arrayList2.get(i3);
            if (sVar3 != null && !sVar3.f9369c.contains(this)) {
                sVar3 = null;
            }
            if (sVar4 != null && !sVar4.f9369c.contains(this)) {
                sVar4 = null;
            }
            if (!(sVar3 == null && sVar4 == null)) {
                if ((sVar3 == null || sVar4 == null || mo18058a(sVar3, sVar4)) && (a = mo17994a(viewGroup2, sVar3, sVar4)) != null) {
                    if (sVar4 != null) {
                        view = sVar4.f9368b;
                        String[] q = mo17997q();
                        if (q != null && q.length > 0) {
                            sVar2 = new C5264s(view);
                            Animator animator3 = a;
                            i2 = size;
                            C5264s sVar5 = tVar2.f9370a.get(view);
                            if (sVar5 != null) {
                                int i4 = 0;
                                while (i4 < q.length) {
                                    sVar2.f9367a.put(q[i4], sVar5.f9367a.get(q[i4]));
                                    i4++;
                                    ArrayList<C5264s> arrayList3 = arrayList2;
                                    i3 = i3;
                                    sVar5 = sVar5;
                                }
                            }
                            i = i3;
                            int size2 = u.size();
                            int i5 = 0;
                            while (true) {
                                if (i5 >= size2) {
                                    animator2 = animator3;
                                    break;
                                }
                                C5251d dVar = u.get(u.mo17022b(i5));
                                if (dVar.f9347c != null && dVar.f9345a == view && dVar.f9346b.equals(mo18099g()) && dVar.f9347c.equals(sVar2)) {
                                    animator2 = null;
                                    break;
                                }
                                i5++;
                            }
                        } else {
                            i2 = size;
                            i = i3;
                            animator2 = a;
                            sVar2 = null;
                        }
                        animator = animator2;
                        sVar = sVar2;
                    } else {
                        i2 = size;
                        i = i3;
                        view = sVar3.f9368b;
                        animator = a;
                        sVar = null;
                    }
                    if (animator != null) {
                        C5259p pVar = this.f9317H;
                        if (pVar != null) {
                            long a2 = pVar.mo18116a(viewGroup2, this, sVar3, sVar4);
                            sparseIntArray.put(this.f9316G.size(), (int) a2);
                            j = Math.min(a2, j);
                        }
                        u.put(animator, new C5251d(view, mo18099g(), this, C5217c0.m9713d(viewGroup), sVar));
                        this.f9316G.add(animator);
                        j = j;
                    }
                    i3 = i + 1;
                    size = i2;
                }
            }
            i2 = size;
            i = i3;
            i3 = i + 1;
            size = i2;
        }
        if (sparseIntArray.size() != 0) {
            for (int i6 = 0; i6 < sparseIntArray.size(); i6++) {
                Animator animator4 = this.f9316G.get(sparseIntArray.keyAt(i6));
                animator4.setStartDelay((((long) sparseIntArray.valueAt(i6)) - j) + animator4.getStartDelay());
            }
        }
    }

    /* renamed from: a */
    private void m9802a(Animator animator, C4868a<Animator, C5251d> aVar) {
        if (animator != null) {
            animator.addListener(new C5249b(aVar));
            mo18077a(animator);
        }
    }

    /* renamed from: a */
    public C5247m mo18074a(View view) {
        this.f9326k.add(view);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo18080a(ViewGroup viewGroup, boolean z) {
        C4868a<String, String> aVar;
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        mo18084a(z);
        if ((this.f9325j.size() > 0 || this.f9326k.size() > 0) && (((arrayList = this.f9327l) == null || arrayList.isEmpty()) && ((arrayList2 = this.f9328m) == null || arrayList2.isEmpty()))) {
            for (int i = 0; i < this.f9325j.size(); i++) {
                View findViewById = viewGroup.findViewById(this.f9325j.get(i).intValue());
                if (findViewById != null) {
                    C5264s sVar = new C5264s(findViewById);
                    if (z) {
                        mo17996c(sVar);
                    } else {
                        mo17995a(sVar);
                    }
                    sVar.f9369c.add(this);
                    mo18089b(sVar);
                    if (z) {
                        m9807a(this.f9336u, findViewById, sVar);
                    } else {
                        m9807a(this.f9337v, findViewById, sVar);
                    }
                }
            }
            for (int i2 = 0; i2 < this.f9326k.size(); i2++) {
                View view = this.f9326k.get(i2);
                C5264s sVar2 = new C5264s(view);
                if (z) {
                    mo17996c(sVar2);
                } else {
                    mo17995a(sVar2);
                }
                sVar2.f9369c.add(this);
                mo18089b(sVar2);
                if (z) {
                    m9807a(this.f9336u, view, sVar2);
                } else {
                    m9807a(this.f9337v, view, sVar2);
                }
            }
        } else {
            m9811c(viewGroup, z);
        }
        if (!z && (aVar = this.f9319J) != null) {
            int size = aVar.size();
            ArrayList arrayList3 = new ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                arrayList3.add(this.f9336u.f9373d.remove(this.f9319J.mo17022b(i3)));
            }
            for (int i4 = 0; i4 < size; i4++) {
                View view2 = (View) arrayList3.get(i4);
                if (view2 != null) {
                    this.f9336u.f9373d.put(this.f9319J.mo17028d(i4), view2);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m9807a(C5265t tVar, View view, C5264s sVar) {
        tVar.f9370a.put(view, sVar);
        int id = view.getId();
        if (id >= 0) {
            if (tVar.f9371b.indexOfKey(id) >= 0) {
                tVar.f9371b.put(id, (Object) null);
            } else {
                tVar.f9371b.put(id, view);
            }
        }
        String w = C5071v.m9211w(view);
        if (w != null) {
            if (tVar.f9373d.containsKey(w)) {
                tVar.f9373d.put(w, null);
            } else {
                tVar.f9373d.put(w, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (tVar.f9372c.mo16938b(itemIdAtPosition) >= 0) {
                    View a = tVar.f9372c.mo16936a(itemIdAtPosition);
                    if (a != null) {
                        C5071v.m9184c(a, false);
                        tVar.f9372c.mo16945c(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                C5071v.m9184c(view, true);
                tVar.f9372c.mo16945c(itemIdAtPosition, view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo18084a(boolean z) {
        if (z) {
            this.f9336u.f9370a.clear();
            this.f9336u.f9371b.clear();
            this.f9336u.f9372c.mo16940b();
            return;
        }
        this.f9337v.f9370a.clear();
        this.f9337v.f9371b.clear();
        this.f9337v.f9372c.mo16940b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C5264s mo18076a(View view, boolean z) {
        C5260q qVar = this.f9338w;
        if (qVar != null) {
            return qVar.mo18076a(view, z);
        }
        ArrayList<C5264s> arrayList = z ? this.f9340y : this.f9341z;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = -1;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            C5264s sVar = arrayList.get(i2);
            if (sVar == null) {
                return null;
            }
            if (sVar.f9368b == view) {
                i = i2;
                break;
            }
            i2++;
        }
        if (i < 0) {
            return null;
        }
        return (z ? this.f9341z : this.f9340y).get(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo18078a(ViewGroup viewGroup) {
        C5251d dVar;
        this.f9340y = new ArrayList<>();
        this.f9341z = new ArrayList<>();
        m9808a(this.f9336u, this.f9337v);
        C4868a<Animator, C5251d> u = mo18122u();
        int size = u.size();
        C5254m0 d = C5217c0.m9713d(viewGroup);
        for (int i = size - 1; i >= 0; i--) {
            Animator b = u.mo17022b(i);
            if (!(b == null || (dVar = u.get(b)) == null || dVar.f9345a == null || !d.equals(dVar.f9348d))) {
                C5264s sVar = dVar.f9347c;
                View view = dVar.f9345a;
                C5264s b2 = mo18087b(view, true);
                C5264s a = mo18076a(view, true);
                if (b2 == null && a == null) {
                    a = this.f9337v.f9370a.get(view);
                }
                if (!(b2 == null && a == null) && dVar.f9349e.mo18058a(sVar, a)) {
                    if (b.isRunning() || b.isStarted()) {
                        b.cancel();
                    } else {
                        u.remove(b);
                    }
                }
            }
        }
        mo18079a(viewGroup, this.f9336u, this.f9337v, this.f9340y, this.f9341z);
        mo18107r();
    }

    /* renamed from: a */
    public boolean mo18058a(C5264s sVar, C5264s sVar2) {
        if (sVar == null || sVar2 == null) {
            return false;
        }
        String[] q = mo17997q();
        if (q != null) {
            int length = q.length;
            int i = 0;
            while (i < length) {
                if (!m9809a(sVar, sVar2, q[i])) {
                    i++;
                }
            }
            return false;
        }
        for (String a : sVar.f9367a.keySet()) {
            if (m9809a(sVar, sVar2, a)) {
            }
        }
        return false;
        return true;
    }

    /* renamed from: a */
    private static boolean m9809a(C5264s sVar, C5264s sVar2, String str) {
        Object obj = sVar.f9367a.get(str);
        Object obj2 = sVar2.f9367a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo18077a(Animator animator) {
        if (animator == null) {
            mo18088b();
            return;
        }
        if (mo18091c() >= 0) {
            animator.setDuration(mo18091c());
        }
        if (mo18102j() >= 0) {
            animator.setStartDelay(mo18102j() + animator.getStartDelay());
        }
        if (mo18098f() != null) {
            animator.setInterpolator(mo18098f());
        }
        animator.addListener(new C5250c());
        animator.start();
    }

    /* renamed from: a */
    public C5247m mo18075a(C5253f fVar) {
        if (this.f9315F == null) {
            this.f9315F = new ArrayList<>();
        }
        this.f9315F.add(fVar);
        return this;
    }

    /* renamed from: a */
    public void mo18081a(C5232g gVar) {
        if (gVar == null) {
            this.f9320K = f9308M;
        } else {
            this.f9320K = gVar;
        }
    }

    /* renamed from: a */
    public void mo18082a(C5252e eVar) {
        this.f9318I = eVar;
    }

    /* renamed from: a */
    public void mo18083a(C5259p pVar) {
        this.f9317H = pVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo18071a(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f9323h != -1) {
            str2 = str2 + "dur(" + this.f9323h + ") ";
        }
        if (this.f9322g != -1) {
            str2 = str2 + "dly(" + this.f9322g + ") ";
        }
        if (this.f9324i != null) {
            str2 = str2 + "interp(" + this.f9324i + ") ";
        }
        if (this.f9325j.size() <= 0 && this.f9326k.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (this.f9325j.size() > 0) {
            for (int i = 0; i < this.f9325j.size(); i++) {
                if (i > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f9325j.get(i);
            }
        }
        if (this.f9326k.size() > 0) {
            for (int i2 = 0; i2 < this.f9326k.size(); i2++) {
                if (i2 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f9326k.get(i2);
            }
        }
        return str3 + ")";
    }
}
