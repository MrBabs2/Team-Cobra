package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.InflateException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.preference.i */
/* compiled from: PreferenceInflater */
class C0599i {

    /* renamed from: e */
    private static final Class<?>[] f2379e = {Context.class, AttributeSet.class};

    /* renamed from: f */
    private static final HashMap<String, Constructor> f2380f = new HashMap<>();

    /* renamed from: a */
    private final Context f2381a;

    /* renamed from: b */
    private final Object[] f2382b = new Object[2];

    /* renamed from: c */
    private C0600j f2383c;

    /* renamed from: d */
    private String[] f2384d;

    public C0599i(Context context, C0600j jVar) {
        this.f2381a = context;
        m2904a(jVar);
    }

    /* renamed from: a */
    private void m2904a(C0600j jVar) {
        this.f2383c = jVar;
        mo3357a(new String[]{Preference.class.getPackage().getName() + ".", SwitchPreference.class.getPackage().getName() + "."});
    }

    /* renamed from: b */
    private Preference m2907b(String str, AttributeSet attributeSet) {
        try {
            if (-1 == str.indexOf(46)) {
                return mo3355a(str, attributeSet);
            }
            return m2902a(str, (String[]) null, attributeSet);
        } catch (InflateException e) {
            throw e;
        } catch (ClassNotFoundException e2) {
            InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class (not found)" + str);
            inflateException.initCause(e2);
            throw inflateException;
        } catch (Exception e3) {
            InflateException inflateException2 = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
            inflateException2.initCause(e3);
            throw inflateException2;
        }
    }

    /* renamed from: a */
    public void mo3357a(String[] strArr) {
        this.f2384d = strArr;
    }

    /* renamed from: a */
    public Context mo3353a() {
        return this.f2381a;
    }

    /* renamed from: a */
    public Preference mo3354a(int i, PreferenceGroup preferenceGroup) {
        XmlResourceParser xml = mo3353a().getResources().getXml(i);
        try {
            return mo3356a((XmlPullParser) xml, preferenceGroup);
        } finally {
            xml.close();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001a A[Catch:{ InflateException -> 0x007c, XmlPullParserException -> 0x006e, IOException -> 0x0048 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002d A[SYNTHETIC, Splitter:B:14:0x002d] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.preference.Preference mo3356a(org.xmlpull.v1.XmlPullParser r6, androidx.preference.PreferenceGroup r7) {
        /*
            r5 = this;
            java.lang.Object[] r0 = r5.f2382b
            monitor-enter(r0)
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r6)     // Catch:{ all -> 0x007e }
            java.lang.Object[] r2 = r5.f2382b     // Catch:{ all -> 0x007e }
            r3 = 0
            android.content.Context r4 = r5.f2381a     // Catch:{ all -> 0x007e }
            r2[r3] = r4     // Catch:{ all -> 0x007e }
        L_0x000e:
            int r2 = r6.next()     // Catch:{ InflateException -> 0x007c, XmlPullParserException -> 0x006e, IOException -> 0x0048 }
            r3 = 2
            if (r2 == r3) goto L_0x0018
            r4 = 1
            if (r2 != r4) goto L_0x000e
        L_0x0018:
            if (r2 != r3) goto L_0x002d
            java.lang.String r2 = r6.getName()     // Catch:{ InflateException -> 0x007c, XmlPullParserException -> 0x006e, IOException -> 0x0048 }
            androidx.preference.Preference r2 = r5.m2907b(r2, r1)     // Catch:{ InflateException -> 0x007c, XmlPullParserException -> 0x006e, IOException -> 0x0048 }
            androidx.preference.PreferenceGroup r2 = (androidx.preference.PreferenceGroup) r2     // Catch:{ InflateException -> 0x007c, XmlPullParserException -> 0x006e, IOException -> 0x0048 }
            androidx.preference.PreferenceGroup r7 = r5.m2903a((androidx.preference.PreferenceGroup) r7, (androidx.preference.PreferenceGroup) r2)     // Catch:{ InflateException -> 0x007c, XmlPullParserException -> 0x006e, IOException -> 0x0048 }
            r5.m2906a((org.xmlpull.v1.XmlPullParser) r6, (androidx.preference.Preference) r7, (android.util.AttributeSet) r1)     // Catch:{ InflateException -> 0x007c, XmlPullParserException -> 0x006e, IOException -> 0x0048 }
            monitor-exit(r0)     // Catch:{ all -> 0x007e }
            return r7
        L_0x002d:
            android.view.InflateException r7 = new android.view.InflateException     // Catch:{ InflateException -> 0x007c, XmlPullParserException -> 0x006e, IOException -> 0x0048 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ InflateException -> 0x007c, XmlPullParserException -> 0x006e, IOException -> 0x0048 }
            r1.<init>()     // Catch:{ InflateException -> 0x007c, XmlPullParserException -> 0x006e, IOException -> 0x0048 }
            java.lang.String r2 = r6.getPositionDescription()     // Catch:{ InflateException -> 0x007c, XmlPullParserException -> 0x006e, IOException -> 0x0048 }
            r1.append(r2)     // Catch:{ InflateException -> 0x007c, XmlPullParserException -> 0x006e, IOException -> 0x0048 }
            java.lang.String r2 = ": No start tag found!"
            r1.append(r2)     // Catch:{ InflateException -> 0x007c, XmlPullParserException -> 0x006e, IOException -> 0x0048 }
            java.lang.String r1 = r1.toString()     // Catch:{ InflateException -> 0x007c, XmlPullParserException -> 0x006e, IOException -> 0x0048 }
            r7.<init>(r1)     // Catch:{ InflateException -> 0x007c, XmlPullParserException -> 0x006e, IOException -> 0x0048 }
            throw r7     // Catch:{ InflateException -> 0x007c, XmlPullParserException -> 0x006e, IOException -> 0x0048 }
        L_0x0048:
            r7 = move-exception
            android.view.InflateException r1 = new android.view.InflateException     // Catch:{ all -> 0x007e }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x007e }
            r2.<init>()     // Catch:{ all -> 0x007e }
            java.lang.String r6 = r6.getPositionDescription()     // Catch:{ all -> 0x007e }
            r2.append(r6)     // Catch:{ all -> 0x007e }
            java.lang.String r6 = ": "
            r2.append(r6)     // Catch:{ all -> 0x007e }
            java.lang.String r6 = r7.getMessage()     // Catch:{ all -> 0x007e }
            r2.append(r6)     // Catch:{ all -> 0x007e }
            java.lang.String r6 = r2.toString()     // Catch:{ all -> 0x007e }
            r1.<init>(r6)     // Catch:{ all -> 0x007e }
            r1.initCause(r7)     // Catch:{ all -> 0x007e }
            throw r1     // Catch:{ all -> 0x007e }
        L_0x006e:
            r6 = move-exception
            android.view.InflateException r7 = new android.view.InflateException     // Catch:{ all -> 0x007e }
            java.lang.String r1 = r6.getMessage()     // Catch:{ all -> 0x007e }
            r7.<init>(r1)     // Catch:{ all -> 0x007e }
            r7.initCause(r6)     // Catch:{ all -> 0x007e }
            throw r7     // Catch:{ all -> 0x007e }
        L_0x007c:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x007e }
        L_0x007e:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x007e }
            goto L_0x0082
        L_0x0081:
            throw r6
        L_0x0082:
            goto L_0x0081
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.C0599i.mo3356a(org.xmlpull.v1.XmlPullParser, androidx.preference.PreferenceGroup):androidx.preference.Preference");
    }

    /* renamed from: a */
    private PreferenceGroup m2903a(PreferenceGroup preferenceGroup, PreferenceGroup preferenceGroup2) {
        if (preferenceGroup != null) {
            return preferenceGroup;
        }
        preferenceGroup2.mo3188a(this.f2383c);
        return preferenceGroup2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0078, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0079, code lost:
        r0 = new android.view.InflateException(r13.getPositionDescription() + ": Error inflating class " + r11);
        r0.initCause(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0097, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0098, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009a, code lost:
        throw r11;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0078 A[ExcHandler: Exception (r12v4 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:2:0x000d] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private androidx.preference.Preference m2902a(java.lang.String r11, java.lang.String[] r12, android.util.AttributeSet r13) throws java.lang.ClassNotFoundException, android.view.InflateException {
        /*
            r10 = this;
            java.util.HashMap<java.lang.String, java.lang.reflect.Constructor> r0 = f2380f
            java.lang.Object r0 = r0.get(r11)
            java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0
            java.lang.String r1 = ": Error inflating class "
            r2 = 1
            if (r0 != 0) goto L_0x006d
            android.content.Context r0 = r10.f2381a     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            r3 = 0
            if (r12 == 0) goto L_0x005b
            int r4 = r12.length     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            if (r4 != 0) goto L_0x001a
            goto L_0x005b
        L_0x001a:
            int r4 = r12.length     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            r5 = 0
            r7 = r5
            r6 = 0
        L_0x001e:
            if (r6 >= r4) goto L_0x003a
            r8 = r12[r6]     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x0036, Exception -> 0x0078 }
            r9.<init>()     // Catch:{ ClassNotFoundException -> 0x0036, Exception -> 0x0078 }
            r9.append(r8)     // Catch:{ ClassNotFoundException -> 0x0036, Exception -> 0x0078 }
            r9.append(r11)     // Catch:{ ClassNotFoundException -> 0x0036, Exception -> 0x0078 }
            java.lang.String r8 = r9.toString()     // Catch:{ ClassNotFoundException -> 0x0036, Exception -> 0x0078 }
            java.lang.Class r5 = java.lang.Class.forName(r8, r3, r0)     // Catch:{ ClassNotFoundException -> 0x0036, Exception -> 0x0078 }
            goto L_0x003a
        L_0x0036:
            r7 = move-exception
            int r6 = r6 + 1
            goto L_0x001e
        L_0x003a:
            if (r5 != 0) goto L_0x005f
            if (r7 != 0) goto L_0x005a
            android.view.InflateException r12 = new android.view.InflateException     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            r0.<init>()     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            java.lang.String r2 = r13.getPositionDescription()     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            r0.append(r2)     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            r0.append(r1)     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            r0.append(r11)     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            java.lang.String r0 = r0.toString()     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            r12.<init>(r0)     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            throw r12     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
        L_0x005a:
            throw r7     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
        L_0x005b:
            java.lang.Class r5 = java.lang.Class.forName(r11, r3, r0)     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
        L_0x005f:
            java.lang.Class<?>[] r12 = f2379e     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            java.lang.reflect.Constructor r0 = r5.getConstructor(r12)     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            r0.setAccessible(r2)     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            java.util.HashMap<java.lang.String, java.lang.reflect.Constructor> r12 = f2380f     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            r12.put(r11, r0)     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
        L_0x006d:
            java.lang.Object[] r12 = r10.f2382b     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            r12[r2] = r13     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            java.lang.Object r12 = r0.newInstance(r12)     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            androidx.preference.Preference r12 = (androidx.preference.Preference) r12     // Catch:{ ClassNotFoundException -> 0x0098, Exception -> 0x0078 }
            return r12
        L_0x0078:
            r12 = move-exception
            android.view.InflateException r0 = new android.view.InflateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r13 = r13.getPositionDescription()
            r2.append(r13)
            r2.append(r1)
            r2.append(r11)
            java.lang.String r11 = r2.toString()
            r0.<init>(r11)
            r0.initCause(r12)
            throw r0
        L_0x0098:
            r11 = move-exception
            goto L_0x009b
        L_0x009a:
            throw r11
        L_0x009b:
            goto L_0x009a
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.C0599i.m2902a(java.lang.String, java.lang.String[], android.util.AttributeSet):androidx.preference.Preference");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Preference mo3355a(String str, AttributeSet attributeSet) throws ClassNotFoundException {
        return m2902a(str, this.f2384d, attributeSet);
    }

    /* renamed from: a */
    private void m2906a(XmlPullParser xmlPullParser, Preference preference, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                return;
            }
            if (next == 2) {
                String name = xmlPullParser.getName();
                if ("intent".equals(name)) {
                    try {
                        preference.mo3180a(Intent.parseIntent(mo3353a().getResources(), xmlPullParser, attributeSet));
                    } catch (IOException e) {
                        XmlPullParserException xmlPullParserException = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException.initCause(e);
                        throw xmlPullParserException;
                    }
                } else if ("extra".equals(name)) {
                    mo3353a().getResources().parseBundleExtra("extra", attributeSet, preference.mo3210e());
                    try {
                        m2905a(xmlPullParser);
                    } catch (IOException e2) {
                        XmlPullParserException xmlPullParserException2 = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException2.initCause(e2);
                        throw xmlPullParserException2;
                    }
                } else {
                    Preference b = m2907b(name, attributeSet);
                    ((PreferenceGroup) preference).mo3238b(b);
                    m2906a(xmlPullParser, b, attributeSet);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m2905a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            if (next == 3 && xmlPullParser.getDepth() <= depth) {
                return;
            }
        }
    }
}
