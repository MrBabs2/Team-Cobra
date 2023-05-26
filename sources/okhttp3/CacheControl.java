package okhttp3;

import java.util.concurrent.TimeUnit;
import kotlin.C4789l;
import kotlin.jvm.internal.C10202j;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u0000 !2\u00020\u0001:\u0002 !Bq\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012J\r\u0010\u000f\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0015J\r\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u0016J\r\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u0017J\r\u0010\f\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u0018J\r\u0010\n\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0019J\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001aJ\r\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001bJ\r\u0010\u000e\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001cJ\r\u0010\r\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u001dJ\r\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u001eJ\b\u0010\u001f\u001a\u00020\u0011H\u0016R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u000f\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0013R\u0013\u0010\u0005\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0014R\u0013\u0010\u000b\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0014R\u0013\u0010\f\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0014R\u0013\u0010\n\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0013R\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0013R\u0013\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0013R\u0013\u0010\u000e\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0013R\u0013\u0010\r\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0013R\u0013\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0014¨\u0006\""}, mo16641d2 = {"Lokhttp3/CacheControl;", "", "noCache", "", "noStore", "maxAgeSeconds", "", "sMaxAgeSeconds", "isPrivate", "isPublic", "mustRevalidate", "maxStaleSeconds", "minFreshSeconds", "onlyIfCached", "noTransform", "immutable", "headerValue", "", "(ZZIIZZZIIZZZLjava/lang/String;)V", "()Z", "()I", "-deprecated_immutable", "-deprecated_maxAgeSeconds", "-deprecated_maxStaleSeconds", "-deprecated_minFreshSeconds", "-deprecated_mustRevalidate", "-deprecated_noCache", "-deprecated_noStore", "-deprecated_noTransform", "-deprecated_onlyIfCached", "-deprecated_sMaxAgeSeconds", "toString", "Builder", "Companion", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
/* compiled from: CacheControl.kt */
public final class CacheControl {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final CacheControl FORCE_CACHE = new Builder().onlyIfCached().maxStale(Integer.MAX_VALUE, TimeUnit.SECONDS).build();
    public static final CacheControl FORCE_NETWORK = new Builder().noCache().build();
    private String headerValue;
    private final boolean immutable;
    private final boolean isPrivate;
    private final boolean isPublic;
    private final int maxAgeSeconds;
    private final int maxStaleSeconds;
    private final int minFreshSeconds;
    private final boolean mustRevalidate;
    private final boolean noCache;
    private final boolean noStore;
    private final boolean noTransform;
    private final boolean onlyIfCached;
    private final int sMaxAgeSeconds;

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u0003\u001a\u00020\u0000J\u0016\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\t\u001a\u00020\u0000J\u0006\u0010\n\u001a\u00020\u0000J\u0006\u0010\u000b\u001a\u00020\u0000J\u0006\u0010\f\u001a\u00020\u0000J\f\u0010\u0014\u001a\u00020\u0006*\u00020\u0015H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, mo16641d2 = {"Lokhttp3/CacheControl$Builder;", "", "()V", "immutable", "", "maxAgeSeconds", "", "maxStaleSeconds", "minFreshSeconds", "noCache", "noStore", "noTransform", "onlyIfCached", "build", "Lokhttp3/CacheControl;", "maxAge", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "maxStale", "minFresh", "clampToInt", "", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
    /* compiled from: CacheControl.kt */
    public static final class Builder {
        private boolean immutable;
        private int maxAgeSeconds = -1;
        private int maxStaleSeconds = -1;
        private int minFreshSeconds = -1;
        private boolean noCache;
        private boolean noStore;
        private boolean noTransform;
        private boolean onlyIfCached;

        private final int clampToInt(long j) {
            if (j > ((long) Integer.MAX_VALUE)) {
                return Integer.MAX_VALUE;
            }
            return (int) j;
        }

        public final CacheControl build() {
            return new CacheControl(this.noCache, this.noStore, this.maxAgeSeconds, -1, false, false, false, this.maxStaleSeconds, this.minFreshSeconds, this.onlyIfCached, this.noTransform, this.immutable, (String) null, (DefaultConstructorMarker) null);
        }

        public final Builder immutable() {
            this.immutable = true;
            return this;
        }

        public final Builder maxAge(int i, TimeUnit timeUnit) {
            C10202j.m34178b(timeUnit, "timeUnit");
            if (i >= 0) {
                this.maxAgeSeconds = clampToInt(timeUnit.toSeconds((long) i));
                return this;
            }
            throw new IllegalArgumentException(("maxAge < 0: " + i).toString());
        }

        public final Builder maxStale(int i, TimeUnit timeUnit) {
            C10202j.m34178b(timeUnit, "timeUnit");
            if (i >= 0) {
                this.maxStaleSeconds = clampToInt(timeUnit.toSeconds((long) i));
                return this;
            }
            throw new IllegalArgumentException(("maxStale < 0: " + i).toString());
        }

        public final Builder minFresh(int i, TimeUnit timeUnit) {
            C10202j.m34178b(timeUnit, "timeUnit");
            if (i >= 0) {
                this.minFreshSeconds = clampToInt(timeUnit.toSeconds((long) i));
                return this;
            }
            throw new IllegalArgumentException(("minFresh < 0: " + i).toString());
        }

        public final Builder noCache() {
            this.noCache = true;
            return this;
        }

        public final Builder noStore() {
            this.noStore = true;
            return this;
        }

        public final Builder noTransform() {
            this.noTransform = true;
            return this;
        }

        public final Builder onlyIfCached() {
            this.onlyIfCached = true;
            return this;
        }
    }

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u001e\u0010\t\u001a\u00020\n*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\nH\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, mo16641d2 = {"Lokhttp3/CacheControl$Companion;", "", "()V", "FORCE_CACHE", "Lokhttp3/CacheControl;", "FORCE_NETWORK", "parse", "headers", "Lokhttp3/Headers;", "indexOfElement", "", "", "characters", "startIndex", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
    /* compiled from: CacheControl.kt */
    public static final class Companion {
        private Companion() {
        }

        private final int indexOfElement(String str, String str2, int i) {
            int length = str.length();
            while (i < length) {
                if (C12131w.m40082a((CharSequence) str2, str.charAt(i), false, 2, (Object) null)) {
                    return i;
                }
                i++;
            }
            return str.length();
        }

        static /* synthetic */ int indexOfElement$default(Companion companion, String str, String str2, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return companion.indexOfElement(str, str2, i);
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x004a  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x00f4  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x00f8  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final okhttp3.CacheControl parse(okhttp3.Headers r33) {
            /*
                r32 = this;
                r0 = r32
                r1 = r33
                java.lang.String r2 = "headers"
                kotlin.jvm.internal.C10202j.m34178b(r1, r2)
                int r2 = r33.size()
                r6 = 1
                r7 = 0
                r8 = 1
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = -1
                r13 = -1
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = -1
                r18 = -1
                r19 = 0
                r20 = 0
                r21 = 0
            L_0x0023:
                if (r7 >= r2) goto L_0x01ac
                java.lang.String r3 = r1.name(r7)
                java.lang.String r5 = r1.value(r7)
                java.lang.String r4 = "Cache-Control"
                boolean r4 = kotlin.p392j0.C12130v.m40053b(r3, r4, r6)
                if (r4 == 0) goto L_0x003a
                if (r9 == 0) goto L_0x0038
                goto L_0x0042
            L_0x0038:
                r9 = r5
                goto L_0x0043
            L_0x003a:
                java.lang.String r4 = "Pragma"
                boolean r3 = kotlin.p392j0.C12130v.m40053b(r3, r4, r6)
                if (r3 == 0) goto L_0x01a1
            L_0x0042:
                r8 = 0
            L_0x0043:
                r3 = 0
            L_0x0044:
                int r4 = r5.length()
                if (r3 >= r4) goto L_0x019a
                java.lang.String r4 = "=,;"
                int r4 = r0.indexOfElement(r5, r4, r3)
                java.lang.String r6 = "null cannot be cast to non-null type java.lang.String"
                if (r5 == 0) goto L_0x0194
                java.lang.String r3 = r5.substring(r3, r4)
                java.lang.String r1 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
                kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r3, (java.lang.String) r1)
                r29 = r2
                java.lang.String r2 = "null cannot be cast to non-null type kotlin.CharSequence"
                if (r3 == 0) goto L_0x018e
                java.lang.CharSequence r3 = kotlin.p392j0.C12131w.m40115f(r3)
                java.lang.String r3 = r3.toString()
                r30 = r8
                int r8 = r5.length()
                if (r4 == r8) goto L_0x00e5
                char r8 = r5.charAt(r4)
                r31 = r9
                r9 = 44
                if (r8 == r9) goto L_0x00e7
                char r8 = r5.charAt(r4)
                r9 = 59
                if (r8 != r9) goto L_0x0086
                goto L_0x00e7
            L_0x0086:
                int r4 = r4 + 1
                int r4 = okhttp3.internal.Util.indexOfNonWhitespace(r5, r4)
                int r8 = r5.length()
                if (r4 >= r8) goto L_0x00be
                char r8 = r5.charAt(r4)
                r9 = 34
                if (r8 != r9) goto L_0x00be
                int r4 = r4 + 1
                r24 = 34
                r26 = 0
                r27 = 4
                r28 = 0
                r23 = r5
                r25 = r4
                int r2 = kotlin.p392j0.C12131w.m40060a((java.lang.CharSequence) r23, (char) r24, (int) r25, (boolean) r26, (int) r27, (java.lang.Object) r28)
                if (r5 == 0) goto L_0x00b8
                java.lang.String r4 = r5.substring(r4, r2)
                kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r4, (java.lang.String) r1)
                r1 = 1
                int r2 = r2 + r1
                goto L_0x00eb
            L_0x00b8:
                kotlin.TypeCastException r1 = new kotlin.TypeCastException
                r1.<init>(r6)
                throw r1
            L_0x00be:
                java.lang.String r8 = ",;"
                int r8 = r0.indexOfElement(r5, r8, r4)
                if (r5 == 0) goto L_0x00df
                java.lang.String r4 = r5.substring(r4, r8)
                kotlin.jvm.internal.C10202j.m34174a((java.lang.Object) r4, (java.lang.String) r1)
                if (r4 == 0) goto L_0x00d9
                java.lang.CharSequence r1 = kotlin.p392j0.C12131w.m40115f(r4)
                java.lang.String r4 = r1.toString()
                r2 = r8
                goto L_0x00eb
            L_0x00d9:
                kotlin.TypeCastException r1 = new kotlin.TypeCastException
                r1.<init>(r2)
                throw r1
            L_0x00df:
                kotlin.TypeCastException r1 = new kotlin.TypeCastException
                r1.<init>(r6)
                throw r1
            L_0x00e5:
                r31 = r9
            L_0x00e7:
                int r4 = r4 + 1
                r2 = r4
                r4 = 0
            L_0x00eb:
                java.lang.String r1 = "no-cache"
                r6 = 1
                boolean r1 = kotlin.p392j0.C12130v.m40053b(r1, r3, r6)
                if (r1 == 0) goto L_0x00f8
                r1 = -1
                r10 = 1
                goto L_0x0183
            L_0x00f8:
                java.lang.String r1 = "no-store"
                boolean r1 = kotlin.p392j0.C12130v.m40053b(r1, r3, r6)
                if (r1 == 0) goto L_0x0104
                r1 = -1
                r11 = 1
                goto L_0x0183
            L_0x0104:
                java.lang.String r1 = "max-age"
                boolean r1 = kotlin.p392j0.C12130v.m40053b(r1, r3, r6)
                if (r1 == 0) goto L_0x0113
                r1 = -1
                int r12 = okhttp3.internal.Util.toNonNegativeInt(r4, r1)
                goto L_0x0183
            L_0x0113:
                r1 = -1
                java.lang.String r8 = "s-maxage"
                boolean r8 = kotlin.p392j0.C12130v.m40053b(r8, r3, r6)
                if (r8 == 0) goto L_0x0121
                int r13 = okhttp3.internal.Util.toNonNegativeInt(r4, r1)
                goto L_0x0183
            L_0x0121:
                java.lang.String r1 = "private"
                boolean r1 = kotlin.p392j0.C12130v.m40053b(r1, r3, r6)
                if (r1 == 0) goto L_0x012c
                r1 = -1
                r14 = 1
                goto L_0x0183
            L_0x012c:
                java.lang.String r1 = "public"
                boolean r1 = kotlin.p392j0.C12130v.m40053b(r1, r3, r6)
                if (r1 == 0) goto L_0x0137
                r1 = -1
                r15 = 1
                goto L_0x0183
            L_0x0137:
                java.lang.String r1 = "must-revalidate"
                boolean r1 = kotlin.p392j0.C12130v.m40053b(r1, r3, r6)
                if (r1 == 0) goto L_0x0143
                r1 = -1
                r16 = 1
                goto L_0x0183
            L_0x0143:
                java.lang.String r1 = "max-stale"
                boolean r1 = kotlin.p392j0.C12130v.m40053b(r1, r3, r6)
                if (r1 == 0) goto L_0x0154
                r1 = 2147483647(0x7fffffff, float:NaN)
                int r17 = okhttp3.internal.Util.toNonNegativeInt(r4, r1)
                r1 = -1
                goto L_0x0183
            L_0x0154:
                java.lang.String r1 = "min-fresh"
                boolean r1 = kotlin.p392j0.C12130v.m40053b(r1, r3, r6)
                if (r1 == 0) goto L_0x0162
                r1 = -1
                int r18 = okhttp3.internal.Util.toNonNegativeInt(r4, r1)
                goto L_0x0183
            L_0x0162:
                r1 = -1
                java.lang.String r4 = "only-if-cached"
                boolean r4 = kotlin.p392j0.C12130v.m40053b(r4, r3, r6)
                if (r4 == 0) goto L_0x016e
                r19 = 1
                goto L_0x0183
            L_0x016e:
                java.lang.String r4 = "no-transform"
                boolean r4 = kotlin.p392j0.C12130v.m40053b(r4, r3, r6)
                if (r4 == 0) goto L_0x0179
                r20 = 1
                goto L_0x0183
            L_0x0179:
                java.lang.String r4 = "immutable"
                boolean r3 = kotlin.p392j0.C12130v.m40053b(r4, r3, r6)
                if (r3 == 0) goto L_0x0183
                r21 = 1
            L_0x0183:
                r1 = r33
                r3 = r2
                r2 = r29
                r8 = r30
                r9 = r31
                goto L_0x0044
            L_0x018e:
                kotlin.TypeCastException r1 = new kotlin.TypeCastException
                r1.<init>(r2)
                throw r1
            L_0x0194:
                kotlin.TypeCastException r1 = new kotlin.TypeCastException
                r1.<init>(r6)
                throw r1
            L_0x019a:
                r29 = r2
                r30 = r8
                r31 = r9
                goto L_0x01a3
            L_0x01a1:
                r29 = r2
            L_0x01a3:
                r1 = -1
                int r7 = r7 + 1
                r1 = r33
                r2 = r29
                goto L_0x0023
            L_0x01ac:
                if (r8 != 0) goto L_0x01b1
                r22 = 0
                goto L_0x01b3
            L_0x01b1:
                r22 = r9
            L_0x01b3:
                okhttp3.CacheControl r1 = new okhttp3.CacheControl
                r23 = 0
                r9 = r1
                r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.CacheControl.Companion.parse(okhttp3.Headers):okhttp3.CacheControl");
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private CacheControl(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.noCache = z;
        this.noStore = z2;
        this.maxAgeSeconds = i;
        this.sMaxAgeSeconds = i2;
        this.isPrivate = z3;
        this.isPublic = z4;
        this.mustRevalidate = z5;
        this.maxStaleSeconds = i3;
        this.minFreshSeconds = i4;
        this.onlyIfCached = z6;
        this.noTransform = z7;
        this.immutable = z8;
        this.headerValue = str;
    }

    public static final CacheControl parse(Headers headers) {
        return Companion.parse(headers);
    }

    /* renamed from: -deprecated_immutable  reason: not valid java name */
    public final boolean m41985deprecated_immutable() {
        return this.immutable;
    }

    /* renamed from: -deprecated_maxAgeSeconds  reason: not valid java name */
    public final int m41986deprecated_maxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    /* renamed from: -deprecated_maxStaleSeconds  reason: not valid java name */
    public final int m41987deprecated_maxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    /* renamed from: -deprecated_minFreshSeconds  reason: not valid java name */
    public final int m41988deprecated_minFreshSeconds() {
        return this.minFreshSeconds;
    }

    /* renamed from: -deprecated_mustRevalidate  reason: not valid java name */
    public final boolean m41989deprecated_mustRevalidate() {
        return this.mustRevalidate;
    }

    /* renamed from: -deprecated_noCache  reason: not valid java name */
    public final boolean m41990deprecated_noCache() {
        return this.noCache;
    }

    /* renamed from: -deprecated_noStore  reason: not valid java name */
    public final boolean m41991deprecated_noStore() {
        return this.noStore;
    }

    /* renamed from: -deprecated_noTransform  reason: not valid java name */
    public final boolean m41992deprecated_noTransform() {
        return this.noTransform;
    }

    /* renamed from: -deprecated_onlyIfCached  reason: not valid java name */
    public final boolean m41993deprecated_onlyIfCached() {
        return this.onlyIfCached;
    }

    /* renamed from: -deprecated_sMaxAgeSeconds  reason: not valid java name */
    public final int m41994deprecated_sMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    public final boolean immutable() {
        return this.immutable;
    }

    public final boolean isPrivate() {
        return this.isPrivate;
    }

    public final boolean isPublic() {
        return this.isPublic;
    }

    public final int maxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    public final int maxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    public final int minFreshSeconds() {
        return this.minFreshSeconds;
    }

    public final boolean mustRevalidate() {
        return this.mustRevalidate;
    }

    public final boolean noCache() {
        return this.noCache;
    }

    public final boolean noStore() {
        return this.noStore;
    }

    public final boolean noTransform() {
        return this.noTransform;
    }

    public final boolean onlyIfCached() {
        return this.onlyIfCached;
    }

    public final int sMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    public String toString() {
        String str = this.headerValue;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.noCache) {
            sb.append("no-cache, ");
        }
        if (this.noStore) {
            sb.append("no-store, ");
        }
        if (this.maxAgeSeconds != -1) {
            sb.append("max-age=");
            sb.append(this.maxAgeSeconds);
            sb.append(", ");
        }
        if (this.sMaxAgeSeconds != -1) {
            sb.append("s-maxage=");
            sb.append(this.sMaxAgeSeconds);
            sb.append(", ");
        }
        if (this.isPrivate) {
            sb.append("private, ");
        }
        if (this.isPublic) {
            sb.append("public, ");
        }
        if (this.mustRevalidate) {
            sb.append("must-revalidate, ");
        }
        if (this.maxStaleSeconds != -1) {
            sb.append("max-stale=");
            sb.append(this.maxStaleSeconds);
            sb.append(", ");
        }
        if (this.minFreshSeconds != -1) {
            sb.append("min-fresh=");
            sb.append(this.minFreshSeconds);
            sb.append(", ");
        }
        if (this.onlyIfCached) {
            sb.append("only-if-cached, ");
        }
        if (this.noTransform) {
            sb.append("no-transform, ");
        }
        if (this.immutable) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String sb2 = sb.toString();
        C10202j.m34174a((Object) sb2, "StringBuilder().apply(builderAction).toString()");
        this.headerValue = sb2;
        return sb2;
    }

    public /* synthetic */ CacheControl(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, i, i2, z3, z4, z5, i3, i4, z6, z7, z8, str);
    }
}
