package co.smartreceipts.android.trips.navigation

import co.smartreceipts.core.di.scopes.ApplicationScope
import javax.inject.Inject

/**
 * A simple application scope tracker for if we've previously navigated to the last trip
 */
@ApplicationScope
class LastTripAutoNavigationTracker constructor(var hasNavigatedToLastTrip: Boolean) {

    @Inject
    constructor() : this(false)
}