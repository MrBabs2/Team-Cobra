package androidx.core.content.p003c;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.core.content.c.b */
/* compiled from: ComplexColorCompat */
public final class C0397b {

    /* renamed from: a */
    private final Shader f1775a;

    /* renamed from: b */
    private final ColorStateList f1776b;

    /* renamed from: c */
    private int f1777c;

    private C0397b(Shader shader, ColorStateList colorStateList, int i) {
        this.f1775a = shader;
        this.f1776b = colorStateList;
        this.f1777c = i;
    }

    /* renamed from: a */
    static C0397b m1928a(Shader shader) {
        return new C0397b(shader, (ColorStateList) null, 0);
    }

    /* renamed from: b */
    static C0397b m1929b(int i) {
        return new C0397b((Shader) null, (ColorStateList) null, i);
    }

    /* renamed from: c */
    public boolean mo2302c() {
        return this.f1775a != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f1776b;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo2303d() {
        /*
            r1 = this;
            android.graphics.Shader r0 = r1.f1775a
            if (r0 != 0) goto L_0x0010
            android.content.res.ColorStateList r0 = r1.f1776b
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.p003c.C0397b.mo2303d():boolean");
    }

    /* renamed from: e */
    public boolean mo2304e() {
        return mo2302c() || this.f1777c != 0;
    }

    /* renamed from: a */
    static C0397b m1926a(ColorStateList colorStateList) {
        return new C0397b((Shader) null, colorStateList, colorStateList.getDefaultColor());
    }

    /* renamed from: b */
    public Shader mo2301b() {
        return this.f1775a;
    }

    /* renamed from: b */
    public static C0397b m1930b(Resources resources, int i, Resources.Theme theme) {
        try {
            return m1927a(resources, i, theme);
        } catch (Exception e) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
            return null;
        }
    }

    /* renamed from: a */
    public int mo2298a() {
        return this.f1777c;
    }

    /* renamed from: a */
    public void mo2299a(int i) {
        this.f1777c = i;
    }

    /* renamed from: a */
    public boolean mo2300a(int[] iArr) {
        if (mo2303d()) {
            ColorStateList colorStateList = this.f1776b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f1777c) {
                this.f1777c = colorForState;
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static C0397b m1927a(Resources resources, int i, Resources.Theme theme) throws IOException, XmlPullParserException {
        int next;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            String name = xml.getName();
            char c = 65535;
            int hashCode = name.hashCode();
            if (hashCode != 89650992) {
                if (hashCode == 1191572447 && name.equals("selector")) {
                    c = 0;
                }
            } else if (name.equals("gradient")) {
                c = 1;
            }
            if (c == 0) {
                return m1926a(C0396a.m1923a(resources, (XmlPullParser) xml, asAttributeSet, theme));
            }
            if (c == 1) {
                return m1928a(C0403d.m1957a(resources, xml, asAttributeSet, theme));
            }
            throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
        }
        throw new XmlPullParserException("No start tag found");
    }
}
