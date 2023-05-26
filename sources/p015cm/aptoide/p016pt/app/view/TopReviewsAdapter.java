package p015cm.aptoide.p016pt.app.view;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.app.AppReview;

/* renamed from: cm.aptoide.pt.app.view.TopReviewsAdapter */
public class TopReviewsAdapter extends RecyclerView.C0633g<MiniTopReviewViewHolder> {
    private final AppReview[] reviews;

    public TopReviewsAdapter() {
        this((AppReview[]) null);
    }

    public int getItemCount() {
        AppReview[] appReviewArr = this.reviews;
        if (appReviewArr == null) {
            return 0;
        }
        return appReviewArr.length;
    }

    public TopReviewsAdapter(AppReview[] appReviewArr) {
        this.reviews = appReviewArr;
    }

    public void onBindViewHolder(MiniTopReviewViewHolder miniTopReviewViewHolder, int i) {
        miniTopReviewViewHolder.setup(this.reviews[i]);
    }

    public MiniTopReviewViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new MiniTopReviewViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C1086R.layout.mini_top_comment, viewGroup, false));
    }

    public void onViewRecycled(MiniTopReviewViewHolder miniTopReviewViewHolder) {
        miniTopReviewViewHolder.cancelImageLoad();
        super.onViewRecycled(miniTopReviewViewHolder);
    }
}
