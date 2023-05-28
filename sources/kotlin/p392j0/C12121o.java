package kotlin.p392j0;

import java.util.ArrayList;
import java.util.List;
import kotlin.C4789l;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;
import kotlin.jvm.internal.C10203k;
import kotlin.p215c0.p216c.C9113l;
import kotlin.p262y.C10525m;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000b\u001a!\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0002\b\u0004\u001a\u0011\u0010\u0005\u001a\u00020\u0006*\u00020\u0002H\u0002¢\u0006\u0002\b\u0007\u001a\u0014\u0010\b\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u001aJ\u0010\t\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001H\b¢\u0006\u0002\b\u000e\u001a\u0014\u0010\u000f\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u001a\u001e\u0010\u0011\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u001a\n\u0010\u0013\u001a\u00020\u0002*\u00020\u0002\u001a\u0014\u0010\u0014\u001a\u00020\u0002*\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0002¨\u0006\u0015"}, mo16641d2 = {"getIndentFunction", "Lkotlin/Function1;", "", "indent", "getIndentFunction$StringsKt__IndentKt", "indentWidth", "", "indentWidth$StringsKt__IndentKt", "prependIndent", "reindent", "", "resultSizeEstimate", "indentAddFunction", "indentCutFunction", "reindent$StringsKt__IndentKt", "replaceIndent", "newIndent", "replaceIndentByMargin", "marginPrefix", "trimIndent", "trimMargin", "kotlin-stdlib"}, mo16642k = 5, mo16643mv = {1, 1, 16}, mo16645xi = 1, mo16646xs = "kotlin/text/StringsKt")
/* renamed from: kotlin.j0.o */
/* compiled from: Indent.kt */
class C12121o extends C12120n {

    /* renamed from: kotlin.j0.o$a */
    /* compiled from: Indent.kt */
    static final class C12122a extends C10203k implements C9113l<String, String> {

        /* renamed from: f */
        public static final C12122a f31892f = new C12122a();

        C12122a() {
            super(1);
        }

        /* renamed from: a */
        public final String mo38746a(String str) {
            C10202j.m34178b(str, "line");
            return str;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            String str = (String) obj;
            mo38746a(str);
            return str;
        }
    }

    /* renamed from: kotlin.j0.o$b */
    /* compiled from: Indent.kt */
    static final class C12123b extends C10203k implements C9113l<String, String> {

        /* renamed from: f */
        final /* synthetic */ String f31893f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C12123b(String str) {
            super(1);
            this.f31893f = str;
        }

        /* renamed from: a */
        public final String invoke(String str) {
            C10202j.m34178b(str, "line");
            return this.f31893f + str;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ String m40026a(String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str2 = "|";
        }
        return m40025a(str, str2);
    }

    /* renamed from: a */
    public static final String m40025a(String str, String str2) {
        C10202j.m34178b(str, "$this$trimMargin");
        C10202j.m34178b(str2, "marginPrefix");
        return m40027a(str, "", str2);
    }

    /* renamed from: a */
    public static final String m40027a(String str, String str2, String str3) {
        int i;
        C10202j.m34178b(str, "$this$replaceIndentByMargin");
        C10202j.m34178b(str2, "newIndent");
        C10202j.m34178b(str3, "marginPrefix");
        if (!C12130v.m40047a((CharSequence) str3)) {
            List<String> e = C12131w.m40114e(str);
            int length = str.length() + (str2.length() * e.size());
            C9113l<String, String> a = m40028a(str2);
            int a2 = C10529o.m35732a(e);
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            for (T next : e) {
                int i3 = i2 + 1;
                String str4 = null;
                if (i2 >= 0) {
                    String str5 = (String) next;
                    if (!(i2 == 0 || i2 == a2) || !C12130v.m40047a((CharSequence) str5)) {
                        int length2 = str5.length();
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length2) {
                                i = -1;
                                break;
                            } else if (!C12098a.m39942a(str5.charAt(i4))) {
                                i = i4;
                                break;
                            } else {
                                i4++;
                            }
                        }
                        if (i != -1) {
                            int i5 = i;
                            if (C12130v.m40050a(str5, str3, i, false, 4, (Object) null)) {
                                int length3 = i5 + str3.length();
                                if (str5 != null) {
                                    str4 = str5.substring(length3);
                                    C10202j.m34174a((Object) str4, "(this as java.lang.String).substring(startIndex)");
                                } else {
                                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                                }
                            }
                        }
                        if (str4 == null || (str4 = a.invoke(str4)) == null) {
                            str4 = str5;
                        }
                    }
                    if (str4 != null) {
                        arrayList.add(str4);
                    }
                    i2 = i3;
                } else {
                    C10525m.m35693c();
                    throw null;
                }
            }
            StringBuilder sb = new StringBuilder(length);
            Appendable unused = C10539w.m35771a(arrayList, sb, "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C9113l) null, 124, (Object) null);
            String sb2 = sb.toString();
            C10202j.m34174a((Object) sb2, "mapIndexedNotNull { inde…\"\\n\")\n        .toString()");
            return sb2;
        }
        throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
    }

    /* renamed from: a */
    private static final C9113l<String, String> m40028a(String str) {
        if (str.length() == 0) {
            return C12122a.f31892f;
        }
        return new C12123b(str);
    }
}
