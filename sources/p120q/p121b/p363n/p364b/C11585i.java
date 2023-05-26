package p120q.p121b.p363n.p364b;

import com.fasterxml.jackson.core.JsonGenerator;
import java.io.IOException;
import java.util.Map;
import p015cm.aptoide.p016pt.DeepLinkIntentReceiver;
import p120q.p121b.p359l.p361g.C11568k;

/* renamed from: q.b.n.b.i */
/* compiled from: UserInterfaceBinding */
public class C11585i implements C11578d<C11568k> {
    /* renamed from: a */
    public void mo37812a(JsonGenerator jsonGenerator, C11568k kVar) throws IOException {
        jsonGenerator.writeStartObject();
        jsonGenerator.writeStringField(DeepLinkIntentReceiver.DeepLinksKeys.f3452ID, kVar.mo37792c());
        jsonGenerator.writeStringField("username", kVar.mo37794e());
        jsonGenerator.writeStringField("email", kVar.mo37791b());
        jsonGenerator.writeStringField("ip_address", kVar.mo37793d());
        if (kVar.mo37790a() != null && !kVar.mo37790a().isEmpty()) {
            jsonGenerator.writeObjectFieldStart("data");
            for (Map.Entry next : kVar.mo37790a().entrySet()) {
                String str = (String) next.getKey();
                Object value = next.getValue();
                if (value == null) {
                    jsonGenerator.writeNullField(str);
                } else {
                    jsonGenerator.writeObjectField(str, value);
                }
            }
            jsonGenerator.writeEndObject();
        }
        jsonGenerator.writeEndObject();
    }
}
