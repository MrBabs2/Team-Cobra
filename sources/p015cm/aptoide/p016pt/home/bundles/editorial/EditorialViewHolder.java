package p015cm.aptoide.p016pt.home.bundles.editorial;

import android.view.View;
import p015cm.aptoide.p016pt.home.bundles.base.AppBundleViewHolder;
import p015cm.aptoide.p016pt.home.bundles.base.HomeBundle;

/* renamed from: cm.aptoide.pt.home.bundles.editorial.EditorialViewHolder */
public abstract class EditorialViewHolder extends AppBundleViewHolder {
    public EditorialViewHolder(View view) {
        super(view);
    }

    public abstract void setBundle(HomeBundle homeBundle, int i);
}
