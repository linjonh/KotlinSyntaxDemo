import org.junit.Test
import java.io.File

class TestClass {

    @Test
    fun testJunit() {
        println("hello")
    }

    /**
     * @author jaysenlin
     *
     * no parameters function
     */
    @Test
    fun testBasicType(): Unit {
        val localVariable: Int = 1
        println("$localVariable hello")
    }

    /**
     * @param x
     */
    fun testFun1(x: Any): Unit {
        println("first parameter is: $x ")
    }

    /**
     * if as an expression for return value to function
     */
    fun testFunExpression(a: Int, b: Int) = if (a > b) a else {
        "val is $b"
        "last"
    }

    @Test
    fun testExpression(){
        val expression = testFunExpression(1, 2)
        println(expression)
    }


    @Test
    fun testForLoop() {
        val intArray = arrayListOf(1, 2, 34, 54, 64, 6)
        for (index: Int in intArray) {
            println("for loop index: $index")
        }
        val map = mapOf(Pair("one", "val one"), Pair("hello", "kotlin"), Pair(1, 2))
        for (m in map) {
            println(m)
        }
    }

    /**
     * 测试循环区间 range
     */
    @Test
    fun testRange() {
        println("closed range: include 5")
        for (i in 1..5) {
            print(" $i ")
        }
        println("\nhalf open range: does not include 5")
        for (x in -10 until 5 step 4) {//step 增量步进为4
            print(" $x ")
        }
        println("\ndown to")
        //down to
        for (k in 5 downTo -10) {
            print(" $k ")
            if (k in 0..3) {// condition range
                print("$k is in 0..3")
            }
        }
    }

    /**
     * 只读列表和map
     */
    @Test
    fun testMapAndList() {
        val list = listOf("a", "b", "c", 1, 2, 3)
        for (x in list) {
            println("x :$x")
        }

        val map = mapOf(1 to "asd", "b" to 2, "c" to 3)
        for ((k,v) in map){
            println("{k: $k,v: $v}")
        }
        for (m in map){
            println("m: $m")
        }
    }
    //If not null shorthand
    @Test
    fun testNotNull(){
        val files = File("Test").listFiles()
        println(files?.size)
//        If not null and else shorthand
        println(files?.size ?: "empty")
//        Executing a statement if null
        val data = mapOf("email" to "asd",3 to 2)
        val email = data["email"] ?: throw IllegalStateException("Email is missing!")
        println(email)
    }
}