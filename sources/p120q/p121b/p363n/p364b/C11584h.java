package p120q.p121b.p363n.p364b;

import com.fasterxml.jackson.core.JsonGenerator;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.regex.Pattern;
import p120q.p121b.p359l.p361g.C11566i;
import p120q.p121b.p359l.p361g.C11567j;

/* renamed from: q.b.n.b.h */
/* compiled from: StackTraceInterfaceBinding */
public class C11584h implements C11578d<C11567j> {

    /* renamed from: c */
    private static final Pattern f30921c = Pattern.compile("\\$+(?:(?:EnhancerBy[a-zA-Z]*)|(?:FastClassBy[a-zA-Z]*)|(?:HibernateProxy))\\$+");

    /* renamed from: a */
    private Collection<String> f30922a = Collections.emptyList();

    /* renamed from: b */
    private boolean f30923b = true;

    /* renamed from: a */
    private void m37885a(JsonGenerator jsonGenerator, C11566i iVar, boolean z) throws IOException {
        jsonGenerator.writeStartObject();
        jsonGenerator.writeStringField("filename", iVar.mo37776c());
        jsonGenerator.writeStringField("module", iVar.mo37781g());
        jsonGenerator.writeBooleanField("in_app", (!this.f30923b || !z) && m37887a(iVar));
        jsonGenerator.writeStringField("function", iVar.mo37777d());
        jsonGenerator.writeNumberField("lineno", iVar.mo37778e());
        if (iVar.mo37775b() != null) {
            jsonGenerator.writeNumberField("colno", iVar.mo37775b().intValue());
        }
        if (iVar.mo37782h() != null) {
            jsonGenerator.writeStringField("platform", iVar.mo37782h());
        }
        if (iVar.mo37774a() != null) {
            jsonGenerator.writeStringField("abs_path", iVar.mo37774a());
        }
        if (iVar.mo37780f() != null && !iVar.mo37780f().isEmpty()) {
            jsonGenerator.writeObjectFieldStart("vars");
            for (Map.Entry next : iVar.mo37780f().entrySet()) {
                jsonGenerator.writeFieldName((String) next.getKey());
                jsonGenerator.writeObject(next.getValue());
            }
            jsonGenerator.writeEndObject();
        }
        jsonGenerator.writeEndObject();
    }

    /* renamed from: a */
    private boolean m37887a(C11566i iVar) {
        String g = iVar.mo37781g();
        if (m37886a(g)) {
            return false;
        }
        for (String startsWith : this.f30922a) {
            if (g.startsWith(startsWith)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m37886a(String str) {
        return (str.contains("$$EnhancerBy") || str.contains("$$FastClassBy") || str.contains("$Hibernate")) && f30921c.matcher(str).find();
    }

    /* renamed from: a */
    public void mo37812a(JsonGenerator jsonGenerator, C11567j jVar) throws IOException {
        jsonGenerator.writeStartObject();
        jsonGenerator.writeArrayFieldStart("frames");
        C11566i[] b = jVar.mo37786b();
        int a = jVar.mo37785a();
        int length = b.length - 1;
        while (length >= 0) {
            int i = a - 1;
            m37885a(jsonGenerator, b[length], a > 0);
            length--;
            a = i;
        }
        jsonGenerator.writeEndArray();
        jsonGenerator.writeEndObject();
    }

    /* renamed from: a */
    public void mo37823a(boolean z) {
        this.f30923b = z;
    }

    /* renamed from: a */
    public void mo37822a(Collection<String> collection) {
        this.f30922a = collection;
    }
}
