package ConnetingToPostgres.ConnetingToPostgres.Driver

import org.springframework.stereotype.Service

@Service
class DriverService(private val driverRepository: DriverRepository) {
  fun getRaces(): List<DriverList>{
    return driverRepository.haha()
  }

  fun createRace(){
    return driverRepository.createARace()
  }
}