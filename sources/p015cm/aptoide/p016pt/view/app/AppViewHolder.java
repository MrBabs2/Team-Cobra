package p015cm.aptoide.p016pt.view.app;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import p015cm.aptoide.p016pt.home.bundles.base.HomeBundle;

/* renamed from: cm.aptoide.pt.view.app.AppViewHolder */
public abstract class AppViewHolder extends RecyclerView.C0629c0 {
    public AppViewHolder(View view) {
        super(view);
    }

    public abstract void setApp(Application application, HomeBundle homeBundle, int i);
}
