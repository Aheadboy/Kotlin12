import NLPayMent.MacEcbUtils
import NLPayMent.Utils
import org.dom4j.Element

//    val key = byteArrayOf(0x5C, 0xBE.toByte(), 0x7E, 0x38, 0xA1.toByte(), 0x46, 0xFD.toByte(), 0x5C)
//    val input = byteArrayOf(0x01, 0x02, 0x03)
fun main(args: Array<String>) {
    val e = Utils.xpathUse(mutableListOf(2))
    println()

    for (i in 0..50) {
        println(Utils.test())
    }
}


fun filterSpace(s: String): String {
    return s.trim().filterNot { it == ' ' }
}

fun getByteLength(s: String): Int {
    return s.length / 2
}

fun giveMAC() {
    val srcKey = "1234567890123456"
    val srcInput = filterSpace(
            "0210703A00810ED0 8811196221505500 0000010450000000 0000000001280000" +
                    "2216163803310331 0008010310003034 3638373930383735 3634313233353634" +
                    "3030313233343536 3736313233343536 3738393031323334 3522383135363831" +
                    "3536383135313135 3638313536383130 3135362600000000 0000000014220000" +
                    "0100050100000000 ")
    println()
    Utils.hexStringToBytes(srcKey).forEach { println(it) }

    println(Utils.bcd2Str(MacEcbUtils.getMac(Utils.hexStringToBytes(srcKey), Utils.hexStringToBytes(srcInput))))

}