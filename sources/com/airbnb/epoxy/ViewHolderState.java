package com.airbnb.epoxy;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import p050l.p066e.C4873d;
import p112n.p267a.p268a.C10553a;

class ViewHolderState extends C4873d<ViewState> implements Parcelable {
    public static final Parcelable.Creator<ViewHolderState> CREATOR = new C5565a();

    public static class ViewState extends SparseArray<Parcelable> implements Parcelable {
        public static final Parcelable.Creator<ViewState> CREATOR = new C5564a();

        /* renamed from: com.airbnb.epoxy.ViewHolderState$ViewState$a */
        static class C5564a implements Parcelable.ClassLoaderCreator<ViewState> {
            C5564a() {
            }

            public ViewState[] newArray(int i) {
                return new ViewState[i];
            }

            public ViewState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                int readInt = parcel.readInt();
                int[] iArr = new int[readInt];
                parcel.readIntArray(iArr);
                return new ViewState(readInt, iArr, parcel.readParcelableArray(classLoader), (C5565a) null);
            }

            public ViewState createFromParcel(Parcel parcel) {
                return createFromParcel(parcel, (ClassLoader) null);
            }
        }

        /* synthetic */ ViewState(int i, int[] iArr, Parcelable[] parcelableArr, C5565a aVar) {
            this(i, iArr, parcelableArr);
        }

        /* renamed from: c */
        private void m10532c(View view) {
            if (view.getId() == -1) {
                view.setId(C10553a.view_model_state_saving_id);
            }
        }

        /* renamed from: a */
        public void mo19104a(View view) {
            int id = view.getId();
            m10532c(view);
            view.restoreHierarchyState(this);
            view.setId(id);
        }

        /* renamed from: b */
        public void mo19105b(View view) {
            int id = view.getId();
            m10532c(view);
            view.saveHierarchyState(this);
            view.setId(id);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            int size = size();
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = keyAt(i2);
                parcelableArr[i2] = (Parcelable) valueAt(i2);
            }
            parcel.writeInt(size);
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }

        ViewState() {
        }

        private ViewState(int i, int[] iArr, Parcelable[] parcelableArr) {
            super(i);
            for (int i2 = 0; i2 < i; i2++) {
                put(iArr[i2], parcelableArr[i2]);
            }
        }
    }

    /* renamed from: com.airbnb.epoxy.ViewHolderState$a */
    static class C5565a implements Parcelable.Creator<ViewHolderState> {
        C5565a() {
        }

        public ViewHolderState createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ViewHolderState viewHolderState = new ViewHolderState(readInt, (C5565a) null);
            for (int i = 0; i < readInt; i++) {
                viewHolderState.mo16945c(parcel.readLong(), (ViewState) parcel.readParcelable(ViewState.class.getClassLoader()));
            }
            return viewHolderState;
        }

        public ViewHolderState[] newArray(int i) {
            return new ViewHolderState[i];
        }
    }

    /* synthetic */ ViewHolderState(int i, C5565a aVar) {
        this(i);
    }

    /* renamed from: a */
    public void mo19100a(C5636u uVar) {
        if (uVar.mo19327a().shouldSaveViewState()) {
            ViewState viewState = (ViewState) mo16936a(uVar.getItemId());
            if (viewState != null) {
                viewState.mo19104a(uVar.itemView);
            } else {
                uVar.mo19330c();
            }
        }
    }

    /* renamed from: b */
    public void mo19101b(C5636u uVar) {
        if (uVar.mo19327a().shouldSaveViewState()) {
            ViewState viewState = (ViewState) mo16936a(uVar.getItemId());
            if (viewState == null) {
                viewState = new ViewState();
            }
            viewState.mo19105b(uVar.itemView);
            mo16945c(uVar.getItemId(), viewState);
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int c = mo16942c();
        parcel.writeInt(c);
        for (int i2 = 0; i2 < c; i2++) {
            parcel.writeLong(mo16935a(i2));
            parcel.writeParcelable((Parcelable) mo16943c(i2), 0);
        }
    }

    ViewHolderState() {
    }

    private ViewHolderState(int i) {
        super(i);
    }
}
