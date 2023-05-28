package okhttp3;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.C4789l;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B)\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u0016\u0010\u0006\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0007J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\r\u0010\u0005\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0010J\b\u0010\u0011\u001a\u00020\u0003H\u0016J\r\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0012R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0005\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\bR\u0013\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\b¨\u0006\u0014"}, mo16641d2 = {"Lokhttp3/MediaType;", "", "mediaType", "", "type", "subtype", "charset", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "()Ljava/lang/String;", "Ljava/nio/charset/Charset;", "defaultValue", "equals", "", "other", "hashCode", "", "-deprecated_subtype", "toString", "-deprecated_type", "Companion", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
/* compiled from: MediaType.kt */
public final class MediaType {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final Pattern PARAMETER = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    private static final String QUOTED = "\"([^\"]*)\"";
    private static final String TOKEN = "([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)";
    /* access modifiers changed from: private */
    public static final Pattern TYPE_SUBTYPE = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    private final String charset;
    private final String mediaType;
    private final String subtype;
    private final String type;

    @C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0007¢\u0006\u0002\b\rJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0007¢\u0006\u0002\b\u000fJ\u0011\u0010\u0010\u001a\u00020\u000b*\u00020\u0007H\u0007¢\u0006\u0002\b\nJ\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u000b*\u00020\u0007H\u0007¢\u0006\u0002\b\u000eR\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, mo16641d2 = {"Lokhttp3/MediaType$Companion;", "", "()V", "PARAMETER", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "QUOTED", "", "TOKEN", "TYPE_SUBTYPE", "get", "Lokhttp3/MediaType;", "mediaType", "-deprecated_get", "parse", "-deprecated_parse", "toMediaType", "toMediaTypeOrNull", "okhttp"}, mo16642k = 1, mo16643mv = {1, 1, 15})
    /* compiled from: MediaType.kt */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: -deprecated_get  reason: not valid java name */
        public final MediaType m42049deprecated_get(String str) {
            C10202j.m34178b(str, "mediaType");
            return get(str);
        }

        /* renamed from: -deprecated_parse  reason: not valid java name */
        public final MediaType m42050deprecated_parse(String str) {
            C10202j.m34178b(str, "mediaType");
            return parse(str);
        }

        public final MediaType get(String str) {
            C10202j.m34178b(str, "$this$toMediaType");
            Matcher matcher = MediaType.TYPE_SUBTYPE.matcher(str);
            if (matcher.lookingAt()) {
                String group = matcher.group(1);
                C10202j.m34174a((Object) group, "typeSubtype.group(1)");
                Locale locale = Locale.US;
                C10202j.m34174a((Object) locale, "Locale.US");
                if (group != null) {
                    String lowerCase = group.toLowerCase(locale);
                    C10202j.m34174a((Object) lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    String group2 = matcher.group(2);
                    C10202j.m34174a((Object) group2, "typeSubtype.group(2)");
                    Locale locale2 = Locale.US;
                    C10202j.m34174a((Object) locale2, "Locale.US");
                    if (group2 != null) {
                        String lowerCase2 = group2.toLowerCase(locale2);
                        C10202j.m34174a((Object) lowerCase2, "(this as java.lang.String).toLowerCase(locale)");
                        Matcher matcher2 = MediaType.PARAMETER.matcher(str);
                        int end = matcher.end();
                        String str2 = null;
                        while (end < str.length()) {
                            matcher2.region(end, str.length());
                            if (matcher2.lookingAt()) {
                                String group3 = matcher2.group(1);
                                if (group3 == null || !C12130v.m40053b(group3, "charset", true)) {
                                    end = matcher2.end();
                                } else {
                                    String group4 = matcher2.group(2);
                                    boolean z = false;
                                    if (group4 == null) {
                                        group4 = matcher2.group(3);
                                        C10202j.m34174a((Object) group4, "parameter.group(3)");
                                    } else if (C12130v.m40056c(group4, "'", false, 2, (Object) null) && C12130v.m40052a(group4, "'", false, 2, (Object) null) && group4.length() > 2) {
                                        group4 = group4.substring(1, group4.length() - 1);
                                        C10202j.m34174a((Object) group4, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                    }
                                    if (str2 == null || C12130v.m40053b(group4, str2, true)) {
                                        z = true;
                                    }
                                    if (z) {
                                        str2 = group4;
                                        end = matcher2.end();
                                    } else {
                                        throw new IllegalArgumentException(("Multiple charsets defined: \"" + str2 + "\" and: \"" + group4 + "\" for: \"" + str + '\"').toString());
                                    }
                                }
                            } else {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Parameter is not formatted correctly: \"");
                                String substring = str.substring(end);
                                C10202j.m34174a((Object) substring, "(this as java.lang.String).substring(startIndex)");
                                sb.append(substring);
                                sb.append("\" for: \"");
                                sb.append(str);
                                sb.append('\"');
                                throw new IllegalArgumentException(sb.toString().toString());
                            }
                        }
                        return new MediaType(str, lowerCase, lowerCase2, str2, (DefaultConstructorMarker) null);
                    }
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
            }
            throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
        }

        public final MediaType parse(String str) {
            C10202j.m34178b(str, "$this$toMediaTypeOrNull");
            try {
                return get(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private MediaType(String str, String str2, String str3, String str4) {
        this.mediaType = str;
        this.type = str2;
        this.subtype = str3;
        this.charset = str4;
    }

    public static /* synthetic */ Charset charset$default(MediaType mediaType2, Charset charset2, int i, Object obj) {
        if ((i & 1) != 0) {
            charset2 = null;
        }
        return mediaType2.charset(charset2);
    }

    public static final MediaType get(String str) {
        return Companion.get(str);
    }

    public static final MediaType parse(String str) {
        return Companion.parse(str);
    }

    /* renamed from: -deprecated_subtype  reason: not valid java name */
    public final String m42047deprecated_subtype() {
        return this.subtype;
    }

    /* renamed from: -deprecated_type  reason: not valid java name */
    public final String m42048deprecated_type() {
        return this.type;
    }

    public final Charset charset() {
        return charset$default(this, (Charset) null, 1, (Object) null);
    }

    public final Charset charset(Charset charset2) {
        try {
            return this.charset != null ? Charset.forName(this.charset) : charset2;
        } catch (IllegalArgumentException unused) {
            return charset2;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof MediaType) && C10202j.m34176a((Object) ((MediaType) obj).mediaType, (Object) this.mediaType);
    }

    public int hashCode() {
        return this.mediaType.hashCode();
    }

    public final String subtype() {
        return this.subtype;
    }

    public String toString() {
        return this.mediaType;
    }

    public final String type() {
        return this.type;
    }

    public /* synthetic */ MediaType(String str, String str2, String str3, String str4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4);
    }
}
