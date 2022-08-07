# MyKeyboardUtilsLibrary  [![](https://jitpack.io/v/HerikaSethi/MyKeyboardUtilsLibrary.svg)](https://jitpack.io/#HerikaSethi/MyKeyboardUtilsLibrary)

A simple library which contains some commonly used Keyboard utilities.

Implementation:

Add the below code to **build.gradle(:app)**

      dependencies
           {
               com.github.HerikaSethi:MyKeyboardUtilsLibrary:0.1.0
              
               }
               
Add it in your <b>settings.gradle</b>

      dependencyResolutionManagement {
           repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
                  repositories {
                      google()
                      mavenCentral()
                      maven { url 'https://jitpack.io' }
                   }
              }
## Properties

 > Object Class: KeyboardUtils
 
  1. openKeyboardWhenFocus(context: Context, editable: EditText)
  
         > eg: KeyboardUtils.openKeyboardWhenFocus(this, etEmail)
         
  2. closeKeyboard(c: Context, windowToken: IBinder?)
        
         > eg: KeyboardUtils.closeKeyboard(this, etEmail.windowToken)
         
  3. hideKeyboard(activity: Activity)
  
         > eg: KeyboardUtils.hideKeyboard(this)
         
  4. setupKeyboardDone(context: Context, editText: EditText?,cursorVisible: Boolean=true)
  
         > eg: KeyboardUtils.setupKeyboardDone(this,email,cursorVisible = true)
 
