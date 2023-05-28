package p015cm.aptoide.p016pt.reviews;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.GetAppMeta;
import p015cm.aptoide.p016pt.utils.AptoideUtils;

/* renamed from: cm.aptoide.pt.reviews.RatingBarsLayout */
public class RatingBarsLayout {
    private ProgressAndTextLayout[] progressAndTextLayouts;

    /* renamed from: cm.aptoide.pt.reviews.RatingBarsLayout$ProgressAndTextLayout */
    private static class ProgressAndTextLayout {
        private ProgressBar progressBar;
        private TextView text;

        public ProgressAndTextLayout(int i, int i2, View view) {
            this.progressBar = (ProgressBar) view.findViewById(i);
            this.text = (TextView) view.findViewById(i2);
        }

        public void setup(int i, int i2) {
            this.progressBar.setMax(i);
            this.progressBar.setProgress(i2);
            this.text.setText(AptoideUtils.StringU.withSuffix((long) i2));
        }
    }

    public RatingBarsLayout(View view) {
        ProgressAndTextLayout[] progressAndTextLayoutArr = new ProgressAndTextLayout[5];
        this.progressAndTextLayouts = progressAndTextLayoutArr;
        progressAndTextLayoutArr[0] = new ProgressAndTextLayout(C1086R.C1088id.one_rate_star_progress, C1086R.C1088id.one_rate_star_count, view);
        this.progressAndTextLayouts[1] = new ProgressAndTextLayout(C1086R.C1088id.two_rate_star_progress, C1086R.C1088id.two_rate_star_count, view);
        this.progressAndTextLayouts[2] = new ProgressAndTextLayout(C1086R.C1088id.three_rate_star_progress, C1086R.C1088id.three_rate_star_count, view);
        this.progressAndTextLayouts[3] = new ProgressAndTextLayout(C1086R.C1088id.four_rate_star_progress, C1086R.C1088id.four_rate_star_count, view);
        this.progressAndTextLayouts[4] = new ProgressAndTextLayout(C1086R.C1088id.five_rate_star_progress, C1086R.C1088id.five_rate_star_count, view);
    }

    public void setup(GetAppMeta.Stats.Rating rating) {
        int total = rating.getTotal();
        for (GetAppMeta.Stats.Rating.Vote next : rating.getVotes()) {
            this.progressAndTextLayouts[next.getValue() - 1].setup(total, next.getCount());
        }
    }
}
