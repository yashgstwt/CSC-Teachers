package com.example.csc_teachers.UiLayer

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.csc_teachers.R
import com.example.csc_teachers.util.Teacherlist
import com.example.csc_teachers.util.WeekDays

@Preview(showSystemUi = true)
@Composable
fun HomeScreen(){
    var showDialog by remember { mutableStateOf(false) }
    var showAnimation by remember { mutableStateOf(false) }

    Column (modifier = Modifier
        .background(MaterialTheme.colorScheme.background)
        .statusBarsPadding()
        .fillMaxSize()
    ){
           Row(modifier = Modifier.fillMaxWidth()
                    .background(MaterialTheme.colorScheme.primary)
                    .fillMaxHeight(0.09f)
                    .padding(start = 10.dp , end = 10.dp),
               verticalAlignment = Alignment.CenterVertically ,
               horizontalArrangement = Arrangement.SpaceAround
           ) {
               Row(modifier = Modifier.fillMaxWidth(.7f)) {
                   Image(
                       painter = painterResource(R.drawable.profile_pic)  ,
                       contentDescription = "profile picture",
                       modifier = Modifier.size(50.dp).clip(RoundedCornerShape(10.dp)) ,
                       contentScale = ContentScale.Crop
                   )
                   Text(
                       text= "Naval Ravikant " ,
                       fontSize = MaterialTheme.typography.titleLarge.fontSize ,
                       fontWeight = MaterialTheme.typography.titleLarge.fontWeight ,
                       color = MaterialTheme.colorScheme.onBackground,
                       modifier = Modifier.padding(10.dp)
                   )
               }

               Box(modifier = Modifier
                   .clip(RoundedCornerShape(5.dp))
                   .clickable {
                       showDialog = true
                       showAnimation = true
                   }
                   .background(MaterialTheme.colorScheme.background),
                   contentAlignment = Alignment.Center
               ) {
                    Text(
                        text = "View Report" ,
                        color = MaterialTheme.colorScheme.onBackground,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 10.dp, end= 10.dp, top = 5.dp, bottom = 5.dp) ,
                        fontSize = 10.sp,
                        textAlign = TextAlign.Center
                    )
               }
           }
        if(showDialog) {
            MinimalDialog (){
                showDialog = !showDialog
            }

        }




        Row(modifier = Modifier
            .padding(start = 5.dp , end = 5.dp)
            .fillMaxWidth()
            .height(50.dp)
            .background(MaterialTheme.colorScheme.background),
            verticalAlignment = Alignment.Bottom,
        ) {
            Text("Date" , modifier = Modifier.fillMaxWidth(0.15f), fontSize =MaterialTheme.typography.labelSmall.fontSize , color = MaterialTheme.colorScheme.tertiary , textAlign = TextAlign.Center , fontWeight = FontWeight.Bold)
            Text("Time" , modifier = Modifier.fillMaxWidth(0.25f) , fontSize = MaterialTheme.typography.labelSmall.fontSize , color =  MaterialTheme.colorScheme.tertiary , textAlign = TextAlign.Center , fontWeight = FontWeight.Bold)
            Text("Activity" , modifier = Modifier.fillMaxWidth(0.3f),fontSize = MaterialTheme.typography.labelSmall.fontSize , color =  MaterialTheme.colorScheme.tertiary , textAlign = TextAlign.Center , fontWeight = FontWeight.Bold)
            Text("Department" , modifier = Modifier.fillMaxWidth(0.4f) , fontSize = MaterialTheme.typography.labelSmall.fontSize , color =  MaterialTheme.colorScheme.tertiary, textAlign = TextAlign.Center , fontWeight = FontWeight.Bold)
            Text("Duration" , modifier = Modifier.fillMaxWidth(0.6f) , fontSize = MaterialTheme.typography.labelSmall.fontSize , color =  MaterialTheme.colorScheme.tertiary , textAlign = TextAlign.Center , fontWeight = FontWeight.Bold)
            Text("more" , modifier = Modifier.fillMaxWidth(0.9f) , fontSize = MaterialTheme.typography.labelSmall.fontSize , color =  MaterialTheme.colorScheme.tertiary , textAlign = TextAlign.Center , fontWeight = FontWeight.Bold)
        }

        Box( modifier = Modifier.fillMaxWidth()
            .fillMaxHeight(.8f),
            contentAlignment = Alignment.BottomEnd
        ){
            LazyColumn(
                modifier = Modifier.fillMaxWidth()
                    .fillMaxHeight()
                    .padding(start = 5.dp , end = 5.dp , top = 0.dp , bottom = 0.dp)
                    .clip(RoundedCornerShape(15.dp))
                    .border(1.dp, color = MaterialTheme.colorScheme.tertiary,
                        shape = RoundedCornerShape(15.dp) )
            ){
                items(Teacherlist, key = { it.toString()} ) {
                    TeacherCard(it)
                    HorizontalDivider(thickness = 1.dp, color =MaterialTheme.colorScheme.tertiary)
                }
            }
            FloatingActionButton(
                onClick = {  },
                modifier = Modifier.padding(end = 10.dp , bottom = 10.dp),
                contentColor = MaterialTheme.colorScheme.onBackground,
                containerColor = MaterialTheme.colorScheme.primary

            ) {
                Icon(Icons.Filled.Add, "Floating action button.")
            }
        }


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp)
                .height(50.dp) ,
            verticalAlignment = Alignment.CenterVertically ,
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Icon(Icons.Default.KeyboardArrowLeft , contentDescription = "previous" , modifier = Modifier.size(50.dp) , tint = MaterialTheme.colorScheme.onBackground)
            Text("13 Feb 2025 - 9 Feb 2025" , fontSize = 15.sp , color = MaterialTheme.colorScheme.onBackground)
            Icon(Icons.Default.KeyboardArrowRight , contentDescription = "next" , modifier = Modifier.size(50.dp) , tint = MaterialTheme.colorScheme.onBackground)
        }
        HorizontalDivider(thickness = 1.dp, color =MaterialTheme.colorScheme.tertiary)

        var currentClickedBtn by rememberSaveable { mutableIntStateOf(0) }

        LazyRow(
            modifier = Modifier
                .fillMaxWidth()
                .padding( 10.dp) ,
            horizontalArrangement = Arrangement.SpaceEvenly
        ){
            items(
               items =  WeekDays.entries.toTypedArray(),
                key = { it }
            ){
                Box(modifier = Modifier.padding(2.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .clickable {
                        currentClickedBtn = it.ordinal
                    }
                    .background( if ( it.ordinal == currentClickedBtn) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.tertiary)
                ) {
                    Text(it.toString() , modifier = Modifier.padding(5.dp),color = MaterialTheme.colorScheme.onBackground)
                }
            }
        }


    }
}










