package p015cm.aptoide.p016pt.dataprovider.model.p020v7;

/* renamed from: cm.aptoide.pt.dataprovider.model.v7.Split */
public class Split {
    private long filesize;
    private String md5sum;
    private String name;
    private String path;
    private String type;

    public long getFilesize() {
        return this.filesize;
    }

    public String getMd5sum() {
        return this.md5sum;
    }

    public String getName() {
        return this.name;
    }

    public String getPath() {
        return this.path;
    }

    public String getType() {
        return this.type;
    }

    public void setFilesize(long j) {
        this.filesize = j;
    }

    public void setMd5sum(String str) {
        this.md5sum = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPath(String str) {
        this.path = str;
    }

    public void setType(String str) {
        this.type = str;
    }
}
