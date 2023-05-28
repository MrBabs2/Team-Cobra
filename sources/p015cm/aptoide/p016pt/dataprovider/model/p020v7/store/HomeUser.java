package p015cm.aptoide.p016pt.dataprovider.model.p020v7.store;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;

/* renamed from: cm.aptoide.pt.dataprovider.model.v7.store.HomeUser */
public class HomeUser {
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss", timezone = "UTC")
    private Date added;
    private String avatar;

    /* renamed from: id */
    private long f4861id;
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss", timezone = "UTC")
    private Date modified;
    private String name;

    /* access modifiers changed from: protected */
    public boolean canEqual(Object obj) {
        return obj instanceof HomeUser;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof HomeUser)) {
            return false;
        }
        HomeUser homeUser = (HomeUser) obj;
        if (!homeUser.canEqual(this) || getId() != homeUser.getId()) {
            return false;
        }
        String name2 = getName();
        String name3 = homeUser.getName();
        if (name2 != null ? !name2.equals(name3) : name3 != null) {
            return false;
        }
        String avatar2 = getAvatar();
        String avatar3 = homeUser.getAvatar();
        if (avatar2 != null ? !avatar2.equals(avatar3) : avatar3 != null) {
            return false;
        }
        Date added2 = getAdded();
        Date added3 = homeUser.getAdded();
        if (added2 != null ? !added2.equals(added3) : added3 != null) {
            return false;
        }
        Date modified2 = getModified();
        Date modified3 = homeUser.getModified();
        return modified2 != null ? modified2.equals(modified3) : modified3 == null;
    }

    public Date getAdded() {
        return this.added;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public long getId() {
        return this.f4861id;
    }

    public Date getModified() {
        return this.modified;
    }

    public String getName() {
        return this.name;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        long id = getId();
        String name2 = getName();
        int i4 = (((int) (id ^ (id >>> 32))) + 59) * 59;
        int i5 = 43;
        if (name2 == null) {
            i = 43;
        } else {
            i = name2.hashCode();
        }
        int i6 = i4 + i;
        String avatar2 = getAvatar();
        int i7 = i6 * 59;
        if (avatar2 == null) {
            i2 = 43;
        } else {
            i2 = avatar2.hashCode();
        }
        int i8 = i7 + i2;
        Date added2 = getAdded();
        int i9 = i8 * 59;
        if (added2 == null) {
            i3 = 43;
        } else {
            i3 = added2.hashCode();
        }
        int i10 = i9 + i3;
        Date modified2 = getModified();
        int i11 = i10 * 59;
        if (modified2 != null) {
            i5 = modified2.hashCode();
        }
        return i11 + i5;
    }

    public HomeUser setAdded(Date date) {
        this.added = date;
        return this;
    }

    public HomeUser setAvatar(String str) {
        this.avatar = str;
        return this;
    }

    public HomeUser setId(long j) {
        this.f4861id = j;
        return this;
    }

    public HomeUser setModified(Date date) {
        this.modified = date;
        return this;
    }

    public HomeUser setName(String str) {
        this.name = str;
        return this;
    }

    public String toString() {
        return "HomeUser(id=" + getId() + ", name=" + getName() + ", avatar=" + getAvatar() + ", added=" + getAdded() + ", modified=" + getModified() + ")";
    }
}
