package com.liulishuo.filedownloader.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FileDownloadHeader implements Parcelable {
    public static final Parcelable.Creator<FileDownloadHeader> CREATOR = new C8894a();

    /* renamed from: f */
    private HashMap<String, List<String>> f25257f;

    /* renamed from: com.liulishuo.filedownloader.model.FileDownloadHeader$a */
    static class C8894a implements Parcelable.Creator<FileDownloadHeader> {
        C8894a() {
        }

        public FileDownloadHeader createFromParcel(Parcel parcel) {
            return new FileDownloadHeader(parcel);
        }

        public FileDownloadHeader[] newArray(int i) {
            return new FileDownloadHeader[i];
        }
    }

    public FileDownloadHeader() {
    }

    /* renamed from: a */
    public void mo32721a(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (str.isEmpty()) {
            throw new IllegalArgumentException("name is empty");
        } else if (str2 != null) {
            if (this.f25257f == null) {
                this.f25257f = new HashMap<>();
            }
            List list = this.f25257f.get(str);
            if (list == null) {
                list = new ArrayList();
                this.f25257f.put(str, list);
            }
            if (!list.contains(str2)) {
                list.add(str2);
            }
        } else {
            throw new NullPointerException("value == null");
        }
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f25257f.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeMap(this.f25257f);
    }

    protected FileDownloadHeader(Parcel parcel) {
        this.f25257f = parcel.readHashMap(String.class.getClassLoader());
    }

    /* renamed from: a */
    public HashMap<String, List<String>> mo32720a() {
        return this.f25257f;
    }
}
