package p015cm.aptoide.p016pt.notification;

import android.content.Context;
import android.content.Intent;

/* renamed from: cm.aptoide.pt.notification.ContentPuller */
public class ContentPuller {
    private final Context context;

    public ContentPuller(Context context2) {
        this.context = context2;
    }

    public void start() {
        this.context.startService(new Intent(this.context, PullingContentService.class));
    }
}
