package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C0333e;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import p015cm.aptoide.p016pt.DeepLinkIntentReceiver;
import p050l.p067f.p068a.p069a.C4883a;
import p050l.p067f.p068a.p070b.C4884a;

/* renamed from: androidx.constraintlayout.widget.d */
/* compiled from: ConstraintSet */
public class C0327d {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final int[] f1463d = {0, 4, 8};

    /* renamed from: e */
    private static SparseIntArray f1464e;

    /* renamed from: a */
    private HashMap<String, C0320a> f1465a = new HashMap<>();

    /* renamed from: b */
    private boolean f1466b = true;

    /* renamed from: c */
    private HashMap<Integer, C0328a> f1467c = new HashMap<>();

    /* renamed from: androidx.constraintlayout.widget.d$a */
    /* compiled from: ConstraintSet */
    public static class C0328a {

        /* renamed from: a */
        int f1468a;

        /* renamed from: b */
        public final C0331d f1469b = new C0331d();

        /* renamed from: c */
        public final C0330c f1470c = new C0330c();

        /* renamed from: d */
        public final C0329b f1471d = new C0329b();

        /* renamed from: e */
        public final C0332e f1472e = new C0332e();

        /* renamed from: f */
        public HashMap<String, C0320a> f1473f = new HashMap<>();

        public C0328a clone() {
            C0328a aVar = new C0328a();
            aVar.f1471d.mo2056a(this.f1471d);
            aVar.f1470c.mo2058a(this.f1470c);
            aVar.f1469b.mo2060a(this.f1469b);
            aVar.f1472e.mo2062a(this.f1472e);
            aVar.f1468a = this.f1468a;
            return aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m1636a(C0323b bVar, int i, C0333e.C0334a aVar) {
            m1635a(i, aVar);
            if (bVar instanceof Barrier) {
                C0329b bVar2 = this.f1471d;
                bVar2.f1508d0 = 1;
                Barrier barrier = (Barrier) bVar;
                bVar2.f1504b0 = barrier.getType();
                this.f1471d.f1510e0 = barrier.getReferencedIds();
                this.f1471d.f1506c0 = barrier.getMargin();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m1635a(int i, C0333e.C0334a aVar) {
            m1634a(i, (ConstraintLayout.C0317b) aVar);
            this.f1469b.f1548d = aVar.f1566o0;
            C0332e eVar = this.f1472e;
            eVar.f1552b = aVar.f1569r0;
            eVar.f1553c = aVar.f1570s0;
            eVar.f1554d = aVar.f1571t0;
            eVar.f1555e = aVar.f1572u0;
            eVar.f1556f = aVar.f1573v0;
            eVar.f1557g = aVar.f1574w0;
            eVar.f1558h = aVar.f1575x0;
            eVar.f1559i = aVar.f1576y0;
            eVar.f1560j = aVar.f1577z0;
            eVar.f1561k = aVar.f1565A0;
            eVar.f1563m = aVar.f1568q0;
            eVar.f1562l = aVar.f1567p0;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m1634a(int i, ConstraintLayout.C0317b bVar) {
            this.f1468a = i;
            C0329b bVar2 = this.f1471d;
            bVar2.f1515h = bVar.f1383d;
            bVar2.f1517i = bVar.f1385e;
            bVar2.f1519j = bVar.f1387f;
            bVar2.f1521k = bVar.f1389g;
            bVar2.f1522l = bVar.f1391h;
            bVar2.f1523m = bVar.f1393i;
            bVar2.f1524n = bVar.f1395j;
            bVar2.f1525o = bVar.f1397k;
            bVar2.f1526p = bVar.f1399l;
            bVar2.f1527q = bVar.f1406p;
            bVar2.f1528r = bVar.f1407q;
            bVar2.f1529s = bVar.f1408r;
            bVar2.f1530t = bVar.f1409s;
            bVar2.f1531u = bVar.f1416z;
            bVar2.f1532v = bVar.f1351A;
            bVar2.f1533w = bVar.f1352B;
            bVar2.f1534x = bVar.f1401m;
            bVar2.f1535y = bVar.f1403n;
            bVar2.f1536z = bVar.f1405o;
            bVar2.f1475A = bVar.f1366P;
            bVar2.f1476B = bVar.f1367Q;
            bVar2.f1477C = bVar.f1368R;
            bVar2.f1513g = bVar.f1381c;
            bVar2.f1509e = bVar.f1377a;
            bVar2.f1511f = bVar.f1379b;
            bVar2.f1505c = bVar.width;
            bVar2.f1507d = bVar.height;
            bVar2.f1478D = bVar.leftMargin;
            bVar2.f1479E = bVar.rightMargin;
            bVar2.f1480F = bVar.topMargin;
            bVar2.f1481G = bVar.bottomMargin;
            bVar2.f1490P = bVar.f1355E;
            bVar2.f1491Q = bVar.f1354D;
            bVar2.f1493S = bVar.f1357G;
            bVar2.f1492R = bVar.f1356F;
            bVar2.f1516h0 = bVar.f1369S;
            bVar2.f1518i0 = bVar.f1370T;
            bVar2.f1494T = bVar.f1358H;
            bVar2.f1495U = bVar.f1359I;
            bVar2.f1496V = bVar.f1362L;
            bVar2.f1497W = bVar.f1363M;
            bVar2.f1498X = bVar.f1360J;
            bVar2.f1499Y = bVar.f1361K;
            bVar2.f1500Z = bVar.f1364N;
            bVar2.f1502a0 = bVar.f1365O;
            bVar2.f1514g0 = bVar.f1371U;
            bVar2.f1485K = bVar.f1411u;
            bVar2.f1487M = bVar.f1413w;
            bVar2.f1484J = bVar.f1410t;
            bVar2.f1486L = bVar.f1412v;
            bVar2.f1489O = bVar.f1414x;
            bVar2.f1488N = bVar.f1415y;
            if (Build.VERSION.SDK_INT >= 17) {
                bVar2.f1482H = bVar.getMarginEnd();
                this.f1471d.f1483I = bVar.getMarginStart();
            }
        }

        /* renamed from: a */
        public void mo2053a(ConstraintLayout.C0317b bVar) {
            C0329b bVar2 = this.f1471d;
            bVar.f1383d = bVar2.f1515h;
            bVar.f1385e = bVar2.f1517i;
            bVar.f1387f = bVar2.f1519j;
            bVar.f1389g = bVar2.f1521k;
            bVar.f1391h = bVar2.f1522l;
            bVar.f1393i = bVar2.f1523m;
            bVar.f1395j = bVar2.f1524n;
            bVar.f1397k = bVar2.f1525o;
            bVar.f1399l = bVar2.f1526p;
            bVar.f1406p = bVar2.f1527q;
            bVar.f1407q = bVar2.f1528r;
            bVar.f1408r = bVar2.f1529s;
            bVar.f1409s = bVar2.f1530t;
            bVar.leftMargin = bVar2.f1478D;
            bVar.rightMargin = bVar2.f1479E;
            bVar.topMargin = bVar2.f1480F;
            bVar.bottomMargin = bVar2.f1481G;
            bVar.f1414x = bVar2.f1489O;
            bVar.f1415y = bVar2.f1488N;
            bVar.f1411u = bVar2.f1485K;
            bVar.f1413w = bVar2.f1487M;
            bVar.f1416z = bVar2.f1531u;
            bVar.f1351A = bVar2.f1532v;
            bVar.f1401m = bVar2.f1534x;
            bVar.f1403n = bVar2.f1535y;
            bVar.f1405o = bVar2.f1536z;
            bVar.f1352B = bVar2.f1533w;
            bVar.f1366P = bVar2.f1475A;
            bVar.f1367Q = bVar2.f1476B;
            bVar.f1355E = bVar2.f1490P;
            bVar.f1354D = bVar2.f1491Q;
            bVar.f1357G = bVar2.f1493S;
            bVar.f1356F = bVar2.f1492R;
            bVar.f1369S = bVar2.f1516h0;
            bVar.f1370T = bVar2.f1518i0;
            bVar.f1358H = bVar2.f1494T;
            bVar.f1359I = bVar2.f1495U;
            bVar.f1362L = bVar2.f1496V;
            bVar.f1363M = bVar2.f1497W;
            bVar.f1360J = bVar2.f1498X;
            bVar.f1361K = bVar2.f1499Y;
            bVar.f1364N = bVar2.f1500Z;
            bVar.f1365O = bVar2.f1502a0;
            bVar.f1368R = bVar2.f1477C;
            bVar.f1381c = bVar2.f1513g;
            bVar.f1377a = bVar2.f1509e;
            bVar.f1379b = bVar2.f1511f;
            bVar.width = bVar2.f1505c;
            bVar.height = bVar2.f1507d;
            String str = bVar2.f1514g0;
            if (str != null) {
                bVar.f1371U = str;
            }
            if (Build.VERSION.SDK_INT >= 17) {
                bVar.setMarginStart(this.f1471d.f1483I);
                bVar.setMarginEnd(this.f1471d.f1482H);
            }
            bVar.mo2013a();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1464e = sparseIntArray;
        sparseIntArray.append(C0338i.Constraint_layout_constraintLeft_toLeftOf, 25);
        f1464e.append(C0338i.Constraint_layout_constraintLeft_toRightOf, 26);
        f1464e.append(C0338i.Constraint_layout_constraintRight_toLeftOf, 29);
        f1464e.append(C0338i.Constraint_layout_constraintRight_toRightOf, 30);
        f1464e.append(C0338i.Constraint_layout_constraintTop_toTopOf, 36);
        f1464e.append(C0338i.Constraint_layout_constraintTop_toBottomOf, 35);
        f1464e.append(C0338i.Constraint_layout_constraintBottom_toTopOf, 4);
        f1464e.append(C0338i.Constraint_layout_constraintBottom_toBottomOf, 3);
        f1464e.append(C0338i.Constraint_layout_constraintBaseline_toBaselineOf, 1);
        f1464e.append(C0338i.Constraint_layout_editor_absoluteX, 6);
        f1464e.append(C0338i.Constraint_layout_editor_absoluteY, 7);
        f1464e.append(C0338i.Constraint_layout_constraintGuide_begin, 17);
        f1464e.append(C0338i.Constraint_layout_constraintGuide_end, 18);
        f1464e.append(C0338i.Constraint_layout_constraintGuide_percent, 19);
        f1464e.append(C0338i.Constraint_android_orientation, 27);
        f1464e.append(C0338i.Constraint_layout_constraintStart_toEndOf, 32);
        f1464e.append(C0338i.Constraint_layout_constraintStart_toStartOf, 33);
        f1464e.append(C0338i.Constraint_layout_constraintEnd_toStartOf, 10);
        f1464e.append(C0338i.Constraint_layout_constraintEnd_toEndOf, 9);
        f1464e.append(C0338i.Constraint_layout_goneMarginLeft, 13);
        f1464e.append(C0338i.Constraint_layout_goneMarginTop, 16);
        f1464e.append(C0338i.Constraint_layout_goneMarginRight, 14);
        f1464e.append(C0338i.Constraint_layout_goneMarginBottom, 11);
        f1464e.append(C0338i.Constraint_layout_goneMarginStart, 15);
        f1464e.append(C0338i.Constraint_layout_goneMarginEnd, 12);
        f1464e.append(C0338i.Constraint_layout_constraintVertical_weight, 40);
        f1464e.append(C0338i.Constraint_layout_constraintHorizontal_weight, 39);
        f1464e.append(C0338i.Constraint_layout_constraintHorizontal_chainStyle, 41);
        f1464e.append(C0338i.Constraint_layout_constraintVertical_chainStyle, 42);
        f1464e.append(C0338i.Constraint_layout_constraintHorizontal_bias, 20);
        f1464e.append(C0338i.Constraint_layout_constraintVertical_bias, 37);
        f1464e.append(C0338i.Constraint_layout_constraintDimensionRatio, 5);
        f1464e.append(C0338i.Constraint_layout_constraintLeft_creator, 82);
        f1464e.append(C0338i.Constraint_layout_constraintTop_creator, 82);
        f1464e.append(C0338i.Constraint_layout_constraintRight_creator, 82);
        f1464e.append(C0338i.Constraint_layout_constraintBottom_creator, 82);
        f1464e.append(C0338i.Constraint_layout_constraintBaseline_creator, 82);
        f1464e.append(C0338i.Constraint_android_layout_marginLeft, 24);
        f1464e.append(C0338i.Constraint_android_layout_marginRight, 28);
        f1464e.append(C0338i.Constraint_android_layout_marginStart, 31);
        f1464e.append(C0338i.Constraint_android_layout_marginEnd, 8);
        f1464e.append(C0338i.Constraint_android_layout_marginTop, 34);
        f1464e.append(C0338i.Constraint_android_layout_marginBottom, 2);
        f1464e.append(C0338i.Constraint_android_layout_width, 23);
        f1464e.append(C0338i.Constraint_android_layout_height, 21);
        f1464e.append(C0338i.Constraint_android_visibility, 22);
        f1464e.append(C0338i.Constraint_android_alpha, 43);
        f1464e.append(C0338i.Constraint_android_elevation, 44);
        f1464e.append(C0338i.Constraint_android_rotationX, 45);
        f1464e.append(C0338i.Constraint_android_rotationY, 46);
        f1464e.append(C0338i.Constraint_android_rotation, 60);
        f1464e.append(C0338i.Constraint_android_scaleX, 47);
        f1464e.append(C0338i.Constraint_android_scaleY, 48);
        f1464e.append(C0338i.Constraint_android_transformPivotX, 49);
        f1464e.append(C0338i.Constraint_android_transformPivotY, 50);
        f1464e.append(C0338i.Constraint_android_translationX, 51);
        f1464e.append(C0338i.Constraint_android_translationY, 52);
        f1464e.append(C0338i.Constraint_android_translationZ, 53);
        f1464e.append(C0338i.Constraint_layout_constraintWidth_default, 54);
        f1464e.append(C0338i.Constraint_layout_constraintHeight_default, 55);
        f1464e.append(C0338i.Constraint_layout_constraintWidth_max, 56);
        f1464e.append(C0338i.Constraint_layout_constraintHeight_max, 57);
        f1464e.append(C0338i.Constraint_layout_constraintWidth_min, 58);
        f1464e.append(C0338i.Constraint_layout_constraintHeight_min, 59);
        f1464e.append(C0338i.Constraint_layout_constraintCircle, 61);
        f1464e.append(C0338i.Constraint_layout_constraintCircleRadius, 62);
        f1464e.append(C0338i.Constraint_layout_constraintCircleAngle, 63);
        f1464e.append(C0338i.Constraint_animate_relativeTo, 64);
        f1464e.append(C0338i.Constraint_transitionEasing, 65);
        f1464e.append(C0338i.Constraint_drawPath, 66);
        f1464e.append(C0338i.Constraint_transitionPathRotate, 67);
        f1464e.append(C0338i.Constraint_motionStagger, 79);
        f1464e.append(C0338i.Constraint_android_id, 38);
        f1464e.append(C0338i.Constraint_motionProgress, 68);
        f1464e.append(C0338i.Constraint_layout_constraintWidth_percent, 69);
        f1464e.append(C0338i.Constraint_layout_constraintHeight_percent, 70);
        f1464e.append(C0338i.Constraint_chainUseRtl, 71);
        f1464e.append(C0338i.Constraint_barrierDirection, 72);
        f1464e.append(C0338i.Constraint_barrierMargin, 73);
        f1464e.append(C0338i.Constraint_constraint_referenced_ids, 74);
        f1464e.append(C0338i.Constraint_barrierAllowsGoneWidgets, 75);
        f1464e.append(C0338i.Constraint_pathMotionArc, 76);
        f1464e.append(C0338i.Constraint_layout_constraintTag, 77);
        f1464e.append(C0338i.Constraint_visibilityMode, 78);
        f1464e.append(C0338i.Constraint_layout_constrainedWidth, 80);
        f1464e.append(C0338i.Constraint_layout_constrainedHeight, 81);
    }

    /* renamed from: b */
    private String m1624b(int i) {
        switch (i) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    /* renamed from: b */
    public void mo2052b(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f1467c.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.C0317b bVar = (ConstraintLayout.C0317b) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!this.f1466b || id != -1) {
                if (!this.f1467c.containsKey(Integer.valueOf(id))) {
                    this.f1467c.put(Integer.valueOf(id), new C0328a());
                }
                C0328a aVar = this.f1467c.get(Integer.valueOf(id));
                aVar.f1473f = C0320a.m1595a(this.f1465a, childAt);
                aVar.m1634a(id, bVar);
                aVar.f1469b.f1546b = childAt.getVisibility();
                if (Build.VERSION.SDK_INT >= 17) {
                    aVar.f1469b.f1548d = childAt.getAlpha();
                    aVar.f1472e.f1552b = childAt.getRotation();
                    aVar.f1472e.f1553c = childAt.getRotationX();
                    aVar.f1472e.f1554d = childAt.getRotationY();
                    aVar.f1472e.f1555e = childAt.getScaleX();
                    aVar.f1472e.f1556f = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                        C0332e eVar = aVar.f1472e;
                        eVar.f1557g = pivotX;
                        eVar.f1558h = pivotY;
                    }
                    aVar.f1472e.f1559i = childAt.getTranslationX();
                    aVar.f1472e.f1560j = childAt.getTranslationY();
                    if (Build.VERSION.SDK_INT >= 21) {
                        aVar.f1472e.f1561k = childAt.getTranslationZ();
                        C0332e eVar2 = aVar.f1472e;
                        if (eVar2.f1562l) {
                            eVar2.f1563m = childAt.getElevation();
                        }
                    }
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    aVar.f1471d.f1520j0 = barrier.mo1969c();
                    aVar.f1471d.f1510e0 = barrier.getReferencedIds();
                    aVar.f1471d.f1504b0 = barrier.getType();
                    aVar.f1471d.f1506c0 = barrier.getMargin();
                }
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    /* renamed from: a */
    public void mo2046a(Context context, int i) {
        mo2052b((ConstraintLayout) LayoutInflater.from(context).inflate(i, (ViewGroup) null));
    }

    /* renamed from: a */
    public void mo2050a(C0333e eVar) {
        int childCount = eVar.getChildCount();
        this.f1467c.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = eVar.getChildAt(i);
            C0333e.C0334a aVar = (C0333e.C0334a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!this.f1466b || id != -1) {
                if (!this.f1467c.containsKey(Integer.valueOf(id))) {
                    this.f1467c.put(Integer.valueOf(id), new C0328a());
                }
                C0328a aVar2 = this.f1467c.get(Integer.valueOf(id));
                if (childAt instanceof C0323b) {
                    aVar2.m1636a((C0323b) childAt, id, aVar);
                }
                aVar2.m1635a(id, aVar);
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    /* renamed from: androidx.constraintlayout.widget.d$d */
    /* compiled from: ConstraintSet */
    public static class C0331d {

        /* renamed from: a */
        public boolean f1545a = false;

        /* renamed from: b */
        public int f1546b = 0;

        /* renamed from: c */
        public int f1547c = 0;

        /* renamed from: d */
        public float f1548d = 1.0f;

        /* renamed from: e */
        public float f1549e = Float.NaN;

        /* renamed from: a */
        public void mo2060a(C0331d dVar) {
            this.f1545a = dVar.f1545a;
            this.f1546b = dVar.f1546b;
            this.f1548d = dVar.f1548d;
            this.f1549e = dVar.f1549e;
            this.f1547c = dVar.f1547c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2059a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0338i.PropertySet);
            this.f1545a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0338i.PropertySet_android_alpha) {
                    this.f1548d = obtainStyledAttributes.getFloat(index, this.f1548d);
                } else if (index == C0338i.PropertySet_android_visibility) {
                    this.f1546b = obtainStyledAttributes.getInt(index, this.f1546b);
                    this.f1546b = C0327d.f1463d[this.f1546b];
                } else if (index == C0338i.PropertySet_visibilityMode) {
                    this.f1547c = obtainStyledAttributes.getInt(index, this.f1547c);
                } else if (index == C0338i.PropertySet_motionProgress) {
                    this.f1549e = obtainStyledAttributes.getFloat(index, this.f1549e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.d$c */
    /* compiled from: ConstraintSet */
    public static class C0330c {

        /* renamed from: h */
        private static SparseIntArray f1537h;

        /* renamed from: a */
        public boolean f1538a = false;

        /* renamed from: b */
        public int f1539b = -1;

        /* renamed from: c */
        public String f1540c = null;

        /* renamed from: d */
        public int f1541d = -1;

        /* renamed from: e */
        public int f1542e = 0;

        /* renamed from: f */
        public float f1543f = Float.NaN;

        /* renamed from: g */
        public float f1544g = Float.NaN;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1537h = sparseIntArray;
            sparseIntArray.append(C0338i.Motion_motionPathRotate, 1);
            f1537h.append(C0338i.Motion_pathMotionArc, 2);
            f1537h.append(C0338i.Motion_transitionEasing, 3);
            f1537h.append(C0338i.Motion_drawPath, 4);
            f1537h.append(C0338i.Motion_animate_relativeTo, 5);
            f1537h.append(C0338i.Motion_motionStagger, 6);
        }

        /* renamed from: a */
        public void mo2058a(C0330c cVar) {
            this.f1538a = cVar.f1538a;
            this.f1539b = cVar.f1539b;
            this.f1540c = cVar.f1540c;
            this.f1541d = cVar.f1541d;
            this.f1542e = cVar.f1542e;
            this.f1544g = cVar.f1544g;
            this.f1543f = cVar.f1543f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2057a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0338i.Motion);
            this.f1538a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (f1537h.get(index)) {
                    case 1:
                        this.f1544g = obtainStyledAttributes.getFloat(index, this.f1544g);
                        break;
                    case 2:
                        this.f1541d = obtainStyledAttributes.getInt(index, this.f1541d);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type != 3) {
                            this.f1540c = C4883a.f8392b[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        } else {
                            this.f1540c = obtainStyledAttributes.getString(index);
                            break;
                        }
                    case 4:
                        this.f1542e = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f1539b = C0327d.m1623b(obtainStyledAttributes, index, this.f1539b);
                        break;
                    case 6:
                        this.f1543f = obtainStyledAttributes.getFloat(index, this.f1543f);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.d$e */
    /* compiled from: ConstraintSet */
    public static class C0332e {

        /* renamed from: n */
        private static SparseIntArray f1550n;

        /* renamed from: a */
        public boolean f1551a = false;

        /* renamed from: b */
        public float f1552b = 0.0f;

        /* renamed from: c */
        public float f1553c = 0.0f;

        /* renamed from: d */
        public float f1554d = 0.0f;

        /* renamed from: e */
        public float f1555e = 1.0f;

        /* renamed from: f */
        public float f1556f = 1.0f;

        /* renamed from: g */
        public float f1557g = Float.NaN;

        /* renamed from: h */
        public float f1558h = Float.NaN;

        /* renamed from: i */
        public float f1559i = 0.0f;

        /* renamed from: j */
        public float f1560j = 0.0f;

        /* renamed from: k */
        public float f1561k = 0.0f;

        /* renamed from: l */
        public boolean f1562l = false;

        /* renamed from: m */
        public float f1563m = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1550n = sparseIntArray;
            sparseIntArray.append(C0338i.Transform_android_rotation, 1);
            f1550n.append(C0338i.Transform_android_rotationX, 2);
            f1550n.append(C0338i.Transform_android_rotationY, 3);
            f1550n.append(C0338i.Transform_android_scaleX, 4);
            f1550n.append(C0338i.Transform_android_scaleY, 5);
            f1550n.append(C0338i.Transform_android_transformPivotX, 6);
            f1550n.append(C0338i.Transform_android_transformPivotY, 7);
            f1550n.append(C0338i.Transform_android_translationX, 8);
            f1550n.append(C0338i.Transform_android_translationY, 9);
            f1550n.append(C0338i.Transform_android_translationZ, 10);
            f1550n.append(C0338i.Transform_android_elevation, 11);
        }

        /* renamed from: a */
        public void mo2062a(C0332e eVar) {
            this.f1551a = eVar.f1551a;
            this.f1552b = eVar.f1552b;
            this.f1553c = eVar.f1553c;
            this.f1554d = eVar.f1554d;
            this.f1555e = eVar.f1555e;
            this.f1556f = eVar.f1556f;
            this.f1557g = eVar.f1557g;
            this.f1558h = eVar.f1558h;
            this.f1559i = eVar.f1559i;
            this.f1560j = eVar.f1560j;
            this.f1561k = eVar.f1561k;
            this.f1562l = eVar.f1562l;
            this.f1563m = eVar.f1563m;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2061a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0338i.Transform);
            this.f1551a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (f1550n.get(index)) {
                    case 1:
                        this.f1552b = obtainStyledAttributes.getFloat(index, this.f1552b);
                        break;
                    case 2:
                        this.f1553c = obtainStyledAttributes.getFloat(index, this.f1553c);
                        break;
                    case 3:
                        this.f1554d = obtainStyledAttributes.getFloat(index, this.f1554d);
                        break;
                    case 4:
                        this.f1555e = obtainStyledAttributes.getFloat(index, this.f1555e);
                        break;
                    case 5:
                        this.f1556f = obtainStyledAttributes.getFloat(index, this.f1556f);
                        break;
                    case 6:
                        this.f1557g = obtainStyledAttributes.getDimension(index, this.f1557g);
                        break;
                    case 7:
                        this.f1558h = obtainStyledAttributes.getDimension(index, this.f1558h);
                        break;
                    case 8:
                        this.f1559i = obtainStyledAttributes.getDimension(index, this.f1559i);
                        break;
                    case 9:
                        this.f1560j = obtainStyledAttributes.getDimension(index, this.f1560j);
                        break;
                    case 10:
                        if (Build.VERSION.SDK_INT < 21) {
                            break;
                        } else {
                            this.f1561k = obtainStyledAttributes.getDimension(index, this.f1561k);
                            break;
                        }
                    case 11:
                        if (Build.VERSION.SDK_INT < 21) {
                            break;
                        } else {
                            this.f1562l = true;
                            this.f1563m = obtainStyledAttributes.getDimension(index, this.f1563m);
                            break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    public void mo2048a(ConstraintLayout constraintLayout) {
        mo2049a(constraintLayout, true);
        constraintLayout.setConstraintSet((C0327d) null);
        constraintLayout.requestLayout();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo2049a(ConstraintLayout constraintLayout, boolean z) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f1467c.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!this.f1467c.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + C4884a.m8255a(childAt));
            } else if (this.f1466b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (id != -1) {
                if (this.f1467c.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    C0328a aVar = this.f1467c.get(Integer.valueOf(id));
                    if (childAt instanceof Barrier) {
                        aVar.f1471d.f1508d0 = 1;
                    }
                    int i2 = aVar.f1471d.f1508d0;
                    if (i2 != -1 && i2 == 1) {
                        Barrier barrier = (Barrier) childAt;
                        barrier.setId(id);
                        barrier.setType(aVar.f1471d.f1504b0);
                        barrier.setMargin(aVar.f1471d.f1506c0);
                        barrier.setAllowsGoneWidget(aVar.f1471d.f1520j0);
                        C0329b bVar = aVar.f1471d;
                        int[] iArr = bVar.f1510e0;
                        if (iArr != null) {
                            barrier.setReferencedIds(iArr);
                        } else {
                            String str = bVar.f1512f0;
                            if (str != null) {
                                bVar.f1510e0 = m1622a((View) barrier, str);
                                barrier.setReferencedIds(aVar.f1471d.f1510e0);
                            }
                        }
                    }
                    ConstraintLayout.C0317b bVar2 = (ConstraintLayout.C0317b) childAt.getLayoutParams();
                    bVar2.mo2013a();
                    aVar.mo2053a(bVar2);
                    if (z) {
                        C0320a.m1597a(childAt, aVar.f1473f);
                    }
                    childAt.setLayoutParams(bVar2);
                    C0331d dVar = aVar.f1469b;
                    if (dVar.f1547c == 0) {
                        childAt.setVisibility(dVar.f1546b);
                    }
                    if (Build.VERSION.SDK_INT >= 17) {
                        childAt.setAlpha(aVar.f1469b.f1548d);
                        childAt.setRotation(aVar.f1472e.f1552b);
                        childAt.setRotationX(aVar.f1472e.f1553c);
                        childAt.setRotationY(aVar.f1472e.f1554d);
                        childAt.setScaleX(aVar.f1472e.f1555e);
                        childAt.setScaleY(aVar.f1472e.f1556f);
                        if (!Float.isNaN(aVar.f1472e.f1557g)) {
                            childAt.setPivotX(aVar.f1472e.f1557g);
                        }
                        if (!Float.isNaN(aVar.f1472e.f1558h)) {
                            childAt.setPivotY(aVar.f1472e.f1558h);
                        }
                        childAt.setTranslationX(aVar.f1472e.f1559i);
                        childAt.setTranslationY(aVar.f1472e.f1560j);
                        if (Build.VERSION.SDK_INT >= 21) {
                            childAt.setTranslationZ(aVar.f1472e.f1561k);
                            C0332e eVar = aVar.f1472e;
                            if (eVar.f1562l) {
                                childAt.setElevation(eVar.f1563m);
                            }
                        }
                    }
                } else {
                    Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C0328a aVar2 = this.f1467c.get(num);
            int i3 = aVar2.f1471d.f1508d0;
            if (i3 != -1 && i3 == 1) {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                C0329b bVar3 = aVar2.f1471d;
                int[] iArr2 = bVar3.f1510e0;
                if (iArr2 != null) {
                    barrier2.setReferencedIds(iArr2);
                } else {
                    String str2 = bVar3.f1512f0;
                    if (str2 != null) {
                        bVar3.f1510e0 = m1622a((View) barrier2, str2);
                        barrier2.setReferencedIds(aVar2.f1471d.f1510e0);
                    }
                }
                barrier2.setType(aVar2.f1471d.f1504b0);
                barrier2.setMargin(aVar2.f1471d.f1506c0);
                ConstraintLayout.C0317b generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                barrier2.mo2031b();
                aVar2.mo2053a(generateDefaultLayoutParams);
                constraintLayout.addView(barrier2, generateDefaultLayoutParams);
            }
            if (aVar2.f1471d.f1501a) {
                Guideline guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                ConstraintLayout.C0317b generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                aVar2.mo2053a(generateDefaultLayoutParams2);
                constraintLayout.addView(guideline, generateDefaultLayoutParams2);
            }
        }
    }

    /* renamed from: b */
    public void mo2051b(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    C0328a a = m1619a(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        a.f1471d.f1501a = true;
                    }
                    this.f1467c.put(Integer.valueOf(a.f1468a), a);
                }
            }
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static int m1623b(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* renamed from: androidx.constraintlayout.widget.d$b */
    /* compiled from: ConstraintSet */
    public static class C0329b {

        /* renamed from: k0 */
        private static SparseIntArray f1474k0;

        /* renamed from: A */
        public int f1475A = -1;

        /* renamed from: B */
        public int f1476B = -1;

        /* renamed from: C */
        public int f1477C = -1;

        /* renamed from: D */
        public int f1478D = -1;

        /* renamed from: E */
        public int f1479E = -1;

        /* renamed from: F */
        public int f1480F = -1;

        /* renamed from: G */
        public int f1481G = -1;

        /* renamed from: H */
        public int f1482H = -1;

        /* renamed from: I */
        public int f1483I = -1;

        /* renamed from: J */
        public int f1484J = -1;

        /* renamed from: K */
        public int f1485K = -1;

        /* renamed from: L */
        public int f1486L = -1;

        /* renamed from: M */
        public int f1487M = -1;

        /* renamed from: N */
        public int f1488N = -1;

        /* renamed from: O */
        public int f1489O = -1;

        /* renamed from: P */
        public float f1490P = -1.0f;

        /* renamed from: Q */
        public float f1491Q = -1.0f;

        /* renamed from: R */
        public int f1492R = 0;

        /* renamed from: S */
        public int f1493S = 0;

        /* renamed from: T */
        public int f1494T = 0;

        /* renamed from: U */
        public int f1495U = 0;

        /* renamed from: V */
        public int f1496V = -1;

        /* renamed from: W */
        public int f1497W = -1;

        /* renamed from: X */
        public int f1498X = -1;

        /* renamed from: Y */
        public int f1499Y = -1;

        /* renamed from: Z */
        public float f1500Z = 1.0f;

        /* renamed from: a */
        public boolean f1501a = false;

        /* renamed from: a0 */
        public float f1502a0 = 1.0f;

        /* renamed from: b */
        public boolean f1503b = false;

        /* renamed from: b0 */
        public int f1504b0 = -1;

        /* renamed from: c */
        public int f1505c;

        /* renamed from: c0 */
        public int f1506c0 = 0;

        /* renamed from: d */
        public int f1507d;

        /* renamed from: d0 */
        public int f1508d0 = -1;

        /* renamed from: e */
        public int f1509e = -1;

        /* renamed from: e0 */
        public int[] f1510e0;

        /* renamed from: f */
        public int f1511f = -1;

        /* renamed from: f0 */
        public String f1512f0;

        /* renamed from: g */
        public float f1513g = -1.0f;

        /* renamed from: g0 */
        public String f1514g0;

        /* renamed from: h */
        public int f1515h = -1;

        /* renamed from: h0 */
        public boolean f1516h0 = false;

        /* renamed from: i */
        public int f1517i = -1;

        /* renamed from: i0 */
        public boolean f1518i0 = false;

        /* renamed from: j */
        public int f1519j = -1;

        /* renamed from: j0 */
        public boolean f1520j0 = true;

        /* renamed from: k */
        public int f1521k = -1;

        /* renamed from: l */
        public int f1522l = -1;

        /* renamed from: m */
        public int f1523m = -1;

        /* renamed from: n */
        public int f1524n = -1;

        /* renamed from: o */
        public int f1525o = -1;

        /* renamed from: p */
        public int f1526p = -1;

        /* renamed from: q */
        public int f1527q = -1;

        /* renamed from: r */
        public int f1528r = -1;

        /* renamed from: s */
        public int f1529s = -1;

        /* renamed from: t */
        public int f1530t = -1;

        /* renamed from: u */
        public float f1531u = 0.5f;

        /* renamed from: v */
        public float f1532v = 0.5f;

        /* renamed from: w */
        public String f1533w = null;

        /* renamed from: x */
        public int f1534x = -1;

        /* renamed from: y */
        public int f1535y = 0;

        /* renamed from: z */
        public float f1536z = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1474k0 = sparseIntArray;
            sparseIntArray.append(C0338i.Layout_layout_constraintLeft_toLeftOf, 24);
            f1474k0.append(C0338i.Layout_layout_constraintLeft_toRightOf, 25);
            f1474k0.append(C0338i.Layout_layout_constraintRight_toLeftOf, 28);
            f1474k0.append(C0338i.Layout_layout_constraintRight_toRightOf, 29);
            f1474k0.append(C0338i.Layout_layout_constraintTop_toTopOf, 35);
            f1474k0.append(C0338i.Layout_layout_constraintTop_toBottomOf, 34);
            f1474k0.append(C0338i.Layout_layout_constraintBottom_toTopOf, 4);
            f1474k0.append(C0338i.Layout_layout_constraintBottom_toBottomOf, 3);
            f1474k0.append(C0338i.Layout_layout_constraintBaseline_toBaselineOf, 1);
            f1474k0.append(C0338i.Layout_layout_editor_absoluteX, 6);
            f1474k0.append(C0338i.Layout_layout_editor_absoluteY, 7);
            f1474k0.append(C0338i.Layout_layout_constraintGuide_begin, 17);
            f1474k0.append(C0338i.Layout_layout_constraintGuide_end, 18);
            f1474k0.append(C0338i.Layout_layout_constraintGuide_percent, 19);
            f1474k0.append(C0338i.Layout_android_orientation, 26);
            f1474k0.append(C0338i.Layout_layout_constraintStart_toEndOf, 31);
            f1474k0.append(C0338i.Layout_layout_constraintStart_toStartOf, 32);
            f1474k0.append(C0338i.Layout_layout_constraintEnd_toStartOf, 10);
            f1474k0.append(C0338i.Layout_layout_constraintEnd_toEndOf, 9);
            f1474k0.append(C0338i.Layout_layout_goneMarginLeft, 13);
            f1474k0.append(C0338i.Layout_layout_goneMarginTop, 16);
            f1474k0.append(C0338i.Layout_layout_goneMarginRight, 14);
            f1474k0.append(C0338i.Layout_layout_goneMarginBottom, 11);
            f1474k0.append(C0338i.Layout_layout_goneMarginStart, 15);
            f1474k0.append(C0338i.Layout_layout_goneMarginEnd, 12);
            f1474k0.append(C0338i.Layout_layout_constraintVertical_weight, 38);
            f1474k0.append(C0338i.Layout_layout_constraintHorizontal_weight, 37);
            f1474k0.append(C0338i.Layout_layout_constraintHorizontal_chainStyle, 39);
            f1474k0.append(C0338i.Layout_layout_constraintVertical_chainStyle, 40);
            f1474k0.append(C0338i.Layout_layout_constraintHorizontal_bias, 20);
            f1474k0.append(C0338i.Layout_layout_constraintVertical_bias, 36);
            f1474k0.append(C0338i.Layout_layout_constraintDimensionRatio, 5);
            f1474k0.append(C0338i.Layout_layout_constraintLeft_creator, 76);
            f1474k0.append(C0338i.Layout_layout_constraintTop_creator, 76);
            f1474k0.append(C0338i.Layout_layout_constraintRight_creator, 76);
            f1474k0.append(C0338i.Layout_layout_constraintBottom_creator, 76);
            f1474k0.append(C0338i.Layout_layout_constraintBaseline_creator, 76);
            f1474k0.append(C0338i.Layout_android_layout_marginLeft, 23);
            f1474k0.append(C0338i.Layout_android_layout_marginRight, 27);
            f1474k0.append(C0338i.Layout_android_layout_marginStart, 30);
            f1474k0.append(C0338i.Layout_android_layout_marginEnd, 8);
            f1474k0.append(C0338i.Layout_android_layout_marginTop, 33);
            f1474k0.append(C0338i.Layout_android_layout_marginBottom, 2);
            f1474k0.append(C0338i.Layout_android_layout_width, 22);
            f1474k0.append(C0338i.Layout_android_layout_height, 21);
            f1474k0.append(C0338i.Layout_layout_constraintCircle, 61);
            f1474k0.append(C0338i.Layout_layout_constraintCircleRadius, 62);
            f1474k0.append(C0338i.Layout_layout_constraintCircleAngle, 63);
            f1474k0.append(C0338i.Layout_layout_constraintWidth_percent, 69);
            f1474k0.append(C0338i.Layout_layout_constraintHeight_percent, 70);
            f1474k0.append(C0338i.Layout_chainUseRtl, 71);
            f1474k0.append(C0338i.Layout_barrierDirection, 72);
            f1474k0.append(C0338i.Layout_barrierMargin, 73);
            f1474k0.append(C0338i.Layout_constraint_referenced_ids, 74);
            f1474k0.append(C0338i.Layout_barrierAllowsGoneWidgets, 75);
        }

        /* renamed from: a */
        public void mo2056a(C0329b bVar) {
            this.f1501a = bVar.f1501a;
            this.f1505c = bVar.f1505c;
            this.f1503b = bVar.f1503b;
            this.f1507d = bVar.f1507d;
            this.f1509e = bVar.f1509e;
            this.f1511f = bVar.f1511f;
            this.f1513g = bVar.f1513g;
            this.f1515h = bVar.f1515h;
            this.f1517i = bVar.f1517i;
            this.f1519j = bVar.f1519j;
            this.f1521k = bVar.f1521k;
            this.f1522l = bVar.f1522l;
            this.f1523m = bVar.f1523m;
            this.f1524n = bVar.f1524n;
            this.f1525o = bVar.f1525o;
            this.f1526p = bVar.f1526p;
            this.f1527q = bVar.f1527q;
            this.f1528r = bVar.f1528r;
            this.f1529s = bVar.f1529s;
            this.f1530t = bVar.f1530t;
            this.f1531u = bVar.f1531u;
            this.f1532v = bVar.f1532v;
            this.f1533w = bVar.f1533w;
            this.f1534x = bVar.f1534x;
            this.f1535y = bVar.f1535y;
            this.f1536z = bVar.f1536z;
            this.f1475A = bVar.f1475A;
            this.f1476B = bVar.f1476B;
            this.f1477C = bVar.f1477C;
            this.f1478D = bVar.f1478D;
            this.f1479E = bVar.f1479E;
            this.f1480F = bVar.f1480F;
            this.f1481G = bVar.f1481G;
            this.f1482H = bVar.f1482H;
            this.f1483I = bVar.f1483I;
            this.f1484J = bVar.f1484J;
            this.f1485K = bVar.f1485K;
            this.f1486L = bVar.f1486L;
            this.f1487M = bVar.f1487M;
            this.f1488N = bVar.f1488N;
            this.f1489O = bVar.f1489O;
            this.f1490P = bVar.f1490P;
            this.f1491Q = bVar.f1491Q;
            this.f1492R = bVar.f1492R;
            this.f1493S = bVar.f1493S;
            this.f1494T = bVar.f1494T;
            this.f1495U = bVar.f1495U;
            this.f1496V = bVar.f1496V;
            this.f1497W = bVar.f1497W;
            this.f1498X = bVar.f1498X;
            this.f1499Y = bVar.f1499Y;
            this.f1500Z = bVar.f1500Z;
            this.f1502a0 = bVar.f1502a0;
            this.f1504b0 = bVar.f1504b0;
            this.f1506c0 = bVar.f1506c0;
            this.f1508d0 = bVar.f1508d0;
            this.f1514g0 = bVar.f1514g0;
            int[] iArr = bVar.f1510e0;
            if (iArr != null) {
                this.f1510e0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.f1510e0 = null;
            }
            this.f1512f0 = bVar.f1512f0;
            this.f1516h0 = bVar.f1516h0;
            this.f1518i0 = bVar.f1518i0;
            this.f1520j0 = bVar.f1520j0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo2055a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0338i.Layout);
            this.f1503b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                int i2 = f1474k0.get(index);
                if (i2 == 80) {
                    this.f1516h0 = obtainStyledAttributes.getBoolean(index, this.f1516h0);
                } else if (i2 != 81) {
                    switch (i2) {
                        case 1:
                            this.f1526p = C0327d.m1623b(obtainStyledAttributes, index, this.f1526p);
                            break;
                        case 2:
                            this.f1481G = obtainStyledAttributes.getDimensionPixelSize(index, this.f1481G);
                            break;
                        case 3:
                            this.f1525o = C0327d.m1623b(obtainStyledAttributes, index, this.f1525o);
                            break;
                        case 4:
                            this.f1524n = C0327d.m1623b(obtainStyledAttributes, index, this.f1524n);
                            break;
                        case 5:
                            this.f1533w = obtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            this.f1475A = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1475A);
                            break;
                        case 7:
                            this.f1476B = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1476B);
                            break;
                        case 8:
                            if (Build.VERSION.SDK_INT < 17) {
                                break;
                            } else {
                                this.f1482H = obtainStyledAttributes.getDimensionPixelSize(index, this.f1482H);
                                break;
                            }
                        case 9:
                            this.f1530t = C0327d.m1623b(obtainStyledAttributes, index, this.f1530t);
                            break;
                        case 10:
                            this.f1529s = C0327d.m1623b(obtainStyledAttributes, index, this.f1529s);
                            break;
                        case 11:
                            this.f1487M = obtainStyledAttributes.getDimensionPixelSize(index, this.f1487M);
                            break;
                        case 12:
                            this.f1488N = obtainStyledAttributes.getDimensionPixelSize(index, this.f1488N);
                            break;
                        case 13:
                            this.f1484J = obtainStyledAttributes.getDimensionPixelSize(index, this.f1484J);
                            break;
                        case 14:
                            this.f1486L = obtainStyledAttributes.getDimensionPixelSize(index, this.f1486L);
                            break;
                        case 15:
                            this.f1489O = obtainStyledAttributes.getDimensionPixelSize(index, this.f1489O);
                            break;
                        case 16:
                            this.f1485K = obtainStyledAttributes.getDimensionPixelSize(index, this.f1485K);
                            break;
                        case 17:
                            this.f1509e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1509e);
                            break;
                        case 18:
                            this.f1511f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1511f);
                            break;
                        case 19:
                            this.f1513g = obtainStyledAttributes.getFloat(index, this.f1513g);
                            break;
                        case 20:
                            this.f1531u = obtainStyledAttributes.getFloat(index, this.f1531u);
                            break;
                        case 21:
                            this.f1507d = obtainStyledAttributes.getLayoutDimension(index, this.f1507d);
                            break;
                        case 22:
                            this.f1505c = obtainStyledAttributes.getLayoutDimension(index, this.f1505c);
                            break;
                        case 23:
                            this.f1478D = obtainStyledAttributes.getDimensionPixelSize(index, this.f1478D);
                            break;
                        case 24:
                            this.f1515h = C0327d.m1623b(obtainStyledAttributes, index, this.f1515h);
                            break;
                        case 25:
                            this.f1517i = C0327d.m1623b(obtainStyledAttributes, index, this.f1517i);
                            break;
                        case 26:
                            this.f1477C = obtainStyledAttributes.getInt(index, this.f1477C);
                            break;
                        case 27:
                            this.f1479E = obtainStyledAttributes.getDimensionPixelSize(index, this.f1479E);
                            break;
                        case 28:
                            this.f1519j = C0327d.m1623b(obtainStyledAttributes, index, this.f1519j);
                            break;
                        case 29:
                            this.f1521k = C0327d.m1623b(obtainStyledAttributes, index, this.f1521k);
                            break;
                        case 30:
                            if (Build.VERSION.SDK_INT < 17) {
                                break;
                            } else {
                                this.f1483I = obtainStyledAttributes.getDimensionPixelSize(index, this.f1483I);
                                break;
                            }
                        case 31:
                            this.f1527q = C0327d.m1623b(obtainStyledAttributes, index, this.f1527q);
                            break;
                        case 32:
                            this.f1528r = C0327d.m1623b(obtainStyledAttributes, index, this.f1528r);
                            break;
                        case 33:
                            this.f1480F = obtainStyledAttributes.getDimensionPixelSize(index, this.f1480F);
                            break;
                        case 34:
                            this.f1523m = C0327d.m1623b(obtainStyledAttributes, index, this.f1523m);
                            break;
                        case 35:
                            this.f1522l = C0327d.m1623b(obtainStyledAttributes, index, this.f1522l);
                            break;
                        case 36:
                            this.f1532v = obtainStyledAttributes.getFloat(index, this.f1532v);
                            break;
                        case 37:
                            this.f1491Q = obtainStyledAttributes.getFloat(index, this.f1491Q);
                            break;
                        case 38:
                            this.f1490P = obtainStyledAttributes.getFloat(index, this.f1490P);
                            break;
                        case 39:
                            this.f1492R = obtainStyledAttributes.getInt(index, this.f1492R);
                            break;
                        case 40:
                            this.f1493S = obtainStyledAttributes.getInt(index, this.f1493S);
                            break;
                        default:
                            switch (i2) {
                                case 54:
                                    this.f1494T = obtainStyledAttributes.getInt(index, this.f1494T);
                                    break;
                                case 55:
                                    this.f1495U = obtainStyledAttributes.getInt(index, this.f1495U);
                                    break;
                                case 56:
                                    this.f1496V = obtainStyledAttributes.getDimensionPixelSize(index, this.f1496V);
                                    break;
                                case 57:
                                    this.f1497W = obtainStyledAttributes.getDimensionPixelSize(index, this.f1497W);
                                    break;
                                case 58:
                                    this.f1498X = obtainStyledAttributes.getDimensionPixelSize(index, this.f1498X);
                                    break;
                                case 59:
                                    this.f1499Y = obtainStyledAttributes.getDimensionPixelSize(index, this.f1499Y);
                                    break;
                                default:
                                    switch (i2) {
                                        case 61:
                                            this.f1534x = C0327d.m1623b(obtainStyledAttributes, index, this.f1534x);
                                            break;
                                        case 62:
                                            this.f1535y = obtainStyledAttributes.getDimensionPixelSize(index, this.f1535y);
                                            break;
                                        case 63:
                                            this.f1536z = obtainStyledAttributes.getFloat(index, this.f1536z);
                                            break;
                                        default:
                                            switch (i2) {
                                                case 69:
                                                    this.f1500Z = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 70:
                                                    this.f1502a0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 71:
                                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                    break;
                                                case 72:
                                                    this.f1504b0 = obtainStyledAttributes.getInt(index, this.f1504b0);
                                                    break;
                                                case 73:
                                                    this.f1506c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1506c0);
                                                    break;
                                                case 74:
                                                    this.f1512f0 = obtainStyledAttributes.getString(index);
                                                    break;
                                                case 75:
                                                    this.f1520j0 = obtainStyledAttributes.getBoolean(index, this.f1520j0);
                                                    break;
                                                case 76:
                                                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f1474k0.get(index));
                                                    break;
                                                case 77:
                                                    this.f1514g0 = obtainStyledAttributes.getString(index);
                                                    break;
                                                default:
                                                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f1474k0.get(index));
                                                    break;
                                            }
                                    }
                            }
                    }
                } else {
                    this.f1518i0 = obtainStyledAttributes.getBoolean(index, this.f1518i0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    public void mo2045a(int i, int i2, int i3, int i4) {
        if (!this.f1467c.containsKey(Integer.valueOf(i))) {
            this.f1467c.put(Integer.valueOf(i), new C0328a());
        }
        C0328a aVar = this.f1467c.get(Integer.valueOf(i));
        switch (i2) {
            case 1:
                if (i4 == 1) {
                    C0329b bVar = aVar.f1471d;
                    bVar.f1515h = i3;
                    bVar.f1517i = -1;
                    return;
                } else if (i4 == 2) {
                    C0329b bVar2 = aVar.f1471d;
                    bVar2.f1517i = i3;
                    bVar2.f1515h = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("left to " + m1624b(i4) + " undefined");
                }
            case 2:
                if (i4 == 1) {
                    C0329b bVar3 = aVar.f1471d;
                    bVar3.f1519j = i3;
                    bVar3.f1521k = -1;
                    return;
                } else if (i4 == 2) {
                    C0329b bVar4 = aVar.f1471d;
                    bVar4.f1521k = i3;
                    bVar4.f1519j = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + m1624b(i4) + " undefined");
                }
            case 3:
                if (i4 == 3) {
                    C0329b bVar5 = aVar.f1471d;
                    bVar5.f1522l = i3;
                    bVar5.f1523m = -1;
                    bVar5.f1526p = -1;
                    return;
                } else if (i4 == 4) {
                    C0329b bVar6 = aVar.f1471d;
                    bVar6.f1523m = i3;
                    bVar6.f1522l = -1;
                    bVar6.f1526p = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + m1624b(i4) + " undefined");
                }
            case 4:
                if (i4 == 4) {
                    C0329b bVar7 = aVar.f1471d;
                    bVar7.f1525o = i3;
                    bVar7.f1524n = -1;
                    bVar7.f1526p = -1;
                    return;
                } else if (i4 == 3) {
                    C0329b bVar8 = aVar.f1471d;
                    bVar8.f1524n = i3;
                    bVar8.f1525o = -1;
                    bVar8.f1526p = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + m1624b(i4) + " undefined");
                }
            case 5:
                if (i4 == 5) {
                    C0329b bVar9 = aVar.f1471d;
                    bVar9.f1526p = i3;
                    bVar9.f1525o = -1;
                    bVar9.f1524n = -1;
                    bVar9.f1522l = -1;
                    bVar9.f1523m = -1;
                    return;
                }
                throw new IllegalArgumentException("right to " + m1624b(i4) + " undefined");
            case 6:
                if (i4 == 6) {
                    C0329b bVar10 = aVar.f1471d;
                    bVar10.f1528r = i3;
                    bVar10.f1527q = -1;
                    return;
                } else if (i4 == 7) {
                    C0329b bVar11 = aVar.f1471d;
                    bVar11.f1527q = i3;
                    bVar11.f1528r = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + m1624b(i4) + " undefined");
                }
            case 7:
                if (i4 == 7) {
                    C0329b bVar12 = aVar.f1471d;
                    bVar12.f1530t = i3;
                    bVar12.f1529s = -1;
                    return;
                } else if (i4 == 6) {
                    C0329b bVar13 = aVar.f1471d;
                    bVar13.f1529s = i3;
                    bVar13.f1530t = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + m1624b(i4) + " undefined");
                }
            default:
                throw new IllegalArgumentException(m1624b(i2) + " to " + m1624b(i4) + " unknown");
        }
    }

    /* renamed from: a */
    public void mo2044a(int i, float f) {
        m1618a(i).f1471d.f1532v = f;
    }

    /* renamed from: a */
    private C0328a m1618a(int i) {
        if (!this.f1467c.containsKey(Integer.valueOf(i))) {
            this.f1467c.put(Integer.valueOf(i), new C0328a());
        }
        return this.f1467c.get(Integer.valueOf(i));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x017b, code lost:
        continue;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2047a(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            r9 = this;
            int r0 = r11.getEventType()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r1 = 0
            r2 = r1
        L_0x0006:
            r3 = 1
            if (r0 == r3) goto L_0x018a
            if (r0 == 0) goto L_0x0178
            java.lang.String r4 = "Constraint"
            r5 = 3
            r6 = 2
            if (r0 == r6) goto L_0x0036
            if (r0 == r5) goto L_0x0015
            goto L_0x017b
        L_0x0015:
            java.lang.String r0 = r11.getName()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            java.lang.String r3 = "ConstraintSet"
            boolean r3 = r3.equals(r0)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            if (r3 == 0) goto L_0x0022
            return
        L_0x0022:
            boolean r0 = r0.equalsIgnoreCase(r4)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            if (r0 == 0) goto L_0x017b
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.d$a> r0 = r9.f1467c     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            int r3 = r2.f1468a     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r0.put(r3, r2)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r2 = r1
            goto L_0x017b
        L_0x0036:
            java.lang.String r0 = r11.getName()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r7 = -1
            int r8 = r0.hashCode()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            switch(r8) {
                case -2025855158: goto L_0x0086;
                case -1984451626: goto L_0x007c;
                case -1269513683: goto L_0x0073;
                case -1238332596: goto L_0x0069;
                case -71750448: goto L_0x005f;
                case 1331510167: goto L_0x0055;
                case 1791837707: goto L_0x004b;
                case 1803088381: goto L_0x0043;
                default: goto L_0x0042;
            }     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
        L_0x0042:
            goto L_0x0090
        L_0x0043:
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            if (r0 == 0) goto L_0x0090
            r5 = 0
            goto L_0x0091
        L_0x004b:
            java.lang.String r4 = "CustomAttribute"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            if (r0 == 0) goto L_0x0090
            r5 = 7
            goto L_0x0091
        L_0x0055:
            java.lang.String r4 = "Barrier"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            if (r0 == 0) goto L_0x0090
            r5 = 2
            goto L_0x0091
        L_0x005f:
            java.lang.String r4 = "Guideline"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            if (r0 == 0) goto L_0x0090
            r5 = 1
            goto L_0x0091
        L_0x0069:
            java.lang.String r4 = "Transform"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            if (r0 == 0) goto L_0x0090
            r5 = 4
            goto L_0x0091
        L_0x0073:
            java.lang.String r4 = "PropertySet"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            if (r0 == 0) goto L_0x0090
            goto L_0x0091
        L_0x007c:
            java.lang.String r4 = "Motion"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            if (r0 == 0) goto L_0x0090
            r5 = 6
            goto L_0x0091
        L_0x0086:
            java.lang.String r4 = "Layout"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            if (r0 == 0) goto L_0x0090
            r5 = 5
            goto L_0x0091
        L_0x0090:
            r5 = -1
        L_0x0091:
            java.lang.String r0 = "XML parser error must be within a Constraint "
            switch(r5) {
                case 0: goto L_0x016e;
                case 1: goto L_0x015d;
                case 2: goto L_0x0150;
                case 3: goto L_0x012b;
                case 4: goto L_0x0106;
                case 5: goto L_0x00e0;
                case 6: goto L_0x00ba;
                case 7: goto L_0x0098;
                default: goto L_0x0096;
            }
        L_0x0096:
            goto L_0x017b
        L_0x0098:
            if (r2 == 0) goto L_0x00a1
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.a> r0 = r2.f1473f     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            androidx.constraintlayout.widget.C0320a.m1596a(r10, r11, r0)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            goto L_0x017b
        L_0x00a1:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            throw r10     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
        L_0x00ba:
            if (r2 == 0) goto L_0x00c7
            androidx.constraintlayout.widget.d$c r0 = r2.f1470c     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r0.mo2057a(r10, r3)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            goto L_0x017b
        L_0x00c7:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            throw r10     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
        L_0x00e0:
            if (r2 == 0) goto L_0x00ed
            androidx.constraintlayout.widget.d$b r0 = r2.f1471d     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r0.mo2055a(r10, r3)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            goto L_0x017b
        L_0x00ed:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            throw r10     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
        L_0x0106:
            if (r2 == 0) goto L_0x0112
            androidx.constraintlayout.widget.d$e r0 = r2.f1472e     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r0.mo2061a(r10, r3)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            goto L_0x017b
        L_0x0112:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            throw r10     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
        L_0x012b:
            if (r2 == 0) goto L_0x0137
            androidx.constraintlayout.widget.d$d r0 = r2.f1469b     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r0.mo2059a(r10, r3)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            goto L_0x017b
        L_0x0137:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            throw r10     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
        L_0x0150:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            androidx.constraintlayout.widget.d$a r0 = r9.m1619a((android.content.Context) r10, (android.util.AttributeSet) r0)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            androidx.constraintlayout.widget.d$b r2 = r0.f1471d     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r2.f1508d0 = r3     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            goto L_0x0176
        L_0x015d:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            androidx.constraintlayout.widget.d$a r0 = r9.m1619a((android.content.Context) r10, (android.util.AttributeSet) r0)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            androidx.constraintlayout.widget.d$b r2 = r0.f1471d     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r2.f1501a = r3     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            androidx.constraintlayout.widget.d$b r2 = r0.f1471d     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r2.f1503b = r3     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            goto L_0x0176
        L_0x016e:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            androidx.constraintlayout.widget.d$a r0 = r9.m1619a((android.content.Context) r10, (android.util.AttributeSet) r0)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
        L_0x0176:
            r2 = r0
            goto L_0x017b
        L_0x0178:
            r11.getName()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
        L_0x017b:
            int r0 = r11.next()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            goto L_0x0006
        L_0x0181:
            r10 = move-exception
            r10.printStackTrace()
            goto L_0x018a
        L_0x0186:
            r10 = move-exception
            r10.printStackTrace()
        L_0x018a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.C0327d.mo2047a(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    /* renamed from: a */
    private C0328a m1619a(Context context, AttributeSet attributeSet) {
        C0328a aVar = new C0328a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0338i.Constraint);
        m1620a(context, aVar, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    /* renamed from: a */
    private void m1620a(Context context, C0328a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            if (!(index == C0338i.Constraint_android_id || C0338i.Constraint_android_layout_marginStart == index || C0338i.Constraint_android_layout_marginEnd == index)) {
                aVar.f1470c.f1538a = true;
                aVar.f1471d.f1503b = true;
                aVar.f1469b.f1545a = true;
                aVar.f1472e.f1551a = true;
            }
            switch (f1464e.get(index)) {
                case 1:
                    C0329b bVar = aVar.f1471d;
                    bVar.f1526p = m1623b(typedArray, index, bVar.f1526p);
                    break;
                case 2:
                    C0329b bVar2 = aVar.f1471d;
                    bVar2.f1481G = typedArray.getDimensionPixelSize(index, bVar2.f1481G);
                    break;
                case 3:
                    C0329b bVar3 = aVar.f1471d;
                    bVar3.f1525o = m1623b(typedArray, index, bVar3.f1525o);
                    break;
                case 4:
                    C0329b bVar4 = aVar.f1471d;
                    bVar4.f1524n = m1623b(typedArray, index, bVar4.f1524n);
                    break;
                case 5:
                    aVar.f1471d.f1533w = typedArray.getString(index);
                    break;
                case 6:
                    C0329b bVar5 = aVar.f1471d;
                    bVar5.f1475A = typedArray.getDimensionPixelOffset(index, bVar5.f1475A);
                    break;
                case 7:
                    C0329b bVar6 = aVar.f1471d;
                    bVar6.f1476B = typedArray.getDimensionPixelOffset(index, bVar6.f1476B);
                    break;
                case 8:
                    if (Build.VERSION.SDK_INT < 17) {
                        break;
                    } else {
                        C0329b bVar7 = aVar.f1471d;
                        bVar7.f1482H = typedArray.getDimensionPixelSize(index, bVar7.f1482H);
                        break;
                    }
                case 9:
                    C0329b bVar8 = aVar.f1471d;
                    bVar8.f1530t = m1623b(typedArray, index, bVar8.f1530t);
                    break;
                case 10:
                    C0329b bVar9 = aVar.f1471d;
                    bVar9.f1529s = m1623b(typedArray, index, bVar9.f1529s);
                    break;
                case 11:
                    C0329b bVar10 = aVar.f1471d;
                    bVar10.f1487M = typedArray.getDimensionPixelSize(index, bVar10.f1487M);
                    break;
                case 12:
                    C0329b bVar11 = aVar.f1471d;
                    bVar11.f1488N = typedArray.getDimensionPixelSize(index, bVar11.f1488N);
                    break;
                case 13:
                    C0329b bVar12 = aVar.f1471d;
                    bVar12.f1484J = typedArray.getDimensionPixelSize(index, bVar12.f1484J);
                    break;
                case 14:
                    C0329b bVar13 = aVar.f1471d;
                    bVar13.f1486L = typedArray.getDimensionPixelSize(index, bVar13.f1486L);
                    break;
                case 15:
                    C0329b bVar14 = aVar.f1471d;
                    bVar14.f1489O = typedArray.getDimensionPixelSize(index, bVar14.f1489O);
                    break;
                case 16:
                    C0329b bVar15 = aVar.f1471d;
                    bVar15.f1485K = typedArray.getDimensionPixelSize(index, bVar15.f1485K);
                    break;
                case 17:
                    C0329b bVar16 = aVar.f1471d;
                    bVar16.f1509e = typedArray.getDimensionPixelOffset(index, bVar16.f1509e);
                    break;
                case 18:
                    C0329b bVar17 = aVar.f1471d;
                    bVar17.f1511f = typedArray.getDimensionPixelOffset(index, bVar17.f1511f);
                    break;
                case 19:
                    C0329b bVar18 = aVar.f1471d;
                    bVar18.f1513g = typedArray.getFloat(index, bVar18.f1513g);
                    break;
                case 20:
                    C0329b bVar19 = aVar.f1471d;
                    bVar19.f1531u = typedArray.getFloat(index, bVar19.f1531u);
                    break;
                case 21:
                    C0329b bVar20 = aVar.f1471d;
                    bVar20.f1507d = typedArray.getLayoutDimension(index, bVar20.f1507d);
                    break;
                case 22:
                    C0331d dVar = aVar.f1469b;
                    dVar.f1546b = typedArray.getInt(index, dVar.f1546b);
                    C0331d dVar2 = aVar.f1469b;
                    dVar2.f1546b = f1463d[dVar2.f1546b];
                    break;
                case 23:
                    C0329b bVar21 = aVar.f1471d;
                    bVar21.f1505c = typedArray.getLayoutDimension(index, bVar21.f1505c);
                    break;
                case 24:
                    C0329b bVar22 = aVar.f1471d;
                    bVar22.f1478D = typedArray.getDimensionPixelSize(index, bVar22.f1478D);
                    break;
                case 25:
                    C0329b bVar23 = aVar.f1471d;
                    bVar23.f1515h = m1623b(typedArray, index, bVar23.f1515h);
                    break;
                case 26:
                    C0329b bVar24 = aVar.f1471d;
                    bVar24.f1517i = m1623b(typedArray, index, bVar24.f1517i);
                    break;
                case 27:
                    C0329b bVar25 = aVar.f1471d;
                    bVar25.f1477C = typedArray.getInt(index, bVar25.f1477C);
                    break;
                case 28:
                    C0329b bVar26 = aVar.f1471d;
                    bVar26.f1479E = typedArray.getDimensionPixelSize(index, bVar26.f1479E);
                    break;
                case 29:
                    C0329b bVar27 = aVar.f1471d;
                    bVar27.f1519j = m1623b(typedArray, index, bVar27.f1519j);
                    break;
                case 30:
                    C0329b bVar28 = aVar.f1471d;
                    bVar28.f1521k = m1623b(typedArray, index, bVar28.f1521k);
                    break;
                case 31:
                    if (Build.VERSION.SDK_INT < 17) {
                        break;
                    } else {
                        C0329b bVar29 = aVar.f1471d;
                        bVar29.f1483I = typedArray.getDimensionPixelSize(index, bVar29.f1483I);
                        break;
                    }
                case 32:
                    C0329b bVar30 = aVar.f1471d;
                    bVar30.f1527q = m1623b(typedArray, index, bVar30.f1527q);
                    break;
                case 33:
                    C0329b bVar31 = aVar.f1471d;
                    bVar31.f1528r = m1623b(typedArray, index, bVar31.f1528r);
                    break;
                case 34:
                    C0329b bVar32 = aVar.f1471d;
                    bVar32.f1480F = typedArray.getDimensionPixelSize(index, bVar32.f1480F);
                    break;
                case 35:
                    C0329b bVar33 = aVar.f1471d;
                    bVar33.f1523m = m1623b(typedArray, index, bVar33.f1523m);
                    break;
                case 36:
                    C0329b bVar34 = aVar.f1471d;
                    bVar34.f1522l = m1623b(typedArray, index, bVar34.f1522l);
                    break;
                case 37:
                    C0329b bVar35 = aVar.f1471d;
                    bVar35.f1532v = typedArray.getFloat(index, bVar35.f1532v);
                    break;
                case 38:
                    aVar.f1468a = typedArray.getResourceId(index, aVar.f1468a);
                    break;
                case 39:
                    C0329b bVar36 = aVar.f1471d;
                    bVar36.f1491Q = typedArray.getFloat(index, bVar36.f1491Q);
                    break;
                case 40:
                    C0329b bVar37 = aVar.f1471d;
                    bVar37.f1490P = typedArray.getFloat(index, bVar37.f1490P);
                    break;
                case 41:
                    C0329b bVar38 = aVar.f1471d;
                    bVar38.f1492R = typedArray.getInt(index, bVar38.f1492R);
                    break;
                case 42:
                    C0329b bVar39 = aVar.f1471d;
                    bVar39.f1493S = typedArray.getInt(index, bVar39.f1493S);
                    break;
                case 43:
                    C0331d dVar3 = aVar.f1469b;
                    dVar3.f1548d = typedArray.getFloat(index, dVar3.f1548d);
                    break;
                case 44:
                    if (Build.VERSION.SDK_INT < 21) {
                        break;
                    } else {
                        C0332e eVar = aVar.f1472e;
                        eVar.f1562l = true;
                        eVar.f1563m = typedArray.getDimension(index, eVar.f1563m);
                        break;
                    }
                case 45:
                    C0332e eVar2 = aVar.f1472e;
                    eVar2.f1553c = typedArray.getFloat(index, eVar2.f1553c);
                    break;
                case 46:
                    C0332e eVar3 = aVar.f1472e;
                    eVar3.f1554d = typedArray.getFloat(index, eVar3.f1554d);
                    break;
                case 47:
                    C0332e eVar4 = aVar.f1472e;
                    eVar4.f1555e = typedArray.getFloat(index, eVar4.f1555e);
                    break;
                case 48:
                    C0332e eVar5 = aVar.f1472e;
                    eVar5.f1556f = typedArray.getFloat(index, eVar5.f1556f);
                    break;
                case 49:
                    C0332e eVar6 = aVar.f1472e;
                    eVar6.f1557g = typedArray.getDimension(index, eVar6.f1557g);
                    break;
                case 50:
                    C0332e eVar7 = aVar.f1472e;
                    eVar7.f1558h = typedArray.getDimension(index, eVar7.f1558h);
                    break;
                case 51:
                    C0332e eVar8 = aVar.f1472e;
                    eVar8.f1559i = typedArray.getDimension(index, eVar8.f1559i);
                    break;
                case 52:
                    C0332e eVar9 = aVar.f1472e;
                    eVar9.f1560j = typedArray.getDimension(index, eVar9.f1560j);
                    break;
                case 53:
                    if (Build.VERSION.SDK_INT < 21) {
                        break;
                    } else {
                        C0332e eVar10 = aVar.f1472e;
                        eVar10.f1561k = typedArray.getDimension(index, eVar10.f1561k);
                        break;
                    }
                case 54:
                    C0329b bVar40 = aVar.f1471d;
                    bVar40.f1494T = typedArray.getInt(index, bVar40.f1494T);
                    break;
                case 55:
                    C0329b bVar41 = aVar.f1471d;
                    bVar41.f1495U = typedArray.getInt(index, bVar41.f1495U);
                    break;
                case 56:
                    C0329b bVar42 = aVar.f1471d;
                    bVar42.f1496V = typedArray.getDimensionPixelSize(index, bVar42.f1496V);
                    break;
                case 57:
                    C0329b bVar43 = aVar.f1471d;
                    bVar43.f1497W = typedArray.getDimensionPixelSize(index, bVar43.f1497W);
                    break;
                case 58:
                    C0329b bVar44 = aVar.f1471d;
                    bVar44.f1498X = typedArray.getDimensionPixelSize(index, bVar44.f1498X);
                    break;
                case 59:
                    C0329b bVar45 = aVar.f1471d;
                    bVar45.f1499Y = typedArray.getDimensionPixelSize(index, bVar45.f1499Y);
                    break;
                case 60:
                    C0332e eVar11 = aVar.f1472e;
                    eVar11.f1552b = typedArray.getFloat(index, eVar11.f1552b);
                    break;
                case 61:
                    C0329b bVar46 = aVar.f1471d;
                    bVar46.f1534x = m1623b(typedArray, index, bVar46.f1534x);
                    break;
                case 62:
                    C0329b bVar47 = aVar.f1471d;
                    bVar47.f1535y = typedArray.getDimensionPixelSize(index, bVar47.f1535y);
                    break;
                case 63:
                    C0329b bVar48 = aVar.f1471d;
                    bVar48.f1536z = typedArray.getFloat(index, bVar48.f1536z);
                    break;
                case 64:
                    C0330c cVar = aVar.f1470c;
                    cVar.f1539b = m1623b(typedArray, index, cVar.f1539b);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type != 3) {
                        aVar.f1470c.f1540c = C4883a.f8392b[typedArray.getInteger(index, 0)];
                        break;
                    } else {
                        aVar.f1470c.f1540c = typedArray.getString(index);
                        break;
                    }
                case 66:
                    aVar.f1470c.f1542e = typedArray.getInt(index, 0);
                    break;
                case 67:
                    C0330c cVar2 = aVar.f1470c;
                    cVar2.f1544g = typedArray.getFloat(index, cVar2.f1544g);
                    break;
                case 68:
                    C0331d dVar4 = aVar.f1469b;
                    dVar4.f1549e = typedArray.getFloat(index, dVar4.f1549e);
                    break;
                case 69:
                    aVar.f1471d.f1500Z = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    aVar.f1471d.f1502a0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    C0329b bVar49 = aVar.f1471d;
                    bVar49.f1504b0 = typedArray.getInt(index, bVar49.f1504b0);
                    break;
                case 73:
                    C0329b bVar50 = aVar.f1471d;
                    bVar50.f1506c0 = typedArray.getDimensionPixelSize(index, bVar50.f1506c0);
                    break;
                case 74:
                    aVar.f1471d.f1512f0 = typedArray.getString(index);
                    break;
                case 75:
                    C0329b bVar51 = aVar.f1471d;
                    bVar51.f1520j0 = typedArray.getBoolean(index, bVar51.f1520j0);
                    break;
                case 76:
                    C0330c cVar3 = aVar.f1470c;
                    cVar3.f1541d = typedArray.getInt(index, cVar3.f1541d);
                    break;
                case 77:
                    aVar.f1471d.f1514g0 = typedArray.getString(index);
                    break;
                case 78:
                    C0331d dVar5 = aVar.f1469b;
                    dVar5.f1547c = typedArray.getInt(index, dVar5.f1547c);
                    break;
                case 79:
                    C0330c cVar4 = aVar.f1470c;
                    cVar4.f1543f = typedArray.getFloat(index, cVar4.f1543f);
                    break;
                case 80:
                    C0329b bVar52 = aVar.f1471d;
                    bVar52.f1516h0 = typedArray.getBoolean(index, bVar52.f1516h0);
                    break;
                case 81:
                    C0329b bVar53 = aVar.f1471d;
                    bVar53.f1518i0 = typedArray.getBoolean(index, bVar53.f1518i0);
                    break;
                case 82:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f1464e.get(index));
                    break;
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f1464e.get(index));
                    break;
            }
        }
    }

    /* renamed from: a */
    private int[] m1622a(View view, String str) {
        int i;
        Object a;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            try {
                i = C0337h.class.getField(trim).getInt((Object) null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, DeepLinkIntentReceiver.DeepLinksKeys.f3452ID, context.getPackageName());
            }
            if (i == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (a = ((ConstraintLayout) view.getParent()).mo1977a(0, trim)) != null && (a instanceof Integer)) {
                i = ((Integer) a).intValue();
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        return i3 != split.length ? Arrays.copyOf(iArr, i3) : iArr;
    }
}
