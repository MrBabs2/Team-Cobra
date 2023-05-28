package p015cm.aptoide.p016pt.home.bundles.appcoins;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.text.DecimalFormat;
import kotlin.C4789l;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.aptoideviews.skeleton.Skeleton;
import p015cm.aptoide.aptoideviews.skeleton.SkeletonUtils;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Type;
import p015cm.aptoide.p016pt.home.bundles.base.AppBundle;
import p015cm.aptoide.p016pt.home.bundles.base.AppBundleViewHolder;
import p015cm.aptoide.p016pt.home.bundles.base.HomeBundle;
import p015cm.aptoide.p016pt.home.bundles.base.HomeEvent;
import p015cm.aptoide.p016pt.utils.AptoideUtils;
import p123rx.p127s.C12871b;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\u001a\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, mo16641d2 = {"Lcm/aptoide/pt/home/bundles/appcoins/EarnAppCoinsViewHolder;", "Lcm/aptoide/pt/home/bundles/base/AppBundleViewHolder;", "view", "Landroid/view/View;", "decimalFormatter", "Ljava/text/DecimalFormat;", "uiEventsListener", "Lrx/subjects/PublishSubject;", "Lcm/aptoide/pt/home/bundles/base/HomeEvent;", "(Landroid/view/View;Ljava/text/DecimalFormat;Lrx/subjects/PublishSubject;)V", "adapter", "Lcm/aptoide/pt/home/bundles/appcoins/EarnAppCoinsListAdapter;", "skeleton", "Lcm/aptoide/aptoideviews/skeleton/Skeleton;", "getUiEventsListener", "()Lrx/subjects/PublishSubject;", "getView", "()Landroid/view/View;", "setBundle", "", "homeBundle", "Lcm/aptoide/pt/home/bundles/base/HomeBundle;", "position", "", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.home.bundles.appcoins.EarnAppCoinsViewHolder */
/* compiled from: EarnAppCoinsViewHolder.kt */
public final class EarnAppCoinsViewHolder extends AppBundleViewHolder {
    private EarnAppCoinsListAdapter adapter;
    private Skeleton skeleton;
    private final C12871b<HomeEvent> uiEventsListener;
    private final View view;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EarnAppCoinsViewHolder(View view2, DecimalFormat decimalFormat, C12871b<HomeEvent> bVar) {
        super(view2);
        C10202j.m34178b(view2, "view");
        C10202j.m34178b(decimalFormat, "decimalFormatter");
        C10202j.m34178b(bVar, "uiEventsListener");
        this.view = view2;
        this.uiEventsListener = bVar;
        this.adapter = new EarnAppCoinsListAdapter(decimalFormat, bVar);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.view.getContext(), 0, false);
        View view3 = this.itemView;
        C10202j.m34174a((Object) view3, "itemView");
        ((RecyclerView) view3.findViewById(C1086R.C1088id.apps_list)).addItemDecoration(new RecyclerView.C0643n() {
            public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0662z zVar) {
                C10202j.m34178b(rect, "outRect");
                C10202j.m34178b(view, "view");
                C10202j.m34178b(recyclerView, "parent");
                C10202j.m34178b(zVar, "state");
                int pixelsForDip = AptoideUtils.ScreenU.getPixelsForDip(8, view.getResources());
                rect.set(pixelsForDip, pixelsForDip, 0, AptoideUtils.ScreenU.getPixelsForDip(4, view.getResources()));
            }
        });
        View view4 = this.itemView;
        C10202j.m34174a((Object) view4, "itemView");
        RecyclerView recyclerView = (RecyclerView) view4.findViewById(C1086R.C1088id.apps_list);
        C10202j.m34174a((Object) recyclerView, "itemView.apps_list");
        recyclerView.setLayoutManager(linearLayoutManager);
        View view5 = this.itemView;
        C10202j.m34174a((Object) view5, "itemView");
        RecyclerView recyclerView2 = (RecyclerView) view5.findViewById(C1086R.C1088id.apps_list);
        C10202j.m34174a((Object) recyclerView2, "itemView.apps_list");
        recyclerView2.setAdapter(this.adapter);
        View view6 = this.itemView;
        C10202j.m34174a((Object) view6, "itemView");
        RecyclerView recyclerView3 = (RecyclerView) view6.findViewById(C1086R.C1088id.apps_list);
        C10202j.m34174a((Object) recyclerView3, "itemView.apps_list");
        recyclerView3.setNestedScrollingEnabled(false);
        View view7 = this.itemView;
        C10202j.m34174a((Object) view7, "itemView");
        ((RecyclerView) view7.findViewById(C1086R.C1088id.apps_list)).setHasFixedSize(true);
        Context context = this.view.getContext();
        C10202j.m34174a((Object) context, "view.context");
        Resources resources = context.getResources();
        Object systemService = this.view.getContext().getSystemService("window");
        if (systemService != null) {
            View view8 = this.itemView;
            C10202j.m34174a((Object) view8, "itemView");
            RecyclerView recyclerView4 = (RecyclerView) view8.findViewById(C1086R.C1088id.apps_list);
            C10202j.m34174a((Object) recyclerView4, "itemView.apps_list");
            this.skeleton = SkeletonUtils.applySkeleton(recyclerView4, (int) C1086R.layout.earn_appcoins_item_skeleton, Type.APPCOINS_ADS.getPerLineCount(resources, (WindowManager) systemService) * 3);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.WindowManager");
    }

    public final C12871b<HomeEvent> getUiEventsListener() {
        return this.uiEventsListener;
    }

    public final View getView() {
        return this.view;
    }

    public void setBundle(HomeBundle homeBundle, int i) {
        if (homeBundle instanceof AppBundle) {
            AppBundle appBundle = (AppBundle) homeBundle;
            if (appBundle.getContent() == null) {
                Skeleton skeleton2 = this.skeleton;
                if (skeleton2 != null) {
                    skeleton2.showSkeleton();
                    return;
                }
                return;
            }
            Skeleton skeleton3 = this.skeleton;
            if (skeleton3 != null) {
                skeleton3.showOriginal();
            }
            this.adapter.updateBundle(appBundle, i);
            View view2 = this.itemView;
            C10202j.m34174a((Object) view2, "itemView");
            ((RecyclerView) view2.findViewById(C1086R.C1088id.apps_list)).addOnScrollListener(new EarnAppCoinsViewHolder$setBundle$1(this, homeBundle));
            this.itemView.setOnClickListener(new EarnAppCoinsViewHolder$setBundle$2(this, homeBundle));
            View view3 = this.itemView;
            C10202j.m34174a((Object) view3, "itemView");
            ((Button) view3.findViewById(C1086R.C1088id.see_more_btn)).setOnClickListener(new EarnAppCoinsViewHolder$setBundle$3(this, homeBundle));
            return;
        }
        throw new IllegalStateException(EarnAppCoinsViewHolder.class.getName() + " is getting non AppBundle instance!");
    }
}
