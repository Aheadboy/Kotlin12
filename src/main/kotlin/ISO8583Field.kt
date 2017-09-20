class ISO8583Field {
    var isFixLength = true
    var isReserved = false
    var id = -1
    val name = ""
    val description = ""
    val Head = if (isFixLength) null else FieldAtom(-1, HB.Head).length
    val Body = FieldAtom(0)
}

class FieldAtom(var length: Int, var type: HB = HB.Body) {
    var codeType = CodeType.ASC
    var data = if (length == -1) null else ""
}

enum class HB {
    Head, Body
}

enum class CodeType {
    ASC, BCD
}


