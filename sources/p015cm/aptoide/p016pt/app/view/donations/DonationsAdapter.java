package p015cm.aptoide.p016pt.app.view.donations;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.text.DecimalFormat;
import java.util.List;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.app.view.donations.view.DonationListEntryViewHolder;
import p015cm.aptoide.p016pt.donations.Donation;

/* renamed from: cm.aptoide.pt.app.view.donations.DonationsAdapter */
public class DonationsAdapter extends RecyclerView.C0633g<DonationListEntryViewHolder> {
    private List<Donation> donations;

    public DonationsAdapter(List<Donation> list) {
        this.donations = list;
    }

    public int getItemCount() {
        return this.donations.size();
    }

    public void setDonations(List<Donation> list) {
        this.donations = list;
        notifyDataSetChanged();
    }

    public void onBindViewHolder(DonationListEntryViewHolder donationListEntryViewHolder, int i) {
        donationListEntryViewHolder.setUp(i + 1, this.donations.get(i).getOwner(), this.donations.get(i).getAppc());
    }

    public DonationListEntryViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new DonationListEntryViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C1086R.layout.appview_donations_list_entry, viewGroup, false), new DecimalFormat("0.##"));
    }
}
