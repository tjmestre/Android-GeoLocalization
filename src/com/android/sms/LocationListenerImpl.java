package com.android.sms;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

class LocationListenerImpl implements LocationListener {
    private final SmsReceiver _SmsBroadCast;

    LocationListenerImpl( final SmsReceiver mainActivity ) {
    	_SmsBroadCast = mainActivity;
    }

    @SuppressWarnings("unused") 
    public void onStatusChanged( final String provider, final int status, final Bundle extras ) {
        // do nothing;
    }

    public void onProviderEnabled( @SuppressWarnings("unused")  final String provider ) {
        // do nothing;
    }

    public void onProviderDisabled( @SuppressWarnings("unused")  final String provider ) {
        // do nothing;
    }

    public void onLocationChanged( final Location location ) {
     /*   if ( !_SmsBroadCast.isPaused() && location != null ) {
        	_SmsBroadCast.updateLocation( location.getLatitude(), location.getLongitude() );
        }*/
    }

}