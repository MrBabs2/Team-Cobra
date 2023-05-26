package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.fragment.app.o */
/* compiled from: FragmentTransitionCompat21 */
class C0493o extends C0498p {

    /* renamed from: androidx.fragment.app.o$a */
    /* compiled from: FragmentTransitionCompat21 */
    class C0494a extends Transition.EpicenterCallback {

        /* renamed from: a */
        final /* synthetic */ Rect f2113a;

        C0494a(C0493o oVar, Rect rect) {
            this.f2113a = rect;
        }

        public Rect onGetEpicenter(Transition transition) {
            return this.f2113a;
        }
    }

    /* renamed from: androidx.fragment.app.o$b */
    /* compiled from: FragmentTransitionCompat21 */
    class C0495b implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ View f2114a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f2115b;

        C0495b(C0493o oVar, View view, ArrayList arrayList) {
            this.f2114a = view;
            this.f2115b = arrayList;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f2114a.setVisibility(8);
            int size = this.f2115b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f2115b.get(i)).setVisibility(0);
            }
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
        }
    }

    /* renamed from: androidx.fragment.app.o$c */
    /* compiled from: FragmentTransitionCompat21 */
    class C0496c implements Transition.TransitionListener {

        /* renamed from: a */
        final /* synthetic */ Object f2116a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f2117b;

        /* renamed from: c */
        final /* synthetic */ Object f2118c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f2119d;

        /* renamed from: e */
        final /* synthetic */ Object f2120e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f2121f;

        C0496c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f2116a = obj;
            this.f2117b = arrayList;
            this.f2118c = obj2;
            this.f2119d = arrayList2;
            this.f2120e = obj3;
            this.f2121f = arrayList3;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
            Object obj = this.f2116a;
            if (obj != null) {
                C0493o.this.mo2964a(obj, (ArrayList<View>) this.f2117b, (ArrayList<View>) null);
            }
            Object obj2 = this.f2118c;
            if (obj2 != null) {
                C0493o.this.mo2964a(obj2, (ArrayList<View>) this.f2119d, (ArrayList<View>) null);
            }
            Object obj3 = this.f2120e;
            if (obj3 != null) {
                C0493o.this.mo2964a(obj3, (ArrayList<View>) this.f2121f, (ArrayList<View>) null);
            }
        }
    }

    /* renamed from: androidx.fragment.app.o$d */
    /* compiled from: FragmentTransitionCompat21 */
    class C0497d extends Transition.EpicenterCallback {

        /* renamed from: a */
        final /* synthetic */ Rect f2123a;

        C0497d(C0493o oVar, Rect rect) {
            this.f2123a = rect;
        }

        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f2123a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f2123a;
        }
    }

    C0493o() {
    }

    /* renamed from: a */
    public boolean mo2965a(Object obj) {
        return obj instanceof Transition;
    }

    /* renamed from: b */
    public Object mo2966b(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    /* renamed from: c */
    public Object mo2971c(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    /* renamed from: a */
    public void mo2963a(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            int i = 0;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int transitionCount = transitionSet.getTransitionCount();
                while (i < transitionCount) {
                    mo2963a((Object) transitionSet.getTransitionAt(i), arrayList);
                    i++;
                }
            } else if (!m2484a(transition) && C0498p.m2503a((List) transition.getTargets())) {
                int size = arrayList.size();
                while (i < size) {
                    transition.addTarget(arrayList.get(i));
                    i++;
                }
            }
        }
    }

    /* renamed from: b */
    public void mo2969b(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0498p.m2502a((List<View>) targets, arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        mo2963a((Object) transitionSet, arrayList);
    }

    /* renamed from: c */
    public void mo2972c(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            mo2986a(view, rect);
            ((Transition) obj).setEpicenterCallback(new C0494a(this, rect));
        }
    }

    /* renamed from: b */
    public Object mo2967b(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    /* renamed from: a */
    private static boolean m2484a(Transition transition) {
        return !C0498p.m2503a((List) transition.getTargetIds()) || !C0498p.m2503a((List) transition.getTargetNames()) || !C0498p.m2503a((List) transition.getTargetTypes());
    }

    /* renamed from: b */
    public void mo2970b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            mo2964a((Object) transitionSet, arrayList, arrayList2);
        }
    }

    /* renamed from: a */
    public void mo2961a(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new C0495b(this, view, arrayList));
    }

    /* renamed from: a */
    public Object mo2957a(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
        transitionSet.addTransition(transition3);
        return transitionSet;
    }

    /* renamed from: b */
    public void mo2968b(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    /* renamed from: a */
    public void mo2958a(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    /* renamed from: a */
    public void mo2962a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new C0496c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    /* renamed from: a */
    public void mo2964a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        int i;
        Transition transition = (Transition) obj;
        int i2 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i2 < transitionCount) {
                mo2964a((Object) transitionSet.getTransitionAt(i2), arrayList, arrayList2);
                i2++;
            }
        } else if (!m2484a(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            if (arrayList2 == null) {
                i = 0;
            } else {
                i = arrayList2.size();
            }
            while (i2 < i) {
                transition.addTarget(arrayList2.get(i2));
                i2++;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                transition.removeTarget(arrayList.get(size));
            }
        }
    }

    /* renamed from: a */
    public void mo2960a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    /* renamed from: a */
    public void mo2959a(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new C0497d(this, rect));
        }
    }
}
