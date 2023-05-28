package p015cm.aptoide.p016pt.dataprovider.model.p019v3;

import java.util.List;

/* renamed from: cm.aptoide.pt.dataprovider.model.v3.BaseV3Response */
public class BaseV3Response {
    private List<ErrorResponse> errors;
    private String status;

    /* access modifiers changed from: protected */
    public boolean canEqual(Object obj) {
        return obj instanceof BaseV3Response;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BaseV3Response)) {
            return false;
        }
        BaseV3Response baseV3Response = (BaseV3Response) obj;
        if (!baseV3Response.canEqual(this)) {
            return false;
        }
        String status2 = getStatus();
        String status3 = baseV3Response.getStatus();
        if (status2 != null ? !status2.equals(status3) : status3 != null) {
            return false;
        }
        List<ErrorResponse> errors2 = getErrors();
        List<ErrorResponse> errors3 = baseV3Response.getErrors();
        return errors2 != null ? errors2.equals(errors3) : errors3 == null;
    }

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

    public int hashCode() {
        int i;
        String status2 = getStatus();
        int i2 = 43;
        if (status2 == null) {
            i = 43;
        } else {
            i = status2.hashCode();
        }
        List<ErrorResponse> errors2 = getErrors();
        int i3 = (i + 59) * 59;
        if (errors2 != null) {
            i2 = errors2.hashCode();
        }
        return i3 + i2;
    }

    public boolean isOk() {
        String str = this.status;
        return str != null && str.equalsIgnoreCase("ok");
    }

    public void setErrors(List<ErrorResponse> list) {
        this.errors = list;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public String toString() {
        return "BaseV3Response(status=" + getStatus() + ", errors=" + getErrors() + ")";
    }
}
