//import com.sun.org.apache.xpath.internal.functions.Function2Args
//import jdk.nashorn.internal.scripts.JO
//import kotlinx.coroutines.experimental.*
//import kotlinx.coroutines.experimental.channels.actor
//import java.net.HttpURLConnection
//import java.util.concurrent.CopyOnWriteArrayList
//import java.util.concurrent.TimeUnit
//import java.util.concurrent.atomic.AtomicInteger
//import kotlin.coroutines.experimental.Continuation
//import kotlin.coroutines.experimental.CoroutineContext
//import kotlin.coroutines.experimental.intrinsics.createCoroutineUnchecked
//import kotlin.system.measureTimeMillis
//
//// Message types for counterActor
//sealed class CounterMsg
//
//object IncCounter : CounterMsg() // one-way message to increment counter
//class GetCounter(val response: CompletableDeferred<Int>) : CounterMsg() // a request with reply
//
//
//fun counterActor() = actor<CounterMsg>(CommonPool) {
//    var counter = 0 // actor state
//    for (msg in channel) { // iterate over incoming messages
//        when (msg) {
//            is IncCounter -> counter++
//            is GetCounter -> msg.response.complete(counter)
//        }
//    }
//}
//
//
//val dTime = 2000L
//fun log(msg: String) = println("[${Thread.currentThread().name}] $msg")
//var counter = AtomicInteger()
//val singleThread = newSingleThreadContext("confinement ")
//fun main(args: Array<String>) = runBlocking<Unit> {
//    val counter = counterActor() // create the actor
//    massiveRun(CommonPool) {
//        counter.send(IncCounter)
//    }
//    // send a message to get a counter value from an actor
//    val response = CompletableDeferred<Int>()
//    counter.send(GetCounter(response))
//    println("Counter = ${response.await()}")
//    counter.close() // shutdown the actor
//}
//
//
///***
// *
// *
// *  fun <R, T> (R.() -> T).startCoroutine(
//receiver: R
//) {
//println("ext ${receiver}")
//println("ext ${this(receiver)}")///////attention
//}
//
//val ice: Int.() -> Int = { println(this * 2);4 }
//ice.startCoroutine(5)//这里只调用扩展函数，没有调用被扩展函数
//ice.invoke(10)//这里调用了被扩展的函数。
////    ice
//println(ice !is kotlin.coroutines.experimental.jvm.internal.CoroutineImpl)
// *
// *
// *
// */
//
//
//fun String.name() {
//    1
//}
//
//
//suspend fun doSomethingUsefulOne(name: String = "one"): Int {
//    delay(dTime) // pretend we are doing something useful here
//    log(name)
//    return 13
//}
//
//suspend fun doSomethingUsefulTwo(name: String = "two"): Int {
//    delay(dTime) // pretend we are doing something useful here, too
//    log(name)
//    return 29
//}
//
//
//suspend fun massiveRun(context: CoroutineContext, action: suspend () -> Unit) {
//    val n = 1000 // number of coroutines to launch
//    val k = 1000 // times an action is repeated by each coroutine
//    val time = measureTimeMillis {
//        val jobs = List(n) {
//            launch(context) {
//                repeat(k) {
//                    run(singleThread) {
//                        action()
//                    }
//                }
//            }
//        }
//        jobs.forEach { it.join() }
//    }
//    println("Completed ${n * k} actions in $time ms")
//}
