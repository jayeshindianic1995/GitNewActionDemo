package com.app.gitnewactiondemo

object Validator {

    fun validateName(name:String?):Boolean {
        if(name.isNullOrEmpty()) {
            return false
        }

        if(name.matches("^[\\p{L} .'-]+$".toRegex()).not()) {
            return false
        }

        return true
    }
}