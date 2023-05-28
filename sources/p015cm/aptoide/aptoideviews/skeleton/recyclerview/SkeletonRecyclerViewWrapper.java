package p015cm.aptoide.aptoideviews.skeleton.recyclerview;

import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.aptoideviews.skeleton.Skeleton;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016R0\u0010\b\u001a$\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\n0\n\u0018\u0001 \u000b*\u000b\u0012\u0002\b\u0003\u0018\u00010\t¨\u0006\u00010\t¨\u0006\u0001X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, mo16641d2 = {"Lcm/aptoide/aptoideviews/skeleton/recyclerview/SkeletonRecyclerViewWrapper;", "Lcm/aptoide/aptoideviews/skeleton/Skeleton;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "listItemLayoutResId", "", "itemCount", "(Landroidx/recyclerview/widget/RecyclerView;II)V", "originalAdapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "kotlin.jvm.PlatformType", "skeletonAdapter", "Lcm/aptoide/aptoideviews/skeleton/recyclerview/SkeletonAdapter;", "showOriginal", "", "showSkeleton", "aptoide-views_prodRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.aptoideviews.skeleton.recyclerview.SkeletonRecyclerViewWrapper */
/* compiled from: SkeletonRecyclerViewWrapper.kt */
public final class SkeletonRecyclerViewWrapper implements Skeleton {
    private final RecyclerView.C0633g<RecyclerView.C0629c0> originalAdapter;
    private final RecyclerView recyclerView;
    private final SkeletonAdapter skeletonAdapter;

    public SkeletonRecyclerViewWrapper(RecyclerView recyclerView2, int i, int i2) {
        C10202j.m34178b(recyclerView2, "recyclerView");
        this.recyclerView = recyclerView2;
        this.originalAdapter = recyclerView2.getAdapter();
        this.skeletonAdapter = new SkeletonAdapter(i, i2);
    }

    public void showOriginal() {
        RecyclerView.C0644o layoutManager;
        RecyclerView.C0644o layoutManager2 = this.recyclerView.getLayoutManager();
        Parcelable onSaveInstanceState = layoutManager2 != null ? layoutManager2.onSaveInstanceState() : null;
        this.recyclerView.setAdapter(this.originalAdapter);
        if (onSaveInstanceState != null && (layoutManager = this.recyclerView.getLayoutManager()) != null) {
            layoutManager.onRestoreInstanceState(onSaveInstanceState);
        }
    }

    public void showSkeleton() {
        this.recyclerView.setAdapter(this.skeletonAdapter);
    }
}
