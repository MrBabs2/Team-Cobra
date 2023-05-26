package p015cm.aptoide.p016pt.app.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.p162p.p163l.C6287i;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.app.AppReview;
import p015cm.aptoide.p016pt.networking.image.ImageLoader;
import p015cm.aptoide.p016pt.utils.AptoideUtils;

/* renamed from: cm.aptoide.pt.app.view.MiniTopReviewViewHolder */
public class MiniTopReviewViewHolder extends RecyclerView.C0629c0 {
    public static final int LAYOUT_ID = 2131493075;
    private TextView addedDate;
    private TextView commentText;
    private TextView commentTitle;
    private C6287i<Drawable> imageLoadingTarget;
    private RatingBar ratingBar;
    private ImageView userIconImageView;
    private TextView userName;

    public MiniTopReviewViewHolder(View view) {
        super(view);
        bindViews(view);
    }

    private void bindViews(View view) {
        this.userIconImageView = (ImageView) view.findViewById(C1086R.C1088id.user_icon);
        this.ratingBar = (RatingBar) view.findViewById(C1086R.C1088id.rating_bar);
        this.commentTitle = (TextView) view.findViewById(C1086R.C1088id.comment_title);
        this.userName = (TextView) view.findViewById(C1086R.C1088id.user_name);
        this.addedDate = (TextView) view.findViewById(C1086R.C1088id.added_date);
        this.commentText = (TextView) view.findViewById(C1086R.C1088id.comment);
    }

    public void cancelImageLoad() {
        if (this.imageLoadingTarget != null) {
            ImageLoader.cancel(this.itemView.getContext().getApplicationContext(), this.imageLoadingTarget);
        }
    }

    public void setup(AppReview appReview) {
        String avatar = appReview.getReviewUser().getAvatar();
        Context context = this.itemView.getContext();
        this.imageLoadingTarget = ImageLoader.with(context).loadWithCircleTransformAndPlaceHolderAvatarSize(avatar, this.userIconImageView, C1086R.C1087drawable.layer_1);
        this.userName.setText(appReview.getReviewUser().getName());
        this.ratingBar.setRating(appReview.getReviewStats().getRating());
        this.commentTitle.setText(appReview.getTitle());
        this.commentText.setText(appReview.getBody());
        this.addedDate.setText(AptoideUtils.DateTimeU.getInstance(context).getTimeDiffString(appReview.getAdded().getTime(), context, context.getResources()));
    }
}
