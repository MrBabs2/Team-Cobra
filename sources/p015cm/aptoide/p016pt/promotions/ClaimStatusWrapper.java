package p015cm.aptoide.p016pt.promotions;

import java.util.List;

/* renamed from: cm.aptoide.pt.promotions.ClaimStatusWrapper */
public class ClaimStatusWrapper {
    private final List<Error> errors;
    private final Status status;

    /* renamed from: cm.aptoide.pt.promotions.ClaimStatusWrapper$Error */
    public enum Error {
        PROMOTION_CLAIMED,
        WRONG_ADDRESS,
        GENERIC,
        WALLET_NOT_VERIFIED
    }

    /* renamed from: cm.aptoide.pt.promotions.ClaimStatusWrapper$Status */
    public enum Status {
        OK,
        FAIL
    }

    public ClaimStatusWrapper(Status status2, List<Error> list) {
        this.status = status2;
        this.errors = list;
    }

    public List<Error> getErrors() {
        return this.errors;
    }

    public Status getStatus() {
        return this.status;
    }
}
