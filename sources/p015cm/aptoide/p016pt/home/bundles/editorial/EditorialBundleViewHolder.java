package p015cm.aptoide.p016pt.home.bundles.editorial;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.material.snackbar.Snackbar;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import p015cm.aptoide.aptoideviews.appcoins.BonusAppcView;
import p015cm.aptoide.aptoideviews.skeleton.Skeleton;
import p015cm.aptoide.aptoideviews.skeleton.SkeletonUtils;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.bonus.BonusAppcModel;
import p015cm.aptoide.p016pt.editorial.CaptionBackgroundPainter;
import p015cm.aptoide.p016pt.editorial.ViewsFormatter;
import p015cm.aptoide.p016pt.editorialList.CurationCard;
import p015cm.aptoide.p016pt.home.bundles.base.ActionBundle;
import p015cm.aptoide.p016pt.home.bundles.base.ActionItem;
import p015cm.aptoide.p016pt.home.bundles.base.EditorialActionBundle;
import p015cm.aptoide.p016pt.home.bundles.base.HomeBundle;
import p015cm.aptoide.p016pt.home.bundles.base.HomeEvent;
import p015cm.aptoide.p016pt.networking.image.ImageLoader;
import p015cm.aptoide.p016pt.reactions.ReactionMapper;
import p015cm.aptoide.p016pt.reactions.ReactionsHomeEvent;
import p015cm.aptoide.p016pt.reactions.TopReactionsPreview;
import p015cm.aptoide.p016pt.reactions.data.ReactionType;
import p015cm.aptoide.p016pt.reactions.data.TopReaction;
import p015cm.aptoide.p016pt.reactions.p027ui.ReactionsPopup;
import p015cm.aptoide.p016pt.reactions.p027ui.ReactionsView;
import p015cm.aptoide.p016pt.themes.ThemeManager;
import p123rx.p127s.C12871b;

/* renamed from: cm.aptoide.pt.home.bundles.editorial.EditorialBundleViewHolder */
public class EditorialBundleViewHolder extends EditorialViewHolder {
    private final ImageView backgroundImage;
    private final BonusAppcView bonusAppcView;
    private final CaptionBackgroundPainter captionBackgroundPainter;
    private final CardView curationTypeCaption;
    private final TextView curationTypeCaptionText;
    private final View editorialCard;
    private final TextView editorialDate;
    private final TextView editorialTitle;
    private final TextView editorialViews;
    private final ImageButton reactButton;
    private Skeleton skeleton;
    private final ThemeManager themeAttributeProvider;
    private TopReactionsPreview topReactionsPreview;
    private final C12871b<HomeEvent> uiEventsListener;

    public EditorialBundleViewHolder(View view, C12871b<HomeEvent> bVar, CaptionBackgroundPainter captionBackgroundPainter2, ThemeManager themeManager) {
        super(view);
        this.uiEventsListener = bVar;
        this.editorialCard = view.findViewById(C1086R.C1088id.editorial_card);
        this.editorialTitle = (TextView) view.findViewById(C1086R.C1088id.editorial_title);
        this.editorialDate = (TextView) view.findViewById(C1086R.C1088id.editorial_date);
        this.editorialViews = (TextView) view.findViewById(C1086R.C1088id.editorial_views);
        this.backgroundImage = (ImageView) view.findViewById(C1086R.C1088id.background_image);
        this.reactButton = (ImageButton) view.findViewById(C1086R.C1088id.add_reactions);
        this.curationTypeCaption = (CardView) view.findViewById(C1086R.C1088id.curation_type_bubble);
        this.curationTypeCaptionText = (TextView) view.findViewById(C1086R.C1088id.curation_type_bubble_text);
        this.bonusAppcView = (BonusAppcView) view.findViewById(C1086R.C1088id.bonus_appc_view);
        this.captionBackgroundPainter = captionBackgroundPainter2;
        this.themeAttributeProvider = themeManager;
        TopReactionsPreview topReactionsPreview2 = new TopReactionsPreview();
        this.topReactionsPreview = topReactionsPreview2;
        topReactionsPreview2.initialReactionsSetup(view);
        this.skeleton = SkeletonUtils.applySkeleton(this.editorialCard, (ViewGroup) view.findViewById(C1086R.C1088id.root_cardview), (int) C1086R.layout.editorial_action_item_skeleton);
    }

    private void clearReactions() {
        this.reactButton.setImageResource(this.themeAttributeProvider.getAttributeForTheme(C1086R.attr.reactionInputDrawable).resourceId);
        this.topReactionsPreview.clearReactions();
    }

    private void setBundleInformation(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, HomeBundle homeBundle, List<TopReaction> list, int i2, String str8, String str9, String str10, boolean z, int i3) {
        clearReactions();
        setReactions(list, i2, str8);
        String str11 = str;
        ImageLoader.with(this.itemView.getContext()).load(str, this.backgroundImage);
        String str12 = str2;
        this.editorialTitle.setText(str2);
        this.editorialViews.setText(String.format(this.itemView.getContext().getString(C1086R.string.editorial_card_short_number_views), new Object[]{ViewsFormatter.formatNumberOfViews(str5)}));
        String str13 = str3;
        this.curationTypeCaptionText.setText(str3);
        this.captionBackgroundPainter.addColorBackgroundToCaption(this.curationTypeCaption, str9);
        setupCalendarDateString(str7);
        String str14 = str4;
        String str15 = str6;
        HomeBundle homeBundle2 = homeBundle;
        int i4 = i;
        this.reactButton.setOnClickListener(new C2901e(this, str14, str15, homeBundle2, i4));
        this.reactButton.setOnLongClickListener(new C2899c(this, str14, str15, homeBundle2, i4));
        this.editorialCard.setOnClickListener(new C2898b(this, str14, str15, homeBundle2, i4));
        if (z) {
            setFlair(str10, i3);
        } else {
            this.bonusAppcView.setVisibility(8);
        }
    }

    private void setFlair(String str, int i) {
        if (str.equals("appc-bonus-25")) {
            this.bonusAppcView.setVisibility(0);
            this.bonusAppcView.setPercentage(i);
            return;
        }
        this.bonusAppcView.setVisibility(8);
    }

    private void setReactions(List<TopReaction> list, int i, String str) {
        setUserReaction(str);
        this.topReactionsPreview.setReactions(list, i, this.itemView.getContext());
    }

    private void setUserReaction(String str) {
        if (this.topReactionsPreview.isReactionValid(str)) {
            this.reactButton.setImageResource(ReactionMapper.mapReaction(str));
        } else {
            this.reactButton.setImageResource(this.themeAttributeProvider.getAttributeForTheme(C1086R.attr.reactionInputDrawable).resourceId);
        }
    }

    private void setupCalendarDateString(String str) {
        Date date;
        try {
            date = new SimpleDateFormat("yyyy/MM/dd").parse(str.split(" ")[0].replace("-", "/"));
        } catch (ParseException unused) {
            Snackbar.m28076a(this.editorialCard, (CharSequence) this.itemView.getContext().getString(C1086R.string.unknown_error), -1).mo31972k();
            date = null;
        }
        if (date != null) {
            this.editorialDate.setText(DateFormat.getDateInstance(3).format(date));
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo12363a(String str, String str2, HomeBundle homeBundle, int i, View view) {
        this.uiEventsListener.onNext(new EditorialHomeEvent(str, str2, homeBundle, i, HomeEvent.Type.REACT_SINGLE_PRESS));
    }

    /* renamed from: b */
    public /* synthetic */ boolean mo12364b(String str, String str2, HomeBundle homeBundle, int i, View view) {
        this.uiEventsListener.onNext(new EditorialHomeEvent(str, str2, homeBundle, i, HomeEvent.Type.REACT_LONG_PRESS));
        return true;
    }

    /* renamed from: c */
    public /* synthetic */ void mo12365c(String str, String str2, HomeBundle homeBundle, int i, View view) {
        this.uiEventsListener.onNext(new EditorialHomeEvent(str, str2, homeBundle, i, HomeEvent.Type.EDITORIAL));
    }

    public void setBundle(HomeBundle homeBundle, int i) {
        int i2;
        boolean z;
        ActionBundle actionBundle = (ActionBundle) homeBundle;
        ActionItem actionItem = actionBundle.getActionItem();
        if (actionBundle instanceof EditorialActionBundle) {
            BonusAppcModel bonusAppcModel = ((EditorialActionBundle) actionBundle).getBonusAppcModel();
            boolean hasBonusAppc = bonusAppcModel.getHasBonusAppc();
            i2 = bonusAppcModel.getBonusPercentage();
            z = hasBonusAppc;
        } else {
            z = false;
            i2 = 0;
        }
        if (actionItem == null) {
            this.skeleton.showSkeleton();
            return;
        }
        this.skeleton.showOriginal();
        setBundleInformation(actionItem.getIcon(), actionItem.getTitle(), actionItem.getSubTitle(), actionItem.getCardId(), actionItem.getNumberOfViews(), actionItem.getType(), actionItem.getDate(), getAdapterPosition(), homeBundle, actionItem.getReactionList(), actionItem.getTotal(), actionItem.getUserReaction(), actionItem.getCaptionColor(), actionItem.getFlair(), z, i2);
    }

    public void setEditorialCard(CurationCard curationCard, int i, BonusAppcModel bonusAppcModel) {
        this.skeleton.showOriginal();
        setBundleInformation(curationCard.getIcon(), curationCard.getTitle(), curationCard.getSubTitle(), curationCard.getId(), curationCard.getViews(), curationCard.getType(), curationCard.getDate(), i, (HomeBundle) null, curationCard.getReactions(), curationCard.getNumberOfReactions(), curationCard.getUserReaction(), curationCard.getCaptionColor(), curationCard.getFlair(), bonusAppcModel.getHasBonusAppc(), bonusAppcModel.getBonusPercentage());
    }

    public void showReactions(String str, String str2, int i) {
        ReactionsPopup reactionsPopup = new ReactionsPopup(this.itemView.getContext(), this.reactButton);
        reactionsPopup.show();
        String str3 = str;
        String str4 = str2;
        int i2 = i;
        ReactionsPopup reactionsPopup2 = reactionsPopup;
        reactionsPopup.setOnReactionsItemClickListener(new C2897a(this, str3, str4, i2, reactionsPopup2));
        reactionsPopup.setOnDismissListener(new C2900d(this, str3, str4, i2, reactionsPopup2));
    }

    /* renamed from: a */
    public /* synthetic */ void mo12361a(String str, String str2, int i, ReactionsPopup reactionsPopup, ReactionType reactionType) {
        this.uiEventsListener.onNext(new ReactionsHomeEvent(str, str2, (HomeBundle) null, i, HomeEvent.Type.REACTION, ReactionMapper.mapUserReaction(reactionType)));
        reactionsPopup.dismiss();
        reactionsPopup.setOnReactionsItemClickListener((ReactionsPopup.OnReactionClickListener) null);
    }

    /* renamed from: a */
    public /* synthetic */ void mo12362a(String str, String str2, int i, ReactionsPopup reactionsPopup, ReactionsView reactionsView) {
        this.uiEventsListener.onNext(new EditorialHomeEvent(str, str2, (HomeBundle) null, i, HomeEvent.Type.POPUP_DISMISS));
        reactionsPopup.setOnDismissListener((ReactionsPopup.OnDismissListener) null);
    }
}
