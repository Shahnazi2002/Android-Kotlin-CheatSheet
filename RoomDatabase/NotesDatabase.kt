package ir.mohammadsn.myapp.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [WorkoutData::class], version = 1)
abstract class NotesDatabase : RoomDatabase() {
    abstract fun getDao(): Dao

    fun buildDatabase(context: Context) {
        Room.databaseBuilder(context.applicationContext, NotesDatabase::class.java, "data.db")
            .allowMainThreadQueries()
            .build()
    }
}
