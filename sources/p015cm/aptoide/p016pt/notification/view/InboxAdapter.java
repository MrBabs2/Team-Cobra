package p015cm.aptoide.p016pt.notification.view;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.notification.AptoideNotification;
import p123rx.p127s.C12871b;

/* renamed from: cm.aptoide.pt.notification.view.InboxAdapter */
public class InboxAdapter extends RecyclerView.C0633g<InboxViewHolder> {
    private C12871b<AptoideNotification> notificationSubject;
    private List<AptoideNotification> notifications;

    public InboxAdapter(List<AptoideNotification> list, C12871b<AptoideNotification> bVar) {
        this.notifications = list;
        this.notificationSubject = bVar;
    }

    public int getItemCount() {
        return this.notifications.size();
    }

    public void updateNotifications(List<AptoideNotification> list) {
        this.notifications = list;
        notifyDataSetChanged();
    }

    public void onBindViewHolder(InboxViewHolder inboxViewHolder, int i) {
        inboxViewHolder.setNotification(this.notifications.get(i));
    }

    public InboxViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new InboxViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(C1086R.layout.fragment_inbox_list_item, viewGroup, false), this.notificationSubject);
    }
}
