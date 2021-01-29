package ConnetingToPostgres.ConnetingToPostgres.Driver


import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository

@Repository
interface DriverRepository: JpaRepository<Driver, Long>
{
  @Query(
          value = "SELECT driver_code FROM driver",
//          value = "SELECT * FROM driver",
          nativeQuery = true
  )
  fun haha(): List<Any>
}