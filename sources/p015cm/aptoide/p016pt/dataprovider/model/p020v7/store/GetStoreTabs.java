package p015cm.aptoide.p016pt.dataprovider.model.p020v7.store;

import java.util.List;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.BaseV7Response;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Event;

/* renamed from: cm.aptoide.pt.dataprovider.model.v7.store.GetStoreTabs */
public class GetStoreTabs extends BaseV7Response {
    private List<Tab> list;

    /* renamed from: cm.aptoide.pt.dataprovider.model.v7.store.GetStoreTabs$Tab */
    public static class Tab {
        private Event event;
        private String label;
        private String tag;

        /* access modifiers changed from: protected */
        public boolean canEqual(Object obj) {
            return obj instanceof Tab;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Tab)) {
                return false;
            }
            Tab tab = (Tab) obj;
            if (!tab.canEqual(this)) {
                return false;
            }
            String label2 = getLabel();
            String label3 = tab.getLabel();
            if (label2 != null ? !label2.equals(label3) : label3 != null) {
                return false;
            }
            String tag2 = getTag();
            String tag3 = tab.getTag();
            if (tag2 != null ? !tag2.equals(tag3) : tag3 != null) {
                return false;
            }
            Event event2 = getEvent();
            Event event3 = tab.getEvent();
            return event2 != null ? event2.equals(event3) : event3 == null;
        }

        public Event getEvent() {
            return this.event;
        }

        public String getLabel() {
            return this.label;
        }

        public String getTag() {
            return this.tag;
        }

        public int hashCode() {
            int i;
            int i2;
            String label2 = getLabel();
            int i3 = 43;
            if (label2 == null) {
                i = 43;
            } else {
                i = label2.hashCode();
            }
            String tag2 = getTag();
            int i4 = (i + 59) * 59;
            if (tag2 == null) {
                i2 = 43;
            } else {
                i2 = tag2.hashCode();
            }
            int i5 = i4 + i2;
            Event event2 = getEvent();
            int i6 = i5 * 59;
            if (event2 != null) {
                i3 = event2.hashCode();
            }
            return i6 + i3;
        }

        public void setEvent(Event event2) {
            this.event = event2;
        }

        public void setLabel(String str) {
            this.label = str;
        }

        public void setTag(String str) {
            this.tag = str;
        }

        public String toString() {
            return "GetStoreTabs.Tab(label=" + getLabel() + ", tag=" + getTag() + ", event=" + getEvent() + ")";
        }
    }

    /* access modifiers changed from: protected */
    public boolean canEqual(Object obj) {
        return obj instanceof GetStoreTabs;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetStoreTabs)) {
            return false;
        }
        GetStoreTabs getStoreTabs = (GetStoreTabs) obj;
        if (!getStoreTabs.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        List<Tab> list2 = getList();
        List<Tab> list3 = getStoreTabs.getList();
        return list2 != null ? list2.equals(list3) : list3 == null;
    }

    public List<Tab> getList() {
        return this.list;
    }

    public int hashCode() {
        int i;
        List<Tab> list2 = getList();
        int hashCode = (super.hashCode() + 59) * 59;
        if (list2 == null) {
            i = 43;
        } else {
            i = list2.hashCode();
        }
        return hashCode + i;
    }

    public void setList(List<Tab> list2) {
        this.list = list2;
    }

    public String toString() {
        return "GetStoreTabs(list=" + getList() + ")";
    }
}
