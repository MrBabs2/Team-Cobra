package p015cm.aptoide.p016pt.notification.view;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.networking.image.ImageLoader;
import p015cm.aptoide.p016pt.notification.AptoideNotification;
import p123rx.p127s.C12871b;

/* renamed from: cm.aptoide.pt.notification.view.InboxViewHolder */
class InboxViewHolder extends RecyclerView.C0629c0 {
    private TextView body;
    private C12871b<AptoideNotification> notificationSubject;
    private final TextView title;
    private ImageView userAvatar;

    protected InboxViewHolder(View view, C12871b<AptoideNotification> bVar) {
        super(view);
        this.notificationSubject = bVar;
        this.title = (TextView) view.findViewById(C1086R.C1088id.fragment_inbox_list_title);
        this.body = (TextView) view.findViewById(C1086R.C1088id.fragment_inbox_list_body);
        this.userAvatar = (ImageView) view.findViewById(C1086R.C1088id.fragment_inbox_list_item_image);
    }

    /* renamed from: a */
    public /* synthetic */ void mo13292a(AptoideNotification aptoideNotification, View view) {
        this.notificationSubject.onNext(aptoideNotification);
    }

    public void setNotification(AptoideNotification aptoideNotification) {
        this.title.setText(aptoideNotification.getTitle());
        this.body.setText(aptoideNotification.getBody());
        ImageLoader.with(this.itemView.getContext()).loadWithShadowCircleTransform(aptoideNotification.getImg(), this.userAvatar);
        this.itemView.setOnClickListener(new C3543o(this, aptoideNotification));
    }
}
