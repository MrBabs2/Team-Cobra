package p015cm.aptoide.p016pt.store.view.ads;

import android.os.Bundle;
import android.view.WindowManager;
import androidx.fragment.app.Fragment;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p015cm.aptoide.p016pt.AptoideApplication;
import p015cm.aptoide.p016pt.ads.AdsRepository;
import p015cm.aptoide.p016pt.ads.MinimalAd;
import p015cm.aptoide.p016pt.store.view.StoreTabGridRecyclerFragment;
import p015cm.aptoide.p016pt.view.recycler.displayable.Displayable;
import p015cm.aptoide.p016pt.view.recycler.displayable.DisplayableGroup;
import p015cm.aptoide.p016pt.view.recycler.displayable.GridAdDisplayable;
import p123rx.C5368e;

/* renamed from: cm.aptoide.pt.store.view.ads.GetAdsFragment */
public class GetAdsFragment extends StoreTabGridRecyclerFragment {
    private AdsRepository adsRepository;

    public static Fragment newInstance() {
        return new GetAdsFragment();
    }

    /* renamed from: a */
    public /* synthetic */ List mo14764a(List list) {
        LinkedList linkedList = new LinkedList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            linkedList.add(new GridAdDisplayable((MinimalAd) it.next(), this.tag, this.navigationTracker));
        }
        return Collections.singletonList(new DisplayableGroup(linkedList, (WindowManager) getContext().getSystemService("window"), getContext().getResources()));
    }

    /* access modifiers changed from: protected */
    public C5368e<List<Displayable>> buildDisplayables(boolean z, String str, boolean z2) {
        return this.adsRepository.getAdsFromHomepageMore(z).mo18694j(new C4266a(this));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.adsRepository = ((AptoideApplication) getContext().getApplicationContext()).getAdsRepository();
    }
}
