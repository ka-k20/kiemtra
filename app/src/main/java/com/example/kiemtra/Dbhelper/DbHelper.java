package com.example.kiemtra.Dbhelper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbHelper extends SQLiteOpenHelper {
    public DbHelper(@Nullable Context context) {
        super(context, "QLSP", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE SanPham(MaSP INTEGER PRIMARY KEY AUTOINCREMENT, " + "TenSP TEXT, GiaTien REAL, Image TEXT)";
        db.execSQL(sql);
        String data = "INSERT INTO SanPham VALUES(1, 'Iphone X', '20000', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRa9gLtbTGoR20gJY4E9dy5yOom_nWO0vNNDg&usqp=CAU')," +
                "(2, 'SamSung Zlip 4', '30000', 'https://product.hstatic.net/200000525189/product/samsung-galaxy-z-flip4-5g-128gb-thumb-tim-600x600_e7f222c3274d4c719e692a2c5c431745.jpg')," +
                "(3, 'Vivo 29e', '60000', 'https://cdn.hoanghamobile.com/i/preview/Uploads/2023/10/20/xanh-song-bang-6.png')";
        db.execSQL(data);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        if (i != i1){
            db.execSQL("DROP TABLE IF EXISTS SanPham");
            onCreate(db);
        }
    }
}
