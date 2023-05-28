package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;
import p050l.p051a.p058o.C4823c;
import p050l.p075h.p077f.p078a.C4966b;
import p050l.p075h.p084l.C5013b;

/* renamed from: androidx.appcompat.view.menu.j */
/* compiled from: MenuItemWrapperICS */
public class C0144j extends C0128c implements MenuItem {

    /* renamed from: d */
    private final C4966b f585d;

    /* renamed from: e */
    private Method f586e;

    /* renamed from: androidx.appcompat.view.menu.j$a */
    /* compiled from: MenuItemWrapperICS */
    private class C0145a extends C5013b {

        /* renamed from: b */
        final ActionProvider f587b;

        C0145a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f587b = actionProvider;
        }

        /* renamed from: a */
        public boolean mo802a() {
            return this.f587b.hasSubMenu();
        }

        /* renamed from: c */
        public View mo803c() {
            return this.f587b.onCreateActionView();
        }

        /* renamed from: d */
        public boolean mo804d() {
            return this.f587b.onPerformDefaultAction();
        }

        /* renamed from: a */
        public void mo801a(SubMenu subMenu) {
            this.f587b.onPrepareSubMenu(C0144j.this.mo561a(subMenu));
        }
    }

    /* renamed from: androidx.appcompat.view.menu.j$b */
    /* compiled from: MenuItemWrapperICS */
    private class C0146b extends C0145a implements ActionProvider.VisibilityListener {

        /* renamed from: d */
        private C5013b.C5015b f589d;

        C0146b(C0144j jVar, Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        /* renamed from: a */
        public View mo805a(MenuItem menuItem) {
            return this.f587b.onCreateActionView(menuItem);
        }

        /* renamed from: b */
        public boolean mo807b() {
            return this.f587b.isVisible();
        }

        /* renamed from: e */
        public boolean mo808e() {
            return this.f587b.overridesItemVisibility();
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            C5013b.C5015b bVar = this.f589d;
            if (bVar != null) {
                bVar.onActionProviderVisibilityChanged(z);
            }
        }

        /* renamed from: a */
        public void mo806a(C5013b.C5015b bVar) {
            this.f589d = bVar;
            this.f587b.setVisibilityListener(bVar != null ? this : null);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.j$c */
    /* compiled from: MenuItemWrapperICS */
    static class C0147c extends FrameLayout implements C4823c {

        /* renamed from: f */
        final CollapsibleActionView f590f;

        C0147c(View view) {
            super(view.getContext());
            this.f590f = (CollapsibleActionView) view;
            addView(view);
        }

        /* renamed from: a */
        public void mo810a() {
            this.f590f.onActionViewExpanded();
        }

        /* renamed from: b */
        public void mo811b() {
            this.f590f.onActionViewCollapsed();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public View mo812c() {
            return (View) this.f590f;
        }
    }

    /* renamed from: androidx.appcompat.view.menu.j$d */
    /* compiled from: MenuItemWrapperICS */
    private class C0148d implements MenuItem.OnActionExpandListener {

        /* renamed from: a */
        private final MenuItem.OnActionExpandListener f591a;

        C0148d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f591a = onActionExpandListener;
        }

        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f591a.onMenuItemActionCollapse(C0144j.this.mo560a(menuItem));
        }

        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f591a.onMenuItemActionExpand(C0144j.this.mo560a(menuItem));
        }
    }

    /* renamed from: androidx.appcompat.view.menu.j$e */
    /* compiled from: MenuItemWrapperICS */
    private class C0149e implements MenuItem.OnMenuItemClickListener {

        /* renamed from: f */
        private final MenuItem.OnMenuItemClickListener f593f;

        C0149e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f593f = onMenuItemClickListener;
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f593f.onMenuItemClick(C0144j.this.mo560a(menuItem));
        }
    }

    public C0144j(Context context, C4966b bVar) {
        super(context);
        if (bVar != null) {
            this.f585d = bVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    /* renamed from: a */
    public void mo746a(boolean z) {
        try {
            if (this.f586e == null) {
                this.f586e = this.f585d.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
            }
            this.f586e.invoke(this.f585d, new Object[]{Boolean.valueOf(z)});
        } catch (Exception e) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
        }
    }

    public boolean collapseActionView() {
        return this.f585d.collapseActionView();
    }

    public boolean expandActionView() {
        return this.f585d.expandActionView();
    }

    public ActionProvider getActionProvider() {
        C5013b a = this.f585d.mo488a();
        if (a instanceof C0145a) {
            return ((C0145a) a).f587b;
        }
        return null;
    }

    public View getActionView() {
        View actionView = this.f585d.getActionView();
        return actionView instanceof C0147c ? ((C0147c) actionView).mo812c() : actionView;
    }

    public int getAlphabeticModifiers() {
        return this.f585d.getAlphabeticModifiers();
    }

    public char getAlphabeticShortcut() {
        return this.f585d.getAlphabeticShortcut();
    }

    public CharSequence getContentDescription() {
        return this.f585d.getContentDescription();
    }

    public int getGroupId() {
        return this.f585d.getGroupId();
    }

    public Drawable getIcon() {
        return this.f585d.getIcon();
    }

    public ColorStateList getIconTintList() {
        return this.f585d.getIconTintList();
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f585d.getIconTintMode();
    }

    public Intent getIntent() {
        return this.f585d.getIntent();
    }

    public int getItemId() {
        return this.f585d.getItemId();
    }

    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f585d.getMenuInfo();
    }

    public int getNumericModifiers() {
        return this.f585d.getNumericModifiers();
    }

    public char getNumericShortcut() {
        return this.f585d.getNumericShortcut();
    }

    public int getOrder() {
        return this.f585d.getOrder();
    }

    public SubMenu getSubMenu() {
        return mo561a(this.f585d.getSubMenu());
    }

    public CharSequence getTitle() {
        return this.f585d.getTitle();
    }

    public CharSequence getTitleCondensed() {
        return this.f585d.getTitleCondensed();
    }

    public CharSequence getTooltipText() {
        return this.f585d.getTooltipText();
    }

    public boolean hasSubMenu() {
        return this.f585d.hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return this.f585d.isActionViewExpanded();
    }

    public boolean isCheckable() {
        return this.f585d.isCheckable();
    }

    public boolean isChecked() {
        return this.f585d.isChecked();
    }

    public boolean isEnabled() {
        return this.f585d.isEnabled();
    }

    public boolean isVisible() {
        return this.f585d.isVisible();
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        C5013b bVar;
        if (Build.VERSION.SDK_INT >= 16) {
            bVar = new C0146b(this, this.f464a, actionProvider);
        } else {
            bVar = new C0145a(this.f464a, actionProvider);
        }
        C4966b bVar2 = this.f585d;
        if (actionProvider == null) {
            bVar = null;
        }
        bVar2.mo487a(bVar);
        return this;
    }

    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0147c(view);
        }
        this.f585d.setActionView(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.f585d.setAlphabeticShortcut(c);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.f585d.setCheckable(z);
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.f585d.setChecked(z);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f585d.setContentDescription(charSequence);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f585d.setEnabled(z);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f585d.setIcon(drawable);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f585d.setIconTintList(colorStateList);
        return this;
    }

    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f585d.setIconTintMode(mode);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f585d.setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        this.f585d.setNumericShortcut(c);
        return this;
    }

    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f585d.setOnActionExpandListener(onActionExpandListener != null ? new C0148d(onActionExpandListener) : null);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f585d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new C0149e(onMenuItemClickListener) : null);
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f585d.setShortcut(c, c2);
        return this;
    }

    public void setShowAsAction(int i) {
        this.f585d.setShowAsAction(i);
    }

    public MenuItem setShowAsActionFlags(int i) {
        this.f585d.setShowAsActionFlags(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f585d.setTitle(charSequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f585d.setTitleCondensed(charSequence);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f585d.setTooltipText(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        return this.f585d.setVisible(z);
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f585d.setAlphabeticShortcut(c, i);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f585d.setIcon(i);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        this.f585d.setNumericShortcut(c, i);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f585d.setShortcut(c, c2, i, i2);
        return this;
    }

    public MenuItem setTitle(int i) {
        this.f585d.setTitle(i);
        return this;
    }

    public MenuItem setActionView(int i) {
        this.f585d.setActionView(i);
        View actionView = this.f585d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f585d.setActionView((View) new C0147c(actionView));
        }
        return this;
    }
}
