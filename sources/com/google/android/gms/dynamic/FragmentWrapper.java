package com.google.android.gms.dynamic;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.IFragmentWrapper;

@SuppressLint({"NewApi"})
@KeepForSdk
public final class FragmentWrapper extends IFragmentWrapper.Stub {

    /* renamed from: f */
    private Fragment f14288f;

    private FragmentWrapper(Fragment fragment) {
        this.f14288f = fragment;
    }

    @KeepForSdk
    /* renamed from: a */
    public static FragmentWrapper m16320a(Fragment fragment) {
        if (fragment != null) {
            return new FragmentWrapper(fragment);
        }
        return null;
    }

    /* renamed from: A */
    public final Bundle mo25519A() {
        return this.f14288f.getArguments();
    }

    /* renamed from: A0 */
    public final boolean mo25520A0() {
        return this.f14288f.isResumed();
    }

    /* renamed from: C0 */
    public final boolean mo25521C0() {
        return this.f14288f.isAdded();
    }

    /* renamed from: G */
    public final boolean mo25522G() {
        return this.f14288f.isHidden();
    }

    /* renamed from: L */
    public final boolean mo25523L() {
        return this.f14288f.getUserVisibleHint();
    }

    /* renamed from: P */
    public final IObjectWrapper mo25524P() {
        return ObjectWrapper.m16391a(this.f14288f.getResources());
    }

    /* renamed from: S */
    public final boolean mo25525S() {
        return this.f14288f.isDetached();
    }

    /* renamed from: W0 */
    public final int mo25526W0() {
        return this.f14288f.getTargetRequestCode();
    }

    /* renamed from: X */
    public final boolean mo25527X() {
        return this.f14288f.getRetainInstance();
    }

    /* renamed from: a0 */
    public final IFragmentWrapper mo25529a0() {
        return m16320a(this.f14288f.getTargetFragment());
    }

    /* renamed from: c */
    public final void mo25530c(boolean z) {
        this.f14288f.setHasOptionsMenu(z);
    }

    /* renamed from: d */
    public final void mo25531d(boolean z) {
        this.f14288f.setUserVisibleHint(z);
    }

    /* renamed from: e */
    public final void mo25532e(boolean z) {
        this.f14288f.setMenuVisibility(z);
    }

    /* renamed from: e1 */
    public final IObjectWrapper mo25533e1() {
        return ObjectWrapper.m16391a(this.f14288f.getView());
    }

    public final int getId() {
        return this.f14288f.getId();
    }

    public final String getTag() {
        return this.f14288f.getTag();
    }

    public final boolean isVisible() {
        return this.f14288f.isVisible();
    }

    /* renamed from: j0 */
    public final IObjectWrapper mo25537j0() {
        return ObjectWrapper.m16391a(this.f14288f.getActivity());
    }

    /* renamed from: m */
    public final void mo25538m(boolean z) {
        this.f14288f.setRetainInstance(z);
    }

    /* renamed from: o0 */
    public final boolean mo25539o0() {
        return this.f14288f.isInLayout();
    }

    /* renamed from: p0 */
    public final IFragmentWrapper mo25540p0() {
        return m16320a(this.f14288f.getParentFragment());
    }

    /* renamed from: s */
    public final void mo25541s(IObjectWrapper iObjectWrapper) {
        this.f14288f.unregisterForContextMenu((View) ObjectWrapper.m16390H(iObjectWrapper));
    }

    public final void startActivityForResult(Intent intent, int i) {
        this.f14288f.startActivityForResult(intent, i);
    }

    /* renamed from: z */
    public final void mo25543z(IObjectWrapper iObjectWrapper) {
        this.f14288f.registerForContextMenu((View) ObjectWrapper.m16390H(iObjectWrapper));
    }

    /* renamed from: z0 */
    public final boolean mo25544z0() {
        return this.f14288f.isRemoving();
    }

    /* renamed from: a */
    public final void mo25528a(Intent intent) {
        this.f14288f.startActivity(intent);
    }
}
