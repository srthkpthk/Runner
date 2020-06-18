package srthk.pthk.runner.db

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface RunDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveRun(run: Run)

    @Delete
    suspend fun deleteRun(run: Run)

    @Query("SELECT * FROM run_table order by timeStamp desc")
    fun getRunsSortedByDate(): LiveData<List<Run>>

    @Query("SELECT * FROM run_table order by runTimeInMillis desc")
    fun getRunsSortedByRunTimeInMillis(): LiveData<List<Run>>

    @Query("SELECT * FROM run_table order by caloriesBurnt desc")
    fun getRunsSortedByCaloriesBurnt(): LiveData<List<Run>>

    @Query("SELECT * FROM run_table order by averageSpeed desc")
    fun getRunsSortedByAverageSpeeds(): LiveData<List<Run>>

    @Query("SELECT * FROM run_table order by distanceOfRun desc")
    fun getRunsSortedByDistance(): LiveData<List<Run>>

    @Query("SELECT SUM(runTimeInMillis) from run_table")
    fun getTotalTimeOfRuns(): LiveData<Long>

    @Query("SELECT SUM(caloriesBurnt) from run_table")
    fun getTotalCaloriesBurnt(): LiveData<Int>

    @Query("SELECT SUM(distanceOfRun) from run_table")
    fun getTotalDistance(): LiveData<Int>

    @Query("SELECT AVG(averageSpeed) from run_table")
    fun getTotalAverageSpeed(): LiveData<Float>


}