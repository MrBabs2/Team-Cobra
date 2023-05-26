package p015cm.aptoide.p016pt.dataprovider.model.p019v3;

/* renamed from: cm.aptoide.pt.dataprovider.model.v3.Subscription */
public class Subscription {
    private String avatar;
    private String avatarHd;
    private String description;
    private String downloads;

    /* renamed from: id */
    private Number f4840id;
    private String items;
    private String name;
    private String theme;
    private String view;

    /* access modifiers changed from: protected */
    public boolean canEqual(Object obj) {
        return obj instanceof Subscription;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Subscription)) {
            return false;
        }
        Subscription subscription = (Subscription) obj;
        if (!subscription.canEqual(this)) {
            return false;
        }
        Number id = getId();
        Number id2 = subscription.getId();
        if (id != null ? !id.equals(id2) : id2 != null) {
            return false;
        }
        String name2 = getName();
        String name3 = subscription.getName();
        if (name2 != null ? !name2.equals(name3) : name3 != null) {
            return false;
        }
        String avatar2 = getAvatar();
        String avatar3 = subscription.getAvatar();
        if (avatar2 != null ? !avatar2.equals(avatar3) : avatar3 != null) {
            return false;
        }
        String downloads2 = getDownloads();
        String downloads3 = subscription.getDownloads();
        if (downloads2 != null ? !downloads2.equals(downloads3) : downloads3 != null) {
            return false;
        }
        String theme2 = getTheme();
        String theme3 = subscription.getTheme();
        if (theme2 != null ? !theme2.equals(theme3) : theme3 != null) {
            return false;
        }
        String description2 = getDescription();
        String description3 = subscription.getDescription();
        if (description2 != null ? !description2.equals(description3) : description3 != null) {
            return false;
        }
        String items2 = getItems();
        String items3 = subscription.getItems();
        if (items2 != null ? !items2.equals(items3) : items3 != null) {
            return false;
        }
        String view2 = getView();
        String view3 = subscription.getView();
        if (view2 != null ? !view2.equals(view3) : view3 != null) {
            return false;
        }
        String avatarHd2 = getAvatarHd();
        String avatarHd3 = subscription.getAvatarHd();
        return avatarHd2 != null ? avatarHd2.equals(avatarHd3) : avatarHd3 == null;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public String getAvatarHd() {
        return this.avatarHd;
    }

    public String getDescription() {
        return this.description;
    }

    public String getDownloads() {
        return this.downloads;
    }

    public Number getId() {
        return this.f4840id;
    }

    public String getItems() {
        return this.items;
    }

    public String getName() {
        return this.name;
    }

    public String getTheme() {
        return this.theme;
    }

    public String getView() {
        return this.view;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        Number id = getId();
        int i9 = 43;
        if (id == null) {
            i = 43;
        } else {
            i = id.hashCode();
        }
        String name2 = getName();
        int i10 = (i + 59) * 59;
        if (name2 == null) {
            i2 = 43;
        } else {
            i2 = name2.hashCode();
        }
        int i11 = i10 + i2;
        String avatar2 = getAvatar();
        int i12 = i11 * 59;
        if (avatar2 == null) {
            i3 = 43;
        } else {
            i3 = avatar2.hashCode();
        }
        int i13 = i12 + i3;
        String downloads2 = getDownloads();
        int i14 = i13 * 59;
        if (downloads2 == null) {
            i4 = 43;
        } else {
            i4 = downloads2.hashCode();
        }
        int i15 = i14 + i4;
        String theme2 = getTheme();
        int i16 = i15 * 59;
        if (theme2 == null) {
            i5 = 43;
        } else {
            i5 = theme2.hashCode();
        }
        int i17 = i16 + i5;
        String description2 = getDescription();
        int i18 = i17 * 59;
        if (description2 == null) {
            i6 = 43;
        } else {
            i6 = description2.hashCode();
        }
        int i19 = i18 + i6;
        String items2 = getItems();
        int i20 = i19 * 59;
        if (items2 == null) {
            i7 = 43;
        } else {
            i7 = items2.hashCode();
        }
        int i21 = i20 + i7;
        String view2 = getView();
        int i22 = i21 * 59;
        if (view2 == null) {
            i8 = 43;
        } else {
            i8 = view2.hashCode();
        }
        int i23 = i22 + i8;
        String avatarHd2 = getAvatarHd();
        int i24 = i23 * 59;
        if (avatarHd2 != null) {
            i9 = avatarHd2.hashCode();
        }
        return i24 + i9;
    }

    public void setAvatar(String str) {
        this.avatar = str;
    }

    public void setAvatarHd(String str) {
        this.avatarHd = str;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setDownloads(String str) {
        this.downloads = str;
    }

    public void setId(Number number) {
        this.f4840id = number;
    }

    public void setItems(String str) {
        this.items = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setTheme(String str) {
        this.theme = str;
    }

    public void setView(String str) {
        this.view = str;
    }

    public String toString() {
        return "Subscription(id=" + getId() + ", name=" + getName() + ", avatar=" + getAvatar() + ", downloads=" + getDownloads() + ", theme=" + getTheme() + ", description=" + getDescription() + ", items=" + getItems() + ", view=" + getView() + ", avatarHd=" + getAvatarHd() + ")";
    }
}
