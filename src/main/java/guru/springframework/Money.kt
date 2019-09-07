package guru.springframework

import java.util.*

open class Money (protected open val amount: Int=0,protected open val currency: String="" ){

    fun dollar(value: Int)=Dollar(value)
    fun franc(value: Int)=Franc(value)
    fun currency():String {return currency}

    fun times(multiplier:Int): Money {
        return Money(amount*multiplier,this.currency)
    }
    override fun equals(other: Any?):Boolean {
        return when(other){
            is Money -> (other.amount== amount) && this.currency() == other.currency()
            else -> false
        }
    }

    override fun toString(): String {
        return "Money{amount=$amount,currency='$currency'}"
    }

    override fun hashCode(): Int {
        var result = amount
        result = 31 * result + currency.hashCode()
        return result
    }
}

class Dollar(override var amount:Int=0): Money(amount = amount,currency="USD") {
}

class Franc(override var amount:Int=0):Money(amount=amount,currency="CHF"){


}