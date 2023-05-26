package p015cm.aptoide.p016pt.dataprovider.exception;

import p015cm.aptoide.p016pt.dataprovider.p021ws.p024v3.GenericResponseV3;
import p015cm.aptoide.p016pt.utils.BaseException;

/* renamed from: cm.aptoide.pt.dataprovider.exception.AptoideWsV3Exception */
public class AptoideWsV3Exception extends BaseException {
    private GenericResponseV3 baseResponse;

    public AptoideWsV3Exception(Throwable th) {
        super(th);
    }

    public GenericResponseV3 getBaseResponse() {
        return this.baseResponse;
    }

    public void setBaseResponse(GenericResponseV3 genericResponseV3) {
        this.baseResponse = genericResponseV3;
    }
}
