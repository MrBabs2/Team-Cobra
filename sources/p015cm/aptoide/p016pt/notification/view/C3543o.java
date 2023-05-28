package p015cm.aptoide.p016pt.notification.view;

import android.view.View;
import p015cm.aptoide.p016pt.notification.AptoideNotification;

/* renamed from: cm.aptoide.pt.notification.view.o */
/* compiled from: lambda */
public final /* synthetic */ class C3543o implements View.OnClickListener {

    /* renamed from: f */
    private final /* synthetic */ InboxViewHolder f6550f;

    /* renamed from: g */
    private final /* synthetic */ AptoideNotification f6551g;

    public /* synthetic */ C3543o(InboxViewHolder inboxViewHolder, AptoideNotification aptoideNotification) {
        this.f6550f = inboxViewHolder;
        this.f6551g = aptoideNotification;
    }

    public final void onClick(View view) {
        this.f6550f.mo13292a(this.f6551g, view);
    }
}
