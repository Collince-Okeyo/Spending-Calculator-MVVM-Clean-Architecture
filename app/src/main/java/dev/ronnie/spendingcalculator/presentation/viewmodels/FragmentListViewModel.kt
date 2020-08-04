package dev.ronnie.spendingcalculator.presentation.viewmodels

import androidx.lifecycle.ViewModel
import dev.ronnie.spendingcalculator.data.repository.SmsRepository
import kotlinx.coroutines.runBlocking


class FragmentListViewModel(private val smsRepository: SmsRepository) : ViewModel() {


    fun checkIfMessagedHasTag(id: String): String? = runBlocking {
        smsRepository.checkIfMessageIsSaved(id)
    }

}