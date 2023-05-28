package p015cm.aptoide.p016pt.dataprovider.model.p020v7;

import p015cm.aptoide.p016pt.dataprovider.model.p020v7.GetStoreWidgets;

/* renamed from: cm.aptoide.pt.dataprovider.model.v7.Event */
public class Event {
    private String action;
    private GetStoreWidgets.WSWidget.Data data;
    private Name name;
    private Type type;

    /* renamed from: cm.aptoide.pt.dataprovider.model.v7.Event$Name */
    public enum Name {
        listApps,
        listStores,
        getUser,
        getStore,
        getStoreWidgets,
        getMoreBundle,
        listReviews,
        listComments,
        getMyStoresSubscribed,
        getStoresRecommended,
        myStores,
        myUpdates,
        myExcludedUpdates,
        getAds,
        myDownloads,
        getAppCoinsAds,
        eSkills,
        facebook,
        twitch,
        twitter,
        youtube,
        getReviews
    }

    /* renamed from: cm.aptoide.pt.dataprovider.model.v7.Event$Type */
    public enum Type {
        API,
        CLIENT,
        v3
    }

    /* access modifiers changed from: protected */
    public boolean canEqual(Object obj) {
        return obj instanceof Event;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Event)) {
            return false;
        }
        Event event = (Event) obj;
        if (!event.canEqual(this)) {
            return false;
        }
        Type type2 = getType();
        Type type3 = event.getType();
        if (type2 != null ? !type2.equals(type3) : type3 != null) {
            return false;
        }
        Name name2 = getName();
        Name name3 = event.getName();
        if (name2 != null ? !name2.equals(name3) : name3 != null) {
            return false;
        }
        String action2 = getAction();
        String action3 = event.getAction();
        if (action2 != null ? !action2.equals(action3) : action3 != null) {
            return false;
        }
        GetStoreWidgets.WSWidget.Data data2 = getData();
        GetStoreWidgets.WSWidget.Data data3 = event.getData();
        if (data2 != null) {
            return data2.equals(data3);
        }
        if (data3 == null) {
            return true;
        }
        return false;
    }

    public String getAction() {
        return this.action;
    }

    public GetStoreWidgets.WSWidget.Data getData() {
        return this.data;
    }

    public Name getName() {
        return this.name;
    }

    public Type getType() {
        return this.type;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        Type type2 = getType();
        int i4 = 43;
        if (type2 == null) {
            i = 43;
        } else {
            i = type2.hashCode();
        }
        Name name2 = getName();
        int i5 = (i + 59) * 59;
        if (name2 == null) {
            i2 = 43;
        } else {
            i2 = name2.hashCode();
        }
        int i6 = i5 + i2;
        String action2 = getAction();
        int i7 = i6 * 59;
        if (action2 == null) {
            i3 = 43;
        } else {
            i3 = action2.hashCode();
        }
        int i8 = i7 + i3;
        GetStoreWidgets.WSWidget.Data data2 = getData();
        int i9 = i8 * 59;
        if (data2 != null) {
            i4 = data2.hashCode();
        }
        return i9 + i4;
    }

    public Event setAction(String str) {
        this.action = str;
        return this;
    }

    public Event setData(GetStoreWidgets.WSWidget.Data data2) {
        this.data = data2;
        return this;
    }

    public Event setName(Name name2) {
        this.name = name2;
        return this;
    }

    public Event setType(Type type2) {
        this.type = type2;
        return this;
    }

    public String toString() {
        return "Event(type=" + getType() + ", name=" + getName() + ", action=" + getAction() + ", data=" + getData() + ")";
    }
}
