package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p050l.p075h.p084l.C5071v;

/* renamed from: androidx.recyclerview.widget.e */
/* compiled from: DefaultItemAnimator */
public class C0677e extends C0717q {
    private static final boolean DEBUG = false;
    private static TimeInterpolator sDefaultInterpolator;
    ArrayList<RecyclerView.C0629c0> mAddAnimations = new ArrayList<>();
    ArrayList<ArrayList<RecyclerView.C0629c0>> mAdditionsList = new ArrayList<>();
    ArrayList<RecyclerView.C0629c0> mChangeAnimations = new ArrayList<>();
    ArrayList<ArrayList<C0686i>> mChangesList = new ArrayList<>();
    ArrayList<RecyclerView.C0629c0> mMoveAnimations = new ArrayList<>();
    ArrayList<ArrayList<C0687j>> mMovesList = new ArrayList<>();
    private ArrayList<RecyclerView.C0629c0> mPendingAdditions = new ArrayList<>();
    private ArrayList<C0686i> mPendingChanges = new ArrayList<>();
    private ArrayList<C0687j> mPendingMoves = new ArrayList<>();
    private ArrayList<RecyclerView.C0629c0> mPendingRemovals = new ArrayList<>();
    ArrayList<RecyclerView.C0629c0> mRemoveAnimations = new ArrayList<>();

    /* renamed from: androidx.recyclerview.widget.e$a */
    /* compiled from: DefaultItemAnimator */
    class C0678a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ ArrayList f2582f;

        C0678a(ArrayList arrayList) {
            this.f2582f = arrayList;
        }

        public void run() {
            Iterator it = this.f2582f.iterator();
            while (it.hasNext()) {
                C0687j jVar = (C0687j) it.next();
                C0677e.this.animateMoveImpl(jVar.f2616a, jVar.f2617b, jVar.f2618c, jVar.f2619d, jVar.f2620e);
            }
            this.f2582f.clear();
            C0677e.this.mMovesList.remove(this.f2582f);
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$b */
    /* compiled from: DefaultItemAnimator */
    class C0679b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ ArrayList f2584f;

        C0679b(ArrayList arrayList) {
            this.f2584f = arrayList;
        }

        public void run() {
            Iterator it = this.f2584f.iterator();
            while (it.hasNext()) {
                C0677e.this.animateChangeImpl((C0686i) it.next());
            }
            this.f2584f.clear();
            C0677e.this.mChangesList.remove(this.f2584f);
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$c */
    /* compiled from: DefaultItemAnimator */
    class C0680c implements Runnable {

        /* renamed from: f */
        final /* synthetic */ ArrayList f2586f;

        C0680c(ArrayList arrayList) {
            this.f2586f = arrayList;
        }

        public void run() {
            Iterator it = this.f2586f.iterator();
            while (it.hasNext()) {
                C0677e.this.animateAddImpl((RecyclerView.C0629c0) it.next());
            }
            this.f2586f.clear();
            C0677e.this.mAdditionsList.remove(this.f2586f);
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$d */
    /* compiled from: DefaultItemAnimator */
    class C0681d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ RecyclerView.C0629c0 f2588a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f2589b;

        /* renamed from: c */
        final /* synthetic */ View f2590c;

        C0681d(RecyclerView.C0629c0 c0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f2588a = c0Var;
            this.f2589b = viewPropertyAnimator;
            this.f2590c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f2589b.setListener((Animator.AnimatorListener) null);
            this.f2590c.setAlpha(1.0f);
            C0677e.this.dispatchRemoveFinished(this.f2588a);
            C0677e.this.mRemoveAnimations.remove(this.f2588a);
            C0677e.this.dispatchFinishedWhenDone();
        }

        public void onAnimationStart(Animator animator) {
            C0677e.this.dispatchRemoveStarting(this.f2588a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$e */
    /* compiled from: DefaultItemAnimator */
    class C0682e extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ RecyclerView.C0629c0 f2592a;

        /* renamed from: b */
        final /* synthetic */ View f2593b;

        /* renamed from: c */
        final /* synthetic */ ViewPropertyAnimator f2594c;

        C0682e(RecyclerView.C0629c0 c0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f2592a = c0Var;
            this.f2593b = view;
            this.f2594c = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            this.f2593b.setAlpha(1.0f);
        }

        public void onAnimationEnd(Animator animator) {
            this.f2594c.setListener((Animator.AnimatorListener) null);
            C0677e.this.dispatchAddFinished(this.f2592a);
            C0677e.this.mAddAnimations.remove(this.f2592a);
            C0677e.this.dispatchFinishedWhenDone();
        }

        public void onAnimationStart(Animator animator) {
            C0677e.this.dispatchAddStarting(this.f2592a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$f */
    /* compiled from: DefaultItemAnimator */
    class C0683f extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ RecyclerView.C0629c0 f2596a;

        /* renamed from: b */
        final /* synthetic */ int f2597b;

        /* renamed from: c */
        final /* synthetic */ View f2598c;

        /* renamed from: d */
        final /* synthetic */ int f2599d;

        /* renamed from: e */
        final /* synthetic */ ViewPropertyAnimator f2600e;

        C0683f(RecyclerView.C0629c0 c0Var, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
            this.f2596a = c0Var;
            this.f2597b = i;
            this.f2598c = view;
            this.f2599d = i2;
            this.f2600e = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            if (this.f2597b != 0) {
                this.f2598c.setTranslationX(0.0f);
            }
            if (this.f2599d != 0) {
                this.f2598c.setTranslationY(0.0f);
            }
        }

        public void onAnimationEnd(Animator animator) {
            this.f2600e.setListener((Animator.AnimatorListener) null);
            C0677e.this.dispatchMoveFinished(this.f2596a);
            C0677e.this.mMoveAnimations.remove(this.f2596a);
            C0677e.this.dispatchFinishedWhenDone();
        }

        public void onAnimationStart(Animator animator) {
            C0677e.this.dispatchMoveStarting(this.f2596a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$g */
    /* compiled from: DefaultItemAnimator */
    class C0684g extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C0686i f2602a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f2603b;

        /* renamed from: c */
        final /* synthetic */ View f2604c;

        C0684g(C0686i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f2602a = iVar;
            this.f2603b = viewPropertyAnimator;
            this.f2604c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f2603b.setListener((Animator.AnimatorListener) null);
            this.f2604c.setAlpha(1.0f);
            this.f2604c.setTranslationX(0.0f);
            this.f2604c.setTranslationY(0.0f);
            C0677e.this.dispatchChangeFinished(this.f2602a.f2610a, true);
            C0677e.this.mChangeAnimations.remove(this.f2602a.f2610a);
            C0677e.this.dispatchFinishedWhenDone();
        }

        public void onAnimationStart(Animator animator) {
            C0677e.this.dispatchChangeStarting(this.f2602a.f2610a, true);
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$h */
    /* compiled from: DefaultItemAnimator */
    class C0685h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C0686i f2606a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f2607b;

        /* renamed from: c */
        final /* synthetic */ View f2608c;

        C0685h(C0686i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f2606a = iVar;
            this.f2607b = viewPropertyAnimator;
            this.f2608c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f2607b.setListener((Animator.AnimatorListener) null);
            this.f2608c.setAlpha(1.0f);
            this.f2608c.setTranslationX(0.0f);
            this.f2608c.setTranslationY(0.0f);
            C0677e.this.dispatchChangeFinished(this.f2606a.f2611b, false);
            C0677e.this.mChangeAnimations.remove(this.f2606a.f2611b);
            C0677e.this.dispatchFinishedWhenDone();
        }

        public void onAnimationStart(Animator animator) {
            C0677e.this.dispatchChangeStarting(this.f2606a.f2611b, false);
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$j */
    /* compiled from: DefaultItemAnimator */
    private static class C0687j {

        /* renamed from: a */
        public RecyclerView.C0629c0 f2616a;

        /* renamed from: b */
        public int f2617b;

        /* renamed from: c */
        public int f2618c;

        /* renamed from: d */
        public int f2619d;

        /* renamed from: e */
        public int f2620e;

        C0687j(RecyclerView.C0629c0 c0Var, int i, int i2, int i3, int i4) {
            this.f2616a = c0Var;
            this.f2617b = i;
            this.f2618c = i2;
            this.f2619d = i3;
            this.f2620e = i4;
        }
    }

    private void animateRemoveImpl(RecyclerView.C0629c0 c0Var) {
        View view = c0Var.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.mRemoveAnimations.add(c0Var);
        animate.setDuration(getRemoveDuration()).alpha(0.0f).setListener(new C0681d(c0Var, animate, view)).start();
    }

    private void endChangeAnimation(List<C0686i> list, RecyclerView.C0629c0 c0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C0686i iVar = list.get(size);
            if (endChangeAnimationIfNecessary(iVar, c0Var) && iVar.f2610a == null && iVar.f2611b == null) {
                list.remove(iVar);
            }
        }
    }

    private void endChangeAnimationIfNecessary(C0686i iVar) {
        RecyclerView.C0629c0 c0Var = iVar.f2610a;
        if (c0Var != null) {
            endChangeAnimationIfNecessary(iVar, c0Var);
        }
        RecyclerView.C0629c0 c0Var2 = iVar.f2611b;
        if (c0Var2 != null) {
            endChangeAnimationIfNecessary(iVar, c0Var2);
        }
    }

    private void resetAnimation(RecyclerView.C0629c0 c0Var) {
        if (sDefaultInterpolator == null) {
            sDefaultInterpolator = new ValueAnimator().getInterpolator();
        }
        c0Var.itemView.animate().setInterpolator(sDefaultInterpolator);
        endAnimation(c0Var);
    }

    public boolean animateAdd(RecyclerView.C0629c0 c0Var) {
        resetAnimation(c0Var);
        c0Var.itemView.setAlpha(0.0f);
        this.mPendingAdditions.add(c0Var);
        return true;
    }

    /* access modifiers changed from: package-private */
    public void animateAddImpl(RecyclerView.C0629c0 c0Var) {
        View view = c0Var.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.mAddAnimations.add(c0Var);
        animate.alpha(1.0f).setDuration(getAddDuration()).setListener(new C0682e(c0Var, view, animate)).start();
    }

    public boolean animateChange(RecyclerView.C0629c0 c0Var, RecyclerView.C0629c0 c0Var2, int i, int i2, int i3, int i4) {
        if (c0Var == c0Var2) {
            return animateMove(c0Var, i, i2, i3, i4);
        }
        float translationX = c0Var.itemView.getTranslationX();
        float translationY = c0Var.itemView.getTranslationY();
        float alpha = c0Var.itemView.getAlpha();
        resetAnimation(c0Var);
        int i5 = (int) (((float) (i3 - i)) - translationX);
        int i6 = (int) (((float) (i4 - i2)) - translationY);
        c0Var.itemView.setTranslationX(translationX);
        c0Var.itemView.setTranslationY(translationY);
        c0Var.itemView.setAlpha(alpha);
        if (c0Var2 != null) {
            resetAnimation(c0Var2);
            c0Var2.itemView.setTranslationX((float) (-i5));
            c0Var2.itemView.setTranslationY((float) (-i6));
            c0Var2.itemView.setAlpha(0.0f);
        }
        this.mPendingChanges.add(new C0686i(c0Var, c0Var2, i, i2, i3, i4));
        return true;
    }

    /* access modifiers changed from: package-private */
    public void animateChangeImpl(C0686i iVar) {
        View view;
        RecyclerView.C0629c0 c0Var = iVar.f2610a;
        View view2 = null;
        if (c0Var == null) {
            view = null;
        } else {
            view = c0Var.itemView;
        }
        RecyclerView.C0629c0 c0Var2 = iVar.f2611b;
        if (c0Var2 != null) {
            view2 = c0Var2.itemView;
        }
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(getChangeDuration());
            this.mChangeAnimations.add(iVar.f2610a);
            duration.translationX((float) (iVar.f2614e - iVar.f2612c));
            duration.translationY((float) (iVar.f2615f - iVar.f2613d));
            duration.alpha(0.0f).setListener(new C0684g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            this.mChangeAnimations.add(iVar.f2611b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(getChangeDuration()).alpha(1.0f).setListener(new C0685h(iVar, animate, view2)).start();
        }
    }

    public boolean animateMove(RecyclerView.C0629c0 c0Var, int i, int i2, int i3, int i4) {
        View view = c0Var.itemView;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) c0Var.itemView.getTranslationY());
        resetAnimation(c0Var);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            dispatchMoveFinished(c0Var);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX((float) (-i5));
        }
        if (i6 != 0) {
            view.setTranslationY((float) (-i6));
        }
        this.mPendingMoves.add(new C0687j(c0Var, translationX, translationY, i3, i4));
        return true;
    }

    /* access modifiers changed from: package-private */
    public void animateMoveImpl(RecyclerView.C0629c0 c0Var, int i, int i2, int i3, int i4) {
        View view = c0Var.itemView;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i5 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i6 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.mMoveAnimations.add(c0Var);
        animate.setDuration(getMoveDuration()).setListener(new C0683f(c0Var, i5, view, i6, animate)).start();
    }

    public boolean animateRemove(RecyclerView.C0629c0 c0Var) {
        resetAnimation(c0Var);
        this.mPendingRemovals.add(c0Var);
        return true;
    }

    public boolean canReuseUpdatedViewHolder(RecyclerView.C0629c0 c0Var, List<Object> list) {
        return !list.isEmpty() || super.canReuseUpdatedViewHolder(c0Var, list);
    }

    /* access modifiers changed from: package-private */
    public void cancelAll(List<RecyclerView.C0629c0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).itemView.animate().cancel();
        }
    }

    /* access modifiers changed from: package-private */
    public void dispatchFinishedWhenDone() {
        if (!isRunning()) {
            dispatchAnimationsFinished();
        }
    }

    public void endAnimation(RecyclerView.C0629c0 c0Var) {
        View view = c0Var.itemView;
        view.animate().cancel();
        int size = this.mPendingMoves.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.mPendingMoves.get(size).f2616a == c0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                dispatchMoveFinished(c0Var);
                this.mPendingMoves.remove(size);
            }
        }
        endChangeAnimation(this.mPendingChanges, c0Var);
        if (this.mPendingRemovals.remove(c0Var)) {
            view.setAlpha(1.0f);
            dispatchRemoveFinished(c0Var);
        }
        if (this.mPendingAdditions.remove(c0Var)) {
            view.setAlpha(1.0f);
            dispatchAddFinished(c0Var);
        }
        for (int size2 = this.mChangesList.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = this.mChangesList.get(size2);
            endChangeAnimation(arrayList, c0Var);
            if (arrayList.isEmpty()) {
                this.mChangesList.remove(size2);
            }
        }
        for (int size3 = this.mMovesList.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = this.mMovesList.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((C0687j) arrayList2.get(size4)).f2616a == c0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    dispatchMoveFinished(c0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.mMovesList.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.mAdditionsList.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = this.mAdditionsList.get(size5);
            if (arrayList3.remove(c0Var)) {
                view.setAlpha(1.0f);
                dispatchAddFinished(c0Var);
                if (arrayList3.isEmpty()) {
                    this.mAdditionsList.remove(size5);
                }
            }
        }
        this.mRemoveAnimations.remove(c0Var);
        this.mAddAnimations.remove(c0Var);
        this.mChangeAnimations.remove(c0Var);
        this.mMoveAnimations.remove(c0Var);
        dispatchFinishedWhenDone();
    }

    public void endAnimations() {
        int size = this.mPendingMoves.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C0687j jVar = this.mPendingMoves.get(size);
            View view = jVar.f2616a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            dispatchMoveFinished(jVar.f2616a);
            this.mPendingMoves.remove(size);
        }
        for (int size2 = this.mPendingRemovals.size() - 1; size2 >= 0; size2--) {
            dispatchRemoveFinished(this.mPendingRemovals.get(size2));
            this.mPendingRemovals.remove(size2);
        }
        int size3 = this.mPendingAdditions.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.C0629c0 c0Var = this.mPendingAdditions.get(size3);
            c0Var.itemView.setAlpha(1.0f);
            dispatchAddFinished(c0Var);
            this.mPendingAdditions.remove(size3);
        }
        for (int size4 = this.mPendingChanges.size() - 1; size4 >= 0; size4--) {
            endChangeAnimationIfNecessary(this.mPendingChanges.get(size4));
        }
        this.mPendingChanges.clear();
        if (isRunning()) {
            for (int size5 = this.mMovesList.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = this.mMovesList.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    C0687j jVar2 = (C0687j) arrayList.get(size6);
                    View view2 = jVar2.f2616a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    dispatchMoveFinished(jVar2.f2616a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.mMovesList.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.mAdditionsList.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = this.mAdditionsList.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.C0629c0 c0Var2 = (RecyclerView.C0629c0) arrayList2.get(size8);
                    c0Var2.itemView.setAlpha(1.0f);
                    dispatchAddFinished(c0Var2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.mAdditionsList.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.mChangesList.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = this.mChangesList.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    endChangeAnimationIfNecessary((C0686i) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.mChangesList.remove(arrayList3);
                    }
                }
            }
            cancelAll(this.mRemoveAnimations);
            cancelAll(this.mMoveAnimations);
            cancelAll(this.mAddAnimations);
            cancelAll(this.mChangeAnimations);
            dispatchAnimationsFinished();
        }
    }

    public boolean isRunning() {
        return !this.mPendingAdditions.isEmpty() || !this.mPendingChanges.isEmpty() || !this.mPendingMoves.isEmpty() || !this.mPendingRemovals.isEmpty() || !this.mMoveAnimations.isEmpty() || !this.mRemoveAnimations.isEmpty() || !this.mAddAnimations.isEmpty() || !this.mChangeAnimations.isEmpty() || !this.mMovesList.isEmpty() || !this.mAdditionsList.isEmpty() || !this.mChangesList.isEmpty();
    }

    public void runPendingAnimations() {
        boolean z = !this.mPendingRemovals.isEmpty();
        boolean z2 = !this.mPendingMoves.isEmpty();
        boolean z3 = !this.mPendingChanges.isEmpty();
        boolean z4 = !this.mPendingAdditions.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator<RecyclerView.C0629c0> it = this.mPendingRemovals.iterator();
            while (it.hasNext()) {
                animateRemoveImpl(it.next());
            }
            this.mPendingRemovals.clear();
            if (z2) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.mPendingMoves);
                this.mMovesList.add(arrayList);
                this.mPendingMoves.clear();
                C0678a aVar = new C0678a(arrayList);
                if (z) {
                    C5071v.m9163a(((C0687j) arrayList.get(0)).f2616a.itemView, (Runnable) aVar, getRemoveDuration());
                } else {
                    aVar.run();
                }
            }
            if (z3) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.mPendingChanges);
                this.mChangesList.add(arrayList2);
                this.mPendingChanges.clear();
                C0679b bVar = new C0679b(arrayList2);
                if (z) {
                    C5071v.m9163a(((C0686i) arrayList2.get(0)).f2610a.itemView, (Runnable) bVar, getRemoveDuration());
                } else {
                    bVar.run();
                }
            }
            if (z4) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.mPendingAdditions);
                this.mAdditionsList.add(arrayList3);
                this.mPendingAdditions.clear();
                C0680c cVar = new C0680c(arrayList3);
                if (z || z2 || z3) {
                    long j = 0;
                    long removeDuration = z ? getRemoveDuration() : 0;
                    long moveDuration = z2 ? getMoveDuration() : 0;
                    if (z3) {
                        j = getChangeDuration();
                    }
                    C5071v.m9163a(((RecyclerView.C0629c0) arrayList3.get(0)).itemView, (Runnable) cVar, removeDuration + Math.max(moveDuration, j));
                    return;
                }
                cVar.run();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$i */
    /* compiled from: DefaultItemAnimator */
    private static class C0686i {

        /* renamed from: a */
        public RecyclerView.C0629c0 f2610a;

        /* renamed from: b */
        public RecyclerView.C0629c0 f2611b;

        /* renamed from: c */
        public int f2612c;

        /* renamed from: d */
        public int f2613d;

        /* renamed from: e */
        public int f2614e;

        /* renamed from: f */
        public int f2615f;

        private C0686i(RecyclerView.C0629c0 c0Var, RecyclerView.C0629c0 c0Var2) {
            this.f2610a = c0Var;
            this.f2611b = c0Var2;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f2610a + ", newHolder=" + this.f2611b + ", fromX=" + this.f2612c + ", fromY=" + this.f2613d + ", toX=" + this.f2614e + ", toY=" + this.f2615f + '}';
        }

        C0686i(RecyclerView.C0629c0 c0Var, RecyclerView.C0629c0 c0Var2, int i, int i2, int i3, int i4) {
            this(c0Var, c0Var2);
            this.f2612c = i;
            this.f2613d = i2;
            this.f2614e = i3;
            this.f2615f = i4;
        }
    }

    private boolean endChangeAnimationIfNecessary(C0686i iVar, RecyclerView.C0629c0 c0Var) {
        boolean z = false;
        if (iVar.f2611b == c0Var) {
            iVar.f2611b = null;
        } else if (iVar.f2610a != c0Var) {
            return false;
        } else {
            iVar.f2610a = null;
            z = true;
        }
        c0Var.itemView.setAlpha(1.0f);
        c0Var.itemView.setTranslationX(0.0f);
        c0Var.itemView.setTranslationY(0.0f);
        dispatchChangeFinished(c0Var, z);
        return true;
    }
}
