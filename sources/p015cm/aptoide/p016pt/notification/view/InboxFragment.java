package p015cm.aptoide.p016pt.notification.view;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;
import p015cm.aptoide.analytics.implementation.navigation.ScreenTagHistory;
import p015cm.aptoide.p016pt.AptoideApplication;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.crashreports.CrashReport;
import p015cm.aptoide.p016pt.notification.AptoideNotification;
import p015cm.aptoide.p016pt.view.NotBottomNavigationView;
import p015cm.aptoide.p016pt.view.fragment.BaseToolbarFragment;
import p123rx.C5368e;
import p123rx.p124l.p125c.C5376a;
import p123rx.p127s.C12871b;

/* renamed from: cm.aptoide.pt.notification.view.InboxFragment */
public class InboxFragment extends BaseToolbarFragment implements InboxView, NotBottomNavigationView {
    private InboxAdapter adapter;
    private LinearLayout emptyState;
    private RecyclerView list;
    private C12871b<AptoideNotification> notificationSubject;

    /* access modifiers changed from: protected */
    public boolean displayHomeUpAsEnabled() {
        return true;
    }

    public int getContentViewId() {
        return C1086R.layout.fragment_inbox;
    }

    public ScreenTagHistory getHistoryTracker() {
        return ScreenTagHistory.Builder.build(InboxFragment.class.getSimpleName());
    }

    public C5368e<AptoideNotification> notificationSelection() {
        return this.notificationSubject;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getFragmentComponent(bundle).inject(this);
        this.notificationSubject = C12871b.m41468p();
        this.adapter = new InboxAdapter(Collections.emptyList(), this.notificationSubject);
        setHasOptionsMenu(true);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        getActivity().onBackPressed();
        return true;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C1086R.C1088id.fragment_inbox_list);
        this.list = recyclerView;
        recyclerView.setAdapter(this.adapter);
        this.list.setLayoutManager(new LinearLayoutManager(getContext()));
        this.emptyState = (LinearLayout) view.findViewById(C1086R.C1088id.empty_state);
        attachPresenter(new InboxPresenter(this, ((AptoideApplication) getContext().getApplicationContext()).getNotificationCenter(), CrashReport.getInstance(), ((AptoideApplication) getContext().getApplicationContext()).getNavigationTracker(), ((AptoideApplication) getContext().getApplicationContext()).getNotificationAnalytics(), C5376a.m10346b()));
    }

    /* access modifiers changed from: protected */
    public void setupToolbarDetails(Toolbar toolbar) {
        super.setupToolbarDetails(toolbar);
        toolbar.setTitle((CharSequence) getString(C1086R.string.myaccount_header_title));
    }

    public void showEmptyState() {
        this.emptyState.setVisibility(0);
    }

    public void showNotifications(List<AptoideNotification> list2) {
        this.adapter.updateNotifications(list2);
    }
}
