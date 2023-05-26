package p015cm.aptoide.p016pt.home;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.text.DecimalFormat;
import p015cm.aptoide.p016pt.C1086R;

/* renamed from: cm.aptoide.pt.home.AppSecondaryInfoViewHolder */
public class AppSecondaryInfoViewHolder {
    private final LinearLayout appcLayout;
    private final TextView appcText;
    private final DecimalFormat oneDecimalFormatter;
    private final TextView rating;
    private final LinearLayout ratingLayout;

    public AppSecondaryInfoViewHolder(View view, DecimalFormat decimalFormat) {
        this.oneDecimalFormatter = decimalFormat;
        this.appcLayout = (LinearLayout) view.findViewById(C1086R.C1088id.appc_info_layout);
        this.appcText = (TextView) view.findViewById(C1086R.C1088id.appc_text);
        this.ratingLayout = (LinearLayout) view.findViewById(C1086R.C1088id.rating_info_layout);
        this.rating = (TextView) view.findViewById(C1086R.C1088id.rating_label);
    }

    private void setAppcVisibility(int i) {
        LinearLayout linearLayout = this.appcLayout;
        if (linearLayout != null) {
            linearLayout.setVisibility(i);
        }
    }

    private void setRating(float f) {
        TextView textView = this.rating;
        if (textView == null) {
            return;
        }
        if (f == 0.0f) {
            textView.setText(C1086R.string.appcardview_title_no_stars);
        } else {
            textView.setText(this.oneDecimalFormatter.format((double) f));
        }
    }

    private void setRatingVisibility(int i) {
        LinearLayout linearLayout = this.ratingLayout;
        if (linearLayout != null) {
            linearLayout.setVisibility(i);
        }
    }

    public void setInfo(boolean z, float f, boolean z2, boolean z3) {
        TextView textView = this.appcText;
        if (textView != null) {
            textView.setText(C1086R.string.appc_card_short);
        }
        setRating(f);
        if (z3) {
            if (z) {
                setAppcVisibility(0);
            } else {
                setAppcVisibility(4);
            }
            setRatingVisibility(0);
        } else if (z) {
            setAppcVisibility(0);
            setRatingVisibility(4);
        } else if (z2) {
            setAppcVisibility(4);
            setRatingVisibility(0);
        } else {
            setAppcVisibility(4);
        }
    }
}
