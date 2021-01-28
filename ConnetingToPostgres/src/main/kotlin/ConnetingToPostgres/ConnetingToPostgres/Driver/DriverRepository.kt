package ConnetingToPostgres.ConnetingToPostgres.Driver


import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface DriverRepository: JpaRepository<Driver, Long>
//{
//  @Query(
//          value = "SELECT DriverId, DriverRef FROM driver ORDER BY DriverId",
////          value = "SELECT * FROM driver",
//          nativeQuery = true
//  )
//  fun haha(): List<Driver>
//}