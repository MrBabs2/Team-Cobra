package p120q.p121b.p363n.p364b;

import com.fasterxml.jackson.core.JsonGenerator;
import java.io.IOException;
import p120q.p121b.p359l.p361g.C11563f;
import p120q.p121b.p367q.C11591b;

/* renamed from: q.b.n.b.f */
/* compiled from: MessageInterfaceBinding */
public class C11582f implements C11578d<C11563f> {

    /* renamed from: a */
    private final int f30914a;

    public C11582f(int i) {
        this.f30914a = i;
    }

    /* renamed from: a */
    public void mo37812a(JsonGenerator jsonGenerator, C11563f fVar) throws IOException {
        jsonGenerator.writeStartObject();
        jsonGenerator.writeStringField("message", C11591b.m37914a(fVar.mo37761b(), this.f30914a));
        jsonGenerator.writeArrayFieldStart("params");
        for (String writeString : fVar.mo37762c()) {
            jsonGenerator.writeString(writeString);
        }
        jsonGenerator.writeEndArray();
        if (fVar.mo37760a() != null) {
            jsonGenerator.writeStringField("formatted", C11591b.m37914a(fVar.mo37760a(), this.f30914a));
        }
        jsonGenerator.writeEndObject();
    }
}
