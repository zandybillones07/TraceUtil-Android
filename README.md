# TraceUtil-Android
This is just a simple way of logging the adb logcat debug. I chose the word Trace for easy typing instead of using the normal way Log.d(TAG,"").


## how to use

Step 1. 
Add the JitPack repository to your build file.
  ```
  allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  ```
  
Step 2. 
Add the dependency to your app module.
  ```
  dependencies {
	        implementation 'com.github.zandybillones07:TraceUtil-Android:0.1.0'
	}
  ```
  
