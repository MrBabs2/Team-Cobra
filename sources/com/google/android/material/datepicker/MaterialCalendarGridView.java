package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import java.util.Calendar;
import p050l.p075h.p083k.C5004d;
import p050l.p075h.p084l.C5010a;
import p050l.p075h.p084l.C5071v;
import p050l.p075h.p084l.p085e0.C5034c;
import p112n.p277e.p279b.p282b.C10578f;

final class MaterialCalendarGridView extends GridView {

    /* renamed from: f */
    private final Calendar f24209f;

    /* renamed from: com.google.android.material.datepicker.MaterialCalendarGridView$a */
    class C8485a extends C5010a {
        C8485a() {
        }

        /* renamed from: a */
        public void mo2445a(View view, C5034c cVar) {
            super.mo2445a(view, cVar);
            cVar.mo17512a((Object) null);
        }
    }

    public MaterialCalendarGridView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    private void m27628a(int i, Rect rect) {
        if (i == 33) {
            setSelection(getAdapter().mo31619b());
        } else if (i == 130) {
            setSelection(getAdapter().mo31617a());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        C8505g adapter = getAdapter();
        DateSelector<?> dateSelector = adapter.f24271g;
        C8488b bVar = adapter.f24272h;
        Long item = adapter.getItem(adapter.mo31617a());
        Long item2 = adapter.getItem(adapter.mo31619b());
        for (C5004d next : dateSelector.mo31572i()) {
            F f = next.f8862a;
            if (f != null) {
                if (next.f8863b == null) {
                    continue;
                } else {
                    long longValue = ((Long) f).longValue();
                    long longValue2 = ((Long) next.f8863b).longValue();
                    if (!m27629a(item, item2, Long.valueOf(longValue), Long.valueOf(longValue2))) {
                        if (longValue < item.longValue()) {
                            i2 = adapter.mo31617a();
                            if (adapter.mo31620b(i2)) {
                                i = 0;
                            } else {
                                i = materialCalendarGridView.getChildAt(i2 - 1).getRight();
                            }
                        } else {
                            materialCalendarGridView.f24209f.setTimeInMillis(longValue);
                            i2 = adapter.mo31618a(materialCalendarGridView.f24209f.get(5));
                            i = m27627a(materialCalendarGridView.getChildAt(i2));
                        }
                        if (longValue2 > item2.longValue()) {
                            i4 = adapter.mo31619b();
                            if (adapter.mo31621c(i4)) {
                                i3 = getWidth();
                            } else {
                                i3 = materialCalendarGridView.getChildAt(i4).getRight();
                            }
                        } else {
                            materialCalendarGridView.f24209f.setTimeInMillis(longValue2);
                            i4 = adapter.mo31618a(materialCalendarGridView.f24209f.get(5));
                            i3 = m27627a(materialCalendarGridView.getChildAt(i4));
                        }
                        int itemId = (int) adapter.getItemId(i2);
                        int itemId2 = (int) adapter.getItemId(i4);
                        while (itemId <= itemId2) {
                            int numColumns = getNumColumns() * itemId;
                            int numColumns2 = (getNumColumns() + numColumns) - 1;
                            View childAt = materialCalendarGridView.getChildAt(numColumns);
                            canvas.drawRect((float) (numColumns > i2 ? 0 : i), (float) (childAt.getTop() + bVar.f24223a.mo31599b()), (float) (i4 > numColumns2 ? getWidth() : i3), (float) (childAt.getBottom() - bVar.f24223a.mo31597a()), bVar.f24230h);
                            itemId++;
                            materialCalendarGridView = this;
                        }
                    } else {
                        return;
                    }
                }
            }
            materialCalendarGridView = this;
        }
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        if (z) {
            m27628a(i, rect);
        } else {
            super.onFocusChanged(false, i, rect);
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().mo31617a()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(getAdapter().mo31617a());
        return true;
    }

    public void setSelection(int i) {
        if (i < getAdapter().mo31617a()) {
            super.setSelection(getAdapter().mo31617a());
        } else {
            super.setSelection(i);
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof C8505g) {
            super.setAdapter(listAdapter);
        } else {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", new Object[]{MaterialCalendarGridView.class.getCanonicalName(), C8505g.class.getCanonicalName()}));
        }
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24209f = C8514m.m27703e();
        if (C8504f.m27671a(getContext())) {
            setNextFocusLeftId(C10578f.cancel_button);
            setNextFocusRightId(C10578f.confirm_button);
        }
        C5071v.m9165a((View) this, (C5010a) new C8485a());
    }

    public C8505g getAdapter() {
        return (C8505g) super.getAdapter();
    }

    /* renamed from: a */
    private static boolean m27629a(Long l, Long l2, Long l3, Long l4) {
        return l == null || l2 == null || l3 == null || l4 == null || l3.longValue() > l2.longValue() || l4.longValue() < l.longValue();
    }

    /* renamed from: a */
    private static int m27627a(View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }
}
