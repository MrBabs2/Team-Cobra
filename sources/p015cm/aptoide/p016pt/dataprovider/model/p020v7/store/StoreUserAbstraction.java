package p015cm.aptoide.p016pt.dataprovider.model.p020v7.store;

import p015cm.aptoide.p016pt.dataprovider.model.p020v7.BaseV7Response;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.GetStoreWidgets;

/* renamed from: cm.aptoide.pt.dataprovider.model.v7.store.StoreUserAbstraction */
public abstract class StoreUserAbstraction<T extends BaseV7Response> extends BaseV7Response {
    private Nodes<T> nodes;

    /* renamed from: cm.aptoide.pt.dataprovider.model.v7.store.StoreUserAbstraction$Nodes */
    public static class Nodes<T extends BaseV7Response> {
        private T meta;
        private GetStoreTabs tabs;
        private GetStoreWidgets widgets;

        /* access modifiers changed from: protected */
        public boolean canEqual(Object obj) {
            return obj instanceof Nodes;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Nodes)) {
                return false;
            }
            Nodes nodes = (Nodes) obj;
            if (!nodes.canEqual(this)) {
                return false;
            }
            BaseV7Response meta2 = getMeta();
            BaseV7Response meta3 = nodes.getMeta();
            if (meta2 != null ? !meta2.equals(meta3) : meta3 != null) {
                return false;
            }
            GetStoreTabs tabs2 = getTabs();
            GetStoreTabs tabs3 = nodes.getTabs();
            if (tabs2 != null ? !tabs2.equals(tabs3) : tabs3 != null) {
                return false;
            }
            GetStoreWidgets widgets2 = getWidgets();
            GetStoreWidgets widgets3 = nodes.getWidgets();
            return widgets2 != null ? widgets2.equals(widgets3) : widgets3 == null;
        }

        public T getMeta() {
            return this.meta;
        }

        public GetStoreTabs getTabs() {
            return this.tabs;
        }

        public GetStoreWidgets getWidgets() {
            return this.widgets;
        }

        public int hashCode() {
            int i;
            int i2;
            BaseV7Response meta2 = getMeta();
            int i3 = 43;
            if (meta2 == null) {
                i = 43;
            } else {
                i = meta2.hashCode();
            }
            GetStoreTabs tabs2 = getTabs();
            int i4 = (i + 59) * 59;
            if (tabs2 == null) {
                i2 = 43;
            } else {
                i2 = tabs2.hashCode();
            }
            int i5 = i4 + i2;
            GetStoreWidgets widgets2 = getWidgets();
            int i6 = i5 * 59;
            if (widgets2 != null) {
                i3 = widgets2.hashCode();
            }
            return i6 + i3;
        }

        public void setMeta(T t) {
            this.meta = t;
        }

        public void setTabs(GetStoreTabs getStoreTabs) {
            this.tabs = getStoreTabs;
        }

        public void setWidgets(GetStoreWidgets getStoreWidgets) {
            this.widgets = getStoreWidgets;
        }

        public String toString() {
            return "StoreUserAbstraction.Nodes(meta=" + getMeta() + ", tabs=" + getTabs() + ", widgets=" + getWidgets() + ")";
        }
    }

    /* access modifiers changed from: protected */
    public boolean canEqual(Object obj) {
        return obj instanceof StoreUserAbstraction;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StoreUserAbstraction)) {
            return false;
        }
        StoreUserAbstraction storeUserAbstraction = (StoreUserAbstraction) obj;
        if (!storeUserAbstraction.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        Nodes nodes2 = getNodes();
        Nodes nodes3 = storeUserAbstraction.getNodes();
        return nodes2 != null ? nodes2.equals(nodes3) : nodes3 == null;
    }

    public Nodes<T> getNodes() {
        return this.nodes;
    }

    public int hashCode() {
        int i;
        Nodes nodes2 = getNodes();
        int hashCode = (super.hashCode() + 59) * 59;
        if (nodes2 == null) {
            i = 43;
        } else {
            i = nodes2.hashCode();
        }
        return hashCode + i;
    }

    public void setNodes(Nodes<T> nodes2) {
        this.nodes = nodes2;
    }

    public String toString() {
        return "StoreUserAbstraction(nodes=" + getNodes() + ")";
    }
}
