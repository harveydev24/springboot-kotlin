package com.kotlin.kotlin.service

import com.kotlin.kotlin.datasource.BankDataSource
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Test

internal class BankServiceTest {

    private val dataSource: BankDataSource = mockk(relaxed = true)
    private val bankService = BankService(dataSource)

    @Test
    fun `should call its data source retrieve banks` () {
        //when
        val banks = bankService.getBanks()
        
        //then
        verify(exactly = 1) { dataSource.retrieveBanks() }
    }
}