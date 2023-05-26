package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.r */
/* compiled from: SnapHelper */
public abstract class C0718r extends RecyclerView.C0651r {
    static final float MILLISECONDS_PER_INCH = 100.0f;
    private Scroller mGravityScroller;
    RecyclerView mRecyclerView;
    private final RecyclerView.C0653t mScrollListener = new C0719a();

    /* renamed from: androidx.recyclerview.widget.r$a */
    /* compiled from: SnapHelper */
    class C0719a extends RecyclerView.C0653t {

        /* renamed from: a */
        boolean f2709a = false;

        C0719a() {
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0 && this.f2709a) {
                this.f2709a = false;
                C0718r.this.snapToTargetExistingView();
            }
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            if (i != 0 || i2 != 0) {
                this.f2709a = true;
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.r$b */
    /* compiled from: SnapHelper */
    class C0720b extends C0706j {
        C0720b(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return C0718r.MILLISECONDS_PER_INCH / ((float) displayMetrics.densityDpi);
        }

        /* access modifiers changed from: protected */
        public void onTargetFound(View view, RecyclerView.C0662z zVar, RecyclerView.C0659y.C0660a aVar) {
            C0718r rVar = C0718r.this;
            RecyclerView recyclerView = rVar.mRecyclerView;
            if (recyclerView != null) {
                int[] calculateDistanceToFinalSnap = rVar.calculateDistanceToFinalSnap(recyclerView.getLayoutManager(), view);
                int i = calculateDistanceToFinalSnap[0];
                int i2 = calculateDistanceToFinalSnap[1];
                int calculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
                if (calculateTimeForDeceleration > 0) {
                    aVar.mo4038a(i, i2, calculateTimeForDeceleration, this.mDecelerateInterpolator);
                }
            }
        }
    }

    private void destroyCallbacks() {
        this.mRecyclerView.removeOnScrollListener(this.mScrollListener);
        this.mRecyclerView.setOnFlingListener((RecyclerView.C0651r) null);
    }

    private void setupCallbacks() throws IllegalStateException {
        if (this.mRecyclerView.getOnFlingListener() == null) {
            this.mRecyclerView.addOnScrollListener(this.mScrollListener);
            this.mRecyclerView.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException("An instance of OnFlingListener already set.");
    }

    private boolean snapFromFling(RecyclerView.C0644o oVar, int i, int i2) {
        RecyclerView.C0659y createScroller;
        int findTargetSnapPosition;
        if (!(oVar instanceof RecyclerView.C0659y.C0661b) || (createScroller = createScroller(oVar)) == null || (findTargetSnapPosition = findTargetSnapPosition(oVar, i, i2)) == -1) {
            return false;
        }
        createScroller.setTargetPosition(findTargetSnapPosition);
        oVar.startSmoothScroll(createScroller);
        return true;
    }

    public void attachToRecyclerView(RecyclerView recyclerView) throws IllegalStateException {
        RecyclerView recyclerView2 = this.mRecyclerView;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                destroyCallbacks();
            }
            this.mRecyclerView = recyclerView;
            if (recyclerView != null) {
                setupCallbacks();
                this.mGravityScroller = new Scroller(this.mRecyclerView.getContext(), new DecelerateInterpolator());
                snapToTargetExistingView();
            }
        }
    }

    public abstract int[] calculateDistanceToFinalSnap(RecyclerView.C0644o oVar, View view);

    public int[] calculateScrollDistance(int i, int i2) {
        this.mGravityScroller.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return new int[]{this.mGravityScroller.getFinalX(), this.mGravityScroller.getFinalY()};
    }

    /* access modifiers changed from: protected */
    public RecyclerView.C0659y createScroller(RecyclerView.C0644o oVar) {
        return createSnapScroller(oVar);
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public C0706j createSnapScroller(RecyclerView.C0644o oVar) {
        if (!(oVar instanceof RecyclerView.C0659y.C0661b)) {
            return null;
        }
        return new C0720b(this.mRecyclerView.getContext());
    }

    public abstract View findSnapView(RecyclerView.C0644o oVar);

    public abstract int findTargetSnapPosition(RecyclerView.C0644o oVar, int i, int i2);

    public boolean onFling(int i, int i2) {
        RecyclerView.C0644o layoutManager = this.mRecyclerView.getLayoutManager();
        if (layoutManager == null || this.mRecyclerView.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.mRecyclerView.getMinFlingVelocity();
        if ((Math.abs(i2) > minFlingVelocity || Math.abs(i) > minFlingVelocity) && snapFromFling(layoutManager, i, i2)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void snapToTargetExistingView() {
        RecyclerView.C0644o layoutManager;
        View findSnapView;
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (findSnapView = findSnapView(layoutManager)) != null) {
            int[] calculateDistanceToFinalSnap = calculateDistanceToFinalSnap(layoutManager, findSnapView);
            if (calculateDistanceToFinalSnap[0] != 0 || calculateDistanceToFinalSnap[1] != 0) {
                this.mRecyclerView.smoothScrollBy(calculateDistanceToFinalSnap[0], calculateDistanceToFinalSnap[1]);
            }
        }
    }
}
