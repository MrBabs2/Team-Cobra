package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.C0155n;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.menu.f */
/* compiled from: MenuAdapter */
public class C0137f extends BaseAdapter {

    /* renamed from: f */
    C0138g f516f;

    /* renamed from: g */
    private int f517g = -1;

    /* renamed from: h */
    private boolean f518h;

    /* renamed from: i */
    private final boolean f519i;

    /* renamed from: j */
    private final LayoutInflater f520j;

    /* renamed from: k */
    private final int f521k;

    public C0137f(C0138g gVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.f519i = z;
        this.f520j = layoutInflater;
        this.f516f = gVar;
        this.f521k = i;
        mo601a();
    }

    /* renamed from: a */
    public void mo602a(boolean z) {
        this.f518h = z;
    }

    /* renamed from: b */
    public C0138g mo603b() {
        return this.f516f;
    }

    public int getCount() {
        ArrayList<C0142i> j = this.f519i ? this.f516f.mo665j() : this.f516f.mo669n();
        if (this.f517g < 0) {
            return j.size();
        }
        return j.size() - 1;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f520j.inflate(this.f521k, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i2 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f516f.mo670o() && groupId != (i2 >= 0 ? getItem(i2).getGroupId() : groupId));
        C0155n.C0156a aVar = (C0155n.C0156a) view;
        if (this.f518h) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.mo450a(getItem(i), 0);
        return view;
    }

    public void notifyDataSetChanged() {
        mo601a();
        super.notifyDataSetChanged();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo601a() {
        C0142i f = this.f516f.mo657f();
        if (f != null) {
            ArrayList<C0142i> j = this.f516f.mo665j();
            int size = j.size();
            for (int i = 0; i < size; i++) {
                if (j.get(i) == f) {
                    this.f517g = i;
                    return;
                }
            }
        }
        this.f517g = -1;
    }

    public C0142i getItem(int i) {
        ArrayList<C0142i> j = this.f519i ? this.f516f.mo665j() : this.f516f.mo669n();
        int i2 = this.f517g;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return j.get(i);
    }
}
