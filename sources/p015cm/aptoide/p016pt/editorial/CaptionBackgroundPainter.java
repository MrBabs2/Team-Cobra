package p015cm.aptoide.p016pt.editorial;

import android.content.res.Resources;
import android.graphics.Color;
import androidx.cardview.widget.CardView;
import p015cm.aptoide.p016pt.C1086R;

/* renamed from: cm.aptoide.pt.editorial.CaptionBackgroundPainter */
public class CaptionBackgroundPainter {
    private final Resources resources;

    public CaptionBackgroundPainter(Resources resources2) {
        this.resources = resources2;
    }

    private void setDefaultBackgroundColor(CardView cardView) {
        cardView.setCardBackgroundColor(this.resources.getColor(C1086R.color.curation_default));
    }

    public void addColorBackgroundToCaption(CardView cardView, String str) {
        if (str == null || str.isEmpty()) {
            setDefaultBackgroundColor(cardView);
            return;
        }
        try {
            cardView.setCardBackgroundColor(Color.parseColor(str));
        } catch (IllegalArgumentException unused) {
            setDefaultBackgroundColor(cardView);
        }
    }
}
