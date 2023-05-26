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
import p015cm.aptoide.p016pt.networking.AuthenticationPersistence;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0015\u001a\u00020\tH\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0001X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, mo16641d2 = {"Lcom/aptoide/authentication/model/OAuth2_DataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/aptoide/authentication/model/OAuth2$Data;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "intAdapter", "", "nullableStringAdapter", "", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "toString", "aptoide-authentication-core"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* compiled from: OAuth2_DataJsonAdapter.kt */
public final class OAuth2_DataJsonAdapter extends C8924f<OAuth2.Data> {
    private final C8924f<Integer> intAdapter;
    private final C8924f<String> nullableStringAdapter;
    private final C8930i.C8931a options;
    private final C8924f<String> stringAdapter;

    public OAuth2_DataJsonAdapter(C8952r rVar) {
        Class<String> cls = String.class;
        C10202j.m34178b(rVar, "moshi");
        C8930i.C8931a a = C8930i.C8931a.m29357a("access_token", "expires_in", AuthenticationPersistence.ACCOUNT_REFRESH_TOKEN, "token_type", "scope");
        C10202j.m34174a((Object) a, "JsonReader.Options.of(\"a…\", \"token_type\", \"scope\")");
        this.options = a;
        C8924f<String> a2 = rVar.mo32971a(cls, C10530o0.m35747a(), "accessToken");
        C10202j.m34174a((Object) a2, "moshi.adapter(String::cl…t(),\n      \"accessToken\")");
        this.stringAdapter = a2;
        C8924f<Integer> a3 = rVar.mo32971a(Integer.TYPE, C10530o0.m35747a(), "expiresIn");
        C10202j.m34174a((Object) a3, "moshi.adapter(Int::class… emptySet(), \"expiresIn\")");
        this.intAdapter = a3;
        C8924f<String> a4 = rVar.mo32971a(cls, C10530o0.m35747a(), "scope");
        C10202j.m34174a((Object) a4, "moshi.adapter(String::cl…     emptySet(), \"scope\")");
        this.nullableStringAdapter = a4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(33);
        sb.append("GeneratedJsonAdapter(");
        sb.append("OAuth2.Data");
        sb.append(')');
        String sb2 = sb.toString();
        C10202j.m34174a((Object) sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public OAuth2.Data fromJson(C8930i iVar) {
        C8930i iVar2 = iVar;
        C10202j.m34178b(iVar2, "reader");
        iVar.mo32868b();
        Integer num = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (iVar.mo32874m()) {
            int a = iVar2.mo32861a(this.options);
            String str5 = str4;
            if (a == -1) {
                iVar.mo32884y();
                iVar.mo32885z();
            } else if (a == 0) {
                String fromJson = this.stringAdapter.fromJson(iVar2);
                if (fromJson != null) {
                    str = fromJson;
                } else {
                    JsonDataException b = C8973c.m29543b("accessToken", "access_token", iVar2);
                    C10202j.m34174a((Object) b, "Util.unexpectedNull(\"acc…, \"access_token\", reader)");
                    throw b;
                }
            } else if (a == 1) {
                Integer fromJson2 = this.intAdapter.fromJson(iVar2);
                if (fromJson2 != null) {
                    num = Integer.valueOf(fromJson2.intValue());
                } else {
                    JsonDataException b2 = C8973c.m29543b("expiresIn", "expires_in", iVar2);
                    C10202j.m34174a((Object) b2, "Util.unexpectedNull(\"exp…    \"expires_in\", reader)");
                    throw b2;
                }
            } else if (a == 2) {
                String fromJson3 = this.stringAdapter.fromJson(iVar2);
                if (fromJson3 != null) {
                    str2 = fromJson3;
                } else {
                    JsonDataException b3 = C8973c.m29543b("refreshToken", AuthenticationPersistence.ACCOUNT_REFRESH_TOKEN, iVar2);
                    C10202j.m34174a((Object) b3, "Util.unexpectedNull(\"ref… \"refresh_token\", reader)");
                    throw b3;
                }
            } else if (a == 3) {
                String fromJson4 = this.stringAdapter.fromJson(iVar2);
                if (fromJson4 != null) {
                    str3 = fromJson4;
                } else {
                    JsonDataException b4 = C8973c.m29543b("tokenType", "token_type", iVar2);
                    C10202j.m34174a((Object) b4, "Util.unexpectedNull(\"tok…    \"token_type\", reader)");
                    throw b4;
                }
            } else if (a == 4) {
                str4 = this.nullableStringAdapter.fromJson(iVar2);
            }
            str4 = str5;
        }
        String str6 = str4;
        iVar.mo32872i();
        if (str == null) {
            JsonDataException a2 = C8973c.m29530a("accessToken", "access_token", iVar2);
            C10202j.m34174a((Object) a2, "Util.missingProperty(\"ac…ken\",\n            reader)");
            throw a2;
        } else if (num != null) {
            int intValue = num.intValue();
            if (str2 == null) {
                JsonDataException a3 = C8973c.m29530a("refreshToken", AuthenticationPersistence.ACCOUNT_REFRESH_TOKEN, iVar2);
                C10202j.m34174a((Object) a3, "Util.missingProperty(\"re…ken\",\n            reader)");
                throw a3;
            } else if (str3 != null) {
                return new OAuth2.Data(str, intValue, str2, str3, str6);
            } else {
                JsonDataException a4 = C8973c.m29530a("tokenType", "token_type", iVar2);
                C10202j.m34174a((Object) a4, "Util.missingProperty(\"to…e\", \"token_type\", reader)");
                throw a4;
            }
        } else {
            JsonDataException a5 = C8973c.m29530a("expiresIn", "expires_in", iVar2);
            C10202j.m34174a((Object) a5, "Util.missingProperty(\"ex…n\", \"expires_in\", reader)");
            throw a5;
        }
    }

    public void toJson(C8939o oVar, OAuth2.Data data) {
        C10202j.m34178b(oVar, "writer");
        if (data != null) {
            oVar.mo32893b();
            oVar.mo32892a("access_token");
            this.stringAdapter.toJson(oVar, data.getAccessToken());
            oVar.mo32892a("expires_in");
            this.intAdapter.toJson(oVar, Integer.valueOf(data.getExpiresIn()));
            oVar.mo32892a(AuthenticationPersistence.ACCOUNT_REFRESH_TOKEN);
            this.stringAdapter.toJson(oVar, data.getRefreshToken());
            oVar.mo32892a("token_type");
            this.stringAdapter.toJson(oVar, data.getTokenType());
            oVar.mo32892a("scope");
            this.nullableStringAdapter.toJson(oVar, data.getScope());
            oVar.mo32901l();
            return;
        }
        throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
    }
}
