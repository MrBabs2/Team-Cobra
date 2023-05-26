package p120q.p121b.p363n.p364b;

import com.fasterxml.jackson.core.JsonGenerator;
import java.io.IOException;
import java.util.Deque;
import java.util.Iterator;
import p015cm.aptoide.p016pt.app.view.donations.DonationsAnalytics;
import p120q.p121b.p359l.p361g.C11559b;
import p120q.p121b.p359l.p361g.C11560c;
import p120q.p121b.p359l.p361g.C11564g;
import p120q.p121b.p359l.p361g.C11567j;

/* renamed from: q.b.n.b.b */
/* compiled from: ExceptionInterfaceBinding */
public class C11576b implements C11578d<C11559b> {

    /* renamed from: a */
    private final C11578d<C11567j> f30906a;

    public C11576b(C11578d<C11567j> dVar) {
        this.f30906a = dVar;
    }

    /* renamed from: a */
    public void mo37812a(JsonGenerator jsonGenerator, C11559b bVar) throws IOException {
        Deque<C11564g> a = bVar.mo37728a();
        jsonGenerator.writeStartArray();
        Iterator<C11564g> descendingIterator = a.descendingIterator();
        while (descendingIterator.hasNext()) {
            m37852a(jsonGenerator, descendingIterator.next());
        }
        jsonGenerator.writeEndArray();
    }

    /* renamed from: a */
    private void m37852a(JsonGenerator jsonGenerator, C11564g gVar) throws IOException {
        jsonGenerator.writeStartObject();
        jsonGenerator.writeStringField("type", gVar.mo37766a());
        jsonGenerator.writeStringField(DonationsAnalytics.VALUE, gVar.mo37768c());
        jsonGenerator.writeStringField("module", gVar.mo37769d());
        C11560c b = gVar.mo37767b();
        if (b != null) {
            jsonGenerator.writeFieldName("mechanism");
            jsonGenerator.writeStartObject();
            jsonGenerator.writeStringField("type", b.mo37732a());
            jsonGenerator.writeBooleanField("handled", b.mo37733b());
            jsonGenerator.writeEndObject();
        }
        jsonGenerator.writeFieldName("stacktrace");
        this.f30906a.mo37812a(jsonGenerator, gVar.mo37770e());
        jsonGenerator.writeEndObject();
    }
}
