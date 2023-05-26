package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p050l.p075h.p084l.C5068s;
import p050l.p075h.p084l.C5071v;
import p050l.p075h.p084l.C5084x;

@SuppressLint({"UnknownNullness"})
/* renamed from: androidx.fragment.app.p */
/* compiled from: FragmentTransitionImpl */
public abstract class C0498p {

    /* renamed from: androidx.fragment.app.p$a */
    /* compiled from: FragmentTransitionImpl */
    class C0499a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ int f2124f;

        /* renamed from: g */
        final /* synthetic */ ArrayList f2125g;

        /* renamed from: h */
        final /* synthetic */ ArrayList f2126h;

        /* renamed from: i */
        final /* synthetic */ ArrayList f2127i;

        /* renamed from: j */
        final /* synthetic */ ArrayList f2128j;

        C0499a(C0498p pVar, int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f2124f = i;
            this.f2125g = arrayList;
            this.f2126h = arrayList2;
            this.f2127i = arrayList3;
            this.f2128j = arrayList4;
        }

        public void run() {
            for (int i = 0; i < this.f2124f; i++) {
                C5071v.m9164a((View) this.f2125g.get(i), (String) this.f2126h.get(i));
                C5071v.m9164a((View) this.f2127i.get(i), (String) this.f2128j.get(i));
            }
        }
    }

    /* renamed from: androidx.fragment.app.p$b */
    /* compiled from: FragmentTransitionImpl */
    class C0500b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ ArrayList f2129f;

        /* renamed from: g */
        final /* synthetic */ Map f2130g;

        C0500b(C0498p pVar, ArrayList arrayList, Map map) {
            this.f2129f = arrayList;
            this.f2130g = map;
        }

        public void run() {
            int size = this.f2129f.size();
            for (int i = 0; i < size; i++) {
                View view = (View) this.f2129f.get(i);
                String w = C5071v.m9211w(view);
                if (w != null) {
                    C5071v.m9164a(view, C0498p.m2501a((Map<String, String>) this.f2130g, w));
                }
            }
        }
    }

    /* renamed from: androidx.fragment.app.p$c */
    /* compiled from: FragmentTransitionImpl */
    class C0501c implements Runnable {

        /* renamed from: f */
        final /* synthetic */ ArrayList f2131f;

        /* renamed from: g */
        final /* synthetic */ Map f2132g;

        C0501c(C0498p pVar, ArrayList arrayList, Map map) {
            this.f2131f = arrayList;
            this.f2132g = map;
        }

        public void run() {
            int size = this.f2131f.size();
            for (int i = 0; i < size; i++) {
                View view = (View) this.f2131f.get(i);
                C5071v.m9164a(view, (String) this.f2132g.get(C5071v.m9211w(view)));
            }
        }
    }

    /* renamed from: a */
    public abstract Object mo2957a(Object obj, Object obj2, Object obj3);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2986a(View view, Rect rect) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
    }

    /* renamed from: a */
    public abstract void mo2958a(ViewGroup viewGroup, Object obj);

    /* renamed from: a */
    public abstract void mo2959a(Object obj, Rect rect);

    /* renamed from: a */
    public abstract void mo2960a(Object obj, View view);

    /* renamed from: a */
    public abstract void mo2961a(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: a */
    public abstract void mo2962a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3);

    /* renamed from: a */
    public abstract void mo2963a(Object obj, ArrayList<View> arrayList);

    /* renamed from: a */
    public abstract void mo2964a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: a */
    public abstract boolean mo2965a(Object obj);

    /* renamed from: b */
    public abstract Object mo2966b(Object obj);

    /* renamed from: b */
    public abstract Object mo2967b(Object obj, Object obj2, Object obj3);

    /* renamed from: b */
    public abstract void mo2968b(Object obj, View view);

    /* renamed from: b */
    public abstract void mo2969b(Object obj, View view, ArrayList<View> arrayList);

    /* renamed from: b */
    public abstract void mo2970b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2);

    /* renamed from: c */
    public abstract Object mo2971c(Object obj);

    /* renamed from: c */
    public abstract void mo2972c(Object obj, View view);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ArrayList<String> mo2985a(ArrayList<View> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = arrayList.get(i);
            arrayList2.add(C5071v.m9211w(view));
            C5071v.m9164a(view, (String) null);
        }
        return arrayList2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2987a(View view, ArrayList<View> arrayList, ArrayList<View> arrayList2, ArrayList<String> arrayList3, Map<String, String> map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i = 0; i < size; i++) {
            View view2 = arrayList.get(i);
            String w = C5071v.m9211w(view2);
            arrayList4.add(w);
            if (w != null) {
                C5071v.m9164a(view2, (String) null);
                String str = map.get(w);
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        break;
                    } else if (str.equals(arrayList3.get(i2))) {
                        C5071v.m9164a(arrayList2.get(i2), w);
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        C5068s.m9132a(view, new C0499a(this, size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2990a(ArrayList<View> arrayList, View view) {
        if (view.getVisibility() != 0) {
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (C5084x.m9259a(viewGroup)) {
                arrayList.add(viewGroup);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                mo2990a(arrayList, viewGroup.getChildAt(i));
            }
            return;
        }
        arrayList.add(view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2991a(Map<String, View> map, View view) {
        if (view.getVisibility() == 0) {
            String w = C5071v.m9211w(view);
            if (w != null) {
                map.put(w, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    mo2991a(map, viewGroup.getChildAt(i));
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2988a(View view, ArrayList<View> arrayList, Map<String, String> map) {
        C5068s.m9132a(view, new C0500b(this, arrayList, map));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2989a(ViewGroup viewGroup, ArrayList<View> arrayList, Map<String, String> map) {
        C5068s.m9132a(viewGroup, new C0501c(this, arrayList, map));
    }

    /* renamed from: a */
    protected static void m2502a(List<View> list, View view) {
        int size = list.size();
        if (!m2504a(list, view, size)) {
            list.add(view);
            for (int i = size; i < list.size(); i++) {
                View view2 = list.get(i);
                if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (!m2504a(list, childAt, size)) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m2504a(List<View> list, View view, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (list.get(i2) == view) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    protected static boolean m2503a(List list) {
        return list == null || list.isEmpty();
    }

    /* renamed from: a */
    static String m2501a(Map<String, String> map, String str) {
        for (Map.Entry next : map.entrySet()) {
            if (str.equals(next.getValue())) {
                return (String) next.getKey();
            }
        }
        return null;
    }
}
