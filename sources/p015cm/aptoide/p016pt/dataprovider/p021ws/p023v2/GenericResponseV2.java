package p015cm.aptoide.p016pt.dataprovider.p021ws.p023v2;

import java.util.List;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v2.GenericResponseV2 */
public class GenericResponseV2 {
    List<ErrorResponse> errors;
    String status;

    public List<ErrorResponse> getErrors() {
        return this.errors;
    }

    public String getStatus() {
        return this.status;
    }

    public boolean hasErrors() {
        List<ErrorResponse> list = this.errors;
        return list != null && !list.isEmpty();
    }

    public boolean isOk() {
        String str = this.status;
        return str != null && str.equalsIgnoreCase("ok");
    }
}
