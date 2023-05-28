package p015cm.aptoide.p016pt.dataprovider.model.p020v7.store;

import java.util.List;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.BaseV7Response;
import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Event;

/* renamed from: cm.aptoide.pt.dataprovider.model.v7.store.GetStoreDisplays */
public class GetStoreDisplays extends BaseV7Response {
    private List<EventImage> list;

    /* renamed from: cm.aptoide.pt.dataprovider.model.v7.store.GetStoreDisplays$EventImage */
    public static class EventImage {
        private Event event;
        private String graphic;
        private String label;

        /* access modifiers changed from: protected */
        public boolean canEqual(Object obj) {
            return obj instanceof EventImage;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EventImage)) {
                return false;
            }
            EventImage eventImage = (EventImage) obj;
            if (!eventImage.canEqual(this)) {
                return false;
            }
            String label2 = getLabel();
            String label3 = eventImage.getLabel();
            if (label2 != null ? !label2.equals(label3) : label3 != null) {
                return false;
            }
            String graphic2 = getGraphic();
            String graphic3 = eventImage.getGraphic();
            if (graphic2 != null ? !graphic2.equals(graphic3) : graphic3 != null) {
                return false;
            }
            Event event2 = getEvent();
            Event event3 = eventImage.getEvent();
            return event2 != null ? event2.equals(event3) : event3 == null;
        }

        public Event getEvent() {
            return this.event;
        }

        public String getGraphic() {
            return this.graphic;
        }

        public String getLabel() {
            return this.label;
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
            String graphic2 = getGraphic();
            int i4 = (i + 59) * 59;
            if (graphic2 == null) {
                i2 = 43;
            } else {
                i2 = graphic2.hashCode();
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

        public void setGraphic(String str) {
            this.graphic = str;
        }

        public void setLabel(String str) {
            this.label = str;
        }

        public String toString() {
            return "GetStoreDisplays.EventImage(label=" + getLabel() + ", graphic=" + getGraphic() + ", event=" + getEvent() + ")";
        }
    }

    /* access modifiers changed from: protected */
    public boolean canEqual(Object obj) {
        return obj instanceof GetStoreDisplays;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetStoreDisplays)) {
            return false;
        }
        GetStoreDisplays getStoreDisplays = (GetStoreDisplays) obj;
        if (!getStoreDisplays.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        List<EventImage> list2 = getList();
        List<EventImage> list3 = getStoreDisplays.getList();
        return list2 != null ? list2.equals(list3) : list3 == null;
    }

    public List<EventImage> getList() {
        return this.list;
    }

    public int hashCode() {
        int i;
        List<EventImage> list2 = getList();
        int hashCode = (super.hashCode() + 59) * 59;
        if (list2 == null) {
            i = 43;
        } else {
            i = list2.hashCode();
        }
        return hashCode + i;
    }

    public void setList(List<EventImage> list2) {
        this.list = list2;
    }

    public String toString() {
        return "GetStoreDisplays(list=" + getList() + ")";
    }
}
