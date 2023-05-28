package p015cm.aptoide.p016pt.app.view.donations.view;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.text.DecimalFormat;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.view.Translator;

/* renamed from: cm.aptoide.pt.app.view.donations.view.DonationListEntryViewHolder */
public class DonationListEntryViewHolder extends RecyclerView.C0629c0 {
    private static final String DEFAULT_NO_NAME = "Mysterious Donor";
    private DecimalFormat decimalFormat;
    private TextView donatedValue;
    private TextView nickname;
    private TextView position;

    public DonationListEntryViewHolder(View view, DecimalFormat decimalFormat2) {
        super(view);
        this.decimalFormat = decimalFormat2;
        this.position = (TextView) view.findViewById(C1086R.C1088id.user_placement);
        this.nickname = (TextView) view.findViewById(C1086R.C1088id.nickname);
        this.donatedValue = (TextView) view.findViewById(C1086R.C1088id.donated_value);
    }

    public void setUp(int i, String str, float f) {
        this.position.setText(String.valueOf(i));
        if (str == null || !str.equals(DEFAULT_NO_NAME)) {
            this.nickname.setText(str);
        } else {
            this.nickname.setText(Translator.translate(str, this.itemView.getContext(), ""));
        }
        this.nickname.setText(str);
        this.donatedValue.setText(this.decimalFormat.format((double) f));
    }
}
