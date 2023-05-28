package p015cm.aptoide.p016pt.comments.view;

import p015cm.aptoide.p016pt.view.recycler.BaseAdapter;
import p015cm.aptoide.p016pt.view.recycler.displayable.Displayable;

/* renamed from: cm.aptoide.pt.comments.view.CommentsAdapter */
public class CommentsAdapter<T extends Displayable> extends BaseAdapter {
    private final Class<T> clazz;

    public CommentsAdapter() {
        this.clazz = null;
    }

    public int getItemPosition(int i) {
        if (this.clazz == null) {
            return -1;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < getItemCount(); i3++) {
            if (this.clazz.isAssignableFrom(getDisplayable(i3).getClass())) {
                if (i2 == i) {
                    return i3;
                }
                i2++;
            }
        }
        return -1;
    }

    public CommentsAdapter(Class<T> cls) {
        this.clazz = cls;
    }
}
