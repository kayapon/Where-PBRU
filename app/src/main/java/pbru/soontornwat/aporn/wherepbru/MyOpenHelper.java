package pbru.soontornwat.aporn.wherepbru;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by android on 27/5/2559.
 */
public class MyOpenHelper extends SQLiteOpenHelper{

    public static final String database_name = "wherePbru.db";
    private static final int database_version = 1;
    private static final String create_room_table = "create table roomTABE (" +
            "_id integer primary key,"+
            "Buid text,"+
            "Room text,"+
            "Lat text,"+
            "Lng text,"+
            "Icon text);";

    public MyOpenHelper(Context context){
        super(context,database_name,null,database_version);


    }//Construtor

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(create_room_table);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
} //mainclass
