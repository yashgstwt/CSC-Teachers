package com.example.csc_teachers.UiLayer

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert

import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true , showSystemUi = true)
@Composable
fun Card2 (){
val fontSize = 12.sp
    Column (modifier = Modifier.statusBarsPadding()
        .fillMaxWidth()
        .height(125.dp)
        .background(MaterialTheme.colorScheme.background)
        .border(1.dp , color = Color.Gray ,RoundedCornerShape(25.dp)), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.SpaceEvenly
        ){

        Row (modifier = Modifier
            .fillMaxWidth()
            .height(62.5.dp),
            horizontalArrangement = Arrangement.SpaceEvenly, verticalAlignment = Alignment.CenterVertically
        ){
            Text("3 feb" , modifier = Modifier , fontSize = fontSize , color = MaterialTheme.colorScheme.onBackground)
            Text("12pm-2pm" , modifier = Modifier , fontSize = fontSize , color =  MaterialTheme.colorScheme.onBackground)
            Text("lecture" , modifier = Modifier.clip(RoundedCornerShape(5.dp)).background(Color.Green.copy(.4f)).padding(5.dp) , fontSize = fontSize , color =  MaterialTheme.colorScheme.onBackground)
        }
        HorizontalDivider(thickness = 1.dp, color = Color.Gray)
        Row (modifier = Modifier
            .fillMaxWidth()
            .height(62.5.dp),
            horizontalArrangement = Arrangement.SpaceEvenly, verticalAlignment = Alignment.CenterVertically
        ){

            Text("BCA" , modifier = Modifier , fontSize = fontSize , color =  MaterialTheme.colorScheme.onBackground)
            Text("1h 45min" , modifier = Modifier , fontSize = fontSize , color =  MaterialTheme.colorScheme.onBackground)
            Icon(imageVector = Icons.Default.MoreVert,contentDescription = null, tint = MaterialTheme.colorScheme.onBackground)

        }

    }
}