package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.content.C0394a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import okhttp3.internal.http2.Settings;
import p050l.p075h.p077f.p078a.C4965a;
import p050l.p075h.p084l.C5013b;
import p050l.p075h.p084l.C5083w;

/* renamed from: androidx.appcompat.view.menu.g */
/* compiled from: MenuBuilder */
public class C0138g implements C4965a {

    /* renamed from: A */
    private static final int[] f522A = {1, 4, 5, 3, 2, 0};

    /* renamed from: a */
    private final Context f523a;

    /* renamed from: b */
    private final Resources f524b;

    /* renamed from: c */
    private boolean f525c;

    /* renamed from: d */
    private boolean f526d;

    /* renamed from: e */
    private C0139a f527e;

    /* renamed from: f */
    private ArrayList<C0142i> f528f;

    /* renamed from: g */
    private ArrayList<C0142i> f529g;

    /* renamed from: h */
    private boolean f530h;

    /* renamed from: i */
    private ArrayList<C0142i> f531i;

    /* renamed from: j */
    private ArrayList<C0142i> f532j;

    /* renamed from: k */
    private boolean f533k;

    /* renamed from: l */
    private int f534l = 0;

    /* renamed from: m */
    private ContextMenu.ContextMenuInfo f535m;

    /* renamed from: n */
    CharSequence f536n;

    /* renamed from: o */
    Drawable f537o;

    /* renamed from: p */
    View f538p;

    /* renamed from: q */
    private boolean f539q = false;

    /* renamed from: r */
    private boolean f540r = false;

    /* renamed from: s */
    private boolean f541s = false;

    /* renamed from: t */
    private boolean f542t = false;

    /* renamed from: u */
    private boolean f543u = false;

    /* renamed from: v */
    private ArrayList<C0142i> f544v = new ArrayList<>();

    /* renamed from: w */
    private CopyOnWriteArrayList<WeakReference<C0153m>> f545w = new CopyOnWriteArrayList<>();

    /* renamed from: x */
    private C0142i f546x;

    /* renamed from: y */
    private boolean f547y = false;

    /* renamed from: z */
    private boolean f548z;

    /* renamed from: androidx.appcompat.view.menu.g$a */
    /* compiled from: MenuBuilder */
    public interface C0139a {
        /* renamed from: a */
        void mo317a(C0138g gVar);

        /* renamed from: a */
        boolean mo320a(C0138g gVar, MenuItem menuItem);
    }

    /* renamed from: androidx.appcompat.view.menu.g$b */
    /* compiled from: MenuBuilder */
    public interface C0140b {
        /* renamed from: a */
        boolean mo473a(C0142i iVar);
    }

    public C0138g(Context context) {
        this.f523a = context;
        this.f524b = context.getResources();
        this.f528f = new ArrayList<>();
        this.f529g = new ArrayList<>();
        this.f530h = true;
        this.f531i = new ArrayList<>();
        this.f532j = new ArrayList<>();
        this.f533k = true;
        m610e(true);
    }

    /* renamed from: d */
    private void m608d(boolean z) {
        if (!this.f545w.isEmpty()) {
            mo678s();
            Iterator<WeakReference<C0153m>> it = this.f545w.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0153m mVar = (C0153m) next.get();
                if (mVar == null) {
                    this.f545w.remove(next);
                } else {
                    mVar.mo552a(z);
                }
            }
            mo675r();
        }
    }

    /* renamed from: e */
    private void m609e(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null && !this.f545w.isEmpty()) {
            Iterator<WeakReference<C0153m>> it = this.f545w.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0153m mVar = (C0153m) next.get();
                if (mVar == null) {
                    this.f545w.remove(next);
                } else {
                    int id = mVar.getId();
                    if (id > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id)) != null) {
                        mVar.mo566a(parcelable);
                    }
                }
            }
        }
    }

    /* renamed from: f */
    private void m612f(Bundle bundle) {
        Parcelable c;
        if (!this.f545w.isEmpty()) {
            SparseArray sparseArray = new SparseArray();
            Iterator<WeakReference<C0153m>> it = this.f545w.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0153m mVar = (C0153m) next.get();
                if (mVar == null) {
                    this.f545w.remove(next);
                } else {
                    int id = mVar.getId();
                    if (id > 0 && (c = mVar.mo574c()) != null) {
                        sparseArray.put(id, c);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        }
    }

    /* renamed from: a */
    public void mo620a(C0153m mVar) {
        mo621a(mVar, this.f523a);
    }

    public MenuItem add(CharSequence charSequence) {
        return mo611a(0, 0, 0, charSequence);
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f523a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = intent3;
            }
        }
        return size;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* renamed from: b */
    public void mo640b(C0153m mVar) {
        Iterator<WeakReference<C0153m>> it = this.f545w.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            C0153m mVar2 = (C0153m) next.get();
            if (mVar2 == null || mVar2 == mVar) {
                this.f545w.remove(next);
            }
        }
    }

    /* renamed from: c */
    public C0138g mo643c(int i) {
        this.f534l = i;
        return this;
    }

    public void clear() {
        C0142i iVar = this.f546x;
        if (iVar != null) {
            mo627a(iVar);
        }
        this.f528f.clear();
        mo641b(true);
    }

    public void clearHeader() {
        this.f537o = null;
        this.f536n = null;
        this.f538p = null;
        mo641b(false);
    }

    public void close() {
        mo623a(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo652d() {
        return "android:menu:actionviewstates";
    }

    public MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C0142i iVar = this.f528f.get(i2);
            if (iVar.getItemId() == i) {
                return iVar;
            }
            if (iVar.hasSubMenu() && (findItem = iVar.getSubMenu().findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    /* renamed from: g */
    public Drawable mo659g() {
        return this.f537o;
    }

    public MenuItem getItem(int i) {
        return this.f528f.get(i);
    }

    /* renamed from: h */
    public CharSequence mo661h() {
        return this.f536n;
    }

    public boolean hasVisibleItems() {
        if (this.f548z) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f528f.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public View mo663i() {
        return this.f538p;
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return mo615a(i, keyEvent) != null;
    }

    /* renamed from: j */
    public ArrayList<C0142i> mo665j() {
        mo638b();
        return this.f532j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo666k() {
        return this.f542t;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public Resources mo667l() {
        return this.f524b;
    }

    /* renamed from: m */
    public C0138g mo668m() {
        return this;
    }

    /* renamed from: n */
    public ArrayList<C0142i> mo669n() {
        if (!this.f530h) {
            return this.f529g;
        }
        this.f529g.clear();
        int size = this.f528f.size();
        for (int i = 0; i < size; i++) {
            C0142i iVar = this.f528f.get(i);
            if (iVar.isVisible()) {
                this.f529g.add(iVar);
            }
        }
        this.f530h = false;
        this.f533k = true;
        return this.f529g;
    }

    /* renamed from: o */
    public boolean mo670o() {
        return this.f547y;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public boolean mo671p() {
        return this.f525c;
    }

    public boolean performIdentifierAction(int i, int i2) {
        return mo624a(findItem(i), i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        C0142i a = mo615a(i, keyEvent);
        boolean a2 = a != null ? mo624a((MenuItem) a, i2) : false;
        if ((i2 & 2) != 0) {
            mo623a(true);
        }
        return a2;
    }

    /* renamed from: q */
    public boolean mo674q() {
        return this.f526d;
    }

    /* renamed from: r */
    public void mo675r() {
        this.f539q = false;
        if (this.f540r) {
            this.f540r = false;
            mo641b(this.f541s);
        }
    }

    public void removeGroup(int i) {
        int a = mo609a(i);
        if (a >= 0) {
            int size = this.f528f.size() - a;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= size || this.f528f.get(a).getGroupId() != i) {
                    mo641b(true);
                } else {
                    m606a(a, false);
                    i2 = i3;
                }
            }
            mo641b(true);
        }
    }

    public void removeItem(int i) {
        m606a(mo637b(i), true);
    }

    /* renamed from: s */
    public void mo678s() {
        if (!this.f539q) {
            this.f539q = true;
            this.f540r = false;
            this.f541s = false;
        }
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f528f.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0142i iVar = this.f528f.get(i2);
            if (iVar.getGroupId() == i) {
                iVar.mo697c(z2);
                iVar.setCheckable(z);
            }
        }
    }

    public void setGroupDividerEnabled(boolean z) {
        this.f547y = z;
    }

    public void setGroupEnabled(int i, boolean z) {
        int size = this.f528f.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0142i iVar = this.f528f.get(i2);
            if (iVar.getGroupId() == i) {
                iVar.setEnabled(z);
            }
        }
    }

    public void setGroupVisible(int i, boolean z) {
        int size = this.f528f.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C0142i iVar = this.f528f.get(i2);
            if (iVar.getGroupId() == i && iVar.mo701e(z)) {
                z2 = true;
            }
        }
        if (z2) {
            mo641b(true);
        }
    }

    public void setQwertyMode(boolean z) {
        this.f525c = z;
        mo641b(false);
    }

    public int size() {
        return this.f528f.size();
    }

    /* renamed from: a */
    public void mo621a(C0153m mVar, Context context) {
        this.f545w.add(new WeakReference(mVar));
        mVar.mo547a(context, this);
        this.f533k = true;
    }

    public MenuItem add(int i) {
        return mo611a(0, 0, 0, this.f524b.getString(i));
    }

    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, (CharSequence) this.f524b.getString(i));
    }

    /* renamed from: c */
    public void mo645c(Bundle bundle) {
        int size = size();
        SparseArray sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((C0162r) item.getSubMenu()).mo645c(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo652d(), sparseArray);
        }
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo611a(i, i2, i3, charSequence);
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0142i iVar = (C0142i) mo611a(i, i2, i3, charSequence);
        C0162r rVar = new C0162r(this.f523a, this, iVar);
        iVar.mo692a(rVar);
        return rVar;
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo611a(i, i2, i3, this.f524b.getString(i4));
    }

    /* renamed from: b */
    public void mo639b(Bundle bundle) {
        m609e(bundle);
    }

    /* renamed from: a */
    private boolean m607a(C0162r rVar, C0153m mVar) {
        boolean z = false;
        if (this.f545w.isEmpty()) {
            return false;
        }
        if (mVar != null) {
            z = mVar.mo556a(rVar);
        }
        Iterator<WeakReference<C0153m>> it = this.f545w.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            C0153m mVar2 = (C0153m) next.get();
            if (mVar2 == null) {
                this.f545w.remove(next);
            } else if (!z) {
                z = mVar2.mo556a(rVar);
            }
        }
        return z;
    }

    /* renamed from: b */
    public int mo637b(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f528f.get(i2).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, (CharSequence) this.f524b.getString(i4));
    }

    /* renamed from: b */
    public void mo641b(boolean z) {
        if (!this.f539q) {
            if (z) {
                this.f530h = true;
                this.f533k = true;
            }
            m608d(z);
            return;
        }
        this.f540r = true;
        if (z) {
            this.f541s = true;
        }
    }

    /* renamed from: d */
    public void mo653d(Bundle bundle) {
        m612f(bundle);
    }

    /* renamed from: e */
    private void m610e(boolean z) {
        boolean z2 = true;
        if (!z || this.f524b.getConfiguration().keyboard == 1 || !C5083w.m9258d(ViewConfiguration.get(this.f523a), this.f523a)) {
            z2 = false;
        }
        this.f526d = z2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo654d(C0142i iVar) {
        this.f530h = true;
        mo641b(true);
    }

    /* renamed from: f */
    private static int m611f(int i) {
        int i2 = (-65536 & i) >> 16;
        if (i2 >= 0) {
            int[] iArr = f522A;
            if (i2 < iArr.length) {
                return (i & Settings.DEFAULT_INITIAL_WINDOW_SIZE) | (iArr[i2] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    /* renamed from: a */
    public void mo617a(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(mo652d());
            int size = size();
            for (int i = 0; i < size; i++) {
                MenuItem item = getItem(i);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((C0162r) item.getSubMenu()).mo617a(bundle);
                }
            }
            int i2 = bundle.getInt("android:menu:expandedactionview");
            if (i2 > 0 && (findItem = findItem(i2)) != null) {
                findItem.expandActionView();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C0138g mo651d(int i) {
        m605a(0, (CharSequence) null, i, (Drawable) null, (View) null);
        return this;
    }

    /* renamed from: e */
    public Context mo655e() {
        return this.f523a;
    }

    /* renamed from: f */
    public C0142i mo657f() {
        return this.f546x;
    }

    /* renamed from: b */
    public void mo638b() {
        ArrayList<C0142i> n = mo669n();
        if (this.f533k) {
            Iterator<WeakReference<C0153m>> it = this.f545w.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0153m mVar = (C0153m) next.get();
                if (mVar == null) {
                    this.f545w.remove(next);
                } else {
                    z |= mVar.mo573b();
                }
            }
            if (z) {
                this.f531i.clear();
                this.f532j.clear();
                int size = n.size();
                for (int i = 0; i < size; i++) {
                    C0142i iVar = n.get(i);
                    if (iVar.mo716h()) {
                        this.f531i.add(iVar);
                    } else {
                        this.f532j.add(iVar);
                    }
                }
            } else {
                this.f531i.clear();
                this.f532j.clear();
                this.f532j.addAll(mo669n());
            }
            this.f533k = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo646c(C0142i iVar) {
        this.f533k = true;
        mo641b(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C0138g mo656e(int i) {
        m605a(i, (CharSequence) null, 0, (Drawable) null, (View) null);
        return this;
    }

    /* renamed from: c */
    public ArrayList<C0142i> mo644c() {
        mo638b();
        return this.f531i;
    }

    /* renamed from: c */
    public void mo647c(boolean z) {
        this.f548z = z;
    }

    /* renamed from: a */
    public void mo619a(C0139a aVar) {
        this.f527e = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public MenuItem mo611a(int i, int i2, int i3, CharSequence charSequence) {
        int f = m611f(i3);
        C0142i a = m604a(i, i2, i3, f, charSequence, this.f534l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f535m;
        if (contextMenuInfo != null) {
            a.mo691a(contextMenuInfo);
        }
        ArrayList<C0142i> arrayList = this.f528f;
        arrayList.add(m603a(arrayList, f), a);
        mo641b(true);
        return a;
    }

    /* renamed from: a */
    private C0142i m604a(int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        return new C0142i(this, i, i2, i3, i4, charSequence, i5);
    }

    /* renamed from: b */
    public boolean mo642b(C0142i iVar) {
        boolean z = false;
        if (this.f545w.isEmpty()) {
            return false;
        }
        mo678s();
        Iterator<WeakReference<C0153m>> it = this.f545w.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            C0153m mVar = (C0153m) next.get();
            if (mVar == null) {
                this.f545w.remove(next);
            } else {
                z = mVar.mo558b(this, iVar);
                if (z) {
                    break;
                }
            }
        }
        mo675r();
        if (z) {
            this.f546x = iVar;
        }
        return z;
    }

    /* renamed from: a */
    private void m606a(int i, boolean z) {
        if (i >= 0 && i < this.f528f.size()) {
            this.f528f.remove(i);
            if (z) {
                mo641b(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo618a(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f528f.size();
        mo678s();
        for (int i = 0; i < size; i++) {
            C0142i iVar = this.f528f.get(i);
            if (iVar.getGroupId() == groupId && iVar.mo718i() && iVar.isCheckable()) {
                iVar.mo695b(iVar == menuItem);
            }
        }
        mo675r();
    }

    /* renamed from: a */
    public int mo609a(int i) {
        return mo610a(i, 0);
    }

    /* renamed from: a */
    public int mo610a(int i, int i2) {
        int size = size();
        if (i2 < 0) {
            i2 = 0;
        }
        while (i2 < size) {
            if (this.f528f.get(i2).getGroupId() == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo626a(C0138g gVar, MenuItem menuItem) {
        C0139a aVar = this.f527e;
        return aVar != null && aVar.mo320a(gVar, menuItem);
    }

    /* renamed from: a */
    public void mo616a() {
        C0139a aVar = this.f527e;
        if (aVar != null) {
            aVar.mo317a(this);
        }
    }

    /* renamed from: a */
    private static int m603a(ArrayList<C0142i> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).mo696c() <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo622a(List<C0142i> list, int i, KeyEvent keyEvent) {
        boolean p = mo671p();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f528f.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0142i iVar = this.f528f.get(i2);
                if (iVar.hasSubMenu()) {
                    ((C0138g) iVar.getSubMenu()).mo622a(list, i, keyEvent);
                }
                char alphabeticShortcut = p ? iVar.getAlphabeticShortcut() : iVar.getNumericShortcut();
                if (((modifiers & 69647) == ((p ? iVar.getAlphabeticModifiers() : iVar.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (p && alphabeticShortcut == 8 && i == 67)) && iVar.isEnabled()) {
                        list.add(iVar);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0142i mo615a(int i, KeyEvent keyEvent) {
        char c;
        ArrayList<C0142i> arrayList = this.f544v;
        arrayList.clear();
        mo622a((List<C0142i>) arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean p = mo671p();
        for (int i2 = 0; i2 < size; i2++) {
            C0142i iVar = arrayList.get(i2);
            if (p) {
                c = iVar.getAlphabeticShortcut();
            } else {
                c = iVar.getNumericShortcut();
            }
            if ((c == keyData.meta[0] && (metaState & 2) == 0) || ((c == keyData.meta[2] && (metaState & 2) != 0) || (p && c == 8 && i == 67))) {
                return iVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public boolean mo624a(MenuItem menuItem, int i) {
        return mo625a(menuItem, (C0153m) null, i);
    }

    /* renamed from: a */
    public boolean mo625a(MenuItem menuItem, C0153m mVar, int i) {
        C0142i iVar = (C0142i) menuItem;
        if (iVar == null || !iVar.isEnabled()) {
            return false;
        }
        boolean g = iVar.mo703g();
        C5013b a = iVar.mo488a();
        boolean z = a != null && a.mo802a();
        if (iVar.mo702f()) {
            g |= iVar.expandActionView();
            if (g) {
                mo623a(true);
            }
        } else if (iVar.hasSubMenu() || z) {
            if ((i & 4) == 0) {
                mo623a(false);
            }
            if (!iVar.hasSubMenu()) {
                iVar.mo692a(new C0162r(mo655e(), this, iVar));
            }
            C0162r rVar = (C0162r) iVar.getSubMenu();
            if (z) {
                a.mo801a((SubMenu) rVar);
            }
            g |= m607a(rVar, mVar);
            if (!g) {
                mo623a(true);
            }
        } else if ((i & 1) == 0) {
            mo623a(true);
        }
        return g;
    }

    /* renamed from: a */
    public final void mo623a(boolean z) {
        if (!this.f543u) {
            this.f543u = true;
            Iterator<WeakReference<C0153m>> it = this.f545w.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0153m mVar = (C0153m) next.get();
                if (mVar == null) {
                    this.f545w.remove(next);
                } else {
                    mVar.mo549a(this, z);
                }
            }
            this.f543u = false;
        }
    }

    /* renamed from: a */
    private void m605a(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources l = mo667l();
        if (view != null) {
            this.f538p = view;
            this.f536n = null;
            this.f537o = null;
        } else {
            if (i > 0) {
                this.f536n = l.getText(i);
            } else if (charSequence != null) {
                this.f536n = charSequence;
            }
            if (i2 > 0) {
                this.f537o = C0394a.m1917c(mo655e(), i2);
            } else if (drawable != null) {
                this.f537o = drawable;
            }
            this.f538p = null;
        }
        mo641b(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0138g mo614a(CharSequence charSequence) {
        m605a(0, charSequence, 0, (Drawable) null, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0138g mo612a(Drawable drawable) {
        m605a(0, (CharSequence) null, 0, drawable, (View) null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0138g mo613a(View view) {
        m605a(0, (CharSequence) null, 0, (Drawable) null, view);
        return this;
    }

    /* renamed from: a */
    public boolean mo627a(C0142i iVar) {
        boolean z = false;
        if (!this.f545w.isEmpty() && this.f546x == iVar) {
            mo678s();
            Iterator<WeakReference<C0153m>> it = this.f545w.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                C0153m mVar = (C0153m) next.get();
                if (mVar == null) {
                    this.f545w.remove(next);
                } else {
                    z = mVar.mo555a(this, iVar);
                    if (z) {
                        break;
                    }
                }
            }
            mo675r();
            if (z) {
                this.f546x = null;
            }
        }
        return z;
    }
}
