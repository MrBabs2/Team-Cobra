package p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.analyticsbody;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v7.analyticsbody.Result */
public class Result {
    private ResultError error;
    private ResultStatus status;

    /* renamed from: cm.aptoide.pt.dataprovider.ws.v7.analyticsbody.Result$ResultStatus */
    public enum ResultStatus {
        SUCC,
        FAIL
    }

    public ResultError getError() {
        return this.error;
    }

    public ResultStatus getStatus() {
        return this.status;
    }

    public void setError(ResultError resultError) {
        this.error = resultError;
    }

    public void setStatus(ResultStatus resultStatus) {
        this.status = resultStatus;
    }
}
