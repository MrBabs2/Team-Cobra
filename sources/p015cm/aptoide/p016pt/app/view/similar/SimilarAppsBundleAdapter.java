package p015cm.aptoide.p016pt.app.view.similar;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.text.DecimalFormat;
import java.util.List;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.app.view.similar.bundles.SimilarAppcAppsViewHolder;
import p015cm.aptoide.p016pt.app.view.similar.bundles.SimilarAppsViewHolder;
import p123rx.p127s.C12871b;

/* renamed from: cm.aptoide.pt.app.view.similar.SimilarAppsBundleAdapter */
public class SimilarAppsBundleAdapter extends RecyclerView.C0633g<SimilarBundleViewHolder> {
    private static final int APPC_APPS = 2131492923;
    private static final int APPS = 2131492924;
    private List<SimilarAppsBundle> bundles;
    private final DecimalFormat decimalFormat;
    private final C12871b<SimilarAppClickEvent> similarAppClick;

    /* renamed from: cm.aptoide.pt.app.view.similar.SimilarAppsBundleAdapter$1 */
    static /* synthetic */ class C18091 {

        /* renamed from: $SwitchMap$cm$aptoide$pt$app$view$similar$SimilarAppsBundle$BundleType */
        static final /* synthetic */ int[] f4397x549d0114;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                cm.aptoide.pt.app.view.similar.SimilarAppsBundle$BundleType[] r0 = p015cm.aptoide.p016pt.app.view.similar.SimilarAppsBundle.BundleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4397x549d0114 = r0
                cm.aptoide.pt.app.view.similar.SimilarAppsBundle$BundleType r1 = p015cm.aptoide.p016pt.app.view.similar.SimilarAppsBundle.BundleType.APPS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f4397x549d0114     // Catch:{ NoSuchFieldError -> 0x001d }
                cm.aptoide.pt.app.view.similar.SimilarAppsBundle$BundleType r1 = p015cm.aptoide.p016pt.app.view.similar.SimilarAppsBundle.BundleType.APPC_APPS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.app.view.similar.SimilarAppsBundleAdapter.C18091.<clinit>():void");
        }
    }

    public SimilarAppsBundleAdapter(List<SimilarAppsBundle> list, DecimalFormat decimalFormat2, C12871b<SimilarAppClickEvent> bVar) {
        this.bundles = list;
        this.decimalFormat = decimalFormat2;
        this.similarAppClick = bVar;
    }

    public void add(SimilarAppsBundle similarAppsBundle) {
        this.bundles.add(similarAppsBundle);
        notifyDataSetChanged();
    }

    public int getItemCount() {
        return this.bundles.size();
    }

    public int getItemViewType(int i) {
        int i2 = C18091.f4397x549d0114[this.bundles.get(i).getType().ordinal()];
        if (i2 == 1) {
            return C1086R.layout.appview_similar_layout;
        }
        if (i2 == 2) {
            return C1086R.layout.appview_similar_appc_layout;
        }
        throw new IllegalStateException("Bundle type not supported by the adapter: " + this.bundles.get(i).getType().name());
    }

    public void update(List<SimilarAppsBundle> list) {
        this.bundles = list;
        notifyDataSetChanged();
    }

    public void onBindViewHolder(SimilarBundleViewHolder similarBundleViewHolder, int i) {
        similarBundleViewHolder.setBundle(this.bundles.get(i), i);
    }

    public SimilarBundleViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        switch (i) {
            case C1086R.layout.appview_similar_appc_layout:
                return new SimilarAppcAppsViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C1086R.layout.appview_similar_appc_layout, viewGroup, false), this.decimalFormat, this.similarAppClick);
            case C1086R.layout.appview_similar_layout:
                return new SimilarAppsViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C1086R.layout.appview_similar_layout, viewGroup, false), this.decimalFormat, this.similarAppClick);
            default:
                throw new IllegalStateException("Invalid bundle view type");
        }
    }

    public void add(List<SimilarAppsBundle> list) {
        this.bundles.addAll(list);
        notifyItemInserted(list.size() - 1);
    }
}
