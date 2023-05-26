package p050l.p108s;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p050l.p066e.C4868a;
import p050l.p075h.p084l.C5071v;
import p050l.p108s.C5247m;

/* renamed from: l.s.o */
/* compiled from: TransitionManager */
public class C5256o {

    /* renamed from: a */
    private static C5247m f9350a = new C5203b();

    /* renamed from: b */
    private static ThreadLocal<WeakReference<C4868a<ViewGroup, ArrayList<C5247m>>>> f9351b = new ThreadLocal<>();

    /* renamed from: c */
    static ArrayList<ViewGroup> f9352c = new ArrayList<>();

    /* renamed from: l.s.o$a */
    /* compiled from: TransitionManager */
    private static class C5257a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: f */
        C5247m f9353f;

        /* renamed from: g */
        ViewGroup f9354g;

        /* renamed from: l.s.o$a$a */
        /* compiled from: TransitionManager */
        class C5258a extends C5255n {

            /* renamed from: a */
            final /* synthetic */ C4868a f9355a;

            C5258a(C4868a aVar) {
                this.f9355a = aVar;
            }

            /* renamed from: c */
            public void mo18026c(C5247m mVar) {
                ((ArrayList) this.f9355a.get(C5257a.this.f9354g)).remove(mVar);
                mVar.mo18086b((C5247m.C5253f) this);
            }
        }

        C5257a(C5247m mVar, ViewGroup viewGroup) {
            this.f9353f = mVar;
            this.f9354g = viewGroup;
        }

        /* renamed from: a */
        private void m9868a() {
            this.f9354g.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f9354g.removeOnAttachStateChangeListener(this);
        }

        public boolean onPreDraw() {
            m9868a();
            if (!C5256o.f9352c.remove(this.f9354g)) {
                return true;
            }
            C4868a<ViewGroup, ArrayList<C5247m>> a = C5256o.m9864a();
            ArrayList arrayList = a.get(this.f9354g);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                a.put(this.f9354g, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f9353f);
            this.f9353f.mo18075a((C5247m.C5253f) new C5258a(a));
            this.f9353f.mo18080a(this.f9354g, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((C5247m) it.next()).mo18097e(this.f9354g);
                }
            }
            this.f9353f.mo18078a(this.f9354g);
            return true;
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            m9868a();
            C5256o.f9352c.remove(this.f9354g);
            ArrayList arrayList = C5256o.m9864a().get(this.f9354g);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C5247m) it.next()).mo18097e(this.f9354g);
                }
            }
            this.f9353f.mo18084a(true);
        }
    }

    /* renamed from: a */
    static C4868a<ViewGroup, ArrayList<C5247m>> m9864a() {
        C4868a<ViewGroup, ArrayList<C5247m>> aVar;
        WeakReference weakReference = f9351b.get();
        if (weakReference != null && (aVar = (C4868a) weakReference.get()) != null) {
            return aVar;
        }
        C4868a<ViewGroup, ArrayList<C5247m>> aVar2 = new C4868a<>();
        f9351b.set(new WeakReference(aVar2));
        return aVar2;
    }

    /* renamed from: b */
    private static void m9866b(ViewGroup viewGroup, C5247m mVar) {
        if (mVar != null && viewGroup != null) {
            C5257a aVar = new C5257a(mVar, viewGroup);
            viewGroup.addOnAttachStateChangeListener(aVar);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
        }
    }

    /* renamed from: c */
    private static void m9867c(ViewGroup viewGroup, C5247m mVar) {
        ArrayList arrayList = m9864a().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C5247m) it.next()).mo18092c((View) viewGroup);
            }
        }
        if (mVar != null) {
            mVar.mo18080a(viewGroup, true);
        }
        C5245l a = C5245l.m9799a(viewGroup);
        if (a != null) {
            a.mo18068a();
        }
    }

    /* renamed from: a */
    public static void m9865a(ViewGroup viewGroup, C5247m mVar) {
        if (!f9352c.contains(viewGroup) && C5071v.m9140E(viewGroup)) {
            f9352c.add(viewGroup);
            if (mVar == null) {
                mVar = f9350a;
            }
            C5247m clone = mVar.clone();
            m9867c(viewGroup, clone);
            C5245l.m9800a(viewGroup, (C5245l) null);
            m9866b(viewGroup, clone);
        }
    }
}
