package p015cm.aptoide.p016pt.app.view.screenshots;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewpager.widget.C0809a;
import java.util.ArrayList;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.networking.image.ImageLoader;

/* renamed from: cm.aptoide.pt.app.view.screenshots.ViewPagerAdapterScreenshots */
public class ViewPagerAdapterScreenshots extends C0809a {
    private final ArrayList<String> uris;

    public ViewPagerAdapterScreenshots(ArrayList<String> arrayList) {
        this.uris = arrayList;
    }

    private int getPlaceholder(Context context) {
        return context.getResources().getConfiguration().orientation == 1 ? C1086R.attr.placeholder_9_16 : C1086R.attr.placeholder_16_9;
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    public int getCount() {
        return this.uris.size();
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        View inflate = LayoutInflater.from(context).inflate(C1086R.layout.row_item_screenshots_big, (ViewGroup) null);
        ImageLoader.with(context).load(this.uris.get(i), getPlaceholder(context), (ImageView) inflate.findViewById(C1086R.C1088id.screenshot_image_big));
        viewGroup.addView(inflate);
        return inflate;
    }

    public boolean isViewFromObject(View view, Object obj) {
        return view.equals(obj);
    }
}
