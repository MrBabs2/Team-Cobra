package p015cm.aptoide.p016pt.store.view;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.GetStoreWidgets;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.C2185V7;
import p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.Endless;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.store.view.GetStoreWidgetsFragment */
public class GetStoreWidgetsFragment extends GetStoreEndlessFragment<GetStoreWidgets> {
    public static Fragment newInstance() {
        return new GetStoreWidgetsFragment();
    }

    /* renamed from: a */
    public /* synthetic */ void mo14627a(GetStoreWidgets getStoreWidgets) {
        addDisplayables(parseDisplayables(getStoreWidgets).mo18695j().mo41034a());
    }

    /* access modifiers changed from: protected */
    public C5378b<GetStoreWidgets> buildAction() {
        return new C4274d0(this);
    }

    /* access modifiers changed from: protected */
    public C2185V7<GetStoreWidgets, ? extends Endless> buildRequest(boolean z, String str) {
        return this.requestFactoryCdnPool.newStoreWidgets(str);
    }

    public void load(boolean z, boolean z2, Bundle bundle) {
        super.load(z, z2, bundle);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public void onResume() {
        super.onResume();
    }
}
