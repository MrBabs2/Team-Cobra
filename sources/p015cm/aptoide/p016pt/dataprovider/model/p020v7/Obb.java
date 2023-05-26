package p015cm.aptoide.p016pt.dataprovider.model.p020v7;

/* renamed from: cm.aptoide.pt.dataprovider.model.v7.Obb */
public class Obb {
    private ObbItem main;
    private ObbItem patch;

    /* renamed from: cm.aptoide.pt.dataprovider.model.v7.Obb$ObbItem */
    public static class ObbItem {
        private String filename;
        private long filesize;
        private String md5sum;
        private String path;

        /* access modifiers changed from: protected */
        public boolean canEqual(Object obj) {
            return obj instanceof ObbItem;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ObbItem)) {
                return false;
            }
            ObbItem obbItem = (ObbItem) obj;
            if (!obbItem.canEqual(this)) {
                return false;
            }
            String path2 = getPath();
            String path3 = obbItem.getPath();
            if (path2 != null ? !path2.equals(path3) : path3 != null) {
                return false;
            }
            String md5sum2 = getMd5sum();
            String md5sum3 = obbItem.getMd5sum();
            if (md5sum2 != null ? !md5sum2.equals(md5sum3) : md5sum3 != null) {
                return false;
            }
            if (getFilesize() != obbItem.getFilesize()) {
                return false;
            }
            String filename2 = getFilename();
            String filename3 = obbItem.getFilename();
            return filename2 != null ? filename2.equals(filename3) : filename3 == null;
        }

        public String getFilename() {
            return this.filename;
        }

        public long getFilesize() {
            return this.filesize;
        }

        public String getMd5sum() {
            return this.md5sum;
        }

        public String getPath() {
            return this.path;
        }

        public int hashCode() {
            int i;
            int i2;
            String path2 = getPath();
            int i3 = 43;
            if (path2 == null) {
                i = 43;
            } else {
                i = path2.hashCode();
            }
            String md5sum2 = getMd5sum();
            int i4 = (i + 59) * 59;
            if (md5sum2 == null) {
                i2 = 43;
            } else {
                i2 = md5sum2.hashCode();
            }
            int i5 = i4 + i2;
            long filesize2 = getFilesize();
            String filename2 = getFilename();
            int i6 = ((i5 * 59) + ((int) (filesize2 ^ (filesize2 >>> 32)))) * 59;
            if (filename2 != null) {
                i3 = filename2.hashCode();
            }
            return i6 + i3;
        }

        public void setFilename(String str) {
            this.filename = str;
        }

        public void setFilesize(long j) {
            this.filesize = j;
        }

        public void setMd5sum(String str) {
            this.md5sum = str;
        }

        public void setPath(String str) {
            this.path = str;
        }

        public String toString() {
            return "Obb.ObbItem(path=" + getPath() + ", md5sum=" + getMd5sum() + ", filesize=" + getFilesize() + ", filename=" + getFilename() + ")";
        }
    }

    /* access modifiers changed from: protected */
    public boolean canEqual(Object obj) {
        return obj instanceof Obb;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Obb)) {
            return false;
        }
        Obb obb = (Obb) obj;
        if (!obb.canEqual(this)) {
            return false;
        }
        ObbItem patch2 = getPatch();
        ObbItem patch3 = obb.getPatch();
        if (patch2 != null ? !patch2.equals(patch3) : patch3 != null) {
            return false;
        }
        ObbItem main2 = getMain();
        ObbItem main3 = obb.getMain();
        return main2 != null ? main2.equals(main3) : main3 == null;
    }

    public ObbItem getMain() {
        return this.main;
    }

    public ObbItem getPatch() {
        return this.patch;
    }

    public int hashCode() {
        int i;
        ObbItem patch2 = getPatch();
        int i2 = 43;
        if (patch2 == null) {
            i = 43;
        } else {
            i = patch2.hashCode();
        }
        ObbItem main2 = getMain();
        int i3 = (i + 59) * 59;
        if (main2 != null) {
            i2 = main2.hashCode();
        }
        return i3 + i2;
    }

    public void setMain(ObbItem obbItem) {
        this.main = obbItem;
    }

    public void setPatch(ObbItem obbItem) {
        this.patch = obbItem;
    }

    public String toString() {
        return "Obb(patch=" + getPatch() + ", main=" + getMain() + ")";
    }
}
