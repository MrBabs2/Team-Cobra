package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.C10424g.C10426b;
import kotlin.reflect.jvm.internal.impl.protobuf.C10436i;
import kotlin.reflect.jvm.internal.impl.protobuf.C10439j;
import kotlin.reflect.jvm.internal.impl.protobuf.C10449o;
import kotlin.reflect.jvm.internal.impl.protobuf.C10472w;

/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.g */
/* compiled from: FieldSet */
final class C10424g<FieldDescriptorType extends C10426b<FieldDescriptorType>> {

    /* renamed from: d */
    private static final C10424g f28240d = new C10424g(true);

    /* renamed from: a */
    private final C10460t<FieldDescriptorType, Object> f28241a = C10460t.m35453b(16);

    /* renamed from: b */
    private boolean f28242b;

    /* renamed from: c */
    private boolean f28243c = false;

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.g$a */
    /* compiled from: FieldSet */
    static /* synthetic */ class C10425a {

        /* renamed from: a */
        static final /* synthetic */ int[] f28244a;

        /* renamed from: b */
        static final /* synthetic */ int[] f28245b;

        /* JADX WARNING: Can't wrap try/catch for region: R(55:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|(3:71|72|74)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(56:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|(3:71|72|74)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(58:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(59:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(60:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(62:0|(2:1|2)|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|(2:25|26)|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|(2:51|52)|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Can't wrap try/catch for region: R(65:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|74) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00e9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x00f3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x00fd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0107 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x0111 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x011b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0125 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x012f */
        static {
            /*
                kotlin.reflect.jvm.internal.impl.protobuf.w$b[] r0 = kotlin.reflect.jvm.internal.impl.protobuf.C10472w.C10474b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f28245b = r0
                r1 = 1
                kotlin.reflect.jvm.internal.impl.protobuf.w$b r2 = kotlin.reflect.jvm.internal.impl.protobuf.C10472w.C10474b.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f28245b     // Catch:{ NoSuchFieldError -> 0x001d }
                kotlin.reflect.jvm.internal.impl.protobuf.w$b r3 = kotlin.reflect.jvm.internal.impl.protobuf.C10472w.C10474b.FLOAT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f28245b     // Catch:{ NoSuchFieldError -> 0x0028 }
                kotlin.reflect.jvm.internal.impl.protobuf.w$b r4 = kotlin.reflect.jvm.internal.impl.protobuf.C10472w.C10474b.INT64     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f28245b     // Catch:{ NoSuchFieldError -> 0x0033 }
                kotlin.reflect.jvm.internal.impl.protobuf.w$b r5 = kotlin.reflect.jvm.internal.impl.protobuf.C10472w.C10474b.UINT64     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f28245b     // Catch:{ NoSuchFieldError -> 0x003e }
                kotlin.reflect.jvm.internal.impl.protobuf.w$b r6 = kotlin.reflect.jvm.internal.impl.protobuf.C10472w.C10474b.INT32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                r5 = 6
                int[] r6 = f28245b     // Catch:{ NoSuchFieldError -> 0x0049 }
                kotlin.reflect.jvm.internal.impl.protobuf.w$b r7 = kotlin.reflect.jvm.internal.impl.protobuf.C10472w.C10474b.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                r6 = 7
                int[] r7 = f28245b     // Catch:{ NoSuchFieldError -> 0x0054 }
                kotlin.reflect.jvm.internal.impl.protobuf.w$b r8 = kotlin.reflect.jvm.internal.impl.protobuf.C10472w.C10474b.FIXED32     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r7[r8] = r6     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                r7 = 8
                int[] r8 = f28245b     // Catch:{ NoSuchFieldError -> 0x0060 }
                kotlin.reflect.jvm.internal.impl.protobuf.w$b r9 = kotlin.reflect.jvm.internal.impl.protobuf.C10472w.C10474b.BOOL     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r8[r9] = r7     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                r8 = 9
                int[] r9 = f28245b     // Catch:{ NoSuchFieldError -> 0x006c }
                kotlin.reflect.jvm.internal.impl.protobuf.w$b r10 = kotlin.reflect.jvm.internal.impl.protobuf.C10472w.C10474b.STRING     // Catch:{ NoSuchFieldError -> 0x006c }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r9[r10] = r8     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r9 = f28245b     // Catch:{ NoSuchFieldError -> 0x0078 }
                kotlin.reflect.jvm.internal.impl.protobuf.w$b r10 = kotlin.reflect.jvm.internal.impl.protobuf.C10472w.C10474b.BYTES     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r11 = 10
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r9 = f28245b     // Catch:{ NoSuchFieldError -> 0x0084 }
                kotlin.reflect.jvm.internal.impl.protobuf.w$b r10 = kotlin.reflect.jvm.internal.impl.protobuf.C10472w.C10474b.UINT32     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r11 = 11
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r9 = f28245b     // Catch:{ NoSuchFieldError -> 0x0090 }
                kotlin.reflect.jvm.internal.impl.protobuf.w$b r10 = kotlin.reflect.jvm.internal.impl.protobuf.C10472w.C10474b.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r11 = 12
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r9 = f28245b     // Catch:{ NoSuchFieldError -> 0x009c }
                kotlin.reflect.jvm.internal.impl.protobuf.w$b r10 = kotlin.reflect.jvm.internal.impl.protobuf.C10472w.C10474b.SFIXED64     // Catch:{ NoSuchFieldError -> 0x009c }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r11 = 13
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r9 = f28245b     // Catch:{ NoSuchFieldError -> 0x00a8 }
                kotlin.reflect.jvm.internal.impl.protobuf.w$b r10 = kotlin.reflect.jvm.internal.impl.protobuf.C10472w.C10474b.SINT32     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r11 = 14
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r9 = f28245b     // Catch:{ NoSuchFieldError -> 0x00b4 }
                kotlin.reflect.jvm.internal.impl.protobuf.w$b r10 = kotlin.reflect.jvm.internal.impl.protobuf.C10472w.C10474b.SINT64     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r11 = 15
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r9 = f28245b     // Catch:{ NoSuchFieldError -> 0x00c0 }
                kotlin.reflect.jvm.internal.impl.protobuf.w$b r10 = kotlin.reflect.jvm.internal.impl.protobuf.C10472w.C10474b.GROUP     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r11 = 16
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r9 = f28245b     // Catch:{ NoSuchFieldError -> 0x00cc }
                kotlin.reflect.jvm.internal.impl.protobuf.w$b r10 = kotlin.reflect.jvm.internal.impl.protobuf.C10472w.C10474b.MESSAGE     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r11 = 17
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r9 = f28245b     // Catch:{ NoSuchFieldError -> 0x00d8 }
                kotlin.reflect.jvm.internal.impl.protobuf.w$b r10 = kotlin.reflect.jvm.internal.impl.protobuf.C10472w.C10474b.ENUM     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r11 = 18
                r9[r10] = r11     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                kotlin.reflect.jvm.internal.impl.protobuf.w$c[] r9 = kotlin.reflect.jvm.internal.impl.protobuf.C10472w.C10479c.values()
                int r9 = r9.length
                int[] r9 = new int[r9]
                f28244a = r9
                kotlin.reflect.jvm.internal.impl.protobuf.w$c r10 = kotlin.reflect.jvm.internal.impl.protobuf.C10472w.C10479c.INT     // Catch:{ NoSuchFieldError -> 0x00e9 }
                int r10 = r10.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e9 }
                r9[r10] = r1     // Catch:{ NoSuchFieldError -> 0x00e9 }
            L_0x00e9:
                int[] r1 = f28244a     // Catch:{ NoSuchFieldError -> 0x00f3 }
                kotlin.reflect.jvm.internal.impl.protobuf.w$c r9 = kotlin.reflect.jvm.internal.impl.protobuf.C10472w.C10479c.LONG     // Catch:{ NoSuchFieldError -> 0x00f3 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f3 }
                r1[r9] = r0     // Catch:{ NoSuchFieldError -> 0x00f3 }
            L_0x00f3:
                int[] r0 = f28244a     // Catch:{ NoSuchFieldError -> 0x00fd }
                kotlin.reflect.jvm.internal.impl.protobuf.w$c r1 = kotlin.reflect.jvm.internal.impl.protobuf.C10472w.C10479c.FLOAT     // Catch:{ NoSuchFieldError -> 0x00fd }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00fd }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00fd }
            L_0x00fd:
                int[] r0 = f28244a     // Catch:{ NoSuchFieldError -> 0x0107 }
                kotlin.reflect.jvm.internal.impl.protobuf.w$c r1 = kotlin.reflect.jvm.internal.impl.protobuf.C10472w.C10479c.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0107 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0107 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0107 }
            L_0x0107:
                int[] r0 = f28244a     // Catch:{ NoSuchFieldError -> 0x0111 }
                kotlin.reflect.jvm.internal.impl.protobuf.w$c r1 = kotlin.reflect.jvm.internal.impl.protobuf.C10472w.C10479c.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0111 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0111 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0111 }
            L_0x0111:
                int[] r0 = f28244a     // Catch:{ NoSuchFieldError -> 0x011b }
                kotlin.reflect.jvm.internal.impl.protobuf.w$c r1 = kotlin.reflect.jvm.internal.impl.protobuf.C10472w.C10479c.STRING     // Catch:{ NoSuchFieldError -> 0x011b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x011b }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x011b }
            L_0x011b:
                int[] r0 = f28244a     // Catch:{ NoSuchFieldError -> 0x0125 }
                kotlin.reflect.jvm.internal.impl.protobuf.w$c r1 = kotlin.reflect.jvm.internal.impl.protobuf.C10472w.C10479c.BYTE_STRING     // Catch:{ NoSuchFieldError -> 0x0125 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0125 }
                r0[r1] = r6     // Catch:{ NoSuchFieldError -> 0x0125 }
            L_0x0125:
                int[] r0 = f28244a     // Catch:{ NoSuchFieldError -> 0x012f }
                kotlin.reflect.jvm.internal.impl.protobuf.w$c r1 = kotlin.reflect.jvm.internal.impl.protobuf.C10472w.C10479c.ENUM     // Catch:{ NoSuchFieldError -> 0x012f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x012f }
                r0[r1] = r7     // Catch:{ NoSuchFieldError -> 0x012f }
            L_0x012f:
                int[] r0 = f28244a     // Catch:{ NoSuchFieldError -> 0x0139 }
                kotlin.reflect.jvm.internal.impl.protobuf.w$c r1 = kotlin.reflect.jvm.internal.impl.protobuf.C10472w.C10479c.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0139 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0139 }
                r0[r1] = r8     // Catch:{ NoSuchFieldError -> 0x0139 }
            L_0x0139:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.C10424g.C10425a.<clinit>():void");
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.g$b */
    /* compiled from: FieldSet */
    public interface C10426b<T extends C10426b<T>> extends Comparable<T> {
        /* renamed from: E */
        C10472w.C10479c mo35753E();

        /* renamed from: F */
        boolean mo35754F();

        /* renamed from: a */
        C10449o.C10450a mo35755a(C10449o.C10450a aVar, C10449o oVar);

        /* renamed from: b */
        int mo35756b();

        /* renamed from: h */
        boolean mo35757h();

        /* renamed from: j */
        C10472w.C10474b mo35758j();
    }

    private C10424g() {
    }

    /* renamed from: e */
    public static <T extends C10426b<T>> C10424g<T> m35312e() {
        return f28240d;
    }

    /* renamed from: f */
    public static <T extends C10426b<T>> C10424g<T> m35313f() {
        return new C10424g<>();
    }

    /* renamed from: a */
    public Object mo35742a(FieldDescriptorType fielddescriptortype) {
        Object obj = this.f28241a.get(fielddescriptortype);
        return obj instanceof C10439j ? ((C10439j) obj).mo35782b() : obj;
    }

    /* renamed from: b */
    public void mo35747b(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.mo35757h()) {
            m35310b(fielddescriptortype.mo35758j(), obj);
        } else if (obj instanceof List) {
            ArrayList<Object> arrayList = new ArrayList<>();
            arrayList.addAll((List) obj);
            for (Object b : arrayList) {
                m35310b(fielddescriptortype.mo35758j(), b);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof C10439j) {
            this.f28243c = true;
        }
        this.f28241a.mo35832a(fielddescriptortype, obj);
    }

    /* renamed from: c */
    public Iterator<Map.Entry<FieldDescriptorType, Object>> mo35749c() {
        if (this.f28243c) {
            return new C10439j.C10442c(this.f28241a.entrySet().iterator());
        }
        return this.f28241a.entrySet().iterator();
    }

    /* renamed from: d */
    public void mo35752d() {
        if (!this.f28242b) {
            this.f28241a.mo35838d();
            this.f28242b = true;
        }
    }

    public C10424g<FieldDescriptorType> clone() {
        C10424g<FieldDescriptorType> f = m35313f();
        for (int i = 0; i < this.f28241a.mo35831a(); i++) {
            Map.Entry<FieldDescriptorType, Object> a = this.f28241a.mo35833a(i);
            f.mo35747b((FieldDescriptorType) (C10426b) a.getKey(), a.getValue());
        }
        for (Map.Entry next : this.f28241a.mo35834b()) {
            f.mo35747b((FieldDescriptorType) (C10426b) next.getKey(), next.getValue());
        }
        f.f28243c = this.f28243c;
        return f;
    }

    private C10424g(boolean z) {
        mo35752d();
    }

    /* renamed from: a */
    public Object mo35743a(FieldDescriptorType fielddescriptortype, int i) {
        if (fielddescriptortype.mo35757h()) {
            Object a = mo35742a(fielddescriptortype);
            if (a != null) {
                return ((List) a).get(i);
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: c */
    public boolean mo35750c(FieldDescriptorType fielddescriptortype) {
        if (!fielddescriptortype.mo35757h()) {
            return this.f28241a.get(fielddescriptortype) != null;
        }
        throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
    }

    /* renamed from: c */
    public static int m35311c(C10426b<?> bVar, Object obj) {
        C10472w.C10474b j = bVar.mo35758j();
        int b = bVar.mo35756b();
        if (!bVar.mo35757h()) {
            return m35300a(j, b, obj);
        }
        int i = 0;
        if (bVar.mo35754F()) {
            for (Object a : (List) obj) {
                i += m35301a(j, a);
            }
            return CodedOutputStream.m35148q(b) + i + CodedOutputStream.m35144n(i);
        }
        for (Object a2 : (List) obj) {
            i += m35300a(j, b, a2);
        }
        return i;
    }

    /* renamed from: a */
    public void mo35744a(FieldDescriptorType fielddescriptortype, Object obj) {
        List list;
        if (fielddescriptortype.mo35757h()) {
            m35310b(fielddescriptortype.mo35758j(), obj);
            Object a = mo35742a(fielddescriptortype);
            if (a == null) {
                list = new ArrayList();
                this.f28241a.mo35832a(fielddescriptortype, list);
            } else {
                list = (List) a;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: b */
    public int mo35746b(FieldDescriptorType fielddescriptortype) {
        if (fielddescriptortype.mo35757h()) {
            Object a = mo35742a(fielddescriptortype);
            if (a == null) {
                return 0;
            }
            return ((List) a).size();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        if ((r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.C10436i.C10437a) == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        if ((r3 instanceof byte[]) == false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if ((r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.C10439j) == false) goto L_0x002f;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m35310b(kotlin.reflect.jvm.internal.impl.protobuf.C10472w.C10474b r2, java.lang.Object r3) {
        /*
            if (r3 == 0) goto L_0x004e
            int[] r0 = kotlin.reflect.jvm.internal.impl.protobuf.C10424g.C10425a.f28244a
            kotlin.reflect.jvm.internal.impl.protobuf.w$c r2 = r2.mo35884a()
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            r1 = 0
            switch(r2) {
                case 1: goto L_0x0041;
                case 2: goto L_0x003e;
                case 3: goto L_0x003b;
                case 4: goto L_0x0038;
                case 5: goto L_0x0035;
                case 6: goto L_0x0032;
                case 7: goto L_0x0026;
                case 8: goto L_0x001d;
                case 9: goto L_0x0014;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x0043
        L_0x0014:
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.C10449o
            if (r2 != 0) goto L_0x0030
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.C10439j
            if (r2 == 0) goto L_0x002f
            goto L_0x0030
        L_0x001d:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L_0x0030
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.C10436i.C10437a
            if (r2 == 0) goto L_0x002f
            goto L_0x0030
        L_0x0026:
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.protobuf.C10417d
            if (r2 != 0) goto L_0x0030
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L_0x002f
            goto L_0x0030
        L_0x002f:
            r0 = 0
        L_0x0030:
            r1 = r0
            goto L_0x0043
        L_0x0032:
            boolean r1 = r3 instanceof java.lang.String
            goto L_0x0043
        L_0x0035:
            boolean r1 = r3 instanceof java.lang.Boolean
            goto L_0x0043
        L_0x0038:
            boolean r1 = r3 instanceof java.lang.Double
            goto L_0x0043
        L_0x003b:
            boolean r1 = r3 instanceof java.lang.Float
            goto L_0x0043
        L_0x003e:
            boolean r1 = r3 instanceof java.lang.Long
            goto L_0x0043
        L_0x0041:
            boolean r1 = r3 instanceof java.lang.Integer
        L_0x0043:
            if (r1 == 0) goto L_0x0046
            return
        L_0x0046:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        L_0x004e:
            r2 = 0
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.C10424g.m35310b(kotlin.reflect.jvm.internal.impl.protobuf.w$b, java.lang.Object):void");
    }

    /* renamed from: a */
    private boolean m35308a(Map.Entry<FieldDescriptorType, Object> entry) {
        C10426b bVar = (C10426b) entry.getKey();
        if (bVar.mo35753E() == C10472w.C10479c.MESSAGE) {
            if (bVar.mo35757h()) {
                for (C10449o isInitialized : (List) entry.getValue()) {
                    if (!isInitialized.isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (value instanceof C10449o) {
                    if (!((C10449o) value).isInitialized()) {
                        return false;
                    }
                } else if (value instanceof C10439j) {
                    return true;
                } else {
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    static int m35302a(C10472w.C10474b bVar, boolean z) {
        if (z) {
            return 2;
        }
        return bVar.mo35885d();
    }

    /* renamed from: a */
    public void mo35745a(C10424g<FieldDescriptorType> gVar) {
        for (int i = 0; i < gVar.f28241a.mo35831a(); i++) {
            m35309b(gVar.f28241a.mo35833a(i));
        }
        for (Map.Entry<FieldDescriptorType, Object> b : gVar.f28241a.mo35834b()) {
            m35309b(b);
        }
    }

    /* renamed from: b */
    public boolean mo35748b() {
        for (int i = 0; i < this.f28241a.mo35831a(); i++) {
            if (!m35308a(this.f28241a.mo35833a(i))) {
                return false;
            }
        }
        for (Map.Entry<FieldDescriptorType, Object> a : this.f28241a.mo35834b()) {
            if (!m35308a(a)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private Object m35303a(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* renamed from: b */
    private void m35309b(Map.Entry<FieldDescriptorType, Object> entry) {
        C10426b bVar = (C10426b) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C10439j) {
            value = ((C10439j) value).mo35782b();
        }
        if (bVar.mo35757h()) {
            Object a = mo35742a(bVar);
            if (a == null) {
                a = new ArrayList();
            }
            for (Object a2 : (List) value) {
                ((List) a).add(m35303a(a2));
            }
            this.f28241a.mo35832a(bVar, a);
        } else if (bVar.mo35753E() == C10472w.C10479c.MESSAGE) {
            Object a3 = mo35742a(bVar);
            if (a3 == null) {
                this.f28241a.mo35832a(bVar, m35303a(value));
                return;
            }
            this.f28241a.mo35832a(bVar, bVar.mo35755a(((C10449o) a3).mo34360c(), (C10449o) value).mo34378a());
        } else {
            this.f28241a.mo35832a(bVar, m35303a(value));
        }
    }

    /* renamed from: a */
    public static Object m35304a(C10420e eVar, C10472w.C10474b bVar, boolean z) throws IOException {
        switch (C10425a.f28245b[bVar.ordinal()]) {
            case 1:
                return Double.valueOf(eVar.mo35714e());
            case 2:
                return Float.valueOf(eVar.mo35718i());
            case 3:
                return Long.valueOf(eVar.mo35720k());
            case 4:
                return Long.valueOf(eVar.mo35735z());
            case 5:
                return Integer.valueOf(eVar.mo35719j());
            case 6:
                return Long.valueOf(eVar.mo35717h());
            case 7:
                return Integer.valueOf(eVar.mo35716g());
            case 8:
                return Boolean.valueOf(eVar.mo35711c());
            case 9:
                if (z) {
                    return eVar.mo35732w();
                }
                return eVar.mo35731v();
            case 10:
                return eVar.mo35712d();
            case 11:
                return Integer.valueOf(eVar.mo35734y());
            case 12:
                return Integer.valueOf(eVar.mo35727r());
            case 13:
                return Long.valueOf(eVar.mo35728s());
            case 14:
                return Integer.valueOf(eVar.mo35729t());
            case 15:
                return Long.valueOf(eVar.mo35730u());
            case 16:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 17:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 18:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: a */
    private static void m35305a(CodedOutputStream codedOutputStream, C10472w.C10474b bVar, int i, Object obj) throws IOException {
        if (bVar == C10472w.C10474b.GROUP) {
            codedOutputStream.mo35624a(i, (C10449o) obj);
            return;
        }
        codedOutputStream.mo35642c(i, m35302a(bVar, false));
        m35306a(codedOutputStream, bVar, obj);
    }

    /* renamed from: a */
    private static void m35306a(CodedOutputStream codedOutputStream, C10472w.C10474b bVar, Object obj) throws IOException {
        switch (C10425a.f28245b[bVar.ordinal()]) {
            case 1:
                codedOutputStream.mo35616a(((Double) obj).doubleValue());
                return;
            case 2:
                codedOutputStream.mo35617a(((Float) obj).floatValue());
                return;
            case 3:
                codedOutputStream.mo35637b(((Long) obj).longValue());
                return;
            case 4:
                codedOutputStream.mo35653g(((Long) obj).longValue());
                return;
            case 5:
                codedOutputStream.mo35641c(((Integer) obj).intValue());
                return;
            case 6:
                codedOutputStream.mo35626a(((Long) obj).longValue());
                return;
            case 7:
                codedOutputStream.mo35634b(((Integer) obj).intValue());
                return;
            case 8:
                codedOutputStream.mo35631a(((Boolean) obj).booleanValue());
                return;
            case 9:
                codedOutputStream.mo35627a((String) obj);
                return;
            case 10:
                if (obj instanceof C10417d) {
                    codedOutputStream.mo35628a((C10417d) obj);
                    return;
                } else {
                    codedOutputStream.mo35632a((byte[]) obj);
                    return;
                }
            case 11:
                codedOutputStream.mo35655i(((Integer) obj).intValue());
                return;
            case 12:
                codedOutputStream.mo35652g(((Integer) obj).intValue());
                return;
            case 13:
                codedOutputStream.mo35649e(((Long) obj).longValue());
                return;
            case 14:
                codedOutputStream.mo35654h(((Integer) obj).intValue());
                return;
            case 15:
                codedOutputStream.mo35651f(((Long) obj).longValue());
                return;
            case 16:
                codedOutputStream.mo35630a((C10449o) obj);
                return;
            case 17:
                codedOutputStream.mo35639b((C10449o) obj);
                return;
            case 18:
                if (obj instanceof C10436i.C10437a) {
                    codedOutputStream.mo35618a(((C10436i.C10437a) obj).mo34424b());
                    return;
                } else {
                    codedOutputStream.mo35618a(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }

    /* renamed from: a */
    public static void m35307a(C10426b<?> bVar, Object obj, CodedOutputStream codedOutputStream) throws IOException {
        C10472w.C10474b j = bVar.mo35758j();
        int b = bVar.mo35756b();
        if (bVar.mo35757h()) {
            List<Object> list = (List) obj;
            if (bVar.mo35754F()) {
                codedOutputStream.mo35642c(b, 2);
                int i = 0;
                for (Object a : list) {
                    i += m35301a(j, a);
                }
                codedOutputStream.mo35650f(i);
                for (Object a2 : list) {
                    m35306a(codedOutputStream, j, a2);
                }
                return;
            }
            for (Object a3 : list) {
                m35305a(codedOutputStream, j, b, a3);
            }
        } else if (obj instanceof C10439j) {
            m35305a(codedOutputStream, j, b, ((C10439j) obj).mo35782b());
        } else {
            m35305a(codedOutputStream, j, b, obj);
        }
    }

    /* renamed from: a */
    public int mo35741a() {
        int i = 0;
        for (int i2 = 0; i2 < this.f28241a.mo35831a(); i2++) {
            Map.Entry<FieldDescriptorType, Object> a = this.f28241a.mo35833a(i2);
            i += m35311c((C10426b) a.getKey(), a.getValue());
        }
        for (Map.Entry next : this.f28241a.mo35834b()) {
            i += m35311c((C10426b) next.getKey(), next.getValue());
        }
        return i;
    }

    /* renamed from: a */
    private static int m35300a(C10472w.C10474b bVar, int i, Object obj) {
        int q = CodedOutputStream.m35148q(i);
        if (bVar == C10472w.C10474b.GROUP) {
            q *= 2;
        }
        return q + m35301a(bVar, obj);
    }

    /* renamed from: a */
    private static int m35301a(C10472w.C10474b bVar, Object obj) {
        switch (C10425a.f28245b[bVar.ordinal()]) {
            case 1:
                return CodedOutputStream.m35117b(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.m35118b(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.m35135i(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.m35143m(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.m35140l(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.m35134h(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.m35138k(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.m35125b(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.m35124b((String) obj);
            case 10:
                if (obj instanceof C10417d) {
                    return CodedOutputStream.m35127c((C10417d) obj);
                }
                return CodedOutputStream.m35129c((byte[]) obj);
            case 11:
                return CodedOutputStream.m35149r(((Integer) obj).intValue());
            case 12:
                return CodedOutputStream.m35146o(((Integer) obj).intValue());
            case 13:
                return CodedOutputStream.m35139k(((Long) obj).longValue());
            case 14:
                return CodedOutputStream.m35147p(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.m35141l(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.m35128c((C10449o) obj);
            case 17:
                if (obj instanceof C10439j) {
                    return CodedOutputStream.m35115a((C10443k) (C10439j) obj);
                }
                return CodedOutputStream.m35131d((C10449o) obj);
            case 18:
                if (obj instanceof C10436i.C10437a) {
                    return CodedOutputStream.m35136j(((C10436i.C10437a) obj).mo34424b());
                }
                return CodedOutputStream.m35136j(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }
}
