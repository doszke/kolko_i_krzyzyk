package zad2

import java.time.LocalDateTime

class Emergency(
    private var name: String,
    private var surname: String,
    private var age: Int,
    private var placeDesc: String,
    private var time: LocalDateTime,
    private var cause: String,
    private var responseType: String,
    private var responseStatus: String,
    private var latitude: Double,
    private var longitude: Double
) {

}