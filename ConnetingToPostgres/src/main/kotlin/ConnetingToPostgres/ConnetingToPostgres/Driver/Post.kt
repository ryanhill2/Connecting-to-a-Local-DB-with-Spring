package ConnetingToPostgres.ConnetingToPostgres.Driver

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Post(
        var ie: Long? = null,
        var Title: String? = null,
        var body: String? = null

) {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  val userId: Long? = null
}