package com.kotlin.kotlin.datasource

import com.kotlin.kotlin.model.Bank

interface BankDataSource {

    fun retrieveBanks(): Collection<Bank>
}