package com.example.csc_teachers.UiLayer

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.csc_teachers.modal.Activity
import com.example.csc_teachers.util.ActivityMap


@Composable
fun TeacherCard(activity: Activity) {
    val fontSize  = 9.sp
    Row(modifier = Modifier
        .fillMaxWidth(1f)
        .height(40.dp)
        .background(MaterialTheme.colorScheme.background),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        var expanded by remember { mutableStateOf(false) }

        Text(activity.date , modifier = Modifier.fillMaxWidth(.15f) , fontSize = fontSize , color = MaterialTheme.colorScheme.onBackground, textAlign = TextAlign.Start  , fontWeight = FontWeight.Bold)
        Text(activity.time , modifier = Modifier.fillMaxWidth(0.25f) , fontSize = fontSize , color =  MaterialTheme.colorScheme.onBackground , textAlign = TextAlign.Start, fontWeight = FontWeight.Bold)
        Box(modifier = Modifier.fillMaxWidth(.3f)){
            Text(activity.activity , modifier = Modifier.clip(RoundedCornerShape(5.dp)).background(ActivityMap[activity.activity]?.copy(.4f) ?: Color.LightGray.copy(.4f)).padding(start = 5.dp , end = 5.dp) , fontWeight = FontWeight.Bold,fontSize = fontSize , color =  MaterialTheme.colorScheme.onBackground , textAlign = TextAlign.Center)
        }
        Text(activity.course , modifier = Modifier.fillMaxWidth(0.4f) , fontSize = fontSize , color =  MaterialTheme.colorScheme.onBackground, textAlign = TextAlign.Start , fontWeight = FontWeight.Bold)
        Text(activity.duration , modifier = Modifier.fillMaxWidth(0.6f) , fontSize = fontSize , color =  MaterialTheme.colorScheme.onBackground, textAlign = TextAlign.Start , fontWeight = FontWeight.Bold)

        Box(modifier = Modifier
            .fillMaxWidth(.5f)
            .clickable {
                expanded = !expanded
            }){
            Icon(imageVector = Icons.Default.MoreVert,
                contentDescription = null,
                tint = MaterialTheme.colorScheme.onBackground ,
            )
            DropdownMenu(
                expanded = expanded,
                onDismissRequest = { expanded = false },
                modifier = Modifier.border(1.dp, color = MaterialTheme.colorScheme.tertiary, shape = RoundedCornerShape(5.dp) )

            ) {
                DropdownMenuItem(
                    text = { Text("Details" , textAlign = TextAlign.Center , modifier = Modifier.fillMaxWidth() , fontSize = 10.sp) },
                    onClick = { /* Do something... */ },
                    contentPadding = PaddingValues(0.dp),
                    modifier = Modifier.height(30.dp)
                )
                HorizontalDivider()
                DropdownMenuItem(
                    text = { Text("Edit", textAlign = TextAlign.Center , modifier = Modifier.fillMaxWidth(), fontSize = 10.sp) },
                    onClick = { /* Do something... */ },
                    contentPadding = PaddingValues(0.dp),
                    modifier = Modifier.height(40.dp)
                )
                HorizontalDivider()
                DropdownMenuItem(
                    text = { Text("Delete" , textAlign = TextAlign.Center , modifier = Modifier.fillMaxWidth(), color = Color.Red , fontSize = 10.sp) },
                    onClick = { /* Do something... */ },
                    contentPadding = PaddingValues(0.dp),
                    modifier = Modifier.height(30.dp)
                )
            }
        }
    }
}

//
//@Preview(showSystemUi = true , )
//@Composable
//fun TeacherCard2(){
//    var fontSize  = 9.sp
//
//    Spacer(Modifier)
//    Row(modifier = Modifier.statusBarsPadding()
//        .padding(5.dp)
//        .fillMaxWidth(1f)
//        .height(50.dp)
//        .clip(RoundedCornerShape(15.dp))
//        .background(MaterialTheme.colorScheme.background)
//        .border(2.dp, color = Color.Gray , RoundedCornerShape(15.dp)),
//        verticalAlignment = Alignment.CenterVertically,
//    ) {
//        Spacer(modifier = Modifier.size(1.dp))
//        Text("13 march" , modifier = Modifier.fillMaxWidth(0.15f).background(Color.Green) , fontSize = fontSize , color = MaterialTheme.colorScheme.onBackground , textAlign = TextAlign.Center)
//        Text("12pm-2pm" , modifier = Modifier.fillMaxWidth(0.25f).background(Color.Gray) , fontSize = fontSize , color =  MaterialTheme.colorScheme.onBackground , textAlign = TextAlign.Center)
//        Box(modifier = Modifier.fillMaxWidth(.3f)){
//            Text("Invigilation" , modifier = Modifier.clip(RoundedCornerShape(5.dp)).background(Color.Green.copy(.4f)).padding(5.dp) , fontSize = fontSize , color =  MaterialTheme.colorScheme.onBackground , textAlign = TextAlign.Center)
//        }
//        Text("BCA" , modifier = Modifier.fillMaxWidth(0.4f).background(Color.Green) , fontSize = fontSize , color =  MaterialTheme.colorScheme.onBackground, textAlign = TextAlign.Center)
//        Text("1h 45min" , modifier = Modifier.fillMaxWidth(0.7f).background(Color.Gray) , fontSize = fontSize , color =  MaterialTheme.colorScheme.onBackground , textAlign = TextAlign.Center)
//        Icon(imageVector = Icons.Default.MoreVert,contentDescription = null, tint = MaterialTheme.colorScheme.onBackground , modifier = Modifier.fillMaxWidth(.5f))
//        Spacer(modifier = Modifier.size(1.dp))
//    }
//}