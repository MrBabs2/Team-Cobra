package p015cm.aptoide.p016pt.home.bundles.promotional;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.aptoideviews.skeleton.Skeleton;
import p015cm.aptoide.aptoideviews.skeleton.SkeletonView;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.app.DownloadModel;
import p015cm.aptoide.p016pt.home.bundles.base.AppBundleViewHolder;
import p015cm.aptoide.p016pt.home.bundles.base.AppHomeEvent;
import p015cm.aptoide.p016pt.home.bundles.base.HomeBundle;
import p015cm.aptoide.p016pt.home.bundles.base.HomeEvent;
import p015cm.aptoide.p016pt.home.bundles.base.PromotionalBundle;
import p015cm.aptoide.p016pt.home.bundles.base.VersionPromotionalBundle;
import p015cm.aptoide.p016pt.networking.image.ImageLoader;
import p015cm.aptoide.p016pt.view.app.ApplicationGraphic;
import p123rx.p127s.C12871b;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u001a\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0010\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001c"}, mo16641d2 = {"Lcm/aptoide/pt/home/bundles/promotional/NewAppVersionViewHolder;", "Lcm/aptoide/pt/home/bundles/base/AppBundleViewHolder;", "view", "Landroid/view/View;", "uiEventsListener", "Lrx/subjects/PublishSubject;", "Lcm/aptoide/pt/home/bundles/base/HomeEvent;", "(Landroid/view/View;Lrx/subjects/PublishSubject;)V", "skeleton", "Lcm/aptoide/aptoideviews/skeleton/Skeleton;", "getUiEventsListener", "()Lrx/subjects/PublishSubject;", "getView", "()Landroid/view/View;", "fireAppClickEvent", "", "homeBundle", "Lcm/aptoide/pt/home/bundles/base/PromotionalBundle;", "setBundle", "Lcm/aptoide/pt/home/bundles/base/HomeBundle;", "position", "", "setButtonText", "model", "Lcm/aptoide/pt/app/DownloadModel;", "toggleSkeleton", "showSkeleton", "", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.home.bundles.promotional.NewAppVersionViewHolder */
/* compiled from: NewAppVersionViewHolder.kt */
public final class NewAppVersionViewHolder extends AppBundleViewHolder {
    private Skeleton skeleton;
    private final C12871b<HomeEvent> uiEventsListener;
    private final View view;

    @C4789l(mo16639bv = {1, 0, 3}, mo16642k = 3, mo16643mv = {1, 1, 16})
    /* renamed from: cm.aptoide.pt.home.bundles.promotional.NewAppVersionViewHolder$WhenMappings */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DownloadModel.Action.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[DownloadModel.Action.UPDATE.ordinal()] = 1;
            $EnumSwitchMapping$0[DownloadModel.Action.INSTALL.ordinal()] = 2;
            $EnumSwitchMapping$0[DownloadModel.Action.OPEN.ordinal()] = 3;
            $EnumSwitchMapping$0[DownloadModel.Action.DOWNGRADE.ordinal()] = 4;
            $EnumSwitchMapping$0[DownloadModel.Action.MIGRATE.ordinal()] = 5;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewAppVersionViewHolder(View view2, C12871b<HomeEvent> bVar) {
        super(view2);
        C10202j.m34178b(view2, "view");
        C10202j.m34178b(bVar, "uiEventsListener");
        this.view = view2;
        this.uiEventsListener = bVar;
    }

    /* access modifiers changed from: private */
    public final void fireAppClickEvent(PromotionalBundle promotionalBundle) {
        this.uiEventsListener.onNext(new AppHomeEvent(promotionalBundle.getApp(), 0, promotionalBundle, getAdapterPosition(), HomeEvent.Type.INSTALL_PROMOTIONAL));
    }

    private final void setButtonText(DownloadModel downloadModel) {
        DownloadModel.Action action = downloadModel.getAction();
        if (action != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[action.ordinal()];
            if (i == 1) {
                View view2 = this.itemView;
                C10202j.m34174a((Object) view2, "itemView");
                Button button = (Button) view2.findViewById(C1086R.C1088id.action_button);
                C10202j.m34174a((Object) button, "itemView.action_button");
                View view3 = this.itemView;
                C10202j.m34174a((Object) view3, "itemView");
                button.setText(view3.getResources().getString(C1086R.string.appview_button_update));
            } else if (i == 2) {
                View view4 = this.itemView;
                C10202j.m34174a((Object) view4, "itemView");
                Button button2 = (Button) view4.findViewById(C1086R.C1088id.action_button);
                C10202j.m34174a((Object) button2, "itemView.action_button");
                View view5 = this.itemView;
                C10202j.m34174a((Object) view5, "itemView");
                button2.setText(view5.getResources().getString(C1086R.string.appview_button_install));
            } else if (i == 3) {
                View view6 = this.itemView;
                C10202j.m34174a((Object) view6, "itemView");
                Button button3 = (Button) view6.findViewById(C1086R.C1088id.action_button);
                C10202j.m34174a((Object) button3, "itemView.action_button");
                View view7 = this.itemView;
                C10202j.m34174a((Object) view7, "itemView");
                button3.setText(view7.getResources().getString(C1086R.string.appview_button_open));
            } else if (i == 4) {
                View view8 = this.itemView;
                C10202j.m34174a((Object) view8, "itemView");
                Button button4 = (Button) view8.findViewById(C1086R.C1088id.action_button);
                C10202j.m34174a((Object) button4, "itemView.action_button");
                View view9 = this.itemView;
                C10202j.m34174a((Object) view9, "itemView");
                button4.setText(view9.getResources().getString(C1086R.string.appview_button_downgrade));
            } else if (i == 5) {
                View view10 = this.itemView;
                C10202j.m34174a((Object) view10, "itemView");
                Button button5 = (Button) view10.findViewById(C1086R.C1088id.action_button);
                C10202j.m34174a((Object) button5, "itemView.action_button");
                View view11 = this.itemView;
                C10202j.m34174a((Object) view11, "itemView");
                button5.setText(view11.getResources().getString(C1086R.string.promo_update2appc_appview_update_button));
            }
        }
    }

    private final void toggleSkeleton(boolean z) {
        if (z) {
            Skeleton skeleton2 = this.skeleton;
            if (skeleton2 != null) {
                skeleton2.showSkeleton();
            }
            View view2 = this.itemView;
            C10202j.m34174a((Object) view2, "itemView");
            SkeletonView skeletonView = (SkeletonView) view2.findViewById(C1086R.C1088id.card_title_label_skeletonview);
            C10202j.m34174a((Object) skeletonView, "itemView.card_title_label_skeletonview");
            skeletonView.setVisibility(0);
            View view3 = this.itemView;
            C10202j.m34174a((Object) view3, "itemView");
            CardView cardView = (CardView) view3.findViewById(C1086R.C1088id.card_title_label);
            C10202j.m34174a((Object) cardView, "itemView.card_title_label");
            cardView.setVisibility(4);
            View view4 = this.itemView;
            C10202j.m34174a((Object) view4, "itemView");
            SkeletonView skeletonView2 = (SkeletonView) view4.findViewById(C1086R.C1088id.app_icon_skeletonview);
            C10202j.m34174a((Object) skeletonView2, "itemView.app_icon_skeletonview");
            skeletonView2.setVisibility(0);
            View view5 = this.itemView;
            C10202j.m34174a((Object) view5, "itemView");
            ImageView imageView = (ImageView) view5.findViewById(C1086R.C1088id.app_icon);
            C10202j.m34174a((Object) imageView, "itemView.app_icon");
            imageView.setVisibility(4);
            View view6 = this.itemView;
            C10202j.m34174a((Object) view6, "itemView");
            SkeletonView skeletonView3 = (SkeletonView) view6.findViewById(C1086R.C1088id.app_name_skeletonview);
            C10202j.m34174a((Object) skeletonView3, "itemView.app_name_skeletonview");
            skeletonView3.setVisibility(0);
            View view7 = this.itemView;
            C10202j.m34174a((Object) view7, "itemView");
            TextView textView = (TextView) view7.findViewById(C1086R.C1088id.app_name);
            C10202j.m34174a((Object) textView, "itemView.app_name");
            textView.setVisibility(4);
            View view8 = this.itemView;
            C10202j.m34174a((Object) view8, "itemView");
            SkeletonView skeletonView4 = (SkeletonView) view8.findViewById(C1086R.C1088id.version_text_skeleton);
            C10202j.m34174a((Object) skeletonView4, "itemView.version_text_skeleton");
            skeletonView4.setVisibility(0);
            View view9 = this.itemView;
            C10202j.m34174a((Object) view9, "itemView");
            SkeletonView skeletonView5 = (SkeletonView) view9.findViewById(C1086R.C1088id.version_name_skeleton);
            C10202j.m34174a((Object) skeletonView5, "itemView.version_name_skeleton");
            skeletonView5.setVisibility(0);
            View view10 = this.itemView;
            C10202j.m34174a((Object) view10, "itemView");
            TextView textView2 = (TextView) view10.findViewById(C1086R.C1088id.version_name);
            C10202j.m34174a((Object) textView2, "itemView.version_name");
            textView2.setVisibility(4);
            View view11 = this.itemView;
            C10202j.m34174a((Object) view11, "itemView");
            SkeletonView skeletonView6 = (SkeletonView) view11.findViewById(C1086R.C1088id.action_button_skeleton);
            C10202j.m34174a((Object) skeletonView6, "itemView.action_button_skeleton");
            skeletonView6.setVisibility(0);
            View view12 = this.itemView;
            C10202j.m34174a((Object) view12, "itemView");
            Button button = (Button) view12.findViewById(C1086R.C1088id.action_button);
            C10202j.m34174a((Object) button, "itemView.action_button");
            button.setVisibility(4);
            return;
        }
        Skeleton skeleton3 = this.skeleton;
        if (skeleton3 != null) {
            skeleton3.showOriginal();
        }
        View view13 = this.itemView;
        C10202j.m34174a((Object) view13, "itemView");
        SkeletonView skeletonView7 = (SkeletonView) view13.findViewById(C1086R.C1088id.card_title_label_skeletonview);
        C10202j.m34174a((Object) skeletonView7, "itemView.card_title_label_skeletonview");
        skeletonView7.setVisibility(4);
        View view14 = this.itemView;
        C10202j.m34174a((Object) view14, "itemView");
        CardView cardView2 = (CardView) view14.findViewById(C1086R.C1088id.card_title_label);
        C10202j.m34174a((Object) cardView2, "itemView.card_title_label");
        cardView2.setVisibility(0);
        View view15 = this.itemView;
        C10202j.m34174a((Object) view15, "itemView");
        SkeletonView skeletonView8 = (SkeletonView) view15.findViewById(C1086R.C1088id.app_icon_skeletonview);
        C10202j.m34174a((Object) skeletonView8, "itemView.app_icon_skeletonview");
        skeletonView8.setVisibility(4);
        View view16 = this.itemView;
        C10202j.m34174a((Object) view16, "itemView");
        ImageView imageView2 = (ImageView) view16.findViewById(C1086R.C1088id.app_icon);
        C10202j.m34174a((Object) imageView2, "itemView.app_icon");
        imageView2.setVisibility(0);
        View view17 = this.itemView;
        C10202j.m34174a((Object) view17, "itemView");
        SkeletonView skeletonView9 = (SkeletonView) view17.findViewById(C1086R.C1088id.app_name_skeletonview);
        C10202j.m34174a((Object) skeletonView9, "itemView.app_name_skeletonview");
        skeletonView9.setVisibility(4);
        View view18 = this.itemView;
        C10202j.m34174a((Object) view18, "itemView");
        TextView textView3 = (TextView) view18.findViewById(C1086R.C1088id.app_name);
        C10202j.m34174a((Object) textView3, "itemView.app_name");
        textView3.setVisibility(0);
        View view19 = this.itemView;
        C10202j.m34174a((Object) view19, "itemView");
        SkeletonView skeletonView10 = (SkeletonView) view19.findViewById(C1086R.C1088id.version_text_skeleton);
        C10202j.m34174a((Object) skeletonView10, "itemView.version_text_skeleton");
        skeletonView10.setVisibility(4);
        View view20 = this.itemView;
        C10202j.m34174a((Object) view20, "itemView");
        SkeletonView skeletonView11 = (SkeletonView) view20.findViewById(C1086R.C1088id.version_name_skeleton);
        C10202j.m34174a((Object) skeletonView11, "itemView.version_name_skeleton");
        skeletonView11.setVisibility(4);
        View view21 = this.itemView;
        C10202j.m34174a((Object) view21, "itemView");
        TextView textView4 = (TextView) view21.findViewById(C1086R.C1088id.version_name);
        C10202j.m34174a((Object) textView4, "itemView.version_name");
        textView4.setVisibility(0);
        View view22 = this.itemView;
        C10202j.m34174a((Object) view22, "itemView");
        SkeletonView skeletonView12 = (SkeletonView) view22.findViewById(C1086R.C1088id.action_button_skeleton);
        C10202j.m34174a((Object) skeletonView12, "itemView.action_button_skeleton");
        skeletonView12.setVisibility(4);
        View view23 = this.itemView;
        C10202j.m34174a((Object) view23, "itemView");
        Button button2 = (Button) view23.findViewById(C1086R.C1088id.action_button);
        C10202j.m34174a((Object) button2, "itemView.action_button");
        button2.setVisibility(0);
    }

    public final C12871b<HomeEvent> getUiEventsListener() {
        return this.uiEventsListener;
    }

    public final View getView() {
        return this.view;
    }

    public void setBundle(HomeBundle homeBundle, int i) {
        boolean z = homeBundle instanceof VersionPromotionalBundle;
        if (z) {
            if (((VersionPromotionalBundle) (!z ? null : homeBundle)) != null) {
                VersionPromotionalBundle versionPromotionalBundle = (VersionPromotionalBundle) homeBundle;
                if (versionPromotionalBundle.getContent() == null) {
                    toggleSkeleton(true);
                    return;
                }
                toggleSkeleton(false);
                View view2 = this.itemView;
                C10202j.m34174a((Object) view2, "itemView");
                ImageLoader with = ImageLoader.with(view2.getContext());
                ApplicationGraphic app = versionPromotionalBundle.getApp();
                C10202j.m34174a((Object) app, "homeBundle.app");
                String icon = app.getIcon();
                View view3 = this.itemView;
                C10202j.m34174a((Object) view3, "itemView");
                with.loadWithRoundCorners(icon, 32, (ImageView) view3.findViewById(C1086R.C1088id.app_icon), C1086R.attr.placeholder_square);
                View view4 = this.itemView;
                C10202j.m34174a((Object) view4, "itemView");
                TextView textView = (TextView) view4.findViewById(C1086R.C1088id.card_title_label_text);
                C10202j.m34174a((Object) textView, "itemView.card_title_label_text");
                textView.setText(versionPromotionalBundle.getTitle());
                View view5 = this.itemView;
                C10202j.m34174a((Object) view5, "itemView");
                ImageLoader with2 = ImageLoader.with(view5.getContext());
                ApplicationGraphic app2 = versionPromotionalBundle.getApp();
                C10202j.m34174a((Object) app2, "homeBundle.app");
                String featureGraphic = app2.getFeatureGraphic();
                View view6 = this.itemView;
                C10202j.m34174a((Object) view6, "itemView");
                with2.load(featureGraphic, (ImageView) view6.findViewById(C1086R.C1088id.app_background_image));
                View view7 = this.itemView;
                C10202j.m34174a((Object) view7, "itemView");
                TextView textView2 = (TextView) view7.findViewById(C1086R.C1088id.app_name);
                C10202j.m34174a((Object) textView2, "itemView.app_name");
                ApplicationGraphic app3 = versionPromotionalBundle.getApp();
                C10202j.m34174a((Object) app3, "homeBundle.app");
                textView2.setText(app3.getName());
                View view8 = this.itemView;
                C10202j.m34174a((Object) view8, "itemView");
                TextView textView3 = (TextView) view8.findViewById(C1086R.C1088id.version_name);
                C10202j.m34174a((Object) textView3, "itemView.version_name");
                textView3.setText(versionPromotionalBundle.getVersionName());
                View view9 = this.itemView;
                C10202j.m34174a((Object) view9, "itemView");
                ((Button) view9.findViewById(C1086R.C1088id.action_button)).setOnClickListener(new NewAppVersionViewHolder$setBundle$$inlined$let$lambda$1(this, homeBundle));
                this.itemView.setOnClickListener(new NewAppVersionViewHolder$setBundle$$inlined$let$lambda$2(this, homeBundle));
                DownloadModel downloadModel = versionPromotionalBundle.getDownloadModel();
                C10202j.m34174a((Object) downloadModel, "homeBundle.downloadModel");
                setButtonText(downloadModel);
                return;
            }
            return;
        }
        throw new IllegalStateException(NewAppVersionViewHolder.class.getName() + " is getting non PromotionalBundle instance!");
    }
}
