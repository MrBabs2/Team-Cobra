package okhttp3.internal.publicsuffix;

import java.net.IDN;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;
import kotlin.p215c0.p216c.C9113l;
import okhttp3.internal.Util;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\fJ\b\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\u0016\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, mo16641d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "", "()V", "listRead", "Ljava/util/concurrent/atomic/AtomicBoolean;", "publicSuffixExceptionListBytes", "", "publicSuffixListBytes", "readCompleteLatch", "Ljava/util/concurrent/CountDownLatch;", "findMatchingRule", "", "", "domainLabels", "getEffectiveTldPlusOne", "domain", "readTheList", "", "readTheListUninterruptibly", "setListBytes", "Companion", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
/* compiled from: PublicSuffixDatabase.kt */
public final class PublicSuffixDatabase {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final char EXCEPTION_MARKER = '!';
    private static final List<String> PREVAILING_RULE = C10527n.m35729a("*");
    public static final String PUBLIC_SUFFIX_RESOURCE = "publicsuffixes.gz";
    private static final byte[] WILDCARD_LABEL = {(byte) 42};
    /* access modifiers changed from: private */
    public static final PublicSuffixDatabase instance = new PublicSuffixDatabase();
    private final AtomicBoolean listRead = new AtomicBoolean(false);
    private byte[] publicSuffixExceptionListBytes;
    /* access modifiers changed from: private */
    public byte[] publicSuffixListBytes;
    private final CountDownLatch readCompleteLatch = new CountDownLatch(1);

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\fJ)\u0010\u000e\u001a\u0004\u0018\u00010\u0007*\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, mo16641d2 = {"Lokhttp3/internal/publicsuffix/PublicSuffixDatabase$Companion;", "", "()V", "EXCEPTION_MARKER", "", "PREVAILING_RULE", "", "", "PUBLIC_SUFFIX_RESOURCE", "WILDCARD_LABEL", "", "instance", "Lokhttp3/internal/publicsuffix/PublicSuffixDatabase;", "get", "binarySearch", "labels", "", "labelIndex", "", "([B[[BI)Ljava/lang/String;", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
    /* compiled from: PublicSuffixDatabase.kt */
    public static final class Companion {
        private Companion() {
        }

        /* access modifiers changed from: private */
        public final String binarySearch(byte[] bArr, byte[][] bArr2, int i) {
            int i2;
            boolean z;
            int i3;
            int and;
            byte[] bArr3 = bArr;
            byte[][] bArr4 = bArr2;
            int length = bArr3.length;
            int i4 = 0;
            while (i4 < length) {
                int i5 = (i4 + length) / 2;
                while (i5 > -1 && bArr3[i5] != ((byte) 10)) {
                    i5--;
                }
                int i6 = i5 + 1;
                int i7 = 1;
                while (true) {
                    i2 = i6 + i7;
                    if (bArr3[i2] == ((byte) 10)) {
                        break;
                    }
                    i7++;
                }
                int i8 = i2 - i6;
                int i9 = i;
                boolean z2 = false;
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (z2) {
                        i3 = 46;
                        z = false;
                    } else {
                        z = z2;
                        i3 = Util.and(bArr4[i9][i10], 255);
                    }
                    and = i3 - Util.and(bArr3[i6 + i11], 255);
                    if (and == 0) {
                        i11++;
                        i10++;
                        if (i11 == i8) {
                            break;
                        } else if (bArr4[i9].length != i10) {
                            z2 = z;
                        } else if (i9 == bArr4.length - 1) {
                            break;
                        } else {
                            i9++;
                            z2 = true;
                            i10 = -1;
                        }
                    } else {
                        break;
                    }
                }
                if (and >= 0) {
                    if (and <= 0) {
                        int i12 = i8 - i11;
                        int length2 = bArr4[i9].length - i10;
                        int length3 = bArr4.length;
                        for (int i13 = i9 + 1; i13 < length3; i13++) {
                            length2 += bArr4[i13].length;
                        }
                        if (length2 >= i12) {
                            if (length2 <= i12) {
                                Charset charset = StandardCharsets.UTF_8;
                                C10202j.m34174a((Object) charset, "UTF_8");
                                return new String(bArr3, i6, i8, charset);
                            }
                        }
                    }
                    i4 = i2 + 1;
                }
                length = i6 - 1;
            }
            return null;
        }

        public final PublicSuffixDatabase get() {
            return PublicSuffixDatabase.instance;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final /* synthetic */ byte[] access$getPublicSuffixListBytes$p(PublicSuffixDatabase publicSuffixDatabase) {
        byte[] bArr = publicSuffixDatabase.publicSuffixListBytes;
        if (bArr != null) {
            return bArr;
        }
        C10202j.m34181d("publicSuffixListBytes");
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00df  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List<java.lang.String> findMatchingRule(java.util.List<java.lang.String> r18) {
        /*
            r17 = this;
            r0 = r17
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.listRead
            boolean r1 = r1.get()
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x0018
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.listRead
            boolean r1 = r1.compareAndSet(r2, r3)
            if (r1 == 0) goto L_0x0018
            r17.readTheListUninterruptibly()
            goto L_0x0025
        L_0x0018:
            java.util.concurrent.CountDownLatch r1 = r0.readCompleteLatch     // Catch:{ InterruptedException -> 0x001e }
            r1.await()     // Catch:{ InterruptedException -> 0x001e }
            goto L_0x0025
        L_0x001e:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L_0x0025:
            byte[] r1 = r0.publicSuffixListBytes
            if (r1 == 0) goto L_0x002b
            r1 = 1
            goto L_0x002c
        L_0x002b:
            r1 = 0
        L_0x002c:
            if (r1 == 0) goto L_0x0121
            int r1 = r18.size()
            byte[][] r4 = new byte[r1][]
            r5 = 0
        L_0x0035:
            if (r5 >= r1) goto L_0x005e
            r6 = r18
            java.lang.Object r7 = r6.get(r5)
            java.lang.String r7 = (java.lang.String) r7
            java.nio.charset.Charset r8 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r9 = "UTF_8"
            kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r8, (java.lang.String) r9)
            if (r7 == 0) goto L_0x0056
            byte[] r7 = r7.getBytes(r8)
            java.lang.String r8 = "(this as java.lang.String).getBytes(charset)"
            kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r7, (java.lang.String) r8)
            r4[r5] = r7
            int r5 = r5 + 1
            goto L_0x0035
        L_0x0056:
            kotlin.TypeCastException r1 = new kotlin.TypeCastException
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.String"
            r1.<init>(r2)
            throw r1
        L_0x005e:
            r5 = 0
        L_0x005f:
            java.lang.String r6 = "publicSuffixListBytes"
            r7 = 0
            if (r5 >= r1) goto L_0x0078
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$Companion r8 = Companion
            byte[] r9 = r0.publicSuffixListBytes
            if (r9 == 0) goto L_0x0074
            java.lang.String r8 = r8.binarySearch(r9, r4, r5)
            if (r8 == 0) goto L_0x0071
            goto L_0x0079
        L_0x0071:
            int r5 = r5 + 1
            goto L_0x005f
        L_0x0074:
            kotlin.jvm.internal.C10202j.m34181d(r6)
            throw r7
        L_0x0078:
            r8 = r7
        L_0x0079:
            if (r1 <= r3) goto L_0x009f
            java.lang.Object r5 = r4.clone()
            byte[][] r5 = (byte[][]) r5
            int r9 = r5.length
            int r9 = r9 - r3
            r10 = 0
        L_0x0084:
            if (r10 >= r9) goto L_0x009f
            byte[] r11 = WILDCARD_LABEL
            r5[r10] = r11
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$Companion r11 = Companion
            byte[] r12 = r0.publicSuffixListBytes
            if (r12 == 0) goto L_0x009b
            java.lang.String r11 = r11.binarySearch(r12, r5, r10)
            if (r11 == 0) goto L_0x0098
            r5 = r11
            goto L_0x00a0
        L_0x0098:
            int r10 = r10 + 1
            goto L_0x0084
        L_0x009b:
            kotlin.jvm.internal.C10202j.m34181d(r6)
            throw r7
        L_0x009f:
            r5 = r7
        L_0x00a0:
            if (r5 == 0) goto L_0x00bd
            int r1 = r1 - r3
            r6 = 0
        L_0x00a4:
            if (r6 >= r1) goto L_0x00bd
            okhttp3.internal.publicsuffix.PublicSuffixDatabase$Companion r9 = Companion
            byte[] r10 = r0.publicSuffixExceptionListBytes
            if (r10 == 0) goto L_0x00b7
            java.lang.String r9 = r9.binarySearch(r10, r4, r6)
            if (r9 == 0) goto L_0x00b4
            r7 = r9
            goto L_0x00bd
        L_0x00b4:
            int r6 = r6 + 1
            goto L_0x00a4
        L_0x00b7:
            java.lang.String r1 = "publicSuffixExceptionListBytes"
            kotlin.jvm.internal.C10202j.m34181d(r1)
            throw r7
        L_0x00bd:
            r1 = 46
            if (r7 == 0) goto L_0x00df
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r5 = 33
            r4.append(r5)
            r4.append(r7)
            java.lang.String r8 = r4.toString()
            char[] r9 = new char[r3]
            r9[r2] = r1
            r10 = 0
            r11 = 0
            r12 = 6
            r13 = 0
            java.util.List r1 = kotlin.p392j0.C12131w.m40073a((java.lang.CharSequence) r8, (char[]) r9, (boolean) r10, (int) r11, (int) r12, (java.lang.Object) r13)
            return r1
        L_0x00df:
            if (r8 != 0) goto L_0x00e6
            if (r5 != 0) goto L_0x00e6
            java.util.List<java.lang.String> r1 = PREVAILING_RULE
            return r1
        L_0x00e6:
            if (r8 == 0) goto L_0x00f9
            char[] r7 = new char[r3]
            r7[r2] = r1
            r4 = 0
            r9 = 0
            r10 = 6
            r11 = 0
            r6 = r8
            r8 = r4
            java.util.List r4 = kotlin.p392j0.C12131w.m40073a((java.lang.CharSequence) r6, (char[]) r7, (boolean) r8, (int) r9, (int) r10, (java.lang.Object) r11)
            if (r4 == 0) goto L_0x00f9
            goto L_0x00fd
        L_0x00f9:
            java.util.List r4 = kotlin.p262y.C10529o.m35736a()
        L_0x00fd:
            if (r5 == 0) goto L_0x0110
            char[] r12 = new char[r3]
            r12[r2] = r1
            r13 = 0
            r14 = 0
            r15 = 6
            r16 = 0
            r11 = r5
            java.util.List r1 = kotlin.p392j0.C12131w.m40073a((java.lang.CharSequence) r11, (char[]) r12, (boolean) r13, (int) r14, (int) r15, (java.lang.Object) r16)
            if (r1 == 0) goto L_0x0110
            goto L_0x0114
        L_0x0110:
            java.util.List r1 = kotlin.p262y.C10529o.m35736a()
        L_0x0114:
            int r2 = r4.size()
            int r3 = r1.size()
            if (r2 <= r3) goto L_0x011f
            goto L_0x0120
        L_0x011f:
            r4 = r1
        L_0x0120:
            return r4
        L_0x0121:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Unable to load publicsuffixes.gz resource from the classpath."
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            goto L_0x012e
        L_0x012d:
            throw r1
        L_0x012e:
            goto L_0x012d
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.findMatchingRule(java.util.List):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004f, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0050, code lost:
        kotlin.p257io.C10182a.m34136a(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0053, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void readTheList() throws java.io.IOException {
        /*
            r4 = this;
            java.lang.Class<okhttp3.internal.publicsuffix.PublicSuffixDatabase> r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.class
            java.lang.String r1 = "publicsuffixes.gz"
            java.io.InputStream r0 = r0.getResourceAsStream(r1)
            if (r0 == 0) goto L_0x0054
            s.m r1 = new s.m
            s.a0 r0 = p413s.C12919p.m41673a((java.io.InputStream) r0)
            r1.<init>(r0)
            s.h r0 = p413s.C12919p.m41675a((p413s.C12892a0) r1)
            int r1 = r0.readInt()     // Catch:{ all -> 0x004d }
            long r1 = (long) r1     // Catch:{ all -> 0x004d }
            byte[] r1 = r0.mo41165e(r1)     // Catch:{ all -> 0x004d }
            int r2 = r0.readInt()     // Catch:{ all -> 0x004d }
            long r2 = (long) r2     // Catch:{ all -> 0x004d }
            byte[] r2 = r0.mo41165e(r2)     // Catch:{ all -> 0x004d }
            kotlin.v r3 = kotlin.C10483v.f28357a     // Catch:{ all -> 0x004d }
            r3 = 0
            kotlin.p257io.C10182a.m34136a(r0, r3)
            monitor-enter(r4)
            if (r1 == 0) goto L_0x0047
            r4.publicSuffixListBytes = r1     // Catch:{ all -> 0x0045 }
            if (r2 == 0) goto L_0x0041
            r4.publicSuffixExceptionListBytes = r2     // Catch:{ all -> 0x0045 }
            kotlin.v r0 = kotlin.C10483v.f28357a     // Catch:{ all -> 0x0045 }
            monitor-exit(r4)
            java.util.concurrent.CountDownLatch r0 = r4.readCompleteLatch
            r0.countDown()
            return
        L_0x0041:
            kotlin.jvm.internal.C10202j.m34172a()     // Catch:{ all -> 0x0045 }
            throw r3
        L_0x0045:
            r0 = move-exception
            goto L_0x004b
        L_0x0047:
            kotlin.jvm.internal.C10202j.m34172a()     // Catch:{ all -> 0x0045 }
            throw r3
        L_0x004b:
            monitor-exit(r4)
            throw r0
        L_0x004d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004f }
        L_0x004f:
            r2 = move-exception
            kotlin.p257io.C10182a.m34136a(r0, r1)
            throw r2
        L_0x0054:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.readTheList():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0027 */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void readTheListUninterruptibly() {
        /*
            r5 = this;
            r0 = 0
        L_0x0001:
            r5.readTheList()     // Catch:{  }
            if (r0 == 0) goto L_0x000d
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ InterruptedIOException -> 0x0027, IOException -> 0x0010 }
            r1.interrupt()     // Catch:{ InterruptedIOException -> 0x0027, IOException -> 0x0010 }
        L_0x000d:
            return
        L_0x000e:
            r1 = move-exception
            goto L_0x002c
        L_0x0010:
            r1 = move-exception
            okhttp3.internal.platform.Platform$Companion r2 = okhttp3.internal.platform.Platform.Companion     // Catch:{ all -> 0x000e }
            okhttp3.internal.platform.Platform r2 = r2.get()     // Catch:{ all -> 0x000e }
            r3 = 5
            java.lang.String r4 = "Failed to read public suffix list"
            r2.log(r3, r4, r1)     // Catch:{ all -> 0x000e }
            if (r0 == 0) goto L_0x0026
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0026:
            return
        L_0x0027:
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x000e }
            r0 = 1
            goto L_0x0001
        L_0x002c:
            if (r0 == 0) goto L_0x0035
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0035:
            goto L_0x0037
        L_0x0036:
            throw r1
        L_0x0037:
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.readTheListUninterruptibly():void");
    }

    public final String getEffectiveTldPlusOne(String str) {
        int i;
        int i2;
        C10202j.m34178b(str, "domain");
        String unicode = IDN.toUnicode(str);
        C10202j.m34174a((Object) unicode, "unicodeDomain");
        List a = C12131w.m40073a((CharSequence) unicode, new char[]{'.'}, false, 0, 6, (Object) null);
        List<String> findMatchingRule = findMatchingRule(a);
        if (a.size() == findMatchingRule.size() && findMatchingRule.get(0).charAt(0) != '!') {
            return null;
        }
        if (findMatchingRule.get(0).charAt(0) == '!') {
            i2 = a.size();
            i = findMatchingRule.size();
        } else {
            i2 = a.size();
            i = findMatchingRule.size() + 1;
        }
        return C12090n.m39916a(C12090n.m39918a(C10539w.m35782b(C12131w.m40073a((CharSequence) str, new char[]{'.'}, false, 0, 6, (Object) null)), i2 - i), ".", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C9113l) null, 62, (Object) null);
    }

    public final void setListBytes(byte[] bArr, byte[] bArr2) {
        C10202j.m34178b(bArr, "publicSuffixListBytes");
        C10202j.m34178b(bArr2, "publicSuffixExceptionListBytes");
        this.publicSuffixListBytes = bArr;
        this.publicSuffixExceptionListBytes = bArr2;
        this.listRead.set(true);
        this.readCompleteLatch.countDown();
    }
}
