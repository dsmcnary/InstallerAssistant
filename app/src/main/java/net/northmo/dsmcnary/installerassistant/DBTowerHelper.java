package net.northmo.dsmcnary.installerassistant;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBTowerHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "northmo";
    private static final String TABLE_TOWER = "tower";

    private static final String KEY_ID = "id";
    private static final String KEY_NAME = "name";
    private static final String KEY_LOC = "location";

    public DBTowerHelper(Context context)
    {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db)
    {
        String CREATE_TOWER_TABLE = "CREATE TABLE " + TABLE_TOWER + "(" + KEY_ID + " INTEGER PRIMARY KEY," + KEY_NAME + " TEXT," + KEY_LOC + " TEXT" + ")";
        db.execSQL(CREATE_TOWER_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String DROP_TABLE = "DROP TABLE IF EXISTS " + TABLE_TOWER;
        db.execSQL(DROP_TABLE);
        onCreate(db);
    }

    public void addTower(tower t)
    {
        return;
    }

/*    public tower getTower(int id)
    {
        tower t;
        return t;
    }*/

    public int getTowerCount()
    {
        return -1;
    }
}
