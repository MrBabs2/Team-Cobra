package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.C0246g0;
import p050l.p051a.C4790a;
import p050l.p051a.C4792c;
import p050l.p051a.C4794e;
import p050l.p051a.p052k.p053a.C4800a;
import p050l.p075h.p076e.C4949a;

/* renamed from: androidx.appcompat.widget.h */
/* compiled from: AppCompatDrawableManager */
public final class C0253h {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final PorterDuff.Mode f1082b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c */
    private static C0253h f1083c;

    /* renamed from: a */
    private C0246g0 f1084a;

    /* renamed from: androidx.appcompat.widget.h$a */
    /* compiled from: AppCompatDrawableManager */
    class C0254a implements C0246g0.C0251e {

        /* renamed from: a */
        private final int[] f1085a = {C4794e.abc_textfield_search_default_mtrl_alpha, C4794e.abc_textfield_default_mtrl_alpha, C4794e.abc_ab_share_pack_mtrl_alpha};

        /* renamed from: b */
        private final int[] f1086b = {C4794e.abc_ic_commit_search_api_mtrl_alpha, C4794e.abc_seekbar_tick_mark_material, C4794e.abc_ic_menu_share_mtrl_alpha, C4794e.abc_ic_menu_copy_mtrl_am_alpha, C4794e.abc_ic_menu_cut_mtrl_alpha, C4794e.abc_ic_menu_selectall_mtrl_alpha, C4794e.abc_ic_menu_paste_mtrl_am_alpha};

        /* renamed from: c */
        private final int[] f1087c = {C4794e.abc_textfield_activated_mtrl_alpha, C4794e.abc_textfield_search_activated_mtrl_alpha, C4794e.abc_cab_background_top_mtrl_alpha, C4794e.abc_text_cursor_material, C4794e.abc_text_select_handle_left_mtrl_dark, C4794e.abc_text_select_handle_middle_mtrl_dark, C4794e.abc_text_select_handle_right_mtrl_dark, C4794e.abc_text_select_handle_left_mtrl_light, C4794e.abc_text_select_handle_middle_mtrl_light, C4794e.abc_text_select_handle_right_mtrl_light};

        /* renamed from: d */
        private final int[] f1088d = {C4794e.abc_popup_background_mtrl_mult, C4794e.abc_cab_background_internal_bg, C4794e.abc_menu_hardkey_panel_mtrl_mult};

        /* renamed from: e */
        private final int[] f1089e = {C4794e.abc_tab_indicator_material, C4794e.abc_textfield_search_material};

        /* renamed from: f */
        private final int[] f1090f = {C4794e.abc_btn_check_material, C4794e.abc_btn_radio_material, C4794e.abc_btn_check_material_anim, C4794e.abc_btn_radio_material_anim};

        C0254a() {
        }

        /* renamed from: a */
        private ColorStateList m1190a(Context context) {
            return m1194b(context, 0);
        }

        /* renamed from: b */
        private ColorStateList m1193b(Context context) {
            return m1194b(context, C0268l0.m1251b(context, C4790a.colorAccent));
        }

        /* renamed from: c */
        private ColorStateList m1195c(Context context) {
            return m1194b(context, C0268l0.m1251b(context, C4790a.colorButtonNormal));
        }

        /* renamed from: d */
        private ColorStateList m1196d(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList c = C0268l0.m1252c(context, C4790a.colorSwitchThumbNormal);
            if (c == null || !c.isStateful()) {
                iArr[0] = C0268l0.f1148b;
                iArr2[0] = C0268l0.m1247a(context, C4790a.colorSwitchThumbNormal);
                iArr[1] = C0268l0.f1151e;
                iArr2[1] = C0268l0.m1251b(context, C4790a.colorControlActivated);
                iArr[2] = C0268l0.f1152f;
                iArr2[2] = C0268l0.m1251b(context, C4790a.colorSwitchThumbNormal);
            } else {
                iArr[0] = C0268l0.f1148b;
                iArr2[0] = c.getColorForState(iArr[0], 0);
                iArr[1] = C0268l0.f1151e;
                iArr2[1] = C0268l0.m1251b(context, C4790a.colorControlActivated);
                iArr[2] = C0268l0.f1152f;
                iArr2[2] = c.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        /* renamed from: a */
        public Drawable mo1565a(C0246g0 g0Var, Context context, int i) {
            if (i != C4794e.abc_cab_background_top_material) {
                return null;
            }
            return new LayerDrawable(new Drawable[]{g0Var.mo1553a(context, C4794e.abc_cab_background_internal_bg), g0Var.mo1553a(context, C4794e.abc_cab_background_top_mtrl_alpha)});
        }

        /* renamed from: b */
        private ColorStateList m1194b(Context context, int i) {
            int b = C0268l0.m1251b(context, C4790a.colorControlHighlight);
            int a = C0268l0.m1247a(context, C4790a.colorButtonNormal);
            return new ColorStateList(new int[][]{C0268l0.f1148b, C0268l0.f1150d, C0268l0.f1149c, C0268l0.f1152f}, new int[]{a, C4949a.m8708c(b, i), C4949a.m8708c(b, i), i});
        }

        /* renamed from: a */
        private void m1191a(Drawable drawable, int i, PorterDuff.Mode mode) {
            if (C0301y.m1450a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = C0253h.f1082b;
            }
            drawable.setColorFilter(C0253h.m1182a(i, mode));
        }

        /* renamed from: a */
        private boolean m1192a(int[] iArr, int i) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public ColorStateList mo1563a(Context context, int i) {
            if (i == C4794e.abc_edit_text_material) {
                return C4800a.m7935b(context, C4792c.abc_tint_edittext);
            }
            if (i == C4794e.abc_switch_track_mtrl_alpha) {
                return C4800a.m7935b(context, C4792c.abc_tint_switch_track);
            }
            if (i == C4794e.abc_switch_thumb_material) {
                return m1196d(context);
            }
            if (i == C4794e.abc_btn_default_mtrl_shape) {
                return m1195c(context);
            }
            if (i == C4794e.abc_btn_borderless_material) {
                return m1190a(context);
            }
            if (i == C4794e.abc_btn_colored_material) {
                return m1193b(context);
            }
            if (i == C4794e.abc_spinner_mtrl_am_alpha || i == C4794e.abc_spinner_textfield_background_material) {
                return C4800a.m7935b(context, C4792c.abc_tint_spinner);
            }
            if (m1192a(this.f1086b, i)) {
                return C0268l0.m1252c(context, C4790a.colorControlNormal);
            }
            if (m1192a(this.f1089e, i)) {
                return C4800a.m7935b(context, C4792c.abc_tint_default);
            }
            if (m1192a(this.f1090f, i)) {
                return C4800a.m7935b(context, C4792c.abc_tint_btn_checkable);
            }
            if (i == C4794e.abc_seekbar_thumb_material) {
                return C4800a.m7935b(context, C4792c.abc_tint_seek_thumb);
            }
            return null;
        }

        /* renamed from: b */
        public boolean mo1567b(Context context, int i, Drawable drawable) {
            if (i == C4794e.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                m1191a(layerDrawable.findDrawableByLayerId(16908288), C0268l0.m1251b(context, C4790a.colorControlNormal), C0253h.f1082b);
                m1191a(layerDrawable.findDrawableByLayerId(16908303), C0268l0.m1251b(context, C4790a.colorControlNormal), C0253h.f1082b);
                m1191a(layerDrawable.findDrawableByLayerId(16908301), C0268l0.m1251b(context, C4790a.colorControlActivated), C0253h.f1082b);
                return true;
            } else if (i != C4794e.abc_ratingbar_material && i != C4794e.abc_ratingbar_indicator_material && i != C4794e.abc_ratingbar_small_material) {
                return false;
            } else {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                m1191a(layerDrawable2.findDrawableByLayerId(16908288), C0268l0.m1247a(context, C4790a.colorControlNormal), C0253h.f1082b);
                m1191a(layerDrawable2.findDrawableByLayerId(16908303), C0268l0.m1251b(context, C4790a.colorControlActivated), C0253h.f1082b);
                m1191a(layerDrawable2.findDrawableByLayerId(16908301), C0268l0.m1251b(context, C4790a.colorControlActivated), C0253h.f1082b);
                return true;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0046  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0061 A[RETURN] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo1566a(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
            /*
                r6 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.C0253h.f1082b
                int[] r1 = r6.f1085a
                boolean r1 = r6.m1192a((int[]) r1, (int) r8)
                r2 = 16842801(0x1010031, float:2.3693695E-38)
                r3 = -1
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L_0x0017
                int r2 = p050l.p051a.C4790a.colorControlNormal
            L_0x0014:
                r8 = -1
            L_0x0015:
                r1 = 1
                goto L_0x0044
            L_0x0017:
                int[] r1 = r6.f1087c
                boolean r1 = r6.m1192a((int[]) r1, (int) r8)
                if (r1 == 0) goto L_0x0022
                int r2 = p050l.p051a.C4790a.colorControlActivated
                goto L_0x0014
            L_0x0022:
                int[] r1 = r6.f1088d
                boolean r1 = r6.m1192a((int[]) r1, (int) r8)
                if (r1 == 0) goto L_0x002d
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
                goto L_0x0014
            L_0x002d:
                int r1 = p050l.p051a.C4794e.abc_list_divider_mtrl_alpha
                if (r8 != r1) goto L_0x003c
                r2 = 16842800(0x1010030, float:2.3693693E-38)
                r8 = 1109603123(0x42233333, float:40.8)
                int r8 = java.lang.Math.round(r8)
                goto L_0x0015
            L_0x003c:
                int r1 = p050l.p051a.C4794e.abc_dialog_material_background
                if (r8 != r1) goto L_0x0041
                goto L_0x0014
            L_0x0041:
                r8 = -1
                r1 = 0
                r2 = 0
            L_0x0044:
                if (r1 == 0) goto L_0x0061
                boolean r1 = androidx.appcompat.widget.C0301y.m1450a(r9)
                if (r1 == 0) goto L_0x0050
                android.graphics.drawable.Drawable r9 = r9.mutate()
            L_0x0050:
                int r7 = androidx.appcompat.widget.C0268l0.m1251b(r7, r2)
                android.graphics.PorterDuffColorFilter r7 = androidx.appcompat.widget.C0253h.m1182a((int) r7, (android.graphics.PorterDuff.Mode) r0)
                r9.setColorFilter(r7)
                if (r8 == r3) goto L_0x0060
                r9.setAlpha(r8)
            L_0x0060:
                return r5
            L_0x0061:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0253h.C0254a.mo1566a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        /* renamed from: a */
        public PorterDuff.Mode mo1564a(int i) {
            if (i == C4794e.abc_switch_thumb_material) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }
    }

    /* renamed from: b */
    public static synchronized C0253h m1184b() {
        C0253h hVar;
        synchronized (C0253h.class) {
            if (f1083c == null) {
                m1185c();
            }
            hVar = f1083c;
        }
        return hVar;
    }

    /* renamed from: c */
    public static synchronized void m1185c() {
        synchronized (C0253h.class) {
            if (f1083c == null) {
                C0253h hVar = new C0253h();
                f1083c = hVar;
                hVar.f1084a = C0246g0.m1150a();
                f1083c.f1084a.mo1557a((C0246g0.C0251e) new C0254a());
            }
        }
    }

    /* renamed from: a */
    public synchronized Drawable mo1568a(Context context, int i) {
        return this.f1084a.mo1553a(context, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized Drawable mo1569a(Context context, int i, boolean z) {
        return this.f1084a.mo1554a(context, i, z);
    }

    /* renamed from: a */
    public synchronized void mo1570a(Context context) {
        this.f1084a.mo1556a(context);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized ColorStateList mo1571b(Context context, int i) {
        return this.f1084a.mo1559b(context, i);
    }

    /* renamed from: a */
    static void m1183a(Drawable drawable, C0274o0 o0Var, int[] iArr) {
        C0246g0.m1152a(drawable, o0Var, iArr);
    }

    /* renamed from: a */
    public static synchronized PorterDuffColorFilter m1182a(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter a;
        synchronized (C0253h.class) {
            a = C0246g0.m1146a(i, mode);
        }
        return a;
    }
}
