package p015cm.aptoide.p016pt.dataprovider.model.p020v7;

/* renamed from: cm.aptoide.pt.dataprovider.model.v7.BaseV7EndlessResponse */
public abstract class BaseV7EndlessResponse extends BaseV7Response {
    protected static final int NEXT_STEP = 10;
    private final boolean stableTotal;

    public BaseV7EndlessResponse() {
        this(true);
    }

    /* access modifiers changed from: protected */
    public boolean canEqual(Object obj) {
        return obj instanceof BaseV7EndlessResponse;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BaseV7EndlessResponse)) {
            return false;
        }
        BaseV7EndlessResponse baseV7EndlessResponse = (BaseV7EndlessResponse) obj;
        return baseV7EndlessResponse.canEqual(this) && super.equals(obj) && this.stableTotal == baseV7EndlessResponse.stableTotal;
    }

    public abstract int getNextSize();

    public abstract int getTotal();

    public abstract boolean hasData();

    public boolean hasStableTotal() {
        return this.stableTotal;
    }

    public int hashCode() {
        return ((super.hashCode() + 59) * 59) + (this.stableTotal ? 79 : 97);
    }

    public BaseV7EndlessResponse(boolean z) {
        this.stableTotal = z;
    }
}
