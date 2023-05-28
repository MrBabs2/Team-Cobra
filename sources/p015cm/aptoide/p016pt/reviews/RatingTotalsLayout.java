package p015cm.aptoide.p016pt.reviews;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatRatingBar;
import java.util.Locale;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.GetAppMeta;
import p015cm.aptoide.p016pt.utils.AptoideUtils;

/* renamed from: cm.aptoide.pt.reviews.RatingTotalsLayout */
public class RatingTotalsLayout {
    private AppCompatRatingBar ratingBar;
    private TextView ratingValue;
    private TextView usersVoted;

    public RatingTotalsLayout(View view) {
        this.usersVoted = (TextView) view.findViewById(C1086R.C1088id.users_voted);
        this.ratingValue = (TextView) view.findViewById(C1086R.C1088id.rating_value);
        this.ratingBar = (AppCompatRatingBar) view.findViewById(C1086R.C1088id.rating_bar);
    }

    public void setup(GetAppMeta.Stats.Rating rating) {
        this.usersVoted.setText(AptoideUtils.StringU.withSuffix((long) rating.getTotal()));
        this.ratingValue.setText(String.format(Locale.getDefault(), "%.1f", new Object[]{Float.valueOf(rating.getAvg())}));
        this.ratingBar.setRating(rating.getAvg());
    }
}
