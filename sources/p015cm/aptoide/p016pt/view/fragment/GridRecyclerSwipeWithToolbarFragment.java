package p015cm.aptoide.p016pt.view.fragment;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import javax.inject.Inject;
import javax.inject.Named;
import p015cm.aptoide.p016pt.AptoideApplication;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.view.Translator;

/* renamed from: cm.aptoide.pt.view.fragment.GridRecyclerSwipeWithToolbarFragment */
public abstract class GridRecyclerSwipeWithToolbarFragment extends GridRecyclerSwipeFragment {
    public static final String TITLE_KEY = "TITLE_KEY";
    @Inject
    @Named
    String marketName;
    private String title;

    /* access modifiers changed from: protected */
    public boolean displayHomeUpAsEnabled() {
        return true;
    }

    public int getContentViewId() {
        return C1086R.layout.recycler_swipe_fragment_with_toolbar;
    }

    public void loadExtras(Bundle bundle) {
        super.loadExtras(bundle);
        this.title = bundle.getString(TITLE_KEY);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AptoideApplication aptoideApplication = (AptoideApplication) getContext().getApplicationContext();
        getFragmentComponent(bundle).inject(this);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        menuInflater.inflate(C1086R.C1089menu.menu_empty, menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        getActivity().onBackPressed();
        return true;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString(TITLE_KEY, this.title);
    }

    public void setupToolbarDetails(Toolbar toolbar) {
        toolbar.setTitle((CharSequence) Translator.translate(this.title, getContext().getApplicationContext(), this.marketName));
        toolbar.setLogo((int) C1086R.C1087drawable.logo_toolbar);
    }
}
