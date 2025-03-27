package com.example.csc_teachers

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import com.example.csc_teachers.UiLayer.HomeScreen
import com.example.csc_teachers.ViewModal.HomeViewModal

import com.example.csc_teachers.ui.theme.CscteachersTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
val viewModal : HomeViewModal by viewModels()
            CscteachersTheme {


            HomeScreen(viewModal)


//            var res : publicKey? = null
//                LaunchedEffect(true ) {
//                    CoroutineScope(Dispatchers.IO).launch {
//
//                        delay(5000)
//                        res  = apiRequest().getPublicApiKey()
//
//                        Log.d("Api-RESPONSE", res?.publicKey.toString())
//                    }
//
//                }
//
//                Text("jdbhwh bjbuhwbdubwa cqw wq duh wd  vwuq g vww" )
//
//               // Text(text = "wda" , modifier = Modifier.fillMaxWidth().height(50.dp).background(Color.Black), horizontalArrangement = Arrangement.Center , verticalAlignment = Alignment.CenterVertically )
//
//                Column (modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally , verticalArrangement = Arrangement.Center){
//
////                    Text("$res" , modifier = Modifier.fillMaxWidth().height(50.dp).background(Color.Black) )
//
//                }

        }
    }
}

}

