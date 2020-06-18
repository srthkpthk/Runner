package srthk.pthk.runner.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import srthk.pthk.runner.db.converters.Converters

@Database(entities = [Run::class], version = 1)
@TypeConverters(Converters::class)
abstract class RunDatabase : RoomDatabase() {
    abstract fun getRunDao(): RunDao
}