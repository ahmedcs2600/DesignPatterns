package behavioral.command.airconditioner

//Receiver
class AirConditioner {
    private var isOn = false
    var temp = 0

    fun turnOnAC() {
        isOn = true
        println("AC is ON")
    }

    fun turnOffAC() {
        isOn = false
        println("AC is OFF")
    }

    fun setTemperature(temperature: Int) {
        this.temp = temperature
    }
}