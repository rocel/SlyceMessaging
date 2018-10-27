package it.slyce.messaging.utils;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.support.annotation.ColorRes;
import android.support.v4.content.ContextCompat;

public class ShapeUtils {

    public static ShapeDrawable getCircle(Context ctx, /*@ColorRes*/ int backgroundColorRes) {
        OvalShape ovalShape = new OvalShape();

        ShapeDrawable shapeDrawable = new ShapeDrawable(ovalShape);
        //shapeDrawable.getPaint().setColor(ContextCompat.getColor(ctx, backgroundColorRes));
        shapeDrawable.getPaint().setColor(backgroundColorRes);
        shapeDrawable.getPaint().setStyle(Paint.Style.FILL);
        shapeDrawable.getPaint().setAntiAlias(true);
        shapeDrawable.getPaint().setFlags(Paint.ANTI_ALIAS_FLAG);
        return shapeDrawable;
    }

}
