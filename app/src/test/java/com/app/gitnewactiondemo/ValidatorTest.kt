package com.app.gitnewactiondemo

import com.google.common.truth.Truth
import org.junit.Test

class ValidatorTest {
    @Test
    fun `empty_name`(){
        val res = Validator.validateName("Test123")
        Truth.assertThat(res).isTrue()
    }
}