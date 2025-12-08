package no.nordicsemi.kotlin.ble.core.exception

open class CocException : Exception {
    constructor(): super("L2CAP COC error")
    constructor(message: String): super(message)
}
