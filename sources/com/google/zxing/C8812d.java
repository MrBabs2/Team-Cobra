package com.google.zxing;

import com.google.zxing.p195f.C8815a;
import com.google.zxing.p197g.C8825b;
import com.google.zxing.p198h.C8827a;
import com.google.zxing.p200i.C8843b;
import com.google.zxing.p200i.C8845d;
import com.google.zxing.p200i.C8848f;
import com.google.zxing.p200i.C8850h;
import com.google.zxing.p200i.C8852j;
import com.google.zxing.p200i.C8853k;
import com.google.zxing.p200i.C8854l;
import com.google.zxing.p200i.C8857o;
import com.google.zxing.p200i.C8861s;
import com.google.zxing.p201j.C8862a;
import com.google.zxing.p203k.C8871a;
import java.util.Map;

/* renamed from: com.google.zxing.d */
/* compiled from: MultiFormatWriter */
public final class C8812d implements C8814e {

    /* renamed from: com.google.zxing.d$a */
    /* compiled from: MultiFormatWriter */
    static /* synthetic */ class C8813a {

        /* renamed from: a */
        static final /* synthetic */ int[] f25033a;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|(3:25|26|28)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.zxing.a[] r0 = com.google.zxing.C8806a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f25033a = r0
                com.google.zxing.a r1 = com.google.zxing.C8806a.EAN_8     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f25033a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.zxing.a r1 = com.google.zxing.C8806a.UPC_E     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f25033a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.zxing.a r1 = com.google.zxing.C8806a.EAN_13     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f25033a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.zxing.a r1 = com.google.zxing.C8806a.UPC_A     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f25033a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.zxing.a r1 = com.google.zxing.C8806a.QR_CODE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f25033a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.zxing.a r1 = com.google.zxing.C8806a.CODE_39     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f25033a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.zxing.a r1 = com.google.zxing.C8806a.CODE_93     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f25033a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.zxing.a r1 = com.google.zxing.C8806a.CODE_128     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f25033a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.zxing.a r1 = com.google.zxing.C8806a.ITF     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f25033a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.zxing.a r1 = com.google.zxing.C8806a.PDF_417     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f25033a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.zxing.a r1 = com.google.zxing.C8806a.CODABAR     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f25033a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.zxing.a r1 = com.google.zxing.C8806a.DATA_MATRIX     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f25033a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.google.zxing.a r1 = com.google.zxing.C8806a.AZTEC     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.C8812d.C8813a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public C8825b mo32558a(String str, C8806a aVar, int i, int i2, Map<C8808c, ?> map) throws WriterException {
        C8814e eVar;
        switch (C8813a.f25033a[aVar.ordinal()]) {
            case 1:
                eVar = new C8853k();
                break;
            case 2:
                eVar = new C8861s();
                break;
            case 3:
                eVar = new C8852j();
                break;
            case 4:
                eVar = new C8857o();
                break;
            case 5:
                eVar = new C8871a();
                break;
            case 6:
                eVar = new C8848f();
                break;
            case 7:
                eVar = new C8850h();
                break;
            case 8:
                eVar = new C8845d();
                break;
            case 9:
                eVar = new C8854l();
                break;
            case 10:
                eVar = new C8862a();
                break;
            case 11:
                eVar = new C8843b();
                break;
            case 12:
                eVar = new C8827a();
                break;
            case 13:
                eVar = new C8815a();
                break;
            default:
                throw new IllegalArgumentException("No encoder available for format ".concat(String.valueOf(aVar)));
        }
        return eVar.mo32558a(str, aVar, i, i2, map);
    }
}
