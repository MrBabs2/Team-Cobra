package p015cm.aptoide.p016pt.home.more.apps;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.text.DecimalFormat;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.ads.data.AptoideNativeAd;
import p015cm.aptoide.p016pt.home.bundles.apps.EskillsApp;
import p015cm.aptoide.p016pt.home.more.base.ListAppsViewHolder;
import p015cm.aptoide.p016pt.networking.image.ImageLoader;
import p015cm.aptoide.p016pt.view.app.Application;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\r"}, mo16641d2 = {"Lcm/aptoide/pt/home/more/apps/ListAppsMoreViewHolder;", "Lcm/aptoide/pt/home/more/base/ListAppsViewHolder;", "Lcm/aptoide/pt/view/app/Application;", "view", "Landroid/view/View;", "decimalFormatter", "Ljava/text/DecimalFormat;", "(Landroid/view/View;Ljava/text/DecimalFormat;)V", "getView", "()Landroid/view/View;", "bindApp", "", "app", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.home.more.apps.ListAppsMoreViewHolder */
/* compiled from: ListAppsMoreViewHolder.kt */
public final class ListAppsMoreViewHolder extends ListAppsViewHolder<Application> {
    private final DecimalFormat decimalFormatter;
    private final View view;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ListAppsMoreViewHolder(View view2, DecimalFormat decimalFormat) {
        super(view2);
        C10202j.m34178b(view2, "view");
        C10202j.m34178b(decimalFormat, "decimalFormatter");
        this.view = view2;
        this.decimalFormatter = decimalFormat;
    }

    public void bindApp(Application application) {
        C10202j.m34178b(application, "app");
        View view2 = this.itemView;
        C10202j.m34174a((Object) view2, "itemView");
        TextView textView = (TextView) view2.findViewById(C1086R.C1088id.name);
        C10202j.m34174a((Object) textView, "itemView.name");
        textView.setText(application.getName());
        View view3 = this.itemView;
        C10202j.m34174a((Object) view3, "itemView");
        ImageLoader with = ImageLoader.with(view3.getContext());
        String icon = application.getIcon();
        View view4 = this.itemView;
        C10202j.m34174a((Object) view4, "itemView");
        with.loadWithRoundCorners(icon, 8, (ImageView) view4.findViewById(C1086R.C1088id.icon), C1086R.attr.placeholder_square);
        if (application instanceof EskillsApp) {
            View view5 = this.itemView;
            C10202j.m34174a((Object) view5, "itemView");
            LinearLayout linearLayout = (LinearLayout) view5.findViewById(C1086R.C1088id.eskills_label);
            C10202j.m34174a((Object) linearLayout, "itemView.eskills_label");
            linearLayout.setVisibility(0);
            View view6 = this.itemView;
            C10202j.m34174a((Object) view6, "itemView");
            LinearLayout linearLayout2 = (LinearLayout) view6.findViewById(C1086R.C1088id.appc_info_layout);
            C10202j.m34174a((Object) linearLayout2, "itemView.appc_info_layout");
            linearLayout2.setVisibility(8);
            View view7 = this.itemView;
            C10202j.m34174a((Object) view7, "itemView");
            LinearLayout linearLayout3 = (LinearLayout) view7.findViewById(C1086R.C1088id.rating_info_layout);
            C10202j.m34174a((Object) linearLayout3, "itemView.rating_info_layout");
            linearLayout3.setVisibility(8);
            View view8 = this.itemView;
            C10202j.m34174a((Object) view8, "itemView");
            TextView textView2 = (TextView) view8.findViewById(C1086R.C1088id.ad_label);
            C10202j.m34174a((Object) textView2, "itemView.ad_label");
            textView2.setVisibility(8);
            return;
        }
        View view9 = this.itemView;
        C10202j.m34174a((Object) view9, "itemView");
        LinearLayout linearLayout4 = (LinearLayout) view9.findViewById(C1086R.C1088id.eskills_label);
        C10202j.m34174a((Object) linearLayout4, "itemView.eskills_label");
        linearLayout4.setVisibility(8);
        if (application.hasAppcBilling()) {
            View view10 = this.itemView;
            C10202j.m34174a((Object) view10, "itemView");
            LinearLayout linearLayout5 = (LinearLayout) view10.findViewById(C1086R.C1088id.appc_info_layout);
            C10202j.m34174a((Object) linearLayout5, "itemView.appc_info_layout");
            linearLayout5.setVisibility(0);
            View view11 = this.itemView;
            C10202j.m34174a((Object) view11, "itemView");
            ((TextView) view11.findViewById(C1086R.C1088id.appc_text)).setText(C1086R.string.appc_card_short);
            View view12 = this.itemView;
            C10202j.m34174a((Object) view12, "itemView");
            LinearLayout linearLayout6 = (LinearLayout) view12.findViewById(C1086R.C1088id.rating_info_layout);
            C10202j.m34174a((Object) linearLayout6, "itemView.rating_info_layout");
            linearLayout6.setVisibility(8);
            View view13 = this.itemView;
            C10202j.m34174a((Object) view13, "itemView");
            TextView textView3 = (TextView) view13.findViewById(C1086R.C1088id.ad_label);
            C10202j.m34174a((Object) textView3, "itemView.ad_label");
            textView3.setVisibility(8);
        } else if (application instanceof AptoideNativeAd) {
            View view14 = this.itemView;
            C10202j.m34174a((Object) view14, "itemView");
            TextView textView4 = (TextView) view14.findViewById(C1086R.C1088id.ad_label);
            C10202j.m34174a((Object) textView4, "itemView.ad_label");
            textView4.setVisibility(0);
            View view15 = this.itemView;
            C10202j.m34174a((Object) view15, "itemView");
            LinearLayout linearLayout7 = (LinearLayout) view15.findViewById(C1086R.C1088id.rating_info_layout);
            C10202j.m34174a((Object) linearLayout7, "itemView.rating_info_layout");
            linearLayout7.setVisibility(0);
            View view16 = this.itemView;
            C10202j.m34174a((Object) view16, "itemView");
            LinearLayout linearLayout8 = (LinearLayout) view16.findViewById(C1086R.C1088id.appc_info_layout);
            C10202j.m34174a((Object) linearLayout8, "itemView.appc_info_layout");
            linearLayout8.setVisibility(8);
            View view17 = this.itemView;
            C10202j.m34174a((Object) view17, "itemView");
            TextView textView5 = (TextView) view17.findViewById(C1086R.C1088id.rating_label);
            C10202j.m34174a((Object) textView5, "itemView.rating_label");
            textView5.setText(this.decimalFormatter.format(((AptoideNativeAd) application).getStars()));
        } else {
            if (application.getRating() == 0.0f) {
                View view18 = this.itemView;
                C10202j.m34174a((Object) view18, "itemView");
                ((TextView) view18.findViewById(C1086R.C1088id.rating_label)).setText(C1086R.string.appcardview_title_no_stars);
            } else {
                View view19 = this.itemView;
                C10202j.m34174a((Object) view19, "itemView");
                TextView textView6 = (TextView) view19.findViewById(C1086R.C1088id.rating_label);
                C10202j.m34174a((Object) textView6, "itemView.rating_label");
                textView6.setText(this.decimalFormatter.format(Float.valueOf(application.getRating())));
            }
            View view20 = this.itemView;
            C10202j.m34174a((Object) view20, "itemView");
            LinearLayout linearLayout9 = (LinearLayout) view20.findViewById(C1086R.C1088id.rating_info_layout);
            C10202j.m34174a((Object) linearLayout9, "itemView.rating_info_layout");
            linearLayout9.setVisibility(0);
            View view21 = this.itemView;
            C10202j.m34174a((Object) view21, "itemView");
            LinearLayout linearLayout10 = (LinearLayout) view21.findViewById(C1086R.C1088id.appc_info_layout);
            C10202j.m34174a((Object) linearLayout10, "itemView.appc_info_layout");
            linearLayout10.setVisibility(8);
            View view22 = this.itemView;
            C10202j.m34174a((Object) view22, "itemView");
            TextView textView7 = (TextView) view22.findViewById(C1086R.C1088id.ad_label);
            C10202j.m34174a((Object) textView7, "itemView.ad_label");
            textView7.setVisibility(8);
        }
    }

    public final View getView() {
        return this.view;
    }
}
