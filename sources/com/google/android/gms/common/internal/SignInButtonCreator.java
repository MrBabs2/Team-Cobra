package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

public final class SignInButtonCreator extends RemoteCreator<ISignInButtonCreator> {

    /* renamed from: c */
    private static final SignInButtonCreator f14154c = new SignInButtonCreator();

    private SignInButtonCreator() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    /* renamed from: a */
    public static View m16060a(Context context, int i, int i2) throws RemoteCreator.RemoteCreatorException {
        return f14154c.m16061b(context, i, i2);
    }

    /* renamed from: b */
    private final View m16061b(Context context, int i, int i2) throws RemoteCreator.RemoteCreatorException {
        try {
            SignInButtonConfig signInButtonConfig = new SignInButtonConfig(i, i2, (Scope[]) null);
            return (View) ObjectWrapper.m16390H(((ISignInButtonCreator) mo25545a(context)).mo25371a(ObjectWrapper.m16391a(context), signInButtonConfig));
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder(64);
            sb.append("Could not get button with size ");
            sb.append(i);
            sb.append(" and color ");
            sb.append(i2);
            throw new RemoteCreator.RemoteCreatorException(sb.toString(), e);
        }
    }

    /* renamed from: a */
    public final ISignInButtonCreator m16063a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        if (queryLocalInterface instanceof ISignInButtonCreator) {
            return (ISignInButtonCreator) queryLocalInterface;
        }
        return new zah(iBinder);
    }
}
