package p015cm.aptoide.p016pt.dataprovider.model.p020v7.listapp;

import p015cm.aptoide.p016pt.dataprovider.model.p020v7.Malware;

/* renamed from: cm.aptoide.pt.dataprovider.model.v7.listapp.File */
public class File {
    private long filesize;
    private Malware malware;
    private String md5sum;
    private String path;
    private String pathAlt;
    private int vercode;
    private String vername;

    /* access modifiers changed from: protected */
    public boolean canEqual(Object obj) {
        return obj instanceof File;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof File)) {
            return false;
        }
        File file = (File) obj;
        if (!file.canEqual(this)) {
            return false;
        }
        String vername2 = getVername();
        String vername3 = file.getVername();
        if (vername2 != null ? !vername2.equals(vername3) : vername3 != null) {
            return false;
        }
        if (getVercode() != file.getVercode()) {
            return false;
        }
        String md5sum2 = getMd5sum();
        String md5sum3 = file.getMd5sum();
        if (md5sum2 != null ? !md5sum2.equals(md5sum3) : md5sum3 != null) {
            return false;
        }
        String path2 = getPath();
        String path3 = file.getPath();
        if (path2 != null ? !path2.equals(path3) : path3 != null) {
            return false;
        }
        String pathAlt2 = getPathAlt();
        String pathAlt3 = file.getPathAlt();
        if (pathAlt2 != null ? !pathAlt2.equals(pathAlt3) : pathAlt3 != null) {
            return false;
        }
        if (getFilesize() != file.getFilesize()) {
            return false;
        }
        Malware malware2 = getMalware();
        Malware malware3 = file.getMalware();
        return malware2 != null ? malware2.equals(malware3) : malware3 == null;
    }

    public long getFilesize() {
        return this.filesize;
    }

    public Malware getMalware() {
        return this.malware;
    }

    public String getMd5sum() {
        return this.md5sum;
    }

    public String getPath() {
        return this.path;
    }

    public String getPathAlt() {
        return this.pathAlt;
    }

    public int getVercode() {
        return this.vercode;
    }

    public String getVername() {
        return this.vername;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        String vername2 = getVername();
        int i5 = 43;
        if (vername2 == null) {
            i = 43;
        } else {
            i = vername2.hashCode();
        }
        int vercode2 = ((i + 59) * 59) + getVercode();
        String md5sum2 = getMd5sum();
        int i6 = vercode2 * 59;
        if (md5sum2 == null) {
            i2 = 43;
        } else {
            i2 = md5sum2.hashCode();
        }
        int i7 = i6 + i2;
        String path2 = getPath();
        int i8 = i7 * 59;
        if (path2 == null) {
            i3 = 43;
        } else {
            i3 = path2.hashCode();
        }
        int i9 = i8 + i3;
        String pathAlt2 = getPathAlt();
        int i10 = i9 * 59;
        if (pathAlt2 == null) {
            i4 = 43;
        } else {
            i4 = pathAlt2.hashCode();
        }
        int i11 = i10 + i4;
        long filesize2 = getFilesize();
        Malware malware2 = getMalware();
        int i12 = ((i11 * 59) + ((int) (filesize2 ^ (filesize2 >>> 32)))) * 59;
        if (malware2 != null) {
            i5 = malware2.hashCode();
        }
        return i12 + i5;
    }

    public void setFilesize(long j) {
        this.filesize = j;
    }

    public void setMalware(Malware malware2) {
        this.malware = malware2;
    }

    public void setMd5sum(String str) {
        this.md5sum = str;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public void setPathAlt(String str) {
        this.pathAlt = str;
    }

    public void setVercode(int i) {
        this.vercode = i;
    }

    public void setVername(String str) {
        this.vername = str;
    }

    public String toString() {
        return "File(vername=" + getVername() + ", vercode=" + getVercode() + ", md5sum=" + getMd5sum() + ", path=" + getPath() + ", pathAlt=" + getPathAlt() + ", filesize=" + getFilesize() + ", malware=" + getMalware() + ")";
    }
}
