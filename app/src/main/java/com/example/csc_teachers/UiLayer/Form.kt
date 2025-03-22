package com.example.csc_teachers.UiLayer

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import com.example.csc_teachers.util.TeacherStats

//@Preview(showSystemUi = true)
@Composable
fun Form (){
    Dialog(onDismissRequest = { }) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(Alignment.CenterVertically)
                .padding(16.dp),
            shape = RoundedCornerShape(16.dp),
        ) {
            LazyColumn(modifier = Modifier.fillMaxWidth().fillMaxHeight(.7f) , verticalArrangement = Arrangement.Center , horizontalAlignment = Alignment.CenterHorizontally) {
                items(TeacherStats, key = { id -> id.label } ){

                    Spacer(Modifier.size(5.dp))
                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun FormItem(){
    Column(modifier= Modifier.fillMaxWidth()) {
        Text("Activity" , fontSize = 18.sp)

    }
}