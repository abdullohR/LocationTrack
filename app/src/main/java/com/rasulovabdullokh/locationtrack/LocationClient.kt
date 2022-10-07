package com.rasulovabdullokh.locationtrack

import android.location.Location
import java.util.concurrent.Flow

interface LocationClient {

    fun getLocationUpdates(interval: Long): kotlinx.coroutines.flow.Flow<Location>

    class LocationException(message: String): Exception()
}