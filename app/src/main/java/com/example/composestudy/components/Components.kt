package com.example.composestudy.components

import android.graphics.drawable.Icon
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AttachMoney
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun InputField(
    modifier: Modifier = Modifier,
    valueState: MutableState<String>, // 현재 입력된 숫자 값 넘기기 위한 변수
    labelId: String,
    enabled : Boolean,
    isSingleLine: Boolean, // 한줄만 허용할  것인지 여러 줄을 허용할 것인지에 대한 변수
    keyboardType: KeyboardType = KeyboardType.Number, // 키보드타입 -> 숫자
    imeAction: ImeAction = ImeAction.Next, // Action -> Next
    onAction: KeyboardActions = KeyboardActions.Default){ // 키보드 액션 -> Default
    OutlinedTextField(value = valueState.value,
        onValueChange = { valueState.value = it },
                        label = { Text(text = labelId)},
                        leadingIcon = { Icon(imageVector = Icons.Rounded.AttachMoney,
                        contentDescription = "Money Icon")},
        singleLine = isSingleLine,
        textStyle = TextStyle(fontSize = 18.sp,
        color = MaterialTheme.colors.onBackground),
        modifier = modifier
            .padding(bottom = 10.dp, start = 10.dp, end = 10.dp),
        enabled = enabled,
        keyboardOptions = KeyboardOptions(keyboardType = keyboardType,
        imeAction = imeAction),
        keyboardActions = onAction
    )

}