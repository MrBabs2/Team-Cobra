package p015cm.aptoide.p016pt.dataprovider.exception;

import p015cm.aptoide.p016pt.dataprovider.model.p020v7.BaseV7Response;
import p015cm.aptoide.p016pt.utils.BaseException;

/* renamed from: cm.aptoide.pt.dataprovider.exception.AptoideWsV7Exception */
public class AptoideWsV7Exception extends BaseException {
    private BaseV7Response baseResponse;

    public AptoideWsV7Exception(Throwable th) {
        super(th);
    }

    public BaseV7Response getBaseResponse() {
        return this.baseResponse;
    }

    public void setBaseResponse(BaseV7Response baseV7Response) {
        this.baseResponse = baseV7Response;
    }

    public AptoideWsV7Exception() {
    }
}
