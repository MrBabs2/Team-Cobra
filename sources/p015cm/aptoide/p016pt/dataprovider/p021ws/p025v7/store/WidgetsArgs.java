package p015cm.aptoide.p016pt.dataprovider.p021ws.p025v7.store;

import android.content.res.Resources;
import android.view.WindowManager;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Type;
import p015cm.aptoide.p016pt.dataprovider.util.HashMapNotNull;

/* renamed from: cm.aptoide.pt.dataprovider.ws.v7.store.WidgetsArgs */
public class WidgetsArgs extends HashMapNotNull<Key, GridSizeObject> {

    /* renamed from: cm.aptoide.pt.dataprovider.ws.v7.store.WidgetsArgs$GridSizeObject */
    protected static class GridSizeObject {
        private int grid_row_size;

        public GridSizeObject(int i) {
            this.grid_row_size = i;
        }

        public int getGrid_row_size() {
            return this.grid_row_size;
        }

        public void setGrid_row_size(int i) {
            this.grid_row_size = i;
        }
    }

    /* renamed from: cm.aptoide.pt.dataprovider.ws.v7.store.WidgetsArgs$Key */
    public enum Key {
        APPS_GROUP,
        MY_STORES_SUBSCRIBED,
        STORES_RECOMMENDED,
        STORES_GROUP
    }

    public WidgetsArgs() {
    }

    public static WidgetsArgs createDefault(Resources resources, WindowManager windowManager) {
        return new WidgetsArgs().add(Key.APPS_GROUP, Type.APPS_GROUP.getPerLineCount(resources, windowManager)).add(Key.STORES_GROUP, Type.STORES_GROUP.getPerLineCount(resources, windowManager)).add(Key.MY_STORES_SUBSCRIBED, Type.MY_STORES_SUBSCRIBED.getPerLineCount(resources, windowManager)).add(Key.STORES_RECOMMENDED, Type.STORES_RECOMMENDED.getPerLineCount(resources, windowManager));
    }

    public static WidgetsArgs createWithLineMultiplier(Resources resources, WindowManager windowManager, int i) {
        return new WidgetsArgs().add(Key.APPS_GROUP, Type.APPS_GROUP.getPerLineCount(resources, windowManager) * i).add(Key.STORES_GROUP, Type.STORES_GROUP.getPerLineCount(resources, windowManager)).add(Key.MY_STORES_SUBSCRIBED, Type.MY_STORES_SUBSCRIBED.getPerLineCount(resources, windowManager)).add(Key.STORES_RECOMMENDED, Type.STORES_RECOMMENDED.getPerLineCount(resources, windowManager));
    }

    public WidgetsArgs add(Key key, int i) {
        if (!containsKey(key)) {
            put(key, new GridSizeObject(i));
        }
        return this;
    }

    public WidgetsArgs(int i, int i2) {
        add(Key.APPS_GROUP, i);
        add(Key.STORES_GROUP, i2);
    }
}
