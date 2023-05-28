package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.recyclerview.widget.C0707k;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;
import p050l.p075h.p083k.C5004d;
import p050l.p075h.p084l.C5010a;
import p050l.p075h.p084l.C5071v;
import p050l.p075h.p084l.p085e0.C5034c;
import p112n.p277e.p279b.p282b.C10576d;
import p112n.p277e.p279b.p282b.C10578f;
import p112n.p277e.p279b.p282b.C10579g;
import p112n.p277e.p279b.p282b.C10580h;
import p112n.p277e.p279b.p282b.C10582j;

/* renamed from: com.google.android.material.datepicker.e */
/* compiled from: MaterialCalendar */
public final class C8491e<S> extends C8510j<S> {

    /* renamed from: q */
    static final Object f24235q = "MONTHS_VIEW_GROUP_TAG";

    /* renamed from: r */
    static final Object f24236r = "NAVIGATION_PREV_TAG";

    /* renamed from: s */
    static final Object f24237s = "NAVIGATION_NEXT_TAG";

    /* renamed from: t */
    static final Object f24238t = "SELECTOR_TOGGLE_TAG";

    /* renamed from: g */
    private int f24239g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public DateSelector<S> f24240h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public CalendarConstraints f24241i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public Month f24242j;

    /* renamed from: k */
    private C8502k f24243k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C8488b f24244l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public RecyclerView f24245m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public RecyclerView f24246n;

    /* renamed from: o */
    private View f24247o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public View f24248p;

    /* renamed from: com.google.android.material.datepicker.e$a */
    /* compiled from: MaterialCalendar */
    class C8492a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ int f24249f;

        C8492a(int i) {
            this.f24249f = i;
        }

        public void run() {
            C8491e.this.f24246n.smoothScrollToPosition(this.f24249f);
        }
    }

    /* renamed from: com.google.android.material.datepicker.e$b */
    /* compiled from: MaterialCalendar */
    class C8493b extends C5010a {
        C8493b(C8491e eVar) {
        }

        /* renamed from: a */
        public void mo2445a(View view, C5034c cVar) {
            super.mo2445a(view, cVar);
            cVar.mo17512a((Object) null);
        }
    }

    /* renamed from: com.google.android.material.datepicker.e$c */
    /* compiled from: MaterialCalendar */
    class C8494c extends C8511k {

        /* renamed from: a */
        final /* synthetic */ int f24251a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C8494c(Context context, int i, boolean z, int i2) {
            super(context, i, z);
            this.f24251a = i2;
        }

        /* access modifiers changed from: protected */
        public void calculateExtraLayoutSpace(RecyclerView.C0662z zVar, int[] iArr) {
            if (this.f24251a == 0) {
                iArr[0] = C8491e.this.f24246n.getWidth();
                iArr[1] = C8491e.this.f24246n.getWidth();
                return;
            }
            iArr[0] = C8491e.this.f24246n.getHeight();
            iArr[1] = C8491e.this.f24246n.getHeight();
        }
    }

    /* renamed from: com.google.android.material.datepicker.e$d */
    /* compiled from: MaterialCalendar */
    class C8495d implements C8503l {
        C8495d() {
        }

        /* renamed from: a */
        public void mo31613a(long j) {
            if (C8491e.this.f24241i.mo31557a().mo31568d(j)) {
                C8491e.this.f24240h.mo31571g(j);
                Iterator it = C8491e.this.f24282f.iterator();
                while (it.hasNext()) {
                    ((C8509i) it.next()).mo31634a(C8491e.this.f24240h.mo31574m());
                }
                C8491e.this.f24246n.getAdapter().notifyDataSetChanged();
                if (C8491e.this.f24245m != null) {
                    C8491e.this.f24245m.getAdapter().notifyDataSetChanged();
                }
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.e$e */
    /* compiled from: MaterialCalendar */
    class C8496e extends RecyclerView.C0643n {

        /* renamed from: a */
        private final Calendar f24254a = C8514m.m27703e();

        /* renamed from: b */
        private final Calendar f24255b = C8514m.m27703e();

        C8496e() {
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0662z zVar) {
            int i;
            if ((recyclerView.getAdapter() instanceof C8515n) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                C8515n nVar = (C8515n) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                for (C5004d next : C8491e.this.f24240h.mo31572i()) {
                    F f = next.f8862a;
                    if (!(f == null || next.f8863b == null)) {
                        this.f24254a.setTimeInMillis(((Long) f).longValue());
                        this.f24255b.setTimeInMillis(((Long) next.f8863b).longValue());
                        int a = nVar.mo31637a(this.f24254a.get(1));
                        int a2 = nVar.mo31637a(this.f24255b.get(1));
                        View findViewByPosition = gridLayoutManager.findViewByPosition(a);
                        View findViewByPosition2 = gridLayoutManager.findViewByPosition(a2);
                        int spanCount = a / gridLayoutManager.getSpanCount();
                        int spanCount2 = a2 / gridLayoutManager.getSpanCount();
                        int i2 = spanCount;
                        while (i2 <= spanCount2) {
                            View findViewByPosition3 = gridLayoutManager.findViewByPosition(gridLayoutManager.getSpanCount() * i2);
                            if (findViewByPosition3 != null) {
                                int top = findViewByPosition3.getTop() + C8491e.this.f24244l.f24226d.mo31599b();
                                int bottom = findViewByPosition3.getBottom() - C8491e.this.f24244l.f24226d.mo31597a();
                                int left = i2 == spanCount ? findViewByPosition.getLeft() + (findViewByPosition.getWidth() / 2) : 0;
                                if (i2 == spanCount2) {
                                    i = findViewByPosition2.getLeft() + (findViewByPosition2.getWidth() / 2);
                                } else {
                                    i = recyclerView.getWidth();
                                }
                                canvas.drawRect((float) left, (float) top, (float) i, (float) bottom, C8491e.this.f24244l.f24230h);
                            }
                            i2++;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.e$f */
    /* compiled from: MaterialCalendar */
    class C8497f extends C5010a {
        C8497f() {
        }

        /* renamed from: a */
        public void mo2445a(View view, C5034c cVar) {
            String str;
            super.mo2445a(view, cVar);
            if (C8491e.this.f24248p.getVisibility() == 0) {
                str = C8491e.this.getString(C10582j.mtrl_picker_toggle_to_year_selection);
            } else {
                str = C8491e.this.getString(C10582j.mtrl_picker_toggle_to_day_selection);
            }
            cVar.mo17531d((CharSequence) str);
        }
    }

    /* renamed from: com.google.android.material.datepicker.e$g */
    /* compiled from: MaterialCalendar */
    class C8498g extends RecyclerView.C0653t {

        /* renamed from: a */
        final /* synthetic */ C8506h f24258a;

        /* renamed from: b */
        final /* synthetic */ MaterialButton f24259b;

        C8498g(C8506h hVar, MaterialButton materialButton) {
            this.f24258a = hVar;
            this.f24259b = materialButton;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (i == 0) {
                CharSequence text = this.f24259b.getText();
                if (Build.VERSION.SDK_INT >= 16) {
                    recyclerView.announceForAccessibility(text);
                } else {
                    recyclerView.sendAccessibilityEvent(RecyclerView.C0638l.FLAG_MOVED);
                }
            }
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            int i3;
            if (i < 0) {
                i3 = C8491e.this.getLayoutManager().findFirstVisibleItemPosition();
            } else {
                i3 = C8491e.this.getLayoutManager().findLastVisibleItemPosition();
            }
            Month unused = C8491e.this.f24242j = this.f24258a.mo31630a(i3);
            this.f24259b.setText(this.f24258a.mo31632b(i3));
        }
    }

    /* renamed from: com.google.android.material.datepicker.e$h */
    /* compiled from: MaterialCalendar */
    class C8499h implements View.OnClickListener {
        C8499h() {
        }

        public void onClick(View view) {
            C8491e.this.mo31610f();
        }
    }

    /* renamed from: com.google.android.material.datepicker.e$i */
    /* compiled from: MaterialCalendar */
    class C8500i implements View.OnClickListener {

        /* renamed from: f */
        final /* synthetic */ C8506h f24262f;

        C8500i(C8506h hVar) {
            this.f24262f = hVar;
        }

        public void onClick(View view) {
            int findFirstVisibleItemPosition = C8491e.this.getLayoutManager().findFirstVisibleItemPosition() + 1;
            if (findFirstVisibleItemPosition < C8491e.this.f24246n.getAdapter().getItemCount()) {
                C8491e.this.mo31604a(this.f24262f.mo31630a(findFirstVisibleItemPosition));
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.e$j */
    /* compiled from: MaterialCalendar */
    class C8501j implements View.OnClickListener {

        /* renamed from: f */
        final /* synthetic */ C8506h f24264f;

        C8501j(C8506h hVar) {
            this.f24264f = hVar;
        }

        public void onClick(View view) {
            int findLastVisibleItemPosition = C8491e.this.getLayoutManager().findLastVisibleItemPosition() - 1;
            if (findLastVisibleItemPosition >= 0) {
                C8491e.this.mo31604a(this.f24264f.mo31630a(findLastVisibleItemPosition));
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.e$k */
    /* compiled from: MaterialCalendar */
    enum C8502k {
        DAY,
        YEAR
    }

    /* renamed from: com.google.android.material.datepicker.e$l */
    /* compiled from: MaterialCalendar */
    interface C8503l {
        /* renamed from: a */
        void mo31613a(long j);
    }

    /* renamed from: g */
    private RecyclerView.C0643n m27659g() {
        return new C8496e();
    }

    /* access modifiers changed from: package-private */
    public LinearLayoutManager getLayoutManager() {
        return (LinearLayoutManager) this.f24246n.getLayoutManager();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f24239g = bundle.getInt("THEME_RES_ID_KEY");
        this.f24240h = (DateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f24241i = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f24242j = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f24239g);
        this.f24244l = new C8488b(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month e = this.f24241i.mo31563e();
        if (C8504f.m27671a(contextThemeWrapper)) {
            i2 = C10580h.mtrl_calendar_vertical;
            i = 1;
        } else {
            i2 = C10580h.mtrl_calendar_horizontal;
            i = 0;
        }
        View inflate = cloneInContext.inflate(i2, viewGroup, false);
        GridView gridView = (GridView) inflate.findViewById(C10578f.mtrl_calendar_days_of_week);
        C5071v.m9165a((View) gridView, (C5010a) new C8493b(this));
        gridView.setAdapter(new C8490d());
        gridView.setNumColumns(e.f24215j);
        gridView.setEnabled(false);
        this.f24246n = (RecyclerView) inflate.findViewById(C10578f.mtrl_calendar_months);
        this.f24246n.setLayoutManager(new C8494c(getContext(), i, false, i));
        this.f24246n.setTag(f24235q);
        C8506h hVar = new C8506h(contextThemeWrapper, this.f24240h, this.f24241i, new C8495d());
        this.f24246n.setAdapter(hVar);
        int integer = contextThemeWrapper.getResources().getInteger(C10579g.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C10578f.mtrl_calendar_year_selector_frame);
        this.f24245m = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f24245m.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f24245m.setAdapter(new C8515n(this));
            this.f24245m.addItemDecoration(m27659g());
        }
        if (inflate.findViewById(C10578f.month_navigation_fragment_toggle) != null) {
            m27653a(inflate, hVar);
        }
        if (!C8504f.m27671a(contextThemeWrapper)) {
            new C0707k().attachToRecyclerView(this.f24246n);
        }
        this.f24246n.scrollToPosition(hVar.mo31629a(this.f24242j));
        return inflate;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f24239g);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f24240h);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f24241i);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f24242j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public CalendarConstraints mo31606b() {
        return this.f24241i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C8488b mo31607c() {
        return this.f24244l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Month mo31608d() {
        return this.f24242j;
    }

    /* renamed from: e */
    public DateSelector<S> mo31609e() {
        return this.f24240h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo31610f() {
        C8502k kVar = this.f24243k;
        if (kVar == C8502k.YEAR) {
            mo31605a(C8502k.DAY);
        } else if (kVar == C8502k.DAY) {
            mo31605a(C8502k.YEAR);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo31604a(Month month) {
        C8506h hVar = (C8506h) this.f24246n.getAdapter();
        int a = hVar.mo31629a(month);
        int a2 = a - hVar.mo31629a(this.f24242j);
        boolean z = true;
        boolean z2 = Math.abs(a2) > 3;
        if (a2 <= 0) {
            z = false;
        }
        this.f24242j = month;
        if (z2 && z) {
            this.f24246n.scrollToPosition(a - 3);
            m27652a(a);
        } else if (z2) {
            this.f24246n.scrollToPosition(a + 3);
            m27652a(a);
        } else {
            m27652a(a);
        }
    }

    /* renamed from: a */
    static int m27649a(Context context) {
        return context.getResources().getDimensionPixelSize(C10576d.mtrl_calendar_day_height);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo31605a(C8502k kVar) {
        this.f24243k = kVar;
        if (kVar == C8502k.YEAR) {
            this.f24245m.getLayoutManager().scrollToPosition(((C8515n) this.f24245m.getAdapter()).mo31637a(this.f24242j.f24214i));
            this.f24247o.setVisibility(0);
            this.f24248p.setVisibility(8);
        } else if (kVar == C8502k.DAY) {
            this.f24247o.setVisibility(8);
            this.f24248p.setVisibility(0);
            mo31604a(this.f24242j);
        }
    }

    /* renamed from: a */
    private void m27653a(View view, C8506h hVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(C10578f.month_navigation_fragment_toggle);
        materialButton.setTag(f24238t);
        C5071v.m9165a((View) materialButton, (C5010a) new C8497f());
        MaterialButton materialButton2 = (MaterialButton) view.findViewById(C10578f.month_navigation_previous);
        materialButton2.setTag(f24236r);
        MaterialButton materialButton3 = (MaterialButton) view.findViewById(C10578f.month_navigation_next);
        materialButton3.setTag(f24237s);
        this.f24247o = view.findViewById(C10578f.mtrl_calendar_year_selector_frame);
        this.f24248p = view.findViewById(C10578f.mtrl_calendar_day_selector_frame);
        mo31605a(C8502k.DAY);
        materialButton.setText(this.f24242j.mo31589d());
        this.f24246n.addOnScrollListener(new C8498g(hVar, materialButton));
        materialButton.setOnClickListener(new C8499h());
        materialButton3.setOnClickListener(new C8500i(hVar));
        materialButton2.setOnClickListener(new C8501j(hVar));
    }

    /* renamed from: a */
    private void m27652a(int i) {
        this.f24246n.post(new C8492a(i));
    }
}
