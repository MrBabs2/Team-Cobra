package p120q.p121b.p363n.p364b;

import com.fasterxml.jackson.core.JsonGenerator;
import java.io.IOException;
import java.util.Iterator;
import p120q.p121b.p359l.p361g.C11557a;

/* renamed from: q.b.n.b.a */
/* compiled from: DebugMetaInterfaceBinding */
public class C11575a implements C11578d<C11557a> {
    /* renamed from: b */
    private void m37849b(JsonGenerator jsonGenerator, C11557a aVar) throws IOException {
        jsonGenerator.writeArrayFieldStart("images");
        Iterator<C11557a.C11558a> it = aVar.mo37720a().iterator();
        while (it.hasNext()) {
            C11557a.C11558a next = it.next();
            jsonGenerator.writeStartObject();
            jsonGenerator.writeStringField("uuid", next.mo37726b());
            jsonGenerator.writeStringField("type", next.mo37725a());
            jsonGenerator.writeEndObject();
        }
        jsonGenerator.writeEndArray();
    }

    /* renamed from: a */
    public void mo37812a(JsonGenerator jsonGenerator, C11557a aVar) throws IOException {
        jsonGenerator.writeStartObject();
        m37849b(jsonGenerator, aVar);
        jsonGenerator.writeEndObject();
    }
}
