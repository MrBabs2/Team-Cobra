package p120q.p121b.p363n.p364b;

import androidx.recyclerview.widget.RecyclerView;
import com.fasterxml.jackson.core.JsonGenerator;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import p120q.p121b.p359l.p361g.C11562e;
import p120q.p121b.p367q.C11591b;

/* renamed from: q.b.n.b.c */
/* compiled from: HttpInterfaceBinding */
public class C11577c implements C11578d<C11562e> {
    /* renamed from: b */
    private void m37858b(JsonGenerator jsonGenerator, C11562e eVar) throws IOException {
        jsonGenerator.writeStartObject();
        jsonGenerator.writeStringField("REMOTE_ADDR", eVar.mo37752l());
        jsonGenerator.writeStringField("SERVER_NAME", eVar.mo37755o());
        jsonGenerator.writeNumberField("SERVER_PORT", eVar.mo37756p());
        jsonGenerator.writeStringField("LOCAL_ADDR", eVar.mo37743e());
        jsonGenerator.writeStringField("LOCAL_NAME", eVar.mo37745f());
        jsonGenerator.writeNumberField("LOCAL_PORT", eVar.mo37746g());
        jsonGenerator.writeStringField("SERVER_PROTOCOL", eVar.mo37750j());
        jsonGenerator.writeBooleanField("REQUEST_SECURE", eVar.mo37758r());
        jsonGenerator.writeBooleanField("REQUEST_ASYNC", eVar.mo37757q());
        jsonGenerator.writeStringField("AUTH_TYPE", eVar.mo37739a());
        jsonGenerator.writeStringField("REMOTE_USER", eVar.mo37753m());
        jsonGenerator.writeEndObject();
    }

    /* renamed from: a */
    public void mo37812a(JsonGenerator jsonGenerator, C11562e eVar) throws IOException {
        jsonGenerator.writeStartObject();
        jsonGenerator.writeStringField("url", eVar.mo37754n());
        jsonGenerator.writeStringField("method", eVar.mo37747h());
        jsonGenerator.writeFieldName("data");
        m37856a(jsonGenerator, eVar.mo37749i(), eVar.mo37740b());
        jsonGenerator.writeStringField("query_string", eVar.mo37751k());
        jsonGenerator.writeFieldName("cookies");
        m37855a(jsonGenerator, eVar.mo37741c());
        jsonGenerator.writeFieldName("headers");
        m37857b(jsonGenerator, eVar.mo37742d());
        jsonGenerator.writeFieldName("env");
        m37858b(jsonGenerator, eVar);
        jsonGenerator.writeEndObject();
    }

    /* renamed from: b */
    private void m37857b(JsonGenerator jsonGenerator, Map<String, Collection<String>> map) throws IOException {
        jsonGenerator.writeStartArray();
        for (Map.Entry next : map.entrySet()) {
            for (String writeString : (Collection) next.getValue()) {
                jsonGenerator.writeStartArray();
                jsonGenerator.writeString((String) next.getKey());
                jsonGenerator.writeString(writeString);
                jsonGenerator.writeEndArray();
            }
        }
        jsonGenerator.writeEndArray();
    }

    /* renamed from: a */
    private void m37855a(JsonGenerator jsonGenerator, Map<String, String> map) throws IOException {
        if (map.isEmpty()) {
            jsonGenerator.writeNull();
            return;
        }
        jsonGenerator.writeStartObject();
        for (Map.Entry next : map.entrySet()) {
            jsonGenerator.writeStringField((String) next.getKey(), (String) next.getValue());
        }
        jsonGenerator.writeEndObject();
    }

    /* renamed from: a */
    private void m37856a(JsonGenerator jsonGenerator, Map<String, Collection<String>> map, String str) throws IOException {
        if (map == null && str == null) {
            jsonGenerator.writeNull();
        } else if ((map == null || map.isEmpty()) && str != null) {
            jsonGenerator.writeString(C11591b.m37914a(str, (int) RecyclerView.C0638l.FLAG_MOVED));
        } else {
            jsonGenerator.writeStartObject();
            if (str != null) {
                jsonGenerator.writeStringField("body", C11591b.m37914a(str, (int) RecyclerView.C0638l.FLAG_MOVED));
            }
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    jsonGenerator.writeArrayFieldStart((String) next.getKey());
                    for (String writeString : (Collection) next.getValue()) {
                        jsonGenerator.writeString(writeString);
                    }
                    jsonGenerator.writeEndArray();
                }
            }
            jsonGenerator.writeEndObject();
        }
    }
}
