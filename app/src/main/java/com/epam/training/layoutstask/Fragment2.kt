package com.epam.training.layoutstask

import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment2.*

/**
 * [Fragment2] is based on RelativeLayout and LinearLayout. Shows a toast message at a floating action button click.
 *
 * @author Alexandra Makovskaya
 */
class Fragment2 : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment1, container, false)
        val floatingActionButton = view.findViewById<FloatingActionButton>(R.id.floatingActionButton)
        floatingActionButton.setOnClickListener {
            Toast.makeText(activity, R.string.fragment_2_toast, Toast.LENGTH_LONG).show()
        }

        return view
    }

    override fun onStart() {
        super.onStart()

        departureDateTextView.setText(R.string.default_departure_date)
        val departureFreeSeatsText =
            getString(R.string.free_seats_label) + " " + getString(R.string.default_departure_free_seats)
        freeSeatsDeparture.text = departureFreeSeatsText
        departureCostTextView.setText(R.string.default_cost_departure)
        departureFrom.setText(R.string.default_departure_from)
        departureTo.setText(R.string.default_departure_to)
        departureLeaveTime.setText(R.string.default_departure_time_from)
        departureArriveTime.setText(R.string.default_departure_time_to)
        departureFlightTime.setText(R.string.default_departure_time_flight)

        returnDateTextView.setText(R.string.default_return_date)
        val returnFreeSeatsText =
            getString(R.string.free_seats_label) + " " + getString(R.string.default_return_free_seats)
        freeSeatsReturn.text = returnFreeSeatsText
        returnCostTextView.setText(R.string.default_cost_return)
        returnFrom.setText(R.string.default_return_from)
        returnTo.setText(R.string.default_return_to)
        returnLeaveTime.setText(R.string.default_return_time_from)
        returnArriveTime.setText(R.string.default_return_time_to)
        returnFlightTime.setText(R.string.default_return_time_flight)
    }
}