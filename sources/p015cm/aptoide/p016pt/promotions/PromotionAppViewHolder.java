package p015cm.aptoide.p016pt.promotions;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.method.TransformationMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.text.DecimalFormat;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.networking.image.ImageLoader;
import p015cm.aptoide.p016pt.promotions.PromotionAppClick;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p050l.p051a.p052k.p053a.C4800a;
import p123rx.p127s.C12871b;

/* renamed from: cm.aptoide.pt.promotions.PromotionAppViewHolder */
public class PromotionAppViewHolder extends RecyclerView.C0629c0 {
    private TextView appDescription;
    private ImageView appIcon;
    private TextView appName;
    private TextView appRewardMessage;
    private int appState;
    private Button promotionAction;
    private final C12871b<PromotionAppClick> promotionAppClick;
    private final ThemeManager themeManager;

    public PromotionAppViewHolder(View view, int i, C12871b<PromotionAppClick> bVar, ThemeManager themeManager2) {
        super(view);
        this.appState = i;
        this.appIcon = (ImageView) view.findViewById(C1086R.C1088id.app_icon);
        this.appName = (TextView) view.findViewById(C1086R.C1088id.app_name);
        this.appDescription = (TextView) view.findViewById(C1086R.C1088id.app_description);
        this.appRewardMessage = (TextView) view.findViewById(C1086R.C1088id.app_reward);
        this.promotionAction = (Button) view.findViewById(C1086R.C1088id.promotion_app_action_button);
        this.promotionAppClick = bVar;
        this.themeManager = themeManager2;
    }

    private int getButtonMessage(int i) {
        if (i == 0) {
            return C1086R.string.appview_button_update;
        }
        if (!(i == 1 || i == 3)) {
            if (i == 4) {
                return C1086R.string.promotion_claim_button;
            }
            if (i == 5) {
                return C1086R.string.holidayspromotion_button_claimed;
            }
            if (i != 6) {
                throw new IllegalArgumentException("Wrong view type of promotion app");
            }
        }
        return C1086R.string.install;
    }

    private PromotionAppClick.ClickType getClickType(int i) {
        if (i == 0) {
            return PromotionAppClick.ClickType.UPDATE;
        }
        if (i == 1) {
            return PromotionAppClick.ClickType.DOWNLOAD;
        }
        if (i == 3) {
            return PromotionAppClick.ClickType.INSTALL_APP;
        }
        if (i == 4) {
            return PromotionAppClick.ClickType.CLAIM;
        }
        if (i == 6) {
            return PromotionAppClick.ClickType.DOWNGRADE;
        }
        throw new IllegalArgumentException("Wrong view type of promotion app");
    }

    private SpannableString handleRewardMessage(float f, String str, double d, boolean z) {
        String str2;
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        String num = Integer.toString(Math.round(f));
        if (z) {
            Context context = this.itemView.getContext();
            str2 = context.getString(C1086R.string.FIATpromotion_update_to_get_short, new Object[]{num, str + decimalFormat.format(d)});
        } else {
            Context context2 = this.itemView.getContext();
            str2 = context2.getString(C1086R.string.FIATpromotion_install_to_get_short, new Object[]{num, str + decimalFormat.format(d)});
        }
        SpannableString spannableString = new SpannableString(str2);
        spannableString.setSpan(new ForegroundColorSpan(this.itemView.getContext().getResources().getColor(C1086R.color.promotions_reward)), str2.indexOf(num), str2.length(), 33);
        return spannableString;
    }

    private void lockInstallButton(boolean z) {
        if (z) {
            this.promotionAction.setEnabled(false);
            this.promotionAction.setBackground(this.itemView.getResources().getDrawable(this.themeManager.getAttributeForTheme(C1086R.attr.lockedButton).resourceId));
            this.promotionAction.setTextColor(this.itemView.getContext().getResources().getColor(C1086R.color.grey_fog_light));
            return;
        }
        this.promotionAction.setEnabled(true);
        this.promotionAction.setBackground(this.itemView.getContext().getResources().getDrawable(C1086R.C1087drawable.appc_gradient_rounded));
    }

    private void setAppCardHeader(PromotionViewApp promotionViewApp) {
        ImageLoader.with(this.itemView.getContext()).load(promotionViewApp.getAppIcon(), this.appIcon);
        this.appName.setText(promotionViewApp.getName());
        this.appDescription.setText(promotionViewApp.getDescription());
        this.appRewardMessage.setText(handleRewardMessage(promotionViewApp.getAppcValue(), promotionViewApp.getFiatSymbol(), promotionViewApp.getFiatValue(), this.appState == 0));
    }

    /* renamed from: a */
    public /* synthetic */ void mo13630a(PromotionViewApp promotionViewApp, View view) {
        this.promotionAppClick.onNext(new PromotionAppClick(promotionViewApp, PromotionAppClick.ClickType.NAVIGATE));
    }

    /* renamed from: b */
    public /* synthetic */ void mo13631b(PromotionViewApp promotionViewApp, View view) {
        this.promotionAppClick.onNext(new PromotionAppClick(promotionViewApp, getClickType(this.appState)));
    }

    /* renamed from: c */
    public /* synthetic */ void mo13632c(PromotionViewApp promotionViewApp, View view) {
        this.promotionAppClick.onNext(new PromotionAppClick(promotionViewApp, getClickType(this.appState)));
    }

    public void setApp(PromotionViewApp promotionViewApp, boolean z) {
        setAppCardHeader(promotionViewApp);
        this.itemView.setOnClickListener(new C3786g1(this, promotionViewApp));
        this.promotionAction.setText(this.itemView.getContext().getString(getButtonMessage(this.appState), new Object[]{Float.valueOf(promotionViewApp.getAppcValue())}));
        if (z || this.appState == 5) {
            int i = this.appState;
            if (i == 5) {
                lockInstallButton(true);
                this.promotionAction.setBackground(this.itemView.getResources().getDrawable(this.themeManager.getAttributeForTheme(C1086R.attr.claimedButton).resourceId));
                this.promotionAction.setTextColor(this.themeManager.getAttributeForTheme(16842806).data);
                SpannableString spannableString = new SpannableString("  " + this.itemView.getResources().getString(C1086R.string.holidayspromotion_button_claimed).toUpperCase());
                Drawable c = C4800a.m7936c(this.itemView.getContext(), C1086R.C1087drawable.ic_promotion_claimed_check);
                c.setBounds(0, 0, c.getIntrinsicWidth(), c.getIntrinsicHeight());
                spannableString.setSpan(new ImageSpan(c, 1), 0, 1, 18);
                this.promotionAction.setTransformationMethod((TransformationMethod) null);
                this.promotionAction.setText(spannableString);
            } else if (i == 4) {
                this.promotionAction.setEnabled(true);
                this.promotionAction.setBackgroundDrawable(this.itemView.getContext().getResources().getDrawable(C1086R.C1087drawable.card_border_rounded_green));
                this.promotionAction.setOnClickListener(new C3794h1(this, promotionViewApp));
            } else {
                lockInstallButton(false);
                this.promotionAction.setOnClickListener(new C3778f1(this, promotionViewApp));
            }
        } else {
            lockInstallButton(true);
        }
    }
}
