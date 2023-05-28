package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.C8491e;
import p050l.p075h.p084l.C5071v;
import p112n.p277e.p279b.p282b.C10578f;
import p112n.p277e.p279b.p282b.C10580h;

/* renamed from: com.google.android.material.datepicker.h */
/* compiled from: MonthsPagerAdapter */
class C8506h extends RecyclerView.C0633g<C8508b> {

    /* renamed from: a */
    private final CalendarConstraints f24274a;

    /* renamed from: b */
    private final DateSelector<?> f24275b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C8491e.C8503l f24276c;

    /* renamed from: d */
    private final int f24277d;

    /* renamed from: com.google.android.material.datepicker.h$a */
    /* compiled from: MonthsPagerAdapter */
    class C8507a implements AdapterView.OnItemClickListener {

        /* renamed from: f */
        final /* synthetic */ MaterialCalendarGridView f24278f;

        C8507a(MaterialCalendarGridView materialCalendarGridView) {
            this.f24278f = materialCalendarGridView;
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (this.f24278f.getAdapter().mo31623e(i)) {
                C8506h.this.f24276c.mo31613a(this.f24278f.getAdapter().getItem(i).longValue());
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.h$b */
    /* compiled from: MonthsPagerAdapter */
    public static class C8508b extends RecyclerView.C0629c0 {

        /* renamed from: a */
        final TextView f24280a;

        /* renamed from: b */
        final MaterialCalendarGridView f24281b;

        C8508b(LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(C10578f.month_title);
            this.f24280a = textView;
            C5071v.m9171a((View) textView, true);
            this.f24281b = (MaterialCalendarGridView) linearLayout.findViewById(C10578f.month_grid);
            if (!z) {
                this.f24280a.setVisibility(8);
            }
        }
    }

    C8506h(Context context, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints, C8491e.C8503l lVar) {
        Month e = calendarConstraints.mo31563e();
        Month b = calendarConstraints.mo31559b();
        Month d = calendarConstraints.mo31561d();
        if (e.compareTo(d) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        } else if (d.compareTo(b) <= 0) {
            this.f24277d = (C8505g.f24269j * C8491e.m27649a(context)) + (C8504f.m27671a(context) ? C8491e.m27649a(context) : 0);
            this.f24274a = calendarConstraints;
            this.f24275b = dateSelector;
            this.f24276c = lVar;
            setHasStableIds(true);
        } else {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public CharSequence mo31632b(int i) {
        return mo31630a(i).mo31589d();
    }

    public int getItemCount() {
        return this.f24274a.mo31560c();
    }

    public long getItemId(int i) {
        return this.f24274a.mo31563e().mo31587b(i).mo31591e();
    }

    /* renamed from: a */
    public void onBindViewHolder(C8508b bVar, int i) {
        Month b = this.f24274a.mo31563e().mo31587b(i);
        bVar.f24280a.setText(b.mo31589d());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.f24281b.findViewById(C10578f.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !b.equals(materialCalendarGridView.getAdapter().f24270f)) {
            C8505g gVar = new C8505g(b, this.f24275b, this.f24274a);
            materialCalendarGridView.setNumColumns(b.f24215j);
            materialCalendarGridView.setAdapter((ListAdapter) gVar);
        } else {
            materialCalendarGridView.getAdapter().notifyDataSetChanged();
        }
        materialCalendarGridView.setOnItemClickListener(new C8507a(materialCalendarGridView));
    }

    public C8508b onCreateViewHolder(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C10580h.mtrl_calendar_month_labeled, viewGroup, false);
        if (!C8504f.m27671a(viewGroup.getContext())) {
            return new C8508b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.C0649p(-1, this.f24277d));
        return new C8508b(linearLayout, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Month mo31630a(int i) {
        return this.f24274a.mo31563e().mo31587b(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo31629a(Month month) {
        return this.f24274a.mo31563e().mo31586b(month);
    }
}
