package p015cm.aptoide.p016pt.store.view;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.store.view.GridStoreMetaWidget;
import p015cm.aptoide.p016pt.themes.ThemeManager;

/* renamed from: cm.aptoide.pt.store.view.BadgeDialogFactory */
public class BadgeDialogFactory {
    public static final float MEDAL_SCALE = 1.25f;
    private final Context context;
    private int normalMedalSize;
    private int selectedMedalSize;
    private final ThemeManager themeManager;

    /* renamed from: cm.aptoide.pt.store.view.BadgeDialogFactory$1 */
    static /* synthetic */ class C42531 {

        /* renamed from: $SwitchMap$cm$aptoide$pt$store$view$GridStoreMetaWidget$HomeMeta$Badge */
        static final /* synthetic */ int[] f7347x2685ebd;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                cm.aptoide.pt.store.view.GridStoreMetaWidget$HomeMeta$Badge[] r0 = p015cm.aptoide.p016pt.store.view.GridStoreMetaWidget.HomeMeta.Badge.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f7347x2685ebd = r0
                cm.aptoide.pt.store.view.GridStoreMetaWidget$HomeMeta$Badge r1 = p015cm.aptoide.p016pt.store.view.GridStoreMetaWidget.HomeMeta.Badge.NONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f7347x2685ebd     // Catch:{ NoSuchFieldError -> 0x001d }
                cm.aptoide.pt.store.view.GridStoreMetaWidget$HomeMeta$Badge r1 = p015cm.aptoide.p016pt.store.view.GridStoreMetaWidget.HomeMeta.Badge.BRONZE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f7347x2685ebd     // Catch:{ NoSuchFieldError -> 0x0028 }
                cm.aptoide.pt.store.view.GridStoreMetaWidget$HomeMeta$Badge r1 = p015cm.aptoide.p016pt.store.view.GridStoreMetaWidget.HomeMeta.Badge.SILVER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f7347x2685ebd     // Catch:{ NoSuchFieldError -> 0x0033 }
                cm.aptoide.pt.store.view.GridStoreMetaWidget$HomeMeta$Badge r1 = p015cm.aptoide.p016pt.store.view.GridStoreMetaWidget.HomeMeta.Badge.GOLD     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f7347x2685ebd     // Catch:{ NoSuchFieldError -> 0x003e }
                cm.aptoide.pt.store.view.GridStoreMetaWidget$HomeMeta$Badge r1 = p015cm.aptoide.p016pt.store.view.GridStoreMetaWidget.HomeMeta.Badge.PLATINUM     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.store.view.BadgeDialogFactory.C42531.<clinit>():void");
        }
    }

    public BadgeDialogFactory(Context context2, ThemeManager themeManager2) {
        this.context = context2;
        this.themeManager = themeManager2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x03c9  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x03d8  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0483  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x04a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void createViewModel(p015cm.aptoide.p016pt.store.view.GridStoreMetaWidget.HomeMeta.Badge r48, android.content.res.Resources r49, p015cm.aptoide.p016pt.store.view.GridStoreMetaWidget.HomeMeta.Badge r50, android.view.View r51, boolean r52) {
        /*
            r47 = this;
            r6 = r47
            r7 = r48
            r8 = r49
            r9 = r50
            r10 = r51
            r0 = 2131296840(0x7f090248, float:1.8211608E38)
            android.view.View r0 = r10.findViewById(r0)
            r11 = r0
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            r0 = 2131296784(0x7f090210, float:1.8211494E38)
            android.view.View r0 = r10.findViewById(r0)
            r1 = 2131296942(0x7f0902ae, float:1.8211815E38)
            android.view.View r1 = r10.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r2 = 2131297341(0x7f09043d, float:1.8212624E38)
            android.view.View r2 = r10.findViewById(r2)
            r12 = r2
            android.widget.ImageView r12 = (android.widget.ImageView) r12
            r2 = 2131296490(0x7f0900ea, float:1.8210898E38)
            android.view.View r2 = r10.findViewById(r2)
            r13 = r2
            android.widget.ImageView r13 = (android.widget.ImageView) r13
            r2 = 2131297233(0x7f0903d1, float:1.8212405E38)
            android.view.View r2 = r10.findViewById(r2)
            r14 = r2
            android.widget.ImageView r14 = (android.widget.ImageView) r14
            r2 = 2131296823(0x7f090237, float:1.8211574E38)
            android.view.View r2 = r10.findViewById(r2)
            r15 = r2
            android.widget.ImageView r15 = (android.widget.ImageView) r15
            r2 = 2131297081(0x7f090339, float:1.8212097E38)
            android.view.View r2 = r10.findViewById(r2)
            r5 = r2
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r2 = 2131297342(0x7f09043e, float:1.8212626E38)
            android.view.View r4 = r10.findViewById(r2)
            r2 = 2131296491(0x7f0900eb, float:1.82109E38)
            android.view.View r3 = r10.findViewById(r2)
            r2 = 2131297234(0x7f0903d2, float:1.8212407E38)
            android.view.View r2 = r10.findViewById(r2)
            r16 = r2
            r2 = 2131296824(0x7f090238, float:1.8211576E38)
            android.view.View r2 = r10.findViewById(r2)
            r17 = r2
            r2 = 2131297082(0x7f09033a, float:1.8212099E38)
            android.view.View r2 = r10.findViewById(r2)
            r18 = r2
            r2 = 2131296943(0x7f0902af, float:1.8211817E38)
            android.view.View r2 = r10.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r19 = r3
            r3 = 2131296582(0x7f090146, float:1.8211085E38)
            android.view.View r3 = r10.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r20 = r4
            r4 = 2131297407(0x7f09047f, float:1.8212758E38)
            android.view.View r4 = r10.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r21 = r5
            r5 = 2131296663(0x7f090197, float:1.821125E38)
            android.view.View r5 = r10.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r22 = r15
            r15 = 2131296783(0x7f09020f, float:1.8211492E38)
            android.view.View r15 = r10.findViewById(r15)
            android.widget.TextView r15 = (android.widget.TextView) r15
            r23 = r14
            r14 = 2131297164(0x7f09038c, float:1.8212265E38)
            android.view.View r14 = r10.findViewById(r14)
            android.widget.TextView r14 = (android.widget.TextView) r14
            r24 = r13
            r13 = 2131297098(0x7f09034a, float:1.8212131E38)
            android.view.View r13 = r10.findViewById(r13)
            r25 = r13
            r13 = 2131297099(0x7f09034b, float:1.8212133E38)
            android.view.View r13 = r10.findViewById(r13)
            r26 = r13
            r13 = 2131297100(0x7f09034c, float:1.8212135E38)
            android.view.View r13 = r10.findViewById(r13)
            r27 = r13
            r13 = 2131297101(0x7f09034d, float:1.8212137E38)
            android.view.View r13 = r10.findViewById(r13)
            int[] r28 = p015cm.aptoide.p016pt.store.view.BadgeDialogFactory.C42531.f7347x2685ebd
            int r29 = r50.ordinal()
            r10 = r28[r29]
            r28 = r13
            java.lang.String r29 = " 💪"
            r30 = 2131099853(0x7f0600cd, float:1.781207E38)
            java.lang.String r32 = "🎉"
            r13 = 2
            if (r10 == r13) goto L_0x02e3
            r13 = 3
            if (r10 == r13) goto L_0x025b
            r13 = 4
            if (r10 == r13) goto L_0x01d5
            r13 = 5
            if (r10 == r13) goto L_0x014a
            r13 = 2131100029(0x7f06017d, float:1.7812428E38)
            r10 = 2131231594(0x7f08036a, float:1.8079273E38)
            r1.setImageResource(r10)
            r1 = 2131820794(0x7f1100fa, float:1.9274313E38)
            java.lang.String r1 = r8.getString(r1)
            r2.setText(r1)
            r1 = 2131820788(0x7f1100f4, float:1.92743E38)
            r2 = 1
            java.lang.Object[] r10 = new java.lang.Object[r2]
            r2 = 0
            r10[r2] = r32
            java.lang.String r1 = r8.getString(r1, r10)
            r3.setText(r1)
            r1 = 2131820789(0x7f1100f5, float:1.9274303E38)
            java.lang.String r1 = r8.getString(r1)
            r4.setText(r1)
            r4.setVisibility(r2)
            r1 = 8
            r5.setVisibility(r1)
            r15.setVisibility(r1)
            r0.setVisibility(r1)
            r14.setVisibility(r1)
            r31 = r12
            r0 = 0
            r1 = 0
            r10 = 2131100028(0x7f06017c, float:1.7812426E38)
            r12 = 1
        L_0x0146:
            r33 = 0
            goto L_0x036b
        L_0x014a:
            r10 = 0
            boolean r13 = r6.isRankLocked(r7, r9)
            if (r13 == 0) goto L_0x016c
            r13 = 2131231426(0x7f0802c2, float:1.8078933E38)
            r1.setImageResource(r13)
            r1 = 2131820781(0x7f1100ed, float:1.9274287E38)
            r31 = r12
            r13 = 1
            java.lang.Object[] r12 = new java.lang.Object[r13]
            r12[r10] = r29
            java.lang.String r1 = r8.getString(r1, r12)
            r3.setText(r1)
            r1 = 2131099854(0x7f0600ce, float:1.7812073E38)
            goto L_0x0189
        L_0x016c:
            r31 = r12
            r13 = 1
            r12 = 2131231516(0x7f08031c, float:1.8079115E38)
            r1.setImageResource(r12)
            r30 = 2131099979(0x7f06014b, float:1.7812326E38)
            r12 = 2131820776(0x7f1100e8, float:1.9274276E38)
            java.lang.Object[] r1 = new java.lang.Object[r13]
            r1[r10] = r32
            java.lang.String r1 = r8.getString(r12, r1)
            r3.setText(r1)
            r1 = 2131099980(0x7f06014c, float:1.7812329E38)
        L_0x0189:
            r12 = 2131820792(0x7f1100f8, float:1.9274309E38)
            java.lang.String r12 = r8.getString(r12)
            r2.setText(r12)
            r2 = 2131820777(0x7f1100e9, float:1.9274279E38)
            java.lang.String r2 = r8.getString(r2)
            r4.setText(r2)
            r4.setVisibility(r10)
            r5.setVisibility(r10)
            r15.setVisibility(r10)
            r0.setVisibility(r10)
            r14.setVisibility(r10)
            r0 = 2131820778(0x7f1100ea, float:1.927428E38)
            java.lang.String r0 = r8.getString(r0)
            r5.setText(r0)
            r0 = 2131820779(0x7f1100eb, float:1.9274283E38)
            java.lang.String r0 = r8.getString(r0)
            r15.setText(r0)
            r0 = 2131820780(0x7f1100ec, float:1.9274285E38)
            java.lang.String r0 = r8.getString(r0)
            r14.setText(r0)
            r13 = r1
            r10 = r30
            r0 = 0
            r1 = 0
            r2 = 0
            r12 = 0
            r33 = 1
            goto L_0x036b
        L_0x01d5:
            r31 = r12
            boolean r10 = r6.isRankLocked(r7, r9)
            if (r10 == 0) goto L_0x01f7
            r10 = 2131231426(0x7f0802c2, float:1.8078933E38)
            r1.setImageResource(r10)
            r1 = 2131820775(0x7f1100e7, float:1.9274274E38)
            r10 = 1
            java.lang.Object[] r12 = new java.lang.Object[r10]
            r13 = 0
            r12[r13] = r29
            java.lang.String r1 = r8.getString(r1, r12)
            r3.setText(r1)
            r1 = 2131099854(0x7f0600ce, float:1.7812073E38)
            goto L_0x0213
        L_0x01f7:
            r10 = 1
            r13 = 0
            r12 = 2131231117(0x7f08018d, float:1.8078306E38)
            r1.setImageResource(r12)
            r30 = 2131099839(0x7f0600bf, float:1.7812043E38)
            r12 = 2131820770(0x7f1100e2, float:1.9274264E38)
            java.lang.Object[] r1 = new java.lang.Object[r10]
            r1[r13] = r32
            java.lang.String r1 = r8.getString(r12, r1)
            r3.setText(r1)
            r1 = 2131099840(0x7f0600c0, float:1.7812045E38)
        L_0x0213:
            r10 = 2131820791(0x7f1100f7, float:1.9274307E38)
            java.lang.String r10 = r8.getString(r10)
            r2.setText(r10)
            r2 = 2131820771(0x7f1100e3, float:1.9274266E38)
            java.lang.String r2 = r8.getString(r2)
            r4.setText(r2)
            r4.setVisibility(r13)
            r5.setVisibility(r13)
            r15.setVisibility(r13)
            r0.setVisibility(r13)
            r14.setVisibility(r13)
            r0 = 2131820772(0x7f1100e4, float:1.9274268E38)
            java.lang.String r0 = r8.getString(r0)
            r5.setText(r0)
            r0 = 2131820773(0x7f1100e5, float:1.927427E38)
            java.lang.String r0 = r8.getString(r0)
            r15.setText(r0)
            r0 = 2131820774(0x7f1100e6, float:1.9274272E38)
            java.lang.String r0 = r8.getString(r0)
            r14.setText(r0)
            r13 = r1
            r10 = r30
            r0 = 1
            r1 = 0
            goto L_0x02e0
        L_0x025b:
            r31 = r12
            boolean r10 = r6.isRankLocked(r7, r9)
            if (r10 == 0) goto L_0x027d
            r10 = 2131231426(0x7f0802c2, float:1.8078933E38)
            r1.setImageResource(r10)
            r1 = 2131820787(0x7f1100f3, float:1.9274299E38)
            r10 = 1
            java.lang.Object[] r12 = new java.lang.Object[r10]
            r13 = 0
            r12[r13] = r29
            java.lang.String r1 = r8.getString(r1, r12)
            r3.setText(r1)
            r1 = 2131099854(0x7f0600ce, float:1.7812073E38)
            goto L_0x0299
        L_0x027d:
            r10 = 1
            r13 = 0
            r12 = 2131231561(0x7f080349, float:1.8079206E38)
            r1.setImageResource(r12)
            r30 = 2131100012(0x7f06016c, float:1.7812393E38)
            r12 = 2131820782(0x7f1100ee, float:1.9274289E38)
            java.lang.Object[] r1 = new java.lang.Object[r10]
            r1[r13] = r32
            java.lang.String r1 = r8.getString(r12, r1)
            r3.setText(r1)
            r1 = 2131100013(0x7f06016d, float:1.7812395E38)
        L_0x0299:
            r10 = 2131820793(0x7f1100f9, float:1.927431E38)
            java.lang.String r10 = r8.getString(r10)
            r2.setText(r10)
            r2 = 2131820783(0x7f1100ef, float:1.927429E38)
            java.lang.String r2 = r8.getString(r2)
            r4.setText(r2)
            r2 = 2131820784(0x7f1100f0, float:1.9274293E38)
            java.lang.String r2 = r8.getString(r2)
            r5.setText(r2)
            r2 = 2131820785(0x7f1100f1, float:1.9274295E38)
            java.lang.String r2 = r8.getString(r2)
            r15.setText(r2)
            r2 = 2131820786(0x7f1100f2, float:1.9274297E38)
            java.lang.String r2 = r8.getString(r2)
            r14.setText(r2)
            r10 = 0
            r4.setVisibility(r10)
            r5.setVisibility(r10)
            r15.setVisibility(r10)
            r0.setVisibility(r10)
            r14.setVisibility(r10)
            r13 = r1
            r10 = r30
            r0 = 0
            r1 = 1
        L_0x02e0:
            r2 = 0
            goto L_0x0368
        L_0x02e3:
            r31 = r12
            r10 = 0
            boolean r12 = r6.isRankLocked(r7, r9)
            if (r12 == 0) goto L_0x0305
            r12 = 2131231426(0x7f0802c2, float:1.8078933E38)
            r1.setImageResource(r12)
            r1 = 2131820769(0x7f1100e1, float:1.9274262E38)
            r12 = 1
            java.lang.Object[] r13 = new java.lang.Object[r12]
            r13[r10] = r29
            java.lang.String r1 = r8.getString(r1, r13)
            r3.setText(r1)
            r1 = 2131099854(0x7f0600ce, float:1.7812073E38)
            goto L_0x0320
        L_0x0305:
            r12 = 1
            r13 = 2131230937(0x7f0800d9, float:1.807794E38)
            r1.setImageResource(r13)
            r30 = 2131099718(0x7f060046, float:1.7811797E38)
            r13 = 2131820764(0x7f1100dc, float:1.9274252E38)
            java.lang.Object[] r1 = new java.lang.Object[r12]
            r1[r10] = r32
            java.lang.String r1 = r8.getString(r13, r1)
            r3.setText(r1)
            r1 = 2131099719(0x7f060047, float:1.78118E38)
        L_0x0320:
            r10 = 2131820790(0x7f1100f6, float:1.9274305E38)
            java.lang.String r10 = r8.getString(r10)
            r2.setText(r10)
            r2 = 2131820765(0x7f1100dd, float:1.9274254E38)
            java.lang.String r2 = r8.getString(r2)
            r4.setText(r2)
            r2 = 2131820766(0x7f1100de, float:1.9274256E38)
            java.lang.String r2 = r8.getString(r2)
            r5.setText(r2)
            r2 = 2131820767(0x7f1100df, float:1.9274258E38)
            java.lang.String r2 = r8.getString(r2)
            r15.setText(r2)
            r2 = 2131820768(0x7f1100e0, float:1.927426E38)
            java.lang.String r2 = r8.getString(r2)
            r14.setText(r2)
            r2 = 0
            r4.setVisibility(r2)
            r5.setVisibility(r2)
            r15.setVisibility(r2)
            r0.setVisibility(r2)
            r14.setVisibility(r2)
            r13 = r1
            r10 = r30
            r0 = 0
            r1 = 0
            r2 = 1
        L_0x0368:
            r12 = 0
            goto L_0x0146
        L_0x036b:
            cm.aptoide.pt.store.view.GridStoreMetaWidget$HomeMeta$Badge r29 = p015cm.aptoide.p016pt.store.view.GridStoreMetaWidget.HomeMeta.Badge.NONE
            r34 = r0
            r0 = r47
            r35 = r1
            r1 = r10
            r39 = r2
            r36 = r16
            r37 = r17
            r38 = r18
            r2 = r13
            r41 = r3
            r40 = r19
            r3 = r48
            r16 = r12
            r42 = r20
            r12 = r4
            r4 = r50
            r17 = r14
            r43 = r21
            r14 = r5
            r5 = r29
            int r5 = r0.getProgressColor(r1, r2, r3, r4, r5)
            cm.aptoide.pt.store.view.GridStoreMetaWidget$HomeMeta$Badge r18 = p015cm.aptoide.p016pt.store.view.GridStoreMetaWidget.HomeMeta.Badge.BRONZE
            r44 = r5
            r5 = r18
            int r5 = r0.getProgressColor(r1, r2, r3, r4, r5)
            cm.aptoide.pt.store.view.GridStoreMetaWidget$HomeMeta$Badge r18 = p015cm.aptoide.p016pt.store.view.GridStoreMetaWidget.HomeMeta.Badge.SILVER
            r45 = r5
            r5 = r18
            int r5 = r0.getProgressColor(r1, r2, r3, r4, r5)
            cm.aptoide.pt.store.view.GridStoreMetaWidget$HomeMeta$Badge r18 = p015cm.aptoide.p016pt.store.view.GridStoreMetaWidget.HomeMeta.Badge.GOLD
            r46 = r5
            r5 = r18
            int r5 = r0.getProgressColor(r1, r2, r3, r4, r5)
            cm.aptoide.pt.store.view.GridStoreMetaWidget$HomeMeta$Badge r18 = p015cm.aptoide.p016pt.store.view.GridStoreMetaWidget.HomeMeta.Badge.PLATINUM
            r13 = r5
            r5 = r18
            int r5 = r0.getProgressColor(r1, r2, r3, r4, r5)
            int r0 = r8.getColor(r10)
            r11.setBackgroundColor(r0)
            boolean r0 = r6.isRankLocked(r7, r9)
            if (r0 != 0) goto L_0x03d8
            r6.setDrawableColor((android.content.res.Resources) r8, (int) r10, (android.widget.TextView) r12)
            r6.setDrawableColor((android.content.res.Resources) r8, (int) r10, (android.widget.TextView) r14)
            r6.setDrawableColor((android.content.res.Resources) r8, (int) r10, (android.widget.TextView) r15)
            r0 = r17
            r6.setDrawableColor((android.content.res.Resources) r8, (int) r10, (android.widget.TextView) r0)
            goto L_0x03ec
        L_0x03d8:
            r0 = r17
            r1 = 2131099854(0x7f0600ce, float:1.7812073E38)
            r6.setDrawableColor((android.content.res.Resources) r8, (int) r1, (android.widget.TextView) r12)
            r2 = 2131100036(0x7f060184, float:1.7812442E38)
            r6.setDrawableColor((android.content.res.Resources) r8, (int) r2, (android.widget.TextView) r14)
            r6.setDrawableColor((android.content.res.Resources) r8, (int) r1, (android.widget.TextView) r15)
            r6.setDrawableColor((android.content.res.Resources) r8, (int) r2, (android.widget.TextView) r0)
        L_0x03ec:
            r10 = r16
            r2 = r31
            r0 = r44
            r6.setupMedal(r2, r10, r0, r8)
            r2 = r24
            r10 = r39
            r9 = r45
            r6.setupMedal(r2, r10, r9, r8)
            r2 = r23
            r0 = r35
            r10 = r46
            r6.setupMedal(r2, r0, r10, r8)
            r2 = r22
            r0 = r34
            r6.setupMedal(r2, r0, r13, r8)
            r0 = r33
            r2 = r43
            r6.setupMedal(r2, r0, r5, r8)
            cm.aptoide.pt.store.view.t r11 = new cm.aptoide.pt.store.view.t
            r0 = r11
            r1 = r47
            r2 = r48
            r3 = r49
            r4 = r51
            r12 = r5
            r5 = r52
            r0.<init>(r1, r2, r3, r4, r5)
            r14 = r42
            r14.setOnClickListener(r11)
            cm.aptoide.pt.store.view.r r11 = new cm.aptoide.pt.store.view.r
            r0 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r15 = r40
            r15.setOnClickListener(r11)
            cm.aptoide.pt.store.view.u r11 = new cm.aptoide.pt.store.view.u
            r0 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r5 = r36
            r5.setOnClickListener(r11)
            cm.aptoide.pt.store.view.v r11 = new cm.aptoide.pt.store.view.v
            r0 = r11
            r6 = r5
            r5 = r52
            r0.<init>(r1, r2, r3, r4, r5)
            r5 = r37
            r5.setOnClickListener(r11)
            cm.aptoide.pt.store.view.w r11 = new cm.aptoide.pt.store.view.w
            r0 = r11
            r7 = r5
            r5 = r52
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = r38
            r0.setOnClickListener(r11)
            int r1 = r8.getColor(r9)
            r2 = r25
            r2.setBackgroundColor(r1)
            int r1 = r8.getColor(r10)
            r3 = r26
            r3.setBackgroundColor(r1)
            int r1 = r8.getColor(r13)
            r4 = r27
            r4.setBackgroundColor(r1)
            int r1 = r8.getColor(r12)
            r5 = r28
            r5.setBackgroundColor(r1)
            if (r52 == 0) goto L_0x04a5
            r1 = r41
            r8 = 0
            r1.setVisibility(r8)
            r14.setVisibility(r8)
            r15.setVisibility(r8)
            r6.setVisibility(r8)
            r7.setVisibility(r8)
            r0.setVisibility(r8)
            r2.setVisibility(r8)
            r3.setVisibility(r8)
            r4.setVisibility(r8)
            r5.setVisibility(r8)
            goto L_0x04c7
        L_0x04a5:
            r1 = r41
            r8 = 8
            r1.setVisibility(r8)
            r14.setVisibility(r8)
            r15.setVisibility(r8)
            r6.setVisibility(r8)
            r7.setVisibility(r8)
            r0.setVisibility(r8)
            r2.setVisibility(r8)
            r3.setVisibility(r8)
            r4.setVisibility(r8)
            r5.setVisibility(r8)
        L_0x04c7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.store.view.BadgeDialogFactory.createViewModel(cm.aptoide.pt.store.view.GridStoreMetaWidget$HomeMeta$Badge, android.content.res.Resources, cm.aptoide.pt.store.view.GridStoreMetaWidget$HomeMeta$Badge, android.view.View, boolean):void");
    }

    private int getProgressColor(int i, int i2, GridStoreMetaWidget.HomeMeta.Badge badge, GridStoreMetaWidget.HomeMeta.Badge badge2, GridStoreMetaWidget.HomeMeta.Badge badge3) {
        int i3 = this.themeManager.getAttributeForTheme(C1086R.attr.storeBadgeDialogProgress).resourceId;
        if (badge3.ordinal() > badge.ordinal() || badge3.ordinal() > badge2.ordinal()) {
            return badge3.ordinal() <= badge.ordinal() ? i2 : i3;
        }
        return i;
    }

    private boolean isRankLocked(GridStoreMetaWidget.HomeMeta.Badge badge, GridStoreMetaWidget.HomeMeta.Badge badge2) {
        return badge.ordinal() < badge2.ordinal();
    }

    private void setBackground(ImageView imageView, int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i);
        if (Build.VERSION.SDK_INT >= 16) {
            imageView.setBackground(gradientDrawable);
        } else {
            imageView.setBackgroundDrawable(gradientDrawable);
        }
    }

    private void setDrawableColor(Resources resources, int i, TextView textView) {
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        int length = compoundDrawables.length;
        for (int i2 = 0; i2 < length; i2++) {
            Drawable drawable = compoundDrawables[i2];
            if (drawable != null) {
                drawable.mutate();
                drawable.setColorFilter(new PorterDuffColorFilter(resources.getColor(i), PorterDuff.Mode.SRC_IN));
                compoundDrawables[i2] = drawable;
            }
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(compoundDrawables[0], compoundDrawables[1], compoundDrawables[2], compoundDrawables[3]);
    }

    private void setupMedal(ImageView imageView, boolean z, int i, Resources resources) {
        if (z) {
            imageView.getLayoutParams().width = this.selectedMedalSize;
            imageView.getLayoutParams().height = this.selectedMedalSize;
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView.requestLayout();
        } else {
            imageView.getLayoutParams().width = this.normalMedalSize;
            imageView.getLayoutParams().height = this.normalMedalSize;
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView.requestLayout();
        }
        Drawable drawable = imageView.getDrawable();
        setDrawableColor(resources, i, drawable);
        imageView.setImageDrawable(drawable);
        setBackground(imageView, resources.getColor(C1086R.color.white));
    }

    /* renamed from: b */
    public /* synthetic */ void mo14614b(GridStoreMetaWidget.HomeMeta.Badge badge, Resources resources, View view, boolean z, View view2) {
        createViewModel(badge, resources, GridStoreMetaWidget.HomeMeta.Badge.BRONZE, view, z);
    }

    /* renamed from: c */
    public /* synthetic */ void mo14615c(GridStoreMetaWidget.HomeMeta.Badge badge, Resources resources, View view, boolean z, View view2) {
        createViewModel(badge, resources, GridStoreMetaWidget.HomeMeta.Badge.SILVER, view, z);
    }

    public Dialog create(GridStoreMetaWidget.HomeMeta.Badge badge, boolean z) {
        View inflate = LayoutInflater.from(new ContextThemeWrapper(this.context, this.themeManager.getAttributeForTheme(C1086R.attr.dialogsTheme).resourceId)).inflate(C1086R.layout.store_badge_dialog, (ViewGroup) null);
        int i = ((ImageView) inflate.findViewById(C1086R.C1088id.bronze_medal)).getLayoutParams().width;
        this.normalMedalSize = i;
        this.selectedMedalSize = (int) (((float) i) * 1.25f);
        createViewModel(badge, inflate.getContext().getResources(), badge, inflate, z);
        AlertDialog create = new AlertDialog.Builder(this.context).setView(inflate).create();
        inflate.findViewById(C1086R.C1088id.ok_button).setOnClickListener(new C4364s(create));
        return create;
    }

    /* renamed from: d */
    public /* synthetic */ void mo14617d(GridStoreMetaWidget.HomeMeta.Badge badge, Resources resources, View view, boolean z, View view2) {
        createViewModel(badge, resources, GridStoreMetaWidget.HomeMeta.Badge.GOLD, view, z);
    }

    /* renamed from: e */
    public /* synthetic */ void mo14618e(GridStoreMetaWidget.HomeMeta.Badge badge, Resources resources, View view, boolean z, View view2) {
        createViewModel(badge, resources, GridStoreMetaWidget.HomeMeta.Badge.PLATINUM, view, z);
    }

    /* renamed from: a */
    public /* synthetic */ void mo14613a(GridStoreMetaWidget.HomeMeta.Badge badge, Resources resources, View view, boolean z, View view2) {
        createViewModel(badge, resources, GridStoreMetaWidget.HomeMeta.Badge.NONE, view, z);
    }

    private void setDrawableColor(Resources resources, int i, Drawable... drawableArr) {
        for (Drawable drawable : drawableArr) {
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(resources.getColor(i), PorterDuff.Mode.SRC_IN));
            }
        }
    }
}
