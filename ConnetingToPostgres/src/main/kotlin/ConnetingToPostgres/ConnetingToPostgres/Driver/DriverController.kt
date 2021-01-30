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
}