class Robot(var name:String) {
fun RingAlarm(timetowakeup:String) {
    println("I AM  ${name} .The time is ${timetowakeup} now, you need to get up Sir or u will be late to college")
}
   fun MakeCoffee(black:String,spoonsOfSugar:Int) {
       var coffee=Coffee("black",2)

        if(coffee.black==black && spoonsOfSugar==2){
            println("your black coffee with ${coffee.spoonsOfSugar}spoons of sugar is ready ")
        }
        else
        {
            println("your coffee with ${coffee.spoonsOfSugar}spoons of sugar is ready")
        }


    }

    fun HeatWater(temperature:Int) {
        if (temperature< 20) {
            println("water is suitable for bathing")
        } else {
            println("${name} change the temp of water to an optimum temperature that is less than 20C")
        }
    }
    fun PackBag(day:String)
    {
        var days= listOf<String>("monday","tuesday","wednesday","thursday","friday")

        println("${name} packs bag acc to the inputed day ${day}")
    }
    fun CookLunch()
    {
        val menuList= arrayOf<String>("rajma chawal","chicken lababdar","butter chicken","chicken tandoor","chicken kurma")

    println("${name} cooks lunch ${menuList.random()}")
    }
    fun CookBreakfast()
    {
        val menubreakfast= arrayOf("egg","omellette","poha","samosa","french toast")
        println("${name} cooks breakfast ${menubreakfast.random()}")
    }
fun IronClothes(choice:Int)
{
   var dresses= listOf<String>("dungree","jumpsuits","leather jacket","kurti")

    println("${name} irons clothes ${dresses.get(choice)}")
}
}







