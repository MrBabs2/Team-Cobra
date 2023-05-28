package p015cm.aptoide.p016pt.view.recycler.widget;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.C0456c;
import java.util.Locale;
import p015cm.aptoide.p016pt.AptoideApplication;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.FullReview;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.GetAppMeta;
import p015cm.aptoide.p016pt.navigator.FragmentNavigator;
import p015cm.aptoide.p016pt.networking.image.ImageLoader;
import p015cm.aptoide.p016pt.reviews.RowReviewDisplayable;
import p015cm.aptoide.p016pt.utils.AptoideUtils;
import p112n.p118g.p301a.p310c.C10695a;

/* renamed from: cm.aptoide.pt.view.recycler.widget.RowReviewWidget */
public class RowReviewWidget extends Widget<RowReviewDisplayable> {
    public ImageView appIcon;
    public TextView appName;
    private ImageView avatar;
    public TextView rating;
    private TextView reviewBody;
    private TextView reviewer;

    public RowReviewWidget(View view) {
        super(view);
    }

    /* renamed from: a */
    static /* synthetic */ void m7673a(RowReviewDisplayable rowReviewDisplayable, FragmentNavigator fragmentNavigator, GetAppMeta.App app, FullReview fullReview, Void voidR) {
        if (rowReviewDisplayable.getStoreAnalytics() != null) {
            rowReviewDisplayable.getStoreAnalytics().sendStoreInteractEvent("View Review", "Latest Reviews", ((FullReview) rowReviewDisplayable.getPojo()).getData().getApp().getStore().getName());
        }
        fragmentNavigator.navigateTo(AptoideApplication.getFragmentProvider().newRateAndReviewsFragment(app.getId(), app.getName(), app.getStore().getName(), app.getPackageName(), fullReview.getId()), true);
    }

    /* access modifiers changed from: protected */
    public void assignViews(View view) {
        this.appIcon = (ImageView) view.findViewById(C1086R.C1088id.app_icon);
        this.rating = (TextView) view.findViewById(C1086R.C1088id.rating);
        this.appName = (TextView) view.findViewById(C1086R.C1088id.app_name);
        this.avatar = (ImageView) view.findViewById(C1086R.C1088id.avatar);
        this.reviewer = (TextView) view.findViewById(C1086R.C1088id.reviewer);
        this.reviewBody = (TextView) view.findViewById(C1086R.C1088id.description);
    }

    public void bindView(RowReviewDisplayable rowReviewDisplayable, int i) {
        C0456c context = getContext();
        FullReview fullReview = (FullReview) rowReviewDisplayable.getPojo();
        GetAppMeta.App app = fullReview.getData().getApp();
        if (app != null) {
            this.appName.setText(app.getName());
            ImageLoader.with(context).load(app.getIcon(), this.appIcon);
        } else {
            this.appName.setVisibility(4);
            this.appIcon.setVisibility(4);
        }
        this.reviewBody.setText(fullReview.getBody());
        this.reviewer.setText(AptoideUtils.StringU.getFormattedString(C1086R.string.reviewed_by, getContext().getResources(), fullReview.getUser().getName()));
        this.rating.setText(String.format(Locale.getDefault(), "%d", new Object[]{Long.valueOf((long) fullReview.getStats().getRating())}));
        ImageLoader.with(context).loadWithCircleTransformAndPlaceHolderAvatarSize(fullReview.getUser().getAvatar(), this.avatar, C1086R.C1087drawable.layer_1);
        this.compositeSubscription.mo18721a(C10695a.m36221a(this.itemView).mo18675c(new C4678e(rowReviewDisplayable, getFragmentNavigator(), app, fullReview)));
    }
}
