package p015cm.aptoide.p016pt.view.recycler;

import p015cm.aptoide.p016pt.dataprovider.model.p020v7.BaseV7EndlessResponse;

/* renamed from: cm.aptoide.pt.view.recycler.MultiLangPatch */
public class MultiLangPatch {
    private int total;
    private int totalWaiting;

    public int getTotal() {
        return this.total;
    }

    /* access modifiers changed from: package-private */
    public void updateOffset() {
        this.total = this.totalWaiting;
    }

    /* access modifiers changed from: package-private */
    public void updateTotal(BaseV7EndlessResponse baseV7EndlessResponse) {
        this.totalWaiting += baseV7EndlessResponse.getTotal();
    }
}
