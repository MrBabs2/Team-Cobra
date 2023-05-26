package p015cm.aptoide.p016pt.home.more.appcoins;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.bumptech.glide.load.C5901a;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.p162p.C6272g;
import com.bumptech.glide.p162p.p163l.C6287i;
import kotlin.C4789l;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C10202j;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.home.bundles.apps.RewardApp;
import p015cm.aptoide.p016pt.networking.image.ImageLoader;

@C4789l(mo16639bv = {1, 0, 3}, mo16640d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J4\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016J>\u0010\f\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¨\u0006\u0010"}, mo16641d2 = {"cm/aptoide/pt/home/more/appcoins/EarnAppcListViewHolder$bindApp$1", "Lcom/bumptech/glide/request/RequestListener;", "Landroid/graphics/drawable/Drawable;", "onLoadFailed", "", "e", "Lcom/bumptech/glide/load/engine/GlideException;", "model", "", "target", "Lcom/bumptech/glide/request/target/Target;", "isFirstResource", "onResourceReady", "resource", "dataSource", "Lcom/bumptech/glide/load/DataSource;", "app_vanillaProdRelease"}, mo16642k = 1, mo16643mv = {1, 1, 16})
/* renamed from: cm.aptoide.pt.home.more.appcoins.EarnAppcListViewHolder$bindApp$1 */
/* compiled from: EarnAppcListViewHolder.kt */
public final class EarnAppcListViewHolder$bindApp$1 implements C6272g<Drawable> {
    final /* synthetic */ RewardApp $app;
    final /* synthetic */ EarnAppcListViewHolder this$0;

    EarnAppcListViewHolder$bindApp$1(EarnAppcListViewHolder earnAppcListViewHolder, RewardApp rewardApp) {
        this.this$0 = earnAppcListViewHolder;
        this.$app = rewardApp;
    }

    public boolean onLoadFailed(GlideException glideException, Object obj, C6287i<Drawable> iVar, boolean z) {
        return false;
    }

    public boolean onResourceReady(Drawable drawable, Object obj, C6287i<Drawable> iVar, C5901a aVar, boolean z) {
        View view = this.this$0.itemView;
        C10202j.m34174a((Object) view, "itemView");
        ((ImageView) view.findViewById(C1086R.C1088id.app_feature_graphic)).setColorFilter(1073741824);
        View view2 = this.this$0.itemView;
        C10202j.m34174a((Object) view2, "itemView");
        ImageLoader with = ImageLoader.with(view2.getContext());
        String featureGraphic = this.$app.getFeatureGraphic();
        if (drawable != null) {
            View view3 = this.this$0.itemView;
            C10202j.m34174a((Object) view3, "itemView");
            with.loadWithPalettePlaceholder(featureGraphic, (BitmapDrawable) drawable, -1, (ImageView) view3.findViewById(C1086R.C1088id.app_feature_graphic));
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
    }
}
