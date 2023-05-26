package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.content.C0394a;
import androidx.core.graphics.drawable.C0414a;
import androidx.recyclerview.widget.RecyclerView;
import p050l.p075h.p077f.p078a.C4966b;
import p050l.p075h.p084l.C5013b;

/* renamed from: androidx.appcompat.view.menu.a */
/* compiled from: ActionMenuItem */
public class C0126a implements C4966b {

    /* renamed from: a */
    private final int f436a;

    /* renamed from: b */
    private final int f437b;

    /* renamed from: c */
    private final int f438c;

    /* renamed from: d */
    private CharSequence f439d;

    /* renamed from: e */
    private CharSequence f440e;

    /* renamed from: f */
    private Intent f441f;

    /* renamed from: g */
    private char f442g;

    /* renamed from: h */
    private int f443h = RecyclerView.C0638l.FLAG_APPEARED_IN_PRE_LAYOUT;

    /* renamed from: i */
    private char f444i;

    /* renamed from: j */
    private int f445j = RecyclerView.C0638l.FLAG_APPEARED_IN_PRE_LAYOUT;

    /* renamed from: k */
    private Drawable f446k;

    /* renamed from: l */
    private Context f447l;

    /* renamed from: m */
    private CharSequence f448m;

    /* renamed from: n */
    private CharSequence f449n;

    /* renamed from: o */
    private ColorStateList f450o = null;

    /* renamed from: p */
    private PorterDuff.Mode f451p = null;

    /* renamed from: q */
    private boolean f452q = false;

    /* renamed from: r */
    private boolean f453r = false;

    /* renamed from: s */
    private int f454s = 16;

    public C0126a(Context context, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.f447l = context;
        this.f436a = i2;
        this.f437b = i;
        this.f438c = i4;
        this.f439d = charSequence;
    }

    /* renamed from: b */
    private void m533b() {
        if (this.f446k == null) {
            return;
        }
        if (this.f452q || this.f453r) {
            Drawable i = C0414a.m2029i(this.f446k);
            this.f446k = i;
            Drawable mutate = i.mutate();
            this.f446k = mutate;
            if (this.f452q) {
                C0414a.m2014a(mutate, this.f450o);
            }
            if (this.f453r) {
                C0414a.m2017a(this.f446k, this.f451p);
            }
        }
    }

    /* renamed from: a */
    public C4966b mo487a(C5013b bVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public C5013b mo488a() {
        return null;
    }

    public boolean collapseActionView() {
        return false;
    }

    public boolean expandActionView() {
        return false;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public View getActionView() {
        return null;
    }

    public int getAlphabeticModifiers() {
        return this.f445j;
    }

    public char getAlphabeticShortcut() {
        return this.f444i;
    }

    public CharSequence getContentDescription() {
        return this.f448m;
    }

    public int getGroupId() {
        return this.f437b;
    }

    public Drawable getIcon() {
        return this.f446k;
    }

    public ColorStateList getIconTintList() {
        return this.f450o;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f451p;
    }

    public Intent getIntent() {
        return this.f441f;
    }

    public int getItemId() {
        return this.f436a;
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public int getNumericModifiers() {
        return this.f443h;
    }

    public char getNumericShortcut() {
        return this.f442g;
    }

    public int getOrder() {
        return this.f438c;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public CharSequence getTitle() {
        return this.f439d;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f440e;
        return charSequence != null ? charSequence : this.f439d;
    }

    public CharSequence getTooltipText() {
        return this.f449n;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isActionViewExpanded() {
        return false;
    }

    public boolean isCheckable() {
        return (this.f454s & 1) != 0;
    }

    public boolean isChecked() {
        return (this.f454s & 2) != 0;
    }

    public boolean isEnabled() {
        return (this.f454s & 16) != 0;
    }

    public boolean isVisible() {
        return (this.f454s & 8) == 0;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.f444i = Character.toLowerCase(c);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.f454s = z | (this.f454s & true) ? 1 : 0;
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.f454s = (z ? 2 : 0) | (this.f454s & -3);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f454s = (z ? 16 : 0) | (this.f454s & -17);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f446k = drawable;
        m533b();
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f450o = colorStateList;
        this.f452q = true;
        m533b();
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f451p = mode;
        this.f453r = true;
        m533b();
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f441f = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        this.f442g = c;
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f442g = c;
        this.f444i = Character.toLowerCase(c2);
        return this;
    }

    public void setShowAsAction(int i) {
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f439d = charSequence;
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f440e = charSequence;
        return this;
    }

    public MenuItem setVisible(boolean z) {
        int i = 8;
        int i2 = this.f454s & 8;
        if (z) {
            i = 0;
        }
        this.f454s = i2 | i;
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f444i = Character.toLowerCase(c);
        this.f445j = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public C4966b setContentDescription(CharSequence charSequence) {
        this.f448m = charSequence;
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        this.f442g = c;
        this.f443h = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public C4966b setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public MenuItem setTitle(int i) {
        this.f439d = this.f447l.getResources().getString(i);
        return this;
    }

    public C4966b setTooltipText(CharSequence charSequence) {
        this.f449n = charSequence;
        return this;
    }

    public C4966b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setIcon(int i) {
        this.f446k = C0394a.m1917c(this.f447l, i);
        m533b();
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f442g = c;
        this.f443h = KeyEvent.normalizeMetaState(i);
        this.f444i = Character.toLowerCase(c2);
        this.f445j = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public C4966b setActionView(int i) {
        throw new UnsupportedOperationException();
    }
}
