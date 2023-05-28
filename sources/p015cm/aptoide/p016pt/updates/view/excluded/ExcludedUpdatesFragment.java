package p015cm.aptoide.p016pt.updates.view.excluded;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.trello.rxlifecycle.p209g.C9008b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.inject.Inject;
import p015cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.database.room.RoomUpdate;
import p015cm.aptoide.p016pt.logger.Logger;
import p015cm.aptoide.p016pt.updates.UpdatePersistence;
import p015cm.aptoide.p016pt.utils.design.ShowMessage;
import p015cm.aptoide.p016pt.view.NotBottomNavigationView;
import p015cm.aptoide.p016pt.view.fragment.AptoideBaseFragment;
import p015cm.aptoide.p016pt.view.recycler.BaseAdapter;
import p015cm.aptoide.p016pt.view.recycler.displayable.Displayable;
import p123rx.C5328b;
import p123rx.C5368e;
import p123rx.p124l.p125c.C5376a;
import p123rx.p126m.C5378b;

/* renamed from: cm.aptoide.pt.updates.view.excluded.ExcludedUpdatesFragment */
public class ExcludedUpdatesFragment extends AptoideBaseFragment<BaseAdapter> implements NotBottomNavigationView {
    private static final String TAG = ExcludedUpdatesFragment.class.getSimpleName();
    private TextView emptyData;
    @Inject
    UpdatePersistence updatesPersistence;

    /* renamed from: c */
    static /* synthetic */ void m7440c(List list) {
    }

    /* renamed from: d */
    static /* synthetic */ void m7441d(List list) {
    }

    private void fetchExcludedUpdates() {
        this.updatesPersistence.getAllSorted(true).mo18644a(C5376a.m10346b()).mo18664b(new C4434h(this)).mo18641a(bindUntilEvent(C9008b.DESTROY_VIEW)).mo18655a(C4429c.f7600f, (C5378b<Throwable>) new C4428b(this));
    }

    public static ExcludedUpdatesFragment newInstance() {
        return new ExcludedUpdatesFragment();
    }

    /* renamed from: a */
    public /* synthetic */ void mo14997a(List list) {
        if (list == null || list.isEmpty()) {
            this.emptyData.setText(C1086R.string.no_excluded_updates_msg);
            this.emptyData.setVisibility(0);
            clearDisplayables();
            finishLoading();
            return;
        }
        this.emptyData.setVisibility(8);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new ExcludedUpdateDisplayable((RoomUpdate) it.next()));
        }
        clearDisplayables().addDisplayables((List<? extends Displayable>) arrayList, true);
    }

    /* renamed from: b */
    public /* synthetic */ C5328b mo14998b(List list) {
        return this.updatesPersistence.saveAll(list);
    }

    public void bindViews(View view) {
        super.bindViews(view);
        this.emptyData = (TextView) view.findViewById(C1086R.C1088id.empty_data);
    }

    /* access modifiers changed from: protected */
    public boolean displayHomeUpAsEnabled() {
        return true;
    }

    public int getContentViewId() {
        return C1086R.layout.fragment_with_toolbar_no_theme;
    }

    public ScreenTagHistory getHistoryTracker() {
        return ScreenTagHistory.Builder.build(ExcludedUpdatesFragment.class.getSimpleName());
    }

    public void load(boolean z, boolean z2, Bundle bundle) {
        super.load(z, z2, bundle);
        Logger instance = Logger.getInstance();
        String str = TAG;
        StringBuilder sb = new StringBuilder();
        sb.append("refresh excluded updates? ");
        sb.append(z ? "yes" : "no");
        instance.mo12975d(str, sb.toString());
        fetchExcludedUpdates();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getFragmentComponent(bundle).inject(this);
        setHasOptionsMenu(true);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        menuInflater.inflate(C1086R.C1089menu.menu_excluded_updates_fragment, menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            getActivity().onBackPressed();
            return true;
        }
        int i = 0;
        if (itemId == C1086R.C1088id.menu_restore_updates) {
            LinkedList linkedList = new LinkedList();
            BaseAdapter adapter = getAdapter();
            while (i < adapter.getItemCount()) {
                ExcludedUpdateDisplayable excludedUpdateDisplayable = (ExcludedUpdateDisplayable) adapter.getDisplayable(i);
                if (excludedUpdateDisplayable.isSelected()) {
                    linkedList.add((RoomUpdate) excludedUpdateDisplayable.getPojo());
                }
                i++;
            }
            if (linkedList.size() == 0) {
                ShowMessage.asSnack((View) this.emptyData, (int) C1086R.string.no_excluded_updates_selected);
                return true;
            }
            C5368e.m10234a(linkedList).mo18664b(C4433g.f7604f).mo18698l().mo18689g(new C4431e(this)).mo18655a(C4430d.f7601f, (C5378b<Throwable>) C4432f.f7603f);
            return true;
        } else if (itemId == C1086R.C1088id.menu_select_all) {
            BaseAdapter adapter2 = getAdapter();
            while (i < adapter2.getItemCount()) {
                ((ExcludedUpdateDisplayable) adapter2.getDisplayable(i)).setSelected(true);
                adapter2.notifyDataSetChanged();
                i++;
            }
            return true;
        } else if (itemId != C1086R.C1088id.menu_select_none) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            BaseAdapter adapter3 = getAdapter();
            for (int i2 = 0; i2 < adapter3.getItemCount(); i2++) {
                ((ExcludedUpdateDisplayable) adapter3.getDisplayable(i2)).setSelected(false);
                adapter3.notifyDataSetChanged();
            }
            return true;
        }
    }

    public void setupToolbarDetails(Toolbar toolbar) {
        toolbar.setTitle((int) C1086R.string.excluded_updates);
    }

    /* renamed from: a */
    public /* synthetic */ void mo14996a(Throwable th) {
        CrashReport.getInstance().log(th);
        this.emptyData.setText(C1086R.string.no_excluded_updates_msg);
        this.emptyData.setVisibility(0);
        clearDisplayables();
        finishLoading();
    }
}
