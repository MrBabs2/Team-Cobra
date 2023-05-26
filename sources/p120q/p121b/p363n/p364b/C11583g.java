package p120q.p121b.p363n.p364b;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.SerializableString;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import p120q.p121b.p367q.C11591b;
import p415t.p417b.C12938b;
import p415t.p417b.C12939c;

/* renamed from: q.b.n.b.g */
/* compiled from: SentryJsonGenerator */
public class C11583g extends JsonGenerator {

    /* renamed from: k */
    private static final C12938b f30915k = C12939c.m41777a((Class<?>) C11591b.class);

    /* renamed from: f */
    private int f30916f = 10;

    /* renamed from: g */
    private int f30917g = 400;

    /* renamed from: h */
    private int f30918h = 50;

    /* renamed from: i */
    private int f30919i = 3;

    /* renamed from: j */
    private JsonGenerator f30920j;

    public C11583g(JsonGenerator jsonGenerator) {
        this.f30920j = jsonGenerator;
    }

    /* renamed from: a */
    private void m37883a(Object obj, int i) throws IOException {
        int i2 = 0;
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            while (i2 < bArr.length && i2 < this.f30916f) {
                this.f30920j.writeNumber((int) bArr[i2]);
                i2++;
            }
            if (bArr.length > this.f30916f) {
                m37882a();
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            while (i2 < sArr.length && i2 < this.f30916f) {
                this.f30920j.writeNumber((int) sArr[i2]);
                i2++;
            }
            if (sArr.length > this.f30916f) {
                m37882a();
            }
        } else if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            while (i2 < iArr.length && i2 < this.f30916f) {
                this.f30920j.writeNumber(iArr[i2]);
                i2++;
            }
            if (iArr.length > this.f30916f) {
                m37882a();
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            while (i2 < jArr.length && i2 < this.f30916f) {
                this.f30920j.writeNumber(jArr[i2]);
                i2++;
            }
            if (jArr.length > this.f30916f) {
                m37882a();
            }
        } else if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            while (i2 < fArr.length && i2 < this.f30916f) {
                this.f30920j.writeNumber(fArr[i2]);
                i2++;
            }
            if (fArr.length > this.f30916f) {
                m37882a();
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            while (i2 < dArr.length && i2 < this.f30916f) {
                this.f30920j.writeNumber(dArr[i2]);
                i2++;
            }
            if (dArr.length > this.f30916f) {
                m37882a();
            }
        } else if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            while (i2 < cArr.length && i2 < this.f30916f) {
                this.f30920j.writeString(String.valueOf(cArr[i2]));
                i2++;
            }
            if (cArr.length > this.f30916f) {
                m37882a();
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            while (i2 < zArr.length && i2 < this.f30916f) {
                this.f30920j.writeBoolean(zArr[i2]);
                i2++;
            }
            if (zArr.length > this.f30916f) {
                m37882a();
            }
        } else {
            Object[] objArr = (Object[]) obj;
            while (i2 < objArr.length && i2 < this.f30916f) {
                m37884b(objArr[i2], i + 1);
                i2++;
            }
            if (objArr.length > this.f30916f) {
                m37882a();
            }
        }
    }

    /* renamed from: b */
    private void m37884b(Object obj, int i) throws IOException {
        if (i >= this.f30919i) {
            this.f30920j.writeString("<recursion limit hit>");
        } else if (obj == null) {
            this.f30920j.writeNull();
        } else if (obj.getClass().isArray()) {
            this.f30920j.writeStartArray();
            m37883a(obj, i);
            this.f30920j.writeEndArray();
        } else {
            int i2 = 0;
            if (obj instanceof Map) {
                this.f30920j.writeStartObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    if (i2 >= this.f30918h) {
                        break;
                    }
                    if (entry.getKey() == null) {
                        this.f30920j.writeFieldName("null");
                    } else {
                        this.f30920j.writeFieldName(C11591b.m37914a(entry.getKey().toString(), this.f30917g));
                    }
                    m37884b(entry.getValue(), i + 1);
                    i2++;
                }
                this.f30920j.writeEndObject();
            } else if (obj instanceof Collection) {
                this.f30920j.writeStartArray();
                Iterator it = ((Collection) obj).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (i2 >= this.f30916f) {
                        m37882a();
                        break;
                    } else {
                        m37884b(next, i + 1);
                        i2++;
                    }
                }
                this.f30920j.writeEndArray();
            } else if (obj instanceof String) {
                this.f30920j.writeString(C11591b.m37914a((String) obj, this.f30917g));
            } else {
                try {
                    this.f30920j.writeObject(obj);
                } catch (IllegalStateException unused) {
                    f30915k.mo41307a("Couldn't marshal '{}' of type '{}', had to be converted into a String", obj, obj.getClass());
                    try {
                        this.f30920j.writeString(C11591b.m37914a(obj.toString(), this.f30917g));
                    } catch (IOException | RuntimeException unused2) {
                        this.f30920j.writeString("<exception calling toString on object>");
                    }
                }
            }
        }
    }

    public void close() throws IOException {
        this.f30920j.close();
    }

    public JsonGenerator disable(JsonGenerator.Feature feature) {
        return this.f30920j.disable(feature);
    }

    public void flush() throws IOException {
        this.f30920j.flush();
    }

    public int getFeatureMask() {
        return this.f30920j.getFeatureMask();
    }

    public JsonStreamContext getOutputContext() {
        return this.f30920j.getOutputContext();
    }

    public JsonGenerator setFeatureMask(int i) {
        return this.f30920j.setFeatureMask(i);
    }

    public void writeBinary(Base64Variant base64Variant, byte[] bArr, int i, int i2) throws IOException {
        this.f30920j.writeBinary(base64Variant, bArr, i, i2);
    }

    public void writeBoolean(boolean z) throws IOException {
        this.f30920j.writeBoolean(z);
    }

    public void writeEndArray() throws IOException {
        this.f30920j.writeEndArray();
    }

    public void writeEndObject() throws IOException {
        this.f30920j.writeEndObject();
    }

    public void writeFieldName(String str) throws IOException {
        this.f30920j.writeFieldName(str);
    }

    public void writeNull() throws IOException {
        this.f30920j.writeNull();
    }

    public void writeNumber(int i) throws IOException {
        this.f30920j.writeNumber(i);
    }

    public void writeObject(Object obj) throws IOException {
        m37884b(obj, 0);
    }

    public void writeRaw(String str) throws IOException {
        this.f30920j.writeRaw(str);
    }

    public void writeRawValue(String str) throws IOException {
        this.f30920j.writeRawValue(str);
    }

    public void writeStartArray() throws IOException {
        this.f30920j.writeStartArray();
    }

    public void writeStartObject() throws IOException {
        this.f30920j.writeStartObject();
    }

    public void writeString(String str) throws IOException {
        this.f30920j.writeString(str);
    }

    public int writeBinary(Base64Variant base64Variant, InputStream inputStream, int i) throws IOException {
        return this.f30920j.writeBinary(base64Variant, inputStream, i);
    }

    public void writeFieldName(SerializableString serializableString) throws IOException {
        this.f30920j.writeFieldName(serializableString);
    }

    public void writeNumber(long j) throws IOException {
        this.f30920j.writeNumber(j);
    }

    public void writeRaw(char[] cArr, int i, int i2) throws IOException {
        this.f30920j.writeRaw(cArr, i, i2);
    }

    public void writeString(char[] cArr, int i, int i2) throws IOException {
        this.f30920j.writeString(cArr, i, i2);
    }

    public void writeNumber(BigInteger bigInteger) throws IOException {
        this.f30920j.writeNumber(bigInteger);
    }

    public void writeRaw(char c) throws IOException {
        this.f30920j.writeRaw(c);
    }

    public void writeString(SerializableString serializableString) throws IOException {
        this.f30920j.writeString(serializableString);
    }

    public void writeNumber(double d) throws IOException {
        this.f30920j.writeNumber(d);
    }

    public void writeNumber(float f) throws IOException {
        this.f30920j.writeNumber(f);
    }

    public void writeNumber(BigDecimal bigDecimal) throws IOException {
        this.f30920j.writeNumber(bigDecimal);
    }

    public void writeNumber(String str) throws IOException {
        this.f30920j.writeNumber(str);
    }

    /* renamed from: a */
    private void m37882a() throws IOException {
        this.f30920j.writeString("...");
    }
}
