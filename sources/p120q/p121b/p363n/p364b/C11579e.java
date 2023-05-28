package p120q.p121b.p363n.p364b;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import java.io.IOException;
import java.io.OutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import p120q.p121b.p359l.C11539a;
import p120q.p121b.p359l.C11542b;
import p120q.p121b.p359l.C11549d;
import p120q.p121b.p359l.p361g.C11565h;
import p120q.p121b.p363n.C11573a;
import p120q.p121b.p367q.C11591b;
import p415t.p417b.C12938b;
import p415t.p417b.C12939c;

/* renamed from: q.b.n.b.e */
/* compiled from: JsonMarshaller */
public class C11579e implements C11573a {

    /* renamed from: e */
    private static final ThreadLocal<DateFormat> f30907e = new C11580a();

    /* renamed from: f */
    private static final C12938b f30908f = C12939c.m41777a((Class<?>) C11579e.class);

    /* renamed from: a */
    private final JsonFactory f30909a;

    /* renamed from: b */
    private final Map<Class<? extends C11565h>, C11578d<?>> f30910b;

    /* renamed from: c */
    private boolean f30911c;

    /* renamed from: d */
    private final int f30912d;

    /* renamed from: q.b.n.b.e$a */
    /* compiled from: JsonMarshaller */
    static class C11580a extends ThreadLocal<DateFormat> {
        C11580a() {
        }

        /* access modifiers changed from: protected */
        public DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            return simpleDateFormat;
        }
    }

    /* renamed from: q.b.n.b.e$b */
    /* compiled from: JsonMarshaller */
    static /* synthetic */ class C11581b {

        /* renamed from: a */
        static final /* synthetic */ int[] f30913a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                q.b.l.b$a[] r0 = p120q.p121b.p359l.C11542b.C11543a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f30913a = r0
                q.b.l.b$a r1 = p120q.p121b.p359l.C11542b.C11543a.DEBUG     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f30913a     // Catch:{ NoSuchFieldError -> 0x001d }
                q.b.l.b$a r1 = p120q.p121b.p359l.C11542b.C11543a.FATAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f30913a     // Catch:{ NoSuchFieldError -> 0x0028 }
                q.b.l.b$a r1 = p120q.p121b.p359l.C11542b.C11543a.WARNING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f30913a     // Catch:{ NoSuchFieldError -> 0x0033 }
                q.b.l.b$a r1 = p120q.p121b.p359l.C11542b.C11543a.INFO     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f30913a     // Catch:{ NoSuchFieldError -> 0x003e }
                q.b.l.b$a r1 = p120q.p121b.p359l.C11542b.C11543a.ERROR     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p120q.p121b.p363n.p364b.C11579e.C11581b.<clinit>():void");
        }
    }

    public C11579e() {
        this(1000);
    }

    /* renamed from: c */
    private void m37871c(JsonGenerator jsonGenerator, Map<String, C11565h> map) throws IOException {
        for (Map.Entry next : map.entrySet()) {
            C11565h hVar = (C11565h) next.getValue();
            if (this.f30910b.containsKey(hVar.getClass())) {
                jsonGenerator.writeFieldName((String) next.getKey());
                m37864a(hVar).mo37812a(jsonGenerator, (C11565h) next.getValue());
            } else {
                f30908f.mo41317c("Couldn't parse the content of '{}' provided in {}.", next.getKey(), hVar);
            }
        }
    }

    /* renamed from: d */
    private void m37872d(JsonGenerator jsonGenerator, Map<String, String> map) throws IOException {
        jsonGenerator.writeObjectFieldStart("tags");
        for (Map.Entry next : map.entrySet()) {
            jsonGenerator.writeStringField((String) next.getKey(), (String) next.getValue());
        }
        jsonGenerator.writeEndObject();
    }

    /* renamed from: a */
    public String mo37803a() {
        return "application/json";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002a, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002b, code lost:
        if (r4 != null) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0030 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo37804a(p120q.p121b.p359l.C11542b r3, java.io.OutputStream r4) throws java.io.IOException {
        /*
            r2 = this;
            java.lang.String r0 = "An exception occurred while serialising the event."
            q.b.n.a$a r1 = new q.b.n.a$a
            r1.<init>(r4)
            boolean r4 = r2.f30911c
            if (r4 == 0) goto L_0x0011
            java.util.zip.GZIPOutputStream r4 = new java.util.zip.GZIPOutputStream
            r4.<init>(r1)
            r1 = r4
        L_0x0011:
            com.fasterxml.jackson.core.JsonGenerator r4 = r2.mo37815a((java.io.OutputStream) r1)     // Catch:{ IOException -> 0x0033 }
            r2.m37868a((com.fasterxml.jackson.core.JsonGenerator) r4, (p120q.p121b.p359l.C11542b) r3)     // Catch:{ all -> 0x0028 }
            if (r4 == 0) goto L_0x001d
            r4.close()     // Catch:{ IOException -> 0x0033 }
        L_0x001d:
            r1.close()     // Catch:{ IOException -> 0x0021 }
            goto L_0x003c
        L_0x0021:
            r3 = move-exception
            t.b.b r4 = f30908f
            r4.mo41308a((java.lang.String) r0, (java.lang.Throwable) r3)
            goto L_0x003c
        L_0x0028:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x002a }
        L_0x002a:
            r3 = move-exception
            if (r4 == 0) goto L_0x0030
            r4.close()     // Catch:{ all -> 0x0030 }
        L_0x0030:
            throw r3     // Catch:{ IOException -> 0x0033 }
        L_0x0031:
            r3 = move-exception
            goto L_0x003d
        L_0x0033:
            r3 = move-exception
            t.b.b r4 = f30908f     // Catch:{ all -> 0x0031 }
            r4.mo41308a((java.lang.String) r0, (java.lang.Throwable) r3)     // Catch:{ all -> 0x0031 }
            r1.close()     // Catch:{ IOException -> 0x0021 }
        L_0x003c:
            return
        L_0x003d:
            r1.close()     // Catch:{ IOException -> 0x0041 }
            goto L_0x0047
        L_0x0041:
            r4 = move-exception
            t.b.b r1 = f30908f
            r1.mo41308a((java.lang.String) r0, (java.lang.Throwable) r4)
        L_0x0047:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p120q.p121b.p363n.p364b.C11579e.mo37804a(q.b.l.b, java.io.OutputStream):void");
    }

    /* renamed from: b */
    public String mo37805b() {
        if (mo37818c()) {
            return "gzip";
        }
        return null;
    }

    public C11579e(int i) {
        this.f30909a = new JsonFactory();
        this.f30910b = new HashMap();
        this.f30911c = true;
        this.f30912d = i;
    }

    /* renamed from: b */
    private void m37870b(JsonGenerator jsonGenerator, Map<String, Object> map) throws IOException {
        jsonGenerator.writeObjectFieldStart("extra");
        for (Map.Entry next : map.entrySet()) {
            jsonGenerator.writeFieldName((String) next.getKey());
            jsonGenerator.writeObject(next.getValue());
        }
        jsonGenerator.writeEndObject();
    }

    /* renamed from: c */
    public boolean mo37818c() {
        return this.f30911c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public JsonGenerator mo37815a(OutputStream outputStream) throws IOException {
        return new C11583g(this.f30909a.createGenerator(outputStream));
    }

    /* renamed from: a */
    private void m37868a(JsonGenerator jsonGenerator, C11542b bVar) throws IOException {
        jsonGenerator.writeStartObject();
        jsonGenerator.writeStringField("event_id", m37862a(bVar.mo37681i()));
        jsonGenerator.writeStringField("message", C11591b.m37914a(bVar.mo37684l(), this.f30912d));
        jsonGenerator.writeStringField("timestamp", f30907e.get().format(bVar.mo37691s()));
        jsonGenerator.writeStringField("level", m37863a(bVar.mo37682j()));
        jsonGenerator.writeStringField("logger", bVar.mo37683k());
        jsonGenerator.writeStringField("platform", bVar.mo37685m());
        jsonGenerator.writeStringField("culprit", bVar.mo37670d());
        jsonGenerator.writeStringField("transaction", bVar.mo37692t());
        m37869a(jsonGenerator, bVar.mo37687o());
        m37872d(jsonGenerator, bVar.mo37690r());
        m37866a(jsonGenerator, bVar.mo37657a());
        m37867a(jsonGenerator, bVar.mo37667c());
        jsonGenerator.writeStringField("server_name", bVar.mo37689q());
        jsonGenerator.writeStringField("release", bVar.mo37686n());
        jsonGenerator.writeStringField("dist", bVar.mo37673e());
        jsonGenerator.writeStringField("environment", bVar.mo37676f());
        m37870b(jsonGenerator, bVar.mo37678g());
        m37865a(jsonGenerator, "fingerprint", bVar.mo37679h());
        jsonGenerator.writeStringField("checksum", bVar.mo37664b());
        m37871c(jsonGenerator, bVar.mo37688p());
        jsonGenerator.writeEndObject();
    }

    /* renamed from: a */
    private <T extends C11565h> C11578d<? super T> m37864a(T t) {
        return this.f30910b.get(t.getClass());
    }

    /* renamed from: a */
    private void m37865a(JsonGenerator jsonGenerator, String str, Collection<String> collection) throws IOException {
        if (collection != null && !collection.isEmpty()) {
            jsonGenerator.writeArrayFieldStart(str);
            for (String writeString : collection) {
                jsonGenerator.writeString(writeString);
            }
            jsonGenerator.writeEndArray();
        }
    }

    /* renamed from: a */
    private void m37869a(JsonGenerator jsonGenerator, C11549d dVar) throws IOException {
        jsonGenerator.writeObjectFieldStart("sdk");
        jsonGenerator.writeStringField("name", dVar.mo37715b());
        jsonGenerator.writeStringField("version", dVar.mo37716c());
        if (dVar.mo37714a() != null && !dVar.mo37714a().isEmpty()) {
            jsonGenerator.writeArrayFieldStart("integrations");
            for (String writeString : dVar.mo37714a()) {
                jsonGenerator.writeString(writeString);
            }
            jsonGenerator.writeEndArray();
        }
        jsonGenerator.writeEndObject();
    }

    /* renamed from: a */
    private void m37866a(JsonGenerator jsonGenerator, List<C11539a> list) throws IOException {
        if (!list.isEmpty()) {
            jsonGenerator.writeObjectFieldStart("breadcrumbs");
            jsonGenerator.writeArrayFieldStart("values");
            for (C11539a next : list) {
                jsonGenerator.writeStartObject();
                TimeZone timeZone = TimeZone.getTimeZone("UTC");
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
                simpleDateFormat.setTimeZone(timeZone);
                jsonGenerator.writeStringField("timestamp", simpleDateFormat.format(next.mo37651e()));
                if (next.mo37653f() != null) {
                    jsonGenerator.writeStringField("type", next.mo37653f().mo37656a());
                }
                if (next.mo37649c() != null) {
                    jsonGenerator.writeStringField("level", next.mo37649c().mo37655a());
                }
                if (next.mo37650d() != null) {
                    jsonGenerator.writeStringField("message", next.mo37650d());
                }
                if (next.mo37647a() != null) {
                    jsonGenerator.writeStringField("category", next.mo37647a());
                }
                if (next.mo37648b() != null && !next.mo37648b().isEmpty()) {
                    jsonGenerator.writeObjectFieldStart("data");
                    for (Map.Entry next2 : next.mo37648b().entrySet()) {
                        jsonGenerator.writeStringField((String) next2.getKey(), (String) next2.getValue());
                    }
                    jsonGenerator.writeEndObject();
                }
                jsonGenerator.writeEndObject();
            }
            jsonGenerator.writeEndArray();
            jsonGenerator.writeEndObject();
        }
    }

    /* renamed from: a */
    private void m37867a(JsonGenerator jsonGenerator, Map<String, Map<String, Object>> map) throws IOException {
        if (!map.isEmpty()) {
            jsonGenerator.writeObjectFieldStart("contexts");
            for (Map.Entry next : map.entrySet()) {
                jsonGenerator.writeObjectFieldStart((String) next.getKey());
                for (Map.Entry entry : ((Map) next.getValue()).entrySet()) {
                    jsonGenerator.writeObjectField((String) entry.getKey(), entry.getValue());
                }
                jsonGenerator.writeEndObject();
            }
            jsonGenerator.writeEndObject();
        }
    }

    /* renamed from: a */
    private String m37862a(UUID uuid) {
        return uuid.toString().replaceAll("-", "");
    }

    /* renamed from: a */
    private String m37863a(C11542b.C11543a aVar) {
        if (aVar == null) {
            return null;
        }
        int i = C11581b.f30913a[aVar.ordinal()];
        if (i == 1) {
            return "debug";
        }
        if (i == 2) {
            return "fatal";
        }
        if (i == 3) {
            return "warning";
        }
        if (i == 4) {
            return "info";
        }
        if (i == 5) {
            return "error";
        }
        f30908f.mo41320d("The level '{}' isn't supported, this should NEVER happen, contact Sentry developers", (Object) aVar.name());
        return null;
    }

    /* renamed from: a */
    public <T extends C11565h, F extends T> void mo37816a(Class<F> cls, C11578d<T> dVar) {
        this.f30910b.put(cls, dVar);
    }

    /* renamed from: a */
    public void mo37817a(boolean z) {
        this.f30911c = z;
    }
}
