package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p015cm.aptoide.p016pt.DeepLinkIntentReceiver;

/* renamed from: androidx.constraintlayout.widget.c */
/* compiled from: ConstraintLayoutStates */
public class C0324c {

    /* renamed from: a */
    private final ConstraintLayout f1450a;

    /* renamed from: b */
    private SparseArray<C0325a> f1451b = new SparseArray<>();

    /* renamed from: c */
    private SparseArray<C0327d> f1452c = new SparseArray<>();

    /* renamed from: androidx.constraintlayout.widget.c$a */
    /* compiled from: ConstraintLayoutStates */
    static class C0325a {

        /* renamed from: a */
        int f1453a;

        /* renamed from: b */
        ArrayList<C0326b> f1454b = new ArrayList<>();

        /* renamed from: c */
        int f1455c = -1;

        /* renamed from: d */
        C0327d f1456d;

        public C0325a(Context context, XmlPullParser xmlPullParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0338i.State);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0338i.State_android_id) {
                    this.f1453a = obtainStyledAttributes.getResourceId(index, this.f1453a);
                } else if (index == C0338i.State_constraints) {
                    this.f1455c = obtainStyledAttributes.getResourceId(index, this.f1455c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f1455c);
                    context.getResources().getResourceName(this.f1455c);
                    if ("layout".equals(resourceTypeName)) {
                        C0327d dVar = new C0327d();
                        this.f1456d = dVar;
                        dVar.mo2046a(context, this.f1455c);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2043a(C0326b bVar) {
            this.f1454b.add(bVar);
        }
    }

    /* renamed from: androidx.constraintlayout.widget.c$b */
    /* compiled from: ConstraintLayoutStates */
    static class C0326b {

        /* renamed from: a */
        float f1457a = Float.NaN;

        /* renamed from: b */
        float f1458b = Float.NaN;

        /* renamed from: c */
        float f1459c = Float.NaN;

        /* renamed from: d */
        float f1460d = Float.NaN;

        /* renamed from: e */
        int f1461e = -1;

        /* renamed from: f */
        C0327d f1462f;

        public C0326b(Context context, XmlPullParser xmlPullParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0338i.Variant);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0338i.Variant_constraints) {
                    this.f1461e = obtainStyledAttributes.getResourceId(index, this.f1461e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f1461e);
                    context.getResources().getResourceName(this.f1461e);
                    if ("layout".equals(resourceTypeName)) {
                        C0327d dVar = new C0327d();
                        this.f1462f = dVar;
                        dVar.mo2046a(context, this.f1461e);
                    }
                } else if (index == C0338i.Variant_region_heightLessThan) {
                    this.f1460d = obtainStyledAttributes.getDimension(index, this.f1460d);
                } else if (index == C0338i.Variant_region_heightMoreThan) {
                    this.f1458b = obtainStyledAttributes.getDimension(index, this.f1458b);
                } else if (index == C0338i.Variant_region_widthLessThan) {
                    this.f1459c = obtainStyledAttributes.getDimension(index, this.f1459c);
                } else if (index == C0338i.Variant_region_widthMoreThan) {
                    this.f1457a = obtainStyledAttributes.getDimension(index, this.f1457a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    C0324c(Context context, ConstraintLayout constraintLayout, int i) {
        this.f1450a = constraintLayout;
        m1613a(context, i);
    }

    /* renamed from: a */
    private void m1613a(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        C0325a aVar = null;
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    char c = 65535;
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c = 4;
                                break;
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                c = 3;
                                break;
                            }
                            break;
                    }
                    if (!(c == 0 || c == 1)) {
                        if (c == 2) {
                            aVar = new C0325a(context, xml);
                            this.f1451b.put(aVar.f1453a, aVar);
                        } else if (c == 3) {
                            C0326b bVar = new C0326b(context, xml);
                            if (aVar != null) {
                                aVar.mo2043a(bVar);
                            }
                        } else if (c != 4) {
                            Log.v("ConstraintLayoutStates", "unknown tag " + name);
                        } else {
                            m1614a(context, (XmlPullParser) xml);
                        }
                    }
                }
            }
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo2042a(C0335f fVar) {
    }

    /* renamed from: a */
    private void m1614a(Context context, XmlPullParser xmlPullParser) {
        int i;
        C0327d dVar = new C0327d();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i2 = 0; i2 < attributeCount; i2++) {
            if (DeepLinkIntentReceiver.DeepLinksKeys.f3452ID.equals(xmlPullParser.getAttributeName(i2))) {
                String attributeValue = xmlPullParser.getAttributeValue(i2);
                if (attributeValue.contains("/")) {
                    i = context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), DeepLinkIntentReceiver.DeepLinksKeys.f3452ID, context.getPackageName());
                } else {
                    i = -1;
                }
                if (i == -1) {
                    if (attributeValue == null || attributeValue.length() <= 1) {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    } else {
                        i = Integer.parseInt(attributeValue.substring(1));
                    }
                }
                dVar.mo2047a(context, xmlPullParser);
                this.f1452c.put(i, dVar);
                return;
            }
        }
    }
}
