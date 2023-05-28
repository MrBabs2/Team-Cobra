package p015cm.aptoide.p016pt.view.dialog;

import android.app.Activity;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;
import p015cm.aptoide.p016pt.C1086R;

/* renamed from: cm.aptoide.pt.view.dialog.d */
/* compiled from: lambda */
public final /* synthetic */ class C4604d implements RatingBar.OnRatingBarChangeListener {

    /* renamed from: a */
    private final /* synthetic */ View f7841a;

    /* renamed from: b */
    private final /* synthetic */ Activity f7842b;

    public /* synthetic */ C4604d(View view, Activity activity) {
        this.f7841a = view;
        this.f7842b = activity;
    }

    public final void onRatingChanged(RatingBar ratingBar, float f, boolean z) {
        ((TextView) this.f7841a.findViewById(C1086R.C1088id.tap_to_rate)).setTextColor(this.f7842b.getResources().getColor(C1086R.color.grey_fog_dark));
    }
}
