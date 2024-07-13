package io.github.aerocyber.learn.android.businesscardchallenge

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.sharp.Email
import androidx.compose.material.icons.sharp.Phone
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.github.aerocyber.learn.android.businesscardchallenge.ui.theme.BusinessCardChallengeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardChallengeTheme {
                Surface(
                    color = MaterialTheme.colorScheme.secondary,
                    modifier = Modifier.fillMaxSize()
                ) {
                    BusinessCard(
                        name = "Your Name",
                        tagline = "Developer",
                        phNo = "+91 12345-67890",
                        mail = "mail@example.com",
                        modifier = Modifier.padding(8.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun BusinessCard(
    name: String,
    tagline: String,
    phNo: String,
    mail: String,
    modifier: Modifier = Modifier
) {
    val image = painterResource(id = R.drawable.android_logo)
    val phIcon = Icons.Sharp.Phone
    val mailIcon = Icons.Sharp.Email
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .height(150.dp)
                .width(150.dp)
                .background(Color.DarkGray)
        )
        Text(
            name,
            fontSize = 50.sp,
            lineHeight = 16.sp,
            modifier = modifier
                .padding(8.dp)
        )
        Text(
            tagline
        )
    }
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom,
        modifier = modifier
            .padding(
                bottom = 16.dp
            )
    ){
        Row {
            Icon(
                imageVector = phIcon,
                contentDescription = null,
                modifier = modifier
                    .padding(
                        end = 1.dp,
                    )
            )
            Text(
                phNo
            )
        }

        Row {
            Icon(
                imageVector = mailIcon,
                contentDescription = null,
                modifier = modifier
                    .padding(
                        end = 1.dp
                    )
            )
            Text(
                mail
            )
        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardChallengeTheme {
        BusinessCard(
            name = "Your Name",
            tagline = "Developer",
            phNo = "+91 12345-67890",
            mail = "mail@example.com",
            modifier = Modifier.padding(8.dp)
        )
    }
}