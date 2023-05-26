package p015cm.aptoide.p016pt.home.bundles.appcoins;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.text.DecimalFormat;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.home.bundles.apps.RewardApp;
import p015cm.aptoide.p016pt.home.bundles.base.HomeBundle;
import p015cm.aptoide.p016pt.home.bundles.base.HomeEvent;
import p015cm.aptoide.p016pt.networking.image.ImageLoader;
import p123rx.p127s.C12871b;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ \u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0017R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, mo16641d2 = {"Lcm/aptoide/pt/home/bundles/appcoins/EarnAppCoinsItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "appClicks", "Lrx/subjects/PublishSubject;", "Lcm/aptoide/pt/home/bundles/base/HomeEvent;", "decimalFormatter", "Ljava/text/DecimalFormat;", "(Landroid/view/View;Lrx/subjects/PublishSubject;Ljava/text/DecimalFormat;)V", "getAppClicks", "()Lrx/subjects/PublishSubject;", "getDecimalFormatter", "()Ljava/text/DecimalFormat;", "getView", "()Landroid/view/View;", "setApp", "", "app", "Lcm/aptoide/pt/home/bundles/apps/RewardApp;", "homeBundle", "Lcm/aptoide/pt/home/bundles/base/HomeBundle;", "bundlePosition", "", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.home.bundles.appcoins.EarnAppCoinsItemViewHolder */
/* compiled from: EarnAppCoinsItemViewHolder.kt */
public final class EarnAppCoinsItemViewHolder extends RecyclerView.C0629c0 {
    private final C12871b<HomeEvent> appClicks;
    private final DecimalFormat decimalFormatter;
    private final View view;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EarnAppCoinsItemViewHolder(View view2, C12871b<HomeEvent> bVar, DecimalFormat decimalFormat) {
        super(view2);
        C10202j.m34178b(view2, "view");
        C10202j.m34178b(bVar, "appClicks");
        C10202j.m34178b(decimalFormat, "decimalFormatter");
        this.view = view2;
        this.appClicks = bVar;
        this.decimalFormatter = decimalFormat;
    }

    public final C12871b<HomeEvent> getAppClicks() {
        return this.appClicks;
    }

    public final DecimalFormat getDecimalFormatter() {
        return this.decimalFormatter;
    }

    public final View getView() {
        return this.view;
    }

    public final void setApp(RewardApp rewardApp, HomeBundle homeBundle, int i) {
        C10202j.m34178b(rewardApp, "app");
        RewardApp.Reward reward = rewardApp.getReward();
        Double d = null;
        RewardApp.Fiat fiat = reward != null ? reward.getFiat() : null;
        View view2 = this.itemView;
        C10202j.m34174a((Object) view2, "itemView");
        TextView textView = (TextView) view2.findViewById(C1086R.C1088id.reward_textview);
        C10202j.m34174a((Object) textView, "itemView.reward_textview");
        Context context = this.view.getContext();
        Object[] objArr = new Object[1];
        String symbol = fiat != null ? fiat.getSymbol() : null;
        DecimalFormat decimalFormat = this.decimalFormatter;
        if (fiat != null) {
            d = Double.valueOf(fiat.getAmount());
        }
        objArr[0] = C10202j.m34169a(symbol, (Object) decimalFormat.format(d));
        textView.setText(context.getString(C1086R.string.poa_app_card_short, objArr));
        View view3 = this.itemView;
        C10202j.m34174a((Object) view3, "itemView");
        TextView textView2 = (TextView) view3.findViewById(C1086R.C1088id.app_title_textview);
        C10202j.m34174a((Object) textView2, "itemView.app_title_textview");
        textView2.setText(rewardApp.getName());
        View view4 = this.itemView;
        C10202j.m34174a((Object) view4, "itemView");
        ImageLoader with = ImageLoader.with(view4.getContext());
        String featureGraphic = rewardApp.getFeatureGraphic();
        View view5 = this.itemView;
        C10202j.m34174a((Object) view5, "itemView");
        with.loadWithColorAttrPlaceholder(featureGraphic, C1086R.attr.skeletonColor, (ImageView) view5.findViewById(C1086R.C1088id.app_feature_graphic));
        View view6 = this.itemView;
        C10202j.m34174a((Object) view6, "itemView");
        ImageLoader with2 = ImageLoader.with(view6.getContext());
        String icon = rewardApp.getIcon();
        View view7 = this.itemView;
        C10202j.m34174a((Object) view7, "itemView");
        with2.loadWithRoundCorners(icon, 8, (ImageView) view7.findViewById(C1086R.C1088id.app_image), C1086R.attr.skeletonColor, new EarnAppCoinsItemViewHolder$setApp$1(this, rewardApp));
        this.itemView.setOnClickListener(new EarnAppCoinsItemViewHolder$setApp$2(this, rewardApp, homeBundle, i));
    }
}
