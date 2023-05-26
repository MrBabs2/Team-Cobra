package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.google.android.gms.internal.ads.zzard;
import com.google.android.gms.internal.ads.zzazt;
import com.google.android.gms.internal.ads.zzyt;

@zzard
public final class zzp extends FrameLayout implements View.OnClickListener {
    private final ImageButton zzdku;
    private final zzx zzdkv;

    public zzp(Context context, zzq zzq, zzx zzx) {
        super(context);
        this.zzdkv = zzx;
        setOnClickListener(this);
        ImageButton imageButton = new ImageButton(context);
        this.zzdku = imageButton;
        imageButton.setImageResource(17301527);
        this.zzdku.setBackgroundColor(0);
        this.zzdku.setOnClickListener(this);
        ImageButton imageButton2 = this.zzdku;
        zzyt.m25666a();
        int b = zzazt.m20475b(context, zzq.paddingLeft);
        zzyt.m25666a();
        int b2 = zzazt.m20475b(context, 0);
        zzyt.m25666a();
        int b3 = zzazt.m20475b(context, zzq.paddingRight);
        zzyt.m25666a();
        imageButton2.setPadding(b, b2, b3, zzazt.m20475b(context, zzq.paddingBottom));
        this.zzdku.setContentDescription("Interstitial close button");
        ImageButton imageButton3 = this.zzdku;
        zzyt.m25666a();
        int b4 = zzazt.m20475b(context, zzq.size + zzq.paddingLeft + zzq.paddingRight);
        zzyt.m25666a();
        addView(imageButton3, new FrameLayout.LayoutParams(b4, zzazt.m20475b(context, zzq.size + zzq.paddingBottom), 17));
    }

    public final void onClick(View view) {
        zzx zzx = this.zzdkv;
        if (zzx != null) {
            zzx.zztf();
        }
    }

    public final void zzaf(boolean z) {
        if (z) {
            this.zzdku.setVisibility(8);
        } else {
            this.zzdku.setVisibility(0);
        }
    }
}
