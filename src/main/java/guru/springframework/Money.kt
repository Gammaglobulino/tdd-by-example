package guru.springframework

class Dollar(var amount:Int=0){
    private fun amount()=amount
    fun times(multiplier:Int):Dollar{
        return Dollar(amount*multiplier)
    }
    override fun equals(other: Any?):Boolean {
        return when(other){
            is Dollar -> other.amount== amount
            else -> false
        }

    }

}
class Franc(var amount:Int=0){
    private fun amount()=amount
    fun times(multiplier:Int):Franc{
        return Franc(amount*multiplier)
    }
    override fun equals(other: Any?):Boolean {
        return when(other){
            is Franc -> other.amount== amount
            else -> false
        }

    }
}