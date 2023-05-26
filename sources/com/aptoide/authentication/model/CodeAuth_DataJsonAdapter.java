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

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001a\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0012\u001a\u00020\tH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, mo16641d2 = {"Lcom/aptoide/authentication/model/CodeAuth_DataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/aptoide/authentication/model/CodeAuth$Data;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "options", "Lcom/squareup/moshi/JsonReader$Options;", "stringAdapter", "", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value", "toString", "aptoide-authentication-core"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* compiled from: CodeAuth_DataJsonAdapter.kt */
public final class CodeAuth_DataJsonAdapter extends C8924f<CodeAuth.Data> {
    private final C8930i.C8931a options;
    private final C8924f<String> stringAdapter;

    public CodeAuth_DataJsonAdapter(C8952r rVar) {
        C10202j.m34178b(rVar, "moshi");
        C8930i.C8931a a = C8930i.C8931a.m29357a("type", "method");
        C10202j.m34174a((Object) a, "JsonReader.Options.of(\"type\", \"method\")");
        this.options = a;
        C8924f<String> a2 = rVar.mo32971a(String.class, C10530o0.m35747a(), "type");
        C10202j.m34174a((Object) a2, "moshi.adapter(String::cl…emptySet(),\n      \"type\")");
        this.stringAdapter = a2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(35);
        sb.append("GeneratedJsonAdapter(");
        sb.append("CodeAuth.Data");
        sb.append(')');
        String sb2 = sb.toString();
        C10202j.m34174a((Object) sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public CodeAuth.Data fromJson(C8930i iVar) {
        C10202j.m34178b(iVar, "reader");
        iVar.mo32868b();
        String str = null;
        String str2 = null;
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
            } else if (a == 1 && (str2 = this.stringAdapter.fromJson(iVar)) == null) {
                JsonDataException b2 = C8973c.m29543b("method", "method", iVar);
                C10202j.m34174a((Object) b2, "Util.unexpectedNull(\"met…        \"method\", reader)");
                throw b2;
            }
        }
        iVar.mo32872i();
        if (str == null) {
            JsonDataException a2 = C8973c.m29530a("type", "type", iVar);
            C10202j.m34174a((Object) a2, "Util.missingProperty(\"type\", \"type\", reader)");
            throw a2;
        } else if (str2 != null) {
            return new CodeAuth.Data(str, str2);
        } else {
            JsonDataException a3 = C8973c.m29530a("method", "method", iVar);
            C10202j.m34174a((Object) a3, "Util.missingProperty(\"method\", \"method\", reader)");
            throw a3;
        }
    }

    public void toJson(C8939o oVar, CodeAuth.Data data) {
        C10202j.m34178b(oVar, "writer");
        if (data != null) {
            oVar.mo32893b();
            oVar.mo32892a("type");
            this.stringAdapter.toJson(oVar, data.getType());
            oVar.mo32892a("method");
            this.stringAdapter.toJson(oVar, data.getMethod());
            oVar.mo32901l();
            return;
        }
        throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
    }
}
