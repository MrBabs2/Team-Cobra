package com.aptoide.authentication.model;

import com.aptoide.authentication.model.OAuth2;
import com.squareup.moshi.C8924f;
import com.squareup.moshi.C8930i;
import com.squareup.moshi.C8939o;
import com.squareup.moshi.C8952r;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.p206u.C8973c;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0016\u001a\u00020\rH\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0001X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, mo16641d2 = {"Lcom/aptoide/authentication/model/OAuth2JsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/aptoide/authentication/model/OAuth2;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "booleanAdapter", "", "dataAdapter", "Lcom/aptoide/authentication/model/OAuth2$Data;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "toString", "aptoide-authentication-core"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* compiled from: OAuth2JsonAdapter.kt */
public final class OAuth2JsonAdapter extends C8924f<OAuth2> {
    private final C8924f<Boolean> booleanAdapter;
    private final C8924f<OAuth2.Data> dataAdapter;
    private final C8930i.C8931a options;
    private final C8924f<String> stringAdapter;

    public OAuth2JsonAdapter(C8952r rVar) {
        C10202j.m34178b(rVar, "moshi");
        C8930i.C8931a a = C8930i.C8931a.m29357a("type", "signup", "data");
        C10202j.m34174a((Object) a, "JsonReader.Options.of(\"type\", \"signup\", \"data\")");
        this.options = a;
        C8924f<String> a2 = rVar.mo32971a(String.class, C10530o0.m35747a(), "type");
        C10202j.m34174a((Object) a2, "moshi.adapter(String::cl…emptySet(),\n      \"type\")");
        this.stringAdapter = a2;
        C8924f<Boolean> a3 = rVar.mo32971a(Boolean.TYPE, C10530o0.m35747a(), "signup");
        C10202j.m34174a((Object) a3, "moshi.adapter(Boolean::c…ptySet(),\n      \"signup\")");
        this.booleanAdapter = a3;
        C8924f<OAuth2.Data> a4 = rVar.mo32971a(OAuth2.Data.class, C10530o0.m35747a(), "data");
        C10202j.m34174a((Object) a4, "moshi.adapter(OAuth2.Dat…      emptySet(), \"data\")");
        this.dataAdapter = a4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(28);
        sb.append("GeneratedJsonAdapter(");
        sb.append("OAuth2");
        sb.append(')');
        String sb2 = sb.toString();
        C10202j.m34174a((Object) sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public OAuth2 fromJson(C8930i iVar) {
        C10202j.m34178b(iVar, "reader");
        iVar.mo32868b();
        String str = null;
        Boolean bool = null;
        OAuth2.Data data = null;
        while (iVar.mo32874m()) {
            int a = iVar.mo32861a(this.options);
            if (a == -1) {
                iVar.mo32884y();
                iVar.mo32885z();
            } else if (a == 0) {
                str = this.stringAdapter.fromJson(iVar);
                if (str == null) {
                    JsonDataException b = C8973c.m29543b("type", "type", iVar);
                    C10202j.m34174a((Object) b, "Util.unexpectedNull(\"typ…ype\",\n            reader)");
                    throw b;
                }
            } else if (a == 1) {
                Boolean fromJson = this.booleanAdapter.fromJson(iVar);
                if (fromJson != null) {
                    bool = Boolean.valueOf(fromJson.booleanValue());
                } else {
                    JsonDataException b2 = C8973c.m29543b("signup", "signup", iVar);
                    C10202j.m34174a((Object) b2, "Util.unexpectedNull(\"sig…        \"signup\", reader)");
                    throw b2;
                }
            } else if (a == 2 && (data = this.dataAdapter.fromJson(iVar)) == null) {
                JsonDataException b3 = C8973c.m29543b("data", "data", iVar);
                C10202j.m34174a((Object) b3, "Util.unexpectedNull(\"dat…ata\",\n            reader)");
                throw b3;
            }
        }
        iVar.mo32872i();
        if (str == null) {
            JsonDataException a2 = C8973c.m29530a("type", "type", iVar);
            C10202j.m34174a((Object) a2, "Util.missingProperty(\"type\", \"type\", reader)");
            throw a2;
        } else if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (data != null) {
                return new OAuth2(str, booleanValue, data);
            }
            JsonDataException a3 = C8973c.m29530a("data", "data", iVar);
            C10202j.m34174a((Object) a3, "Util.missingProperty(\"data\", \"data\", reader)");
            throw a3;
        } else {
            JsonDataException a4 = C8973c.m29530a("signup", "signup", iVar);
            C10202j.m34174a((Object) a4, "Util.missingProperty(\"signup\", \"signup\", reader)");
            throw a4;
        }
    }

    public void toJson(C8939o oVar, OAuth2 oAuth2) {
        C10202j.m34178b(oVar, "writer");
        if (oAuth2 != null) {
            oVar.mo32893b();
            oVar.mo32892a("type");
            this.stringAdapter.toJson(oVar, oAuth2.getType());
            oVar.mo32892a("signup");
            this.booleanAdapter.toJson(oVar, Boolean.valueOf(oAuth2.getSignup()));
            oVar.mo32892a("data");
            this.dataAdapter.toJson(oVar, oAuth2.getData());
            oVar.mo32901l();
            return;
        }
        throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
    }
}
