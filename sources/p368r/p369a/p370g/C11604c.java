package p368r.p369a.p370g;

import com.google.android.gms.ads.AdRequest;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.util.HashMap;
import java.util.Map;
import p368r.p369a.p370g.p371s.C11666a;
import p368r.p369a.p370g.p371s.C11667b;
import p368r.p369a.p370g.p371s.C11669d;
import p368r.p369a.p370g.p371s.C11670e;
import p415t.p417b.C12938b;
import p415t.p417b.C12939c;

/* renamed from: r.a.g.c */
/* compiled from: DNSIncoming */
public final class C11604c extends C11608e {

    /* renamed from: l */
    private static C12938b f30950l = C12939c.m41778a(C11604c.class.getName());

    /* renamed from: m */
    public static boolean f30951m = true;

    /* renamed from: n */
    private static final char[] f30952n = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: h */
    private final DatagramPacket f30953h;

    /* renamed from: i */
    private final long f30954i;

    /* renamed from: j */
    private final C11606b f30955j;

    /* renamed from: k */
    private int f30956k;

    /* renamed from: r.a.g.c$a */
    /* compiled from: DNSIncoming */
    static /* synthetic */ class C11605a {

        /* renamed from: a */
        static final /* synthetic */ int[] f30957a;

        /* renamed from: b */
        static final /* synthetic */ int[] f30958b;

        /* renamed from: c */
        static final /* synthetic */ int[] f30959c;

        /* JADX WARNING: Can't wrap try/catch for region: R(37:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|(2:23|24)|25|27|28|29|30|31|32|33|34|(2:35|36)|37|39|40|41|42|43|44|45|46|48) */
        /* JADX WARNING: Can't wrap try/catch for region: R(39:0|(2:1|2)|3|5|6|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|27|28|29|30|31|32|33|34|(2:35|36)|37|39|40|41|42|43|44|45|46|48) */
        /* JADX WARNING: Can't wrap try/catch for region: R(41:0|1|2|3|5|6|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|27|28|29|30|31|32|33|34|35|36|37|39|40|41|42|43|44|45|46|48) */
        /* JADX WARNING: Can't wrap try/catch for region: R(42:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|27|28|29|30|31|32|33|34|35|36|37|39|40|41|42|43|44|45|46|48) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0071 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x007b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0085 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x008f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00aa */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00be */
        static {
            /*
                r.a.g.s.e[] r0 = p368r.p369a.p370g.p371s.C11670e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f30959c = r0
                r1 = 1
                r.a.g.s.e r2 = p368r.p369a.p370g.p371s.C11670e.TYPE_A     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f30959c     // Catch:{ NoSuchFieldError -> 0x001d }
                r.a.g.s.e r3 = p368r.p369a.p370g.p371s.C11670e.TYPE_AAAA     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f30959c     // Catch:{ NoSuchFieldError -> 0x0028 }
                r.a.g.s.e r4 = p368r.p369a.p370g.p371s.C11670e.TYPE_CNAME     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f30959c     // Catch:{ NoSuchFieldError -> 0x0033 }
                r.a.g.s.e r5 = p368r.p369a.p370g.p371s.C11670e.TYPE_PTR     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = f30959c     // Catch:{ NoSuchFieldError -> 0x003e }
                r.a.g.s.e r6 = p368r.p369a.p370g.p371s.C11670e.TYPE_TXT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r5 = f30959c     // Catch:{ NoSuchFieldError -> 0x0049 }
                r.a.g.s.e r6 = p368r.p369a.p370g.p371s.C11670e.TYPE_SRV     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r7 = 6
                r5[r6] = r7     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r5 = f30959c     // Catch:{ NoSuchFieldError -> 0x0054 }
                r.a.g.s.e r6 = p368r.p369a.p370g.p371s.C11670e.TYPE_HINFO     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r7 = 7
                r5[r6] = r7     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r5 = f30959c     // Catch:{ NoSuchFieldError -> 0x0060 }
                r.a.g.s.e r6 = p368r.p369a.p370g.p371s.C11670e.TYPE_OPT     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r7 = 8
                r5[r6] = r7     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                r.a.g.s.c[] r5 = p368r.p369a.p370g.p371s.C11668c.values()
                int r5 = r5.length
                int[] r5 = new int[r5]
                f30958b = r5
                r.a.g.s.c r6 = p368r.p369a.p370g.p371s.C11668c.Owner     // Catch:{ NoSuchFieldError -> 0x0071 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0071 }
                r5[r6] = r1     // Catch:{ NoSuchFieldError -> 0x0071 }
            L_0x0071:
                int[] r5 = f30958b     // Catch:{ NoSuchFieldError -> 0x007b }
                r.a.g.s.c r6 = p368r.p369a.p370g.p371s.C11668c.LLQ     // Catch:{ NoSuchFieldError -> 0x007b }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x007b }
                r5[r6] = r0     // Catch:{ NoSuchFieldError -> 0x007b }
            L_0x007b:
                int[] r5 = f30958b     // Catch:{ NoSuchFieldError -> 0x0085 }
                r.a.g.s.c r6 = p368r.p369a.p370g.p371s.C11668c.NSID     // Catch:{ NoSuchFieldError -> 0x0085 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0085 }
                r5[r6] = r2     // Catch:{ NoSuchFieldError -> 0x0085 }
            L_0x0085:
                int[] r5 = f30958b     // Catch:{ NoSuchFieldError -> 0x008f }
                r.a.g.s.c r6 = p368r.p369a.p370g.p371s.C11668c.UL     // Catch:{ NoSuchFieldError -> 0x008f }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
                r5[r6] = r3     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                int[] r5 = f30958b     // Catch:{ NoSuchFieldError -> 0x0099 }
                r.a.g.s.c r6 = p368r.p369a.p370g.p371s.C11668c.Unknown     // Catch:{ NoSuchFieldError -> 0x0099 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0099 }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x0099 }
            L_0x0099:
                r.a.g.s.b[] r4 = p368r.p369a.p370g.p371s.C11667b.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f30957a = r4
                r.a.g.s.b r5 = p368r.p369a.p370g.p371s.C11667b.Standard     // Catch:{ NoSuchFieldError -> 0x00aa }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x00aa }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x00aa }
            L_0x00aa:
                int[] r1 = f30957a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r.a.g.s.b r4 = p368r.p369a.p370g.p371s.C11667b.Compressed     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f30957a     // Catch:{ NoSuchFieldError -> 0x00be }
                r.a.g.s.b r1 = p368r.p369a.p370g.p371s.C11667b.Extended     // Catch:{ NoSuchFieldError -> 0x00be }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00be }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00be }
            L_0x00be:
                int[] r0 = f30957a     // Catch:{ NoSuchFieldError -> 0x00c8 }
                r.a.g.s.b r1 = p368r.p369a.p370g.p371s.C11667b.Unknown     // Catch:{ NoSuchFieldError -> 0x00c8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c8 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x00c8 }
            L_0x00c8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p368r.p369a.p370g.C11604c.C11605a.<clinit>():void");
        }
    }

    /* renamed from: r.a.g.c$b */
    /* compiled from: DNSIncoming */
    public static class C11606b extends ByteArrayInputStream {

        /* renamed from: g */
        private static C12938b f30960g = C12939c.m41778a(C11606b.class.getName());

        /* renamed from: f */
        final Map<Integer, String> f30961f;

        public C11606b(byte[] bArr, int i) {
            this(bArr, 0, i);
        }

        /* renamed from: a */
        public byte[] mo37916a(int i) {
            byte[] bArr = new byte[i];
            read(bArr, 0, i);
            return bArr;
        }

        /* renamed from: b */
        public String mo37918b(int i) {
            int i2;
            int d;
            StringBuilder sb = new StringBuilder(i);
            int i3 = 0;
            while (i3 < i) {
                int d2 = mo37919d();
                switch (d2 >> 4) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        break;
                    case 12:
                    case 13:
                        i2 = (d2 & 31) << 6;
                        d = mo37919d() & 63;
                        break;
                    case 14:
                        d2 = ((d2 & 15) << 12) | ((mo37919d() & 63) << 6) | (mo37919d() & 63);
                        i3++;
                        break;
                    default:
                        i2 = (d2 & 63) << 4;
                        d = mo37919d() & 15;
                        break;
                }
                d2 = i2 | d;
                i3++;
                sb.append((char) d2);
                i3++;
            }
            return sb.toString();
        }

        /* renamed from: d */
        public int mo37919d() {
            return read() & 255;
        }

        /* renamed from: i */
        public int mo37920i() {
            return (mo37919d() << 8) | mo37919d();
        }

        public int readInt() {
            return (mo37920i() << 16) | mo37920i();
        }

        public C11606b(byte[] bArr, int i, int i2) {
            super(bArr, i, i2);
            this.f30961f = new HashMap();
        }

        /* renamed from: a */
        public String mo37915a() {
            HashMap hashMap = new HashMap();
            StringBuilder sb = new StringBuilder();
            boolean z = false;
            while (!z) {
                int d = mo37919d();
                if (d == 0) {
                    break;
                }
                int i = C11605a.f30957a[C11667b.m38373a(d).ordinal()];
                if (i == 1) {
                    int i2 = this.pos - 1;
                    String str = mo37918b(d) + ".";
                    sb.append(str);
                    for (StringBuilder append : hashMap.values()) {
                        append.append(str);
                    }
                    hashMap.put(Integer.valueOf(i2), new StringBuilder(str));
                } else if (i == 2) {
                    int b = (C11667b.m38374b(d) << 8) | mo37919d();
                    String str2 = this.f30961f.get(Integer.valueOf(b));
                    if (str2 == null) {
                        f30960g.mo41315c("bad domain name: possible circular name detected. Bad offset: 0x" + Integer.toHexString(b) + " at 0x" + Integer.toHexString(this.pos - 2));
                        str2 = "";
                    }
                    sb.append(str2);
                    for (StringBuilder append2 : hashMap.values()) {
                        append2.append(str2);
                    }
                    z = true;
                } else if (i != 3) {
                    f30960g.mo41315c("unsupported dns label type: '" + Integer.toHexString(d & 192) + "'");
                } else {
                    f30960g.mo41310b("Extended label are not currently supported.");
                }
            }
            for (Integer num : hashMap.keySet()) {
                this.f30961f.put(num, ((StringBuilder) hashMap.get(num)).toString());
            }
            return sb.toString();
        }

        /* renamed from: b */
        public String mo37917b() {
            return mo37918b(mo37919d());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11604c(DatagramPacket datagramPacket) throws IOException {
        super(0, 0, datagramPacket.getPort() == C11666a.f31110a);
        this.f30953h = datagramPacket;
        InetAddress address = datagramPacket.getAddress();
        this.f30955j = new C11606b(datagramPacket.getData(), datagramPacket.getLength());
        this.f30954i = System.currentTimeMillis();
        this.f30956k = 1460;
        try {
            mo37927b(this.f30955j.mo37920i());
            mo37925a(this.f30955j.mo37920i());
            if (mo37936k() <= 0) {
                int i = this.f30955j.mo37920i();
                int i2 = this.f30955j.mo37920i();
                int i3 = this.f30955j.mo37920i();
                int i4 = this.f30955j.mo37920i();
                if (f30950l.mo41309a()) {
                    C12938b bVar = f30950l;
                    bVar.mo41310b("DNSIncoming() questions:" + i + " answers:" + i2 + " authorities:" + i3 + " additionals:" + i4);
                }
                if ((i * 5) + ((i2 + i3 + i4) * 11) <= datagramPacket.getLength()) {
                    if (i > 0) {
                        for (int i5 = 0; i5 < i; i5++) {
                            this.f30965d.add(m37989w());
                        }
                    }
                    if (i2 > 0) {
                        for (int i6 = 0; i6 < i2; i6++) {
                            C11620h a = m37987a(address);
                            if (a != null) {
                                this.f30966e.add(a);
                            }
                        }
                    }
                    if (i3 > 0) {
                        for (int i7 = 0; i7 < i3; i7++) {
                            C11620h a2 = m37987a(address);
                            if (a2 != null) {
                                this.f30967f.add(a2);
                            }
                        }
                    }
                    if (i4 > 0) {
                        for (int i8 = 0; i8 < i4; i8++) {
                            C11620h a3 = m37987a(address);
                            if (a3 != null) {
                                this.f30968g.add(a3);
                            }
                        }
                    }
                    if (this.f30955j.available() > 0) {
                        throw new IOException("Received a message with the wrong length.");
                    }
                    return;
                }
                throw new IOException("questions:" + i + " answers:" + i2 + " authorities:" + i3 + " additionals:" + i4);
            }
            throw new IOException("Received a message with a non standard operation code. Currently unsupported in the specification.");
        } catch (Exception e) {
            C12938b bVar2 = f30950l;
            bVar2.mo41318c("DNSIncoming() dump " + mo37909a(true) + "\n exception ", (Throwable) e);
            IOException iOException = new IOException("DNSIncoming corrupted message");
            iOException.initCause(e);
            throw iOException;
        }
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [r.a.g.h] */
    /* JADX WARNING: type inference failed for: r11v1 */
    /* JADX WARNING: type inference failed for: r11v7 */
    /* JADX WARNING: type inference failed for: r2v53, types: [r.a.g.h$c] */
    /* JADX WARNING: type inference failed for: r2v54, types: [r.a.g.h$d] */
    /* JADX WARNING: type inference failed for: r2v55, types: [r.a.g.h$e] */
    /* JADX WARNING: type inference failed for: r2v56, types: [r.a.g.h$g] */
    /* JADX WARNING: type inference failed for: r2v57, types: [r.a.g.h$b] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x00ca A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0266  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private p368r.p369a.p370g.C11620h m37987a(java.net.InetAddress r23) {
        /*
            r22 = this;
            r0 = r22
            r.a.g.c$b r1 = r0.f30955j
            java.lang.String r3 = r1.mo37915a()
            r.a.g.c$b r1 = r0.f30955j
            int r1 = r1.mo37920i()
            r.a.g.s.e r1 = p368r.p369a.p370g.p371s.C11670e.m38381a(r1)
            r.a.g.s.e r2 = p368r.p369a.p370g.p371s.C11670e.TYPE_IGNORE
            java.lang.String r4 = "\n"
            r5 = 1
            if (r1 != r2) goto L_0x0039
            t.b.b r2 = f30950l
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Could not find record type. domain: "
            r6.append(r7)
            r6.append(r3)
            r6.append(r4)
            java.lang.String r7 = r0.mo37909a((boolean) r5)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r2.mo41315c(r6)
        L_0x0039:
            r.a.g.c$b r2 = r0.f30955j
            int r2 = r2.mo37920i()
            r.a.g.s.e r6 = p368r.p369a.p370g.p371s.C11670e.TYPE_OPT
            if (r1 != r6) goto L_0x0046
            r.a.g.s.d r6 = p368r.p369a.p370g.p371s.C11669d.CLASS_UNKNOWN
            goto L_0x004a
        L_0x0046:
            r.a.g.s.d r6 = p368r.p369a.p370g.p371s.C11669d.m38378b(r2)
        L_0x004a:
            r.a.g.s.d r7 = p368r.p369a.p370g.p371s.C11669d.CLASS_UNKNOWN
            if (r6 != r7) goto L_0x007a
            r.a.g.s.e r7 = p368r.p369a.p370g.p371s.C11670e.TYPE_OPT
            if (r1 == r7) goto L_0x007a
            t.b.b r7 = f30950l
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Could not find record class. domain: "
            r8.append(r9)
            r8.append(r3)
            java.lang.String r9 = " type: "
            r8.append(r9)
            r8.append(r1)
            r8.append(r4)
            java.lang.String r4 = r0.mo37909a((boolean) r5)
            r8.append(r4)
            java.lang.String r4 = r8.toString()
            r7.mo41315c(r4)
        L_0x007a:
            boolean r7 = r6.mo38194a(r2)
            r.a.g.c$b r4 = r0.f30955j
            int r8 = r4.readInt()
            r.a.g.c$b r4 = r0.f30955j
            int r4 = r4.mo37920i()
            int[] r9 = p368r.p369a.p370g.C11604c.C11605a.f30959c
            int r10 = r1.ordinal()
            r9 = r9[r10]
            java.lang.String r10 = ""
            r12 = 0
            switch(r9) {
                case 1: goto L_0x03c0;
                case 2: goto L_0x03af;
                case 3: goto L_0x0379;
                case 4: goto L_0x0379;
                case 5: goto L_0x0367;
                case 6: goto L_0x0333;
                case 7: goto L_0x02f8;
                case 8: goto L_0x00b8;
                default: goto L_0x0098;
            }
        L_0x0098:
            t.b.b r2 = f30950l
            boolean r2 = r2.mo41309a()
            if (r2 == 0) goto L_0x03d1
            t.b.b r2 = f30950l
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "DNSIncoming() unknown type:"
            r3.append(r5)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.mo41310b(r1)
            goto L_0x03d1
        L_0x00b8:
            int r1 = r22.mo37930e()
            r.a.g.s.f r1 = p368r.p369a.p370g.p371s.C11671f.m38383a(r1, r8)
            r3 = 16711680(0xff0000, float:2.3418052E-38)
            r3 = r3 & r8
            r4 = 16
            int r3 = r3 >> r4
            if (r3 != 0) goto L_0x02d8
            r0.f30956k = r2
        L_0x00ca:
            r.a.g.c$b r1 = r0.f30955j
            int r1 = r1.available()
            if (r1 <= 0) goto L_0x03d7
            r.a.g.c$b r1 = r0.f30955j
            int r1 = r1.available()
            java.lang.String r2 = "There was a problem reading the OPT record. Ignoring."
            r3 = 2
            if (r1 < r3) goto L_0x02d1
            r.a.g.c$b r1 = r0.f30955j
            int r1 = r1.mo37920i()
            r.a.g.s.c r6 = p368r.p369a.p370g.p371s.C11668c.m38376a(r1)
            r.a.g.c$b r7 = r0.f30955j
            int r7 = r7.available()
            if (r7 < r3) goto L_0x02ca
            r.a.g.c$b r2 = r0.f30955j
            int r2 = r2.mo37920i()
            byte[] r7 = new byte[r12]
            r.a.g.c$b r8 = r0.f30955j
            int r8 = r8.available()
            if (r8 < r2) goto L_0x0105
            r.a.g.c$b r7 = r0.f30955j
            byte[] r7 = r7.mo37916a(r2)
        L_0x0105:
            int[] r2 = p368r.p369a.p370g.C11604c.C11605a.f30958b
            int r8 = r6.ordinal()
            r2 = r2[r8]
            r8 = 5
            r9 = 4
            r13 = 3
            if (r2 == r5) goto L_0x019d
            java.lang.String r14 = " data: "
            if (r2 == r3) goto L_0x0173
            if (r2 == r13) goto L_0x0173
            if (r2 == r9) goto L_0x0173
            if (r2 == r8) goto L_0x011d
            goto L_0x00ca
        L_0x011d:
            r2 = 65001(0xfde9, float:9.1086E-41)
            if (r1 < r2) goto L_0x0151
            r2 = 65534(0xfffe, float:9.1833E-41)
            if (r1 > r2) goto L_0x0151
            t.b.b r2 = f30950l
            boolean r2 = r2.mo41309a()
            if (r2 == 0) goto L_0x00ca
            t.b.b r2 = f30950l
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "There was an OPT answer using an experimental/local option code: "
            r3.append(r6)
            r3.append(r1)
            r3.append(r14)
            java.lang.String r1 = r0.m37988b(r7)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.mo41310b(r1)
            goto L_0x00ca
        L_0x0151:
            t.b.b r2 = f30950l
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "There was an OPT answer. Not currently handled. Option code: "
            r3.append(r6)
            r3.append(r1)
            r3.append(r14)
            java.lang.String r1 = r0.m37988b(r7)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.mo41315c(r1)
            goto L_0x00ca
        L_0x0173:
            t.b.b r1 = f30950l
            boolean r1 = r1.mo41309a()
            if (r1 == 0) goto L_0x00ca
            t.b.b r1 = f30950l
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "There was an OPT answer. Option code: "
            r2.append(r3)
            r2.append(r6)
            r2.append(r14)
            java.lang.String r3 = r0.m37988b(r7)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.mo41310b(r2)
            goto L_0x00ca
        L_0x019d:
            byte r1 = r7[r12]     // Catch:{ Exception -> 0x023f }
            byte r2 = r7[r5]     // Catch:{ Exception -> 0x0240 }
            r6 = 6
            byte[] r14 = new byte[r6]     // Catch:{ Exception -> 0x0241 }
            byte r15 = r7[r3]     // Catch:{ Exception -> 0x0241 }
            r14[r12] = r15     // Catch:{ Exception -> 0x0241 }
            byte r15 = r7[r13]     // Catch:{ Exception -> 0x0241 }
            r14[r5] = r15     // Catch:{ Exception -> 0x0241 }
            byte r15 = r7[r9]     // Catch:{ Exception -> 0x0241 }
            r14[r3] = r15     // Catch:{ Exception -> 0x0241 }
            byte r15 = r7[r8]     // Catch:{ Exception -> 0x0241 }
            r14[r13] = r15     // Catch:{ Exception -> 0x0241 }
            byte r15 = r7[r6]     // Catch:{ Exception -> 0x0241 }
            r14[r9] = r15     // Catch:{ Exception -> 0x0241 }
            r15 = 7
            byte r16 = r7[r15]     // Catch:{ Exception -> 0x0241 }
            r14[r8] = r16     // Catch:{ Exception -> 0x0241 }
            int r11 = r7.length     // Catch:{ Exception -> 0x023c }
            r15 = 8
            if (r11 <= r15) goto L_0x01e7
            byte[] r11 = new byte[r6]     // Catch:{ Exception -> 0x023c }
            byte r17 = r7[r15]     // Catch:{ Exception -> 0x023c }
            r11[r12] = r17     // Catch:{ Exception -> 0x023c }
            r17 = 9
            byte r17 = r7[r17]     // Catch:{ Exception -> 0x023c }
            r11[r5] = r17     // Catch:{ Exception -> 0x023c }
            r17 = 10
            byte r17 = r7[r17]     // Catch:{ Exception -> 0x023c }
            r11[r3] = r17     // Catch:{ Exception -> 0x023c }
            r17 = 11
            byte r17 = r7[r17]     // Catch:{ Exception -> 0x023c }
            r11[r13] = r17     // Catch:{ Exception -> 0x023c }
            r17 = 12
            byte r17 = r7[r17]     // Catch:{ Exception -> 0x023c }
            r11[r9] = r17     // Catch:{ Exception -> 0x023c }
            r17 = 13
            byte r17 = r7[r17]     // Catch:{ Exception -> 0x023c }
            r11[r8] = r17     // Catch:{ Exception -> 0x023c }
            goto L_0x01e8
        L_0x01e7:
            r11 = r14
        L_0x01e8:
            int r6 = r7.length     // Catch:{ Exception -> 0x023d }
            r18 = 17
            r19 = 15
            r20 = 14
            r8 = 18
            if (r6 != r8) goto L_0x0206
            byte[] r6 = new byte[r9]     // Catch:{ Exception -> 0x023d }
            byte r21 = r7[r20]     // Catch:{ Exception -> 0x023d }
            r6[r12] = r21     // Catch:{ Exception -> 0x023d }
            byte r21 = r7[r19]     // Catch:{ Exception -> 0x023d }
            r6[r5] = r21     // Catch:{ Exception -> 0x023d }
            byte r21 = r7[r4]     // Catch:{ Exception -> 0x023d }
            r6[r3] = r21     // Catch:{ Exception -> 0x023d }
            byte r21 = r7[r18]     // Catch:{ Exception -> 0x023d }
            r6[r13] = r21     // Catch:{ Exception -> 0x023d }
            goto L_0x0207
        L_0x0206:
            r6 = 0
        L_0x0207:
            int r9 = r7.length     // Catch:{ Exception -> 0x0244 }
            r8 = 22
            if (r9 != r8) goto L_0x025e
            byte[] r8 = new byte[r15]     // Catch:{ Exception -> 0x0244 }
            byte r9 = r7[r20]     // Catch:{ Exception -> 0x0244 }
            r8[r12] = r9     // Catch:{ Exception -> 0x0244 }
            byte r9 = r7[r19]     // Catch:{ Exception -> 0x0244 }
            r8[r5] = r9     // Catch:{ Exception -> 0x0244 }
            byte r9 = r7[r4]     // Catch:{ Exception -> 0x0244 }
            r8[r3] = r9     // Catch:{ Exception -> 0x0244 }
            byte r3 = r7[r18]     // Catch:{ Exception -> 0x0244 }
            r8[r13] = r3     // Catch:{ Exception -> 0x0244 }
            r3 = 18
            byte r3 = r7[r3]     // Catch:{ Exception -> 0x0244 }
            r9 = 4
            r8[r9] = r3     // Catch:{ Exception -> 0x0244 }
            r3 = 19
            byte r3 = r7[r3]     // Catch:{ Exception -> 0x0244 }
            r9 = 5
            r8[r9] = r3     // Catch:{ Exception -> 0x0244 }
            r3 = 20
            byte r3 = r7[r3]     // Catch:{ Exception -> 0x0244 }
            r9 = 6
            r8[r9] = r3     // Catch:{ Exception -> 0x0244 }
            r3 = 21
            byte r3 = r7[r3]     // Catch:{ Exception -> 0x0244 }
            r9 = 7
            r8[r9] = r3     // Catch:{ Exception -> 0x0244 }
            r6 = r8
            goto L_0x025e
        L_0x023c:
            r11 = r14
        L_0x023d:
            r6 = 0
            goto L_0x0244
        L_0x023f:
            r1 = 0
        L_0x0240:
            r2 = 0
        L_0x0241:
            r6 = 0
            r11 = 0
            r14 = 0
        L_0x0244:
            t.b.b r3 = f30950l
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Malformed OPT answer. Option code: Owner data: "
            r8.append(r9)
            java.lang.String r7 = r0.m37988b(r7)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            r3.mo41315c(r7)
        L_0x025e:
            t.b.b r3 = f30950l
            boolean r3 = r3.mo41309a()
            if (r3 == 0) goto L_0x00ca
            t.b.b r3 = f30950l
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Unhandled Owner OPT version: "
            r7.append(r8)
            r7.append(r1)
            java.lang.String r1 = " sequence: "
            r7.append(r1)
            r7.append(r2)
            java.lang.String r1 = " MAC address: "
            r7.append(r1)
            java.lang.String r1 = r0.m37988b(r14)
            r7.append(r1)
            if (r11 == r14) goto L_0x02a1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = " wakeup MAC address: "
            r1.append(r2)
            java.lang.String r2 = r0.m37988b(r11)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            goto L_0x02a2
        L_0x02a1:
            r1 = r10
        L_0x02a2:
            r7.append(r1)
            if (r6 == 0) goto L_0x02bd
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = " password: "
            r1.append(r2)
            java.lang.String r2 = r0.m37988b(r6)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            goto L_0x02be
        L_0x02bd:
            r1 = r10
        L_0x02be:
            r7.append(r1)
            java.lang.String r1 = r7.toString()
            r3.mo41310b(r1)
            goto L_0x00ca
        L_0x02ca:
            t.b.b r1 = f30950l
            r1.mo41315c(r2)
            goto L_0x03d7
        L_0x02d1:
            t.b.b r1 = f30950l
            r1.mo41315c(r2)
            goto L_0x03d7
        L_0x02d8:
            t.b.b r2 = f30950l
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "There was an OPT answer. Wrong version number: "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = " result code: "
            r4.append(r3)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r2.mo41315c(r1)
            goto L_0x03d7
        L_0x02f8:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r.a.g.c$b r2 = r0.f30955j
            java.lang.String r2 = r2.mo37918b(r4)
            r1.append(r2)
            java.lang.String r2 = " "
            int r2 = r1.indexOf(r2)
            if (r2 <= 0) goto L_0x0313
            java.lang.String r4 = r1.substring(r12, r2)
            goto L_0x0317
        L_0x0313:
            java.lang.String r4 = r1.toString()
        L_0x0317:
            java.lang.String r9 = r4.trim()
            if (r2 <= 0) goto L_0x0322
            int r2 = r2 + r5
            java.lang.String r10 = r1.substring(r2)
        L_0x0322:
            java.lang.String r1 = r10.trim()
            r.a.g.h$b r11 = new r.a.g.h$b
            r2 = r11
            r4 = r6
            r5 = r7
            r6 = r8
            r7 = r9
            r8 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8)
            goto L_0x03d8
        L_0x0333:
            r.a.g.c$b r1 = r0.f30955j
            int r1 = r1.mo37920i()
            r.a.g.c$b r2 = r0.f30955j
            int r9 = r2.mo37920i()
            r.a.g.c$b r2 = r0.f30955j
            int r10 = r2.mo37920i()
            boolean r2 = f30951m
            if (r2 == 0) goto L_0x0350
            r.a.g.c$b r2 = r0.f30955j
            java.lang.String r2 = r2.mo37915a()
            goto L_0x0356
        L_0x0350:
            r.a.g.c$b r2 = r0.f30955j
            java.lang.String r2 = r2.mo37917b()
        L_0x0356:
            r11 = r2
            r.a.g.h$f r12 = new r.a.g.h$f
            r2 = r12
            r4 = r6
            r5 = r7
            r6 = r8
            r7 = r1
            r8 = r9
            r9 = r10
            r10 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r11 = r12
            goto L_0x03d8
        L_0x0367:
            r.a.g.h$g r11 = new r.a.g.h$g
            r.a.g.c$b r1 = r0.f30955j
            byte[] r1 = r1.mo37916a(r4)
            r2 = r11
            r4 = r6
            r5 = r7
            r6 = r8
            r7 = r1
            r2.<init>(r3, r4, r5, r6, r7)
            goto L_0x03d8
        L_0x0379:
            r.a.g.c$b r1 = r0.f30955j
            java.lang.String r1 = r1.mo37915a()
            int r2 = r1.length()
            if (r2 <= 0) goto L_0x0390
            r.a.g.h$e r11 = new r.a.g.h$e
            r2 = r11
            r4 = r6
            r5 = r7
            r6 = r8
            r7 = r1
            r2.<init>(r3, r4, r5, r6, r7)
            goto L_0x03d8
        L_0x0390:
            t.b.b r1 = f30950l
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "PTR record of class: "
            r2.append(r4)
            r2.append(r6)
            java.lang.String r4 = ", there was a problem reading the service name of the answer for domain:"
            r2.append(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.mo41315c(r2)
            goto L_0x03d7
        L_0x03af:
            r.a.g.h$d r11 = new r.a.g.h$d
            r.a.g.c$b r1 = r0.f30955j
            byte[] r1 = r1.mo37916a(r4)
            r2 = r11
            r4 = r6
            r5 = r7
            r6 = r8
            r7 = r1
            r2.<init>((java.lang.String) r3, (p368r.p369a.p370g.p371s.C11669d) r4, (boolean) r5, (int) r6, (byte[]) r7)
            goto L_0x03d8
        L_0x03c0:
            r.a.g.h$c r11 = new r.a.g.h$c
            r.a.g.c$b r1 = r0.f30955j
            byte[] r1 = r1.mo37916a(r4)
            r2 = r11
            r4 = r6
            r5 = r7
            r6 = r8
            r7 = r1
            r2.<init>((java.lang.String) r3, (p368r.p369a.p370g.p371s.C11669d) r4, (boolean) r5, (int) r6, (byte[]) r7)
            goto L_0x03d8
        L_0x03d1:
            r.a.g.c$b r1 = r0.f30955j
            long r2 = (long) r4
            r1.skip(r2)
        L_0x03d7:
            r11 = 0
        L_0x03d8:
            if (r11 == 0) goto L_0x03df
            r1 = r23
            r11.mo37972a((java.net.InetAddress) r1)
        L_0x03df:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p368r.p369a.p370g.C11604c.m37987a(java.net.InetAddress):r.a.g.h");
    }

    /* renamed from: b */
    private String m37988b(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            byte b2 = b & 255;
            sb.append(f30952n[b2 / 16]);
            sb.append(f30952n[b2 % 16]);
        }
        return sb.toString();
    }

    /* renamed from: w */
    private C11611g m37989w() {
        String a = this.f30955j.mo37915a();
        C11670e a2 = C11670e.m38381a(this.f30955j.mo37920i());
        if (a2 == C11670e.TYPE_IGNORE) {
            C12938b bVar = f30950l;
            bVar.mo41315c("Could not find record type: " + mo37909a(true));
        }
        int i = this.f30955j.mo37920i();
        C11669d b = C11669d.m38378b(i);
        return C11611g.m38039a(a, a2, b, b.mo38194a(i));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo37941p() ? "dns[query," : "dns[response,");
        if (this.f30953h.getAddress() != null) {
            sb.append(this.f30953h.getAddress().getHostAddress());
        }
        sb.append(':');
        sb.append(this.f30953h.getPort());
        sb.append(", length=");
        sb.append(this.f30953h.getLength());
        sb.append(", id=0x");
        sb.append(Integer.toHexString(mo37931f()));
        if (mo37930e() != 0) {
            sb.append(", flags=0x");
            sb.append(Integer.toHexString(mo37930e()));
            if ((mo37930e() & 32768) != 0) {
                sb.append(":r");
            }
            if ((mo37930e() & 1024) != 0) {
                sb.append(":aa");
            }
            if ((mo37930e() & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) {
                sb.append(":tc");
            }
        }
        if (mo37935j() > 0) {
            sb.append(", questions=");
            sb.append(mo37935j());
        }
        if (mo37933h() > 0) {
            sb.append(", answers=");
            sb.append(mo37933h());
        }
        if (mo37934i() > 0) {
            sb.append(", authorities=");
            sb.append(mo37934i());
        }
        if (mo37932g() > 0) {
            sb.append(", additionals=");
            sb.append(mo37932g());
        }
        if (mo37935j() > 0) {
            sb.append("\nquestions:");
            for (C11611g append : this.f30965d) {
                sb.append("\n\t");
                sb.append(append);
            }
        }
        if (mo37933h() > 0) {
            sb.append("\nanswers:");
            for (C11620h append2 : this.f30966e) {
                sb.append("\n\t");
                sb.append(append2);
            }
        }
        if (mo37934i() > 0) {
            sb.append("\nauthorities:");
            for (C11620h append3 : this.f30967f) {
                sb.append("\n\t");
                sb.append(append3);
            }
        }
        if (mo37932g() > 0) {
            sb.append("\nadditionals:");
            for (C11620h append4 : this.f30968g) {
                sb.append("\n\t");
                sb.append(append4);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: u */
    public int mo37913u() {
        return (int) (System.currentTimeMillis() - this.f30954i);
    }

    /* renamed from: v */
    public int mo37914v() {
        return this.f30956k;
    }

    public C11604c clone() {
        C11604c cVar = new C11604c(mo37930e(), mo37931f(), mo37940o(), this.f30953h, this.f30954i);
        cVar.f30956k = this.f30956k;
        cVar.f30965d.addAll(this.f30965d);
        cVar.f30966e.addAll(this.f30966e);
        cVar.f30967f.addAll(this.f30967f);
        cVar.f30968g.addAll(this.f30968g);
        return cVar;
    }

    private C11604c(int i, int i2, boolean z, DatagramPacket datagramPacket, long j) {
        super(i, i2, z);
        this.f30953h = datagramPacket;
        this.f30955j = new C11606b(datagramPacket.getData(), datagramPacket.getLength());
        this.f30954i = j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo37909a(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(mo37945t());
        if (z) {
            int length = this.f30953h.getLength();
            byte[] bArr = new byte[length];
            System.arraycopy(this.f30953h.getData(), 0, bArr, 0, length);
            sb.append(mo37923a(bArr));
        }
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo37910a(C11604c cVar) {
        if (!mo37941p() || !mo37943r() || !cVar.mo37941p()) {
            throw new IllegalArgumentException();
        }
        this.f30965d.addAll(cVar.mo37937l());
        this.f30966e.addAll(cVar.mo37928c());
        this.f30967f.addAll(cVar.mo37929d());
        this.f30968g.addAll(cVar.mo37924a());
    }
}
