package com.jikexueyuan.imagebrowser;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by rogersun on 16/5/8.
 */
public class GetImage {
    public static File getImage(Context context) {
        File sdCard = Environment.getExternalStorageDirectory();
        File file = new File(sdCard.getAbsolutePath(), "sky.jpg");

        System.out.println("file:"+ file);
        Bitmap bitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.sky);

        try {
            FileOutputStream out = new FileOutputStream(file);
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, out);
            out.flush();
            out.close();

        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch (IOException e) {

            e.printStackTrace();
        }
        return file;
    }
}
