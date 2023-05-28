package p015cm.aptoide.p016pt.editorialList;

import java.util.Collections;
import java.util.List;

/* renamed from: cm.aptoide.pt.editorialList.EditorialCardListModel */
public class EditorialCardListModel {
    private final List<CurationCard> curationCards;
    private final Error error;
    private final boolean loading;
    private final int offset;
    private final int total;

    /* renamed from: cm.aptoide.pt.editorialList.EditorialCardListModel$Error */
    public enum Error {
        NETWORK,
        GENERIC
    }

    public EditorialCardListModel(Error error2) {
        this.error = error2;
        this.loading = false;
        this.offset = 0;
        this.total = 0;
        this.curationCards = Collections.emptyList();
    }

    public List<CurationCard> getCurationCards() {
        return this.curationCards;
    }

    public Error getError() {
        return this.error;
    }

    public int getOffset() {
        return this.offset;
    }

    public int getTotal() {
        return this.total;
    }

    public boolean hasError() {
        return this.error != null;
    }

    public boolean isLoading() {
        return this.loading;
    }

    public EditorialCardListModel(boolean z) {
        this.loading = z;
        this.error = null;
        this.offset = 0;
        this.total = 0;
        this.curationCards = Collections.emptyList();
    }

    public EditorialCardListModel(List<CurationCard> list, int i, int i2) {
        this.curationCards = list;
        this.offset = i;
        this.total = i2;
        this.error = null;
        this.loading = false;
    }
}
