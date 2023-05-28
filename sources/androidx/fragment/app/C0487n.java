package androidx.fragment.app;

import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.C0388n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import p050l.p066e.C4868a;
import p050l.p075h.p084l.C5068s;
import p050l.p075h.p084l.C5071v;

/* renamed from: androidx.fragment.app.n */
/* compiled from: FragmentTransition */
class C0487n {

    /* renamed from: a */
    private static final int[] f2076a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b */
    private static final C0498p f2077b = (Build.VERSION.SDK_INT >= 21 ? new C0493o() : null);

    /* renamed from: c */
    private static final C0498p f2078c = m2457a();

    /* renamed from: androidx.fragment.app.n$a */
    /* compiled from: FragmentTransition */
    static class C0488a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ ArrayList f2079f;

        C0488a(ArrayList arrayList) {
            this.f2079f = arrayList;
        }

        public void run() {
            C0487n.m2475a((ArrayList<View>) this.f2079f, 4);
        }
    }

    /* renamed from: androidx.fragment.app.n$b */
    /* compiled from: FragmentTransition */
    static class C0489b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ Object f2080f;

        /* renamed from: g */
        final /* synthetic */ C0498p f2081g;

        /* renamed from: h */
        final /* synthetic */ View f2082h;

        /* renamed from: i */
        final /* synthetic */ Fragment f2083i;

        /* renamed from: j */
        final /* synthetic */ ArrayList f2084j;

        /* renamed from: k */
        final /* synthetic */ ArrayList f2085k;

        /* renamed from: l */
        final /* synthetic */ ArrayList f2086l;

        /* renamed from: m */
        final /* synthetic */ Object f2087m;

        C0489b(Object obj, C0498p pVar, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f2080f = obj;
            this.f2081g = pVar;
            this.f2082h = view;
            this.f2083i = fragment;
            this.f2084j = arrayList;
            this.f2085k = arrayList2;
            this.f2086l = arrayList3;
            this.f2087m = obj2;
        }

        public void run() {
            Object obj = this.f2080f;
            if (obj != null) {
                this.f2081g.mo2968b(obj, this.f2082h);
                this.f2085k.addAll(C0487n.m2464a(this.f2081g, this.f2080f, this.f2083i, (ArrayList<View>) this.f2084j, this.f2082h));
            }
            if (this.f2086l != null) {
                if (this.f2087m != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f2082h);
                    this.f2081g.mo2964a(this.f2087m, (ArrayList<View>) this.f2086l, (ArrayList<View>) arrayList);
                }
                this.f2086l.clear();
                this.f2086l.add(this.f2082h);
            }
        }
    }

    /* renamed from: androidx.fragment.app.n$c */
    /* compiled from: FragmentTransition */
    static class C0490c implements Runnable {

        /* renamed from: f */
        final /* synthetic */ Fragment f2088f;

        /* renamed from: g */
        final /* synthetic */ Fragment f2089g;

        /* renamed from: h */
        final /* synthetic */ boolean f2090h;

        /* renamed from: i */
        final /* synthetic */ C4868a f2091i;

        /* renamed from: j */
        final /* synthetic */ View f2092j;

        /* renamed from: k */
        final /* synthetic */ C0498p f2093k;

        /* renamed from: l */
        final /* synthetic */ Rect f2094l;

        C0490c(Fragment fragment, Fragment fragment2, boolean z, C4868a aVar, View view, C0498p pVar, Rect rect) {
            this.f2088f = fragment;
            this.f2089g = fragment2;
            this.f2090h = z;
            this.f2091i = aVar;
            this.f2092j = view;
            this.f2093k = pVar;
            this.f2094l = rect;
        }

        public void run() {
            C0487n.m2467a(this.f2088f, this.f2089g, this.f2090h, (C4868a<String, View>) this.f2091i, false);
            View view = this.f2092j;
            if (view != null) {
                this.f2093k.mo2986a(view, this.f2094l);
            }
        }
    }

    /* renamed from: androidx.fragment.app.n$d */
    /* compiled from: FragmentTransition */
    static class C0491d implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C0498p f2095f;

        /* renamed from: g */
        final /* synthetic */ C4868a f2096g;

        /* renamed from: h */
        final /* synthetic */ Object f2097h;

        /* renamed from: i */
        final /* synthetic */ C0492e f2098i;

        /* renamed from: j */
        final /* synthetic */ ArrayList f2099j;

        /* renamed from: k */
        final /* synthetic */ View f2100k;

        /* renamed from: l */
        final /* synthetic */ Fragment f2101l;

        /* renamed from: m */
        final /* synthetic */ Fragment f2102m;

        /* renamed from: n */
        final /* synthetic */ boolean f2103n;

        /* renamed from: o */
        final /* synthetic */ ArrayList f2104o;

        /* renamed from: p */
        final /* synthetic */ Object f2105p;

        /* renamed from: q */
        final /* synthetic */ Rect f2106q;

        C0491d(C0498p pVar, C4868a aVar, Object obj, C0492e eVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f2095f = pVar;
            this.f2096g = aVar;
            this.f2097h = obj;
            this.f2098i = eVar;
            this.f2099j = arrayList;
            this.f2100k = view;
            this.f2101l = fragment;
            this.f2102m = fragment2;
            this.f2103n = z;
            this.f2104o = arrayList2;
            this.f2105p = obj2;
            this.f2106q = rect;
        }

        public void run() {
            C4868a<String, View> a = C0487n.m2466a(this.f2095f, (C4868a<String, String>) this.f2096g, this.f2097h, this.f2098i);
            if (a != null) {
                this.f2099j.addAll(a.values());
                this.f2099j.add(this.f2100k);
            }
            C0487n.m2467a(this.f2101l, this.f2102m, this.f2103n, a, false);
            Object obj = this.f2097h;
            if (obj != null) {
                this.f2095f.mo2970b(obj, (ArrayList<View>) this.f2104o, (ArrayList<View>) this.f2099j);
                View a2 = C0487n.m2455a(a, this.f2098i, this.f2105p, this.f2103n);
                if (a2 != null) {
                    this.f2095f.mo2986a(a2, this.f2106q);
                }
            }
        }
    }

    /* renamed from: androidx.fragment.app.n$e */
    /* compiled from: FragmentTransition */
    static class C0492e {

        /* renamed from: a */
        public Fragment f2107a;

        /* renamed from: b */
        public boolean f2108b;

        /* renamed from: c */
        public C0453a f2109c;

        /* renamed from: d */
        public Fragment f2110d;

        /* renamed from: e */
        public boolean f2111e;

        /* renamed from: f */
        public C0453a f2112f;

        C0492e() {
        }
    }

    /* renamed from: a */
    private static C0498p m2457a() {
        try {
            return (C0498p) Class.forName("l.s.e").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001e, code lost:
        r11 = r4.f2107a;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m2483b(androidx.fragment.app.C0466i r17, int r18, androidx.fragment.app.C0487n.C0492e r19, android.view.View r20, p050l.p066e.C4868a<java.lang.String, java.lang.String> r21) {
        /*
            r0 = r17
            r4 = r19
            r9 = r20
            androidx.fragment.app.d r1 = r0.f2008w
            boolean r1 = r1.mo2662a()
            if (r1 == 0) goto L_0x0019
            androidx.fragment.app.d r0 = r0.f2008w
            r1 = r18
            android.view.View r0 = r0.mo2661a(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            r10 = r0
            if (r10 != 0) goto L_0x001e
            return
        L_0x001e:
            androidx.fragment.app.Fragment r11 = r4.f2107a
            androidx.fragment.app.Fragment r12 = r4.f2110d
            androidx.fragment.app.p r13 = m2458a((androidx.fragment.app.Fragment) r12, (androidx.fragment.app.Fragment) r11)
            if (r13 != 0) goto L_0x0029
            return
        L_0x0029:
            boolean r14 = r4.f2108b
            boolean r0 = r4.f2111e
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.lang.Object r7 = m2461a((androidx.fragment.app.C0498p) r13, (androidx.fragment.app.Fragment) r11, (boolean) r14)
            java.lang.Object r6 = m2480b((androidx.fragment.app.C0498p) r13, (androidx.fragment.app.Fragment) r12, (boolean) r0)
            r0 = r13
            r1 = r10
            r2 = r20
            r3 = r21
            r4 = r19
            r5 = r8
            r17 = r6
            r6 = r15
            r18 = r7
            r16 = r10
            r10 = r8
            r8 = r17
            java.lang.Object r8 = m2479b(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            r6 = r18
            if (r6 != 0) goto L_0x0061
            if (r8 != 0) goto L_0x0061
            r7 = r17
            if (r7 != 0) goto L_0x0063
            return
        L_0x0061:
            r7 = r17
        L_0x0063:
            java.util.ArrayList r5 = m2464a((androidx.fragment.app.C0498p) r13, (java.lang.Object) r7, (androidx.fragment.app.Fragment) r12, (java.util.ArrayList<android.view.View>) r10, (android.view.View) r9)
            java.util.ArrayList r9 = m2464a((androidx.fragment.app.C0498p) r13, (java.lang.Object) r6, (androidx.fragment.app.Fragment) r11, (java.util.ArrayList<android.view.View>) r15, (android.view.View) r9)
            r0 = 4
            m2475a((java.util.ArrayList<android.view.View>) r9, (int) r0)
            r0 = r13
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r11
            r11 = r5
            r5 = r14
            java.lang.Object r14 = m2462a((androidx.fragment.app.C0498p) r0, (java.lang.Object) r1, (java.lang.Object) r2, (java.lang.Object) r3, (androidx.fragment.app.Fragment) r4, (boolean) r5)
            if (r14 == 0) goto L_0x00a4
            m2473a((androidx.fragment.app.C0498p) r13, (java.lang.Object) r7, (androidx.fragment.app.Fragment) r12, (java.util.ArrayList<android.view.View>) r11)
            java.util.ArrayList r12 = r13.mo2985a((java.util.ArrayList<android.view.View>) r15)
            r0 = r13
            r1 = r14
            r2 = r6
            r3 = r9
            r4 = r7
            r5 = r11
            r6 = r8
            r7 = r15
            r0.mo2962a(r1, r2, r3, r4, r5, r6, r7)
            r0 = r16
            r13.mo2958a((android.view.ViewGroup) r0, (java.lang.Object) r14)
            r1 = r13
            r2 = r0
            r3 = r10
            r4 = r15
            r5 = r12
            r6 = r21
            r1.mo2987a(r2, r3, r4, r5, r6)
            r0 = 0
            m2475a((java.util.ArrayList<android.view.View>) r9, (int) r0)
            r13.mo2970b((java.lang.Object) r8, (java.util.ArrayList<android.view.View>) r10, (java.util.ArrayList<android.view.View>) r15)
        L_0x00a4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0487n.m2483b(androidx.fragment.app.i, int, androidx.fragment.app.n$e, android.view.View, l.e.a):void");
    }

    /* renamed from: a */
    static void m2471a(C0466i iVar, ArrayList<C0453a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, boolean z) {
        if (iVar.f2006u >= 1) {
            SparseArray sparseArray = new SparseArray();
            for (int i3 = i; i3 < i2; i3++) {
                C0453a aVar = arrayList.get(i3);
                if (arrayList2.get(i3).booleanValue()) {
                    m2482b(aVar, (SparseArray<C0492e>) sparseArray, z);
                } else {
                    m2468a(aVar, (SparseArray<C0492e>) sparseArray, z);
                }
            }
            if (sparseArray.size() != 0) {
                View view = new View(iVar.f2007v.mo2787c());
                int size = sparseArray.size();
                for (int i4 = 0; i4 < size; i4++) {
                    int keyAt = sparseArray.keyAt(i4);
                    C4868a<String, String> a = m2465a(keyAt, arrayList, arrayList2, i, i2);
                    C0492e eVar = (C0492e) sparseArray.valueAt(i4);
                    if (z) {
                        m2483b(iVar, keyAt, eVar, view, a);
                    } else {
                        m2470a(iVar, keyAt, eVar, view, a);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static C4868a<String, String> m2465a(int i, ArrayList<C0453a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        C4868a<String, String> aVar = new C4868a<>();
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            C0453a aVar2 = arrayList.get(i4);
            if (aVar2.mo2690b(i)) {
                boolean booleanValue = arrayList2.get(i4).booleanValue();
                ArrayList<String> arrayList5 = aVar2.f2064o;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (booleanValue) {
                        arrayList3 = aVar2.f2064o;
                        arrayList4 = aVar2.f2065p;
                    } else {
                        ArrayList<String> arrayList6 = aVar2.f2064o;
                        arrayList3 = aVar2.f2065p;
                        arrayList4 = arrayList6;
                    }
                    for (int i5 = 0; i5 < size; i5++) {
                        String str = arrayList4.get(i5);
                        String str2 = arrayList3.get(i5);
                        String remove = aVar.remove(str2);
                        if (remove != null) {
                            aVar.put(str, remove);
                        } else {
                            aVar.put(str, str2);
                        }
                    }
                }
            }
        }
        return aVar;
    }

    /* renamed from: b */
    private static Object m2480b(C0498p pVar, Fragment fragment, boolean z) {
        Object obj;
        if (fragment == null) {
            return null;
        }
        if (z) {
            obj = fragment.getReturnTransition();
        } else {
            obj = fragment.getExitTransition();
        }
        return pVar.mo2966b(obj);
    }

    /* renamed from: b */
    private static Object m2479b(C0498p pVar, ViewGroup viewGroup, View view, C4868a<String, String> aVar, C0492e eVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        Object obj4;
        Rect rect;
        View view2;
        C0498p pVar2 = pVar;
        View view3 = view;
        C4868a<String, String> aVar2 = aVar;
        C0492e eVar2 = eVar;
        ArrayList<View> arrayList3 = arrayList;
        ArrayList<View> arrayList4 = arrayList2;
        Object obj5 = obj;
        Fragment fragment = eVar2.f2107a;
        Fragment fragment2 = eVar2.f2110d;
        if (fragment != null) {
            fragment.requireView().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = eVar2.f2108b;
        if (aVar.isEmpty()) {
            obj3 = null;
        } else {
            obj3 = m2460a(pVar, fragment, fragment2, z);
        }
        C4868a<String, View> b = m2481b(pVar, aVar2, obj3, eVar2);
        C4868a<String, View> a = m2466a(pVar, aVar2, obj3, eVar2);
        if (aVar.isEmpty()) {
            if (b != null) {
                b.clear();
            }
            if (a != null) {
                a.clear();
            }
            obj4 = null;
        } else {
            m2476a(arrayList3, b, (Collection<String>) aVar.keySet());
            m2476a(arrayList4, a, aVar.values());
            obj4 = obj3;
        }
        if (obj5 == null && obj2 == null && obj4 == null) {
            return null;
        }
        m2467a(fragment, fragment2, z, b, true);
        if (obj4 != null) {
            arrayList4.add(view3);
            pVar.mo2969b(obj4, view3, arrayList3);
            m2474a(pVar, obj4, obj2, b, eVar2.f2111e, eVar2.f2112f);
            Rect rect2 = new Rect();
            View a2 = m2455a(a, eVar2, obj5, z);
            if (a2 != null) {
                pVar.mo2959a(obj5, rect2);
            }
            rect = rect2;
            view2 = a2;
        } else {
            view2 = null;
            rect = null;
        }
        C5068s.m9132a(viewGroup, new C0490c(fragment, fragment2, z, a, view2, pVar, rect));
        return obj4;
    }

    /* renamed from: a */
    private static void m2473a(C0498p pVar, Object obj, Fragment fragment, ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.mAdded && fragment.mHidden && fragment.mHiddenChanged) {
            fragment.setHideReplaced(true);
            pVar.mo2961a(obj, fragment.getView(), arrayList);
            C5068s.m9132a(fragment.mContainer, new C0488a(arrayList));
        }
    }

    /* renamed from: a */
    private static void m2470a(C0466i iVar, int i, C0492e eVar, View view, C4868a<String, String> aVar) {
        Fragment fragment;
        Fragment fragment2;
        C0498p a;
        Object obj;
        C0466i iVar2 = iVar;
        C0492e eVar2 = eVar;
        View view2 = view;
        C4868a<String, String> aVar2 = aVar;
        ViewGroup viewGroup = iVar2.f2008w.mo2662a() ? (ViewGroup) iVar2.f2008w.mo2661a(i) : null;
        if (viewGroup != null && (a = m2458a(fragment2, fragment)) != null) {
            boolean z = eVar2.f2108b;
            boolean z2 = eVar2.f2111e;
            Object a2 = m2461a(a, (fragment = eVar2.f2107a), z);
            Object b = m2480b(a, (fragment2 = eVar2.f2110d), z2);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = arrayList;
            Object obj2 = b;
            C0498p pVar = a;
            Object a3 = m2459a(a, viewGroup, view, aVar, eVar, (ArrayList<View>) arrayList, (ArrayList<View>) arrayList2, a2, obj2);
            Object obj3 = a2;
            if (obj3 == null && a3 == null) {
                obj = obj2;
                if (obj == null) {
                    return;
                }
            } else {
                obj = obj2;
            }
            ArrayList<View> a4 = m2464a(pVar, obj, fragment2, (ArrayList<View>) arrayList3, view2);
            Object obj4 = (a4 == null || a4.isEmpty()) ? null : obj;
            pVar.mo2960a(obj3, view2);
            Object a5 = m2462a(pVar, obj3, obj4, a3, fragment, eVar2.f2108b);
            if (a5 != null) {
                ArrayList arrayList4 = new ArrayList();
                C0498p pVar2 = pVar;
                pVar2.mo2962a(a5, obj3, arrayList4, obj4, a4, a3, arrayList2);
                m2472a(pVar2, viewGroup, fragment, view, (ArrayList<View>) arrayList2, obj3, (ArrayList<View>) arrayList4, obj4, a4);
                ArrayList arrayList5 = arrayList2;
                pVar.mo2988a((View) viewGroup, (ArrayList<View>) arrayList5, (Map<String, String>) aVar2);
                pVar.mo2958a(viewGroup, a5);
                pVar.mo2989a(viewGroup, (ArrayList<View>) arrayList5, (Map<String, String>) aVar2);
            }
        }
    }

    /* renamed from: b */
    private static C4868a<String, View> m2481b(C0498p pVar, C4868a<String, String> aVar, Object obj, C0492e eVar) {
        C0388n nVar;
        ArrayList<String> arrayList;
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        Fragment fragment = eVar.f2110d;
        C4868a<String, View> aVar2 = new C4868a<>();
        pVar.mo2991a((Map<String, View>) aVar2, fragment.requireView());
        C0453a aVar3 = eVar.f2112f;
        if (eVar.f2111e) {
            nVar = fragment.getEnterTransitionCallback();
            arrayList = aVar3.f2065p;
        } else {
            nVar = fragment.getExitTransitionCallback();
            arrayList = aVar3.f2064o;
        }
        aVar2.mo16901a(arrayList);
        if (nVar != null) {
            nVar.mo2279a((List<String>) arrayList, (Map<String, View>) aVar2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view = aVar2.get(str);
                if (view == null) {
                    aVar.remove(str);
                } else if (!str.equals(C5071v.m9211w(view))) {
                    aVar.put(C5071v.m9211w(view), aVar.remove(str));
                }
            }
        } else {
            aVar.mo16901a(aVar2.keySet());
        }
        return aVar2;
    }

    /* renamed from: a */
    private static void m2472a(C0498p pVar, ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        ViewGroup viewGroup2 = viewGroup;
        C5068s.m9132a(viewGroup, new C0489b(obj, pVar, view, fragment, arrayList, arrayList2, arrayList3, obj2));
    }

    /* renamed from: a */
    private static C0498p m2458a(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object exitTransition = fragment.getExitTransition();
            if (exitTransition != null) {
                arrayList.add(exitTransition);
            }
            Object returnTransition = fragment.getReturnTransition();
            if (returnTransition != null) {
                arrayList.add(returnTransition);
            }
            Object sharedElementReturnTransition = fragment.getSharedElementReturnTransition();
            if (sharedElementReturnTransition != null) {
                arrayList.add(sharedElementReturnTransition);
            }
        }
        if (fragment2 != null) {
            Object enterTransition = fragment2.getEnterTransition();
            if (enterTransition != null) {
                arrayList.add(enterTransition);
            }
            Object reenterTransition = fragment2.getReenterTransition();
            if (reenterTransition != null) {
                arrayList.add(reenterTransition);
            }
            Object sharedElementEnterTransition = fragment2.getSharedElementEnterTransition();
            if (sharedElementEnterTransition != null) {
                arrayList.add(sharedElementEnterTransition);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        C0498p pVar = f2077b;
        if (pVar != null && m2478a(pVar, (List<Object>) arrayList)) {
            return f2077b;
        }
        C0498p pVar2 = f2078c;
        if (pVar2 != null && m2478a(pVar2, (List<Object>) arrayList)) {
            return f2078c;
        }
        if (f2077b == null && f2078c == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    /* renamed from: b */
    public static void m2482b(C0453a aVar, SparseArray<C0492e> sparseArray, boolean z) {
        if (aVar.f1964s.f2008w.mo2662a()) {
            for (int size = aVar.f2050a.size() - 1; size >= 0; size--) {
                m2469a(aVar, aVar.f2050a.get(size), sparseArray, true, z);
            }
        }
    }

    /* renamed from: a */
    private static boolean m2478a(C0498p pVar, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!pVar.mo2965a(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static Object m2460a(C0498p pVar, Fragment fragment, Fragment fragment2, boolean z) {
        Object obj;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        if (z) {
            obj = fragment2.getSharedElementReturnTransition();
        } else {
            obj = fragment.getSharedElementEnterTransition();
        }
        return pVar.mo2971c(pVar.mo2966b(obj));
    }

    /* renamed from: a */
    private static Object m2461a(C0498p pVar, Fragment fragment, boolean z) {
        Object obj;
        if (fragment == null) {
            return null;
        }
        if (z) {
            obj = fragment.getReenterTransition();
        } else {
            obj = fragment.getEnterTransition();
        }
        return pVar.mo2966b(obj);
    }

    /* renamed from: a */
    private static void m2476a(ArrayList<View> arrayList, C4868a<String, View> aVar, Collection<String> collection) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View d = aVar.mo17028d(size);
            if (collection.contains(C5071v.m9211w(d))) {
                arrayList.add(d);
            }
        }
    }

    /* renamed from: a */
    private static Object m2459a(C0498p pVar, ViewGroup viewGroup, View view, C4868a<String, String> aVar, C0492e eVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        C4868a<String, String> aVar2;
        Object obj3;
        Object obj4;
        Rect rect;
        C0498p pVar2 = pVar;
        C0492e eVar2 = eVar;
        ArrayList<View> arrayList3 = arrayList;
        Object obj5 = obj;
        Fragment fragment = eVar2.f2107a;
        Fragment fragment2 = eVar2.f2110d;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = eVar2.f2108b;
        if (aVar.isEmpty()) {
            aVar2 = aVar;
            obj3 = null;
        } else {
            obj3 = m2460a(pVar2, fragment, fragment2, z);
            aVar2 = aVar;
        }
        C4868a<String, View> b = m2481b(pVar2, aVar2, obj3, eVar2);
        if (aVar.isEmpty()) {
            obj4 = null;
        } else {
            arrayList3.addAll(b.values());
            obj4 = obj3;
        }
        if (obj5 == null && obj2 == null && obj4 == null) {
            return null;
        }
        m2467a(fragment, fragment2, z, b, true);
        if (obj4 != null) {
            rect = new Rect();
            pVar2.mo2969b(obj4, view, arrayList3);
            m2474a(pVar, obj4, obj2, b, eVar2.f2111e, eVar2.f2112f);
            if (obj5 != null) {
                pVar2.mo2959a(obj5, rect);
            }
        } else {
            rect = null;
        }
        C0491d dVar = r0;
        C0491d dVar2 = new C0491d(pVar, aVar, obj4, eVar, arrayList2, view, fragment, fragment2, z, arrayList, obj, rect);
        C5068s.m9132a(viewGroup, dVar);
        return obj4;
    }

    /* renamed from: a */
    static C4868a<String, View> m2466a(C0498p pVar, C4868a<String, String> aVar, Object obj, C0492e eVar) {
        C0388n nVar;
        ArrayList<String> arrayList;
        String a;
        Fragment fragment = eVar.f2107a;
        View view = fragment.getView();
        if (aVar.isEmpty() || obj == null || view == null) {
            aVar.clear();
            return null;
        }
        C4868a<String, View> aVar2 = new C4868a<>();
        pVar.mo2991a((Map<String, View>) aVar2, view);
        C0453a aVar3 = eVar.f2109c;
        if (eVar.f2108b) {
            nVar = fragment.getExitTransitionCallback();
            arrayList = aVar3.f2064o;
        } else {
            nVar = fragment.getEnterTransitionCallback();
            arrayList = aVar3.f2065p;
        }
        if (arrayList != null) {
            aVar2.mo16901a(arrayList);
            aVar2.mo16901a(aVar.values());
        }
        if (nVar != null) {
            nVar.mo2279a((List<String>) arrayList, (Map<String, View>) aVar2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = arrayList.get(size);
                View view2 = aVar2.get(str);
                if (view2 == null) {
                    String a2 = m2463a(aVar, str);
                    if (a2 != null) {
                        aVar.remove(a2);
                    }
                } else if (!str.equals(C5071v.m9211w(view2)) && (a = m2463a(aVar, str)) != null) {
                    aVar.put(a, C5071v.m9211w(view2));
                }
            }
        } else {
            m2477a(aVar, aVar2);
        }
        return aVar2;
    }

    /* renamed from: a */
    private static String m2463a(C4868a<String, String> aVar, String str) {
        int size = aVar.size();
        for (int i = 0; i < size; i++) {
            if (str.equals(aVar.mo17028d(i))) {
                return aVar.mo17022b(i);
            }
        }
        return null;
    }

    /* renamed from: a */
    static View m2455a(C4868a<String, View> aVar, C0492e eVar, Object obj, boolean z) {
        ArrayList<String> arrayList;
        String str;
        C0453a aVar2 = eVar.f2109c;
        if (obj == null || aVar == null || (arrayList = aVar2.f2064o) == null || arrayList.isEmpty()) {
            return null;
        }
        if (z) {
            str = aVar2.f2064o.get(0);
        } else {
            str = aVar2.f2065p.get(0);
        }
        return aVar.get(str);
    }

    /* renamed from: a */
    private static void m2474a(C0498p pVar, Object obj, Object obj2, C4868a<String, View> aVar, boolean z, C0453a aVar2) {
        String str;
        ArrayList<String> arrayList = aVar2.f2064o;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (z) {
                str = aVar2.f2065p.get(0);
            } else {
                str = aVar2.f2064o.get(0);
            }
            View view = aVar.get(str);
            pVar.mo2972c(obj, view);
            if (obj2 != null) {
                pVar.mo2972c(obj2, view);
            }
        }
    }

    /* renamed from: a */
    private static void m2477a(C4868a<String, String> aVar, C4868a<String, View> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey(aVar.mo17028d(size))) {
                aVar.mo17024c(size);
            }
        }
    }

    /* renamed from: a */
    static void m2467a(Fragment fragment, Fragment fragment2, boolean z, C4868a<String, View> aVar, boolean z2) {
        C0388n nVar;
        int i;
        if (z) {
            nVar = fragment2.getEnterTransitionCallback();
        } else {
            nVar = fragment.getEnterTransitionCallback();
        }
        if (nVar != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (aVar == null) {
                i = 0;
            } else {
                i = aVar.size();
            }
            for (int i2 = 0; i2 < i; i2++) {
                arrayList2.add(aVar.mo17022b(i2));
                arrayList.add(aVar.mo17028d(i2));
            }
            if (z2) {
                nVar.mo2280b(arrayList2, arrayList, (List<View>) null);
            } else {
                nVar.mo2278a((List<String>) arrayList2, (List<View>) arrayList, (List<View>) null);
            }
        }
    }

    /* renamed from: a */
    static ArrayList<View> m2464a(C0498p pVar, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View view2 = fragment.getView();
        if (view2 != null) {
            pVar.mo2990a(arrayList2, view2);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        pVar.mo2963a(obj, arrayList2);
        return arrayList2;
    }

    /* renamed from: a */
    static void m2475a(ArrayList<View> arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).setVisibility(i);
            }
        }
    }

    /* renamed from: a */
    private static Object m2462a(C0498p pVar, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        boolean z2;
        if (obj == null || obj2 == null || fragment == null) {
            z2 = true;
        } else {
            z2 = z ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap();
        }
        if (z2) {
            return pVar.mo2967b(obj2, obj, obj3);
        }
        return pVar.mo2957a(obj2, obj, obj3);
    }

    /* renamed from: a */
    public static void m2468a(C0453a aVar, SparseArray<C0492e> sparseArray, boolean z) {
        int size = aVar.f2050a.size();
        for (int i = 0; i < size; i++) {
            m2469a(aVar, aVar.f2050a.get(i), sparseArray, false, z);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0041, code lost:
        if (r10.mAdded != false) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0076, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0092, code lost:
        if (r10.mHidden == false) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0094, code lost:
        r1 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x00e7 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:96:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m2469a(androidx.fragment.app.C0453a r16, androidx.fragment.app.C0485m.C0486a r17, android.util.SparseArray<androidx.fragment.app.C0487n.C0492e> r18, boolean r19, boolean r20) {
        /*
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            androidx.fragment.app.Fragment r10 = r1.f2069b
            if (r10 != 0) goto L_0x000d
            return
        L_0x000d:
            int r11 = r10.mContainerId
            if (r11 != 0) goto L_0x0012
            return
        L_0x0012:
            if (r3 == 0) goto L_0x001b
            int[] r4 = f2076a
            int r1 = r1.f2068a
            r1 = r4[r1]
            goto L_0x001d
        L_0x001b:
            int r1 = r1.f2068a
        L_0x001d:
            r4 = 0
            r5 = 1
            if (r1 == r5) goto L_0x0087
            r6 = 3
            if (r1 == r6) goto L_0x005f
            r6 = 4
            if (r1 == r6) goto L_0x0047
            r6 = 5
            if (r1 == r6) goto L_0x0035
            r6 = 6
            if (r1 == r6) goto L_0x005f
            r6 = 7
            if (r1 == r6) goto L_0x0087
            r1 = 0
        L_0x0031:
            r12 = 0
            r13 = 0
            goto L_0x009a
        L_0x0035:
            if (r20 == 0) goto L_0x0044
            boolean r1 = r10.mHiddenChanged
            if (r1 == 0) goto L_0x0096
            boolean r1 = r10.mHidden
            if (r1 != 0) goto L_0x0096
            boolean r1 = r10.mAdded
            if (r1 == 0) goto L_0x0096
            goto L_0x0094
        L_0x0044:
            boolean r1 = r10.mHidden
            goto L_0x0097
        L_0x0047:
            if (r20 == 0) goto L_0x0056
            boolean r1 = r10.mHiddenChanged
            if (r1 == 0) goto L_0x0078
            boolean r1 = r10.mAdded
            if (r1 == 0) goto L_0x0078
            boolean r1 = r10.mHidden
            if (r1 == 0) goto L_0x0078
        L_0x0055:
            goto L_0x0076
        L_0x0056:
            boolean r1 = r10.mAdded
            if (r1 == 0) goto L_0x0078
            boolean r1 = r10.mHidden
            if (r1 != 0) goto L_0x0078
            goto L_0x0055
        L_0x005f:
            if (r20 == 0) goto L_0x007a
            boolean r1 = r10.mAdded
            if (r1 != 0) goto L_0x0078
            android.view.View r1 = r10.mView
            if (r1 == 0) goto L_0x0078
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x0078
            float r1 = r10.mPostponedAlpha
            r6 = 0
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 < 0) goto L_0x0078
        L_0x0076:
            r1 = 1
            goto L_0x0083
        L_0x0078:
            r1 = 0
            goto L_0x0083
        L_0x007a:
            boolean r1 = r10.mAdded
            if (r1 == 0) goto L_0x0078
            boolean r1 = r10.mHidden
            if (r1 != 0) goto L_0x0078
            goto L_0x0076
        L_0x0083:
            r13 = r1
            r1 = 0
            r12 = 1
            goto L_0x009a
        L_0x0087:
            if (r20 == 0) goto L_0x008c
            boolean r1 = r10.mIsNewlyAdded
            goto L_0x0097
        L_0x008c:
            boolean r1 = r10.mAdded
            if (r1 != 0) goto L_0x0096
            boolean r1 = r10.mHidden
            if (r1 != 0) goto L_0x0096
        L_0x0094:
            r1 = 1
            goto L_0x0097
        L_0x0096:
            r1 = 0
        L_0x0097:
            r4 = r1
            r1 = 1
            goto L_0x0031
        L_0x009a:
            java.lang.Object r6 = r2.get(r11)
            androidx.fragment.app.n$e r6 = (androidx.fragment.app.C0487n.C0492e) r6
            if (r4 == 0) goto L_0x00ac
            androidx.fragment.app.n$e r6 = m2456a((androidx.fragment.app.C0487n.C0492e) r6, (android.util.SparseArray<androidx.fragment.app.C0487n.C0492e>) r2, (int) r11)
            r6.f2107a = r10
            r6.f2108b = r3
            r6.f2109c = r0
        L_0x00ac:
            r14 = r6
            r15 = 0
            if (r20 != 0) goto L_0x00d3
            if (r1 == 0) goto L_0x00d3
            if (r14 == 0) goto L_0x00ba
            androidx.fragment.app.Fragment r1 = r14.f2110d
            if (r1 != r10) goto L_0x00ba
            r14.f2110d = r15
        L_0x00ba:
            androidx.fragment.app.i r4 = r0.f1964s
            int r1 = r10.mState
            if (r1 >= r5) goto L_0x00d3
            int r1 = r4.f2006u
            if (r1 < r5) goto L_0x00d3
            boolean r1 = r0.f2066q
            if (r1 != 0) goto L_0x00d3
            r4.mo2877k(r10)
            r6 = 1
            r7 = 0
            r8 = 0
            r9 = 0
            r5 = r10
            r4.mo2831a((androidx.fragment.app.Fragment) r5, (int) r6, (int) r7, (int) r8, (boolean) r9)
        L_0x00d3:
            if (r13 == 0) goto L_0x00e5
            if (r14 == 0) goto L_0x00db
            androidx.fragment.app.Fragment r1 = r14.f2110d
            if (r1 != 0) goto L_0x00e5
        L_0x00db:
            androidx.fragment.app.n$e r14 = m2456a((androidx.fragment.app.C0487n.C0492e) r14, (android.util.SparseArray<androidx.fragment.app.C0487n.C0492e>) r2, (int) r11)
            r14.f2110d = r10
            r14.f2111e = r3
            r14.f2112f = r0
        L_0x00e5:
            if (r20 != 0) goto L_0x00f1
            if (r12 == 0) goto L_0x00f1
            if (r14 == 0) goto L_0x00f1
            androidx.fragment.app.Fragment r0 = r14.f2107a
            if (r0 != r10) goto L_0x00f1
            r14.f2107a = r15
        L_0x00f1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0487n.m2469a(androidx.fragment.app.a, androidx.fragment.app.m$a, android.util.SparseArray, boolean, boolean):void");
    }

    /* renamed from: a */
    private static C0492e m2456a(C0492e eVar, SparseArray<C0492e> sparseArray, int i) {
        if (eVar != null) {
            return eVar;
        }
        C0492e eVar2 = new C0492e();
        sparseArray.put(i, eVar2);
        return eVar2;
    }
}
