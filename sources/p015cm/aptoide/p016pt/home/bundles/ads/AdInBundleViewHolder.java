package p015cm.aptoide.p016pt.home.bundles.ads;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.text.DecimalFormat;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.ads.data.Payout;
import p015cm.aptoide.p016pt.home.bundles.base.HomeBundle;
import p015cm.aptoide.p016pt.home.bundles.base.HomeEvent;
import p015cm.aptoide.p016pt.networking.image.ImageLoader;
import p123rx.p127s.C12871b;

/* renamed from: cm.aptoide.pt.home.bundles.ads.AdInBundleViewHolder */
class AdInBundleViewHolder extends RecyclerView.C0629c0 {
    private final C12871b<AdHomeEvent> adClickedEvents;
    private final View appInfoLayout;
    private final View appcEarnLayout;
    private final ImageView iconView;
    private final TextView nameTextView;
    private final DecimalFormat oneDecimalFormatter;
    private final TextView rating;
    private final TextView rewardTextView;

    public AdInBundleViewHolder(View view, C12871b<AdHomeEvent> bVar, DecimalFormat decimalFormat) {
        super(view);
        this.nameTextView = (TextView) view.findViewById(C1086R.C1088id.name);
        this.iconView = (ImageView) view.findViewById(C1086R.C1088id.icon);
        this.rating = (TextView) view.findViewById(C1086R.C1088id.rating_label);
        this.appcEarnLayout = view.findViewById(C1086R.C1088id.appc_earn_layout);
        this.appInfoLayout = view.findViewById(C1086R.C1088id.app_info_layout);
        this.rewardTextView = (TextView) view.findViewById(C1086R.C1088id.reward_textview);
        this.adClickedEvents = bVar;
        this.oneDecimalFormatter = decimalFormat;
    }

    /* renamed from: a */
    public /* synthetic */ void mo12234a(AdClick adClick, int i, HomeBundle homeBundle, int i2, View view) {
        this.adClickedEvents.onNext(new AdHomeEvent(adClick, i, homeBundle, i2, HomeEvent.Type.AD));
    }

    public void setApp(AdClick adClick, HomeBundle homeBundle, int i, int i2) {
        this.nameTextView.setText(adClick.getAd().getAdTitle());
        ImageLoader.with(this.itemView.getContext()).loadWithRoundCorners(adClick.getAd().getIconUrl(), 8, this.iconView, C1086R.attr.placeholder_square);
        if (adClick.getAd().hasAppcPayout()) {
            Payout appcPayout = adClick.getAd().getAppcPayout();
            this.appInfoLayout.setVisibility(8);
            this.appcEarnLayout.setVisibility(0);
            Context context = this.itemView.getContext();
            this.rewardTextView.setText(context.getString(C1086R.string.poa_app_card_short, new Object[]{appcPayout.getFiatSymbol() + this.oneDecimalFormatter.format(appcPayout.getFiatAmount())}));
        } else {
            this.appInfoLayout.setVisibility(0);
            this.appcEarnLayout.setVisibility(8);
            float intValue = (float) adClick.getAd().getStars().intValue();
            if (intValue == 0.0f) {
                this.rating.setText(C1086R.string.appcardview_title_no_stars);
            } else {
                this.rating.setText(this.oneDecimalFormatter.format((double) intValue));
            }
        }
        adClick.getAd().registerClickableView(this.itemView);
        this.itemView.setOnClickListener(new C2877a(this, adClick, i2, homeBundle, i));
    }
}
