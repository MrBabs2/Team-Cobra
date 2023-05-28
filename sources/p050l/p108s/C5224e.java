package p050l.p108s;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0498p;
import java.util.ArrayList;
import java.util.List;
import p050l.p108s.C5247m;

@SuppressLint({"RestrictedApi"})
/* renamed from: l.s.e */
/* compiled from: FragmentTransitionSupport */
public class C5224e extends C0498p {

    /* renamed from: l.s.e$a */
    /* compiled from: FragmentTransitionSupport */
    class C5225a extends C5247m.C5252e {

        /* renamed from: a */
        final /* synthetic */ Rect f9259a;

        C5225a(C5224e eVar, Rect rect) {
            this.f9259a = rect;
        }
    }

    /* renamed from: l.s.e$b */
    /* compiled from: FragmentTransitionSupport */
    class C5226b implements C5247m.C5253f {

        /* renamed from: a */
        final /* synthetic */ View f9260a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f9261b;

        C5226b(C5224e eVar, View view, ArrayList arrayList) {
            this.f9260a = view;
            this.f9261b = arrayList;
        }

        /* renamed from: a */
        public void mo18047a(C5247m mVar) {
        }

        /* renamed from: b */
        public void mo18025b(C5247m mVar) {
        }

        /* renamed from: c */
        public void mo18026c(C5247m mVar) {
            mVar.mo18086b((C5247m.C5253f) this);
            this.f9260a.setVisibility(8);
            int size = this.f9261b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f9261b.get(i)).setVisibility(0);
            }
        }

        /* renamed from: d */
        public void mo18027d(C5247m mVar) {
        }

        /* renamed from: e */
        public void mo18028e(C5247m mVar) {
        }
    }

    /* renamed from: l.s.e$c */
    /* compiled from: FragmentTransitionSupport */
    class C5227c extends C5255n {

        /* renamed from: a */
        final /* synthetic */ Object f9262a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f9263b;

        /* renamed from: c */
        final /* synthetic */ Object f9264c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f9265d;

        /* renamed from: e */
        final /* synthetic */ Object f9266e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f9267f;

        C5227c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f9262a = obj;
            this.f9263b = arrayList;
            this.f9264c = obj2;
            this.f9265d = arrayList2;
            this.f9266e = obj3;
            this.f9267f = arrayList3;
        }

        /* renamed from: a */
        public void mo18047a(C5247m mVar) {
            Object obj = this.f9262a;
            if (obj != null) {
                C5224e.this.mo2964a(obj, (ArrayList<View>) this.f9263b, (ArrayList<View>) null);
            }
            Object obj2 = this.f9264c;
            if (obj2 != null) {
                C5224e.this.mo2964a(obj2, (ArrayList<View>) this.f9265d, (ArrayList<View>) null);
            }
            Object obj3 = this.f9266e;
            if (obj3 != null) {
                C5224e.this.mo2964a(obj3, (ArrayList<View>) this.f9267f, (ArrayList<View>) null);
            }
        }

        /* renamed from: c */
        public void mo18026c(C5247m mVar) {
            mVar.mo18086b((C5247m.C5253f) this);
        }
    }

    /* renamed from: l.s.e$d */
    /* compiled from: FragmentTransitionSupport */
    class C5228d extends C5247m.C5252e {

        /* renamed from: a */
        final /* synthetic */ Rect f9269a;

        C5228d(C5224e eVar, Rect rect) {
            this.f9269a = rect;
        }
    }

    /* renamed from: a */
    public boolean mo2965a(Object obj) {
        return obj instanceof C5247m;
    }

    /* renamed from: b */
    public Object mo2966b(Object obj) {
        if (obj != null) {
            return ((C5247m) obj).clone();
        }
        return null;
    }

    /* renamed from: c */
    public Object mo2971c(Object obj) {
        if (obj == null) {
            return null;
        }
        C5260q qVar = new C5260q();
        qVar.mo18120a((C5247m) obj);
        return qVar;
    }

    /* renamed from: a */
    public void mo2963a(Object obj, ArrayList<View> arrayList) {
        C5247m mVar = (C5247m) obj;
        if (mVar != null) {
            int i = 0;
            if (mVar instanceof C5260q) {
                C5260q qVar = (C5260q) mVar;
                int u = qVar.mo18122u();
                while (i < u) {
                    mo2963a((Object) qVar.mo18119a(i), arrayList);
                    i++;
                }
            } else if (!m9729a(mVar) && C0498p.m2503a((List) mVar.mo18106n())) {
                int size = arrayList.size();
                while (i < size) {
                    mVar.mo18074a(arrayList.get(i));
                    i++;
                }
            }
        }
    }

    /* renamed from: b */
    public void mo2969b(Object obj, View view, ArrayList<View> arrayList) {
        C5260q qVar = (C5260q) obj;
        List<View> n = qVar.mo18106n();
        n.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0498p.m2502a(n, arrayList.get(i));
        }
        n.add(view);
        arrayList.add(view);
        mo2963a((Object) qVar, arrayList);
    }

    /* renamed from: c */
    public void mo2972c(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            mo2986a(view, rect);
            ((C5247m) obj).mo18082a((C5247m.C5252e) new C5225a(this, rect));
        }
    }

    /* renamed from: b */
    public Object mo2967b(Object obj, Object obj2, Object obj3) {
        C5260q qVar = new C5260q();
        if (obj != null) {
            qVar.mo18120a((C5247m) obj);
        }
        if (obj2 != null) {
            qVar.mo18120a((C5247m) obj2);
        }
        if (obj3 != null) {
            qVar.mo18120a((C5247m) obj3);
        }
        return qVar;
    }

    /* renamed from: a */
    private static boolean m9729a(C5247m mVar) {
        return !C0498p.m2503a((List) mVar.mo18103k()) || !C0498p.m2503a((List) mVar.mo18104l()) || !C0498p.m2503a((List) mVar.mo18105m());
    }

    /* renamed from: b */
    public void mo2970b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        C5260q qVar = (C5260q) obj;
        if (qVar != null) {
            qVar.mo18106n().clear();
            qVar.mo18106n().addAll(arrayList2);
            mo2964a((Object) qVar, arrayList, arrayList2);
        }
    }

    /* renamed from: a */
    public void mo2961a(Object obj, View view, ArrayList<View> arrayList) {
        ((C5247m) obj).mo18075a((C5247m.C5253f) new C5226b(this, view, arrayList));
    }

    /* renamed from: a */
    public Object mo2957a(Object obj, Object obj2, Object obj3) {
        C5247m mVar = (C5247m) obj;
        C5247m mVar2 = (C5247m) obj2;
        C5247m mVar3 = (C5247m) obj3;
        if (mVar != null && mVar2 != null) {
            C5260q qVar = new C5260q();
            qVar.mo18120a(mVar);
            qVar.mo18120a(mVar2);
            qVar.mo18121b(1);
            mVar = qVar;
        } else if (mVar == null) {
            mVar = mVar2 != null ? mVar2 : null;
        }
        if (mVar3 == null) {
            return mVar;
        }
        C5260q qVar2 = new C5260q();
        if (mVar != null) {
            qVar2.mo18120a(mVar);
        }
        qVar2.mo18120a(mVar3);
        return qVar2;
    }

    /* renamed from: b */
    public void mo2968b(Object obj, View view) {
        if (obj != null) {
            ((C5247m) obj).mo18095d(view);
        }
    }

    /* renamed from: a */
    public void mo2958a(ViewGroup viewGroup, Object obj) {
        C5256o.m9865a(viewGroup, (C5247m) obj);
    }

    /* renamed from: a */
    public void mo2962a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((C5247m) obj).mo18075a((C5247m.C5253f) new C5227c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    /* renamed from: a */
    public void mo2964a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        int i;
        C5247m mVar = (C5247m) obj;
        int i2 = 0;
        if (mVar instanceof C5260q) {
            C5260q qVar = (C5260q) mVar;
            int u = qVar.mo18122u();
            while (i2 < u) {
                mo2964a((Object) qVar.mo18119a(i2), arrayList, arrayList2);
                i2++;
            }
        } else if (!m9729a(mVar)) {
            List<View> n = mVar.mo18106n();
            if (n.size() == arrayList.size() && n.containsAll(arrayList)) {
                if (arrayList2 == null) {
                    i = 0;
                } else {
                    i = arrayList2.size();
                }
                while (i2 < i) {
                    mVar.mo18074a(arrayList2.get(i2));
                    i2++;
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    mVar.mo18095d(arrayList.get(size));
                }
            }
        }
    }

    /* renamed from: a */
    public void mo2960a(Object obj, View view) {
        if (obj != null) {
            ((C5247m) obj).mo18074a(view);
        }
    }

    /* renamed from: a */
    public void mo2959a(Object obj, Rect rect) {
        if (obj != null) {
            ((C5247m) obj).mo18082a((C5247m.C5252e) new C5228d(this, rect));
        }
    }
}
