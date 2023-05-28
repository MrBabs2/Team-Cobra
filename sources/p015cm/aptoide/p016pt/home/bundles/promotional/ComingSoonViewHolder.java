package p015cm.aptoide.p016pt.home.bundles.promotional;

import android.content.Context;
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
import p015cm.aptoide.p016pt.home.bundles.base.ActionItem;
import p015cm.aptoide.p016pt.home.bundles.base.AppBundleViewHolder;
import p015cm.aptoide.p016pt.home.bundles.base.AppComingSoonPromotionalBundle;
import p015cm.aptoide.p016pt.home.bundles.base.HomeBundle;
import p015cm.aptoide.p016pt.home.bundles.base.HomeEvent;
import p015cm.aptoide.p016pt.networking.image.ImageLoader;
import p123rx.p127s.C12871b;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u001a\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001b"}, mo16641d2 = {"Lcm/aptoide/pt/home/bundles/promotional/ComingSoonViewHolder;", "Lcm/aptoide/pt/home/bundles/base/AppBundleViewHolder;", "view", "Landroid/view/View;", "uiEventsListener", "Lrx/subjects/PublishSubject;", "Lcm/aptoide/pt/home/bundles/base/HomeEvent;", "(Landroid/view/View;Lrx/subjects/PublishSubject;)V", "skeleton", "Lcm/aptoide/aptoideviews/skeleton/Skeleton;", "getUiEventsListener", "()Lrx/subjects/PublishSubject;", "getView", "()Landroid/view/View;", "fireAppClickEvent", "", "homeBundle", "Lcm/aptoide/pt/home/bundles/base/AppComingSoonPromotionalBundle;", "type", "Lcm/aptoide/pt/home/bundles/base/HomeEvent$Type;", "setBundle", "Lcm/aptoide/pt/home/bundles/base/HomeBundle;", "position", "", "toggleSkeleton", "showSkeleton", "", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.home.bundles.promotional.ComingSoonViewHolder */
/* compiled from: ComingSoonViewHolder.kt */
public final class ComingSoonViewHolder extends AppBundleViewHolder {
    private Skeleton skeleton;
    private final C12871b<HomeEvent> uiEventsListener;
    private final View view;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ComingSoonViewHolder(View view2, C12871b<HomeEvent> bVar) {
        super(view2);
        C10202j.m34178b(view2, "view");
        C10202j.m34178b(bVar, "uiEventsListener");
        this.view = view2;
        this.uiEventsListener = bVar;
    }

    /* access modifiers changed from: private */
    public final void fireAppClickEvent(AppComingSoonPromotionalBundle appComingSoonPromotionalBundle, HomeEvent.Type type) {
        this.uiEventsListener.onNext(new HomeEvent(appComingSoonPromotionalBundle, 0, type));
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
            SkeletonView skeletonView2 = (SkeletonView) view4.findViewById(C1086R.C1088id.app_name_skeletonview);
            C10202j.m34174a((Object) skeletonView2, "itemView.app_name_skeletonview");
            skeletonView2.setVisibility(0);
            View view5 = this.itemView;
            C10202j.m34174a((Object) view5, "itemView");
            TextView textView = (TextView) view5.findViewById(C1086R.C1088id.app_name);
            C10202j.m34174a((Object) textView, "itemView.app_name");
            textView.setVisibility(4);
            View view6 = this.itemView;
            C10202j.m34174a((Object) view6, "itemView");
            SkeletonView skeletonView3 = (SkeletonView) view6.findViewById(C1086R.C1088id.aptoide_icon_skeleton);
            C10202j.m34174a((Object) skeletonView3, "itemView.aptoide_icon_skeleton");
            skeletonView3.setVisibility(0);
            View view7 = this.itemView;
            C10202j.m34174a((Object) view7, "itemView");
            ImageView imageView = (ImageView) view7.findViewById(C1086R.C1088id.aptoide_icon);
            C10202j.m34174a((Object) imageView, "itemView.aptoide_icon");
            imageView.setVisibility(4);
            View view8 = this.itemView;
            C10202j.m34174a((Object) view8, "itemView");
            SkeletonView skeletonView4 = (SkeletonView) view8.findViewById(C1086R.C1088id.text_skeleton_1);
            C10202j.m34174a((Object) skeletonView4, "itemView.text_skeleton_1");
            skeletonView4.setVisibility(0);
            View view9 = this.itemView;
            C10202j.m34174a((Object) view9, "itemView");
            SkeletonView skeletonView5 = (SkeletonView) view9.findViewById(C1086R.C1088id.text_skeleton_2);
            C10202j.m34174a((Object) skeletonView5, "itemView.text_skeleton_2");
            skeletonView5.setVisibility(0);
            View view10 = this.itemView;
            C10202j.m34174a((Object) view10, "itemView");
            TextView textView2 = (TextView) view10.findViewById(C1086R.C1088id.coming_soon_text);
            C10202j.m34174a((Object) textView2, "itemView.coming_soon_text");
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
        SkeletonView skeletonView8 = (SkeletonView) view14.findViewById(C1086R.C1088id.app_name_skeletonview);
        C10202j.m34174a((Object) skeletonView8, "itemView.app_name_skeletonview");
        skeletonView8.setVisibility(4);
        View view15 = this.itemView;
        C10202j.m34174a((Object) view15, "itemView");
        TextView textView3 = (TextView) view15.findViewById(C1086R.C1088id.app_name);
        C10202j.m34174a((Object) textView3, "itemView.app_name");
        textView3.setVisibility(0);
        View view16 = this.itemView;
        C10202j.m34174a((Object) view16, "itemView");
        SkeletonView skeletonView9 = (SkeletonView) view16.findViewById(C1086R.C1088id.aptoide_icon_skeleton);
        C10202j.m34174a((Object) skeletonView9, "itemView.aptoide_icon_skeleton");
        skeletonView9.setVisibility(4);
        View view17 = this.itemView;
        C10202j.m34174a((Object) view17, "itemView");
        ImageView imageView2 = (ImageView) view17.findViewById(C1086R.C1088id.aptoide_icon);
        C10202j.m34174a((Object) imageView2, "itemView.aptoide_icon");
        imageView2.setVisibility(0);
        View view18 = this.itemView;
        C10202j.m34174a((Object) view18, "itemView");
        SkeletonView skeletonView10 = (SkeletonView) view18.findViewById(C1086R.C1088id.text_skeleton_1);
        C10202j.m34174a((Object) skeletonView10, "itemView.text_skeleton_1");
        skeletonView10.setVisibility(4);
        View view19 = this.itemView;
        C10202j.m34174a((Object) view19, "itemView");
        SkeletonView skeletonView11 = (SkeletonView) view19.findViewById(C1086R.C1088id.text_skeleton_2);
        C10202j.m34174a((Object) skeletonView11, "itemView.text_skeleton_2");
        skeletonView11.setVisibility(4);
        View view20 = this.itemView;
        C10202j.m34174a((Object) view20, "itemView");
        TextView textView4 = (TextView) view20.findViewById(C1086R.C1088id.coming_soon_text);
        C10202j.m34174a((Object) textView4, "itemView.coming_soon_text");
        textView4.setVisibility(0);
        View view21 = this.itemView;
        C10202j.m34174a((Object) view21, "itemView");
        SkeletonView skeletonView12 = (SkeletonView) view21.findViewById(C1086R.C1088id.action_button_skeleton);
        C10202j.m34174a((Object) skeletonView12, "itemView.action_button_skeleton");
        skeletonView12.setVisibility(4);
        View view22 = this.itemView;
        C10202j.m34174a((Object) view22, "itemView");
        Button button2 = (Button) view22.findViewById(C1086R.C1088id.action_button);
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
        boolean z = homeBundle instanceof AppComingSoonPromotionalBundle;
        if (z) {
            AppComingSoonPromotionalBundle appComingSoonPromotionalBundle = (AppComingSoonPromotionalBundle) (!z ? null : homeBundle);
            if (appComingSoonPromotionalBundle != null) {
                AppComingSoonPromotionalBundle appComingSoonPromotionalBundle2 = (AppComingSoonPromotionalBundle) homeBundle;
                if (appComingSoonPromotionalBundle2.getContent() == null) {
                    toggleSkeleton(true);
                    return;
                }
                toggleSkeleton(false);
                View view2 = this.itemView;
                C10202j.m34174a((Object) view2, "itemView");
                TextView textView = (TextView) view2.findViewById(C1086R.C1088id.card_title_label_text);
                C10202j.m34174a((Object) textView, "itemView.card_title_label_text");
                textView.setText(appComingSoonPromotionalBundle2.getTitle());
                View view3 = this.itemView;
                C10202j.m34174a((Object) view3, "itemView");
                ImageLoader with = ImageLoader.with(view3.getContext());
                ActionItem actionItem = appComingSoonPromotionalBundle2.getActionItem();
                C10202j.m34174a((Object) actionItem, "homeBundle.actionItem");
                String featureGraphic = actionItem.getFeatureGraphic();
                View view4 = this.itemView;
                C10202j.m34174a((Object) view4, "itemView");
                with.load(featureGraphic, (ImageView) view4.findViewById(C1086R.C1088id.app_background_image));
                View view5 = this.itemView;
                C10202j.m34174a((Object) view5, "itemView");
                TextView textView2 = (TextView) view5.findViewById(C1086R.C1088id.app_name);
                C10202j.m34174a((Object) textView2, "itemView.app_name");
                ActionItem actionItem2 = appComingSoonPromotionalBundle2.getActionItem();
                C10202j.m34174a((Object) actionItem2, "homeBundle.actionItem");
                textView2.setText(actionItem2.getTitle());
                if (appComingSoonPromotionalBundle.isRegisteredForNotification()) {
                    View view6 = this.itemView;
                    C10202j.m34174a((Object) view6, "itemView");
                    Button button = (Button) view6.findViewById(C1086R.C1088id.action_button);
                    C10202j.m34174a((Object) button, "itemView.action_button");
                    View view7 = this.itemView;
                    C10202j.m34174a((Object) view7, "itemView");
                    Context context = view7.getContext();
                    C10202j.m34174a((Object) context, "itemView.context");
                    button.setBackground(context.getResources().getDrawable(C1086R.C1087drawable.btn_ghost_theme_grey_fog_light));
                    View view8 = this.itemView;
                    C10202j.m34174a((Object) view8, "itemView");
                    View view9 = this.itemView;
                    C10202j.m34174a((Object) view9, "itemView");
                    Context context2 = view9.getContext();
                    C10202j.m34174a((Object) context2, "itemView.context");
                    ((Button) view8.findViewById(C1086R.C1088id.action_button)).setTextColor(context2.getResources().getColor(C1086R.color.grey));
                    View view10 = this.itemView;
                    C10202j.m34174a((Object) view10, "itemView");
                    TextView textView3 = (TextView) view10.findViewById(C1086R.C1088id.coming_soon_text);
                    C10202j.m34174a((Object) textView3, "itemView.coming_soon_text");
                    View view11 = this.itemView;
                    C10202j.m34174a((Object) view11, "itemView");
                    textView3.setText(view11.getContext().getString(C1086R.string.promotional_new_active));
                    View view12 = this.itemView;
                    C10202j.m34174a((Object) view12, "itemView");
                    Button button2 = (Button) view12.findViewById(C1086R.C1088id.action_button);
                    C10202j.m34174a((Object) button2, "itemView.action_button");
                    View view13 = this.itemView;
                    C10202j.m34174a((Object) view13, "itemView");
                    button2.setText(view13.getContext().getString(C1086R.string.cancel));
                    View view14 = this.itemView;
                    C10202j.m34174a((Object) view14, "itemView");
                    ((Button) view14.findViewById(C1086R.C1088id.action_button)).setOnClickListener(new ComingSoonViewHolder$setBundle$$inlined$let$lambda$1(appComingSoonPromotionalBundle, this, homeBundle));
                    return;
                }
                View view15 = this.itemView;
                C10202j.m34174a((Object) view15, "itemView");
                Button button3 = (Button) view15.findViewById(C1086R.C1088id.action_button);
                C10202j.m34174a((Object) button3, "itemView.action_button");
                View view16 = this.itemView;
                C10202j.m34174a((Object) view16, "itemView");
                Context context3 = view16.getContext();
                C10202j.m34174a((Object) context3, "itemView.context");
                button3.setBackground(context3.getResources().getDrawable(C1086R.C1087drawable.btn_ghost_theme_normal));
                View view17 = this.itemView;
                C10202j.m34174a((Object) view17, "itemView");
                View view18 = this.itemView;
                C10202j.m34174a((Object) view18, "itemView");
                Context context4 = view18.getContext();
                C10202j.m34174a((Object) context4, "itemView.context");
                ((Button) view17.findViewById(C1086R.C1088id.action_button)).setTextColor(context4.getResources().getColor(C1086R.color.default_orange_gradient_end));
                View view19 = this.itemView;
                C10202j.m34174a((Object) view19, "itemView");
                TextView textView4 = (TextView) view19.findViewById(C1086R.C1088id.coming_soon_text);
                C10202j.m34174a((Object) textView4, "itemView.coming_soon_text");
                View view20 = this.itemView;
                C10202j.m34174a((Object) view20, "itemView");
                textView4.setText(view20.getContext().getString(C1086R.string.promotional_soon_in_aptoide));
                View view21 = this.itemView;
                C10202j.m34174a((Object) view21, "itemView");
                Button button4 = (Button) view21.findViewById(C1086R.C1088id.action_button);
                C10202j.m34174a((Object) button4, "itemView.action_button");
                View view22 = this.itemView;
                C10202j.m34174a((Object) view22, "itemView");
                button4.setText(view22.getContext().getString(C1086R.string.promotional_notify_button));
                View view23 = this.itemView;
                C10202j.m34174a((Object) view23, "itemView");
                ((Button) view23.findViewById(C1086R.C1088id.action_button)).setOnClickListener(new ComingSoonViewHolder$setBundle$$inlined$let$lambda$2(appComingSoonPromotionalBundle, this, homeBundle));
                return;
            }
            return;
        }
        throw new IllegalStateException(ComingSoonViewHolder.class.getName() + " is getting non AppComingSoonPromotionalBundle instance!");
    }
}
