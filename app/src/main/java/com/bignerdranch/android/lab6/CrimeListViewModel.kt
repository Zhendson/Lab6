package com.bignerdranch.android.lab6

import androidx.lifecycle.ViewModel

class CrimeListViewModel : ViewModel() {

    private val crimeRepository = CrimeRepository.get()
    val  crimeListLiveData =crimeRepository.getCrimes()


}

