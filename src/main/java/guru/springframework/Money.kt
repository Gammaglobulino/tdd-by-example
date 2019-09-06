package guru.springframework

class Dollar(var amount:Int=0){
    fun amount()=amount
    fun times(multiplier:Int):Dollar{
        return Dollar(amount*multiplier)
    }

}