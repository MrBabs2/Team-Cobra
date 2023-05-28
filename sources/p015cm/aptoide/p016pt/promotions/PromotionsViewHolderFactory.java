package p015cm.aptoide.p016pt.promotions;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p123rx.p127s.C12871b;

/* renamed from: cm.aptoide.pt.promotions.PromotionsViewHolderFactory */
public class PromotionsViewHolderFactory {
    private final C12871b<PromotionAppClick> promotionAppClick;
    private final ThemeManager themeManager;

    public PromotionsViewHolderFactory(C12871b<PromotionAppClick> bVar, ThemeManager themeManager2) {
        this.promotionAppClick = bVar;
        this.themeManager = themeManager2;
    }

    public RecyclerView.C0629c0 createViewHolder(ViewGroup viewGroup, int i) {
        switch (i) {
            case 0:
                return new PromotionAppViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C1086R.layout.promotion_app_inactive, viewGroup, false), 0, this.promotionAppClick, this.themeManager);
            case 1:
                return new PromotionAppViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C1086R.layout.promotion_app_inactive, viewGroup, false), 1, this.promotionAppClick, this.themeManager);
            case 2:
                return new PromotionAppDownloadingViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C1086R.layout.promotion_app_active_download, viewGroup, false), this.promotionAppClick);
            case 3:
                return new PromotionAppViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C1086R.layout.promotion_app_inactive, viewGroup, false), 3, this.promotionAppClick, this.themeManager);
            case 4:
                return new PromotionAppViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C1086R.layout.promotion_app_inactive, viewGroup, false), 4, this.promotionAppClick, this.themeManager);
            case 5:
                return new PromotionAppViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C1086R.layout.promotion_app_inactive, viewGroup, false), 5, this.promotionAppClick, this.themeManager);
            case 6:
                return new PromotionAppViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C1086R.layout.promotion_app_inactive, viewGroup, false), 6, this.promotionAppClick, this.themeManager);
            default:
                throw new IllegalArgumentException("Wrong view type of promotion app");
        }
    }
}
