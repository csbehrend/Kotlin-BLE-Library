package no.nordicsemi.kotlin.ble.core

import java.io.InputStream
import java.io.OutputStream

interface Socket<ID: Any> {
    val identifier: ID
    val peer: Peer<*>?
    val inStream: InputStream?
    val outStream: OutputStream?
    val isClosed: Boolean

    fun connect(): Boolean
    fun close()
}