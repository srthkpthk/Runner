package srthk.pthk.runner.db

import android.graphics.Bitmap
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "run_table")
data class Run(
    var image: Bitmap? = null,
    var timeStamp: Long = 0L,
    var averageSpeed: Float = 0F,
    var distanceOfRun: Int = 0,
    var runTimeInMillis: Long = 0L,
    var caloriesBurnt: Int = 0
) {
    @PrimaryKey(autoGenerate = true)
    var runId: Int? = null
}