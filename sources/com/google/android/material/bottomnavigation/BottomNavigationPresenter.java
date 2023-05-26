package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.view.menu.C0138g;
import androidx.appcompat.view.menu.C0142i;
import androidx.appcompat.view.menu.C0153m;
import androidx.appcompat.view.menu.C0162r;
import com.google.android.material.badge.C8428a;
import com.google.android.material.internal.ParcelableSparseArray;

public class BottomNavigationPresenter implements C0153m {

    /* renamed from: f */
    private C0138g f23909f;

    /* renamed from: g */
    private C8453c f23910g;

    /* renamed from: h */
    private boolean f23911h = false;

    /* renamed from: i */
    private int f23912i;

    static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C8444a();

        /* renamed from: f */
        int f23913f;

        /* renamed from: g */
        ParcelableSparseArray f23914g;

        /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationPresenter$SavedState$a */
        static class C8444a implements Parcelable.Creator<SavedState> {
            C8444a() {
            }

            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f23913f);
            parcel.writeParcelable(this.f23914g, 0);
        }

        SavedState(Parcel parcel) {
            this.f23913f = parcel.readInt();
            this.f23914g = (ParcelableSparseArray) parcel.readParcelable(SavedState.class.getClassLoader());
        }
    }

    /* renamed from: a */
    public void mo549a(C0138g gVar, boolean z) {
    }

    /* renamed from: a */
    public void mo551a(C0153m.C0154a aVar) {
    }

    /* renamed from: a */
    public void mo30969a(C8453c cVar) {
        this.f23910g = cVar;
    }

    /* renamed from: a */
    public boolean mo555a(C0138g gVar, C0142i iVar) {
        return false;
    }

    /* renamed from: a */
    public boolean mo556a(C0162r rVar) {
        return false;
    }

    /* renamed from: b */
    public void mo30970b(boolean z) {
        this.f23911h = z;
    }

    /* renamed from: b */
    public boolean mo573b() {
        return false;
    }

    /* renamed from: b */
    public boolean mo558b(C0138g gVar, C0142i iVar) {
        return false;
    }

    /* renamed from: c */
    public Parcelable mo574c() {
        SavedState savedState = new SavedState();
        savedState.f23913f = this.f23910g.getSelectedItemId();
        savedState.f23914g = C8428a.m27113a(this.f23910g.getBadgeDrawables());
        return savedState;
    }

    public int getId() {
        return this.f23912i;
    }

    /* renamed from: a */
    public void mo547a(Context context, C0138g gVar) {
        this.f23909f = gVar;
        this.f23910g.mo472a(gVar);
    }

    /* renamed from: a */
    public void mo552a(boolean z) {
        if (!this.f23911h) {
            if (z) {
                this.f23910g.mo31034a();
            } else {
                this.f23910g.mo31037c();
            }
        }
    }

    /* renamed from: a */
    public void mo30968a(int i) {
        this.f23912i = i;
    }

    /* renamed from: a */
    public void mo566a(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f23910g.mo31035b(savedState.f23913f);
            this.f23910g.setBadgeDrawables(C8428a.m27112a(this.f23910g.getContext(), savedState.f23914g));
        }
    }
}
