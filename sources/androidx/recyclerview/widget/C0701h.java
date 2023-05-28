package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.core.p004os.C0420a;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* renamed from: androidx.recyclerview.widget.h */
/* compiled from: GapWorker */
final class C0701h implements Runnable {

    /* renamed from: j */
    static final ThreadLocal<C0701h> f2677j = new ThreadLocal<>();

    /* renamed from: k */
    static Comparator<C0704c> f2678k = new C0702a();

    /* renamed from: f */
    ArrayList<RecyclerView> f2679f = new ArrayList<>();

    /* renamed from: g */
    long f2680g;

    /* renamed from: h */
    long f2681h;

    /* renamed from: i */
    private ArrayList<C0704c> f2682i = new ArrayList<>();

    /* renamed from: androidx.recyclerview.widget.h$a */
    /* compiled from: GapWorker */
    static class C0702a implements Comparator<C0704c> {
        C0702a() {
        }

        /* renamed from: a */
        public int compare(C0704c cVar, C0704c cVar2) {
            if ((cVar.f2690d == null) == (cVar2.f2690d == null)) {
                boolean z = cVar.f2687a;
                if (z == cVar2.f2687a) {
                    int i = cVar2.f2688b - cVar.f2688b;
                    if (i != 0) {
                        return i;
                    }
                    int i2 = cVar.f2689c - cVar2.f2689c;
                    if (i2 != 0) {
                        return i2;
                    }
                    return 0;
                } else if (z) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (cVar.f2690d == null) {
                return 1;
            } else {
                return -1;
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.h$c */
    /* compiled from: GapWorker */
    static class C0704c {

        /* renamed from: a */
        public boolean f2687a;

        /* renamed from: b */
        public int f2688b;

        /* renamed from: c */
        public int f2689c;

        /* renamed from: d */
        public RecyclerView f2690d;

        /* renamed from: e */
        public int f2691e;

        C0704c() {
        }

        /* renamed from: a */
        public void mo4230a() {
            this.f2687a = false;
            this.f2688b = 0;
            this.f2689c = 0;
            this.f2690d = null;
            this.f2691e = 0;
        }
    }

    C0701h() {
    }

    /* renamed from: a */
    public void mo4220a(RecyclerView recyclerView) {
        this.f2679f.add(recyclerView);
    }

    /* renamed from: b */
    public void mo4222b(RecyclerView recyclerView) {
        this.f2679f.remove(recyclerView);
    }

    public void run() {
        try {
            C0420a.m2042a("RV Prefetch");
            if (!this.f2679f.isEmpty()) {
                int size = this.f2679f.size();
                long j = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = this.f2679f.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    mo4219a(TimeUnit.MILLISECONDS.toNanos(j) + this.f2681h);
                    this.f2680g = 0;
                    C0420a.m2041a();
                }
            }
        } finally {
            this.f2680g = 0;
            C0420a.m2041a();
        }
    }

    /* renamed from: b */
    private void m3311b(long j) {
        int i = 0;
        while (i < this.f2682i.size()) {
            C0704c cVar = this.f2682i.get(i);
            if (cVar.f2690d != null) {
                m3309a(cVar, j);
                cVar.mo4230a();
                i++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4221a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.f2680g == 0) {
            this.f2680g = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.mPrefetchRegistry.mo4229b(i, i2);
    }

    /* renamed from: a */
    private void m3307a() {
        C0704c cVar;
        int size = this.f2679f.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView = this.f2679f.get(i2);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.mPrefetchRegistry.mo4227a(recyclerView, false);
                i += recyclerView.mPrefetchRegistry.f2686d;
            }
        }
        this.f2682i.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView2 = this.f2679f.get(i4);
            if (recyclerView2.getWindowVisibility() == 0) {
                C0703b bVar = recyclerView2.mPrefetchRegistry;
                int abs = Math.abs(bVar.f2683a) + Math.abs(bVar.f2684b);
                for (int i5 = 0; i5 < bVar.f2686d * 2; i5 += 2) {
                    if (i3 >= this.f2682i.size()) {
                        cVar = new C0704c();
                        this.f2682i.add(cVar);
                    } else {
                        cVar = this.f2682i.get(i3);
                    }
                    int i6 = bVar.f2685c[i5 + 1];
                    cVar.f2687a = i6 <= abs;
                    cVar.f2688b = abs;
                    cVar.f2689c = i6;
                    cVar.f2690d = recyclerView2;
                    cVar.f2691e = bVar.f2685c[i5];
                    i3++;
                }
            }
        }
        Collections.sort(this.f2682i, f2678k);
    }

    @SuppressLint({"VisibleForTests"})
    /* renamed from: androidx.recyclerview.widget.h$b */
    /* compiled from: GapWorker */
    static class C0703b implements RecyclerView.C0644o.C0647c {

        /* renamed from: a */
        int f2683a;

        /* renamed from: b */
        int f2684b;

        /* renamed from: c */
        int[] f2685c;

        /* renamed from: d */
        int f2686d;

        C0703b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4227a(RecyclerView recyclerView, boolean z) {
            this.f2686d = 0;
            int[] iArr = this.f2685c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.C0644o oVar = recyclerView.mLayout;
            if (recyclerView.mAdapter != null && oVar != null && oVar.isItemPrefetchEnabled()) {
                if (z) {
                    if (!recyclerView.mAdapterHelper.mo4133c()) {
                        oVar.collectInitialPrefetchPositions(recyclerView.mAdapter.getItemCount(), this);
                    }
                } else if (!recyclerView.hasPendingAdapterUpdates()) {
                    oVar.collectAdjacentPrefetchPositions(this.f2683a, this.f2684b, recyclerView.mState, this);
                }
                int i = this.f2686d;
                if (i > oVar.mPrefetchMaxCountObserved) {
                    oVar.mPrefetchMaxCountObserved = i;
                    oVar.mPrefetchMaxObservedInInitialPrefetch = z;
                    recyclerView.mRecycler.mo4015j();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4229b(int i, int i2) {
            this.f2683a = i;
            this.f2684b = i2;
        }

        /* renamed from: a */
        public void mo3957a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (i2 >= 0) {
                int i3 = this.f2686d * 2;
                int[] iArr = this.f2685c;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.f2685c = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i3 >= iArr.length) {
                    int[] iArr3 = new int[(i3 * 2)];
                    this.f2685c = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.f2685c;
                iArr4[i3] = i;
                iArr4[i3 + 1] = i2;
                this.f2686d++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo4228a(int i) {
            if (this.f2685c != null) {
                int i2 = this.f2686d * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.f2685c[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4226a() {
            int[] iArr = this.f2685c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f2686d = 0;
        }
    }

    /* renamed from: a */
    static boolean m3310a(RecyclerView recyclerView, int i) {
        int b = recyclerView.mChildHelper.mo4154b();
        for (int i2 = 0; i2 < b; i2++) {
            RecyclerView.C0629c0 childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.mo4160d(i2));
            if (childViewHolderInt.mPosition == i && !childViewHolderInt.isInvalid()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private RecyclerView.C0629c0 m3306a(RecyclerView recyclerView, int i, long j) {
        if (m3310a(recyclerView, i)) {
            return null;
        }
        RecyclerView.C0656v vVar = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            RecyclerView.C0629c0 a = vVar.mo3983a(i, false, j);
            if (a != null) {
                if (!a.isBound() || a.isInvalid()) {
                    vVar.mo3991a(a, false);
                } else {
                    vVar.mo3998b(a.itemView);
                }
            }
            return a;
        } finally {
            recyclerView.onExitLayoutOrScroll(false);
        }
    }

    /* renamed from: a */
    private void m3308a(RecyclerView recyclerView, long j) {
        if (recyclerView != null) {
            if (recyclerView.mDataSetHasChangedAfterLayout && recyclerView.mChildHelper.mo4154b() != 0) {
                recyclerView.removeAndRecycleViews();
            }
            C0703b bVar = recyclerView.mPrefetchRegistry;
            bVar.mo4227a(recyclerView, true);
            if (bVar.f2686d != 0) {
                try {
                    C0420a.m2042a("RV Nested Prefetch");
                    recyclerView.mState.mo4043a(recyclerView.mAdapter);
                    for (int i = 0; i < bVar.f2686d * 2; i += 2) {
                        m3306a(recyclerView, bVar.f2685c[i], j);
                    }
                } finally {
                    C0420a.m2041a();
                }
            }
        }
    }

    /* renamed from: a */
    private void m3309a(C0704c cVar, long j) {
        RecyclerView.C0629c0 a = m3306a(cVar.f2690d, cVar.f2691e, cVar.f2687a ? Long.MAX_VALUE : j);
        if (a != null && a.mNestedRecyclerView != null && a.isBound() && !a.isInvalid()) {
            m3308a((RecyclerView) a.mNestedRecyclerView.get(), j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo4219a(long j) {
        m3307a();
        m3311b(j);
    }
}
