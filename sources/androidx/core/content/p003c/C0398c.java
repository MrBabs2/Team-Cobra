package androidx.core.content.p003c;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p050l.p075h.C4948d;
import p050l.p075h.p081i.C4970a;

/* renamed from: androidx.core.content.c.c */
/* compiled from: FontResourcesParserCompat */
public class C0398c {

    /* renamed from: androidx.core.content.c.c$a */
    /* compiled from: FontResourcesParserCompat */
    public interface C0399a {
    }

    /* renamed from: androidx.core.content.c.c$b */
    /* compiled from: FontResourcesParserCompat */
    public static final class C0400b implements C0399a {

        /* renamed from: a */
        private final C0401c[] f1778a;

        public C0400b(C0401c[] cVarArr) {
            this.f1778a = cVarArr;
        }

        /* renamed from: a */
        public C0401c[] mo2305a() {
            return this.f1778a;
        }
    }

    /* renamed from: androidx.core.content.c.c$c */
    /* compiled from: FontResourcesParserCompat */
    public static final class C0401c {

        /* renamed from: a */
        private final String f1779a;

        /* renamed from: b */
        private int f1780b;

        /* renamed from: c */
        private boolean f1781c;

        /* renamed from: d */
        private String f1782d;

        /* renamed from: e */
        private int f1783e;

        /* renamed from: f */
        private int f1784f;

        public C0401c(String str, int i, boolean z, String str2, int i2, int i3) {
            this.f1779a = str;
            this.f1780b = i;
            this.f1781c = z;
            this.f1782d = str2;
            this.f1783e = i2;
            this.f1784f = i3;
        }

        /* renamed from: a */
        public String mo2306a() {
            return this.f1779a;
        }

        /* renamed from: b */
        public int mo2307b() {
            return this.f1784f;
        }

        /* renamed from: c */
        public int mo2308c() {
            return this.f1783e;
        }

        /* renamed from: d */
        public String mo2309d() {
            return this.f1782d;
        }

        /* renamed from: e */
        public int mo2310e() {
            return this.f1780b;
        }

        /* renamed from: f */
        public boolean mo2311f() {
            return this.f1781c;
        }
    }

    /* renamed from: androidx.core.content.c.c$d */
    /* compiled from: FontResourcesParserCompat */
    public static final class C0402d implements C0399a {

        /* renamed from: a */
        private final C4970a f1785a;

        /* renamed from: b */
        private final int f1786b;

        /* renamed from: c */
        private final int f1787c;

        public C0402d(C4970a aVar, int i, int i2) {
            this.f1785a = aVar;
            this.f1787c = i;
            this.f1786b = i2;
        }

        /* renamed from: a */
        public int mo2312a() {
            return this.f1787c;
        }

        /* renamed from: b */
        public C4970a mo2313b() {
            return this.f1785a;
        }

        /* renamed from: c */
        public int mo2314c() {
            return this.f1786b;
        }
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: a */
    public static androidx.core.content.p003c.C0398c.C0399a m1939a(org.xmlpull.v1.XmlPullParser r3, android.content.res.Resources r4) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
        L_0x0000:
            int r0 = r3.next()
            r1 = 2
            if (r0 == r1) goto L_0x000b
            r2 = 1
            if (r0 == r2) goto L_0x000b
            goto L_0x0000
        L_0x000b:
            if (r0 != r1) goto L_0x0012
            androidx.core.content.c.c$a r3 = m1943b(r3, r4)
            return r3
        L_0x0012:
            org.xmlpull.v1.XmlPullParserException r3 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r4 = "No start tag found"
            r3.<init>(r4)
            goto L_0x001b
        L_0x001a:
            throw r3
        L_0x001b:
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.p003c.C0398c.m1939a(org.xmlpull.v1.XmlPullParser, android.content.res.Resources):androidx.core.content.c.c$a");
    }

    /* renamed from: b */
    private static C0399a m1943b(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, (String) null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return m1944c(xmlPullParser, resources);
        }
        m1942a(xmlPullParser);
        return null;
    }

    /* renamed from: c */
    private static C0399a m1944c(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C4948d.FontFamily);
        String string = obtainAttributes.getString(C4948d.FontFamily_fontProviderAuthority);
        String string2 = obtainAttributes.getString(C4948d.FontFamily_fontProviderPackage);
        String string3 = obtainAttributes.getString(C4948d.FontFamily_fontProviderQuery);
        int resourceId = obtainAttributes.getResourceId(C4948d.FontFamily_fontProviderCerts, 0);
        int integer = obtainAttributes.getInteger(C4948d.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = obtainAttributes.getInteger(C4948d.FontFamily_fontProviderFetchTimeout, 500);
        obtainAttributes.recycle();
        if (string == null || string2 == null || string3 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(m1945d(xmlPullParser, resources));
                    } else {
                        m1942a(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new C0400b((C0401c[]) arrayList.toArray(new C0401c[arrayList.size()]));
        }
        while (xmlPullParser.next() != 3) {
            m1942a(xmlPullParser);
        }
        return new C0402d(new C4970a(string, string2, string3, m1940a(resources, resourceId)), integer, integer2);
    }

    /* renamed from: d */
    private static C0401c m1945d(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C4948d.FontFamilyFont);
        if (obtainAttributes.hasValue(C4948d.FontFamilyFont_fontWeight)) {
            i = C4948d.FontFamilyFont_fontWeight;
        } else {
            i = C4948d.FontFamilyFont_android_fontWeight;
        }
        int i6 = obtainAttributes.getInt(i, 400);
        if (obtainAttributes.hasValue(C4948d.FontFamilyFont_fontStyle)) {
            i2 = C4948d.FontFamilyFont_fontStyle;
        } else {
            i2 = C4948d.FontFamilyFont_android_fontStyle;
        }
        boolean z = 1 == obtainAttributes.getInt(i2, 0);
        if (obtainAttributes.hasValue(C4948d.FontFamilyFont_ttcIndex)) {
            i3 = C4948d.FontFamilyFont_ttcIndex;
        } else {
            i3 = C4948d.FontFamilyFont_android_ttcIndex;
        }
        if (obtainAttributes.hasValue(C4948d.FontFamilyFont_fontVariationSettings)) {
            i4 = C4948d.FontFamilyFont_fontVariationSettings;
        } else {
            i4 = C4948d.FontFamilyFont_android_fontVariationSettings;
        }
        String string = obtainAttributes.getString(i4);
        int i7 = obtainAttributes.getInt(i3, 0);
        if (obtainAttributes.hasValue(C4948d.FontFamilyFont_font)) {
            i5 = C4948d.FontFamilyFont_font;
        } else {
            i5 = C4948d.FontFamilyFont_android_font;
        }
        int resourceId = obtainAttributes.getResourceId(i5, 0);
        String string2 = obtainAttributes.getString(i5);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            m1942a(xmlPullParser);
        }
        return new C0401c(string2, i6, z, string, i7, resourceId);
    }

    /* renamed from: a */
    private static int m1938a(TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 21) {
            return typedArray.getType(i);
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i, typedValue);
        return typedValue.type;
    }

    /* renamed from: a */
    public static List<List<byte[]>> m1940a(Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (m1938a(obtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(m1941a(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(m1941a(resources.getStringArray(i)));
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    /* renamed from: a */
    private static List<byte[]> m1941a(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String decode : strArr) {
            arrayList.add(Base64.decode(decode, 0));
        }
        return arrayList;
    }

    /* renamed from: a */
    private static void m1942a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }
}
