package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.appcompat.view.menu.C0138g;
import androidx.appcompat.view.menu.C0142i;

/* renamed from: com.google.android.material.bottomnavigation.b */
/* compiled from: BottomNavigationMenu */
public final class C8452b extends C0138g {
    public C8452b(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public MenuItem mo611a(int i, int i2, int i3, CharSequence charSequence) {
        if (size() + 1 <= 5) {
            mo678s();
            MenuItem a = super.mo611a(i, i2, i3, charSequence);
            if (a instanceof C0142i) {
                ((C0142i) a).mo697c(true);
            }
            mo675r();
            return a;
        }
        throw new IllegalArgumentException("Maximum number of items supported by BottomNavigationView is 5. Limit can be checked with BottomNavigationView#getMaxItemCount()");
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        throw new UnsupportedOperationException("BottomNavigationView does not support submenus");
    }
}
