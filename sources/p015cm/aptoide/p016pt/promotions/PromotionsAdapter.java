package p015cm.aptoide.p016pt.promotions;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p015cm.aptoide.p016pt.app.DownloadModel;

/* renamed from: cm.aptoide.pt.promotions.PromotionsAdapter */
public class PromotionsAdapter extends RecyclerView.C0633g<RecyclerView.C0629c0> {
    static final int CLAIM = 4;
    static final int CLAIMED = 5;
    static final int DOWNGRADE = 6;
    static final int DOWNLOAD = 1;
    static final int DOWNLOADING = 2;
    static final int INSTALL = 3;
    static final int UPDATE = 0;
    private List<PromotionViewApp> appsList;
    private boolean isWalletInstalled;
    private PromotionsViewHolderFactory viewHolderFactory;

    /* renamed from: cm.aptoide.pt.promotions.PromotionsAdapter$1 */
    static /* synthetic */ class C37311 {
        static final /* synthetic */ int[] $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                cm.aptoide.pt.app.DownloadModel$Action[] r0 = p015cm.aptoide.p016pt.app.DownloadModel.Action.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action = r0
                cm.aptoide.pt.app.DownloadModel$Action r1 = p015cm.aptoide.p016pt.app.DownloadModel.Action.DOWNGRADE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action     // Catch:{ NoSuchFieldError -> 0x001d }
                cm.aptoide.pt.app.DownloadModel$Action r1 = p015cm.aptoide.p016pt.app.DownloadModel.Action.INSTALL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action     // Catch:{ NoSuchFieldError -> 0x0028 }
                cm.aptoide.pt.app.DownloadModel$Action r1 = p015cm.aptoide.p016pt.app.DownloadModel.Action.OPEN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$cm$aptoide$pt$app$DownloadModel$Action     // Catch:{ NoSuchFieldError -> 0x0033 }
                cm.aptoide.pt.app.DownloadModel$Action r1 = p015cm.aptoide.p016pt.app.DownloadModel.Action.UPDATE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.promotions.PromotionsAdapter.C37311.<clinit>():void");
        }
    }

    public PromotionsAdapter(List<PromotionViewApp> list, PromotionsViewHolderFactory promotionsViewHolderFactory) {
        this.appsList = list;
        this.viewHolderFactory = promotionsViewHolderFactory;
    }

    public int getItemCount() {
        return this.appsList.size();
    }

    public int getItemViewType(int i) {
        PromotionViewApp promotionViewApp = this.appsList.get(i);
        if (promotionViewApp.isClaimed()) {
            return 5;
        }
        DownloadModel downloadModel = promotionViewApp.getDownloadModel();
        if (downloadModel.isDownloading()) {
            return 2;
        }
        int i2 = C37311.$SwitchMap$cm$aptoide$pt$app$DownloadModel$Action[downloadModel.getAction().ordinal()];
        if (i2 == 1) {
            return 6;
        }
        if (i2 == 2) {
            return 3;
        }
        if (i2 == 3) {
            return 4;
        }
        if (i2 == 4) {
            return 0;
        }
        throw new IllegalArgumentException("Invalid type of download action");
    }

    public void isWalletInstalled(boolean z) {
        this.isWalletInstalled = z;
        notifyDataSetChanged();
    }

    public void onBindViewHolder(RecyclerView.C0629c0 c0Var, int i) {
        if (c0Var instanceof PromotionAppDownloadingViewHolder) {
            ((PromotionAppDownloadingViewHolder) c0Var).setApp(this.appsList.get(i));
        } else if (c0Var instanceof PromotionAppViewHolder) {
            ((PromotionAppViewHolder) c0Var).setApp(this.appsList.get(i), this.isWalletInstalled);
        } else {
            throw new IllegalStateException("Invalid type of ViewHolder");
        }
    }

    public RecyclerView.C0629c0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return this.viewHolderFactory.createViewHolder(viewGroup, i);
    }

    public void setPromotionApp(PromotionViewApp promotionViewApp) {
        int indexOf = this.appsList.indexOf(promotionViewApp);
        if (indexOf != -1) {
            this.appsList.set(indexOf, promotionViewApp);
            notifyItemChanged(indexOf);
            return;
        }
        this.appsList.add(promotionViewApp);
        notifyDataSetChanged();
    }

    public void updateClaimStatus(String str) {
        for (PromotionViewApp next : this.appsList) {
            if (next.getPackageName().equals(str)) {
                next.setClaimed();
                notifyDataSetChanged();
            }
        }
    }
}
