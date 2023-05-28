package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.C8491e;
import java.util.Calendar;
import java.util.Locale;
import p112n.p277e.p279b.p282b.C10580h;
import p112n.p277e.p279b.p282b.C10582j;

/* renamed from: com.google.android.material.datepicker.n */
/* compiled from: YearGridAdapter */
class C8515n extends RecyclerView.C0633g<C8517b> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C8491e<?> f24287a;

    /* renamed from: com.google.android.material.datepicker.n$a */
    /* compiled from: YearGridAdapter */
    class C8516a implements View.OnClickListener {

        /* renamed from: f */
        final /* synthetic */ int f24288f;

        C8516a(int i) {
            this.f24288f = i;
        }

        public void onClick(View view) {
            C8515n.this.f24287a.mo31604a(C8515n.this.f24287a.mo31606b().mo31558a(Month.m27631a(this.f24288f, C8515n.this.f24287a.mo31608d().f24213h)));
            C8515n.this.f24287a.mo31605a(C8491e.C8502k.DAY);
        }
    }

    /* renamed from: com.google.android.material.datepicker.n$b */
    /* compiled from: YearGridAdapter */
    public static class C8517b extends RecyclerView.C0629c0 {

        /* renamed from: a */
        final TextView f24290a;

        C8517b(TextView textView) {
            super(textView);
            this.f24290a = textView;
        }
    }

    C8515n(C8491e<?> eVar) {
        this.f24287a = eVar;
    }

    /* renamed from: c */
    private View.OnClickListener m27706c(int i) {
        return new C8516a(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo31639b(int i) {
        return this.f24287a.mo31606b().mo31563e().f24214i + i;
    }

    public int getItemCount() {
        return this.f24287a.mo31606b().mo31565f();
    }

    /* renamed from: a */
    public void onBindViewHolder(C8517b bVar, int i) {
        int b = mo31639b(i);
        String string = bVar.f24290a.getContext().getString(C10582j.mtrl_picker_navigate_to_year_description);
        bVar.f24290a.setText(String.format(Locale.getDefault(), "%d", new Object[]{Integer.valueOf(b)}));
        bVar.f24290a.setContentDescription(String.format(string, new Object[]{Integer.valueOf(b)}));
        C8488b c = this.f24287a.mo31607c();
        Calendar c2 = C8514m.m27700c();
        C8487a aVar = c2.get(1) == b ? c.f24228f : c.f24226d;
        for (Long longValue : this.f24287a.mo31609e().mo31573l()) {
            c2.setTimeInMillis(longValue.longValue());
            if (c2.get(1) == b) {
                aVar = c.f24227e;
            }
        }
        aVar.mo31598a(bVar.f24290a);
        bVar.f24290a.setOnClickListener(m27706c(b));
    }

    public C8517b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C8517b((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C10580h.mtrl_calendar_year, viewGroup, false));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo31637a(int i) {
        return i - this.f24287a.mo31606b().mo31563e().f24214i;
    }
}
