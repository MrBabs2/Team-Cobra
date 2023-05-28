package p015cm.aptoide.accountmanager;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p015cm.aptoide.p016pt.dataprovider.exception.AptoideWsV3Exception;
import p015cm.aptoide.p016pt.dataprovider.model.p019v3.ErrorResponse;
import p015cm.aptoide.p016pt.dataprovider.model.p019v3.OAuth;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p024v3.GenericResponseV3;

/* renamed from: cm.aptoide.accountmanager.AccountException */
public class AccountException extends Exception {
    private String code;
    private final String error;
    private final Map<String, String> errors;

    public AccountException(List<ErrorResponse> list) {
        this.errors = new HashMap();
        if (list == null || list.isEmpty()) {
            this.code = null;
        } else {
            this.code = list.get(0).code;
        }
        if (list == null || list.isEmpty()) {
            this.error = null;
        } else {
            this.error = list.get(0).msg;
        }
        this.errors.put(String.valueOf(this.error), String.valueOf(this.code));
    }

    private Map<String, String> createErrorList(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(str, str2);
        return hashMap;
    }

    private Map<String, String> createErrorsList(OAuth oAuth) {
        if (oAuth.getErrors() == null || oAuth.getErrors().isEmpty()) {
            return createErrorList(oAuth.getError(), oAuth.getErrorDescription());
        }
        return getErrorsList(oAuth.getErrors());
    }

    private Map<String, String> getErrorsList(List<ErrorResponse> list) {
        HashMap hashMap = new HashMap();
        for (ErrorResponse next : list) {
            hashMap.put(String.valueOf(next.code), String.valueOf(next.msg));
        }
        return hashMap;
    }

    public String getCode() {
        return this.code;
    }

    public String getError() {
        return this.error;
    }

    public Map<String, String> getErrors() {
        return this.errors;
    }

    public boolean hasCode() {
        return this.code != null;
    }

    private Map<String, String> createErrorsList(GenericResponseV3 genericResponseV3) {
        if (genericResponseV3.getErrors() == null || genericResponseV3.getErrors().isEmpty()) {
            return createErrorList(genericResponseV3.getError(), genericResponseV3.getErrorDescription());
        }
        return getErrorsList(genericResponseV3.getErrors());
    }

    public AccountException(AptoideWsV3Exception aptoideWsV3Exception) {
        this.error = aptoideWsV3Exception.getBaseResponse().getError();
        this.errors = createErrorsList(aptoideWsV3Exception.getBaseResponse());
    }

    public AccountException(OAuth oAuth) {
        this.error = oAuth.getError();
        this.errors = createErrorsList(oAuth);
    }
}
