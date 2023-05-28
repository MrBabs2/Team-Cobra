package com.aptoide.authentication.network;

import com.aptoide.authentication.network.RemoteAuthenticationService;
import com.squareup.moshi.C8924f;
import com.squareup.moshi.C8930i;
import com.squareup.moshi.C8939o;
import com.squareup.moshi.C8952r;
import com.squareup.moshi.C8970t;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.p206u.C8973c;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0014\u001a\u00020\bH\u0016R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0001X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, mo16641d2 = {"Lcom/aptoide/authentication/network/RemoteAuthenticationService_CredentialsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/aptoide/authentication/network/RemoteAuthenticationService$Credentials;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "arrayOfStringAdapter", "", "", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "toString", "aptoide-authentication-core"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* compiled from: RemoteAuthenticationService_CredentialsJsonAdapter.kt */
public final class RemoteAuthenticationService_CredentialsJsonAdapter extends C8924f<RemoteAuthenticationService.Credentials> {
    private final C8924f<String[]> arrayOfStringAdapter;
    private final C8930i.C8931a options;
    private final C8924f<String> stringAdapter;

    public RemoteAuthenticationService_CredentialsJsonAdapter(C8952r rVar) {
        Class<String> cls = String.class;
        C10202j.m34178b(rVar, "moshi");
        C8930i.C8931a a = C8930i.C8931a.m29357a("credential", "supported");
        C10202j.m34174a((Object) a, "JsonReader.Options.of(\"credential\", \"supported\")");
        this.options = a;
        C8924f<String> a2 = rVar.mo32971a(cls, C10530o0.m35747a(), "credential");
        C10202j.m34174a((Object) a2, "moshi.adapter(String::cl…et(),\n      \"credential\")");
        this.stringAdapter = a2;
        C8924f<String[]> a3 = rVar.mo32971a(C8970t.m29522b(cls), C10530o0.m35747a(), "supported");
        C10202j.m34174a((Object) a3, "moshi.adapter(Types.arra… emptySet(), \"supported\")");
        this.arrayOfStringAdapter = a3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(61);
        sb.append("GeneratedJsonAdapter(");
        sb.append("RemoteAuthenticationService.Credentials");
        sb.append(')');
        String sb2 = sb.toString();
        C10202j.m34174a((Object) sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public RemoteAuthenticationService.Credentials fromJson(C8930i iVar) {
        C10202j.m34178b(iVar, "reader");
        iVar.mo32868b();
        String str = null;
        String[] strArr = null;
        while (iVar.mo32874m()) {
            int a = iVar.mo32861a(this.options);
            if (a == -1) {
                iVar.mo32884y();
                iVar.mo32885z();
            } else if (a == 0) {
                str = this.stringAdapter.fromJson(iVar);
                if (str == null) {
                    JsonDataException b = C8973c.m29543b("credential", "credential", iVar);
                    C10202j.m34174a((Object) b, "Util.unexpectedNull(\"cre…    \"credential\", reader)");
                    throw b;
                }
            } else if (a == 1 && (strArr = this.arrayOfStringAdapter.fromJson(iVar)) == null) {
                JsonDataException b2 = C8973c.m29543b("supported", "supported", iVar);
                C10202j.m34174a((Object) b2, "Util.unexpectedNull(\"sup…ed\", \"supported\", reader)");
                throw b2;
            }
        }
        iVar.mo32872i();
        if (str == null) {
            JsonDataException a2 = C8973c.m29530a("credential", "credential", iVar);
            C10202j.m34174a((Object) a2, "Util.missingProperty(\"cr…l\", \"credential\", reader)");
            throw a2;
        } else if (strArr != null) {
            return new RemoteAuthenticationService.Credentials(str, strArr);
        } else {
            JsonDataException a3 = C8973c.m29530a("supported", "supported", iVar);
            C10202j.m34174a((Object) a3, "Util.missingProperty(\"su…ed\", \"supported\", reader)");
            throw a3;
        }
    }

    public void toJson(C8939o oVar, RemoteAuthenticationService.Credentials credentials) {
        C10202j.m34178b(oVar, "writer");
        if (credentials != null) {
            oVar.mo32893b();
            oVar.mo32892a("credential");
            this.stringAdapter.toJson(oVar, credentials.getCredential());
            oVar.mo32892a("supported");
            this.arrayOfStringAdapter.toJson(oVar, credentials.getSupported());
            oVar.mo32901l();
            return;
        }
        throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
    }
}
