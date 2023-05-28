package p015cm.aptoide.p016pt.app.view;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.text.DecimalFormat;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.app.AppViewSimilarApp;
import p015cm.aptoide.p016pt.app.view.AppViewSimilarAppsAdapter;
import p015cm.aptoide.p016pt.app.view.similar.SimilarAppClickEvent;
import p015cm.aptoide.p016pt.networking.image.ImageLoader;
import p123rx.p127s.C12871b;

/* renamed from: cm.aptoide.pt.app.view.AppViewSimilarAppViewHolder */
public class AppViewSimilarAppViewHolder extends RecyclerView.C0629c0 {
    private final TextView adLabel;
    private C12871b<SimilarAppClickEvent> appClicked;
    private final LinearLayout appInfoLayout;
    private final LinearLayout appcInfoLayout;
    private final ImageView iconView;
    private final View itemView;
    private final TextView nameTextView;
    private DecimalFormat oneDecimalFormatter;
    private final TextView rating;

    public AppViewSimilarAppViewHolder(View view, DecimalFormat decimalFormat, C12871b<SimilarAppClickEvent> bVar) {
        super(view);
        this.itemView = view;
        this.oneDecimalFormatter = decimalFormat;
        this.appClicked = bVar;
        this.appInfoLayout = (LinearLayout) view.findViewById(C1086R.C1088id.app_info_layout);
        this.appcInfoLayout = (LinearLayout) view.findViewById(C1086R.C1088id.appc_info_layout);
        this.nameTextView = (TextView) view.findViewById(C1086R.C1088id.name);
        this.iconView = (ImageView) view.findViewById(C1086R.C1088id.icon);
        this.rating = (TextView) view.findViewById(C1086R.C1088id.rating_label);
        this.adLabel = (TextView) view.findViewById(C1086R.C1088id.ad_label);
    }

    /* renamed from: a */
    public /* synthetic */ void mo7515a(AppViewSimilarApp appViewSimilarApp, AppViewSimilarAppsAdapter.SimilarAppType similarAppType, View view) {
        this.appClicked.onNext(new SimilarAppClickEvent(appViewSimilarApp, similarAppType, getLayoutPosition()));
    }

    /* renamed from: b */
    public /* synthetic */ void mo7516b(AppViewSimilarApp appViewSimilarApp, AppViewSimilarAppsAdapter.SimilarAppType similarAppType, View view) {
        this.appClicked.onNext(new SimilarAppClickEvent(appViewSimilarApp, similarAppType, getLayoutPosition()));
    }

    public void setSimilarApp(AppViewSimilarApp appViewSimilarApp, AppViewSimilarAppsAdapter.SimilarAppType similarAppType) {
        if (appViewSimilarApp.isAd()) {
            this.adLabel.setVisibility(0);
            this.nameTextView.setText(appViewSimilarApp.getAd().getAdTitle());
            ImageLoader.with(this.itemView.getContext()).loadWithRoundCorners(appViewSimilarApp.getAd().getIconUrl(), 8, this.iconView, C1086R.attr.placeholder_square);
            appViewSimilarApp.getAd().registerClickableView(this.itemView);
            float intValue = (float) appViewSimilarApp.getAd().getStars().intValue();
            if (intValue == 0.0f) {
                this.rating.setText(C1086R.string.appcardview_title_no_stars);
            } else {
                this.rating.setText(this.oneDecimalFormatter.format((double) intValue));
            }
            this.itemView.setOnClickListener(new C1456ae(this, appViewSimilarApp, similarAppType));
        } else if (appViewSimilarApp.getApp() != null) {
            this.adLabel.setVisibility(8);
            this.nameTextView.setText(appViewSimilarApp.getApp().getName());
            ImageLoader.with(this.itemView.getContext()).loadWithRoundCorners(appViewSimilarApp.getApp().getIcon(), 8, this.iconView, C1086R.attr.placeholder_square);
            if (appViewSimilarApp.getApp().hasAppcBilling()) {
                this.appcInfoLayout.setVisibility(0);
                this.appInfoLayout.setVisibility(8);
            } else {
                this.appcInfoLayout.setVisibility(8);
                this.appInfoLayout.setVisibility(0);
                float rating2 = appViewSimilarApp.getApp().getRating();
                if (rating2 == 0.0f) {
                    this.rating.setText(C1086R.string.appcardview_title_no_stars);
                } else {
                    this.rating.setText(this.oneDecimalFormatter.format((double) rating2));
                }
            }
            this.itemView.setOnClickListener(new C1475be(this, appViewSimilarApp, similarAppType));
        }
    }
}
