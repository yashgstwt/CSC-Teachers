package com.example.csc_teachers.UiLayer


import androidx.compose.foundation.gestures.awaitEachGesture
import androidx.compose.foundation.gestures.awaitFirstDown
import androidx.compose.foundation.gestures.waitForUpOrCancellation
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.selection.TextSelectionColors
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material3.DatePicker
import androidx.compose.material3.DatePickerColors
import androidx.compose.material3.DatePickerDialog
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.PointerEventPass
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.window.DialogProperties
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale



@Composable
fun DatePickerFieldToModal(modifier: Modifier = Modifier , placeholder:String = "Select Date") {
    var selectedDate by remember { mutableStateOf<Long?>(null) }
    var showModal by remember { mutableStateOf(false) }

    OutlinedTextField(
        value = selectedDate?.let { convertMillisToDate(it) } ?: "",
        onValueChange = { },
        label = { Text(placeholder) },
        placeholder = { Text("DD/MM/YYYY") },
        shape = RoundedCornerShape(25),
        trailingIcon = {
            Icon(Icons.Default.DateRange, contentDescription = "Select date")
        },
        modifier = modifier
            .fillMaxWidth()
            .pointerInput(selectedDate) {
                awaitEachGesture {
                    // Modifier.clickable doesn't work for text fields, so we use Modifier.pointerInput
                    // in the Initial pass to observe events before the text field consumes them
                    // in the Main pass.
                    awaitFirstDown(pass = PointerEventPass.Initial)
                    val upEvent = waitForUpOrCancellation(pass = PointerEventPass.Initial)
                    if (upEvent != null) {
                        showModal = true
                    }
                }
            },
    )

    if (showModal) {
        DatePickerModal(
            onDateSelected = { selectedDate = it },
            onDismiss = { showModal = false }
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DatePickerModal(

    onDateSelected: (Long?) -> Unit,
    onDismiss: () -> Unit
) {

    val datePickerState = rememberDatePickerState()

    DatePickerDialog(
        properties = DialogProperties(dismissOnBackPress = true , dismissOnClickOutside = true , decorFitsSystemWindows = false),
        onDismissRequest = onDismiss,
        confirmButton = {
            TextButton(onClick = {
                onDateSelected(datePickerState.selectedDateMillis)
                onDismiss()
            }) {
                Text("OK")
            }
        },
        dismissButton = {
            TextButton(onClick = onDismiss) {
                Text("Cancel")
            }
        },
        modifier = Modifier.fillMaxWidth(.9f),

        colors = DatePickerColors(
            containerColor = MaterialTheme.colorScheme.onPrimary, // this is important for changing the background of datePicker
            titleContentColor =MaterialTheme.colorScheme.onBackground,
            /**
             * Ignore all of above , they don't affect the colors in this case i have implemented it because i have to change the container color
             * Note: If you have to change the content of date picker (e.g : circle color , font color , ring color )
             *       then give color to DatePicker(state = datePickerState) in color parameter
             */
            headlineContentColor = MaterialTheme.colorScheme.onBackground,
            weekdayContentColor = MaterialTheme.colorScheme.onBackground,
            subheadContentColor = MaterialTheme.colorScheme.onBackground,
            navigationContentColor = Color.DarkGray,
            yearContentColor = Color.Green,
            disabledYearContentColor = Color.DarkGray,
            currentYearContentColor = Color.Red,
            selectedYearContentColor = Color.DarkGray,
            disabledSelectedYearContentColor = Color.Blue,
            selectedYearContainerColor = Color.Green,
            disabledSelectedYearContainerColor = Color.Green,
            dayContentColor = MaterialTheme.colorScheme.onBackground,
            disabledDayContentColor = Color.Yellow,
            selectedDayContentColor = Color.DarkGray,
            disabledSelectedDayContentColor = Color.Green,
            selectedDayContainerColor = MaterialTheme.colorScheme.onBackground,
            disabledSelectedDayContainerColor = Color.Yellow,
            todayContentColor = Color.Yellow,
            todayDateBorderColor = Color.DarkGray,
            dayInSelectionRangeContainerColor = Color.Green,
            dayInSelectionRangeContentColor = Color.Green,
            dividerColor = Color.Green,
            dateTextFieldColors = TextFieldColors(
                focusedTextColor = Color.Black,
                unfocusedTextColor = Color.Gray,
                disabledTextColor = Color.LightGray,
                errorTextColor = Color.Red,

                focusedContainerColor = Color.White,
                unfocusedContainerColor = Color.White,
                disabledContainerColor = Color.LightGray,
                errorContainerColor = Color(0xFFFFE0E0), // Light red

                cursorColor = Color.Black,
                errorCursorColor = Color.Red,

                focusedIndicatorColor = Color.Blue,
                unfocusedIndicatorColor = Color.Gray,
                disabledIndicatorColor = Color.LightGray,
                errorIndicatorColor = Color.Red,

                focusedLeadingIconColor = Color.Black,
                unfocusedLeadingIconColor = Color.Gray,
                disabledLeadingIconColor = Color.LightGray,
                errorLeadingIconColor = Color.Red,

                focusedTrailingIconColor = Color.Black,
                unfocusedTrailingIconColor = Color.Gray,
                disabledTrailingIconColor = Color.LightGray,
                errorTrailingIconColor = Color.Red,

                focusedLabelColor = MaterialTheme.colorScheme.onBackground,
                unfocusedLabelColor = Color.Gray,
                disabledLabelColor = Color.LightGray,
                errorLabelColor = Color.Red,

                focusedPlaceholderColor = Color.Gray,
                unfocusedPlaceholderColor = Color.Gray,
                disabledPlaceholderColor = Color.LightGray,
                errorPlaceholderColor = Color.Red,

                focusedSupportingTextColor = Color.Black,
                unfocusedSupportingTextColor = Color.Gray,
                disabledSupportingTextColor = Color.LightGray,
                errorSupportingTextColor = Color.Red,

                focusedPrefixColor = Color.Black,
                unfocusedPrefixColor = Color.Gray,
                disabledPrefixColor = Color.LightGray,
                errorPrefixColor = Color.Red,

                focusedSuffixColor = Color.Black,
                unfocusedSuffixColor = Color.Gray,
                disabledSuffixColor = Color.LightGray,
                errorSuffixColor = Color.Red,
                textSelectionColors = TextSelectionColors(handleColor = Color.Blue, backgroundColor = Color.Blue.copy(alpha = 0.4f)),
            ),
        )
    ) {
        DatePicker(state = datePickerState)
    }
}



fun convertMillisToDate(millis: Long): String {
    val formatter = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
    return formatter.format(Date(millis))
}