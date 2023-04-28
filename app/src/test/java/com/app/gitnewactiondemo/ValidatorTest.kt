package com.app.gitnewactiondemo

import com.google.common.truth.Truth
import org.junit.Test

class ValidatorTest {
    @Test
    fun `empty_name`(){
        val res = Validator.validateName("")
        Truth.assertThat(res).isFalse()
    }

    @Test
    fun `null_name`(){
        val res = Validator.validateName(null)
        Truth.assertThat(res).isFalse()
    }

    @Test
    fun `digits_in_name`(){
        val res = Validator.validateName("name123hello")
        Truth.assertThat(res).isFalse()
    }

    @Test
    fun `special_chars_in_name`(){
        val res = Validator.validateName("demo@hello")
        Truth.assertThat(res).isFalse()
    }

    @Test
    fun `valid_name`(){
        val res = Validator.validateName("Jayesh")
        Truth.assertThat(res).isTrue()
    }
}