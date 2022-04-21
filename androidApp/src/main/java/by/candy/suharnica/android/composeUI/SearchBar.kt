package by.candy.suharnica.android.composeUI

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import by.candy.suharnica.android.utils.Icons


@Preview
@Composable
fun SearchBar(){

    var text by remember { mutableStateOf("Search") }

Column() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Card(
            modifier = Modifier
                .weight(1f)
                .height(40.dp),
            shape = RoundedCornerShape(4.dp),
            border = BorderStroke(2.dp, Color.Black)
        ) {

            Row(
                modifier = Modifier.padding(10.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painter = painterResource(id = Icons.Search.image),
                    contentDescription = stringResource(id = Icons.Search.description.resourceId)
                )
                BasicTextField(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 12.dp),
                    value = text,
                    onValueChange = { text = it },
                )
            }
        }
        Icon(
            modifier = Modifier
                .padding(start = 14.dp)
                .size(40.dp),
            painter = painterResource(id = Icons.Sort.image),
            contentDescription = stringResource(id = Icons.Sort.description.resourceId)
        )
    }
    Divider(color = Color.Black, thickness = 2.dp)
}
}
