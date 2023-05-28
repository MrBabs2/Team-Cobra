package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.q */
/* compiled from: SimpleItemAnimator */
public abstract class C0717q extends RecyclerView.C0638l {
    private static final boolean DEBUG = false;
    private static final String TAG = "SimpleItemAnimator";
    boolean mSupportsChangeAnimations = true;

    public abstract boolean animateAdd(RecyclerView.C0629c0 c0Var);

    public boolean animateAppearance(RecyclerView.C0629c0 c0Var, RecyclerView.C0638l.C0641c cVar, RecyclerView.C0638l.C0641c cVar2) {
        if (cVar == null || (cVar.f2450a == cVar2.f2450a && cVar.f2451b == cVar2.f2451b)) {
            return animateAdd(c0Var);
        }
        return animateMove(c0Var, cVar.f2450a, cVar.f2451b, cVar2.f2450a, cVar2.f2451b);
    }

    public abstract boolean animateChange(RecyclerView.C0629c0 c0Var, RecyclerView.C0629c0 c0Var2, int i, int i2, int i3, int i4);

    public boolean animateChange(RecyclerView.C0629c0 c0Var, RecyclerView.C0629c0 c0Var2, RecyclerView.C0638l.C0641c cVar, RecyclerView.C0638l.C0641c cVar2) {
        int i;
        int i2;
        int i3 = cVar.f2450a;
        int i4 = cVar.f2451b;
        if (c0Var2.shouldIgnore()) {
            int i5 = cVar.f2450a;
            i = cVar.f2451b;
            i2 = i5;
        } else {
            i2 = cVar2.f2450a;
            i = cVar2.f2451b;
        }
        return animateChange(c0Var, c0Var2, i3, i4, i2, i);
    }

    public boolean animateDisappearance(RecyclerView.C0629c0 c0Var, RecyclerView.C0638l.C0641c cVar, RecyclerView.C0638l.C0641c cVar2) {
        int i = cVar.f2450a;
        int i2 = cVar.f2451b;
        View view = c0Var.itemView;
        int left = cVar2 == null ? view.getLeft() : cVar2.f2450a;
        int top = cVar2 == null ? view.getTop() : cVar2.f2451b;
        if (c0Var.isRemoved() || (i == left && i2 == top)) {
            return animateRemove(c0Var);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return animateMove(c0Var, i, i2, left, top);
    }

    public abstract boolean animateMove(RecyclerView.C0629c0 c0Var, int i, int i2, int i3, int i4);

    public boolean animatePersistence(RecyclerView.C0629c0 c0Var, RecyclerView.C0638l.C0641c cVar, RecyclerView.C0638l.C0641c cVar2) {
        if (cVar.f2450a == cVar2.f2450a && cVar.f2451b == cVar2.f2451b) {
            dispatchMoveFinished(c0Var);
            return false;
        }
        return animateMove(c0Var, cVar.f2450a, cVar.f2451b, cVar2.f2450a, cVar2.f2451b);
    }

    public abstract boolean animateRemove(RecyclerView.C0629c0 c0Var);

    public boolean canReuseUpdatedViewHolder(RecyclerView.C0629c0 c0Var) {
        return !this.mSupportsChangeAnimations || c0Var.isInvalid();
    }

    public final void dispatchAddFinished(RecyclerView.C0629c0 c0Var) {
        onAddFinished(c0Var);
        dispatchAnimationFinished(c0Var);
    }

    public final void dispatchAddStarting(RecyclerView.C0629c0 c0Var) {
        onAddStarting(c0Var);
    }

    public final void dispatchChangeFinished(RecyclerView.C0629c0 c0Var, boolean z) {
        onChangeFinished(c0Var, z);
        dispatchAnimationFinished(c0Var);
    }

    public final void dispatchChangeStarting(RecyclerView.C0629c0 c0Var, boolean z) {
        onChangeStarting(c0Var, z);
    }

    public final void dispatchMoveFinished(RecyclerView.C0629c0 c0Var) {
        onMoveFinished(c0Var);
        dispatchAnimationFinished(c0Var);
    }

    public final void dispatchMoveStarting(RecyclerView.C0629c0 c0Var) {
        onMoveStarting(c0Var);
    }

    public final void dispatchRemoveFinished(RecyclerView.C0629c0 c0Var) {
        onRemoveFinished(c0Var);
        dispatchAnimationFinished(c0Var);
    }

    public final void dispatchRemoveStarting(RecyclerView.C0629c0 c0Var) {
        onRemoveStarting(c0Var);
    }

    public boolean getSupportsChangeAnimations() {
        return this.mSupportsChangeAnimations;
    }

    public void onAddFinished(RecyclerView.C0629c0 c0Var) {
    }

    public void onAddStarting(RecyclerView.C0629c0 c0Var) {
    }

    public void onChangeFinished(RecyclerView.C0629c0 c0Var, boolean z) {
    }

    public void onChangeStarting(RecyclerView.C0629c0 c0Var, boolean z) {
    }

    public void onMoveFinished(RecyclerView.C0629c0 c0Var) {
    }

    public void onMoveStarting(RecyclerView.C0629c0 c0Var) {
    }

    public void onRemoveFinished(RecyclerView.C0629c0 c0Var) {
    }

    public void onRemoveStarting(RecyclerView.C0629c0 c0Var) {
    }

    public void setSupportsChangeAnimations(boolean z) {
        this.mSupportsChangeAnimations = z;
    }
}
