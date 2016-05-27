package pbru.soontornwat.aporn.wherepbru;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private MyManage myManage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myManage = new MyManage(this);

       // myManage.addRoom("build", "room", "lat", "ng", "icon");
        deleteAllSQLite();

    }//main mathod

    private  void deleteAllSQLite() {
        SQLiteDatabase sqLiteDatabase = openOrCreateDatabase(MyOpenHelper.database_name,
                MODE_PRIVATE,null);
        sqLiteDatabase.delete(MyManage.room_table,null,null);
    }

}//main Class
