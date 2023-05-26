package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.C0229c0;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;
import p050l.p051a.C4790a;
import p050l.p051a.C4795f;
import p050l.p051a.C4799j;
import p050l.p075h.p084l.C5071v;

class AlertController {

    /* renamed from: A */
    NestedScrollView f103A;

    /* renamed from: B */
    private int f104B = 0;

    /* renamed from: C */
    private Drawable f105C;

    /* renamed from: D */
    private ImageView f106D;

    /* renamed from: E */
    private TextView f107E;

    /* renamed from: F */
    private TextView f108F;

    /* renamed from: G */
    private View f109G;

    /* renamed from: H */
    ListAdapter f110H;

    /* renamed from: I */
    int f111I = -1;

    /* renamed from: J */
    private int f112J;

    /* renamed from: K */
    private int f113K;

    /* renamed from: L */
    int f114L;

    /* renamed from: M */
    int f115M;

    /* renamed from: N */
    int f116N;

    /* renamed from: O */
    int f117O;

    /* renamed from: P */
    private boolean f118P;

    /* renamed from: Q */
    private int f119Q = 0;

    /* renamed from: R */
    Handler f120R;

    /* renamed from: S */
    private final View.OnClickListener f121S = new C0056a();

    /* renamed from: a */
    private final Context f122a;

    /* renamed from: b */
    final C0104h f123b;

    /* renamed from: c */
    private final Window f124c;

    /* renamed from: d */
    private final int f125d;

    /* renamed from: e */
    private CharSequence f126e;

    /* renamed from: f */
    private CharSequence f127f;

    /* renamed from: g */
    ListView f128g;

    /* renamed from: h */
    private View f129h;

    /* renamed from: i */
    private int f130i;

    /* renamed from: j */
    private int f131j;

    /* renamed from: k */
    private int f132k;

    /* renamed from: l */
    private int f133l;

    /* renamed from: m */
    private int f134m;

    /* renamed from: n */
    private boolean f135n = false;

    /* renamed from: o */
    Button f136o;

    /* renamed from: p */
    private CharSequence f137p;

    /* renamed from: q */
    Message f138q;

    /* renamed from: r */
    private Drawable f139r;

    /* renamed from: s */
    Button f140s;

    /* renamed from: t */
    private CharSequence f141t;

    /* renamed from: u */
    Message f142u;

    /* renamed from: v */
    private Drawable f143v;

    /* renamed from: w */
    Button f144w;

    /* renamed from: x */
    private CharSequence f145x;

    /* renamed from: y */
    Message f146y;

    /* renamed from: z */
    private Drawable f147z;

    public static class RecycleListView extends ListView {

        /* renamed from: f */
        private final int f148f;

        /* renamed from: g */
        private final int f149g;

        public RecycleListView(Context context) {
            this(context, (AttributeSet) null);
        }

        /* renamed from: a */
        public void mo163a(boolean z, boolean z2) {
            if (!z2 || !z) {
                setPadding(getPaddingLeft(), z ? getPaddingTop() : this.f148f, getPaddingRight(), z2 ? getPaddingBottom() : this.f149g);
            }
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4799j.RecycleListView);
            this.f149g = obtainStyledAttributes.getDimensionPixelOffset(C4799j.RecycleListView_paddingBottomNoButtons, -1);
            this.f148f = obtainStyledAttributes.getDimensionPixelOffset(C4799j.RecycleListView_paddingTopNoTitle, -1);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$a */
    class C0056a implements View.OnClickListener {
        C0056a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
            r3 = r0.f146y;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r3) {
            /*
                r2 = this;
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.f136o
                if (r3 != r1) goto L_0x000f
                android.os.Message r0 = r0.f138q
                if (r0 == 0) goto L_0x000f
                android.os.Message r3 = android.os.Message.obtain(r0)
                goto L_0x002e
            L_0x000f:
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.f140s
                if (r3 != r1) goto L_0x001e
                android.os.Message r0 = r0.f142u
                if (r0 == 0) goto L_0x001e
                android.os.Message r3 = android.os.Message.obtain(r0)
                goto L_0x002e
            L_0x001e:
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.f144w
                if (r3 != r1) goto L_0x002d
                android.os.Message r3 = r0.f146y
                if (r3 == 0) goto L_0x002d
                android.os.Message r3 = android.os.Message.obtain(r3)
                goto L_0x002e
            L_0x002d:
                r3 = 0
            L_0x002e:
                if (r3 == 0) goto L_0x0033
                r3.sendToTarget()
            L_0x0033:
                androidx.appcompat.app.AlertController r3 = androidx.appcompat.app.AlertController.this
                android.os.Handler r0 = r3.f120R
                r1 = 1
                androidx.appcompat.app.h r3 = r3.f123b
                android.os.Message r3 = r0.obtainMessage(r1, r3)
                r3.sendToTarget()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.C0056a.onClick(android.view.View):void");
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$b */
    class C0057b implements NestedScrollView.C0425b {

        /* renamed from: a */
        final /* synthetic */ View f151a;

        /* renamed from: b */
        final /* synthetic */ View f152b;

        C0057b(AlertController alertController, View view, View view2) {
            this.f151a = view;
            this.f152b = view2;
        }

        /* renamed from: a */
        public void mo165a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
            AlertController.m158a(nestedScrollView, this.f151a, this.f152b);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$c */
    class C0058c implements Runnable {

        /* renamed from: f */
        final /* synthetic */ View f153f;

        /* renamed from: g */
        final /* synthetic */ View f154g;

        C0058c(View view, View view2) {
            this.f153f = view;
            this.f154g = view2;
        }

        public void run() {
            AlertController.m158a(AlertController.this.f103A, this.f153f, this.f154g);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$d */
    class C0059d implements AbsListView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ View f156a;

        /* renamed from: b */
        final /* synthetic */ View f157b;

        C0059d(AlertController alertController, View view, View view2) {
            this.f156a = view;
            this.f157b = view2;
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            AlertController.m158a(absListView, this.f156a, this.f157b);
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$e */
    class C0060e implements Runnable {

        /* renamed from: f */
        final /* synthetic */ View f158f;

        /* renamed from: g */
        final /* synthetic */ View f159g;

        C0060e(View view, View view2) {
            this.f158f = view;
            this.f159g = view2;
        }

        public void run() {
            AlertController.m158a(AlertController.this.f128g, this.f158f, this.f159g);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$f */
    public static class C0061f {

        /* renamed from: A */
        public int f161A;

        /* renamed from: B */
        public int f162B;

        /* renamed from: C */
        public int f163C;

        /* renamed from: D */
        public int f164D;

        /* renamed from: E */
        public boolean f165E = false;

        /* renamed from: F */
        public boolean[] f166F;

        /* renamed from: G */
        public boolean f167G;

        /* renamed from: H */
        public boolean f168H;

        /* renamed from: I */
        public int f169I = -1;

        /* renamed from: J */
        public DialogInterface.OnMultiChoiceClickListener f170J;

        /* renamed from: K */
        public Cursor f171K;

        /* renamed from: L */
        public String f172L;

        /* renamed from: M */
        public String f173M;

        /* renamed from: N */
        public AdapterView.OnItemSelectedListener f174N;

        /* renamed from: O */
        public C0066e f175O;

        /* renamed from: a */
        public final Context f176a;

        /* renamed from: b */
        public final LayoutInflater f177b;

        /* renamed from: c */
        public int f178c = 0;

        /* renamed from: d */
        public Drawable f179d;

        /* renamed from: e */
        public int f180e = 0;

        /* renamed from: f */
        public CharSequence f181f;

        /* renamed from: g */
        public View f182g;

        /* renamed from: h */
        public CharSequence f183h;

        /* renamed from: i */
        public CharSequence f184i;

        /* renamed from: j */
        public Drawable f185j;

        /* renamed from: k */
        public DialogInterface.OnClickListener f186k;

        /* renamed from: l */
        public CharSequence f187l;

        /* renamed from: m */
        public Drawable f188m;

        /* renamed from: n */
        public DialogInterface.OnClickListener f189n;

        /* renamed from: o */
        public CharSequence f190o;

        /* renamed from: p */
        public Drawable f191p;

        /* renamed from: q */
        public DialogInterface.OnClickListener f192q;

        /* renamed from: r */
        public boolean f193r;

        /* renamed from: s */
        public DialogInterface.OnCancelListener f194s;

        /* renamed from: t */
        public DialogInterface.OnDismissListener f195t;

        /* renamed from: u */
        public DialogInterface.OnKeyListener f196u;

        /* renamed from: v */
        public CharSequence[] f197v;

        /* renamed from: w */
        public ListAdapter f198w;

        /* renamed from: x */
        public DialogInterface.OnClickListener f199x;

        /* renamed from: y */
        public int f200y;

        /* renamed from: z */
        public View f201z;

        /* renamed from: androidx.appcompat.app.AlertController$f$a */
        class C0062a extends ArrayAdapter<CharSequence> {

            /* renamed from: f */
            final /* synthetic */ RecycleListView f202f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0062a(Context context, int i, int i2, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i, i2, charSequenceArr);
                this.f202f = recycleListView;
            }

            public View getView(int i, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i, view, viewGroup);
                boolean[] zArr = C0061f.this.f166F;
                if (zArr != null && zArr[i]) {
                    this.f202f.setItemChecked(i, true);
                }
                return view2;
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$b */
        class C0063b extends CursorAdapter {

            /* renamed from: f */
            private final int f204f;

            /* renamed from: g */
            private final int f205g;

            /* renamed from: h */
            final /* synthetic */ RecycleListView f206h;

            /* renamed from: i */
            final /* synthetic */ AlertController f207i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0063b(Context context, Cursor cursor, boolean z, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z);
                this.f206h = recycleListView;
                this.f207i = alertController;
                Cursor cursor2 = getCursor();
                this.f204f = cursor2.getColumnIndexOrThrow(C0061f.this.f172L);
                this.f205g = cursor2.getColumnIndexOrThrow(C0061f.this.f173M);
            }

            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.f204f));
                RecycleListView recycleListView = this.f206h;
                int position = cursor.getPosition();
                boolean z = true;
                if (cursor.getInt(this.f205g) != 1) {
                    z = false;
                }
                recycleListView.setItemChecked(position, z);
            }

            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return C0061f.this.f177b.inflate(this.f207i.f115M, viewGroup, false);
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$c */
        class C0064c implements AdapterView.OnItemClickListener {

            /* renamed from: f */
            final /* synthetic */ AlertController f209f;

            C0064c(AlertController alertController) {
                this.f209f = alertController;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                C0061f.this.f199x.onClick(this.f209f.f123b, i);
                if (!C0061f.this.f168H) {
                    this.f209f.f123b.dismiss();
                }
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$d */
        class C0065d implements AdapterView.OnItemClickListener {

            /* renamed from: f */
            final /* synthetic */ RecycleListView f211f;

            /* renamed from: g */
            final /* synthetic */ AlertController f212g;

            C0065d(RecycleListView recycleListView, AlertController alertController) {
                this.f211f = recycleListView;
                this.f212g = alertController;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                boolean[] zArr = C0061f.this.f166F;
                if (zArr != null) {
                    zArr[i] = this.f211f.isItemChecked(i);
                }
                C0061f.this.f170J.onClick(this.f212g.f123b, i, this.f211f.isItemChecked(i));
            }
        }

        /* renamed from: androidx.appcompat.app.AlertController$f$e */
        public interface C0066e {
            /* renamed from: a */
            void mo176a(ListView listView);
        }

        public C0061f(Context context) {
            this.f176a = context;
            this.f193r = true;
            this.f177b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* JADX WARNING: type inference failed for: r9v0, types: [android.widget.ListAdapter] */
        /* JADX WARNING: type inference failed for: r9v3 */
        /* JADX WARNING: type inference failed for: r9v4 */
        /* JADX WARNING: type inference failed for: r2v5, types: [android.widget.SimpleCursorAdapter] */
        /* JADX WARNING: type inference failed for: r1v23, types: [androidx.appcompat.app.AlertController$f$b] */
        /* JADX WARNING: type inference failed for: r1v24, types: [androidx.appcompat.app.AlertController$f$a] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m186b(androidx.appcompat.app.AlertController r11) {
            /*
                r10 = this;
                android.view.LayoutInflater r0 = r10.f177b
                int r1 = r11.f114L
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r2)
                androidx.appcompat.app.AlertController$RecycleListView r0 = (androidx.appcompat.app.AlertController.RecycleListView) r0
                boolean r1 = r10.f167G
                r8 = 1
                if (r1 == 0) goto L_0x0035
                android.database.Cursor r1 = r10.f171K
                if (r1 != 0) goto L_0x0026
                androidx.appcompat.app.AlertController$f$a r9 = new androidx.appcompat.app.AlertController$f$a
                android.content.Context r3 = r10.f176a
                int r4 = r11.f115M
                r5 = 16908308(0x1020014, float:2.3877285E-38)
                java.lang.CharSequence[] r6 = r10.f197v
                r1 = r9
                r2 = r10
                r7 = r0
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x006b
            L_0x0026:
                androidx.appcompat.app.AlertController$f$b r9 = new androidx.appcompat.app.AlertController$f$b
                android.content.Context r3 = r10.f176a
                android.database.Cursor r4 = r10.f171K
                r5 = 0
                r1 = r9
                r2 = r10
                r6 = r0
                r7 = r11
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x006b
            L_0x0035:
                boolean r1 = r10.f168H
                if (r1 == 0) goto L_0x003c
                int r1 = r11.f116N
                goto L_0x003e
            L_0x003c:
                int r1 = r11.f117O
            L_0x003e:
                r4 = r1
                android.database.Cursor r1 = r10.f171K
                r2 = 16908308(0x1020014, float:2.3877285E-38)
                if (r1 == 0) goto L_0x005d
                android.widget.SimpleCursorAdapter r9 = new android.widget.SimpleCursorAdapter
                android.content.Context r3 = r10.f176a
                android.database.Cursor r5 = r10.f171K
                java.lang.String[] r6 = new java.lang.String[r8]
                java.lang.String r1 = r10.f172L
                r7 = 0
                r6[r7] = r1
                int[] r1 = new int[r8]
                r1[r7] = r2
                r2 = r9
                r7 = r1
                r2.<init>(r3, r4, r5, r6, r7)
                goto L_0x006b
            L_0x005d:
                android.widget.ListAdapter r9 = r10.f198w
                if (r9 == 0) goto L_0x0062
                goto L_0x006b
            L_0x0062:
                androidx.appcompat.app.AlertController$h r9 = new androidx.appcompat.app.AlertController$h
                android.content.Context r1 = r10.f176a
                java.lang.CharSequence[] r3 = r10.f197v
                r9.<init>(r1, r4, r2, r3)
            L_0x006b:
                androidx.appcompat.app.AlertController$f$e r1 = r10.f175O
                if (r1 == 0) goto L_0x0072
                r1.mo176a(r0)
            L_0x0072:
                r11.f110H = r9
                int r1 = r10.f169I
                r11.f111I = r1
                android.content.DialogInterface$OnClickListener r1 = r10.f199x
                if (r1 == 0) goto L_0x0085
                androidx.appcompat.app.AlertController$f$c r1 = new androidx.appcompat.app.AlertController$f$c
                r1.<init>(r11)
                r0.setOnItemClickListener(r1)
                goto L_0x0091
            L_0x0085:
                android.content.DialogInterface$OnMultiChoiceClickListener r1 = r10.f170J
                if (r1 == 0) goto L_0x0091
                androidx.appcompat.app.AlertController$f$d r1 = new androidx.appcompat.app.AlertController$f$d
                r1.<init>(r0, r11)
                r0.setOnItemClickListener(r1)
            L_0x0091:
                android.widget.AdapterView$OnItemSelectedListener r1 = r10.f174N
                if (r1 == 0) goto L_0x0098
                r0.setOnItemSelectedListener(r1)
            L_0x0098:
                boolean r1 = r10.f168H
                if (r1 == 0) goto L_0x00a0
                r0.setChoiceMode(r8)
                goto L_0x00a8
            L_0x00a0:
                boolean r1 = r10.f167G
                if (r1 == 0) goto L_0x00a8
                r1 = 2
                r0.setChoiceMode(r1)
            L_0x00a8:
                r11.f128g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.C0061f.m186b(androidx.appcompat.app.AlertController):void");
        }

        /* renamed from: a */
        public void mo170a(AlertController alertController) {
            View view = this.f182g;
            if (view != null) {
                alertController.mo152a(view);
            } else {
                CharSequence charSequence = this.f181f;
                if (charSequence != null) {
                    alertController.mo159b(charSequence);
                }
                Drawable drawable = this.f179d;
                if (drawable != null) {
                    alertController.mo151a(drawable);
                }
                int i = this.f178c;
                if (i != 0) {
                    alertController.mo161c(i);
                }
                int i2 = this.f180e;
                if (i2 != 0) {
                    alertController.mo161c(alertController.mo156b(i2));
                }
            }
            CharSequence charSequence2 = this.f183h;
            if (charSequence2 != null) {
                alertController.mo154a(charSequence2);
            }
            if (!(this.f184i == null && this.f185j == null)) {
                alertController.mo150a(-1, this.f184i, this.f186k, (Message) null, this.f185j);
            }
            if (!(this.f187l == null && this.f188m == null)) {
                alertController.mo150a(-2, this.f187l, this.f189n, (Message) null, this.f188m);
            }
            if (!(this.f190o == null && this.f191p == null)) {
                alertController.mo150a(-3, this.f190o, this.f192q, (Message) null, this.f191p);
            }
            if (!(this.f197v == null && this.f171K == null && this.f198w == null)) {
                m186b(alertController);
            }
            View view2 = this.f201z;
            if (view2 == null) {
                int i3 = this.f200y;
                if (i3 != 0) {
                    alertController.mo162d(i3);
                }
            } else if (this.f165E) {
                alertController.mo153a(view2, this.f161A, this.f162B, this.f163C, this.f164D);
            } else {
                alertController.mo158b(view2);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$g */
    private static final class C0067g extends Handler {

        /* renamed from: a */
        private WeakReference<DialogInterface> f214a;

        public C0067g(DialogInterface dialogInterface) {
            this.f214a = new WeakReference<>(dialogInterface);
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f214a.get(), message.what);
            } else if (i == 1) {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$h */
    private static class C0068h extends ArrayAdapter<CharSequence> {
        public C0068h(Context context, int i, int i2, CharSequence[] charSequenceArr) {
            super(context, i, i2, charSequenceArr);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, C0104h hVar, Window window) {
        this.f122a = context;
        this.f123b = hVar;
        this.f124c = window;
        this.f120R = new C0067g(hVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, C4799j.AlertDialog, C4790a.alertDialogStyle, 0);
        this.f112J = obtainStyledAttributes.getResourceId(C4799j.AlertDialog_android_layout, 0);
        this.f113K = obtainStyledAttributes.getResourceId(C4799j.AlertDialog_buttonPanelSideLayout, 0);
        this.f114L = obtainStyledAttributes.getResourceId(C4799j.AlertDialog_listLayout, 0);
        this.f115M = obtainStyledAttributes.getResourceId(C4799j.AlertDialog_multiChoiceItemLayout, 0);
        this.f116N = obtainStyledAttributes.getResourceId(C4799j.AlertDialog_singleChoiceItemLayout, 0);
        this.f117O = obtainStyledAttributes.getResourceId(C4799j.AlertDialog_listItemLayout, 0);
        this.f118P = obtainStyledAttributes.getBoolean(C4799j.AlertDialog_showTitle, true);
        this.f125d = obtainStyledAttributes.getDimensionPixelSize(C4799j.AlertDialog_buttonIconDimen, 0);
        obtainStyledAttributes.recycle();
        hVar.mo380a(1);
    }

    /* renamed from: a */
    private static boolean m162a(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C4790a.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    static boolean m166c(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m166c(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public void mo157b() {
        this.f123b.setContentView(m164c());
        m167d();
    }

    /* renamed from: d */
    public void mo162d(int i) {
        this.f129h = null;
        this.f130i = i;
        this.f135n = false;
    }

    /* renamed from: d */
    private void m167d() {
        ListAdapter listAdapter;
        View findViewById;
        View findViewById2;
        View findViewById3 = this.f124c.findViewById(C4795f.parentPanel);
        View findViewById4 = findViewById3.findViewById(C4795f.topPanel);
        View findViewById5 = findViewById3.findViewById(C4795f.contentPanel);
        View findViewById6 = findViewById3.findViewById(C4795f.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(C4795f.customPanel);
        m165c(viewGroup);
        View findViewById7 = viewGroup.findViewById(C4795f.topPanel);
        View findViewById8 = viewGroup.findViewById(C4795f.contentPanel);
        View findViewById9 = viewGroup.findViewById(C4795f.buttonPanel);
        ViewGroup a = m157a(findViewById7, findViewById4);
        ViewGroup a2 = m157a(findViewById8, findViewById5);
        ViewGroup a3 = m157a(findViewById9, findViewById6);
        m163b(a2);
        m159a(a3);
        m168d(a);
        char c = 0;
        boolean z = (viewGroup == null || viewGroup.getVisibility() == 8) ? false : true;
        boolean z2 = (a == null || a.getVisibility() == 8) ? false : true;
        boolean z3 = (a3 == null || a3.getVisibility() == 8) ? false : true;
        if (!(z3 || a2 == null || (findViewById2 = a2.findViewById(C4795f.textSpacerNoButtons)) == null)) {
            findViewById2.setVisibility(0);
        }
        if (z2) {
            NestedScrollView nestedScrollView = this.f103A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View view = null;
            if (!(this.f127f == null && this.f128g == null)) {
                view = a.findViewById(C4795f.titleDividerNoCustom);
            }
            if (view != null) {
                view.setVisibility(0);
            }
        } else if (!(a2 == null || (findViewById = a2.findViewById(C4795f.textSpacerNoTitle)) == null)) {
            findViewById.setVisibility(0);
        }
        ListView listView = this.f128g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).mo163a(z2, z3);
        }
        if (!z) {
            View view2 = this.f128g;
            if (view2 == null) {
                view2 = this.f103A;
            }
            if (view2 != null) {
                if (z3) {
                    c = 2;
                }
                m160a(a2, view2, z2 | c ? 1 : 0, 3);
            }
        }
        ListView listView2 = this.f128g;
        if (listView2 != null && (listAdapter = this.f110H) != null) {
            listView2.setAdapter(listAdapter);
            int i = this.f111I;
            if (i > -1) {
                listView2.setItemChecked(i, true);
                listView2.setSelection(i);
            }
        }
    }

    /* renamed from: a */
    public void mo152a(View view) {
        this.f109G = view;
    }

    /* renamed from: b */
    public void mo159b(CharSequence charSequence) {
        this.f126e = charSequence;
        TextView textView = this.f107E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: a */
    public void mo154a(CharSequence charSequence) {
        this.f127f = charSequence;
        TextView textView = this.f108F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: c */
    private int m164c() {
        int i = this.f113K;
        if (i == 0) {
            return this.f112J;
        }
        if (this.f119Q == 1) {
            return i;
        }
        return this.f112J;
    }

    /* renamed from: b */
    public void mo158b(View view) {
        this.f129h = view;
        this.f130i = 0;
        this.f135n = false;
    }

    /* renamed from: a */
    public void mo153a(View view, int i, int i2, int i3, int i4) {
        this.f129h = view;
        this.f130i = 0;
        this.f135n = true;
        this.f131j = i;
        this.f132k = i2;
        this.f133l = i3;
        this.f134m = i4;
    }

    /* renamed from: b */
    public int mo156b(int i) {
        TypedValue typedValue = new TypedValue();
        this.f122a.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: c */
    public void mo161c(int i) {
        this.f105C = null;
        this.f104B = i;
        ImageView imageView = this.f106D;
        if (imageView == null) {
            return;
        }
        if (i != 0) {
            imageView.setVisibility(0);
            this.f106D.setImageResource(this.f104B);
            return;
        }
        imageView.setVisibility(8);
    }

    /* renamed from: b */
    public boolean mo160b(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f103A;
        return nestedScrollView != null && nestedScrollView.mo2383a(keyEvent);
    }

    /* renamed from: b */
    private void m163b(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f124c.findViewById(C4795f.scrollView);
        this.f103A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.f103A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(16908299);
        this.f108F = textView;
        if (textView != null) {
            CharSequence charSequence = this.f127f;
            if (charSequence != null) {
                textView.setText(charSequence);
                return;
            }
            textView.setVisibility(8);
            this.f103A.removeView(this.f108F);
            if (this.f128g != null) {
                ViewGroup viewGroup2 = (ViewGroup) this.f103A.getParent();
                int indexOfChild = viewGroup2.indexOfChild(this.f103A);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(this.f128g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                return;
            }
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: a */
    public void mo150a(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f120R.obtainMessage(i, onClickListener);
        }
        if (i == -3) {
            this.f145x = charSequence;
            this.f146y = message;
            this.f147z = drawable;
        } else if (i == -2) {
            this.f141t = charSequence;
            this.f142u = message;
            this.f143v = drawable;
        } else if (i == -1) {
            this.f137p = charSequence;
            this.f138q = message;
            this.f139r = drawable;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }

    /* renamed from: c */
    private void m165c(ViewGroup viewGroup) {
        View view = this.f129h;
        boolean z = false;
        if (view == null) {
            view = this.f130i != 0 ? LayoutInflater.from(this.f122a).inflate(this.f130i, viewGroup, false) : null;
        }
        if (view != null) {
            z = true;
        }
        if (!z || !m166c(view)) {
            this.f124c.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) this.f124c.findViewById(C4795f.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (this.f135n) {
                frameLayout.setPadding(this.f131j, this.f132k, this.f133l, this.f134m);
            }
            if (this.f128g != null) {
                ((C0229c0.C0230a) viewGroup.getLayoutParams()).f1006a = 0.0f;
                return;
            }
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* renamed from: a */
    public void mo151a(Drawable drawable) {
        this.f105C = drawable;
        this.f104B = 0;
        ImageView imageView = this.f106D;
        if (imageView == null) {
            return;
        }
        if (drawable != null) {
            imageView.setVisibility(0);
            this.f106D.setImageDrawable(drawable);
            return;
        }
        imageView.setVisibility(8);
    }

    /* renamed from: a */
    public ListView mo149a() {
        return this.f128g;
    }

    /* renamed from: a */
    public Button mo148a(int i) {
        if (i == -3) {
            return this.f144w;
        }
        if (i == -2) {
            return this.f140s;
        }
        if (i != -1) {
            return null;
        }
        return this.f136o;
    }

    /* renamed from: a */
    public boolean mo155a(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f103A;
        return nestedScrollView != null && nestedScrollView.mo2383a(keyEvent);
    }

    /* renamed from: a */
    private ViewGroup m157a(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* renamed from: d */
    private void m168d(ViewGroup viewGroup) {
        if (this.f109G != null) {
            viewGroup.addView(this.f109G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f124c.findViewById(C4795f.title_template).setVisibility(8);
            return;
        }
        this.f106D = (ImageView) this.f124c.findViewById(16908294);
        if (!(!TextUtils.isEmpty(this.f126e)) || !this.f118P) {
            this.f124c.findViewById(C4795f.title_template).setVisibility(8);
            this.f106D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f124c.findViewById(C4795f.alertTitle);
        this.f107E = textView;
        textView.setText(this.f126e);
        int i = this.f104B;
        if (i != 0) {
            this.f106D.setImageResource(i);
            return;
        }
        Drawable drawable = this.f105C;
        if (drawable != null) {
            this.f106D.setImageDrawable(drawable);
            return;
        }
        this.f107E.setPadding(this.f106D.getPaddingLeft(), this.f106D.getPaddingTop(), this.f106D.getPaddingRight(), this.f106D.getPaddingBottom());
        this.f106D.setVisibility(8);
    }

    /* renamed from: a */
    private void m160a(ViewGroup viewGroup, View view, int i, int i2) {
        View findViewById = this.f124c.findViewById(C4795f.scrollIndicatorUp);
        View findViewById2 = this.f124c.findViewById(C4795f.scrollIndicatorDown);
        if (Build.VERSION.SDK_INT >= 23) {
            C5071v.m9155a(view, i, i2);
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 != null) {
                viewGroup.removeView(findViewById2);
                return;
            }
            return;
        }
        if (findViewById != null && (i & 1) == 0) {
            viewGroup.removeView(findViewById);
            findViewById = null;
        }
        if (findViewById2 != null && (i & 2) == 0) {
            viewGroup.removeView(findViewById2);
            findViewById2 = null;
        }
        if (findViewById != null || findViewById2 != null) {
            if (this.f127f != null) {
                this.f103A.setOnScrollChangeListener(new C0057b(this, findViewById, findViewById2));
                this.f103A.post(new C0058c(findViewById, findViewById2));
                return;
            }
            ListView listView = this.f128g;
            if (listView != null) {
                listView.setOnScrollListener(new C0059d(this, findViewById, findViewById2));
                this.f128g.post(new C0060e(findViewById, findViewById2));
                return;
            }
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 != null) {
                viewGroup.removeView(findViewById2);
            }
        }
    }

    /* renamed from: a */
    static void m158a(View view, View view2, View view3) {
        int i = 0;
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            if (!view.canScrollVertically(1)) {
                i = 4;
            }
            view3.setVisibility(i);
        }
    }

    /* renamed from: a */
    private void m159a(ViewGroup viewGroup) {
        boolean z;
        Button button = (Button) viewGroup.findViewById(16908313);
        this.f136o = button;
        button.setOnClickListener(this.f121S);
        boolean z2 = true;
        if (!TextUtils.isEmpty(this.f137p) || this.f139r != null) {
            this.f136o.setText(this.f137p);
            Drawable drawable = this.f139r;
            if (drawable != null) {
                int i = this.f125d;
                drawable.setBounds(0, 0, i, i);
                this.f136o.setCompoundDrawables(this.f139r, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f136o.setVisibility(0);
            z = true;
        } else {
            this.f136o.setVisibility(8);
            z = false;
        }
        Button button2 = (Button) viewGroup.findViewById(16908314);
        this.f140s = button2;
        button2.setOnClickListener(this.f121S);
        if (!TextUtils.isEmpty(this.f141t) || this.f143v != null) {
            this.f140s.setText(this.f141t);
            Drawable drawable2 = this.f143v;
            if (drawable2 != null) {
                int i2 = this.f125d;
                drawable2.setBounds(0, 0, i2, i2);
                this.f140s.setCompoundDrawables(this.f143v, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f140s.setVisibility(0);
            z |= true;
        } else {
            this.f140s.setVisibility(8);
        }
        Button button3 = (Button) viewGroup.findViewById(16908315);
        this.f144w = button3;
        button3.setOnClickListener(this.f121S);
        if (!TextUtils.isEmpty(this.f145x) || this.f147z != null) {
            this.f144w.setText(this.f145x);
            Drawable drawable3 = this.f147z;
            if (drawable3 != null) {
                int i3 = this.f125d;
                drawable3.setBounds(0, 0, i3, i3);
                this.f144w.setCompoundDrawables(this.f147z, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f144w.setVisibility(0);
            z |= true;
        } else {
            this.f144w.setVisibility(8);
        }
        if (m162a(this.f122a)) {
            if (z) {
                m161a(this.f136o);
            } else if (z) {
                m161a(this.f140s);
            } else if (z) {
                m161a(this.f144w);
            }
        }
        if (!z) {
            z2 = false;
        }
        if (!z2) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: a */
    private void m161a(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }
}
