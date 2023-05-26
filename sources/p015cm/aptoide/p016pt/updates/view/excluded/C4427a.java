package p015cm.aptoide.p016pt.updates.view.excluded;

import android.widget.CompoundButton;

/* renamed from: cm.aptoide.pt.updates.view.excluded.a */
/* compiled from: lambda */
public final /* synthetic */ class C4427a implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    private final /* synthetic */ ExcludedUpdateDisplayable f7598a;

    public /* synthetic */ C4427a(ExcludedUpdateDisplayable excludedUpdateDisplayable) {
        this.f7598a = excludedUpdateDisplayable;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f7598a.setSelected(z);
    }
}
