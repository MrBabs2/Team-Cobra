package p015cm.aptoide.p016pt.home.more.appcoins;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.text.DecimalFormat;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.home.bundles.apps.RewardApp;
import p015cm.aptoide.p016pt.home.more.base.ListAppsViewHolder;
import p015cm.aptoide.p016pt.networking.image.ImageLoader;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\r"}, mo16641d2 = {"Lcm/aptoide/pt/home/more/appcoins/EarnAppcListViewHolder;", "Lcm/aptoide/pt/home/more/base/ListAppsViewHolder;", "Lcm/aptoide/pt/home/bundles/apps/RewardApp;", "view", "Landroid/view/View;", "decimalFormatter", "Ljava/text/DecimalFormat;", "(Landroid/view/View;Ljava/text/DecimalFormat;)V", "getView", "()Landroid/view/View;", "bindApp", "", "app", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.home.more.appcoins.EarnAppcListViewHolder */
/* compiled from: EarnAppcListViewHolder.kt */
public final class EarnAppcListViewHolder extends ListAppsViewHolder<RewardApp> {
    private final DecimalFormat decimalFormatter;
    private final View view;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EarnAppcListViewHolder(View view2, DecimalFormat decimalFormat) {
        super(view2);
        C10202j.m34178b(view2, "view");
        C10202j.m34178b(decimalFormat, "decimalFormatter");
        this.view = view2;
        this.decimalFormatter = decimalFormat;
    }

    public final View getView() {
        return this.view;
    }

    public void bindApp(RewardApp rewardApp) {
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
        with2.loadWithColorPlaceholderRoundCorners(icon, 8, (ImageView) view7.findViewById(C1086R.C1088id.app_image), C1086R.attr.skeletonColor, new EarnAppcListViewHolder$bindApp$1(this, rewardApp));
    }
}
