package p050l.p087i.p088a;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: l.i.a.c */
/* compiled from: ResourceCursorAdapter */
public abstract class C5095c extends C5090a {

    /* renamed from: f */
    private int f8965f;

    /* renamed from: g */
    private int f8966g;

    /* renamed from: h */
    private LayoutInflater f8967h;

    @Deprecated
    public C5095c(Context context, int i, Cursor cursor, boolean z) {
        super(context, cursor, z);
        this.f8966g = i;
        this.f8965f = i;
        this.f8967h = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public View newDropDownView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f8967h.inflate(this.f8966g, viewGroup, false);
    }

    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f8967h.inflate(this.f8965f, viewGroup, false);
    }
}
