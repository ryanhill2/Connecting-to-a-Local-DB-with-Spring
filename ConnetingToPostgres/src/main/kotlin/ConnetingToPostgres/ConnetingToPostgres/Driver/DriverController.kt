package ConnetingToPostgres.ConnetingToPostgres.Driver

import org.springframework.web.bind.annotation.*
import org.springframework.web.client.RestTemplate

@RestController
@RequestMapping
class DriverController(val driverService: DriverService) {

  @GetMapping("/races")
  fun getRaces(): List<DriverList> {
    return driverService.getRaces()
  }

  @PostMapping("/races")
  fun createrace(){
    return driverService.createRace()
  }

  @PostMapping("/{userId}")
  fun getPost (@PathVariable("userId") userId: String): Post{
    var restTemplate = RestTemplate()
    var post = restTemplate.getForObject("https://jsonplaceholder.typicode.com/posts", Post.class)

    return
  }
}