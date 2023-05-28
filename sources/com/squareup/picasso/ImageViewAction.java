package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;

class ImageViewAction extends Action<ImageView> {
    Callback callback;

    ImageViewAction(Picasso picasso, ImageView imageView, Request request, int i, int i2, int i3, Drawable drawable, String str, Object obj, Callback callback2, boolean z) {
        super(picasso, imageView, request, i, i2, i3, drawable, str, obj, z);
        this.callback = callback2;
    }

    /* access modifiers changed from: package-private */
    public void cancel() {
        super.cancel();
        if (this.callback != null) {
            this.callback = null;
        }
    }

    public void complete(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
        if (bitmap != null) {
            ImageView imageView = (ImageView) this.target.get();
            if (imageView != null) {
                Picasso picasso = this.picasso;
                Bitmap bitmap2 = bitmap;
                Picasso.LoadedFrom loadedFrom2 = loadedFrom;
                PicassoDrawable.setBitmap(imageView, picasso.context, bitmap2, loadedFrom2, this.noFade, picasso.indicatorsEnabled);
                Callback callback2 = this.callback;
                if (callback2 != null) {
                    callback2.onSuccess();
                    return;
                }
                return;
            }
            return;
        }
        throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", new Object[]{this}));
    }

    public void error() {
        ImageView imageView = (ImageView) this.target.get();
        if (imageView != null) {
            int i = this.errorResId;
            if (i != 0) {
                imageView.setImageResource(i);
            } else {
                Drawable drawable = this.errorDrawable;
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                }
            }
            Callback callback2 = this.callback;
            if (callback2 != null) {
                callback2.onError();
            }
        }
    }
}
