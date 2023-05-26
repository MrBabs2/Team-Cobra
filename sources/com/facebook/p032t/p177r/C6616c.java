package com.facebook.p032t.p177r;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListView;
import com.facebook.C4716f;
import com.facebook.FacebookException;
import com.facebook.internal.C6446m;
import com.facebook.internal.C6448n;
import com.facebook.internal.C6457p;
import com.facebook.internal.C6476x;
import com.facebook.internal.p168a0.p170f.C6391a;
import com.facebook.p032t.p177r.C6609a;
import com.facebook.p032t.p177r.C6620d;
import com.facebook.p032t.p177r.p178g.C6631a;
import com.facebook.p032t.p177r.p178g.C6634b;
import com.facebook.p032t.p177r.p178g.C6635c;
import com.facebook.p032t.p177r.p178g.C6639f;
import com.facebook.p032t.p181u.C6650b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.facebook.t.r.c */
/* compiled from: CodelessMatcher */
class C6616c {

    /* renamed from: f */
    private static final String f12300f = "com.facebook.t.r.c";

    /* renamed from: g */
    private static C6616c f12301g;

    /* renamed from: a */
    private final Handler f12302a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private Set<Activity> f12303b = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: c */
    private Set<C6619c> f12304c = new HashSet();

    /* renamed from: d */
    private HashSet<String> f12305d = new HashSet<>();

    /* renamed from: e */
    private HashMap<Integer, HashSet<String>> f12306e = new HashMap<>();

    /* renamed from: com.facebook.t.r.c$a */
    /* compiled from: CodelessMatcher */
    class C6617a implements Runnable {
        C6617a() {
        }

        public void run() {
            if (!C6391a.m13260a((Object) this)) {
                try {
                    C6616c.m14077a(C6616c.this);
                } catch (Throwable th) {
                    C6391a.m13259a(th, this);
                }
            }
        }
    }

    /* renamed from: com.facebook.t.r.c$b */
    /* compiled from: CodelessMatcher */
    public static class C6618b {

        /* renamed from: a */
        private WeakReference<View> f12308a;

        /* renamed from: b */
        private String f12309b;

        public C6618b(View view, String str) {
            this.f12308a = new WeakReference<>(view);
            this.f12309b = str;
        }

        /* renamed from: a */
        public View mo21370a() {
            WeakReference<View> weakReference = this.f12308a;
            if (weakReference == null) {
                return null;
            }
            return (View) weakReference.get();
        }

        /* renamed from: b */
        public String mo21371b() {
            return this.f12309b;
        }
    }

    private C6616c() {
    }

    /* renamed from: a */
    static /* synthetic */ void m14077a(C6616c cVar) {
        Class<C6616c> cls = C6616c.class;
        if (!C6391a.m13260a((Object) cls)) {
            try {
                cVar.m14079c();
            } catch (Throwable th) {
                C6391a.m13259a(th, cls);
            }
        }
    }

    /* renamed from: b */
    public static synchronized C6616c m14078b() {
        Class<C6616c> cls = C6616c.class;
        synchronized (cls) {
            if (C6391a.m13260a((Object) cls)) {
                return null;
            }
            try {
                if (f12301g == null) {
                    f12301g = new C6616c();
                }
                C6616c cVar = f12301g;
                return cVar;
            } catch (Throwable th) {
                C6391a.m13259a(th, cls);
                return null;
            }
        }
    }

    /* renamed from: d */
    private void m14080d() {
        if (!C6391a.m13260a((Object) this)) {
            try {
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    m14079c();
                } else {
                    this.f12302a.post(new C6617a());
                }
            } catch (Throwable th) {
                C6391a.m13259a(th, this);
            }
        }
    }

    /* renamed from: c */
    public void mo21368c(Activity activity) {
        if (!C6391a.m13260a((Object) this)) {
            try {
                if (!C6457p.m13402b()) {
                    if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                        this.f12303b.remove(activity);
                        this.f12304c.clear();
                        this.f12306e.put(Integer.valueOf(activity.hashCode()), (HashSet) this.f12305d.clone());
                        this.f12305d.clear();
                        return;
                    }
                    throw new FacebookException("Can't remove activity from CodelessMatcher on non-UI thread");
                }
            } catch (Throwable th) {
                C6391a.m13259a(th, this);
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ String m14076a() {
        Class<C6616c> cls = C6616c.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            return f12300f;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }

    /* renamed from: a */
    public void mo21366a(Activity activity) {
        if (!C6391a.m13260a((Object) this)) {
            try {
                if (!C6457p.m13402b()) {
                    if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                        this.f12303b.add(activity);
                        this.f12305d.clear();
                        if (this.f12306e.containsKey(Integer.valueOf(activity.hashCode()))) {
                            this.f12305d = this.f12306e.get(Integer.valueOf(activity.hashCode()));
                        }
                        m14080d();
                        return;
                    }
                    throw new FacebookException("Can't add activity to CodelessMatcher on non-UI thread");
                }
            } catch (Throwable th) {
                C6391a.m13259a(th, this);
            }
        }
    }

    /* renamed from: com.facebook.t.r.c$c */
    /* compiled from: CodelessMatcher */
    protected static class C6619c implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Runnable {

        /* renamed from: f */
        private WeakReference<View> f12310f;

        /* renamed from: g */
        private List<C6631a> f12311g;

        /* renamed from: h */
        private final Handler f12312h;

        /* renamed from: i */
        private HashSet<String> f12313i;

        /* renamed from: j */
        private final String f12314j;

        public C6619c(View view, Handler handler, HashSet<String> hashSet, String str) {
            this.f12310f = new WeakReference<>(view);
            this.f12312h = handler;
            this.f12313i = hashSet;
            this.f12314j = str;
            handler.postDelayed(this, 200);
        }

        /* renamed from: a */
        private void m14088a() {
            if (this.f12311g != null && this.f12310f.get() != null) {
                for (int i = 0; i < this.f12311g.size(); i++) {
                    mo21372a(this.f12311g.get(i), (View) this.f12310f.get());
                }
            }
        }

        /* renamed from: b */
        private void m14091b(C6618b bVar, View view, C6631a aVar) {
            View a = bVar.mo21370a();
            if (a != null) {
                String b = bVar.mo21371b();
                View.OnClickListener f = C6639f.m14140f(a);
                boolean z = (f instanceof C6609a.C6611b) && ((C6609a.C6611b) f).mo21360a();
                if (!this.f12313i.contains(b) && !z) {
                    a.setOnClickListener(C6609a.m14055b(aVar, view, a));
                    this.f12313i.add(b);
                }
            }
        }

        /* renamed from: c */
        private void m14092c(C6618b bVar, View view, C6631a aVar) {
            AdapterView adapterView = (AdapterView) bVar.mo21370a();
            if (adapterView != null) {
                String b = bVar.mo21371b();
                AdapterView.OnItemClickListener onItemClickListener = adapterView.getOnItemClickListener();
                boolean z = (onItemClickListener instanceof C6609a.C6612c) && ((C6609a.C6612c) onItemClickListener).mo21362a();
                if (!this.f12313i.contains(b) && !z) {
                    adapterView.setOnItemClickListener(C6609a.m14053a(aVar, view, adapterView));
                    this.f12313i.add(b);
                }
            }
        }

        /* renamed from: d */
        private void m14093d(C6618b bVar, View view, C6631a aVar) {
            View a = bVar.mo21370a();
            if (a != null) {
                String b = bVar.mo21371b();
                View.OnTouchListener g = C6639f.m14141g(a);
                boolean z = (g instanceof C6620d.C6621a) && ((C6620d.C6621a) g).mo21376a();
                if (!this.f12313i.contains(b) && !z) {
                    a.setOnTouchListener(C6620d.m14095a(aVar, view, a));
                    this.f12313i.add(b);
                }
            }
        }

        public void onGlobalLayout() {
            m14088a();
        }

        public void onScrollChanged() {
            m14088a();
        }

        public void run() {
            View view;
            if (!C6391a.m13260a((Object) this)) {
                try {
                    C6446m c = C6448n.m13386c(C4716f.m7697f());
                    if (c == null) {
                        return;
                    }
                    if (c.mo20989b()) {
                        List<C6631a> a = C6631a.m14113a(c.mo20991d());
                        this.f12311g = a;
                        if (a != null && (view = (View) this.f12310f.get()) != null) {
                            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                            if (viewTreeObserver.isAlive()) {
                                viewTreeObserver.addOnGlobalLayoutListener(this);
                                viewTreeObserver.addOnScrollChangedListener(this);
                            }
                            m14088a();
                        }
                    }
                } catch (Throwable th) {
                    C6391a.m13259a(th, this);
                }
            }
        }

        /* renamed from: a */
        public void mo21372a(C6631a aVar, View view) {
            if (aVar != null && view != null) {
                if (TextUtils.isEmpty(aVar.mo21388a()) || aVar.mo21388a().equals(this.f12314j)) {
                    List<C6635c> d = aVar.mo21391d();
                    if (d.size() <= 25) {
                        for (C6618b a : m14087a(aVar, view, d, 0, -1, this.f12314j)) {
                            m14089a(a, view, aVar);
                        }
                    }
                }
            }
        }

        /* renamed from: a */
        public static List<C6618b> m14087a(C6631a aVar, View view, List<C6635c> list, int i, int i2, String str) {
            String str2 = str + "." + String.valueOf(i2);
            ArrayList arrayList = new ArrayList();
            if (view == null) {
                return arrayList;
            }
            if (i >= list.size()) {
                arrayList.add(new C6618b(view, str2));
            } else {
                C6635c cVar = list.get(i);
                if (cVar.f12349a.equals("..")) {
                    ViewParent parent = view.getParent();
                    if (parent instanceof ViewGroup) {
                        List<View> a = m14086a((ViewGroup) parent);
                        int size = a.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            arrayList.addAll(m14087a(aVar, a.get(i3), list, i + 1, i3, str2));
                        }
                    }
                    return arrayList;
                } else if (cVar.f12349a.equals(".")) {
                    arrayList.add(new C6618b(view, str2));
                    return arrayList;
                } else if (!m14090a(view, cVar, i2)) {
                    return arrayList;
                } else {
                    if (i == list.size() - 1) {
                        arrayList.add(new C6618b(view, str2));
                    }
                }
            }
            if (view instanceof ViewGroup) {
                List<View> a2 = m14086a((ViewGroup) view);
                int size2 = a2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    arrayList.addAll(m14087a(aVar, a2.get(i4), list, i + 1, i4, str2));
                }
            }
            return arrayList;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x003f, code lost:
            if (r5.getClass().getSimpleName().equals(r7[r7.length - 1]) == false) goto L_0x0041;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static boolean m14090a(android.view.View r5, com.facebook.p032t.p177r.p178g.C6635c r6, int r7) {
            /*
                int r0 = r6.f12350b
                r1 = 0
                r2 = -1
                if (r0 == r2) goto L_0x0009
                if (r7 == r0) goto L_0x0009
                return r1
            L_0x0009:
                java.lang.Class r7 = r5.getClass()
                java.lang.String r7 = r7.getCanonicalName()
                java.lang.String r0 = r6.f12349a
                boolean r7 = r7.equals(r0)
                r0 = 1
                if (r7 != 0) goto L_0x0042
                java.lang.String r7 = r6.f12349a
                java.lang.String r2 = ".*android\\..*"
                boolean r7 = r7.matches(r2)
                if (r7 == 0) goto L_0x0041
                java.lang.String r7 = r6.f12349a
                java.lang.String r2 = "\\."
                java.lang.String[] r7 = r7.split(r2)
                int r2 = r7.length
                if (r2 <= 0) goto L_0x0041
                int r2 = r7.length
                int r2 = r2 - r0
                r7 = r7[r2]
                java.lang.Class r2 = r5.getClass()
                java.lang.String r2 = r2.getSimpleName()
                boolean r7 = r2.equals(r7)
                if (r7 != 0) goto L_0x0042
            L_0x0041:
                return r1
            L_0x0042:
                int r7 = r6.f12356h
                com.facebook.t.r.g.c$a r2 = com.facebook.p032t.p177r.p178g.C6635c.C6636a.ID
                int r2 = r2.mo21392a()
                r7 = r7 & r2
                if (r7 <= 0) goto L_0x0056
                int r7 = r6.f12351c
                int r2 = r5.getId()
                if (r7 == r2) goto L_0x0056
                return r1
            L_0x0056:
                int r7 = r6.f12356h
                com.facebook.t.r.g.c$a r2 = com.facebook.p032t.p177r.p178g.C6635c.C6636a.TEXT
                int r2 = r2.mo21392a()
                r7 = r7 & r2
                java.lang.String r2 = ""
                if (r7 <= 0) goto L_0x007e
                java.lang.String r7 = r6.f12352d
                java.lang.String r3 = com.facebook.p032t.p177r.p178g.C6639f.m14144j(r5)
                java.lang.String r4 = com.facebook.internal.C6476x.m13540g((java.lang.String) r3)
                java.lang.String r4 = com.facebook.internal.C6476x.m13486a((java.lang.String) r4, (java.lang.String) r2)
                boolean r3 = r7.equals(r3)
                if (r3 != 0) goto L_0x007e
                boolean r7 = r7.equals(r4)
                if (r7 != 0) goto L_0x007e
                return r1
            L_0x007e:
                int r7 = r6.f12356h
                com.facebook.t.r.g.c$a r3 = com.facebook.p032t.p177r.p178g.C6635c.C6636a.DESCRIPTION
                int r3 = r3.mo21392a()
                r7 = r7 & r3
                if (r7 <= 0) goto L_0x00b0
                java.lang.String r7 = r6.f12354f
                java.lang.CharSequence r3 = r5.getContentDescription()
                if (r3 != 0) goto L_0x0093
                r3 = r2
                goto L_0x009b
            L_0x0093:
                java.lang.CharSequence r3 = r5.getContentDescription()
                java.lang.String r3 = java.lang.String.valueOf(r3)
            L_0x009b:
                java.lang.String r4 = com.facebook.internal.C6476x.m13540g((java.lang.String) r3)
                java.lang.String r4 = com.facebook.internal.C6476x.m13486a((java.lang.String) r4, (java.lang.String) r2)
                boolean r3 = r7.equals(r3)
                if (r3 != 0) goto L_0x00b0
                boolean r7 = r7.equals(r4)
                if (r7 != 0) goto L_0x00b0
                return r1
            L_0x00b0:
                int r7 = r6.f12356h
                com.facebook.t.r.g.c$a r3 = com.facebook.p032t.p177r.p178g.C6635c.C6636a.HINT
                int r3 = r3.mo21392a()
                r7 = r7 & r3
                if (r7 <= 0) goto L_0x00d6
                java.lang.String r7 = r6.f12355g
                java.lang.String r3 = com.facebook.p032t.p177r.p178g.C6639f.m14142h(r5)
                java.lang.String r4 = com.facebook.internal.C6476x.m13540g((java.lang.String) r3)
                java.lang.String r4 = com.facebook.internal.C6476x.m13486a((java.lang.String) r4, (java.lang.String) r2)
                boolean r3 = r7.equals(r3)
                if (r3 != 0) goto L_0x00d6
                boolean r7 = r7.equals(r4)
                if (r7 != 0) goto L_0x00d6
                return r1
            L_0x00d6:
                int r7 = r6.f12356h
                com.facebook.t.r.g.c$a r3 = com.facebook.p032t.p177r.p178g.C6635c.C6636a.TAG
                int r3 = r3.mo21392a()
                r7 = r7 & r3
                if (r7 <= 0) goto L_0x0108
                java.lang.String r6 = r6.f12353e
                java.lang.Object r7 = r5.getTag()
                if (r7 != 0) goto L_0x00eb
                r5 = r2
                goto L_0x00f3
            L_0x00eb:
                java.lang.Object r5 = r5.getTag()
                java.lang.String r5 = java.lang.String.valueOf(r5)
            L_0x00f3:
                java.lang.String r7 = com.facebook.internal.C6476x.m13540g((java.lang.String) r5)
                java.lang.String r7 = com.facebook.internal.C6476x.m13486a((java.lang.String) r7, (java.lang.String) r2)
                boolean r5 = r6.equals(r5)
                if (r5 != 0) goto L_0x0108
                boolean r5 = r6.equals(r7)
                if (r5 != 0) goto L_0x0108
                return r1
            L_0x0108:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.p032t.p177r.C6616c.C6619c.m14090a(android.view.View, com.facebook.t.r.g.c, int):boolean");
        }

        /* renamed from: a */
        private static List<View> m14086a(ViewGroup viewGroup) {
            ArrayList arrayList = new ArrayList();
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    arrayList.add(childAt);
                }
            }
            return arrayList;
        }

        /* renamed from: a */
        private void m14089a(C6618b bVar, View view, C6631a aVar) {
            if (aVar != null) {
                try {
                    View a = bVar.mo21370a();
                    if (a != null) {
                        View a2 = C6639f.m14129a(a);
                        if (a2 != null && C6639f.m14135a(a, a2)) {
                            m14093d(bVar, view, aVar);
                        } else if (!a.getClass().getName().startsWith("com.facebook.react")) {
                            if (!(a instanceof AdapterView)) {
                                m14091b(bVar, view, aVar);
                            } else if (a instanceof ListView) {
                                m14092c(bVar, view, aVar);
                            }
                        }
                    }
                } catch (Exception e) {
                    C6476x.m13507a(C6616c.m14076a(), e);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo21367b(Activity activity) {
        if (!C6391a.m13260a((Object) this)) {
            try {
                this.f12306e.remove(Integer.valueOf(activity.hashCode()));
            } catch (Throwable th) {
                C6391a.m13259a(th, this);
            }
        }
    }

    /* renamed from: c */
    private void m14079c() {
        if (!C6391a.m13260a((Object) this)) {
            try {
                for (Activity next : this.f12303b) {
                    if (next != null) {
                        this.f12304c.add(new C6619c(C6650b.m14182a(next), this.f12302a, this.f12305d, next.getClass().getSimpleName()));
                    }
                }
            } catch (Throwable th) {
                C6391a.m13259a(th, this);
            }
        }
    }

    /* renamed from: a */
    public static Bundle m14075a(C6631a aVar, View view, View view2) {
        List<C6634b> c;
        List<C6618b> list;
        Class<C6616c> cls = C6616c.class;
        if (C6391a.m13260a((Object) cls)) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            if (!(aVar == null || (c = aVar.mo21390c()) == null)) {
                for (C6634b next : c) {
                    if (next.f12346b == null || next.f12346b.length() <= 0) {
                        if (next.f12347c.size() > 0) {
                            if (next.f12348d.equals("relative")) {
                                list = C6619c.m14087a(aVar, view2, next.f12347c, 0, -1, view2.getClass().getSimpleName());
                            } else {
                                list = C6619c.m14087a(aVar, view, next.f12347c, 0, -1, view.getClass().getSimpleName());
                            }
                            Iterator<C6618b> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                C6618b next2 = it.next();
                                if (next2.mo21370a() != null) {
                                    String j = C6639f.m14144j(next2.mo21370a());
                                    if (j.length() > 0) {
                                        bundle.putString(next.f12345a, j);
                                        break;
                                    }
                                }
                            }
                        }
                    } else {
                        bundle.putString(next.f12345a, next.f12346b);
                    }
                }
            }
            return bundle;
        } catch (Throwable th) {
            C6391a.m13259a(th, cls);
            return null;
        }
    }
}
