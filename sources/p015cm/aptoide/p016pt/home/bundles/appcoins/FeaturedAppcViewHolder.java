package p015cm.aptoide.p016pt.home.bundles.appcoins;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import kotlin.C4789l;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.aptoideviews.appcoins.BonusAppcView;
import p015cm.aptoide.aptoideviews.common.StringUtilsKt;
import p015cm.aptoide.aptoideviews.skeleton.Skeleton;
import p015cm.aptoide.aptoideviews.skeleton.SkeletonUtils;
import p015cm.aptoide.aptoideviews.skeleton.SkeletonView;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Type;
import p015cm.aptoide.p016pt.home.bundles.base.AppBundleViewHolder;
import p015cm.aptoide.p016pt.home.bundles.base.FeaturedAppcBundle;
import p015cm.aptoide.p016pt.home.bundles.base.HomeBundle;
import p015cm.aptoide.p016pt.home.bundles.base.HomeEvent;
import p015cm.aptoide.p016pt.utils.AptoideUtils;
import p015cm.aptoide.p016pt.view.app.Application;
import p123rx.p127s.C12871b;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\u001a\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001cH\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, mo16641d2 = {"Lcm/aptoide/pt/home/bundles/appcoins/FeaturedAppcViewHolder;", "Lcm/aptoide/pt/home/bundles/base/AppBundleViewHolder;", "view", "Landroid/view/View;", "oneDecimalFormatter", "Ljava/text/DecimalFormat;", "uiEventsListener", "Lrx/subjects/PublishSubject;", "Lcm/aptoide/pt/home/bundles/base/HomeEvent;", "(Landroid/view/View;Ljava/text/DecimalFormat;Lrx/subjects/PublishSubject;)V", "appsInBundleAdapter", "Lcm/aptoide/pt/home/bundles/appcoins/FeaturedAppcBundleAdapter;", "getOneDecimalFormatter", "()Ljava/text/DecimalFormat;", "skeleton", "Lcm/aptoide/aptoideviews/skeleton/Skeleton;", "getUiEventsListener", "()Lrx/subjects/PublishSubject;", "getView", "()Landroid/view/View;", "setBundle", "", "homeBundle", "Lcm/aptoide/pt/home/bundles/base/HomeBundle;", "position", "", "toggleSkeleton", "showSkeleton", "", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.home.bundles.appcoins.FeaturedAppcViewHolder */
/* compiled from: FeaturedAppcViewHolder.kt */
public final class FeaturedAppcViewHolder extends AppBundleViewHolder {
    private final FeaturedAppcBundleAdapter appsInBundleAdapter = new FeaturedAppcBundleAdapter(new ArrayList(), this.oneDecimalFormatter, this.uiEventsListener);
    private final DecimalFormat oneDecimalFormatter;
    private Skeleton skeleton;
    private final C12871b<HomeEvent> uiEventsListener;
    private final View view;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FeaturedAppcViewHolder(View view2, DecimalFormat decimalFormat, C12871b<HomeEvent> bVar) {
        super(view2);
        C10202j.m34178b(view2, "view");
        C10202j.m34178b(decimalFormat, "oneDecimalFormatter");
        C10202j.m34178b(bVar, "uiEventsListener");
        this.view = view2;
        this.oneDecimalFormatter = decimalFormat;
        this.uiEventsListener = bVar;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.view.getContext(), 0, false);
        View view3 = this.itemView;
        C10202j.m34174a((Object) view3, "itemView");
        ((RecyclerView) view3.findViewById(C1086R.C1088id.apps_list)).addItemDecoration(new RecyclerView.C0643n() {
            public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0662z zVar) {
                C10202j.m34178b(rect, "outRect");
                C10202j.m34178b(view, "view");
                C10202j.m34178b(recyclerView, "parent");
                C10202j.m34178b(zVar, "state");
                int pixelsForDip = AptoideUtils.ScreenU.getPixelsForDip(5, view.getResources());
                rect.set(pixelsForDip, pixelsForDip, 0, pixelsForDip);
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
        recyclerView2.setAdapter(this.appsInBundleAdapter);
        View view6 = this.itemView;
        C10202j.m34174a((Object) view6, "itemView");
        RecyclerView recyclerView3 = (RecyclerView) view6.findViewById(C1086R.C1088id.apps_list);
        C10202j.m34174a((Object) recyclerView3, "itemView.apps_list");
        recyclerView3.setNestedScrollingEnabled(false);
        Context context = this.view.getContext();
        C10202j.m34174a((Object) context, "view.context");
        Resources resources = context.getResources();
        Object systemService = this.view.getContext().getSystemService("window");
        if (systemService != null) {
            View view7 = this.itemView;
            C10202j.m34174a((Object) view7, "itemView");
            RecyclerView recyclerView4 = (RecyclerView) view7.findViewById(C1086R.C1088id.apps_list);
            C10202j.m34174a((Object) recyclerView4, "itemView.apps_list");
            this.skeleton = SkeletonUtils.applySkeleton(recyclerView4, (int) C1086R.layout.app_home_item_skeleton, Type.APPS_GROUP.getPerLineCount(resources, (WindowManager) systemService) * 3);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.WindowManager");
    }

    private final void toggleSkeleton(boolean z) {
        if (z) {
            Skeleton skeleton2 = this.skeleton;
            if (skeleton2 != null) {
                skeleton2.showSkeleton();
            }
            View view2 = this.itemView;
            C10202j.m34174a((Object) view2, "itemView");
            SkeletonView skeletonView = (SkeletonView) view2.findViewById(C1086R.C1088id.title_skeletonview);
            C10202j.m34174a((Object) skeletonView, "itemView.title_skeletonview");
            skeletonView.setVisibility(0);
            View view3 = this.itemView;
            C10202j.m34174a((Object) view3, "itemView");
            TextView textView = (TextView) view3.findViewById(C1086R.C1088id.title);
            C10202j.m34174a((Object) textView, "itemView.title");
            textView.setVisibility(4);
            View view4 = this.itemView;
            C10202j.m34174a((Object) view4, "itemView");
            SkeletonView skeletonView2 = (SkeletonView) view4.findViewById(C1086R.C1088id.description_skeletonview);
            C10202j.m34174a((Object) skeletonView2, "itemView.description_skeletonview");
            skeletonView2.setVisibility(0);
            View view5 = this.itemView;
            C10202j.m34174a((Object) view5, "itemView");
            TextView textView2 = (TextView) view5.findViewById(C1086R.C1088id.description);
            C10202j.m34174a((Object) textView2, "itemView.description");
            textView2.setVisibility(4);
            View view6 = this.itemView;
            C10202j.m34174a((Object) view6, "itemView");
            BonusAppcView bonusAppcView = (BonusAppcView) view6.findViewById(C1086R.C1088id.bonus_appc_view);
            C10202j.m34174a((Object) bonusAppcView, "itemView.bonus_appc_view");
            bonusAppcView.setVisibility(4);
            View view7 = this.itemView;
            C10202j.m34174a((Object) view7, "itemView");
            SkeletonView skeletonView3 = (SkeletonView) view7.findViewById(C1086R.C1088id.bonus_appc_skeleton_view);
            C10202j.m34174a((Object) skeletonView3, "itemView.bonus_appc_skeleton_view");
            skeletonView3.setVisibility(0);
            return;
        }
        Skeleton skeleton3 = this.skeleton;
        if (skeleton3 != null) {
            skeleton3.showOriginal();
        }
        View view8 = this.itemView;
        C10202j.m34174a((Object) view8, "itemView");
        SkeletonView skeletonView4 = (SkeletonView) view8.findViewById(C1086R.C1088id.title_skeletonview);
        C10202j.m34174a((Object) skeletonView4, "itemView.title_skeletonview");
        skeletonView4.setVisibility(4);
        View view9 = this.itemView;
        C10202j.m34174a((Object) view9, "itemView");
        TextView textView3 = (TextView) view9.findViewById(C1086R.C1088id.title);
        C10202j.m34174a((Object) textView3, "itemView.title");
        textView3.setVisibility(0);
        View view10 = this.itemView;
        C10202j.m34174a((Object) view10, "itemView");
        SkeletonView skeletonView5 = (SkeletonView) view10.findViewById(C1086R.C1088id.description_skeletonview);
        C10202j.m34174a((Object) skeletonView5, "itemView.description_skeletonview");
        skeletonView5.setVisibility(4);
        View view11 = this.itemView;
        C10202j.m34174a((Object) view11, "itemView");
        TextView textView4 = (TextView) view11.findViewById(C1086R.C1088id.description);
        C10202j.m34174a((Object) textView4, "itemView.description");
        textView4.setVisibility(0);
        View view12 = this.itemView;
        C10202j.m34174a((Object) view12, "itemView");
        BonusAppcView bonusAppcView2 = (BonusAppcView) view12.findViewById(C1086R.C1088id.bonus_appc_view);
        C10202j.m34174a((Object) bonusAppcView2, "itemView.bonus_appc_view");
        bonusAppcView2.setVisibility(0);
        View view13 = this.itemView;
        C10202j.m34174a((Object) view13, "itemView");
        SkeletonView skeletonView6 = (SkeletonView) view13.findViewById(C1086R.C1088id.bonus_appc_skeleton_view);
        C10202j.m34174a((Object) skeletonView6, "itemView.bonus_appc_skeleton_view");
        skeletonView6.setVisibility(4);
    }

    public final DecimalFormat getOneDecimalFormatter() {
        return this.oneDecimalFormatter;
    }

    public final C12871b<HomeEvent> getUiEventsListener() {
        return this.uiEventsListener;
    }

    public final View getView() {
        return this.view;
    }

    public void setBundle(HomeBundle homeBundle, int i) {
        boolean z = homeBundle instanceof FeaturedAppcBundle;
        if (z) {
            FeaturedAppcBundle featuredAppcBundle = (FeaturedAppcBundle) (!z ? null : homeBundle);
            if (featuredAppcBundle != null) {
                FeaturedAppcBundle featuredAppcBundle2 = (FeaturedAppcBundle) homeBundle;
                if (featuredAppcBundle2.getContent() == null || featuredAppcBundle2.getBonusPercentage() == -1) {
                    toggleSkeleton(true);
                    return;
                }
                toggleSkeleton(false);
                View view2 = this.itemView;
                C10202j.m34174a((Object) view2, "itemView");
                ((BonusAppcView) view2.findViewById(C1086R.C1088id.bonus_appc_view)).setPercentage(featuredAppcBundle.getBonusPercentage());
                View view3 = this.itemView;
                C10202j.m34174a((Object) view3, "itemView");
                TextView textView = (TextView) view3.findViewById(C1086R.C1088id.title);
                C10202j.m34174a((Object) textView, "itemView.title");
                View view4 = this.itemView;
                C10202j.m34174a((Object) view4, "itemView");
                textView.setText(view4.getContext().getString(C1086R.string.incentives_banner_title, new Object[]{String.valueOf(featuredAppcBundle.getBonusPercentage())}));
                View view5 = this.itemView;
                C10202j.m34174a((Object) view5, "itemView");
                TextView textView2 = (TextView) view5.findViewById(C1086R.C1088id.description);
                C10202j.m34174a((Object) textView2, "itemView.description");
                View view6 = this.itemView;
                C10202j.m34174a((Object) view6, "itemView");
                String string = view6.getResources().getString(C1086R.string.incentives_banner_body);
                C10202j.m34174a((Object) string, "itemView.resources.getSt…g.incentives_banner_body)");
                View view7 = this.itemView;
                C10202j.m34174a((Object) view7, "itemView");
                Resources resources = view7.getResources();
                C10202j.m34174a((Object) resources, "itemView.resources");
                textView2.setText(StringUtilsKt.formatWithHtmlImage(string, C1086R.C1087drawable.ic_spend_appc, 24, 20, resources));
                this.appsInBundleAdapter.updateBundle(homeBundle, i);
                FeaturedAppcBundleAdapter featuredAppcBundleAdapter = this.appsInBundleAdapter;
                List<Application> apps = featuredAppcBundle2.getApps();
                C10202j.m34174a((Object) apps, "homeBundle.apps");
                featuredAppcBundleAdapter.update(apps);
                View view8 = this.itemView;
                C10202j.m34174a((Object) view8, "itemView");
                ((RecyclerView) view8.findViewById(C1086R.C1088id.apps_list)).addOnScrollListener(new FeaturedAppcViewHolder$setBundle$$inlined$let$lambda$1(this, homeBundle, i));
                View view9 = this.itemView;
                C10202j.m34174a((Object) view9, "itemView");
                ((Button) view9.findViewById(C1086R.C1088id.see_more_btn)).setOnClickListener(new FeaturedAppcViewHolder$setBundle$$inlined$let$lambda$2(this, homeBundle, i));
                View view10 = this.itemView;
                C10202j.m34174a((Object) view10, "itemView");
                ((CardView) view10.findViewById(C1086R.C1088id.featured_appc_card)).setOnClickListener(new FeaturedAppcViewHolder$setBundle$$inlined$let$lambda$3(this, homeBundle, i));
                return;
            }
            return;
        }
        throw new IllegalStateException(FeaturedAppcViewHolder.class.getName() + " is getting non FeaturedAppcBundle instance!");
    }
}
