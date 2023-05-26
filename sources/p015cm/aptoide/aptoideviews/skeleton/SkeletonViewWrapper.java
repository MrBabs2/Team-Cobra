package p015cm.aptoide.aptoideviews.skeleton;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016R\u000e\u0010\t\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, mo16641d2 = {"Lcm/aptoide/aptoideviews/skeleton/SkeletonViewWrapper;", "Lcm/aptoide/aptoideviews/skeleton/Skeleton;", "view", "Landroid/view/View;", "parent", "Landroid/view/ViewGroup;", "skeletonLayoutResId", "", "(Landroid/view/View;Landroid/view/ViewGroup;I)V", "skeletonView", "getView", "()Landroid/view/View;", "showOriginal", "", "showSkeleton", "aptoide-views_prodRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.aptoideviews.skeleton.SkeletonViewWrapper */
/* compiled from: SkeletonViewWrapper.kt */
public final class SkeletonViewWrapper implements Skeleton {
    private final View skeletonView;
    private final View view;

    public SkeletonViewWrapper(View view2, ViewGroup viewGroup, int i) {
        C10202j.m34178b(view2, "view");
        C10202j.m34178b(viewGroup, "parent");
        this.view = view2;
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
        C10202j.m34174a((Object) inflate, "LayoutInflater.from(pare…youtResId, parent, false)");
        this.skeletonView = inflate;
        viewGroup.addView(inflate);
    }

    public final View getView() {
        return this.view;
    }

    public void showOriginal() {
        this.skeletonView.setVisibility(8);
        this.view.setVisibility(0);
    }

    public void showSkeleton() {
        this.view.setVisibility(8);
        this.skeletonView.setVisibility(0);
    }
}
