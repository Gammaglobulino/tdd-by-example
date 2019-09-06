package guru.springframework
open class Money (protected open var amount: Int=0){

    fun dollar(value: Int)=Dollar(value)
    fun franc(value: Int)=Franc(value)

    fun times(multiplier:Int): Money {
        return Money(amount*multiplier)
    }
    override fun equals(other: Any?):Boolean {
        return when(other){
            is Money -> (other.amount== amount) //&& this::class == other::class
            else -> false
        }
    }
}

class Dollar(override var amount:Int=0): Money(amount = amount) {

}
class Franc(override var amount:Int=0):Money(amount=amount){


}