package com.example.busycard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.busycard.ui.theme.BusycardTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusycardTheme {

                BusyCard()

            }
        }
    }



@Composable
fun BusyCard() {

    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center

    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
             val icon1 = painterResource(R.drawable.busicard2)

            Image(
                painter = icon1,
                contentDescription = "ProfilePic",
                modifier = Modifier.size(185.dp)
            )

            Spacer(modifier = Modifier.height(15.dp))

            Text(
                text = "DAVID B MARC-YVANN KOFFI",
                fontSize = 22.sp, fontWeight = FontWeight.W500,
                color = Color.DarkGray
            )

            // TITLE

            Text(
                text = "PROFESSIONAL CARD",
                fontSize = 16.sp, fontWeight = FontWeight.W700,
                color = Color.Gray, // Gris
            )
        }

        Spacer(modifier = Modifier.height(50.dp))

        Column (
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),

            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(4.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.Phone,
                    contentDescription = "tel",
                    modifier = Modifier.size(24.dp),
                    tint = Color.Black
                )
                Spacer(modifier = Modifier.width(12.dp))
                Text(text = "(+225) 07 88 729 838",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.W500
                )

            }

            Spacer(modifier = Modifier.height(15.dp))

            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(4.dp)
            ) {
                val img2 = painterResource(R.drawable.linkedin)
                Image(
                    painter = img2,
                    contentDescription = "Linkedin",
                    modifier = Modifier.size(24.dp)
                )
                Spacer(modifier = Modifier.width(12.dp))
                Text(text = "David Koffi", fontSize = 20.sp, fontWeight = FontWeight.W500)
            }

            Spacer(modifier = Modifier.height(15.dp))

            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(4.dp)
            ){
                val mail = painterResource(R.drawable.mail)
                Image(
                    painter = mail,
                    contentDescription = "Mail",
                    modifier = Modifier.size(24.dp)
                )
                Spacer(modifier = Modifier.width(12.dp))
                Text(text = "yalitzvi@gmail.com", fontSize = 20.sp, fontWeight = FontWeight.W500)
            }
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun CardPreview() {
    BusycardTheme {
    // Display app :
    BusyCard()

    }
}
}