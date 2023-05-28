package p015cm.aptoide.p016pt.view.fragment;

import android.view.View;
import androidx.viewpager.widget.C0809a;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.view.custom.AptoideViewPager;

/* renamed from: cm.aptoide.pt.view.fragment.BasePagerToolbarFragment */
public abstract class BasePagerToolbarFragment extends BaseLoaderToolbarFragment {
    /* access modifiers changed from: protected */
    public AptoideViewPager viewPager;

    public void bindViews(View view) {
        super.bindViews(view);
        this.viewPager = (AptoideViewPager) view.findViewById(C1086R.C1088id.pager);
    }

    /* access modifiers changed from: protected */
    public abstract C0809a createPagerAdapter();

    public void onDestroyView() {
        this.viewPager.clearOnPageChangeListeners();
        this.viewPager = null;
        super.onDestroyView();
    }

    /* access modifiers changed from: protected */
    public void setupViewPager() {
        this.viewPager.setAdapter(createPagerAdapter());
    }
}
