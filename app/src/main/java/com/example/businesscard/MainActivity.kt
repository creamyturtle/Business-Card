package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                    ) {
                    Card()
                }
            }
        }
    }
}


@Composable
fun Card() {

    val image = painterResource(R.drawable.android_logo)

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFFcdeeca))
    ) {

        Spacer(Modifier.weight(1F))

        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .size(148.dp)
                .background(color = Color(0xFF073042))

            //control size here
        )

        Text(
            text = "Sergio Granados",
            modifier = Modifier.padding(vertical = 8.dp),
            fontSize = 36.sp,
            fontWeight = FontWeight.W300

        )

        Text(
            text = "Hater Extraordinaire",
            color = Color(0xFF007400),
            fontWeight = FontWeight.Bold
        )


        Spacer(Modifier.weight(0.75F))

        RowData(
            icon = Icons.Rounded.Call,
            text = stringResource(R.string.sergio_phone)
        )

        RowData(
            icon = Icons.Rounded.Share,
            text = stringResource(R.string.twitter_handle)
        )

        RowData(
            icon = Icons.Rounded.Email,
            text = stringResource(R.string.email)
        )

        Spacer(Modifier.weight(0.25F))


    }

}





@Composable
fun RowData(icon: ImageVector, text: String) {


    Row(
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier
            .padding(
                horizontal = 60.dp
            )
            .padding(5.dp)
            .padding(start = 12.dp, end = 12.dp)
    ) {
        
        Icon(
            imageVector = icon,
            contentDescription = null,
            modifier = Modifier.weight(1F),
            tint = Color(0xFF007400)
        )

        Text(
            text = text,
            modifier = Modifier.weight(3F)
        )

    }

}




@Preview(showBackground = true)
@Composable

fun CardPreview() {
    BusinessCardTheme {
        Card()
    }
}