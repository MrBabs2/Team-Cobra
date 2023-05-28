package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import p050l.p075h.p077f.p078a.C4965a;

/* renamed from: androidx.appcompat.view.menu.o */
/* compiled from: MenuWrapperICS */
public class C0157o extends C0128c implements Menu {

    /* renamed from: d */
    private final C4965a f609d;

    public C0157o(Context context, C4965a aVar) {
        super(context);
        if (aVar != null) {
            this.f609d = aVar;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public MenuItem add(CharSequence charSequence) {
        return mo560a(this.f609d.add(charSequence));
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr;
        MenuItem[] menuItemArr3 = menuItemArr2 != null ? new MenuItem[menuItemArr2.length] : null;
        int addIntentOptions = this.f609d.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr3);
        if (menuItemArr3 != null) {
            int length = menuItemArr3.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr2[i5] = mo560a(menuItemArr3[i5]);
            }
        }
        return addIntentOptions;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return mo561a(this.f609d.addSubMenu(charSequence));
    }

    public void clear() {
        mo563b();
        this.f609d.clear();
    }

    public void close() {
        this.f609d.close();
    }

    public MenuItem findItem(int i) {
        return mo560a(this.f609d.findItem(i));
    }

    public MenuItem getItem(int i) {
        return mo560a(this.f609d.getItem(i));
    }

    public boolean hasVisibleItems() {
        return this.f609d.hasVisibleItems();
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f609d.isShortcutKey(i, keyEvent);
    }

    public boolean performIdentifierAction(int i, int i2) {
        return this.f609d.performIdentifierAction(i, i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.f609d.performShortcut(i, keyEvent, i2);
    }

    public void removeGroup(int i) {
        mo562a(i);
        this.f609d.removeGroup(i);
    }

    public void removeItem(int i) {
        mo564b(i);
        this.f609d.removeItem(i);
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        this.f609d.setGroupCheckable(i, z, z2);
    }

    public void setGroupEnabled(int i, boolean z) {
        this.f609d.setGroupEnabled(i, z);
    }

    public void setGroupVisible(int i, boolean z) {
        this.f609d.setGroupVisible(i, z);
    }

    public void setQwertyMode(boolean z) {
        this.f609d.setQwertyMode(z);
    }

    public int size() {
        return this.f609d.size();
    }

    public MenuItem add(int i) {
        return mo560a(this.f609d.add(i));
    }

    public SubMenu addSubMenu(int i) {
        return mo561a(this.f609d.addSubMenu(i));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo560a(this.f609d.add(i, i2, i3, charSequence));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return mo561a(this.f609d.addSubMenu(i, i2, i3, charSequence));
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo560a(this.f609d.add(i, i2, i3, i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return mo561a(this.f609d.addSubMenu(i, i2, i3, i4));
    }
}
