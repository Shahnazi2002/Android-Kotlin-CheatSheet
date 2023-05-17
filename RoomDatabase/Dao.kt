package ir.mohammadsn.myapp.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface Dao {
    @Insert
    fun addWorkout(notesData: NotesData)

    @Query("SELECT * FROM appdata")
    fun getAll(): MutableList<NotesData>

    @Delete
    fun delete(notesData: NotesData)
}
