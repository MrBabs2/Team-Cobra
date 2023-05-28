package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.C0155n;
import androidx.core.graphics.drawable.C0414a;
import androidx.recyclerview.widget.RecyclerView;
import p050l.p051a.C4797h;
import p050l.p051a.p052k.p053a.C4800a;
import p050l.p075h.p077f.p078a.C4966b;
import p050l.p075h.p084l.C5013b;

/* renamed from: androidx.appcompat.view.menu.i */
/* compiled from: MenuItemImpl */
public final class C0142i implements C4966b {

    /* renamed from: A */
    private View f553A;

    /* renamed from: B */
    private C5013b f554B;

    /* renamed from: C */
    private MenuItem.OnActionExpandListener f555C;

    /* renamed from: D */
    private boolean f556D = false;

    /* renamed from: E */
    private ContextMenu.ContextMenuInfo f557E;

    /* renamed from: a */
    private final int f558a;

    /* renamed from: b */
    private final int f559b;

    /* renamed from: c */
    private final int f560c;

    /* renamed from: d */
    private final int f561d;

    /* renamed from: e */
    private CharSequence f562e;

    /* renamed from: f */
    private CharSequence f563f;

    /* renamed from: g */
    private Intent f564g;

    /* renamed from: h */
    private char f565h;

    /* renamed from: i */
    private int f566i = RecyclerView.C0638l.FLAG_APPEARED_IN_PRE_LAYOUT;

    /* renamed from: j */
    private char f567j;

    /* renamed from: k */
    private int f568k = RecyclerView.C0638l.FLAG_APPEARED_IN_PRE_LAYOUT;

    /* renamed from: l */
    private Drawable f569l;

    /* renamed from: m */
    private int f570m = 0;

    /* renamed from: n */
    C0138g f571n;

    /* renamed from: o */
    private C0162r f572o;

    /* renamed from: p */
    private Runnable f573p;

    /* renamed from: q */
    private MenuItem.OnMenuItemClickListener f574q;

    /* renamed from: r */
    private CharSequence f575r;

    /* renamed from: s */
    private CharSequence f576s;

    /* renamed from: t */
    private ColorStateList f577t = null;

    /* renamed from: u */
    private PorterDuff.Mode f578u = null;

    /* renamed from: v */
    private boolean f579v = false;

    /* renamed from: w */
    private boolean f580w = false;

    /* renamed from: x */
    private boolean f581x = false;

    /* renamed from: y */
    private int f582y = 16;

    /* renamed from: z */
    private int f583z = 0;

    /* renamed from: androidx.appcompat.view.menu.i$a */
    /* compiled from: MenuItemImpl */
    class C0143a implements C5013b.C5015b {
        C0143a() {
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            C0142i iVar = C0142i.this;
            iVar.f571n.mo654d(iVar);
        }
    }

    C0142i(C0138g gVar, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f571n = gVar;
        this.f558a = i2;
        this.f559b = i;
        this.f560c = i3;
        this.f561d = i4;
        this.f562e = charSequence;
        this.f583z = i5;
    }

    /* renamed from: a */
    private static void m671a(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo695b(boolean z) {
        int i = this.f582y;
        int i2 = (z ? 2 : 0) | (i & -3);
        this.f582y = i2;
        if (i != i2) {
            this.f571n.mo641b(false);
        }
    }

    /* renamed from: c */
    public int mo696c() {
        return this.f561d;
    }

    public boolean collapseActionView() {
        if ((this.f583z & 8) == 0) {
            return false;
        }
        if (this.f553A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f555C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f571n.mo627a(this);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public char mo698d() {
        return this.f571n.mo671p() ? this.f567j : this.f565h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public String mo700e() {
        char d = mo698d();
        if (d == 0) {
            return "";
        }
        Resources resources = this.f571n.mo655e().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f571n.mo655e()).hasPermanentMenuKey()) {
            sb.append(resources.getString(C4797h.abc_prepend_shortcut_label));
        }
        int i = this.f571n.mo671p() ? this.f568k : this.f566i;
        m671a(sb, i, 65536, resources.getString(C4797h.abc_menu_meta_shortcut_label));
        m671a(sb, i, RecyclerView.C0638l.FLAG_APPEARED_IN_PRE_LAYOUT, resources.getString(C4797h.abc_menu_ctrl_shortcut_label));
        m671a(sb, i, 2, resources.getString(C4797h.abc_menu_alt_shortcut_label));
        m671a(sb, i, 1, resources.getString(C4797h.abc_menu_shift_shortcut_label));
        m671a(sb, i, 4, resources.getString(C4797h.abc_menu_sym_shortcut_label));
        m671a(sb, i, 8, resources.getString(C4797h.abc_menu_function_shortcut_label));
        if (d == 8) {
            sb.append(resources.getString(C4797h.abc_menu_delete_shortcut_label));
        } else if (d == 10) {
            sb.append(resources.getString(C4797h.abc_menu_enter_shortcut_label));
        } else if (d != ' ') {
            sb.append(d);
        } else {
            sb.append(resources.getString(C4797h.abc_menu_space_shortcut_label));
        }
        return sb.toString();
    }

    public boolean expandActionView() {
        if (!mo702f()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f555C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f571n.mo642b(this);
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo702f() {
        C5013b bVar;
        if ((this.f583z & 8) == 0) {
            return false;
        }
        if (this.f553A == null && (bVar = this.f554B) != null) {
            this.f553A = bVar.mo805a((MenuItem) this);
        }
        if (this.f553A != null) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public boolean mo703g() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f574q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        C0138g gVar = this.f571n;
        if (gVar.mo626a(gVar, (MenuItem) this)) {
            return true;
        }
        Runnable runnable = this.f573p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f564g != null) {
            try {
                this.f571n.mo655e().startActivity(this.f564g);
                return true;
            } catch (ActivityNotFoundException e) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
            }
        }
        C5013b bVar = this.f554B;
        if (bVar == null || !bVar.mo804d()) {
            return false;
        }
        return true;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public View getActionView() {
        View view = this.f553A;
        if (view != null) {
            return view;
        }
        C5013b bVar = this.f554B;
        if (bVar == null) {
            return null;
        }
        View a = bVar.mo805a((MenuItem) this);
        this.f553A = a;
        return a;
    }

    public int getAlphabeticModifiers() {
        return this.f568k;
    }

    public char getAlphabeticShortcut() {
        return this.f567j;
    }

    public CharSequence getContentDescription() {
        return this.f575r;
    }

    public int getGroupId() {
        return this.f559b;
    }

    public Drawable getIcon() {
        Drawable drawable = this.f569l;
        if (drawable != null) {
            return m670a(drawable);
        }
        if (this.f570m == 0) {
            return null;
        }
        Drawable c = C4800a.m7936c(this.f571n.mo655e(), this.f570m);
        this.f570m = 0;
        this.f569l = c;
        return m670a(c);
    }

    public ColorStateList getIconTintList() {
        return this.f577t;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f578u;
    }

    public Intent getIntent() {
        return this.f564g;
    }

    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f558a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f557E;
    }

    public int getNumericModifiers() {
        return this.f566i;
    }

    public char getNumericShortcut() {
        return this.f565h;
    }

    public int getOrder() {
        return this.f560c;
    }

    public SubMenu getSubMenu() {
        return this.f572o;
    }

    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f562e;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f563f;
        if (charSequence == null) {
            charSequence = this.f562e;
        }
        return (Build.VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) ? charSequence : charSequence.toString();
    }

    public CharSequence getTooltipText() {
        return this.f576s;
    }

    /* renamed from: h */
    public boolean mo716h() {
        return (this.f582y & 32) == 32;
    }

    public boolean hasSubMenu() {
        return this.f572o != null;
    }

    /* renamed from: i */
    public boolean mo718i() {
        return (this.f582y & 4) != 0;
    }

    public boolean isActionViewExpanded() {
        return this.f556D;
    }

    public boolean isCheckable() {
        return (this.f582y & 1) == 1;
    }

    public boolean isChecked() {
        return (this.f582y & 2) == 2;
    }

    public boolean isEnabled() {
        return (this.f582y & 16) != 0;
    }

    public boolean isVisible() {
        C5013b bVar = this.f554B;
        if (bVar == null || !bVar.mo808e()) {
            if ((this.f582y & 8) == 0) {
                return true;
            }
            return false;
        } else if ((this.f582y & 8) != 0 || !this.f554B.mo807b()) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: j */
    public boolean mo723j() {
        return (this.f583z & 1) == 1;
    }

    /* renamed from: k */
    public boolean mo724k() {
        return (this.f583z & 2) == 2;
    }

    /* renamed from: l */
    public boolean mo725l() {
        return this.f571n.mo666k();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo726m() {
        return this.f571n.mo674q() && mo698d() != 0;
    }

    /* renamed from: n */
    public boolean mo727n() {
        return (this.f583z & 4) == 4;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public MenuItem setAlphabeticShortcut(char c) {
        if (this.f567j == c) {
            return this;
        }
        this.f567j = Character.toLowerCase(c);
        this.f571n.mo641b(false);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        int i = this.f582y;
        boolean z2 = z | (i & true);
        this.f582y = z2 ? 1 : 0;
        if (i != z2) {
            this.f571n.mo641b(false);
        }
        return this;
    }

    public MenuItem setChecked(boolean z) {
        if ((this.f582y & 4) != 0) {
            this.f571n.mo618a((MenuItem) this);
        } else {
            mo695b(z);
        }
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        if (z) {
            this.f582y |= 16;
        } else {
            this.f582y &= -17;
        }
        this.f571n.mo641b(false);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f570m = 0;
        this.f569l = drawable;
        this.f581x = true;
        this.f571n.mo641b(false);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f577t = colorStateList;
        this.f579v = true;
        this.f581x = true;
        this.f571n.mo641b(false);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f578u = mode;
        this.f580w = true;
        this.f581x = true;
        this.f571n.mo641b(false);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f564g = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        if (this.f565h == c) {
            return this;
        }
        this.f565h = c;
        this.f571n.mo641b(false);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f555C = onActionExpandListener;
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f574q = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f565h = c;
        this.f567j = Character.toLowerCase(c2);
        this.f571n.mo641b(false);
        return this;
    }

    public void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            this.f583z = i;
            this.f571n.mo646c(this);
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f562e = charSequence;
        this.f571n.mo641b(false);
        C0162r rVar = this.f572o;
        if (rVar != null) {
            rVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f563f = charSequence;
        this.f571n.mo641b(false);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        if (mo701e(z)) {
            this.f571n.mo654d(this);
        }
        return this;
    }

    public String toString() {
        CharSequence charSequence = this.f562e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* renamed from: a */
    public void mo692a(C0162r rVar) {
        this.f572o = rVar;
        rVar.setHeaderTitle(getTitle());
    }

    /* renamed from: c */
    public void mo697c(boolean z) {
        this.f582y = (z ? 4 : 0) | (this.f582y & -5);
    }

    /* renamed from: d */
    public void mo699d(boolean z) {
        if (z) {
            this.f582y |= 32;
        } else {
            this.f582y &= -33;
        }
    }

    public C4966b setContentDescription(CharSequence charSequence) {
        this.f575r = charSequence;
        this.f571n.mo641b(false);
        return this;
    }

    public C4966b setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public C4966b setTooltipText(CharSequence charSequence) {
        this.f576s = charSequence;
        this.f571n.mo641b(false);
        return this;
    }

    public C4966b setActionView(View view) {
        int i;
        this.f553A = view;
        this.f554B = null;
        if (view != null && view.getId() == -1 && (i = this.f558a) > 0) {
            view.setId(i);
        }
        this.f571n.mo646c(this);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public CharSequence mo690a(C0155n.C0156a aVar) {
        if (aVar == null || !aVar.mo453c()) {
            return getTitle();
        }
        return getTitleCondensed();
    }

    /* renamed from: b */
    public void mo694b() {
        this.f571n.mo646c(this);
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f567j == c && this.f568k == i) {
            return this;
        }
        this.f567j = Character.toLowerCase(c);
        this.f568k = KeyEvent.normalizeMetaState(i);
        this.f571n.mo641b(false);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        if (this.f565h == c && this.f566i == i) {
            return this;
        }
        this.f565h = c;
        this.f566i = KeyEvent.normalizeMetaState(i);
        this.f571n.mo641b(false);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f565h = c;
        this.f566i = KeyEvent.normalizeMetaState(i);
        this.f567j = Character.toLowerCase(c2);
        this.f568k = KeyEvent.normalizeMetaState(i2);
        this.f571n.mo641b(false);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f569l = null;
        this.f570m = i;
        this.f581x = true;
        this.f571n.mo641b(false);
        return this;
    }

    public MenuItem setTitle(int i) {
        setTitle((CharSequence) this.f571n.mo655e().getString(i));
        return this;
    }

    /* renamed from: a */
    private Drawable m670a(Drawable drawable) {
        if (drawable != null && this.f581x && (this.f579v || this.f580w)) {
            drawable = C0414a.m2029i(drawable).mutate();
            if (this.f579v) {
                C0414a.m2014a(drawable, this.f577t);
            }
            if (this.f580w) {
                C0414a.m2017a(drawable, this.f578u);
            }
            this.f581x = false;
        }
        return drawable;
    }

    public C4966b setActionView(int i) {
        Context e = this.f571n.mo655e();
        setActionView(LayoutInflater.from(e).inflate(i, new LinearLayout(e), false));
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo691a(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f557E = contextMenuInfo;
    }

    /* renamed from: a */
    public C5013b mo488a() {
        return this.f554B;
    }

    /* renamed from: a */
    public C4966b mo487a(C5013b bVar) {
        C5013b bVar2 = this.f554B;
        if (bVar2 != null) {
            bVar2.mo17469f();
        }
        this.f553A = null;
        this.f554B = bVar;
        this.f571n.mo641b(true);
        C5013b bVar3 = this.f554B;
        if (bVar3 != null) {
            bVar3.mo806a((C5013b.C5015b) new C0143a());
        }
        return this;
    }

    /* renamed from: a */
    public void mo693a(boolean z) {
        this.f556D = z;
        this.f571n.mo641b(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo701e(boolean z) {
        int i = this.f582y;
        int i2 = (z ? 0 : 8) | (i & -9);
        this.f582y = i2;
        if (i != i2) {
            return true;
        }
        return false;
    }
}
