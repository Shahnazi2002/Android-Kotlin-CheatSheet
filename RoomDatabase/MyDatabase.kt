package ir.mohammadsn.myapp.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [WorkoutData::class], version = 1)
abstract class MyDatabase : RoomDatabase() {
    abstract fun getDao(): Dao

    fun buildDatabase(context: Context) {
        Room.databaseBuilder(context.applicationContext, MyDatabase::class.java, "data.db")
            .allowMainThreadQueries()
            .build()
    }
}
