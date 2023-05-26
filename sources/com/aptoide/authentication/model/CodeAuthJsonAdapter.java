package com.aptoide.authentication.model;

import com.aptoide.authentication.model.CodeAuth;
import com.squareup.moshi.C8924f;
import com.squareup.moshi.C8930i;
import com.squareup.moshi.C8939o;
import com.squareup.moshi.C8952r;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.p206u.C8973c;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0017\u001a\u00020\u000bH\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0001X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0001X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0001X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, mo16641d2 = {"Lcom/aptoide/authentication/model/CodeAuthJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/aptoide/authentication/model/CodeAuth;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "booleanAdapter", "", "dataAdapter", "Lcom/aptoide/authentication/model/CodeAuth$Data;", "nullableStringAdapter", "", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "toString", "aptoide-authentication-core"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* compiled from: CodeAuthJsonAdapter.kt */
public final class CodeAuthJsonAdapter extends C8924f<CodeAuth> {
    private final C8924f<Boolean> booleanAdapter;
    private final C8924f<CodeAuth.Data> dataAdapter;
    private final C8924f<String> nullableStringAdapter;
    private final C8930i.C8931a options;
    private final C8924f<String> stringAdapter;

    public CodeAuthJsonAdapter(C8952r rVar) {
        Class<String> cls = String.class;
        C10202j.m34178b(rVar, "moshi");
        C8930i.C8931a a = C8930i.C8931a.m29357a("type", "state", "agent", "signup", "data", "email");
        C10202j.m34174a((Object) a, "JsonReader.Options.of(\"t…signup\", \"data\", \"email\")");
        this.options = a;
        C8924f<String> a2 = rVar.mo32971a(cls, C10530o0.m35747a(), "type");
        C10202j.m34174a((Object) a2, "moshi.adapter(String::cl…emptySet(),\n      \"type\")");
        this.stringAdapter = a2;
        C8924f<String> a3 = rVar.mo32971a(cls, C10530o0.m35747a(), "agent");
        C10202j.m34174a((Object) a3, "moshi.adapter(String::cl…     emptySet(), \"agent\")");
        this.nullableStringAdapter = a3;
        C8924f<Boolean> a4 = rVar.mo32971a(Boolean.TYPE, C10530o0.m35747a(), "signup");
        C10202j.m34174a((Object) a4, "moshi.adapter(Boolean::c…ptySet(),\n      \"signup\")");
        this.booleanAdapter = a4;
        C8924f<CodeAuth.Data> a5 = rVar.mo32971a(CodeAuth.Data.class, C10530o0.m35747a(), "data");
        C10202j.m34174a((Object) a5, "moshi.adapter(CodeAuth.D…      emptySet(), \"data\")");
        this.dataAdapter = a5;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(30);
        sb.append("GeneratedJsonAdapter(");
        sb.append("CodeAuth");
        sb.append(')');
        String sb2 = sb.toString();
        C10202j.m34174a((Object) sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public CodeAuth fromJson(C8930i iVar) {
        C10202j.m34178b(iVar, "reader");
        iVar.mo32868b();
        Boolean bool = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        CodeAuth.Data data = null;
        String str4 = null;
        while (iVar.mo32874m()) {
            switch (iVar.mo32861a(this.options)) {
                case -1:
                    iVar.mo32884y();
                    iVar.mo32885z();
                    break;
                case 0:
                    String fromJson = this.stringAdapter.fromJson(iVar);
                    if (fromJson != null) {
                        str = fromJson;
                        break;
                    } else {
                        JsonDataException b = C8973c.m29543b("type", "type", iVar);
                        C10202j.m34174a((Object) b, "Util.unexpectedNull(\"typ…ype\",\n            reader)");
                        throw b;
                    }
                case 1:
                    String fromJson2 = this.stringAdapter.fromJson(iVar);
                    if (fromJson2 != null) {
                        str2 = fromJson2;
                        break;
                    } else {
                        JsonDataException b2 = C8973c.m29543b("state", "state", iVar);
                        C10202j.m34174a((Object) b2, "Util.unexpectedNull(\"sta…ate\",\n            reader)");
                        throw b2;
                    }
                case 2:
                    str3 = this.nullableStringAdapter.fromJson(iVar);
                    break;
                case 3:
                    Boolean fromJson3 = this.booleanAdapter.fromJson(iVar);
                    if (fromJson3 != null) {
                        bool = Boolean.valueOf(fromJson3.booleanValue());
                        break;
                    } else {
                        JsonDataException b3 = C8973c.m29543b("signup", "signup", iVar);
                        C10202j.m34174a((Object) b3, "Util.unexpectedNull(\"sig…        \"signup\", reader)");
                        throw b3;
                    }
                case 4:
                    CodeAuth.Data fromJson4 = this.dataAdapter.fromJson(iVar);
                    if (fromJson4 != null) {
                        data = fromJson4;
                        break;
                    } else {
                        JsonDataException b4 = C8973c.m29543b("data", "data", iVar);
                        C10202j.m34174a((Object) b4, "Util.unexpectedNull(\"dat…ata\",\n            reader)");
                        throw b4;
                    }
                case 5:
                    str4 = this.nullableStringAdapter.fromJson(iVar);
                    break;
            }
        }
        iVar.mo32872i();
        if (str == null) {
            JsonDataException a = C8973c.m29530a("type", "type", iVar);
            C10202j.m34174a((Object) a, "Util.missingProperty(\"type\", \"type\", reader)");
            throw a;
        } else if (str2 == null) {
            JsonDataException a2 = C8973c.m29530a("state", "state", iVar);
            C10202j.m34174a((Object) a2, "Util.missingProperty(\"state\", \"state\", reader)");
            throw a2;
        } else if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (data != null) {
                return new CodeAuth(str, str2, str3, booleanValue, data, str4);
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

    public void toJson(C8939o oVar, CodeAuth codeAuth) {
        C10202j.m34178b(oVar, "writer");
        if (codeAuth != null) {
            oVar.mo32893b();
            oVar.mo32892a("type");
            this.stringAdapter.toJson(oVar, codeAuth.getType());
            oVar.mo32892a("state");
            this.stringAdapter.toJson(oVar, codeAuth.getState());
            oVar.mo32892a("agent");
            this.nullableStringAdapter.toJson(oVar, codeAuth.getAgent());
            oVar.mo32892a("signup");
            this.booleanAdapter.toJson(oVar, Boolean.valueOf(codeAuth.getSignup()));
            oVar.mo32892a("data");
            this.dataAdapter.toJson(oVar, codeAuth.getData());
            oVar.mo32892a("email");
            this.nullableStringAdapter.toJson(oVar, codeAuth.getEmail());
            oVar.mo32901l();
            return;
        }
        throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
    }
}
