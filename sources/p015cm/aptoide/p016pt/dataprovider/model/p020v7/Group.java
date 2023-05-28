package p015cm.aptoide.p016pt.dataprovider.model.p020v7;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;

/* renamed from: cm.aptoide.pt.dataprovider.model.v7.Group */
public class Group {
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "UTC")
    private Date added;
    private String graphic;
    private String icon;

    /* renamed from: id */
    private long f4854id;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "UTC")
    private Date modified;
    private String name;
    private Parent parent;
    private Stats stats;
    private String title;

    /* renamed from: cm.aptoide.pt.dataprovider.model.v7.Group$Parent */
    public static class Parent {
        private String graphic;
        private String icon;

        /* renamed from: id */
        private long f4855id;
        private String name;
        private String title;

        /* access modifiers changed from: protected */
        public boolean canEqual(Object obj) {
            return obj instanceof Parent;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Parent)) {
                return false;
            }
            Parent parent = (Parent) obj;
            if (!parent.canEqual(this) || getId() != parent.getId()) {
                return false;
            }
            String name2 = getName();
            String name3 = parent.getName();
            if (name2 != null ? !name2.equals(name3) : name3 != null) {
                return false;
            }
            String title2 = getTitle();
            String title3 = parent.getTitle();
            if (title2 != null ? !title2.equals(title3) : title3 != null) {
                return false;
            }
            String icon2 = getIcon();
            String icon3 = parent.getIcon();
            if (icon2 != null ? !icon2.equals(icon3) : icon3 != null) {
                return false;
            }
            String graphic2 = getGraphic();
            String graphic3 = parent.getGraphic();
            return graphic2 != null ? graphic2.equals(graphic3) : graphic3 == null;
        }

        public String getGraphic() {
            return this.graphic;
        }

        public String getIcon() {
            return this.icon;
        }

        public long getId() {
            return this.f4855id;
        }

        public String getName() {
            return this.name;
        }

        public String getTitle() {
            return this.title;
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
            String title2 = getTitle();
            int i7 = i6 * 59;
            if (title2 == null) {
                i2 = 43;
            } else {
                i2 = title2.hashCode();
            }
            int i8 = i7 + i2;
            String icon2 = getIcon();
            int i9 = i8 * 59;
            if (icon2 == null) {
                i3 = 43;
            } else {
                i3 = icon2.hashCode();
            }
            int i10 = i9 + i3;
            String graphic2 = getGraphic();
            int i11 = i10 * 59;
            if (graphic2 != null) {
                i5 = graphic2.hashCode();
            }
            return i11 + i5;
        }

        public void setGraphic(String str) {
            this.graphic = str;
        }

        public void setIcon(String str) {
            this.icon = str;
        }

        public void setId(long j) {
            this.f4855id = j;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setTitle(String str) {
            this.title = str;
        }

        public String toString() {
            return "Group.Parent(id=" + getId() + ", name=" + getName() + ", title=" + getTitle() + ", icon=" + getIcon() + ", graphic=" + getGraphic() + ")";
        }
    }

    /* renamed from: cm.aptoide.pt.dataprovider.model.v7.Group$Stats */
    public static class Stats {
        private int groups;
        private int items;

        /* access modifiers changed from: protected */
        public boolean canEqual(Object obj) {
            return obj instanceof Stats;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Stats)) {
                return false;
            }
            Stats stats = (Stats) obj;
            return stats.canEqual(this) && getGroups() == stats.getGroups() && getItems() == stats.getItems();
        }

        public int getGroups() {
            return this.groups;
        }

        public int getItems() {
            return this.items;
        }

        public int hashCode() {
            return ((getGroups() + 59) * 59) + getItems();
        }

        public void setGroups(int i) {
            this.groups = i;
        }

        public void setItems(int i) {
            this.items = i;
        }

        public String toString() {
            return "Group.Stats(groups=" + getGroups() + ", items=" + getItems() + ")";
        }
    }

    /* access modifiers changed from: protected */
    public boolean canEqual(Object obj) {
        return obj instanceof Group;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Group)) {
            return false;
        }
        Group group = (Group) obj;
        if (!group.canEqual(this) || getId() != group.getId()) {
            return false;
        }
        String name2 = getName();
        String name3 = group.getName();
        if (name2 != null ? !name2.equals(name3) : name3 != null) {
            return false;
        }
        String title2 = getTitle();
        String title3 = group.getTitle();
        if (title2 != null ? !title2.equals(title3) : title3 != null) {
            return false;
        }
        String icon2 = getIcon();
        String icon3 = group.getIcon();
        if (icon2 != null ? !icon2.equals(icon3) : icon3 != null) {
            return false;
        }
        String graphic2 = getGraphic();
        String graphic3 = group.getGraphic();
        if (graphic2 != null ? !graphic2.equals(graphic3) : graphic3 != null) {
            return false;
        }
        Date added2 = getAdded();
        Date added3 = group.getAdded();
        if (added2 != null ? !added2.equals(added3) : added3 != null) {
            return false;
        }
        Date modified2 = getModified();
        Date modified3 = group.getModified();
        if (modified2 != null ? !modified2.equals(modified3) : modified3 != null) {
            return false;
        }
        Parent parent2 = getParent();
        Parent parent3 = group.getParent();
        if (parent2 != null ? !parent2.equals(parent3) : parent3 != null) {
            return false;
        }
        Stats stats2 = getStats();
        Stats stats3 = group.getStats();
        return stats2 != null ? stats2.equals(stats3) : stats3 == null;
    }

    public Date getAdded() {
        return this.added;
    }

    public String getGraphic() {
        return this.graphic;
    }

    public String getIcon() {
        return this.icon;
    }

    public long getId() {
        return this.f4854id;
    }

    public Date getModified() {
        return this.modified;
    }

    public String getName() {
        return this.name;
    }

    public Parent getParent() {
        return this.parent;
    }

    public Stats getStats() {
        return this.stats;
    }

    public String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        long id = getId();
        String name2 = getName();
        int i8 = (((int) (id ^ (id >>> 32))) + 59) * 59;
        int i9 = 43;
        if (name2 == null) {
            i = 43;
        } else {
            i = name2.hashCode();
        }
        int i10 = i8 + i;
        String title2 = getTitle();
        int i11 = i10 * 59;
        if (title2 == null) {
            i2 = 43;
        } else {
            i2 = title2.hashCode();
        }
        int i12 = i11 + i2;
        String icon2 = getIcon();
        int i13 = i12 * 59;
        if (icon2 == null) {
            i3 = 43;
        } else {
            i3 = icon2.hashCode();
        }
        int i14 = i13 + i3;
        String graphic2 = getGraphic();
        int i15 = i14 * 59;
        if (graphic2 == null) {
            i4 = 43;
        } else {
            i4 = graphic2.hashCode();
        }
        int i16 = i15 + i4;
        Date added2 = getAdded();
        int i17 = i16 * 59;
        if (added2 == null) {
            i5 = 43;
        } else {
            i5 = added2.hashCode();
        }
        int i18 = i17 + i5;
        Date modified2 = getModified();
        int i19 = i18 * 59;
        if (modified2 == null) {
            i6 = 43;
        } else {
            i6 = modified2.hashCode();
        }
        int i20 = i19 + i6;
        Parent parent2 = getParent();
        int i21 = i20 * 59;
        if (parent2 == null) {
            i7 = 43;
        } else {
            i7 = parent2.hashCode();
        }
        int i22 = i21 + i7;
        Stats stats2 = getStats();
        int i23 = i22 * 59;
        if (stats2 != null) {
            i9 = stats2.hashCode();
        }
        return i23 + i9;
    }

    public void setAdded(Date date) {
        this.added = date;
    }

    public void setGraphic(String str) {
        this.graphic = str;
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public void setId(long j) {
        this.f4854id = j;
    }

    public void setModified(Date date) {
        this.modified = date;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setParent(Parent parent2) {
        this.parent = parent2;
    }

    public void setStats(Stats stats2) {
        this.stats = stats2;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public String toString() {
        return "Group(id=" + getId() + ", name=" + getName() + ", title=" + getTitle() + ", icon=" + getIcon() + ", graphic=" + getGraphic() + ", added=" + getAdded() + ", modified=" + getModified() + ", parent=" + getParent() + ", stats=" + getStats() + ")";
    }
}
