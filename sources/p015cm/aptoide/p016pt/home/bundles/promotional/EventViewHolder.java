package p015cm.aptoide.p016pt.home.bundles.promotional;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.aptoideviews.skeleton.Skeleton;
import p015cm.aptoide.aptoideviews.skeleton.SkeletonView;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.home.bundles.base.ActionItem;
import p015cm.aptoide.p016pt.home.bundles.base.EditorialActionBundle;
import p015cm.aptoide.p016pt.home.bundles.base.HomeBundle;
import p015cm.aptoide.p016pt.home.bundles.base.HomeEvent;
import p015cm.aptoide.p016pt.home.bundles.editorial.EditorialViewHolder;
import p015cm.aptoide.p016pt.networking.image.ImageLoader;
import p123rx.p127s.C12871b;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u001a\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, mo16641d2 = {"Lcm/aptoide/pt/home/bundles/promotional/EventViewHolder;", "Lcm/aptoide/pt/home/bundles/editorial/EditorialViewHolder;", "view", "Landroid/view/View;", "uiEventsListener", "Lrx/subjects/PublishSubject;", "Lcm/aptoide/pt/home/bundles/base/HomeEvent;", "(Landroid/view/View;Lrx/subjects/PublishSubject;)V", "skeleton", "Lcm/aptoide/aptoideviews/skeleton/Skeleton;", "getUiEventsListener", "()Lrx/subjects/PublishSubject;", "getView", "()Landroid/view/View;", "setBundle", "", "homeBundle", "Lcm/aptoide/pt/home/bundles/base/HomeBundle;", "position", "", "toggleSkeleton", "showSkeleton", "", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.home.bundles.promotional.EventViewHolder */
/* compiled from: EventViewHolder.kt */
public final class EventViewHolder extends EditorialViewHolder {
    private Skeleton skeleton;
    private final C12871b<HomeEvent> uiEventsListener;
    private final View view;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventViewHolder(View view2, C12871b<HomeEvent> bVar) {
        super(view2);
        C10202j.m34178b(view2, "view");
        C10202j.m34178b(bVar, "uiEventsListener");
        this.view = view2;
        this.uiEventsListener = bVar;
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
            SkeletonView skeletonView2 = (SkeletonView) view4.findViewById(C1086R.C1088id.event_title_skeletonview);
            C10202j.m34174a((Object) skeletonView2, "itemView.event_title_skeletonview");
            skeletonView2.setVisibility(0);
            View view5 = this.itemView;
            C10202j.m34174a((Object) view5, "itemView");
            TextView textView = (TextView) view5.findViewById(C1086R.C1088id.event_title);
            C10202j.m34174a((Object) textView, "itemView.event_title");
            textView.setVisibility(4);
            View view6 = this.itemView;
            C10202j.m34174a((Object) view6, "itemView");
            TextView textView2 = (TextView) view6.findViewById(C1086R.C1088id.event_ongoing);
            C10202j.m34174a((Object) textView2, "itemView.event_ongoing");
            textView2.setVisibility(4);
            View view7 = this.itemView;
            C10202j.m34174a((Object) view7, "itemView");
            SkeletonView skeletonView3 = (SkeletonView) view7.findViewById(C1086R.C1088id.event_summary_skeletonview);
            C10202j.m34174a((Object) skeletonView3, "itemView.event_summary_skeletonview");
            skeletonView3.setVisibility(0);
            View view8 = this.itemView;
            C10202j.m34174a((Object) view8, "itemView");
            SkeletonView skeletonView4 = (SkeletonView) view8.findViewById(C1086R.C1088id.event_on_going_skeletonview);
            C10202j.m34174a((Object) skeletonView4, "itemView.event_on_going_skeletonview");
            skeletonView4.setVisibility(0);
            return;
        }
        Skeleton skeleton3 = this.skeleton;
        if (skeleton3 != null) {
            skeleton3.showOriginal();
        }
        View view9 = this.itemView;
        C10202j.m34174a((Object) view9, "itemView");
        SkeletonView skeletonView5 = (SkeletonView) view9.findViewById(C1086R.C1088id.card_title_label_skeletonview);
        C10202j.m34174a((Object) skeletonView5, "itemView.card_title_label_skeletonview");
        skeletonView5.setVisibility(4);
        View view10 = this.itemView;
        C10202j.m34174a((Object) view10, "itemView");
        CardView cardView2 = (CardView) view10.findViewById(C1086R.C1088id.card_title_label);
        C10202j.m34174a((Object) cardView2, "itemView.card_title_label");
        cardView2.setVisibility(0);
        View view11 = this.itemView;
        C10202j.m34174a((Object) view11, "itemView");
        SkeletonView skeletonView6 = (SkeletonView) view11.findViewById(C1086R.C1088id.event_title_skeletonview);
        C10202j.m34174a((Object) skeletonView6, "itemView.event_title_skeletonview");
        skeletonView6.setVisibility(4);
        View view12 = this.itemView;
        C10202j.m34174a((Object) view12, "itemView");
        TextView textView3 = (TextView) view12.findViewById(C1086R.C1088id.event_title);
        C10202j.m34174a((Object) textView3, "itemView.event_title");
        textView3.setVisibility(0);
        View view13 = this.itemView;
        C10202j.m34174a((Object) view13, "itemView");
        TextView textView4 = (TextView) view13.findViewById(C1086R.C1088id.event_ongoing);
        C10202j.m34174a((Object) textView4, "itemView.event_ongoing");
        textView4.setVisibility(0);
        View view14 = this.itemView;
        C10202j.m34174a((Object) view14, "itemView");
        SkeletonView skeletonView7 = (SkeletonView) view14.findViewById(C1086R.C1088id.event_summary_skeletonview);
        C10202j.m34174a((Object) skeletonView7, "itemView.event_summary_skeletonview");
        skeletonView7.setVisibility(4);
        View view15 = this.itemView;
        C10202j.m34174a((Object) view15, "itemView");
        SkeletonView skeletonView8 = (SkeletonView) view15.findViewById(C1086R.C1088id.event_on_going_skeletonview);
        C10202j.m34174a((Object) skeletonView8, "itemView.event_on_going_skeletonview");
        skeletonView8.setVisibility(4);
    }

    public final C12871b<HomeEvent> getUiEventsListener() {
        return this.uiEventsListener;
    }

    public final View getView() {
        return this.view;
    }

    public void setBundle(HomeBundle homeBundle, int i) {
        if (((EditorialActionBundle) (!(homeBundle instanceof EditorialActionBundle) ? null : homeBundle)) != null) {
            EditorialActionBundle editorialActionBundle = (EditorialActionBundle) homeBundle;
            if (editorialActionBundle.getContent() == null) {
                toggleSkeleton(true);
                return;
            }
            toggleSkeleton(false);
            View view2 = this.itemView;
            C10202j.m34174a((Object) view2, "itemView");
            TextView textView = (TextView) view2.findViewById(C1086R.C1088id.card_title_label_text);
            C10202j.m34174a((Object) textView, "itemView.card_title_label_text");
            textView.setText(editorialActionBundle.getTitle());
            View view3 = this.itemView;
            C10202j.m34174a((Object) view3, "itemView");
            ImageLoader with = ImageLoader.with(view3.getContext());
            ActionItem actionItem = editorialActionBundle.getActionItem();
            C10202j.m34174a((Object) actionItem, "homeBundle.actionItem");
            String icon = actionItem.getIcon();
            View view4 = this.itemView;
            C10202j.m34174a((Object) view4, "itemView");
            with.load(icon, (ImageView) view4.findViewById(C1086R.C1088id.app_background_image));
            View view5 = this.itemView;
            C10202j.m34174a((Object) view5, "itemView");
            TextView textView2 = (TextView) view5.findViewById(C1086R.C1088id.event_title);
            C10202j.m34174a((Object) textView2, "itemView.event_title");
            ActionItem actionItem2 = editorialActionBundle.getActionItem();
            C10202j.m34174a((Object) actionItem2, "homeBundle.actionItem");
            textView2.setText(actionItem2.getTitle());
            View view6 = this.itemView;
            C10202j.m34174a((Object) view6, "itemView");
            TextView textView3 = (TextView) view6.findViewById(C1086R.C1088id.event_summary);
            C10202j.m34174a((Object) textView3, "itemView.event_summary");
            ActionItem actionItem3 = editorialActionBundle.getActionItem();
            C10202j.m34174a((Object) actionItem3, "homeBundle.actionItem");
            textView3.setText(actionItem3.getSummary());
            this.itemView.setOnClickListener(new EventViewHolder$setBundle$$inlined$let$lambda$1(this, homeBundle, i));
        }
    }
}
