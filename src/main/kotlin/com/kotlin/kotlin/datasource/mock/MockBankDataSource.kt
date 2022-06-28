package com.kotlin.kotlin.datasource.mock

import com.kotlin.kotlin.datasource.BankDataSource
import com.kotlin.kotlin.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource : BankDataSource {

    val banks = listOf(
            Bank("342432", 1.0, 1),
            Bank("123213", 2.0, 2),
            Bank("434324", 3.0, 3)
    )

    override fun retrieveBanks(): Collection<Bank> = banks
}