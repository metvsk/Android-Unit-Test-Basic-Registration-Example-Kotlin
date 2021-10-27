package com.chillandcode.androidunittest_basicregistrationexample_kotlin


import org.junit.Test

class RegistrationUtilsTest {
    //
//    @Test
//    fun testCase1(){
//        testUserName("")
//    }
//
//    @Test
//    fun testCase2(){
//        testUserName("Vishnu")
//    }
//
//    @Test
//    fun testCase3(){
//        testUserName("Rhoda")
//    }
//
//    @Test
//    fun testCase4(){
//        testUserName("Anu")
//    }
    private var userName: String = ""

    @Test
    fun testUserName() {

        // use the following code to change the value of userName on each tests
        //uncomment the later ones one by one to alter the values

        //press Crl+Shift+F10 to run this specific file after selecting this file or Right click on the ....Test class inside tests package and click on Run....Test

        //toggle buttons in the run window to see failed / successful Test results
        userName = "ML"
        userName = "Vishnu"
        userName = "Android"
        userName = "Jude"
        //userName = "AdorableCode"
        //userName="ChillAndCode"
        val result = RegistrationUtils.validateRegistrationInput(
            userName,
        )
        println("**********************************************************************************************************************************************************\n\nTESTING WITH USER NAME :  > $userName< \n" +
                " ************************************************************************************************************************************************************************************************************************************************************************************************\n\n")
        assert(result)
        //assertThat(result).isFalse() //if using truth library
    }
}