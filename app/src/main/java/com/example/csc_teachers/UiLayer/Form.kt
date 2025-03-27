package com.example.csc_teachers.UiLayer

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import com.example.csc_teachers.R
import com.example.csc_teachers.ViewModal.HomeViewModal


@Composable
fun Form (viewModal: HomeViewModal, onDismissRequest: () -> Unit = {}){

    val state = viewModal.formState.collectAsState()

    Dialog(onDismissRequest = {onDismissRequest()}) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(),
            shape = RoundedCornerShape(16.dp),
        ) {
            Column(modifier = Modifier.fillMaxWidth().fillMaxHeight(.8f) , verticalArrangement = Arrangement.Center , horizontalAlignment = Alignment.CenterHorizontally) {

                DatePickerFieldToModal(modifier = Modifier.fillMaxWidth(.9f))

                Text("Activity" , fontSize = 18.sp, textAlign = TextAlign.Start , modifier = Modifier.fillMaxWidth(.9f).padding(top = 10.dp), color = MaterialTheme.colorScheme.onBackground)
                DropDownMenu(modifier = Modifier.fillMaxWidth(.9f) , placeholder = "Select Activity")

                Row (modifier = Modifier.fillMaxWidth(.9f) , horizontalArrangement = Arrangement.SpaceBetween){
                    Column {
                        Text("From" , fontSize = 18.sp, textAlign = TextAlign.Start , modifier = Modifier.padding(top = 10.dp), color = MaterialTheme.colorScheme.onBackground)
                        Row(modifier = Modifier
                            .height(50.dp)
                            .width(140.dp)
                            .border(1.dp, color = MaterialTheme.colorScheme.tertiary, shape = RoundedCornerShape(15.dp))
                            .clickable {

                            },
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Text(text = "Enter Time" , textAlign = TextAlign.Center , color = MaterialTheme.colorScheme.onBackground , modifier = Modifier.padding(10.dp))
                            Icon(painter = painterResource(R.drawable.clock_icon), contentDescription = "ClockIcon", tint = MaterialTheme.colorScheme.tertiary , modifier = Modifier.padding(10.dp))
                        }
                    }

                    Column {
                        Text("To" , fontSize = 18.sp, textAlign = TextAlign.Start , modifier = Modifier.padding(top = 10.dp), color = MaterialTheme.colorScheme.onBackground)
                        Row(modifier = Modifier
                            .height(50.dp)
                            .width(140.dp)
                            .border(1.dp, color = MaterialTheme.colorScheme.tertiary, shape = RoundedCornerShape(15.dp))
                            .clickable {

                            },
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Center
                        ) {
                            Text(text = "Enter Time" , textAlign = TextAlign.Center , color = MaterialTheme.colorScheme.onBackground , modifier = Modifier.padding(10.dp))
                            Icon(painter = painterResource(R.drawable.clock_icon), contentDescription = "ClockIcon", tint = MaterialTheme.colorScheme.tertiary , modifier = Modifier.padding(10.dp))
                        }
                    }
                   
                }
                Text("Department" , fontSize = 18.sp, textAlign = TextAlign.Start , modifier = Modifier.fillMaxWidth(.9f).padding(top = 10.dp), color = MaterialTheme.colorScheme.onBackground)
                DropDownMenu(modifier = Modifier.fillMaxWidth(.9f), placeholder = "Select Department")
                Text("Section" , fontSize = 18.sp, textAlign = TextAlign.Start , modifier = Modifier.fillMaxWidth(.9f).padding(top = 10.dp), color = MaterialTheme.colorScheme.onBackground)
                DropDownMenu(modifier = Modifier.fillMaxWidth(.9f).padding(vertical = 5.dp), placeholder = "Select Section")

            }
        }
    }
}
