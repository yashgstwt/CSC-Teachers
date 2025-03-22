package com.example.csc_teachers.UiLayer

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.csc_teachers.R


@Composable
fun ProgressBar(value: Float = 45.2f, total: Float = 45.5f, startAnimation: Boolean, label: String){
    val percentage =  (value/total)

    val animationSize: Float by animateFloatAsState(
        targetValue = if (startAnimation) percentage else 0.0f,
        animationSpec = tween(durationMillis = 2500,)
    )
    Row (modifier = Modifier.fillMaxWidth(1f)){
        Text( label, modifier = Modifier.fillMaxWidth(0.5f).align(Alignment.CenterVertically).padding(start = 10.dp , end = 10.dp) , textAlign = TextAlign.Right , fontSize = 20.sp)

        Column(modifier = Modifier.fillMaxWidth().padding(end=10.dp)) {
            Column(modifier = Modifier.height(45.dp).clip(RoundedCornerShape(10.dp)).background(Color.Yellow.copy(alpha = .3f)).fillMaxWidth(animationSize) , horizontalAlignment = Alignment.End , verticalArrangement = Arrangement.Center) {
                Text("1h 20m" , fontWeight = FontWeight.ExtraBold , modifier = Modifier.padding(end = 10.dp) , fontSize = 15.sp , color = colorResource (R.color.darkYellow) )
            }
        }
    }
}
