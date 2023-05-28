package p015cm.aptoide.p016pt.app.view;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.text.DecimalFormat;
import java.util.List;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.app.AppViewSimilarApp;
import p015cm.aptoide.p016pt.app.view.similar.SimilarAppClickEvent;
import p123rx.p127s.C12871b;

/* renamed from: cm.aptoide.pt.app.view.AppViewSimilarAppsAdapter */
public class AppViewSimilarAppsAdapter extends RecyclerView.C0633g<AppViewSimilarAppViewHolder> {
    private C12871b<SimilarAppClickEvent> appClicked;
    private DecimalFormat oneDecimalFormater;
    private List<AppViewSimilarApp> similarApps;
    private SimilarAppType type;

    /* renamed from: cm.aptoide.pt.app.view.AppViewSimilarAppsAdapter$SimilarAppType */
    public enum SimilarAppType {
        APPC_SIMILAR_APPS("appc_similar_apps"),
        SIMILAR_APPS("similar_apps");
        
        private final String description;

        private SimilarAppType(String str) {
            this.description = str;
        }

        public String getDescription() {
            return this.description;
        }
    }

    public AppViewSimilarAppsAdapter(List<AppViewSimilarApp> list, DecimalFormat decimalFormat, C12871b<SimilarAppClickEvent> bVar, SimilarAppType similarAppType) {
        this.similarApps = list;
        this.oneDecimalFormater = decimalFormat;
        this.appClicked = bVar;
        this.type = similarAppType;
    }

    public int getItemCount() {
        return this.similarApps.size();
    }

    public int getItemViewType(int i) {
        return this.similarApps.get(i).getNetworkAdType();
    }

    public void update(List<AppViewSimilarApp> list) {
        this.similarApps = list;
        notifyDataSetChanged();
    }

    public void onBindViewHolder(AppViewSimilarAppViewHolder appViewSimilarAppViewHolder, int i) {
        if (this.similarApps.get(i) != null) {
            appViewSimilarAppViewHolder.setSimilarApp(this.similarApps.get(i), this.type);
        }
    }

    public AppViewSimilarAppViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new AppViewSimilarAppViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C1086R.layout.displayable_grid_ad, viewGroup, false), this.oneDecimalFormater, this.appClicked);
    }
}
