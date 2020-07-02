package srthk.pthk.runner.respository

import srthk.pthk.runner.db.Run
import srthk.pthk.runner.db.RunDao
import javax.inject.Inject

class MainRepository @Inject constructor(
    private val runDao: RunDao
) {
    suspend fun insertRun(run: Run) = runDao.saveRun(run)
    suspend fun deleteRun(run: Run) = runDao.deleteRun(run)
    fun getAllRunsSortedByDate() = runDao.getRunsSortedByDate()
    fun getAllRunsSortedByTimeInMillis() = runDao.getRunsSortedByRunTimeInMillis()
    fun getAllRunsSortedByCaloriesBurnt() = runDao.getRunsSortedByCaloriesBurnt()
    fun getAllRunsSortedByAverageSpeed() = runDao.getRunsSortedByAverageSpeeds()
    fun getAllRunsSortedByDistance() = runDao.getRunsSortedByDistance()
    fun getTotalAverageSpeed() = runDao.getTotalAverageSpeed()
    fun getTotalDistance() = runDao.getTotalDistance()
    fun getTotalCaloriesBurnt() = runDao.getTotalCaloriesBurnt()
    fun getTotalTimeOfRuns() = runDao.getTotalTimeOfRuns()

}