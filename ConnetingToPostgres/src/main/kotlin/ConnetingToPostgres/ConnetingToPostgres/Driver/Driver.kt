package ConnetingToPostgres.ConnetingToPostgres.Driver

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Driver(
        var DriverId: String? = null,
        var DriverRef: String? = null,
        var DriverNumber: String? = null,
        var DriverCode: String? = null,
        var fName: String? = null,
        var surName: String? = null,
        var DOB: String? = null,
        var nationality: String? = null,
        var URL: String? = null
){
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  val id: Long? = null
}