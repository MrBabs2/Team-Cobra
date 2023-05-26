package p015cm.aptoide.p016pt.dataprovider.p021ws.p024v3;

import java.util.List;
import p015cm.aptoide.p016pt.dataprovider.model.p019v3.ErrorResponse;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v3.GenericResponseV3 */
public class GenericResponseV3 {
    private String error;
    private String errorDescription;
    private List<ErrorResponse> errors;
    private String status;

    public String getError() {
        return this.error;
    }

    public String getErrorDescription() {
        return this.errorDescription;
    }

    public List<ErrorResponse> getErrors() {
        return this.errors;
    }

    public String getStatus() {
        return this.status;
    }

    public void setError(String str) {
        this.error = str;
    }

    public void setErrorDescription(String str) {
        this.errorDescription = str;
    }

    public void setErrors(List<ErrorResponse> list) {
        this.errors = list;
    }

    public void setStatus(String str) {
        this.status = str;
    }
}
